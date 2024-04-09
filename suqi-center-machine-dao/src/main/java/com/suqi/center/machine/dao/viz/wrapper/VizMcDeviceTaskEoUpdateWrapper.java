package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.viz.entity.VizMcDeviceTaskEo;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 机器任务表
 * </p>
 * "viz_mc_device_task"
 * @author 18374
 */
public class VizMcDeviceTaskEoUpdateWrapper extends UpdateWrapper<VizMcDeviceTaskEo> {

    public static VizMcDeviceTaskEoUpdateWrapper wrapper() {
        return new VizMcDeviceTaskEoUpdateWrapper();
    }

    public VizMcDeviceTaskEoUpdateWrapper() {
        super();
    }

    public VizMcDeviceTaskEoUpdateWrapper(VizMcDeviceTaskEo entity) {
        super(entity);
    }

    /**
     * 记录id雪花算法
     */
    public VizMcDeviceTaskEoUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 任务表记录id
     */
    public VizMcDeviceTaskEoUpdateWrapper setFkVizMcTaskId(Long fkVizMcTaskId) {
         set("fk_viz_mc_task_id",fkVizMcTaskId);
        return this;
    }
    /**
     * 机器基础信息表记录id
     */
    public VizMcDeviceTaskEoUpdateWrapper setFkMcMachineId(Long fkMcMachineId) {
         set("fk_mc_machine_id",fkMcMachineId);
        return this;
    }
    /**
     * 任务表Id
     */
    public VizMcDeviceTaskEoUpdateWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 设备唯一码
     */
    public VizMcDeviceTaskEoUpdateWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 执行任务消息
     */
    public VizMcDeviceTaskEoUpdateWrapper setExecuteMsg(String executeMsg) {
         set("execute_msg",executeMsg);
        return this;
    }
    /**
     * 执行任务ID
     */
    public VizMcDeviceTaskEoUpdateWrapper setJobId(String jobId) {
         set("job_id",jobId);
        return this;
    }
    /**
     * 任务处理开始时间
     */
    public VizMcDeviceTaskEoUpdateWrapper setBeginTime(Date beginTime) {
         set("begin_time",beginTime);
        return this;
    }
    /**
     * 任务处理结束时间
     */
    public VizMcDeviceTaskEoUpdateWrapper setEndTime(Date endTime) {
         set("end_time",endTime);
        return this;
    }
    /**
     * 状态（-50：失败，0：等待中，10：运行中，50：成功）
     */
    public VizMcDeviceTaskEoUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 操作人员
     */
    public VizMcDeviceTaskEoUpdateWrapper setOperateSysUserId(Long operateSysUserId) {
         set("operate_sys_user_id",operateSysUserId);
        return this;
    }
    /**
     * 版本Id
     */
    public VizMcDeviceTaskEoUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 创建时间
     */
    public VizMcDeviceTaskEoUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 修改时间
     */
    public VizMcDeviceTaskEoUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 逻辑删除-默认dr=0
     */
    public VizMcDeviceTaskEoUpdateWrapper setDr(Integer dr) {
         set("dr",dr);
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper idLe(Long id){
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
    public VizMcDeviceTaskEoUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper idLikeRight(Long id){
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
    public VizMcDeviceTaskEoUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper idIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateWrapper idIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateWrapper idNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * 等于 = fkVizMcTaskId
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdEq(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            eq("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * 不等于 &lt;&gt; fkVizMcTaskId
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdNe(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            ne("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * 大于 &gt; fkVizMcTaskId
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdGt(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            gt("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * 大于等于 &gt;= fkVizMcTaskId
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdGe(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            ge("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * 小于 &lt; fkVizMcTaskId
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdLt(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            lt("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * 小于等于 &lt;= fkVizMcTaskId
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdLe(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdBetween(Long fkVizMcTaskIdStart,Long fkVizMcTaskIdEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdNotBetween(Long fkVizMcTaskIdStart,Long fkVizMcTaskIdEnd){
        if(fkVizMcTaskIdStart!=null && fkVizMcTaskIdEnd!=null){
            notBetween("fk_viz_mc_task_id",fkVizMcTaskIdStart,fkVizMcTaskIdEnd);
        }
        return this;
     }


    /**
     * <p>任务表记录id</p>
     * LIKE '%值%' fkVizMcTaskId
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdLike(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            like("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * NOT LIKE '%值%' fkVizMcTaskId
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdNotLike(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            notLike("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }


    /**
     * <p>任务表记录id</p>
     * LIKE '%值' fkVizMcTaskId
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdLikeLeft(Long fkVizMcTaskId){
        if(fkVizMcTaskId!=null){
            likeLeft("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * LIKE '值%' fkVizMcTaskId
     * @param fkVizMcTaskId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdLikeRight(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdIsNull(){
        isNull("fk_viz_mc_task_id");
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdIsNotNull(){
        isNotNull("fk_viz_mc_task_id");
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateWrapper fkVizMcTaskIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_viz_mc_task_id",values);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * 等于 = fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdEq(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdNe(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdGt(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdGe(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdLt(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdLe(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdLike(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateWrapper fkMcMachineIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_machine_id",values);
        }
        return this;
    }

    /**
     * <p>任务表Id</p>
     * 等于 = instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>任务表Id</p>
     * 不等于 &lt;&gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * 大于 &gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * 大于等于 &gt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * 小于 &lt; instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * 小于等于 &lt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper instanceIdLe(String instanceId){
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
    public VizMcDeviceTaskEoUpdateWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>任务表Id</p>
     * LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * NOT LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>任务表Id</p>
     * LIKE '%值' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * LIKE '值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper instanceIdLikeRight(String instanceId){
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
    public VizMcDeviceTaskEoUpdateWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>任务表Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>任务表Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper instanceIdIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateWrapper instanceIdIn(String... values){
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
    public VizMcDeviceTaskEoUpdateWrapper instanceIdNotIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = deviceId
     * @param deviceId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper deviceIdEq(String deviceId){
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
    public VizMcDeviceTaskEoUpdateWrapper deviceIdNe(String deviceId){
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
    public VizMcDeviceTaskEoUpdateWrapper deviceIdGt(String deviceId){
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
    public VizMcDeviceTaskEoUpdateWrapper deviceIdGe(String deviceId){
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
    public VizMcDeviceTaskEoUpdateWrapper deviceIdLt(String deviceId){
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
    public VizMcDeviceTaskEoUpdateWrapper deviceIdLe(String deviceId){
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
    public VizMcDeviceTaskEoUpdateWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper deviceIdLike(String deviceId){
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
    public VizMcDeviceTaskEoUpdateWrapper deviceIdNotLike(String deviceId){
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
    public VizMcDeviceTaskEoUpdateWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcDeviceTaskEoUpdateWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcDeviceTaskEoUpdateWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper deviceIdIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateWrapper deviceIdIn(String... values){
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
    public VizMcDeviceTaskEoUpdateWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * 等于 = executeMsg
     * @param executeMsg       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper executeMsgEq(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateWrapper executeMsgNe(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateWrapper executeMsgGt(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateWrapper executeMsgGe(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateWrapper executeMsgLt(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateWrapper executeMsgLe(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateWrapper executeMsgBetween(String executeMsgStart,String executeMsgEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper executeMsgNotBetween(String executeMsgStart,String executeMsgEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper executeMsgLike(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateWrapper executeMsgNotLike(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateWrapper executeMsgLikeLeft(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateWrapper executeMsgLikeRight(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateWrapper executeMsgIsNull(){
        isNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper executeMsgIsNotNull(){
        isNotNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper executeMsgIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateWrapper executeMsgIn(String... values){
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
    public VizMcDeviceTaskEoUpdateWrapper executeMsgNotIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateWrapper executeMsgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("execute_msg",values);
        }
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * 等于 = jobId
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper jobIdEq(String jobId){
        if(jobId!=null){
            eq("job_id",jobId);
        }
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * 不等于 &lt;&gt; jobId
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper jobIdNe(String jobId){
        if(jobId!=null){
            ne("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * 大于 &gt; jobId
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper jobIdGt(String jobId){
        if(jobId!=null){
            gt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * 大于等于 &gt;= jobId
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper jobIdGe(String jobId){
        if(jobId!=null){
            ge("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * 小于 &lt; jobId
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper jobIdLt(String jobId){
        if(jobId!=null){
            lt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * 小于等于 &lt;= jobId
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper jobIdLe(String jobId){
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
    public VizMcDeviceTaskEoUpdateWrapper jobIdBetween(String jobIdStart,String jobIdEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper jobIdNotBetween(String jobIdStart,String jobIdEnd){
        if(jobIdStart!=null && jobIdEnd!=null){
            notBetween("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }


    /**
     * <p>执行任务ID</p>
     * LIKE '%值%' jobId
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper jobIdLike(String jobId){
        if(jobId!=null){
            like("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * NOT LIKE '%值%' jobId
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper jobIdNotLike(String jobId){
        if(jobId!=null){
            notLike("job_id",jobId);
        }
        return this;
     }


    /**
     * <p>执行任务ID</p>
     * LIKE '%值' jobId
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper jobIdLikeLeft(String jobId){
        if(jobId!=null){
            likeLeft("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * LIKE '值%' jobId
     * @param jobId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper jobIdLikeRight(String jobId){
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
    public VizMcDeviceTaskEoUpdateWrapper jobIdIsNull(){
        isNull("job_id");
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper jobIdIsNotNull(){
        isNotNull("job_id");
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper jobIdIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateWrapper jobIdIn(String... values){
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
    public VizMcDeviceTaskEoUpdateWrapper jobIdNotIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateWrapper jobIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("job_id",values);
        }
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * 等于 = beginTime
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper beginTimeEq(Date beginTime){
        if(beginTime!=null){
            eq("begin_time",beginTime);
        }
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * 不等于 &lt;&gt; beginTime
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper beginTimeNe(Date beginTime){
        if(beginTime!=null){
            ne("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * 大于 &gt; beginTime
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper beginTimeGt(Date beginTime){
        if(beginTime!=null){
            gt("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * 大于等于 &gt;= beginTime
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper beginTimeGe(Date beginTime){
        if(beginTime!=null){
            ge("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * 小于 &lt; beginTime
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper beginTimeLt(Date beginTime){
        if(beginTime!=null){
            lt("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * 小于等于 &lt;= beginTime
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper beginTimeLe(Date beginTime){
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
    public VizMcDeviceTaskEoUpdateWrapper beginTimeBetween(Date beginTimeStart,Date beginTimeEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper beginTimeNotBetween(Date beginTimeStart,Date beginTimeEnd){
        if(beginTimeStart!=null && beginTimeEnd!=null){
            notBetween("begin_time",beginTimeStart,beginTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务处理开始时间</p>
     * LIKE '%值%' beginTime
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper beginTimeLike(Date beginTime){
        if(beginTime!=null){
            like("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * NOT LIKE '%值%' beginTime
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper beginTimeNotLike(Date beginTime){
        if(beginTime!=null){
            notLike("begin_time",beginTime);
        }
        return this;
     }


    /**
     * <p>任务处理开始时间</p>
     * LIKE '%值' beginTime
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper beginTimeLikeLeft(Date beginTime){
        if(beginTime!=null){
            likeLeft("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * LIKE '值%' beginTime
     * @param beginTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper beginTimeLikeRight(Date beginTime){
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
    public VizMcDeviceTaskEoUpdateWrapper beginTimeIsNull(){
        isNull("begin_time");
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper beginTimeIsNotNull(){
        isNotNull("begin_time");
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper beginTimeIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateWrapper beginTimeIn(Date... values){
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
    public VizMcDeviceTaskEoUpdateWrapper beginTimeNotIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateWrapper beginTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("begin_time",values);
        }
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * 等于 = endTime
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper endTimeEq(Date endTime){
        if(endTime!=null){
            eq("end_time",endTime);
        }
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * 不等于 &lt;&gt; endTime
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper endTimeNe(Date endTime){
        if(endTime!=null){
            ne("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * 大于 &gt; endTime
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper endTimeGt(Date endTime){
        if(endTime!=null){
            gt("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * 大于等于 &gt;= endTime
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper endTimeGe(Date endTime){
        if(endTime!=null){
            ge("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * 小于 &lt; endTime
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper endTimeLt(Date endTime){
        if(endTime!=null){
            lt("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * 小于等于 &lt;= endTime
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper endTimeLe(Date endTime){
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
    public VizMcDeviceTaskEoUpdateWrapper endTimeBetween(Date endTimeStart,Date endTimeEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper endTimeNotBetween(Date endTimeStart,Date endTimeEnd){
        if(endTimeStart!=null && endTimeEnd!=null){
            notBetween("end_time",endTimeStart,endTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务处理结束时间</p>
     * LIKE '%值%' endTime
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper endTimeLike(Date endTime){
        if(endTime!=null){
            like("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * NOT LIKE '%值%' endTime
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper endTimeNotLike(Date endTime){
        if(endTime!=null){
            notLike("end_time",endTime);
        }
        return this;
     }


    /**
     * <p>任务处理结束时间</p>
     * LIKE '%值' endTime
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper endTimeLikeLeft(Date endTime){
        if(endTime!=null){
            likeLeft("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * LIKE '值%' endTime
     * @param endTime       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper endTimeLikeRight(Date endTime){
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
    public VizMcDeviceTaskEoUpdateWrapper endTimeIsNull(){
        isNull("end_time");
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper endTimeIsNotNull(){
        isNotNull("end_time");
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper endTimeIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateWrapper endTimeIn(Date... values){
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
    public VizMcDeviceTaskEoUpdateWrapper endTimeNotIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateWrapper endTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("end_time",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper statusLe(Integer status){
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
    public VizMcDeviceTaskEoUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper statusLikeRight(Integer status){
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
    public VizMcDeviceTaskEoUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper statusIn(Collection<Integer> value){
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
    public VizMcDeviceTaskEoUpdateWrapper statusIn(Integer... values){
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
    public VizMcDeviceTaskEoUpdateWrapper statusNotIn(Collection<Integer> value){
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
    public VizMcDeviceTaskEoUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * 等于 = operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdEq(Long operateSysUserId){
        if(operateSysUserId!=null){
            eq("operate_sys_user_id",operateSysUserId);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * 不等于 &lt;&gt; operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdNe(Long operateSysUserId){
        if(operateSysUserId!=null){
            ne("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 大于 &gt; operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdGt(Long operateSysUserId){
        if(operateSysUserId!=null){
            gt("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 大于等于 &gt;= operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdGe(Long operateSysUserId){
        if(operateSysUserId!=null){
            ge("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 小于 &lt; operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdLt(Long operateSysUserId){
        if(operateSysUserId!=null){
            lt("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 小于等于 &lt;= operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdLe(Long operateSysUserId){
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
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdNotBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
        if(operateSysUserIdStart!=null && operateSysUserIdEnd!=null){
            notBetween("operate_sys_user_id",operateSysUserIdStart,operateSysUserIdEnd);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值%' operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdLike(Long operateSysUserId){
        if(operateSysUserId!=null){
            like("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * NOT LIKE '%值%' operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdNotLike(Long operateSysUserId){
        if(operateSysUserId!=null){
            notLike("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值' operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdLikeLeft(Long operateSysUserId){
        if(operateSysUserId!=null){
            likeLeft("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * LIKE '值%' operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdLikeRight(Long operateSysUserId){
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
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdIsNull(){
        isNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdIsNotNull(){
        isNotNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateWrapper operateSysUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("operate_sys_user_id",values);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 等于 = versionId
     * @param versionId       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper versionIdEq(Long versionId){
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
    public VizMcDeviceTaskEoUpdateWrapper versionIdNe(Long versionId){
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
    public VizMcDeviceTaskEoUpdateWrapper versionIdGt(Long versionId){
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
    public VizMcDeviceTaskEoUpdateWrapper versionIdGe(Long versionId){
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
    public VizMcDeviceTaskEoUpdateWrapper versionIdLt(Long versionId){
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
    public VizMcDeviceTaskEoUpdateWrapper versionIdLe(Long versionId){
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
    public VizMcDeviceTaskEoUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper versionIdLike(Long versionId){
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
    public VizMcDeviceTaskEoUpdateWrapper versionIdNotLike(Long versionId){
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
    public VizMcDeviceTaskEoUpdateWrapper versionIdLikeLeft(Long versionId){
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
    public VizMcDeviceTaskEoUpdateWrapper versionIdLikeRight(Long versionId){
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
    public VizMcDeviceTaskEoUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper versionIdIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateWrapper versionIdIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateWrapper versionIdNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateWrapper versionIdNotIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeEq(Date createTime){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeNe(Date createTime){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeGt(Date createTime){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeGe(Date createTime){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeLt(Date createTime){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeLe(Date createTime){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeLike(Date createTime){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeNotLike(Date createTime){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeLikeRight(Date createTime){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper createTimeIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeIn(Date... values){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateWrapper createTimeNotIn(Date... values){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 等于 = dr
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper drEq(Integer dr){
        if(dr!=null){
            eq("dr",dr);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 不等于 &lt;&gt; dr
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper drNe(Integer dr){
        if(dr!=null){
            ne("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 大于 &gt; dr
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper drGt(Integer dr){
        if(dr!=null){
            gt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 大于等于 &gt;= dr
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper drGe(Integer dr){
        if(dr!=null){
            ge("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 小于 &lt; dr
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper drLt(Integer dr){
        if(dr!=null){
            lt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 小于等于 &lt;= dr
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper drLe(Integer dr){
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
    public VizMcDeviceTaskEoUpdateWrapper drBetween(Integer drStart,Integer drEnd){
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
    public VizMcDeviceTaskEoUpdateWrapper drNotBetween(Integer drStart,Integer drEnd){
        if(drStart!=null && drEnd!=null){
            notBetween("dr",drStart,drEnd);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值%' dr
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper drLike(Integer dr){
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT LIKE '%值%' dr
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper drNotLike(Integer dr){
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值' dr
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper drLikeLeft(Integer dr){
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '值%' dr
     * @param dr       值
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper drLikeRight(Integer dr){
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
    public VizMcDeviceTaskEoUpdateWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateWrapper drIn(Collection<Integer> value){
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
    public VizMcDeviceTaskEoUpdateWrapper drIn(Integer... values){
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
    public VizMcDeviceTaskEoUpdateWrapper drNotIn(Collection<Integer> value){
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
    public VizMcDeviceTaskEoUpdateWrapper drNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dr",values);
        }
        return this;
    }


}
