package com.suqi.center.machine.dao.viz.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineStreams;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 机器streaming端口映射
 * </p>
 * "viz_mc_machine_streams"
 * @author PC001
 */
public class VizMcMachineStreamsUpdateWrapper extends UpdateWrapper<VizMcMachineStreams> {

    public static VizMcMachineStreamsUpdateWrapper wrapper() {
        return new VizMcMachineStreamsUpdateWrapper();
    }

    public VizMcMachineStreamsUpdateWrapper() {
        super();
    }

    public VizMcMachineStreamsUpdateWrapper(VizMcMachineStreams entity) {
        super(entity);
    }

    /**
     * 
     */
    public VizMcMachineStreamsUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 机器基础信息表记录id
     */
    public VizMcMachineStreamsUpdateWrapper setFkMcMachineId(Long fkMcMachineId) {
         set("fk_mc_machine_id",fkMcMachineId);
        return this;
    }
    /**
     * 设备唯一码
     */
    public VizMcMachineStreamsUpdateWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 实例Id
     */
    public VizMcMachineStreamsUpdateWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 状态：idle、busy
     */
    public VizMcMachineStreamsUpdateWrapper setStatus(String status) {
         set("status",status);
        return this;
    }
    /**
     * 内网ip
     */
    public VizMcMachineStreamsUpdateWrapper setInternalAddress(String internalAddress) {
         set("internal_address",internalAddress);
        return this;
    }
    /**
     * 内网音频端口
     */
    public VizMcMachineStreamsUpdateWrapper setInternalAport(Integer internalAport) {
         set("internal_aport",internalAport);
        return this;
    }
    /**
     * 内网音频端口类型
     */
    public VizMcMachineStreamsUpdateWrapper setInternalAtype(Integer internalAtype) {
         set("internal_atype",internalAtype);
        return this;
    }
    /**
     * 内网视频端口
     */
    public VizMcMachineStreamsUpdateWrapper setInternalVport(Integer internalVport) {
         set("internal_vport",internalVport);
        return this;
    }
    /**
     * 外网ip
     */
    public VizMcMachineStreamsUpdateWrapper setExternalAddress(String externalAddress) {
         set("external_address",externalAddress);
        return this;
    }
    /**
     * 外网音频端口
     */
    public VizMcMachineStreamsUpdateWrapper setExternalAport(Integer externalAport) {
         set("external_aport",externalAport);
        return this;
    }
    /**
     * 外网音频端口类型
     */
    public VizMcMachineStreamsUpdateWrapper setExternalAtype(Integer externalAtype) {
         set("external_atype",externalAtype);
        return this;
    }
    /**
     * 外网视频端口
     */
    public VizMcMachineStreamsUpdateWrapper setExternalVport(Integer externalVport) {
         set("external_vport",externalVport);
        return this;
    }
    /**
     * 创建时间
     */
    public VizMcMachineStreamsUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public VizMcMachineStreamsUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 逻辑删除-默认dr=50，(50：正常，-50：删除)
     */
    public VizMcMachineStreamsUpdateWrapper setDr(Integer dr) {
         set("dr",dr);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper idEq(Long id){
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
    public VizMcMachineStreamsUpdateWrapper idNe(Long id){
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
    public VizMcMachineStreamsUpdateWrapper idGt(Long id){
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
    public VizMcMachineStreamsUpdateWrapper idGe(Long id){
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
    public VizMcMachineStreamsUpdateWrapper idLt(Long id){
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
    public VizMcMachineStreamsUpdateWrapper idLe(Long id){
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
    public VizMcMachineStreamsUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public VizMcMachineStreamsUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public VizMcMachineStreamsUpdateWrapper idLike(Long id){
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
    public VizMcMachineStreamsUpdateWrapper idNotLike(Long id){
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
    public VizMcMachineStreamsUpdateWrapper idLikeLeft(Long id){
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
    public VizMcMachineStreamsUpdateWrapper idLikeRight(Long id){
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
    public VizMcMachineStreamsUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper idIn(Collection<Long> value){
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
    public VizMcMachineStreamsUpdateWrapper idIn(Long... values){
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
    public VizMcMachineStreamsUpdateWrapper idNotIn(Collection<Long> value){
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
    public VizMcMachineStreamsUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * 等于 = fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdEq(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            eq("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * 不等于 &lt;&gt; fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdNe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            ne("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 大于 &gt; fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdGt(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            gt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 大于等于 &gt;= fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdGe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            ge("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 小于 &lt; fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdLt(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            lt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 小于等于 &lt;= fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdLe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            le("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcMachineIdStart       值1
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
        if(fkMcMachineIdStart!=null && fkMcMachineIdEnd!=null){
            between("fk_mc_machine_id",fkMcMachineIdStart,fkMcMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcMachineIdStart       值1
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
        if(fkMcMachineIdStart!=null && fkMcMachineIdEnd!=null){
            notBetween("fk_mc_machine_id",fkMcMachineIdStart,fkMcMachineIdEnd);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '%值%' fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdLike(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            like("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * NOT LIKE '%值%' fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            notLike("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '%值' fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            likeLeft("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '值%' fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            likeRight("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_machine_id",value);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_machine_id",values);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_machine_id",value);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper fkMcMachineIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_machine_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = deviceId
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper deviceIdEq(String deviceId){
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
    public VizMcMachineStreamsUpdateWrapper deviceIdNe(String deviceId){
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
    public VizMcMachineStreamsUpdateWrapper deviceIdGt(String deviceId){
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
    public VizMcMachineStreamsUpdateWrapper deviceIdGe(String deviceId){
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
    public VizMcMachineStreamsUpdateWrapper deviceIdLt(String deviceId){
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
    public VizMcMachineStreamsUpdateWrapper deviceIdLe(String deviceId){
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
    public VizMcMachineStreamsUpdateWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineStreamsUpdateWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineStreamsUpdateWrapper deviceIdLike(String deviceId){
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
    public VizMcMachineStreamsUpdateWrapper deviceIdNotLike(String deviceId){
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
    public VizMcMachineStreamsUpdateWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcMachineStreamsUpdateWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcMachineStreamsUpdateWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper deviceIdIn(Collection<String> value){
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
    public VizMcMachineStreamsUpdateWrapper deviceIdIn(String... values){
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
    public VizMcMachineStreamsUpdateWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcMachineStreamsUpdateWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 等于 = instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 不等于 &lt;&gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于 &gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于等于 &gt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于 &lt; instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于等于 &lt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * LIKE '值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdLikeRight(String instanceId){
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("instance_id",values);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusEq(String status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusNe(String status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusGt(String status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusGe(String status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusLt(String status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusLe(String status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusBetween(String statusStart,String statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusNotBetween(String statusStart,String statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态：idle、busy</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusLike(String status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusNotLike(String status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态：idle、busy</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusLikeLeft(String status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusLikeRight(String status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusIn(String... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper statusNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>内网ip</p>
     * 等于 = internalAddress
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressEq(String internalAddress){
        if(internalAddress!=null){
            eq("internal_address",internalAddress);
        }
        return this;
    }

    /**
     * <p>内网ip</p>
     * 不等于 &lt;&gt; internalAddress
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressNe(String internalAddress){
        if(internalAddress!=null){
            ne("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 大于 &gt; internalAddress
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressGt(String internalAddress){
        if(internalAddress!=null){
            gt("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 大于等于 &gt;= internalAddress
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressGe(String internalAddress){
        if(internalAddress!=null){
            ge("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 小于 &lt; internalAddress
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressLt(String internalAddress){
        if(internalAddress!=null){
            lt("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 小于等于 &lt;= internalAddress
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressLe(String internalAddress){
        if(internalAddress!=null){
            le("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * BETWEEN 值1 AND 值2
     * @param internalAddressStart       值1
     * @param internalAddressEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressBetween(String internalAddressStart,String internalAddressEnd){
        if(internalAddressStart!=null && internalAddressEnd!=null){
            between("internal_address",internalAddressStart,internalAddressEnd);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * NOT BETWEEN 值1 AND 值2
     * @param internalAddressStart       值1
     * @param internalAddressEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressNotBetween(String internalAddressStart,String internalAddressEnd){
        if(internalAddressStart!=null && internalAddressEnd!=null){
            notBetween("internal_address",internalAddressStart,internalAddressEnd);
        }
        return this;
     }


    /**
     * <p>内网ip</p>
     * LIKE '%值%' internalAddress
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressLike(String internalAddress){
        if(internalAddress!=null){
            like("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * NOT LIKE '%值%' internalAddress
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressNotLike(String internalAddress){
        if(internalAddress!=null){
            notLike("internal_address",internalAddress);
        }
        return this;
     }


    /**
     * <p>内网ip</p>
     * LIKE '%值' internalAddress
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressLikeLeft(String internalAddress){
        if(internalAddress!=null){
            likeLeft("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * LIKE '值%' internalAddress
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressLikeRight(String internalAddress){
        if(internalAddress!=null){
            likeRight("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressIsNull(){
        isNull("internal_address");
        return this;
    }

    /**
     * <p>内网ip</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressIsNotNull(){
        isNotNull("internal_address");
        return this;
    }

    /**
     * <p>内网ip</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("internal_address",value);
        }
        return this;
    }

    /**
     * <p>内网ip</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressIn(String... values){
        if(values!=null && values.length>0){
            in("internal_address",values);
        }
        return this;
    }

    /**
     * <p>内网ip</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("internal_address",value);
        }
        return this;
    }

    /**
     * <p>内网ip</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAddressNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("internal_address",values);
        }
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * 等于 = internalAport
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportEq(Integer internalAport){
        if(internalAport!=null){
            eq("internal_aport",internalAport);
        }
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * 不等于 &lt;&gt; internalAport
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportNe(Integer internalAport){
        if(internalAport!=null){
            ne("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 大于 &gt; internalAport
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportGt(Integer internalAport){
        if(internalAport!=null){
            gt("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 大于等于 &gt;= internalAport
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportGe(Integer internalAport){
        if(internalAport!=null){
            ge("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 小于 &lt; internalAport
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportLt(Integer internalAport){
        if(internalAport!=null){
            lt("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 小于等于 &lt;= internalAport
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportLe(Integer internalAport){
        if(internalAport!=null){
            le("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * BETWEEN 值1 AND 值2
     * @param internalAportStart       值1
     * @param internalAportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportBetween(Integer internalAportStart,Integer internalAportEnd){
        if(internalAportStart!=null && internalAportEnd!=null){
            between("internal_aport",internalAportStart,internalAportEnd);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * NOT BETWEEN 值1 AND 值2
     * @param internalAportStart       值1
     * @param internalAportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportNotBetween(Integer internalAportStart,Integer internalAportEnd){
        if(internalAportStart!=null && internalAportEnd!=null){
            notBetween("internal_aport",internalAportStart,internalAportEnd);
        }
        return this;
     }


    /**
     * <p>内网音频端口</p>
     * LIKE '%值%' internalAport
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportLike(Integer internalAport){
        if(internalAport!=null){
            like("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * NOT LIKE '%值%' internalAport
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportNotLike(Integer internalAport){
        if(internalAport!=null){
            notLike("internal_aport",internalAport);
        }
        return this;
     }


    /**
     * <p>内网音频端口</p>
     * LIKE '%值' internalAport
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportLikeLeft(Integer internalAport){
        if(internalAport!=null){
            likeLeft("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * LIKE '值%' internalAport
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportLikeRight(Integer internalAport){
        if(internalAport!=null){
            likeRight("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportIsNull(){
        isNull("internal_aport");
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportIsNotNull(){
        isNotNull("internal_aport");
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("internal_aport",value);
        }
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportIn(Integer... values){
        if(values!=null && values.length>0){
            in("internal_aport",values);
        }
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("internal_aport",value);
        }
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAportNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("internal_aport",values);
        }
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * 等于 = internalAtype
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeEq(Integer internalAtype){
        if(internalAtype!=null){
            eq("internal_atype",internalAtype);
        }
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * 不等于 &lt;&gt; internalAtype
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeNe(Integer internalAtype){
        if(internalAtype!=null){
            ne("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 大于 &gt; internalAtype
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeGt(Integer internalAtype){
        if(internalAtype!=null){
            gt("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 大于等于 &gt;= internalAtype
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeGe(Integer internalAtype){
        if(internalAtype!=null){
            ge("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 小于 &lt; internalAtype
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeLt(Integer internalAtype){
        if(internalAtype!=null){
            lt("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 小于等于 &lt;= internalAtype
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeLe(Integer internalAtype){
        if(internalAtype!=null){
            le("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * BETWEEN 值1 AND 值2
     * @param internalAtypeStart       值1
     * @param internalAtypeEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeBetween(Integer internalAtypeStart,Integer internalAtypeEnd){
        if(internalAtypeStart!=null && internalAtypeEnd!=null){
            between("internal_atype",internalAtypeStart,internalAtypeEnd);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * NOT BETWEEN 值1 AND 值2
     * @param internalAtypeStart       值1
     * @param internalAtypeEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeNotBetween(Integer internalAtypeStart,Integer internalAtypeEnd){
        if(internalAtypeStart!=null && internalAtypeEnd!=null){
            notBetween("internal_atype",internalAtypeStart,internalAtypeEnd);
        }
        return this;
     }


    /**
     * <p>内网音频端口类型</p>
     * LIKE '%值%' internalAtype
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeLike(Integer internalAtype){
        if(internalAtype!=null){
            like("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * NOT LIKE '%值%' internalAtype
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeNotLike(Integer internalAtype){
        if(internalAtype!=null){
            notLike("internal_atype",internalAtype);
        }
        return this;
     }


    /**
     * <p>内网音频端口类型</p>
     * LIKE '%值' internalAtype
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeLikeLeft(Integer internalAtype){
        if(internalAtype!=null){
            likeLeft("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * LIKE '值%' internalAtype
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeLikeRight(Integer internalAtype){
        if(internalAtype!=null){
            likeRight("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeIsNull(){
        isNull("internal_atype");
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeIsNotNull(){
        isNotNull("internal_atype");
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("internal_atype",value);
        }
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("internal_atype",values);
        }
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("internal_atype",value);
        }
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalAtypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("internal_atype",values);
        }
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * 等于 = internalVport
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportEq(Integer internalVport){
        if(internalVport!=null){
            eq("internal_vport",internalVport);
        }
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * 不等于 &lt;&gt; internalVport
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportNe(Integer internalVport){
        if(internalVport!=null){
            ne("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 大于 &gt; internalVport
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportGt(Integer internalVport){
        if(internalVport!=null){
            gt("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 大于等于 &gt;= internalVport
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportGe(Integer internalVport){
        if(internalVport!=null){
            ge("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 小于 &lt; internalVport
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportLt(Integer internalVport){
        if(internalVport!=null){
            lt("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 小于等于 &lt;= internalVport
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportLe(Integer internalVport){
        if(internalVport!=null){
            le("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * BETWEEN 值1 AND 值2
     * @param internalVportStart       值1
     * @param internalVportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportBetween(Integer internalVportStart,Integer internalVportEnd){
        if(internalVportStart!=null && internalVportEnd!=null){
            between("internal_vport",internalVportStart,internalVportEnd);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * NOT BETWEEN 值1 AND 值2
     * @param internalVportStart       值1
     * @param internalVportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportNotBetween(Integer internalVportStart,Integer internalVportEnd){
        if(internalVportStart!=null && internalVportEnd!=null){
            notBetween("internal_vport",internalVportStart,internalVportEnd);
        }
        return this;
     }


    /**
     * <p>内网视频端口</p>
     * LIKE '%值%' internalVport
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportLike(Integer internalVport){
        if(internalVport!=null){
            like("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * NOT LIKE '%值%' internalVport
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportNotLike(Integer internalVport){
        if(internalVport!=null){
            notLike("internal_vport",internalVport);
        }
        return this;
     }


    /**
     * <p>内网视频端口</p>
     * LIKE '%值' internalVport
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportLikeLeft(Integer internalVport){
        if(internalVport!=null){
            likeLeft("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * LIKE '值%' internalVport
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportLikeRight(Integer internalVport){
        if(internalVport!=null){
            likeRight("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportIsNull(){
        isNull("internal_vport");
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportIsNotNull(){
        isNotNull("internal_vport");
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("internal_vport",value);
        }
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportIn(Integer... values){
        if(values!=null && values.length>0){
            in("internal_vport",values);
        }
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("internal_vport",value);
        }
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper internalVportNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("internal_vport",values);
        }
        return this;
    }

    /**
     * <p>外网ip</p>
     * 等于 = externalAddress
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressEq(String externalAddress){
        if(externalAddress!=null){
            eq("external_address",externalAddress);
        }
        return this;
    }

    /**
     * <p>外网ip</p>
     * 不等于 &lt;&gt; externalAddress
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressNe(String externalAddress){
        if(externalAddress!=null){
            ne("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 大于 &gt; externalAddress
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressGt(String externalAddress){
        if(externalAddress!=null){
            gt("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 大于等于 &gt;= externalAddress
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressGe(String externalAddress){
        if(externalAddress!=null){
            ge("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 小于 &lt; externalAddress
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressLt(String externalAddress){
        if(externalAddress!=null){
            lt("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 小于等于 &lt;= externalAddress
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressLe(String externalAddress){
        if(externalAddress!=null){
            le("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * BETWEEN 值1 AND 值2
     * @param externalAddressStart       值1
     * @param externalAddressEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressBetween(String externalAddressStart,String externalAddressEnd){
        if(externalAddressStart!=null && externalAddressEnd!=null){
            between("external_address",externalAddressStart,externalAddressEnd);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * NOT BETWEEN 值1 AND 值2
     * @param externalAddressStart       值1
     * @param externalAddressEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressNotBetween(String externalAddressStart,String externalAddressEnd){
        if(externalAddressStart!=null && externalAddressEnd!=null){
            notBetween("external_address",externalAddressStart,externalAddressEnd);
        }
        return this;
     }


    /**
     * <p>外网ip</p>
     * LIKE '%值%' externalAddress
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressLike(String externalAddress){
        if(externalAddress!=null){
            like("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * NOT LIKE '%值%' externalAddress
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressNotLike(String externalAddress){
        if(externalAddress!=null){
            notLike("external_address",externalAddress);
        }
        return this;
     }


    /**
     * <p>外网ip</p>
     * LIKE '%值' externalAddress
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressLikeLeft(String externalAddress){
        if(externalAddress!=null){
            likeLeft("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * LIKE '值%' externalAddress
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressLikeRight(String externalAddress){
        if(externalAddress!=null){
            likeRight("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressIsNull(){
        isNull("external_address");
        return this;
    }

    /**
     * <p>外网ip</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressIsNotNull(){
        isNotNull("external_address");
        return this;
    }

    /**
     * <p>外网ip</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("external_address",value);
        }
        return this;
    }

    /**
     * <p>外网ip</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressIn(String... values){
        if(values!=null && values.length>0){
            in("external_address",values);
        }
        return this;
    }

    /**
     * <p>外网ip</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("external_address",value);
        }
        return this;
    }

    /**
     * <p>外网ip</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAddressNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("external_address",values);
        }
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * 等于 = externalAport
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportEq(Integer externalAport){
        if(externalAport!=null){
            eq("external_aport",externalAport);
        }
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * 不等于 &lt;&gt; externalAport
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportNe(Integer externalAport){
        if(externalAport!=null){
            ne("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 大于 &gt; externalAport
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportGt(Integer externalAport){
        if(externalAport!=null){
            gt("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 大于等于 &gt;= externalAport
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportGe(Integer externalAport){
        if(externalAport!=null){
            ge("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 小于 &lt; externalAport
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportLt(Integer externalAport){
        if(externalAport!=null){
            lt("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 小于等于 &lt;= externalAport
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportLe(Integer externalAport){
        if(externalAport!=null){
            le("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * BETWEEN 值1 AND 值2
     * @param externalAportStart       值1
     * @param externalAportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportBetween(Integer externalAportStart,Integer externalAportEnd){
        if(externalAportStart!=null && externalAportEnd!=null){
            between("external_aport",externalAportStart,externalAportEnd);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * NOT BETWEEN 值1 AND 值2
     * @param externalAportStart       值1
     * @param externalAportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportNotBetween(Integer externalAportStart,Integer externalAportEnd){
        if(externalAportStart!=null && externalAportEnd!=null){
            notBetween("external_aport",externalAportStart,externalAportEnd);
        }
        return this;
     }


    /**
     * <p>外网音频端口</p>
     * LIKE '%值%' externalAport
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportLike(Integer externalAport){
        if(externalAport!=null){
            like("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * NOT LIKE '%值%' externalAport
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportNotLike(Integer externalAport){
        if(externalAport!=null){
            notLike("external_aport",externalAport);
        }
        return this;
     }


    /**
     * <p>外网音频端口</p>
     * LIKE '%值' externalAport
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportLikeLeft(Integer externalAport){
        if(externalAport!=null){
            likeLeft("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * LIKE '值%' externalAport
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportLikeRight(Integer externalAport){
        if(externalAport!=null){
            likeRight("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportIsNull(){
        isNull("external_aport");
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportIsNotNull(){
        isNotNull("external_aport");
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("external_aport",value);
        }
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportIn(Integer... values){
        if(values!=null && values.length>0){
            in("external_aport",values);
        }
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("external_aport",value);
        }
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAportNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("external_aport",values);
        }
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * 等于 = externalAtype
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeEq(Integer externalAtype){
        if(externalAtype!=null){
            eq("external_atype",externalAtype);
        }
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * 不等于 &lt;&gt; externalAtype
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeNe(Integer externalAtype){
        if(externalAtype!=null){
            ne("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 大于 &gt; externalAtype
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeGt(Integer externalAtype){
        if(externalAtype!=null){
            gt("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 大于等于 &gt;= externalAtype
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeGe(Integer externalAtype){
        if(externalAtype!=null){
            ge("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 小于 &lt; externalAtype
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeLt(Integer externalAtype){
        if(externalAtype!=null){
            lt("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 小于等于 &lt;= externalAtype
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeLe(Integer externalAtype){
        if(externalAtype!=null){
            le("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * BETWEEN 值1 AND 值2
     * @param externalAtypeStart       值1
     * @param externalAtypeEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeBetween(Integer externalAtypeStart,Integer externalAtypeEnd){
        if(externalAtypeStart!=null && externalAtypeEnd!=null){
            between("external_atype",externalAtypeStart,externalAtypeEnd);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * NOT BETWEEN 值1 AND 值2
     * @param externalAtypeStart       值1
     * @param externalAtypeEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeNotBetween(Integer externalAtypeStart,Integer externalAtypeEnd){
        if(externalAtypeStart!=null && externalAtypeEnd!=null){
            notBetween("external_atype",externalAtypeStart,externalAtypeEnd);
        }
        return this;
     }


    /**
     * <p>外网音频端口类型</p>
     * LIKE '%值%' externalAtype
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeLike(Integer externalAtype){
        if(externalAtype!=null){
            like("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * NOT LIKE '%值%' externalAtype
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeNotLike(Integer externalAtype){
        if(externalAtype!=null){
            notLike("external_atype",externalAtype);
        }
        return this;
     }


    /**
     * <p>外网音频端口类型</p>
     * LIKE '%值' externalAtype
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeLikeLeft(Integer externalAtype){
        if(externalAtype!=null){
            likeLeft("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * LIKE '值%' externalAtype
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeLikeRight(Integer externalAtype){
        if(externalAtype!=null){
            likeRight("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeIsNull(){
        isNull("external_atype");
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeIsNotNull(){
        isNotNull("external_atype");
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("external_atype",value);
        }
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("external_atype",values);
        }
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("external_atype",value);
        }
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalAtypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("external_atype",values);
        }
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * 等于 = externalVport
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportEq(Integer externalVport){
        if(externalVport!=null){
            eq("external_vport",externalVport);
        }
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * 不等于 &lt;&gt; externalVport
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportNe(Integer externalVport){
        if(externalVport!=null){
            ne("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 大于 &gt; externalVport
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportGt(Integer externalVport){
        if(externalVport!=null){
            gt("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 大于等于 &gt;= externalVport
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportGe(Integer externalVport){
        if(externalVport!=null){
            ge("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 小于 &lt; externalVport
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportLt(Integer externalVport){
        if(externalVport!=null){
            lt("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 小于等于 &lt;= externalVport
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportLe(Integer externalVport){
        if(externalVport!=null){
            le("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * BETWEEN 值1 AND 值2
     * @param externalVportStart       值1
     * @param externalVportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportBetween(Integer externalVportStart,Integer externalVportEnd){
        if(externalVportStart!=null && externalVportEnd!=null){
            between("external_vport",externalVportStart,externalVportEnd);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * NOT BETWEEN 值1 AND 值2
     * @param externalVportStart       值1
     * @param externalVportEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportNotBetween(Integer externalVportStart,Integer externalVportEnd){
        if(externalVportStart!=null && externalVportEnd!=null){
            notBetween("external_vport",externalVportStart,externalVportEnd);
        }
        return this;
     }


    /**
     * <p>外网视频端口</p>
     * LIKE '%值%' externalVport
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportLike(Integer externalVport){
        if(externalVport!=null){
            like("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * NOT LIKE '%值%' externalVport
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportNotLike(Integer externalVport){
        if(externalVport!=null){
            notLike("external_vport",externalVport);
        }
        return this;
     }


    /**
     * <p>外网视频端口</p>
     * LIKE '%值' externalVport
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportLikeLeft(Integer externalVport){
        if(externalVport!=null){
            likeLeft("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * LIKE '值%' externalVport
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportLikeRight(Integer externalVport){
        if(externalVport!=null){
            likeRight("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportIsNull(){
        isNull("external_vport");
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportIsNotNull(){
        isNotNull("external_vport");
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("external_vport",value);
        }
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportIn(Integer... values){
        if(values!=null && values.length>0){
            in("external_vport",values);
        }
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("external_vport",value);
        }
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper externalVportNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("external_vport",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper createTimeEq(Date createTime){
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
    public VizMcMachineStreamsUpdateWrapper createTimeNe(Date createTime){
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
    public VizMcMachineStreamsUpdateWrapper createTimeGt(Date createTime){
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
    public VizMcMachineStreamsUpdateWrapper createTimeGe(Date createTime){
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
    public VizMcMachineStreamsUpdateWrapper createTimeLt(Date createTime){
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
    public VizMcMachineStreamsUpdateWrapper createTimeLe(Date createTime){
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
    public VizMcMachineStreamsUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineStreamsUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineStreamsUpdateWrapper createTimeLike(Date createTime){
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
    public VizMcMachineStreamsUpdateWrapper createTimeNotLike(Date createTime){
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
    public VizMcMachineStreamsUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcMachineStreamsUpdateWrapper createTimeLikeRight(Date createTime){
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
    public VizMcMachineStreamsUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper createTimeIn(Collection<Date> value){
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
    public VizMcMachineStreamsUpdateWrapper createTimeIn(Date... values){
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
    public VizMcMachineStreamsUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcMachineStreamsUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public VizMcMachineStreamsUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 等于 = dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drEq(Integer dr){
        if(dr!=null){
            eq("dr",dr);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 不等于 &lt;&gt; dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drNe(Integer dr){
        if(dr!=null){
            ne("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 大于 &gt; dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drGt(Integer dr){
        if(dr!=null){
            gt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 大于等于 &gt;= dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drGe(Integer dr){
        if(dr!=null){
            ge("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 小于 &lt; dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drLt(Integer dr){
        if(dr!=null){
            lt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 小于等于 &lt;= dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drLe(Integer dr){
        if(dr!=null){
            le("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * BETWEEN 值1 AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drBetween(Integer drStart,Integer drEnd){
        if(drStart!=null && drEnd!=null){
            between("dr",drStart,drEnd);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drNotBetween(Integer drStart,Integer drEnd){
        if(drStart!=null && drEnd!=null){
            notBetween("dr",drStart,drEnd);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * LIKE '%值%' dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drLike(Integer dr){
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * NOT LIKE '%值%' dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drNotLike(Integer dr){
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * LIKE '%值' dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drLikeLeft(Integer dr){
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * LIKE '值%' dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drLikeRight(Integer dr){
        if(dr!=null){
            likeRight("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dr",value);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drIn(Integer... values){
        if(values!=null && values.length>0){
            in("dr",values);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dr",value);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsUpdateWrapper drNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dr",values);
        }
        return this;
    }


}
