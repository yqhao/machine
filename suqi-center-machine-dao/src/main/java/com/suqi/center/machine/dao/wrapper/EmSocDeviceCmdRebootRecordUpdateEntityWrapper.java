package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.suqi.center.machine.dao.entity.EmSocDeviceCmdRebootRecord;

import java.util.Collection;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 * "em_soc_device_cmd_reboot_record"
 * @author Administrator
 */
public class EmSocDeviceCmdRebootRecordUpdateEntityWrapper extends UpdateWrapper<EmSocDeviceCmdRebootRecord> {

    public static EmSocDeviceCmdRebootRecordUpdateEntityWrapper wrapper(EmSocDeviceCmdRebootRecord entity) {
        return new EmSocDeviceCmdRebootRecordUpdateEntityWrapper(entity);
    }

    private EmSocDeviceCmdRebootRecord entity;

    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper(EmSocDeviceCmdRebootRecord entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 云机归属商户
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper setFkMemberId(Long fkMemberId) {
         set("fk_member_id",fkMemberId);
        return this;
    }
    /**
     * 设备id
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper setType(Integer type) {
         set("type",type);
        return this;
    }
    /**
     * 操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper setOptRole(Integer optRole) {
         set("opt_role",optRole);
        return this;
    }
    /**
     * 最后重启时间
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }

    protected EmSocDeviceCmdRebootRecord entity() {
        if(entity==null){
            throw new NullPointerException("EmSocDeviceCmdRebootRecord is null");
        }
        return entity;
    }

    /**
     * 
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 云机归属商户
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper setFkMemberId() {
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            set("fk_member_id",fkMemberId);
        }
        return this;
    }
    /**
     * 设备id
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper setDeviceId() {
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            set("device_id",deviceId);
        }
        return this;
    }
    /**
     * 1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper setType() {
        Integer type =entity().getType();
        if(type!=null){
            set("type",type);
        }
        return this;
    }
    /**
     * 操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper setOptRole() {
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            set("opt_role",optRole);
        }
        return this;
    }
    /**
     * 最后重启时间
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idEq(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idNe(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idGt(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idGe(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idLt(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idBetween(Long idEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idLikeRight(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idEq(Long id){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idNe(Long id){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idGt(Long id){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idGe(Long id){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idLt(Long id){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idLe(Long id){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idLike(Long id){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idNotLike(Long id){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idLikeLeft(Long id){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idLikeRight(Long id){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idIn(Collection<Long> value){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idIn(Long... values){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper idNotIn(Long... values){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdEq(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdNe(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdGt(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdGe(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdLt(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdLe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdBetween(Long fkMemberIdEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdNotBetween(Long fkMemberIdEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>云机归属商户</p>
     * LIKE '%值%' entity().getFkMemberId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * NOT LIKE '%值%' entity().getFkMemberId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdNotLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>云机归属商户</p>
     * LIKE '%值' entity().getFkMemberId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdLikeLeft(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>云机归属商户</p>
     * LIKE '值%' entity().getFkMemberId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdLikeRight(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdEq(Long fkMemberId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdNe(Long fkMemberId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdGt(Long fkMemberId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdGe(Long fkMemberId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdLt(Long fkMemberId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdLe(Long fkMemberId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdLike(Long fkMemberId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdNotLike(Long fkMemberId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdLikeLeft(Long fkMemberId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>云机归属商户</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdIn(Collection<Long> value){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdIn(Long... values){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper fkMemberIdNotIn(Long... values){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdEq(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdNe(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdGt(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdGe(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdLt(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备id</p>
     * LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * NOT LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备id</p>
     * LIKE '%值' entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * LIKE '值%' entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdLikeRight(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdEq(String deviceId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdNe(String deviceId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdGt(String deviceId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdGe(String deviceId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdLt(String deviceId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdLe(String deviceId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdLike(String deviceId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdNotLike(String deviceId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdLikeRight(String deviceId){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdIn(Collection<String> value){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdIn(String... values){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper deviceIdNotIn(String... values){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeEq(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeNe(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeGt(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeGe(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeLt(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeLe(){
        Integer type =entity().getType();
        if(type!=null){
            le("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * BETWEEN  entity().getType() AND 值2
     * @param typeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeBetween(Integer typeEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeNotBetween(Integer typeEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeBetween(Integer typeStart,Integer typeEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeNotBetween(Integer typeStart,Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            notBetween("type",typeStart,typeEnd);
        }
        return this;
     }


    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '%值%' entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeLike(){
        Integer type =entity().getType();
        if(type!=null){
            like("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * NOT LIKE '%值%' entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeNotLike(){
        Integer type =entity().getType();
        if(type!=null){
            notLike("type",type);
        }
        return this;
     }


    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '%值' entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeLikeLeft(){
        Integer type =entity().getType();
        if(type!=null){
            likeLeft("type",type);
        }
        return this;
     }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * LIKE '值%' entity().getType()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeLikeRight(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeEq(Integer type){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeNe(Integer type){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeGt(Integer type){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeGe(Integer type){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeLt(Integer type){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeLe(Integer type){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeLike(Integer type){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeNotLike(Integer type){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeLikeLeft(Integer type){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeLikeRight(Integer type){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeIsNull(){
        isNull("type");
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeIsNotNull(){
        isNotNull("type");
        return this;
    }

    /**
     * <p>1：云机自己主动重启，2：云机自己http切换维护模式重启，3：运维后台OTA重启，4：运维后台服务商重启，5：运维后台OTA升级重启，6：接口批量OTA重启,7:接口分组批量OTA重启，8：根据userPhoneId重启设备，9：挂机端侧SDK重启云机，10：商户平台服务商重启，11：SdkApi端侧SDK重启云机，12：重置回调一键新机OTA重启，13：重置回调OTA重启,14：161上报重启，15：设备进入维护模式成功后OTA重启，16：重启后回调，17：空闲定时服务商重启，18：设备离线自动重启，19：分组重启和OTA二次重启，20：定时重启云机</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeIn(Collection<Integer> value){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeIn(Integer... values){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeNotIn(Collection<Integer> value){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper typeNotIn(Integer... values){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleEq(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleNe(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleGt(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleGe(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleLt(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleLe(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            le("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * BETWEEN  entity().getOptRole() AND 值2
     * @param optRoleEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleBetween(Integer optRoleEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleNotBetween(Integer optRoleEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleBetween(Integer optRoleStart,Integer optRoleEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleNotBetween(Integer optRoleStart,Integer optRoleEnd){
        Integer optRole =entity().getOptRole();
        if(optRole!=null && optRoleEnd!=null){
            notBetween("opt_role",optRoleStart,optRoleEnd);
        }
        return this;
     }


    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '%值%' entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleLike(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            like("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * NOT LIKE '%值%' entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleNotLike(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            notLike("opt_role",optRole);
        }
        return this;
     }


    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '%值' entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleLikeLeft(){
        Integer optRole =entity().getOptRole();
        if(optRole!=null){
            likeLeft("opt_role",optRole);
        }
        return this;
     }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * LIKE '值%' entity().getOptRole()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleLikeRight(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleEq(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleNe(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleGt(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleGe(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleLt(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleLe(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleLike(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleNotLike(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleLikeLeft(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleLikeRight(Integer optRole){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleIsNull(){
        isNull("opt_role");
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleIsNotNull(){
        isNotNull("opt_role");
        return this;
    }

    /**
     * <p>操作角色（1：系统，2：用户，3：商户，4：云机，5：运维）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleIn(Collection<Integer> value){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleIn(Integer... values){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleNotIn(Collection<Integer> value){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper optRoleNotIn(Integer... values){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeEq(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeNe(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeGt(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeGe(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeLt(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后重启时间</p>
     * LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>最后重启时间</p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>最后重启时间</p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeLikeRight(){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeEq(Date createTime){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeNe(Date createTime){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeGt(Date createTime){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeGe(Date createTime){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeLt(Date createTime){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeLe(Date createTime){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeLike(Date createTime){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>最后重启时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeIn(Date... values){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public EmSocDeviceCmdRebootRecordUpdateEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


}
