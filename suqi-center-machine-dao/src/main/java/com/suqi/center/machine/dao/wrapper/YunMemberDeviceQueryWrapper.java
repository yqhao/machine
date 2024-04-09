package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.YunMemberDevice;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 用户设备表（yun_member_device）
 * </p>
 * "yun_member_device"
 * @author PC001
 */
public class YunMemberDeviceQueryWrapper extends QueryWrapper<YunMemberDevice> {


    public static YunMemberDeviceQueryWrapper wrapper() {
        return new YunMemberDeviceQueryWrapper();
    }

    public YunMemberDeviceQueryWrapper() {
        super();
    }

    public YunMemberDeviceQueryWrapper(YunMemberDevice entity) {
        super(entity);
    }

    public YunMemberDeviceQueryWrapper(YunMemberDevice entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public YunMemberDeviceQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public YunMemberDeviceQueryWrapper selectColumns(Consumer<YunMemberDeviceSelect> consumer) {
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
     * 等于 =
     * @param id       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper idEq(Long id){
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
    public YunMemberDeviceQueryWrapper idNe(Long id){
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
    public YunMemberDeviceQueryWrapper idGt(Long id){
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
    public YunMemberDeviceQueryWrapper idGe(Long id){
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
    public YunMemberDeviceQueryWrapper idLt(Long id){
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
    public YunMemberDeviceQueryWrapper idLe(Long id){
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
    public YunMemberDeviceQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public YunMemberDeviceQueryWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>id</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper idLike(Long id){
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
    public YunMemberDeviceQueryWrapper idNotLike(Long id){
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
    public YunMemberDeviceQueryWrapper idLikeLeft(Long id){
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
    public YunMemberDeviceQueryWrapper idLikeRight(Long id){
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
    public YunMemberDeviceQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper idIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper idIn(Long... values){
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
    public YunMemberDeviceQueryWrapper idNotIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * 等于 =
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkMemberIdEq(Long fkMemberId){
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
    public YunMemberDeviceQueryWrapper fkMemberIdNe(Long fkMemberId){
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
    public YunMemberDeviceQueryWrapper fkMemberIdGt(Long fkMemberId){
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
    public YunMemberDeviceQueryWrapper fkMemberIdGe(Long fkMemberId){
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
    public YunMemberDeviceQueryWrapper fkMemberIdLt(Long fkMemberId){
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
    public YunMemberDeviceQueryWrapper fkMemberIdLe(Long fkMemberId){
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
    public YunMemberDeviceQueryWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public YunMemberDeviceQueryWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public YunMemberDeviceQueryWrapper fkMemberIdLike(Long fkMemberId){
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
    public YunMemberDeviceQueryWrapper fkMemberIdNotLike(Long fkMemberId){
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
    public YunMemberDeviceQueryWrapper fkMemberIdLikeLeft(Long fkMemberId){
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
    public YunMemberDeviceQueryWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public YunMemberDeviceQueryWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>用户id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>用户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkMemberIdIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkMemberIdIn(Long... values){
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
    public YunMemberDeviceQueryWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * 等于 =
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdEq(Long fkEmMemberGroupId){
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
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdNe(Long fkEmMemberGroupId){
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
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdGt(Long fkEmMemberGroupId){
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
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdGe(Long fkEmMemberGroupId){
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
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdLt(Long fkEmMemberGroupId){
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
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdLe(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            le("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * BETWEEN 值1 AND 值2
     * @param fkEmMemberGroupIdStart       值1
     * @param fkEmMemberGroupIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdBetween(Long fkEmMemberGroupIdStart,Long fkEmMemberGroupIdEnd){
        if(fkEmMemberGroupIdStart!=null && fkEmMemberGroupIdEnd!=null){
            between("fk_em_member_group_id",fkEmMemberGroupIdStart,fkEmMemberGroupIdEnd);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkEmMemberGroupIdStart       值1
     * @param fkEmMemberGroupIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdNotBetween(Long fkEmMemberGroupIdStart,Long fkEmMemberGroupIdEnd){
        if(fkEmMemberGroupIdStart!=null && fkEmMemberGroupIdEnd!=null){
            notBetween("fk_em_member_group_id",fkEmMemberGroupIdStart,fkEmMemberGroupIdEnd);
        }
        return this;
     }


    /**
     * <p>分组id</p>
     * LIKE '%值%'
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdLike(Long fkEmMemberGroupId){
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
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdNotLike(Long fkEmMemberGroupId){
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
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdLikeLeft(Long fkEmMemberGroupId){
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
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdLikeRight(Long fkEmMemberGroupId){
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
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdIsNull(){
        isNull("fk_em_member_group_id");
        return this;
    }

    /**
     * <p>分组id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdIsNotNull(){
        isNotNull("fk_em_member_group_id");
        return this;
    }

    /**
     * <p>分组id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdIn(Long... values){
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
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkEmMemberGroupIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_em_member_group_id",values);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * 等于 =
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper userDeviceNoEq(String userDeviceNo){
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
    public YunMemberDeviceQueryWrapper userDeviceNoNe(String userDeviceNo){
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
    public YunMemberDeviceQueryWrapper userDeviceNoGt(String userDeviceNo){
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
    public YunMemberDeviceQueryWrapper userDeviceNoGe(String userDeviceNo){
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
    public YunMemberDeviceQueryWrapper userDeviceNoLt(String userDeviceNo){
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
    public YunMemberDeviceQueryWrapper userDeviceNoLe(String userDeviceNo){
        if(userDeviceNo!=null){
            le("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * BETWEEN 值1 AND 值2
     * @param userDeviceNoStart       值1
     * @param userDeviceNoEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper userDeviceNoBetween(String userDeviceNoStart,String userDeviceNoEnd){
        if(userDeviceNoStart!=null && userDeviceNoEnd!=null){
            between("user_device_no",userDeviceNoStart,userDeviceNoEnd);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param userDeviceNoStart       值1
     * @param userDeviceNoEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper userDeviceNoNotBetween(String userDeviceNoStart,String userDeviceNoEnd){
        if(userDeviceNoStart!=null && userDeviceNoEnd!=null){
            notBetween("user_device_no",userDeviceNoStart,userDeviceNoEnd);
        }
        return this;
     }


    /**
     * <p>用户设备编号</p>
     * LIKE '%值%'
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper userDeviceNoLike(String userDeviceNo){
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
    public YunMemberDeviceQueryWrapper userDeviceNoNotLike(String userDeviceNo){
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
    public YunMemberDeviceQueryWrapper userDeviceNoLikeLeft(String userDeviceNo){
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
    public YunMemberDeviceQueryWrapper userDeviceNoLikeRight(String userDeviceNo){
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
    public YunMemberDeviceQueryWrapper userDeviceNoIsNull(){
        isNull("user_device_no");
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper userDeviceNoIsNotNull(){
        isNotNull("user_device_no");
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper userDeviceNoIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper userDeviceNoIn(String... values){
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
    public YunMemberDeviceQueryWrapper userDeviceNoNotIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper userDeviceNoNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("user_device_no",values);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * 等于 =
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper smkpInstanceIdEq(String smkpInstanceId){
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
    public YunMemberDeviceQueryWrapper smkpInstanceIdNe(String smkpInstanceId){
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
    public YunMemberDeviceQueryWrapper smkpInstanceIdGt(String smkpInstanceId){
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
    public YunMemberDeviceQueryWrapper smkpInstanceIdGe(String smkpInstanceId){
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
    public YunMemberDeviceQueryWrapper smkpInstanceIdLt(String smkpInstanceId){
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
    public YunMemberDeviceQueryWrapper smkpInstanceIdLe(String smkpInstanceId){
        if(smkpInstanceId!=null){
            le("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * BETWEEN 值1 AND 值2
     * @param smkpInstanceIdStart       值1
     * @param smkpInstanceIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper smkpInstanceIdBetween(String smkpInstanceIdStart,String smkpInstanceIdEnd){
        if(smkpInstanceIdStart!=null && smkpInstanceIdEnd!=null){
            between("smkp_instance_id",smkpInstanceIdStart,smkpInstanceIdEnd);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param smkpInstanceIdStart       值1
     * @param smkpInstanceIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper smkpInstanceIdNotBetween(String smkpInstanceIdStart,String smkpInstanceIdEnd){
        if(smkpInstanceIdStart!=null && smkpInstanceIdEnd!=null){
            notBetween("smkp_instance_id",smkpInstanceIdStart,smkpInstanceIdEnd);
        }
        return this;
     }


    /**
     * <p>严选下单实例id</p>
     * LIKE '%值%'
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper smkpInstanceIdLike(String smkpInstanceId){
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
    public YunMemberDeviceQueryWrapper smkpInstanceIdNotLike(String smkpInstanceId){
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
    public YunMemberDeviceQueryWrapper smkpInstanceIdLikeLeft(String smkpInstanceId){
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
    public YunMemberDeviceQueryWrapper smkpInstanceIdLikeRight(String smkpInstanceId){
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
    public YunMemberDeviceQueryWrapper smkpInstanceIdIsNull(){
        isNull("smkp_instance_id");
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper smkpInstanceIdIsNotNull(){
        isNotNull("smkp_instance_id");
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper smkpInstanceIdIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper smkpInstanceIdIn(String... values){
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
    public YunMemberDeviceQueryWrapper smkpInstanceIdNotIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper smkpInstanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("smkp_instance_id",values);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 等于 =
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdEq(Long fkEmSocDevicesId){
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
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdNe(Long fkEmSocDevicesId){
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
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdGt(Long fkEmSocDevicesId){
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
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdGe(Long fkEmSocDevicesId){
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
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdLt(Long fkEmSocDevicesId){
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
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdLe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            le("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * BETWEEN 值1 AND 值2
     * @param fkEmSocDevicesIdStart       值1
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        if(fkEmSocDevicesIdStart!=null && fkEmSocDevicesIdEnd!=null){
            between("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkEmSocDevicesIdStart       值1
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        if(fkEmSocDevicesIdStart!=null && fkEmSocDevicesIdEnd!=null){
            notBetween("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }


    /**
     * <p>物理设备id</p>
     * LIKE '%值%'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdLike(Long fkEmSocDevicesId){
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
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdNotLike(Long fkEmSocDevicesId){
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
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdLikeLeft(Long fkEmSocDevicesId){
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
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdLikeRight(Long fkEmSocDevicesId){
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
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdIsNull(){
        isNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdIsNotNull(){
        isNotNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdIn(Long... values){
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
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkEmSocDevicesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_em_soc_devices_id",values);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * 等于 =
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdEq(Long fkSocVmDevicesId){
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
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdNe(Long fkSocVmDevicesId){
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
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdGt(Long fkSocVmDevicesId){
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
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdGe(Long fkSocVmDevicesId){
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
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdLt(Long fkSocVmDevicesId){
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
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdLe(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            le("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * BETWEEN 值1 AND 值2
     * @param fkSocVmDevicesIdStart       值1
     * @param fkSocVmDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdBetween(Long fkSocVmDevicesIdStart,Long fkSocVmDevicesIdEnd){
        if(fkSocVmDevicesIdStart!=null && fkSocVmDevicesIdEnd!=null){
            between("fk_soc_vm_devices_id",fkSocVmDevicesIdStart,fkSocVmDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkSocVmDevicesIdStart       值1
     * @param fkSocVmDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdNotBetween(Long fkSocVmDevicesIdStart,Long fkSocVmDevicesIdEnd){
        if(fkSocVmDevicesIdStart!=null && fkSocVmDevicesIdEnd!=null){
            notBetween("fk_soc_vm_devices_id",fkSocVmDevicesIdStart,fkSocVmDevicesIdEnd);
        }
        return this;
     }


    /**
     * <p>虚拟设备id</p>
     * LIKE '%值%'
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdLike(Long fkSocVmDevicesId){
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
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdNotLike(Long fkSocVmDevicesId){
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
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdLikeLeft(Long fkSocVmDevicesId){
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
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdLikeRight(Long fkSocVmDevicesId){
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
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdIsNull(){
        isNull("fk_soc_vm_devices_id");
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdIsNotNull(){
        isNotNull("fk_soc_vm_devices_id");
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdIn(Long... values){
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
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkSocVmDevicesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_soc_vm_devices_id",values);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * 等于 =
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper memberGroupNameEq(String memberGroupName){
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
    public YunMemberDeviceQueryWrapper memberGroupNameNe(String memberGroupName){
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
    public YunMemberDeviceQueryWrapper memberGroupNameGt(String memberGroupName){
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
    public YunMemberDeviceQueryWrapper memberGroupNameGe(String memberGroupName){
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
    public YunMemberDeviceQueryWrapper memberGroupNameLt(String memberGroupName){
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
    public YunMemberDeviceQueryWrapper memberGroupNameLe(String memberGroupName){
        if(memberGroupName!=null){
            le("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * BETWEEN 值1 AND 值2
     * @param memberGroupNameStart       值1
     * @param memberGroupNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper memberGroupNameBetween(String memberGroupNameStart,String memberGroupNameEnd){
        if(memberGroupNameStart!=null && memberGroupNameEnd!=null){
            between("member_group_name",memberGroupNameStart,memberGroupNameEnd);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param memberGroupNameStart       值1
     * @param memberGroupNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper memberGroupNameNotBetween(String memberGroupNameStart,String memberGroupNameEnd){
        if(memberGroupNameStart!=null && memberGroupNameEnd!=null){
            notBetween("member_group_name",memberGroupNameStart,memberGroupNameEnd);
        }
        return this;
     }


    /**
     * <p>分组名称</p>
     * LIKE '%值%'
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper memberGroupNameLike(String memberGroupName){
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
    public YunMemberDeviceQueryWrapper memberGroupNameNotLike(String memberGroupName){
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
    public YunMemberDeviceQueryWrapper memberGroupNameLikeLeft(String memberGroupName){
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
    public YunMemberDeviceQueryWrapper memberGroupNameLikeRight(String memberGroupName){
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
    public YunMemberDeviceQueryWrapper memberGroupNameIsNull(){
        isNull("member_group_name");
        return this;
    }

    /**
     * <p>分组名称</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper memberGroupNameIsNotNull(){
        isNotNull("member_group_name");
        return this;
    }

    /**
     * <p>分组名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper memberGroupNameIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper memberGroupNameIn(String... values){
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
    public YunMemberDeviceQueryWrapper memberGroupNameNotIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper memberGroupNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("member_group_name",values);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * 等于 =
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkYunProductIdEq(Long fkYunProductId){
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
    public YunMemberDeviceQueryWrapper fkYunProductIdNe(Long fkYunProductId){
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
    public YunMemberDeviceQueryWrapper fkYunProductIdGt(Long fkYunProductId){
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
    public YunMemberDeviceQueryWrapper fkYunProductIdGe(Long fkYunProductId){
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
    public YunMemberDeviceQueryWrapper fkYunProductIdLt(Long fkYunProductId){
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
    public YunMemberDeviceQueryWrapper fkYunProductIdLe(Long fkYunProductId){
        if(fkYunProductId!=null){
            le("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * BETWEEN 值1 AND 值2
     * @param fkYunProductIdStart       值1
     * @param fkYunProductIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkYunProductIdBetween(Long fkYunProductIdStart,Long fkYunProductIdEnd){
        if(fkYunProductIdStart!=null && fkYunProductIdEnd!=null){
            between("fk_yun_product_id",fkYunProductIdStart,fkYunProductIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkYunProductIdStart       值1
     * @param fkYunProductIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkYunProductIdNotBetween(Long fkYunProductIdStart,Long fkYunProductIdEnd){
        if(fkYunProductIdStart!=null && fkYunProductIdEnd!=null){
            notBetween("fk_yun_product_id",fkYunProductIdStart,fkYunProductIdEnd);
        }
        return this;
     }


    /**
     * <p>云机产品id</p>
     * LIKE '%值%'
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkYunProductIdLike(Long fkYunProductId){
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
    public YunMemberDeviceQueryWrapper fkYunProductIdNotLike(Long fkYunProductId){
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
    public YunMemberDeviceQueryWrapper fkYunProductIdLikeLeft(Long fkYunProductId){
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
    public YunMemberDeviceQueryWrapper fkYunProductIdLikeRight(Long fkYunProductId){
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
    public YunMemberDeviceQueryWrapper fkYunProductIdIsNull(){
        isNull("fk_yun_product_id");
        return this;
    }

    /**
     * <p>云机产品id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkYunProductIdIsNotNull(){
        isNotNull("fk_yun_product_id");
        return this;
    }

    /**
     * <p>云机产品id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkYunProductIdIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkYunProductIdIn(Long... values){
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
    public YunMemberDeviceQueryWrapper fkYunProductIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkYunProductIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_yun_product_id",values);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * 等于 =
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdEq(Long fkYunProductSkuId){
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
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdNe(Long fkYunProductSkuId){
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
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdGt(Long fkYunProductSkuId){
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
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdGe(Long fkYunProductSkuId){
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
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdLt(Long fkYunProductSkuId){
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
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdLe(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            le("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * BETWEEN 值1 AND 值2
     * @param fkYunProductSkuIdStart       值1
     * @param fkYunProductSkuIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdBetween(Long fkYunProductSkuIdStart,Long fkYunProductSkuIdEnd){
        if(fkYunProductSkuIdStart!=null && fkYunProductSkuIdEnd!=null){
            between("fk_yun_product_sku_id",fkYunProductSkuIdStart,fkYunProductSkuIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkYunProductSkuIdStart       值1
     * @param fkYunProductSkuIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdNotBetween(Long fkYunProductSkuIdStart,Long fkYunProductSkuIdEnd){
        if(fkYunProductSkuIdStart!=null && fkYunProductSkuIdEnd!=null){
            notBetween("fk_yun_product_sku_id",fkYunProductSkuIdStart,fkYunProductSkuIdEnd);
        }
        return this;
     }


    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '%值%'
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdLike(Long fkYunProductSkuId){
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
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdNotLike(Long fkYunProductSkuId){
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
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdLikeLeft(Long fkYunProductSkuId){
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
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdLikeRight(Long fkYunProductSkuId){
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
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdIsNull(){
        isNull("fk_yun_product_sku_id");
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdIsNotNull(){
        isNotNull("fk_yun_product_sku_id");
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdIn(Long... values){
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
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkYunProductSkuIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_yun_product_sku_id",values);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * 等于 =
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper productNameEq(String productName){
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
    public YunMemberDeviceQueryWrapper productNameNe(String productName){
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
    public YunMemberDeviceQueryWrapper productNameGt(String productName){
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
    public YunMemberDeviceQueryWrapper productNameGe(String productName){
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
    public YunMemberDeviceQueryWrapper productNameLt(String productName){
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
    public YunMemberDeviceQueryWrapper productNameLe(String productName){
        if(productName!=null){
            le("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * BETWEEN 值1 AND 值2
     * @param productNameStart       值1
     * @param productNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper productNameBetween(String productNameStart,String productNameEnd){
        if(productNameStart!=null && productNameEnd!=null){
            between("product_name",productNameStart,productNameEnd);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param productNameStart       值1
     * @param productNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper productNameNotBetween(String productNameStart,String productNameEnd){
        if(productNameStart!=null && productNameEnd!=null){
            notBetween("product_name",productNameStart,productNameEnd);
        }
        return this;
     }


    /**
     * <p>产品名称</p>
     * LIKE '%值%'
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper productNameLike(String productName){
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
    public YunMemberDeviceQueryWrapper productNameNotLike(String productName){
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
    public YunMemberDeviceQueryWrapper productNameLikeLeft(String productName){
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
    public YunMemberDeviceQueryWrapper productNameLikeRight(String productName){
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
    public YunMemberDeviceQueryWrapper productNameIsNull(){
        isNull("product_name");
        return this;
    }

    /**
     * <p>产品名称</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper productNameIsNotNull(){
        isNotNull("product_name");
        return this;
    }

    /**
     * <p>产品名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper productNameIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper productNameIn(String... values){
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
    public YunMemberDeviceQueryWrapper productNameNotIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper productNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("product_name",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper deviceIdEq(String deviceId){
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
    public YunMemberDeviceQueryWrapper deviceIdNe(String deviceId){
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
    public YunMemberDeviceQueryWrapper deviceIdGt(String deviceId){
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
    public YunMemberDeviceQueryWrapper deviceIdGe(String deviceId){
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
    public YunMemberDeviceQueryWrapper deviceIdLt(String deviceId){
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
    public YunMemberDeviceQueryWrapper deviceIdLe(String deviceId){
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
    public YunMemberDeviceQueryWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public YunMemberDeviceQueryWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public YunMemberDeviceQueryWrapper deviceIdLike(String deviceId){
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
    public YunMemberDeviceQueryWrapper deviceIdNotLike(String deviceId){
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
    public YunMemberDeviceQueryWrapper deviceIdLikeLeft(String deviceId){
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
    public YunMemberDeviceQueryWrapper deviceIdLikeRight(String deviceId){
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
    public YunMemberDeviceQueryWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper deviceIdIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper deviceIdIn(String... values){
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
    public YunMemberDeviceQueryWrapper deviceIdNotIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * 等于 =
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper deviceNameEq(String deviceName){
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
    public YunMemberDeviceQueryWrapper deviceNameNe(String deviceName){
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
    public YunMemberDeviceQueryWrapper deviceNameGt(String deviceName){
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
    public YunMemberDeviceQueryWrapper deviceNameGe(String deviceName){
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
    public YunMemberDeviceQueryWrapper deviceNameLt(String deviceName){
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
    public YunMemberDeviceQueryWrapper deviceNameLe(String deviceName){
        if(deviceName!=null){
            le("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * BETWEEN 值1 AND 值2
     * @param deviceNameStart       值1
     * @param deviceNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper deviceNameBetween(String deviceNameStart,String deviceNameEnd){
        if(deviceNameStart!=null && deviceNameEnd!=null){
            between("device_name",deviceNameStart,deviceNameEnd);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceNameStart       值1
     * @param deviceNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper deviceNameNotBetween(String deviceNameStart,String deviceNameEnd){
        if(deviceNameStart!=null && deviceNameEnd!=null){
            notBetween("device_name",deviceNameStart,deviceNameEnd);
        }
        return this;
     }


    /**
     * <p>设备名</p>
     * LIKE '%值%'
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper deviceNameLike(String deviceName){
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
    public YunMemberDeviceQueryWrapper deviceNameNotLike(String deviceName){
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
    public YunMemberDeviceQueryWrapper deviceNameLikeLeft(String deviceName){
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
    public YunMemberDeviceQueryWrapper deviceNameLikeRight(String deviceName){
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
    public YunMemberDeviceQueryWrapper deviceNameIsNull(){
        isNull("device_name");
        return this;
    }

    /**
     * <p>设备名</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper deviceNameIsNotNull(){
        isNotNull("device_name");
        return this;
    }

    /**
     * <p>设备名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper deviceNameIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper deviceNameIn(String... values){
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
    public YunMemberDeviceQueryWrapper deviceNameNotIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper deviceNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_name",values);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 等于 =
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper validStartTimeEq(Date validStartTime){
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
    public YunMemberDeviceQueryWrapper validStartTimeNe(Date validStartTime){
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
    public YunMemberDeviceQueryWrapper validStartTimeGt(Date validStartTime){
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
    public YunMemberDeviceQueryWrapper validStartTimeGe(Date validStartTime){
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
    public YunMemberDeviceQueryWrapper validStartTimeLt(Date validStartTime){
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
    public YunMemberDeviceQueryWrapper validStartTimeLe(Date validStartTime){
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
    public YunMemberDeviceQueryWrapper validStartTimeBetween(Date validStartTimeStart,Date validStartTimeEnd){
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
    public YunMemberDeviceQueryWrapper validStartTimeNotBetween(Date validStartTimeStart,Date validStartTimeEnd){
        if(validStartTimeStart!=null && validStartTimeEnd!=null){
            notBetween("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值%'
     * @param validStartTime       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper validStartTimeLike(Date validStartTime){
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
    public YunMemberDeviceQueryWrapper validStartTimeNotLike(Date validStartTime){
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
    public YunMemberDeviceQueryWrapper validStartTimeLikeLeft(Date validStartTime){
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
    public YunMemberDeviceQueryWrapper validStartTimeLikeRight(Date validStartTime){
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
    public YunMemberDeviceQueryWrapper validStartTimeIsNull(){
        isNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper validStartTimeIsNotNull(){
        isNotNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper validStartTimeIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper validStartTimeIn(Date... values){
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
    public YunMemberDeviceQueryWrapper validStartTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper validStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_start_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 等于 =
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper validEndTimeEq(Date validEndTime){
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
    public YunMemberDeviceQueryWrapper validEndTimeNe(Date validEndTime){
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
    public YunMemberDeviceQueryWrapper validEndTimeGt(Date validEndTime){
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
    public YunMemberDeviceQueryWrapper validEndTimeGe(Date validEndTime){
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
    public YunMemberDeviceQueryWrapper validEndTimeLt(Date validEndTime){
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
    public YunMemberDeviceQueryWrapper validEndTimeLe(Date validEndTime){
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
    public YunMemberDeviceQueryWrapper validEndTimeBetween(Date validEndTimeStart,Date validEndTimeEnd){
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
    public YunMemberDeviceQueryWrapper validEndTimeNotBetween(Date validEndTimeStart,Date validEndTimeEnd){
        if(validEndTimeStart!=null && validEndTimeEnd!=null){
            notBetween("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值%'
     * @param validEndTime       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper validEndTimeLike(Date validEndTime){
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
    public YunMemberDeviceQueryWrapper validEndTimeNotLike(Date validEndTime){
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
    public YunMemberDeviceQueryWrapper validEndTimeLikeLeft(Date validEndTime){
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
    public YunMemberDeviceQueryWrapper validEndTimeLikeRight(Date validEndTime){
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
    public YunMemberDeviceQueryWrapper validEndTimeIsNull(){
        isNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper validEndTimeIsNotNull(){
        isNotNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper validEndTimeIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper validEndTimeIn(Date... values){
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
    public YunMemberDeviceQueryWrapper validEndTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper validEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_end_time",values);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * 等于 =
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper freezeStartTimeEq(Date freezeStartTime){
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
    public YunMemberDeviceQueryWrapper freezeStartTimeNe(Date freezeStartTime){
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
    public YunMemberDeviceQueryWrapper freezeStartTimeGt(Date freezeStartTime){
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
    public YunMemberDeviceQueryWrapper freezeStartTimeGe(Date freezeStartTime){
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
    public YunMemberDeviceQueryWrapper freezeStartTimeLt(Date freezeStartTime){
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
    public YunMemberDeviceQueryWrapper freezeStartTimeLe(Date freezeStartTime){
        if(freezeStartTime!=null){
            le("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * BETWEEN 值1 AND 值2
     * @param freezeStartTimeStart       值1
     * @param freezeStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper freezeStartTimeBetween(Date freezeStartTimeStart,Date freezeStartTimeEnd){
        if(freezeStartTimeStart!=null && freezeStartTimeEnd!=null){
            between("freeze_start_time",freezeStartTimeStart,freezeStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param freezeStartTimeStart       值1
     * @param freezeStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper freezeStartTimeNotBetween(Date freezeStartTimeStart,Date freezeStartTimeEnd){
        if(freezeStartTimeStart!=null && freezeStartTimeEnd!=null){
            notBetween("freeze_start_time",freezeStartTimeStart,freezeStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>冻结开始时间</p>
     * LIKE '%值%'
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper freezeStartTimeLike(Date freezeStartTime){
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
    public YunMemberDeviceQueryWrapper freezeStartTimeNotLike(Date freezeStartTime){
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
    public YunMemberDeviceQueryWrapper freezeStartTimeLikeLeft(Date freezeStartTime){
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
    public YunMemberDeviceQueryWrapper freezeStartTimeLikeRight(Date freezeStartTime){
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
    public YunMemberDeviceQueryWrapper freezeStartTimeIsNull(){
        isNull("freeze_start_time");
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper freezeStartTimeIsNotNull(){
        isNotNull("freeze_start_time");
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper freezeStartTimeIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper freezeStartTimeIn(Date... values){
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
    public YunMemberDeviceQueryWrapper freezeStartTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper freezeStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("freeze_start_time",values);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 等于 =
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper freezeEndTimeEq(Date freezeEndTime){
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
    public YunMemberDeviceQueryWrapper freezeEndTimeNe(Date freezeEndTime){
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
    public YunMemberDeviceQueryWrapper freezeEndTimeGt(Date freezeEndTime){
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
    public YunMemberDeviceQueryWrapper freezeEndTimeGe(Date freezeEndTime){
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
    public YunMemberDeviceQueryWrapper freezeEndTimeLt(Date freezeEndTime){
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
    public YunMemberDeviceQueryWrapper freezeEndTimeLe(Date freezeEndTime){
        if(freezeEndTime!=null){
            le("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * BETWEEN 值1 AND 值2
     * @param freezeEndTimeStart       值1
     * @param freezeEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper freezeEndTimeBetween(Date freezeEndTimeStart,Date freezeEndTimeEnd){
        if(freezeEndTimeStart!=null && freezeEndTimeEnd!=null){
            between("freeze_end_time",freezeEndTimeStart,freezeEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param freezeEndTimeStart       值1
     * @param freezeEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper freezeEndTimeNotBetween(Date freezeEndTimeStart,Date freezeEndTimeEnd){
        if(freezeEndTimeStart!=null && freezeEndTimeEnd!=null){
            notBetween("freeze_end_time",freezeEndTimeStart,freezeEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '%值%'
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper freezeEndTimeLike(Date freezeEndTime){
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
    public YunMemberDeviceQueryWrapper freezeEndTimeNotLike(Date freezeEndTime){
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
    public YunMemberDeviceQueryWrapper freezeEndTimeLikeLeft(Date freezeEndTime){
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
    public YunMemberDeviceQueryWrapper freezeEndTimeLikeRight(Date freezeEndTime){
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
    public YunMemberDeviceQueryWrapper freezeEndTimeIsNull(){
        isNull("freeze_end_time");
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper freezeEndTimeIsNotNull(){
        isNotNull("freeze_end_time");
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper freezeEndTimeIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper freezeEndTimeIn(Date... values){
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
    public YunMemberDeviceQueryWrapper freezeEndTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper freezeEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("freeze_end_time",values);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * 等于 =
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper totalAvailableDaysEq(Integer totalAvailableDays){
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
    public YunMemberDeviceQueryWrapper totalAvailableDaysNe(Integer totalAvailableDays){
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
    public YunMemberDeviceQueryWrapper totalAvailableDaysGt(Integer totalAvailableDays){
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
    public YunMemberDeviceQueryWrapper totalAvailableDaysGe(Integer totalAvailableDays){
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
    public YunMemberDeviceQueryWrapper totalAvailableDaysLt(Integer totalAvailableDays){
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
    public YunMemberDeviceQueryWrapper totalAvailableDaysLe(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            le("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * BETWEEN 值1 AND 值2
     * @param totalAvailableDaysStart       值1
     * @param totalAvailableDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper totalAvailableDaysBetween(Integer totalAvailableDaysStart,Integer totalAvailableDaysEnd){
        if(totalAvailableDaysStart!=null && totalAvailableDaysEnd!=null){
            between("total_available_days",totalAvailableDaysStart,totalAvailableDaysEnd);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param totalAvailableDaysStart       值1
     * @param totalAvailableDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper totalAvailableDaysNotBetween(Integer totalAvailableDaysStart,Integer totalAvailableDaysEnd){
        if(totalAvailableDaysStart!=null && totalAvailableDaysEnd!=null){
            notBetween("total_available_days",totalAvailableDaysStart,totalAvailableDaysEnd);
        }
        return this;
     }


    /**
     * <p>总天数（单位：天）</p>
     * LIKE '%值%'
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper totalAvailableDaysLike(Integer totalAvailableDays){
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
    public YunMemberDeviceQueryWrapper totalAvailableDaysNotLike(Integer totalAvailableDays){
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
    public YunMemberDeviceQueryWrapper totalAvailableDaysLikeLeft(Integer totalAvailableDays){
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
    public YunMemberDeviceQueryWrapper totalAvailableDaysLikeRight(Integer totalAvailableDays){
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
    public YunMemberDeviceQueryWrapper totalAvailableDaysIsNull(){
        isNull("total_available_days");
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper totalAvailableDaysIsNotNull(){
        isNotNull("total_available_days");
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper totalAvailableDaysIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper totalAvailableDaysIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper totalAvailableDaysNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper totalAvailableDaysNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("total_available_days",values);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * 等于 =
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper totalAvailableTimesEq(Integer totalAvailableTimes){
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
    public YunMemberDeviceQueryWrapper totalAvailableTimesNe(Integer totalAvailableTimes){
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
    public YunMemberDeviceQueryWrapper totalAvailableTimesGt(Integer totalAvailableTimes){
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
    public YunMemberDeviceQueryWrapper totalAvailableTimesGe(Integer totalAvailableTimes){
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
    public YunMemberDeviceQueryWrapper totalAvailableTimesLt(Integer totalAvailableTimes){
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
    public YunMemberDeviceQueryWrapper totalAvailableTimesLe(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            le("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * BETWEEN 值1 AND 值2
     * @param totalAvailableTimesStart       值1
     * @param totalAvailableTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper totalAvailableTimesBetween(Integer totalAvailableTimesStart,Integer totalAvailableTimesEnd){
        if(totalAvailableTimesStart!=null && totalAvailableTimesEnd!=null){
            between("total_available_times",totalAvailableTimesStart,totalAvailableTimesEnd);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param totalAvailableTimesStart       值1
     * @param totalAvailableTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper totalAvailableTimesNotBetween(Integer totalAvailableTimesStart,Integer totalAvailableTimesEnd){
        if(totalAvailableTimesStart!=null && totalAvailableTimesEnd!=null){
            notBetween("total_available_times",totalAvailableTimesStart,totalAvailableTimesEnd);
        }
        return this;
     }


    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '%值%'
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper totalAvailableTimesLike(Integer totalAvailableTimes){
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
    public YunMemberDeviceQueryWrapper totalAvailableTimesNotLike(Integer totalAvailableTimes){
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
    public YunMemberDeviceQueryWrapper totalAvailableTimesLikeLeft(Integer totalAvailableTimes){
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
    public YunMemberDeviceQueryWrapper totalAvailableTimesLikeRight(Integer totalAvailableTimes){
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
    public YunMemberDeviceQueryWrapper totalAvailableTimesIsNull(){
        isNull("total_available_times");
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper totalAvailableTimesIsNotNull(){
        isNotNull("total_available_times");
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper totalAvailableTimesIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper totalAvailableTimesIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper totalAvailableTimesNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper totalAvailableTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("total_available_times",values);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * 等于 =
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper restValidDaysEq(Integer restValidDays){
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
    public YunMemberDeviceQueryWrapper restValidDaysNe(Integer restValidDays){
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
    public YunMemberDeviceQueryWrapper restValidDaysGt(Integer restValidDays){
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
    public YunMemberDeviceQueryWrapper restValidDaysGe(Integer restValidDays){
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
    public YunMemberDeviceQueryWrapper restValidDaysLt(Integer restValidDays){
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
    public YunMemberDeviceQueryWrapper restValidDaysLe(Integer restValidDays){
        if(restValidDays!=null){
            le("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * BETWEEN 值1 AND 值2
     * @param restValidDaysStart       值1
     * @param restValidDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper restValidDaysBetween(Integer restValidDaysStart,Integer restValidDaysEnd){
        if(restValidDaysStart!=null && restValidDaysEnd!=null){
            between("rest_valid_days",restValidDaysStart,restValidDaysEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param restValidDaysStart       值1
     * @param restValidDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper restValidDaysNotBetween(Integer restValidDaysStart,Integer restValidDaysEnd){
        if(restValidDaysStart!=null && restValidDaysEnd!=null){
            notBetween("rest_valid_days",restValidDaysStart,restValidDaysEnd);
        }
        return this;
     }


    /**
     * <p>剩余可用天数</p>
     * LIKE '%值%'
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper restValidDaysLike(Integer restValidDays){
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
    public YunMemberDeviceQueryWrapper restValidDaysNotLike(Integer restValidDays){
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
    public YunMemberDeviceQueryWrapper restValidDaysLikeLeft(Integer restValidDays){
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
    public YunMemberDeviceQueryWrapper restValidDaysLikeRight(Integer restValidDays){
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
    public YunMemberDeviceQueryWrapper restValidDaysIsNull(){
        isNull("rest_valid_days");
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper restValidDaysIsNotNull(){
        isNotNull("rest_valid_days");
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper restValidDaysIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper restValidDaysIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper restValidDaysNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper restValidDaysNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rest_valid_days",values);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * 等于 =
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper restValidTimesEq(Integer restValidTimes){
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
    public YunMemberDeviceQueryWrapper restValidTimesNe(Integer restValidTimes){
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
    public YunMemberDeviceQueryWrapper restValidTimesGt(Integer restValidTimes){
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
    public YunMemberDeviceQueryWrapper restValidTimesGe(Integer restValidTimes){
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
    public YunMemberDeviceQueryWrapper restValidTimesLt(Integer restValidTimes){
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
    public YunMemberDeviceQueryWrapper restValidTimesLe(Integer restValidTimes){
        if(restValidTimes!=null){
            le("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * BETWEEN 值1 AND 值2
     * @param restValidTimesStart       值1
     * @param restValidTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper restValidTimesBetween(Integer restValidTimesStart,Integer restValidTimesEnd){
        if(restValidTimesStart!=null && restValidTimesEnd!=null){
            between("rest_valid_times",restValidTimesStart,restValidTimesEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * NOT BETWEEN 值1 AND 值2
     * @param restValidTimesStart       值1
     * @param restValidTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper restValidTimesNotBetween(Integer restValidTimesStart,Integer restValidTimesEnd){
        if(restValidTimesStart!=null && restValidTimesEnd!=null){
            notBetween("rest_valid_times",restValidTimesStart,restValidTimesEnd);
        }
        return this;
     }


    /**
     * <p>剩余可用时长</p>
     * LIKE '%值%'
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper restValidTimesLike(Integer restValidTimes){
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
    public YunMemberDeviceQueryWrapper restValidTimesNotLike(Integer restValidTimes){
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
    public YunMemberDeviceQueryWrapper restValidTimesLikeLeft(Integer restValidTimes){
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
    public YunMemberDeviceQueryWrapper restValidTimesLikeRight(Integer restValidTimes){
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
    public YunMemberDeviceQueryWrapper restValidTimesIsNull(){
        isNull("rest_valid_times");
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper restValidTimesIsNotNull(){
        isNotNull("rest_valid_times");
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper restValidTimesIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper restValidTimesIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper restValidTimesNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper restValidTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rest_valid_times",values);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 等于 =
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper bizTypeEq(Integer bizType){
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
    public YunMemberDeviceQueryWrapper bizTypeNe(Integer bizType){
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
    public YunMemberDeviceQueryWrapper bizTypeGt(Integer bizType){
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
    public YunMemberDeviceQueryWrapper bizTypeGe(Integer bizType){
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
    public YunMemberDeviceQueryWrapper bizTypeLt(Integer bizType){
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
    public YunMemberDeviceQueryWrapper bizTypeLe(Integer bizType){
        if(bizType!=null){
            le("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * BETWEEN 值1 AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper bizTypeBetween(Integer bizTypeStart,Integer bizTypeEnd){
        if(bizTypeStart!=null && bizTypeEnd!=null){
            between("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper bizTypeNotBetween(Integer bizTypeStart,Integer bizTypeEnd){
        if(bizTypeStart!=null && bizTypeEnd!=null){
            notBetween("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }


    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '%值%'
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper bizTypeLike(Integer bizType){
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
    public YunMemberDeviceQueryWrapper bizTypeNotLike(Integer bizType){
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
    public YunMemberDeviceQueryWrapper bizTypeLikeLeft(Integer bizType){
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
    public YunMemberDeviceQueryWrapper bizTypeLikeRight(Integer bizType){
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
    public YunMemberDeviceQueryWrapper bizTypeIsNull(){
        isNull("biz_type");
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper bizTypeIsNotNull(){
        isNotNull("biz_type");
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper bizTypeIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper bizTypeIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper bizTypeNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper bizTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("biz_type",values);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 等于 =
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper sourceTypeEq(Integer sourceType){
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
    public YunMemberDeviceQueryWrapper sourceTypeNe(Integer sourceType){
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
    public YunMemberDeviceQueryWrapper sourceTypeGt(Integer sourceType){
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
    public YunMemberDeviceQueryWrapper sourceTypeGe(Integer sourceType){
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
    public YunMemberDeviceQueryWrapper sourceTypeLt(Integer sourceType){
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
    public YunMemberDeviceQueryWrapper sourceTypeLe(Integer sourceType){
        if(sourceType!=null){
            le("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * BETWEEN 值1 AND 值2
     * @param sourceTypeStart       值1
     * @param sourceTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper sourceTypeBetween(Integer sourceTypeStart,Integer sourceTypeEnd){
        if(sourceTypeStart!=null && sourceTypeEnd!=null){
            between("source_type",sourceTypeStart,sourceTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param sourceTypeStart       值1
     * @param sourceTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper sourceTypeNotBetween(Integer sourceTypeStart,Integer sourceTypeEnd){
        if(sourceTypeStart!=null && sourceTypeEnd!=null){
            notBetween("source_type",sourceTypeStart,sourceTypeEnd);
        }
        return this;
     }


    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '%值%'
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper sourceTypeLike(Integer sourceType){
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
    public YunMemberDeviceQueryWrapper sourceTypeNotLike(Integer sourceType){
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
    public YunMemberDeviceQueryWrapper sourceTypeLikeLeft(Integer sourceType){
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
    public YunMemberDeviceQueryWrapper sourceTypeLikeRight(Integer sourceType){
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
    public YunMemberDeviceQueryWrapper sourceTypeIsNull(){
        isNull("source_type");
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper sourceTypeIsNotNull(){
        isNotNull("source_type");
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper sourceTypeIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper sourceTypeIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper sourceTypeNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper sourceTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("source_type",values);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * 等于 =
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper expiredTimesEq(Integer expiredTimes){
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
    public YunMemberDeviceQueryWrapper expiredTimesNe(Integer expiredTimes){
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
    public YunMemberDeviceQueryWrapper expiredTimesGt(Integer expiredTimes){
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
    public YunMemberDeviceQueryWrapper expiredTimesGe(Integer expiredTimes){
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
    public YunMemberDeviceQueryWrapper expiredTimesLt(Integer expiredTimes){
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
    public YunMemberDeviceQueryWrapper expiredTimesLe(Integer expiredTimes){
        if(expiredTimes!=null){
            le("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * BETWEEN 值1 AND 值2
     * @param expiredTimesStart       值1
     * @param expiredTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper expiredTimesBetween(Integer expiredTimesStart,Integer expiredTimesEnd){
        if(expiredTimesStart!=null && expiredTimesEnd!=null){
            between("expired_times",expiredTimesStart,expiredTimesEnd);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param expiredTimesStart       值1
     * @param expiredTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper expiredTimesNotBetween(Integer expiredTimesStart,Integer expiredTimesEnd){
        if(expiredTimesStart!=null && expiredTimesEnd!=null){
            notBetween("expired_times",expiredTimesStart,expiredTimesEnd);
        }
        return this;
     }


    /**
     * <p>过期缓冲时间</p>
     * LIKE '%值%'
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper expiredTimesLike(Integer expiredTimes){
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
    public YunMemberDeviceQueryWrapper expiredTimesNotLike(Integer expiredTimes){
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
    public YunMemberDeviceQueryWrapper expiredTimesLikeLeft(Integer expiredTimes){
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
    public YunMemberDeviceQueryWrapper expiredTimesLikeRight(Integer expiredTimes){
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
    public YunMemberDeviceQueryWrapper expiredTimesIsNull(){
        isNull("expired_times");
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper expiredTimesIsNotNull(){
        isNotNull("expired_times");
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper expiredTimesIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper expiredTimesIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper expiredTimesNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper expiredTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("expired_times",values);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 等于 =
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper lifecycleEq(String lifecycle){
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
    public YunMemberDeviceQueryWrapper lifecycleNe(String lifecycle){
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
    public YunMemberDeviceQueryWrapper lifecycleGt(String lifecycle){
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
    public YunMemberDeviceQueryWrapper lifecycleGe(String lifecycle){
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
    public YunMemberDeviceQueryWrapper lifecycleLt(String lifecycle){
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
    public YunMemberDeviceQueryWrapper lifecycleLe(String lifecycle){
        if(lifecycle!=null){
            le("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * BETWEEN 值1 AND 值2
     * @param lifecycleStart       值1
     * @param lifecycleEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper lifecycleBetween(String lifecycleStart,String lifecycleEnd){
        if(lifecycleStart!=null && lifecycleEnd!=null){
            between("lifecycle",lifecycleStart,lifecycleEnd);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lifecycleStart       值1
     * @param lifecycleEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper lifecycleNotBetween(String lifecycleStart,String lifecycleEnd){
        if(lifecycleStart!=null && lifecycleEnd!=null){
            notBetween("lifecycle",lifecycleStart,lifecycleEnd);
        }
        return this;
     }


    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '%值%'
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper lifecycleLike(String lifecycle){
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
    public YunMemberDeviceQueryWrapper lifecycleNotLike(String lifecycle){
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
    public YunMemberDeviceQueryWrapper lifecycleLikeLeft(String lifecycle){
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
    public YunMemberDeviceQueryWrapper lifecycleLikeRight(String lifecycle){
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
    public YunMemberDeviceQueryWrapper lifecycleIsNull(){
        isNull("lifecycle");
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper lifecycleIsNotNull(){
        isNotNull("lifecycle");
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper lifecycleIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper lifecycleIn(String... values){
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
    public YunMemberDeviceQueryWrapper lifecycleNotIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper lifecycleNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("lifecycle",values);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * 等于 =
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper factoryResetTimesEq(Integer factoryResetTimes){
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
    public YunMemberDeviceQueryWrapper factoryResetTimesNe(Integer factoryResetTimes){
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
    public YunMemberDeviceQueryWrapper factoryResetTimesGt(Integer factoryResetTimes){
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
    public YunMemberDeviceQueryWrapper factoryResetTimesGe(Integer factoryResetTimes){
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
    public YunMemberDeviceQueryWrapper factoryResetTimesLt(Integer factoryResetTimes){
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
    public YunMemberDeviceQueryWrapper factoryResetTimesLe(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            le("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * BETWEEN 值1 AND 值2
     * @param factoryResetTimesStart       值1
     * @param factoryResetTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper factoryResetTimesBetween(Integer factoryResetTimesStart,Integer factoryResetTimesEnd){
        if(factoryResetTimesStart!=null && factoryResetTimesEnd!=null){
            between("factory_reset_times",factoryResetTimesStart,factoryResetTimesEnd);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param factoryResetTimesStart       值1
     * @param factoryResetTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper factoryResetTimesNotBetween(Integer factoryResetTimesStart,Integer factoryResetTimesEnd){
        if(factoryResetTimesStart!=null && factoryResetTimesEnd!=null){
            notBetween("factory_reset_times",factoryResetTimesStart,factoryResetTimesEnd);
        }
        return this;
     }


    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '%值%'
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper factoryResetTimesLike(Integer factoryResetTimes){
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
    public YunMemberDeviceQueryWrapper factoryResetTimesNotLike(Integer factoryResetTimes){
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
    public YunMemberDeviceQueryWrapper factoryResetTimesLikeLeft(Integer factoryResetTimes){
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
    public YunMemberDeviceQueryWrapper factoryResetTimesLikeRight(Integer factoryResetTimes){
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
    public YunMemberDeviceQueryWrapper factoryResetTimesIsNull(){
        isNull("factory_reset_times");
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper factoryResetTimesIsNotNull(){
        isNotNull("factory_reset_times");
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper factoryResetTimesIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper factoryResetTimesIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper factoryResetTimesNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper factoryResetTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("factory_reset_times",values);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 等于 =
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper isSilentEq(Integer isSilent){
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
    public YunMemberDeviceQueryWrapper isSilentNe(Integer isSilent){
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
    public YunMemberDeviceQueryWrapper isSilentGt(Integer isSilent){
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
    public YunMemberDeviceQueryWrapper isSilentGe(Integer isSilent){
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
    public YunMemberDeviceQueryWrapper isSilentLt(Integer isSilent){
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
    public YunMemberDeviceQueryWrapper isSilentLe(Integer isSilent){
        if(isSilent!=null){
            le("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * BETWEEN 值1 AND 值2
     * @param isSilentStart       值1
     * @param isSilentEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper isSilentBetween(Integer isSilentStart,Integer isSilentEnd){
        if(isSilentStart!=null && isSilentEnd!=null){
            between("is_silent",isSilentStart,isSilentEnd);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param isSilentStart       值1
     * @param isSilentEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper isSilentNotBetween(Integer isSilentStart,Integer isSilentEnd){
        if(isSilentStart!=null && isSilentEnd!=null){
            notBetween("is_silent",isSilentStart,isSilentEnd);
        }
        return this;
     }


    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '%值%'
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper isSilentLike(Integer isSilent){
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
    public YunMemberDeviceQueryWrapper isSilentNotLike(Integer isSilent){
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
    public YunMemberDeviceQueryWrapper isSilentLikeLeft(Integer isSilent){
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
    public YunMemberDeviceQueryWrapper isSilentLikeRight(Integer isSilent){
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
    public YunMemberDeviceQueryWrapper isSilentIsNull(){
        isNull("is_silent");
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper isSilentIsNotNull(){
        isNotNull("is_silent");
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper isSilentIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper isSilentIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper isSilentNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper isSilentNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_silent",values);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * 等于 =
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper rebootTimesEq(Integer rebootTimes){
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
    public YunMemberDeviceQueryWrapper rebootTimesNe(Integer rebootTimes){
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
    public YunMemberDeviceQueryWrapper rebootTimesGt(Integer rebootTimes){
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
    public YunMemberDeviceQueryWrapper rebootTimesGe(Integer rebootTimes){
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
    public YunMemberDeviceQueryWrapper rebootTimesLt(Integer rebootTimes){
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
    public YunMemberDeviceQueryWrapper rebootTimesLe(Integer rebootTimes){
        if(rebootTimes!=null){
            le("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * BETWEEN 值1 AND 值2
     * @param rebootTimesStart       值1
     * @param rebootTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper rebootTimesBetween(Integer rebootTimesStart,Integer rebootTimesEnd){
        if(rebootTimesStart!=null && rebootTimesEnd!=null){
            between("reboot_times",rebootTimesStart,rebootTimesEnd);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param rebootTimesStart       值1
     * @param rebootTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper rebootTimesNotBetween(Integer rebootTimesStart,Integer rebootTimesEnd){
        if(rebootTimesStart!=null && rebootTimesEnd!=null){
            notBetween("reboot_times",rebootTimesStart,rebootTimesEnd);
        }
        return this;
     }


    /**
     * <p>重启设备次数</p>
     * LIKE '%值%'
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper rebootTimesLike(Integer rebootTimes){
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
    public YunMemberDeviceQueryWrapper rebootTimesNotLike(Integer rebootTimes){
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
    public YunMemberDeviceQueryWrapper rebootTimesLikeLeft(Integer rebootTimes){
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
    public YunMemberDeviceQueryWrapper rebootTimesLikeRight(Integer rebootTimes){
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
    public YunMemberDeviceQueryWrapper rebootTimesIsNull(){
        isNull("reboot_times");
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper rebootTimesIsNotNull(){
        isNotNull("reboot_times");
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper rebootTimesIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper rebootTimesIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper rebootTimesNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper rebootTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("reboot_times",values);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 等于 =
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper failureEq(Integer failure){
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
    public YunMemberDeviceQueryWrapper failureNe(Integer failure){
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
    public YunMemberDeviceQueryWrapper failureGt(Integer failure){
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
    public YunMemberDeviceQueryWrapper failureGe(Integer failure){
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
    public YunMemberDeviceQueryWrapper failureLt(Integer failure){
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
    public YunMemberDeviceQueryWrapper failureLe(Integer failure){
        if(failure!=null){
            le("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * BETWEEN 值1 AND 值2
     * @param failureStart       值1
     * @param failureEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper failureBetween(Integer failureStart,Integer failureEnd){
        if(failureStart!=null && failureEnd!=null){
            between("failure",failureStart,failureEnd);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param failureStart       值1
     * @param failureEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper failureNotBetween(Integer failureStart,Integer failureEnd){
        if(failureStart!=null && failureEnd!=null){
            notBetween("failure",failureStart,failureEnd);
        }
        return this;
     }


    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '%值%'
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper failureLike(Integer failure){
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
    public YunMemberDeviceQueryWrapper failureNotLike(Integer failure){
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
    public YunMemberDeviceQueryWrapper failureLikeLeft(Integer failure){
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
    public YunMemberDeviceQueryWrapper failureLikeRight(Integer failure){
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
    public YunMemberDeviceQueryWrapper failureIsNull(){
        isNull("failure");
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper failureIsNotNull(){
        isNotNull("failure");
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper failureIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper failureIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper failureNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper failureNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("failure",values);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 等于 =
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper syncInstallEq(Integer syncInstall){
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
    public YunMemberDeviceQueryWrapper syncInstallNe(Integer syncInstall){
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
    public YunMemberDeviceQueryWrapper syncInstallGt(Integer syncInstall){
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
    public YunMemberDeviceQueryWrapper syncInstallGe(Integer syncInstall){
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
    public YunMemberDeviceQueryWrapper syncInstallLt(Integer syncInstall){
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
    public YunMemberDeviceQueryWrapper syncInstallLe(Integer syncInstall){
        if(syncInstall!=null){
            le("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * BETWEEN 值1 AND 值2
     * @param syncInstallStart       值1
     * @param syncInstallEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper syncInstallBetween(Integer syncInstallStart,Integer syncInstallEnd){
        if(syncInstallStart!=null && syncInstallEnd!=null){
            between("sync_install",syncInstallStart,syncInstallEnd);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param syncInstallStart       值1
     * @param syncInstallEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper syncInstallNotBetween(Integer syncInstallStart,Integer syncInstallEnd){
        if(syncInstallStart!=null && syncInstallEnd!=null){
            notBetween("sync_install",syncInstallStart,syncInstallEnd);
        }
        return this;
     }


    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '%值%'
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper syncInstallLike(Integer syncInstall){
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
    public YunMemberDeviceQueryWrapper syncInstallNotLike(Integer syncInstall){
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
    public YunMemberDeviceQueryWrapper syncInstallLikeLeft(Integer syncInstall){
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
    public YunMemberDeviceQueryWrapper syncInstallLikeRight(Integer syncInstall){
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
    public YunMemberDeviceQueryWrapper syncInstallIsNull(){
        isNull("sync_install");
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper syncInstallIsNotNull(){
        isNotNull("sync_install");
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper syncInstallIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper syncInstallIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper syncInstallNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper syncInstallNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("sync_install",values);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 等于 =
     * @param roomSession       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper roomSessionEq(String roomSession){
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
    public YunMemberDeviceQueryWrapper roomSessionNe(String roomSession){
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
    public YunMemberDeviceQueryWrapper roomSessionGt(String roomSession){
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
    public YunMemberDeviceQueryWrapper roomSessionGe(String roomSession){
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
    public YunMemberDeviceQueryWrapper roomSessionLt(String roomSession){
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
    public YunMemberDeviceQueryWrapper roomSessionLe(String roomSession){
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
    public YunMemberDeviceQueryWrapper roomSessionBetween(String roomSessionStart,String roomSessionEnd){
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
    public YunMemberDeviceQueryWrapper roomSessionNotBetween(String roomSessionStart,String roomSessionEnd){
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
    public YunMemberDeviceQueryWrapper roomSessionLike(String roomSession){
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
    public YunMemberDeviceQueryWrapper roomSessionNotLike(String roomSession){
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
    public YunMemberDeviceQueryWrapper roomSessionLikeLeft(String roomSession){
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
    public YunMemberDeviceQueryWrapper roomSessionLikeRight(String roomSession){
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
    public YunMemberDeviceQueryWrapper roomSessionIsNull(){
        isNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper roomSessionIsNotNull(){
        isNotNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper roomSessionIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper roomSessionIn(String... values){
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
    public YunMemberDeviceQueryWrapper roomSessionNotIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper roomSessionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("room_session",values);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * 等于 =
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumEq(Integer roomPeopleMaxNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumNe(Integer roomPeopleMaxNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumGt(Integer roomPeopleMaxNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumGe(Integer roomPeopleMaxNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumLt(Integer roomPeopleMaxNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumLe(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            le("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * BETWEEN 值1 AND 值2
     * @param roomPeopleMaxNumStart       值1
     * @param roomPeopleMaxNumEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumBetween(Integer roomPeopleMaxNumStart,Integer roomPeopleMaxNumEnd){
        if(roomPeopleMaxNumStart!=null && roomPeopleMaxNumEnd!=null){
            between("room_people_max_num",roomPeopleMaxNumStart,roomPeopleMaxNumEnd);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param roomPeopleMaxNumStart       值1
     * @param roomPeopleMaxNumEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumNotBetween(Integer roomPeopleMaxNumStart,Integer roomPeopleMaxNumEnd){
        if(roomPeopleMaxNumStart!=null && roomPeopleMaxNumEnd!=null){
            notBetween("room_people_max_num",roomPeopleMaxNumStart,roomPeopleMaxNumEnd);
        }
        return this;
     }


    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '%值%'
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumLike(Integer roomPeopleMaxNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumNotLike(Integer roomPeopleMaxNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumLikeLeft(Integer roomPeopleMaxNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumLikeRight(Integer roomPeopleMaxNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumIsNull(){
        isNull("room_people_max_num");
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumIsNotNull(){
        isNotNull("room_people_max_num");
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper roomPeopleMaxNumNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("room_people_max_num",values);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * 等于 =
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumEq(Integer roomPeopleTotalNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumNe(Integer roomPeopleTotalNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumGt(Integer roomPeopleTotalNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumGe(Integer roomPeopleTotalNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumLt(Integer roomPeopleTotalNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumLe(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            le("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * BETWEEN 值1 AND 值2
     * @param roomPeopleTotalNumStart       值1
     * @param roomPeopleTotalNumEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumBetween(Integer roomPeopleTotalNumStart,Integer roomPeopleTotalNumEnd){
        if(roomPeopleTotalNumStart!=null && roomPeopleTotalNumEnd!=null){
            between("room_people_total_num",roomPeopleTotalNumStart,roomPeopleTotalNumEnd);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param roomPeopleTotalNumStart       值1
     * @param roomPeopleTotalNumEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumNotBetween(Integer roomPeopleTotalNumStart,Integer roomPeopleTotalNumEnd){
        if(roomPeopleTotalNumStart!=null && roomPeopleTotalNumEnd!=null){
            notBetween("room_people_total_num",roomPeopleTotalNumStart,roomPeopleTotalNumEnd);
        }
        return this;
     }


    /**
     * <p>房间当前总成员数</p>
     * LIKE '%值%'
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumLike(Integer roomPeopleTotalNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumNotLike(Integer roomPeopleTotalNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumLikeLeft(Integer roomPeopleTotalNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumLikeRight(Integer roomPeopleTotalNum){
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
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumIsNull(){
        isNull("room_people_total_num");
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumIsNotNull(){
        isNotNull("room_people_total_num");
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper roomPeopleTotalNumNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("room_people_total_num",values);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 等于 =
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper allotStatusEq(Integer allotStatus){
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
    public YunMemberDeviceQueryWrapper allotStatusNe(Integer allotStatus){
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
    public YunMemberDeviceQueryWrapper allotStatusGt(Integer allotStatus){
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
    public YunMemberDeviceQueryWrapper allotStatusGe(Integer allotStatus){
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
    public YunMemberDeviceQueryWrapper allotStatusLt(Integer allotStatus){
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
    public YunMemberDeviceQueryWrapper allotStatusLe(Integer allotStatus){
        if(allotStatus!=null){
            le("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * BETWEEN 值1 AND 值2
     * @param allotStatusStart       值1
     * @param allotStatusEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper allotStatusBetween(Integer allotStatusStart,Integer allotStatusEnd){
        if(allotStatusStart!=null && allotStatusEnd!=null){
            between("allot_status",allotStatusStart,allotStatusEnd);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param allotStatusStart       值1
     * @param allotStatusEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper allotStatusNotBetween(Integer allotStatusStart,Integer allotStatusEnd){
        if(allotStatusStart!=null && allotStatusEnd!=null){
            notBetween("allot_status",allotStatusStart,allotStatusEnd);
        }
        return this;
     }


    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '%值%'
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper allotStatusLike(Integer allotStatus){
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
    public YunMemberDeviceQueryWrapper allotStatusNotLike(Integer allotStatus){
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
    public YunMemberDeviceQueryWrapper allotStatusLikeLeft(Integer allotStatus){
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
    public YunMemberDeviceQueryWrapper allotStatusLikeRight(Integer allotStatus){
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
    public YunMemberDeviceQueryWrapper allotStatusIsNull(){
        isNull("allot_status");
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper allotStatusIsNotNull(){
        isNotNull("allot_status");
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper allotStatusIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper allotStatusIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper allotStatusNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper allotStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("allot_status",values);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 等于 =
     * @param serverType       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper serverTypeEq(Integer serverType){
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
    public YunMemberDeviceQueryWrapper serverTypeNe(Integer serverType){
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
    public YunMemberDeviceQueryWrapper serverTypeGt(Integer serverType){
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
    public YunMemberDeviceQueryWrapper serverTypeGe(Integer serverType){
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
    public YunMemberDeviceQueryWrapper serverTypeLt(Integer serverType){
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
    public YunMemberDeviceQueryWrapper serverTypeLe(Integer serverType){
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
    public YunMemberDeviceQueryWrapper serverTypeBetween(Integer serverTypeStart,Integer serverTypeEnd){
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
    public YunMemberDeviceQueryWrapper serverTypeNotBetween(Integer serverTypeStart,Integer serverTypeEnd){
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
    public YunMemberDeviceQueryWrapper serverTypeLike(Integer serverType){
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
    public YunMemberDeviceQueryWrapper serverTypeNotLike(Integer serverType){
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
    public YunMemberDeviceQueryWrapper serverTypeLikeLeft(Integer serverType){
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
    public YunMemberDeviceQueryWrapper serverTypeLikeRight(Integer serverType){
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
    public YunMemberDeviceQueryWrapper serverTypeIsNull(){
        isNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper serverTypeIsNotNull(){
        isNotNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper serverTypeIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper serverTypeIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper serverTypeNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper serverTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("server_type",values);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 等于 =
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper serviceBizTypeEq(Integer serviceBizType){
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
    public YunMemberDeviceQueryWrapper serviceBizTypeNe(Integer serviceBizType){
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
    public YunMemberDeviceQueryWrapper serviceBizTypeGt(Integer serviceBizType){
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
    public YunMemberDeviceQueryWrapper serviceBizTypeGe(Integer serviceBizType){
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
    public YunMemberDeviceQueryWrapper serviceBizTypeLt(Integer serviceBizType){
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
    public YunMemberDeviceQueryWrapper serviceBizTypeLe(Integer serviceBizType){
        if(serviceBizType!=null){
            le("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * BETWEEN 值1 AND 值2
     * @param serviceBizTypeStart       值1
     * @param serviceBizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper serviceBizTypeBetween(Integer serviceBizTypeStart,Integer serviceBizTypeEnd){
        if(serviceBizTypeStart!=null && serviceBizTypeEnd!=null){
            between("service_biz_type",serviceBizTypeStart,serviceBizTypeEnd);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param serviceBizTypeStart       值1
     * @param serviceBizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper serviceBizTypeNotBetween(Integer serviceBizTypeStart,Integer serviceBizTypeEnd){
        if(serviceBizTypeStart!=null && serviceBizTypeEnd!=null){
            notBetween("service_biz_type",serviceBizTypeStart,serviceBizTypeEnd);
        }
        return this;
     }


    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '%值%'
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper serviceBizTypeLike(Integer serviceBizType){
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
    public YunMemberDeviceQueryWrapper serviceBizTypeNotLike(Integer serviceBizType){
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
    public YunMemberDeviceQueryWrapper serviceBizTypeLikeLeft(Integer serviceBizType){
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
    public YunMemberDeviceQueryWrapper serviceBizTypeLikeRight(Integer serviceBizType){
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
    public YunMemberDeviceQueryWrapper serviceBizTypeIsNull(){
        isNull("service_biz_type");
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper serviceBizTypeIsNotNull(){
        isNotNull("service_biz_type");
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper serviceBizTypeIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper serviceBizTypeIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper serviceBizTypeNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper serviceBizTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("service_biz_type",values);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 等于 =
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper downstreamBroadbandEq(Long downstreamBroadband){
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
    public YunMemberDeviceQueryWrapper downstreamBroadbandNe(Long downstreamBroadband){
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
    public YunMemberDeviceQueryWrapper downstreamBroadbandGt(Long downstreamBroadband){
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
    public YunMemberDeviceQueryWrapper downstreamBroadbandGe(Long downstreamBroadband){
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
    public YunMemberDeviceQueryWrapper downstreamBroadbandLt(Long downstreamBroadband){
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
    public YunMemberDeviceQueryWrapper downstreamBroadbandLe(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            le("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * BETWEEN 值1 AND 值2
     * @param downstreamBroadbandStart       值1
     * @param downstreamBroadbandEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper downstreamBroadbandBetween(Long downstreamBroadbandStart,Long downstreamBroadbandEnd){
        if(downstreamBroadbandStart!=null && downstreamBroadbandEnd!=null){
            between("downstream_broadband",downstreamBroadbandStart,downstreamBroadbandEnd);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param downstreamBroadbandStart       值1
     * @param downstreamBroadbandEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper downstreamBroadbandNotBetween(Long downstreamBroadbandStart,Long downstreamBroadbandEnd){
        if(downstreamBroadbandStart!=null && downstreamBroadbandEnd!=null){
            notBetween("downstream_broadband",downstreamBroadbandStart,downstreamBroadbandEnd);
        }
        return this;
     }


    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '%值%'
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper downstreamBroadbandLike(Long downstreamBroadband){
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
    public YunMemberDeviceQueryWrapper downstreamBroadbandNotLike(Long downstreamBroadband){
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
    public YunMemberDeviceQueryWrapper downstreamBroadbandLikeLeft(Long downstreamBroadband){
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
    public YunMemberDeviceQueryWrapper downstreamBroadbandLikeRight(Long downstreamBroadband){
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
    public YunMemberDeviceQueryWrapper downstreamBroadbandIsNull(){
        isNull("downstream_broadband");
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper downstreamBroadbandIsNotNull(){
        isNotNull("downstream_broadband");
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper downstreamBroadbandIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper downstreamBroadbandIn(Long... values){
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
    public YunMemberDeviceQueryWrapper downstreamBroadbandNotIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper downstreamBroadbandNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("downstream_broadband",values);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper statusEq(Integer status){
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
    public YunMemberDeviceQueryWrapper statusNe(Integer status){
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
    public YunMemberDeviceQueryWrapper statusGt(Integer status){
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
    public YunMemberDeviceQueryWrapper statusGe(Integer status){
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
    public YunMemberDeviceQueryWrapper statusLt(Integer status){
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
    public YunMemberDeviceQueryWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper statusLike(Integer status){
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
    public YunMemberDeviceQueryWrapper statusNotLike(Integer status){
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
    public YunMemberDeviceQueryWrapper statusLikeLeft(Integer status){
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
    public YunMemberDeviceQueryWrapper statusLikeRight(Integer status){
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
    public YunMemberDeviceQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper statusIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper statusIn(Integer... values){
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
    public YunMemberDeviceQueryWrapper statusNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 等于 =
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper buyTimeEq(Date buyTime){
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
    public YunMemberDeviceQueryWrapper buyTimeNe(Date buyTime){
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
    public YunMemberDeviceQueryWrapper buyTimeGt(Date buyTime){
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
    public YunMemberDeviceQueryWrapper buyTimeGe(Date buyTime){
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
    public YunMemberDeviceQueryWrapper buyTimeLt(Date buyTime){
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
    public YunMemberDeviceQueryWrapper buyTimeLe(Date buyTime){
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
    public YunMemberDeviceQueryWrapper buyTimeBetween(Date buyTimeStart,Date buyTimeEnd){
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
    public YunMemberDeviceQueryWrapper buyTimeNotBetween(Date buyTimeStart,Date buyTimeEnd){
        if(buyTimeStart!=null && buyTimeEnd!=null){
            notBetween("buy_time",buyTimeStart,buyTimeEnd);
        }
        return this;
     }


    /**
     * <p>订购时间</p>
     * LIKE '%值%'
     * @param buyTime       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper buyTimeLike(Date buyTime){
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
    public YunMemberDeviceQueryWrapper buyTimeNotLike(Date buyTime){
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
    public YunMemberDeviceQueryWrapper buyTimeLikeLeft(Date buyTime){
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
    public YunMemberDeviceQueryWrapper buyTimeLikeRight(Date buyTime){
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
    public YunMemberDeviceQueryWrapper buyTimeIsNull(){
        isNull("buy_time");
        return this;
    }

    /**
     * <p>订购时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper buyTimeIsNotNull(){
        isNotNull("buy_time");
        return this;
    }

    /**
     * <p>订购时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper buyTimeIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper buyTimeIn(Date... values){
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
    public YunMemberDeviceQueryWrapper buyTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper buyTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("buy_time",values);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 等于 =
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper lastRenewTimeEq(Date lastRenewTime){
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
    public YunMemberDeviceQueryWrapper lastRenewTimeNe(Date lastRenewTime){
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
    public YunMemberDeviceQueryWrapper lastRenewTimeGt(Date lastRenewTime){
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
    public YunMemberDeviceQueryWrapper lastRenewTimeGe(Date lastRenewTime){
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
    public YunMemberDeviceQueryWrapper lastRenewTimeLt(Date lastRenewTime){
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
    public YunMemberDeviceQueryWrapper lastRenewTimeLe(Date lastRenewTime){
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
    public YunMemberDeviceQueryWrapper lastRenewTimeBetween(Date lastRenewTimeStart,Date lastRenewTimeEnd){
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
    public YunMemberDeviceQueryWrapper lastRenewTimeNotBetween(Date lastRenewTimeStart,Date lastRenewTimeEnd){
        if(lastRenewTimeStart!=null && lastRenewTimeEnd!=null){
            notBetween("last_renew_time",lastRenewTimeStart,lastRenewTimeEnd);
        }
        return this;
     }


    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值%'
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper lastRenewTimeLike(Date lastRenewTime){
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
    public YunMemberDeviceQueryWrapper lastRenewTimeNotLike(Date lastRenewTime){
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
    public YunMemberDeviceQueryWrapper lastRenewTimeLikeLeft(Date lastRenewTime){
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
    public YunMemberDeviceQueryWrapper lastRenewTimeLikeRight(Date lastRenewTime){
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
    public YunMemberDeviceQueryWrapper lastRenewTimeIsNull(){
        isNull("last_renew_time");
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper lastRenewTimeIsNotNull(){
        isNotNull("last_renew_time");
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper lastRenewTimeIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper lastRenewTimeIn(Date... values){
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
    public YunMemberDeviceQueryWrapper lastRenewTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper lastRenewTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_renew_time",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper createTimeEq(Date createTime){
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
    public YunMemberDeviceQueryWrapper createTimeNe(Date createTime){
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
    public YunMemberDeviceQueryWrapper createTimeGt(Date createTime){
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
    public YunMemberDeviceQueryWrapper createTimeGe(Date createTime){
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
    public YunMemberDeviceQueryWrapper createTimeLt(Date createTime){
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
    public YunMemberDeviceQueryWrapper createTimeLe(Date createTime){
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
    public YunMemberDeviceQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberDeviceQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper createTimeLike(Date createTime){
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
    public YunMemberDeviceQueryWrapper createTimeNotLike(Date createTime){
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
    public YunMemberDeviceQueryWrapper createTimeLikeLeft(Date createTime){
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
    public YunMemberDeviceQueryWrapper createTimeLikeRight(Date createTime){
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
    public YunMemberDeviceQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper createTimeIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper createTimeIn(Date... values){
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
    public YunMemberDeviceQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * 等于 =
     * @param idleTime       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper idleTimeEq(Date idleTime){
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
    public YunMemberDeviceQueryWrapper idleTimeNe(Date idleTime){
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
    public YunMemberDeviceQueryWrapper idleTimeGt(Date idleTime){
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
    public YunMemberDeviceQueryWrapper idleTimeGe(Date idleTime){
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
    public YunMemberDeviceQueryWrapper idleTimeLt(Date idleTime){
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
    public YunMemberDeviceQueryWrapper idleTimeLe(Date idleTime){
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
    public YunMemberDeviceQueryWrapper idleTimeBetween(Date idleTimeStart,Date idleTimeEnd){
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
    public YunMemberDeviceQueryWrapper idleTimeNotBetween(Date idleTimeStart,Date idleTimeEnd){
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
    public YunMemberDeviceQueryWrapper idleTimeLike(Date idleTime){
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
    public YunMemberDeviceQueryWrapper idleTimeNotLike(Date idleTime){
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
    public YunMemberDeviceQueryWrapper idleTimeLikeLeft(Date idleTime){
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
    public YunMemberDeviceQueryWrapper idleTimeLikeRight(Date idleTime){
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
    public YunMemberDeviceQueryWrapper idleTimeIsNull(){
        isNull("idle_time");
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper idleTimeIsNotNull(){
        isNotNull("idle_time");
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper idleTimeIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper idleTimeIn(Date... values){
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
    public YunMemberDeviceQueryWrapper idleTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceQueryWrapper idleTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("idle_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper versionIdEq(Long versionId){
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
    public YunMemberDeviceQueryWrapper versionIdNe(Long versionId){
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
    public YunMemberDeviceQueryWrapper versionIdGt(Long versionId){
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
    public YunMemberDeviceQueryWrapper versionIdGe(Long versionId){
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
    public YunMemberDeviceQueryWrapper versionIdLt(Long versionId){
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
    public YunMemberDeviceQueryWrapper versionIdLe(Long versionId){
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
    public YunMemberDeviceQueryWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public YunMemberDeviceQueryWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper versionIdLike(Long versionId){
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
    public YunMemberDeviceQueryWrapper versionIdNotLike(Long versionId){
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
    public YunMemberDeviceQueryWrapper versionIdLikeLeft(Long versionId){
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
    public YunMemberDeviceQueryWrapper versionIdLikeRight(Long versionId){
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
    public YunMemberDeviceQueryWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper versionIdIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper versionIdIn(Long... values){
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
    public YunMemberDeviceQueryWrapper versionIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyProvinceEq(String proxyProvince){
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
    public YunMemberDeviceQueryWrapper proxyProvinceNe(String proxyProvince){
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
    public YunMemberDeviceQueryWrapper proxyProvinceGt(String proxyProvince){
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
    public YunMemberDeviceQueryWrapper proxyProvinceGe(String proxyProvince){
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
    public YunMemberDeviceQueryWrapper proxyProvinceLt(String proxyProvince){
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
    public YunMemberDeviceQueryWrapper proxyProvinceLe(String proxyProvince){
        if(proxyProvince!=null){
            le("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param proxyProvinceStart       值1
     * @param proxyProvinceEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyProvinceBetween(String proxyProvinceStart,String proxyProvinceEnd){
        if(proxyProvinceStart!=null && proxyProvinceEnd!=null){
            between("proxy_province",proxyProvinceStart,proxyProvinceEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param proxyProvinceStart       值1
     * @param proxyProvinceEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyProvinceNotBetween(String proxyProvinceStart,String proxyProvinceEnd){
        if(proxyProvinceStart!=null && proxyProvinceEnd!=null){
            notBetween("proxy_province",proxyProvinceStart,proxyProvinceEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyProvinceLike(String proxyProvince){
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
    public YunMemberDeviceQueryWrapper proxyProvinceNotLike(String proxyProvince){
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
    public YunMemberDeviceQueryWrapper proxyProvinceLikeLeft(String proxyProvince){
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
    public YunMemberDeviceQueryWrapper proxyProvinceLikeRight(String proxyProvince){
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
    public YunMemberDeviceQueryWrapper proxyProvinceIsNull(){
        isNull("proxy_province");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyProvinceIsNotNull(){
        isNotNull("proxy_province");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyProvinceIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper proxyProvinceIn(String... values){
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
    public YunMemberDeviceQueryWrapper proxyProvinceNotIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper proxyProvinceNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_province",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyCityEq(String proxyCity){
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
    public YunMemberDeviceQueryWrapper proxyCityNe(String proxyCity){
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
    public YunMemberDeviceQueryWrapper proxyCityGt(String proxyCity){
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
    public YunMemberDeviceQueryWrapper proxyCityGe(String proxyCity){
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
    public YunMemberDeviceQueryWrapper proxyCityLt(String proxyCity){
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
    public YunMemberDeviceQueryWrapper proxyCityLe(String proxyCity){
        if(proxyCity!=null){
            le("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param proxyCityStart       值1
     * @param proxyCityEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyCityBetween(String proxyCityStart,String proxyCityEnd){
        if(proxyCityStart!=null && proxyCityEnd!=null){
            between("proxy_city",proxyCityStart,proxyCityEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param proxyCityStart       值1
     * @param proxyCityEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyCityNotBetween(String proxyCityStart,String proxyCityEnd){
        if(proxyCityStart!=null && proxyCityEnd!=null){
            notBetween("proxy_city",proxyCityStart,proxyCityEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyCityLike(String proxyCity){
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
    public YunMemberDeviceQueryWrapper proxyCityNotLike(String proxyCity){
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
    public YunMemberDeviceQueryWrapper proxyCityLikeLeft(String proxyCity){
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
    public YunMemberDeviceQueryWrapper proxyCityLikeRight(String proxyCity){
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
    public YunMemberDeviceQueryWrapper proxyCityIsNull(){
        isNull("proxy_city");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyCityIsNotNull(){
        isNotNull("proxy_city");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyCityIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper proxyCityIn(String... values){
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
    public YunMemberDeviceQueryWrapper proxyCityNotIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper proxyCityNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_city",values);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 等于 =
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyServerEq(String proxyServer){
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
    public YunMemberDeviceQueryWrapper proxyServerNe(String proxyServer){
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
    public YunMemberDeviceQueryWrapper proxyServerGt(String proxyServer){
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
    public YunMemberDeviceQueryWrapper proxyServerGe(String proxyServer){
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
    public YunMemberDeviceQueryWrapper proxyServerLt(String proxyServer){
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
    public YunMemberDeviceQueryWrapper proxyServerLe(String proxyServer){
        if(proxyServer!=null){
            le("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * BETWEEN 值1 AND 值2
     * @param proxyServerStart       值1
     * @param proxyServerEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyServerBetween(String proxyServerStart,String proxyServerEnd){
        if(proxyServerStart!=null && proxyServerEnd!=null){
            between("proxy_server",proxyServerStart,proxyServerEnd);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * NOT BETWEEN 值1 AND 值2
     * @param proxyServerStart       值1
     * @param proxyServerEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyServerNotBetween(String proxyServerStart,String proxyServerEnd){
        if(proxyServerStart!=null && proxyServerEnd!=null){
            notBetween("proxy_server",proxyServerStart,proxyServerEnd);
        }
        return this;
     }


    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '%值%'
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyServerLike(String proxyServer){
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
    public YunMemberDeviceQueryWrapper proxyServerNotLike(String proxyServer){
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
    public YunMemberDeviceQueryWrapper proxyServerLikeLeft(String proxyServer){
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
    public YunMemberDeviceQueryWrapper proxyServerLikeRight(String proxyServer){
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
    public YunMemberDeviceQueryWrapper proxyServerIsNull(){
        isNull("proxy_server");
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyServerIsNotNull(){
        isNotNull("proxy_server");
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyServerIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper proxyServerIn(String... values){
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
    public YunMemberDeviceQueryWrapper proxyServerNotIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper proxyServerNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_server",values);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * 等于 =
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper connectedEq(Boolean connected){
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
    public YunMemberDeviceQueryWrapper connectedNe(Boolean connected){
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
    public YunMemberDeviceQueryWrapper connectedGt(Boolean connected){
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
    public YunMemberDeviceQueryWrapper connectedGe(Boolean connected){
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
    public YunMemberDeviceQueryWrapper connectedLt(Boolean connected){
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
    public YunMemberDeviceQueryWrapper connectedLe(Boolean connected){
        if(connected!=null){
            le("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * BETWEEN 值1 AND 值2
     * @param connectedStart       值1
     * @param connectedEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper connectedBetween(Boolean connectedStart,Boolean connectedEnd){
        if(connectedStart!=null && connectedEnd!=null){
            between("connected",connectedStart,connectedEnd);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * NOT BETWEEN 值1 AND 值2
     * @param connectedStart       值1
     * @param connectedEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper connectedNotBetween(Boolean connectedStart,Boolean connectedEnd){
        if(connectedStart!=null && connectedEnd!=null){
            notBetween("connected",connectedStart,connectedEnd);
        }
        return this;
     }


    /**
     * <p>代理是否连上</p>
     * LIKE '%值%'
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper connectedLike(Boolean connected){
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
    public YunMemberDeviceQueryWrapper connectedNotLike(Boolean connected){
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
    public YunMemberDeviceQueryWrapper connectedLikeLeft(Boolean connected){
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
    public YunMemberDeviceQueryWrapper connectedLikeRight(Boolean connected){
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
    public YunMemberDeviceQueryWrapper connectedIsNull(){
        isNull("connected");
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper connectedIsNotNull(){
        isNotNull("connected");
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper connectedIn(Collection<Boolean> value){
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
    public YunMemberDeviceQueryWrapper connectedIn(Boolean... values){
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
    public YunMemberDeviceQueryWrapper connectedNotIn(Collection<Boolean> value){
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
    public YunMemberDeviceQueryWrapper connectedNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("connected",values);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * 等于 =
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyNetIpEq(String proxyNetIp){
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
    public YunMemberDeviceQueryWrapper proxyNetIpNe(String proxyNetIp){
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
    public YunMemberDeviceQueryWrapper proxyNetIpGt(String proxyNetIp){
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
    public YunMemberDeviceQueryWrapper proxyNetIpGe(String proxyNetIp){
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
    public YunMemberDeviceQueryWrapper proxyNetIpLt(String proxyNetIp){
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
    public YunMemberDeviceQueryWrapper proxyNetIpLe(String proxyNetIp){
        if(proxyNetIp!=null){
            le("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * BETWEEN 值1 AND 值2
     * @param proxyNetIpStart       值1
     * @param proxyNetIpEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyNetIpBetween(String proxyNetIpStart,String proxyNetIpEnd){
        if(proxyNetIpStart!=null && proxyNetIpEnd!=null){
            between("proxy_net_ip",proxyNetIpStart,proxyNetIpEnd);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * NOT BETWEEN 值1 AND 值2
     * @param proxyNetIpStart       值1
     * @param proxyNetIpEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyNetIpNotBetween(String proxyNetIpStart,String proxyNetIpEnd){
        if(proxyNetIpStart!=null && proxyNetIpEnd!=null){
            notBetween("proxy_net_ip",proxyNetIpStart,proxyNetIpEnd);
        }
        return this;
     }


    /**
     * <p>当前代理的网络IP</p>
     * LIKE '%值%'
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyNetIpLike(String proxyNetIp){
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
    public YunMemberDeviceQueryWrapper proxyNetIpNotLike(String proxyNetIp){
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
    public YunMemberDeviceQueryWrapper proxyNetIpLikeLeft(String proxyNetIp){
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
    public YunMemberDeviceQueryWrapper proxyNetIpLikeRight(String proxyNetIp){
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
    public YunMemberDeviceQueryWrapper proxyNetIpIsNull(){
        isNull("proxy_net_ip");
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyNetIpIsNotNull(){
        isNotNull("proxy_net_ip");
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyNetIpIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper proxyNetIpIn(String... values){
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
    public YunMemberDeviceQueryWrapper proxyNetIpNotIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper proxyNetIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_net_ip",values);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * 等于 =
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyNetIpAddressEq(String proxyNetIpAddress){
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
    public YunMemberDeviceQueryWrapper proxyNetIpAddressNe(String proxyNetIpAddress){
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
    public YunMemberDeviceQueryWrapper proxyNetIpAddressGt(String proxyNetIpAddress){
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
    public YunMemberDeviceQueryWrapper proxyNetIpAddressGe(String proxyNetIpAddress){
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
    public YunMemberDeviceQueryWrapper proxyNetIpAddressLt(String proxyNetIpAddress){
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
    public YunMemberDeviceQueryWrapper proxyNetIpAddressLe(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            le("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * BETWEEN 值1 AND 值2
     * @param proxyNetIpAddressStart       值1
     * @param proxyNetIpAddressEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyNetIpAddressBetween(String proxyNetIpAddressStart,String proxyNetIpAddressEnd){
        if(proxyNetIpAddressStart!=null && proxyNetIpAddressEnd!=null){
            between("proxy_net_ip_address",proxyNetIpAddressStart,proxyNetIpAddressEnd);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * NOT BETWEEN 值1 AND 值2
     * @param proxyNetIpAddressStart       值1
     * @param proxyNetIpAddressEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyNetIpAddressNotBetween(String proxyNetIpAddressStart,String proxyNetIpAddressEnd){
        if(proxyNetIpAddressStart!=null && proxyNetIpAddressEnd!=null){
            notBetween("proxy_net_ip_address",proxyNetIpAddressStart,proxyNetIpAddressEnd);
        }
        return this;
     }


    /**
     * <p>IP的地理位置显示</p>
     * LIKE '%值%'
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyNetIpAddressLike(String proxyNetIpAddress){
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
    public YunMemberDeviceQueryWrapper proxyNetIpAddressNotLike(String proxyNetIpAddress){
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
    public YunMemberDeviceQueryWrapper proxyNetIpAddressLikeLeft(String proxyNetIpAddress){
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
    public YunMemberDeviceQueryWrapper proxyNetIpAddressLikeRight(String proxyNetIpAddress){
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
    public YunMemberDeviceQueryWrapper proxyNetIpAddressIsNull(){
        isNull("proxy_net_ip_address");
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyNetIpAddressIsNotNull(){
        isNotNull("proxy_net_ip_address");
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper proxyNetIpAddressIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper proxyNetIpAddressIn(String... values){
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
    public YunMemberDeviceQueryWrapper proxyNetIpAddressNotIn(Collection<String> value){
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
    public YunMemberDeviceQueryWrapper proxyNetIpAddressNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_net_ip_address",values);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 等于 =
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper seedDeviceEq(Boolean seedDevice){
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
    public YunMemberDeviceQueryWrapper seedDeviceNe(Boolean seedDevice){
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
    public YunMemberDeviceQueryWrapper seedDeviceGt(Boolean seedDevice){
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
    public YunMemberDeviceQueryWrapper seedDeviceGe(Boolean seedDevice){
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
    public YunMemberDeviceQueryWrapper seedDeviceLt(Boolean seedDevice){
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
    public YunMemberDeviceQueryWrapper seedDeviceLe(Boolean seedDevice){
        if(seedDevice!=null){
            le("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * BETWEEN 值1 AND 值2
     * @param seedDeviceStart       值1
     * @param seedDeviceEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper seedDeviceBetween(Boolean seedDeviceStart,Boolean seedDeviceEnd){
        if(seedDeviceStart!=null && seedDeviceEnd!=null){
            between("seed_device",seedDeviceStart,seedDeviceEnd);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param seedDeviceStart       值1
     * @param seedDeviceEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper seedDeviceNotBetween(Boolean seedDeviceStart,Boolean seedDeviceEnd){
        if(seedDeviceStart!=null && seedDeviceEnd!=null){
            notBetween("seed_device",seedDeviceStart,seedDeviceEnd);
        }
        return this;
     }


    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '%值%'
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper seedDeviceLike(Boolean seedDevice){
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
    public YunMemberDeviceQueryWrapper seedDeviceNotLike(Boolean seedDevice){
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
    public YunMemberDeviceQueryWrapper seedDeviceLikeLeft(Boolean seedDevice){
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
    public YunMemberDeviceQueryWrapper seedDeviceLikeRight(Boolean seedDevice){
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
    public YunMemberDeviceQueryWrapper seedDeviceIsNull(){
        isNull("seed_device");
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper seedDeviceIsNotNull(){
        isNotNull("seed_device");
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper seedDeviceIn(Collection<Boolean> value){
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
    public YunMemberDeviceQueryWrapper seedDeviceIn(Boolean... values){
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
    public YunMemberDeviceQueryWrapper seedDeviceNotIn(Collection<Boolean> value){
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
    public YunMemberDeviceQueryWrapper seedDeviceNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("seed_device",values);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * 等于 =
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdEq(Long fkServerHostUsageRateId){
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
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdNe(Long fkServerHostUsageRateId){
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
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdGt(Long fkServerHostUsageRateId){
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
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdGe(Long fkServerHostUsageRateId){
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
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdLt(Long fkServerHostUsageRateId){
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
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdLe(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            le("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * BETWEEN 值1 AND 值2
     * @param fkServerHostUsageRateIdStart       值1
     * @param fkServerHostUsageRateIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdBetween(Long fkServerHostUsageRateIdStart,Long fkServerHostUsageRateIdEnd){
        if(fkServerHostUsageRateIdStart!=null && fkServerHostUsageRateIdEnd!=null){
            between("fk_server_host_usage_rate_id",fkServerHostUsageRateIdStart,fkServerHostUsageRateIdEnd);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkServerHostUsageRateIdStart       值1
     * @param fkServerHostUsageRateIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdNotBetween(Long fkServerHostUsageRateIdStart,Long fkServerHostUsageRateIdEnd){
        if(fkServerHostUsageRateIdStart!=null && fkServerHostUsageRateIdEnd!=null){
            notBetween("fk_server_host_usage_rate_id",fkServerHostUsageRateIdStart,fkServerHostUsageRateIdEnd);
        }
        return this;
     }


    /**
     * <p>物理机使用率记录id</p>
     * LIKE '%值%'
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdLike(Long fkServerHostUsageRateId){
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
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdNotLike(Long fkServerHostUsageRateId){
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
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdLikeLeft(Long fkServerHostUsageRateId){
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
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdLikeRight(Long fkServerHostUsageRateId){
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
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdIsNull(){
        isNull("fk_server_host_usage_rate_id");
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdIsNotNull(){
        isNotNull("fk_server_host_usage_rate_id");
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdIn(Long... values){
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
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkServerHostUsageRateIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_server_host_usage_rate_id",values);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 等于 =
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
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
    public YunMemberDeviceQueryWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
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
    public YunMemberDeviceQueryWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
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
    public YunMemberDeviceQueryWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
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
    public YunMemberDeviceQueryWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
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
    public YunMemberDeviceQueryWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * BETWEEN 值1 AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>区域id</p>
     * LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
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
    public YunMemberDeviceQueryWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
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
    public YunMemberDeviceQueryWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
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
    public YunMemberDeviceQueryWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
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
    public YunMemberDeviceQueryWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryWrapper fkPcpAreaIdIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkPcpAreaIdIn(Long... values){
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
    public YunMemberDeviceQueryWrapper fkPcpAreaIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceQueryWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }


}
