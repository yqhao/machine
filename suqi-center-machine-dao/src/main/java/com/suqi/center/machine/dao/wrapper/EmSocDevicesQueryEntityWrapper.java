package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 设备（em_soc_devices）
 * </p>
 * "em_soc_devices"
 * @author PC001
 */
public class EmSocDevicesQueryEntityWrapper extends QueryWrapper<EmSocDevices> {

    public static EmSocDevicesQueryEntityWrapper wrapper(EmSocDevices entity) {
        return new EmSocDevicesQueryEntityWrapper(entity);
    }

    private EmSocDevices entity;

    public EmSocDevicesQueryEntityWrapper(EmSocDevices entity) {
         this.entity=entity;
    }


    protected EmSocDevices entity() {
        if(entity==null){
            throw new NullPointerException("EmSocDevices is null");
        }
        return entity;
    }

    @Override
    public EmSocDevicesQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public EmSocDevicesQueryEntityWrapper selectColumns(Consumer<EmSocDevicesSelect> consumer) {
        EmSocDevicesSelect select = new EmSocDevicesSelect();
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
    public EmSocDevicesQueryEntityWrapper idEq(){
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
    public EmSocDevicesQueryEntityWrapper idNe(){
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
    public EmSocDevicesQueryEntityWrapper idGt(){
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
    public EmSocDevicesQueryEntityWrapper idGe(){
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
    public EmSocDevicesQueryEntityWrapper idLt(){
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
    public EmSocDevicesQueryEntityWrapper idLe(){
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
    public EmSocDevicesQueryEntityWrapper idBetween(Long idEnd){
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
    public EmSocDevicesQueryEntityWrapper idNotBetween(Long idEnd){
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
    public EmSocDevicesQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public EmSocDevicesQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public EmSocDevicesQueryEntityWrapper idLike(){
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
    public EmSocDevicesQueryEntityWrapper idNotLike(){
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
    public EmSocDevicesQueryEntityWrapper idLikeLeft(){
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
    public EmSocDevicesQueryEntityWrapper idLikeRight(){
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
    public EmSocDevicesQueryEntityWrapper idEq(Long id){
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
    public EmSocDevicesQueryEntityWrapper idNe(Long id){
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
    public EmSocDevicesQueryEntityWrapper idGt(Long id){
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
    public EmSocDevicesQueryEntityWrapper idGe(Long id){
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
    public EmSocDevicesQueryEntityWrapper idLt(Long id){
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
    public EmSocDevicesQueryEntityWrapper idLe(Long id){
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
    public EmSocDevicesQueryEntityWrapper idLike(Long id){
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
    public EmSocDevicesQueryEntityWrapper idNotLike(Long id){
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
    public EmSocDevicesQueryEntityWrapper idLikeLeft(Long id){
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
    public EmSocDevicesQueryEntityWrapper idLikeRight(Long id){
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
    public EmSocDevicesQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper idIn(Collection<Long> value){
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
    public EmSocDevicesQueryEntityWrapper idIn(Long... values){
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
    public EmSocDevicesQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public EmSocDevicesQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdEq(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdNe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdGt(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdGe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdLt(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdLe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkPcpAreaId() AND fkPcpAreaIdEnd
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaId,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaId,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdNotLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdLikeLeft(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdLikeRight(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            likeRight("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeRight("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_pcp_area_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }


    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper deviceIdEq(){
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
    public EmSocDevicesQueryEntityWrapper deviceIdNe(){
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
    public EmSocDevicesQueryEntityWrapper deviceIdGt(){
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
    public EmSocDevicesQueryEntityWrapper deviceIdGe(){
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
    public EmSocDevicesQueryEntityWrapper deviceIdLt(){
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
    public EmSocDevicesQueryEntityWrapper deviceIdLe(){
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
    public EmSocDevicesQueryEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public EmSocDevicesQueryEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public EmSocDevicesQueryEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public EmSocDevicesQueryEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public EmSocDevicesQueryEntityWrapper deviceIdLike(){
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
    public EmSocDevicesQueryEntityWrapper deviceIdNotLike(){
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
    public EmSocDevicesQueryEntityWrapper deviceIdLikeLeft(){
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
    public EmSocDevicesQueryEntityWrapper deviceIdLikeRight(){
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
    public EmSocDevicesQueryEntityWrapper deviceIdEq(String deviceId){
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
    public EmSocDevicesQueryEntityWrapper deviceIdNe(String deviceId){
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
    public EmSocDevicesQueryEntityWrapper deviceIdGt(String deviceId){
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
    public EmSocDevicesQueryEntityWrapper deviceIdGe(String deviceId){
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
    public EmSocDevicesQueryEntityWrapper deviceIdLt(String deviceId){
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
    public EmSocDevicesQueryEntityWrapper deviceIdLe(String deviceId){
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
    public EmSocDevicesQueryEntityWrapper deviceIdLike(String deviceId){
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
    public EmSocDevicesQueryEntityWrapper deviceIdNotLike(String deviceId){
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
    public EmSocDevicesQueryEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public EmSocDevicesQueryEntityWrapper deviceIdLikeRight(String deviceId){
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
    public EmSocDevicesQueryEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper deviceIdIn(Collection<String> value){
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
    public EmSocDevicesQueryEntityWrapper deviceIdIn(String... values){
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
    public EmSocDevicesQueryEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public EmSocDevicesQueryEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }


    /**
     * <p>移动终端的唯一标识</p>
     * 等于 = entity().getImei()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiEq(){
        String imei =entity().getImei();
        if(imei!=null){
            eq("imei",imei);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * 不等于 &lt;&gt; entity().getImei()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiNe(){
        String imei =entity().getImei();
        if(imei!=null){
            ne("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 大于 &gt; entity().getImei()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiGt(){
        String imei =entity().getImei();
        if(imei!=null){
            gt("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 大于等于 &gt;= entity().getImei()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiGe(){
        String imei =entity().getImei();
        if(imei!=null){
            ge("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 小于 &lt; entity().getImei()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiLt(){
        String imei =entity().getImei();
        if(imei!=null){
            lt("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 小于等于 &lt;= entity().getImei()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiLe(){
        String imei =entity().getImei();
        if(imei!=null){
            le("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * BETWEEN  entity().getImei() AND imeiEnd
     * @param imeiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiBetween(String imeiEnd){
        String imei =entity().getImei();
        if(imei!=null && imeiEnd!=null){
            between("imei",imei,imeiEnd);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * NOT BETWEEN  entity().getImei() AND 值2
     * @param imeiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiNotBetween(String imeiEnd){
        String imei =entity().getImei();
        if(imei!=null && imeiEnd!=null){
            notBetween("imei",imei,imeiEnd);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * BETWEEN  entity().getImei() AND 值2
     * @param imeiStart       值1
     * @param imeiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiBetween(String imeiStart,String imeiEnd){
        String imei =entity().getImei();
        if(imei!=null && imeiEnd!=null){
            between("imei",imeiStart,imeiEnd);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * NOT BETWEEN  entity().getImei() AND 值2
     * @param imeiStart       值1
     * @param imeiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiNotBetween(String imeiStart,String imeiEnd){
        String imei =entity().getImei();
        if(imei!=null && imeiEnd!=null){
            notBetween("imei",imeiStart,imeiEnd);
        }
        return this;
     }


    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '%值%'  entity().getImei()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiLike(){
        String imei =entity().getImei();
        if(imei!=null){
            like("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * NOT LIKE '%值%'  entity().getImei()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiNotLike(){
        String imei =entity().getImei();
        if(imei!=null){
            notLike("imei",imei);
        }
        return this;
     }


    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '%值'  entity().getImei()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiLikeLeft(){
        String imei =entity().getImei();
        if(imei!=null){
            likeLeft("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '值%'  entity().getImei()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiLikeRight(){
        String imei =entity().getImei();
        if(imei!=null){
            likeRight("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 等于 =
     * @param imei       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiEq(String imei){
        if(imei!=null){
            eq("imei",imei);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * 不等于 &lt;&gt;
     * @param imei       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiNe(String imei){
        if(imei!=null){
            ne("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 大于 &gt;
     * @param imei       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiGt(String imei){
        if(imei!=null){
            gt("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 大于等于 &gt;=
     * @param imei       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiGe(String imei){
        if(imei!=null){
            ge("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 小于 &lt;
     * @param imei       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiLt(String imei){
        if(imei!=null){
            lt("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 小于等于 &lt;=
     * @param imei       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiLe(String imei){
        if(imei!=null){
            le("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '%值%'
     * @param imei       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiLike(String imei){
        if(imei!=null){
            like("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * NOT LIKE '%值%'
     * @param imei       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiNotLike(String imei){
        if(imei!=null){
            notLike("imei",imei);
        }
        return this;
     }


    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '%值'
     * @param imei       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiLikeLeft(String imei){
        if(imei!=null){
            likeLeft("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '值%'
     * @param imei       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiLikeRight(String imei){
        if(imei!=null){
            likeRight("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiIsNull(){
        isNull("imei");
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiIsNotNull(){
        isNotNull("imei");
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("imei",value);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiIn(String... values){
        if(values!=null && values.length>0){
            in("imei",values);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("imei",value);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imeiNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("imei",values);
        }
        return this;
    }


    /**
     * <p>国际移动用户识别码</p>
     * 等于 = entity().getImsi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiEq(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            eq("imsi",imsi);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * 不等于 &lt;&gt; entity().getImsi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiNe(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            ne("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 大于 &gt; entity().getImsi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiGt(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            gt("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 大于等于 &gt;= entity().getImsi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiGe(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            ge("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 小于 &lt; entity().getImsi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiLt(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            lt("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 小于等于 &lt;= entity().getImsi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiLe(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            le("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * BETWEEN  entity().getImsi() AND imsiEnd
     * @param imsiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiBetween(String imsiEnd){
        String imsi =entity().getImsi();
        if(imsi!=null && imsiEnd!=null){
            between("imsi",imsi,imsiEnd);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * NOT BETWEEN  entity().getImsi() AND 值2
     * @param imsiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiNotBetween(String imsiEnd){
        String imsi =entity().getImsi();
        if(imsi!=null && imsiEnd!=null){
            notBetween("imsi",imsi,imsiEnd);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * BETWEEN  entity().getImsi() AND 值2
     * @param imsiStart       值1
     * @param imsiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiBetween(String imsiStart,String imsiEnd){
        String imsi =entity().getImsi();
        if(imsi!=null && imsiEnd!=null){
            between("imsi",imsiStart,imsiEnd);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * NOT BETWEEN  entity().getImsi() AND 值2
     * @param imsiStart       值1
     * @param imsiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiNotBetween(String imsiStart,String imsiEnd){
        String imsi =entity().getImsi();
        if(imsi!=null && imsiEnd!=null){
            notBetween("imsi",imsiStart,imsiEnd);
        }
        return this;
     }


    /**
     * <p>国际移动用户识别码</p>
     * LIKE '%值%'  entity().getImsi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiLike(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            like("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * NOT LIKE '%值%'  entity().getImsi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiNotLike(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            notLike("imsi",imsi);
        }
        return this;
     }


    /**
     * <p>国际移动用户识别码</p>
     * LIKE '%值'  entity().getImsi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiLikeLeft(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            likeLeft("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * LIKE '值%'  entity().getImsi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiLikeRight(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            likeRight("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 等于 =
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiEq(String imsi){
        if(imsi!=null){
            eq("imsi",imsi);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * 不等于 &lt;&gt;
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiNe(String imsi){
        if(imsi!=null){
            ne("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 大于 &gt;
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiGt(String imsi){
        if(imsi!=null){
            gt("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 大于等于 &gt;=
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiGe(String imsi){
        if(imsi!=null){
            ge("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 小于 &lt;
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiLt(String imsi){
        if(imsi!=null){
            lt("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 小于等于 &lt;=
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiLe(String imsi){
        if(imsi!=null){
            le("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * LIKE '%值%'
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiLike(String imsi){
        if(imsi!=null){
            like("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * NOT LIKE '%值%'
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiNotLike(String imsi){
        if(imsi!=null){
            notLike("imsi",imsi);
        }
        return this;
     }


    /**
     * <p>国际移动用户识别码</p>
     * LIKE '%值'
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiLikeLeft(String imsi){
        if(imsi!=null){
            likeLeft("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * LIKE '值%'
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiLikeRight(String imsi){
        if(imsi!=null){
            likeRight("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiIsNull(){
        isNull("imsi");
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiIsNotNull(){
        isNotNull("imsi");
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("imsi",value);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiIn(String... values){
        if(values!=null && values.length>0){
            in("imsi",values);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("imsi",value);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper imsiNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("imsi",values);
        }
        return this;
    }


    /**
     * <p>macAddr</p>
     * 等于 = entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrEq(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            eq("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * 不等于 &lt;&gt; entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrNe(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            ne("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 大于 &gt; entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrGt(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            gt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 大于等于 &gt;= entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrGe(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            ge("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 小于 &lt; entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrLt(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            lt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 小于等于 &lt;= entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrLe(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            le("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * BETWEEN  entity().getMacAddr() AND macAddrEnd
     * @param macAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrBetween(String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            between("mac_addr",macAddr,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * NOT BETWEEN  entity().getMacAddr() AND 值2
     * @param macAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrNotBetween(String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            notBetween("mac_addr",macAddr,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * BETWEEN  entity().getMacAddr() AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrBetween(String macAddrStart,String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            between("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * NOT BETWEEN  entity().getMacAddr() AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrNotBetween(String macAddrStart,String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            notBetween("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }


    /**
     * <p>macAddr</p>
     * LIKE '%值%'  entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrLike(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            like("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * NOT LIKE '%值%'  entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrNotLike(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            notLike("mac_addr",macAddr);
        }
        return this;
     }


    /**
     * <p>macAddr</p>
     * LIKE '%值'  entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrLikeLeft(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            likeLeft("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * LIKE '值%'  entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrLikeRight(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            likeRight("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 等于 =
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrEq(String macAddr){
        if(macAddr!=null){
            eq("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * 不等于 &lt;&gt;
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrNe(String macAddr){
        if(macAddr!=null){
            ne("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 大于 &gt;
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrGt(String macAddr){
        if(macAddr!=null){
            gt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 大于等于 &gt;=
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrGe(String macAddr){
        if(macAddr!=null){
            ge("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 小于 &lt;
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrLt(String macAddr){
        if(macAddr!=null){
            lt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 小于等于 &lt;=
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrLe(String macAddr){
        if(macAddr!=null){
            le("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * LIKE '%值%'
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrLike(String macAddr){
        if(macAddr!=null){
            like("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * NOT LIKE '%值%'
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrNotLike(String macAddr){
        if(macAddr!=null){
            notLike("mac_addr",macAddr);
        }
        return this;
     }


    /**
     * <p>macAddr</p>
     * LIKE '%值'
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrLikeLeft(String macAddr){
        if(macAddr!=null){
            likeLeft("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * LIKE '值%'
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrLikeRight(String macAddr){
        if(macAddr!=null){
            likeRight("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrIsNull(){
        isNull("mac_addr");
        return this;
    }

    /**
     * <p>macAddr</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrIsNotNull(){
        isNotNull("mac_addr");
        return this;
    }

    /**
     * <p>macAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("mac_addr",value);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrIn(String... values){
        if(values!=null && values.length>0){
            in("mac_addr",values);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("mac_addr",value);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper macAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("mac_addr",values);
        }
        return this;
    }


    /**
     * <p>internalAddr</p>
     * 等于 = entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrEq(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            eq("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * 不等于 &lt;&gt; entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrNe(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            ne("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 大于 &gt; entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrGt(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            gt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 大于等于 &gt;= entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrGe(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            ge("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 小于 &lt; entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrLt(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            lt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 小于等于 &lt;= entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrLe(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            le("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * BETWEEN  entity().getInternalAddr() AND internalAddrEnd
     * @param internalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrBetween(String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            between("internal_addr",internalAddr,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * NOT BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrNotBetween(String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            notBetween("internal_addr",internalAddr,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrBetween(String internalAddrStart,String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            between("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * NOT BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrNotBetween(String internalAddrStart,String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            notBetween("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }


    /**
     * <p>internalAddr</p>
     * LIKE '%值%'  entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrLike(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            like("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * NOT LIKE '%值%'  entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrNotLike(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            notLike("internal_addr",internalAddr);
        }
        return this;
     }


    /**
     * <p>internalAddr</p>
     * LIKE '%值'  entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrLikeLeft(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            likeLeft("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * LIKE '值%'  entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrLikeRight(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            likeRight("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 等于 =
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrEq(String internalAddr){
        if(internalAddr!=null){
            eq("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * 不等于 &lt;&gt;
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrNe(String internalAddr){
        if(internalAddr!=null){
            ne("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 大于 &gt;
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrGt(String internalAddr){
        if(internalAddr!=null){
            gt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 大于等于 &gt;=
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrGe(String internalAddr){
        if(internalAddr!=null){
            ge("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 小于 &lt;
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrLt(String internalAddr){
        if(internalAddr!=null){
            lt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 小于等于 &lt;=
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrLe(String internalAddr){
        if(internalAddr!=null){
            le("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * LIKE '%值%'
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrLike(String internalAddr){
        if(internalAddr!=null){
            like("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * NOT LIKE '%值%'
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrNotLike(String internalAddr){
        if(internalAddr!=null){
            notLike("internal_addr",internalAddr);
        }
        return this;
     }


    /**
     * <p>internalAddr</p>
     * LIKE '%值'
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrLikeLeft(String internalAddr){
        if(internalAddr!=null){
            likeLeft("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * LIKE '值%'
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrLikeRight(String internalAddr){
        if(internalAddr!=null){
            likeRight("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrIsNull(){
        isNull("internal_addr");
        return this;
    }

    /**
     * <p>internalAddr</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrIsNotNull(){
        isNotNull("internal_addr");
        return this;
    }

    /**
     * <p>internalAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("internal_addr",value);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrIn(String... values){
        if(values!=null && values.length>0){
            in("internal_addr",values);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("internal_addr",value);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper internalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("internal_addr",values);
        }
        return this;
    }


    /**
     * <p>externalAddr</p>
     * 等于 = entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrEq(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            eq("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * 不等于 &lt;&gt; entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrNe(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            ne("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 大于 &gt; entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrGt(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            gt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 大于等于 &gt;= entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrGe(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            ge("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 小于 &lt; entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrLt(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            lt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 小于等于 &lt;= entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrLe(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            le("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * BETWEEN  entity().getExternalAddr() AND externalAddrEnd
     * @param externalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrBetween(String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            between("external_addr",externalAddr,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * NOT BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrNotBetween(String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            notBetween("external_addr",externalAddr,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrBetween(String externalAddrStart,String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            between("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * NOT BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrNotBetween(String externalAddrStart,String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            notBetween("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }


    /**
     * <p>externalAddr</p>
     * LIKE '%值%'  entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrLike(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            like("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * NOT LIKE '%值%'  entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrNotLike(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            notLike("external_addr",externalAddr);
        }
        return this;
     }


    /**
     * <p>externalAddr</p>
     * LIKE '%值'  entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrLikeLeft(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            likeLeft("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * LIKE '值%'  entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrLikeRight(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            likeRight("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 等于 =
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrEq(String externalAddr){
        if(externalAddr!=null){
            eq("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * 不等于 &lt;&gt;
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrNe(String externalAddr){
        if(externalAddr!=null){
            ne("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 大于 &gt;
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrGt(String externalAddr){
        if(externalAddr!=null){
            gt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 大于等于 &gt;=
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrGe(String externalAddr){
        if(externalAddr!=null){
            ge("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 小于 &lt;
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrLt(String externalAddr){
        if(externalAddr!=null){
            lt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 小于等于 &lt;=
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrLe(String externalAddr){
        if(externalAddr!=null){
            le("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * LIKE '%值%'
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrLike(String externalAddr){
        if(externalAddr!=null){
            like("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * NOT LIKE '%值%'
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrNotLike(String externalAddr){
        if(externalAddr!=null){
            notLike("external_addr",externalAddr);
        }
        return this;
     }


    /**
     * <p>externalAddr</p>
     * LIKE '%值'
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrLikeLeft(String externalAddr){
        if(externalAddr!=null){
            likeLeft("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * LIKE '值%'
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrLikeRight(String externalAddr){
        if(externalAddr!=null){
            likeRight("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrIsNull(){
        isNull("external_addr");
        return this;
    }

    /**
     * <p>externalAddr</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrIsNotNull(){
        isNotNull("external_addr");
        return this;
    }

    /**
     * <p>externalAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("external_addr",value);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrIn(String... values){
        if(values!=null && values.length>0){
            in("external_addr",values);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("external_addr",value);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper externalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("external_addr",values);
        }
        return this;
    }


    /**
     * <p>省份ccode</p>
     * 等于 = entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeEq(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            eq("province_ccode",provinceCcode);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * 不等于 &lt;&gt; entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeNe(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            ne("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 大于 &gt; entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeGt(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            gt("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 大于等于 &gt;= entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeGe(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            ge("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 小于 &lt; entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeLt(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            lt("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 小于等于 &lt;= entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeLe(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            le("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * BETWEEN  entity().getProvinceCcode() AND provinceCcodeEnd
     * @param provinceCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeBetween(Long provinceCcodeEnd){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null && provinceCcodeEnd!=null){
            between("province_ccode",provinceCcode,provinceCcodeEnd);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * NOT BETWEEN  entity().getProvinceCcode() AND 值2
     * @param provinceCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeNotBetween(Long provinceCcodeEnd){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null && provinceCcodeEnd!=null){
            notBetween("province_ccode",provinceCcode,provinceCcodeEnd);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * BETWEEN  entity().getProvinceCcode() AND 值2
     * @param provinceCcodeStart       值1
     * @param provinceCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeBetween(Long provinceCcodeStart,Long provinceCcodeEnd){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null && provinceCcodeEnd!=null){
            between("province_ccode",provinceCcodeStart,provinceCcodeEnd);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * NOT BETWEEN  entity().getProvinceCcode() AND 值2
     * @param provinceCcodeStart       值1
     * @param provinceCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeNotBetween(Long provinceCcodeStart,Long provinceCcodeEnd){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null && provinceCcodeEnd!=null){
            notBetween("province_ccode",provinceCcodeStart,provinceCcodeEnd);
        }
        return this;
     }


    /**
     * <p>省份ccode</p>
     * LIKE '%值%'  entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeLike(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            like("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * NOT LIKE '%值%'  entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeNotLike(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            notLike("province_ccode",provinceCcode);
        }
        return this;
     }


    /**
     * <p>省份ccode</p>
     * LIKE '%值'  entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeLikeLeft(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            likeLeft("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * LIKE '值%'  entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeLikeRight(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            likeRight("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 等于 =
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeEq(Long provinceCcode){
        if(provinceCcode!=null){
            eq("province_ccode",provinceCcode);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * 不等于 &lt;&gt;
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeNe(Long provinceCcode){
        if(provinceCcode!=null){
            ne("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 大于 &gt;
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeGt(Long provinceCcode){
        if(provinceCcode!=null){
            gt("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 大于等于 &gt;=
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeGe(Long provinceCcode){
        if(provinceCcode!=null){
            ge("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 小于 &lt;
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeLt(Long provinceCcode){
        if(provinceCcode!=null){
            lt("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 小于等于 &lt;=
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeLe(Long provinceCcode){
        if(provinceCcode!=null){
            le("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * LIKE '%值%'
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeLike(Long provinceCcode){
        if(provinceCcode!=null){
            like("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * NOT LIKE '%值%'
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeNotLike(Long provinceCcode){
        if(provinceCcode!=null){
            notLike("province_ccode",provinceCcode);
        }
        return this;
     }


    /**
     * <p>省份ccode</p>
     * LIKE '%值'
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeLikeLeft(Long provinceCcode){
        if(provinceCcode!=null){
            likeLeft("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * LIKE '值%'
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeLikeRight(Long provinceCcode){
        if(provinceCcode!=null){
            likeRight("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeIsNull(){
        isNull("province_ccode");
        return this;
    }

    /**
     * <p>省份ccode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeIsNotNull(){
        isNotNull("province_ccode");
        return this;
    }

    /**
     * <p>省份ccode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("province_ccode",value);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeIn(Long... values){
        if(values!=null && values.length>0){
            in("province_ccode",values);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("province_ccode",value);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceCcodeNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("province_ccode",values);
        }
        return this;
    }


    /**
     * <p>省份名称</p>
     * 等于 = entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameEq(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            eq("province_name",provinceName);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * 不等于 &lt;&gt; entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameNe(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            ne("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 大于 &gt; entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameGt(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            gt("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 大于等于 &gt;= entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameGe(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            ge("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 小于 &lt; entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameLt(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            lt("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 小于等于 &lt;= entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameLe(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            le("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * BETWEEN  entity().getProvinceName() AND provinceNameEnd
     * @param provinceNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameBetween(String provinceNameEnd){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null && provinceNameEnd!=null){
            between("province_name",provinceName,provinceNameEnd);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * NOT BETWEEN  entity().getProvinceName() AND 值2
     * @param provinceNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameNotBetween(String provinceNameEnd){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null && provinceNameEnd!=null){
            notBetween("province_name",provinceName,provinceNameEnd);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * BETWEEN  entity().getProvinceName() AND 值2
     * @param provinceNameStart       值1
     * @param provinceNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameBetween(String provinceNameStart,String provinceNameEnd){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null && provinceNameEnd!=null){
            between("province_name",provinceNameStart,provinceNameEnd);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * NOT BETWEEN  entity().getProvinceName() AND 值2
     * @param provinceNameStart       值1
     * @param provinceNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameNotBetween(String provinceNameStart,String provinceNameEnd){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null && provinceNameEnd!=null){
            notBetween("province_name",provinceNameStart,provinceNameEnd);
        }
        return this;
     }


    /**
     * <p>省份名称</p>
     * LIKE '%值%'  entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameLike(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            like("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * NOT LIKE '%值%'  entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameNotLike(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            notLike("province_name",provinceName);
        }
        return this;
     }


    /**
     * <p>省份名称</p>
     * LIKE '%值'  entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameLikeLeft(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            likeLeft("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * LIKE '值%'  entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameLikeRight(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            likeRight("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 等于 =
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameEq(String provinceName){
        if(provinceName!=null){
            eq("province_name",provinceName);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * 不等于 &lt;&gt;
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameNe(String provinceName){
        if(provinceName!=null){
            ne("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 大于 &gt;
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameGt(String provinceName){
        if(provinceName!=null){
            gt("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 大于等于 &gt;=
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameGe(String provinceName){
        if(provinceName!=null){
            ge("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 小于 &lt;
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameLt(String provinceName){
        if(provinceName!=null){
            lt("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 小于等于 &lt;=
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameLe(String provinceName){
        if(provinceName!=null){
            le("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * LIKE '%值%'
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameLike(String provinceName){
        if(provinceName!=null){
            like("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * NOT LIKE '%值%'
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameNotLike(String provinceName){
        if(provinceName!=null){
            notLike("province_name",provinceName);
        }
        return this;
     }


    /**
     * <p>省份名称</p>
     * LIKE '%值'
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameLikeLeft(String provinceName){
        if(provinceName!=null){
            likeLeft("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * LIKE '值%'
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameLikeRight(String provinceName){
        if(provinceName!=null){
            likeRight("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameIsNull(){
        isNull("province_name");
        return this;
    }

    /**
     * <p>省份名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameIsNotNull(){
        isNotNull("province_name");
        return this;
    }

    /**
     * <p>省份名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("province_name",value);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameIn(String... values){
        if(values!=null && values.length>0){
            in("province_name",values);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("province_name",value);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper provinceNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("province_name",values);
        }
        return this;
    }


    /**
     * <p>城市ccode</p>
     * 等于 = entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeEq(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            eq("city_ccode",cityCcode);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * 不等于 &lt;&gt; entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeNe(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            ne("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 大于 &gt; entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeGt(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            gt("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 大于等于 &gt;= entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeGe(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            ge("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 小于 &lt; entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeLt(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            lt("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 小于等于 &lt;= entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeLe(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            le("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * BETWEEN  entity().getCityCcode() AND cityCcodeEnd
     * @param cityCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeBetween(Long cityCcodeEnd){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null && cityCcodeEnd!=null){
            between("city_ccode",cityCcode,cityCcodeEnd);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * NOT BETWEEN  entity().getCityCcode() AND 值2
     * @param cityCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeNotBetween(Long cityCcodeEnd){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null && cityCcodeEnd!=null){
            notBetween("city_ccode",cityCcode,cityCcodeEnd);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * BETWEEN  entity().getCityCcode() AND 值2
     * @param cityCcodeStart       值1
     * @param cityCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeBetween(Long cityCcodeStart,Long cityCcodeEnd){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null && cityCcodeEnd!=null){
            between("city_ccode",cityCcodeStart,cityCcodeEnd);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * NOT BETWEEN  entity().getCityCcode() AND 值2
     * @param cityCcodeStart       值1
     * @param cityCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeNotBetween(Long cityCcodeStart,Long cityCcodeEnd){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null && cityCcodeEnd!=null){
            notBetween("city_ccode",cityCcodeStart,cityCcodeEnd);
        }
        return this;
     }


    /**
     * <p>城市ccode</p>
     * LIKE '%值%'  entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeLike(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            like("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * NOT LIKE '%值%'  entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeNotLike(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            notLike("city_ccode",cityCcode);
        }
        return this;
     }


    /**
     * <p>城市ccode</p>
     * LIKE '%值'  entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeLikeLeft(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            likeLeft("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * LIKE '值%'  entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeLikeRight(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            likeRight("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 等于 =
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeEq(Long cityCcode){
        if(cityCcode!=null){
            eq("city_ccode",cityCcode);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * 不等于 &lt;&gt;
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeNe(Long cityCcode){
        if(cityCcode!=null){
            ne("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 大于 &gt;
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeGt(Long cityCcode){
        if(cityCcode!=null){
            gt("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 大于等于 &gt;=
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeGe(Long cityCcode){
        if(cityCcode!=null){
            ge("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 小于 &lt;
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeLt(Long cityCcode){
        if(cityCcode!=null){
            lt("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 小于等于 &lt;=
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeLe(Long cityCcode){
        if(cityCcode!=null){
            le("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * LIKE '%值%'
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeLike(Long cityCcode){
        if(cityCcode!=null){
            like("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * NOT LIKE '%值%'
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeNotLike(Long cityCcode){
        if(cityCcode!=null){
            notLike("city_ccode",cityCcode);
        }
        return this;
     }


    /**
     * <p>城市ccode</p>
     * LIKE '%值'
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeLikeLeft(Long cityCcode){
        if(cityCcode!=null){
            likeLeft("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * LIKE '值%'
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeLikeRight(Long cityCcode){
        if(cityCcode!=null){
            likeRight("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeIsNull(){
        isNull("city_ccode");
        return this;
    }

    /**
     * <p>城市ccode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeIsNotNull(){
        isNotNull("city_ccode");
        return this;
    }

    /**
     * <p>城市ccode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("city_ccode",value);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeIn(Long... values){
        if(values!=null && values.length>0){
            in("city_ccode",values);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("city_ccode",value);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityCcodeNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("city_ccode",values);
        }
        return this;
    }


    /**
     * <p>城市名称</p>
     * 等于 = entity().getCityName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameEq(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            eq("city_name",cityName);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * 不等于 &lt;&gt; entity().getCityName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameNe(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            ne("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 大于 &gt; entity().getCityName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameGt(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            gt("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 大于等于 &gt;= entity().getCityName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameGe(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            ge("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 小于 &lt; entity().getCityName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameLt(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            lt("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 小于等于 &lt;= entity().getCityName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameLe(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            le("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * BETWEEN  entity().getCityName() AND cityNameEnd
     * @param cityNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameBetween(String cityNameEnd){
        String cityName =entity().getCityName();
        if(cityName!=null && cityNameEnd!=null){
            between("city_name",cityName,cityNameEnd);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * NOT BETWEEN  entity().getCityName() AND 值2
     * @param cityNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameNotBetween(String cityNameEnd){
        String cityName =entity().getCityName();
        if(cityName!=null && cityNameEnd!=null){
            notBetween("city_name",cityName,cityNameEnd);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * BETWEEN  entity().getCityName() AND 值2
     * @param cityNameStart       值1
     * @param cityNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameBetween(String cityNameStart,String cityNameEnd){
        String cityName =entity().getCityName();
        if(cityName!=null && cityNameEnd!=null){
            between("city_name",cityNameStart,cityNameEnd);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * NOT BETWEEN  entity().getCityName() AND 值2
     * @param cityNameStart       值1
     * @param cityNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameNotBetween(String cityNameStart,String cityNameEnd){
        String cityName =entity().getCityName();
        if(cityName!=null && cityNameEnd!=null){
            notBetween("city_name",cityNameStart,cityNameEnd);
        }
        return this;
     }


    /**
     * <p>城市名称</p>
     * LIKE '%值%'  entity().getCityName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameLike(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            like("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * NOT LIKE '%值%'  entity().getCityName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameNotLike(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            notLike("city_name",cityName);
        }
        return this;
     }


    /**
     * <p>城市名称</p>
     * LIKE '%值'  entity().getCityName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameLikeLeft(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            likeLeft("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * LIKE '值%'  entity().getCityName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameLikeRight(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            likeRight("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 等于 =
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameEq(String cityName){
        if(cityName!=null){
            eq("city_name",cityName);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * 不等于 &lt;&gt;
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameNe(String cityName){
        if(cityName!=null){
            ne("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 大于 &gt;
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameGt(String cityName){
        if(cityName!=null){
            gt("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 大于等于 &gt;=
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameGe(String cityName){
        if(cityName!=null){
            ge("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 小于 &lt;
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameLt(String cityName){
        if(cityName!=null){
            lt("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 小于等于 &lt;=
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameLe(String cityName){
        if(cityName!=null){
            le("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * LIKE '%值%'
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameLike(String cityName){
        if(cityName!=null){
            like("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * NOT LIKE '%值%'
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameNotLike(String cityName){
        if(cityName!=null){
            notLike("city_name",cityName);
        }
        return this;
     }


    /**
     * <p>城市名称</p>
     * LIKE '%值'
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameLikeLeft(String cityName){
        if(cityName!=null){
            likeLeft("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * LIKE '值%'
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameLikeRight(String cityName){
        if(cityName!=null){
            likeRight("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameIsNull(){
        isNull("city_name");
        return this;
    }

    /**
     * <p>城市名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameIsNotNull(){
        isNotNull("city_name");
        return this;
    }

    /**
     * <p>城市名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("city_name",value);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameIn(String... values){
        if(values!=null && values.length>0){
            in("city_name",values);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("city_name",value);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper cityNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("city_name",values);
        }
        return this;
    }


    /**
     * <p>地区ccode</p>
     * 等于 = entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeEq(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            eq("area_ccode",areaCcode);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * 不等于 &lt;&gt; entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeNe(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            ne("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 大于 &gt; entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeGt(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            gt("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 大于等于 &gt;= entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeGe(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            ge("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 小于 &lt; entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeLt(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            lt("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 小于等于 &lt;= entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeLe(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            le("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * BETWEEN  entity().getAreaCcode() AND areaCcodeEnd
     * @param areaCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeBetween(Long areaCcodeEnd){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null && areaCcodeEnd!=null){
            between("area_ccode",areaCcode,areaCcodeEnd);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * NOT BETWEEN  entity().getAreaCcode() AND 值2
     * @param areaCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeNotBetween(Long areaCcodeEnd){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null && areaCcodeEnd!=null){
            notBetween("area_ccode",areaCcode,areaCcodeEnd);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * BETWEEN  entity().getAreaCcode() AND 值2
     * @param areaCcodeStart       值1
     * @param areaCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeBetween(Long areaCcodeStart,Long areaCcodeEnd){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null && areaCcodeEnd!=null){
            between("area_ccode",areaCcodeStart,areaCcodeEnd);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * NOT BETWEEN  entity().getAreaCcode() AND 值2
     * @param areaCcodeStart       值1
     * @param areaCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeNotBetween(Long areaCcodeStart,Long areaCcodeEnd){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null && areaCcodeEnd!=null){
            notBetween("area_ccode",areaCcodeStart,areaCcodeEnd);
        }
        return this;
     }


    /**
     * <p>地区ccode</p>
     * LIKE '%值%'  entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeLike(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            like("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * NOT LIKE '%值%'  entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeNotLike(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            notLike("area_ccode",areaCcode);
        }
        return this;
     }


    /**
     * <p>地区ccode</p>
     * LIKE '%值'  entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeLikeLeft(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            likeLeft("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * LIKE '值%'  entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeLikeRight(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            likeRight("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 等于 =
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeEq(Long areaCcode){
        if(areaCcode!=null){
            eq("area_ccode",areaCcode);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * 不等于 &lt;&gt;
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeNe(Long areaCcode){
        if(areaCcode!=null){
            ne("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 大于 &gt;
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeGt(Long areaCcode){
        if(areaCcode!=null){
            gt("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 大于等于 &gt;=
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeGe(Long areaCcode){
        if(areaCcode!=null){
            ge("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 小于 &lt;
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeLt(Long areaCcode){
        if(areaCcode!=null){
            lt("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 小于等于 &lt;=
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeLe(Long areaCcode){
        if(areaCcode!=null){
            le("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * LIKE '%值%'
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeLike(Long areaCcode){
        if(areaCcode!=null){
            like("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * NOT LIKE '%值%'
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeNotLike(Long areaCcode){
        if(areaCcode!=null){
            notLike("area_ccode",areaCcode);
        }
        return this;
     }


    /**
     * <p>地区ccode</p>
     * LIKE '%值'
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeLikeLeft(Long areaCcode){
        if(areaCcode!=null){
            likeLeft("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * LIKE '值%'
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeLikeRight(Long areaCcode){
        if(areaCcode!=null){
            likeRight("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeIsNull(){
        isNull("area_ccode");
        return this;
    }

    /**
     * <p>地区ccode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeIsNotNull(){
        isNotNull("area_ccode");
        return this;
    }

    /**
     * <p>地区ccode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("area_ccode",value);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeIn(Long... values){
        if(values!=null && values.length>0){
            in("area_ccode",values);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("area_ccode",value);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaCcodeNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("area_ccode",values);
        }
        return this;
    }


    /**
     * <p>地区名称</p>
     * 等于 = entity().getAreaName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameEq(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            eq("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * 不等于 &lt;&gt; entity().getAreaName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameNe(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            ne("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 大于 &gt; entity().getAreaName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameGt(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            gt("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 大于等于 &gt;= entity().getAreaName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameGe(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            ge("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 小于 &lt; entity().getAreaName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameLt(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            lt("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 小于等于 &lt;= entity().getAreaName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameLe(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            le("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * BETWEEN  entity().getAreaName() AND areaNameEnd
     * @param areaNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameBetween(String areaNameEnd){
        String areaName =entity().getAreaName();
        if(areaName!=null && areaNameEnd!=null){
            between("area_name",areaName,areaNameEnd);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * NOT BETWEEN  entity().getAreaName() AND 值2
     * @param areaNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameNotBetween(String areaNameEnd){
        String areaName =entity().getAreaName();
        if(areaName!=null && areaNameEnd!=null){
            notBetween("area_name",areaName,areaNameEnd);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * BETWEEN  entity().getAreaName() AND 值2
     * @param areaNameStart       值1
     * @param areaNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameBetween(String areaNameStart,String areaNameEnd){
        String areaName =entity().getAreaName();
        if(areaName!=null && areaNameEnd!=null){
            between("area_name",areaNameStart,areaNameEnd);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * NOT BETWEEN  entity().getAreaName() AND 值2
     * @param areaNameStart       值1
     * @param areaNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameNotBetween(String areaNameStart,String areaNameEnd){
        String areaName =entity().getAreaName();
        if(areaName!=null && areaNameEnd!=null){
            notBetween("area_name",areaNameStart,areaNameEnd);
        }
        return this;
     }


    /**
     * <p>地区名称</p>
     * LIKE '%值%'  entity().getAreaName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameLike(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            like("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * NOT LIKE '%值%'  entity().getAreaName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameNotLike(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            notLike("area_name",areaName);
        }
        return this;
     }


    /**
     * <p>地区名称</p>
     * LIKE '%值'  entity().getAreaName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameLikeLeft(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            likeLeft("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * LIKE '值%'  entity().getAreaName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameLikeRight(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            likeRight("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 等于 =
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameEq(String areaName){
        if(areaName!=null){
            eq("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * 不等于 &lt;&gt;
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameNe(String areaName){
        if(areaName!=null){
            ne("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 大于 &gt;
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameGt(String areaName){
        if(areaName!=null){
            gt("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 大于等于 &gt;=
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameGe(String areaName){
        if(areaName!=null){
            ge("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 小于 &lt;
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameLt(String areaName){
        if(areaName!=null){
            lt("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 小于等于 &lt;=
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameLe(String areaName){
        if(areaName!=null){
            le("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * LIKE '%值%'
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameLike(String areaName){
        if(areaName!=null){
            like("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * NOT LIKE '%值%'
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameNotLike(String areaName){
        if(areaName!=null){
            notLike("area_name",areaName);
        }
        return this;
     }


    /**
     * <p>地区名称</p>
     * LIKE '%值'
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameLikeLeft(String areaName){
        if(areaName!=null){
            likeLeft("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * LIKE '值%'
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameLikeRight(String areaName){
        if(areaName!=null){
            likeRight("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameIsNull(){
        isNull("area_name");
        return this;
    }

    /**
     * <p>地区名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameIsNotNull(){
        isNotNull("area_name");
        return this;
    }

    /**
     * <p>地区名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("area_name",value);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameIn(String... values){
        if(values!=null && values.length>0){
            in("area_name",values);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("area_name",value);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper areaNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("area_name",values);
        }
        return this;
    }


    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 等于 = entity().getRegionName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameEq(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            eq("region_name",regionName);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 不等于 &lt;&gt; entity().getRegionName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameNe(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            ne("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 大于 &gt; entity().getRegionName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameGt(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            gt("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 大于等于 &gt;= entity().getRegionName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameGe(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            ge("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 小于 &lt; entity().getRegionName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameLt(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            lt("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 小于等于 &lt;= entity().getRegionName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameLe(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            le("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * BETWEEN  entity().getRegionName() AND regionNameEnd
     * @param regionNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameBetween(String regionNameEnd){
        String regionName =entity().getRegionName();
        if(regionName!=null && regionNameEnd!=null){
            between("region_name",regionName,regionNameEnd);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * NOT BETWEEN  entity().getRegionName() AND 值2
     * @param regionNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameNotBetween(String regionNameEnd){
        String regionName =entity().getRegionName();
        if(regionName!=null && regionNameEnd!=null){
            notBetween("region_name",regionName,regionNameEnd);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * BETWEEN  entity().getRegionName() AND 值2
     * @param regionNameStart       值1
     * @param regionNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameBetween(String regionNameStart,String regionNameEnd){
        String regionName =entity().getRegionName();
        if(regionName!=null && regionNameEnd!=null){
            between("region_name",regionNameStart,regionNameEnd);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * NOT BETWEEN  entity().getRegionName() AND 值2
     * @param regionNameStart       值1
     * @param regionNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameNotBetween(String regionNameStart,String regionNameEnd){
        String regionName =entity().getRegionName();
        if(regionName!=null && regionNameEnd!=null){
            notBetween("region_name",regionNameStart,regionNameEnd);
        }
        return this;
     }


    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '%值%'  entity().getRegionName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameLike(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            like("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * NOT LIKE '%值%'  entity().getRegionName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameNotLike(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            notLike("region_name",regionName);
        }
        return this;
     }


    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '%值'  entity().getRegionName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameLikeLeft(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            likeLeft("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '值%'  entity().getRegionName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameLikeRight(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            likeRight("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 等于 =
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameEq(String regionName){
        if(regionName!=null){
            eq("region_name",regionName);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 不等于 &lt;&gt;
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameNe(String regionName){
        if(regionName!=null){
            ne("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 大于 &gt;
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameGt(String regionName){
        if(regionName!=null){
            gt("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 大于等于 &gt;=
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameGe(String regionName){
        if(regionName!=null){
            ge("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 小于 &lt;
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameLt(String regionName){
        if(regionName!=null){
            lt("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 小于等于 &lt;=
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameLe(String regionName){
        if(regionName!=null){
            le("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '%值%'
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameLike(String regionName){
        if(regionName!=null){
            like("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * NOT LIKE '%值%'
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameNotLike(String regionName){
        if(regionName!=null){
            notLike("region_name",regionName);
        }
        return this;
     }


    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '%值'
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameLikeLeft(String regionName){
        if(regionName!=null){
            likeLeft("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '值%'
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameLikeRight(String regionName){
        if(regionName!=null){
            likeRight("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameIsNull(){
        isNull("region_name");
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameIsNotNull(){
        isNotNull("region_name");
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("region_name",value);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameIn(String... values){
        if(values!=null && values.length>0){
            in("region_name",values);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("region_name",value);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper regionNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region_name",values);
        }
        return this;
    }


    /**
     * <p>location</p>
     * 等于 = entity().getLocation()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationEq(){
        String location =entity().getLocation();
        if(location!=null){
            eq("location",location);
        }
        return this;
    }

    /**
     * <p>location</p>
     * 不等于 &lt;&gt; entity().getLocation()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationNe(){
        String location =entity().getLocation();
        if(location!=null){
            ne("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 大于 &gt; entity().getLocation()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationGt(){
        String location =entity().getLocation();
        if(location!=null){
            gt("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 大于等于 &gt;= entity().getLocation()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationGe(){
        String location =entity().getLocation();
        if(location!=null){
            ge("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 小于 &lt; entity().getLocation()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationLt(){
        String location =entity().getLocation();
        if(location!=null){
            lt("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 小于等于 &lt;= entity().getLocation()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationLe(){
        String location =entity().getLocation();
        if(location!=null){
            le("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * BETWEEN  entity().getLocation() AND locationEnd
     * @param locationEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationBetween(String locationEnd){
        String location =entity().getLocation();
        if(location!=null && locationEnd!=null){
            between("location",location,locationEnd);
        }
        return this;
     }

    /**
     * <p>location</p>
     * NOT BETWEEN  entity().getLocation() AND 值2
     * @param locationEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationNotBetween(String locationEnd){
        String location =entity().getLocation();
        if(location!=null && locationEnd!=null){
            notBetween("location",location,locationEnd);
        }
        return this;
     }

    /**
     * <p>location</p>
     * BETWEEN  entity().getLocation() AND 值2
     * @param locationStart       值1
     * @param locationEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationBetween(String locationStart,String locationEnd){
        String location =entity().getLocation();
        if(location!=null && locationEnd!=null){
            between("location",locationStart,locationEnd);
        }
        return this;
     }

    /**
     * <p>location</p>
     * NOT BETWEEN  entity().getLocation() AND 值2
     * @param locationStart       值1
     * @param locationEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationNotBetween(String locationStart,String locationEnd){
        String location =entity().getLocation();
        if(location!=null && locationEnd!=null){
            notBetween("location",locationStart,locationEnd);
        }
        return this;
     }


    /**
     * <p>location</p>
     * LIKE '%值%'  entity().getLocation()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationLike(){
        String location =entity().getLocation();
        if(location!=null){
            like("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * NOT LIKE '%值%'  entity().getLocation()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationNotLike(){
        String location =entity().getLocation();
        if(location!=null){
            notLike("location",location);
        }
        return this;
     }


    /**
     * <p>location</p>
     * LIKE '%值'  entity().getLocation()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationLikeLeft(){
        String location =entity().getLocation();
        if(location!=null){
            likeLeft("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * LIKE '值%'  entity().getLocation()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationLikeRight(){
        String location =entity().getLocation();
        if(location!=null){
            likeRight("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 等于 =
     * @param location       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationEq(String location){
        if(location!=null){
            eq("location",location);
        }
        return this;
    }

    /**
     * <p>location</p>
     * 不等于 &lt;&gt;
     * @param location       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationNe(String location){
        if(location!=null){
            ne("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 大于 &gt;
     * @param location       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationGt(String location){
        if(location!=null){
            gt("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 大于等于 &gt;=
     * @param location       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationGe(String location){
        if(location!=null){
            ge("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 小于 &lt;
     * @param location       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationLt(String location){
        if(location!=null){
            lt("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 小于等于 &lt;=
     * @param location       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationLe(String location){
        if(location!=null){
            le("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * LIKE '%值%'
     * @param location       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationLike(String location){
        if(location!=null){
            like("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * NOT LIKE '%值%'
     * @param location       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationNotLike(String location){
        if(location!=null){
            notLike("location",location);
        }
        return this;
     }


    /**
     * <p>location</p>
     * LIKE '%值'
     * @param location       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationLikeLeft(String location){
        if(location!=null){
            likeLeft("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * LIKE '值%'
     * @param location       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationLikeRight(String location){
        if(location!=null){
            likeRight("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationIsNull(){
        isNull("location");
        return this;
    }

    /**
     * <p>location</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationIsNotNull(){
        isNotNull("location");
        return this;
    }

    /**
     * <p>location</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("location",value);
        }
        return this;
    }

    /**
     * <p>location</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationIn(String... values){
        if(values!=null && values.length>0){
            in("location",values);
        }
        return this;
    }

    /**
     * <p>location</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("location",value);
        }
        return this;
    }

    /**
     * <p>location</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper locationNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("location",values);
        }
        return this;
    }


    /**
     * <p>cpu线程数</p>
     * 等于 = entity().getProcessors()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsEq(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            eq("processors",processors);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * 不等于 &lt;&gt; entity().getProcessors()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsNe(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            ne("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 大于 &gt; entity().getProcessors()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsGt(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            gt("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 大于等于 &gt;= entity().getProcessors()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsGe(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            ge("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 小于 &lt; entity().getProcessors()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsLt(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            lt("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 小于等于 &lt;= entity().getProcessors()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsLe(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            le("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * BETWEEN  entity().getProcessors() AND processorsEnd
     * @param processorsEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsBetween(Integer processorsEnd){
        Integer processors =entity().getProcessors();
        if(processors!=null && processorsEnd!=null){
            between("processors",processors,processorsEnd);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * NOT BETWEEN  entity().getProcessors() AND 值2
     * @param processorsEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsNotBetween(Integer processorsEnd){
        Integer processors =entity().getProcessors();
        if(processors!=null && processorsEnd!=null){
            notBetween("processors",processors,processorsEnd);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * BETWEEN  entity().getProcessors() AND 值2
     * @param processorsStart       值1
     * @param processorsEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsBetween(Integer processorsStart,Integer processorsEnd){
        Integer processors =entity().getProcessors();
        if(processors!=null && processorsEnd!=null){
            between("processors",processorsStart,processorsEnd);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * NOT BETWEEN  entity().getProcessors() AND 值2
     * @param processorsStart       值1
     * @param processorsEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsNotBetween(Integer processorsStart,Integer processorsEnd){
        Integer processors =entity().getProcessors();
        if(processors!=null && processorsEnd!=null){
            notBetween("processors",processorsStart,processorsEnd);
        }
        return this;
     }


    /**
     * <p>cpu线程数</p>
     * LIKE '%值%'  entity().getProcessors()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsLike(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            like("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * NOT LIKE '%值%'  entity().getProcessors()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsNotLike(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            notLike("processors",processors);
        }
        return this;
     }


    /**
     * <p>cpu线程数</p>
     * LIKE '%值'  entity().getProcessors()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsLikeLeft(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            likeLeft("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * LIKE '值%'  entity().getProcessors()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsLikeRight(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            likeRight("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 等于 =
     * @param processors       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsEq(Integer processors){
        if(processors!=null){
            eq("processors",processors);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * 不等于 &lt;&gt;
     * @param processors       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsNe(Integer processors){
        if(processors!=null){
            ne("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 大于 &gt;
     * @param processors       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsGt(Integer processors){
        if(processors!=null){
            gt("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 大于等于 &gt;=
     * @param processors       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsGe(Integer processors){
        if(processors!=null){
            ge("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 小于 &lt;
     * @param processors       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsLt(Integer processors){
        if(processors!=null){
            lt("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 小于等于 &lt;=
     * @param processors       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsLe(Integer processors){
        if(processors!=null){
            le("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * LIKE '%值%'
     * @param processors       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsLike(Integer processors){
        if(processors!=null){
            like("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * NOT LIKE '%值%'
     * @param processors       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsNotLike(Integer processors){
        if(processors!=null){
            notLike("processors",processors);
        }
        return this;
     }


    /**
     * <p>cpu线程数</p>
     * LIKE '%值'
     * @param processors       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsLikeLeft(Integer processors){
        if(processors!=null){
            likeLeft("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * LIKE '值%'
     * @param processors       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsLikeRight(Integer processors){
        if(processors!=null){
            likeRight("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsIsNull(){
        isNull("processors");
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsIsNotNull(){
        isNotNull("processors");
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("processors",value);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsIn(Integer... values){
        if(values!=null && values.length>0){
            in("processors",values);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("processors",value);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper processorsNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("processors",values);
        }
        return this;
    }


    /**
     * <p>修订版本号</p>
     * 等于 = entity().getBuildId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdEq(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            eq("build_id",buildId);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * 不等于 &lt;&gt; entity().getBuildId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdNe(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            ne("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 大于 &gt; entity().getBuildId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdGt(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            gt("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 大于等于 &gt;= entity().getBuildId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdGe(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            ge("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 小于 &lt; entity().getBuildId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdLt(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            lt("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 小于等于 &lt;= entity().getBuildId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdLe(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            le("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * BETWEEN  entity().getBuildId() AND buildIdEnd
     * @param buildIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdBetween(String buildIdEnd){
        String buildId =entity().getBuildId();
        if(buildId!=null && buildIdEnd!=null){
            between("build_id",buildId,buildIdEnd);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * NOT BETWEEN  entity().getBuildId() AND 值2
     * @param buildIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdNotBetween(String buildIdEnd){
        String buildId =entity().getBuildId();
        if(buildId!=null && buildIdEnd!=null){
            notBetween("build_id",buildId,buildIdEnd);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * BETWEEN  entity().getBuildId() AND 值2
     * @param buildIdStart       值1
     * @param buildIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdBetween(String buildIdStart,String buildIdEnd){
        String buildId =entity().getBuildId();
        if(buildId!=null && buildIdEnd!=null){
            between("build_id",buildIdStart,buildIdEnd);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * NOT BETWEEN  entity().getBuildId() AND 值2
     * @param buildIdStart       值1
     * @param buildIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdNotBetween(String buildIdStart,String buildIdEnd){
        String buildId =entity().getBuildId();
        if(buildId!=null && buildIdEnd!=null){
            notBetween("build_id",buildIdStart,buildIdEnd);
        }
        return this;
     }


    /**
     * <p>修订版本号</p>
     * LIKE '%值%'  entity().getBuildId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdLike(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            like("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * NOT LIKE '%值%'  entity().getBuildId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdNotLike(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            notLike("build_id",buildId);
        }
        return this;
     }


    /**
     * <p>修订版本号</p>
     * LIKE '%值'  entity().getBuildId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdLikeLeft(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            likeLeft("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * LIKE '值%'  entity().getBuildId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdLikeRight(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            likeRight("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 等于 =
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdEq(String buildId){
        if(buildId!=null){
            eq("build_id",buildId);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * 不等于 &lt;&gt;
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdNe(String buildId){
        if(buildId!=null){
            ne("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 大于 &gt;
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdGt(String buildId){
        if(buildId!=null){
            gt("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 大于等于 &gt;=
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdGe(String buildId){
        if(buildId!=null){
            ge("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 小于 &lt;
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdLt(String buildId){
        if(buildId!=null){
            lt("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 小于等于 &lt;=
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdLe(String buildId){
        if(buildId!=null){
            le("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * LIKE '%值%'
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdLike(String buildId){
        if(buildId!=null){
            like("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * NOT LIKE '%值%'
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdNotLike(String buildId){
        if(buildId!=null){
            notLike("build_id",buildId);
        }
        return this;
     }


    /**
     * <p>修订版本号</p>
     * LIKE '%值'
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdLikeLeft(String buildId){
        if(buildId!=null){
            likeLeft("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * LIKE '值%'
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdLikeRight(String buildId){
        if(buildId!=null){
            likeRight("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdIsNull(){
        isNull("build_id");
        return this;
    }

    /**
     * <p>修订版本号</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdIsNotNull(){
        isNotNull("build_id");
        return this;
    }

    /**
     * <p>修订版本号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_id",value);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdIn(String... values){
        if(values!=null && values.length>0){
            in("build_id",values);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_id",value);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_id",values);
        }
        return this;
    }


    /**
     * <p>build_radio</p>
     * 等于 = entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioEq(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            eq("build_radio",buildRadio);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * 不等于 &lt;&gt; entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioNe(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            ne("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 大于 &gt; entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioGt(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            gt("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 大于等于 &gt;= entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioGe(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            ge("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 小于 &lt; entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioLt(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            lt("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 小于等于 &lt;= entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioLe(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            le("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * BETWEEN  entity().getBuildRadio() AND buildRadioEnd
     * @param buildRadioEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioBetween(String buildRadioEnd){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null && buildRadioEnd!=null){
            between("build_radio",buildRadio,buildRadioEnd);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * NOT BETWEEN  entity().getBuildRadio() AND 值2
     * @param buildRadioEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioNotBetween(String buildRadioEnd){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null && buildRadioEnd!=null){
            notBetween("build_radio",buildRadio,buildRadioEnd);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * BETWEEN  entity().getBuildRadio() AND 值2
     * @param buildRadioStart       值1
     * @param buildRadioEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioBetween(String buildRadioStart,String buildRadioEnd){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null && buildRadioEnd!=null){
            between("build_radio",buildRadioStart,buildRadioEnd);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * NOT BETWEEN  entity().getBuildRadio() AND 值2
     * @param buildRadioStart       值1
     * @param buildRadioEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioNotBetween(String buildRadioStart,String buildRadioEnd){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null && buildRadioEnd!=null){
            notBetween("build_radio",buildRadioStart,buildRadioEnd);
        }
        return this;
     }


    /**
     * <p>build_radio</p>
     * LIKE '%值%'  entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioLike(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            like("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * NOT LIKE '%值%'  entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioNotLike(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            notLike("build_radio",buildRadio);
        }
        return this;
     }


    /**
     * <p>build_radio</p>
     * LIKE '%值'  entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioLikeLeft(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            likeLeft("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * LIKE '值%'  entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioLikeRight(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            likeRight("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 等于 =
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioEq(String buildRadio){
        if(buildRadio!=null){
            eq("build_radio",buildRadio);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * 不等于 &lt;&gt;
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioNe(String buildRadio){
        if(buildRadio!=null){
            ne("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 大于 &gt;
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioGt(String buildRadio){
        if(buildRadio!=null){
            gt("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 大于等于 &gt;=
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioGe(String buildRadio){
        if(buildRadio!=null){
            ge("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 小于 &lt;
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioLt(String buildRadio){
        if(buildRadio!=null){
            lt("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 小于等于 &lt;=
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioLe(String buildRadio){
        if(buildRadio!=null){
            le("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * LIKE '%值%'
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioLike(String buildRadio){
        if(buildRadio!=null){
            like("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * NOT LIKE '%值%'
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioNotLike(String buildRadio){
        if(buildRadio!=null){
            notLike("build_radio",buildRadio);
        }
        return this;
     }


    /**
     * <p>build_radio</p>
     * LIKE '%值'
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioLikeLeft(String buildRadio){
        if(buildRadio!=null){
            likeLeft("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * LIKE '值%'
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioLikeRight(String buildRadio){
        if(buildRadio!=null){
            likeRight("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioIsNull(){
        isNull("build_radio");
        return this;
    }

    /**
     * <p>build_radio</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioIsNotNull(){
        isNotNull("build_radio");
        return this;
    }

    /**
     * <p>build_radio</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_radio",value);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioIn(String... values){
        if(values!=null && values.length>0){
            in("build_radio",values);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_radio",value);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildRadioNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_radio",values);
        }
        return this;
    }


    /**
     * <p>版本即最终用户可见的名称</p>
     * 等于 = entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelEq(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            eq("build_model",buildModel);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 不等于 &lt;&gt; entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelNe(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            ne("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 大于 &gt; entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelGt(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            gt("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 大于等于 &gt;= entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelGe(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            ge("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 小于 &lt; entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelLt(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            lt("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 小于等于 &lt;= entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelLe(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            le("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * BETWEEN  entity().getBuildModel() AND buildModelEnd
     * @param buildModelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelBetween(String buildModelEnd){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null && buildModelEnd!=null){
            between("build_model",buildModel,buildModelEnd);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * NOT BETWEEN  entity().getBuildModel() AND 值2
     * @param buildModelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelNotBetween(String buildModelEnd){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null && buildModelEnd!=null){
            notBetween("build_model",buildModel,buildModelEnd);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * BETWEEN  entity().getBuildModel() AND 值2
     * @param buildModelStart       值1
     * @param buildModelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelBetween(String buildModelStart,String buildModelEnd){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null && buildModelEnd!=null){
            between("build_model",buildModelStart,buildModelEnd);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * NOT BETWEEN  entity().getBuildModel() AND 值2
     * @param buildModelStart       值1
     * @param buildModelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelNotBetween(String buildModelStart,String buildModelEnd){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null && buildModelEnd!=null){
            notBetween("build_model",buildModelStart,buildModelEnd);
        }
        return this;
     }


    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '%值%'  entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelLike(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            like("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * NOT LIKE '%值%'  entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelNotLike(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            notLike("build_model",buildModel);
        }
        return this;
     }


    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '%值'  entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelLikeLeft(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            likeLeft("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '值%'  entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelLikeRight(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            likeRight("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 等于 =
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelEq(String buildModel){
        if(buildModel!=null){
            eq("build_model",buildModel);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 不等于 &lt;&gt;
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelNe(String buildModel){
        if(buildModel!=null){
            ne("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 大于 &gt;
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelGt(String buildModel){
        if(buildModel!=null){
            gt("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 大于等于 &gt;=
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelGe(String buildModel){
        if(buildModel!=null){
            ge("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 小于 &lt;
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelLt(String buildModel){
        if(buildModel!=null){
            lt("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 小于等于 &lt;=
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelLe(String buildModel){
        if(buildModel!=null){
            le("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '%值%'
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelLike(String buildModel){
        if(buildModel!=null){
            like("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * NOT LIKE '%值%'
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelNotLike(String buildModel){
        if(buildModel!=null){
            notLike("build_model",buildModel);
        }
        return this;
     }


    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '%值'
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelLikeLeft(String buildModel){
        if(buildModel!=null){
            likeLeft("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '值%'
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelLikeRight(String buildModel){
        if(buildModel!=null){
            likeRight("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelIsNull(){
        isNull("build_model");
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelIsNotNull(){
        isNotNull("build_model");
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_model",value);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelIn(String... values){
        if(values!=null && values.length>0){
            in("build_model",values);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_model",value);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildModelNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_model",values);
        }
        return this;
    }


    /**
     * <p>硬件制造商</p>
     * 等于 = entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerEq(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            eq("build_manufacturer",buildManufacturer);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * 不等于 &lt;&gt; entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerNe(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            ne("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 大于 &gt; entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerGt(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            gt("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 大于等于 &gt;= entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerGe(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            ge("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 小于 &lt; entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerLt(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            lt("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 小于等于 &lt;= entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerLe(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            le("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * BETWEEN  entity().getBuildManufacturer() AND buildManufacturerEnd
     * @param buildManufacturerEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerBetween(String buildManufacturerEnd){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null && buildManufacturerEnd!=null){
            between("build_manufacturer",buildManufacturer,buildManufacturerEnd);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * NOT BETWEEN  entity().getBuildManufacturer() AND 值2
     * @param buildManufacturerEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerNotBetween(String buildManufacturerEnd){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null && buildManufacturerEnd!=null){
            notBetween("build_manufacturer",buildManufacturer,buildManufacturerEnd);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * BETWEEN  entity().getBuildManufacturer() AND 值2
     * @param buildManufacturerStart       值1
     * @param buildManufacturerEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerBetween(String buildManufacturerStart,String buildManufacturerEnd){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null && buildManufacturerEnd!=null){
            between("build_manufacturer",buildManufacturerStart,buildManufacturerEnd);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * NOT BETWEEN  entity().getBuildManufacturer() AND 值2
     * @param buildManufacturerStart       值1
     * @param buildManufacturerEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerNotBetween(String buildManufacturerStart,String buildManufacturerEnd){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null && buildManufacturerEnd!=null){
            notBetween("build_manufacturer",buildManufacturerStart,buildManufacturerEnd);
        }
        return this;
     }


    /**
     * <p>硬件制造商</p>
     * LIKE '%值%'  entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerLike(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            like("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * NOT LIKE '%值%'  entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerNotLike(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            notLike("build_manufacturer",buildManufacturer);
        }
        return this;
     }


    /**
     * <p>硬件制造商</p>
     * LIKE '%值'  entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerLikeLeft(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            likeLeft("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * LIKE '值%'  entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerLikeRight(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            likeRight("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 等于 =
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerEq(String buildManufacturer){
        if(buildManufacturer!=null){
            eq("build_manufacturer",buildManufacturer);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * 不等于 &lt;&gt;
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerNe(String buildManufacturer){
        if(buildManufacturer!=null){
            ne("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 大于 &gt;
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerGt(String buildManufacturer){
        if(buildManufacturer!=null){
            gt("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 大于等于 &gt;=
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerGe(String buildManufacturer){
        if(buildManufacturer!=null){
            ge("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 小于 &lt;
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerLt(String buildManufacturer){
        if(buildManufacturer!=null){
            lt("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 小于等于 &lt;=
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerLe(String buildManufacturer){
        if(buildManufacturer!=null){
            le("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * LIKE '%值%'
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerLike(String buildManufacturer){
        if(buildManufacturer!=null){
            like("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * NOT LIKE '%值%'
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerNotLike(String buildManufacturer){
        if(buildManufacturer!=null){
            notLike("build_manufacturer",buildManufacturer);
        }
        return this;
     }


    /**
     * <p>硬件制造商</p>
     * LIKE '%值'
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerLikeLeft(String buildManufacturer){
        if(buildManufacturer!=null){
            likeLeft("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * LIKE '值%'
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerLikeRight(String buildManufacturer){
        if(buildManufacturer!=null){
            likeRight("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerIsNull(){
        isNull("build_manufacturer");
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerIsNotNull(){
        isNotNull("build_manufacturer");
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_manufacturer",value);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerIn(String... values){
        if(values!=null && values.length>0){
            in("build_manufacturer",values);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_manufacturer",value);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildManufacturerNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_manufacturer",values);
        }
        return this;
    }


    /**
     * <p>build_bootloader</p>
     * 等于 = entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderEq(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            eq("build_bootloader",buildBootloader);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * 不等于 &lt;&gt; entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderNe(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            ne("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 大于 &gt; entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderGt(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            gt("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 大于等于 &gt;= entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderGe(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            ge("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 小于 &lt; entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderLt(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            lt("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 小于等于 &lt;= entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderLe(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            le("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * BETWEEN  entity().getBuildBootloader() AND buildBootloaderEnd
     * @param buildBootloaderEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderBetween(String buildBootloaderEnd){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null && buildBootloaderEnd!=null){
            between("build_bootloader",buildBootloader,buildBootloaderEnd);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * NOT BETWEEN  entity().getBuildBootloader() AND 值2
     * @param buildBootloaderEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderNotBetween(String buildBootloaderEnd){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null && buildBootloaderEnd!=null){
            notBetween("build_bootloader",buildBootloader,buildBootloaderEnd);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * BETWEEN  entity().getBuildBootloader() AND 值2
     * @param buildBootloaderStart       值1
     * @param buildBootloaderEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderBetween(String buildBootloaderStart,String buildBootloaderEnd){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null && buildBootloaderEnd!=null){
            between("build_bootloader",buildBootloaderStart,buildBootloaderEnd);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * NOT BETWEEN  entity().getBuildBootloader() AND 值2
     * @param buildBootloaderStart       值1
     * @param buildBootloaderEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderNotBetween(String buildBootloaderStart,String buildBootloaderEnd){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null && buildBootloaderEnd!=null){
            notBetween("build_bootloader",buildBootloaderStart,buildBootloaderEnd);
        }
        return this;
     }


    /**
     * <p>build_bootloader</p>
     * LIKE '%值%'  entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderLike(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            like("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * NOT LIKE '%值%'  entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderNotLike(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            notLike("build_bootloader",buildBootloader);
        }
        return this;
     }


    /**
     * <p>build_bootloader</p>
     * LIKE '%值'  entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderLikeLeft(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            likeLeft("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * LIKE '值%'  entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderLikeRight(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            likeRight("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 等于 =
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderEq(String buildBootloader){
        if(buildBootloader!=null){
            eq("build_bootloader",buildBootloader);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * 不等于 &lt;&gt;
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderNe(String buildBootloader){
        if(buildBootloader!=null){
            ne("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 大于 &gt;
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderGt(String buildBootloader){
        if(buildBootloader!=null){
            gt("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 大于等于 &gt;=
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderGe(String buildBootloader){
        if(buildBootloader!=null){
            ge("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 小于 &lt;
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderLt(String buildBootloader){
        if(buildBootloader!=null){
            lt("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 小于等于 &lt;=
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderLe(String buildBootloader){
        if(buildBootloader!=null){
            le("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * LIKE '%值%'
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderLike(String buildBootloader){
        if(buildBootloader!=null){
            like("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * NOT LIKE '%值%'
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderNotLike(String buildBootloader){
        if(buildBootloader!=null){
            notLike("build_bootloader",buildBootloader);
        }
        return this;
     }


    /**
     * <p>build_bootloader</p>
     * LIKE '%值'
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderLikeLeft(String buildBootloader){
        if(buildBootloader!=null){
            likeLeft("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * LIKE '值%'
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderLikeRight(String buildBootloader){
        if(buildBootloader!=null){
            likeRight("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderIsNull(){
        isNull("build_bootloader");
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderIsNotNull(){
        isNotNull("build_bootloader");
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_bootloader",value);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderIn(String... values){
        if(values!=null && values.length>0){
            in("build_bootloader",values);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_bootloader",value);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBootloaderNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_bootloader",values);
        }
        return this;
    }


    /**
     * <p>主板</p>
     * 等于 = entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardEq(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            eq("build_board",buildBoard);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * 不等于 &lt;&gt; entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardNe(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            ne("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 大于 &gt; entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardGt(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            gt("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 大于等于 &gt;= entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardGe(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            ge("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 小于 &lt; entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardLt(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            lt("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 小于等于 &lt;= entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardLe(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            le("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * BETWEEN  entity().getBuildBoard() AND buildBoardEnd
     * @param buildBoardEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardBetween(String buildBoardEnd){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null && buildBoardEnd!=null){
            between("build_board",buildBoard,buildBoardEnd);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * NOT BETWEEN  entity().getBuildBoard() AND 值2
     * @param buildBoardEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardNotBetween(String buildBoardEnd){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null && buildBoardEnd!=null){
            notBetween("build_board",buildBoard,buildBoardEnd);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * BETWEEN  entity().getBuildBoard() AND 值2
     * @param buildBoardStart       值1
     * @param buildBoardEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardBetween(String buildBoardStart,String buildBoardEnd){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null && buildBoardEnd!=null){
            between("build_board",buildBoardStart,buildBoardEnd);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * NOT BETWEEN  entity().getBuildBoard() AND 值2
     * @param buildBoardStart       值1
     * @param buildBoardEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardNotBetween(String buildBoardStart,String buildBoardEnd){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null && buildBoardEnd!=null){
            notBetween("build_board",buildBoardStart,buildBoardEnd);
        }
        return this;
     }


    /**
     * <p>主板</p>
     * LIKE '%值%'  entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardLike(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            like("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * NOT LIKE '%值%'  entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardNotLike(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            notLike("build_board",buildBoard);
        }
        return this;
     }


    /**
     * <p>主板</p>
     * LIKE '%值'  entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardLikeLeft(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            likeLeft("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * LIKE '值%'  entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardLikeRight(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            likeRight("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 等于 =
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardEq(String buildBoard){
        if(buildBoard!=null){
            eq("build_board",buildBoard);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * 不等于 &lt;&gt;
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardNe(String buildBoard){
        if(buildBoard!=null){
            ne("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 大于 &gt;
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardGt(String buildBoard){
        if(buildBoard!=null){
            gt("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 大于等于 &gt;=
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardGe(String buildBoard){
        if(buildBoard!=null){
            ge("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 小于 &lt;
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardLt(String buildBoard){
        if(buildBoard!=null){
            lt("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 小于等于 &lt;=
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardLe(String buildBoard){
        if(buildBoard!=null){
            le("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * LIKE '%值%'
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardLike(String buildBoard){
        if(buildBoard!=null){
            like("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * NOT LIKE '%值%'
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardNotLike(String buildBoard){
        if(buildBoard!=null){
            notLike("build_board",buildBoard);
        }
        return this;
     }


    /**
     * <p>主板</p>
     * LIKE '%值'
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardLikeLeft(String buildBoard){
        if(buildBoard!=null){
            likeLeft("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * LIKE '值%'
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardLikeRight(String buildBoard){
        if(buildBoard!=null){
            likeRight("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardIsNull(){
        isNull("build_board");
        return this;
    }

    /**
     * <p>主板</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardIsNotNull(){
        isNotNull("build_board");
        return this;
    }

    /**
     * <p>主板</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_board",value);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardIn(String... values){
        if(values!=null && values.length>0){
            in("build_board",values);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_board",value);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBoardNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_board",values);
        }
        return this;
    }


    /**
     * <p>系统定制商</p>
     * 等于 = entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandEq(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            eq("build_brand",buildBrand);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * 不等于 &lt;&gt; entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandNe(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            ne("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 大于 &gt; entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandGt(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            gt("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 大于等于 &gt;= entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandGe(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            ge("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 小于 &lt; entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandLt(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            lt("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 小于等于 &lt;= entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandLe(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            le("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * BETWEEN  entity().getBuildBrand() AND buildBrandEnd
     * @param buildBrandEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandBetween(String buildBrandEnd){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null && buildBrandEnd!=null){
            between("build_brand",buildBrand,buildBrandEnd);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * NOT BETWEEN  entity().getBuildBrand() AND 值2
     * @param buildBrandEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandNotBetween(String buildBrandEnd){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null && buildBrandEnd!=null){
            notBetween("build_brand",buildBrand,buildBrandEnd);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * BETWEEN  entity().getBuildBrand() AND 值2
     * @param buildBrandStart       值1
     * @param buildBrandEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandBetween(String buildBrandStart,String buildBrandEnd){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null && buildBrandEnd!=null){
            between("build_brand",buildBrandStart,buildBrandEnd);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * NOT BETWEEN  entity().getBuildBrand() AND 值2
     * @param buildBrandStart       值1
     * @param buildBrandEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandNotBetween(String buildBrandStart,String buildBrandEnd){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null && buildBrandEnd!=null){
            notBetween("build_brand",buildBrandStart,buildBrandEnd);
        }
        return this;
     }


    /**
     * <p>系统定制商</p>
     * LIKE '%值%'  entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandLike(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            like("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * NOT LIKE '%值%'  entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandNotLike(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            notLike("build_brand",buildBrand);
        }
        return this;
     }


    /**
     * <p>系统定制商</p>
     * LIKE '%值'  entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandLikeLeft(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            likeLeft("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * LIKE '值%'  entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandLikeRight(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            likeRight("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 等于 =
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandEq(String buildBrand){
        if(buildBrand!=null){
            eq("build_brand",buildBrand);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * 不等于 &lt;&gt;
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandNe(String buildBrand){
        if(buildBrand!=null){
            ne("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 大于 &gt;
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandGt(String buildBrand){
        if(buildBrand!=null){
            gt("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 大于等于 &gt;=
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandGe(String buildBrand){
        if(buildBrand!=null){
            ge("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 小于 &lt;
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandLt(String buildBrand){
        if(buildBrand!=null){
            lt("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 小于等于 &lt;=
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandLe(String buildBrand){
        if(buildBrand!=null){
            le("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * LIKE '%值%'
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandLike(String buildBrand){
        if(buildBrand!=null){
            like("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * NOT LIKE '%值%'
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandNotLike(String buildBrand){
        if(buildBrand!=null){
            notLike("build_brand",buildBrand);
        }
        return this;
     }


    /**
     * <p>系统定制商</p>
     * LIKE '%值'
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandLikeLeft(String buildBrand){
        if(buildBrand!=null){
            likeLeft("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * LIKE '值%'
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandLikeRight(String buildBrand){
        if(buildBrand!=null){
            likeRight("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandIsNull(){
        isNull("build_brand");
        return this;
    }

    /**
     * <p>系统定制商</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandIsNotNull(){
        isNotNull("build_brand");
        return this;
    }

    /**
     * <p>系统定制商</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_brand",value);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandIn(String... values){
        if(values!=null && values.length>0){
            in("build_brand",values);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_brand",value);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildBrandNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_brand",values);
        }
        return this;
    }


    /**
     * <p>build_cpu_abi</p>
     * 等于 = entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiEq(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            eq("build_cpu_abi",buildCpuAbi);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * 不等于 &lt;&gt; entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiNe(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            ne("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 大于 &gt; entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiGt(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            gt("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 大于等于 &gt;= entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiGe(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            ge("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 小于 &lt; entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiLt(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            lt("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 小于等于 &lt;= entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiLe(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            le("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * BETWEEN  entity().getBuildCpuAbi() AND buildCpuAbiEnd
     * @param buildCpuAbiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiBetween(String buildCpuAbiEnd){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null && buildCpuAbiEnd!=null){
            between("build_cpu_abi",buildCpuAbi,buildCpuAbiEnd);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * NOT BETWEEN  entity().getBuildCpuAbi() AND 值2
     * @param buildCpuAbiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiNotBetween(String buildCpuAbiEnd){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null && buildCpuAbiEnd!=null){
            notBetween("build_cpu_abi",buildCpuAbi,buildCpuAbiEnd);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * BETWEEN  entity().getBuildCpuAbi() AND 值2
     * @param buildCpuAbiStart       值1
     * @param buildCpuAbiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiBetween(String buildCpuAbiStart,String buildCpuAbiEnd){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null && buildCpuAbiEnd!=null){
            between("build_cpu_abi",buildCpuAbiStart,buildCpuAbiEnd);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * NOT BETWEEN  entity().getBuildCpuAbi() AND 值2
     * @param buildCpuAbiStart       值1
     * @param buildCpuAbiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiNotBetween(String buildCpuAbiStart,String buildCpuAbiEnd){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null && buildCpuAbiEnd!=null){
            notBetween("build_cpu_abi",buildCpuAbiStart,buildCpuAbiEnd);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi</p>
     * LIKE '%值%'  entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiLike(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            like("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * NOT LIKE '%值%'  entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiNotLike(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            notLike("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi</p>
     * LIKE '%值'  entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiLikeLeft(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            likeLeft("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * LIKE '值%'  entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiLikeRight(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            likeRight("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 等于 =
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiEq(String buildCpuAbi){
        if(buildCpuAbi!=null){
            eq("build_cpu_abi",buildCpuAbi);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * 不等于 &lt;&gt;
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiNe(String buildCpuAbi){
        if(buildCpuAbi!=null){
            ne("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 大于 &gt;
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiGt(String buildCpuAbi){
        if(buildCpuAbi!=null){
            gt("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 大于等于 &gt;=
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiGe(String buildCpuAbi){
        if(buildCpuAbi!=null){
            ge("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 小于 &lt;
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiLt(String buildCpuAbi){
        if(buildCpuAbi!=null){
            lt("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 小于等于 &lt;=
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiLe(String buildCpuAbi){
        if(buildCpuAbi!=null){
            le("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * LIKE '%值%'
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiLike(String buildCpuAbi){
        if(buildCpuAbi!=null){
            like("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * NOT LIKE '%值%'
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiNotLike(String buildCpuAbi){
        if(buildCpuAbi!=null){
            notLike("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi</p>
     * LIKE '%值'
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiLikeLeft(String buildCpuAbi){
        if(buildCpuAbi!=null){
            likeLeft("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * LIKE '值%'
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiLikeRight(String buildCpuAbi){
        if(buildCpuAbi!=null){
            likeRight("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiIsNull(){
        isNull("build_cpu_abi");
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiIsNotNull(){
        isNotNull("build_cpu_abi");
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_cpu_abi",value);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiIn(String... values){
        if(values!=null && values.length>0){
            in("build_cpu_abi",values);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_cpu_abi",value);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbiNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_cpu_abi",values);
        }
        return this;
    }


    /**
     * <p>build_cpu_abi2</p>
     * 等于 = entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Eq(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            eq("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * 不等于 &lt;&gt; entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Ne(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            ne("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 大于 &gt; entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Gt(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            gt("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 大于等于 &gt;= entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Ge(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            ge("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 小于 &lt; entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Lt(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            lt("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 小于等于 &lt;= entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Le(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            le("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * BETWEEN  entity().getBuildCpuAbi2() AND buildCpuAbi2End
     * @param buildCpuAbi2End      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Between(String buildCpuAbi2End){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null && buildCpuAbi2End!=null){
            between("build_cpu_abi2",buildCpuAbi2,buildCpuAbi2End);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * NOT BETWEEN  entity().getBuildCpuAbi2() AND 值2
     * @param buildCpuAbi2End      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2NotBetween(String buildCpuAbi2End){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null && buildCpuAbi2End!=null){
            notBetween("build_cpu_abi2",buildCpuAbi2,buildCpuAbi2End);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * BETWEEN  entity().getBuildCpuAbi2() AND 值2
     * @param buildCpuAbi2Start       值1
     * @param buildCpuAbi2End      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Between(String buildCpuAbi2Start,String buildCpuAbi2End){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null && buildCpuAbi2End!=null){
            between("build_cpu_abi2",buildCpuAbi2Start,buildCpuAbi2End);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * NOT BETWEEN  entity().getBuildCpuAbi2() AND 值2
     * @param buildCpuAbi2Start       值1
     * @param buildCpuAbi2End      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2NotBetween(String buildCpuAbi2Start,String buildCpuAbi2End){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null && buildCpuAbi2End!=null){
            notBetween("build_cpu_abi2",buildCpuAbi2Start,buildCpuAbi2End);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi2</p>
     * LIKE '%值%'  entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Like(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            like("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * NOT LIKE '%值%'  entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2NotLike(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            notLike("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi2</p>
     * LIKE '%值'  entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2LikeLeft(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            likeLeft("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * LIKE '值%'  entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2LikeRight(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            likeRight("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 等于 =
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Eq(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            eq("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * 不等于 &lt;&gt;
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Ne(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            ne("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 大于 &gt;
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Gt(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            gt("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 大于等于 &gt;=
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Ge(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            ge("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 小于 &lt;
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Lt(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            lt("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 小于等于 &lt;=
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Le(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            le("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * LIKE '%值%'
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2Like(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            like("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * NOT LIKE '%值%'
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2NotLike(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            notLike("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi2</p>
     * LIKE '%值'
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2LikeLeft(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            likeLeft("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * LIKE '值%'
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2LikeRight(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            likeRight("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2IsNull(){
        isNull("build_cpu_abi2");
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2IsNotNull(){
        isNotNull("build_cpu_abi2");
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2In(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_cpu_abi2",value);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2In(String... values){
        if(values!=null && values.length>0){
            in("build_cpu_abi2",values);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2NotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_cpu_abi2",value);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildCpuAbi2NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_cpu_abi2",values);
        }
        return this;
    }


    /**
     * <p>设备参数</p>
     * 等于 = entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceEq(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            eq("build_device",buildDevice);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * 不等于 &lt;&gt; entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceNe(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            ne("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 大于 &gt; entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceGt(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            gt("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 大于等于 &gt;= entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceGe(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            ge("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 小于 &lt; entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceLt(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            lt("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 小于等于 &lt;= entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceLe(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            le("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * BETWEEN  entity().getBuildDevice() AND buildDeviceEnd
     * @param buildDeviceEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceBetween(String buildDeviceEnd){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null && buildDeviceEnd!=null){
            between("build_device",buildDevice,buildDeviceEnd);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * NOT BETWEEN  entity().getBuildDevice() AND 值2
     * @param buildDeviceEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceNotBetween(String buildDeviceEnd){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null && buildDeviceEnd!=null){
            notBetween("build_device",buildDevice,buildDeviceEnd);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * BETWEEN  entity().getBuildDevice() AND 值2
     * @param buildDeviceStart       值1
     * @param buildDeviceEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceBetween(String buildDeviceStart,String buildDeviceEnd){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null && buildDeviceEnd!=null){
            between("build_device",buildDeviceStart,buildDeviceEnd);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * NOT BETWEEN  entity().getBuildDevice() AND 值2
     * @param buildDeviceStart       值1
     * @param buildDeviceEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceNotBetween(String buildDeviceStart,String buildDeviceEnd){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null && buildDeviceEnd!=null){
            notBetween("build_device",buildDeviceStart,buildDeviceEnd);
        }
        return this;
     }


    /**
     * <p>设备参数</p>
     * LIKE '%值%'  entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceLike(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            like("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * NOT LIKE '%值%'  entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceNotLike(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            notLike("build_device",buildDevice);
        }
        return this;
     }


    /**
     * <p>设备参数</p>
     * LIKE '%值'  entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceLikeLeft(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            likeLeft("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * LIKE '值%'  entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceLikeRight(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            likeRight("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 等于 =
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceEq(String buildDevice){
        if(buildDevice!=null){
            eq("build_device",buildDevice);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * 不等于 &lt;&gt;
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceNe(String buildDevice){
        if(buildDevice!=null){
            ne("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 大于 &gt;
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceGt(String buildDevice){
        if(buildDevice!=null){
            gt("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 大于等于 &gt;=
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceGe(String buildDevice){
        if(buildDevice!=null){
            ge("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 小于 &lt;
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceLt(String buildDevice){
        if(buildDevice!=null){
            lt("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 小于等于 &lt;=
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceLe(String buildDevice){
        if(buildDevice!=null){
            le("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * LIKE '%值%'
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceLike(String buildDevice){
        if(buildDevice!=null){
            like("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * NOT LIKE '%值%'
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceNotLike(String buildDevice){
        if(buildDevice!=null){
            notLike("build_device",buildDevice);
        }
        return this;
     }


    /**
     * <p>设备参数</p>
     * LIKE '%值'
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceLikeLeft(String buildDevice){
        if(buildDevice!=null){
            likeLeft("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * LIKE '值%'
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceLikeRight(String buildDevice){
        if(buildDevice!=null){
            likeRight("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceIsNull(){
        isNull("build_device");
        return this;
    }

    /**
     * <p>设备参数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceIsNotNull(){
        isNotNull("build_device");
        return this;
    }

    /**
     * <p>设备参数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_device",value);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceIn(String... values){
        if(values!=null && values.length>0){
            in("build_device",values);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_device",value);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDeviceNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_device",values);
        }
        return this;
    }


    /**
     * <p>显示屏参数</p>
     * 等于 = entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayEq(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            eq("build_display",buildDisplay);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * 不等于 &lt;&gt; entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayNe(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            ne("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 大于 &gt; entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayGt(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            gt("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 大于等于 &gt;= entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayGe(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            ge("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 小于 &lt; entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayLt(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            lt("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 小于等于 &lt;= entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayLe(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            le("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * BETWEEN  entity().getBuildDisplay() AND buildDisplayEnd
     * @param buildDisplayEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayBetween(String buildDisplayEnd){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null && buildDisplayEnd!=null){
            between("build_display",buildDisplay,buildDisplayEnd);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * NOT BETWEEN  entity().getBuildDisplay() AND 值2
     * @param buildDisplayEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayNotBetween(String buildDisplayEnd){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null && buildDisplayEnd!=null){
            notBetween("build_display",buildDisplay,buildDisplayEnd);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * BETWEEN  entity().getBuildDisplay() AND 值2
     * @param buildDisplayStart       值1
     * @param buildDisplayEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayBetween(String buildDisplayStart,String buildDisplayEnd){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null && buildDisplayEnd!=null){
            between("build_display",buildDisplayStart,buildDisplayEnd);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * NOT BETWEEN  entity().getBuildDisplay() AND 值2
     * @param buildDisplayStart       值1
     * @param buildDisplayEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayNotBetween(String buildDisplayStart,String buildDisplayEnd){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null && buildDisplayEnd!=null){
            notBetween("build_display",buildDisplayStart,buildDisplayEnd);
        }
        return this;
     }


    /**
     * <p>显示屏参数</p>
     * LIKE '%值%'  entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayLike(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            like("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * NOT LIKE '%值%'  entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayNotLike(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            notLike("build_display",buildDisplay);
        }
        return this;
     }


    /**
     * <p>显示屏参数</p>
     * LIKE '%值'  entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayLikeLeft(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            likeLeft("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * LIKE '值%'  entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayLikeRight(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            likeRight("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 等于 =
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayEq(String buildDisplay){
        if(buildDisplay!=null){
            eq("build_display",buildDisplay);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * 不等于 &lt;&gt;
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayNe(String buildDisplay){
        if(buildDisplay!=null){
            ne("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 大于 &gt;
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayGt(String buildDisplay){
        if(buildDisplay!=null){
            gt("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 大于等于 &gt;=
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayGe(String buildDisplay){
        if(buildDisplay!=null){
            ge("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 小于 &lt;
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayLt(String buildDisplay){
        if(buildDisplay!=null){
            lt("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 小于等于 &lt;=
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayLe(String buildDisplay){
        if(buildDisplay!=null){
            le("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * LIKE '%值%'
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayLike(String buildDisplay){
        if(buildDisplay!=null){
            like("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * NOT LIKE '%值%'
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayNotLike(String buildDisplay){
        if(buildDisplay!=null){
            notLike("build_display",buildDisplay);
        }
        return this;
     }


    /**
     * <p>显示屏参数</p>
     * LIKE '%值'
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayLikeLeft(String buildDisplay){
        if(buildDisplay!=null){
            likeLeft("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * LIKE '值%'
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayLikeRight(String buildDisplay){
        if(buildDisplay!=null){
            likeRight("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayIsNull(){
        isNull("build_display");
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayIsNotNull(){
        isNotNull("build_display");
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_display",value);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayIn(String... values){
        if(values!=null && values.length>0){
            in("build_display",values);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_display",value);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildDisplayNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_display",values);
        }
        return this;
    }


    /**
     * <p>唯一识别码</p>
     * 等于 = entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintEq(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            eq("build_fingerprint",buildFingerprint);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * 不等于 &lt;&gt; entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintNe(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            ne("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 大于 &gt; entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintGt(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            gt("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 大于等于 &gt;= entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintGe(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            ge("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 小于 &lt; entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintLt(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            lt("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 小于等于 &lt;= entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintLe(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            le("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * BETWEEN  entity().getBuildFingerprint() AND buildFingerprintEnd
     * @param buildFingerprintEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintBetween(String buildFingerprintEnd){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null && buildFingerprintEnd!=null){
            between("build_fingerprint",buildFingerprint,buildFingerprintEnd);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * NOT BETWEEN  entity().getBuildFingerprint() AND 值2
     * @param buildFingerprintEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintNotBetween(String buildFingerprintEnd){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null && buildFingerprintEnd!=null){
            notBetween("build_fingerprint",buildFingerprint,buildFingerprintEnd);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * BETWEEN  entity().getBuildFingerprint() AND 值2
     * @param buildFingerprintStart       值1
     * @param buildFingerprintEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintBetween(String buildFingerprintStart,String buildFingerprintEnd){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null && buildFingerprintEnd!=null){
            between("build_fingerprint",buildFingerprintStart,buildFingerprintEnd);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * NOT BETWEEN  entity().getBuildFingerprint() AND 值2
     * @param buildFingerprintStart       值1
     * @param buildFingerprintEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintNotBetween(String buildFingerprintStart,String buildFingerprintEnd){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null && buildFingerprintEnd!=null){
            notBetween("build_fingerprint",buildFingerprintStart,buildFingerprintEnd);
        }
        return this;
     }


    /**
     * <p>唯一识别码</p>
     * LIKE '%值%'  entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintLike(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            like("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * NOT LIKE '%值%'  entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintNotLike(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            notLike("build_fingerprint",buildFingerprint);
        }
        return this;
     }


    /**
     * <p>唯一识别码</p>
     * LIKE '%值'  entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintLikeLeft(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            likeLeft("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * LIKE '值%'  entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintLikeRight(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            likeRight("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 等于 =
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintEq(String buildFingerprint){
        if(buildFingerprint!=null){
            eq("build_fingerprint",buildFingerprint);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * 不等于 &lt;&gt;
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintNe(String buildFingerprint){
        if(buildFingerprint!=null){
            ne("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 大于 &gt;
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintGt(String buildFingerprint){
        if(buildFingerprint!=null){
            gt("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 大于等于 &gt;=
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintGe(String buildFingerprint){
        if(buildFingerprint!=null){
            ge("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 小于 &lt;
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintLt(String buildFingerprint){
        if(buildFingerprint!=null){
            lt("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 小于等于 &lt;=
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintLe(String buildFingerprint){
        if(buildFingerprint!=null){
            le("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * LIKE '%值%'
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintLike(String buildFingerprint){
        if(buildFingerprint!=null){
            like("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * NOT LIKE '%值%'
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintNotLike(String buildFingerprint){
        if(buildFingerprint!=null){
            notLike("build_fingerprint",buildFingerprint);
        }
        return this;
     }


    /**
     * <p>唯一识别码</p>
     * LIKE '%值'
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintLikeLeft(String buildFingerprint){
        if(buildFingerprint!=null){
            likeLeft("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * LIKE '值%'
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintLikeRight(String buildFingerprint){
        if(buildFingerprint!=null){
            likeRight("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintIsNull(){
        isNull("build_fingerprint");
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintIsNotNull(){
        isNotNull("build_fingerprint");
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_fingerprint",value);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintIn(String... values){
        if(values!=null && values.length>0){
            in("build_fingerprint",values);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_fingerprint",value);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildFingerprintNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_fingerprint",values);
        }
        return this;
    }


    /**
     * <p>build_host</p>
     * 等于 = entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostEq(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            eq("build_host",buildHost);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * 不等于 &lt;&gt; entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostNe(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            ne("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 大于 &gt; entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostGt(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            gt("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 大于等于 &gt;= entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostGe(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            ge("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 小于 &lt; entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostLt(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            lt("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 小于等于 &lt;= entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostLe(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            le("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * BETWEEN  entity().getBuildHost() AND buildHostEnd
     * @param buildHostEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostBetween(String buildHostEnd){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null && buildHostEnd!=null){
            between("build_host",buildHost,buildHostEnd);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * NOT BETWEEN  entity().getBuildHost() AND 值2
     * @param buildHostEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostNotBetween(String buildHostEnd){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null && buildHostEnd!=null){
            notBetween("build_host",buildHost,buildHostEnd);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * BETWEEN  entity().getBuildHost() AND 值2
     * @param buildHostStart       值1
     * @param buildHostEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostBetween(String buildHostStart,String buildHostEnd){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null && buildHostEnd!=null){
            between("build_host",buildHostStart,buildHostEnd);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * NOT BETWEEN  entity().getBuildHost() AND 值2
     * @param buildHostStart       值1
     * @param buildHostEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostNotBetween(String buildHostStart,String buildHostEnd){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null && buildHostEnd!=null){
            notBetween("build_host",buildHostStart,buildHostEnd);
        }
        return this;
     }


    /**
     * <p>build_host</p>
     * LIKE '%值%'  entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostLike(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            like("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * NOT LIKE '%值%'  entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostNotLike(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            notLike("build_host",buildHost);
        }
        return this;
     }


    /**
     * <p>build_host</p>
     * LIKE '%值'  entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostLikeLeft(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            likeLeft("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * LIKE '值%'  entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostLikeRight(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            likeRight("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 等于 =
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostEq(String buildHost){
        if(buildHost!=null){
            eq("build_host",buildHost);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * 不等于 &lt;&gt;
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostNe(String buildHost){
        if(buildHost!=null){
            ne("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 大于 &gt;
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostGt(String buildHost){
        if(buildHost!=null){
            gt("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 大于等于 &gt;=
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostGe(String buildHost){
        if(buildHost!=null){
            ge("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 小于 &lt;
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostLt(String buildHost){
        if(buildHost!=null){
            lt("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 小于等于 &lt;=
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostLe(String buildHost){
        if(buildHost!=null){
            le("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * LIKE '%值%'
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostLike(String buildHost){
        if(buildHost!=null){
            like("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * NOT LIKE '%值%'
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostNotLike(String buildHost){
        if(buildHost!=null){
            notLike("build_host",buildHost);
        }
        return this;
     }


    /**
     * <p>build_host</p>
     * LIKE '%值'
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostLikeLeft(String buildHost){
        if(buildHost!=null){
            likeLeft("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * LIKE '值%'
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostLikeRight(String buildHost){
        if(buildHost!=null){
            likeRight("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostIsNull(){
        isNull("build_host");
        return this;
    }

    /**
     * <p>build_host</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostIsNotNull(){
        isNotNull("build_host");
        return this;
    }

    /**
     * <p>build_host</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_host",value);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostIn(String... values){
        if(values!=null && values.length>0){
            in("build_host",values);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_host",value);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHostNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_host",values);
        }
        return this;
    }


    /**
     * <p>整个产品的名称</p>
     * 等于 = entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductEq(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            eq("build_product",buildProduct);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * 不等于 &lt;&gt; entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductNe(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            ne("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 大于 &gt; entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductGt(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            gt("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 大于等于 &gt;= entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductGe(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            ge("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 小于 &lt; entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductLt(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            lt("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 小于等于 &lt;= entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductLe(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            le("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * BETWEEN  entity().getBuildProduct() AND buildProductEnd
     * @param buildProductEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductBetween(String buildProductEnd){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null && buildProductEnd!=null){
            between("build_product",buildProduct,buildProductEnd);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * NOT BETWEEN  entity().getBuildProduct() AND 值2
     * @param buildProductEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductNotBetween(String buildProductEnd){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null && buildProductEnd!=null){
            notBetween("build_product",buildProduct,buildProductEnd);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * BETWEEN  entity().getBuildProduct() AND 值2
     * @param buildProductStart       值1
     * @param buildProductEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductBetween(String buildProductStart,String buildProductEnd){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null && buildProductEnd!=null){
            between("build_product",buildProductStart,buildProductEnd);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * NOT BETWEEN  entity().getBuildProduct() AND 值2
     * @param buildProductStart       值1
     * @param buildProductEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductNotBetween(String buildProductStart,String buildProductEnd){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null && buildProductEnd!=null){
            notBetween("build_product",buildProductStart,buildProductEnd);
        }
        return this;
     }


    /**
     * <p>整个产品的名称</p>
     * LIKE '%值%'  entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductLike(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            like("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * NOT LIKE '%值%'  entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductNotLike(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            notLike("build_product",buildProduct);
        }
        return this;
     }


    /**
     * <p>整个产品的名称</p>
     * LIKE '%值'  entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductLikeLeft(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            likeLeft("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * LIKE '值%'  entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductLikeRight(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            likeRight("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 等于 =
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductEq(String buildProduct){
        if(buildProduct!=null){
            eq("build_product",buildProduct);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * 不等于 &lt;&gt;
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductNe(String buildProduct){
        if(buildProduct!=null){
            ne("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 大于 &gt;
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductGt(String buildProduct){
        if(buildProduct!=null){
            gt("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 大于等于 &gt;=
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductGe(String buildProduct){
        if(buildProduct!=null){
            ge("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 小于 &lt;
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductLt(String buildProduct){
        if(buildProduct!=null){
            lt("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 小于等于 &lt;=
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductLe(String buildProduct){
        if(buildProduct!=null){
            le("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * LIKE '%值%'
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductLike(String buildProduct){
        if(buildProduct!=null){
            like("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * NOT LIKE '%值%'
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductNotLike(String buildProduct){
        if(buildProduct!=null){
            notLike("build_product",buildProduct);
        }
        return this;
     }


    /**
     * <p>整个产品的名称</p>
     * LIKE '%值'
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductLikeLeft(String buildProduct){
        if(buildProduct!=null){
            likeLeft("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * LIKE '值%'
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductLikeRight(String buildProduct){
        if(buildProduct!=null){
            likeRight("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductIsNull(){
        isNull("build_product");
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductIsNotNull(){
        isNotNull("build_product");
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_product",value);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductIn(String... values){
        if(values!=null && values.length>0){
            in("build_product",values);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_product",value);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildProductNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_product",values);
        }
        return this;
    }


    /**
     * <p>硬件名称</p>
     * 等于 = entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareEq(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            eq("build_hardware",buildHardware);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * 不等于 &lt;&gt; entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareNe(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            ne("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 大于 &gt; entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareGt(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            gt("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 大于等于 &gt;= entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareGe(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            ge("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 小于 &lt; entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareLt(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            lt("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 小于等于 &lt;= entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareLe(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            le("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * BETWEEN  entity().getBuildHardware() AND buildHardwareEnd
     * @param buildHardwareEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareBetween(String buildHardwareEnd){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null && buildHardwareEnd!=null){
            between("build_hardware",buildHardware,buildHardwareEnd);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * NOT BETWEEN  entity().getBuildHardware() AND 值2
     * @param buildHardwareEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareNotBetween(String buildHardwareEnd){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null && buildHardwareEnd!=null){
            notBetween("build_hardware",buildHardware,buildHardwareEnd);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * BETWEEN  entity().getBuildHardware() AND 值2
     * @param buildHardwareStart       值1
     * @param buildHardwareEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareBetween(String buildHardwareStart,String buildHardwareEnd){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null && buildHardwareEnd!=null){
            between("build_hardware",buildHardwareStart,buildHardwareEnd);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * NOT BETWEEN  entity().getBuildHardware() AND 值2
     * @param buildHardwareStart       值1
     * @param buildHardwareEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareNotBetween(String buildHardwareStart,String buildHardwareEnd){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null && buildHardwareEnd!=null){
            notBetween("build_hardware",buildHardwareStart,buildHardwareEnd);
        }
        return this;
     }


    /**
     * <p>硬件名称</p>
     * LIKE '%值%'  entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareLike(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            like("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * NOT LIKE '%值%'  entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareNotLike(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            notLike("build_hardware",buildHardware);
        }
        return this;
     }


    /**
     * <p>硬件名称</p>
     * LIKE '%值'  entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareLikeLeft(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            likeLeft("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * LIKE '值%'  entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareLikeRight(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            likeRight("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 等于 =
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareEq(String buildHardware){
        if(buildHardware!=null){
            eq("build_hardware",buildHardware);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * 不等于 &lt;&gt;
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareNe(String buildHardware){
        if(buildHardware!=null){
            ne("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 大于 &gt;
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareGt(String buildHardware){
        if(buildHardware!=null){
            gt("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 大于等于 &gt;=
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareGe(String buildHardware){
        if(buildHardware!=null){
            ge("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 小于 &lt;
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareLt(String buildHardware){
        if(buildHardware!=null){
            lt("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 小于等于 &lt;=
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareLe(String buildHardware){
        if(buildHardware!=null){
            le("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * LIKE '%值%'
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareLike(String buildHardware){
        if(buildHardware!=null){
            like("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * NOT LIKE '%值%'
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareNotLike(String buildHardware){
        if(buildHardware!=null){
            notLike("build_hardware",buildHardware);
        }
        return this;
     }


    /**
     * <p>硬件名称</p>
     * LIKE '%值'
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareLikeLeft(String buildHardware){
        if(buildHardware!=null){
            likeLeft("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * LIKE '值%'
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareLikeRight(String buildHardware){
        if(buildHardware!=null){
            likeRight("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareIsNull(){
        isNull("build_hardware");
        return this;
    }

    /**
     * <p>硬件名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareIsNotNull(){
        isNotNull("build_hardware");
        return this;
    }

    /**
     * <p>硬件名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_hardware",value);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareIn(String... values){
        if(values!=null && values.length>0){
            in("build_hardware",values);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_hardware",value);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildHardwareNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_hardware",values);
        }
        return this;
    }


    /**
     * <p>硬件序列</p>
     * 等于 = entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialEq(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            eq("build_serial",buildSerial);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * 不等于 &lt;&gt; entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialNe(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            ne("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 大于 &gt; entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialGt(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            gt("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 大于等于 &gt;= entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialGe(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            ge("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 小于 &lt; entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialLt(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            lt("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 小于等于 &lt;= entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialLe(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            le("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * BETWEEN  entity().getBuildSerial() AND buildSerialEnd
     * @param buildSerialEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialBetween(String buildSerialEnd){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null && buildSerialEnd!=null){
            between("build_serial",buildSerial,buildSerialEnd);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * NOT BETWEEN  entity().getBuildSerial() AND 值2
     * @param buildSerialEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialNotBetween(String buildSerialEnd){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null && buildSerialEnd!=null){
            notBetween("build_serial",buildSerial,buildSerialEnd);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * BETWEEN  entity().getBuildSerial() AND 值2
     * @param buildSerialStart       值1
     * @param buildSerialEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialBetween(String buildSerialStart,String buildSerialEnd){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null && buildSerialEnd!=null){
            between("build_serial",buildSerialStart,buildSerialEnd);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * NOT BETWEEN  entity().getBuildSerial() AND 值2
     * @param buildSerialStart       值1
     * @param buildSerialEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialNotBetween(String buildSerialStart,String buildSerialEnd){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null && buildSerialEnd!=null){
            notBetween("build_serial",buildSerialStart,buildSerialEnd);
        }
        return this;
     }


    /**
     * <p>硬件序列</p>
     * LIKE '%值%'  entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialLike(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            like("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * NOT LIKE '%值%'  entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialNotLike(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            notLike("build_serial",buildSerial);
        }
        return this;
     }


    /**
     * <p>硬件序列</p>
     * LIKE '%值'  entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialLikeLeft(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            likeLeft("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * LIKE '值%'  entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialLikeRight(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            likeRight("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 等于 =
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialEq(String buildSerial){
        if(buildSerial!=null){
            eq("build_serial",buildSerial);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * 不等于 &lt;&gt;
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialNe(String buildSerial){
        if(buildSerial!=null){
            ne("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 大于 &gt;
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialGt(String buildSerial){
        if(buildSerial!=null){
            gt("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 大于等于 &gt;=
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialGe(String buildSerial){
        if(buildSerial!=null){
            ge("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 小于 &lt;
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialLt(String buildSerial){
        if(buildSerial!=null){
            lt("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 小于等于 &lt;=
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialLe(String buildSerial){
        if(buildSerial!=null){
            le("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * LIKE '%值%'
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialLike(String buildSerial){
        if(buildSerial!=null){
            like("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * NOT LIKE '%值%'
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialNotLike(String buildSerial){
        if(buildSerial!=null){
            notLike("build_serial",buildSerial);
        }
        return this;
     }


    /**
     * <p>硬件序列</p>
     * LIKE '%值'
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialLikeLeft(String buildSerial){
        if(buildSerial!=null){
            likeLeft("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * LIKE '值%'
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialLikeRight(String buildSerial){
        if(buildSerial!=null){
            likeRight("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialIsNull(){
        isNull("build_serial");
        return this;
    }

    /**
     * <p>硬件序列</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialIsNotNull(){
        isNotNull("build_serial");
        return this;
    }

    /**
     * <p>硬件序列</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_serial",value);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialIn(String... values){
        if(values!=null && values.length>0){
            in("build_serial",values);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_serial",value);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSerialNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_serial",values);
        }
        return this;
    }


    /**
     * <p>cpu指令集</p>
     * 等于 = entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisEq(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            eq("build_supported_abis",buildSupportedAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 不等于 &lt;&gt; entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisNe(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            ne("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于 &gt; entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisGt(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            gt("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于等于 &gt;= entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisGe(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            ge("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于 &lt; entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisLt(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            lt("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于等于 &lt;= entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisLe(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            le("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN  entity().getBuildSupportedAbis() AND buildSupportedAbisEnd
     * @param buildSupportedAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisBetween(String buildSupportedAbisEnd){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null && buildSupportedAbisEnd!=null){
            between("build_supported_abis",buildSupportedAbis,buildSupportedAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN  entity().getBuildSupportedAbis() AND 值2
     * @param buildSupportedAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisNotBetween(String buildSupportedAbisEnd){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null && buildSupportedAbisEnd!=null){
            notBetween("build_supported_abis",buildSupportedAbis,buildSupportedAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN  entity().getBuildSupportedAbis() AND 值2
     * @param buildSupportedAbisStart       值1
     * @param buildSupportedAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisBetween(String buildSupportedAbisStart,String buildSupportedAbisEnd){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null && buildSupportedAbisEnd!=null){
            between("build_supported_abis",buildSupportedAbisStart,buildSupportedAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN  entity().getBuildSupportedAbis() AND 值2
     * @param buildSupportedAbisStart       值1
     * @param buildSupportedAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisNotBetween(String buildSupportedAbisStart,String buildSupportedAbisEnd){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null && buildSupportedAbisEnd!=null){
            notBetween("build_supported_abis",buildSupportedAbisStart,buildSupportedAbisEnd);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值%'  entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisLike(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            like("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT LIKE '%值%'  entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisNotLike(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            notLike("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值'  entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisLikeLeft(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            likeLeft("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * LIKE '值%'  entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisLikeRight(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            likeRight("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 等于 =
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisEq(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            eq("build_supported_abis",buildSupportedAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 不等于 &lt;&gt;
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisNe(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            ne("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于 &gt;
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisGt(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            gt("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于等于 &gt;=
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisGe(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            ge("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于 &lt;
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisLt(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            lt("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于等于 &lt;=
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisLe(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            le("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * LIKE '%值%'
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisLike(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            like("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT LIKE '%值%'
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisNotLike(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            notLike("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值'
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisLikeLeft(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            likeLeft("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * LIKE '值%'
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisLikeRight(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            likeRight("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisIsNull(){
        isNull("build_supported_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisIsNotNull(){
        isNotNull("build_supported_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_supported_abis",value);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisIn(String... values){
        if(values!=null && values.length>0){
            in("build_supported_abis",values);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_supported_abis",value);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupportedAbisNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_supported_abis",values);
        }
        return this;
    }


    /**
     * <p>cpu指令集</p>
     * 等于 = entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisEq(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            eq("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 不等于 &lt;&gt; entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisNe(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            ne("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于 &gt; entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisGt(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            gt("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于等于 &gt;= entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisGe(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            ge("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于 &lt; entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisLt(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            lt("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于等于 &lt;= entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisLe(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            le("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN  entity().getBuildSupported32BitAbis() AND buildSupported32BitAbisEnd
     * @param buildSupported32BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisBetween(String buildSupported32BitAbisEnd){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null && buildSupported32BitAbisEnd!=null){
            between("build_supported_32_bit_abis",buildSupported32BitAbis,buildSupported32BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN  entity().getBuildSupported32BitAbis() AND 值2
     * @param buildSupported32BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisNotBetween(String buildSupported32BitAbisEnd){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null && buildSupported32BitAbisEnd!=null){
            notBetween("build_supported_32_bit_abis",buildSupported32BitAbis,buildSupported32BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN  entity().getBuildSupported32BitAbis() AND 值2
     * @param buildSupported32BitAbisStart       值1
     * @param buildSupported32BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisBetween(String buildSupported32BitAbisStart,String buildSupported32BitAbisEnd){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null && buildSupported32BitAbisEnd!=null){
            between("build_supported_32_bit_abis",buildSupported32BitAbisStart,buildSupported32BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN  entity().getBuildSupported32BitAbis() AND 值2
     * @param buildSupported32BitAbisStart       值1
     * @param buildSupported32BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisNotBetween(String buildSupported32BitAbisStart,String buildSupported32BitAbisEnd){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null && buildSupported32BitAbisEnd!=null){
            notBetween("build_supported_32_bit_abis",buildSupported32BitAbisStart,buildSupported32BitAbisEnd);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值%'  entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisLike(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            like("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT LIKE '%值%'  entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisNotLike(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            notLike("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值'  entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisLikeLeft(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            likeLeft("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * LIKE '值%'  entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisLikeRight(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            likeRight("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 等于 =
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisEq(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            eq("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 不等于 &lt;&gt;
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisNe(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            ne("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于 &gt;
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisGt(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            gt("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于等于 &gt;=
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisGe(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            ge("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于 &lt;
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisLt(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            lt("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于等于 &lt;=
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisLe(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            le("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * LIKE '%值%'
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisLike(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            like("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT LIKE '%值%'
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisNotLike(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            notLike("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值'
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisLikeLeft(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            likeLeft("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * LIKE '值%'
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisLikeRight(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            likeRight("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisIsNull(){
        isNull("build_supported_32_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisIsNotNull(){
        isNotNull("build_supported_32_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_supported_32_bit_abis",value);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisIn(String... values){
        if(values!=null && values.length>0){
            in("build_supported_32_bit_abis",values);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_supported_32_bit_abis",value);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported32BitAbisNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_supported_32_bit_abis",values);
        }
        return this;
    }


    /**
     * <p>cpu指令集</p>
     * 等于 = entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisEq(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            eq("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 不等于 &lt;&gt; entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisNe(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            ne("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于 &gt; entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisGt(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            gt("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于等于 &gt;= entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisGe(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            ge("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于 &lt; entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisLt(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            lt("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于等于 &lt;= entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisLe(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            le("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN  entity().getBuildSupported64BitAbis() AND buildSupported64BitAbisEnd
     * @param buildSupported64BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisBetween(String buildSupported64BitAbisEnd){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null && buildSupported64BitAbisEnd!=null){
            between("build_supported_64_bit_abis",buildSupported64BitAbis,buildSupported64BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN  entity().getBuildSupported64BitAbis() AND 值2
     * @param buildSupported64BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisNotBetween(String buildSupported64BitAbisEnd){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null && buildSupported64BitAbisEnd!=null){
            notBetween("build_supported_64_bit_abis",buildSupported64BitAbis,buildSupported64BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN  entity().getBuildSupported64BitAbis() AND 值2
     * @param buildSupported64BitAbisStart       值1
     * @param buildSupported64BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisBetween(String buildSupported64BitAbisStart,String buildSupported64BitAbisEnd){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null && buildSupported64BitAbisEnd!=null){
            between("build_supported_64_bit_abis",buildSupported64BitAbisStart,buildSupported64BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN  entity().getBuildSupported64BitAbis() AND 值2
     * @param buildSupported64BitAbisStart       值1
     * @param buildSupported64BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisNotBetween(String buildSupported64BitAbisStart,String buildSupported64BitAbisEnd){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null && buildSupported64BitAbisEnd!=null){
            notBetween("build_supported_64_bit_abis",buildSupported64BitAbisStart,buildSupported64BitAbisEnd);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值%'  entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisLike(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            like("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT LIKE '%值%'  entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisNotLike(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            notLike("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值'  entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisLikeLeft(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            likeLeft("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * LIKE '值%'  entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisLikeRight(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            likeRight("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 等于 =
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisEq(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            eq("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 不等于 &lt;&gt;
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisNe(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            ne("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于 &gt;
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisGt(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            gt("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于等于 &gt;=
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisGe(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            ge("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于 &lt;
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisLt(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            lt("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于等于 &lt;=
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisLe(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            le("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * LIKE '%值%'
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisLike(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            like("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT LIKE '%值%'
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisNotLike(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            notLike("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值'
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisLikeLeft(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            likeLeft("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * LIKE '值%'
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisLikeRight(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            likeRight("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisIsNull(){
        isNull("build_supported_64_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisIsNotNull(){
        isNotNull("build_supported_64_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_supported_64_bit_abis",value);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisIn(String... values){
        if(values!=null && values.length>0){
            in("build_supported_64_bit_abis",values);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_supported_64_bit_abis",value);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildSupported64BitAbisNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_supported_64_bit_abis",values);
        }
        return this;
    }


    /**
     * <p>build_version_incremental</p>
     * 等于 = entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalEq(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            eq("build_version_incremental",buildVersionIncremental);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * 不等于 &lt;&gt; entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalNe(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            ne("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 大于 &gt; entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalGt(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            gt("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 大于等于 &gt;= entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalGe(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            ge("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 小于 &lt; entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalLt(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            lt("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 小于等于 &lt;= entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalLe(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            le("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * BETWEEN  entity().getBuildVersionIncremental() AND buildVersionIncrementalEnd
     * @param buildVersionIncrementalEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalBetween(String buildVersionIncrementalEnd){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null && buildVersionIncrementalEnd!=null){
            between("build_version_incremental",buildVersionIncremental,buildVersionIncrementalEnd);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * NOT BETWEEN  entity().getBuildVersionIncremental() AND 值2
     * @param buildVersionIncrementalEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalNotBetween(String buildVersionIncrementalEnd){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null && buildVersionIncrementalEnd!=null){
            notBetween("build_version_incremental",buildVersionIncremental,buildVersionIncrementalEnd);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * BETWEEN  entity().getBuildVersionIncremental() AND 值2
     * @param buildVersionIncrementalStart       值1
     * @param buildVersionIncrementalEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalBetween(String buildVersionIncrementalStart,String buildVersionIncrementalEnd){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null && buildVersionIncrementalEnd!=null){
            between("build_version_incremental",buildVersionIncrementalStart,buildVersionIncrementalEnd);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * NOT BETWEEN  entity().getBuildVersionIncremental() AND 值2
     * @param buildVersionIncrementalStart       值1
     * @param buildVersionIncrementalEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalNotBetween(String buildVersionIncrementalStart,String buildVersionIncrementalEnd){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null && buildVersionIncrementalEnd!=null){
            notBetween("build_version_incremental",buildVersionIncrementalStart,buildVersionIncrementalEnd);
        }
        return this;
     }


    /**
     * <p>build_version_incremental</p>
     * LIKE '%值%'  entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalLike(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            like("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * NOT LIKE '%值%'  entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalNotLike(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            notLike("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }


    /**
     * <p>build_version_incremental</p>
     * LIKE '%值'  entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalLikeLeft(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            likeLeft("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * LIKE '值%'  entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalLikeRight(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            likeRight("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 等于 =
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalEq(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            eq("build_version_incremental",buildVersionIncremental);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * 不等于 &lt;&gt;
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalNe(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            ne("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 大于 &gt;
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalGt(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            gt("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 大于等于 &gt;=
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalGe(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            ge("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 小于 &lt;
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalLt(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            lt("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 小于等于 &lt;=
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalLe(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            le("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * LIKE '%值%'
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalLike(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            like("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * NOT LIKE '%值%'
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalNotLike(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            notLike("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }


    /**
     * <p>build_version_incremental</p>
     * LIKE '%值'
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalLikeLeft(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            likeLeft("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * LIKE '值%'
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalLikeRight(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            likeRight("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalIsNull(){
        isNull("build_version_incremental");
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalIsNotNull(){
        isNotNull("build_version_incremental");
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_version_incremental",value);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalIn(String... values){
        if(values!=null && values.length>0){
            in("build_version_incremental",values);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_version_incremental",value);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionIncrementalNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_incremental",values);
        }
        return this;
    }


    /**
     * <p>系统版本</p>
     * 等于 = entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseEq(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            eq("build_version_release",buildVersionRelease);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 不等于 &lt;&gt; entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseNe(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            ne("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于 &gt; entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseGt(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            gt("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于等于 &gt;= entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseGe(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            ge("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于 &lt; entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseLt(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            lt("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于等于 &lt;= entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseLe(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            le("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * BETWEEN  entity().getBuildVersionRelease() AND buildVersionReleaseEnd
     * @param buildVersionReleaseEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseBetween(String buildVersionReleaseEnd){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null && buildVersionReleaseEnd!=null){
            between("build_version_release",buildVersionRelease,buildVersionReleaseEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT BETWEEN  entity().getBuildVersionRelease() AND 值2
     * @param buildVersionReleaseEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseNotBetween(String buildVersionReleaseEnd){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null && buildVersionReleaseEnd!=null){
            notBetween("build_version_release",buildVersionRelease,buildVersionReleaseEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * BETWEEN  entity().getBuildVersionRelease() AND 值2
     * @param buildVersionReleaseStart       值1
     * @param buildVersionReleaseEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseBetween(String buildVersionReleaseStart,String buildVersionReleaseEnd){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null && buildVersionReleaseEnd!=null){
            between("build_version_release",buildVersionReleaseStart,buildVersionReleaseEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT BETWEEN  entity().getBuildVersionRelease() AND 值2
     * @param buildVersionReleaseStart       值1
     * @param buildVersionReleaseEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseNotBetween(String buildVersionReleaseStart,String buildVersionReleaseEnd){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null && buildVersionReleaseEnd!=null){
            notBetween("build_version_release",buildVersionReleaseStart,buildVersionReleaseEnd);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值%'  entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseLike(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            like("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT LIKE '%值%'  entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseNotLike(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            notLike("build_version_release",buildVersionRelease);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值'  entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseLikeLeft(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            likeLeft("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * LIKE '值%'  entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseLikeRight(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            likeRight("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 等于 =
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseEq(String buildVersionRelease){
        if(buildVersionRelease!=null){
            eq("build_version_release",buildVersionRelease);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 不等于 &lt;&gt;
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseNe(String buildVersionRelease){
        if(buildVersionRelease!=null){
            ne("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于 &gt;
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseGt(String buildVersionRelease){
        if(buildVersionRelease!=null){
            gt("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于等于 &gt;=
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseGe(String buildVersionRelease){
        if(buildVersionRelease!=null){
            ge("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于 &lt;
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseLt(String buildVersionRelease){
        if(buildVersionRelease!=null){
            lt("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于等于 &lt;=
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseLe(String buildVersionRelease){
        if(buildVersionRelease!=null){
            le("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * LIKE '%值%'
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseLike(String buildVersionRelease){
        if(buildVersionRelease!=null){
            like("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT LIKE '%值%'
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseNotLike(String buildVersionRelease){
        if(buildVersionRelease!=null){
            notLike("build_version_release",buildVersionRelease);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值'
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseLikeLeft(String buildVersionRelease){
        if(buildVersionRelease!=null){
            likeLeft("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * LIKE '值%'
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseLikeRight(String buildVersionRelease){
        if(buildVersionRelease!=null){
            likeRight("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseIsNull(){
        isNull("build_version_release");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseIsNotNull(){
        isNotNull("build_version_release");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_version_release",value);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseIn(String... values){
        if(values!=null && values.length>0){
            in("build_version_release",values);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_version_release",value);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionReleaseNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_release",values);
        }
        return this;
    }


    /**
     * <p>build_version_sdk</p>
     * 等于 = entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkEq(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            eq("build_version_sdk",buildVersionSdk);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * 不等于 &lt;&gt; entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkNe(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            ne("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 大于 &gt; entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkGt(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            gt("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 大于等于 &gt;= entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkGe(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            ge("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 小于 &lt; entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkLt(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            lt("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 小于等于 &lt;= entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkLe(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            le("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * BETWEEN  entity().getBuildVersionSdk() AND buildVersionSdkEnd
     * @param buildVersionSdkEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkBetween(String buildVersionSdkEnd){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null && buildVersionSdkEnd!=null){
            between("build_version_sdk",buildVersionSdk,buildVersionSdkEnd);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * NOT BETWEEN  entity().getBuildVersionSdk() AND 值2
     * @param buildVersionSdkEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkNotBetween(String buildVersionSdkEnd){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null && buildVersionSdkEnd!=null){
            notBetween("build_version_sdk",buildVersionSdk,buildVersionSdkEnd);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * BETWEEN  entity().getBuildVersionSdk() AND 值2
     * @param buildVersionSdkStart       值1
     * @param buildVersionSdkEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkBetween(String buildVersionSdkStart,String buildVersionSdkEnd){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null && buildVersionSdkEnd!=null){
            between("build_version_sdk",buildVersionSdkStart,buildVersionSdkEnd);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * NOT BETWEEN  entity().getBuildVersionSdk() AND 值2
     * @param buildVersionSdkStart       值1
     * @param buildVersionSdkEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkNotBetween(String buildVersionSdkStart,String buildVersionSdkEnd){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null && buildVersionSdkEnd!=null){
            notBetween("build_version_sdk",buildVersionSdkStart,buildVersionSdkEnd);
        }
        return this;
     }


    /**
     * <p>build_version_sdk</p>
     * LIKE '%值%'  entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkLike(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            like("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * NOT LIKE '%值%'  entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkNotLike(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            notLike("build_version_sdk",buildVersionSdk);
        }
        return this;
     }


    /**
     * <p>build_version_sdk</p>
     * LIKE '%值'  entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkLikeLeft(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            likeLeft("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * LIKE '值%'  entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkLikeRight(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            likeRight("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 等于 =
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkEq(String buildVersionSdk){
        if(buildVersionSdk!=null){
            eq("build_version_sdk",buildVersionSdk);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * 不等于 &lt;&gt;
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkNe(String buildVersionSdk){
        if(buildVersionSdk!=null){
            ne("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 大于 &gt;
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkGt(String buildVersionSdk){
        if(buildVersionSdk!=null){
            gt("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 大于等于 &gt;=
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkGe(String buildVersionSdk){
        if(buildVersionSdk!=null){
            ge("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 小于 &lt;
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkLt(String buildVersionSdk){
        if(buildVersionSdk!=null){
            lt("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 小于等于 &lt;=
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkLe(String buildVersionSdk){
        if(buildVersionSdk!=null){
            le("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * LIKE '%值%'
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkLike(String buildVersionSdk){
        if(buildVersionSdk!=null){
            like("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * NOT LIKE '%值%'
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkNotLike(String buildVersionSdk){
        if(buildVersionSdk!=null){
            notLike("build_version_sdk",buildVersionSdk);
        }
        return this;
     }


    /**
     * <p>build_version_sdk</p>
     * LIKE '%值'
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkLikeLeft(String buildVersionSdk){
        if(buildVersionSdk!=null){
            likeLeft("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * LIKE '值%'
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkLikeRight(String buildVersionSdk){
        if(buildVersionSdk!=null){
            likeRight("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkIsNull(){
        isNull("build_version_sdk");
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkIsNotNull(){
        isNotNull("build_version_sdk");
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_version_sdk",value);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkIn(String... values){
        if(values!=null && values.length>0){
            in("build_version_sdk",values);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_version_sdk",value);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_sdk",values);
        }
        return this;
    }


    /**
     * <p>SDK版本</p>
     * 等于 = entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintEq(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            eq("build_version_sdkint",buildVersionSdkint);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * 不等于 &lt;&gt; entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintNe(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            ne("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 大于 &gt; entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintGt(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            gt("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 大于等于 &gt;= entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintGe(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            ge("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 小于 &lt; entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintLt(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            lt("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 小于等于 &lt;= entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintLe(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            le("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * BETWEEN  entity().getBuildVersionSdkint() AND buildVersionSdkintEnd
     * @param buildVersionSdkintEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintBetween(String buildVersionSdkintEnd){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null && buildVersionSdkintEnd!=null){
            between("build_version_sdkint",buildVersionSdkint,buildVersionSdkintEnd);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * NOT BETWEEN  entity().getBuildVersionSdkint() AND 值2
     * @param buildVersionSdkintEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintNotBetween(String buildVersionSdkintEnd){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null && buildVersionSdkintEnd!=null){
            notBetween("build_version_sdkint",buildVersionSdkint,buildVersionSdkintEnd);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * BETWEEN  entity().getBuildVersionSdkint() AND 值2
     * @param buildVersionSdkintStart       值1
     * @param buildVersionSdkintEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintBetween(String buildVersionSdkintStart,String buildVersionSdkintEnd){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null && buildVersionSdkintEnd!=null){
            between("build_version_sdkint",buildVersionSdkintStart,buildVersionSdkintEnd);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * NOT BETWEEN  entity().getBuildVersionSdkint() AND 值2
     * @param buildVersionSdkintStart       值1
     * @param buildVersionSdkintEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintNotBetween(String buildVersionSdkintStart,String buildVersionSdkintEnd){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null && buildVersionSdkintEnd!=null){
            notBetween("build_version_sdkint",buildVersionSdkintStart,buildVersionSdkintEnd);
        }
        return this;
     }


    /**
     * <p>SDK版本</p>
     * LIKE '%值%'  entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintLike(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            like("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * NOT LIKE '%值%'  entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintNotLike(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            notLike("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }


    /**
     * <p>SDK版本</p>
     * LIKE '%值'  entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintLikeLeft(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            likeLeft("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * LIKE '值%'  entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintLikeRight(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            likeRight("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 等于 =
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintEq(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            eq("build_version_sdkint",buildVersionSdkint);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * 不等于 &lt;&gt;
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintNe(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            ne("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 大于 &gt;
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintGt(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            gt("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 大于等于 &gt;=
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintGe(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            ge("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 小于 &lt;
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintLt(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            lt("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 小于等于 &lt;=
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintLe(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            le("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * LIKE '%值%'
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintLike(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            like("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * NOT LIKE '%值%'
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintNotLike(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            notLike("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }


    /**
     * <p>SDK版本</p>
     * LIKE '%值'
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintLikeLeft(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            likeLeft("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * LIKE '值%'
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintLikeRight(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            likeRight("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintIsNull(){
        isNull("build_version_sdkint");
        return this;
    }

    /**
     * <p>SDK版本</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintIsNotNull(){
        isNotNull("build_version_sdkint");
        return this;
    }

    /**
     * <p>SDK版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_version_sdkint",value);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintIn(String... values){
        if(values!=null && values.length>0){
            in("build_version_sdkint",values);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_version_sdkint",value);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionSdkintNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_sdkint",values);
        }
        return this;
    }


    /**
     * <p>build_version_codename</p>
     * 等于 = entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameEq(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            eq("build_version_codename",buildVersionCodename);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * 不等于 &lt;&gt; entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameNe(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            ne("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 大于 &gt; entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameGt(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            gt("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 大于等于 &gt;= entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameGe(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            ge("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 小于 &lt; entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameLt(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            lt("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 小于等于 &lt;= entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameLe(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            le("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * BETWEEN  entity().getBuildVersionCodename() AND buildVersionCodenameEnd
     * @param buildVersionCodenameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameBetween(String buildVersionCodenameEnd){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null && buildVersionCodenameEnd!=null){
            between("build_version_codename",buildVersionCodename,buildVersionCodenameEnd);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * NOT BETWEEN  entity().getBuildVersionCodename() AND 值2
     * @param buildVersionCodenameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameNotBetween(String buildVersionCodenameEnd){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null && buildVersionCodenameEnd!=null){
            notBetween("build_version_codename",buildVersionCodename,buildVersionCodenameEnd);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * BETWEEN  entity().getBuildVersionCodename() AND 值2
     * @param buildVersionCodenameStart       值1
     * @param buildVersionCodenameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameBetween(String buildVersionCodenameStart,String buildVersionCodenameEnd){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null && buildVersionCodenameEnd!=null){
            between("build_version_codename",buildVersionCodenameStart,buildVersionCodenameEnd);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * NOT BETWEEN  entity().getBuildVersionCodename() AND 值2
     * @param buildVersionCodenameStart       值1
     * @param buildVersionCodenameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameNotBetween(String buildVersionCodenameStart,String buildVersionCodenameEnd){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null && buildVersionCodenameEnd!=null){
            notBetween("build_version_codename",buildVersionCodenameStart,buildVersionCodenameEnd);
        }
        return this;
     }


    /**
     * <p>build_version_codename</p>
     * LIKE '%值%'  entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameLike(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            like("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * NOT LIKE '%值%'  entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameNotLike(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            notLike("build_version_codename",buildVersionCodename);
        }
        return this;
     }


    /**
     * <p>build_version_codename</p>
     * LIKE '%值'  entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameLikeLeft(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            likeLeft("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * LIKE '值%'  entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameLikeRight(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            likeRight("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 等于 =
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameEq(String buildVersionCodename){
        if(buildVersionCodename!=null){
            eq("build_version_codename",buildVersionCodename);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * 不等于 &lt;&gt;
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameNe(String buildVersionCodename){
        if(buildVersionCodename!=null){
            ne("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 大于 &gt;
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameGt(String buildVersionCodename){
        if(buildVersionCodename!=null){
            gt("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 大于等于 &gt;=
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameGe(String buildVersionCodename){
        if(buildVersionCodename!=null){
            ge("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 小于 &lt;
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameLt(String buildVersionCodename){
        if(buildVersionCodename!=null){
            lt("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 小于等于 &lt;=
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameLe(String buildVersionCodename){
        if(buildVersionCodename!=null){
            le("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * LIKE '%值%'
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameLike(String buildVersionCodename){
        if(buildVersionCodename!=null){
            like("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * NOT LIKE '%值%'
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameNotLike(String buildVersionCodename){
        if(buildVersionCodename!=null){
            notLike("build_version_codename",buildVersionCodename);
        }
        return this;
     }


    /**
     * <p>build_version_codename</p>
     * LIKE '%值'
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameLikeLeft(String buildVersionCodename){
        if(buildVersionCodename!=null){
            likeLeft("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * LIKE '值%'
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameLikeRight(String buildVersionCodename){
        if(buildVersionCodename!=null){
            likeRight("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameIsNull(){
        isNull("build_version_codename");
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameIsNotNull(){
        isNotNull("build_version_codename");
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_version_codename",value);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameIn(String... values){
        if(values!=null && values.length>0){
            in("build_version_codename",values);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_version_codename",value);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildVersionCodenameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_codename",values);
        }
        return this;
    }


    /**
     * <p>build_type</p>
     * 等于 = entity().getBuildType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeEq(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            eq("build_type",buildType);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * 不等于 &lt;&gt; entity().getBuildType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeNe(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            ne("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 大于 &gt; entity().getBuildType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeGt(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            gt("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 大于等于 &gt;= entity().getBuildType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeGe(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            ge("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 小于 &lt; entity().getBuildType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeLt(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            lt("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 小于等于 &lt;= entity().getBuildType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeLe(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            le("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * BETWEEN  entity().getBuildType() AND buildTypeEnd
     * @param buildTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeBetween(String buildTypeEnd){
        String buildType =entity().getBuildType();
        if(buildType!=null && buildTypeEnd!=null){
            between("build_type",buildType,buildTypeEnd);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * NOT BETWEEN  entity().getBuildType() AND 值2
     * @param buildTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeNotBetween(String buildTypeEnd){
        String buildType =entity().getBuildType();
        if(buildType!=null && buildTypeEnd!=null){
            notBetween("build_type",buildType,buildTypeEnd);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * BETWEEN  entity().getBuildType() AND 值2
     * @param buildTypeStart       值1
     * @param buildTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeBetween(String buildTypeStart,String buildTypeEnd){
        String buildType =entity().getBuildType();
        if(buildType!=null && buildTypeEnd!=null){
            between("build_type",buildTypeStart,buildTypeEnd);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * NOT BETWEEN  entity().getBuildType() AND 值2
     * @param buildTypeStart       值1
     * @param buildTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeNotBetween(String buildTypeStart,String buildTypeEnd){
        String buildType =entity().getBuildType();
        if(buildType!=null && buildTypeEnd!=null){
            notBetween("build_type",buildTypeStart,buildTypeEnd);
        }
        return this;
     }


    /**
     * <p>build_type</p>
     * LIKE '%值%'  entity().getBuildType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeLike(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            like("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * NOT LIKE '%值%'  entity().getBuildType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeNotLike(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            notLike("build_type",buildType);
        }
        return this;
     }


    /**
     * <p>build_type</p>
     * LIKE '%值'  entity().getBuildType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeLikeLeft(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            likeLeft("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * LIKE '值%'  entity().getBuildType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeLikeRight(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            likeRight("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 等于 =
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeEq(String buildType){
        if(buildType!=null){
            eq("build_type",buildType);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * 不等于 &lt;&gt;
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeNe(String buildType){
        if(buildType!=null){
            ne("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 大于 &gt;
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeGt(String buildType){
        if(buildType!=null){
            gt("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 大于等于 &gt;=
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeGe(String buildType){
        if(buildType!=null){
            ge("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 小于 &lt;
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeLt(String buildType){
        if(buildType!=null){
            lt("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 小于等于 &lt;=
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeLe(String buildType){
        if(buildType!=null){
            le("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * LIKE '%值%'
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeLike(String buildType){
        if(buildType!=null){
            like("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * NOT LIKE '%值%'
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeNotLike(String buildType){
        if(buildType!=null){
            notLike("build_type",buildType);
        }
        return this;
     }


    /**
     * <p>build_type</p>
     * LIKE '%值'
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeLikeLeft(String buildType){
        if(buildType!=null){
            likeLeft("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * LIKE '值%'
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeLikeRight(String buildType){
        if(buildType!=null){
            likeRight("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeIsNull(){
        isNull("build_type");
        return this;
    }

    /**
     * <p>build_type</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeIsNotNull(){
        isNotNull("build_type");
        return this;
    }

    /**
     * <p>build_type</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_type",value);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeIn(String... values){
        if(values!=null && values.length>0){
            in("build_type",values);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_type",value);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_type",values);
        }
        return this;
    }


    /**
     * <p>build_api_level</p>
     * 等于 = entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelEq(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            eq("build_api_level",buildApiLevel);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * 不等于 &lt;&gt; entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelNe(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            ne("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 大于 &gt; entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelGt(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            gt("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 大于等于 &gt;= entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelGe(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            ge("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 小于 &lt; entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelLt(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            lt("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 小于等于 &lt;= entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelLe(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            le("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * BETWEEN  entity().getBuildApiLevel() AND buildApiLevelEnd
     * @param buildApiLevelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelBetween(Integer buildApiLevelEnd){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null && buildApiLevelEnd!=null){
            between("build_api_level",buildApiLevel,buildApiLevelEnd);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * NOT BETWEEN  entity().getBuildApiLevel() AND 值2
     * @param buildApiLevelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelNotBetween(Integer buildApiLevelEnd){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null && buildApiLevelEnd!=null){
            notBetween("build_api_level",buildApiLevel,buildApiLevelEnd);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * BETWEEN  entity().getBuildApiLevel() AND 值2
     * @param buildApiLevelStart       值1
     * @param buildApiLevelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelBetween(Integer buildApiLevelStart,Integer buildApiLevelEnd){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null && buildApiLevelEnd!=null){
            between("build_api_level",buildApiLevelStart,buildApiLevelEnd);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * NOT BETWEEN  entity().getBuildApiLevel() AND 值2
     * @param buildApiLevelStart       值1
     * @param buildApiLevelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelNotBetween(Integer buildApiLevelStart,Integer buildApiLevelEnd){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null && buildApiLevelEnd!=null){
            notBetween("build_api_level",buildApiLevelStart,buildApiLevelEnd);
        }
        return this;
     }


    /**
     * <p>build_api_level</p>
     * LIKE '%值%'  entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelLike(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            like("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * NOT LIKE '%值%'  entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelNotLike(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            notLike("build_api_level",buildApiLevel);
        }
        return this;
     }


    /**
     * <p>build_api_level</p>
     * LIKE '%值'  entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelLikeLeft(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            likeLeft("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * LIKE '值%'  entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelLikeRight(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            likeRight("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 等于 =
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelEq(Integer buildApiLevel){
        if(buildApiLevel!=null){
            eq("build_api_level",buildApiLevel);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * 不等于 &lt;&gt;
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelNe(Integer buildApiLevel){
        if(buildApiLevel!=null){
            ne("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 大于 &gt;
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelGt(Integer buildApiLevel){
        if(buildApiLevel!=null){
            gt("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 大于等于 &gt;=
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelGe(Integer buildApiLevel){
        if(buildApiLevel!=null){
            ge("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 小于 &lt;
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelLt(Integer buildApiLevel){
        if(buildApiLevel!=null){
            lt("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 小于等于 &lt;=
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelLe(Integer buildApiLevel){
        if(buildApiLevel!=null){
            le("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * LIKE '%值%'
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelLike(Integer buildApiLevel){
        if(buildApiLevel!=null){
            like("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * NOT LIKE '%值%'
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelNotLike(Integer buildApiLevel){
        if(buildApiLevel!=null){
            notLike("build_api_level",buildApiLevel);
        }
        return this;
     }


    /**
     * <p>build_api_level</p>
     * LIKE '%值'
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelLikeLeft(Integer buildApiLevel){
        if(buildApiLevel!=null){
            likeLeft("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * LIKE '值%'
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelLikeRight(Integer buildApiLevel){
        if(buildApiLevel!=null){
            likeRight("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelIsNull(){
        isNull("build_api_level");
        return this;
    }

    /**
     * <p>build_api_level</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelIsNotNull(){
        isNotNull("build_api_level");
        return this;
    }

    /**
     * <p>build_api_level</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("build_api_level",value);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelIn(Integer... values){
        if(values!=null && values.length>0){
            in("build_api_level",values);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_api_level",value);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper buildApiLevelNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("build_api_level",values);
        }
        return this;
    }


    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 等于 = entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdEq(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            eq("andorid_id",andoridId);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 不等于 &lt;&gt; entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdNe(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            ne("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 大于 &gt; entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdGt(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            gt("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 大于等于 &gt;= entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdGe(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            ge("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 小于 &lt; entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdLt(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            lt("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 小于等于 &lt;= entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdLe(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            le("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * BETWEEN  entity().getAndoridId() AND andoridIdEnd
     * @param andoridIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdBetween(String andoridIdEnd){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null && andoridIdEnd!=null){
            between("andorid_id",andoridId,andoridIdEnd);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * NOT BETWEEN  entity().getAndoridId() AND 值2
     * @param andoridIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdNotBetween(String andoridIdEnd){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null && andoridIdEnd!=null){
            notBetween("andorid_id",andoridId,andoridIdEnd);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * BETWEEN  entity().getAndoridId() AND 值2
     * @param andoridIdStart       值1
     * @param andoridIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdBetween(String andoridIdStart,String andoridIdEnd){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null && andoridIdEnd!=null){
            between("andorid_id",andoridIdStart,andoridIdEnd);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * NOT BETWEEN  entity().getAndoridId() AND 值2
     * @param andoridIdStart       值1
     * @param andoridIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdNotBetween(String andoridIdStart,String andoridIdEnd){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null && andoridIdEnd!=null){
            notBetween("andorid_id",andoridIdStart,andoridIdEnd);
        }
        return this;
     }


    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '%值%'  entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdLike(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            like("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * NOT LIKE '%值%'  entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdNotLike(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            notLike("andorid_id",andoridId);
        }
        return this;
     }


    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '%值'  entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdLikeLeft(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            likeLeft("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '值%'  entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdLikeRight(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            likeRight("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 等于 =
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdEq(String andoridId){
        if(andoridId!=null){
            eq("andorid_id",andoridId);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 不等于 &lt;&gt;
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdNe(String andoridId){
        if(andoridId!=null){
            ne("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 大于 &gt;
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdGt(String andoridId){
        if(andoridId!=null){
            gt("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 大于等于 &gt;=
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdGe(String andoridId){
        if(andoridId!=null){
            ge("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 小于 &lt;
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdLt(String andoridId){
        if(andoridId!=null){
            lt("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 小于等于 &lt;=
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdLe(String andoridId){
        if(andoridId!=null){
            le("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '%值%'
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdLike(String andoridId){
        if(andoridId!=null){
            like("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * NOT LIKE '%值%'
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdNotLike(String andoridId){
        if(andoridId!=null){
            notLike("andorid_id",andoridId);
        }
        return this;
     }


    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '%值'
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdLikeLeft(String andoridId){
        if(andoridId!=null){
            likeLeft("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '值%'
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdLikeRight(String andoridId){
        if(andoridId!=null){
            likeRight("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdIsNull(){
        isNull("andorid_id");
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdIsNotNull(){
        isNotNull("andorid_id");
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("andorid_id",value);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdIn(String... values){
        if(values!=null && values.length>0){
            in("andorid_id",values);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("andorid_id",value);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper andoridIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("andorid_id",values);
        }
        return this;
    }


    /**
     * <p>os_arch</p>
     * 等于 = entity().getOsArch()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchEq(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            eq("os_arch",osArch);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * 不等于 &lt;&gt; entity().getOsArch()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchNe(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            ne("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 大于 &gt; entity().getOsArch()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchGt(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            gt("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 大于等于 &gt;= entity().getOsArch()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchGe(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            ge("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 小于 &lt; entity().getOsArch()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchLt(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            lt("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 小于等于 &lt;= entity().getOsArch()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchLe(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            le("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * BETWEEN  entity().getOsArch() AND osArchEnd
     * @param osArchEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchBetween(String osArchEnd){
        String osArch =entity().getOsArch();
        if(osArch!=null && osArchEnd!=null){
            between("os_arch",osArch,osArchEnd);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * NOT BETWEEN  entity().getOsArch() AND 值2
     * @param osArchEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchNotBetween(String osArchEnd){
        String osArch =entity().getOsArch();
        if(osArch!=null && osArchEnd!=null){
            notBetween("os_arch",osArch,osArchEnd);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * BETWEEN  entity().getOsArch() AND 值2
     * @param osArchStart       值1
     * @param osArchEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchBetween(String osArchStart,String osArchEnd){
        String osArch =entity().getOsArch();
        if(osArch!=null && osArchEnd!=null){
            between("os_arch",osArchStart,osArchEnd);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * NOT BETWEEN  entity().getOsArch() AND 值2
     * @param osArchStart       值1
     * @param osArchEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchNotBetween(String osArchStart,String osArchEnd){
        String osArch =entity().getOsArch();
        if(osArch!=null && osArchEnd!=null){
            notBetween("os_arch",osArchStart,osArchEnd);
        }
        return this;
     }


    /**
     * <p>os_arch</p>
     * LIKE '%值%'  entity().getOsArch()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchLike(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            like("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * NOT LIKE '%值%'  entity().getOsArch()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchNotLike(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            notLike("os_arch",osArch);
        }
        return this;
     }


    /**
     * <p>os_arch</p>
     * LIKE '%值'  entity().getOsArch()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchLikeLeft(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            likeLeft("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * LIKE '值%'  entity().getOsArch()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchLikeRight(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            likeRight("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 等于 =
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchEq(String osArch){
        if(osArch!=null){
            eq("os_arch",osArch);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * 不等于 &lt;&gt;
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchNe(String osArch){
        if(osArch!=null){
            ne("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 大于 &gt;
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchGt(String osArch){
        if(osArch!=null){
            gt("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 大于等于 &gt;=
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchGe(String osArch){
        if(osArch!=null){
            ge("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 小于 &lt;
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchLt(String osArch){
        if(osArch!=null){
            lt("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 小于等于 &lt;=
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchLe(String osArch){
        if(osArch!=null){
            le("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * LIKE '%值%'
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchLike(String osArch){
        if(osArch!=null){
            like("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * NOT LIKE '%值%'
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchNotLike(String osArch){
        if(osArch!=null){
            notLike("os_arch",osArch);
        }
        return this;
     }


    /**
     * <p>os_arch</p>
     * LIKE '%值'
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchLikeLeft(String osArch){
        if(osArch!=null){
            likeLeft("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * LIKE '值%'
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchLikeRight(String osArch){
        if(osArch!=null){
            likeRight("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchIsNull(){
        isNull("os_arch");
        return this;
    }

    /**
     * <p>os_arch</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchIsNotNull(){
        isNotNull("os_arch");
        return this;
    }

    /**
     * <p>os_arch</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("os_arch",value);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchIn(String... values){
        if(values!=null && values.length>0){
            in("os_arch",values);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("os_arch",value);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osArchNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("os_arch",values);
        }
        return this;
    }


    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 等于 = entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeEq(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            eq("phone_type",phoneType);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 不等于 &lt;&gt; entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeNe(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            ne("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 大于 &gt; entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeGt(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            gt("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 大于等于 &gt;= entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeGe(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            ge("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 小于 &lt; entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeLt(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            lt("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 小于等于 &lt;= entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeLe(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            le("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * BETWEEN  entity().getPhoneType() AND phoneTypeEnd
     * @param phoneTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeBetween(String phoneTypeEnd){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null && phoneTypeEnd!=null){
            between("phone_type",phoneType,phoneTypeEnd);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * NOT BETWEEN  entity().getPhoneType() AND 值2
     * @param phoneTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeNotBetween(String phoneTypeEnd){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null && phoneTypeEnd!=null){
            notBetween("phone_type",phoneType,phoneTypeEnd);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * BETWEEN  entity().getPhoneType() AND 值2
     * @param phoneTypeStart       值1
     * @param phoneTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeBetween(String phoneTypeStart,String phoneTypeEnd){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null && phoneTypeEnd!=null){
            between("phone_type",phoneTypeStart,phoneTypeEnd);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * NOT BETWEEN  entity().getPhoneType() AND 值2
     * @param phoneTypeStart       值1
     * @param phoneTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeNotBetween(String phoneTypeStart,String phoneTypeEnd){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null && phoneTypeEnd!=null){
            notBetween("phone_type",phoneTypeStart,phoneTypeEnd);
        }
        return this;
     }


    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '%值%'  entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeLike(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            like("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * NOT LIKE '%值%'  entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeNotLike(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            notLike("phone_type",phoneType);
        }
        return this;
     }


    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '%值'  entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeLikeLeft(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            likeLeft("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '值%'  entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeLikeRight(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            likeRight("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 等于 =
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeEq(String phoneType){
        if(phoneType!=null){
            eq("phone_type",phoneType);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 不等于 &lt;&gt;
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeNe(String phoneType){
        if(phoneType!=null){
            ne("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 大于 &gt;
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeGt(String phoneType){
        if(phoneType!=null){
            gt("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 大于等于 &gt;=
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeGe(String phoneType){
        if(phoneType!=null){
            ge("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 小于 &lt;
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeLt(String phoneType){
        if(phoneType!=null){
            lt("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 小于等于 &lt;=
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeLe(String phoneType){
        if(phoneType!=null){
            le("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '%值%'
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeLike(String phoneType){
        if(phoneType!=null){
            like("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * NOT LIKE '%值%'
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeNotLike(String phoneType){
        if(phoneType!=null){
            notLike("phone_type",phoneType);
        }
        return this;
     }


    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '%值'
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeLikeLeft(String phoneType){
        if(phoneType!=null){
            likeLeft("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '值%'
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeLikeRight(String phoneType){
        if(phoneType!=null){
            likeRight("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeIsNull(){
        isNull("phone_type");
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeIsNotNull(){
        isNotNull("phone_type");
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("phone_type",value);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeIn(String... values){
        if(values!=null && values.length>0){
            in("phone_type",values);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("phone_type",value);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper phoneTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_type",values);
        }
        return this;
    }


    /**
     * <p>os_version</p>
     * 等于 = entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionEq(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            eq("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * 不等于 &lt;&gt; entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionNe(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            ne("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 大于 &gt; entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionGt(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            gt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 大于等于 &gt;= entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionGe(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            ge("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 小于 &lt; entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionLt(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            lt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 小于等于 &lt;= entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionLe(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            le("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * BETWEEN  entity().getOsVersion() AND osVersionEnd
     * @param osVersionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionBetween(String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            between("os_version",osVersion,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * NOT BETWEEN  entity().getOsVersion() AND 值2
     * @param osVersionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionNotBetween(String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            notBetween("os_version",osVersion,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * BETWEEN  entity().getOsVersion() AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionBetween(String osVersionStart,String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            between("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * NOT BETWEEN  entity().getOsVersion() AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionNotBetween(String osVersionStart,String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            notBetween("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }


    /**
     * <p>os_version</p>
     * LIKE '%值%'  entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionLike(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            like("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * NOT LIKE '%值%'  entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionNotLike(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            notLike("os_version",osVersion);
        }
        return this;
     }


    /**
     * <p>os_version</p>
     * LIKE '%值'  entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionLikeLeft(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            likeLeft("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * LIKE '值%'  entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionLikeRight(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            likeRight("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 等于 =
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionEq(String osVersion){
        if(osVersion!=null){
            eq("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * 不等于 &lt;&gt;
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionNe(String osVersion){
        if(osVersion!=null){
            ne("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 大于 &gt;
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionGt(String osVersion){
        if(osVersion!=null){
            gt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 大于等于 &gt;=
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionGe(String osVersion){
        if(osVersion!=null){
            ge("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 小于 &lt;
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionLt(String osVersion){
        if(osVersion!=null){
            lt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 小于等于 &lt;=
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionLe(String osVersion){
        if(osVersion!=null){
            le("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * LIKE '%值%'
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionLike(String osVersion){
        if(osVersion!=null){
            like("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * NOT LIKE '%值%'
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionNotLike(String osVersion){
        if(osVersion!=null){
            notLike("os_version",osVersion);
        }
        return this;
     }


    /**
     * <p>os_version</p>
     * LIKE '%值'
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionLikeLeft(String osVersion){
        if(osVersion!=null){
            likeLeft("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * LIKE '值%'
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionLikeRight(String osVersion){
        if(osVersion!=null){
            likeRight("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionIsNull(){
        isNull("os_version");
        return this;
    }

    /**
     * <p>os_version</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionIsNotNull(){
        isNotNull("os_version");
        return this;
    }

    /**
     * <p>os_version</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("os_version",value);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionIn(String... values){
        if(values!=null && values.length>0){
            in("os_version",values);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("os_version",value);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper osVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("os_version",values);
        }
        return this;
    }


    /**
     * <p>SIM卡的序列号</p>
     * 等于 = entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberEq(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            eq("sim_serial_number",simSerialNumber);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * 不等于 &lt;&gt; entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberNe(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            ne("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 大于 &gt; entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberGt(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            gt("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 大于等于 &gt;= entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberGe(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            ge("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 小于 &lt; entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberLt(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            lt("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 小于等于 &lt;= entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberLe(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            le("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * BETWEEN  entity().getSimSerialNumber() AND simSerialNumberEnd
     * @param simSerialNumberEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberBetween(String simSerialNumberEnd){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null && simSerialNumberEnd!=null){
            between("sim_serial_number",simSerialNumber,simSerialNumberEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * NOT BETWEEN  entity().getSimSerialNumber() AND 值2
     * @param simSerialNumberEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberNotBetween(String simSerialNumberEnd){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null && simSerialNumberEnd!=null){
            notBetween("sim_serial_number",simSerialNumber,simSerialNumberEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * BETWEEN  entity().getSimSerialNumber() AND 值2
     * @param simSerialNumberStart       值1
     * @param simSerialNumberEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberBetween(String simSerialNumberStart,String simSerialNumberEnd){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null && simSerialNumberEnd!=null){
            between("sim_serial_number",simSerialNumberStart,simSerialNumberEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * NOT BETWEEN  entity().getSimSerialNumber() AND 值2
     * @param simSerialNumberStart       值1
     * @param simSerialNumberEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberNotBetween(String simSerialNumberStart,String simSerialNumberEnd){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null && simSerialNumberEnd!=null){
            notBetween("sim_serial_number",simSerialNumberStart,simSerialNumberEnd);
        }
        return this;
     }


    /**
     * <p>SIM卡的序列号</p>
     * LIKE '%值%'  entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberLike(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            like("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * NOT LIKE '%值%'  entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberNotLike(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            notLike("sim_serial_number",simSerialNumber);
        }
        return this;
     }


    /**
     * <p>SIM卡的序列号</p>
     * LIKE '%值'  entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberLikeLeft(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            likeLeft("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * LIKE '值%'  entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberLikeRight(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            likeRight("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 等于 =
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberEq(String simSerialNumber){
        if(simSerialNumber!=null){
            eq("sim_serial_number",simSerialNumber);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * 不等于 &lt;&gt;
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberNe(String simSerialNumber){
        if(simSerialNumber!=null){
            ne("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 大于 &gt;
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberGt(String simSerialNumber){
        if(simSerialNumber!=null){
            gt("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 大于等于 &gt;=
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberGe(String simSerialNumber){
        if(simSerialNumber!=null){
            ge("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 小于 &lt;
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberLt(String simSerialNumber){
        if(simSerialNumber!=null){
            lt("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 小于等于 &lt;=
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberLe(String simSerialNumber){
        if(simSerialNumber!=null){
            le("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * LIKE '%值%'
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberLike(String simSerialNumber){
        if(simSerialNumber!=null){
            like("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * NOT LIKE '%值%'
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberNotLike(String simSerialNumber){
        if(simSerialNumber!=null){
            notLike("sim_serial_number",simSerialNumber);
        }
        return this;
     }


    /**
     * <p>SIM卡的序列号</p>
     * LIKE '%值'
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberLikeLeft(String simSerialNumber){
        if(simSerialNumber!=null){
            likeLeft("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * LIKE '值%'
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberLikeRight(String simSerialNumber){
        if(simSerialNumber!=null){
            likeRight("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberIsNull(){
        isNull("sim_serial_number");
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberIsNotNull(){
        isNotNull("sim_serial_number");
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("sim_serial_number",value);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberIn(String... values){
        if(values!=null && values.length>0){
            in("sim_serial_number",values);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("sim_serial_number",value);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper simSerialNumberNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("sim_serial_number",values);
        }
        return this;
    }


    /**
     * <p>SIM卡的运营商</p>
     * 等于 = entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorEq(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            eq("network_operator",networkOperator);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * 不等于 &lt;&gt; entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNe(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            ne("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 大于 &gt; entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorGt(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            gt("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 大于等于 &gt;= entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorGe(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            ge("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 小于 &lt; entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorLt(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            lt("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 小于等于 &lt;= entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorLe(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            le("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * BETWEEN  entity().getNetworkOperator() AND networkOperatorEnd
     * @param networkOperatorEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorBetween(String networkOperatorEnd){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null && networkOperatorEnd!=null){
            between("network_operator",networkOperator,networkOperatorEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * NOT BETWEEN  entity().getNetworkOperator() AND 值2
     * @param networkOperatorEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNotBetween(String networkOperatorEnd){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null && networkOperatorEnd!=null){
            notBetween("network_operator",networkOperator,networkOperatorEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * BETWEEN  entity().getNetworkOperator() AND 值2
     * @param networkOperatorStart       值1
     * @param networkOperatorEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorBetween(String networkOperatorStart,String networkOperatorEnd){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null && networkOperatorEnd!=null){
            between("network_operator",networkOperatorStart,networkOperatorEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * NOT BETWEEN  entity().getNetworkOperator() AND 值2
     * @param networkOperatorStart       值1
     * @param networkOperatorEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNotBetween(String networkOperatorStart,String networkOperatorEnd){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null && networkOperatorEnd!=null){
            notBetween("network_operator",networkOperatorStart,networkOperatorEnd);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商</p>
     * LIKE '%值%'  entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorLike(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            like("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * NOT LIKE '%值%'  entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNotLike(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            notLike("network_operator",networkOperator);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商</p>
     * LIKE '%值'  entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorLikeLeft(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            likeLeft("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * LIKE '值%'  entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorLikeRight(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            likeRight("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 等于 =
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorEq(String networkOperator){
        if(networkOperator!=null){
            eq("network_operator",networkOperator);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * 不等于 &lt;&gt;
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNe(String networkOperator){
        if(networkOperator!=null){
            ne("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 大于 &gt;
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorGt(String networkOperator){
        if(networkOperator!=null){
            gt("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 大于等于 &gt;=
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorGe(String networkOperator){
        if(networkOperator!=null){
            ge("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 小于 &lt;
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorLt(String networkOperator){
        if(networkOperator!=null){
            lt("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 小于等于 &lt;=
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorLe(String networkOperator){
        if(networkOperator!=null){
            le("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * LIKE '%值%'
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorLike(String networkOperator){
        if(networkOperator!=null){
            like("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * NOT LIKE '%值%'
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNotLike(String networkOperator){
        if(networkOperator!=null){
            notLike("network_operator",networkOperator);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商</p>
     * LIKE '%值'
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorLikeLeft(String networkOperator){
        if(networkOperator!=null){
            likeLeft("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * LIKE '值%'
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorLikeRight(String networkOperator){
        if(networkOperator!=null){
            likeRight("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorIsNull(){
        isNull("network_operator");
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorIsNotNull(){
        isNotNull("network_operator");
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("network_operator",value);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorIn(String... values){
        if(values!=null && values.length>0){
            in("network_operator",values);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("network_operator",value);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("network_operator",values);
        }
        return this;
    }


    /**
     * <p>SIM卡的运营商名称</p>
     * 等于 = entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameEq(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            eq("network_operator_name",networkOperatorName);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * 不等于 &lt;&gt; entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameNe(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            ne("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 大于 &gt; entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameGt(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            gt("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 大于等于 &gt;= entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameGe(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            ge("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 小于 &lt; entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameLt(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            lt("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 小于等于 &lt;= entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameLe(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            le("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * BETWEEN  entity().getNetworkOperatorName() AND networkOperatorNameEnd
     * @param networkOperatorNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameBetween(String networkOperatorNameEnd){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null && networkOperatorNameEnd!=null){
            between("network_operator_name",networkOperatorName,networkOperatorNameEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * NOT BETWEEN  entity().getNetworkOperatorName() AND 值2
     * @param networkOperatorNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameNotBetween(String networkOperatorNameEnd){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null && networkOperatorNameEnd!=null){
            notBetween("network_operator_name",networkOperatorName,networkOperatorNameEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * BETWEEN  entity().getNetworkOperatorName() AND 值2
     * @param networkOperatorNameStart       值1
     * @param networkOperatorNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameBetween(String networkOperatorNameStart,String networkOperatorNameEnd){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null && networkOperatorNameEnd!=null){
            between("network_operator_name",networkOperatorNameStart,networkOperatorNameEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * NOT BETWEEN  entity().getNetworkOperatorName() AND 值2
     * @param networkOperatorNameStart       值1
     * @param networkOperatorNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameNotBetween(String networkOperatorNameStart,String networkOperatorNameEnd){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null && networkOperatorNameEnd!=null){
            notBetween("network_operator_name",networkOperatorNameStart,networkOperatorNameEnd);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '%值%'  entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameLike(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            like("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * NOT LIKE '%值%'  entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameNotLike(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            notLike("network_operator_name",networkOperatorName);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '%值'  entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameLikeLeft(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            likeLeft("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '值%'  entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameLikeRight(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            likeRight("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 等于 =
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameEq(String networkOperatorName){
        if(networkOperatorName!=null){
            eq("network_operator_name",networkOperatorName);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * 不等于 &lt;&gt;
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameNe(String networkOperatorName){
        if(networkOperatorName!=null){
            ne("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 大于 &gt;
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameGt(String networkOperatorName){
        if(networkOperatorName!=null){
            gt("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 大于等于 &gt;=
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameGe(String networkOperatorName){
        if(networkOperatorName!=null){
            ge("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 小于 &lt;
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameLt(String networkOperatorName){
        if(networkOperatorName!=null){
            lt("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 小于等于 &lt;=
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameLe(String networkOperatorName){
        if(networkOperatorName!=null){
            le("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '%值%'
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameLike(String networkOperatorName){
        if(networkOperatorName!=null){
            like("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * NOT LIKE '%值%'
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameNotLike(String networkOperatorName){
        if(networkOperatorName!=null){
            notLike("network_operator_name",networkOperatorName);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '%值'
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameLikeLeft(String networkOperatorName){
        if(networkOperatorName!=null){
            likeLeft("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '值%'
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameLikeRight(String networkOperatorName){
        if(networkOperatorName!=null){
            likeRight("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameIsNull(){
        isNull("network_operator_name");
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameIsNotNull(){
        isNotNull("network_operator_name");
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("network_operator_name",value);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameIn(String... values){
        if(values!=null && values.length>0){
            in("network_operator_name",values);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("network_operator_name",value);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper networkOperatorNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("network_operator_name",values);
        }
        return this;
    }


    /**
     * <p>UI mode</p>
     * 等于 = entity().getUimode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeEq(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            eq("uimode",uimode);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * 不等于 &lt;&gt; entity().getUimode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeNe(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            ne("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 大于 &gt; entity().getUimode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeGt(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            gt("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 大于等于 &gt;= entity().getUimode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeGe(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            ge("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 小于 &lt; entity().getUimode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeLt(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            lt("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 小于等于 &lt;= entity().getUimode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeLe(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            le("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * BETWEEN  entity().getUimode() AND uimodeEnd
     * @param uimodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeBetween(String uimodeEnd){
        String uimode =entity().getUimode();
        if(uimode!=null && uimodeEnd!=null){
            between("uimode",uimode,uimodeEnd);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * NOT BETWEEN  entity().getUimode() AND 值2
     * @param uimodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeNotBetween(String uimodeEnd){
        String uimode =entity().getUimode();
        if(uimode!=null && uimodeEnd!=null){
            notBetween("uimode",uimode,uimodeEnd);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * BETWEEN  entity().getUimode() AND 值2
     * @param uimodeStart       值1
     * @param uimodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeBetween(String uimodeStart,String uimodeEnd){
        String uimode =entity().getUimode();
        if(uimode!=null && uimodeEnd!=null){
            between("uimode",uimodeStart,uimodeEnd);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * NOT BETWEEN  entity().getUimode() AND 值2
     * @param uimodeStart       值1
     * @param uimodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeNotBetween(String uimodeStart,String uimodeEnd){
        String uimode =entity().getUimode();
        if(uimode!=null && uimodeEnd!=null){
            notBetween("uimode",uimodeStart,uimodeEnd);
        }
        return this;
     }


    /**
     * <p>UI mode</p>
     * LIKE '%值%'  entity().getUimode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeLike(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            like("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * NOT LIKE '%值%'  entity().getUimode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeNotLike(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            notLike("uimode",uimode);
        }
        return this;
     }


    /**
     * <p>UI mode</p>
     * LIKE '%值'  entity().getUimode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeLikeLeft(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            likeLeft("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * LIKE '值%'  entity().getUimode()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeLikeRight(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            likeRight("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 等于 =
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeEq(String uimode){
        if(uimode!=null){
            eq("uimode",uimode);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * 不等于 &lt;&gt;
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeNe(String uimode){
        if(uimode!=null){
            ne("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 大于 &gt;
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeGt(String uimode){
        if(uimode!=null){
            gt("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 大于等于 &gt;=
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeGe(String uimode){
        if(uimode!=null){
            ge("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 小于 &lt;
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeLt(String uimode){
        if(uimode!=null){
            lt("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 小于等于 &lt;=
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeLe(String uimode){
        if(uimode!=null){
            le("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * LIKE '%值%'
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeLike(String uimode){
        if(uimode!=null){
            like("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * NOT LIKE '%值%'
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeNotLike(String uimode){
        if(uimode!=null){
            notLike("uimode",uimode);
        }
        return this;
     }


    /**
     * <p>UI mode</p>
     * LIKE '%值'
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeLikeLeft(String uimode){
        if(uimode!=null){
            likeLeft("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * LIKE '值%'
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeLikeRight(String uimode){
        if(uimode!=null){
            likeRight("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeIsNull(){
        isNull("uimode");
        return this;
    }

    /**
     * <p>UI mode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeIsNotNull(){
        isNotNull("uimode");
        return this;
    }

    /**
     * <p>UI mode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("uimode",value);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeIn(String... values){
        if(values!=null && values.length>0){
            in("uimode",values);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("uimode",value);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper uimodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("uimode",values);
        }
        return this;
    }


    /**
     * <p>resolution</p>
     * 等于 = entity().getResolution()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionEq(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            eq("resolution",resolution);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * 不等于 &lt;&gt; entity().getResolution()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionNe(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            ne("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 大于 &gt; entity().getResolution()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionGt(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            gt("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 大于等于 &gt;= entity().getResolution()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionGe(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            ge("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 小于 &lt; entity().getResolution()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionLt(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            lt("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 小于等于 &lt;= entity().getResolution()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionLe(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            le("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * BETWEEN  entity().getResolution() AND resolutionEnd
     * @param resolutionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionBetween(String resolutionEnd){
        String resolution =entity().getResolution();
        if(resolution!=null && resolutionEnd!=null){
            between("resolution",resolution,resolutionEnd);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * NOT BETWEEN  entity().getResolution() AND 值2
     * @param resolutionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionNotBetween(String resolutionEnd){
        String resolution =entity().getResolution();
        if(resolution!=null && resolutionEnd!=null){
            notBetween("resolution",resolution,resolutionEnd);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * BETWEEN  entity().getResolution() AND 值2
     * @param resolutionStart       值1
     * @param resolutionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionBetween(String resolutionStart,String resolutionEnd){
        String resolution =entity().getResolution();
        if(resolution!=null && resolutionEnd!=null){
            between("resolution",resolutionStart,resolutionEnd);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * NOT BETWEEN  entity().getResolution() AND 值2
     * @param resolutionStart       值1
     * @param resolutionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionNotBetween(String resolutionStart,String resolutionEnd){
        String resolution =entity().getResolution();
        if(resolution!=null && resolutionEnd!=null){
            notBetween("resolution",resolutionStart,resolutionEnd);
        }
        return this;
     }


    /**
     * <p>resolution</p>
     * LIKE '%值%'  entity().getResolution()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionLike(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            like("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * NOT LIKE '%值%'  entity().getResolution()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionNotLike(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            notLike("resolution",resolution);
        }
        return this;
     }


    /**
     * <p>resolution</p>
     * LIKE '%值'  entity().getResolution()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionLikeLeft(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            likeLeft("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * LIKE '值%'  entity().getResolution()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionLikeRight(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            likeRight("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 等于 =
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionEq(String resolution){
        if(resolution!=null){
            eq("resolution",resolution);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * 不等于 &lt;&gt;
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionNe(String resolution){
        if(resolution!=null){
            ne("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 大于 &gt;
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionGt(String resolution){
        if(resolution!=null){
            gt("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 大于等于 &gt;=
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionGe(String resolution){
        if(resolution!=null){
            ge("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 小于 &lt;
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionLt(String resolution){
        if(resolution!=null){
            lt("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 小于等于 &lt;=
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionLe(String resolution){
        if(resolution!=null){
            le("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * LIKE '%值%'
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionLike(String resolution){
        if(resolution!=null){
            like("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * NOT LIKE '%值%'
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionNotLike(String resolution){
        if(resolution!=null){
            notLike("resolution",resolution);
        }
        return this;
     }


    /**
     * <p>resolution</p>
     * LIKE '%值'
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionLikeLeft(String resolution){
        if(resolution!=null){
            likeLeft("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * LIKE '值%'
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionLikeRight(String resolution){
        if(resolution!=null){
            likeRight("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionIsNull(){
        isNull("resolution");
        return this;
    }

    /**
     * <p>resolution</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionIsNotNull(){
        isNotNull("resolution");
        return this;
    }

    /**
     * <p>resolution</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("resolution",value);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionIn(String... values){
        if(values!=null && values.length>0){
            in("resolution",values);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("resolution",value);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper resolutionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("resolution",values);
        }
        return this;
    }


    /**
     * <p>totalMem</p>
     * 等于 = entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemEq(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            eq("total_mem",totalMem);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * 不等于 &lt;&gt; entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemNe(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            ne("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 大于 &gt; entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemGt(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            gt("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 大于等于 &gt;= entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemGe(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            ge("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 小于 &lt; entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemLt(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            lt("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 小于等于 &lt;= entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemLe(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            le("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * BETWEEN  entity().getTotalMem() AND totalMemEnd
     * @param totalMemEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemBetween(Long totalMemEnd){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null && totalMemEnd!=null){
            between("total_mem",totalMem,totalMemEnd);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * NOT BETWEEN  entity().getTotalMem() AND 值2
     * @param totalMemEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemNotBetween(Long totalMemEnd){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null && totalMemEnd!=null){
            notBetween("total_mem",totalMem,totalMemEnd);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * BETWEEN  entity().getTotalMem() AND 值2
     * @param totalMemStart       值1
     * @param totalMemEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemBetween(Long totalMemStart,Long totalMemEnd){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null && totalMemEnd!=null){
            between("total_mem",totalMemStart,totalMemEnd);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * NOT BETWEEN  entity().getTotalMem() AND 值2
     * @param totalMemStart       值1
     * @param totalMemEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemNotBetween(Long totalMemStart,Long totalMemEnd){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null && totalMemEnd!=null){
            notBetween("total_mem",totalMemStart,totalMemEnd);
        }
        return this;
     }


    /**
     * <p>totalMem</p>
     * LIKE '%值%'  entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemLike(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            like("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * NOT LIKE '%值%'  entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemNotLike(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            notLike("total_mem",totalMem);
        }
        return this;
     }


    /**
     * <p>totalMem</p>
     * LIKE '%值'  entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemLikeLeft(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            likeLeft("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * LIKE '值%'  entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemLikeRight(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            likeRight("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 等于 =
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemEq(Long totalMem){
        if(totalMem!=null){
            eq("total_mem",totalMem);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * 不等于 &lt;&gt;
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemNe(Long totalMem){
        if(totalMem!=null){
            ne("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 大于 &gt;
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemGt(Long totalMem){
        if(totalMem!=null){
            gt("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 大于等于 &gt;=
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemGe(Long totalMem){
        if(totalMem!=null){
            ge("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 小于 &lt;
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemLt(Long totalMem){
        if(totalMem!=null){
            lt("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 小于等于 &lt;=
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemLe(Long totalMem){
        if(totalMem!=null){
            le("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * LIKE '%值%'
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemLike(Long totalMem){
        if(totalMem!=null){
            like("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * NOT LIKE '%值%'
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemNotLike(Long totalMem){
        if(totalMem!=null){
            notLike("total_mem",totalMem);
        }
        return this;
     }


    /**
     * <p>totalMem</p>
     * LIKE '%值'
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemLikeLeft(Long totalMem){
        if(totalMem!=null){
            likeLeft("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * LIKE '值%'
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemLikeRight(Long totalMem){
        if(totalMem!=null){
            likeRight("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemIsNull(){
        isNull("total_mem");
        return this;
    }

    /**
     * <p>totalMem</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemIsNotNull(){
        isNotNull("total_mem");
        return this;
    }

    /**
     * <p>totalMem</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("total_mem",value);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemIn(Long... values){
        if(values!=null && values.length>0){
            in("total_mem",values);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("total_mem",value);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalMemNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("total_mem",values);
        }
        return this;
    }


    /**
     * <p>availMem</p>
     * 等于 = entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemEq(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            eq("avail_mem",availMem);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * 不等于 &lt;&gt; entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemNe(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            ne("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 大于 &gt; entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemGt(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            gt("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 大于等于 &gt;= entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemGe(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            ge("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 小于 &lt; entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemLt(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            lt("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 小于等于 &lt;= entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemLe(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            le("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * BETWEEN  entity().getAvailMem() AND availMemEnd
     * @param availMemEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemBetween(Long availMemEnd){
        Long availMem =entity().getAvailMem();
        if(availMem!=null && availMemEnd!=null){
            between("avail_mem",availMem,availMemEnd);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * NOT BETWEEN  entity().getAvailMem() AND 值2
     * @param availMemEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemNotBetween(Long availMemEnd){
        Long availMem =entity().getAvailMem();
        if(availMem!=null && availMemEnd!=null){
            notBetween("avail_mem",availMem,availMemEnd);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * BETWEEN  entity().getAvailMem() AND 值2
     * @param availMemStart       值1
     * @param availMemEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemBetween(Long availMemStart,Long availMemEnd){
        Long availMem =entity().getAvailMem();
        if(availMem!=null && availMemEnd!=null){
            between("avail_mem",availMemStart,availMemEnd);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * NOT BETWEEN  entity().getAvailMem() AND 值2
     * @param availMemStart       值1
     * @param availMemEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemNotBetween(Long availMemStart,Long availMemEnd){
        Long availMem =entity().getAvailMem();
        if(availMem!=null && availMemEnd!=null){
            notBetween("avail_mem",availMemStart,availMemEnd);
        }
        return this;
     }


    /**
     * <p>availMem</p>
     * LIKE '%值%'  entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemLike(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            like("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * NOT LIKE '%值%'  entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemNotLike(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            notLike("avail_mem",availMem);
        }
        return this;
     }


    /**
     * <p>availMem</p>
     * LIKE '%值'  entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemLikeLeft(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            likeLeft("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * LIKE '值%'  entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemLikeRight(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            likeRight("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 等于 =
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemEq(Long availMem){
        if(availMem!=null){
            eq("avail_mem",availMem);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * 不等于 &lt;&gt;
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemNe(Long availMem){
        if(availMem!=null){
            ne("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 大于 &gt;
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemGt(Long availMem){
        if(availMem!=null){
            gt("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 大于等于 &gt;=
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemGe(Long availMem){
        if(availMem!=null){
            ge("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 小于 &lt;
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemLt(Long availMem){
        if(availMem!=null){
            lt("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 小于等于 &lt;=
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemLe(Long availMem){
        if(availMem!=null){
            le("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * LIKE '%值%'
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemLike(Long availMem){
        if(availMem!=null){
            like("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * NOT LIKE '%值%'
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemNotLike(Long availMem){
        if(availMem!=null){
            notLike("avail_mem",availMem);
        }
        return this;
     }


    /**
     * <p>availMem</p>
     * LIKE '%值'
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemLikeLeft(Long availMem){
        if(availMem!=null){
            likeLeft("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * LIKE '值%'
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemLikeRight(Long availMem){
        if(availMem!=null){
            likeRight("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemIsNull(){
        isNull("avail_mem");
        return this;
    }

    /**
     * <p>availMem</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemIsNotNull(){
        isNotNull("avail_mem");
        return this;
    }

    /**
     * <p>availMem</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("avail_mem",value);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemIn(Long... values){
        if(values!=null && values.length>0){
            in("avail_mem",values);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("avail_mem",value);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availMemNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("avail_mem",values);
        }
        return this;
    }


    /**
     * <p>totalStorage</p>
     * 等于 = entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageEq(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            eq("total_storage",totalStorage);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * 不等于 &lt;&gt; entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageNe(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            ne("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 大于 &gt; entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageGt(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            gt("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 大于等于 &gt;= entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageGe(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            ge("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 小于 &lt; entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageLt(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            lt("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 小于等于 &lt;= entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageLe(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            le("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * BETWEEN  entity().getTotalStorage() AND totalStorageEnd
     * @param totalStorageEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageBetween(Long totalStorageEnd){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null && totalStorageEnd!=null){
            between("total_storage",totalStorage,totalStorageEnd);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * NOT BETWEEN  entity().getTotalStorage() AND 值2
     * @param totalStorageEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageNotBetween(Long totalStorageEnd){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null && totalStorageEnd!=null){
            notBetween("total_storage",totalStorage,totalStorageEnd);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * BETWEEN  entity().getTotalStorage() AND 值2
     * @param totalStorageStart       值1
     * @param totalStorageEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageBetween(Long totalStorageStart,Long totalStorageEnd){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null && totalStorageEnd!=null){
            between("total_storage",totalStorageStart,totalStorageEnd);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * NOT BETWEEN  entity().getTotalStorage() AND 值2
     * @param totalStorageStart       值1
     * @param totalStorageEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageNotBetween(Long totalStorageStart,Long totalStorageEnd){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null && totalStorageEnd!=null){
            notBetween("total_storage",totalStorageStart,totalStorageEnd);
        }
        return this;
     }


    /**
     * <p>totalStorage</p>
     * LIKE '%值%'  entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageLike(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            like("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * NOT LIKE '%值%'  entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageNotLike(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            notLike("total_storage",totalStorage);
        }
        return this;
     }


    /**
     * <p>totalStorage</p>
     * LIKE '%值'  entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageLikeLeft(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            likeLeft("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * LIKE '值%'  entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageLikeRight(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            likeRight("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 等于 =
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageEq(Long totalStorage){
        if(totalStorage!=null){
            eq("total_storage",totalStorage);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * 不等于 &lt;&gt;
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageNe(Long totalStorage){
        if(totalStorage!=null){
            ne("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 大于 &gt;
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageGt(Long totalStorage){
        if(totalStorage!=null){
            gt("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 大于等于 &gt;=
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageGe(Long totalStorage){
        if(totalStorage!=null){
            ge("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 小于 &lt;
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageLt(Long totalStorage){
        if(totalStorage!=null){
            lt("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 小于等于 &lt;=
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageLe(Long totalStorage){
        if(totalStorage!=null){
            le("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * LIKE '%值%'
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageLike(Long totalStorage){
        if(totalStorage!=null){
            like("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * NOT LIKE '%值%'
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageNotLike(Long totalStorage){
        if(totalStorage!=null){
            notLike("total_storage",totalStorage);
        }
        return this;
     }


    /**
     * <p>totalStorage</p>
     * LIKE '%值'
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageLikeLeft(Long totalStorage){
        if(totalStorage!=null){
            likeLeft("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * LIKE '值%'
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageLikeRight(Long totalStorage){
        if(totalStorage!=null){
            likeRight("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageIsNull(){
        isNull("total_storage");
        return this;
    }

    /**
     * <p>totalStorage</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageIsNotNull(){
        isNotNull("total_storage");
        return this;
    }

    /**
     * <p>totalStorage</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("total_storage",value);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageIn(Long... values){
        if(values!=null && values.length>0){
            in("total_storage",values);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("total_storage",value);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper totalStorageNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("total_storage",values);
        }
        return this;
    }


    /**
     * <p>availStorage</p>
     * 等于 = entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageEq(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            eq("avail_storage",availStorage);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * 不等于 &lt;&gt; entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageNe(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            ne("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 大于 &gt; entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageGt(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            gt("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 大于等于 &gt;= entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageGe(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            ge("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 小于 &lt; entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageLt(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            lt("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 小于等于 &lt;= entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageLe(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            le("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * BETWEEN  entity().getAvailStorage() AND availStorageEnd
     * @param availStorageEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageBetween(Long availStorageEnd){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null && availStorageEnd!=null){
            between("avail_storage",availStorage,availStorageEnd);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * NOT BETWEEN  entity().getAvailStorage() AND 值2
     * @param availStorageEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageNotBetween(Long availStorageEnd){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null && availStorageEnd!=null){
            notBetween("avail_storage",availStorage,availStorageEnd);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * BETWEEN  entity().getAvailStorage() AND 值2
     * @param availStorageStart       值1
     * @param availStorageEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageBetween(Long availStorageStart,Long availStorageEnd){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null && availStorageEnd!=null){
            between("avail_storage",availStorageStart,availStorageEnd);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * NOT BETWEEN  entity().getAvailStorage() AND 值2
     * @param availStorageStart       值1
     * @param availStorageEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageNotBetween(Long availStorageStart,Long availStorageEnd){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null && availStorageEnd!=null){
            notBetween("avail_storage",availStorageStart,availStorageEnd);
        }
        return this;
     }


    /**
     * <p>availStorage</p>
     * LIKE '%值%'  entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageLike(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            like("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * NOT LIKE '%值%'  entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageNotLike(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            notLike("avail_storage",availStorage);
        }
        return this;
     }


    /**
     * <p>availStorage</p>
     * LIKE '%值'  entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageLikeLeft(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            likeLeft("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * LIKE '值%'  entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageLikeRight(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            likeRight("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 等于 =
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageEq(Long availStorage){
        if(availStorage!=null){
            eq("avail_storage",availStorage);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * 不等于 &lt;&gt;
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageNe(Long availStorage){
        if(availStorage!=null){
            ne("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 大于 &gt;
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageGt(Long availStorage){
        if(availStorage!=null){
            gt("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 大于等于 &gt;=
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageGe(Long availStorage){
        if(availStorage!=null){
            ge("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 小于 &lt;
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageLt(Long availStorage){
        if(availStorage!=null){
            lt("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 小于等于 &lt;=
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageLe(Long availStorage){
        if(availStorage!=null){
            le("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * LIKE '%值%'
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageLike(Long availStorage){
        if(availStorage!=null){
            like("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * NOT LIKE '%值%'
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageNotLike(Long availStorage){
        if(availStorage!=null){
            notLike("avail_storage",availStorage);
        }
        return this;
     }


    /**
     * <p>availStorage</p>
     * LIKE '%值'
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageLikeLeft(Long availStorage){
        if(availStorage!=null){
            likeLeft("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * LIKE '值%'
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageLikeRight(Long availStorage){
        if(availStorage!=null){
            likeRight("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageIsNull(){
        isNull("avail_storage");
        return this;
    }

    /**
     * <p>availStorage</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageIsNotNull(){
        isNotNull("avail_storage");
        return this;
    }

    /**
     * <p>availStorage</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("avail_storage",value);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageIn(Long... values){
        if(values!=null && values.length>0){
            in("avail_storage",values);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("avail_storage",value);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper availStorageNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("avail_storage",values);
        }
        return this;
    }


    /**
     * <p>root_access(true:1；false:0)</p>
     * 等于 = entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessEq(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            eq("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 不等于 &lt;&gt; entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessNe(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            ne("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 大于 &gt; entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessGt(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            gt("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 大于等于 &gt;= entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessGe(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            ge("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 小于 &lt; entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessLt(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            lt("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 小于等于 &lt;= entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessLe(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            le("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * BETWEEN  entity().getRootAccess() AND rootAccessEnd
     * @param rootAccessEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessBetween(Integer rootAccessEnd){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null && rootAccessEnd!=null){
            between("root_access",rootAccess,rootAccessEnd);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * NOT BETWEEN  entity().getRootAccess() AND 值2
     * @param rootAccessEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessNotBetween(Integer rootAccessEnd){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null && rootAccessEnd!=null){
            notBetween("root_access",rootAccess,rootAccessEnd);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * BETWEEN  entity().getRootAccess() AND 值2
     * @param rootAccessStart       值1
     * @param rootAccessEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessBetween(Integer rootAccessStart,Integer rootAccessEnd){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null && rootAccessEnd!=null){
            between("root_access",rootAccessStart,rootAccessEnd);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * NOT BETWEEN  entity().getRootAccess() AND 值2
     * @param rootAccessStart       值1
     * @param rootAccessEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessNotBetween(Integer rootAccessStart,Integer rootAccessEnd){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null && rootAccessEnd!=null){
            notBetween("root_access",rootAccessStart,rootAccessEnd);
        }
        return this;
     }


    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '%值%'  entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessLike(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            like("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * NOT LIKE '%值%'  entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessNotLike(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            notLike("root_access",rootAccess);
        }
        return this;
     }


    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '%值'  entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessLikeLeft(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            likeLeft("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '值%'  entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessLikeRight(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            likeRight("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 等于 =
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessEq(Integer rootAccess){
        if(rootAccess!=null){
            eq("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 不等于 &lt;&gt;
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessNe(Integer rootAccess){
        if(rootAccess!=null){
            ne("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 大于 &gt;
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessGt(Integer rootAccess){
        if(rootAccess!=null){
            gt("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 大于等于 &gt;=
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessGe(Integer rootAccess){
        if(rootAccess!=null){
            ge("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 小于 &lt;
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessLt(Integer rootAccess){
        if(rootAccess!=null){
            lt("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 小于等于 &lt;=
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessLe(Integer rootAccess){
        if(rootAccess!=null){
            le("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '%值%'
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessLike(Integer rootAccess){
        if(rootAccess!=null){
            like("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * NOT LIKE '%值%'
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessNotLike(Integer rootAccess){
        if(rootAccess!=null){
            notLike("root_access",rootAccess);
        }
        return this;
     }


    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '%值'
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessLikeLeft(Integer rootAccess){
        if(rootAccess!=null){
            likeLeft("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '值%'
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessLikeRight(Integer rootAccess){
        if(rootAccess!=null){
            likeRight("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessIsNull(){
        isNull("root_access");
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessIsNotNull(){
        isNotNull("root_access");
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("root_access",value);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessIn(Integer... values){
        if(values!=null && values.length>0){
            in("root_access",values);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("root_access",value);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper rootAccessNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("root_access",values);
        }
        return this;
    }


    /**
     * <p>经度</p>
     * 等于 = entity().getLng()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngEq(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            eq("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 不等于 &lt;&gt; entity().getLng()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngNe(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            ne("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 大于 &gt; entity().getLng()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngGt(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            gt("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 大于等于 &gt;= entity().getLng()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngGe(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            ge("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 小于 &lt; entity().getLng()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngLt(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            lt("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 小于等于 &lt;= entity().getLng()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngLe(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            le("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * BETWEEN  entity().getLng() AND lngEnd
     * @param lngEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngBetween(BigDecimal lngEnd){
        BigDecimal lng =entity().getLng();
        if(lng!=null && lngEnd!=null){
            between("lng",lng,lngEnd);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT BETWEEN  entity().getLng() AND 值2
     * @param lngEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngNotBetween(BigDecimal lngEnd){
        BigDecimal lng =entity().getLng();
        if(lng!=null && lngEnd!=null){
            notBetween("lng",lng,lngEnd);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * BETWEEN  entity().getLng() AND 值2
     * @param lngStart       值1
     * @param lngEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngBetween(BigDecimal lngStart,BigDecimal lngEnd){
        BigDecimal lng =entity().getLng();
        if(lng!=null && lngEnd!=null){
            between("lng",lngStart,lngEnd);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT BETWEEN  entity().getLng() AND 值2
     * @param lngStart       值1
     * @param lngEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngNotBetween(BigDecimal lngStart,BigDecimal lngEnd){
        BigDecimal lng =entity().getLng();
        if(lng!=null && lngEnd!=null){
            notBetween("lng",lngStart,lngEnd);
        }
        return this;
     }


    /**
     * <p>经度</p>
     * LIKE '%值%'  entity().getLng()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngLike(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            like("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT LIKE '%值%'  entity().getLng()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngNotLike(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            notLike("lng",lng);
        }
        return this;
     }


    /**
     * <p>经度</p>
     * LIKE '%值'  entity().getLng()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngLikeLeft(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            likeLeft("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * LIKE '值%'  entity().getLng()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngLikeRight(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            likeRight("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 等于 =
     * @param lng       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngEq(BigDecimal lng){
        if(lng!=null){
            eq("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 不等于 &lt;&gt;
     * @param lng       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngNe(BigDecimal lng){
        if(lng!=null){
            ne("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 大于 &gt;
     * @param lng       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngGt(BigDecimal lng){
        if(lng!=null){
            gt("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 大于等于 &gt;=
     * @param lng       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngGe(BigDecimal lng){
        if(lng!=null){
            ge("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 小于 &lt;
     * @param lng       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngLt(BigDecimal lng){
        if(lng!=null){
            lt("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 小于等于 &lt;=
     * @param lng       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngLe(BigDecimal lng){
        if(lng!=null){
            le("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * LIKE '%值%'
     * @param lng       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngLike(BigDecimal lng){
        if(lng!=null){
            like("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT LIKE '%值%'
     * @param lng       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngNotLike(BigDecimal lng){
        if(lng!=null){
            notLike("lng",lng);
        }
        return this;
     }


    /**
     * <p>经度</p>
     * LIKE '%值'
     * @param lng       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngLikeLeft(BigDecimal lng){
        if(lng!=null){
            likeLeft("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * LIKE '值%'
     * @param lng       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngLikeRight(BigDecimal lng){
        if(lng!=null){
            likeRight("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngIsNull(){
        isNull("lng");
        return this;
    }

    /**
     * <p>经度</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngIsNotNull(){
        isNotNull("lng");
        return this;
    }

    /**
     * <p>经度</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngIn(Collection<BigDecimal> value){
        if(value!=null && !value.isEmpty()){
            in("lng",value);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngIn(BigDecimal... values){
        if(values!=null && values.length>0){
            in("lng",values);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngNotIn(Collection<BigDecimal> value){
        if(value!=null && !value.isEmpty()){
            notIn("lng",value);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lngNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("lng",values);
        }
        return this;
    }


    /**
     * <p>纬度</p>
     * 等于 = entity().getLat()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latEq(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            eq("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 不等于 &lt;&gt; entity().getLat()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latNe(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            ne("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 大于 &gt; entity().getLat()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latGt(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            gt("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 大于等于 &gt;= entity().getLat()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latGe(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            ge("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 小于 &lt; entity().getLat()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latLt(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            lt("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 小于等于 &lt;= entity().getLat()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latLe(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            le("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * BETWEEN  entity().getLat() AND latEnd
     * @param latEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latBetween(BigDecimal latEnd){
        BigDecimal lat =entity().getLat();
        if(lat!=null && latEnd!=null){
            between("lat",lat,latEnd);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT BETWEEN  entity().getLat() AND 值2
     * @param latEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latNotBetween(BigDecimal latEnd){
        BigDecimal lat =entity().getLat();
        if(lat!=null && latEnd!=null){
            notBetween("lat",lat,latEnd);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * BETWEEN  entity().getLat() AND 值2
     * @param latStart       值1
     * @param latEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latBetween(BigDecimal latStart,BigDecimal latEnd){
        BigDecimal lat =entity().getLat();
        if(lat!=null && latEnd!=null){
            between("lat",latStart,latEnd);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT BETWEEN  entity().getLat() AND 值2
     * @param latStart       值1
     * @param latEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latNotBetween(BigDecimal latStart,BigDecimal latEnd){
        BigDecimal lat =entity().getLat();
        if(lat!=null && latEnd!=null){
            notBetween("lat",latStart,latEnd);
        }
        return this;
     }


    /**
     * <p>纬度</p>
     * LIKE '%值%'  entity().getLat()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latLike(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            like("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT LIKE '%值%'  entity().getLat()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latNotLike(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            notLike("lat",lat);
        }
        return this;
     }


    /**
     * <p>纬度</p>
     * LIKE '%值'  entity().getLat()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latLikeLeft(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            likeLeft("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * LIKE '值%'  entity().getLat()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latLikeRight(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            likeRight("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 等于 =
     * @param lat       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latEq(BigDecimal lat){
        if(lat!=null){
            eq("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 不等于 &lt;&gt;
     * @param lat       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latNe(BigDecimal lat){
        if(lat!=null){
            ne("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 大于 &gt;
     * @param lat       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latGt(BigDecimal lat){
        if(lat!=null){
            gt("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 大于等于 &gt;=
     * @param lat       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latGe(BigDecimal lat){
        if(lat!=null){
            ge("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 小于 &lt;
     * @param lat       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latLt(BigDecimal lat){
        if(lat!=null){
            lt("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 小于等于 &lt;=
     * @param lat       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latLe(BigDecimal lat){
        if(lat!=null){
            le("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * LIKE '%值%'
     * @param lat       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latLike(BigDecimal lat){
        if(lat!=null){
            like("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT LIKE '%值%'
     * @param lat       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latNotLike(BigDecimal lat){
        if(lat!=null){
            notLike("lat",lat);
        }
        return this;
     }


    /**
     * <p>纬度</p>
     * LIKE '%值'
     * @param lat       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latLikeLeft(BigDecimal lat){
        if(lat!=null){
            likeLeft("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * LIKE '值%'
     * @param lat       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latLikeRight(BigDecimal lat){
        if(lat!=null){
            likeRight("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latIsNull(){
        isNull("lat");
        return this;
    }

    /**
     * <p>纬度</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latIsNotNull(){
        isNotNull("lat");
        return this;
    }

    /**
     * <p>纬度</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latIn(Collection<BigDecimal> value){
        if(value!=null && !value.isEmpty()){
            in("lat",value);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latIn(BigDecimal... values){
        if(values!=null && values.length>0){
            in("lat",values);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latNotIn(Collection<BigDecimal> value){
        if(value!=null && !value.isEmpty()){
            notIn("lat",value);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper latNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("lat",values);
        }
        return this;
    }


    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 等于 = entity().getBizType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeEq(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            eq("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 不等于 &lt;&gt; entity().getBizType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeNe(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            ne("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 大于 &gt; entity().getBizType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeGt(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            gt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 大于等于 &gt;= entity().getBizType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeGe(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            ge("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 小于 &lt; entity().getBizType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeLt(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            lt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 小于等于 &lt;= entity().getBizType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeLe(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            le("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * BETWEEN  entity().getBizType() AND bizTypeEnd
     * @param bizTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeBetween(Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            between("biz_type",bizType,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * NOT BETWEEN  entity().getBizType() AND 值2
     * @param bizTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeNotBetween(Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            notBetween("biz_type",bizType,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * BETWEEN  entity().getBizType() AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeBetween(Integer bizTypeStart,Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            between("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * NOT BETWEEN  entity().getBizType() AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeNotBetween(Integer bizTypeStart,Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            notBetween("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }


    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '%值%'  entity().getBizType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeLike(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            like("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * NOT LIKE '%值%'  entity().getBizType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeNotLike(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            notLike("biz_type",bizType);
        }
        return this;
     }


    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '%值'  entity().getBizType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeLikeLeft(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            likeLeft("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '值%'  entity().getBizType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeLikeRight(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            likeRight("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 等于 =
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeEq(Integer bizType){
        if(bizType!=null){
            eq("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 不等于 &lt;&gt;
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeNe(Integer bizType){
        if(bizType!=null){
            ne("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 大于 &gt;
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeGt(Integer bizType){
        if(bizType!=null){
            gt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 大于等于 &gt;=
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeGe(Integer bizType){
        if(bizType!=null){
            ge("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 小于 &lt;
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeLt(Integer bizType){
        if(bizType!=null){
            lt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 小于等于 &lt;=
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeLe(Integer bizType){
        if(bizType!=null){
            le("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '%值%'
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeLike(Integer bizType){
        if(bizType!=null){
            like("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * NOT LIKE '%值%'
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeNotLike(Integer bizType){
        if(bizType!=null){
            notLike("biz_type",bizType);
        }
        return this;
     }


    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '%值'
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeLikeLeft(Integer bizType){
        if(bizType!=null){
            likeLeft("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '值%'
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeLikeRight(Integer bizType){
        if(bizType!=null){
            likeRight("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeIsNull(){
        isNull("biz_type");
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeIsNotNull(){
        isNotNull("biz_type");
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("biz_type",value);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("biz_type",values);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("biz_type",value);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper bizTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("biz_type",values);
        }
        return this;
    }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 等于 = entity().getServerType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeEq(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 不等于 &lt;&gt; entity().getServerType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeNe(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 大于 &gt; entity().getServerType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeGt(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 大于等于 &gt;= entity().getServerType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeGe(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 小于 &lt; entity().getServerType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeLt(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 小于等于 &lt;= entity().getServerType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeLe(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * BETWEEN  entity().getServerType() AND serverTypeEnd
     * @param serverTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeBetween(Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            between("server_type",serverType,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * NOT BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeNotBetween(Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            notBetween("server_type",serverType,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeBetween(Integer serverTypeStart,Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            between("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * NOT BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeNotBetween(Integer serverTypeStart,Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            notBetween("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '%值%'  entity().getServerType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeLike(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * NOT LIKE '%值%'  entity().getServerType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeNotLike(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '%值'  entity().getServerType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeLikeLeft(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '值%'  entity().getServerType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeLikeRight(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            likeRight("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 等于 =
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeEq(Integer serverType){
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 不等于 &lt;&gt;
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeNe(Integer serverType){
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 大于 &gt;
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeGt(Integer serverType){
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 大于等于 &gt;=
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeGe(Integer serverType){
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 小于 &lt;
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeLt(Integer serverType){
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 小于等于 &lt;=
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeLe(Integer serverType){
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '%值%'
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeLike(Integer serverType){
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * NOT LIKE '%值%'
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeNotLike(Integer serverType){
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '%值'
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeLikeLeft(Integer serverType){
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '值%'
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeLikeRight(Integer serverType){
        if(serverType!=null){
            likeRight("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeIsNull(){
        isNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeIsNotNull(){
        isNotNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("server_type",value);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("server_type",values);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("server_type",value);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper serverTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("server_type",values);
        }
        return this;
    }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 等于 = entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusEq(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            eq("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 不等于 &lt;&gt; entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusNe(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            ne("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于 &gt; entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusGt(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            gt("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于等于 &gt;= entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusGe(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            ge("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于 &lt; entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusLt(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            lt("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于等于 &lt;= entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusLe(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            le("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * BETWEEN  entity().getSalesStatus() AND salesStatusEnd
     * @param salesStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusBetween(Integer salesStatusEnd){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null && salesStatusEnd!=null){
            between("sales_status",salesStatus,salesStatusEnd);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT BETWEEN  entity().getSalesStatus() AND 值2
     * @param salesStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusNotBetween(Integer salesStatusEnd){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null && salesStatusEnd!=null){
            notBetween("sales_status",salesStatus,salesStatusEnd);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * BETWEEN  entity().getSalesStatus() AND 值2
     * @param salesStatusStart       值1
     * @param salesStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusBetween(Integer salesStatusStart,Integer salesStatusEnd){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null && salesStatusEnd!=null){
            between("sales_status",salesStatusStart,salesStatusEnd);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT BETWEEN  entity().getSalesStatus() AND 值2
     * @param salesStatusStart       值1
     * @param salesStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusNotBetween(Integer salesStatusStart,Integer salesStatusEnd){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null && salesStatusEnd!=null){
            notBetween("sales_status",salesStatusStart,salesStatusEnd);
        }
        return this;
     }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值%'  entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusLike(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            like("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT LIKE '%值%'  entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusNotLike(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            notLike("sales_status",salesStatus);
        }
        return this;
     }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值'  entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusLikeLeft(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            likeLeft("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '值%'  entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusLikeRight(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            likeRight("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 等于 =
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusEq(Integer salesStatus){
        if(salesStatus!=null){
            eq("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 不等于 &lt;&gt;
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusNe(Integer salesStatus){
        if(salesStatus!=null){
            ne("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于 &gt;
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusGt(Integer salesStatus){
        if(salesStatus!=null){
            gt("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于等于 &gt;=
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusGe(Integer salesStatus){
        if(salesStatus!=null){
            ge("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于 &lt;
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusLt(Integer salesStatus){
        if(salesStatus!=null){
            lt("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于等于 &lt;=
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusLe(Integer salesStatus){
        if(salesStatus!=null){
            le("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值%'
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusLike(Integer salesStatus){
        if(salesStatus!=null){
            like("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT LIKE '%值%'
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusNotLike(Integer salesStatus){
        if(salesStatus!=null){
            notLike("sales_status",salesStatus);
        }
        return this;
     }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值'
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusLikeLeft(Integer salesStatus){
        if(salesStatus!=null){
            likeLeft("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '值%'
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusLikeRight(Integer salesStatus){
        if(salesStatus!=null){
            likeRight("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusIsNull(){
        isNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusIsNotNull(){
        isNotNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("sales_status",value);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("sales_status",values);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("sales_status",value);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper salesStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("sales_status",values);
        }
        return this;
    }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 等于 = entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusEq(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            eq("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 不等于 &lt;&gt; entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusNe(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            ne("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于 &gt; entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusGt(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            gt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于等于 &gt;= entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusGe(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            ge("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于 &lt; entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusLt(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            lt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于等于 &lt;= entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusLe(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            le("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * BETWEEN  entity().getRunningStatus() AND runningStatusEnd
     * @param runningStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusBetween(Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            between("running_status",runningStatus,runningStatusEnd);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT BETWEEN  entity().getRunningStatus() AND 值2
     * @param runningStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusNotBetween(Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            notBetween("running_status",runningStatus,runningStatusEnd);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * BETWEEN  entity().getRunningStatus() AND 值2
     * @param runningStatusStart       值1
     * @param runningStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusBetween(Integer runningStatusStart,Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            between("running_status",runningStatusStart,runningStatusEnd);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT BETWEEN  entity().getRunningStatus() AND 值2
     * @param runningStatusStart       值1
     * @param runningStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusNotBetween(Integer runningStatusStart,Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            notBetween("running_status",runningStatusStart,runningStatusEnd);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值%'  entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusLike(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            like("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT LIKE '%值%'  entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusNotLike(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            notLike("running_status",runningStatus);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值'  entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusLikeLeft(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            likeLeft("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '值%'  entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusLikeRight(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            likeRight("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 等于 =
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusEq(Integer runningStatus){
        if(runningStatus!=null){
            eq("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 不等于 &lt;&gt;
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusNe(Integer runningStatus){
        if(runningStatus!=null){
            ne("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于 &gt;
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusGt(Integer runningStatus){
        if(runningStatus!=null){
            gt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于等于 &gt;=
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusGe(Integer runningStatus){
        if(runningStatus!=null){
            ge("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于 &lt;
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusLt(Integer runningStatus){
        if(runningStatus!=null){
            lt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于等于 &lt;=
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusLe(Integer runningStatus){
        if(runningStatus!=null){
            le("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值%'
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusLike(Integer runningStatus){
        if(runningStatus!=null){
            like("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT LIKE '%值%'
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusNotLike(Integer runningStatus){
        if(runningStatus!=null){
            notLike("running_status",runningStatus);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值'
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusLikeLeft(Integer runningStatus){
        if(runningStatus!=null){
            likeLeft("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '值%'
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusLikeRight(Integer runningStatus){
        if(runningStatus!=null){
            likeRight("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusIsNull(){
        isNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusIsNotNull(){
        isNotNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("running_status",value);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("running_status",values);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("running_status",value);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper runningStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("running_status",values);
        }
        return this;
    }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }


    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 等于 = entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusEq(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            eq("health_status",healthStatus);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 不等于 &lt;&gt; entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusNe(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            ne("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 大于 &gt; entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusGt(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            gt("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 大于等于 &gt;= entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusGe(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            ge("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 小于 &lt; entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusLt(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            lt("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 小于等于 &lt;= entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusLe(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            le("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * BETWEEN  entity().getHealthStatus() AND healthStatusEnd
     * @param healthStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusBetween(Integer healthStatusEnd){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null && healthStatusEnd!=null){
            between("health_status",healthStatus,healthStatusEnd);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT BETWEEN  entity().getHealthStatus() AND 值2
     * @param healthStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusNotBetween(Integer healthStatusEnd){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null && healthStatusEnd!=null){
            notBetween("health_status",healthStatus,healthStatusEnd);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * BETWEEN  entity().getHealthStatus() AND 值2
     * @param healthStatusStart       值1
     * @param healthStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusBetween(Integer healthStatusStart,Integer healthStatusEnd){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null && healthStatusEnd!=null){
            between("health_status",healthStatusStart,healthStatusEnd);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT BETWEEN  entity().getHealthStatus() AND 值2
     * @param healthStatusStart       值1
     * @param healthStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusNotBetween(Integer healthStatusStart,Integer healthStatusEnd){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null && healthStatusEnd!=null){
            notBetween("health_status",healthStatusStart,healthStatusEnd);
        }
        return this;
     }


    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '%值%'  entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusLike(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            like("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT LIKE '%值%'  entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusNotLike(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            notLike("health_status",healthStatus);
        }
        return this;
     }


    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '%值'  entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusLikeLeft(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            likeLeft("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '值%'  entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusLikeRight(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            likeRight("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 等于 =
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusEq(Integer healthStatus){
        if(healthStatus!=null){
            eq("health_status",healthStatus);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 不等于 &lt;&gt;
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusNe(Integer healthStatus){
        if(healthStatus!=null){
            ne("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 大于 &gt;
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusGt(Integer healthStatus){
        if(healthStatus!=null){
            gt("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 大于等于 &gt;=
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusGe(Integer healthStatus){
        if(healthStatus!=null){
            ge("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 小于 &lt;
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusLt(Integer healthStatus){
        if(healthStatus!=null){
            lt("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 小于等于 &lt;=
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusLe(Integer healthStatus){
        if(healthStatus!=null){
            le("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '%值%'
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusLike(Integer healthStatus){
        if(healthStatus!=null){
            like("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT LIKE '%值%'
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusNotLike(Integer healthStatus){
        if(healthStatus!=null){
            notLike("health_status",healthStatus);
        }
        return this;
     }


    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '%值'
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusLikeLeft(Integer healthStatus){
        if(healthStatus!=null){
            likeLeft("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '值%'
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusLikeRight(Integer healthStatus){
        if(healthStatus!=null){
            likeRight("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusIsNull(){
        isNull("health_status");
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusIsNotNull(){
        isNotNull("health_status");
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("health_status",value);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("health_status",values);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("health_status",value);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper healthStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("health_status",values);
        }
        return this;
    }


    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 等于 = entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusEq(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            eq("trusteeship_status",trusteeshipStatus);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 不等于 &lt;&gt; entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusNe(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            ne("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 大于 &gt; entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusGt(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            gt("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 大于等于 &gt;= entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusGe(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            ge("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 小于 &lt; entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusLt(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            lt("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 小于等于 &lt;= entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusLe(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            le("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * BETWEEN  entity().getTrusteeshipStatus() AND trusteeshipStatusEnd
     * @param trusteeshipStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusBetween(Integer trusteeshipStatusEnd){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null && trusteeshipStatusEnd!=null){
            between("trusteeship_status",trusteeshipStatus,trusteeshipStatusEnd);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * NOT BETWEEN  entity().getTrusteeshipStatus() AND 值2
     * @param trusteeshipStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusNotBetween(Integer trusteeshipStatusEnd){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null && trusteeshipStatusEnd!=null){
            notBetween("trusteeship_status",trusteeshipStatus,trusteeshipStatusEnd);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * BETWEEN  entity().getTrusteeshipStatus() AND 值2
     * @param trusteeshipStatusStart       值1
     * @param trusteeshipStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusBetween(Integer trusteeshipStatusStart,Integer trusteeshipStatusEnd){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null && trusteeshipStatusEnd!=null){
            between("trusteeship_status",trusteeshipStatusStart,trusteeshipStatusEnd);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * NOT BETWEEN  entity().getTrusteeshipStatus() AND 值2
     * @param trusteeshipStatusStart       值1
     * @param trusteeshipStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusNotBetween(Integer trusteeshipStatusStart,Integer trusteeshipStatusEnd){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null && trusteeshipStatusEnd!=null){
            notBetween("trusteeship_status",trusteeshipStatusStart,trusteeshipStatusEnd);
        }
        return this;
     }


    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '%值%'  entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusLike(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            like("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * NOT LIKE '%值%'  entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusNotLike(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            notLike("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }


    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '%值'  entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusLikeLeft(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            likeLeft("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '值%'  entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusLikeRight(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            likeRight("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 等于 =
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusEq(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            eq("trusteeship_status",trusteeshipStatus);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 不等于 &lt;&gt;
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusNe(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            ne("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 大于 &gt;
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusGt(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            gt("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 大于等于 &gt;=
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusGe(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            ge("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 小于 &lt;
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusLt(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            lt("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 小于等于 &lt;=
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusLe(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            le("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '%值%'
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusLike(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            like("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * NOT LIKE '%值%'
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusNotLike(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            notLike("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }


    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '%值'
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusLikeLeft(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            likeLeft("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '值%'
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusLikeRight(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            likeRight("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusIsNull(){
        isNull("trusteeship_status");
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusIsNotNull(){
        isNotNull("trusteeship_status");
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("trusteeship_status",value);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("trusteeship_status",values);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("trusteeship_status",value);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper trusteeshipStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("trusteeship_status",values);
        }
        return this;
    }


    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 等于 = entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeEq(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            eq("plan_switch_type",planSwitchType);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 不等于 &lt;&gt; entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeNe(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            ne("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 大于 &gt; entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeGt(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            gt("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 大于等于 &gt;= entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeGe(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            ge("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 小于 &lt; entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeLt(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            lt("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 小于等于 &lt;= entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeLe(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            le("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * BETWEEN  entity().getPlanSwitchType() AND planSwitchTypeEnd
     * @param planSwitchTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeBetween(Integer planSwitchTypeEnd){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null && planSwitchTypeEnd!=null){
            between("plan_switch_type",planSwitchType,planSwitchTypeEnd);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * NOT BETWEEN  entity().getPlanSwitchType() AND 值2
     * @param planSwitchTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeNotBetween(Integer planSwitchTypeEnd){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null && planSwitchTypeEnd!=null){
            notBetween("plan_switch_type",planSwitchType,planSwitchTypeEnd);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * BETWEEN  entity().getPlanSwitchType() AND 值2
     * @param planSwitchTypeStart       值1
     * @param planSwitchTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeBetween(Integer planSwitchTypeStart,Integer planSwitchTypeEnd){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null && planSwitchTypeEnd!=null){
            between("plan_switch_type",planSwitchTypeStart,planSwitchTypeEnd);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * NOT BETWEEN  entity().getPlanSwitchType() AND 值2
     * @param planSwitchTypeStart       值1
     * @param planSwitchTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeNotBetween(Integer planSwitchTypeStart,Integer planSwitchTypeEnd){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null && planSwitchTypeEnd!=null){
            notBetween("plan_switch_type",planSwitchTypeStart,planSwitchTypeEnd);
        }
        return this;
     }


    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '%值%'  entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeLike(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            like("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * NOT LIKE '%值%'  entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeNotLike(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            notLike("plan_switch_type",planSwitchType);
        }
        return this;
     }


    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '%值'  entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeLikeLeft(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            likeLeft("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '值%'  entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeLikeRight(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            likeRight("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 等于 =
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeEq(Integer planSwitchType){
        if(planSwitchType!=null){
            eq("plan_switch_type",planSwitchType);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 不等于 &lt;&gt;
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeNe(Integer planSwitchType){
        if(planSwitchType!=null){
            ne("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 大于 &gt;
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeGt(Integer planSwitchType){
        if(planSwitchType!=null){
            gt("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 大于等于 &gt;=
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeGe(Integer planSwitchType){
        if(planSwitchType!=null){
            ge("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 小于 &lt;
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeLt(Integer planSwitchType){
        if(planSwitchType!=null){
            lt("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 小于等于 &lt;=
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeLe(Integer planSwitchType){
        if(planSwitchType!=null){
            le("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '%值%'
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeLike(Integer planSwitchType){
        if(planSwitchType!=null){
            like("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * NOT LIKE '%值%'
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeNotLike(Integer planSwitchType){
        if(planSwitchType!=null){
            notLike("plan_switch_type",planSwitchType);
        }
        return this;
     }


    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '%值'
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeLikeLeft(Integer planSwitchType){
        if(planSwitchType!=null){
            likeLeft("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '值%'
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeLikeRight(Integer planSwitchType){
        if(planSwitchType!=null){
            likeRight("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeIsNull(){
        isNull("plan_switch_type");
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeIsNotNull(){
        isNotNull("plan_switch_type");
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("plan_switch_type",value);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("plan_switch_type",values);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("plan_switch_type",value);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper planSwitchTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("plan_switch_type",values);
        }
        return this;
    }


    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 等于 = entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusEq(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            eq("streaming_status",streamingStatus);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 不等于 &lt;&gt; entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusNe(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            ne("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 大于 &gt; entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusGt(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            gt("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 大于等于 &gt;= entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusGe(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            ge("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 小于 &lt; entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusLt(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            lt("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 小于等于 &lt;= entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusLe(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            le("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * BETWEEN  entity().getStreamingStatus() AND streamingStatusEnd
     * @param streamingStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusBetween(Integer streamingStatusEnd){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null && streamingStatusEnd!=null){
            between("streaming_status",streamingStatus,streamingStatusEnd);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT BETWEEN  entity().getStreamingStatus() AND 值2
     * @param streamingStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusNotBetween(Integer streamingStatusEnd){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null && streamingStatusEnd!=null){
            notBetween("streaming_status",streamingStatus,streamingStatusEnd);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * BETWEEN  entity().getStreamingStatus() AND 值2
     * @param streamingStatusStart       值1
     * @param streamingStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusBetween(Integer streamingStatusStart,Integer streamingStatusEnd){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null && streamingStatusEnd!=null){
            between("streaming_status",streamingStatusStart,streamingStatusEnd);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT BETWEEN  entity().getStreamingStatus() AND 值2
     * @param streamingStatusStart       值1
     * @param streamingStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusNotBetween(Integer streamingStatusStart,Integer streamingStatusEnd){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null && streamingStatusEnd!=null){
            notBetween("streaming_status",streamingStatusStart,streamingStatusEnd);
        }
        return this;
     }


    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '%值%'  entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusLike(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            like("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT LIKE '%值%'  entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusNotLike(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            notLike("streaming_status",streamingStatus);
        }
        return this;
     }


    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '%值'  entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusLikeLeft(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            likeLeft("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '值%'  entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusLikeRight(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            likeRight("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 等于 =
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusEq(Integer streamingStatus){
        if(streamingStatus!=null){
            eq("streaming_status",streamingStatus);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 不等于 &lt;&gt;
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusNe(Integer streamingStatus){
        if(streamingStatus!=null){
            ne("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 大于 &gt;
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusGt(Integer streamingStatus){
        if(streamingStatus!=null){
            gt("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 大于等于 &gt;=
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusGe(Integer streamingStatus){
        if(streamingStatus!=null){
            ge("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 小于 &lt;
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusLt(Integer streamingStatus){
        if(streamingStatus!=null){
            lt("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 小于等于 &lt;=
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusLe(Integer streamingStatus){
        if(streamingStatus!=null){
            le("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '%值%'
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusLike(Integer streamingStatus){
        if(streamingStatus!=null){
            like("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT LIKE '%值%'
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusNotLike(Integer streamingStatus){
        if(streamingStatus!=null){
            notLike("streaming_status",streamingStatus);
        }
        return this;
     }


    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '%值'
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusLikeLeft(Integer streamingStatus){
        if(streamingStatus!=null){
            likeLeft("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '值%'
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusLikeRight(Integer streamingStatus){
        if(streamingStatus!=null){
            likeRight("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusIsNull(){
        isNull("streaming_status");
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusIsNotNull(){
        isNotNull("streaming_status");
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("streaming_status",value);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("streaming_status",values);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("streaming_status",value);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper streamingStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("streaming_status",values);
        }
        return this;
    }


    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 等于 = entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusEq(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            eq("maint_status",maintStatus);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 不等于 &lt;&gt; entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusNe(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            ne("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 大于 &gt; entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusGt(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            gt("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 大于等于 &gt;= entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusGe(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            ge("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 小于 &lt; entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusLt(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            lt("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 小于等于 &lt;= entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusLe(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            le("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * BETWEEN  entity().getMaintStatus() AND maintStatusEnd
     * @param maintStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusBetween(Integer maintStatusEnd){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null && maintStatusEnd!=null){
            between("maint_status",maintStatus,maintStatusEnd);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT BETWEEN  entity().getMaintStatus() AND 值2
     * @param maintStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusNotBetween(Integer maintStatusEnd){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null && maintStatusEnd!=null){
            notBetween("maint_status",maintStatus,maintStatusEnd);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * BETWEEN  entity().getMaintStatus() AND 值2
     * @param maintStatusStart       值1
     * @param maintStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusBetween(Integer maintStatusStart,Integer maintStatusEnd){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null && maintStatusEnd!=null){
            between("maint_status",maintStatusStart,maintStatusEnd);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT BETWEEN  entity().getMaintStatus() AND 值2
     * @param maintStatusStart       值1
     * @param maintStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusNotBetween(Integer maintStatusStart,Integer maintStatusEnd){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null && maintStatusEnd!=null){
            notBetween("maint_status",maintStatusStart,maintStatusEnd);
        }
        return this;
     }


    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '%值%'  entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusLike(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            like("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT LIKE '%值%'  entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusNotLike(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            notLike("maint_status",maintStatus);
        }
        return this;
     }


    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '%值'  entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusLikeLeft(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            likeLeft("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '值%'  entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusLikeRight(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            likeRight("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 等于 =
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusEq(Integer maintStatus){
        if(maintStatus!=null){
            eq("maint_status",maintStatus);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 不等于 &lt;&gt;
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusNe(Integer maintStatus){
        if(maintStatus!=null){
            ne("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 大于 &gt;
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusGt(Integer maintStatus){
        if(maintStatus!=null){
            gt("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 大于等于 &gt;=
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusGe(Integer maintStatus){
        if(maintStatus!=null){
            ge("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 小于 &lt;
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusLt(Integer maintStatus){
        if(maintStatus!=null){
            lt("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 小于等于 &lt;=
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusLe(Integer maintStatus){
        if(maintStatus!=null){
            le("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '%值%'
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusLike(Integer maintStatus){
        if(maintStatus!=null){
            like("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT LIKE '%值%'
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusNotLike(Integer maintStatus){
        if(maintStatus!=null){
            notLike("maint_status",maintStatus);
        }
        return this;
     }


    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '%值'
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusLikeLeft(Integer maintStatus){
        if(maintStatus!=null){
            likeLeft("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '值%'
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusLikeRight(Integer maintStatus){
        if(maintStatus!=null){
            likeRight("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusIsNull(){
        isNull("maint_status");
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusIsNotNull(){
        isNotNull("maint_status");
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("maint_status",value);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("maint_status",values);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("maint_status",value);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper maintStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("maint_status",values);
        }
        return this;
    }


    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 等于 = entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingEq(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            eq("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 不等于 &lt;&gt; entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingNe(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            ne("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 大于 &gt; entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingGt(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            gt("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 大于等于 &gt;= entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingGe(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            ge("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 小于 &lt; entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingLt(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            lt("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 小于等于 &lt;= entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingLe(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            le("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * BETWEEN  entity().getIsReseting() AND isResetingEnd
     * @param isResetingEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingBetween(Integer isResetingEnd){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null && isResetingEnd!=null){
            between("is_reseting",isReseting,isResetingEnd);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * NOT BETWEEN  entity().getIsReseting() AND 值2
     * @param isResetingEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingNotBetween(Integer isResetingEnd){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null && isResetingEnd!=null){
            notBetween("is_reseting",isReseting,isResetingEnd);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * BETWEEN  entity().getIsReseting() AND 值2
     * @param isResetingStart       值1
     * @param isResetingEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingBetween(Integer isResetingStart,Integer isResetingEnd){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null && isResetingEnd!=null){
            between("is_reseting",isResetingStart,isResetingEnd);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * NOT BETWEEN  entity().getIsReseting() AND 值2
     * @param isResetingStart       值1
     * @param isResetingEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingNotBetween(Integer isResetingStart,Integer isResetingEnd){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null && isResetingEnd!=null){
            notBetween("is_reseting",isResetingStart,isResetingEnd);
        }
        return this;
     }


    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '%值%'  entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingLike(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            like("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * NOT LIKE '%值%'  entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingNotLike(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            notLike("is_reseting",isReseting);
        }
        return this;
     }


    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '%值'  entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingLikeLeft(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            likeLeft("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '值%'  entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingLikeRight(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            likeRight("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 等于 =
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingEq(Integer isReseting){
        if(isReseting!=null){
            eq("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 不等于 &lt;&gt;
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingNe(Integer isReseting){
        if(isReseting!=null){
            ne("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 大于 &gt;
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingGt(Integer isReseting){
        if(isReseting!=null){
            gt("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 大于等于 &gt;=
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingGe(Integer isReseting){
        if(isReseting!=null){
            ge("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 小于 &lt;
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingLt(Integer isReseting){
        if(isReseting!=null){
            lt("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 小于等于 &lt;=
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingLe(Integer isReseting){
        if(isReseting!=null){
            le("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '%值%'
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingLike(Integer isReseting){
        if(isReseting!=null){
            like("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * NOT LIKE '%值%'
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingNotLike(Integer isReseting){
        if(isReseting!=null){
            notLike("is_reseting",isReseting);
        }
        return this;
     }


    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '%值'
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingLikeLeft(Integer isReseting){
        if(isReseting!=null){
            likeLeft("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '值%'
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingLikeRight(Integer isReseting){
        if(isReseting!=null){
            likeRight("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingIsNull(){
        isNull("is_reseting");
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingIsNotNull(){
        isNotNull("is_reseting");
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("is_reseting",value);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingIn(Integer... values){
        if(values!=null && values.length>0){
            in("is_reseting",values);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("is_reseting",value);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isResetingNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_reseting",values);
        }
        return this;
    }


    /**
     * <p>rom系统软件版本</p>
     * 等于 = entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionEq(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            eq("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * 不等于 &lt;&gt; entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionNe(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            ne("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 大于 &gt; entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionGt(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            gt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 大于等于 &gt;= entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionGe(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            ge("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 小于 &lt; entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionLt(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            lt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 小于等于 &lt;= entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionLe(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            le("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * BETWEEN  entity().getRomVersion() AND romVersionEnd
     * @param romVersionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionBetween(String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            between("rom_version",romVersion,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * NOT BETWEEN  entity().getRomVersion() AND 值2
     * @param romVersionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionNotBetween(String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            notBetween("rom_version",romVersion,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * BETWEEN  entity().getRomVersion() AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionBetween(String romVersionStart,String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            between("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * NOT BETWEEN  entity().getRomVersion() AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionNotBetween(String romVersionStart,String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            notBetween("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }


    /**
     * <p>rom系统软件版本</p>
     * LIKE '%值%'  entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionLike(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            like("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * NOT LIKE '%值%'  entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionNotLike(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            notLike("rom_version",romVersion);
        }
        return this;
     }


    /**
     * <p>rom系统软件版本</p>
     * LIKE '%值'  entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionLikeLeft(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            likeLeft("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * LIKE '值%'  entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionLikeRight(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            likeRight("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 等于 =
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionEq(String romVersion){
        if(romVersion!=null){
            eq("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * 不等于 &lt;&gt;
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionNe(String romVersion){
        if(romVersion!=null){
            ne("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 大于 &gt;
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionGt(String romVersion){
        if(romVersion!=null){
            gt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 大于等于 &gt;=
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionGe(String romVersion){
        if(romVersion!=null){
            ge("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 小于 &lt;
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionLt(String romVersion){
        if(romVersion!=null){
            lt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 小于等于 &lt;=
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionLe(String romVersion){
        if(romVersion!=null){
            le("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * LIKE '%值%'
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionLike(String romVersion){
        if(romVersion!=null){
            like("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * NOT LIKE '%值%'
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionNotLike(String romVersion){
        if(romVersion!=null){
            notLike("rom_version",romVersion);
        }
        return this;
     }


    /**
     * <p>rom系统软件版本</p>
     * LIKE '%值'
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionLikeLeft(String romVersion){
        if(romVersion!=null){
            likeLeft("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * LIKE '值%'
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionLikeRight(String romVersion){
        if(romVersion!=null){
            likeRight("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionIsNull(){
        isNull("rom_version");
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionIsNotNull(){
        isNotNull("rom_version");
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("rom_version",value);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionIn(String... values){
        if(values!=null && values.length>0){
            in("rom_version",values);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("rom_version",value);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper romVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("rom_version",values);
        }
        return this;
    }


    /**
     * <p>版本id</p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper versionIdEq(){
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
    public EmSocDevicesQueryEntityWrapper versionIdNe(){
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
    public EmSocDevicesQueryEntityWrapper versionIdGt(){
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
    public EmSocDevicesQueryEntityWrapper versionIdGe(){
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
    public EmSocDevicesQueryEntityWrapper versionIdLt(){
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
    public EmSocDevicesQueryEntityWrapper versionIdLe(){
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
    public EmSocDevicesQueryEntityWrapper versionIdBetween(Long versionIdEnd){
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
    public EmSocDevicesQueryEntityWrapper versionIdNotBetween(Long versionIdEnd){
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
    public EmSocDevicesQueryEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public EmSocDevicesQueryEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public EmSocDevicesQueryEntityWrapper versionIdLike(){
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
    public EmSocDevicesQueryEntityWrapper versionIdNotLike(){
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
    public EmSocDevicesQueryEntityWrapper versionIdLikeLeft(){
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
    public EmSocDevicesQueryEntityWrapper versionIdLikeRight(){
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
    public EmSocDevicesQueryEntityWrapper versionIdEq(Long versionId){
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
    public EmSocDevicesQueryEntityWrapper versionIdNe(Long versionId){
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
    public EmSocDevicesQueryEntityWrapper versionIdGt(Long versionId){
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
    public EmSocDevicesQueryEntityWrapper versionIdGe(Long versionId){
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
    public EmSocDevicesQueryEntityWrapper versionIdLt(Long versionId){
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
    public EmSocDevicesQueryEntityWrapper versionIdLe(Long versionId){
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
    public EmSocDevicesQueryEntityWrapper versionIdLike(Long versionId){
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
    public EmSocDevicesQueryEntityWrapper versionIdNotLike(Long versionId){
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
    public EmSocDevicesQueryEntityWrapper versionIdLikeLeft(Long versionId){
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
    public EmSocDevicesQueryEntityWrapper versionIdLikeRight(Long versionId){
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
    public EmSocDevicesQueryEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper versionIdIn(Collection<Long> value){
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
    public EmSocDevicesQueryEntityWrapper versionIdIn(Long... values){
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
    public EmSocDevicesQueryEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public EmSocDevicesQueryEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeEq(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


    /**
     * <p>盒子信息修改时间</p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeEq(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * 不等于 &lt;&gt; entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>盒子信息修改时间</p>
     * LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>盒子信息修改时间</p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * 不等于 &lt;&gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 大于 &gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 大于等于 &gt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 小于 &lt;
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 小于等于 &lt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * NOT LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>盒子信息修改时间</p>
     * LIKE '%值'
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * LIKE '值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 等于 = entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveEq(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            eq("is_user_save",isUserSave);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 不等于 &lt;&gt; entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveNe(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            ne("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 大于 &gt; entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveGt(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            gt("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 大于等于 &gt;= entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveGe(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            ge("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 小于 &lt; entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveLt(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            lt("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 小于等于 &lt;= entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveLe(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            le("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * BETWEEN  entity().getIsUserSave() AND isUserSaveEnd
     * @param isUserSaveEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveBetween(Integer isUserSaveEnd){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null && isUserSaveEnd!=null){
            between("is_user_save",isUserSave,isUserSaveEnd);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT BETWEEN  entity().getIsUserSave() AND 值2
     * @param isUserSaveEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveNotBetween(Integer isUserSaveEnd){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null && isUserSaveEnd!=null){
            notBetween("is_user_save",isUserSave,isUserSaveEnd);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * BETWEEN  entity().getIsUserSave() AND 值2
     * @param isUserSaveStart       值1
     * @param isUserSaveEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveBetween(Integer isUserSaveStart,Integer isUserSaveEnd){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null && isUserSaveEnd!=null){
            between("is_user_save",isUserSaveStart,isUserSaveEnd);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT BETWEEN  entity().getIsUserSave() AND 值2
     * @param isUserSaveStart       值1
     * @param isUserSaveEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveNotBetween(Integer isUserSaveStart,Integer isUserSaveEnd){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null && isUserSaveEnd!=null){
            notBetween("is_user_save",isUserSaveStart,isUserSaveEnd);
        }
        return this;
     }


    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '%值%'  entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveLike(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            like("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT LIKE '%值%'  entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveNotLike(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            notLike("is_user_save",isUserSave);
        }
        return this;
     }


    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '%值'  entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveLikeLeft(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            likeLeft("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '值%'  entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveLikeRight(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            likeRight("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 等于 =
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveEq(Integer isUserSave){
        if(isUserSave!=null){
            eq("is_user_save",isUserSave);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 不等于 &lt;&gt;
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveNe(Integer isUserSave){
        if(isUserSave!=null){
            ne("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 大于 &gt;
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveGt(Integer isUserSave){
        if(isUserSave!=null){
            gt("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 大于等于 &gt;=
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveGe(Integer isUserSave){
        if(isUserSave!=null){
            ge("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 小于 &lt;
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveLt(Integer isUserSave){
        if(isUserSave!=null){
            lt("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 小于等于 &lt;=
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveLe(Integer isUserSave){
        if(isUserSave!=null){
            le("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '%值%'
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveLike(Integer isUserSave){
        if(isUserSave!=null){
            like("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT LIKE '%值%'
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveNotLike(Integer isUserSave){
        if(isUserSave!=null){
            notLike("is_user_save",isUserSave);
        }
        return this;
     }


    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '%值'
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveLikeLeft(Integer isUserSave){
        if(isUserSave!=null){
            likeLeft("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '值%'
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveLikeRight(Integer isUserSave){
        if(isUserSave!=null){
            likeRight("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveIsNull(){
        isNull("is_user_save");
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveIsNotNull(){
        isNotNull("is_user_save");
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("is_user_save",value);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveIn(Integer... values){
        if(values!=null && values.length>0){
            in("is_user_save",values);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("is_user_save",value);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isUserSaveNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_user_save",values);
        }
        return this;
    }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 等于 = entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelEq(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            eq("loglevel",loglevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 不等于 &lt;&gt; entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelNe(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            ne("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于 &gt; entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelGt(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            gt("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于等于 &gt;= entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelGe(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            ge("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于 &lt; entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelLt(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            lt("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于等于 &lt;= entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelLe(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            le("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * BETWEEN  entity().getLoglevel() AND loglevelEnd
     * @param loglevelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelBetween(Integer loglevelEnd){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null && loglevelEnd!=null){
            between("loglevel",loglevel,loglevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT BETWEEN  entity().getLoglevel() AND 值2
     * @param loglevelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelNotBetween(Integer loglevelEnd){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null && loglevelEnd!=null){
            notBetween("loglevel",loglevel,loglevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * BETWEEN  entity().getLoglevel() AND 值2
     * @param loglevelStart       值1
     * @param loglevelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelBetween(Integer loglevelStart,Integer loglevelEnd){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null && loglevelEnd!=null){
            between("loglevel",loglevelStart,loglevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT BETWEEN  entity().getLoglevel() AND 值2
     * @param loglevelStart       值1
     * @param loglevelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelNotBetween(Integer loglevelStart,Integer loglevelEnd){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null && loglevelEnd!=null){
            notBetween("loglevel",loglevelStart,loglevelEnd);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值%'  entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelLike(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            like("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT LIKE '%值%'  entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelNotLike(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            notLike("loglevel",loglevel);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值'  entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelLikeLeft(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            likeLeft("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '值%'  entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelLikeRight(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            likeRight("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 等于 =
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelEq(Integer loglevel){
        if(loglevel!=null){
            eq("loglevel",loglevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 不等于 &lt;&gt;
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelNe(Integer loglevel){
        if(loglevel!=null){
            ne("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于 &gt;
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelGt(Integer loglevel){
        if(loglevel!=null){
            gt("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于等于 &gt;=
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelGe(Integer loglevel){
        if(loglevel!=null){
            ge("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于 &lt;
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelLt(Integer loglevel){
        if(loglevel!=null){
            lt("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于等于 &lt;=
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelLe(Integer loglevel){
        if(loglevel!=null){
            le("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值%'
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelLike(Integer loglevel){
        if(loglevel!=null){
            like("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT LIKE '%值%'
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelNotLike(Integer loglevel){
        if(loglevel!=null){
            notLike("loglevel",loglevel);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值'
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelLikeLeft(Integer loglevel){
        if(loglevel!=null){
            likeLeft("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '值%'
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelLikeRight(Integer loglevel){
        if(loglevel!=null){
            likeRight("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelIsNull(){
        isNull("loglevel");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelIsNotNull(){
        isNotNull("loglevel");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("loglevel",value);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelIn(Integer... values){
        if(values!=null && values.length>0){
            in("loglevel",values);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("loglevel",value);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper loglevelNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("loglevel",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgEq(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            eq("logpkg",logpkg);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgNe(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            ne("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgGt(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            gt("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgGe(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            ge("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgLt(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            lt("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgLe(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            le("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLogpkg() AND logpkgEnd
     * @param logpkgEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgBetween(String logpkgEnd){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null && logpkgEnd!=null){
            between("logpkg",logpkg,logpkgEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLogpkg() AND 值2
     * @param logpkgEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgNotBetween(String logpkgEnd){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null && logpkgEnd!=null){
            notBetween("logpkg",logpkg,logpkgEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLogpkg() AND 值2
     * @param logpkgStart       值1
     * @param logpkgEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgBetween(String logpkgStart,String logpkgEnd){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null && logpkgEnd!=null){
            between("logpkg",logpkgStart,logpkgEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLogpkg() AND 值2
     * @param logpkgStart       值1
     * @param logpkgEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgNotBetween(String logpkgStart,String logpkgEnd){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null && logpkgEnd!=null){
            notBetween("logpkg",logpkgStart,logpkgEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgLike(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            like("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgNotLike(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            notLike("logpkg",logpkg);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgLikeLeft(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            likeLeft("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgLikeRight(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            likeRight("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgEq(String logpkg){
        if(logpkg!=null){
            eq("logpkg",logpkg);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgNe(String logpkg){
        if(logpkg!=null){
            ne("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgGt(String logpkg){
        if(logpkg!=null){
            gt("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgGe(String logpkg){
        if(logpkg!=null){
            ge("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgLt(String logpkg){
        if(logpkg!=null){
            lt("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgLe(String logpkg){
        if(logpkg!=null){
            le("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgLike(String logpkg){
        if(logpkg!=null){
            like("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgNotLike(String logpkg){
        if(logpkg!=null){
            notLike("logpkg",logpkg);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgLikeLeft(String logpkg){
        if(logpkg!=null){
            likeLeft("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgLikeRight(String logpkg){
        if(logpkg!=null){
            likeRight("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgIsNull(){
        isNull("logpkg");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgIsNotNull(){
        isNotNull("logpkg");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("logpkg",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgIn(String... values){
        if(values!=null && values.length>0){
            in("logpkg",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("logpkg",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper logpkgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("logpkg",values);
        }
        return this;
    }


    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 等于 = entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeEq(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            eq("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 不等于 &lt;&gt; entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeNe(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            ne("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 大于 &gt; entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeGt(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            gt("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 大于等于 &gt;= entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeGe(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            ge("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 小于 &lt; entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeLt(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            lt("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 小于等于 &lt;= entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeLe(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            le("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * BETWEEN  entity().getIsOtaUpgrade() AND isOtaUpgradeEnd
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeBetween(Integer isOtaUpgradeEnd){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null && isOtaUpgradeEnd!=null){
            between("is_ota_upgrade",isOtaUpgrade,isOtaUpgradeEnd);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT BETWEEN  entity().getIsOtaUpgrade() AND 值2
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeNotBetween(Integer isOtaUpgradeEnd){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null && isOtaUpgradeEnd!=null){
            notBetween("is_ota_upgrade",isOtaUpgrade,isOtaUpgradeEnd);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * BETWEEN  entity().getIsOtaUpgrade() AND 值2
     * @param isOtaUpgradeStart       值1
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeBetween(Integer isOtaUpgradeStart,Integer isOtaUpgradeEnd){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null && isOtaUpgradeEnd!=null){
            between("is_ota_upgrade",isOtaUpgradeStart,isOtaUpgradeEnd);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT BETWEEN  entity().getIsOtaUpgrade() AND 值2
     * @param isOtaUpgradeStart       值1
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeNotBetween(Integer isOtaUpgradeStart,Integer isOtaUpgradeEnd){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null && isOtaUpgradeEnd!=null){
            notBetween("is_ota_upgrade",isOtaUpgradeStart,isOtaUpgradeEnd);
        }
        return this;
     }


    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '%值%'  entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeLike(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            like("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT LIKE '%值%'  entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeNotLike(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            notLike("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }


    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '%值'  entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeLikeLeft(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            likeLeft("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '值%'  entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeLikeRight(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            likeRight("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 等于 =
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeEq(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            eq("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 不等于 &lt;&gt;
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeNe(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            ne("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 大于 &gt;
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeGt(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            gt("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 大于等于 &gt;=
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeGe(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            ge("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 小于 &lt;
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeLt(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            lt("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 小于等于 &lt;=
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeLe(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            le("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '%值%'
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeLike(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            like("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT LIKE '%值%'
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeNotLike(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            notLike("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }


    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '%值'
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeLikeLeft(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            likeLeft("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '值%'
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeLikeRight(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            likeRight("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeIsNull(){
        isNull("is_ota_upgrade");
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeIsNotNull(){
        isNotNull("is_ota_upgrade");
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("is_ota_upgrade",value);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeIn(Integer... values){
        if(values!=null && values.length>0){
            in("is_ota_upgrade",values);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("is_ota_upgrade",value);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper isOtaUpgradeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_ota_upgrade",values);
        }
        return this;
    }


    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 等于 = entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeEq(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            eq("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 不等于 &lt;&gt; entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeNe(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            ne("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 大于 &gt; entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeGt(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            gt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 大于等于 &gt;= entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeGe(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            ge("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 小于 &lt; entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeLt(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            lt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 小于等于 &lt;= entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeLe(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            le("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * BETWEEN  entity().getSupplierType() AND supplierTypeEnd
     * @param supplierTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeBetween(Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            between("supplier_type",supplierType,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * NOT BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeNotBetween(Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",supplierType,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            between("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * NOT BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeNotBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '%值%'  entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeLike(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            like("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * NOT LIKE '%值%'  entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeNotLike(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            notLike("supplier_type",supplierType);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '%值'  entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeLikeLeft(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            likeLeft("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '值%'  entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeLikeRight(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            likeRight("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 等于 =
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeEq(Integer supplierType){
        if(supplierType!=null){
            eq("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 不等于 &lt;&gt;
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeNe(Integer supplierType){
        if(supplierType!=null){
            ne("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 大于 &gt;
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeGt(Integer supplierType){
        if(supplierType!=null){
            gt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 大于等于 &gt;=
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeGe(Integer supplierType){
        if(supplierType!=null){
            ge("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 小于 &lt;
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeLt(Integer supplierType){
        if(supplierType!=null){
            lt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 小于等于 &lt;=
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeLe(Integer supplierType){
        if(supplierType!=null){
            le("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '%值%'
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeLike(Integer supplierType){
        if(supplierType!=null){
            like("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * NOT LIKE '%值%'
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeNotLike(Integer supplierType){
        if(supplierType!=null){
            notLike("supplier_type",supplierType);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '%值'
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeLikeLeft(Integer supplierType){
        if(supplierType!=null){
            likeLeft("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '值%'
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeLikeRight(Integer supplierType){
        if(supplierType!=null){
            likeRight("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeIsNull(){
        isNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeIsNotNull(){
        isNotNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("supplier_type",value);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("supplier_type",values);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("supplier_type",value);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryEntityWrapper supplierTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("supplier_type",values);
        }
        return this;
    }



}
