package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.EmSocDeviceCmdRebootRecord;

import java.util.Collection;
import java.util.Date;
import java.util.function.Consumer;

/**
 * <p>
 * 
 * </p>
 * "em_soc_device_cmd_reboot_record"
 * @author Administrator
 */
public class EmSocDeviceCmdRebootRecordQueryEntityWrapper extends QueryWrapper<EmSocDeviceCmdRebootRecord> {

    public static EmSocDeviceCmdRebootRecordQueryEntityWrapper wrapper(EmSocDeviceCmdRebootRecord entity) {
        return new EmSocDeviceCmdRebootRecordQueryEntityWrapper(entity);
    }

    private EmSocDeviceCmdRebootRecord entity;

    public EmSocDeviceCmdRebootRecordQueryEntityWrapper(EmSocDeviceCmdRebootRecord entity) {
         this.entity=entity;
    }


    protected EmSocDeviceCmdRebootRecord entity() {
        if(entity==null){
            throw new NullPointerException("EmSocDeviceCmdRebootRecord is null");
        }
        return entity;
    }

    @Override
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper selectColumns(Consumer<EmSocDeviceCmdRebootRecordSelect> consumer) {
        EmSocDeviceCmdRebootRecordSelect select = new EmSocDeviceCmdRebootRecordSelect();
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idEq(){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idNe(){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idGt(){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idGe(){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idLt(){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idLe(){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idBetween(Long idEnd){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idNotBetween(Long idEnd){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idLike(){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idNotLike(){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idLikeLeft(){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idLikeRight(){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idEq(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idNe(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idGt(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idGe(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idLt(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idLe(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idLike(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idNotLike(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idLikeLeft(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idLikeRight(Long id){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idIn(Collection<Long> value){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idIn(Long... values){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>云机归属商户</p>
     * 等于 = entity().getFkMemberId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdEq(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * 不等于 &lt;&gt; entity().getFkMemberId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdNe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * 大于 &gt; entity().getFkMemberId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdGt(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * 大于等于 &gt;= entity().getFkMemberId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdGe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * 小于 &lt; entity().getFkMemberId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdLt(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * 小于等于 &lt;= entity().getFkMemberId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdLe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * BETWEEN  entity().getFkMemberId() AND fkMemberIdEnd
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdBetween(Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberId,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * NOT BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdNotBetween(Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberId,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * NOT BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>云机归属商户</p>
     * LIKE '%值%'  entity().getFkMemberId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * NOT LIKE '%值%'  entity().getFkMemberId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdNotLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>云机归属商户</p>
     * LIKE '%值'  entity().getFkMemberId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdLikeLeft(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * LIKE '值%'  entity().getFkMemberId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdLikeRight(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            likeRight("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * 等于 =
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdEq(Long fkMemberId){
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * 不等于 &lt;&gt;
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdNe(Long fkMemberId){
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * 大于 &gt;
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdGt(Long fkMemberId){
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * 大于等于 &gt;=
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdGe(Long fkMemberId){
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * 小于 &lt;
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdLt(Long fkMemberId){
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * 小于等于 &lt;=
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdLe(Long fkMemberId){
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * LIKE '%值%'
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdLike(Long fkMemberId){
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * NOT LIKE '%值%'
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdNotLike(Long fkMemberId){
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>云机归属商户</p>
     * LIKE '%值'
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdLikeLeft(Long fkMemberId){
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * LIKE '值%'
     * @param fkMemberId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdLikeRight(Long fkMemberId){
        if(fkMemberId!=null){
            likeRight("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_member_id",value);
        }
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_member_id",value);
        }
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }


    /**
     * <p>设备id</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdEq(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * 不等于 &lt;&gt; entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdNe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 大于 &gt; entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdGt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 大于等于 &gt;= entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdGe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 小于 &lt; entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdLt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 小于等于 &lt;= entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * BETWEEN  entity().getDeviceId() AND deviceIdEnd
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceId,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdNotBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceId,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备id</p>
     * LIKE '%值%'  entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * NOT LIKE '%值%'  entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备id</p>
     * LIKE '%值'  entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * LIKE '值%'  entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdLikeRight(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * 不等于 &lt;&gt;
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 大于 &gt;
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 大于等于 &gt;=
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 小于 &lt;
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 小于等于 &lt;=
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * NOT LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备id</p>
     * LIKE '%值'
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * LIKE '值%'
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdLikeRight(String deviceId){
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_id",value);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("device_id",values);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_id",value);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }


    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 等于 = entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeEq(){
        Integer type =entity().getType();
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 不等于 &lt;&gt; entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeNe(){
        Integer type =entity().getType();
        if(type!=null){
            ne("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 大于 &gt; entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeGt(){
        Integer type =entity().getType();
        if(type!=null){
            gt("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 大于等于 &gt;= entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeGe(){
        Integer type =entity().getType();
        if(type!=null){
            ge("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 小于 &lt; entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeLt(){
        Integer type =entity().getType();
        if(type!=null){
            lt("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 小于等于 &lt;= entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeLe(){
        Integer type =entity().getType();
        if(type!=null){
            le("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * BETWEEN  entity().getType() AND typeEnd
     * @param typeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeBetween(Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            between("type",type,typeEnd);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * NOT BETWEEN  entity().getType() AND 值2
     * @param typeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeNotBetween(Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            notBetween("type",type,typeEnd);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * BETWEEN  entity().getType() AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeBetween(Integer typeStart,Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            between("type",typeStart,typeEnd);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * NOT BETWEEN  entity().getType() AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeNotBetween(Integer typeStart,Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            notBetween("type",typeStart,typeEnd);
        }
        return this;
     }


    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '%值%'  entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeLike(){
        Integer type =entity().getType();
        if(type!=null){
            like("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * NOT LIKE '%值%'  entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeNotLike(){
        Integer type =entity().getType();
        if(type!=null){
            notLike("type",type);
        }
        return this;
     }


    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '%值'  entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeLikeLeft(){
        Integer type =entity().getType();
        if(type!=null){
            likeLeft("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '值%'  entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeLikeRight(){
        Integer type =entity().getType();
        if(type!=null){
            likeRight("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 等于 =
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeEq(Integer type){
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 不等于 &lt;&gt;
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeNe(Integer type){
        if(type!=null){
            ne("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 大于 &gt;
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeGt(Integer type){
        if(type!=null){
            gt("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 大于等于 &gt;=
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeGe(Integer type){
        if(type!=null){
            ge("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 小于 &lt;
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeLt(Integer type){
        if(type!=null){
            lt("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * 小于等于 &lt;=
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeLe(Integer type){
        if(type!=null){
            le("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '%值%'
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeLike(Integer type){
        if(type!=null){
            like("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * NOT LIKE '%值%'
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeNotLike(Integer type){
        if(type!=null){
            notLike("type",type);
        }
        return this;
     }


    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '%值'
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeLikeLeft(Integer type){
        if(type!=null){
            likeLeft("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '值%'
     * @param type       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeLikeRight(Integer type){
        if(type!=null){
            likeRight("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeIsNull(){
        isNull("type");
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeIsNotNull(){
        isNotNull("type");
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("type",value);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeIn(Integer... values){
        if(values!=null && values.length>0){
            in("type",values);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("type",value);
        }
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper typeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("type",values);
        }
        return this;
    }


    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 等于 = entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleEq(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            eq("opt_role",optRole);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 不等于 &lt;&gt; entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleNe(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            ne("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 大于 &gt; entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleGt(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            gt("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 大于等于 &gt;= entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleGe(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            ge("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 小于 &lt; entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleLt(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            lt("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 小于等于 &lt;= entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleLe(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            le("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * BETWEEN  entity().getOptRole() AND optRoleEnd
     * @param optRoleEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleBetween(Integer optRoleEnd){
        Integer optRole =entity().getOptRole();
        if(optRole!=null && optRoleEnd!=null){
            between("opt_role",optRole,optRoleEnd);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * NOT BETWEEN  entity().getOptRole() AND 值2
     * @param optRoleEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleNotBetween(Integer optRoleEnd){
        Integer optRole =entity().getOptRole();
        if(optRole!=null && optRoleEnd!=null){
            notBetween("opt_role",optRole,optRoleEnd);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * BETWEEN  entity().getOptRole() AND 值2
     * @param optRoleStart       值1
     * @param optRoleEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleBetween(Integer optRoleStart,Integer optRoleEnd){
        Integer optRole =entity().getOptRole();
        if(optRole!=null && optRoleEnd!=null){
            between("opt_role",optRoleStart,optRoleEnd);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * NOT BETWEEN  entity().getOptRole() AND 值2
     * @param optRoleStart       值1
     * @param optRoleEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleNotBetween(Integer optRoleStart,Integer optRoleEnd){
        Integer optRole =entity().getOptRole();
        if(optRole!=null && optRoleEnd!=null){
            notBetween("opt_role",optRoleStart,optRoleEnd);
        }
        return this;
     }


    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '%值%'  entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleLike(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            like("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * NOT LIKE '%值%'  entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleNotLike(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            notLike("opt_role",optRole);
        }
        return this;
     }


    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '%值'  entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleLikeLeft(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            likeLeft("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '值%'  entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleLikeRight(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            likeRight("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 等于 =
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleEq(Integer optRole){
        if(optRole!=null){
            eq("opt_role",optRole);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 不等于 &lt;&gt;
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleNe(Integer optRole){
        if(optRole!=null){
            ne("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 大于 &gt;
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleGt(Integer optRole){
        if(optRole!=null){
            gt("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 大于等于 &gt;=
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleGe(Integer optRole){
        if(optRole!=null){
            ge("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 小于 &lt;
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleLt(Integer optRole){
        if(optRole!=null){
            lt("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * 小于等于 &lt;=
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleLe(Integer optRole){
        if(optRole!=null){
            le("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '%值%'
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleLike(Integer optRole){
        if(optRole!=null){
            like("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * NOT LIKE '%值%'
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleNotLike(Integer optRole){
        if(optRole!=null){
            notLike("opt_role",optRole);
        }
        return this;
     }


    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '%值'
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleLikeLeft(Integer optRole){
        if(optRole!=null){
            likeLeft("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '值%'
     * @param optRole       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleLikeRight(Integer optRole){
        if(optRole!=null){
            likeRight("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleIsNull(){
        isNull("opt_role");
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleIsNotNull(){
        isNotNull("opt_role");
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("opt_role",value);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleIn(Integer... values){
        if(values!=null && values.length>0){
            in("opt_role",values);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("opt_role",value);
        }
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper optRoleNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("opt_role",values);
        }
        return this;
    }


    /**
     * <p>最后重启时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeEq(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * 不等于 &lt;&gt; entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后重启时间</p>
     * LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>最后重启时间</p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>最后重启时间</p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordQueryEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }



}
