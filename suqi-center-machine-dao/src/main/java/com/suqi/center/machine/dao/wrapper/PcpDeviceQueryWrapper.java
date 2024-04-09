package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.PcpDevice;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 云机id对照表
 * </p>
 * "pcp_device"
 * @author PC001
 */
public class PcpDeviceQueryWrapper extends QueryWrapper<PcpDevice> {


    public static PcpDeviceQueryWrapper wrapper() {
        return new PcpDeviceQueryWrapper();
    }

    public PcpDeviceQueryWrapper() {
        super();
    }

    public PcpDeviceQueryWrapper(PcpDevice entity) {
        super(entity);
    }

    public PcpDeviceQueryWrapper(PcpDevice entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public PcpDeviceQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public PcpDeviceQueryWrapper selectColumns(Consumer<PcpDeviceSelect> consumer) {
        PcpDeviceSelect select = new PcpDeviceSelect();
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
    public PcpDeviceQueryWrapper idEq(Long id){
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
    public PcpDeviceQueryWrapper idNe(Long id){
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
    public PcpDeviceQueryWrapper idGt(Long id){
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
    public PcpDeviceQueryWrapper idGe(Long id){
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
    public PcpDeviceQueryWrapper idLt(Long id){
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
    public PcpDeviceQueryWrapper idLe(Long id){
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
    public PcpDeviceQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public PcpDeviceQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public PcpDeviceQueryWrapper idLike(Long id){
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
    public PcpDeviceQueryWrapper idNotLike(Long id){
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
    public PcpDeviceQueryWrapper idLikeLeft(Long id){
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
    public PcpDeviceQueryWrapper idLikeRight(Long id){
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
    public PcpDeviceQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper idIn(Collection<Long> value){
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
    public PcpDeviceQueryWrapper idIn(Long... values){
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
    public PcpDeviceQueryWrapper idNotIn(Collection<Long> value){
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
    public PcpDeviceQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public PcpDeviceQueryWrapper deviceIdEq(String deviceId){
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
    public PcpDeviceQueryWrapper deviceIdNe(String deviceId){
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
    public PcpDeviceQueryWrapper deviceIdGt(String deviceId){
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
    public PcpDeviceQueryWrapper deviceIdGe(String deviceId){
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
    public PcpDeviceQueryWrapper deviceIdLt(String deviceId){
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
    public PcpDeviceQueryWrapper deviceIdLe(String deviceId){
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
    public PcpDeviceQueryWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public PcpDeviceQueryWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public PcpDeviceQueryWrapper deviceIdLike(String deviceId){
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
    public PcpDeviceQueryWrapper deviceIdNotLike(String deviceId){
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
    public PcpDeviceQueryWrapper deviceIdLikeLeft(String deviceId){
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
    public PcpDeviceQueryWrapper deviceIdLikeRight(String deviceId){
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
    public PcpDeviceQueryWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper deviceIdIn(Collection<String> value){
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
    public PcpDeviceQueryWrapper deviceIdIn(String... values){
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
    public PcpDeviceQueryWrapper deviceIdNotIn(Collection<String> value){
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
    public PcpDeviceQueryWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 等于 =
     * @param projectId       值
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdEq(String projectId){
        if(projectId!=null){
            eq("project_id",projectId);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * 不等于 &lt;&gt;
     * @param projectId       值
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdNe(String projectId){
        if(projectId!=null){
            ne("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 大于 &gt;
     * @param projectId       值
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdGt(String projectId){
        if(projectId!=null){
            gt("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 大于等于 &gt;=
     * @param projectId       值
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdGe(String projectId){
        if(projectId!=null){
            ge("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 小于 &lt;
     * @param projectId       值
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdLt(String projectId){
        if(projectId!=null){
            lt("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * 小于等于 &lt;=
     * @param projectId       值
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdLe(String projectId){
        if(projectId!=null){
            le("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * BETWEEN 值1 AND 值2
     * @param projectIdStart       值1
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdBetween(String projectIdStart,String projectIdEnd){
        if(projectIdStart!=null && projectIdEnd!=null){
            between("project_id",projectIdStart,projectIdEnd);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param projectIdStart       值1
     * @param projectIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdNotBetween(String projectIdStart,String projectIdEnd){
        if(projectIdStart!=null && projectIdEnd!=null){
            notBetween("project_id",projectIdStart,projectIdEnd);
        }
        return this;
     }


    /**
     * <p>华为项目id</p>
     * LIKE '%值%'
     * @param projectId       值
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdLike(String projectId){
        if(projectId!=null){
            like("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * NOT LIKE '%值%'
     * @param projectId       值
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdNotLike(String projectId){
        if(projectId!=null){
            notLike("project_id",projectId);
        }
        return this;
     }


    /**
     * <p>华为项目id</p>
     * LIKE '%值'
     * @param projectId       值
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdLikeLeft(String projectId){
        if(projectId!=null){
            likeLeft("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * LIKE '值%'
     * @param projectId       值
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdLikeRight(String projectId){
        if(projectId!=null){
            likeRight("project_id",projectId);
        }
        return this;
     }

    /**
     * <p>华为项目id</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdIsNull(){
        isNull("project_id");
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdIsNotNull(){
        isNotNull("project_id");
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("project_id",value);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdIn(String... values){
        if(values!=null && values.length>0){
            in("project_id",values);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("project_id",value);
        }
        return this;
    }

    /**
     * <p>华为项目id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper projectIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("project_id",values);
        }
        return this;
    }

    /**
     * <p>华为云机id</p>
     * 等于 =
     * @param phoneId       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneIdEq(String phoneId){
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
    public PcpDeviceQueryWrapper phoneIdNe(String phoneId){
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
    public PcpDeviceQueryWrapper phoneIdGt(String phoneId){
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
    public PcpDeviceQueryWrapper phoneIdGe(String phoneId){
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
    public PcpDeviceQueryWrapper phoneIdLt(String phoneId){
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
    public PcpDeviceQueryWrapper phoneIdLe(String phoneId){
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
    public PcpDeviceQueryWrapper phoneIdBetween(String phoneIdStart,String phoneIdEnd){
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
    public PcpDeviceQueryWrapper phoneIdNotBetween(String phoneIdStart,String phoneIdEnd){
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
    public PcpDeviceQueryWrapper phoneIdLike(String phoneId){
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
    public PcpDeviceQueryWrapper phoneIdNotLike(String phoneId){
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
    public PcpDeviceQueryWrapper phoneIdLikeLeft(String phoneId){
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
    public PcpDeviceQueryWrapper phoneIdLikeRight(String phoneId){
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
    public PcpDeviceQueryWrapper phoneIdIsNull(){
        isNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryWrapper phoneIdIsNotNull(){
        isNotNull("phone_id");
        return this;
    }

    /**
     * <p>华为云机id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper phoneIdIn(Collection<String> value){
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
    public PcpDeviceQueryWrapper phoneIdIn(String... values){
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
    public PcpDeviceQueryWrapper phoneIdNotIn(Collection<String> value){
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
    public PcpDeviceQueryWrapper phoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_id",values);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * 等于 =
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressEq(String macAddress){
        if(macAddress!=null){
            eq("macAddress",macAddress);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * 不等于 &lt;&gt;
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressNe(String macAddress){
        if(macAddress!=null){
            ne("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 大于 &gt;
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressGt(String macAddress){
        if(macAddress!=null){
            gt("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 大于等于 &gt;=
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressGe(String macAddress){
        if(macAddress!=null){
            ge("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 小于 &lt;
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressLt(String macAddress){
        if(macAddress!=null){
            lt("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * 小于等于 &lt;=
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressLe(String macAddress){
        if(macAddress!=null){
            le("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * BETWEEN 值1 AND 值2
     * @param macAddressStart       值1
     * @param macAddressEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressBetween(String macAddressStart,String macAddressEnd){
        if(macAddressStart!=null && macAddressEnd!=null){
            between("macAddress",macAddressStart,macAddressEnd);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * NOT BETWEEN 值1 AND 值2
     * @param macAddressStart       值1
     * @param macAddressEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressNotBetween(String macAddressStart,String macAddressEnd){
        if(macAddressStart!=null && macAddressEnd!=null){
            notBetween("macAddress",macAddressStart,macAddressEnd);
        }
        return this;
     }


    /**
     * <p>mac地址</p>
     * LIKE '%值%'
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressLike(String macAddress){
        if(macAddress!=null){
            like("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * NOT LIKE '%值%'
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressNotLike(String macAddress){
        if(macAddress!=null){
            notLike("macAddress",macAddress);
        }
        return this;
     }


    /**
     * <p>mac地址</p>
     * LIKE '%值'
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressLikeLeft(String macAddress){
        if(macAddress!=null){
            likeLeft("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * LIKE '值%'
     * @param macAddress       值
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressLikeRight(String macAddress){
        if(macAddress!=null){
            likeRight("macAddress",macAddress);
        }
        return this;
     }

    /**
     * <p>mac地址</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressIsNull(){
        isNull("macAddress");
        return this;
    }

    /**
     * <p>mac地址</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressIsNotNull(){
        isNotNull("macAddress");
        return this;
    }

    /**
     * <p>mac地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("macAddress",value);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressIn(String... values){
        if(values!=null && values.length>0){
            in("macAddress",values);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("macAddress",value);
        }
        return this;
    }

    /**
     * <p>mac地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper macAddressNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("macAddress",values);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * 等于 =
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlEq(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            eq("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * 不等于 &lt;&gt;
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlNe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            ne("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 大于 &gt;
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlGt(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            gt("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 大于等于 &gt;=
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlGe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            ge("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 小于 &lt;
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlLt(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            lt("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * 小于等于 &lt;=
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlLe(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            le("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * BETWEEN 值1 AND 值2
     * @param endpointPhonesUrlStart       值1
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlBetween(String endpointPhonesUrlStart,String endpointPhonesUrlEnd){
        if(endpointPhonesUrlStart!=null && endpointPhonesUrlEnd!=null){
            between("endpointPhonesUrl",endpointPhonesUrlStart,endpointPhonesUrlEnd);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * NOT BETWEEN 值1 AND 值2
     * @param endpointPhonesUrlStart       值1
     * @param endpointPhonesUrlEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlNotBetween(String endpointPhonesUrlStart,String endpointPhonesUrlEnd){
        if(endpointPhonesUrlStart!=null && endpointPhonesUrlEnd!=null){
            notBetween("endpointPhonesUrl",endpointPhonesUrlStart,endpointPhonesUrlEnd);
        }
        return this;
     }


    /**
     * <p>调用地址</p>
     * LIKE '%值%'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlLike(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            like("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * NOT LIKE '%值%'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlNotLike(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            notLike("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }


    /**
     * <p>调用地址</p>
     * LIKE '%值'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlLikeLeft(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            likeLeft("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * LIKE '值%'
     * @param endpointPhonesUrl       值
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlLikeRight(String endpointPhonesUrl){
        if(endpointPhonesUrl!=null){
            likeRight("endpointPhonesUrl",endpointPhonesUrl);
        }
        return this;
     }

    /**
     * <p>调用地址</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlIsNull(){
        isNull("endpointPhonesUrl");
        return this;
    }

    /**
     * <p>调用地址</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlIsNotNull(){
        isNotNull("endpointPhonesUrl");
        return this;
    }

    /**
     * <p>调用地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("endpointPhonesUrl",value);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlIn(String... values){
        if(values!=null && values.length>0){
            in("endpointPhonesUrl",values);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("endpointPhonesUrl",value);
        }
        return this;
    }

    /**
     * <p>调用地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper endpointPhonesUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpointPhonesUrl",values);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * 等于 =
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdEq(String serverId){
        if(serverId!=null){
            eq("serverId",serverId);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * 不等于 &lt;&gt;
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdNe(String serverId){
        if(serverId!=null){
            ne("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 大于 &gt;
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdGt(String serverId){
        if(serverId!=null){
            gt("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 大于等于 &gt;=
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdGe(String serverId){
        if(serverId!=null){
            ge("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 小于 &lt;
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdLt(String serverId){
        if(serverId!=null){
            lt("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * 小于等于 &lt;=
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdLe(String serverId){
        if(serverId!=null){
            le("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * BETWEEN 值1 AND 值2
     * @param serverIdStart       值1
     * @param serverIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdBetween(String serverIdStart,String serverIdEnd){
        if(serverIdStart!=null && serverIdEnd!=null){
            between("serverId",serverIdStart,serverIdEnd);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param serverIdStart       值1
     * @param serverIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdNotBetween(String serverIdStart,String serverIdEnd){
        if(serverIdStart!=null && serverIdEnd!=null){
            notBetween("serverId",serverIdStart,serverIdEnd);
        }
        return this;
     }


    /**
     * <p>云服务器id</p>
     * LIKE '%值%'
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdLike(String serverId){
        if(serverId!=null){
            like("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * NOT LIKE '%值%'
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdNotLike(String serverId){
        if(serverId!=null){
            notLike("serverId",serverId);
        }
        return this;
     }


    /**
     * <p>云服务器id</p>
     * LIKE '%值'
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdLikeLeft(String serverId){
        if(serverId!=null){
            likeLeft("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * LIKE '值%'
     * @param serverId       值
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdLikeRight(String serverId){
        if(serverId!=null){
            likeRight("serverId",serverId);
        }
        return this;
     }

    /**
     * <p>云服务器id</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdIsNull(){
        isNull("serverId");
        return this;
    }

    /**
     * <p>云服务器id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdIsNotNull(){
        isNotNull("serverId");
        return this;
    }

    /**
     * <p>云服务器id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("serverId",value);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdIn(String... values){
        if(values!=null && values.length>0){
            in("serverId",values);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("serverId",value);
        }
        return this;
    }

    /**
     * <p>云服务器id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper serverIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("serverId",values);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 等于 =
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdEq(String imageId){
        if(imageId!=null){
            eq("imageId",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 不等于 &lt;&gt;
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdNe(String imageId){
        if(imageId!=null){
            ne("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于 &gt;
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdGt(String imageId){
        if(imageId!=null){
            gt("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于等于 &gt;=
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdGe(String imageId){
        if(imageId!=null){
            ge("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于 &lt;
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdLt(String imageId){
        if(imageId!=null){
            lt("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于等于 &lt;=
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdLe(String imageId){
        if(imageId!=null){
            le("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            between("imageId",imageIdStart,imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            notBetween("imageId",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdLike(String imageId){
        if(imageId!=null){
            like("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdNotLike(String imageId){
        if(imageId!=null){
            notLike("imageId",imageId);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值'
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdLikeLeft(String imageId){
        if(imageId!=null){
            likeLeft("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * LIKE '值%'
     * @param imageId       值
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdLikeRight(String imageId){
        if(imageId!=null){
            likeRight("imageId",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdIsNull(){
        isNull("imageId");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdIsNotNull(){
        isNotNull("imageId");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("imageId",value);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdIn(String... values){
        if(values!=null && values.length>0){
            in("imageId",values);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("imageId",value);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("imageId",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public PcpDeviceQueryWrapper createTimeEq(Date createTime){
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
    public PcpDeviceQueryWrapper createTimeNe(Date createTime){
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
    public PcpDeviceQueryWrapper createTimeGt(Date createTime){
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
    public PcpDeviceQueryWrapper createTimeGe(Date createTime){
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
    public PcpDeviceQueryWrapper createTimeLt(Date createTime){
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
    public PcpDeviceQueryWrapper createTimeLe(Date createTime){
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
    public PcpDeviceQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public PcpDeviceQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public PcpDeviceQueryWrapper createTimeLike(Date createTime){
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
    public PcpDeviceQueryWrapper createTimeNotLike(Date createTime){
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
    public PcpDeviceQueryWrapper createTimeLikeLeft(Date createTime){
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
    public PcpDeviceQueryWrapper createTimeLikeRight(Date createTime){
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
    public PcpDeviceQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper createTimeIn(Collection<Date> value){
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
    public PcpDeviceQueryWrapper createTimeIn(Date... values){
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
    public PcpDeviceQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public PcpDeviceQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt;
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值'
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public PcpDeviceQueryWrapper versionIdEq(Long versionId){
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
    public PcpDeviceQueryWrapper versionIdNe(Long versionId){
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
    public PcpDeviceQueryWrapper versionIdGt(Long versionId){
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
    public PcpDeviceQueryWrapper versionIdGe(Long versionId){
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
    public PcpDeviceQueryWrapper versionIdLt(Long versionId){
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
    public PcpDeviceQueryWrapper versionIdLe(Long versionId){
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
    public PcpDeviceQueryWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public PcpDeviceQueryWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public PcpDeviceQueryWrapper versionIdLike(Long versionId){
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
    public PcpDeviceQueryWrapper versionIdNotLike(Long versionId){
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
    public PcpDeviceQueryWrapper versionIdLikeLeft(Long versionId){
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
    public PcpDeviceQueryWrapper versionIdLikeRight(Long versionId){
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
    public PcpDeviceQueryWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper versionIdIn(Collection<Long> value){
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
    public PcpDeviceQueryWrapper versionIdIn(Long... values){
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
    public PcpDeviceQueryWrapper versionIdNotIn(Collection<Long> value){
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
    public PcpDeviceQueryWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 等于 =
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameEq(String phoneModelName){
        if(phoneModelName!=null){
            eq("phone_model_name",phoneModelName);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 不等于 &lt;&gt;
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameNe(String phoneModelName){
        if(phoneModelName!=null){
            ne("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 大于 &gt;
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameGt(String phoneModelName){
        if(phoneModelName!=null){
            gt("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 大于等于 &gt;=
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameGe(String phoneModelName){
        if(phoneModelName!=null){
            ge("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 小于 &lt;
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameLt(String phoneModelName){
        if(phoneModelName!=null){
            lt("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * 小于等于 &lt;=
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameLe(String phoneModelName){
        if(phoneModelName!=null){
            le("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * BETWEEN 值1 AND 值2
     * @param phoneModelNameStart       值1
     * @param phoneModelNameEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameBetween(String phoneModelNameStart,String phoneModelNameEnd){
        if(phoneModelNameStart!=null && phoneModelNameEnd!=null){
            between("phone_model_name",phoneModelNameStart,phoneModelNameEnd);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT BETWEEN 值1 AND 值2
     * @param phoneModelNameStart       值1
     * @param phoneModelNameEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameNotBetween(String phoneModelNameStart,String phoneModelNameEnd){
        if(phoneModelNameStart!=null && phoneModelNameEnd!=null){
            notBetween("phone_model_name",phoneModelNameStart,phoneModelNameEnd);
        }
        return this;
     }


    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '%值%'
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameLike(String phoneModelName){
        if(phoneModelName!=null){
            like("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT LIKE '%值%'
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameNotLike(String phoneModelName){
        if(phoneModelName!=null){
            notLike("phone_model_name",phoneModelName);
        }
        return this;
     }


    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '%值'
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameLikeLeft(String phoneModelName){
        if(phoneModelName!=null){
            likeLeft("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * LIKE '值%'
     * @param phoneModelName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameLikeRight(String phoneModelName){
        if(phoneModelName!=null){
            likeRight("phone_model_name",phoneModelName);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameIsNull(){
        isNull("phone_model_name");
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameIsNotNull(){
        isNotNull("phone_model_name");
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("phone_model_name",value);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameIn(String... values){
        if(values!=null && values.length>0){
            in("phone_model_name",values);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("phone_model_name",value);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper phoneModelNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_model_name",values);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 等于 =
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameEq(String phoneName){
        if(phoneName!=null){
            eq("phone_name",phoneName);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 不等于 &lt;&gt;
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameNe(String phoneName){
        if(phoneName!=null){
            ne("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 大于 &gt;
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameGt(String phoneName){
        if(phoneName!=null){
            gt("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 大于等于 &gt;=
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameGe(String phoneName){
        if(phoneName!=null){
            ge("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 小于 &lt;
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameLt(String phoneName){
        if(phoneName!=null){
            lt("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * 小于等于 &lt;=
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameLe(String phoneName){
        if(phoneName!=null){
            le("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * BETWEEN 值1 AND 值2
     * @param phoneNameStart       值1
     * @param phoneNameEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameBetween(String phoneNameStart,String phoneNameEnd){
        if(phoneNameStart!=null && phoneNameEnd!=null){
            between("phone_name",phoneNameStart,phoneNameEnd);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param phoneNameStart       值1
     * @param phoneNameEnd      值2
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameNotBetween(String phoneNameStart,String phoneNameEnd){
        if(phoneNameStart!=null && phoneNameEnd!=null){
            notBetween("phone_name",phoneNameStart,phoneNameEnd);
        }
        return this;
     }


    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '%值%'
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameLike(String phoneName){
        if(phoneName!=null){
            like("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT LIKE '%值%'
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameNotLike(String phoneName){
        if(phoneName!=null){
            notLike("phone_name",phoneName);
        }
        return this;
     }


    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '%值'
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameLikeLeft(String phoneName){
        if(phoneName!=null){
            likeLeft("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * LIKE '值%'
     * @param phoneName       值
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameLikeRight(String phoneName){
        if(phoneName!=null){
            likeRight("phone_name",phoneName);
        }
        return this;
     }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * IS NULL
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameIsNull(){
        isNull("phone_name");
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * IS NOT NULL
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameIsNotNull(){
        isNotNull("phone_name");
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("phone_name",value);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameIn(String... values){
        if(values!=null && values.length>0){
            in("phone_name",values);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("phone_name",value);
        }
        return this;
    }

    /**
     * <p>云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public PcpDeviceQueryWrapper phoneNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_name",values);
        }
        return this;
    }


}
