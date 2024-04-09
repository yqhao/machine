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
public class EmSocDeviceExtendUpdateWrapper extends UpdateWrapper<EmSocDeviceExtend> {

    public static EmSocDeviceExtendUpdateWrapper wrapper() {
        return new EmSocDeviceExtendUpdateWrapper();
    }

    public EmSocDeviceExtendUpdateWrapper() {
        super();
    }

    public EmSocDeviceExtendUpdateWrapper(EmSocDeviceExtend entity) {
        super(entity);
    }

    /**
     * 
     */
    public EmSocDeviceExtendUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 物理设备id
     */
    public EmSocDeviceExtendUpdateWrapper setFkEmSocDevicesId(Long fkEmSocDevicesId) {
         set("fk_em_soc_devices_id",fkEmSocDevicesId);
        return this;
    }
    /**
     * 设备唯一码
     */
    public EmSocDeviceExtendUpdateWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 华为云机id
     */
    public EmSocDeviceExtendUpdateWrapper setPhoneId(String phoneId) {
         set("phone_id",phoneId);
        return this;
    }
    /**
     * 报警值
     */
    public EmSocDeviceExtendUpdateWrapper setAlarmValue(BigDecimal alarmValue) {
         set("alarm_value",alarmValue);
        return this;
    }
    /**
     * 挂机状态(0：未挂机，1：挂机中)
     */
    public EmSocDeviceExtendUpdateWrapper setHangUpStatus(Integer hangUpStatus) {
         set("hang_up_status",hangUpStatus);
        return this;
    }
    /**
     * 创建时间
     */
    public EmSocDeviceExtendUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 修改时间
     */
    public EmSocDeviceExtendUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 版本id
     */
    public EmSocDeviceExtendUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）
     */
    public EmSocDeviceExtendUpdateWrapper setRestartStatus(Integer restartStatus) {
         set("restart_status",restartStatus);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper idLikeRight(Long id){
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
    public EmSocDeviceExtendUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper idIn(Collection<Long> value){
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
    public EmSocDeviceExtendUpdateWrapper idIn(Long... values){
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
    public EmSocDeviceExtendUpdateWrapper idNotIn(Collection<Long> value){
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
    public EmSocDeviceExtendUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 等于 = fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdEq(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            eq("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 不等于 &lt;&gt; fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdNe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            ne("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 大于 &gt; fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdGt(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            gt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 大于等于 &gt;= fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdGe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            ge("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 小于 &lt; fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdLt(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            lt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 小于等于 &lt;= fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdLe(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
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
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        if(fkEmSocDevicesIdStart!=null && fkEmSocDevicesIdEnd!=null){
            notBetween("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }


    /**
     * <p>物理设备id</p>
     * LIKE '%值%' fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdLike(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            like("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * NOT LIKE '%值%' fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdNotLike(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            notLike("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }


    /**
     * <p>物理设备id</p>
     * LIKE '%值' fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdLikeLeft(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            likeLeft("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * LIKE '值%' fkEmSocDevicesId
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdLikeRight(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdIsNull(){
        isNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdIsNotNull(){
        isNotNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdIn(Collection<Long> value){
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
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdIn(Long... values){
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
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdNotIn(Collection<Long> value){
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
    public EmSocDeviceExtendUpdateWrapper fkEmSocDevicesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_em_soc_devices_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = deviceId
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper deviceIdEq(String deviceId){
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
    public EmSocDeviceExtendUpdateWrapper deviceIdNe(String deviceId){
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
    public EmSocDeviceExtendUpdateWrapper deviceIdGt(String deviceId){
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
    public EmSocDeviceExtendUpdateWrapper deviceIdGe(String deviceId){
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
    public EmSocDeviceExtendUpdateWrapper deviceIdLt(String deviceId){
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
    public EmSocDeviceExtendUpdateWrapper deviceIdLe(String deviceId){
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
    public EmSocDeviceExtendUpdateWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public EmSocDeviceExtendUpdateWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public EmSocDeviceExtendUpdateWrapper deviceIdLike(String deviceId){
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
    public EmSocDeviceExtendUpdateWrapper deviceIdNotLike(String deviceId){
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
    public EmSocDeviceExtendUpdateWrapper deviceIdLikeLeft(String deviceId){
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
    public EmSocDeviceExtendUpdateWrapper deviceIdLikeRight(String deviceId){
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
    public EmSocDeviceExtendUpdateWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper deviceIdIn(Collection<String> value){
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
    public EmSocDeviceExtendUpdateWrapper deviceIdIn(String... values){
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
    public EmSocDeviceExtendUpdateWrapper deviceIdNotIn(Collection<String> value){
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
    public EmSocDeviceExtendUpdateWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 等于 = phoneId
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper phoneIdEq(String phoneId){
        if(phoneId!=null){
            eq("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 不等于 &lt;&gt; phoneId
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper phoneIdNe(String phoneId){
        if(phoneId!=null){
            ne("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 大于 &gt; phoneId
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper phoneIdGt(String phoneId){
        if(phoneId!=null){
            gt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 大于等于 &gt;= phoneId
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper phoneIdGe(String phoneId){
        if(phoneId!=null){
            ge("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 小于 &lt; phoneId
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper phoneIdLt(String phoneId){
        if(phoneId!=null){
            lt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * 小于等于 &lt;= phoneId
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper phoneIdLe(String phoneId){
        if(phoneId!=null){
            le("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * BETWEEN 值1 AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper phoneIdBetween(String phoneIdStart,String phoneIdEnd){
        if(phoneIdStart!=null && phoneIdEnd!=null){
            between("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper phoneIdNotBetween(String phoneIdStart,String phoneIdEnd){
        if(phoneIdStart!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }


    /**
     * <p>华为云机id</p>
     * LIKE '%值%' phoneId
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper phoneIdLike(String phoneId){
        if(phoneId!=null){
            like("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * NOT LIKE '%值%' phoneId
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper phoneIdNotLike(String phoneId){
        if(phoneId!=null){
            notLike("phone_id",phoneId);
        }
        return this;
     }


    /**
     * <p>华为云机id</p>
     * LIKE '%值' phoneId
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper phoneIdLikeLeft(String phoneId){
        if(phoneId!=null){
            likeLeft("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * LIKE '值%' phoneId
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper phoneIdLikeRight(String phoneId){
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
    public EmSocDeviceExtendUpdateWrapper phoneIdIsNull(){
        isNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper phoneIdIsNotNull(){
        isNotNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper phoneIdIn(Collection<String> value){
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
    public EmSocDeviceExtendUpdateWrapper phoneIdIn(String... values){
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
    public EmSocDeviceExtendUpdateWrapper phoneIdNotIn(Collection<String> value){
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
    public EmSocDeviceExtendUpdateWrapper phoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_id",values);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * 等于 = alarmValue
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper alarmValueEq(BigDecimal alarmValue){
        if(alarmValue!=null){
            eq("alarm_value",alarmValue);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * 不等于 &lt;&gt; alarmValue
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper alarmValueNe(BigDecimal alarmValue){
        if(alarmValue!=null){
            ne("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * 大于 &gt; alarmValue
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper alarmValueGt(BigDecimal alarmValue){
        if(alarmValue!=null){
            gt("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * 大于等于 &gt;= alarmValue
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper alarmValueGe(BigDecimal alarmValue){
        if(alarmValue!=null){
            ge("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * 小于 &lt; alarmValue
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper alarmValueLt(BigDecimal alarmValue){
        if(alarmValue!=null){
            lt("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * 小于等于 &lt;= alarmValue
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper alarmValueLe(BigDecimal alarmValue){
        if(alarmValue!=null){
            le("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * BETWEEN 值1 AND 值2
     * @param alarmValueStart       值1
     * @param alarmValueEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper alarmValueBetween(BigDecimal alarmValueStart,BigDecimal alarmValueEnd){
        if(alarmValueStart!=null && alarmValueEnd!=null){
            between("alarm_value",alarmValueStart,alarmValueEnd);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * NOT BETWEEN 值1 AND 值2
     * @param alarmValueStart       值1
     * @param alarmValueEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper alarmValueNotBetween(BigDecimal alarmValueStart,BigDecimal alarmValueEnd){
        if(alarmValueStart!=null && alarmValueEnd!=null){
            notBetween("alarm_value",alarmValueStart,alarmValueEnd);
        }
        return this;
     }


    /**
     * <p>报警值</p>
     * LIKE '%值%' alarmValue
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper alarmValueLike(BigDecimal alarmValue){
        if(alarmValue!=null){
            like("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * NOT LIKE '%值%' alarmValue
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper alarmValueNotLike(BigDecimal alarmValue){
        if(alarmValue!=null){
            notLike("alarm_value",alarmValue);
        }
        return this;
     }


    /**
     * <p>报警值</p>
     * LIKE '%值' alarmValue
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper alarmValueLikeLeft(BigDecimal alarmValue){
        if(alarmValue!=null){
            likeLeft("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * LIKE '值%' alarmValue
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper alarmValueLikeRight(BigDecimal alarmValue){
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
    public EmSocDeviceExtendUpdateWrapper alarmValueIsNull(){
        isNull("alarm_value");
        return this;
    }

    /**
     * <p>报警值</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper alarmValueIsNotNull(){
        isNotNull("alarm_value");
        return this;
    }

    /**
     * <p>报警值</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper alarmValueIn(Collection<BigDecimal> value){
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
    public EmSocDeviceExtendUpdateWrapper alarmValueIn(BigDecimal... values){
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
    public EmSocDeviceExtendUpdateWrapper alarmValueNotIn(Collection<BigDecimal> value){
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
    public EmSocDeviceExtendUpdateWrapper alarmValueNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("alarm_value",values);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 等于 = hangUpStatus
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper hangUpStatusEq(Integer hangUpStatus){
        if(hangUpStatus!=null){
            eq("hang_up_status",hangUpStatus);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 不等于 &lt;&gt; hangUpStatus
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper hangUpStatusNe(Integer hangUpStatus){
        if(hangUpStatus!=null){
            ne("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 大于 &gt; hangUpStatus
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper hangUpStatusGt(Integer hangUpStatus){
        if(hangUpStatus!=null){
            gt("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 大于等于 &gt;= hangUpStatus
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper hangUpStatusGe(Integer hangUpStatus){
        if(hangUpStatus!=null){
            ge("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 小于 &lt; hangUpStatus
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper hangUpStatusLt(Integer hangUpStatus){
        if(hangUpStatus!=null){
            lt("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 小于等于 &lt;= hangUpStatus
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper hangUpStatusLe(Integer hangUpStatus){
        if(hangUpStatus!=null){
            le("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * BETWEEN 值1 AND 值2
     * @param hangUpStatusStart       值1
     * @param hangUpStatusEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper hangUpStatusBetween(Integer hangUpStatusStart,Integer hangUpStatusEnd){
        if(hangUpStatusStart!=null && hangUpStatusEnd!=null){
            between("hang_up_status",hangUpStatusStart,hangUpStatusEnd);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param hangUpStatusStart       值1
     * @param hangUpStatusEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper hangUpStatusNotBetween(Integer hangUpStatusStart,Integer hangUpStatusEnd){
        if(hangUpStatusStart!=null && hangUpStatusEnd!=null){
            notBetween("hang_up_status",hangUpStatusStart,hangUpStatusEnd);
        }
        return this;
     }


    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '%值%' hangUpStatus
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper hangUpStatusLike(Integer hangUpStatus){
        if(hangUpStatus!=null){
            like("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * NOT LIKE '%值%' hangUpStatus
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper hangUpStatusNotLike(Integer hangUpStatus){
        if(hangUpStatus!=null){
            notLike("hang_up_status",hangUpStatus);
        }
        return this;
     }


    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '%值' hangUpStatus
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper hangUpStatusLikeLeft(Integer hangUpStatus){
        if(hangUpStatus!=null){
            likeLeft("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '值%' hangUpStatus
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper hangUpStatusLikeRight(Integer hangUpStatus){
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
    public EmSocDeviceExtendUpdateWrapper hangUpStatusIsNull(){
        isNull("hang_up_status");
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper hangUpStatusIsNotNull(){
        isNotNull("hang_up_status");
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper hangUpStatusIn(Collection<Integer> value){
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
    public EmSocDeviceExtendUpdateWrapper hangUpStatusIn(Integer... values){
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
    public EmSocDeviceExtendUpdateWrapper hangUpStatusNotIn(Collection<Integer> value){
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
    public EmSocDeviceExtendUpdateWrapper hangUpStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("hang_up_status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 不等于 &lt;&gt; createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper createTimeLe(Date createTime){
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
    public EmSocDeviceExtendUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public EmSocDeviceExtendUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper createTimeLikeRight(Date createTime){
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
    public EmSocDeviceExtendUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper createTimeIn(Collection<Date> value){
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
    public EmSocDeviceExtendUpdateWrapper createTimeIn(Date... values){
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
    public EmSocDeviceExtendUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public EmSocDeviceExtendUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public EmSocDeviceExtendUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 等于 = versionId
     * @param versionId       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper versionIdEq(Long versionId){
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
    public EmSocDeviceExtendUpdateWrapper versionIdNe(Long versionId){
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
    public EmSocDeviceExtendUpdateWrapper versionIdGt(Long versionId){
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
    public EmSocDeviceExtendUpdateWrapper versionIdGe(Long versionId){
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
    public EmSocDeviceExtendUpdateWrapper versionIdLt(Long versionId){
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
    public EmSocDeviceExtendUpdateWrapper versionIdLe(Long versionId){
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
    public EmSocDeviceExtendUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public EmSocDeviceExtendUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public EmSocDeviceExtendUpdateWrapper versionIdLike(Long versionId){
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
    public EmSocDeviceExtendUpdateWrapper versionIdNotLike(Long versionId){
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
    public EmSocDeviceExtendUpdateWrapper versionIdLikeLeft(Long versionId){
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
    public EmSocDeviceExtendUpdateWrapper versionIdLikeRight(Long versionId){
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
    public EmSocDeviceExtendUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper versionIdIn(Collection<Long> value){
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
    public EmSocDeviceExtendUpdateWrapper versionIdIn(Long... values){
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
    public EmSocDeviceExtendUpdateWrapper versionIdNotIn(Collection<Long> value){
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
    public EmSocDeviceExtendUpdateWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 等于 = restartStatus
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper restartStatusEq(Integer restartStatus){
        if(restartStatus!=null){
            eq("restart_status",restartStatus);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 不等于 &lt;&gt; restartStatus
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper restartStatusNe(Integer restartStatus){
        if(restartStatus!=null){
            ne("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 大于 &gt; restartStatus
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper restartStatusGt(Integer restartStatus){
        if(restartStatus!=null){
            gt("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 大于等于 &gt;= restartStatus
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper restartStatusGe(Integer restartStatus){
        if(restartStatus!=null){
            ge("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 小于 &lt; restartStatus
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper restartStatusLt(Integer restartStatus){
        if(restartStatus!=null){
            lt("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 小于等于 &lt;= restartStatus
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper restartStatusLe(Integer restartStatus){
        if(restartStatus!=null){
            le("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * BETWEEN 值1 AND 值2
     * @param restartStatusStart       值1
     * @param restartStatusEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper restartStatusBetween(Integer restartStatusStart,Integer restartStatusEnd){
        if(restartStatusStart!=null && restartStatusEnd!=null){
            between("restart_status",restartStatusStart,restartStatusEnd);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param restartStatusStart       值1
     * @param restartStatusEnd      值2
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper restartStatusNotBetween(Integer restartStatusStart,Integer restartStatusEnd){
        if(restartStatusStart!=null && restartStatusEnd!=null){
            notBetween("restart_status",restartStatusStart,restartStatusEnd);
        }
        return this;
     }


    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * LIKE '%值%' restartStatus
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper restartStatusLike(Integer restartStatus){
        if(restartStatus!=null){
            like("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * NOT LIKE '%值%' restartStatus
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper restartStatusNotLike(Integer restartStatus){
        if(restartStatus!=null){
            notLike("restart_status",restartStatus);
        }
        return this;
     }


    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * LIKE '%值' restartStatus
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper restartStatusLikeLeft(Integer restartStatus){
        if(restartStatus!=null){
            likeLeft("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * LIKE '值%' restartStatus
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper restartStatusLikeRight(Integer restartStatus){
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
    public EmSocDeviceExtendUpdateWrapper restartStatusIsNull(){
        isNull("restart_status");
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper restartStatusIsNotNull(){
        isNotNull("restart_status");
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendUpdateWrapper restartStatusIn(Collection<Integer> value){
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
    public EmSocDeviceExtendUpdateWrapper restartStatusIn(Integer... values){
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
    public EmSocDeviceExtendUpdateWrapper restartStatusNotIn(Collection<Integer> value){
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
    public EmSocDeviceExtendUpdateWrapper restartStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("restart_status",values);
        }
        return this;
    }


}
