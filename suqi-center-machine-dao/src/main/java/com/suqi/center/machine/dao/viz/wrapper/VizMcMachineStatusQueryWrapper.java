package com.suqi.center.machine.dao.viz.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineStatus;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 机器状态表
 * </p>
 * "viz_mc_machine_status"
 * @author 18374
 */
public class VizMcMachineStatusQueryWrapper extends QueryWrapper<VizMcMachineStatus> {


    public static VizMcMachineStatusQueryWrapper wrapper() {
        return new VizMcMachineStatusQueryWrapper();
    }

    public VizMcMachineStatusQueryWrapper() {
        super();
    }

    public VizMcMachineStatusQueryWrapper(VizMcMachineStatus entity) {
        super(entity);
    }

    public VizMcMachineStatusQueryWrapper(VizMcMachineStatus entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public VizMcMachineStatusQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public VizMcMachineStatusQueryWrapper selectColumns(Consumer<VizMcMachineStatusSelect> consumer) {
        VizMcMachineStatusSelect select = new VizMcMachineStatusSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }


    /**
     * <p>记录id自动增长</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper idNotIn(Long... values){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdEq(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdNe(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdGt(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdGe(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdLt(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdLe(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdLike(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper fkMcMachineIdIn(Collection<Long> value){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdIn(Long... values){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdNotIn(Collection<Long> value){
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
    public VizMcMachineStatusQueryWrapper fkMcMachineIdNotIn(Long... values){
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
    public VizMcMachineStatusQueryWrapper deviceIdEq(String deviceId){
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
    public VizMcMachineStatusQueryWrapper deviceIdNe(String deviceId){
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
    public VizMcMachineStatusQueryWrapper deviceIdGt(String deviceId){
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
    public VizMcMachineStatusQueryWrapper deviceIdGe(String deviceId){
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
    public VizMcMachineStatusQueryWrapper deviceIdLt(String deviceId){
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
    public VizMcMachineStatusQueryWrapper deviceIdLe(String deviceId){
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
    public VizMcMachineStatusQueryWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineStatusQueryWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineStatusQueryWrapper deviceIdLike(String deviceId){
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
    public VizMcMachineStatusQueryWrapper deviceIdNotLike(String deviceId){
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
    public VizMcMachineStatusQueryWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcMachineStatusQueryWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcMachineStatusQueryWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper deviceIdIn(Collection<String> value){
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
    public VizMcMachineStatusQueryWrapper deviceIdIn(String... values){
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
    public VizMcMachineStatusQueryWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcMachineStatusQueryWrapper deviceIdNotIn(String... values){
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
    public VizMcMachineStatusQueryWrapper instanceIdEq(String instanceId){
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
    public VizMcMachineStatusQueryWrapper instanceIdNe(String instanceId){
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
    public VizMcMachineStatusQueryWrapper instanceIdGt(String instanceId){
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
    public VizMcMachineStatusQueryWrapper instanceIdGe(String instanceId){
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
    public VizMcMachineStatusQueryWrapper instanceIdLt(String instanceId){
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
    public VizMcMachineStatusQueryWrapper instanceIdLe(String instanceId){
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
    public VizMcMachineStatusQueryWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
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
    public VizMcMachineStatusQueryWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
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
    public VizMcMachineStatusQueryWrapper instanceIdLike(String instanceId){
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
    public VizMcMachineStatusQueryWrapper instanceIdNotLike(String instanceId){
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
    public VizMcMachineStatusQueryWrapper instanceIdLikeLeft(String instanceId){
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
    public VizMcMachineStatusQueryWrapper instanceIdLikeRight(String instanceId){
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
    public VizMcMachineStatusQueryWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper instanceIdIn(Collection<String> value){
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
    public VizMcMachineStatusQueryWrapper instanceIdIn(String... values){
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
    public VizMcMachineStatusQueryWrapper instanceIdNotIn(Collection<String> value){
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
    public VizMcMachineStatusQueryWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 等于 =
     * @param runningStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper runningStatusEq(Integer runningStatus){
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
    public VizMcMachineStatusQueryWrapper runningStatusNe(Integer runningStatus){
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
    public VizMcMachineStatusQueryWrapper runningStatusGt(Integer runningStatus){
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
    public VizMcMachineStatusQueryWrapper runningStatusGe(Integer runningStatus){
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
    public VizMcMachineStatusQueryWrapper runningStatusLt(Integer runningStatus){
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
    public VizMcMachineStatusQueryWrapper runningStatusLe(Integer runningStatus){
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
    public VizMcMachineStatusQueryWrapper runningStatusBetween(Integer runningStatusStart,Integer runningStatusEnd){
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
    public VizMcMachineStatusQueryWrapper runningStatusNotBetween(Integer runningStatusStart,Integer runningStatusEnd){
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
    public VizMcMachineStatusQueryWrapper runningStatusLike(Integer runningStatus){
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
    public VizMcMachineStatusQueryWrapper runningStatusNotLike(Integer runningStatus){
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
    public VizMcMachineStatusQueryWrapper runningStatusLikeLeft(Integer runningStatus){
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
    public VizMcMachineStatusQueryWrapper runningStatusLikeRight(Integer runningStatus){
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
    public VizMcMachineStatusQueryWrapper runningStatusIsNull(){
        isNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper runningStatusIsNotNull(){
        isNotNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper runningStatusIn(Collection<Integer> value){
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
    public VizMcMachineStatusQueryWrapper runningStatusIn(Integer... values){
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
    public VizMcMachineStatusQueryWrapper runningStatusNotIn(Collection<Integer> value){
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
    public VizMcMachineStatusQueryWrapper runningStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("running_status",values);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 等于 =
     * @param healthStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper healthStatusEq(Integer healthStatus){
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
    public VizMcMachineStatusQueryWrapper healthStatusNe(Integer healthStatus){
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
    public VizMcMachineStatusQueryWrapper healthStatusGt(Integer healthStatus){
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
    public VizMcMachineStatusQueryWrapper healthStatusGe(Integer healthStatus){
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
    public VizMcMachineStatusQueryWrapper healthStatusLt(Integer healthStatus){
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
    public VizMcMachineStatusQueryWrapper healthStatusLe(Integer healthStatus){
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
    public VizMcMachineStatusQueryWrapper healthStatusBetween(Integer healthStatusStart,Integer healthStatusEnd){
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
    public VizMcMachineStatusQueryWrapper healthStatusNotBetween(Integer healthStatusStart,Integer healthStatusEnd){
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
    public VizMcMachineStatusQueryWrapper healthStatusLike(Integer healthStatus){
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
    public VizMcMachineStatusQueryWrapper healthStatusNotLike(Integer healthStatus){
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
    public VizMcMachineStatusQueryWrapper healthStatusLikeLeft(Integer healthStatus){
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
    public VizMcMachineStatusQueryWrapper healthStatusLikeRight(Integer healthStatus){
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
    public VizMcMachineStatusQueryWrapper healthStatusIsNull(){
        isNull("health_status");
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper healthStatusIsNotNull(){
        isNotNull("health_status");
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper healthStatusIn(Collection<Integer> value){
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
    public VizMcMachineStatusQueryWrapper healthStatusIn(Integer... values){
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
    public VizMcMachineStatusQueryWrapper healthStatusNotIn(Collection<Integer> value){
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
    public VizMcMachineStatusQueryWrapper healthStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("health_status",values);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 等于 =
     * @param streamingStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper streamingStatusEq(Integer streamingStatus){
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
    public VizMcMachineStatusQueryWrapper streamingStatusNe(Integer streamingStatus){
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
    public VizMcMachineStatusQueryWrapper streamingStatusGt(Integer streamingStatus){
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
    public VizMcMachineStatusQueryWrapper streamingStatusGe(Integer streamingStatus){
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
    public VizMcMachineStatusQueryWrapper streamingStatusLt(Integer streamingStatus){
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
    public VizMcMachineStatusQueryWrapper streamingStatusLe(Integer streamingStatus){
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
    public VizMcMachineStatusQueryWrapper streamingStatusBetween(Integer streamingStatusStart,Integer streamingStatusEnd){
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
    public VizMcMachineStatusQueryWrapper streamingStatusNotBetween(Integer streamingStatusStart,Integer streamingStatusEnd){
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
    public VizMcMachineStatusQueryWrapper streamingStatusLike(Integer streamingStatus){
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
    public VizMcMachineStatusQueryWrapper streamingStatusNotLike(Integer streamingStatus){
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
    public VizMcMachineStatusQueryWrapper streamingStatusLikeLeft(Integer streamingStatus){
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
    public VizMcMachineStatusQueryWrapper streamingStatusLikeRight(Integer streamingStatus){
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
    public VizMcMachineStatusQueryWrapper streamingStatusIsNull(){
        isNull("streaming_status");
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper streamingStatusIsNotNull(){
        isNotNull("streaming_status");
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper streamingStatusIn(Collection<Integer> value){
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
    public VizMcMachineStatusQueryWrapper streamingStatusIn(Integer... values){
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
    public VizMcMachineStatusQueryWrapper streamingStatusNotIn(Collection<Integer> value){
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
    public VizMcMachineStatusQueryWrapper streamingStatusNotIn(Integer... values){
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
    public VizMcMachineStatusQueryWrapper maintStatusEq(Integer maintStatus){
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
    public VizMcMachineStatusQueryWrapper maintStatusNe(Integer maintStatus){
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
    public VizMcMachineStatusQueryWrapper maintStatusGt(Integer maintStatus){
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
    public VizMcMachineStatusQueryWrapper maintStatusGe(Integer maintStatus){
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
    public VizMcMachineStatusQueryWrapper maintStatusLt(Integer maintStatus){
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
    public VizMcMachineStatusQueryWrapper maintStatusLe(Integer maintStatus){
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
    public VizMcMachineStatusQueryWrapper maintStatusBetween(Integer maintStatusStart,Integer maintStatusEnd){
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
    public VizMcMachineStatusQueryWrapper maintStatusNotBetween(Integer maintStatusStart,Integer maintStatusEnd){
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
    public VizMcMachineStatusQueryWrapper maintStatusLike(Integer maintStatus){
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
    public VizMcMachineStatusQueryWrapper maintStatusNotLike(Integer maintStatus){
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
    public VizMcMachineStatusQueryWrapper maintStatusLikeLeft(Integer maintStatus){
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
    public VizMcMachineStatusQueryWrapper maintStatusLikeRight(Integer maintStatus){
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
    public VizMcMachineStatusQueryWrapper maintStatusIsNull(){
        isNull("maint_status");
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper maintStatusIsNotNull(){
        isNotNull("maint_status");
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper maintStatusIn(Collection<Integer> value){
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
    public VizMcMachineStatusQueryWrapper maintStatusIn(Integer... values){
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
    public VizMcMachineStatusQueryWrapper maintStatusNotIn(Collection<Integer> value){
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
    public VizMcMachineStatusQueryWrapper maintStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("maint_status",values);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 等于 =
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingEq(Integer isReseting){
        if(isReseting!=null){
            eq("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 不等于 &lt;&gt;
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingNe(Integer isReseting){
        if(isReseting!=null){
            ne("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 大于 &gt;
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingGt(Integer isReseting){
        if(isReseting!=null){
            gt("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 大于等于 &gt;=
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingGe(Integer isReseting){
        if(isReseting!=null){
            ge("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 小于 &lt;
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingLt(Integer isReseting){
        if(isReseting!=null){
            lt("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * 小于等于 &lt;=
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingLe(Integer isReseting){
        if(isReseting!=null){
            le("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * BETWEEN 值1 AND 值2
     * @param isResetingStart       值1
     * @param isResetingEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingBetween(Integer isResetingStart,Integer isResetingEnd){
        if(isResetingStart!=null && isResetingEnd!=null){
            between("is_reseting",isResetingStart,isResetingEnd);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param isResetingStart       值1
     * @param isResetingEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingNotBetween(Integer isResetingStart,Integer isResetingEnd){
        if(isResetingStart!=null && isResetingEnd!=null){
            notBetween("is_reseting",isResetingStart,isResetingEnd);
        }
        return this;
     }


    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * LIKE '%值%'
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingLike(Integer isReseting){
        if(isReseting!=null){
            like("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * NOT LIKE '%值%'
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingNotLike(Integer isReseting){
        if(isReseting!=null){
            notLike("is_reseting",isReseting);
        }
        return this;
     }


    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * LIKE '%值'
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingLikeLeft(Integer isReseting){
        if(isReseting!=null){
            likeLeft("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * LIKE '值%'
     * @param isReseting       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingLikeRight(Integer isReseting){
        if(isReseting!=null){
            likeRight("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingIsNull(){
        isNull("is_reseting");
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingIsNotNull(){
        isNotNull("is_reseting");
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("is_reseting",value);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingIn(Integer... values){
        if(values!=null && values.length>0){
            in("is_reseting",values);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("is_reseting",value);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isResetingNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_reseting",values);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 等于 =
     * @param isUserSave       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isUserSaveEq(Integer isUserSave){
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
    public VizMcMachineStatusQueryWrapper isUserSaveNe(Integer isUserSave){
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
    public VizMcMachineStatusQueryWrapper isUserSaveGt(Integer isUserSave){
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
    public VizMcMachineStatusQueryWrapper isUserSaveGe(Integer isUserSave){
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
    public VizMcMachineStatusQueryWrapper isUserSaveLt(Integer isUserSave){
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
    public VizMcMachineStatusQueryWrapper isUserSaveLe(Integer isUserSave){
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
    public VizMcMachineStatusQueryWrapper isUserSaveBetween(Integer isUserSaveStart,Integer isUserSaveEnd){
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
    public VizMcMachineStatusQueryWrapper isUserSaveNotBetween(Integer isUserSaveStart,Integer isUserSaveEnd){
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
    public VizMcMachineStatusQueryWrapper isUserSaveLike(Integer isUserSave){
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
    public VizMcMachineStatusQueryWrapper isUserSaveNotLike(Integer isUserSave){
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
    public VizMcMachineStatusQueryWrapper isUserSaveLikeLeft(Integer isUserSave){
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
    public VizMcMachineStatusQueryWrapper isUserSaveLikeRight(Integer isUserSave){
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
    public VizMcMachineStatusQueryWrapper isUserSaveIsNull(){
        isNull("is_user_save");
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isUserSaveIsNotNull(){
        isNotNull("is_user_save");
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isUserSaveIn(Collection<Integer> value){
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
    public VizMcMachineStatusQueryWrapper isUserSaveIn(Integer... values){
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
    public VizMcMachineStatusQueryWrapper isUserSaveNotIn(Collection<Integer> value){
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
    public VizMcMachineStatusQueryWrapper isUserSaveNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_user_save",values);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 等于 =
     * @param isOtaUpgrade       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isOtaUpgradeEq(Integer isOtaUpgrade){
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
    public VizMcMachineStatusQueryWrapper isOtaUpgradeNe(Integer isOtaUpgrade){
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
    public VizMcMachineStatusQueryWrapper isOtaUpgradeGt(Integer isOtaUpgrade){
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
    public VizMcMachineStatusQueryWrapper isOtaUpgradeGe(Integer isOtaUpgrade){
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
    public VizMcMachineStatusQueryWrapper isOtaUpgradeLt(Integer isOtaUpgrade){
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
    public VizMcMachineStatusQueryWrapper isOtaUpgradeLe(Integer isOtaUpgrade){
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
    public VizMcMachineStatusQueryWrapper isOtaUpgradeBetween(Integer isOtaUpgradeStart,Integer isOtaUpgradeEnd){
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
    public VizMcMachineStatusQueryWrapper isOtaUpgradeNotBetween(Integer isOtaUpgradeStart,Integer isOtaUpgradeEnd){
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
    public VizMcMachineStatusQueryWrapper isOtaUpgradeLike(Integer isOtaUpgrade){
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
    public VizMcMachineStatusQueryWrapper isOtaUpgradeNotLike(Integer isOtaUpgrade){
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
    public VizMcMachineStatusQueryWrapper isOtaUpgradeLikeLeft(Integer isOtaUpgrade){
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
    public VizMcMachineStatusQueryWrapper isOtaUpgradeLikeRight(Integer isOtaUpgrade){
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
    public VizMcMachineStatusQueryWrapper isOtaUpgradeIsNull(){
        isNull("is_ota_upgrade");
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isOtaUpgradeIsNotNull(){
        isNotNull("is_ota_upgrade");
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper isOtaUpgradeIn(Collection<Integer> value){
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
    public VizMcMachineStatusQueryWrapper isOtaUpgradeIn(Integer... values){
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
    public VizMcMachineStatusQueryWrapper isOtaUpgradeNotIn(Collection<Integer> value){
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
    public VizMcMachineStatusQueryWrapper isOtaUpgradeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_ota_upgrade",values);
        }
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * 等于 =
     * @param hangUpStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper hangUpStatusEq(Integer hangUpStatus){
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
    public VizMcMachineStatusQueryWrapper hangUpStatusNe(Integer hangUpStatus){
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
    public VizMcMachineStatusQueryWrapper hangUpStatusGt(Integer hangUpStatus){
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
    public VizMcMachineStatusQueryWrapper hangUpStatusGe(Integer hangUpStatus){
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
    public VizMcMachineStatusQueryWrapper hangUpStatusLt(Integer hangUpStatus){
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
    public VizMcMachineStatusQueryWrapper hangUpStatusLe(Integer hangUpStatus){
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
    public VizMcMachineStatusQueryWrapper hangUpStatusBetween(Integer hangUpStatusStart,Integer hangUpStatusEnd){
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
    public VizMcMachineStatusQueryWrapper hangUpStatusNotBetween(Integer hangUpStatusStart,Integer hangUpStatusEnd){
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
    public VizMcMachineStatusQueryWrapper hangUpStatusLike(Integer hangUpStatus){
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
    public VizMcMachineStatusQueryWrapper hangUpStatusNotLike(Integer hangUpStatus){
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
    public VizMcMachineStatusQueryWrapper hangUpStatusLikeLeft(Integer hangUpStatus){
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
    public VizMcMachineStatusQueryWrapper hangUpStatusLikeRight(Integer hangUpStatus){
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
    public VizMcMachineStatusQueryWrapper hangUpStatusIsNull(){
        isNull("hang_up_status");
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper hangUpStatusIsNotNull(){
        isNotNull("hang_up_status");
        return this;
    }

    /**
     * <p>挂机状态(0：未挂机，1：挂机中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper hangUpStatusIn(Collection<Integer> value){
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
    public VizMcMachineStatusQueryWrapper hangUpStatusIn(Integer... values){
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
    public VizMcMachineStatusQueryWrapper hangUpStatusNotIn(Collection<Integer> value){
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
    public VizMcMachineStatusQueryWrapper hangUpStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("hang_up_status",values);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 等于 =
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusEq(Integer restartStatus){
        if(restartStatus!=null){
            eq("restart_status",restartStatus);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 不等于 &lt;&gt;
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusNe(Integer restartStatus){
        if(restartStatus!=null){
            ne("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 大于 &gt;
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusGt(Integer restartStatus){
        if(restartStatus!=null){
            gt("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 大于等于 &gt;=
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusGe(Integer restartStatus){
        if(restartStatus!=null){
            ge("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 小于 &lt;
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusLt(Integer restartStatus){
        if(restartStatus!=null){
            lt("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * 小于等于 &lt;=
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusLe(Integer restartStatus){
        if(restartStatus!=null){
            le("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * BETWEEN 值1 AND 值2
     * @param restartStatusStart       值1
     * @param restartStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusBetween(Integer restartStatusStart,Integer restartStatusEnd){
        if(restartStatusStart!=null && restartStatusEnd!=null){
            between("restart_status",restartStatusStart,restartStatusEnd);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param restartStatusStart       值1
     * @param restartStatusEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusNotBetween(Integer restartStatusStart,Integer restartStatusEnd){
        if(restartStatusStart!=null && restartStatusEnd!=null){
            notBetween("restart_status",restartStatusStart,restartStatusEnd);
        }
        return this;
     }


    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * LIKE '%值%'
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusLike(Integer restartStatus){
        if(restartStatus!=null){
            like("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * NOT LIKE '%值%'
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusNotLike(Integer restartStatus){
        if(restartStatus!=null){
            notLike("restart_status",restartStatus);
        }
        return this;
     }


    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * LIKE '%值'
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusLikeLeft(Integer restartStatus){
        if(restartStatus!=null){
            likeLeft("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * LIKE '值%'
     * @param restartStatus       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusLikeRight(Integer restartStatus){
        if(restartStatus!=null){
            likeRight("restart_status",restartStatus);
        }
        return this;
     }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusIsNull(){
        isNull("restart_status");
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusIsNotNull(){
        isNotNull("restart_status");
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("restart_status",value);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("restart_status",values);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("restart_status",value);
        }
        return this;
    }

    /**
     * <p>重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper restartStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("restart_status",values);
        }
        return this;
    }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 等于 =
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessEq(Integer rootAccess){
        if(rootAccess!=null){
            eq("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 不等于 &lt;&gt;
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessNe(Integer rootAccess){
        if(rootAccess!=null){
            ne("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 大于 &gt;
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessGt(Integer rootAccess){
        if(rootAccess!=null){
            gt("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 大于等于 &gt;=
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessGe(Integer rootAccess){
        if(rootAccess!=null){
            ge("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 小于 &lt;
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessLt(Integer rootAccess){
        if(rootAccess!=null){
            lt("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * 小于等于 &lt;=
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessLe(Integer rootAccess){
        if(rootAccess!=null){
            le("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * BETWEEN 值1 AND 值2
     * @param rootAccessStart       值1
     * @param rootAccessEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessBetween(Integer rootAccessStart,Integer rootAccessEnd){
        if(rootAccessStart!=null && rootAccessEnd!=null){
            between("root_access",rootAccessStart,rootAccessEnd);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param rootAccessStart       值1
     * @param rootAccessEnd      值2
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessNotBetween(Integer rootAccessStart,Integer rootAccessEnd){
        if(rootAccessStart!=null && rootAccessEnd!=null){
            notBetween("root_access",rootAccessStart,rootAccessEnd);
        }
        return this;
     }


    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * LIKE '%值%'
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessLike(Integer rootAccess){
        if(rootAccess!=null){
            like("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * NOT LIKE '%值%'
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessNotLike(Integer rootAccess){
        if(rootAccess!=null){
            notLike("root_access",rootAccess);
        }
        return this;
     }


    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * LIKE '%值'
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessLikeLeft(Integer rootAccess){
        if(rootAccess!=null){
            likeLeft("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * LIKE '值%'
     * @param rootAccess       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessLikeRight(Integer rootAccess){
        if(rootAccess!=null){
            likeRight("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessIsNull(){
        isNull("root_access");
        return this;
    }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessIsNotNull(){
        isNotNull("root_access");
        return this;
    }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("root_access",value);
        }
        return this;
    }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessIn(Integer... values){
        if(values!=null && values.length>0){
            in("root_access",values);
        }
        return this;
    }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("root_access",value);
        }
        return this;
    }

    /**
     * <p>是否存在root权限(1；是，0：否)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper rootAccessNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("root_access",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper versionIdEq(Long versionId){
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
    public VizMcMachineStatusQueryWrapper versionIdNe(Long versionId){
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
    public VizMcMachineStatusQueryWrapper versionIdGt(Long versionId){
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
    public VizMcMachineStatusQueryWrapper versionIdGe(Long versionId){
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
    public VizMcMachineStatusQueryWrapper versionIdLt(Long versionId){
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
    public VizMcMachineStatusQueryWrapper versionIdLe(Long versionId){
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
    public VizMcMachineStatusQueryWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcMachineStatusQueryWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcMachineStatusQueryWrapper versionIdLike(Long versionId){
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
    public VizMcMachineStatusQueryWrapper versionIdNotLike(Long versionId){
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
    public VizMcMachineStatusQueryWrapper versionIdLikeLeft(Long versionId){
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
    public VizMcMachineStatusQueryWrapper versionIdLikeRight(Long versionId){
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
    public VizMcMachineStatusQueryWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper versionIdIn(Collection<Long> value){
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
    public VizMcMachineStatusQueryWrapper versionIdIn(Long... values){
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
    public VizMcMachineStatusQueryWrapper versionIdNotIn(Collection<Long> value){
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
    public VizMcMachineStatusQueryWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public VizMcMachineStatusQueryWrapper createTimeEq(Date createTime){
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
    public VizMcMachineStatusQueryWrapper createTimeNe(Date createTime){
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
    public VizMcMachineStatusQueryWrapper createTimeGt(Date createTime){
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
    public VizMcMachineStatusQueryWrapper createTimeGe(Date createTime){
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
    public VizMcMachineStatusQueryWrapper createTimeLt(Date createTime){
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
    public VizMcMachineStatusQueryWrapper createTimeLe(Date createTime){
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
    public VizMcMachineStatusQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineStatusQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineStatusQueryWrapper createTimeLike(Date createTime){
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
    public VizMcMachineStatusQueryWrapper createTimeNotLike(Date createTime){
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
    public VizMcMachineStatusQueryWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcMachineStatusQueryWrapper createTimeLikeRight(Date createTime){
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
    public VizMcMachineStatusQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper createTimeIn(Collection<Date> value){
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
    public VizMcMachineStatusQueryWrapper createTimeIn(Date... values){
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
    public VizMcMachineStatusQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcMachineStatusQueryWrapper createTimeNotIn(Date... values){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineStatusQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineStatusQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeIn(Date... values){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public VizMcMachineStatusQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
