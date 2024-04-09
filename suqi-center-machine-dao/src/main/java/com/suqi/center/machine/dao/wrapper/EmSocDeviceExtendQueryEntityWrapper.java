package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.entity.EmSocDeviceExtend;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 设备扩展信息表（em_soc_device_extend）
 * </p>
 * "em_soc_device_extend"
 * @author PC001
 */
public class EmSocDeviceExtendQueryEntityWrapper extends QueryWrapper<EmSocDeviceExtend> {

    public static EmSocDeviceExtendQueryEntityWrapper wrapper(EmSocDeviceExtend entity) {
        return new EmSocDeviceExtendQueryEntityWrapper(entity);
    }

    private EmSocDeviceExtend entity;

    public EmSocDeviceExtendQueryEntityWrapper(EmSocDeviceExtend entity) {
         this.entity=entity;
    }


    protected EmSocDeviceExtend entity() {
        if(entity==null){
            throw new NullPointerException("EmSocDeviceExtend is null");
        }
        return entity;
    }

    @Override
    public EmSocDeviceExtendQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public EmSocDeviceExtendQueryEntityWrapper selectColumns(Consumer<EmSocDeviceExtendSelect> consumer) {
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
     * 等于 = entity().getId()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper idEq(){
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
    public EmSocDeviceExtendQueryEntityWrapper idNe(){
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
    public EmSocDeviceExtendQueryEntityWrapper idGt(){
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
    public EmSocDeviceExtendQueryEntityWrapper idGe(){
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
    public EmSocDeviceExtendQueryEntityWrapper idLt(){
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
    public EmSocDeviceExtendQueryEntityWrapper idLe(){
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
    public EmSocDeviceExtendQueryEntityWrapper idBetween(Long idEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper idNotBetween(Long idEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper idLike(){
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
    public EmSocDeviceExtendQueryEntityWrapper idNotLike(){
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
    public EmSocDeviceExtendQueryEntityWrapper idLikeLeft(){
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
    public EmSocDeviceExtendQueryEntityWrapper idLikeRight(){
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
    public EmSocDeviceExtendQueryEntityWrapper idEq(Long id){
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
    public EmSocDeviceExtendQueryEntityWrapper idNe(Long id){
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
    public EmSocDeviceExtendQueryEntityWrapper idGt(Long id){
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
    public EmSocDeviceExtendQueryEntityWrapper idGe(Long id){
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
    public EmSocDeviceExtendQueryEntityWrapper idLt(Long id){
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
    public EmSocDeviceExtendQueryEntityWrapper idLe(Long id){
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
    public EmSocDeviceExtendQueryEntityWrapper idLike(Long id){
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
    public EmSocDeviceExtendQueryEntityWrapper idNotLike(Long id){
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
    public EmSocDeviceExtendQueryEntityWrapper idLikeLeft(Long id){
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
    public EmSocDeviceExtendQueryEntityWrapper idLikeRight(Long id){
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
    public EmSocDeviceExtendQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper idIn(Collection<Long> value){
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
    public EmSocDeviceExtendQueryEntityWrapper idIn(Long... values){
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
    public EmSocDeviceExtendQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public EmSocDeviceExtendQueryEntityWrapper idNotIn(Long... values){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdEq(){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdNe(){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdGt(){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdGe(){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdLt(){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdLe(){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdLike(){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdNotLike(){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdLikeLeft(){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdLikeRight(){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdEq(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdNe(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdGt(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdGe(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdLt(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdLe(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdLike(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdNotLike(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdLikeLeft(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdLikeRight(Long fkEmSocDevicesId){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdIsNull(){
        isNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdIsNotNull(){
        isNotNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdIn(Collection<Long> value){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdIn(Long... values){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdNotIn(Collection<Long> value){
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
    public EmSocDeviceExtendQueryEntityWrapper fkEmSocDevicesIdNotIn(Long... values){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdEq(){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdNe(){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdGt(){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdGe(){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdLt(){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdLe(){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdLike(){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdNotLike(){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdLikeLeft(){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdLikeRight(){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdEq(String deviceId){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdNe(String deviceId){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdGt(String deviceId){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdGe(String deviceId){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdLt(String deviceId){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdLe(String deviceId){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdLike(String deviceId){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdNotLike(String deviceId){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdLikeRight(String deviceId){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper deviceIdIn(Collection<String> value){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdIn(String... values){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public EmSocDeviceExtendQueryEntityWrapper deviceIdNotIn(String... values){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdEq(){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdNe(){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdGt(){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdGe(){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdLt(){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdLe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            le("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * BETWEEN  entity().getPhoneId() AND phoneIdEnd
     * @param phoneIdEnd      值2
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper phoneIdBetween(String phoneIdEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdNotBetween(String phoneIdEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdBetween(String phoneIdStart,String phoneIdEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdNotBetween(String phoneIdStart,String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }


    /**
     * <p>华为云机id</p>
     * LIKE '%值%'  entity().getPhoneId()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper phoneIdLike(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            like("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * NOT LIKE '%值%'  entity().getPhoneId()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper phoneIdNotLike(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            notLike("phone_id",phoneId);
        }
        return this;
     }


    /**
     * <p>华为云机id</p>
     * LIKE '%值'  entity().getPhoneId()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper phoneIdLikeLeft(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            likeLeft("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>华为云机id</p>
     * LIKE '值%'  entity().getPhoneId()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper phoneIdLikeRight(){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdEq(String phoneId){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdNe(String phoneId){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdGt(String phoneId){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdGe(String phoneId){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdLt(String phoneId){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdLe(String phoneId){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdLike(String phoneId){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdNotLike(String phoneId){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdLikeLeft(String phoneId){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdLikeRight(String phoneId){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdIsNull(){
        isNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper phoneIdIsNotNull(){
        isNotNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper phoneIdIn(Collection<String> value){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdIn(String... values){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdNotIn(Collection<String> value){
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
    public EmSocDeviceExtendQueryEntityWrapper phoneIdNotIn(String... values){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueEq(){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueNe(){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueGt(){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueGe(){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueLt(){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueLe(){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null){
            le("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * BETWEEN  entity().getAlarmValue() AND alarmValueEnd
     * @param alarmValueEnd      值2
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper alarmValueBetween(BigDecimal alarmValueEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueNotBetween(BigDecimal alarmValueEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueBetween(BigDecimal alarmValueStart,BigDecimal alarmValueEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueNotBetween(BigDecimal alarmValueStart,BigDecimal alarmValueEnd){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null && alarmValueEnd!=null){
            notBetween("alarm_value",alarmValueStart,alarmValueEnd);
        }
        return this;
     }


    /**
     * <p>报警值</p>
     * LIKE '%值%'  entity().getAlarmValue()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper alarmValueLike(){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null){
            like("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * NOT LIKE '%值%'  entity().getAlarmValue()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper alarmValueNotLike(){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null){
            notLike("alarm_value",alarmValue);
        }
        return this;
     }


    /**
     * <p>报警值</p>
     * LIKE '%值'  entity().getAlarmValue()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper alarmValueLikeLeft(){
        BigDecimal alarmValue =entity().getAlarmValue();
        if(alarmValue!=null){
            likeLeft("alarm_value",alarmValue);
        }
        return this;
     }

    /**
     * <p>报警值</p>
     * LIKE '值%'  entity().getAlarmValue()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper alarmValueLikeRight(){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueEq(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueNe(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueGt(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueGe(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueLt(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueLe(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueLike(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueNotLike(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueLikeLeft(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueLikeRight(BigDecimal alarmValue){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueIsNull(){
        isNull("alarm_value");
        return this;
    }

    /**
     * <p>报警值</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper alarmValueIsNotNull(){
        isNotNull("alarm_value");
        return this;
    }

    /**
     * <p>报警值</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper alarmValueIn(Collection<BigDecimal> value){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueIn(BigDecimal... values){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueNotIn(Collection<BigDecimal> value){
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
    public EmSocDeviceExtendQueryEntityWrapper alarmValueNotIn(BigDecimal... values){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusEq(){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusNe(){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusGt(){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusGe(){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusLt(){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusLe(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            le("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * BETWEEN  entity().getHangUpStatus() AND hangUpStatusEnd
     * @param hangUpStatusEnd      值2
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusBetween(Integer hangUpStatusEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusNotBetween(Integer hangUpStatusEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusBetween(Integer hangUpStatusStart,Integer hangUpStatusEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusNotBetween(Integer hangUpStatusStart,Integer hangUpStatusEnd){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null && hangUpStatusEnd!=null){
            notBetween("hang_up_status",hangUpStatusStart,hangUpStatusEnd);
        }
        return this;
     }


    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '%值%'  entity().getHangUpStatus()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusLike(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            like("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * NOT LIKE '%值%'  entity().getHangUpStatus()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusNotLike(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            notLike("hang_up_status",hangUpStatus);
        }
        return this;
     }


    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '%值'  entity().getHangUpStatus()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusLikeLeft(){
        Integer hangUpStatus =entity().getHangUpStatus();
        if(hangUpStatus!=null){
            likeLeft("hang_up_status",hangUpStatus);
        }
        return this;
     }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * LIKE '值%'  entity().getHangUpStatus()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusLikeRight(){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusEq(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusNe(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusGt(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusGe(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusLt(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusLe(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusLike(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusNotLike(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusLikeLeft(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusLikeRight(Integer hangUpStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusIsNull(){
        isNull("hang_up_status");
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusIsNotNull(){
        isNotNull("hang_up_status");
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusIn(Collection<Integer> value){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusIn(Integer... values){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusNotIn(Collection<Integer> value){
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
    public EmSocDeviceExtendQueryEntityWrapper hangUpStatusNotIn(Integer... values){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeEq(){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeNe(){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeGt(){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeGe(){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeLt(){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeLe(){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeLike(){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeNotLike(){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeLikeLeft(){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeLikeRight(){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeEq(Date createTime){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeNe(Date createTime){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeGt(Date createTime){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeGe(Date createTime){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeLt(Date createTime){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeLe(Date createTime){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeLike(Date createTime){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeIn(Date... values){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public EmSocDeviceExtendQueryEntityWrapper createTimeNotIn(Date... values){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeEq(){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeNe(){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeGt(){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeGe(){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeLt(){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeLikeRight(){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public EmSocDeviceExtendQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdEq(){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdNe(){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdGt(){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdGe(){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdLt(){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdLe(){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdBetween(Long versionIdEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdNotBetween(Long versionIdEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdLike(){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdNotLike(){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdLikeLeft(){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdLikeRight(){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdEq(Long versionId){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdNe(Long versionId){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdGt(Long versionId){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdGe(Long versionId){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdLt(Long versionId){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdLe(Long versionId){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdLike(Long versionId){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdNotLike(Long versionId){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdLikeLeft(Long versionId){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdLikeRight(Long versionId){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper versionIdIn(Collection<Long> value){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdIn(Long... values){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public EmSocDeviceExtendQueryEntityWrapper versionIdNotIn(Long... values){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusEq(){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusNe(){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusGt(){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusGe(){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusLt(){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusLe(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            le("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * BETWEEN  entity().getRestartStatus() AND restartStatusEnd
     * @param restartStatusEnd      值2
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper restartStatusBetween(Integer restartStatusEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusNotBetween(Integer restartStatusEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusBetween(Integer restartStatusStart,Integer restartStatusEnd){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusNotBetween(Integer restartStatusStart,Integer restartStatusEnd){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null && restartStatusEnd!=null){
            notBetween("restart_status",restartStatusStart,restartStatusEnd);
        }
        return this;
     }


    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * LIKE '%值%'  entity().getRestartStatus()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper restartStatusLike(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            like("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * NOT LIKE '%值%'  entity().getRestartStatus()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper restartStatusNotLike(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            notLike("restart_status",restartStatus);
        }
        return this;
     }


    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * LIKE '%值'  entity().getRestartStatus()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper restartStatusLikeLeft(){
        Integer restartStatus =entity().getRestartStatus();
        if(restartStatus!=null){
            likeLeft("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * LIKE '值%'  entity().getRestartStatus()
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper restartStatusLikeRight(){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusEq(Integer restartStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusNe(Integer restartStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusGt(Integer restartStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusGe(Integer restartStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusLt(Integer restartStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusLe(Integer restartStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusLike(Integer restartStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusNotLike(Integer restartStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusLikeLeft(Integer restartStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusLikeRight(Integer restartStatus){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusIsNull(){
        isNull("restart_status");
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper restartStatusIsNotNull(){
        isNotNull("restart_status");
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDeviceExtendQueryEntityWrapper restartStatusIn(Collection<Integer> value){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusIn(Integer... values){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusNotIn(Collection<Integer> value){
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
    public EmSocDeviceExtendQueryEntityWrapper restartStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("restart_status",values);
        }
        return this;
    }



}
