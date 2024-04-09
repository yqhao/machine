package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.EmSocDeviceExtend;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 设备扩展信息表（em_soc_device_extend）
 * </p>
 * "em_soc_device_extend"
 * @author PC001
 */
public class EmSocDeviceExtendQueryWrapper extends QueryWrapper<EmSocDeviceExtend> {


    public static EmSocDeviceExtendQueryWrapper wrapper() {
        return new EmSocDeviceExtendQueryWrapper();
    }

    public EmSocDeviceExtendQueryWrapper() {
        super();
    }

    public EmSocDeviceExtendQueryWrapper(EmSocDeviceExtend entity) {
        super(entity);
    }

    public EmSocDeviceExtendQueryWrapper(EmSocDeviceExtend entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public EmSocDeviceExtendQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public EmSocDeviceExtendQueryWrapper selectColumns(Consumer<EmSocDeviceExtendSelect> consumer) {
        EmSocDeviceExtendSelect select = new EmSocDeviceExtendSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }


    /**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper idEq(Long id){
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
    public EmSocDeviceExtendQueryWrapper idNe(Long id){
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
    public EmSocDeviceExtendQueryWrapper idGt(Long id){
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
    public EmSocDeviceExtendQueryWrapper idGe(Long id){
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
    public EmSocDeviceExtendQueryWrapper idLt(Long id){
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
    public EmSocDeviceExtendQueryWrapper idLe(Long id){
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
    public EmSocDeviceExtendQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public EmSocDeviceExtendQueryWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper idLike(Long id){
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
    public EmSocDeviceExtendQueryWrapper idNotLike(Long id){
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
    public EmSocDeviceExtendQueryWrapper idLikeLeft(Long id){
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
    public EmSocDeviceExtendQueryWrapper idLikeRight(Long id){
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
    public EmSocDeviceExtendQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper idIn(Collection<Long> value){
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
    public EmSocDeviceExtendQueryWrapper idIn(Long... values){
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
    public EmSocDeviceExtendQueryWrapper idNotIn(Collection<Long> value){
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
    public EmSocDeviceExtendQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 等于 =
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdEq(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdNe(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdGt(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdGe(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdLt(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdLe(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
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
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
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
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdLike(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdNotLike(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdLikeLeft(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdLikeRight(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdIsNull(){
        isNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdIsNotNull(){
        isNotNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdIn(Collection<Long> value){
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
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdIn(Long... values){
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
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdNotIn(Collection<Long> value){
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
    public EmSocDeviceExtendQueryWrapper fkEmSocDevicesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_em_soc_devices_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper deviceIdEq(String deviceId){
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
    public EmSocDeviceExtendQueryWrapper deviceIdNe(String deviceId){
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
    public EmSocDeviceExtendQueryWrapper deviceIdGt(String deviceId){
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
    public EmSocDeviceExtendQueryWrapper deviceIdGe(String deviceId){
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
    public EmSocDeviceExtendQueryWrapper deviceIdLt(String deviceId){
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
    public EmSocDeviceExtendQueryWrapper deviceIdLe(String deviceId){
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
    public EmSocDeviceExtendQueryWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public EmSocDeviceExtendQueryWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public EmSocDeviceExtendQueryWrapper deviceIdLike(String deviceId){
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
    public EmSocDeviceExtendQueryWrapper deviceIdNotLike(String deviceId){
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
    public EmSocDeviceExtendQueryWrapper deviceIdLikeLeft(String deviceId){
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
    public EmSocDeviceExtendQueryWrapper deviceIdLikeRight(String deviceId){
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
    public EmSocDeviceExtendQueryWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper deviceIdIn(Collection<String> value){
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
    public EmSocDeviceExtendQueryWrapper deviceIdIn(String... values){
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
    public EmSocDeviceExtendQueryWrapper deviceIdNotIn(Collection<String> value){
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
    public EmSocDeviceExtendQueryWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 等于 =
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper phoneIdEq(String phoneId){
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
    public EmSocDeviceExtendQueryWrapper phoneIdNe(String phoneId){
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
    public EmSocDeviceExtendQueryWrapper phoneIdGt(String phoneId){
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
    public EmSocDeviceExtendQueryWrapper phoneIdGe(String phoneId){
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
    public EmSocDeviceExtendQueryWrapper phoneIdLt(String phoneId){
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
    public EmSocDeviceExtendQueryWrapper phoneIdLe(String phoneId){
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
    public EmSocDeviceExtendQueryWrapper phoneIdBetween(String phoneIdStart,String phoneIdEnd){
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
    public EmSocDeviceExtendQueryWrapper phoneIdNotBetween(String phoneIdStart,String phoneIdEnd){
        if(phoneIdStart!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }


    /**
     * <p>华为云机id</p>
     * LIKE '%值%'
     * @param phoneId       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper phoneIdLike(String phoneId){
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
    public EmSocDeviceExtendQueryWrapper phoneIdNotLike(String phoneId){
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
    public EmSocDeviceExtendQueryWrapper phoneIdLikeLeft(String phoneId){
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
    public EmSocDeviceExtendQueryWrapper phoneIdLikeRight(String phoneId){
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
    public EmSocDeviceExtendQueryWrapper phoneIdIsNull(){
        isNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper phoneIdIsNotNull(){
        isNotNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper phoneIdIn(Collection<String> value){
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
    public EmSocDeviceExtendQueryWrapper phoneIdIn(String... values){
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
    public EmSocDeviceExtendQueryWrapper phoneIdNotIn(Collection<String> value){
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
    public EmSocDeviceExtendQueryWrapper phoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_id",values);
        }
        return this;
    }

    /**
     * <p>报警值</p>
     * 等于 =
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper alarmValueEq(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryWrapper alarmValueNe(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryWrapper alarmValueGt(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryWrapper alarmValueGe(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryWrapper alarmValueLt(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryWrapper alarmValueLe(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryWrapper alarmValueBetween(BigDecimal alarmValueStart,BigDecimal alarmValueEnd){
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
    public EmSocDeviceExtendQueryWrapper alarmValueNotBetween(BigDecimal alarmValueStart,BigDecimal alarmValueEnd){
        if(alarmValueStart!=null && alarmValueEnd!=null){
            notBetween("alarm_value",alarmValueStart,alarmValueEnd);
        }
        return this;
     }


    /**
     * <p>报警值</p>
     * LIKE '%值%'
     * @param alarmValue       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper alarmValueLike(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryWrapper alarmValueNotLike(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryWrapper alarmValueLikeLeft(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryWrapper alarmValueLikeRight(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryWrapper alarmValueIsNull(){
        isNull("alarm_value");
        return this;
    }

    /**
     * <p>报警值</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper alarmValueIsNotNull(){
        isNotNull("alarm_value");
        return this;
    }

    /**
     * <p>报警值</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper alarmValueIn(Collection<BigDecimal> value){
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
    public EmSocDeviceExtendQueryWrapper alarmValueIn(BigDecimal... values){
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
    public EmSocDeviceExtendQueryWrapper alarmValueNotIn(Collection<BigDecimal> value){
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
    public EmSocDeviceExtendQueryWrapper alarmValueNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("alarm_value",values);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 等于 =
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper hangUpStatusEq(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryWrapper hangUpStatusNe(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryWrapper hangUpStatusGt(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryWrapper hangUpStatusGe(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryWrapper hangUpStatusLt(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryWrapper hangUpStatusLe(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryWrapper hangUpStatusBetween(Integer hangUpStatusStart,Integer hangUpStatusEnd){
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
    public EmSocDeviceExtendQueryWrapper hangUpStatusNotBetween(Integer hangUpStatusStart,Integer hangUpStatusEnd){
        if(hangUpStatusStart!=null && hangUpStatusEnd!=null){
            notBetween("hang_up_status",hangUpStatusStart,hangUpStatusEnd);
        }
        return this;
     }


    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '%值%'
     * @param hangUpStatus       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper hangUpStatusLike(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryWrapper hangUpStatusNotLike(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryWrapper hangUpStatusLikeLeft(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryWrapper hangUpStatusLikeRight(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryWrapper hangUpStatusIsNull(){
        isNull("hang_up_status");
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper hangUpStatusIsNotNull(){
        isNotNull("hang_up_status");
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper hangUpStatusIn(Collection<Integer> value){
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
    public EmSocDeviceExtendQueryWrapper hangUpStatusIn(Integer... values){
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
    public EmSocDeviceExtendQueryWrapper hangUpStatusNotIn(Collection<Integer> value){
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
    public EmSocDeviceExtendQueryWrapper hangUpStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("hang_up_status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper createTimeEq(Date createTime){
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
    public EmSocDeviceExtendQueryWrapper createTimeNe(Date createTime){
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
    public EmSocDeviceExtendQueryWrapper createTimeGt(Date createTime){
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
    public EmSocDeviceExtendQueryWrapper createTimeGe(Date createTime){
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
    public EmSocDeviceExtendQueryWrapper createTimeLt(Date createTime){
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
    public EmSocDeviceExtendQueryWrapper createTimeLe(Date createTime){
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
    public EmSocDeviceExtendQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public EmSocDeviceExtendQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public EmSocDeviceExtendQueryWrapper createTimeLike(Date createTime){
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
    public EmSocDeviceExtendQueryWrapper createTimeNotLike(Date createTime){
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
    public EmSocDeviceExtendQueryWrapper createTimeLikeLeft(Date createTime){
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
    public EmSocDeviceExtendQueryWrapper createTimeLikeRight(Date createTime){
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
    public EmSocDeviceExtendQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper createTimeIn(Collection<Date> value){
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
    public EmSocDeviceExtendQueryWrapper createTimeIn(Date... values){
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
    public EmSocDeviceExtendQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public EmSocDeviceExtendQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeIn(Date... values){
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
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public EmSocDeviceExtendQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper versionIdEq(Long versionId){
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
    public EmSocDeviceExtendQueryWrapper versionIdNe(Long versionId){
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
    public EmSocDeviceExtendQueryWrapper versionIdGt(Long versionId){
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
    public EmSocDeviceExtendQueryWrapper versionIdGe(Long versionId){
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
    public EmSocDeviceExtendQueryWrapper versionIdLt(Long versionId){
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
    public EmSocDeviceExtendQueryWrapper versionIdLe(Long versionId){
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
    public EmSocDeviceExtendQueryWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public EmSocDeviceExtendQueryWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public EmSocDeviceExtendQueryWrapper versionIdLike(Long versionId){
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
    public EmSocDeviceExtendQueryWrapper versionIdNotLike(Long versionId){
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
    public EmSocDeviceExtendQueryWrapper versionIdLikeLeft(Long versionId){
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
    public EmSocDeviceExtendQueryWrapper versionIdLikeRight(Long versionId){
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
    public EmSocDeviceExtendQueryWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper versionIdIn(Collection<Long> value){
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
    public EmSocDeviceExtendQueryWrapper versionIdIn(Long... values){
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
    public EmSocDeviceExtendQueryWrapper versionIdNotIn(Collection<Long> value){
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
    public EmSocDeviceExtendQueryWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * 等于 =
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper restartStatusEq(Integer restartStatus){
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
    public EmSocDeviceExtendQueryWrapper restartStatusNe(Integer restartStatus){
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
    public EmSocDeviceExtendQueryWrapper restartStatusGt(Integer restartStatus){
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
    public EmSocDeviceExtendQueryWrapper restartStatusGe(Integer restartStatus){
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
    public EmSocDeviceExtendQueryWrapper restartStatusLt(Integer restartStatus){
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
    public EmSocDeviceExtendQueryWrapper restartStatusLe(Integer restartStatus){
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
    public EmSocDeviceExtendQueryWrapper restartStatusBetween(Integer restartStatusStart,Integer restartStatusEnd){
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
    public EmSocDeviceExtendQueryWrapper restartStatusNotBetween(Integer restartStatusStart,Integer restartStatusEnd){
        if(restartStatusStart!=null && restartStatusEnd!=null){
            notBetween("restart_status",restartStatusStart,restartStatusEnd);
        }
        return this;
     }


    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * LIKE '%值%'
     * @param restartStatus       值
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper restartStatusLike(Integer restartStatus){
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
    public EmSocDeviceExtendQueryWrapper restartStatusNotLike(Integer restartStatus){
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
    public EmSocDeviceExtendQueryWrapper restartStatusLikeLeft(Integer restartStatus){
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
    public EmSocDeviceExtendQueryWrapper restartStatusLikeRight(Integer restartStatus){
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
    public EmSocDeviceExtendQueryWrapper restartStatusIsNull(){
        isNull("restart_status");
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper restartStatusIsNotNull(){
        isNotNull("restart_status");
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryWrapper restartStatusIn(Collection<Integer> value){
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
    public EmSocDeviceExtendQueryWrapper restartStatusIn(Integer... values){
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
    public EmSocDeviceExtendQueryWrapper restartStatusNotIn(Collection<Integer> value){
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
    public EmSocDeviceExtendQueryWrapper restartStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("restart_status",values);
        }
        return this;
    }


}
