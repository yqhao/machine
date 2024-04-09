package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtask;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 更新机器子任务表
 * </p>
 * "mc_update_device_subtask"
 * @author 18374
 */
public class McUpdateDeviceSubtaskQueryEntityWrapper extends QueryWrapper<McUpdateDeviceSubtask> {

    public static McUpdateDeviceSubtaskQueryEntityWrapper wrapper(McUpdateDeviceSubtask entity) {
        return new McUpdateDeviceSubtaskQueryEntityWrapper(entity);
    }

    private McUpdateDeviceSubtask entity;

    public McUpdateDeviceSubtaskQueryEntityWrapper(McUpdateDeviceSubtask entity) {
         this.entity=entity;
    }


    protected McUpdateDeviceSubtask entity() {
        if(entity==null){
            throw new NullPointerException("McUpdateDeviceSubtask is null");
        }
        return entity;
    }

    @Override
    public McUpdateDeviceSubtaskQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public McUpdateDeviceSubtaskQueryEntityWrapper selectColumns(Consumer<McUpdateDeviceSubtaskSelect> consumer) {
        McUpdateDeviceSubtaskSelect select = new McUpdateDeviceSubtaskSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 等于 = entity().getId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",entity().getId(),idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",entity().getId(),idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%'  entity().getId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",entity().getId());
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idEq(Long id){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper idNe(Long id){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper idGt(Long id){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper idGe(Long id){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper idLt(Long id){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idLike(Long id){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper idNotLike(Long id){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper idLikeLeft(Long id){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper idLikeRight(Long id){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper idIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper idIn(Long... values){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>更新机器任务表Id</p>
     * 等于 = entity().getFkMcUpdateDeviceTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdEq(){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null){
            eq("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * 不等于 &lt;&gt; entity().getFkMcUpdateDeviceTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdNe(){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null){
            ne("fk_mc_update_device_task_id",entity().getFkMcUpdateDeviceTaskId());
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 大于 &gt; entity().getFkMcUpdateDeviceTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdGt(){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null){
            gt("fk_mc_update_device_task_id",entity().getFkMcUpdateDeviceTaskId());
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 大于等于 &gt;= entity().getFkMcUpdateDeviceTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdGe(){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null){
            ge("fk_mc_update_device_task_id",entity().getFkMcUpdateDeviceTaskId());
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 小于 &lt; entity().getFkMcUpdateDeviceTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdLt(){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null){
            lt("fk_mc_update_device_task_id",entity().getFkMcUpdateDeviceTaskId());
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 小于等于 &lt;= entity().getFkMcUpdateDeviceTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdLe(){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null){
            le("fk_mc_update_device_task_id",entity().getFkMcUpdateDeviceTaskId());
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * BETWEEN  entity().getFkMcUpdateDeviceTaskId() AND fkMcUpdateDeviceTaskIdEnd
     * @param fkMcUpdateDeviceTaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdBetween(Long fkMcUpdateDeviceTaskIdEnd){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null && fkMcUpdateDeviceTaskIdEnd!=null){
            between("fk_mc_update_device_task_id",entity().getFkMcUpdateDeviceTaskId(),fkMcUpdateDeviceTaskIdEnd);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * NOT BETWEEN  entity().getFkMcUpdateDeviceTaskId() AND 值2
     * @param fkMcUpdateDeviceTaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdNotBetween(Long fkMcUpdateDeviceTaskIdEnd){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null && fkMcUpdateDeviceTaskIdEnd!=null){
            notBetween("fk_mc_update_device_task_id",entity().getFkMcUpdateDeviceTaskId(),fkMcUpdateDeviceTaskIdEnd);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * BETWEEN  entity().getFkMcUpdateDeviceTaskId() AND 值2
     * @param fkMcUpdateDeviceTaskIdStart       值1
     * @param fkMcUpdateDeviceTaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdBetween(Long fkMcUpdateDeviceTaskIdStart,Long fkMcUpdateDeviceTaskIdEnd){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null && fkMcUpdateDeviceTaskIdEnd!=null){
            between("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskIdStart,fkMcUpdateDeviceTaskIdEnd);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * NOT BETWEEN  entity().getFkMcUpdateDeviceTaskId() AND 值2
     * @param fkMcUpdateDeviceTaskIdStart       值1
     * @param fkMcUpdateDeviceTaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdNotBetween(Long fkMcUpdateDeviceTaskIdStart,Long fkMcUpdateDeviceTaskIdEnd){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null && fkMcUpdateDeviceTaskIdEnd!=null){
            notBetween("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskIdStart,fkMcUpdateDeviceTaskIdEnd);
        }
        return this;
     }


    /**
     * <p>更新机器任务表Id</p>
     * LIKE '%值%'  entity().getFkMcUpdateDeviceTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdLike(){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null){
            like("fk_mc_update_device_task_id",entity().getFkMcUpdateDeviceTaskId());
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * NOT LIKE '%值%'  entity().getFkMcUpdateDeviceTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdNotLike(){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null){
            notLike("fk_mc_update_device_task_id",entity().getFkMcUpdateDeviceTaskId());
        }
        return this;
     }


    /**
     * <p>更新机器任务表Id</p>
     * LIKE '%值'  entity().getFkMcUpdateDeviceTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdLikeLeft(){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null){
            likeLeft("fk_mc_update_device_task_id",entity().getFkMcUpdateDeviceTaskId());
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * LIKE '值%'  entity().getFkMcUpdateDeviceTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdLikeRight(){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null){
            likeRight("fk_mc_update_device_task_id",entity().getFkMcUpdateDeviceTaskId());
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 等于 =
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdEq(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            eq("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * 不等于 &lt;&gt;
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdNe(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            ne("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 大于 &gt;
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdGt(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            gt("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 大于等于 &gt;=
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdGe(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            ge("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 小于 &lt;
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdLt(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            lt("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 小于等于 &lt;=
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdLe(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            le("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * LIKE '%值%'
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdLike(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            like("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * NOT LIKE '%值%'
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdNotLike(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            notLike("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }


    /**
     * <p>更新机器任务表Id</p>
     * LIKE '%值'
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdLikeLeft(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            likeLeft("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * LIKE '值%'
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdLikeRight(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            likeRight("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdIsNull(){
        isNull("fk_mc_update_device_task_id");
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdIsNotNull(){
        isNotNull("fk_mc_update_device_task_id");
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_update_device_task_id",value);
        }
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_update_device_task_id",values);
        }
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_update_device_task_id",value);
        }
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper fkMcUpdateDeviceTaskIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_update_device_task_id",values);
        }
        return this;
    }


    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 等于 = entity().getType()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeEq(){
        Integer type =entity().getType();
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 不等于 &lt;&gt; entity().getType()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeNe(){
        Integer type =entity().getType();
        if(type!=null){
            ne("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 大于 &gt; entity().getType()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeGt(){
        Integer type =entity().getType();
        if(type!=null){
            gt("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 大于等于 &gt;= entity().getType()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeGe(){
        Integer type =entity().getType();
        if(type!=null){
            ge("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 小于 &lt; entity().getType()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeLt(){
        Integer type =entity().getType();
        if(type!=null){
            lt("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 小于等于 &lt;= entity().getType()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeLe(){
        Integer type =entity().getType();
        if(type!=null){
            le("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * BETWEEN  entity().getType() AND typeEnd
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeBetween(Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            between("type",entity().getType(),typeEnd);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * NOT BETWEEN  entity().getType() AND 值2
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeNotBetween(Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            notBetween("type",entity().getType(),typeEnd);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * BETWEEN  entity().getType() AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeBetween(Integer typeStart,Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            between("type",typeStart,typeEnd);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * NOT BETWEEN  entity().getType() AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeNotBetween(Integer typeStart,Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            notBetween("type",typeStart,typeEnd);
        }
        return this;
     }


    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * LIKE '%值%'  entity().getType()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeLike(){
        Integer type =entity().getType();
        if(type!=null){
            like("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * NOT LIKE '%值%'  entity().getType()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeNotLike(){
        Integer type =entity().getType();
        if(type!=null){
            notLike("type",entity().getType());
        }
        return this;
     }


    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * LIKE '%值'  entity().getType()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeLikeLeft(){
        Integer type =entity().getType();
        if(type!=null){
            likeLeft("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * LIKE '值%'  entity().getType()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeLikeRight(){
        Integer type =entity().getType();
        if(type!=null){
            likeRight("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 等于 =
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeEq(Integer type){
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 不等于 &lt;&gt;
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeNe(Integer type){
        if(type!=null){
            ne("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 大于 &gt;
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeGt(Integer type){
        if(type!=null){
            gt("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 大于等于 &gt;=
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeGe(Integer type){
        if(type!=null){
            ge("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 小于 &lt;
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeLt(Integer type){
        if(type!=null){
            lt("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 小于等于 &lt;=
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeLe(Integer type){
        if(type!=null){
            le("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * LIKE '%值%'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeLike(Integer type){
        if(type!=null){
            like("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * NOT LIKE '%值%'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeNotLike(Integer type){
        if(type!=null){
            notLike("type",type);
        }
        return this;
     }


    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * LIKE '%值'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeLikeLeft(Integer type){
        if(type!=null){
            likeLeft("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * LIKE '值%'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeLikeRight(Integer type){
        if(type!=null){
            likeRight("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeIsNull(){
        isNull("type");
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeIsNotNull(){
        isNotNull("type");
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("type",value);
        }
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeIn(Integer... values){
        if(values!=null && values.length>0){
            in("type",values);
        }
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("type",value);
        }
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper typeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("type",values);
        }
        return this;
    }


    /**
     * <p>执行顺序</p>
     * 等于 = entity().getExecutionFlow()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowEq(){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null){
            eq("execution_flow",executionFlow);
        }
        return this;
    }

    /**
     * <p>执行顺序</p>
     * 不等于 &lt;&gt; entity().getExecutionFlow()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowNe(){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null){
            ne("execution_flow",entity().getExecutionFlow());
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 大于 &gt; entity().getExecutionFlow()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowGt(){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null){
            gt("execution_flow",entity().getExecutionFlow());
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 大于等于 &gt;= entity().getExecutionFlow()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowGe(){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null){
            ge("execution_flow",entity().getExecutionFlow());
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 小于 &lt; entity().getExecutionFlow()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowLt(){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null){
            lt("execution_flow",entity().getExecutionFlow());
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 小于等于 &lt;= entity().getExecutionFlow()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowLe(){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null){
            le("execution_flow",entity().getExecutionFlow());
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * BETWEEN  entity().getExecutionFlow() AND executionFlowEnd
     * @param executionFlowEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowBetween(Integer executionFlowEnd){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null && executionFlowEnd!=null){
            between("execution_flow",entity().getExecutionFlow(),executionFlowEnd);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * NOT BETWEEN  entity().getExecutionFlow() AND 值2
     * @param executionFlowEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowNotBetween(Integer executionFlowEnd){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null && executionFlowEnd!=null){
            notBetween("execution_flow",entity().getExecutionFlow(),executionFlowEnd);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * BETWEEN  entity().getExecutionFlow() AND 值2
     * @param executionFlowStart       值1
     * @param executionFlowEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowBetween(Integer executionFlowStart,Integer executionFlowEnd){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null && executionFlowEnd!=null){
            between("execution_flow",executionFlowStart,executionFlowEnd);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * NOT BETWEEN  entity().getExecutionFlow() AND 值2
     * @param executionFlowStart       值1
     * @param executionFlowEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowNotBetween(Integer executionFlowStart,Integer executionFlowEnd){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null && executionFlowEnd!=null){
            notBetween("execution_flow",executionFlowStart,executionFlowEnd);
        }
        return this;
     }


    /**
     * <p>执行顺序</p>
     * LIKE '%值%'  entity().getExecutionFlow()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowLike(){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null){
            like("execution_flow",entity().getExecutionFlow());
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * NOT LIKE '%值%'  entity().getExecutionFlow()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowNotLike(){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null){
            notLike("execution_flow",entity().getExecutionFlow());
        }
        return this;
     }


    /**
     * <p>执行顺序</p>
     * LIKE '%值'  entity().getExecutionFlow()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowLikeLeft(){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null){
            likeLeft("execution_flow",entity().getExecutionFlow());
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * LIKE '值%'  entity().getExecutionFlow()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowLikeRight(){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null){
            likeRight("execution_flow",entity().getExecutionFlow());
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 等于 =
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowEq(Integer executionFlow){
        if(executionFlow!=null){
            eq("execution_flow",executionFlow);
        }
        return this;
    }

    /**
     * <p>执行顺序</p>
     * 不等于 &lt;&gt;
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowNe(Integer executionFlow){
        if(executionFlow!=null){
            ne("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 大于 &gt;
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowGt(Integer executionFlow){
        if(executionFlow!=null){
            gt("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 大于等于 &gt;=
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowGe(Integer executionFlow){
        if(executionFlow!=null){
            ge("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 小于 &lt;
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowLt(Integer executionFlow){
        if(executionFlow!=null){
            lt("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 小于等于 &lt;=
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowLe(Integer executionFlow){
        if(executionFlow!=null){
            le("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * LIKE '%值%'
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowLike(Integer executionFlow){
        if(executionFlow!=null){
            like("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * NOT LIKE '%值%'
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowNotLike(Integer executionFlow){
        if(executionFlow!=null){
            notLike("execution_flow",executionFlow);
        }
        return this;
     }


    /**
     * <p>执行顺序</p>
     * LIKE '%值'
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowLikeLeft(Integer executionFlow){
        if(executionFlow!=null){
            likeLeft("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * LIKE '值%'
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowLikeRight(Integer executionFlow){
        if(executionFlow!=null){
            likeRight("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowIsNull(){
        isNull("execution_flow");
        return this;
    }

    /**
     * <p>执行顺序</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowIsNotNull(){
        isNotNull("execution_flow");
        return this;
    }

    /**
     * <p>执行顺序</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("execution_flow",value);
        }
        return this;
    }

    /**
     * <p>执行顺序</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowIn(Integer... values){
        if(values!=null && values.length>0){
            in("execution_flow",values);
        }
        return this;
    }

    /**
     * <p>执行顺序</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("execution_flow",value);
        }
        return this;
    }

    /**
     * <p>执行顺序</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper executionFlowNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("execution_flow",values);
        }
        return this;
    }


    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",entity().getStatus());
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }


    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeEq(){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",entity().getCreateTime(),createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",entity().getCreateTime(),createTimeEnd);
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",entity().getCreateTime());
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeEq(Date createTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeNe(Date createTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeGt(Date createTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeGe(Date createTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeLt(Date createTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeLe(Date createTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeLike(Date createTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeIn(Date... values){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper createTimeNotIn(Date... values){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeEq(){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }



}
