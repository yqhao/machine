package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtask;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 更新机器子任务表
 * </p>
 * "mc_update_device_subtask"
 * @author 18374
 */
public class McUpdateDeviceSubtaskUpdateWrapper extends UpdateWrapper<McUpdateDeviceSubtask> {

    public static McUpdateDeviceSubtaskUpdateWrapper wrapper() {
        return new McUpdateDeviceSubtaskUpdateWrapper();
    }

    public McUpdateDeviceSubtaskUpdateWrapper() {
        super();
    }

    public McUpdateDeviceSubtaskUpdateWrapper(McUpdateDeviceSubtask entity) {
        super(entity);
    }

    /**
     * 记录id自动增长
     */
    public McUpdateDeviceSubtaskUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 更新机器任务表Id
     */
    public McUpdateDeviceSubtaskUpdateWrapper setFkMcUpdateDeviceTaskId(Long fkMcUpdateDeviceTaskId) {
         set("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        return this;
    }
    /**
     * 1：重置机器并安装服务，2：OTA重启，3：服务商重启
     */
    public McUpdateDeviceSubtaskUpdateWrapper setType(Integer type) {
         set("type",type);
        return this;
    }
    /**
     * 执行顺序
     */
    public McUpdateDeviceSubtaskUpdateWrapper setExecutionFlow(Integer executionFlow) {
         set("execution_flow",executionFlow);
        return this;
    }
    /**
     * 状态（-50：删除，50：正常）
     */
    public McUpdateDeviceSubtaskUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 创建时间
     */
    public McUpdateDeviceSubtaskUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 修改时间
     */
    public McUpdateDeviceSubtaskUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper idEq(Long id){
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
    public McUpdateDeviceSubtaskUpdateWrapper idNe(Long id){
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
    public McUpdateDeviceSubtaskUpdateWrapper idGt(Long id){
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
    public McUpdateDeviceSubtaskUpdateWrapper idGe(Long id){
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
    public McUpdateDeviceSubtaskUpdateWrapper idLt(Long id){
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
    public McUpdateDeviceSubtaskUpdateWrapper idLe(Long id){
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
    public McUpdateDeviceSubtaskUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public McUpdateDeviceSubtaskUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public McUpdateDeviceSubtaskUpdateWrapper idLike(Long id){
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
    public McUpdateDeviceSubtaskUpdateWrapper idNotLike(Long id){
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
    public McUpdateDeviceSubtaskUpdateWrapper idLikeLeft(Long id){
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
    public McUpdateDeviceSubtaskUpdateWrapper idLikeRight(Long id){
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
    public McUpdateDeviceSubtaskUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper idIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskUpdateWrapper idIn(Long... values){
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
    public McUpdateDeviceSubtaskUpdateWrapper idNotIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * 等于 = fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdEq(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            eq("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * 不等于 &lt;&gt; fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdNe(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            ne("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 大于 &gt; fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdGt(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            gt("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 大于等于 &gt;= fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdGe(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            ge("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 小于 &lt; fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdLt(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            lt("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * 小于等于 &lt;= fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdLe(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            le("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceTaskIdStart       值1
     * @param fkMcUpdateDeviceTaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdBetween(Long fkMcUpdateDeviceTaskIdStart,Long fkMcUpdateDeviceTaskIdEnd){
        if(fkMcUpdateDeviceTaskIdStart!=null && fkMcUpdateDeviceTaskIdEnd!=null){
            between("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskIdStart,fkMcUpdateDeviceTaskIdEnd);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceTaskIdStart       值1
     * @param fkMcUpdateDeviceTaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdNotBetween(Long fkMcUpdateDeviceTaskIdStart,Long fkMcUpdateDeviceTaskIdEnd){
        if(fkMcUpdateDeviceTaskIdStart!=null && fkMcUpdateDeviceTaskIdEnd!=null){
            notBetween("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskIdStart,fkMcUpdateDeviceTaskIdEnd);
        }
        return this;
     }


    /**
     * <p>更新机器任务表Id</p>
     * LIKE '%值%' fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdLike(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            like("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * NOT LIKE '%值%' fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdNotLike(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            notLike("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }


    /**
     * <p>更新机器任务表Id</p>
     * LIKE '%值' fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdLikeLeft(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            likeLeft("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * LIKE '值%' fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdLikeRight(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdIsNull(){
        isNull("fk_mc_update_device_task_id");
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdIsNotNull(){
        isNotNull("fk_mc_update_device_task_id");
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdIn(Long... values){
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
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceSubtaskUpdateWrapper fkMcUpdateDeviceTaskIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_update_device_task_id",values);
        }
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * 等于 = type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper typeEq(Integer type){
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
    public McUpdateDeviceSubtaskUpdateWrapper typeNe(Integer type){
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
    public McUpdateDeviceSubtaskUpdateWrapper typeGt(Integer type){
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
    public McUpdateDeviceSubtaskUpdateWrapper typeGe(Integer type){
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
    public McUpdateDeviceSubtaskUpdateWrapper typeLt(Integer type){
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
    public McUpdateDeviceSubtaskUpdateWrapper typeLe(Integer type){
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
    public McUpdateDeviceSubtaskUpdateWrapper typeBetween(Integer typeStart,Integer typeEnd){
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
    public McUpdateDeviceSubtaskUpdateWrapper typeNotBetween(Integer typeStart,Integer typeEnd){
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
    public McUpdateDeviceSubtaskUpdateWrapper typeLike(Integer type){
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
    public McUpdateDeviceSubtaskUpdateWrapper typeNotLike(Integer type){
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
    public McUpdateDeviceSubtaskUpdateWrapper typeLikeLeft(Integer type){
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
    public McUpdateDeviceSubtaskUpdateWrapper typeLikeRight(Integer type){
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
    public McUpdateDeviceSubtaskUpdateWrapper typeIsNull(){
        isNull("type");
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper typeIsNotNull(){
        isNotNull("type");
        return this;
    }

    /**
     * <p>1：重置机器并安装服务，2：OTA重启，3：服务商重启</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper typeIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskUpdateWrapper typeIn(Integer... values){
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
    public McUpdateDeviceSubtaskUpdateWrapper typeNotIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskUpdateWrapper typeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("type",values);
        }
        return this;
    }

    /**
     * <p>执行顺序</p>
     * 等于 = executionFlow
     * @param executionFlow       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowEq(Integer executionFlow){
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
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowNe(Integer executionFlow){
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
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowGt(Integer executionFlow){
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
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowGe(Integer executionFlow){
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
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowLt(Integer executionFlow){
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
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowLe(Integer executionFlow){
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
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowBetween(Integer executionFlowStart,Integer executionFlowEnd){
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
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowNotBetween(Integer executionFlowStart,Integer executionFlowEnd){
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
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowLike(Integer executionFlow){
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
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowNotLike(Integer executionFlow){
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
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowLikeLeft(Integer executionFlow){
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
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowLikeRight(Integer executionFlow){
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
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowIsNull(){
        isNull("execution_flow");
        return this;
    }

    /**
     * <p>执行顺序</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowIsNotNull(){
        isNotNull("execution_flow");
        return this;
    }

    /**
     * <p>执行顺序</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowIn(Integer... values){
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
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowNotIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskUpdateWrapper executionFlowNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("execution_flow",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper statusLikeRight(Integer status){
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
    public McUpdateDeviceSubtaskUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper statusIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskUpdateWrapper statusIn(Integer... values){
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
    public McUpdateDeviceSubtaskUpdateWrapper statusNotIn(Collection<Integer> value){
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
    public McUpdateDeviceSubtaskUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper createTimeEq(Date createTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper createTimeNe(Date createTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper createTimeGt(Date createTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper createTimeGe(Date createTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper createTimeLt(Date createTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper createTimeLe(Date createTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceSubtaskUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceSubtaskUpdateWrapper createTimeLike(Date createTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper createTimeNotLike(Date createTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper createTimeLikeRight(Date createTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper createTimeIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskUpdateWrapper createTimeIn(Date... values){
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
    public McUpdateDeviceSubtaskUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskUpdateWrapper createTimeNotIn(Date... values){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceSubtaskUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
