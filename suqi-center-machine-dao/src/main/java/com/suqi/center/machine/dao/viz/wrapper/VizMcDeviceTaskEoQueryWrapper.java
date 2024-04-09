package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.VizMcDeviceTaskEo;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 机器任务表
 * </p>
 * "viz_mc_device_task"
 * @author 18374
 */
public class VizMcDeviceTaskEoQueryWrapper extends QueryWrapper<VizMcDeviceTaskEo> {


    public static VizMcDeviceTaskEoQueryWrapper wrapper() {
        return new VizMcDeviceTaskEoQueryWrapper();
    }

    public VizMcDeviceTaskEoQueryWrapper() {
        super();
    }

    public VizMcDeviceTaskEoQueryWrapper(VizMcDeviceTaskEo entity) {
        super(entity);
    }

    public VizMcDeviceTaskEoQueryWrapper(VizMcDeviceTaskEo entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public VizMcDeviceTaskEoQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public VizMcDeviceTaskEoQueryWrapper selectColumns(Consumer<VizMcDeviceTaskEoSelect> consumer) {
        VizMcDeviceTaskEoSelect select = new VizMcDeviceTaskEoSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }


    /**
     * <p>记录id雪花算法</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * IS NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * 等于 =
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdEq(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            eq("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * 不等于 &lt;&gt;
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdNe(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            ne("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * 大于 &gt;
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdGt(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            gt("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * 大于等于 &gt;=
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdGe(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            ge("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * 小于 &lt;
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdLt(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            lt("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * 小于等于 &lt;=
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdLe(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            le("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * BETWEEN 值1 AND 值2
     * @param fkVizMcTaskIdStart       值1
     * @param fkVizMcTaskIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdBetween(Long fkVizMcTaskIdStart,Long fkVizMcTaskIdEnd){
        if(fkVizMcTaskIdStart!=null && fkVizMcTaskIdEnd!=null){
            between("fk_viz_mc_task_id",fkVizMcTaskIdStart,fkVizMcTaskIdEnd);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkVizMcTaskIdStart       值1
     * @param fkVizMcTaskIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdNotBetween(Long fkVizMcTaskIdStart,Long fkVizMcTaskIdEnd){
        if(fkVizMcTaskIdStart!=null && fkVizMcTaskIdEnd!=null){
            notBetween("fk_viz_mc_task_id",fkVizMcTaskIdStart,fkVizMcTaskIdEnd);
        }
        return this;
     }


    /**
     * <p>任务表记录id</p>
     * LIKE '%值%'
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdLike(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            like("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * NOT LIKE '%值%'
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdNotLike(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            notLike("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }


    /**
     * <p>任务表记录id</p>
     * LIKE '%值'
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdLikeLeft(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            likeLeft("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * LIKE '值%'
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdLikeRight(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            likeRight("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * IS NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdIsNull(){
        isNull("fk_viz_mc_task_id");
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdIsNotNull(){
        isNotNull("fk_viz_mc_task_id");
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_viz_mc_task_id",value);
        }
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_viz_mc_task_id",values);
        }
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_viz_mc_task_id",value);
        }
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkVizMcTaskIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_viz_mc_task_id",values);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * 等于 =
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdEq(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdNe(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdGt(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdGe(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdLt(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdLe(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdLike(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdIn(Long... values){
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
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoQueryWrapper fkMcMachineIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_machine_id",values);
        }
        return this;
    }

    /**
     * <p>任务表Id</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>任务表Id</p>
     * 不等于 &lt;&gt;
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * 大于 &gt;
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * 大于等于 &gt;=
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * 小于 &lt;
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * 小于等于 &lt;=
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>任务表Id</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * NOT LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>任务表Id</p>
     * LIKE '%值'
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * LIKE '值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdLikeRight(String instanceId){
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * IS NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>任务表Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>任务表Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_id",value);
        }
        return this;
    }

    /**
     * <p>任务表Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("instance_id",values);
        }
        return this;
    }

    /**
     * <p>任务表Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_id",value);
        }
        return this;
    }

    /**
     * <p>任务表Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper deviceIdEq(String deviceId){
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
    public VizMcDeviceTaskEoQueryWrapper deviceIdNe(String deviceId){
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
    public VizMcDeviceTaskEoQueryWrapper deviceIdGt(String deviceId){
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
    public VizMcDeviceTaskEoQueryWrapper deviceIdGe(String deviceId){
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
    public VizMcDeviceTaskEoQueryWrapper deviceIdLt(String deviceId){
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
    public VizMcDeviceTaskEoQueryWrapper deviceIdLe(String deviceId){
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
    public VizMcDeviceTaskEoQueryWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcDeviceTaskEoQueryWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcDeviceTaskEoQueryWrapper deviceIdLike(String deviceId){
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
    public VizMcDeviceTaskEoQueryWrapper deviceIdNotLike(String deviceId){
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
    public VizMcDeviceTaskEoQueryWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcDeviceTaskEoQueryWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcDeviceTaskEoQueryWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper deviceIdIn(Collection<String> value){
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
    public VizMcDeviceTaskEoQueryWrapper deviceIdIn(String... values){
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
    public VizMcDeviceTaskEoQueryWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcDeviceTaskEoQueryWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * 等于 =
     * @param executeMsg       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgEq(String executeMsg){
        if(executeMsg!=null){
            eq("execute_msg",executeMsg);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * 不等于 &lt;&gt;
     * @param executeMsg       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgNe(String executeMsg){
        if(executeMsg!=null){
            ne("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 大于 &gt;
     * @param executeMsg       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgGt(String executeMsg){
        if(executeMsg!=null){
            gt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 大于等于 &gt;=
     * @param executeMsg       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgGe(String executeMsg){
        if(executeMsg!=null){
            ge("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 小于 &lt;
     * @param executeMsg       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgLt(String executeMsg){
        if(executeMsg!=null){
            lt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 小于等于 &lt;=
     * @param executeMsg       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgLe(String executeMsg){
        if(executeMsg!=null){
            le("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * BETWEEN 值1 AND 值2
     * @param executeMsgStart       值1
     * @param executeMsgEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgBetween(String executeMsgStart,String executeMsgEnd){
        if(executeMsgStart!=null && executeMsgEnd!=null){
            between("execute_msg",executeMsgStart,executeMsgEnd);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * NOT BETWEEN 值1 AND 值2
     * @param executeMsgStart       值1
     * @param executeMsgEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgNotBetween(String executeMsgStart,String executeMsgEnd){
        if(executeMsgStart!=null && executeMsgEnd!=null){
            notBetween("execute_msg",executeMsgStart,executeMsgEnd);
        }
        return this;
     }


    /**
     * <p>执行任务消息</p>
     * LIKE '%值%'
     * @param executeMsg       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgLike(String executeMsg){
        if(executeMsg!=null){
            like("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * NOT LIKE '%值%'
     * @param executeMsg       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgNotLike(String executeMsg){
        if(executeMsg!=null){
            notLike("execute_msg",executeMsg);
        }
        return this;
     }


    /**
     * <p>执行任务消息</p>
     * LIKE '%值'
     * @param executeMsg       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgLikeLeft(String executeMsg){
        if(executeMsg!=null){
            likeLeft("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * LIKE '值%'
     * @param executeMsg       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgLikeRight(String executeMsg){
        if(executeMsg!=null){
            likeRight("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * IS NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgIsNull(){
        isNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgIsNotNull(){
        isNotNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("execute_msg",value);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgIn(String... values){
        if(values!=null && values.length>0){
            in("execute_msg",values);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("execute_msg",value);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper executeMsgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("execute_msg",values);
        }
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * 等于 =
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdEq(String jobId){
        if(jobId!=null){
            eq("job_id",jobId);
        }
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * 不等于 &lt;&gt;
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdNe(String jobId){
        if(jobId!=null){
            ne("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * 大于 &gt;
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdGt(String jobId){
        if(jobId!=null){
            gt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * 大于等于 &gt;=
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdGe(String jobId){
        if(jobId!=null){
            ge("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * 小于 &lt;
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdLt(String jobId){
        if(jobId!=null){
            lt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * 小于等于 &lt;=
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdLe(String jobId){
        if(jobId!=null){
            le("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * BETWEEN 值1 AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdBetween(String jobIdStart,String jobIdEnd){
        if(jobIdStart!=null && jobIdEnd!=null){
            between("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdNotBetween(String jobIdStart,String jobIdEnd){
        if(jobIdStart!=null && jobIdEnd!=null){
            notBetween("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }


    /**
     * <p>执行任务ID</p>
     * LIKE '%值%'
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdLike(String jobId){
        if(jobId!=null){
            like("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * NOT LIKE '%值%'
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdNotLike(String jobId){
        if(jobId!=null){
            notLike("job_id",jobId);
        }
        return this;
     }


    /**
     * <p>执行任务ID</p>
     * LIKE '%值'
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdLikeLeft(String jobId){
        if(jobId!=null){
            likeLeft("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * LIKE '值%'
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdLikeRight(String jobId){
        if(jobId!=null){
            likeRight("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * IS NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdIsNull(){
        isNull("job_id");
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdIsNotNull(){
        isNotNull("job_id");
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("job_id",value);
        }
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdIn(String... values){
        if(values!=null && values.length>0){
            in("job_id",values);
        }
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("job_id",value);
        }
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper jobIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("job_id",values);
        }
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * 等于 =
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeEq(Date beginTime){
        if(beginTime!=null){
            eq("begin_time",beginTime);
        }
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * 不等于 &lt;&gt;
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeNe(Date beginTime){
        if(beginTime!=null){
            ne("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * 大于 &gt;
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeGt(Date beginTime){
        if(beginTime!=null){
            gt("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * 大于等于 &gt;=
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeGe(Date beginTime){
        if(beginTime!=null){
            ge("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * 小于 &lt;
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeLt(Date beginTime){
        if(beginTime!=null){
            lt("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * 小于等于 &lt;=
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeLe(Date beginTime){
        if(beginTime!=null){
            le("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * BETWEEN 值1 AND 值2
     * @param beginTimeStart       值1
     * @param beginTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeBetween(Date beginTimeStart,Date beginTimeEnd){
        if(beginTimeStart!=null && beginTimeEnd!=null){
            between("begin_time",beginTimeStart,beginTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param beginTimeStart       值1
     * @param beginTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeNotBetween(Date beginTimeStart,Date beginTimeEnd){
        if(beginTimeStart!=null && beginTimeEnd!=null){
            notBetween("begin_time",beginTimeStart,beginTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务处理开始时间</p>
     * LIKE '%值%'
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeLike(Date beginTime){
        if(beginTime!=null){
            like("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * NOT LIKE '%值%'
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeNotLike(Date beginTime){
        if(beginTime!=null){
            notLike("begin_time",beginTime);
        }
        return this;
     }


    /**
     * <p>任务处理开始时间</p>
     * LIKE '%值'
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeLikeLeft(Date beginTime){
        if(beginTime!=null){
            likeLeft("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * LIKE '值%'
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeLikeRight(Date beginTime){
        if(beginTime!=null){
            likeRight("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * IS NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeIsNull(){
        isNull("begin_time");
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeIsNotNull(){
        isNotNull("begin_time");
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("begin_time",value);
        }
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("begin_time",values);
        }
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("begin_time",value);
        }
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper beginTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("begin_time",values);
        }
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * 等于 =
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeEq(Date endTime){
        if(endTime!=null){
            eq("end_time",endTime);
        }
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * 不等于 &lt;&gt;
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeNe(Date endTime){
        if(endTime!=null){
            ne("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * 大于 &gt;
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeGt(Date endTime){
        if(endTime!=null){
            gt("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * 大于等于 &gt;=
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeGe(Date endTime){
        if(endTime!=null){
            ge("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * 小于 &lt;
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeLt(Date endTime){
        if(endTime!=null){
            lt("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * 小于等于 &lt;=
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeLe(Date endTime){
        if(endTime!=null){
            le("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * BETWEEN 值1 AND 值2
     * @param endTimeStart       值1
     * @param endTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeBetween(Date endTimeStart,Date endTimeEnd){
        if(endTimeStart!=null && endTimeEnd!=null){
            between("end_time",endTimeStart,endTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param endTimeStart       值1
     * @param endTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeNotBetween(Date endTimeStart,Date endTimeEnd){
        if(endTimeStart!=null && endTimeEnd!=null){
            notBetween("end_time",endTimeStart,endTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务处理结束时间</p>
     * LIKE '%值%'
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeLike(Date endTime){
        if(endTime!=null){
            like("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * NOT LIKE '%值%'
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeNotLike(Date endTime){
        if(endTime!=null){
            notLike("end_time",endTime);
        }
        return this;
     }


    /**
     * <p>任务处理结束时间</p>
     * LIKE '%值'
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeLikeLeft(Date endTime){
        if(endTime!=null){
            likeLeft("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * LIKE '值%'
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeLikeRight(Date endTime){
        if(endTime!=null){
            likeRight("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * IS NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeIsNull(){
        isNull("end_time");
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeIsNotNull(){
        isNotNull("end_time");
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("end_time",value);
        }
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("end_time",values);
        }
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("end_time",value);
        }
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper endTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("end_time",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IS NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * 等于 =
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdEq(Long operateSysUserId){
        if(operateSysUserId!=null){
            eq("operate_sys_user_id",operateSysUserId);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * 不等于 &lt;&gt;
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdNe(Long operateSysUserId){
        if(operateSysUserId!=null){
            ne("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 大于 &gt;
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdGt(Long operateSysUserId){
        if(operateSysUserId!=null){
            gt("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 大于等于 &gt;=
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdGe(Long operateSysUserId){
        if(operateSysUserId!=null){
            ge("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 小于 &lt;
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdLt(Long operateSysUserId){
        if(operateSysUserId!=null){
            lt("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 小于等于 &lt;=
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdLe(Long operateSysUserId){
        if(operateSysUserId!=null){
            le("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * BETWEEN 值1 AND 值2
     * @param operateSysUserIdStart       值1
     * @param operateSysUserIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
        if(operateSysUserIdStart!=null && operateSysUserIdEnd!=null){
            between("operate_sys_user_id",operateSysUserIdStart,operateSysUserIdEnd);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * NOT BETWEEN 值1 AND 值2
     * @param operateSysUserIdStart       值1
     * @param operateSysUserIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdNotBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
        if(operateSysUserIdStart!=null && operateSysUserIdEnd!=null){
            notBetween("operate_sys_user_id",operateSysUserIdStart,operateSysUserIdEnd);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值%'
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdLike(Long operateSysUserId){
        if(operateSysUserId!=null){
            like("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * NOT LIKE '%值%'
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdNotLike(Long operateSysUserId){
        if(operateSysUserId!=null){
            notLike("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值'
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdLikeLeft(Long operateSysUserId){
        if(operateSysUserId!=null){
            likeLeft("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * LIKE '值%'
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdLikeRight(Long operateSysUserId){
        if(operateSysUserId!=null){
            likeRight("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * IS NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdIsNull(){
        isNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdIsNotNull(){
        isNotNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("operate_sys_user_id",value);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdIn(Long... values){
        if(values!=null && values.length>0){
            in("operate_sys_user_id",values);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("operate_sys_user_id",value);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper operateSysUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("operate_sys_user_id",values);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 不等于 &lt;&gt;
     * @param versionId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于 &gt;
     * @param versionId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于等于 &gt;=
     * @param versionId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于 &lt;
     * @param versionId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于等于 &lt;=
     * @param versionId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值'
     * @param versionId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * LIKE '值%'
     * @param versionId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdLikeRight(Long versionId){
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * IS NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("version_id",values);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper versionIdNotIn(Long... values){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeEq(Date createTime){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeNe(Date createTime){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeGt(Date createTime){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeGe(Date createTime){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeLt(Date createTime){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeLe(Date createTime){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeLike(Date createTime){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeNotLike(Date createTime){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeLikeRight(Date createTime){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper createTimeIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeIn(Date... values){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoQueryWrapper createTimeNotIn(Date... values){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeIn(Date... values){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 等于 =
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drEq(Integer dr){
        if(dr!=null){
            eq("dr",dr);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 不等于 &lt;&gt;
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drNe(Integer dr){
        if(dr!=null){
            ne("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 大于 &gt;
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drGt(Integer dr){
        if(dr!=null){
            gt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 大于等于 &gt;=
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drGe(Integer dr){
        if(dr!=null){
            ge("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 小于 &lt;
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drLt(Integer dr){
        if(dr!=null){
            lt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 小于等于 &lt;=
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drLe(Integer dr){
        if(dr!=null){
            le("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * BETWEEN 值1 AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drBetween(Integer drStart,Integer drEnd){
        if(drStart!=null && drEnd!=null){
            between("dr",drStart,drEnd);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT BETWEEN 值1 AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drNotBetween(Integer drStart,Integer drEnd){
        if(drStart!=null && drEnd!=null){
            notBetween("dr",drStart,drEnd);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值%'
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drLike(Integer dr){
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT LIKE '%值%'
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drNotLike(Integer dr){
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值'
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drLikeLeft(Integer dr){
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '值%'
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drLikeRight(Integer dr){
        if(dr!=null){
            likeRight("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IS NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dr",value);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drIn(Integer... values){
        if(values!=null && values.length>0){
            in("dr",values);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dr",value);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryWrapper drNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dr",values);
        }
        return this;
    }


}
