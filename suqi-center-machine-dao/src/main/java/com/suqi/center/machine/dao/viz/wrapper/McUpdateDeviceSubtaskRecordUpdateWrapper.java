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
public class McUpdateDeviceSubtaskRecordUpdateWrapper extends UpdateWrapper<McUpdateDeviceSubtaskRecord> {

    public static McUpdateDeviceSubtaskRecordUpdateWrapper wrapper() {
        return new McUpdateDeviceSubtaskRecordUpdateWrapper();
    }

    public McUpdateDeviceSubtaskRecordUpdateWrapper() {
        super();
    }

    public McUpdateDeviceSubtaskRecordUpdateWrapper(McUpdateDeviceSubtaskRecord entity) {
        super(entity);
    }

    /**
     * 记录id自动增长
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 机器更新任务记录表Id
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper setFkMcUpdateDeviceTaskRecordId(Long fkMcUpdateDeviceTaskRecordId) {
         set("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        return this;
    }
    /**
     * 更新机器子任务表Id
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper setFkMcUpdateDeviceSubtaskId(Long fkMcUpdateDeviceSubtaskId) {
         set("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        return this;
    }
    /**
     * 1：重置机器并安装服务，2：OTA重启，3：服务商重启
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper setType(Integer type) {
         set("type",type);
        return this;
    }
    /**
     * 任务ID
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper setTaskId(String taskId) {
         set("task_id",taskId);
        return this;
    }
    /**
     * 执行顺序
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper setExecutionFlow(Integer executionFlow) {
         set("execution_flow",executionFlow);
        return this;
    }
    /**
     * 执行任务消息
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper setExecuteMsg(String executeMsg) {
         set("execute_msg",executeMsg);
        return this;
    }
    /**
     * 状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 版本Id
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 创建时间
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 修改时间
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper idLe(Long id){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper idLikeRight(Long id){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper idIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper idIn(Long... values){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper idNotIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * 等于 = fkMcUpdateDeviceTaskRecordId
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdEq(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            eq("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * 不等于 &lt;&gt; fkMcUpdateDeviceTaskRecordId
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdNe(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            ne("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * 大于 &gt; fkMcUpdateDeviceTaskRecordId
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdGt(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            gt("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * 大于等于 &gt;= fkMcUpdateDeviceTaskRecordId
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdGe(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            ge("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * 小于 &lt; fkMcUpdateDeviceTaskRecordId
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdLt(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            lt("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * 小于等于 &lt;= fkMcUpdateDeviceTaskRecordId
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdLe(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            le("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceTaskRecordIdStart       值1
     * @param fkMcUpdateDeviceTaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdBetween(Long fkMcUpdateDeviceTaskRecordIdStart,Long fkMcUpdateDeviceTaskRecordIdEnd){
        if(fkMcUpdateDeviceTaskRecordIdStart!=null && fkMcUpdateDeviceTaskRecordIdEnd!=null){
            between("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordIdStart,fkMcUpdateDeviceTaskRecordIdEnd);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceTaskRecordIdStart       值1
     * @param fkMcUpdateDeviceTaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdNotBetween(Long fkMcUpdateDeviceTaskRecordIdStart,Long fkMcUpdateDeviceTaskRecordIdEnd){
        if(fkMcUpdateDeviceTaskRecordIdStart!=null && fkMcUpdateDeviceTaskRecordIdEnd!=null){
            notBetween("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordIdStart,fkMcUpdateDeviceTaskRecordIdEnd);
        }
        return this;
     }


    /**
     * <p>机器更新任务记录表Id</p>
     * LIKE '%值%' fkMcUpdateDeviceTaskRecordId
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdLike(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            like("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * NOT LIKE '%值%' fkMcUpdateDeviceTaskRecordId
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdNotLike(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            notLike("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }


    /**
     * <p>机器更新任务记录表Id</p>
     * LIKE '%值' fkMcUpdateDeviceTaskRecordId
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdLikeLeft(Long fkMcUpdateDeviceTaskRecordId){
        if(fkMcUpdateDeviceTaskRecordId!=null){
            likeLeft("fk_mc_update_device_task_record_id",fkMcUpdateDeviceTaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新任务记录表Id</p>
     * LIKE '值%' fkMcUpdateDeviceTaskRecordId
     * @param fkMcUpdateDeviceTaskRecordId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdLikeRight(Long fkMcUpdateDeviceTaskRecordId){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdIsNull(){
        isNull("fk_mc_update_device_task_record_id");
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdIsNotNull(){
        isNotNull("fk_mc_update_device_task_record_id");
        return this;
    }

    /**
     * <p>机器更新任务记录表Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdIn(Long... values){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceTaskRecordIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_update_device_task_record_id",values);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * 等于 = fkMcUpdateDeviceSubtaskId
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdEq(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            eq("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * 不等于 &lt;&gt; fkMcUpdateDeviceSubtaskId
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdNe(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            ne("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * 大于 &gt; fkMcUpdateDeviceSubtaskId
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdGt(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            gt("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * 大于等于 &gt;= fkMcUpdateDeviceSubtaskId
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdGe(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            ge("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * 小于 &lt; fkMcUpdateDeviceSubtaskId
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdLt(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            lt("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * 小于等于 &lt;= fkMcUpdateDeviceSubtaskId
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdLe(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            le("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceSubtaskIdStart       值1
     * @param fkMcUpdateDeviceSubtaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdBetween(Long fkMcUpdateDeviceSubtaskIdStart,Long fkMcUpdateDeviceSubtaskIdEnd){
        if(fkMcUpdateDeviceSubtaskIdStart!=null && fkMcUpdateDeviceSubtaskIdEnd!=null){
            between("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskIdStart,fkMcUpdateDeviceSubtaskIdEnd);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceSubtaskIdStart       值1
     * @param fkMcUpdateDeviceSubtaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdNotBetween(Long fkMcUpdateDeviceSubtaskIdStart,Long fkMcUpdateDeviceSubtaskIdEnd){
        if(fkMcUpdateDeviceSubtaskIdStart!=null && fkMcUpdateDeviceSubtaskIdEnd!=null){
            notBetween("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskIdStart,fkMcUpdateDeviceSubtaskIdEnd);
        }
        return this;
     }


    /**
     * <p>更新机器子任务表Id</p>
     * LIKE '%值%' fkMcUpdateDeviceSubtaskId
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdLike(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            like("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * NOT LIKE '%值%' fkMcUpdateDeviceSubtaskId
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdNotLike(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            notLike("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }


    /**
     * <p>更新机器子任务表Id</p>
     * LIKE '%值' fkMcUpdateDeviceSubtaskId
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdLikeLeft(Long fkMcUpdateDeviceSubtaskId){
        if(fkMcUpdateDeviceSubtaskId!=null){
            likeLeft("fk_mc_update_device_subtask_id",fkMcUpdateDeviceSubtaskId);
        }
        return this;
     }

    /**
     * <p>更新机器子任务表Id</p>
     * LIKE '值%' fkMcUpdateDeviceSubtaskId
     * @param fkMcUpdateDeviceSubtaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdLikeRight(Long fkMcUpdateDeviceSubtaskId){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdIsNull(){
        isNull("fk_mc_update_device_subtask_id");
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdIsNotNull(){
        isNotNull("fk_mc_update_device_subtask_id");
        return this;
    }

    /**
     * <p>更新机器子任务表Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdIn(Long... values){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_update_device_subtask_id",values);
        }
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 等于 = type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeEq(Integer type){
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 不等于 &lt;&gt; type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeNe(Integer type){
        if(type!=null){
            ne("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 大于 &gt; type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeGt(Integer type){
        if(type!=null){
            gt("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 大于等于 &gt;= type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeGe(Integer type){
        if(type!=null){
            ge("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 小于 &lt; type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeLt(Integer type){
        if(type!=null){
            lt("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 小于等于 &lt;= type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeLe(Integer type){
        if(type!=null){
            le("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * BETWEEN 值1 AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeBetween(Integer typeStart,Integer typeEnd){
        if(typeStart!=null && typeEnd!=null){
            between("type",typeStart,typeEnd);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * NOT BETWEEN 值1 AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeNotBetween(Integer typeStart,Integer typeEnd){
        if(typeStart!=null && typeEnd!=null){
            notBetween("type",typeStart,typeEnd);
        }
        return this;
     }


    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * LIKE '%值%' type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeLike(Integer type){
        if(type!=null){
            like("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * NOT LIKE '%值%' type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeNotLike(Integer type){
        if(type!=null){
            notLike("type",type);
        }
        return this;
     }


    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * LIKE '%值' type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeLikeLeft(Integer type){
        if(type!=null){
            likeLeft("type",type);
        }
        return this;
     }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * LIKE '值%' type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeLikeRight(Integer type){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeIsNull(){
        isNull("type");
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeIsNotNull(){
        isNotNull("type");
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeIn(Integer... values){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeNotIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper typeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("type",values);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * 等于 = taskId
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdEq(String taskId){
        if(taskId!=null){
            eq("task_id",taskId);
        }
        return this;
    }

    /**
     * <p>任务ID</p>
     * 不等于 &lt;&gt; taskId
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdNe(String taskId){
        if(taskId!=null){
            ne("task_id",taskId);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * 大于 &gt; taskId
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdGt(String taskId){
        if(taskId!=null){
            gt("task_id",taskId);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * 大于等于 &gt;= taskId
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdGe(String taskId){
        if(taskId!=null){
            ge("task_id",taskId);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * 小于 &lt; taskId
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdLt(String taskId){
        if(taskId!=null){
            lt("task_id",taskId);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * 小于等于 &lt;= taskId
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdLe(String taskId){
        if(taskId!=null){
            le("task_id",taskId);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * BETWEEN 值1 AND 值2
     * @param taskIdStart       值1
     * @param taskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdBetween(String taskIdStart,String taskIdEnd){
        if(taskIdStart!=null && taskIdEnd!=null){
            between("task_id",taskIdStart,taskIdEnd);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param taskIdStart       值1
     * @param taskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdNotBetween(String taskIdStart,String taskIdEnd){
        if(taskIdStart!=null && taskIdEnd!=null){
            notBetween("task_id",taskIdStart,taskIdEnd);
        }
        return this;
     }


    /**
     * <p>任务ID</p>
     * LIKE '%值%' taskId
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdLike(String taskId){
        if(taskId!=null){
            like("task_id",taskId);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * NOT LIKE '%值%' taskId
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdNotLike(String taskId){
        if(taskId!=null){
            notLike("task_id",taskId);
        }
        return this;
     }


    /**
     * <p>任务ID</p>
     * LIKE '%值' taskId
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdLikeLeft(String taskId){
        if(taskId!=null){
            likeLeft("task_id",taskId);
        }
        return this;
     }

    /**
     * <p>任务ID</p>
     * LIKE '值%' taskId
     * @param taskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdLikeRight(String taskId){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdIsNull(){
        isNull("task_id");
        return this;
    }

    /**
     * <p>任务ID</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdIsNotNull(){
        isNotNull("task_id");
        return this;
    }

    /**
     * <p>任务ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdIn(Collection<String> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdIn(String... values){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdNotIn(Collection<String> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper taskIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("task_id",values);
        }
        return this;
    }

    /**
     * <p>执行顺序</p>
     * 等于 = executionFlow
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowEq(Integer executionFlow){
        if(executionFlow!=null){
            eq("execution_flow",executionFlow);
        }
        return this;
    }

    /**
     * <p>执行顺序</p>
     * 不等于 &lt;&gt; executionFlow
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowNe(Integer executionFlow){
        if(executionFlow!=null){
            ne("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 大于 &gt; executionFlow
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowGt(Integer executionFlow){
        if(executionFlow!=null){
            gt("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 大于等于 &gt;= executionFlow
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowGe(Integer executionFlow){
        if(executionFlow!=null){
            ge("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 小于 &lt; executionFlow
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowLt(Integer executionFlow){
        if(executionFlow!=null){
            lt("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * 小于等于 &lt;= executionFlow
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowLe(Integer executionFlow){
        if(executionFlow!=null){
            le("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * BETWEEN 值1 AND 值2
     * @param executionFlowStart       值1
     * @param executionFlowEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowBetween(Integer executionFlowStart,Integer executionFlowEnd){
        if(executionFlowStart!=null && executionFlowEnd!=null){
            between("execution_flow",executionFlowStart,executionFlowEnd);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * NOT BETWEEN 值1 AND 值2
     * @param executionFlowStart       值1
     * @param executionFlowEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowNotBetween(Integer executionFlowStart,Integer executionFlowEnd){
        if(executionFlowStart!=null && executionFlowEnd!=null){
            notBetween("execution_flow",executionFlowStart,executionFlowEnd);
        }
        return this;
     }


    /**
     * <p>执行顺序</p>
     * LIKE '%值%' executionFlow
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowLike(Integer executionFlow){
        if(executionFlow!=null){
            like("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * NOT LIKE '%值%' executionFlow
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowNotLike(Integer executionFlow){
        if(executionFlow!=null){
            notLike("execution_flow",executionFlow);
        }
        return this;
     }


    /**
     * <p>执行顺序</p>
     * LIKE '%值' executionFlow
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowLikeLeft(Integer executionFlow){
        if(executionFlow!=null){
            likeLeft("execution_flow",executionFlow);
        }
        return this;
     }

    /**
     * <p>执行顺序</p>
     * LIKE '值%' executionFlow
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowLikeRight(Integer executionFlow){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowIsNull(){
        isNull("execution_flow");
        return this;
    }

    /**
     * <p>执行顺序</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowIsNotNull(){
        isNotNull("execution_flow");
        return this;
    }

    /**
     * <p>执行顺序</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowIn(Integer... values){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowNotIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper executionFlowNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("execution_flow",values);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * 等于 = executeMsg
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgEq(String executeMsg){
        if(executeMsg!=null){
            eq("execute_msg",executeMsg);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * 不等于 &lt;&gt; executeMsg
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgNe(String executeMsg){
        if(executeMsg!=null){
            ne("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 大于 &gt; executeMsg
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgGt(String executeMsg){
        if(executeMsg!=null){
            gt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 大于等于 &gt;= executeMsg
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgGe(String executeMsg){
        if(executeMsg!=null){
            ge("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 小于 &lt; executeMsg
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgLt(String executeMsg){
        if(executeMsg!=null){
            lt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * 小于等于 &lt;= executeMsg
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgLe(String executeMsg){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgBetween(String executeMsgStart,String executeMsgEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgNotBetween(String executeMsgStart,String executeMsgEnd){
        if(executeMsgStart!=null && executeMsgEnd!=null){
            notBetween("execute_msg",executeMsgStart,executeMsgEnd);
        }
        return this;
     }


    /**
     * <p>执行任务消息</p>
     * LIKE '%值%' executeMsg
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgLike(String executeMsg){
        if(executeMsg!=null){
            like("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * NOT LIKE '%值%' executeMsg
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgNotLike(String executeMsg){
        if(executeMsg!=null){
            notLike("execute_msg",executeMsg);
        }
        return this;
     }


    /**
     * <p>执行任务消息</p>
     * LIKE '%值' executeMsg
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgLikeLeft(String executeMsg){
        if(executeMsg!=null){
            likeLeft("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * LIKE '值%' executeMsg
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgLikeRight(String executeMsg){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgIsNull(){
        isNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgIsNotNull(){
        isNotNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgIn(Collection<String> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgIn(String... values){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgNotIn(Collection<String> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper executeMsgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("execute_msg",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusLikeRight(Integer status){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusIn(Integer... values){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusNotIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 等于 = versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 不等于 &lt;&gt; versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于 &gt; versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于等于 &gt;= versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于 &lt; versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于等于 &lt;= versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdLe(Long versionId){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值' versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * LIKE '值%' versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdLikeRight(Long versionId){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdIn(Long... values){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeEq(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeNe(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeGt(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeGe(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeLt(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeLe(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeLike(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeNotLike(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeLikeRight(Date createTime){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeIn(Date... values){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskRecordUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
