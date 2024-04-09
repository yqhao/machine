package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.EmSocDevices;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 设备（em_soc_devices）
 * </p>
 * "em_soc_devices"
 * @author PC001
 */
public class EmSocDevicesQueryWrapper extends QueryWrapper<EmSocDevices> {


    public static EmSocDevicesQueryWrapper wrapper() {
        return new EmSocDevicesQueryWrapper();
    }

    public EmSocDevicesQueryWrapper() {
        super();
    }

    public EmSocDevicesQueryWrapper(EmSocDevices entity) {
        super(entity);
    }

    public EmSocDevicesQueryWrapper(EmSocDevices entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public EmSocDevicesQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public EmSocDevicesQueryWrapper selectColumns(Consumer<EmSocDevicesSelect> consumer) {
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
     * 等于 =
     * @param id       值
     * @return children
     */
    public EmSocDevicesQueryWrapper idEq(Long id){
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
    public EmSocDevicesQueryWrapper idNe(Long id){
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
    public EmSocDevicesQueryWrapper idGt(Long id){
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
    public EmSocDevicesQueryWrapper idGe(Long id){
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
    public EmSocDevicesQueryWrapper idLt(Long id){
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
    public EmSocDevicesQueryWrapper idLe(Long id){
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
    public EmSocDevicesQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public EmSocDevicesQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public EmSocDevicesQueryWrapper idLike(Long id){
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
    public EmSocDevicesQueryWrapper idNotLike(Long id){
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
    public EmSocDevicesQueryWrapper idLikeLeft(Long id){
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
    public EmSocDevicesQueryWrapper idLikeRight(Long id){
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
    public EmSocDevicesQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper idIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper idIn(Long... values){
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
    public EmSocDevicesQueryWrapper idNotIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesQueryWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
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
    public EmSocDevicesQueryWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
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
    public EmSocDevicesQueryWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
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
    public EmSocDevicesQueryWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
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
    public EmSocDevicesQueryWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
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
    public EmSocDevicesQueryWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesQueryWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
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
    public EmSocDevicesQueryWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
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
    public EmSocDevicesQueryWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
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
    public EmSocDevicesQueryWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
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
    public EmSocDevicesQueryWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper fkPcpAreaIdIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper fkPcpAreaIdIn(Long... values){
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
    public EmSocDevicesQueryWrapper fkPcpAreaIdNotIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesQueryWrapper deviceIdEq(String deviceId){
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
    public EmSocDevicesQueryWrapper deviceIdNe(String deviceId){
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
    public EmSocDevicesQueryWrapper deviceIdGt(String deviceId){
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
    public EmSocDevicesQueryWrapper deviceIdGe(String deviceId){
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
    public EmSocDevicesQueryWrapper deviceIdLt(String deviceId){
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
    public EmSocDevicesQueryWrapper deviceIdLe(String deviceId){
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
    public EmSocDevicesQueryWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public EmSocDevicesQueryWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public EmSocDevicesQueryWrapper deviceIdLike(String deviceId){
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
    public EmSocDevicesQueryWrapper deviceIdNotLike(String deviceId){
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
    public EmSocDevicesQueryWrapper deviceIdLikeLeft(String deviceId){
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
    public EmSocDevicesQueryWrapper deviceIdLikeRight(String deviceId){
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
    public EmSocDevicesQueryWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper deviceIdIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper deviceIdIn(String... values){
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
    public EmSocDevicesQueryWrapper deviceIdNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * 等于 =
     * @param imei       值
     * @return children
     */
    public EmSocDevicesQueryWrapper imeiEq(String imei){
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
    public EmSocDevicesQueryWrapper imeiNe(String imei){
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
    public EmSocDevicesQueryWrapper imeiGt(String imei){
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
    public EmSocDevicesQueryWrapper imeiGe(String imei){
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
    public EmSocDevicesQueryWrapper imeiLt(String imei){
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
    public EmSocDevicesQueryWrapper imeiLe(String imei){
        if(imei!=null){
            le("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * BETWEEN 值1 AND 值2
     * @param imeiStart       值1
     * @param imeiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper imeiBetween(String imeiStart,String imeiEnd){
        if(imeiStart!=null && imeiEnd!=null){
            between("imei",imeiStart,imeiEnd);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imeiStart       值1
     * @param imeiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper imeiNotBetween(String imeiStart,String imeiEnd){
        if(imeiStart!=null && imeiEnd!=null){
            notBetween("imei",imeiStart,imeiEnd);
        }
        return this;
     }


    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '%值%'
     * @param imei       值
     * @return children
     */
    public EmSocDevicesQueryWrapper imeiLike(String imei){
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
    public EmSocDevicesQueryWrapper imeiNotLike(String imei){
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
    public EmSocDevicesQueryWrapper imeiLikeLeft(String imei){
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
    public EmSocDevicesQueryWrapper imeiLikeRight(String imei){
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
    public EmSocDevicesQueryWrapper imeiIsNull(){
        isNull("imei");
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper imeiIsNotNull(){
        isNotNull("imei");
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper imeiIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper imeiIn(String... values){
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
    public EmSocDevicesQueryWrapper imeiNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper imeiNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("imei",values);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * 等于 =
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesQueryWrapper imsiEq(String imsi){
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
    public EmSocDevicesQueryWrapper imsiNe(String imsi){
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
    public EmSocDevicesQueryWrapper imsiGt(String imsi){
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
    public EmSocDevicesQueryWrapper imsiGe(String imsi){
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
    public EmSocDevicesQueryWrapper imsiLt(String imsi){
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
    public EmSocDevicesQueryWrapper imsiLe(String imsi){
        if(imsi!=null){
            le("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * BETWEEN 值1 AND 值2
     * @param imsiStart       值1
     * @param imsiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper imsiBetween(String imsiStart,String imsiEnd){
        if(imsiStart!=null && imsiEnd!=null){
            between("imsi",imsiStart,imsiEnd);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imsiStart       值1
     * @param imsiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper imsiNotBetween(String imsiStart,String imsiEnd){
        if(imsiStart!=null && imsiEnd!=null){
            notBetween("imsi",imsiStart,imsiEnd);
        }
        return this;
     }


    /**
     * <p>国际移动用户识别码</p>
     * LIKE '%值%'
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesQueryWrapper imsiLike(String imsi){
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
    public EmSocDevicesQueryWrapper imsiNotLike(String imsi){
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
    public EmSocDevicesQueryWrapper imsiLikeLeft(String imsi){
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
    public EmSocDevicesQueryWrapper imsiLikeRight(String imsi){
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
    public EmSocDevicesQueryWrapper imsiIsNull(){
        isNull("imsi");
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper imsiIsNotNull(){
        isNotNull("imsi");
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper imsiIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper imsiIn(String... values){
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
    public EmSocDevicesQueryWrapper imsiNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper imsiNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("imsi",values);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * 等于 =
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesQueryWrapper macAddrEq(String macAddr){
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
    public EmSocDevicesQueryWrapper macAddrNe(String macAddr){
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
    public EmSocDevicesQueryWrapper macAddrGt(String macAddr){
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
    public EmSocDevicesQueryWrapper macAddrGe(String macAddr){
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
    public EmSocDevicesQueryWrapper macAddrLt(String macAddr){
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
    public EmSocDevicesQueryWrapper macAddrLe(String macAddr){
        if(macAddr!=null){
            le("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * BETWEEN 值1 AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper macAddrBetween(String macAddrStart,String macAddrEnd){
        if(macAddrStart!=null && macAddrEnd!=null){
            between("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * NOT BETWEEN 值1 AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper macAddrNotBetween(String macAddrStart,String macAddrEnd){
        if(macAddrStart!=null && macAddrEnd!=null){
            notBetween("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }


    /**
     * <p>macAddr</p>
     * LIKE '%值%'
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesQueryWrapper macAddrLike(String macAddr){
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
    public EmSocDevicesQueryWrapper macAddrNotLike(String macAddr){
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
    public EmSocDevicesQueryWrapper macAddrLikeLeft(String macAddr){
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
    public EmSocDevicesQueryWrapper macAddrLikeRight(String macAddr){
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
    public EmSocDevicesQueryWrapper macAddrIsNull(){
        isNull("mac_addr");
        return this;
    }

    /**
     * <p>macAddr</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper macAddrIsNotNull(){
        isNotNull("mac_addr");
        return this;
    }

    /**
     * <p>macAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper macAddrIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper macAddrIn(String... values){
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
    public EmSocDevicesQueryWrapper macAddrNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper macAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("mac_addr",values);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * 等于 =
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesQueryWrapper internalAddrEq(String internalAddr){
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
    public EmSocDevicesQueryWrapper internalAddrNe(String internalAddr){
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
    public EmSocDevicesQueryWrapper internalAddrGt(String internalAddr){
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
    public EmSocDevicesQueryWrapper internalAddrGe(String internalAddr){
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
    public EmSocDevicesQueryWrapper internalAddrLt(String internalAddr){
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
    public EmSocDevicesQueryWrapper internalAddrLe(String internalAddr){
        if(internalAddr!=null){
            le("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * BETWEEN 值1 AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper internalAddrBetween(String internalAddrStart,String internalAddrEnd){
        if(internalAddrStart!=null && internalAddrEnd!=null){
            between("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * NOT BETWEEN 值1 AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper internalAddrNotBetween(String internalAddrStart,String internalAddrEnd){
        if(internalAddrStart!=null && internalAddrEnd!=null){
            notBetween("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }


    /**
     * <p>internalAddr</p>
     * LIKE '%值%'
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesQueryWrapper internalAddrLike(String internalAddr){
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
    public EmSocDevicesQueryWrapper internalAddrNotLike(String internalAddr){
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
    public EmSocDevicesQueryWrapper internalAddrLikeLeft(String internalAddr){
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
    public EmSocDevicesQueryWrapper internalAddrLikeRight(String internalAddr){
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
    public EmSocDevicesQueryWrapper internalAddrIsNull(){
        isNull("internal_addr");
        return this;
    }

    /**
     * <p>internalAddr</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper internalAddrIsNotNull(){
        isNotNull("internal_addr");
        return this;
    }

    /**
     * <p>internalAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper internalAddrIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper internalAddrIn(String... values){
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
    public EmSocDevicesQueryWrapper internalAddrNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper internalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("internal_addr",values);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * 等于 =
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesQueryWrapper externalAddrEq(String externalAddr){
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
    public EmSocDevicesQueryWrapper externalAddrNe(String externalAddr){
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
    public EmSocDevicesQueryWrapper externalAddrGt(String externalAddr){
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
    public EmSocDevicesQueryWrapper externalAddrGe(String externalAddr){
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
    public EmSocDevicesQueryWrapper externalAddrLt(String externalAddr){
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
    public EmSocDevicesQueryWrapper externalAddrLe(String externalAddr){
        if(externalAddr!=null){
            le("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * BETWEEN 值1 AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper externalAddrBetween(String externalAddrStart,String externalAddrEnd){
        if(externalAddrStart!=null && externalAddrEnd!=null){
            between("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * NOT BETWEEN 值1 AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper externalAddrNotBetween(String externalAddrStart,String externalAddrEnd){
        if(externalAddrStart!=null && externalAddrEnd!=null){
            notBetween("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }


    /**
     * <p>externalAddr</p>
     * LIKE '%值%'
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesQueryWrapper externalAddrLike(String externalAddr){
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
    public EmSocDevicesQueryWrapper externalAddrNotLike(String externalAddr){
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
    public EmSocDevicesQueryWrapper externalAddrLikeLeft(String externalAddr){
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
    public EmSocDevicesQueryWrapper externalAddrLikeRight(String externalAddr){
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
    public EmSocDevicesQueryWrapper externalAddrIsNull(){
        isNull("external_addr");
        return this;
    }

    /**
     * <p>externalAddr</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper externalAddrIsNotNull(){
        isNotNull("external_addr");
        return this;
    }

    /**
     * <p>externalAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper externalAddrIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper externalAddrIn(String... values){
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
    public EmSocDevicesQueryWrapper externalAddrNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper externalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("external_addr",values);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * 等于 =
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesQueryWrapper provinceCcodeEq(Long provinceCcode){
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
    public EmSocDevicesQueryWrapper provinceCcodeNe(Long provinceCcode){
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
    public EmSocDevicesQueryWrapper provinceCcodeGt(Long provinceCcode){
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
    public EmSocDevicesQueryWrapper provinceCcodeGe(Long provinceCcode){
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
    public EmSocDevicesQueryWrapper provinceCcodeLt(Long provinceCcode){
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
    public EmSocDevicesQueryWrapper provinceCcodeLe(Long provinceCcode){
        if(provinceCcode!=null){
            le("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * BETWEEN 值1 AND 值2
     * @param provinceCcodeStart       值1
     * @param provinceCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper provinceCcodeBetween(Long provinceCcodeStart,Long provinceCcodeEnd){
        if(provinceCcodeStart!=null && provinceCcodeEnd!=null){
            between("province_ccode",provinceCcodeStart,provinceCcodeEnd);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * NOT BETWEEN 值1 AND 值2
     * @param provinceCcodeStart       值1
     * @param provinceCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper provinceCcodeNotBetween(Long provinceCcodeStart,Long provinceCcodeEnd){
        if(provinceCcodeStart!=null && provinceCcodeEnd!=null){
            notBetween("province_ccode",provinceCcodeStart,provinceCcodeEnd);
        }
        return this;
     }


    /**
     * <p>省份ccode</p>
     * LIKE '%值%'
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesQueryWrapper provinceCcodeLike(Long provinceCcode){
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
    public EmSocDevicesQueryWrapper provinceCcodeNotLike(Long provinceCcode){
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
    public EmSocDevicesQueryWrapper provinceCcodeLikeLeft(Long provinceCcode){
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
    public EmSocDevicesQueryWrapper provinceCcodeLikeRight(Long provinceCcode){
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
    public EmSocDevicesQueryWrapper provinceCcodeIsNull(){
        isNull("province_ccode");
        return this;
    }

    /**
     * <p>省份ccode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper provinceCcodeIsNotNull(){
        isNotNull("province_ccode");
        return this;
    }

    /**
     * <p>省份ccode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper provinceCcodeIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper provinceCcodeIn(Long... values){
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
    public EmSocDevicesQueryWrapper provinceCcodeNotIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper provinceCcodeNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("province_ccode",values);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * 等于 =
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesQueryWrapper provinceNameEq(String provinceName){
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
    public EmSocDevicesQueryWrapper provinceNameNe(String provinceName){
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
    public EmSocDevicesQueryWrapper provinceNameGt(String provinceName){
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
    public EmSocDevicesQueryWrapper provinceNameGe(String provinceName){
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
    public EmSocDevicesQueryWrapper provinceNameLt(String provinceName){
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
    public EmSocDevicesQueryWrapper provinceNameLe(String provinceName){
        if(provinceName!=null){
            le("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * BETWEEN 值1 AND 值2
     * @param provinceNameStart       值1
     * @param provinceNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper provinceNameBetween(String provinceNameStart,String provinceNameEnd){
        if(provinceNameStart!=null && provinceNameEnd!=null){
            between("province_name",provinceNameStart,provinceNameEnd);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param provinceNameStart       值1
     * @param provinceNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper provinceNameNotBetween(String provinceNameStart,String provinceNameEnd){
        if(provinceNameStart!=null && provinceNameEnd!=null){
            notBetween("province_name",provinceNameStart,provinceNameEnd);
        }
        return this;
     }


    /**
     * <p>省份名称</p>
     * LIKE '%值%'
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesQueryWrapper provinceNameLike(String provinceName){
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
    public EmSocDevicesQueryWrapper provinceNameNotLike(String provinceName){
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
    public EmSocDevicesQueryWrapper provinceNameLikeLeft(String provinceName){
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
    public EmSocDevicesQueryWrapper provinceNameLikeRight(String provinceName){
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
    public EmSocDevicesQueryWrapper provinceNameIsNull(){
        isNull("province_name");
        return this;
    }

    /**
     * <p>省份名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper provinceNameIsNotNull(){
        isNotNull("province_name");
        return this;
    }

    /**
     * <p>省份名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper provinceNameIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper provinceNameIn(String... values){
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
    public EmSocDevicesQueryWrapper provinceNameNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper provinceNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("province_name",values);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * 等于 =
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesQueryWrapper cityCcodeEq(Long cityCcode){
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
    public EmSocDevicesQueryWrapper cityCcodeNe(Long cityCcode){
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
    public EmSocDevicesQueryWrapper cityCcodeGt(Long cityCcode){
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
    public EmSocDevicesQueryWrapper cityCcodeGe(Long cityCcode){
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
    public EmSocDevicesQueryWrapper cityCcodeLt(Long cityCcode){
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
    public EmSocDevicesQueryWrapper cityCcodeLe(Long cityCcode){
        if(cityCcode!=null){
            le("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * BETWEEN 值1 AND 值2
     * @param cityCcodeStart       值1
     * @param cityCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper cityCcodeBetween(Long cityCcodeStart,Long cityCcodeEnd){
        if(cityCcodeStart!=null && cityCcodeEnd!=null){
            between("city_ccode",cityCcodeStart,cityCcodeEnd);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * NOT BETWEEN 值1 AND 值2
     * @param cityCcodeStart       值1
     * @param cityCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper cityCcodeNotBetween(Long cityCcodeStart,Long cityCcodeEnd){
        if(cityCcodeStart!=null && cityCcodeEnd!=null){
            notBetween("city_ccode",cityCcodeStart,cityCcodeEnd);
        }
        return this;
     }


    /**
     * <p>城市ccode</p>
     * LIKE '%值%'
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesQueryWrapper cityCcodeLike(Long cityCcode){
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
    public EmSocDevicesQueryWrapper cityCcodeNotLike(Long cityCcode){
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
    public EmSocDevicesQueryWrapper cityCcodeLikeLeft(Long cityCcode){
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
    public EmSocDevicesQueryWrapper cityCcodeLikeRight(Long cityCcode){
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
    public EmSocDevicesQueryWrapper cityCcodeIsNull(){
        isNull("city_ccode");
        return this;
    }

    /**
     * <p>城市ccode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper cityCcodeIsNotNull(){
        isNotNull("city_ccode");
        return this;
    }

    /**
     * <p>城市ccode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper cityCcodeIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper cityCcodeIn(Long... values){
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
    public EmSocDevicesQueryWrapper cityCcodeNotIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper cityCcodeNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("city_ccode",values);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * 等于 =
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesQueryWrapper cityNameEq(String cityName){
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
    public EmSocDevicesQueryWrapper cityNameNe(String cityName){
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
    public EmSocDevicesQueryWrapper cityNameGt(String cityName){
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
    public EmSocDevicesQueryWrapper cityNameGe(String cityName){
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
    public EmSocDevicesQueryWrapper cityNameLt(String cityName){
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
    public EmSocDevicesQueryWrapper cityNameLe(String cityName){
        if(cityName!=null){
            le("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * BETWEEN 值1 AND 值2
     * @param cityNameStart       值1
     * @param cityNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper cityNameBetween(String cityNameStart,String cityNameEnd){
        if(cityNameStart!=null && cityNameEnd!=null){
            between("city_name",cityNameStart,cityNameEnd);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param cityNameStart       值1
     * @param cityNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper cityNameNotBetween(String cityNameStart,String cityNameEnd){
        if(cityNameStart!=null && cityNameEnd!=null){
            notBetween("city_name",cityNameStart,cityNameEnd);
        }
        return this;
     }


    /**
     * <p>城市名称</p>
     * LIKE '%值%'
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesQueryWrapper cityNameLike(String cityName){
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
    public EmSocDevicesQueryWrapper cityNameNotLike(String cityName){
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
    public EmSocDevicesQueryWrapper cityNameLikeLeft(String cityName){
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
    public EmSocDevicesQueryWrapper cityNameLikeRight(String cityName){
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
    public EmSocDevicesQueryWrapper cityNameIsNull(){
        isNull("city_name");
        return this;
    }

    /**
     * <p>城市名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper cityNameIsNotNull(){
        isNotNull("city_name");
        return this;
    }

    /**
     * <p>城市名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper cityNameIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper cityNameIn(String... values){
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
    public EmSocDevicesQueryWrapper cityNameNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper cityNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("city_name",values);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * 等于 =
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesQueryWrapper areaCcodeEq(Long areaCcode){
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
    public EmSocDevicesQueryWrapper areaCcodeNe(Long areaCcode){
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
    public EmSocDevicesQueryWrapper areaCcodeGt(Long areaCcode){
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
    public EmSocDevicesQueryWrapper areaCcodeGe(Long areaCcode){
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
    public EmSocDevicesQueryWrapper areaCcodeLt(Long areaCcode){
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
    public EmSocDevicesQueryWrapper areaCcodeLe(Long areaCcode){
        if(areaCcode!=null){
            le("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * BETWEEN 值1 AND 值2
     * @param areaCcodeStart       值1
     * @param areaCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper areaCcodeBetween(Long areaCcodeStart,Long areaCcodeEnd){
        if(areaCcodeStart!=null && areaCcodeEnd!=null){
            between("area_ccode",areaCcodeStart,areaCcodeEnd);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * NOT BETWEEN 值1 AND 值2
     * @param areaCcodeStart       值1
     * @param areaCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper areaCcodeNotBetween(Long areaCcodeStart,Long areaCcodeEnd){
        if(areaCcodeStart!=null && areaCcodeEnd!=null){
            notBetween("area_ccode",areaCcodeStart,areaCcodeEnd);
        }
        return this;
     }


    /**
     * <p>地区ccode</p>
     * LIKE '%值%'
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesQueryWrapper areaCcodeLike(Long areaCcode){
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
    public EmSocDevicesQueryWrapper areaCcodeNotLike(Long areaCcode){
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
    public EmSocDevicesQueryWrapper areaCcodeLikeLeft(Long areaCcode){
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
    public EmSocDevicesQueryWrapper areaCcodeLikeRight(Long areaCcode){
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
    public EmSocDevicesQueryWrapper areaCcodeIsNull(){
        isNull("area_ccode");
        return this;
    }

    /**
     * <p>地区ccode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper areaCcodeIsNotNull(){
        isNotNull("area_ccode");
        return this;
    }

    /**
     * <p>地区ccode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper areaCcodeIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper areaCcodeIn(Long... values){
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
    public EmSocDevicesQueryWrapper areaCcodeNotIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper areaCcodeNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("area_ccode",values);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * 等于 =
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesQueryWrapper areaNameEq(String areaName){
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
    public EmSocDevicesQueryWrapper areaNameNe(String areaName){
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
    public EmSocDevicesQueryWrapper areaNameGt(String areaName){
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
    public EmSocDevicesQueryWrapper areaNameGe(String areaName){
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
    public EmSocDevicesQueryWrapper areaNameLt(String areaName){
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
    public EmSocDevicesQueryWrapper areaNameLe(String areaName){
        if(areaName!=null){
            le("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * BETWEEN 值1 AND 值2
     * @param areaNameStart       值1
     * @param areaNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper areaNameBetween(String areaNameStart,String areaNameEnd){
        if(areaNameStart!=null && areaNameEnd!=null){
            between("area_name",areaNameStart,areaNameEnd);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param areaNameStart       值1
     * @param areaNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper areaNameNotBetween(String areaNameStart,String areaNameEnd){
        if(areaNameStart!=null && areaNameEnd!=null){
            notBetween("area_name",areaNameStart,areaNameEnd);
        }
        return this;
     }


    /**
     * <p>地区名称</p>
     * LIKE '%值%'
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesQueryWrapper areaNameLike(String areaName){
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
    public EmSocDevicesQueryWrapper areaNameNotLike(String areaName){
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
    public EmSocDevicesQueryWrapper areaNameLikeLeft(String areaName){
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
    public EmSocDevicesQueryWrapper areaNameLikeRight(String areaName){
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
    public EmSocDevicesQueryWrapper areaNameIsNull(){
        isNull("area_name");
        return this;
    }

    /**
     * <p>地区名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper areaNameIsNotNull(){
        isNotNull("area_name");
        return this;
    }

    /**
     * <p>地区名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper areaNameIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper areaNameIn(String... values){
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
    public EmSocDevicesQueryWrapper areaNameNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper areaNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("area_name",values);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 等于 =
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesQueryWrapper regionNameEq(String regionName){
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
    public EmSocDevicesQueryWrapper regionNameNe(String regionName){
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
    public EmSocDevicesQueryWrapper regionNameGt(String regionName){
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
    public EmSocDevicesQueryWrapper regionNameGe(String regionName){
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
    public EmSocDevicesQueryWrapper regionNameLt(String regionName){
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
    public EmSocDevicesQueryWrapper regionNameLe(String regionName){
        if(regionName!=null){
            le("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * BETWEEN 值1 AND 值2
     * @param regionNameStart       值1
     * @param regionNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper regionNameBetween(String regionNameStart,String regionNameEnd){
        if(regionNameStart!=null && regionNameEnd!=null){
            between("region_name",regionNameStart,regionNameEnd);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param regionNameStart       值1
     * @param regionNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper regionNameNotBetween(String regionNameStart,String regionNameEnd){
        if(regionNameStart!=null && regionNameEnd!=null){
            notBetween("region_name",regionNameStart,regionNameEnd);
        }
        return this;
     }


    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '%值%'
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesQueryWrapper regionNameLike(String regionName){
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
    public EmSocDevicesQueryWrapper regionNameNotLike(String regionName){
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
    public EmSocDevicesQueryWrapper regionNameLikeLeft(String regionName){
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
    public EmSocDevicesQueryWrapper regionNameLikeRight(String regionName){
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
    public EmSocDevicesQueryWrapper regionNameIsNull(){
        isNull("region_name");
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper regionNameIsNotNull(){
        isNotNull("region_name");
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper regionNameIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper regionNameIn(String... values){
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
    public EmSocDevicesQueryWrapper regionNameNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper regionNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region_name",values);
        }
        return this;
    }

    /**
     * <p>location</p>
     * 等于 =
     * @param location       值
     * @return children
     */
    public EmSocDevicesQueryWrapper locationEq(String location){
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
    public EmSocDevicesQueryWrapper locationNe(String location){
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
    public EmSocDevicesQueryWrapper locationGt(String location){
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
    public EmSocDevicesQueryWrapper locationGe(String location){
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
    public EmSocDevicesQueryWrapper locationLt(String location){
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
    public EmSocDevicesQueryWrapper locationLe(String location){
        if(location!=null){
            le("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * BETWEEN 值1 AND 值2
     * @param locationStart       值1
     * @param locationEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper locationBetween(String locationStart,String locationEnd){
        if(locationStart!=null && locationEnd!=null){
            between("location",locationStart,locationEnd);
        }
        return this;
     }

    /**
     * <p>location</p>
     * NOT BETWEEN 值1 AND 值2
     * @param locationStart       值1
     * @param locationEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper locationNotBetween(String locationStart,String locationEnd){
        if(locationStart!=null && locationEnd!=null){
            notBetween("location",locationStart,locationEnd);
        }
        return this;
     }


    /**
     * <p>location</p>
     * LIKE '%值%'
     * @param location       值
     * @return children
     */
    public EmSocDevicesQueryWrapper locationLike(String location){
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
    public EmSocDevicesQueryWrapper locationNotLike(String location){
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
    public EmSocDevicesQueryWrapper locationLikeLeft(String location){
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
    public EmSocDevicesQueryWrapper locationLikeRight(String location){
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
    public EmSocDevicesQueryWrapper locationIsNull(){
        isNull("location");
        return this;
    }

    /**
     * <p>location</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper locationIsNotNull(){
        isNotNull("location");
        return this;
    }

    /**
     * <p>location</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper locationIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper locationIn(String... values){
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
    public EmSocDevicesQueryWrapper locationNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper locationNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("location",values);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * 等于 =
     * @param processors       值
     * @return children
     */
    public EmSocDevicesQueryWrapper processorsEq(Integer processors){
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
    public EmSocDevicesQueryWrapper processorsNe(Integer processors){
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
    public EmSocDevicesQueryWrapper processorsGt(Integer processors){
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
    public EmSocDevicesQueryWrapper processorsGe(Integer processors){
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
    public EmSocDevicesQueryWrapper processorsLt(Integer processors){
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
    public EmSocDevicesQueryWrapper processorsLe(Integer processors){
        if(processors!=null){
            le("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * BETWEEN 值1 AND 值2
     * @param processorsStart       值1
     * @param processorsEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper processorsBetween(Integer processorsStart,Integer processorsEnd){
        if(processorsStart!=null && processorsEnd!=null){
            between("processors",processorsStart,processorsEnd);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param processorsStart       值1
     * @param processorsEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper processorsNotBetween(Integer processorsStart,Integer processorsEnd){
        if(processorsStart!=null && processorsEnd!=null){
            notBetween("processors",processorsStart,processorsEnd);
        }
        return this;
     }


    /**
     * <p>cpu线程数</p>
     * LIKE '%值%'
     * @param processors       值
     * @return children
     */
    public EmSocDevicesQueryWrapper processorsLike(Integer processors){
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
    public EmSocDevicesQueryWrapper processorsNotLike(Integer processors){
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
    public EmSocDevicesQueryWrapper processorsLikeLeft(Integer processors){
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
    public EmSocDevicesQueryWrapper processorsLikeRight(Integer processors){
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
    public EmSocDevicesQueryWrapper processorsIsNull(){
        isNull("processors");
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper processorsIsNotNull(){
        isNotNull("processors");
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper processorsIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper processorsIn(Integer... values){
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
    public EmSocDevicesQueryWrapper processorsNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper processorsNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("processors",values);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * 等于 =
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildIdEq(String buildId){
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
    public EmSocDevicesQueryWrapper buildIdNe(String buildId){
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
    public EmSocDevicesQueryWrapper buildIdGt(String buildId){
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
    public EmSocDevicesQueryWrapper buildIdGe(String buildId){
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
    public EmSocDevicesQueryWrapper buildIdLt(String buildId){
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
    public EmSocDevicesQueryWrapper buildIdLe(String buildId){
        if(buildId!=null){
            le("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * BETWEEN 值1 AND 值2
     * @param buildIdStart       值1
     * @param buildIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildIdBetween(String buildIdStart,String buildIdEnd){
        if(buildIdStart!=null && buildIdEnd!=null){
            between("build_id",buildIdStart,buildIdEnd);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildIdStart       值1
     * @param buildIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildIdNotBetween(String buildIdStart,String buildIdEnd){
        if(buildIdStart!=null && buildIdEnd!=null){
            notBetween("build_id",buildIdStart,buildIdEnd);
        }
        return this;
     }


    /**
     * <p>修订版本号</p>
     * LIKE '%值%'
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildIdLike(String buildId){
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
    public EmSocDevicesQueryWrapper buildIdNotLike(String buildId){
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
    public EmSocDevicesQueryWrapper buildIdLikeLeft(String buildId){
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
    public EmSocDevicesQueryWrapper buildIdLikeRight(String buildId){
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
    public EmSocDevicesQueryWrapper buildIdIsNull(){
        isNull("build_id");
        return this;
    }

    /**
     * <p>修订版本号</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildIdIsNotNull(){
        isNotNull("build_id");
        return this;
    }

    /**
     * <p>修订版本号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildIdIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildIdIn(String... values){
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
    public EmSocDevicesQueryWrapper buildIdNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_id",values);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * 等于 =
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildRadioEq(String buildRadio){
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
    public EmSocDevicesQueryWrapper buildRadioNe(String buildRadio){
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
    public EmSocDevicesQueryWrapper buildRadioGt(String buildRadio){
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
    public EmSocDevicesQueryWrapper buildRadioGe(String buildRadio){
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
    public EmSocDevicesQueryWrapper buildRadioLt(String buildRadio){
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
    public EmSocDevicesQueryWrapper buildRadioLe(String buildRadio){
        if(buildRadio!=null){
            le("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * BETWEEN 值1 AND 值2
     * @param buildRadioStart       值1
     * @param buildRadioEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildRadioBetween(String buildRadioStart,String buildRadioEnd){
        if(buildRadioStart!=null && buildRadioEnd!=null){
            between("build_radio",buildRadioStart,buildRadioEnd);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildRadioStart       值1
     * @param buildRadioEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildRadioNotBetween(String buildRadioStart,String buildRadioEnd){
        if(buildRadioStart!=null && buildRadioEnd!=null){
            notBetween("build_radio",buildRadioStart,buildRadioEnd);
        }
        return this;
     }


    /**
     * <p>build_radio</p>
     * LIKE '%值%'
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildRadioLike(String buildRadio){
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
    public EmSocDevicesQueryWrapper buildRadioNotLike(String buildRadio){
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
    public EmSocDevicesQueryWrapper buildRadioLikeLeft(String buildRadio){
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
    public EmSocDevicesQueryWrapper buildRadioLikeRight(String buildRadio){
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
    public EmSocDevicesQueryWrapper buildRadioIsNull(){
        isNull("build_radio");
        return this;
    }

    /**
     * <p>build_radio</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildRadioIsNotNull(){
        isNotNull("build_radio");
        return this;
    }

    /**
     * <p>build_radio</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildRadioIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildRadioIn(String... values){
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
    public EmSocDevicesQueryWrapper buildRadioNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildRadioNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_radio",values);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 等于 =
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildModelEq(String buildModel){
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
    public EmSocDevicesQueryWrapper buildModelNe(String buildModel){
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
    public EmSocDevicesQueryWrapper buildModelGt(String buildModel){
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
    public EmSocDevicesQueryWrapper buildModelGe(String buildModel){
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
    public EmSocDevicesQueryWrapper buildModelLt(String buildModel){
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
    public EmSocDevicesQueryWrapper buildModelLe(String buildModel){
        if(buildModel!=null){
            le("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * BETWEEN 值1 AND 值2
     * @param buildModelStart       值1
     * @param buildModelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildModelBetween(String buildModelStart,String buildModelEnd){
        if(buildModelStart!=null && buildModelEnd!=null){
            between("build_model",buildModelStart,buildModelEnd);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildModelStart       值1
     * @param buildModelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildModelNotBetween(String buildModelStart,String buildModelEnd){
        if(buildModelStart!=null && buildModelEnd!=null){
            notBetween("build_model",buildModelStart,buildModelEnd);
        }
        return this;
     }


    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '%值%'
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildModelLike(String buildModel){
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
    public EmSocDevicesQueryWrapper buildModelNotLike(String buildModel){
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
    public EmSocDevicesQueryWrapper buildModelLikeLeft(String buildModel){
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
    public EmSocDevicesQueryWrapper buildModelLikeRight(String buildModel){
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
    public EmSocDevicesQueryWrapper buildModelIsNull(){
        isNull("build_model");
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildModelIsNotNull(){
        isNotNull("build_model");
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildModelIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildModelIn(String... values){
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
    public EmSocDevicesQueryWrapper buildModelNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildModelNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_model",values);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * 等于 =
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildManufacturerEq(String buildManufacturer){
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
    public EmSocDevicesQueryWrapper buildManufacturerNe(String buildManufacturer){
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
    public EmSocDevicesQueryWrapper buildManufacturerGt(String buildManufacturer){
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
    public EmSocDevicesQueryWrapper buildManufacturerGe(String buildManufacturer){
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
    public EmSocDevicesQueryWrapper buildManufacturerLt(String buildManufacturer){
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
    public EmSocDevicesQueryWrapper buildManufacturerLe(String buildManufacturer){
        if(buildManufacturer!=null){
            le("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * BETWEEN 值1 AND 值2
     * @param buildManufacturerStart       值1
     * @param buildManufacturerEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildManufacturerBetween(String buildManufacturerStart,String buildManufacturerEnd){
        if(buildManufacturerStart!=null && buildManufacturerEnd!=null){
            between("build_manufacturer",buildManufacturerStart,buildManufacturerEnd);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildManufacturerStart       值1
     * @param buildManufacturerEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildManufacturerNotBetween(String buildManufacturerStart,String buildManufacturerEnd){
        if(buildManufacturerStart!=null && buildManufacturerEnd!=null){
            notBetween("build_manufacturer",buildManufacturerStart,buildManufacturerEnd);
        }
        return this;
     }


    /**
     * <p>硬件制造商</p>
     * LIKE '%值%'
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildManufacturerLike(String buildManufacturer){
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
    public EmSocDevicesQueryWrapper buildManufacturerNotLike(String buildManufacturer){
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
    public EmSocDevicesQueryWrapper buildManufacturerLikeLeft(String buildManufacturer){
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
    public EmSocDevicesQueryWrapper buildManufacturerLikeRight(String buildManufacturer){
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
    public EmSocDevicesQueryWrapper buildManufacturerIsNull(){
        isNull("build_manufacturer");
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildManufacturerIsNotNull(){
        isNotNull("build_manufacturer");
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildManufacturerIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildManufacturerIn(String... values){
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
    public EmSocDevicesQueryWrapper buildManufacturerNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildManufacturerNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_manufacturer",values);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * 等于 =
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBootloaderEq(String buildBootloader){
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
    public EmSocDevicesQueryWrapper buildBootloaderNe(String buildBootloader){
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
    public EmSocDevicesQueryWrapper buildBootloaderGt(String buildBootloader){
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
    public EmSocDevicesQueryWrapper buildBootloaderGe(String buildBootloader){
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
    public EmSocDevicesQueryWrapper buildBootloaderLt(String buildBootloader){
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
    public EmSocDevicesQueryWrapper buildBootloaderLe(String buildBootloader){
        if(buildBootloader!=null){
            le("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * BETWEEN 值1 AND 值2
     * @param buildBootloaderStart       值1
     * @param buildBootloaderEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBootloaderBetween(String buildBootloaderStart,String buildBootloaderEnd){
        if(buildBootloaderStart!=null && buildBootloaderEnd!=null){
            between("build_bootloader",buildBootloaderStart,buildBootloaderEnd);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildBootloaderStart       值1
     * @param buildBootloaderEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBootloaderNotBetween(String buildBootloaderStart,String buildBootloaderEnd){
        if(buildBootloaderStart!=null && buildBootloaderEnd!=null){
            notBetween("build_bootloader",buildBootloaderStart,buildBootloaderEnd);
        }
        return this;
     }


    /**
     * <p>build_bootloader</p>
     * LIKE '%值%'
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBootloaderLike(String buildBootloader){
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
    public EmSocDevicesQueryWrapper buildBootloaderNotLike(String buildBootloader){
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
    public EmSocDevicesQueryWrapper buildBootloaderLikeLeft(String buildBootloader){
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
    public EmSocDevicesQueryWrapper buildBootloaderLikeRight(String buildBootloader){
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
    public EmSocDevicesQueryWrapper buildBootloaderIsNull(){
        isNull("build_bootloader");
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBootloaderIsNotNull(){
        isNotNull("build_bootloader");
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBootloaderIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildBootloaderIn(String... values){
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
    public EmSocDevicesQueryWrapper buildBootloaderNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildBootloaderNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_bootloader",values);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * 等于 =
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBoardEq(String buildBoard){
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
    public EmSocDevicesQueryWrapper buildBoardNe(String buildBoard){
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
    public EmSocDevicesQueryWrapper buildBoardGt(String buildBoard){
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
    public EmSocDevicesQueryWrapper buildBoardGe(String buildBoard){
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
    public EmSocDevicesQueryWrapper buildBoardLt(String buildBoard){
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
    public EmSocDevicesQueryWrapper buildBoardLe(String buildBoard){
        if(buildBoard!=null){
            le("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * BETWEEN 值1 AND 值2
     * @param buildBoardStart       值1
     * @param buildBoardEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBoardBetween(String buildBoardStart,String buildBoardEnd){
        if(buildBoardStart!=null && buildBoardEnd!=null){
            between("build_board",buildBoardStart,buildBoardEnd);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildBoardStart       值1
     * @param buildBoardEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBoardNotBetween(String buildBoardStart,String buildBoardEnd){
        if(buildBoardStart!=null && buildBoardEnd!=null){
            notBetween("build_board",buildBoardStart,buildBoardEnd);
        }
        return this;
     }


    /**
     * <p>主板</p>
     * LIKE '%值%'
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBoardLike(String buildBoard){
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
    public EmSocDevicesQueryWrapper buildBoardNotLike(String buildBoard){
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
    public EmSocDevicesQueryWrapper buildBoardLikeLeft(String buildBoard){
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
    public EmSocDevicesQueryWrapper buildBoardLikeRight(String buildBoard){
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
    public EmSocDevicesQueryWrapper buildBoardIsNull(){
        isNull("build_board");
        return this;
    }

    /**
     * <p>主板</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBoardIsNotNull(){
        isNotNull("build_board");
        return this;
    }

    /**
     * <p>主板</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBoardIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildBoardIn(String... values){
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
    public EmSocDevicesQueryWrapper buildBoardNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildBoardNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_board",values);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * 等于 =
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBrandEq(String buildBrand){
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
    public EmSocDevicesQueryWrapper buildBrandNe(String buildBrand){
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
    public EmSocDevicesQueryWrapper buildBrandGt(String buildBrand){
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
    public EmSocDevicesQueryWrapper buildBrandGe(String buildBrand){
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
    public EmSocDevicesQueryWrapper buildBrandLt(String buildBrand){
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
    public EmSocDevicesQueryWrapper buildBrandLe(String buildBrand){
        if(buildBrand!=null){
            le("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * BETWEEN 值1 AND 值2
     * @param buildBrandStart       值1
     * @param buildBrandEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBrandBetween(String buildBrandStart,String buildBrandEnd){
        if(buildBrandStart!=null && buildBrandEnd!=null){
            between("build_brand",buildBrandStart,buildBrandEnd);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildBrandStart       值1
     * @param buildBrandEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBrandNotBetween(String buildBrandStart,String buildBrandEnd){
        if(buildBrandStart!=null && buildBrandEnd!=null){
            notBetween("build_brand",buildBrandStart,buildBrandEnd);
        }
        return this;
     }


    /**
     * <p>系统定制商</p>
     * LIKE '%值%'
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBrandLike(String buildBrand){
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
    public EmSocDevicesQueryWrapper buildBrandNotLike(String buildBrand){
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
    public EmSocDevicesQueryWrapper buildBrandLikeLeft(String buildBrand){
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
    public EmSocDevicesQueryWrapper buildBrandLikeRight(String buildBrand){
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
    public EmSocDevicesQueryWrapper buildBrandIsNull(){
        isNull("build_brand");
        return this;
    }

    /**
     * <p>系统定制商</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBrandIsNotNull(){
        isNotNull("build_brand");
        return this;
    }

    /**
     * <p>系统定制商</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildBrandIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildBrandIn(String... values){
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
    public EmSocDevicesQueryWrapper buildBrandNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildBrandNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_brand",values);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * 等于 =
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildCpuAbiEq(String buildCpuAbi){
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
    public EmSocDevicesQueryWrapper buildCpuAbiNe(String buildCpuAbi){
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
    public EmSocDevicesQueryWrapper buildCpuAbiGt(String buildCpuAbi){
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
    public EmSocDevicesQueryWrapper buildCpuAbiGe(String buildCpuAbi){
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
    public EmSocDevicesQueryWrapper buildCpuAbiLt(String buildCpuAbi){
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
    public EmSocDevicesQueryWrapper buildCpuAbiLe(String buildCpuAbi){
        if(buildCpuAbi!=null){
            le("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * BETWEEN 值1 AND 值2
     * @param buildCpuAbiStart       值1
     * @param buildCpuAbiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildCpuAbiBetween(String buildCpuAbiStart,String buildCpuAbiEnd){
        if(buildCpuAbiStart!=null && buildCpuAbiEnd!=null){
            between("build_cpu_abi",buildCpuAbiStart,buildCpuAbiEnd);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildCpuAbiStart       值1
     * @param buildCpuAbiEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildCpuAbiNotBetween(String buildCpuAbiStart,String buildCpuAbiEnd){
        if(buildCpuAbiStart!=null && buildCpuAbiEnd!=null){
            notBetween("build_cpu_abi",buildCpuAbiStart,buildCpuAbiEnd);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi</p>
     * LIKE '%值%'
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildCpuAbiLike(String buildCpuAbi){
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
    public EmSocDevicesQueryWrapper buildCpuAbiNotLike(String buildCpuAbi){
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
    public EmSocDevicesQueryWrapper buildCpuAbiLikeLeft(String buildCpuAbi){
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
    public EmSocDevicesQueryWrapper buildCpuAbiLikeRight(String buildCpuAbi){
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
    public EmSocDevicesQueryWrapper buildCpuAbiIsNull(){
        isNull("build_cpu_abi");
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildCpuAbiIsNotNull(){
        isNotNull("build_cpu_abi");
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildCpuAbiIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildCpuAbiIn(String... values){
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
    public EmSocDevicesQueryWrapper buildCpuAbiNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildCpuAbiNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_cpu_abi",values);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * 等于 =
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildCpuAbi2Eq(String buildCpuAbi2){
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
    public EmSocDevicesQueryWrapper buildCpuAbi2Ne(String buildCpuAbi2){
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
    public EmSocDevicesQueryWrapper buildCpuAbi2Gt(String buildCpuAbi2){
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
    public EmSocDevicesQueryWrapper buildCpuAbi2Ge(String buildCpuAbi2){
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
    public EmSocDevicesQueryWrapper buildCpuAbi2Lt(String buildCpuAbi2){
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
    public EmSocDevicesQueryWrapper buildCpuAbi2Le(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            le("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * BETWEEN 值1 AND 值2
     * @param buildCpuAbi2Start       值1
     * @param buildCpuAbi2End      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildCpuAbi2Between(String buildCpuAbi2Start,String buildCpuAbi2End){
        if(buildCpuAbi2Start!=null && buildCpuAbi2End!=null){
            between("build_cpu_abi2",buildCpuAbi2Start,buildCpuAbi2End);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildCpuAbi2Start       值1
     * @param buildCpuAbi2End      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildCpuAbi2NotBetween(String buildCpuAbi2Start,String buildCpuAbi2End){
        if(buildCpuAbi2Start!=null && buildCpuAbi2End!=null){
            notBetween("build_cpu_abi2",buildCpuAbi2Start,buildCpuAbi2End);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi2</p>
     * LIKE '%值%'
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildCpuAbi2Like(String buildCpuAbi2){
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
    public EmSocDevicesQueryWrapper buildCpuAbi2NotLike(String buildCpuAbi2){
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
    public EmSocDevicesQueryWrapper buildCpuAbi2LikeLeft(String buildCpuAbi2){
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
    public EmSocDevicesQueryWrapper buildCpuAbi2LikeRight(String buildCpuAbi2){
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
    public EmSocDevicesQueryWrapper buildCpuAbi2IsNull(){
        isNull("build_cpu_abi2");
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildCpuAbi2IsNotNull(){
        isNotNull("build_cpu_abi2");
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildCpuAbi2In(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildCpuAbi2In(String... values){
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
    public EmSocDevicesQueryWrapper buildCpuAbi2NotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildCpuAbi2NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_cpu_abi2",values);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * 等于 =
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildDeviceEq(String buildDevice){
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
    public EmSocDevicesQueryWrapper buildDeviceNe(String buildDevice){
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
    public EmSocDevicesQueryWrapper buildDeviceGt(String buildDevice){
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
    public EmSocDevicesQueryWrapper buildDeviceGe(String buildDevice){
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
    public EmSocDevicesQueryWrapper buildDeviceLt(String buildDevice){
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
    public EmSocDevicesQueryWrapper buildDeviceLe(String buildDevice){
        if(buildDevice!=null){
            le("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * BETWEEN 值1 AND 值2
     * @param buildDeviceStart       值1
     * @param buildDeviceEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildDeviceBetween(String buildDeviceStart,String buildDeviceEnd){
        if(buildDeviceStart!=null && buildDeviceEnd!=null){
            between("build_device",buildDeviceStart,buildDeviceEnd);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildDeviceStart       值1
     * @param buildDeviceEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildDeviceNotBetween(String buildDeviceStart,String buildDeviceEnd){
        if(buildDeviceStart!=null && buildDeviceEnd!=null){
            notBetween("build_device",buildDeviceStart,buildDeviceEnd);
        }
        return this;
     }


    /**
     * <p>设备参数</p>
     * LIKE '%值%'
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildDeviceLike(String buildDevice){
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
    public EmSocDevicesQueryWrapper buildDeviceNotLike(String buildDevice){
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
    public EmSocDevicesQueryWrapper buildDeviceLikeLeft(String buildDevice){
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
    public EmSocDevicesQueryWrapper buildDeviceLikeRight(String buildDevice){
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
    public EmSocDevicesQueryWrapper buildDeviceIsNull(){
        isNull("build_device");
        return this;
    }

    /**
     * <p>设备参数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildDeviceIsNotNull(){
        isNotNull("build_device");
        return this;
    }

    /**
     * <p>设备参数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildDeviceIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildDeviceIn(String... values){
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
    public EmSocDevicesQueryWrapper buildDeviceNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildDeviceNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_device",values);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * 等于 =
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildDisplayEq(String buildDisplay){
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
    public EmSocDevicesQueryWrapper buildDisplayNe(String buildDisplay){
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
    public EmSocDevicesQueryWrapper buildDisplayGt(String buildDisplay){
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
    public EmSocDevicesQueryWrapper buildDisplayGe(String buildDisplay){
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
    public EmSocDevicesQueryWrapper buildDisplayLt(String buildDisplay){
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
    public EmSocDevicesQueryWrapper buildDisplayLe(String buildDisplay){
        if(buildDisplay!=null){
            le("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * BETWEEN 值1 AND 值2
     * @param buildDisplayStart       值1
     * @param buildDisplayEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildDisplayBetween(String buildDisplayStart,String buildDisplayEnd){
        if(buildDisplayStart!=null && buildDisplayEnd!=null){
            between("build_display",buildDisplayStart,buildDisplayEnd);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildDisplayStart       值1
     * @param buildDisplayEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildDisplayNotBetween(String buildDisplayStart,String buildDisplayEnd){
        if(buildDisplayStart!=null && buildDisplayEnd!=null){
            notBetween("build_display",buildDisplayStart,buildDisplayEnd);
        }
        return this;
     }


    /**
     * <p>显示屏参数</p>
     * LIKE '%值%'
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildDisplayLike(String buildDisplay){
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
    public EmSocDevicesQueryWrapper buildDisplayNotLike(String buildDisplay){
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
    public EmSocDevicesQueryWrapper buildDisplayLikeLeft(String buildDisplay){
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
    public EmSocDevicesQueryWrapper buildDisplayLikeRight(String buildDisplay){
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
    public EmSocDevicesQueryWrapper buildDisplayIsNull(){
        isNull("build_display");
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildDisplayIsNotNull(){
        isNotNull("build_display");
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildDisplayIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildDisplayIn(String... values){
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
    public EmSocDevicesQueryWrapper buildDisplayNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildDisplayNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_display",values);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * 等于 =
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildFingerprintEq(String buildFingerprint){
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
    public EmSocDevicesQueryWrapper buildFingerprintNe(String buildFingerprint){
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
    public EmSocDevicesQueryWrapper buildFingerprintGt(String buildFingerprint){
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
    public EmSocDevicesQueryWrapper buildFingerprintGe(String buildFingerprint){
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
    public EmSocDevicesQueryWrapper buildFingerprintLt(String buildFingerprint){
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
    public EmSocDevicesQueryWrapper buildFingerprintLe(String buildFingerprint){
        if(buildFingerprint!=null){
            le("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * BETWEEN 值1 AND 值2
     * @param buildFingerprintStart       值1
     * @param buildFingerprintEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildFingerprintBetween(String buildFingerprintStart,String buildFingerprintEnd){
        if(buildFingerprintStart!=null && buildFingerprintEnd!=null){
            between("build_fingerprint",buildFingerprintStart,buildFingerprintEnd);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildFingerprintStart       值1
     * @param buildFingerprintEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildFingerprintNotBetween(String buildFingerprintStart,String buildFingerprintEnd){
        if(buildFingerprintStart!=null && buildFingerprintEnd!=null){
            notBetween("build_fingerprint",buildFingerprintStart,buildFingerprintEnd);
        }
        return this;
     }


    /**
     * <p>唯一识别码</p>
     * LIKE '%值%'
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildFingerprintLike(String buildFingerprint){
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
    public EmSocDevicesQueryWrapper buildFingerprintNotLike(String buildFingerprint){
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
    public EmSocDevicesQueryWrapper buildFingerprintLikeLeft(String buildFingerprint){
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
    public EmSocDevicesQueryWrapper buildFingerprintLikeRight(String buildFingerprint){
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
    public EmSocDevicesQueryWrapper buildFingerprintIsNull(){
        isNull("build_fingerprint");
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildFingerprintIsNotNull(){
        isNotNull("build_fingerprint");
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildFingerprintIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildFingerprintIn(String... values){
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
    public EmSocDevicesQueryWrapper buildFingerprintNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildFingerprintNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_fingerprint",values);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * 等于 =
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildHostEq(String buildHost){
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
    public EmSocDevicesQueryWrapper buildHostNe(String buildHost){
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
    public EmSocDevicesQueryWrapper buildHostGt(String buildHost){
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
    public EmSocDevicesQueryWrapper buildHostGe(String buildHost){
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
    public EmSocDevicesQueryWrapper buildHostLt(String buildHost){
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
    public EmSocDevicesQueryWrapper buildHostLe(String buildHost){
        if(buildHost!=null){
            le("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * BETWEEN 值1 AND 值2
     * @param buildHostStart       值1
     * @param buildHostEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildHostBetween(String buildHostStart,String buildHostEnd){
        if(buildHostStart!=null && buildHostEnd!=null){
            between("build_host",buildHostStart,buildHostEnd);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildHostStart       值1
     * @param buildHostEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildHostNotBetween(String buildHostStart,String buildHostEnd){
        if(buildHostStart!=null && buildHostEnd!=null){
            notBetween("build_host",buildHostStart,buildHostEnd);
        }
        return this;
     }


    /**
     * <p>build_host</p>
     * LIKE '%值%'
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildHostLike(String buildHost){
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
    public EmSocDevicesQueryWrapper buildHostNotLike(String buildHost){
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
    public EmSocDevicesQueryWrapper buildHostLikeLeft(String buildHost){
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
    public EmSocDevicesQueryWrapper buildHostLikeRight(String buildHost){
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
    public EmSocDevicesQueryWrapper buildHostIsNull(){
        isNull("build_host");
        return this;
    }

    /**
     * <p>build_host</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildHostIsNotNull(){
        isNotNull("build_host");
        return this;
    }

    /**
     * <p>build_host</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildHostIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildHostIn(String... values){
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
    public EmSocDevicesQueryWrapper buildHostNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildHostNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_host",values);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * 等于 =
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildProductEq(String buildProduct){
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
    public EmSocDevicesQueryWrapper buildProductNe(String buildProduct){
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
    public EmSocDevicesQueryWrapper buildProductGt(String buildProduct){
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
    public EmSocDevicesQueryWrapper buildProductGe(String buildProduct){
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
    public EmSocDevicesQueryWrapper buildProductLt(String buildProduct){
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
    public EmSocDevicesQueryWrapper buildProductLe(String buildProduct){
        if(buildProduct!=null){
            le("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * BETWEEN 值1 AND 值2
     * @param buildProductStart       值1
     * @param buildProductEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildProductBetween(String buildProductStart,String buildProductEnd){
        if(buildProductStart!=null && buildProductEnd!=null){
            between("build_product",buildProductStart,buildProductEnd);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildProductStart       值1
     * @param buildProductEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildProductNotBetween(String buildProductStart,String buildProductEnd){
        if(buildProductStart!=null && buildProductEnd!=null){
            notBetween("build_product",buildProductStart,buildProductEnd);
        }
        return this;
     }


    /**
     * <p>整个产品的名称</p>
     * LIKE '%值%'
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildProductLike(String buildProduct){
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
    public EmSocDevicesQueryWrapper buildProductNotLike(String buildProduct){
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
    public EmSocDevicesQueryWrapper buildProductLikeLeft(String buildProduct){
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
    public EmSocDevicesQueryWrapper buildProductLikeRight(String buildProduct){
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
    public EmSocDevicesQueryWrapper buildProductIsNull(){
        isNull("build_product");
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildProductIsNotNull(){
        isNotNull("build_product");
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildProductIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildProductIn(String... values){
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
    public EmSocDevicesQueryWrapper buildProductNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildProductNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_product",values);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * 等于 =
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildHardwareEq(String buildHardware){
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
    public EmSocDevicesQueryWrapper buildHardwareNe(String buildHardware){
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
    public EmSocDevicesQueryWrapper buildHardwareGt(String buildHardware){
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
    public EmSocDevicesQueryWrapper buildHardwareGe(String buildHardware){
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
    public EmSocDevicesQueryWrapper buildHardwareLt(String buildHardware){
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
    public EmSocDevicesQueryWrapper buildHardwareLe(String buildHardware){
        if(buildHardware!=null){
            le("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * BETWEEN 值1 AND 值2
     * @param buildHardwareStart       值1
     * @param buildHardwareEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildHardwareBetween(String buildHardwareStart,String buildHardwareEnd){
        if(buildHardwareStart!=null && buildHardwareEnd!=null){
            between("build_hardware",buildHardwareStart,buildHardwareEnd);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildHardwareStart       值1
     * @param buildHardwareEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildHardwareNotBetween(String buildHardwareStart,String buildHardwareEnd){
        if(buildHardwareStart!=null && buildHardwareEnd!=null){
            notBetween("build_hardware",buildHardwareStart,buildHardwareEnd);
        }
        return this;
     }


    /**
     * <p>硬件名称</p>
     * LIKE '%值%'
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildHardwareLike(String buildHardware){
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
    public EmSocDevicesQueryWrapper buildHardwareNotLike(String buildHardware){
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
    public EmSocDevicesQueryWrapper buildHardwareLikeLeft(String buildHardware){
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
    public EmSocDevicesQueryWrapper buildHardwareLikeRight(String buildHardware){
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
    public EmSocDevicesQueryWrapper buildHardwareIsNull(){
        isNull("build_hardware");
        return this;
    }

    /**
     * <p>硬件名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildHardwareIsNotNull(){
        isNotNull("build_hardware");
        return this;
    }

    /**
     * <p>硬件名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildHardwareIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildHardwareIn(String... values){
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
    public EmSocDevicesQueryWrapper buildHardwareNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildHardwareNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_hardware",values);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * 等于 =
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSerialEq(String buildSerial){
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
    public EmSocDevicesQueryWrapper buildSerialNe(String buildSerial){
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
    public EmSocDevicesQueryWrapper buildSerialGt(String buildSerial){
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
    public EmSocDevicesQueryWrapper buildSerialGe(String buildSerial){
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
    public EmSocDevicesQueryWrapper buildSerialLt(String buildSerial){
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
    public EmSocDevicesQueryWrapper buildSerialLe(String buildSerial){
        if(buildSerial!=null){
            le("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * BETWEEN 值1 AND 值2
     * @param buildSerialStart       值1
     * @param buildSerialEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSerialBetween(String buildSerialStart,String buildSerialEnd){
        if(buildSerialStart!=null && buildSerialEnd!=null){
            between("build_serial",buildSerialStart,buildSerialEnd);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildSerialStart       值1
     * @param buildSerialEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSerialNotBetween(String buildSerialStart,String buildSerialEnd){
        if(buildSerialStart!=null && buildSerialEnd!=null){
            notBetween("build_serial",buildSerialStart,buildSerialEnd);
        }
        return this;
     }


    /**
     * <p>硬件序列</p>
     * LIKE '%值%'
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSerialLike(String buildSerial){
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
    public EmSocDevicesQueryWrapper buildSerialNotLike(String buildSerial){
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
    public EmSocDevicesQueryWrapper buildSerialLikeLeft(String buildSerial){
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
    public EmSocDevicesQueryWrapper buildSerialLikeRight(String buildSerial){
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
    public EmSocDevicesQueryWrapper buildSerialIsNull(){
        isNull("build_serial");
        return this;
    }

    /**
     * <p>硬件序列</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSerialIsNotNull(){
        isNotNull("build_serial");
        return this;
    }

    /**
     * <p>硬件序列</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSerialIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildSerialIn(String... values){
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
    public EmSocDevicesQueryWrapper buildSerialNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildSerialNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_serial",values);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 等于 =
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupportedAbisEq(String buildSupportedAbis){
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
    public EmSocDevicesQueryWrapper buildSupportedAbisNe(String buildSupportedAbis){
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
    public EmSocDevicesQueryWrapper buildSupportedAbisGt(String buildSupportedAbis){
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
    public EmSocDevicesQueryWrapper buildSupportedAbisGe(String buildSupportedAbis){
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
    public EmSocDevicesQueryWrapper buildSupportedAbisLt(String buildSupportedAbis){
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
    public EmSocDevicesQueryWrapper buildSupportedAbisLe(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            le("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN 值1 AND 值2
     * @param buildSupportedAbisStart       值1
     * @param buildSupportedAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupportedAbisBetween(String buildSupportedAbisStart,String buildSupportedAbisEnd){
        if(buildSupportedAbisStart!=null && buildSupportedAbisEnd!=null){
            between("build_supported_abis",buildSupportedAbisStart,buildSupportedAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildSupportedAbisStart       值1
     * @param buildSupportedAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupportedAbisNotBetween(String buildSupportedAbisStart,String buildSupportedAbisEnd){
        if(buildSupportedAbisStart!=null && buildSupportedAbisEnd!=null){
            notBetween("build_supported_abis",buildSupportedAbisStart,buildSupportedAbisEnd);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值%'
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupportedAbisLike(String buildSupportedAbis){
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
    public EmSocDevicesQueryWrapper buildSupportedAbisNotLike(String buildSupportedAbis){
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
    public EmSocDevicesQueryWrapper buildSupportedAbisLikeLeft(String buildSupportedAbis){
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
    public EmSocDevicesQueryWrapper buildSupportedAbisLikeRight(String buildSupportedAbis){
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
    public EmSocDevicesQueryWrapper buildSupportedAbisIsNull(){
        isNull("build_supported_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupportedAbisIsNotNull(){
        isNotNull("build_supported_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupportedAbisIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildSupportedAbisIn(String... values){
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
    public EmSocDevicesQueryWrapper buildSupportedAbisNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildSupportedAbisNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_supported_abis",values);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 等于 =
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupported32BitAbisEq(String buildSupported32BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported32BitAbisNe(String buildSupported32BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported32BitAbisGt(String buildSupported32BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported32BitAbisGe(String buildSupported32BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported32BitAbisLt(String buildSupported32BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported32BitAbisLe(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            le("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN 值1 AND 值2
     * @param buildSupported32BitAbisStart       值1
     * @param buildSupported32BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupported32BitAbisBetween(String buildSupported32BitAbisStart,String buildSupported32BitAbisEnd){
        if(buildSupported32BitAbisStart!=null && buildSupported32BitAbisEnd!=null){
            between("build_supported_32_bit_abis",buildSupported32BitAbisStart,buildSupported32BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildSupported32BitAbisStart       值1
     * @param buildSupported32BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupported32BitAbisNotBetween(String buildSupported32BitAbisStart,String buildSupported32BitAbisEnd){
        if(buildSupported32BitAbisStart!=null && buildSupported32BitAbisEnd!=null){
            notBetween("build_supported_32_bit_abis",buildSupported32BitAbisStart,buildSupported32BitAbisEnd);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值%'
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupported32BitAbisLike(String buildSupported32BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported32BitAbisNotLike(String buildSupported32BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported32BitAbisLikeLeft(String buildSupported32BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported32BitAbisLikeRight(String buildSupported32BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported32BitAbisIsNull(){
        isNull("build_supported_32_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupported32BitAbisIsNotNull(){
        isNotNull("build_supported_32_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupported32BitAbisIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildSupported32BitAbisIn(String... values){
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
    public EmSocDevicesQueryWrapper buildSupported32BitAbisNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildSupported32BitAbisNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_supported_32_bit_abis",values);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 等于 =
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupported64BitAbisEq(String buildSupported64BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported64BitAbisNe(String buildSupported64BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported64BitAbisGt(String buildSupported64BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported64BitAbisGe(String buildSupported64BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported64BitAbisLt(String buildSupported64BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported64BitAbisLe(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            le("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN 值1 AND 值2
     * @param buildSupported64BitAbisStart       值1
     * @param buildSupported64BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupported64BitAbisBetween(String buildSupported64BitAbisStart,String buildSupported64BitAbisEnd){
        if(buildSupported64BitAbisStart!=null && buildSupported64BitAbisEnd!=null){
            between("build_supported_64_bit_abis",buildSupported64BitAbisStart,buildSupported64BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildSupported64BitAbisStart       值1
     * @param buildSupported64BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupported64BitAbisNotBetween(String buildSupported64BitAbisStart,String buildSupported64BitAbisEnd){
        if(buildSupported64BitAbisStart!=null && buildSupported64BitAbisEnd!=null){
            notBetween("build_supported_64_bit_abis",buildSupported64BitAbisStart,buildSupported64BitAbisEnd);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值%'
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupported64BitAbisLike(String buildSupported64BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported64BitAbisNotLike(String buildSupported64BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported64BitAbisLikeLeft(String buildSupported64BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported64BitAbisLikeRight(String buildSupported64BitAbis){
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
    public EmSocDevicesQueryWrapper buildSupported64BitAbisIsNull(){
        isNull("build_supported_64_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupported64BitAbisIsNotNull(){
        isNotNull("build_supported_64_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildSupported64BitAbisIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildSupported64BitAbisIn(String... values){
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
    public EmSocDevicesQueryWrapper buildSupported64BitAbisNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildSupported64BitAbisNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_supported_64_bit_abis",values);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * 等于 =
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionIncrementalEq(String buildVersionIncremental){
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
    public EmSocDevicesQueryWrapper buildVersionIncrementalNe(String buildVersionIncremental){
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
    public EmSocDevicesQueryWrapper buildVersionIncrementalGt(String buildVersionIncremental){
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
    public EmSocDevicesQueryWrapper buildVersionIncrementalGe(String buildVersionIncremental){
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
    public EmSocDevicesQueryWrapper buildVersionIncrementalLt(String buildVersionIncremental){
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
    public EmSocDevicesQueryWrapper buildVersionIncrementalLe(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            le("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * BETWEEN 值1 AND 值2
     * @param buildVersionIncrementalStart       值1
     * @param buildVersionIncrementalEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionIncrementalBetween(String buildVersionIncrementalStart,String buildVersionIncrementalEnd){
        if(buildVersionIncrementalStart!=null && buildVersionIncrementalEnd!=null){
            between("build_version_incremental",buildVersionIncrementalStart,buildVersionIncrementalEnd);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildVersionIncrementalStart       值1
     * @param buildVersionIncrementalEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionIncrementalNotBetween(String buildVersionIncrementalStart,String buildVersionIncrementalEnd){
        if(buildVersionIncrementalStart!=null && buildVersionIncrementalEnd!=null){
            notBetween("build_version_incremental",buildVersionIncrementalStart,buildVersionIncrementalEnd);
        }
        return this;
     }


    /**
     * <p>build_version_incremental</p>
     * LIKE '%值%'
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionIncrementalLike(String buildVersionIncremental){
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
    public EmSocDevicesQueryWrapper buildVersionIncrementalNotLike(String buildVersionIncremental){
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
    public EmSocDevicesQueryWrapper buildVersionIncrementalLikeLeft(String buildVersionIncremental){
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
    public EmSocDevicesQueryWrapper buildVersionIncrementalLikeRight(String buildVersionIncremental){
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
    public EmSocDevicesQueryWrapper buildVersionIncrementalIsNull(){
        isNull("build_version_incremental");
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionIncrementalIsNotNull(){
        isNotNull("build_version_incremental");
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionIncrementalIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildVersionIncrementalIn(String... values){
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
    public EmSocDevicesQueryWrapper buildVersionIncrementalNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildVersionIncrementalNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_incremental",values);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 等于 =
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionReleaseEq(String buildVersionRelease){
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
    public EmSocDevicesQueryWrapper buildVersionReleaseNe(String buildVersionRelease){
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
    public EmSocDevicesQueryWrapper buildVersionReleaseGt(String buildVersionRelease){
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
    public EmSocDevicesQueryWrapper buildVersionReleaseGe(String buildVersionRelease){
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
    public EmSocDevicesQueryWrapper buildVersionReleaseLt(String buildVersionRelease){
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
    public EmSocDevicesQueryWrapper buildVersionReleaseLe(String buildVersionRelease){
        if(buildVersionRelease!=null){
            le("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * BETWEEN 值1 AND 值2
     * @param buildVersionReleaseStart       值1
     * @param buildVersionReleaseEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionReleaseBetween(String buildVersionReleaseStart,String buildVersionReleaseEnd){
        if(buildVersionReleaseStart!=null && buildVersionReleaseEnd!=null){
            between("build_version_release",buildVersionReleaseStart,buildVersionReleaseEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildVersionReleaseStart       值1
     * @param buildVersionReleaseEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionReleaseNotBetween(String buildVersionReleaseStart,String buildVersionReleaseEnd){
        if(buildVersionReleaseStart!=null && buildVersionReleaseEnd!=null){
            notBetween("build_version_release",buildVersionReleaseStart,buildVersionReleaseEnd);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值%'
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionReleaseLike(String buildVersionRelease){
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
    public EmSocDevicesQueryWrapper buildVersionReleaseNotLike(String buildVersionRelease){
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
    public EmSocDevicesQueryWrapper buildVersionReleaseLikeLeft(String buildVersionRelease){
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
    public EmSocDevicesQueryWrapper buildVersionReleaseLikeRight(String buildVersionRelease){
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
    public EmSocDevicesQueryWrapper buildVersionReleaseIsNull(){
        isNull("build_version_release");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionReleaseIsNotNull(){
        isNotNull("build_version_release");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionReleaseIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildVersionReleaseIn(String... values){
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
    public EmSocDevicesQueryWrapper buildVersionReleaseNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildVersionReleaseNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_release",values);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * 等于 =
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionSdkEq(String buildVersionSdk){
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
    public EmSocDevicesQueryWrapper buildVersionSdkNe(String buildVersionSdk){
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
    public EmSocDevicesQueryWrapper buildVersionSdkGt(String buildVersionSdk){
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
    public EmSocDevicesQueryWrapper buildVersionSdkGe(String buildVersionSdk){
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
    public EmSocDevicesQueryWrapper buildVersionSdkLt(String buildVersionSdk){
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
    public EmSocDevicesQueryWrapper buildVersionSdkLe(String buildVersionSdk){
        if(buildVersionSdk!=null){
            le("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * BETWEEN 值1 AND 值2
     * @param buildVersionSdkStart       值1
     * @param buildVersionSdkEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionSdkBetween(String buildVersionSdkStart,String buildVersionSdkEnd){
        if(buildVersionSdkStart!=null && buildVersionSdkEnd!=null){
            between("build_version_sdk",buildVersionSdkStart,buildVersionSdkEnd);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildVersionSdkStart       值1
     * @param buildVersionSdkEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionSdkNotBetween(String buildVersionSdkStart,String buildVersionSdkEnd){
        if(buildVersionSdkStart!=null && buildVersionSdkEnd!=null){
            notBetween("build_version_sdk",buildVersionSdkStart,buildVersionSdkEnd);
        }
        return this;
     }


    /**
     * <p>build_version_sdk</p>
     * LIKE '%值%'
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionSdkLike(String buildVersionSdk){
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
    public EmSocDevicesQueryWrapper buildVersionSdkNotLike(String buildVersionSdk){
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
    public EmSocDevicesQueryWrapper buildVersionSdkLikeLeft(String buildVersionSdk){
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
    public EmSocDevicesQueryWrapper buildVersionSdkLikeRight(String buildVersionSdk){
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
    public EmSocDevicesQueryWrapper buildVersionSdkIsNull(){
        isNull("build_version_sdk");
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionSdkIsNotNull(){
        isNotNull("build_version_sdk");
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionSdkIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildVersionSdkIn(String... values){
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
    public EmSocDevicesQueryWrapper buildVersionSdkNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildVersionSdkNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_sdk",values);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * 等于 =
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionSdkintEq(String buildVersionSdkint){
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
    public EmSocDevicesQueryWrapper buildVersionSdkintNe(String buildVersionSdkint){
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
    public EmSocDevicesQueryWrapper buildVersionSdkintGt(String buildVersionSdkint){
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
    public EmSocDevicesQueryWrapper buildVersionSdkintGe(String buildVersionSdkint){
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
    public EmSocDevicesQueryWrapper buildVersionSdkintLt(String buildVersionSdkint){
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
    public EmSocDevicesQueryWrapper buildVersionSdkintLe(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            le("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * BETWEEN 值1 AND 值2
     * @param buildVersionSdkintStart       值1
     * @param buildVersionSdkintEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionSdkintBetween(String buildVersionSdkintStart,String buildVersionSdkintEnd){
        if(buildVersionSdkintStart!=null && buildVersionSdkintEnd!=null){
            between("build_version_sdkint",buildVersionSdkintStart,buildVersionSdkintEnd);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildVersionSdkintStart       值1
     * @param buildVersionSdkintEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionSdkintNotBetween(String buildVersionSdkintStart,String buildVersionSdkintEnd){
        if(buildVersionSdkintStart!=null && buildVersionSdkintEnd!=null){
            notBetween("build_version_sdkint",buildVersionSdkintStart,buildVersionSdkintEnd);
        }
        return this;
     }


    /**
     * <p>SDK版本</p>
     * LIKE '%值%'
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionSdkintLike(String buildVersionSdkint){
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
    public EmSocDevicesQueryWrapper buildVersionSdkintNotLike(String buildVersionSdkint){
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
    public EmSocDevicesQueryWrapper buildVersionSdkintLikeLeft(String buildVersionSdkint){
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
    public EmSocDevicesQueryWrapper buildVersionSdkintLikeRight(String buildVersionSdkint){
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
    public EmSocDevicesQueryWrapper buildVersionSdkintIsNull(){
        isNull("build_version_sdkint");
        return this;
    }

    /**
     * <p>SDK版本</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionSdkintIsNotNull(){
        isNotNull("build_version_sdkint");
        return this;
    }

    /**
     * <p>SDK版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionSdkintIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildVersionSdkintIn(String... values){
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
    public EmSocDevicesQueryWrapper buildVersionSdkintNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildVersionSdkintNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_sdkint",values);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * 等于 =
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionCodenameEq(String buildVersionCodename){
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
    public EmSocDevicesQueryWrapper buildVersionCodenameNe(String buildVersionCodename){
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
    public EmSocDevicesQueryWrapper buildVersionCodenameGt(String buildVersionCodename){
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
    public EmSocDevicesQueryWrapper buildVersionCodenameGe(String buildVersionCodename){
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
    public EmSocDevicesQueryWrapper buildVersionCodenameLt(String buildVersionCodename){
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
    public EmSocDevicesQueryWrapper buildVersionCodenameLe(String buildVersionCodename){
        if(buildVersionCodename!=null){
            le("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * BETWEEN 值1 AND 值2
     * @param buildVersionCodenameStart       值1
     * @param buildVersionCodenameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionCodenameBetween(String buildVersionCodenameStart,String buildVersionCodenameEnd){
        if(buildVersionCodenameStart!=null && buildVersionCodenameEnd!=null){
            between("build_version_codename",buildVersionCodenameStart,buildVersionCodenameEnd);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildVersionCodenameStart       值1
     * @param buildVersionCodenameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionCodenameNotBetween(String buildVersionCodenameStart,String buildVersionCodenameEnd){
        if(buildVersionCodenameStart!=null && buildVersionCodenameEnd!=null){
            notBetween("build_version_codename",buildVersionCodenameStart,buildVersionCodenameEnd);
        }
        return this;
     }


    /**
     * <p>build_version_codename</p>
     * LIKE '%值%'
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionCodenameLike(String buildVersionCodename){
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
    public EmSocDevicesQueryWrapper buildVersionCodenameNotLike(String buildVersionCodename){
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
    public EmSocDevicesQueryWrapper buildVersionCodenameLikeLeft(String buildVersionCodename){
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
    public EmSocDevicesQueryWrapper buildVersionCodenameLikeRight(String buildVersionCodename){
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
    public EmSocDevicesQueryWrapper buildVersionCodenameIsNull(){
        isNull("build_version_codename");
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionCodenameIsNotNull(){
        isNotNull("build_version_codename");
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildVersionCodenameIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildVersionCodenameIn(String... values){
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
    public EmSocDevicesQueryWrapper buildVersionCodenameNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildVersionCodenameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_codename",values);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * 等于 =
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildTypeEq(String buildType){
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
    public EmSocDevicesQueryWrapper buildTypeNe(String buildType){
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
    public EmSocDevicesQueryWrapper buildTypeGt(String buildType){
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
    public EmSocDevicesQueryWrapper buildTypeGe(String buildType){
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
    public EmSocDevicesQueryWrapper buildTypeLt(String buildType){
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
    public EmSocDevicesQueryWrapper buildTypeLe(String buildType){
        if(buildType!=null){
            le("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * BETWEEN 值1 AND 值2
     * @param buildTypeStart       值1
     * @param buildTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildTypeBetween(String buildTypeStart,String buildTypeEnd){
        if(buildTypeStart!=null && buildTypeEnd!=null){
            between("build_type",buildTypeStart,buildTypeEnd);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildTypeStart       值1
     * @param buildTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildTypeNotBetween(String buildTypeStart,String buildTypeEnd){
        if(buildTypeStart!=null && buildTypeEnd!=null){
            notBetween("build_type",buildTypeStart,buildTypeEnd);
        }
        return this;
     }


    /**
     * <p>build_type</p>
     * LIKE '%值%'
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildTypeLike(String buildType){
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
    public EmSocDevicesQueryWrapper buildTypeNotLike(String buildType){
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
    public EmSocDevicesQueryWrapper buildTypeLikeLeft(String buildType){
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
    public EmSocDevicesQueryWrapper buildTypeLikeRight(String buildType){
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
    public EmSocDevicesQueryWrapper buildTypeIsNull(){
        isNull("build_type");
        return this;
    }

    /**
     * <p>build_type</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildTypeIsNotNull(){
        isNotNull("build_type");
        return this;
    }

    /**
     * <p>build_type</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildTypeIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildTypeIn(String... values){
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
    public EmSocDevicesQueryWrapper buildTypeNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper buildTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_type",values);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * 等于 =
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildApiLevelEq(Integer buildApiLevel){
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
    public EmSocDevicesQueryWrapper buildApiLevelNe(Integer buildApiLevel){
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
    public EmSocDevicesQueryWrapper buildApiLevelGt(Integer buildApiLevel){
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
    public EmSocDevicesQueryWrapper buildApiLevelGe(Integer buildApiLevel){
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
    public EmSocDevicesQueryWrapper buildApiLevelLt(Integer buildApiLevel){
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
    public EmSocDevicesQueryWrapper buildApiLevelLe(Integer buildApiLevel){
        if(buildApiLevel!=null){
            le("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * BETWEEN 值1 AND 值2
     * @param buildApiLevelStart       值1
     * @param buildApiLevelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildApiLevelBetween(Integer buildApiLevelStart,Integer buildApiLevelEnd){
        if(buildApiLevelStart!=null && buildApiLevelEnd!=null){
            between("build_api_level",buildApiLevelStart,buildApiLevelEnd);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildApiLevelStart       值1
     * @param buildApiLevelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper buildApiLevelNotBetween(Integer buildApiLevelStart,Integer buildApiLevelEnd){
        if(buildApiLevelStart!=null && buildApiLevelEnd!=null){
            notBetween("build_api_level",buildApiLevelStart,buildApiLevelEnd);
        }
        return this;
     }


    /**
     * <p>build_api_level</p>
     * LIKE '%值%'
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesQueryWrapper buildApiLevelLike(Integer buildApiLevel){
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
    public EmSocDevicesQueryWrapper buildApiLevelNotLike(Integer buildApiLevel){
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
    public EmSocDevicesQueryWrapper buildApiLevelLikeLeft(Integer buildApiLevel){
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
    public EmSocDevicesQueryWrapper buildApiLevelLikeRight(Integer buildApiLevel){
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
    public EmSocDevicesQueryWrapper buildApiLevelIsNull(){
        isNull("build_api_level");
        return this;
    }

    /**
     * <p>build_api_level</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper buildApiLevelIsNotNull(){
        isNotNull("build_api_level");
        return this;
    }

    /**
     * <p>build_api_level</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper buildApiLevelIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper buildApiLevelIn(Integer... values){
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
    public EmSocDevicesQueryWrapper buildApiLevelNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper buildApiLevelNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("build_api_level",values);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 等于 =
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesQueryWrapper andoridIdEq(String andoridId){
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
    public EmSocDevicesQueryWrapper andoridIdNe(String andoridId){
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
    public EmSocDevicesQueryWrapper andoridIdGt(String andoridId){
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
    public EmSocDevicesQueryWrapper andoridIdGe(String andoridId){
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
    public EmSocDevicesQueryWrapper andoridIdLt(String andoridId){
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
    public EmSocDevicesQueryWrapper andoridIdLe(String andoridId){
        if(andoridId!=null){
            le("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * BETWEEN 值1 AND 值2
     * @param andoridIdStart       值1
     * @param andoridIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper andoridIdBetween(String andoridIdStart,String andoridIdEnd){
        if(andoridIdStart!=null && andoridIdEnd!=null){
            between("andorid_id",andoridIdStart,andoridIdEnd);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param andoridIdStart       值1
     * @param andoridIdEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper andoridIdNotBetween(String andoridIdStart,String andoridIdEnd){
        if(andoridIdStart!=null && andoridIdEnd!=null){
            notBetween("andorid_id",andoridIdStart,andoridIdEnd);
        }
        return this;
     }


    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '%值%'
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesQueryWrapper andoridIdLike(String andoridId){
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
    public EmSocDevicesQueryWrapper andoridIdNotLike(String andoridId){
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
    public EmSocDevicesQueryWrapper andoridIdLikeLeft(String andoridId){
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
    public EmSocDevicesQueryWrapper andoridIdLikeRight(String andoridId){
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
    public EmSocDevicesQueryWrapper andoridIdIsNull(){
        isNull("andorid_id");
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper andoridIdIsNotNull(){
        isNotNull("andorid_id");
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper andoridIdIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper andoridIdIn(String... values){
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
    public EmSocDevicesQueryWrapper andoridIdNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper andoridIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("andorid_id",values);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * 等于 =
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesQueryWrapper osArchEq(String osArch){
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
    public EmSocDevicesQueryWrapper osArchNe(String osArch){
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
    public EmSocDevicesQueryWrapper osArchGt(String osArch){
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
    public EmSocDevicesQueryWrapper osArchGe(String osArch){
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
    public EmSocDevicesQueryWrapper osArchLt(String osArch){
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
    public EmSocDevicesQueryWrapper osArchLe(String osArch){
        if(osArch!=null){
            le("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * BETWEEN 值1 AND 值2
     * @param osArchStart       值1
     * @param osArchEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper osArchBetween(String osArchStart,String osArchEnd){
        if(osArchStart!=null && osArchEnd!=null){
            between("os_arch",osArchStart,osArchEnd);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * NOT BETWEEN 值1 AND 值2
     * @param osArchStart       值1
     * @param osArchEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper osArchNotBetween(String osArchStart,String osArchEnd){
        if(osArchStart!=null && osArchEnd!=null){
            notBetween("os_arch",osArchStart,osArchEnd);
        }
        return this;
     }


    /**
     * <p>os_arch</p>
     * LIKE '%值%'
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesQueryWrapper osArchLike(String osArch){
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
    public EmSocDevicesQueryWrapper osArchNotLike(String osArch){
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
    public EmSocDevicesQueryWrapper osArchLikeLeft(String osArch){
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
    public EmSocDevicesQueryWrapper osArchLikeRight(String osArch){
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
    public EmSocDevicesQueryWrapper osArchIsNull(){
        isNull("os_arch");
        return this;
    }

    /**
     * <p>os_arch</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper osArchIsNotNull(){
        isNotNull("os_arch");
        return this;
    }

    /**
     * <p>os_arch</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper osArchIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper osArchIn(String... values){
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
    public EmSocDevicesQueryWrapper osArchNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper osArchNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("os_arch",values);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 等于 =
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesQueryWrapper phoneTypeEq(String phoneType){
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
    public EmSocDevicesQueryWrapper phoneTypeNe(String phoneType){
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
    public EmSocDevicesQueryWrapper phoneTypeGt(String phoneType){
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
    public EmSocDevicesQueryWrapper phoneTypeGe(String phoneType){
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
    public EmSocDevicesQueryWrapper phoneTypeLt(String phoneType){
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
    public EmSocDevicesQueryWrapper phoneTypeLe(String phoneType){
        if(phoneType!=null){
            le("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * BETWEEN 值1 AND 值2
     * @param phoneTypeStart       值1
     * @param phoneTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper phoneTypeBetween(String phoneTypeStart,String phoneTypeEnd){
        if(phoneTypeStart!=null && phoneTypeEnd!=null){
            between("phone_type",phoneTypeStart,phoneTypeEnd);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param phoneTypeStart       值1
     * @param phoneTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper phoneTypeNotBetween(String phoneTypeStart,String phoneTypeEnd){
        if(phoneTypeStart!=null && phoneTypeEnd!=null){
            notBetween("phone_type",phoneTypeStart,phoneTypeEnd);
        }
        return this;
     }


    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '%值%'
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesQueryWrapper phoneTypeLike(String phoneType){
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
    public EmSocDevicesQueryWrapper phoneTypeNotLike(String phoneType){
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
    public EmSocDevicesQueryWrapper phoneTypeLikeLeft(String phoneType){
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
    public EmSocDevicesQueryWrapper phoneTypeLikeRight(String phoneType){
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
    public EmSocDevicesQueryWrapper phoneTypeIsNull(){
        isNull("phone_type");
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper phoneTypeIsNotNull(){
        isNotNull("phone_type");
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper phoneTypeIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper phoneTypeIn(String... values){
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
    public EmSocDevicesQueryWrapper phoneTypeNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper phoneTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_type",values);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * 等于 =
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesQueryWrapper osVersionEq(String osVersion){
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
    public EmSocDevicesQueryWrapper osVersionNe(String osVersion){
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
    public EmSocDevicesQueryWrapper osVersionGt(String osVersion){
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
    public EmSocDevicesQueryWrapper osVersionGe(String osVersion){
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
    public EmSocDevicesQueryWrapper osVersionLt(String osVersion){
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
    public EmSocDevicesQueryWrapper osVersionLe(String osVersion){
        if(osVersion!=null){
            le("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * BETWEEN 值1 AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper osVersionBetween(String osVersionStart,String osVersionEnd){
        if(osVersionStart!=null && osVersionEnd!=null){
            between("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * NOT BETWEEN 值1 AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper osVersionNotBetween(String osVersionStart,String osVersionEnd){
        if(osVersionStart!=null && osVersionEnd!=null){
            notBetween("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }


    /**
     * <p>os_version</p>
     * LIKE '%值%'
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesQueryWrapper osVersionLike(String osVersion){
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
    public EmSocDevicesQueryWrapper osVersionNotLike(String osVersion){
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
    public EmSocDevicesQueryWrapper osVersionLikeLeft(String osVersion){
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
    public EmSocDevicesQueryWrapper osVersionLikeRight(String osVersion){
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
    public EmSocDevicesQueryWrapper osVersionIsNull(){
        isNull("os_version");
        return this;
    }

    /**
     * <p>os_version</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper osVersionIsNotNull(){
        isNotNull("os_version");
        return this;
    }

    /**
     * <p>os_version</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper osVersionIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper osVersionIn(String... values){
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
    public EmSocDevicesQueryWrapper osVersionNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper osVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("os_version",values);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * 等于 =
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesQueryWrapper simSerialNumberEq(String simSerialNumber){
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
    public EmSocDevicesQueryWrapper simSerialNumberNe(String simSerialNumber){
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
    public EmSocDevicesQueryWrapper simSerialNumberGt(String simSerialNumber){
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
    public EmSocDevicesQueryWrapper simSerialNumberGe(String simSerialNumber){
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
    public EmSocDevicesQueryWrapper simSerialNumberLt(String simSerialNumber){
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
    public EmSocDevicesQueryWrapper simSerialNumberLe(String simSerialNumber){
        if(simSerialNumber!=null){
            le("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * BETWEEN 值1 AND 值2
     * @param simSerialNumberStart       值1
     * @param simSerialNumberEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper simSerialNumberBetween(String simSerialNumberStart,String simSerialNumberEnd){
        if(simSerialNumberStart!=null && simSerialNumberEnd!=null){
            between("sim_serial_number",simSerialNumberStart,simSerialNumberEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param simSerialNumberStart       值1
     * @param simSerialNumberEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper simSerialNumberNotBetween(String simSerialNumberStart,String simSerialNumberEnd){
        if(simSerialNumberStart!=null && simSerialNumberEnd!=null){
            notBetween("sim_serial_number",simSerialNumberStart,simSerialNumberEnd);
        }
        return this;
     }


    /**
     * <p>SIM卡的序列号</p>
     * LIKE '%值%'
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesQueryWrapper simSerialNumberLike(String simSerialNumber){
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
    public EmSocDevicesQueryWrapper simSerialNumberNotLike(String simSerialNumber){
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
    public EmSocDevicesQueryWrapper simSerialNumberLikeLeft(String simSerialNumber){
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
    public EmSocDevicesQueryWrapper simSerialNumberLikeRight(String simSerialNumber){
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
    public EmSocDevicesQueryWrapper simSerialNumberIsNull(){
        isNull("sim_serial_number");
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper simSerialNumberIsNotNull(){
        isNotNull("sim_serial_number");
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper simSerialNumberIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper simSerialNumberIn(String... values){
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
    public EmSocDevicesQueryWrapper simSerialNumberNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper simSerialNumberNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("sim_serial_number",values);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * 等于 =
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesQueryWrapper networkOperatorEq(String networkOperator){
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
    public EmSocDevicesQueryWrapper networkOperatorNe(String networkOperator){
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
    public EmSocDevicesQueryWrapper networkOperatorGt(String networkOperator){
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
    public EmSocDevicesQueryWrapper networkOperatorGe(String networkOperator){
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
    public EmSocDevicesQueryWrapper networkOperatorLt(String networkOperator){
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
    public EmSocDevicesQueryWrapper networkOperatorLe(String networkOperator){
        if(networkOperator!=null){
            le("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * BETWEEN 值1 AND 值2
     * @param networkOperatorStart       值1
     * @param networkOperatorEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper networkOperatorBetween(String networkOperatorStart,String networkOperatorEnd){
        if(networkOperatorStart!=null && networkOperatorEnd!=null){
            between("network_operator",networkOperatorStart,networkOperatorEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * NOT BETWEEN 值1 AND 值2
     * @param networkOperatorStart       值1
     * @param networkOperatorEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper networkOperatorNotBetween(String networkOperatorStart,String networkOperatorEnd){
        if(networkOperatorStart!=null && networkOperatorEnd!=null){
            notBetween("network_operator",networkOperatorStart,networkOperatorEnd);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商</p>
     * LIKE '%值%'
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesQueryWrapper networkOperatorLike(String networkOperator){
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
    public EmSocDevicesQueryWrapper networkOperatorNotLike(String networkOperator){
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
    public EmSocDevicesQueryWrapper networkOperatorLikeLeft(String networkOperator){
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
    public EmSocDevicesQueryWrapper networkOperatorLikeRight(String networkOperator){
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
    public EmSocDevicesQueryWrapper networkOperatorIsNull(){
        isNull("network_operator");
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper networkOperatorIsNotNull(){
        isNotNull("network_operator");
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper networkOperatorIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper networkOperatorIn(String... values){
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
    public EmSocDevicesQueryWrapper networkOperatorNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper networkOperatorNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("network_operator",values);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * 等于 =
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesQueryWrapper networkOperatorNameEq(String networkOperatorName){
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
    public EmSocDevicesQueryWrapper networkOperatorNameNe(String networkOperatorName){
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
    public EmSocDevicesQueryWrapper networkOperatorNameGt(String networkOperatorName){
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
    public EmSocDevicesQueryWrapper networkOperatorNameGe(String networkOperatorName){
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
    public EmSocDevicesQueryWrapper networkOperatorNameLt(String networkOperatorName){
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
    public EmSocDevicesQueryWrapper networkOperatorNameLe(String networkOperatorName){
        if(networkOperatorName!=null){
            le("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * BETWEEN 值1 AND 值2
     * @param networkOperatorNameStart       值1
     * @param networkOperatorNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper networkOperatorNameBetween(String networkOperatorNameStart,String networkOperatorNameEnd){
        if(networkOperatorNameStart!=null && networkOperatorNameEnd!=null){
            between("network_operator_name",networkOperatorNameStart,networkOperatorNameEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param networkOperatorNameStart       值1
     * @param networkOperatorNameEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper networkOperatorNameNotBetween(String networkOperatorNameStart,String networkOperatorNameEnd){
        if(networkOperatorNameStart!=null && networkOperatorNameEnd!=null){
            notBetween("network_operator_name",networkOperatorNameStart,networkOperatorNameEnd);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '%值%'
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesQueryWrapper networkOperatorNameLike(String networkOperatorName){
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
    public EmSocDevicesQueryWrapper networkOperatorNameNotLike(String networkOperatorName){
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
    public EmSocDevicesQueryWrapper networkOperatorNameLikeLeft(String networkOperatorName){
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
    public EmSocDevicesQueryWrapper networkOperatorNameLikeRight(String networkOperatorName){
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
    public EmSocDevicesQueryWrapper networkOperatorNameIsNull(){
        isNull("network_operator_name");
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper networkOperatorNameIsNotNull(){
        isNotNull("network_operator_name");
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper networkOperatorNameIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper networkOperatorNameIn(String... values){
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
    public EmSocDevicesQueryWrapper networkOperatorNameNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper networkOperatorNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("network_operator_name",values);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * 等于 =
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesQueryWrapper uimodeEq(String uimode){
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
    public EmSocDevicesQueryWrapper uimodeNe(String uimode){
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
    public EmSocDevicesQueryWrapper uimodeGt(String uimode){
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
    public EmSocDevicesQueryWrapper uimodeGe(String uimode){
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
    public EmSocDevicesQueryWrapper uimodeLt(String uimode){
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
    public EmSocDevicesQueryWrapper uimodeLe(String uimode){
        if(uimode!=null){
            le("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * BETWEEN 值1 AND 值2
     * @param uimodeStart       值1
     * @param uimodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper uimodeBetween(String uimodeStart,String uimodeEnd){
        if(uimodeStart!=null && uimodeEnd!=null){
            between("uimode",uimodeStart,uimodeEnd);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * NOT BETWEEN 值1 AND 值2
     * @param uimodeStart       值1
     * @param uimodeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper uimodeNotBetween(String uimodeStart,String uimodeEnd){
        if(uimodeStart!=null && uimodeEnd!=null){
            notBetween("uimode",uimodeStart,uimodeEnd);
        }
        return this;
     }


    /**
     * <p>UI mode</p>
     * LIKE '%值%'
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesQueryWrapper uimodeLike(String uimode){
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
    public EmSocDevicesQueryWrapper uimodeNotLike(String uimode){
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
    public EmSocDevicesQueryWrapper uimodeLikeLeft(String uimode){
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
    public EmSocDevicesQueryWrapper uimodeLikeRight(String uimode){
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
    public EmSocDevicesQueryWrapper uimodeIsNull(){
        isNull("uimode");
        return this;
    }

    /**
     * <p>UI mode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper uimodeIsNotNull(){
        isNotNull("uimode");
        return this;
    }

    /**
     * <p>UI mode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper uimodeIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper uimodeIn(String... values){
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
    public EmSocDevicesQueryWrapper uimodeNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper uimodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("uimode",values);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * 等于 =
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesQueryWrapper resolutionEq(String resolution){
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
    public EmSocDevicesQueryWrapper resolutionNe(String resolution){
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
    public EmSocDevicesQueryWrapper resolutionGt(String resolution){
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
    public EmSocDevicesQueryWrapper resolutionGe(String resolution){
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
    public EmSocDevicesQueryWrapper resolutionLt(String resolution){
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
    public EmSocDevicesQueryWrapper resolutionLe(String resolution){
        if(resolution!=null){
            le("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * BETWEEN 值1 AND 值2
     * @param resolutionStart       值1
     * @param resolutionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper resolutionBetween(String resolutionStart,String resolutionEnd){
        if(resolutionStart!=null && resolutionEnd!=null){
            between("resolution",resolutionStart,resolutionEnd);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * NOT BETWEEN 值1 AND 值2
     * @param resolutionStart       值1
     * @param resolutionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper resolutionNotBetween(String resolutionStart,String resolutionEnd){
        if(resolutionStart!=null && resolutionEnd!=null){
            notBetween("resolution",resolutionStart,resolutionEnd);
        }
        return this;
     }


    /**
     * <p>resolution</p>
     * LIKE '%值%'
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesQueryWrapper resolutionLike(String resolution){
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
    public EmSocDevicesQueryWrapper resolutionNotLike(String resolution){
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
    public EmSocDevicesQueryWrapper resolutionLikeLeft(String resolution){
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
    public EmSocDevicesQueryWrapper resolutionLikeRight(String resolution){
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
    public EmSocDevicesQueryWrapper resolutionIsNull(){
        isNull("resolution");
        return this;
    }

    /**
     * <p>resolution</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper resolutionIsNotNull(){
        isNotNull("resolution");
        return this;
    }

    /**
     * <p>resolution</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper resolutionIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper resolutionIn(String... values){
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
    public EmSocDevicesQueryWrapper resolutionNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper resolutionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("resolution",values);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * 等于 =
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesQueryWrapper totalMemEq(Long totalMem){
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
    public EmSocDevicesQueryWrapper totalMemNe(Long totalMem){
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
    public EmSocDevicesQueryWrapper totalMemGt(Long totalMem){
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
    public EmSocDevicesQueryWrapper totalMemGe(Long totalMem){
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
    public EmSocDevicesQueryWrapper totalMemLt(Long totalMem){
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
    public EmSocDevicesQueryWrapper totalMemLe(Long totalMem){
        if(totalMem!=null){
            le("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * BETWEEN 值1 AND 值2
     * @param totalMemStart       值1
     * @param totalMemEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper totalMemBetween(Long totalMemStart,Long totalMemEnd){
        if(totalMemStart!=null && totalMemEnd!=null){
            between("total_mem",totalMemStart,totalMemEnd);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * NOT BETWEEN 值1 AND 值2
     * @param totalMemStart       值1
     * @param totalMemEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper totalMemNotBetween(Long totalMemStart,Long totalMemEnd){
        if(totalMemStart!=null && totalMemEnd!=null){
            notBetween("total_mem",totalMemStart,totalMemEnd);
        }
        return this;
     }


    /**
     * <p>totalMem</p>
     * LIKE '%值%'
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesQueryWrapper totalMemLike(Long totalMem){
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
    public EmSocDevicesQueryWrapper totalMemNotLike(Long totalMem){
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
    public EmSocDevicesQueryWrapper totalMemLikeLeft(Long totalMem){
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
    public EmSocDevicesQueryWrapper totalMemLikeRight(Long totalMem){
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
    public EmSocDevicesQueryWrapper totalMemIsNull(){
        isNull("total_mem");
        return this;
    }

    /**
     * <p>totalMem</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper totalMemIsNotNull(){
        isNotNull("total_mem");
        return this;
    }

    /**
     * <p>totalMem</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper totalMemIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper totalMemIn(Long... values){
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
    public EmSocDevicesQueryWrapper totalMemNotIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper totalMemNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("total_mem",values);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * 等于 =
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesQueryWrapper availMemEq(Long availMem){
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
    public EmSocDevicesQueryWrapper availMemNe(Long availMem){
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
    public EmSocDevicesQueryWrapper availMemGt(Long availMem){
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
    public EmSocDevicesQueryWrapper availMemGe(Long availMem){
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
    public EmSocDevicesQueryWrapper availMemLt(Long availMem){
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
    public EmSocDevicesQueryWrapper availMemLe(Long availMem){
        if(availMem!=null){
            le("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * BETWEEN 值1 AND 值2
     * @param availMemStart       值1
     * @param availMemEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper availMemBetween(Long availMemStart,Long availMemEnd){
        if(availMemStart!=null && availMemEnd!=null){
            between("avail_mem",availMemStart,availMemEnd);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * NOT BETWEEN 值1 AND 值2
     * @param availMemStart       值1
     * @param availMemEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper availMemNotBetween(Long availMemStart,Long availMemEnd){
        if(availMemStart!=null && availMemEnd!=null){
            notBetween("avail_mem",availMemStart,availMemEnd);
        }
        return this;
     }


    /**
     * <p>availMem</p>
     * LIKE '%值%'
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesQueryWrapper availMemLike(Long availMem){
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
    public EmSocDevicesQueryWrapper availMemNotLike(Long availMem){
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
    public EmSocDevicesQueryWrapper availMemLikeLeft(Long availMem){
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
    public EmSocDevicesQueryWrapper availMemLikeRight(Long availMem){
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
    public EmSocDevicesQueryWrapper availMemIsNull(){
        isNull("avail_mem");
        return this;
    }

    /**
     * <p>availMem</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper availMemIsNotNull(){
        isNotNull("avail_mem");
        return this;
    }

    /**
     * <p>availMem</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper availMemIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper availMemIn(Long... values){
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
    public EmSocDevicesQueryWrapper availMemNotIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper availMemNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("avail_mem",values);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * 等于 =
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesQueryWrapper totalStorageEq(Long totalStorage){
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
    public EmSocDevicesQueryWrapper totalStorageNe(Long totalStorage){
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
    public EmSocDevicesQueryWrapper totalStorageGt(Long totalStorage){
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
    public EmSocDevicesQueryWrapper totalStorageGe(Long totalStorage){
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
    public EmSocDevicesQueryWrapper totalStorageLt(Long totalStorage){
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
    public EmSocDevicesQueryWrapper totalStorageLe(Long totalStorage){
        if(totalStorage!=null){
            le("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * BETWEEN 值1 AND 值2
     * @param totalStorageStart       值1
     * @param totalStorageEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper totalStorageBetween(Long totalStorageStart,Long totalStorageEnd){
        if(totalStorageStart!=null && totalStorageEnd!=null){
            between("total_storage",totalStorageStart,totalStorageEnd);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * NOT BETWEEN 值1 AND 值2
     * @param totalStorageStart       值1
     * @param totalStorageEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper totalStorageNotBetween(Long totalStorageStart,Long totalStorageEnd){
        if(totalStorageStart!=null && totalStorageEnd!=null){
            notBetween("total_storage",totalStorageStart,totalStorageEnd);
        }
        return this;
     }


    /**
     * <p>totalStorage</p>
     * LIKE '%值%'
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesQueryWrapper totalStorageLike(Long totalStorage){
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
    public EmSocDevicesQueryWrapper totalStorageNotLike(Long totalStorage){
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
    public EmSocDevicesQueryWrapper totalStorageLikeLeft(Long totalStorage){
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
    public EmSocDevicesQueryWrapper totalStorageLikeRight(Long totalStorage){
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
    public EmSocDevicesQueryWrapper totalStorageIsNull(){
        isNull("total_storage");
        return this;
    }

    /**
     * <p>totalStorage</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper totalStorageIsNotNull(){
        isNotNull("total_storage");
        return this;
    }

    /**
     * <p>totalStorage</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper totalStorageIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper totalStorageIn(Long... values){
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
    public EmSocDevicesQueryWrapper totalStorageNotIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper totalStorageNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("total_storage",values);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * 等于 =
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesQueryWrapper availStorageEq(Long availStorage){
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
    public EmSocDevicesQueryWrapper availStorageNe(Long availStorage){
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
    public EmSocDevicesQueryWrapper availStorageGt(Long availStorage){
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
    public EmSocDevicesQueryWrapper availStorageGe(Long availStorage){
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
    public EmSocDevicesQueryWrapper availStorageLt(Long availStorage){
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
    public EmSocDevicesQueryWrapper availStorageLe(Long availStorage){
        if(availStorage!=null){
            le("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * BETWEEN 值1 AND 值2
     * @param availStorageStart       值1
     * @param availStorageEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper availStorageBetween(Long availStorageStart,Long availStorageEnd){
        if(availStorageStart!=null && availStorageEnd!=null){
            between("avail_storage",availStorageStart,availStorageEnd);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * NOT BETWEEN 值1 AND 值2
     * @param availStorageStart       值1
     * @param availStorageEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper availStorageNotBetween(Long availStorageStart,Long availStorageEnd){
        if(availStorageStart!=null && availStorageEnd!=null){
            notBetween("avail_storage",availStorageStart,availStorageEnd);
        }
        return this;
     }


    /**
     * <p>availStorage</p>
     * LIKE '%值%'
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesQueryWrapper availStorageLike(Long availStorage){
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
    public EmSocDevicesQueryWrapper availStorageNotLike(Long availStorage){
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
    public EmSocDevicesQueryWrapper availStorageLikeLeft(Long availStorage){
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
    public EmSocDevicesQueryWrapper availStorageLikeRight(Long availStorage){
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
    public EmSocDevicesQueryWrapper availStorageIsNull(){
        isNull("avail_storage");
        return this;
    }

    /**
     * <p>availStorage</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper availStorageIsNotNull(){
        isNotNull("avail_storage");
        return this;
    }

    /**
     * <p>availStorage</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper availStorageIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper availStorageIn(Long... values){
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
    public EmSocDevicesQueryWrapper availStorageNotIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper availStorageNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("avail_storage",values);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 等于 =
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesQueryWrapper rootAccessEq(Integer rootAccess){
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
    public EmSocDevicesQueryWrapper rootAccessNe(Integer rootAccess){
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
    public EmSocDevicesQueryWrapper rootAccessGt(Integer rootAccess){
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
    public EmSocDevicesQueryWrapper rootAccessGe(Integer rootAccess){
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
    public EmSocDevicesQueryWrapper rootAccessLt(Integer rootAccess){
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
    public EmSocDevicesQueryWrapper rootAccessLe(Integer rootAccess){
        if(rootAccess!=null){
            le("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * BETWEEN 值1 AND 值2
     * @param rootAccessStart       值1
     * @param rootAccessEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper rootAccessBetween(Integer rootAccessStart,Integer rootAccessEnd){
        if(rootAccessStart!=null && rootAccessEnd!=null){
            between("root_access",rootAccessStart,rootAccessEnd);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param rootAccessStart       值1
     * @param rootAccessEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper rootAccessNotBetween(Integer rootAccessStart,Integer rootAccessEnd){
        if(rootAccessStart!=null && rootAccessEnd!=null){
            notBetween("root_access",rootAccessStart,rootAccessEnd);
        }
        return this;
     }


    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '%值%'
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesQueryWrapper rootAccessLike(Integer rootAccess){
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
    public EmSocDevicesQueryWrapper rootAccessNotLike(Integer rootAccess){
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
    public EmSocDevicesQueryWrapper rootAccessLikeLeft(Integer rootAccess){
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
    public EmSocDevicesQueryWrapper rootAccessLikeRight(Integer rootAccess){
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
    public EmSocDevicesQueryWrapper rootAccessIsNull(){
        isNull("root_access");
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper rootAccessIsNotNull(){
        isNotNull("root_access");
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper rootAccessIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper rootAccessIn(Integer... values){
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
    public EmSocDevicesQueryWrapper rootAccessNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper rootAccessNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("root_access",values);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 等于 =
     * @param lng       值
     * @return children
     */
    public EmSocDevicesQueryWrapper lngEq(BigDecimal lng){
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
    public EmSocDevicesQueryWrapper lngNe(BigDecimal lng){
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
    public EmSocDevicesQueryWrapper lngGt(BigDecimal lng){
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
    public EmSocDevicesQueryWrapper lngGe(BigDecimal lng){
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
    public EmSocDevicesQueryWrapper lngLt(BigDecimal lng){
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
    public EmSocDevicesQueryWrapper lngLe(BigDecimal lng){
        if(lng!=null){
            le("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * BETWEEN 值1 AND 值2
     * @param lngStart       值1
     * @param lngEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper lngBetween(BigDecimal lngStart,BigDecimal lngEnd){
        if(lngStart!=null && lngEnd!=null){
            between("lng",lngStart,lngEnd);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lngStart       值1
     * @param lngEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper lngNotBetween(BigDecimal lngStart,BigDecimal lngEnd){
        if(lngStart!=null && lngEnd!=null){
            notBetween("lng",lngStart,lngEnd);
        }
        return this;
     }


    /**
     * <p>经度</p>
     * LIKE '%值%'
     * @param lng       值
     * @return children
     */
    public EmSocDevicesQueryWrapper lngLike(BigDecimal lng){
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
    public EmSocDevicesQueryWrapper lngNotLike(BigDecimal lng){
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
    public EmSocDevicesQueryWrapper lngLikeLeft(BigDecimal lng){
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
    public EmSocDevicesQueryWrapper lngLikeRight(BigDecimal lng){
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
    public EmSocDevicesQueryWrapper lngIsNull(){
        isNull("lng");
        return this;
    }

    /**
     * <p>经度</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper lngIsNotNull(){
        isNotNull("lng");
        return this;
    }

    /**
     * <p>经度</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper lngIn(Collection<BigDecimal> value){
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
    public EmSocDevicesQueryWrapper lngIn(BigDecimal... values){
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
    public EmSocDevicesQueryWrapper lngNotIn(Collection<BigDecimal> value){
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
    public EmSocDevicesQueryWrapper lngNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("lng",values);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 等于 =
     * @param lat       值
     * @return children
     */
    public EmSocDevicesQueryWrapper latEq(BigDecimal lat){
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
    public EmSocDevicesQueryWrapper latNe(BigDecimal lat){
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
    public EmSocDevicesQueryWrapper latGt(BigDecimal lat){
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
    public EmSocDevicesQueryWrapper latGe(BigDecimal lat){
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
    public EmSocDevicesQueryWrapper latLt(BigDecimal lat){
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
    public EmSocDevicesQueryWrapper latLe(BigDecimal lat){
        if(lat!=null){
            le("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * BETWEEN 值1 AND 值2
     * @param latStart       值1
     * @param latEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper latBetween(BigDecimal latStart,BigDecimal latEnd){
        if(latStart!=null && latEnd!=null){
            between("lat",latStart,latEnd);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT BETWEEN 值1 AND 值2
     * @param latStart       值1
     * @param latEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper latNotBetween(BigDecimal latStart,BigDecimal latEnd){
        if(latStart!=null && latEnd!=null){
            notBetween("lat",latStart,latEnd);
        }
        return this;
     }


    /**
     * <p>纬度</p>
     * LIKE '%值%'
     * @param lat       值
     * @return children
     */
    public EmSocDevicesQueryWrapper latLike(BigDecimal lat){
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
    public EmSocDevicesQueryWrapper latNotLike(BigDecimal lat){
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
    public EmSocDevicesQueryWrapper latLikeLeft(BigDecimal lat){
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
    public EmSocDevicesQueryWrapper latLikeRight(BigDecimal lat){
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
    public EmSocDevicesQueryWrapper latIsNull(){
        isNull("lat");
        return this;
    }

    /**
     * <p>纬度</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper latIsNotNull(){
        isNotNull("lat");
        return this;
    }

    /**
     * <p>纬度</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper latIn(Collection<BigDecimal> value){
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
    public EmSocDevicesQueryWrapper latIn(BigDecimal... values){
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
    public EmSocDevicesQueryWrapper latNotIn(Collection<BigDecimal> value){
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
    public EmSocDevicesQueryWrapper latNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("lat",values);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 等于 =
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesQueryWrapper bizTypeEq(Integer bizType){
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
    public EmSocDevicesQueryWrapper bizTypeNe(Integer bizType){
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
    public EmSocDevicesQueryWrapper bizTypeGt(Integer bizType){
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
    public EmSocDevicesQueryWrapper bizTypeGe(Integer bizType){
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
    public EmSocDevicesQueryWrapper bizTypeLt(Integer bizType){
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
    public EmSocDevicesQueryWrapper bizTypeLe(Integer bizType){
        if(bizType!=null){
            le("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * BETWEEN 值1 AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper bizTypeBetween(Integer bizTypeStart,Integer bizTypeEnd){
        if(bizTypeStart!=null && bizTypeEnd!=null){
            between("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper bizTypeNotBetween(Integer bizTypeStart,Integer bizTypeEnd){
        if(bizTypeStart!=null && bizTypeEnd!=null){
            notBetween("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }


    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '%值%'
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesQueryWrapper bizTypeLike(Integer bizType){
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
    public EmSocDevicesQueryWrapper bizTypeNotLike(Integer bizType){
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
    public EmSocDevicesQueryWrapper bizTypeLikeLeft(Integer bizType){
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
    public EmSocDevicesQueryWrapper bizTypeLikeRight(Integer bizType){
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
    public EmSocDevicesQueryWrapper bizTypeIsNull(){
        isNull("biz_type");
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper bizTypeIsNotNull(){
        isNotNull("biz_type");
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper bizTypeIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper bizTypeIn(Integer... values){
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
    public EmSocDevicesQueryWrapper bizTypeNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper bizTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("biz_type",values);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 等于 =
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesQueryWrapper serverTypeEq(Integer serverType){
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
    public EmSocDevicesQueryWrapper serverTypeNe(Integer serverType){
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
    public EmSocDevicesQueryWrapper serverTypeGt(Integer serverType){
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
    public EmSocDevicesQueryWrapper serverTypeGe(Integer serverType){
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
    public EmSocDevicesQueryWrapper serverTypeLt(Integer serverType){
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
    public EmSocDevicesQueryWrapper serverTypeLe(Integer serverType){
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * BETWEEN 值1 AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper serverTypeBetween(Integer serverTypeStart,Integer serverTypeEnd){
        if(serverTypeStart!=null && serverTypeEnd!=null){
            between("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper serverTypeNotBetween(Integer serverTypeStart,Integer serverTypeEnd){
        if(serverTypeStart!=null && serverTypeEnd!=null){
            notBetween("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '%值%'
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesQueryWrapper serverTypeLike(Integer serverType){
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
    public EmSocDevicesQueryWrapper serverTypeNotLike(Integer serverType){
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
    public EmSocDevicesQueryWrapper serverTypeLikeLeft(Integer serverType){
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
    public EmSocDevicesQueryWrapper serverTypeLikeRight(Integer serverType){
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
    public EmSocDevicesQueryWrapper serverTypeIsNull(){
        isNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper serverTypeIsNotNull(){
        isNotNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper serverTypeIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper serverTypeIn(Integer... values){
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
    public EmSocDevicesQueryWrapper serverTypeNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper serverTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("server_type",values);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 等于 =
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesQueryWrapper salesStatusEq(Integer salesStatus){
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
    public EmSocDevicesQueryWrapper salesStatusNe(Integer salesStatus){
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
    public EmSocDevicesQueryWrapper salesStatusGt(Integer salesStatus){
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
    public EmSocDevicesQueryWrapper salesStatusGe(Integer salesStatus){
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
    public EmSocDevicesQueryWrapper salesStatusLt(Integer salesStatus){
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
    public EmSocDevicesQueryWrapper salesStatusLe(Integer salesStatus){
        if(salesStatus!=null){
            le("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * BETWEEN 值1 AND 值2
     * @param salesStatusStart       值1
     * @param salesStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper salesStatusBetween(Integer salesStatusStart,Integer salesStatusEnd){
        if(salesStatusStart!=null && salesStatusEnd!=null){
            between("sales_status",salesStatusStart,salesStatusEnd);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param salesStatusStart       值1
     * @param salesStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper salesStatusNotBetween(Integer salesStatusStart,Integer salesStatusEnd){
        if(salesStatusStart!=null && salesStatusEnd!=null){
            notBetween("sales_status",salesStatusStart,salesStatusEnd);
        }
        return this;
     }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值%'
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesQueryWrapper salesStatusLike(Integer salesStatus){
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
    public EmSocDevicesQueryWrapper salesStatusNotLike(Integer salesStatus){
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
    public EmSocDevicesQueryWrapper salesStatusLikeLeft(Integer salesStatus){
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
    public EmSocDevicesQueryWrapper salesStatusLikeRight(Integer salesStatus){
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
    public EmSocDevicesQueryWrapper salesStatusIsNull(){
        isNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper salesStatusIsNotNull(){
        isNotNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper salesStatusIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper salesStatusIn(Integer... values){
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
    public EmSocDevicesQueryWrapper salesStatusNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper salesStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("sales_status",values);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 等于 =
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesQueryWrapper runningStatusEq(Integer runningStatus){
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
    public EmSocDevicesQueryWrapper runningStatusNe(Integer runningStatus){
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
    public EmSocDevicesQueryWrapper runningStatusGt(Integer runningStatus){
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
    public EmSocDevicesQueryWrapper runningStatusGe(Integer runningStatus){
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
    public EmSocDevicesQueryWrapper runningStatusLt(Integer runningStatus){
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
    public EmSocDevicesQueryWrapper runningStatusLe(Integer runningStatus){
        if(runningStatus!=null){
            le("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * BETWEEN 值1 AND 值2
     * @param runningStatusStart       值1
     * @param runningStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper runningStatusBetween(Integer runningStatusStart,Integer runningStatusEnd){
        if(runningStatusStart!=null && runningStatusEnd!=null){
            between("running_status",runningStatusStart,runningStatusEnd);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param runningStatusStart       值1
     * @param runningStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper runningStatusNotBetween(Integer runningStatusStart,Integer runningStatusEnd){
        if(runningStatusStart!=null && runningStatusEnd!=null){
            notBetween("running_status",runningStatusStart,runningStatusEnd);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值%'
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesQueryWrapper runningStatusLike(Integer runningStatus){
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
    public EmSocDevicesQueryWrapper runningStatusNotLike(Integer runningStatus){
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
    public EmSocDevicesQueryWrapper runningStatusLikeLeft(Integer runningStatus){
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
    public EmSocDevicesQueryWrapper runningStatusLikeRight(Integer runningStatus){
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
    public EmSocDevicesQueryWrapper runningStatusIsNull(){
        isNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper runningStatusIsNotNull(){
        isNotNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper runningStatusIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper runningStatusIn(Integer... values){
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
    public EmSocDevicesQueryWrapper runningStatusNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper runningStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("running_status",values);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public EmSocDevicesQueryWrapper statusEq(Integer status){
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
    public EmSocDevicesQueryWrapper statusNe(Integer status){
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
    public EmSocDevicesQueryWrapper statusGt(Integer status){
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
    public EmSocDevicesQueryWrapper statusGe(Integer status){
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
    public EmSocDevicesQueryWrapper statusLt(Integer status){
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
    public EmSocDevicesQueryWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public EmSocDevicesQueryWrapper statusLike(Integer status){
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
    public EmSocDevicesQueryWrapper statusNotLike(Integer status){
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
    public EmSocDevicesQueryWrapper statusLikeLeft(Integer status){
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
    public EmSocDevicesQueryWrapper statusLikeRight(Integer status){
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
    public EmSocDevicesQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper statusIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper statusIn(Integer... values){
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
    public EmSocDevicesQueryWrapper statusNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 等于 =
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesQueryWrapper healthStatusEq(Integer healthStatus){
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
    public EmSocDevicesQueryWrapper healthStatusNe(Integer healthStatus){
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
    public EmSocDevicesQueryWrapper healthStatusGt(Integer healthStatus){
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
    public EmSocDevicesQueryWrapper healthStatusGe(Integer healthStatus){
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
    public EmSocDevicesQueryWrapper healthStatusLt(Integer healthStatus){
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
    public EmSocDevicesQueryWrapper healthStatusLe(Integer healthStatus){
        if(healthStatus!=null){
            le("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * BETWEEN 值1 AND 值2
     * @param healthStatusStart       值1
     * @param healthStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper healthStatusBetween(Integer healthStatusStart,Integer healthStatusEnd){
        if(healthStatusStart!=null && healthStatusEnd!=null){
            between("health_status",healthStatusStart,healthStatusEnd);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param healthStatusStart       值1
     * @param healthStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper healthStatusNotBetween(Integer healthStatusStart,Integer healthStatusEnd){
        if(healthStatusStart!=null && healthStatusEnd!=null){
            notBetween("health_status",healthStatusStart,healthStatusEnd);
        }
        return this;
     }


    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '%值%'
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesQueryWrapper healthStatusLike(Integer healthStatus){
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
    public EmSocDevicesQueryWrapper healthStatusNotLike(Integer healthStatus){
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
    public EmSocDevicesQueryWrapper healthStatusLikeLeft(Integer healthStatus){
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
    public EmSocDevicesQueryWrapper healthStatusLikeRight(Integer healthStatus){
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
    public EmSocDevicesQueryWrapper healthStatusIsNull(){
        isNull("health_status");
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper healthStatusIsNotNull(){
        isNotNull("health_status");
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper healthStatusIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper healthStatusIn(Integer... values){
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
    public EmSocDevicesQueryWrapper healthStatusNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper healthStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("health_status",values);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 等于 =
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesQueryWrapper trusteeshipStatusEq(Integer trusteeshipStatus){
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
    public EmSocDevicesQueryWrapper trusteeshipStatusNe(Integer trusteeshipStatus){
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
    public EmSocDevicesQueryWrapper trusteeshipStatusGt(Integer trusteeshipStatus){
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
    public EmSocDevicesQueryWrapper trusteeshipStatusGe(Integer trusteeshipStatus){
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
    public EmSocDevicesQueryWrapper trusteeshipStatusLt(Integer trusteeshipStatus){
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
    public EmSocDevicesQueryWrapper trusteeshipStatusLe(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            le("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * BETWEEN 值1 AND 值2
     * @param trusteeshipStatusStart       值1
     * @param trusteeshipStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper trusteeshipStatusBetween(Integer trusteeshipStatusStart,Integer trusteeshipStatusEnd){
        if(trusteeshipStatusStart!=null && trusteeshipStatusEnd!=null){
            between("trusteeship_status",trusteeshipStatusStart,trusteeshipStatusEnd);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param trusteeshipStatusStart       值1
     * @param trusteeshipStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper trusteeshipStatusNotBetween(Integer trusteeshipStatusStart,Integer trusteeshipStatusEnd){
        if(trusteeshipStatusStart!=null && trusteeshipStatusEnd!=null){
            notBetween("trusteeship_status",trusteeshipStatusStart,trusteeshipStatusEnd);
        }
        return this;
     }


    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '%值%'
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesQueryWrapper trusteeshipStatusLike(Integer trusteeshipStatus){
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
    public EmSocDevicesQueryWrapper trusteeshipStatusNotLike(Integer trusteeshipStatus){
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
    public EmSocDevicesQueryWrapper trusteeshipStatusLikeLeft(Integer trusteeshipStatus){
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
    public EmSocDevicesQueryWrapper trusteeshipStatusLikeRight(Integer trusteeshipStatus){
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
    public EmSocDevicesQueryWrapper trusteeshipStatusIsNull(){
        isNull("trusteeship_status");
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper trusteeshipStatusIsNotNull(){
        isNotNull("trusteeship_status");
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper trusteeshipStatusIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper trusteeshipStatusIn(Integer... values){
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
    public EmSocDevicesQueryWrapper trusteeshipStatusNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper trusteeshipStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("trusteeship_status",values);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 等于 =
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesQueryWrapper planSwitchTypeEq(Integer planSwitchType){
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
    public EmSocDevicesQueryWrapper planSwitchTypeNe(Integer planSwitchType){
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
    public EmSocDevicesQueryWrapper planSwitchTypeGt(Integer planSwitchType){
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
    public EmSocDevicesQueryWrapper planSwitchTypeGe(Integer planSwitchType){
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
    public EmSocDevicesQueryWrapper planSwitchTypeLt(Integer planSwitchType){
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
    public EmSocDevicesQueryWrapper planSwitchTypeLe(Integer planSwitchType){
        if(planSwitchType!=null){
            le("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * BETWEEN 值1 AND 值2
     * @param planSwitchTypeStart       值1
     * @param planSwitchTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper planSwitchTypeBetween(Integer planSwitchTypeStart,Integer planSwitchTypeEnd){
        if(planSwitchTypeStart!=null && planSwitchTypeEnd!=null){
            between("plan_switch_type",planSwitchTypeStart,planSwitchTypeEnd);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param planSwitchTypeStart       值1
     * @param planSwitchTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper planSwitchTypeNotBetween(Integer planSwitchTypeStart,Integer planSwitchTypeEnd){
        if(planSwitchTypeStart!=null && planSwitchTypeEnd!=null){
            notBetween("plan_switch_type",planSwitchTypeStart,planSwitchTypeEnd);
        }
        return this;
     }


    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '%值%'
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesQueryWrapper planSwitchTypeLike(Integer planSwitchType){
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
    public EmSocDevicesQueryWrapper planSwitchTypeNotLike(Integer planSwitchType){
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
    public EmSocDevicesQueryWrapper planSwitchTypeLikeLeft(Integer planSwitchType){
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
    public EmSocDevicesQueryWrapper planSwitchTypeLikeRight(Integer planSwitchType){
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
    public EmSocDevicesQueryWrapper planSwitchTypeIsNull(){
        isNull("plan_switch_type");
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper planSwitchTypeIsNotNull(){
        isNotNull("plan_switch_type");
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper planSwitchTypeIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper planSwitchTypeIn(Integer... values){
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
    public EmSocDevicesQueryWrapper planSwitchTypeNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper planSwitchTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("plan_switch_type",values);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 等于 =
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesQueryWrapper streamingStatusEq(Integer streamingStatus){
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
    public EmSocDevicesQueryWrapper streamingStatusNe(Integer streamingStatus){
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
    public EmSocDevicesQueryWrapper streamingStatusGt(Integer streamingStatus){
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
    public EmSocDevicesQueryWrapper streamingStatusGe(Integer streamingStatus){
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
    public EmSocDevicesQueryWrapper streamingStatusLt(Integer streamingStatus){
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
    public EmSocDevicesQueryWrapper streamingStatusLe(Integer streamingStatus){
        if(streamingStatus!=null){
            le("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * BETWEEN 值1 AND 值2
     * @param streamingStatusStart       值1
     * @param streamingStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper streamingStatusBetween(Integer streamingStatusStart,Integer streamingStatusEnd){
        if(streamingStatusStart!=null && streamingStatusEnd!=null){
            between("streaming_status",streamingStatusStart,streamingStatusEnd);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param streamingStatusStart       值1
     * @param streamingStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper streamingStatusNotBetween(Integer streamingStatusStart,Integer streamingStatusEnd){
        if(streamingStatusStart!=null && streamingStatusEnd!=null){
            notBetween("streaming_status",streamingStatusStart,streamingStatusEnd);
        }
        return this;
     }


    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '%值%'
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesQueryWrapper streamingStatusLike(Integer streamingStatus){
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
    public EmSocDevicesQueryWrapper streamingStatusNotLike(Integer streamingStatus){
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
    public EmSocDevicesQueryWrapper streamingStatusLikeLeft(Integer streamingStatus){
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
    public EmSocDevicesQueryWrapper streamingStatusLikeRight(Integer streamingStatus){
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
    public EmSocDevicesQueryWrapper streamingStatusIsNull(){
        isNull("streaming_status");
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper streamingStatusIsNotNull(){
        isNotNull("streaming_status");
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper streamingStatusIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper streamingStatusIn(Integer... values){
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
    public EmSocDevicesQueryWrapper streamingStatusNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper streamingStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("streaming_status",values);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 等于 =
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesQueryWrapper maintStatusEq(Integer maintStatus){
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
    public EmSocDevicesQueryWrapper maintStatusNe(Integer maintStatus){
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
    public EmSocDevicesQueryWrapper maintStatusGt(Integer maintStatus){
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
    public EmSocDevicesQueryWrapper maintStatusGe(Integer maintStatus){
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
    public EmSocDevicesQueryWrapper maintStatusLt(Integer maintStatus){
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
    public EmSocDevicesQueryWrapper maintStatusLe(Integer maintStatus){
        if(maintStatus!=null){
            le("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * BETWEEN 值1 AND 值2
     * @param maintStatusStart       值1
     * @param maintStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper maintStatusBetween(Integer maintStatusStart,Integer maintStatusEnd){
        if(maintStatusStart!=null && maintStatusEnd!=null){
            between("maint_status",maintStatusStart,maintStatusEnd);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param maintStatusStart       值1
     * @param maintStatusEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper maintStatusNotBetween(Integer maintStatusStart,Integer maintStatusEnd){
        if(maintStatusStart!=null && maintStatusEnd!=null){
            notBetween("maint_status",maintStatusStart,maintStatusEnd);
        }
        return this;
     }


    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '%值%'
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesQueryWrapper maintStatusLike(Integer maintStatus){
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
    public EmSocDevicesQueryWrapper maintStatusNotLike(Integer maintStatus){
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
    public EmSocDevicesQueryWrapper maintStatusLikeLeft(Integer maintStatus){
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
    public EmSocDevicesQueryWrapper maintStatusLikeRight(Integer maintStatus){
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
    public EmSocDevicesQueryWrapper maintStatusIsNull(){
        isNull("maint_status");
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper maintStatusIsNotNull(){
        isNotNull("maint_status");
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper maintStatusIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper maintStatusIn(Integer... values){
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
    public EmSocDevicesQueryWrapper maintStatusNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper maintStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("maint_status",values);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 等于 =
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesQueryWrapper isResetingEq(Integer isReseting){
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
    public EmSocDevicesQueryWrapper isResetingNe(Integer isReseting){
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
    public EmSocDevicesQueryWrapper isResetingGt(Integer isReseting){
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
    public EmSocDevicesQueryWrapper isResetingGe(Integer isReseting){
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
    public EmSocDevicesQueryWrapper isResetingLt(Integer isReseting){
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
    public EmSocDevicesQueryWrapper isResetingLe(Integer isReseting){
        if(isReseting!=null){
            le("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * BETWEEN 值1 AND 值2
     * @param isResetingStart       值1
     * @param isResetingEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper isResetingBetween(Integer isResetingStart,Integer isResetingEnd){
        if(isResetingStart!=null && isResetingEnd!=null){
            between("is_reseting",isResetingStart,isResetingEnd);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param isResetingStart       值1
     * @param isResetingEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper isResetingNotBetween(Integer isResetingStart,Integer isResetingEnd){
        if(isResetingStart!=null && isResetingEnd!=null){
            notBetween("is_reseting",isResetingStart,isResetingEnd);
        }
        return this;
     }


    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '%值%'
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesQueryWrapper isResetingLike(Integer isReseting){
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
    public EmSocDevicesQueryWrapper isResetingNotLike(Integer isReseting){
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
    public EmSocDevicesQueryWrapper isResetingLikeLeft(Integer isReseting){
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
    public EmSocDevicesQueryWrapper isResetingLikeRight(Integer isReseting){
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
    public EmSocDevicesQueryWrapper isResetingIsNull(){
        isNull("is_reseting");
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper isResetingIsNotNull(){
        isNotNull("is_reseting");
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper isResetingIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper isResetingIn(Integer... values){
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
    public EmSocDevicesQueryWrapper isResetingNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper isResetingNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_reseting",values);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * 等于 =
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesQueryWrapper romVersionEq(String romVersion){
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
    public EmSocDevicesQueryWrapper romVersionNe(String romVersion){
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
    public EmSocDevicesQueryWrapper romVersionGt(String romVersion){
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
    public EmSocDevicesQueryWrapper romVersionGe(String romVersion){
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
    public EmSocDevicesQueryWrapper romVersionLt(String romVersion){
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
    public EmSocDevicesQueryWrapper romVersionLe(String romVersion){
        if(romVersion!=null){
            le("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * BETWEEN 值1 AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper romVersionBetween(String romVersionStart,String romVersionEnd){
        if(romVersionStart!=null && romVersionEnd!=null){
            between("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * NOT BETWEEN 值1 AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper romVersionNotBetween(String romVersionStart,String romVersionEnd){
        if(romVersionStart!=null && romVersionEnd!=null){
            notBetween("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }


    /**
     * <p>rom系统软件版本</p>
     * LIKE '%值%'
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesQueryWrapper romVersionLike(String romVersion){
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
    public EmSocDevicesQueryWrapper romVersionNotLike(String romVersion){
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
    public EmSocDevicesQueryWrapper romVersionLikeLeft(String romVersion){
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
    public EmSocDevicesQueryWrapper romVersionLikeRight(String romVersion){
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
    public EmSocDevicesQueryWrapper romVersionIsNull(){
        isNull("rom_version");
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper romVersionIsNotNull(){
        isNotNull("rom_version");
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper romVersionIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper romVersionIn(String... values){
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
    public EmSocDevicesQueryWrapper romVersionNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper romVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("rom_version",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesQueryWrapper versionIdEq(Long versionId){
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
    public EmSocDevicesQueryWrapper versionIdNe(Long versionId){
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
    public EmSocDevicesQueryWrapper versionIdGt(Long versionId){
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
    public EmSocDevicesQueryWrapper versionIdGe(Long versionId){
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
    public EmSocDevicesQueryWrapper versionIdLt(Long versionId){
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
    public EmSocDevicesQueryWrapper versionIdLe(Long versionId){
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
    public EmSocDevicesQueryWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public EmSocDevicesQueryWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public EmSocDevicesQueryWrapper versionIdLike(Long versionId){
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
    public EmSocDevicesQueryWrapper versionIdNotLike(Long versionId){
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
    public EmSocDevicesQueryWrapper versionIdLikeLeft(Long versionId){
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
    public EmSocDevicesQueryWrapper versionIdLikeRight(Long versionId){
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
    public EmSocDevicesQueryWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper versionIdIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper versionIdIn(Long... values){
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
    public EmSocDevicesQueryWrapper versionIdNotIn(Collection<Long> value){
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
    public EmSocDevicesQueryWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesQueryWrapper createTimeEq(Date createTime){
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
    public EmSocDevicesQueryWrapper createTimeNe(Date createTime){
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
    public EmSocDevicesQueryWrapper createTimeGt(Date createTime){
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
    public EmSocDevicesQueryWrapper createTimeGe(Date createTime){
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
    public EmSocDevicesQueryWrapper createTimeLt(Date createTime){
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
    public EmSocDevicesQueryWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesQueryWrapper createTimeLike(Date createTime){
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
    public EmSocDevicesQueryWrapper createTimeNotLike(Date createTime){
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
    public EmSocDevicesQueryWrapper createTimeLikeLeft(Date createTime){
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
    public EmSocDevicesQueryWrapper createTimeLikeRight(Date createTime){
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
    public EmSocDevicesQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper createTimeIn(Collection<Date> value){
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
    public EmSocDevicesQueryWrapper createTimeIn(Date... values){
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
    public EmSocDevicesQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public EmSocDevicesQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public EmSocDevicesQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public EmSocDevicesQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public EmSocDevicesQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public EmSocDevicesQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public EmSocDevicesQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>盒子信息修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public EmSocDevicesQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public EmSocDevicesQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public EmSocDevicesQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public EmSocDevicesQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public EmSocDevicesQueryWrapper lastUpdateTimeIn(Date... values){
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
    public EmSocDevicesQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public EmSocDevicesQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 等于 =
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesQueryWrapper isUserSaveEq(Integer isUserSave){
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
    public EmSocDevicesQueryWrapper isUserSaveNe(Integer isUserSave){
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
    public EmSocDevicesQueryWrapper isUserSaveGt(Integer isUserSave){
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
    public EmSocDevicesQueryWrapper isUserSaveGe(Integer isUserSave){
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
    public EmSocDevicesQueryWrapper isUserSaveLt(Integer isUserSave){
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
    public EmSocDevicesQueryWrapper isUserSaveLe(Integer isUserSave){
        if(isUserSave!=null){
            le("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * BETWEEN 值1 AND 值2
     * @param isUserSaveStart       值1
     * @param isUserSaveEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper isUserSaveBetween(Integer isUserSaveStart,Integer isUserSaveEnd){
        if(isUserSaveStart!=null && isUserSaveEnd!=null){
            between("is_user_save",isUserSaveStart,isUserSaveEnd);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param isUserSaveStart       值1
     * @param isUserSaveEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper isUserSaveNotBetween(Integer isUserSaveStart,Integer isUserSaveEnd){
        if(isUserSaveStart!=null && isUserSaveEnd!=null){
            notBetween("is_user_save",isUserSaveStart,isUserSaveEnd);
        }
        return this;
     }


    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '%值%'
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesQueryWrapper isUserSaveLike(Integer isUserSave){
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
    public EmSocDevicesQueryWrapper isUserSaveNotLike(Integer isUserSave){
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
    public EmSocDevicesQueryWrapper isUserSaveLikeLeft(Integer isUserSave){
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
    public EmSocDevicesQueryWrapper isUserSaveLikeRight(Integer isUserSave){
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
    public EmSocDevicesQueryWrapper isUserSaveIsNull(){
        isNull("is_user_save");
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper isUserSaveIsNotNull(){
        isNotNull("is_user_save");
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper isUserSaveIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper isUserSaveIn(Integer... values){
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
    public EmSocDevicesQueryWrapper isUserSaveNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper isUserSaveNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_user_save",values);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 等于 =
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesQueryWrapper loglevelEq(Integer loglevel){
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
    public EmSocDevicesQueryWrapper loglevelNe(Integer loglevel){
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
    public EmSocDevicesQueryWrapper loglevelGt(Integer loglevel){
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
    public EmSocDevicesQueryWrapper loglevelGe(Integer loglevel){
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
    public EmSocDevicesQueryWrapper loglevelLt(Integer loglevel){
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
    public EmSocDevicesQueryWrapper loglevelLe(Integer loglevel){
        if(loglevel!=null){
            le("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * BETWEEN 值1 AND 值2
     * @param loglevelStart       值1
     * @param loglevelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper loglevelBetween(Integer loglevelStart,Integer loglevelEnd){
        if(loglevelStart!=null && loglevelEnd!=null){
            between("loglevel",loglevelStart,loglevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT BETWEEN 值1 AND 值2
     * @param loglevelStart       值1
     * @param loglevelEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper loglevelNotBetween(Integer loglevelStart,Integer loglevelEnd){
        if(loglevelStart!=null && loglevelEnd!=null){
            notBetween("loglevel",loglevelStart,loglevelEnd);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值%'
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesQueryWrapper loglevelLike(Integer loglevel){
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
    public EmSocDevicesQueryWrapper loglevelNotLike(Integer loglevel){
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
    public EmSocDevicesQueryWrapper loglevelLikeLeft(Integer loglevel){
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
    public EmSocDevicesQueryWrapper loglevelLikeRight(Integer loglevel){
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
    public EmSocDevicesQueryWrapper loglevelIsNull(){
        isNull("loglevel");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper loglevelIsNotNull(){
        isNotNull("loglevel");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper loglevelIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper loglevelIn(Integer... values){
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
    public EmSocDevicesQueryWrapper loglevelNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper loglevelNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("loglevel",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesQueryWrapper logpkgEq(String logpkg){
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
    public EmSocDevicesQueryWrapper logpkgNe(String logpkg){
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
    public EmSocDevicesQueryWrapper logpkgGt(String logpkg){
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
    public EmSocDevicesQueryWrapper logpkgGe(String logpkg){
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
    public EmSocDevicesQueryWrapper logpkgLt(String logpkg){
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
    public EmSocDevicesQueryWrapper logpkgLe(String logpkg){
        if(logpkg!=null){
            le("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param logpkgStart       值1
     * @param logpkgEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper logpkgBetween(String logpkgStart,String logpkgEnd){
        if(logpkgStart!=null && logpkgEnd!=null){
            between("logpkg",logpkgStart,logpkgEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param logpkgStart       值1
     * @param logpkgEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper logpkgNotBetween(String logpkgStart,String logpkgEnd){
        if(logpkgStart!=null && logpkgEnd!=null){
            notBetween("logpkg",logpkgStart,logpkgEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesQueryWrapper logpkgLike(String logpkg){
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
    public EmSocDevicesQueryWrapper logpkgNotLike(String logpkg){
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
    public EmSocDevicesQueryWrapper logpkgLikeLeft(String logpkg){
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
    public EmSocDevicesQueryWrapper logpkgLikeRight(String logpkg){
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
    public EmSocDevicesQueryWrapper logpkgIsNull(){
        isNull("logpkg");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper logpkgIsNotNull(){
        isNotNull("logpkg");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper logpkgIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper logpkgIn(String... values){
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
    public EmSocDevicesQueryWrapper logpkgNotIn(Collection<String> value){
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
    public EmSocDevicesQueryWrapper logpkgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("logpkg",values);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 等于 =
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesQueryWrapper isOtaUpgradeEq(Integer isOtaUpgrade){
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
    public EmSocDevicesQueryWrapper isOtaUpgradeNe(Integer isOtaUpgrade){
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
    public EmSocDevicesQueryWrapper isOtaUpgradeGt(Integer isOtaUpgrade){
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
    public EmSocDevicesQueryWrapper isOtaUpgradeGe(Integer isOtaUpgrade){
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
    public EmSocDevicesQueryWrapper isOtaUpgradeLt(Integer isOtaUpgrade){
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
    public EmSocDevicesQueryWrapper isOtaUpgradeLe(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            le("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * BETWEEN 值1 AND 值2
     * @param isOtaUpgradeStart       值1
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper isOtaUpgradeBetween(Integer isOtaUpgradeStart,Integer isOtaUpgradeEnd){
        if(isOtaUpgradeStart!=null && isOtaUpgradeEnd!=null){
            between("is_ota_upgrade",isOtaUpgradeStart,isOtaUpgradeEnd);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param isOtaUpgradeStart       值1
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper isOtaUpgradeNotBetween(Integer isOtaUpgradeStart,Integer isOtaUpgradeEnd){
        if(isOtaUpgradeStart!=null && isOtaUpgradeEnd!=null){
            notBetween("is_ota_upgrade",isOtaUpgradeStart,isOtaUpgradeEnd);
        }
        return this;
     }


    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '%值%'
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesQueryWrapper isOtaUpgradeLike(Integer isOtaUpgrade){
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
    public EmSocDevicesQueryWrapper isOtaUpgradeNotLike(Integer isOtaUpgrade){
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
    public EmSocDevicesQueryWrapper isOtaUpgradeLikeLeft(Integer isOtaUpgrade){
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
    public EmSocDevicesQueryWrapper isOtaUpgradeLikeRight(Integer isOtaUpgrade){
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
    public EmSocDevicesQueryWrapper isOtaUpgradeIsNull(){
        isNull("is_ota_upgrade");
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper isOtaUpgradeIsNotNull(){
        isNotNull("is_ota_upgrade");
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper isOtaUpgradeIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper isOtaUpgradeIn(Integer... values){
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
    public EmSocDevicesQueryWrapper isOtaUpgradeNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper isOtaUpgradeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_ota_upgrade",values);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 等于 =
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesQueryWrapper supplierTypeEq(Integer supplierType){
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
    public EmSocDevicesQueryWrapper supplierTypeNe(Integer supplierType){
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
    public EmSocDevicesQueryWrapper supplierTypeGt(Integer supplierType){
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
    public EmSocDevicesQueryWrapper supplierTypeGe(Integer supplierType){
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
    public EmSocDevicesQueryWrapper supplierTypeLt(Integer supplierType){
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
    public EmSocDevicesQueryWrapper supplierTypeLe(Integer supplierType){
        if(supplierType!=null){
            le("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * BETWEEN 值1 AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper supplierTypeBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        if(supplierTypeStart!=null && supplierTypeEnd!=null){
            between("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * NOT BETWEEN 值1 AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public EmSocDevicesQueryWrapper supplierTypeNotBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        if(supplierTypeStart!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '%值%'
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesQueryWrapper supplierTypeLike(Integer supplierType){
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
    public EmSocDevicesQueryWrapper supplierTypeNotLike(Integer supplierType){
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
    public EmSocDevicesQueryWrapper supplierTypeLikeLeft(Integer supplierType){
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
    public EmSocDevicesQueryWrapper supplierTypeLikeRight(Integer supplierType){
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
    public EmSocDevicesQueryWrapper supplierTypeIsNull(){
        isNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesQueryWrapper supplierTypeIsNotNull(){
        isNotNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesQueryWrapper supplierTypeIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper supplierTypeIn(Integer... values){
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
    public EmSocDevicesQueryWrapper supplierTypeNotIn(Collection<Integer> value){
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
    public EmSocDevicesQueryWrapper supplierTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("supplier_type",values);
        }
        return this;
    }


}
