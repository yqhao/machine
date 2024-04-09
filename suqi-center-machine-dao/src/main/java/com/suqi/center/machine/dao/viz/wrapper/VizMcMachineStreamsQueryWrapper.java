package com.suqi.center.machine.dao.viz.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineStreams;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 机器streaming端口映射
 * </p>
 * "viz_mc_machine_streams"
 * @author PC001
 */
public class VizMcMachineStreamsQueryWrapper extends QueryWrapper<VizMcMachineStreams> {


    public static VizMcMachineStreamsQueryWrapper wrapper() {
        return new VizMcMachineStreamsQueryWrapper();
    }

    public VizMcMachineStreamsQueryWrapper() {
        super();
    }

    public VizMcMachineStreamsQueryWrapper(VizMcMachineStreams entity) {
        super(entity);
    }

    public VizMcMachineStreamsQueryWrapper(VizMcMachineStreams entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public VizMcMachineStreamsQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public VizMcMachineStreamsQueryWrapper selectColumns(Consumer<VizMcMachineStreamsSelect> consumer) {
        VizMcMachineStreamsSelect select = new VizMcMachineStreamsSelect();
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
    public VizMcMachineStreamsQueryWrapper idEq(Long id){
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
    public VizMcMachineStreamsQueryWrapper idNe(Long id){
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
    public VizMcMachineStreamsQueryWrapper idGt(Long id){
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
    public VizMcMachineStreamsQueryWrapper idGe(Long id){
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
    public VizMcMachineStreamsQueryWrapper idLt(Long id){
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
    public VizMcMachineStreamsQueryWrapper idLe(Long id){
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
    public VizMcMachineStreamsQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public VizMcMachineStreamsQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public VizMcMachineStreamsQueryWrapper idLike(Long id){
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
    public VizMcMachineStreamsQueryWrapper idNotLike(Long id){
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
    public VizMcMachineStreamsQueryWrapper idLikeLeft(Long id){
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
    public VizMcMachineStreamsQueryWrapper idLikeRight(Long id){
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
    public VizMcMachineStreamsQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper idIn(Collection<Long> value){
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
    public VizMcMachineStreamsQueryWrapper idIn(Long... values){
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
    public VizMcMachineStreamsQueryWrapper idNotIn(Collection<Long> value){
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
    public VizMcMachineStreamsQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * 等于 =
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdEq(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            eq("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * 不等于 &lt;&gt;
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdNe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            ne("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 大于 &gt;
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdGt(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            gt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 大于等于 &gt;=
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdGe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            ge("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 小于 &lt;
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdLt(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            lt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 小于等于 &lt;=
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdLe(Long fkMcMachineId){
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
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
        if(fkMcMachineIdStart!=null && fkMcMachineIdEnd!=null){
            notBetween("fk_mc_machine_id",fkMcMachineIdStart,fkMcMachineIdEnd);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '%值%'
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdLike(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            like("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * NOT LIKE '%值%'
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            notLike("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '%值'
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            likeLeft("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '值%'
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
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
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdIn(Collection<Long> value){
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
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdIn(Long... values){
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
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdNotIn(Collection<Long> value){
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
    public VizMcMachineStreamsQueryWrapper fkMcMachineIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_machine_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper deviceIdEq(String deviceId){
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
    public VizMcMachineStreamsQueryWrapper deviceIdNe(String deviceId){
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
    public VizMcMachineStreamsQueryWrapper deviceIdGt(String deviceId){
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
    public VizMcMachineStreamsQueryWrapper deviceIdGe(String deviceId){
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
    public VizMcMachineStreamsQueryWrapper deviceIdLt(String deviceId){
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
    public VizMcMachineStreamsQueryWrapper deviceIdLe(String deviceId){
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
    public VizMcMachineStreamsQueryWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineStreamsQueryWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineStreamsQueryWrapper deviceIdLike(String deviceId){
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
    public VizMcMachineStreamsQueryWrapper deviceIdNotLike(String deviceId){
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
    public VizMcMachineStreamsQueryWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcMachineStreamsQueryWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcMachineStreamsQueryWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper deviceIdIn(Collection<String> value){
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
    public VizMcMachineStreamsQueryWrapper deviceIdIn(String... values){
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
    public VizMcMachineStreamsQueryWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcMachineStreamsQueryWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 不等于 &lt;&gt;
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于 &gt;
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于等于 &gt;=
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于 &lt;
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于等于 &lt;=
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper instanceIdLe(String instanceId){
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
    public VizMcMachineStreamsQueryWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
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
    public VizMcMachineStreamsQueryWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * LIKE '值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper instanceIdLikeRight(String instanceId){
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
    public VizMcMachineStreamsQueryWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper instanceIdIn(Collection<String> value){
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
    public VizMcMachineStreamsQueryWrapper instanceIdIn(String... values){
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
    public VizMcMachineStreamsQueryWrapper instanceIdNotIn(Collection<String> value){
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
    public VizMcMachineStreamsQueryWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper statusEq(String status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper statusNe(String status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper statusGt(String status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper statusGe(String status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper statusLt(String status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper statusLe(String status){
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
    public VizMcMachineStreamsQueryWrapper statusBetween(String statusStart,String statusEnd){
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
    public VizMcMachineStreamsQueryWrapper statusNotBetween(String statusStart,String statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态：idle、busy</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper statusLike(String status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper statusNotLike(String status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态：idle、busy</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper statusLikeLeft(String status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态：idle、busy</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper statusLikeRight(String status){
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
    public VizMcMachineStreamsQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态：idle、busy</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper statusIn(Collection<String> value){
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
    public VizMcMachineStreamsQueryWrapper statusIn(String... values){
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
    public VizMcMachineStreamsQueryWrapper statusNotIn(Collection<String> value){
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
    public VizMcMachineStreamsQueryWrapper statusNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>内网ip</p>
     * 等于 =
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAddressEq(String internalAddress){
        if(internalAddress!=null){
            eq("internal_address",internalAddress);
        }
        return this;
    }

    /**
     * <p>内网ip</p>
     * 不等于 &lt;&gt;
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAddressNe(String internalAddress){
        if(internalAddress!=null){
            ne("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 大于 &gt;
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAddressGt(String internalAddress){
        if(internalAddress!=null){
            gt("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 大于等于 &gt;=
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAddressGe(String internalAddress){
        if(internalAddress!=null){
            ge("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 小于 &lt;
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAddressLt(String internalAddress){
        if(internalAddress!=null){
            lt("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * 小于等于 &lt;=
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAddressLe(String internalAddress){
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
    public VizMcMachineStreamsQueryWrapper internalAddressBetween(String internalAddressStart,String internalAddressEnd){
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
    public VizMcMachineStreamsQueryWrapper internalAddressNotBetween(String internalAddressStart,String internalAddressEnd){
        if(internalAddressStart!=null && internalAddressEnd!=null){
            notBetween("internal_address",internalAddressStart,internalAddressEnd);
        }
        return this;
     }


    /**
     * <p>内网ip</p>
     * LIKE '%值%'
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAddressLike(String internalAddress){
        if(internalAddress!=null){
            like("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * NOT LIKE '%值%'
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAddressNotLike(String internalAddress){
        if(internalAddress!=null){
            notLike("internal_address",internalAddress);
        }
        return this;
     }


    /**
     * <p>内网ip</p>
     * LIKE '%值'
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAddressLikeLeft(String internalAddress){
        if(internalAddress!=null){
            likeLeft("internal_address",internalAddress);
        }
        return this;
     }

    /**
     * <p>内网ip</p>
     * LIKE '值%'
     * @param internalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAddressLikeRight(String internalAddress){
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
    public VizMcMachineStreamsQueryWrapper internalAddressIsNull(){
        isNull("internal_address");
        return this;
    }

    /**
     * <p>内网ip</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAddressIsNotNull(){
        isNotNull("internal_address");
        return this;
    }

    /**
     * <p>内网ip</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAddressIn(Collection<String> value){
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
    public VizMcMachineStreamsQueryWrapper internalAddressIn(String... values){
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
    public VizMcMachineStreamsQueryWrapper internalAddressNotIn(Collection<String> value){
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
    public VizMcMachineStreamsQueryWrapper internalAddressNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("internal_address",values);
        }
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * 等于 =
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAportEq(Integer internalAport){
        if(internalAport!=null){
            eq("internal_aport",internalAport);
        }
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * 不等于 &lt;&gt;
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAportNe(Integer internalAport){
        if(internalAport!=null){
            ne("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 大于 &gt;
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAportGt(Integer internalAport){
        if(internalAport!=null){
            gt("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 大于等于 &gt;=
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAportGe(Integer internalAport){
        if(internalAport!=null){
            ge("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 小于 &lt;
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAportLt(Integer internalAport){
        if(internalAport!=null){
            lt("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * 小于等于 &lt;=
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAportLe(Integer internalAport){
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
    public VizMcMachineStreamsQueryWrapper internalAportBetween(Integer internalAportStart,Integer internalAportEnd){
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
    public VizMcMachineStreamsQueryWrapper internalAportNotBetween(Integer internalAportStart,Integer internalAportEnd){
        if(internalAportStart!=null && internalAportEnd!=null){
            notBetween("internal_aport",internalAportStart,internalAportEnd);
        }
        return this;
     }


    /**
     * <p>内网音频端口</p>
     * LIKE '%值%'
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAportLike(Integer internalAport){
        if(internalAport!=null){
            like("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * NOT LIKE '%值%'
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAportNotLike(Integer internalAport){
        if(internalAport!=null){
            notLike("internal_aport",internalAport);
        }
        return this;
     }


    /**
     * <p>内网音频端口</p>
     * LIKE '%值'
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAportLikeLeft(Integer internalAport){
        if(internalAport!=null){
            likeLeft("internal_aport",internalAport);
        }
        return this;
     }

    /**
     * <p>内网音频端口</p>
     * LIKE '值%'
     * @param internalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAportLikeRight(Integer internalAport){
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
    public VizMcMachineStreamsQueryWrapper internalAportIsNull(){
        isNull("internal_aport");
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAportIsNotNull(){
        isNotNull("internal_aport");
        return this;
    }

    /**
     * <p>内网音频端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAportIn(Collection<Integer> value){
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
    public VizMcMachineStreamsQueryWrapper internalAportIn(Integer... values){
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
    public VizMcMachineStreamsQueryWrapper internalAportNotIn(Collection<Integer> value){
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
    public VizMcMachineStreamsQueryWrapper internalAportNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("internal_aport",values);
        }
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * 等于 =
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAtypeEq(Integer internalAtype){
        if(internalAtype!=null){
            eq("internal_atype",internalAtype);
        }
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * 不等于 &lt;&gt;
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAtypeNe(Integer internalAtype){
        if(internalAtype!=null){
            ne("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 大于 &gt;
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAtypeGt(Integer internalAtype){
        if(internalAtype!=null){
            gt("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 大于等于 &gt;=
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAtypeGe(Integer internalAtype){
        if(internalAtype!=null){
            ge("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 小于 &lt;
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAtypeLt(Integer internalAtype){
        if(internalAtype!=null){
            lt("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * 小于等于 &lt;=
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAtypeLe(Integer internalAtype){
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
    public VizMcMachineStreamsQueryWrapper internalAtypeBetween(Integer internalAtypeStart,Integer internalAtypeEnd){
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
    public VizMcMachineStreamsQueryWrapper internalAtypeNotBetween(Integer internalAtypeStart,Integer internalAtypeEnd){
        if(internalAtypeStart!=null && internalAtypeEnd!=null){
            notBetween("internal_atype",internalAtypeStart,internalAtypeEnd);
        }
        return this;
     }


    /**
     * <p>内网音频端口类型</p>
     * LIKE '%值%'
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAtypeLike(Integer internalAtype){
        if(internalAtype!=null){
            like("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * NOT LIKE '%值%'
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAtypeNotLike(Integer internalAtype){
        if(internalAtype!=null){
            notLike("internal_atype",internalAtype);
        }
        return this;
     }


    /**
     * <p>内网音频端口类型</p>
     * LIKE '%值'
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAtypeLikeLeft(Integer internalAtype){
        if(internalAtype!=null){
            likeLeft("internal_atype",internalAtype);
        }
        return this;
     }

    /**
     * <p>内网音频端口类型</p>
     * LIKE '值%'
     * @param internalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAtypeLikeRight(Integer internalAtype){
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
    public VizMcMachineStreamsQueryWrapper internalAtypeIsNull(){
        isNull("internal_atype");
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAtypeIsNotNull(){
        isNotNull("internal_atype");
        return this;
    }

    /**
     * <p>内网音频端口类型</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalAtypeIn(Collection<Integer> value){
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
    public VizMcMachineStreamsQueryWrapper internalAtypeIn(Integer... values){
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
    public VizMcMachineStreamsQueryWrapper internalAtypeNotIn(Collection<Integer> value){
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
    public VizMcMachineStreamsQueryWrapper internalAtypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("internal_atype",values);
        }
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * 等于 =
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalVportEq(Integer internalVport){
        if(internalVport!=null){
            eq("internal_vport",internalVport);
        }
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * 不等于 &lt;&gt;
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalVportNe(Integer internalVport){
        if(internalVport!=null){
            ne("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 大于 &gt;
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalVportGt(Integer internalVport){
        if(internalVport!=null){
            gt("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 大于等于 &gt;=
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalVportGe(Integer internalVport){
        if(internalVport!=null){
            ge("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 小于 &lt;
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalVportLt(Integer internalVport){
        if(internalVport!=null){
            lt("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * 小于等于 &lt;=
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalVportLe(Integer internalVport){
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
    public VizMcMachineStreamsQueryWrapper internalVportBetween(Integer internalVportStart,Integer internalVportEnd){
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
    public VizMcMachineStreamsQueryWrapper internalVportNotBetween(Integer internalVportStart,Integer internalVportEnd){
        if(internalVportStart!=null && internalVportEnd!=null){
            notBetween("internal_vport",internalVportStart,internalVportEnd);
        }
        return this;
     }


    /**
     * <p>内网视频端口</p>
     * LIKE '%值%'
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalVportLike(Integer internalVport){
        if(internalVport!=null){
            like("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * NOT LIKE '%值%'
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalVportNotLike(Integer internalVport){
        if(internalVport!=null){
            notLike("internal_vport",internalVport);
        }
        return this;
     }


    /**
     * <p>内网视频端口</p>
     * LIKE '%值'
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalVportLikeLeft(Integer internalVport){
        if(internalVport!=null){
            likeLeft("internal_vport",internalVport);
        }
        return this;
     }

    /**
     * <p>内网视频端口</p>
     * LIKE '值%'
     * @param internalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalVportLikeRight(Integer internalVport){
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
    public VizMcMachineStreamsQueryWrapper internalVportIsNull(){
        isNull("internal_vport");
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalVportIsNotNull(){
        isNotNull("internal_vport");
        return this;
    }

    /**
     * <p>内网视频端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper internalVportIn(Collection<Integer> value){
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
    public VizMcMachineStreamsQueryWrapper internalVportIn(Integer... values){
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
    public VizMcMachineStreamsQueryWrapper internalVportNotIn(Collection<Integer> value){
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
    public VizMcMachineStreamsQueryWrapper internalVportNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("internal_vport",values);
        }
        return this;
    }

    /**
     * <p>外网ip</p>
     * 等于 =
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAddressEq(String externalAddress){
        if(externalAddress!=null){
            eq("external_address",externalAddress);
        }
        return this;
    }

    /**
     * <p>外网ip</p>
     * 不等于 &lt;&gt;
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAddressNe(String externalAddress){
        if(externalAddress!=null){
            ne("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 大于 &gt;
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAddressGt(String externalAddress){
        if(externalAddress!=null){
            gt("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 大于等于 &gt;=
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAddressGe(String externalAddress){
        if(externalAddress!=null){
            ge("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 小于 &lt;
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAddressLt(String externalAddress){
        if(externalAddress!=null){
            lt("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * 小于等于 &lt;=
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAddressLe(String externalAddress){
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
    public VizMcMachineStreamsQueryWrapper externalAddressBetween(String externalAddressStart,String externalAddressEnd){
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
    public VizMcMachineStreamsQueryWrapper externalAddressNotBetween(String externalAddressStart,String externalAddressEnd){
        if(externalAddressStart!=null && externalAddressEnd!=null){
            notBetween("external_address",externalAddressStart,externalAddressEnd);
        }
        return this;
     }


    /**
     * <p>外网ip</p>
     * LIKE '%值%'
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAddressLike(String externalAddress){
        if(externalAddress!=null){
            like("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * NOT LIKE '%值%'
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAddressNotLike(String externalAddress){
        if(externalAddress!=null){
            notLike("external_address",externalAddress);
        }
        return this;
     }


    /**
     * <p>外网ip</p>
     * LIKE '%值'
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAddressLikeLeft(String externalAddress){
        if(externalAddress!=null){
            likeLeft("external_address",externalAddress);
        }
        return this;
     }

    /**
     * <p>外网ip</p>
     * LIKE '值%'
     * @param externalAddress       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAddressLikeRight(String externalAddress){
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
    public VizMcMachineStreamsQueryWrapper externalAddressIsNull(){
        isNull("external_address");
        return this;
    }

    /**
     * <p>外网ip</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAddressIsNotNull(){
        isNotNull("external_address");
        return this;
    }

    /**
     * <p>外网ip</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAddressIn(Collection<String> value){
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
    public VizMcMachineStreamsQueryWrapper externalAddressIn(String... values){
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
    public VizMcMachineStreamsQueryWrapper externalAddressNotIn(Collection<String> value){
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
    public VizMcMachineStreamsQueryWrapper externalAddressNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("external_address",values);
        }
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * 等于 =
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAportEq(Integer externalAport){
        if(externalAport!=null){
            eq("external_aport",externalAport);
        }
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * 不等于 &lt;&gt;
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAportNe(Integer externalAport){
        if(externalAport!=null){
            ne("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 大于 &gt;
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAportGt(Integer externalAport){
        if(externalAport!=null){
            gt("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 大于等于 &gt;=
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAportGe(Integer externalAport){
        if(externalAport!=null){
            ge("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 小于 &lt;
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAportLt(Integer externalAport){
        if(externalAport!=null){
            lt("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * 小于等于 &lt;=
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAportLe(Integer externalAport){
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
    public VizMcMachineStreamsQueryWrapper externalAportBetween(Integer externalAportStart,Integer externalAportEnd){
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
    public VizMcMachineStreamsQueryWrapper externalAportNotBetween(Integer externalAportStart,Integer externalAportEnd){
        if(externalAportStart!=null && externalAportEnd!=null){
            notBetween("external_aport",externalAportStart,externalAportEnd);
        }
        return this;
     }


    /**
     * <p>外网音频端口</p>
     * LIKE '%值%'
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAportLike(Integer externalAport){
        if(externalAport!=null){
            like("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * NOT LIKE '%值%'
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAportNotLike(Integer externalAport){
        if(externalAport!=null){
            notLike("external_aport",externalAport);
        }
        return this;
     }


    /**
     * <p>外网音频端口</p>
     * LIKE '%值'
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAportLikeLeft(Integer externalAport){
        if(externalAport!=null){
            likeLeft("external_aport",externalAport);
        }
        return this;
     }

    /**
     * <p>外网音频端口</p>
     * LIKE '值%'
     * @param externalAport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAportLikeRight(Integer externalAport){
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
    public VizMcMachineStreamsQueryWrapper externalAportIsNull(){
        isNull("external_aport");
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAportIsNotNull(){
        isNotNull("external_aport");
        return this;
    }

    /**
     * <p>外网音频端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAportIn(Collection<Integer> value){
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
    public VizMcMachineStreamsQueryWrapper externalAportIn(Integer... values){
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
    public VizMcMachineStreamsQueryWrapper externalAportNotIn(Collection<Integer> value){
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
    public VizMcMachineStreamsQueryWrapper externalAportNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("external_aport",values);
        }
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * 等于 =
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAtypeEq(Integer externalAtype){
        if(externalAtype!=null){
            eq("external_atype",externalAtype);
        }
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * 不等于 &lt;&gt;
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAtypeNe(Integer externalAtype){
        if(externalAtype!=null){
            ne("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 大于 &gt;
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAtypeGt(Integer externalAtype){
        if(externalAtype!=null){
            gt("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 大于等于 &gt;=
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAtypeGe(Integer externalAtype){
        if(externalAtype!=null){
            ge("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 小于 &lt;
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAtypeLt(Integer externalAtype){
        if(externalAtype!=null){
            lt("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * 小于等于 &lt;=
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAtypeLe(Integer externalAtype){
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
    public VizMcMachineStreamsQueryWrapper externalAtypeBetween(Integer externalAtypeStart,Integer externalAtypeEnd){
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
    public VizMcMachineStreamsQueryWrapper externalAtypeNotBetween(Integer externalAtypeStart,Integer externalAtypeEnd){
        if(externalAtypeStart!=null && externalAtypeEnd!=null){
            notBetween("external_atype",externalAtypeStart,externalAtypeEnd);
        }
        return this;
     }


    /**
     * <p>外网音频端口类型</p>
     * LIKE '%值%'
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAtypeLike(Integer externalAtype){
        if(externalAtype!=null){
            like("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * NOT LIKE '%值%'
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAtypeNotLike(Integer externalAtype){
        if(externalAtype!=null){
            notLike("external_atype",externalAtype);
        }
        return this;
     }


    /**
     * <p>外网音频端口类型</p>
     * LIKE '%值'
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAtypeLikeLeft(Integer externalAtype){
        if(externalAtype!=null){
            likeLeft("external_atype",externalAtype);
        }
        return this;
     }

    /**
     * <p>外网音频端口类型</p>
     * LIKE '值%'
     * @param externalAtype       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAtypeLikeRight(Integer externalAtype){
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
    public VizMcMachineStreamsQueryWrapper externalAtypeIsNull(){
        isNull("external_atype");
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAtypeIsNotNull(){
        isNotNull("external_atype");
        return this;
    }

    /**
     * <p>外网音频端口类型</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalAtypeIn(Collection<Integer> value){
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
    public VizMcMachineStreamsQueryWrapper externalAtypeIn(Integer... values){
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
    public VizMcMachineStreamsQueryWrapper externalAtypeNotIn(Collection<Integer> value){
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
    public VizMcMachineStreamsQueryWrapper externalAtypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("external_atype",values);
        }
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * 等于 =
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalVportEq(Integer externalVport){
        if(externalVport!=null){
            eq("external_vport",externalVport);
        }
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * 不等于 &lt;&gt;
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalVportNe(Integer externalVport){
        if(externalVport!=null){
            ne("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 大于 &gt;
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalVportGt(Integer externalVport){
        if(externalVport!=null){
            gt("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 大于等于 &gt;=
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalVportGe(Integer externalVport){
        if(externalVport!=null){
            ge("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 小于 &lt;
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalVportLt(Integer externalVport){
        if(externalVport!=null){
            lt("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * 小于等于 &lt;=
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalVportLe(Integer externalVport){
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
    public VizMcMachineStreamsQueryWrapper externalVportBetween(Integer externalVportStart,Integer externalVportEnd){
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
    public VizMcMachineStreamsQueryWrapper externalVportNotBetween(Integer externalVportStart,Integer externalVportEnd){
        if(externalVportStart!=null && externalVportEnd!=null){
            notBetween("external_vport",externalVportStart,externalVportEnd);
        }
        return this;
     }


    /**
     * <p>外网视频端口</p>
     * LIKE '%值%'
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalVportLike(Integer externalVport){
        if(externalVport!=null){
            like("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * NOT LIKE '%值%'
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalVportNotLike(Integer externalVport){
        if(externalVport!=null){
            notLike("external_vport",externalVport);
        }
        return this;
     }


    /**
     * <p>外网视频端口</p>
     * LIKE '%值'
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalVportLikeLeft(Integer externalVport){
        if(externalVport!=null){
            likeLeft("external_vport",externalVport);
        }
        return this;
     }

    /**
     * <p>外网视频端口</p>
     * LIKE '值%'
     * @param externalVport       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalVportLikeRight(Integer externalVport){
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
    public VizMcMachineStreamsQueryWrapper externalVportIsNull(){
        isNull("external_vport");
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalVportIsNotNull(){
        isNotNull("external_vport");
        return this;
    }

    /**
     * <p>外网视频端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper externalVportIn(Collection<Integer> value){
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
    public VizMcMachineStreamsQueryWrapper externalVportIn(Integer... values){
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
    public VizMcMachineStreamsQueryWrapper externalVportNotIn(Collection<Integer> value){
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
    public VizMcMachineStreamsQueryWrapper externalVportNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("external_vport",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper createTimeEq(Date createTime){
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
    public VizMcMachineStreamsQueryWrapper createTimeNe(Date createTime){
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
    public VizMcMachineStreamsQueryWrapper createTimeGt(Date createTime){
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
    public VizMcMachineStreamsQueryWrapper createTimeGe(Date createTime){
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
    public VizMcMachineStreamsQueryWrapper createTimeLt(Date createTime){
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
    public VizMcMachineStreamsQueryWrapper createTimeLe(Date createTime){
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
    public VizMcMachineStreamsQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineStreamsQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineStreamsQueryWrapper createTimeLike(Date createTime){
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
    public VizMcMachineStreamsQueryWrapper createTimeNotLike(Date createTime){
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
    public VizMcMachineStreamsQueryWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcMachineStreamsQueryWrapper createTimeLikeRight(Date createTime){
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
    public VizMcMachineStreamsQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper createTimeIn(Collection<Date> value){
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
    public VizMcMachineStreamsQueryWrapper createTimeIn(Date... values){
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
    public VizMcMachineStreamsQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcMachineStreamsQueryWrapper createTimeNotIn(Date... values){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeIn(Date... values){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public VizMcMachineStreamsQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 等于 =
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper drEq(Integer dr){
        if(dr!=null){
            eq("dr",dr);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 不等于 &lt;&gt;
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper drNe(Integer dr){
        if(dr!=null){
            ne("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 大于 &gt;
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper drGt(Integer dr){
        if(dr!=null){
            gt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 大于等于 &gt;=
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper drGe(Integer dr){
        if(dr!=null){
            ge("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 小于 &lt;
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper drLt(Integer dr){
        if(dr!=null){
            lt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * 小于等于 &lt;=
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper drLe(Integer dr){
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
    public VizMcMachineStreamsQueryWrapper drBetween(Integer drStart,Integer drEnd){
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
    public VizMcMachineStreamsQueryWrapper drNotBetween(Integer drStart,Integer drEnd){
        if(drStart!=null && drEnd!=null){
            notBetween("dr",drStart,drEnd);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * LIKE '%值%'
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper drLike(Integer dr){
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * NOT LIKE '%值%'
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper drNotLike(Integer dr){
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * LIKE '%值'
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper drLikeLeft(Integer dr){
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * LIKE '值%'
     * @param dr       值
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper drLikeRight(Integer dr){
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
    public VizMcMachineStreamsQueryWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=50，(50：正常，-50：删除)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStreamsQueryWrapper drIn(Collection<Integer> value){
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
    public VizMcMachineStreamsQueryWrapper drIn(Integer... values){
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
    public VizMcMachineStreamsQueryWrapper drNotIn(Collection<Integer> value){
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
    public VizMcMachineStreamsQueryWrapper drNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dr",values);
        }
        return this;
    }


}
