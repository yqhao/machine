package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtaskRecord;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 机器更新子任务记录表
 * </p>
 * "mc_update_device_subtask_record"
 * @author 18374
 */
public class McUpdateDeviceSubtaskRecordUpdateEntityWrapper extends UpdateWrapper<McUpdateDeviceSubtaskRecord> {

    public static McUpdateDeviceSubtaskRecordUpdateEntityWrapper wrapper(McUpdateDeviceSubtaskRecord entity) {
        return new McUpdateDeviceSubtaskRecordUpdateEntityWrapper(entity);
    }

    private McUpdateDeviceSubtaskRecord entity;

    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper(McUpdateDeviceSubtaskRecord entity) {
        this.entity=entity;
    }

    /**
     * 记录id自动增长
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 机器更新任务记录表Id
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper setFkMcUpdateDeviceTaskRecordId(Long fkMcUpdateDeviceTaskRecordId) {
         set("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        return this;
    }
    /**
     * 更新机器子任务表Id
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper setFkMcUpdateDeviceSubtaskId(Long fkMcUpdateDeviceSubtaskId) {
         set("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        return this;
    }
    /**
     * 1：重置机器并安装服务，2：OTA重启，3：服务商重启
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper setType(Integer type) {
         set("type",type);
        return this;
    }
    /**
     * 任务ID
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper setTaskId(String taskId) {
         set("task_id",taskId);
        return this;
    }
    /**
     * 执行顺序
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper setExecutionFlow(Integer executionFlow) {
         set("execution_flow",executionFlow);
        return this;
    }
    /**
     * 执行任务消息
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper setExecuteMsg(String executeMsg) {
         set("execute_msg",executeMsg);
        return this;
    }
    /**
     * 状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 版本Id
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 创建时间
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 修改时间
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    protected McUpdateDeviceSubtaskRecord entity() {
        if(entity==null){
            throw new NullPointerException("McUpdateDeviceSubtaskRecord is null");
        }
        return entity;
    }

    /**
     * <p>记录id自动增长</p>
     * 等于 = entity().getId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idEq(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idNe(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idGt(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idGe(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idLt(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idBetween(Long idEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%' entity().getId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",entity().getId());
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idLikeRight(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idEq(Long id){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idNe(Long id){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idGt(Long id){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idGe(Long id){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idLt(Long id){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idLe(Long id){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idLike(Long id){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idNotLike(Long id){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idLikeLeft(Long id){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idLikeRight(Long id){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idIn(Long... values){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * 等于 = entity().getFkMcUpdateDeviceTaskRecordId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdEq(){
        Long fkMcUpdateDeviceTaskRecordId =entity().getFkMcUpdateDeviceTaskRecordId();
        if(fkMcUpdateDeviceTaskRecordId!=null){
            eq("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * 不等于 &lt;&gt; entity().getFkMcUpdateDeviceTaskRecordId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdNe(){
        Long fkMcUpdateDeviceTaskRecordId =entity().getFkMcUpdateDeviceTaskRecordId();
        if(fkMcUpdateDeviceTaskRecordId!=null){
            ne("fk_mc_update_device_task_record_id",entity().getFkMcUpdateDeviceTaskRecordId());
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * 大于 &gt; entity().getFkMcUpdateDeviceTaskRecordId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdGt(){
        Long fkMcUpdateDeviceTaskRecordId =entity().getFkMcUpdateDeviceTaskRecordId();
        if(fkMcUpdateDeviceTaskRecordId!=null){
            gt("fk_mc_update_device_task_record_id",entity().getFkMcUpdateDeviceTaskRecordId());
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * 大于等于 &gt;= entity().getFkMcUpdateDeviceTaskRecordId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdGe(){
        Long fkMcUpdateDeviceTaskRecordId =entity().getFkMcUpdateDeviceTaskRecordId();
        if(fkMcUpdateDeviceTaskRecordId!=null){
            ge("fk_mc_update_device_task_record_id",entity().getFkMcUpdateDeviceTaskRecordId());
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * 小于 &lt; entity().getFkMcUpdateDeviceTaskRecordId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdLt(){
        Long fkMcUpdateDeviceTaskRecordId =entity().getFkMcUpdateDeviceTaskRecordId();
        if(fkMcUpdateDeviceTaskRecordId!=null){
            lt("fk_mc_update_device_task_record_id",entity().getFkMcUpdateDeviceTaskRecordId());
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * 小于等于 &lt;= entity().getFkMcUpdateDeviceTaskRecordId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdLe(){
        Long fkMcUpdateDeviceTaskRecordId =entity().getFkMcUpdateDeviceTaskRecordId();
        if(fkMcUpdateDeviceTaskRecordId!=null){
            le("fk_mc_update_device_task_record_id",entity().getFkMcUpdateDeviceTaskRecordId());
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * BETWEEN  entity().getFkMcUpdateDeviceTaskRecordId() AND 值2
     * @param fkMcUpdateDeviceTaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdBetween(Long fkMcUpdateDeviceTaskRecordIdEnd){
        Long fkMcUpdateDeviceTaskRecordId =entity().getFkMcUpdateDeviceTaskRecordId();
        if(fkMcUpdateDeviceTaskRecordId!=null && fkMcUpdateDeviceTaskRecordIdEnd!=null){
            between("fk_mc_update_device_task_record_id",entity().getFkMcUpdateDeviceTaskRecordId(),fkMcUpdateDeviceTaskRecordIdEnd);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * NOT BETWEEN  entity().getFkMcUpdateDeviceTaskRecordId() AND 值2
     * @param fkMcUpdateDeviceTaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdNotBetween(Long fkMcUpdateDeviceTaskRecordIdEnd){
        Long fkMcUpdateDeviceTaskRecordId =entity().getFkMcUpdateDeviceTaskRecordId();
        if(fkMcUpdateDeviceTaskRecordId!=null && fkMcUpdateDeviceTaskRecordIdEnd!=null){
            notBetween("fk_mc_update_device_task_record_id",entity().getFkMcUpdateDeviceTaskRecordId(),fkMcUpdateDeviceTaskRecordIdEnd);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * BETWEEN  entity().getFkMcUpdateDeviceTaskRecordId() AND 值2
     * @param fkMcUpdateDeviceTaskRecordIdStart       值1
     * @param fkMcUpdateDeviceTaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdBetween(Long fkMcUpdateDeviceTaskRecordIdStart,Long fkMcUpdateDeviceTaskRecordIdEnd){
        Long fkMcUpdateDeviceTaskRecordId =entity().getFkMcUpdateDeviceTaskRecordId();
        if(fkMcUpdateDeviceTaskRecordId!=null && fkMcUpdateDeviceTaskRecordIdEnd!=null){
            between("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordIdStart,fkMcUpdateDeviceTaskRecordIdEnd);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * NOT BETWEEN  entity().getFkMcUpdateDeviceTaskRecordId() AND 值2
     * @param fkMcUpdateDeviceTaskRecordIdStart       值1
     * @param fkMcUpdateDeviceTaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdNotBetween(Long fkMcUpdateDeviceTaskRecordIdStart,Long fkMcUpdateDeviceTaskRecordIdEnd){
        Long fkMcUpdateDeviceTaskRecordId =entity().getFkMcUpdateDeviceTaskRecordId();
        if(fkMcUpdateDeviceTaskRecordId!=null && fkMcUpdateDeviceTaskRecordIdEnd!=null){
            notBetween("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordIdStart,fkMcUpdateDeviceTaskRecordIdEnd);
        }
        return this;
     }


    /**
     * <p>机器更新任务记录表Id</p>
     * LIKE '%值%' entity().getFkMcUpdateDeviceTaskRecordId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdLike(){
        Long fkMcUpdateDeviceTaskRecordId =entity().getFkMcUpdateDeviceTaskRecordId();
        if(fkMcUpdateDeviceTaskRecordId!=null){
            like("fk_mc_update_device_task_record_id",entity().getFkMcUpdateDeviceTaskRecordId());
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * NOT LIKE '%值%' entity().getFkMcUpdateDeviceTaskRecordId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdNotLike(){
        Long fkMcUpdateDeviceTaskRecordId =entity().getFkMcUpdateDeviceTaskRecordId();
        if(fkMcUpdateDeviceTaskRecordId!=null){
            notLike("fk_mc_update_device_task_record_id",entity().getFkMcUpdateDeviceTaskRecordId());
        }
        return this;
     }


    /**
     * <p>机器更新任务记录表Id</p>
     * LIKE '%值' entity().getFkMcUpdateDeviceTaskRecordId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdLikeLeft(){
        Long fkMcUpdateDeviceTaskRecordId =entity().getFkMcUpdateDeviceTaskRecordId();
        if(fkMcUpdateDeviceTaskRecordId!=null){
            likeLeft("fk_mc_update_device_task_record_id",entity().getFkMcUpdateDeviceTaskRecordId());
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * LIKE '值%' entity().getFkMcUpdateDeviceTaskRecordId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdLikeRight(){
        Long fkMcUpdateDeviceTaskRecordId =entity().getFkMcUpdateDeviceTaskRecordId();
        if(fkMcUpdateDeviceTaskRecordId!=null){
            likeRight("fk_mc_update_device_task_record_id",entity().getFkMcUpdateDeviceTaskRecordId());
        }
        return this;
     }

/**
     * <p>机器更新任务记录表Id</p>
     * 等于 =
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdEq(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            eq("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * 不等于 &lt;&gt;
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdNe(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            ne("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * 大于 &gt;
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdGt(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            gt("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * 大于等于 &gt;=
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdGe(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            ge("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * 小于 &lt;
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdLt(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            lt("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * 小于等于 &lt;=
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdLe(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            le("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * LIKE '%值%'
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdLike(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            like("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * NOT LIKE '%值%'
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdNotLike(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            notLike("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
    }


    /**
     * <p>机器更新任务记录表Id</p>
     * LIKE '%值'
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdLikeLeft(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            likeLeft("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * LIKE '值%'
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdLikeRight(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            likeRight("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdIsNull(){
        isNull("fk_mc_update_device_task_record_id");
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdIsNotNull(){
        isNotNull("fk_mc_update_device_task_record_id");
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_update_device_task_record_id",value);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_update_device_task_record_id",values);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_update_device_task_record_id",value);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskRecordIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_update_device_task_record_id",values);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * 等于 = entity().getFkMcUpdateDeviceSubtaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdEq(){
        Long fkMcUpdateDeviceSubtaskId =entity().getFkMcUpdateDeviceSubtaskId();
        if(fkMcUpdateDeviceSubtaskId!=null){
            eq("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * 不等于 &lt;&gt; entity().getFkMcUpdateDeviceSubtaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdNe(){
        Long fkMcUpdateDeviceSubtaskId =entity().getFkMcUpdateDeviceSubtaskId();
        if(fkMcUpdateDeviceSubtaskId!=null){
            ne("fk_mc_update_device_subtask_id",entity().getFkMcUpdateDeviceSubtaskId());
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * 大于 &gt; entity().getFkMcUpdateDeviceSubtaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdGt(){
        Long fkMcUpdateDeviceSubtaskId =entity().getFkMcUpdateDeviceSubtaskId();
        if(fkMcUpdateDeviceSubtaskId!=null){
            gt("fk_mc_update_device_subtask_id",entity().getFkMcUpdateDeviceSubtaskId());
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * 大于等于 &gt;= entity().getFkMcUpdateDeviceSubtaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdGe(){
        Long fkMcUpdateDeviceSubtaskId =entity().getFkMcUpdateDeviceSubtaskId();
        if(fkMcUpdateDeviceSubtaskId!=null){
            ge("fk_mc_update_device_subtask_id",entity().getFkMcUpdateDeviceSubtaskId());
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * 小于 &lt; entity().getFkMcUpdateDeviceSubtaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdLt(){
        Long fkMcUpdateDeviceSubtaskId =entity().getFkMcUpdateDeviceSubtaskId();
        if(fkMcUpdateDeviceSubtaskId!=null){
            lt("fk_mc_update_device_subtask_id",entity().getFkMcUpdateDeviceSubtaskId());
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * 小于等于 &lt;= entity().getFkMcUpdateDeviceSubtaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdLe(){
        Long fkMcUpdateDeviceSubtaskId =entity().getFkMcUpdateDeviceSubtaskId();
        if(fkMcUpdateDeviceSubtaskId!=null){
            le("fk_mc_update_device_subtask_id",entity().getFkMcUpdateDeviceSubtaskId());
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * BETWEEN  entity().getFkMcUpdateDeviceSubtaskId() AND 值2
     * @param fkMcUpdateDeviceSubtaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdBetween(Long fkMcUpdateDeviceSubtaskIdEnd){
        Long fkMcUpdateDeviceSubtaskId =entity().getFkMcUpdateDeviceSubtaskId();
        if(fkMcUpdateDeviceSubtaskId!=null && fkMcUpdateDeviceSubtaskIdEnd!=null){
            between("fk_mc_update_device_subtask_id",entity().getFkMcUpdateDeviceSubtaskId(),fkMcUpdateDeviceSubtaskIdEnd);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * NOT BETWEEN  entity().getFkMcUpdateDeviceSubtaskId() AND 值2
     * @param fkMcUpdateDeviceSubtaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdNotBetween(Long fkMcUpdateDeviceSubtaskIdEnd){
        Long fkMcUpdateDeviceSubtaskId =entity().getFkMcUpdateDeviceSubtaskId();
        if(fkMcUpdateDeviceSubtaskId!=null && fkMcUpdateDeviceSubtaskIdEnd!=null){
            notBetween("fk_mc_update_device_subtask_id",entity().getFkMcUpdateDeviceSubtaskId(),fkMcUpdateDeviceSubtaskIdEnd);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * BETWEEN  entity().getFkMcUpdateDeviceSubtaskId() AND 值2
     * @param fkMcUpdateDeviceSubtaskIdStart       值1
     * @param fkMcUpdateDeviceSubtaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdBetween(Long fkMcUpdateDeviceSubtaskIdStart,Long fkMcUpdateDeviceSubtaskIdEnd){
        Long fkMcUpdateDeviceSubtaskId =entity().getFkMcUpdateDeviceSubtaskId();
        if(fkMcUpdateDeviceSubtaskId!=null && fkMcUpdateDeviceSubtaskIdEnd!=null){
            between("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskIdStart,fkMcUpdateDeviceSubtaskIdEnd);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * NOT BETWEEN  entity().getFkMcUpdateDeviceSubtaskId() AND 值2
     * @param fkMcUpdateDeviceSubtaskIdStart       值1
     * @param fkMcUpdateDeviceSubtaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdNotBetween(Long fkMcUpdateDeviceSubtaskIdStart,Long fkMcUpdateDeviceSubtaskIdEnd){
        Long fkMcUpdateDeviceSubtaskId =entity().getFkMcUpdateDeviceSubtaskId();
        if(fkMcUpdateDeviceSubtaskId!=null && fkMcUpdateDeviceSubtaskIdEnd!=null){
            notBetween("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskIdStart,fkMcUpdateDeviceSubtaskIdEnd);
        }
        return this;
     }


    /**
     * <p>更新机器子任务表Id</p>
     * LIKE '%值%' entity().getFkMcUpdateDeviceSubtaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdLike(){
        Long fkMcUpdateDeviceSubtaskId =entity().getFkMcUpdateDeviceSubtaskId();
        if(fkMcUpdateDeviceSubtaskId!=null){
            like("fk_mc_update_device_subtask_id",entity().getFkMcUpdateDeviceSubtaskId());
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * NOT LIKE '%值%' entity().getFkMcUpdateDeviceSubtaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdNotLike(){
        Long fkMcUpdateDeviceSubtaskId =entity().getFkMcUpdateDeviceSubtaskId();
        if(fkMcUpdateDeviceSubtaskId!=null){
            notLike("fk_mc_update_device_subtask_id",entity().getFkMcUpdateDeviceSubtaskId());
        }
        return this;
     }


    /**
     * <p>更新机器子任务表Id</p>
     * LIKE '%值' entity().getFkMcUpdateDeviceSubtaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdLikeLeft(){
        Long fkMcUpdateDeviceSubtaskId =entity().getFkMcUpdateDeviceSubtaskId();
        if(fkMcUpdateDeviceSubtaskId!=null){
            likeLeft("fk_mc_update_device_subtask_id",entity().getFkMcUpdateDeviceSubtaskId());
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * LIKE '值%' entity().getFkMcUpdateDeviceSubtaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdLikeRight(){
        Long fkMcUpdateDeviceSubtaskId =entity().getFkMcUpdateDeviceSubtaskId();
        if(fkMcUpdateDeviceSubtaskId!=null){
            likeRight("fk_mc_update_device_subtask_id",entity().getFkMcUpdateDeviceSubtaskId());
        }
        return this;
     }

/**
     * <p>更新机器子任务表Id</p>
     * 等于 =
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdEq(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            eq("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * 不等于 &lt;&gt;
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdNe(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            ne("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * 大于 &gt;
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdGt(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            gt("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * 大于等于 &gt;=
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdGe(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            ge("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * 小于 &lt;
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdLt(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            lt("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * 小于等于 &lt;=
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdLe(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            le("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * LIKE '%值%'
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdLike(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            like("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * NOT LIKE '%值%'
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdNotLike(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            notLike("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
    }


    /**
     * <p>更新机器子任务表Id</p>
     * LIKE '%值'
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdLikeLeft(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            likeLeft("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * LIKE '值%'
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdLikeRight(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            likeRight("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdIsNull(){
        isNull("fk_mc_update_device_subtask_id");
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdIsNotNull(){
        isNotNull("fk_mc_update_device_subtask_id");
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_update_device_subtask_id",value);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_update_device_subtask_id",values);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_update_device_subtask_id",value);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_update_device_subtask_id",values);
        }
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 等于 = entity().getType()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeEq(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeNe(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeGt(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeGe(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeLt(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeLe(){
        Integer type =entity().getType();
        if(type!=null){
            le("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * BETWEEN  entity().getType() AND 值2
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeBetween(Integer typeEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeNotBetween(Integer typeEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeBetween(Integer typeStart,Integer typeEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeNotBetween(Integer typeStart,Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            notBetween("type",typeStart,typeEnd);
        }
        return this;
     }


    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * LIKE '%值%' entity().getType()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeLike(){
        Integer type =entity().getType();
        if(type!=null){
            like("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * NOT LIKE '%值%' entity().getType()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeNotLike(){
        Integer type =entity().getType();
        if(type!=null){
            notLike("type",entity().getType());
        }
        return this;
     }


    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * LIKE '%值' entity().getType()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeLikeLeft(){
        Integer type =entity().getType();
        if(type!=null){
            likeLeft("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * LIKE '值%' entity().getType()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeLikeRight(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeEq(Integer type){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeNe(Integer type){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeGt(Integer type){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeGe(Integer type){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeLt(Integer type){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeLe(Integer type){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeLike(Integer type){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeNotLike(Integer type){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeLikeLeft(Integer type){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeLikeRight(Integer type){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeIsNull(){
        isNull("type");
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeIsNotNull(){
        isNotNull("type");
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeIn(Integer... values){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeNotIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper typeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("type",values);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * 等于 = entity().getTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdEq(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            eq("task_id",taskId);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * 不等于 &lt;&gt; entity().getTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdNe(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            ne("task_id",entity().getTaskId());
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * 大于 &gt; entity().getTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdGt(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            gt("task_id",entity().getTaskId());
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * 大于等于 &gt;= entity().getTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdGe(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            ge("task_id",entity().getTaskId());
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * 小于 &lt; entity().getTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdLt(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            lt("task_id",entity().getTaskId());
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * 小于等于 &lt;= entity().getTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdLe(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            le("task_id",entity().getTaskId());
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * BETWEEN  entity().getTaskId() AND 值2
     * @param taskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdBetween(String taskIdEnd){
        String taskId =entity().getTaskId();
        if(taskId!=null && taskIdEnd!=null){
            between("task_id",entity().getTaskId(),taskIdEnd);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * NOT BETWEEN  entity().getTaskId() AND 值2
     * @param taskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdNotBetween(String taskIdEnd){
        String taskId =entity().getTaskId();
        if(taskId!=null && taskIdEnd!=null){
            notBetween("task_id",entity().getTaskId(),taskIdEnd);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * BETWEEN  entity().getTaskId() AND 值2
     * @param taskIdStart       值1
     * @param taskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdBetween(String taskIdStart,String taskIdEnd){
        String taskId =entity().getTaskId();
        if(taskId!=null && taskIdEnd!=null){
            between("task_id",taskIdStart,taskIdEnd);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * NOT BETWEEN  entity().getTaskId() AND 值2
     * @param taskIdStart       值1
     * @param taskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdNotBetween(String taskIdStart,String taskIdEnd){
        String taskId =entity().getTaskId();
        if(taskId!=null && taskIdEnd!=null){
            notBetween("task_id",taskIdStart,taskIdEnd);
        }
        return this;
     }


    /**
     * <p>任务ID</p>
     * LIKE '%值%' entity().getTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdLike(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            like("task_id",entity().getTaskId());
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * NOT LIKE '%值%' entity().getTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdNotLike(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            notLike("task_id",entity().getTaskId());
        }
        return this;
     }


    /**
     * <p>任务ID</p>
     * LIKE '%值' entity().getTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdLikeLeft(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            likeLeft("task_id",entity().getTaskId());
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * LIKE '值%' entity().getTaskId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdLikeRight(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            likeRight("task_id",entity().getTaskId());
        }
        return this;
     }

/**
     * <p>任务ID</p>
     * 等于 =
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdEq(String taskId){
        if(taskId!=null){
            eq("task_id",taskId);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * 不等于 &lt;&gt;
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdNe(String taskId){
        if(taskId!=null){
            ne("task_id",taskId);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * 大于 &gt;
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdGt(String taskId){
        if(taskId!=null){
            gt("task_id",taskId);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * 大于等于 &gt;=
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdGe(String taskId){
        if(taskId!=null){
            ge("task_id",taskId);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * 小于 &lt;
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdLt(String taskId){
        if(taskId!=null){
            lt("task_id",taskId);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * 小于等于 &lt;=
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdLe(String taskId){
        if(taskId!=null){
            le("task_id",taskId);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * LIKE '%值%'
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdLike(String taskId){
        if(taskId!=null){
            like("task_id",taskId);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * NOT LIKE '%值%'
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdNotLike(String taskId){
        if(taskId!=null){
            notLike("task_id",taskId);
        }
        return this;
    }


    /**
     * <p>任务ID</p>
     * LIKE '%值'
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdLikeLeft(String taskId){
        if(taskId!=null){
            likeLeft("task_id",taskId);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * LIKE '值%'
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdLikeRight(String taskId){
        if(taskId!=null){
            likeRight("task_id",taskId);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdIsNull(){
        isNull("task_id");
        return this;
    }

    /**
     * <p>任务ID</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdIsNotNull(){
        isNotNull("task_id");
        return this;
    }

    /**
     * <p>任务ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("task_id",value);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdIn(String... values){
        if(values!=null && values.length>0){
            in("task_id",values);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("task_id",value);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper taskIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("task_id",values);
        }
        return this;
    }

    /**
     * <p>执行顺序</p>
     * 等于 = entity().getExecutionFlow()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowEq(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowNe(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowGt(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowGe(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowLt(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowLe(){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null){
            le("execution_flow",entity().getExecutionFlow());
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * BETWEEN  entity().getExecutionFlow() AND 值2
     * @param executionFlowEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowBetween(Integer executionFlowEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowNotBetween(Integer executionFlowEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowBetween(Integer executionFlowStart,Integer executionFlowEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowNotBetween(Integer executionFlowStart,Integer executionFlowEnd){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null && executionFlowEnd!=null){
            notBetween("execution_flow",executionFlowStart,executionFlowEnd);
        }
        return this;
     }


    /**
     * <p>执行顺序</p>
     * LIKE '%值%' entity().getExecutionFlow()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowLike(){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null){
            like("execution_flow",entity().getExecutionFlow());
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * NOT LIKE '%值%' entity().getExecutionFlow()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowNotLike(){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null){
            notLike("execution_flow",entity().getExecutionFlow());
        }
        return this;
     }


    /**
     * <p>执行顺序</p>
     * LIKE '%值' entity().getExecutionFlow()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowLikeLeft(){
        Integer executionFlow =entity().getExecutionFlow();
        if(executionFlow!=null){
            likeLeft("execution_flow",entity().getExecutionFlow());
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * LIKE '值%' entity().getExecutionFlow()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowLikeRight(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowEq(Integer executionFlow){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowNe(Integer executionFlow){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowGt(Integer executionFlow){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowGe(Integer executionFlow){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowLt(Integer executionFlow){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowLe(Integer executionFlow){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowLike(Integer executionFlow){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowNotLike(Integer executionFlow){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowLikeLeft(Integer executionFlow){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowLikeRight(Integer executionFlow){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowIsNull(){
        isNull("execution_flow");
        return this;
    }

    /**
     * <p>执行顺序</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowIsNotNull(){
        isNotNull("execution_flow");
        return this;
    }

    /**
     * <p>执行顺序</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowIn(Integer... values){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowNotIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executionFlowNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("execution_flow",values);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * 等于 = entity().getExecuteMsg()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgEq(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgNe(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            ne("execute_msg",entity().getExecuteMsg());
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 大于 &gt; entity().getExecuteMsg()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgGt(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            gt("execute_msg",entity().getExecuteMsg());
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 大于等于 &gt;= entity().getExecuteMsg()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgGe(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            ge("execute_msg",entity().getExecuteMsg());
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 小于 &lt; entity().getExecuteMsg()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgLt(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            lt("execute_msg",entity().getExecuteMsg());
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 小于等于 &lt;= entity().getExecuteMsg()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgLe(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            le("execute_msg",entity().getExecuteMsg());
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * BETWEEN  entity().getExecuteMsg() AND 值2
     * @param executeMsgEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgBetween(String executeMsgEnd){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null && executeMsgEnd!=null){
            between("execute_msg",entity().getExecuteMsg(),executeMsgEnd);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * NOT BETWEEN  entity().getExecuteMsg() AND 值2
     * @param executeMsgEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgNotBetween(String executeMsgEnd){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null && executeMsgEnd!=null){
            notBetween("execute_msg",entity().getExecuteMsg(),executeMsgEnd);
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgBetween(String executeMsgStart,String executeMsgEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgNotBetween(String executeMsgStart,String executeMsgEnd){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null && executeMsgEnd!=null){
            notBetween("execute_msg",executeMsgStart,executeMsgEnd);
        }
        return this;
     }


    /**
     * <p>执行任务消息</p>
     * LIKE '%值%' entity().getExecuteMsg()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgLike(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            like("execute_msg",entity().getExecuteMsg());
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * NOT LIKE '%值%' entity().getExecuteMsg()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgNotLike(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            notLike("execute_msg",entity().getExecuteMsg());
        }
        return this;
     }


    /**
     * <p>执行任务消息</p>
     * LIKE '%值' entity().getExecuteMsg()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgLikeLeft(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            likeLeft("execute_msg",entity().getExecuteMsg());
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * LIKE '值%' entity().getExecuteMsg()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgLikeRight(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            likeRight("execute_msg",entity().getExecuteMsg());
        }
        return this;
     }

/**
     * <p>执行任务消息</p>
     * 等于 =
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgEq(String executeMsg){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgNe(String executeMsg){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgGt(String executeMsg){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgGe(String executeMsg){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgLt(String executeMsg){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgLe(String executeMsg){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgLike(String executeMsg){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgNotLike(String executeMsg){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgLikeLeft(String executeMsg){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgLikeRight(String executeMsg){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgIsNull(){
        isNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgIsNotNull(){
        isNotNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgIn(Collection<String> value){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgIn(String... values){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgNotIn(Collection<String> value){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper executeMsgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("execute_msg",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * LIKE '%值%' entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * NOT LIKE '%值%' entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",entity().getStatus());
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * LIKE '%值' entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * LIKE '值%' entity().getStatus()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",entity().getStatus());
        }
        return this;
     }

/**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
    }


    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdEq(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdNe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ne("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于 &gt; entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdGt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            gt("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于等于 &gt;= entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdGe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ge("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于 &lt; entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdLt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            lt("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于等于 &lt;= entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",entity().getVersionId(),versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdNotBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",entity().getVersionId(),versionIdEnd);
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",entity().getVersionId());
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值' entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",entity().getVersionId());
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * LIKE '值%' entity().getVersionId()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdLikeRight(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeRight("version_id",entity().getVersionId());
        }
        return this;
     }

/**
     * <p>版本Id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdEq(Long versionId){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdNe(Long versionId){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdGt(Long versionId){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdGe(Long versionId){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdLt(Long versionId){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdLe(Long versionId){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdLike(Long versionId){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdNotLike(Long versionId){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdLikeLeft(Long versionId){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdLikeRight(Long versionId){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdIn(Long... values){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper versionIdNotIn(Long... values){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeEq(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeNe(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeGt(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeGe(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeLt(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",entity().getCreateTime());
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeLikeRight(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeEq(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeNe(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeGt(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeGe(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeLt(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeLe(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeLike(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeIn(Date... values){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper createTimeNotIn(Date... values){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeEq(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeNe(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeGt(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeGe(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeLt(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值' entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%' entity().getLastUpdateTime()
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeLikeRight(){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
