package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.viz.entity.VizMcDeviceTaskEo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 机器任务表
 * </p>
 * "viz_mc_device_task"
 * @author 18374
 */
public class VizMcDeviceTaskEoQueryEntityWrapper extends QueryWrapper<VizMcDeviceTaskEo> {

    public static VizMcDeviceTaskEoQueryEntityWrapper wrapper(VizMcDeviceTaskEo entity) {
        return new VizMcDeviceTaskEoQueryEntityWrapper(entity);
    }

    private VizMcDeviceTaskEo entity;

    public VizMcDeviceTaskEoQueryEntityWrapper(VizMcDeviceTaskEo entity) {
         this.entity=entity;
    }


    protected VizMcDeviceTaskEo entity() {
        if(entity==null){
            throw new NullPointerException("VizMcDeviceTaskEo is null");
        }
        return entity;
    }

    @Override
    public VizMcDeviceTaskEoQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public VizMcDeviceTaskEoQueryEntityWrapper selectColumns(Consumer<VizMcDeviceTaskEoSelect> consumer) {
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
     * 等于 = entity().getId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值%'  entity().getId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idEq(Long id){
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
    public VizMcDeviceTaskEoQueryEntityWrapper idNe(Long id){
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
    public VizMcDeviceTaskEoQueryEntityWrapper idGt(Long id){
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
    public VizMcDeviceTaskEoQueryEntityWrapper idGe(Long id){
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
    public VizMcDeviceTaskEoQueryEntityWrapper idLt(Long id){
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
    public VizMcDeviceTaskEoQueryEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idLike(Long id){
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
    public VizMcDeviceTaskEoQueryEntityWrapper idNotLike(Long id){
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
    public VizMcDeviceTaskEoQueryEntityWrapper idLikeLeft(Long id){
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
    public VizMcDeviceTaskEoQueryEntityWrapper idLikeRight(Long id){
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
    public VizMcDeviceTaskEoQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper idIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper idIn(Long... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>任务表记录id</p>
     * 等于 = entity().getFkVizMcTaskId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdEq(){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null){
            eq("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * 不等于 &lt;&gt; entity().getFkVizMcTaskId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdNe(){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null){
            ne("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * 大于 &gt; entity().getFkVizMcTaskId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdGt(){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null){
            gt("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * 大于等于 &gt;= entity().getFkVizMcTaskId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdGe(){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null){
            ge("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * 小于 &lt; entity().getFkVizMcTaskId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdLt(){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null){
            lt("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * 小于等于 &lt;= entity().getFkVizMcTaskId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdLe(){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null){
            le("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * BETWEEN  entity().getFkVizMcTaskId() AND fkVizMcTaskIdEnd
     * @param fkVizMcTaskIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdBetween(Long fkVizMcTaskIdEnd){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null && fkVizMcTaskIdEnd!=null){
            between("fk_viz_mc_task_id",fkVizMcTaskId,fkVizMcTaskIdEnd);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * NOT BETWEEN  entity().getFkVizMcTaskId() AND 值2
     * @param fkVizMcTaskIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdNotBetween(Long fkVizMcTaskIdEnd){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null && fkVizMcTaskIdEnd!=null){
            notBetween("fk_viz_mc_task_id",fkVizMcTaskId,fkVizMcTaskIdEnd);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * BETWEEN  entity().getFkVizMcTaskId() AND 值2
     * @param fkVizMcTaskIdStart       值1
     * @param fkVizMcTaskIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdBetween(Long fkVizMcTaskIdStart,Long fkVizMcTaskIdEnd){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null && fkVizMcTaskIdEnd!=null){
            between("fk_viz_mc_task_id",fkVizMcTaskIdStart,fkVizMcTaskIdEnd);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * NOT BETWEEN  entity().getFkVizMcTaskId() AND 值2
     * @param fkVizMcTaskIdStart       值1
     * @param fkVizMcTaskIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdNotBetween(Long fkVizMcTaskIdStart,Long fkVizMcTaskIdEnd){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null && fkVizMcTaskIdEnd!=null){
            notBetween("fk_viz_mc_task_id",fkVizMcTaskIdStart,fkVizMcTaskIdEnd);
        }
        return this;
     }


    /**
     * <p>任务表记录id</p>
     * LIKE '%值%'  entity().getFkVizMcTaskId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdLike(){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null){
            like("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * NOT LIKE '%值%'  entity().getFkVizMcTaskId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdNotLike(){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null){
            notLike("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }


    /**
     * <p>任务表记录id</p>
     * LIKE '%值'  entity().getFkVizMcTaskId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdLikeLeft(){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null){
            likeLeft("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * LIKE '值%'  entity().getFkVizMcTaskId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdLikeRight(){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null){
            likeRight("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * 等于 =
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdEq(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdNe(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdGt(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdGe(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdLt(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdLe(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            le("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * LIKE '%值%'
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdLike(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdNotLike(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdLikeLeft(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdLikeRight(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdIsNull(){
        isNull("fk_viz_mc_task_id");
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdIsNotNull(){
        isNotNull("fk_viz_mc_task_id");
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdIn(Long... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkVizMcTaskIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_viz_mc_task_id",values);
        }
        return this;
    }


    /**
     * <p>机器基础信息表记录id</p>
     * 等于 = entity().getFkMcMachineId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdEq(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            eq("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * 不等于 &lt;&gt; entity().getFkMcMachineId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdNe(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            ne("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 大于 &gt; entity().getFkMcMachineId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdGt(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            gt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 大于等于 &gt;= entity().getFkMcMachineId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdGe(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            ge("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 小于 &lt; entity().getFkMcMachineId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdLt(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            lt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 小于等于 &lt;= entity().getFkMcMachineId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdLe(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            le("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * BETWEEN  entity().getFkMcMachineId() AND fkMcMachineIdEnd
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdEnd){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null && fkMcMachineIdEnd!=null){
            between("fk_mc_machine_id",fkMcMachineId,fkMcMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * NOT BETWEEN  entity().getFkMcMachineId() AND 值2
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdEnd){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null && fkMcMachineIdEnd!=null){
            notBetween("fk_mc_machine_id",fkMcMachineId,fkMcMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * BETWEEN  entity().getFkMcMachineId() AND 值2
     * @param fkMcMachineIdStart       值1
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null && fkMcMachineIdEnd!=null){
            between("fk_mc_machine_id",fkMcMachineIdStart,fkMcMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * NOT BETWEEN  entity().getFkMcMachineId() AND 值2
     * @param fkMcMachineIdStart       值1
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null && fkMcMachineIdEnd!=null){
            notBetween("fk_mc_machine_id",fkMcMachineIdStart,fkMcMachineIdEnd);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '%值%'  entity().getFkMcMachineId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdLike(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            like("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * NOT LIKE '%值%'  entity().getFkMcMachineId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdNotLike(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            notLike("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '%值'  entity().getFkMcMachineId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdLikeLeft(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            likeLeft("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '值%'  entity().getFkMcMachineId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdLikeRight(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            likeRight("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 等于 =
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdEq(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdNe(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdGt(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdGe(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdLt(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdLe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            le("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '%值%'
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdLike(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdIn(Long... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper fkMcMachineIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_machine_id",values);
        }
        return this;
    }


    /**
     * <p>任务表Id</p>
     * 等于 = entity().getInstanceId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdEq(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>任务表Id</p>
     * 不等于 &lt;&gt; entity().getInstanceId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdNe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * 大于 &gt; entity().getInstanceId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdGt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * 大于等于 &gt;= entity().getInstanceId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdGe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * 小于 &lt; entity().getInstanceId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdLt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * 小于等于 &lt;= entity().getInstanceId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdLe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * BETWEEN  entity().getInstanceId() AND instanceIdEnd
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",instanceId,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdNotBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceId,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>任务表Id</p>
     * LIKE '%值%'  entity().getInstanceId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * NOT LIKE '%值%'  entity().getInstanceId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdNotLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>任务表Id</p>
     * LIKE '%值'  entity().getInstanceId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdLikeLeft(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * LIKE '值%'  entity().getInstanceId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdLikeRight(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdEq(String instanceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdNe(String instanceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdGt(String instanceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdGe(String instanceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdLt(String instanceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdLike(String instanceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdNotLike(String instanceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdLikeLeft(String instanceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdLikeRight(String instanceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>任务表Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>任务表Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdIn(Collection<String> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdIn(String... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdNotIn(Collection<String> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }


    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdEq(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdNe(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdGt(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdGe(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdLt(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdLe(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdLike(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdNotLike(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdLikeLeft(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdLikeRight(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdEq(String deviceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdNe(String deviceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdGt(String deviceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdGe(String deviceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdLt(String deviceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdLe(String deviceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdLike(String deviceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdNotLike(String deviceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdIn(Collection<String> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdIn(String... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }


    /**
     * <p>执行任务消息</p>
     * 等于 = entity().getExecuteMsg()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgEq(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            eq("execute_msg",executeMsg);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * 不等于 &lt;&gt; entity().getExecuteMsg()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgNe(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            ne("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 大于 &gt; entity().getExecuteMsg()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgGt(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            gt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 大于等于 &gt;= entity().getExecuteMsg()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgGe(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            ge("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 小于 &lt; entity().getExecuteMsg()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgLt(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            lt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 小于等于 &lt;= entity().getExecuteMsg()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgLe(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            le("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * BETWEEN  entity().getExecuteMsg() AND executeMsgEnd
     * @param executeMsgEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgBetween(String executeMsgEnd){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null && executeMsgEnd!=null){
            between("execute_msg",executeMsg,executeMsgEnd);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * NOT BETWEEN  entity().getExecuteMsg() AND 值2
     * @param executeMsgEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgNotBetween(String executeMsgEnd){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null && executeMsgEnd!=null){
            notBetween("execute_msg",executeMsg,executeMsgEnd);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * BETWEEN  entity().getExecuteMsg() AND 值2
     * @param executeMsgStart       值1
     * @param executeMsgEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgBetween(String executeMsgStart,String executeMsgEnd){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null && executeMsgEnd!=null){
            between("execute_msg",executeMsgStart,executeMsgEnd);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * NOT BETWEEN  entity().getExecuteMsg() AND 值2
     * @param executeMsgStart       值1
     * @param executeMsgEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgNotBetween(String executeMsgStart,String executeMsgEnd){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null && executeMsgEnd!=null){
            notBetween("execute_msg",executeMsgStart,executeMsgEnd);
        }
        return this;
     }


    /**
     * <p>执行任务消息</p>
     * LIKE '%值%'  entity().getExecuteMsg()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgLike(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            like("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * NOT LIKE '%值%'  entity().getExecuteMsg()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgNotLike(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            notLike("execute_msg",executeMsg);
        }
        return this;
     }


    /**
     * <p>执行任务消息</p>
     * LIKE '%值'  entity().getExecuteMsg()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgLikeLeft(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            likeLeft("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * LIKE '值%'  entity().getExecuteMsg()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgLikeRight(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            likeRight("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 等于 =
     * @param executeMsg       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgEq(String executeMsg){
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
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgNe(String executeMsg){
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
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgGt(String executeMsg){
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
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgGe(String executeMsg){
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
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgLt(String executeMsg){
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
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgLe(String executeMsg){
        if(executeMsg!=null){
            le("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * LIKE '%值%'
     * @param executeMsg       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgLike(String executeMsg){
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
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgNotLike(String executeMsg){
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
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgLikeLeft(String executeMsg){
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
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgLikeRight(String executeMsg){
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
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgIsNull(){
        isNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgIsNotNull(){
        isNotNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgIn(Collection<String> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgIn(String... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgNotIn(Collection<String> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper executeMsgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("execute_msg",values);
        }
        return this;
    }


    /**
     * <p>执行任务ID</p>
     * 等于 = entity().getJobId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdEq(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            eq("job_id",jobId);
        }
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * 不等于 &lt;&gt; entity().getJobId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdNe(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            ne("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * 大于 &gt; entity().getJobId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdGt(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            gt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * 大于等于 &gt;= entity().getJobId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdGe(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            ge("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * 小于 &lt; entity().getJobId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdLt(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            lt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * 小于等于 &lt;= entity().getJobId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdLe(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            le("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * BETWEEN  entity().getJobId() AND jobIdEnd
     * @param jobIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdBetween(String jobIdEnd){
        String jobId =entity().getJobId();
        if(jobId!=null && jobIdEnd!=null){
            between("job_id",jobId,jobIdEnd);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * NOT BETWEEN  entity().getJobId() AND 值2
     * @param jobIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdNotBetween(String jobIdEnd){
        String jobId =entity().getJobId();
        if(jobId!=null && jobIdEnd!=null){
            notBetween("job_id",jobId,jobIdEnd);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * BETWEEN  entity().getJobId() AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdBetween(String jobIdStart,String jobIdEnd){
        String jobId =entity().getJobId();
        if(jobId!=null && jobIdEnd!=null){
            between("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * NOT BETWEEN  entity().getJobId() AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdNotBetween(String jobIdStart,String jobIdEnd){
        String jobId =entity().getJobId();
        if(jobId!=null && jobIdEnd!=null){
            notBetween("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }


    /**
     * <p>执行任务ID</p>
     * LIKE '%值%'  entity().getJobId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdLike(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            like("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * NOT LIKE '%值%'  entity().getJobId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdNotLike(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            notLike("job_id",jobId);
        }
        return this;
     }


    /**
     * <p>执行任务ID</p>
     * LIKE '%值'  entity().getJobId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdLikeLeft(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            likeLeft("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * LIKE '值%'  entity().getJobId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdLikeRight(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            likeRight("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * 等于 =
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdEq(String jobId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdNe(String jobId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdGt(String jobId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdGe(String jobId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdLt(String jobId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdLe(String jobId){
        if(jobId!=null){
            le("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * LIKE '%值%'
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdLike(String jobId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdNotLike(String jobId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdLikeLeft(String jobId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdLikeRight(String jobId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdIsNull(){
        isNull("job_id");
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdIsNotNull(){
        isNotNull("job_id");
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdIn(Collection<String> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdIn(String... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdNotIn(Collection<String> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper jobIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("job_id",values);
        }
        return this;
    }


    /**
     * <p>任务处理开始时间</p>
     * 等于 = entity().getBeginTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeEq(){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null){
            eq("begin_time",beginTime);
        }
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * 不等于 &lt;&gt; entity().getBeginTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeNe(){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null){
            ne("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * 大于 &gt; entity().getBeginTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeGt(){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null){
            gt("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * 大于等于 &gt;= entity().getBeginTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeGe(){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null){
            ge("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * 小于 &lt; entity().getBeginTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeLt(){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null){
            lt("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * 小于等于 &lt;= entity().getBeginTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeLe(){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null){
            le("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * BETWEEN  entity().getBeginTime() AND beginTimeEnd
     * @param beginTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeBetween(Date beginTimeEnd){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null && beginTimeEnd!=null){
            between("begin_time",beginTime,beginTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * NOT BETWEEN  entity().getBeginTime() AND 值2
     * @param beginTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeNotBetween(Date beginTimeEnd){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null && beginTimeEnd!=null){
            notBetween("begin_time",beginTime,beginTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * BETWEEN  entity().getBeginTime() AND 值2
     * @param beginTimeStart       值1
     * @param beginTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeBetween(Date beginTimeStart,Date beginTimeEnd){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null && beginTimeEnd!=null){
            between("begin_time",beginTimeStart,beginTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * NOT BETWEEN  entity().getBeginTime() AND 值2
     * @param beginTimeStart       值1
     * @param beginTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeNotBetween(Date beginTimeStart,Date beginTimeEnd){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null && beginTimeEnd!=null){
            notBetween("begin_time",beginTimeStart,beginTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务处理开始时间</p>
     * LIKE '%值%'  entity().getBeginTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeLike(){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null){
            like("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * NOT LIKE '%值%'  entity().getBeginTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeNotLike(){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null){
            notLike("begin_time",beginTime);
        }
        return this;
     }


    /**
     * <p>任务处理开始时间</p>
     * LIKE '%值'  entity().getBeginTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeLikeLeft(){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null){
            likeLeft("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * LIKE '值%'  entity().getBeginTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeLikeRight(){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null){
            likeRight("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * 等于 =
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeEq(Date beginTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeNe(Date beginTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeGt(Date beginTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeGe(Date beginTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeLt(Date beginTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeLe(Date beginTime){
        if(beginTime!=null){
            le("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * LIKE '%值%'
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeLike(Date beginTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeNotLike(Date beginTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeLikeLeft(Date beginTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeLikeRight(Date beginTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeIsNull(){
        isNull("begin_time");
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeIsNotNull(){
        isNotNull("begin_time");
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeIn(Date... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeNotIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper beginTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("begin_time",values);
        }
        return this;
    }


    /**
     * <p>任务处理结束时间</p>
     * 等于 = entity().getEndTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeEq(){
        Date endTime =entity().getEndTime();
        if(endTime!=null){
            eq("end_time",endTime);
        }
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * 不等于 &lt;&gt; entity().getEndTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeNe(){
        Date endTime =entity().getEndTime();
        if(endTime!=null){
            ne("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * 大于 &gt; entity().getEndTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeGt(){
        Date endTime =entity().getEndTime();
        if(endTime!=null){
            gt("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * 大于等于 &gt;= entity().getEndTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeGe(){
        Date endTime =entity().getEndTime();
        if(endTime!=null){
            ge("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * 小于 &lt; entity().getEndTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeLt(){
        Date endTime =entity().getEndTime();
        if(endTime!=null){
            lt("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * 小于等于 &lt;= entity().getEndTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeLe(){
        Date endTime =entity().getEndTime();
        if(endTime!=null){
            le("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * BETWEEN  entity().getEndTime() AND endTimeEnd
     * @param endTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeBetween(Date endTimeEnd){
        Date endTime =entity().getEndTime();
        if(endTime!=null && endTimeEnd!=null){
            between("end_time",endTime,endTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * NOT BETWEEN  entity().getEndTime() AND 值2
     * @param endTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeNotBetween(Date endTimeEnd){
        Date endTime =entity().getEndTime();
        if(endTime!=null && endTimeEnd!=null){
            notBetween("end_time",endTime,endTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * BETWEEN  entity().getEndTime() AND 值2
     * @param endTimeStart       值1
     * @param endTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeBetween(Date endTimeStart,Date endTimeEnd){
        Date endTime =entity().getEndTime();
        if(endTime!=null && endTimeEnd!=null){
            between("end_time",endTimeStart,endTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * NOT BETWEEN  entity().getEndTime() AND 值2
     * @param endTimeStart       值1
     * @param endTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeNotBetween(Date endTimeStart,Date endTimeEnd){
        Date endTime =entity().getEndTime();
        if(endTime!=null && endTimeEnd!=null){
            notBetween("end_time",endTimeStart,endTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务处理结束时间</p>
     * LIKE '%值%'  entity().getEndTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeLike(){
        Date endTime =entity().getEndTime();
        if(endTime!=null){
            like("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * NOT LIKE '%值%'  entity().getEndTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeNotLike(){
        Date endTime =entity().getEndTime();
        if(endTime!=null){
            notLike("end_time",endTime);
        }
        return this;
     }


    /**
     * <p>任务处理结束时间</p>
     * LIKE '%值'  entity().getEndTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeLikeLeft(){
        Date endTime =entity().getEndTime();
        if(endTime!=null){
            likeLeft("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * LIKE '值%'  entity().getEndTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeLikeRight(){
        Date endTime =entity().getEndTime();
        if(endTime!=null){
            likeRight("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * 等于 =
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeEq(Date endTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeNe(Date endTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeGt(Date endTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeGe(Date endTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeLt(Date endTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeLe(Date endTime){
        if(endTime!=null){
            le("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * LIKE '%值%'
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeLike(Date endTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeNotLike(Date endTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeLikeLeft(Date endTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeLikeRight(Date endTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeIsNull(){
        isNull("end_time");
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeIsNotNull(){
        isNotNull("end_time");
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeIn(Date... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeNotIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper endTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("end_time",values);
        }
        return this;
    }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusEq(Integer status){
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
    public VizMcDeviceTaskEoQueryEntityWrapper statusNe(Integer status){
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
    public VizMcDeviceTaskEoQueryEntityWrapper statusGt(Integer status){
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
    public VizMcDeviceTaskEoQueryEntityWrapper statusGe(Integer status){
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
    public VizMcDeviceTaskEoQueryEntityWrapper statusLt(Integer status){
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
    public VizMcDeviceTaskEoQueryEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusLike(Integer status){
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
    public VizMcDeviceTaskEoQueryEntityWrapper statusNotLike(Integer status){
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
    public VizMcDeviceTaskEoQueryEntityWrapper statusLikeLeft(Integer status){
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
    public VizMcDeviceTaskEoQueryEntityWrapper statusLikeRight(Integer status){
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
    public VizMcDeviceTaskEoQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper statusIn(Collection<Integer> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper statusIn(Integer... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper statusNotIn(Collection<Integer> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }


    /**
     * <p>操作人员</p>
     * 等于 = entity().getOperateSysUserId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdEq(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            eq("operate_sys_user_id",operateSysUserId);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * 不等于 &lt;&gt; entity().getOperateSysUserId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdNe(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            ne("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 大于 &gt; entity().getOperateSysUserId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdGt(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            gt("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 大于等于 &gt;= entity().getOperateSysUserId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdGe(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            ge("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 小于 &lt; entity().getOperateSysUserId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdLt(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            lt("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 小于等于 &lt;= entity().getOperateSysUserId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdLe(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            le("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * BETWEEN  entity().getOperateSysUserId() AND operateSysUserIdEnd
     * @param operateSysUserIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdBetween(Long operateSysUserIdEnd){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null && operateSysUserIdEnd!=null){
            between("operate_sys_user_id",operateSysUserId,operateSysUserIdEnd);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * NOT BETWEEN  entity().getOperateSysUserId() AND 值2
     * @param operateSysUserIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdNotBetween(Long operateSysUserIdEnd){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null && operateSysUserIdEnd!=null){
            notBetween("operate_sys_user_id",operateSysUserId,operateSysUserIdEnd);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * BETWEEN  entity().getOperateSysUserId() AND 值2
     * @param operateSysUserIdStart       值1
     * @param operateSysUserIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null && operateSysUserIdEnd!=null){
            between("operate_sys_user_id",operateSysUserIdStart,operateSysUserIdEnd);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * NOT BETWEEN  entity().getOperateSysUserId() AND 值2
     * @param operateSysUserIdStart       值1
     * @param operateSysUserIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdNotBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null && operateSysUserIdEnd!=null){
            notBetween("operate_sys_user_id",operateSysUserIdStart,operateSysUserIdEnd);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值%'  entity().getOperateSysUserId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdLike(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            like("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * NOT LIKE '%值%'  entity().getOperateSysUserId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdNotLike(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            notLike("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值'  entity().getOperateSysUserId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdLikeLeft(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            likeLeft("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * LIKE '值%'  entity().getOperateSysUserId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdLikeRight(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            likeRight("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 等于 =
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdEq(Long operateSysUserId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdNe(Long operateSysUserId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdGt(Long operateSysUserId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdGe(Long operateSysUserId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdLt(Long operateSysUserId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdLe(Long operateSysUserId){
        if(operateSysUserId!=null){
            le("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * LIKE '%值%'
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdLike(Long operateSysUserId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdNotLike(Long operateSysUserId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdLikeLeft(Long operateSysUserId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdLikeRight(Long operateSysUserId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdIsNull(){
        isNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdIsNotNull(){
        isNotNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdIn(Long... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper operateSysUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("operate_sys_user_id",values);
        }
        return this;
    }


    /**
     * <p>版本Id</p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdEq(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 不等于 &lt;&gt; entity().getVersionId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdNe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于 &gt; entity().getVersionId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdGt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于等于 &gt;= entity().getVersionId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdGe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于 &lt; entity().getVersionId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdLt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于等于 &lt;= entity().getVersionId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * BETWEEN  entity().getVersionId() AND versionIdEnd
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdNotBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值'  entity().getVersionId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * LIKE '值%'  entity().getVersionId()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdLikeRight(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdEq(Long versionId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdNe(Long versionId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdGt(Long versionId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdGe(Long versionId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdLt(Long versionId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdLike(Long versionId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdNotLike(Long versionId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdLikeLeft(Long versionId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdLikeRight(Long versionId){
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
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdIn(Long... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }


    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeEq(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeNe(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeGt(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeGe(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeLt(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeLe(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeLike(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeNotLike(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeLikeLeft(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeLikeRight(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeEq(Date createTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeNe(Date createTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeGt(Date createTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeGe(Date createTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeLt(Date createTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeLe(Date createTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeLike(Date createTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeIn(Date... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper createTimeNotIn(Date... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeEq(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeNe(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeGt(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeGe(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeLt(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeLe(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeLike(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeNotLike(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeLikeLeft(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeLikeRight(){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * 等于 = entity().getDr()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drEq(){
        Integer dr =entity().getDr();
        if(dr!=null){
            eq("dr",dr);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 不等于 &lt;&gt; entity().getDr()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drNe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            ne("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 大于 &gt; entity().getDr()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drGt(){
        Integer dr =entity().getDr();
        if(dr!=null){
            gt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 大于等于 &gt;= entity().getDr()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drGe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            ge("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 小于 &lt; entity().getDr()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drLt(){
        Integer dr =entity().getDr();
        if(dr!=null){
            lt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 小于等于 &lt;= entity().getDr()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drLe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            le("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * BETWEEN  entity().getDr() AND drEnd
     * @param drEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drBetween(Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            between("dr",dr,drEnd);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT BETWEEN  entity().getDr() AND 值2
     * @param drEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drNotBetween(Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            notBetween("dr",dr,drEnd);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * BETWEEN  entity().getDr() AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drBetween(Integer drStart,Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            between("dr",drStart,drEnd);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT BETWEEN  entity().getDr() AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drNotBetween(Integer drStart,Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            notBetween("dr",drStart,drEnd);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值%'  entity().getDr()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drLike(){
        Integer dr =entity().getDr();
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT LIKE '%值%'  entity().getDr()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drNotLike(){
        Integer dr =entity().getDr();
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值'  entity().getDr()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drLikeLeft(){
        Integer dr =entity().getDr();
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '值%'  entity().getDr()
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drLikeRight(){
        Integer dr =entity().getDr();
        if(dr!=null){
            likeRight("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 等于 =
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drEq(Integer dr){
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
    public VizMcDeviceTaskEoQueryEntityWrapper drNe(Integer dr){
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
    public VizMcDeviceTaskEoQueryEntityWrapper drGt(Integer dr){
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
    public VizMcDeviceTaskEoQueryEntityWrapper drGe(Integer dr){
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
    public VizMcDeviceTaskEoQueryEntityWrapper drLt(Integer dr){
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
    public VizMcDeviceTaskEoQueryEntityWrapper drLe(Integer dr){
        if(dr!=null){
            le("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值%'
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drLike(Integer dr){
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
    public VizMcDeviceTaskEoQueryEntityWrapper drNotLike(Integer dr){
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
    public VizMcDeviceTaskEoQueryEntityWrapper drLikeLeft(Integer dr){
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
    public VizMcDeviceTaskEoQueryEntityWrapper drLikeRight(Integer dr){
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
    public VizMcDeviceTaskEoQueryEntityWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoQueryEntityWrapper drIn(Collection<Integer> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper drIn(Integer... values){
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
    public VizMcDeviceTaskEoQueryEntityWrapper drNotIn(Collection<Integer> value){
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
    public VizMcDeviceTaskEoQueryEntityWrapper drNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dr",values);
        }
        return this;
    }



}
