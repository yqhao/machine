package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.EmSocDeviceExtend;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 设备扩展信息表（em_soc_device_extend）
 * </p>
 * "em_soc_device_extend"
 * @author PC001
 */
public class EmSocDeviceExtendUpdateEntityWrapper extends UpdateWrapper<EmSocDeviceExtend> {

    public static EmSocDeviceExtendUpdateEntityWrapper wrapper(EmSocDeviceExtend entity) {
        return new EmSocDeviceExtendUpdateEntityWrapper(entity);
    }

    private EmSocDeviceExtend entity;

    public EmSocDeviceExtendUpdateEntityWrapper(EmSocDeviceExtend entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public EmSocDeviceExtendUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 物理设备id
     */
    public EmSocDeviceExtendUpdateEntityWrapper setFkEmSocDevicesId(Long fkEmSocDevicesId) {
         set("fk_em_soc_devices_id",fkEmSocDevicesId);
        return this;
    }
    /**
     * 设备唯一码
     */
    public EmSocDeviceExtendUpdateEntityWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 华为云机id
     */
    public EmSocDeviceExtendUpdateEntityWrapper setPhoneId(String phoneId) {
         set("phone_id",phoneId);
        return this;
    }
    /**
     * 报警值
     */
    public EmSocDeviceExtendUpdateEntityWrapper setAlarmValue(BigDecimal alarmValue) {
         set("alarm_value",alarmValue);
        return this;
    }
    /**
     * 挂机状态(0：未挂机，1：挂机中)
     */
    public EmSocDeviceExtendUpdateEntityWrapper setHangUpStatus(Integer hangUpStatus) {
         set("hang_up_status",hangUpStatus);
        return this;
    }
    /**
     * 创建时间
     */
    public EmSocDeviceExtendUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 修改时间
     */
    public EmSocDeviceExtendUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 版本id
     */
    public EmSocDeviceExtendUpdateEntityWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）
     */
    public EmSocDeviceExtendUpdateEntityWrapper setRestartStatus(Integer restartStatus) {
         set("restart_status",restartStatus);
        return this;
    }

    protected EmSocDeviceExtend entity() {
        if(entity==null){
            throw new NullPointerException("EmSocDeviceExtend is null");
        }
        return entity;
    }

    /**
     * 
     */
    public EmSocDeviceExtendUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 物理设备id
     */
    public EmSocDeviceExtendUpdateEntityWrapper setFkEmSocDevicesId() {
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            set("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }
    /**
     * 设备唯一码
     */
    public EmSocDeviceExtendUpdateEntityWrapper setDeviceId() {
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            set("device_id",deviceId);
        }
        return this;
    }
    /**
     * 华为云机id
     */
    public EmSocDeviceExtendUpdateEntityWrapper setPhoneId() {
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            set("phone_id",phoneId);
        }
        return this;
    }
    /**
     * 报警值
     */
    public EmSocDeviceExtendUpdateEntityWrapper setAlarmValue() {
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null){
            set("alarm_value",alarmValue);
        }
        return this;
    }
    /**
     * 挂机状态(0：未挂机，1：挂机中)
     */
    public EmSocDeviceExtendUpdateEntityWrapper setHangUpStatus() {
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            set("hang_up_status",hangUpStatus);
        }
        return this;
    }
    /**
     * 创建时间
     */
    public EmSocDeviceExtendUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * 修改时间
     */
    public EmSocDeviceExtendUpdateEntityWrapper setLastUpdateTime() {
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            set("last_update_time",lastUpdateTime);
        }
        return this;
    }
    /**
     * 版本id
     */
    public EmSocDeviceExtendUpdateEntityWrapper setVersionId() {
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            set("version_id",versionId);
        }
        return this;
    }
    /**
     * 重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）
     */
    public EmSocDeviceExtendUpdateEntityWrapper setRestartStatus() {
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            set("restart_status",restartStatus);
        }
        return this;
    }

    public EmSocDeviceExtendUpdateEntityWrapper Where() {
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper idEq(){
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
    public EmSocDeviceExtendUpdateEntityWrapper idNe(){
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
    public EmSocDeviceExtendUpdateEntityWrapper idGt(){
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
    public EmSocDeviceExtendUpdateEntityWrapper idGe(){
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
    public EmSocDeviceExtendUpdateEntityWrapper idLt(){
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
    public EmSocDeviceExtendUpdateEntityWrapper idLe(){
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
    public EmSocDeviceExtendUpdateEntityWrapper idBetween(Long idEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper idLike(){
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
    public EmSocDeviceExtendUpdateEntityWrapper idNotLike(){
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
    public EmSocDeviceExtendUpdateEntityWrapper idLikeLeft(){
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
    public EmSocDeviceExtendUpdateEntityWrapper idLikeRight(){
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
    public EmSocDeviceExtendUpdateEntityWrapper idEq(Long id){
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
    public EmSocDeviceExtendUpdateEntityWrapper idNe(Long id){
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
    public EmSocDeviceExtendUpdateEntityWrapper idGt(Long id){
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
    public EmSocDeviceExtendUpdateEntityWrapper idGe(Long id){
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
    public EmSocDeviceExtendUpdateEntityWrapper idLt(Long id){
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
    public EmSocDeviceExtendUpdateEntityWrapper idLe(Long id){
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
    public EmSocDeviceExtendUpdateEntityWrapper idLike(Long id){
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
    public EmSocDeviceExtendUpdateEntityWrapper idNotLike(Long id){
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
    public EmSocDeviceExtendUpdateEntityWrapper idLikeLeft(Long id){
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
    public EmSocDeviceExtendUpdateEntityWrapper idLikeRight(Long id){
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
    public EmSocDeviceExtendUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper idIn(Collection<Long> value){
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
    public EmSocDeviceExtendUpdateEntityWrapper idIn(Long... values){
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
    public EmSocDeviceExtendUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public EmSocDeviceExtendUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 等于 = entity().getFkEmSocDevicesId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdEq(){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdNe(){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdGt(){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdGe(){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdLt(){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdLe(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            le("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * BETWEEN  entity().getFkEmSocDevicesId() AND 值2
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null && fkEmSocDevicesIdEnd!=null){
            notBetween("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }


    /**
     * <p>物理设备id</p>
     * LIKE '%值%' entity().getFkEmSocDevicesId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdLike(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            like("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * NOT LIKE '%值%' entity().getFkEmSocDevicesId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdNotLike(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            notLike("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }


    /**
     * <p>物理设备id</p>
     * LIKE '%值' entity().getFkEmSocDevicesId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdLikeLeft(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            likeLeft("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * LIKE '值%' entity().getFkEmSocDevicesId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdLikeRight(){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdEq(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdNe(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdGt(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdGe(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdLt(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdLe(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdLike(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdNotLike(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdLikeLeft(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdLikeRight(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdIsNull(){
        isNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdIsNotNull(){
        isNotNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdIn(Collection<Long> value){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdIn(Long... values){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdNotIn(Collection<Long> value){
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
    public EmSocDeviceExtendUpdateEntityWrapper fkEmSocDevicesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_em_soc_devices_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdEq(){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdNe(){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdGt(){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdGe(){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdLt(){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值' entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%' entity().getDeviceId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdLikeRight(){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdEq(String deviceId){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdNe(String deviceId){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdGt(String deviceId){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdGe(String deviceId){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdLt(String deviceId){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdLe(String deviceId){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdLike(String deviceId){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdNotLike(String deviceId){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdLikeRight(String deviceId){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdIn(Collection<String> value){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdIn(String... values){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public EmSocDeviceExtendUpdateEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 等于 = entity().getPhoneId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdEq(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            eq("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 不等于 &lt;&gt; entity().getPhoneId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdNe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            ne("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 大于 &gt; entity().getPhoneId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdGt(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            gt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 大于等于 &gt;= entity().getPhoneId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdGe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            ge("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 小于 &lt; entity().getPhoneId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdLt(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            lt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 小于等于 &lt;= entity().getPhoneId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdLe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            le("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdBetween(String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            between("phone_id",phoneId,phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * NOT BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdNotBetween(String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneId,phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdBetween(String phoneIdStart,String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            between("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * NOT BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdNotBetween(String phoneIdStart,String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }


    /**
     * <p>华为云机id</p>
     * LIKE '%值%' entity().getPhoneId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdLike(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            like("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * NOT LIKE '%值%' entity().getPhoneId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdNotLike(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            notLike("phone_id",phoneId);
        }
        return this;
     }


    /**
     * <p>华为云机id</p>
     * LIKE '%值' entity().getPhoneId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdLikeLeft(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            likeLeft("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * LIKE '值%' entity().getPhoneId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdLikeRight(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            likeRight("phone_id",phoneId);
        }
        return this;
     }

/**
     * <p>华为云机id</p>
     * 等于 =
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdEq(String phoneId){
        if(phoneId!=null){
            eq("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 不等于 &lt;&gt;
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdNe(String phoneId){
        if(phoneId!=null){
            ne("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 大于 &gt;
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdGt(String phoneId){
        if(phoneId!=null){
            gt("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 大于等于 &gt;=
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdGe(String phoneId){
        if(phoneId!=null){
            ge("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 小于 &lt;
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdLt(String phoneId){
        if(phoneId!=null){
            lt("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 小于等于 &lt;=
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdLe(String phoneId){
        if(phoneId!=null){
            le("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * LIKE '%值%'
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdLike(String phoneId){
        if(phoneId!=null){
            like("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * NOT LIKE '%值%'
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdNotLike(String phoneId){
        if(phoneId!=null){
            notLike("phone_id",phoneId);
        }
        return this;
    }


    /**
     * <p>华为云机id</p>
     * LIKE '%值'
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdLikeLeft(String phoneId){
        if(phoneId!=null){
            likeLeft("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * LIKE '值%'
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdLikeRight(String phoneId){
        if(phoneId!=null){
            likeRight("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdIsNull(){
        isNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdIsNotNull(){
        isNotNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("phone_id",value);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdIn(String... values){
        if(values!=null && values.length>0){
            in("phone_id",values);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("phone_id",value);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper phoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_id",values);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * 等于 = entity().getAlarmValue()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueEq(){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null){
            eq("alarm_value",alarmValue);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * 不等于 &lt;&gt; entity().getAlarmValue()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueNe(){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null){
            ne("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * 大于 &gt; entity().getAlarmValue()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueGt(){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null){
            gt("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * 大于等于 &gt;= entity().getAlarmValue()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueGe(){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null){
            ge("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * 小于 &lt; entity().getAlarmValue()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueLt(){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null){
            lt("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * 小于等于 &lt;= entity().getAlarmValue()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueLe(){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null){
            le("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * BETWEEN  entity().getAlarmValue() AND 值2
     * @param alarmValueEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueBetween(BigDecimal alarmValueEnd){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null && alarmValueEnd!=null){
            between("alarm_value",alarmValue,alarmValueEnd);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * NOT BETWEEN  entity().getAlarmValue() AND 值2
     * @param alarmValueEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueNotBetween(BigDecimal alarmValueEnd){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null && alarmValueEnd!=null){
            notBetween("alarm_value",alarmValue,alarmValueEnd);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * BETWEEN  entity().getAlarmValue() AND 值2
     * @param alarmValueStart       值1
     * @param alarmValueEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueBetween(BigDecimal alarmValueStart,BigDecimal alarmValueEnd){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null && alarmValueEnd!=null){
            between("alarm_value",alarmValueStart,alarmValueEnd);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * NOT BETWEEN  entity().getAlarmValue() AND 值2
     * @param alarmValueStart       值1
     * @param alarmValueEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueNotBetween(BigDecimal alarmValueStart,BigDecimal alarmValueEnd){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null && alarmValueEnd!=null){
            notBetween("alarm_value",alarmValueStart,alarmValueEnd);
        }
        return this;
     }


    /**
     * <p>报警值</p>
     * LIKE '%值%' entity().getAlarmValue()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueLike(){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null){
            like("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * NOT LIKE '%值%' entity().getAlarmValue()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueNotLike(){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null){
            notLike("alarm_value",alarmValue);
        }
        return this;
     }


    /**
     * <p>报警值</p>
     * LIKE '%值' entity().getAlarmValue()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueLikeLeft(){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null){
            likeLeft("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * LIKE '值%' entity().getAlarmValue()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueLikeRight(){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null){
            likeRight("alarm_value",alarmValue);
        }
        return this;
     }

/**
     * <p>报警值</p>
     * 等于 =
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueEq(BigDecimal alarmValue){
        if(alarmValue!=null){
            eq("alarm_value",alarmValue);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * 不等于 &lt;&gt;
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueNe(BigDecimal alarmValue){
        if(alarmValue!=null){
            ne("alarm_value",alarmValue);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * 大于 &gt;
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueGt(BigDecimal alarmValue){
        if(alarmValue!=null){
            gt("alarm_value",alarmValue);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * 大于等于 &gt;=
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueGe(BigDecimal alarmValue){
        if(alarmValue!=null){
            ge("alarm_value",alarmValue);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * 小于 &lt;
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueLt(BigDecimal alarmValue){
        if(alarmValue!=null){
            lt("alarm_value",alarmValue);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * 小于等于 &lt;=
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueLe(BigDecimal alarmValue){
        if(alarmValue!=null){
            le("alarm_value",alarmValue);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * LIKE '%值%'
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueLike(BigDecimal alarmValue){
        if(alarmValue!=null){
            like("alarm_value",alarmValue);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * NOT LIKE '%值%'
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueNotLike(BigDecimal alarmValue){
        if(alarmValue!=null){
            notLike("alarm_value",alarmValue);
        }
        return this;
    }


    /**
     * <p>报警值</p>
     * LIKE '%值'
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueLikeLeft(BigDecimal alarmValue){
        if(alarmValue!=null){
            likeLeft("alarm_value",alarmValue);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * LIKE '值%'
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueLikeRight(BigDecimal alarmValue){
        if(alarmValue!=null){
            likeRight("alarm_value",alarmValue);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueIsNull(){
        isNull("alarm_value");
        return this;
    }

    /**
     * <p>报警值</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueIsNotNull(){
        isNotNull("alarm_value");
        return this;
    }

    /**
     * <p>报警值</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueIn(Collection<BigDecimal> value){
        if(value!=null && !value.isEmpty()){
            in("alarm_value",value);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueIn(BigDecimal... values){
        if(values!=null && values.length>0){
            in("alarm_value",values);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueNotIn(Collection<BigDecimal> value){
        if(value!=null && !value.isEmpty()){
            notIn("alarm_value",value);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper alarmValueNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("alarm_value",values);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 等于 = entity().getHangUpStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusEq(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            eq("hang_up_status",hangUpStatus);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 不等于 &lt;&gt; entity().getHangUpStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusNe(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            ne("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 大于 &gt; entity().getHangUpStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusGt(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            gt("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 大于等于 &gt;= entity().getHangUpStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusGe(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            ge("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 小于 &lt; entity().getHangUpStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusLt(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            lt("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 小于等于 &lt;= entity().getHangUpStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusLe(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            le("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * BETWEEN  entity().getHangUpStatus() AND 值2
     * @param hangUpStatusEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusBetween(Integer hangUpStatusEnd){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null && hangUpStatusEnd!=null){
            between("hang_up_status",hangUpStatus,hangUpStatusEnd);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * NOT BETWEEN  entity().getHangUpStatus() AND 值2
     * @param hangUpStatusEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusNotBetween(Integer hangUpStatusEnd){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null && hangUpStatusEnd!=null){
            notBetween("hang_up_status",hangUpStatus,hangUpStatusEnd);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * BETWEEN  entity().getHangUpStatus() AND 值2
     * @param hangUpStatusStart       值1
     * @param hangUpStatusEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusBetween(Integer hangUpStatusStart,Integer hangUpStatusEnd){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null && hangUpStatusEnd!=null){
            between("hang_up_status",hangUpStatusStart,hangUpStatusEnd);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * NOT BETWEEN  entity().getHangUpStatus() AND 值2
     * @param hangUpStatusStart       值1
     * @param hangUpStatusEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusNotBetween(Integer hangUpStatusStart,Integer hangUpStatusEnd){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null && hangUpStatusEnd!=null){
            notBetween("hang_up_status",hangUpStatusStart,hangUpStatusEnd);
        }
        return this;
     }


    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '%值%' entity().getHangUpStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusLike(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            like("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * NOT LIKE '%值%' entity().getHangUpStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusNotLike(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            notLike("hang_up_status",hangUpStatus);
        }
        return this;
     }


    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '%值' entity().getHangUpStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusLikeLeft(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            likeLeft("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '值%' entity().getHangUpStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusLikeRight(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            likeRight("hang_up_status",hangUpStatus);
        }
        return this;
     }

/**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 等于 =
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusEq(Integer hangUpStatus){
        if(hangUpStatus!=null){
            eq("hang_up_status",hangUpStatus);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 不等于 &lt;&gt;
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusNe(Integer hangUpStatus){
        if(hangUpStatus!=null){
            ne("hang_up_status",hangUpStatus);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 大于 &gt;
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusGt(Integer hangUpStatus){
        if(hangUpStatus!=null){
            gt("hang_up_status",hangUpStatus);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 大于等于 &gt;=
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusGe(Integer hangUpStatus){
        if(hangUpStatus!=null){
            ge("hang_up_status",hangUpStatus);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 小于 &lt;
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusLt(Integer hangUpStatus){
        if(hangUpStatus!=null){
            lt("hang_up_status",hangUpStatus);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 小于等于 &lt;=
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusLe(Integer hangUpStatus){
        if(hangUpStatus!=null){
            le("hang_up_status",hangUpStatus);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '%值%'
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusLike(Integer hangUpStatus){
        if(hangUpStatus!=null){
            like("hang_up_status",hangUpStatus);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * NOT LIKE '%值%'
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusNotLike(Integer hangUpStatus){
        if(hangUpStatus!=null){
            notLike("hang_up_status",hangUpStatus);
        }
        return this;
    }


    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '%值'
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusLikeLeft(Integer hangUpStatus){
        if(hangUpStatus!=null){
            likeLeft("hang_up_status",hangUpStatus);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '值%'
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusLikeRight(Integer hangUpStatus){
        if(hangUpStatus!=null){
            likeRight("hang_up_status",hangUpStatus);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusIsNull(){
        isNull("hang_up_status");
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusIsNotNull(){
        isNotNull("hang_up_status");
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("hang_up_status",value);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("hang_up_status",values);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("hang_up_status",value);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper hangUpStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("hang_up_status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper createTimeEq(){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeNe(){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeGt(){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeGe(){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeLt(){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper createTimeLikeRight(){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeEq(Date createTime){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeNe(Date createTime){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeGt(Date createTime){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeGe(Date createTime){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeLt(Date createTime){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeLe(Date createTime){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeLike(Date createTime){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeIn(Date... values){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public EmSocDeviceExtendUpdateEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeEq(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 不等于 &lt;&gt; entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值' entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%' entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

/**
     * <p>修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 不等于 &lt;&gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 大于 &gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 大于等于 &gt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 小于 &lt;
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 小于等于 &lt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
    }


    /**
     * <p>修改时间</p>
     * LIKE '%值'
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * LIKE '值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper versionIdEq(){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdNe(){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdGt(){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdGe(){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdLt(){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper versionIdBetween(Long versionIdEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdNotBetween(Long versionIdEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值' entity().getVersionId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * LIKE '值%' entity().getVersionId()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper versionIdLikeRight(){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdEq(Long versionId){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdNe(Long versionId){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdGt(Long versionId){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdGe(Long versionId){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdLt(Long versionId){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdLe(Long versionId){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdLike(Long versionId){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdNotLike(Long versionId){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdLikeLeft(Long versionId){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdLikeRight(Long versionId){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper versionIdIn(Collection<Long> value){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdIn(Long... values){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public EmSocDeviceExtendUpdateEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 等于 = entity().getRestartStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusEq(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            eq("restart_status",restartStatus);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 不等于 &lt;&gt; entity().getRestartStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusNe(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            ne("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 大于 &gt; entity().getRestartStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusGt(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            gt("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 大于等于 &gt;= entity().getRestartStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusGe(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            ge("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 小于 &lt; entity().getRestartStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusLt(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            lt("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 小于等于 &lt;= entity().getRestartStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusLe(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            le("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * BETWEEN  entity().getRestartStatus() AND 值2
     * @param restartStatusEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusBetween(Integer restartStatusEnd){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null && restartStatusEnd!=null){
            between("restart_status",restartStatus,restartStatusEnd);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * NOT BETWEEN  entity().getRestartStatus() AND 值2
     * @param restartStatusEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusNotBetween(Integer restartStatusEnd){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null && restartStatusEnd!=null){
            notBetween("restart_status",restartStatus,restartStatusEnd);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * BETWEEN  entity().getRestartStatus() AND 值2
     * @param restartStatusStart       值1
     * @param restartStatusEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusBetween(Integer restartStatusStart,Integer restartStatusEnd){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null && restartStatusEnd!=null){
            between("restart_status",restartStatusStart,restartStatusEnd);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * NOT BETWEEN  entity().getRestartStatus() AND 值2
     * @param restartStatusStart       值1
     * @param restartStatusEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusNotBetween(Integer restartStatusStart,Integer restartStatusEnd){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null && restartStatusEnd!=null){
            notBetween("restart_status",restartStatusStart,restartStatusEnd);
        }
        return this;
     }


    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * LIKE '%值%' entity().getRestartStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusLike(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            like("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * NOT LIKE '%值%' entity().getRestartStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusNotLike(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            notLike("restart_status",restartStatus);
        }
        return this;
     }


    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * LIKE '%值' entity().getRestartStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusLikeLeft(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            likeLeft("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * LIKE '值%' entity().getRestartStatus()
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusLikeRight(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            likeRight("restart_status",restartStatus);
        }
        return this;
     }

/**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 等于 =
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusEq(Integer restartStatus){
        if(restartStatus!=null){
            eq("restart_status",restartStatus);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 不等于 &lt;&gt;
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusNe(Integer restartStatus){
        if(restartStatus!=null){
            ne("restart_status",restartStatus);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 大于 &gt;
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusGt(Integer restartStatus){
        if(restartStatus!=null){
            gt("restart_status",restartStatus);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 大于等于 &gt;=
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusGe(Integer restartStatus){
        if(restartStatus!=null){
            ge("restart_status",restartStatus);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 小于 &lt;
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusLt(Integer restartStatus){
        if(restartStatus!=null){
            lt("restart_status",restartStatus);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 小于等于 &lt;=
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusLe(Integer restartStatus){
        if(restartStatus!=null){
            le("restart_status",restartStatus);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * LIKE '%值%'
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusLike(Integer restartStatus){
        if(restartStatus!=null){
            like("restart_status",restartStatus);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * NOT LIKE '%值%'
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusNotLike(Integer restartStatus){
        if(restartStatus!=null){
            notLike("restart_status",restartStatus);
        }
        return this;
    }


    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * LIKE '%值'
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusLikeLeft(Integer restartStatus){
        if(restartStatus!=null){
            likeLeft("restart_status",restartStatus);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * LIKE '值%'
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusLikeRight(Integer restartStatus){
        if(restartStatus!=null){
            likeRight("restart_status",restartStatus);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * IS NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusIsNull(){
        isNull("restart_status");
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusIsNotNull(){
        isNotNull("restart_status");
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("restart_status",value);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("restart_status",values);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("restart_status",value);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateEntityWrapper restartStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("restart_status",values);
        }
        return this;
    }


}
