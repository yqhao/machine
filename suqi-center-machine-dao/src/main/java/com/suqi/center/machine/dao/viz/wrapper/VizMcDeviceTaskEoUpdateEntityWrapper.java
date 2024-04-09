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
public class VizMcDeviceTaskEoUpdateEntityWrapper extends UpdateWrapper<VizMcDeviceTaskEo> {

    public static VizMcDeviceTaskEoUpdateEntityWrapper wrapper(VizMcDeviceTaskEo entity) {
        return new VizMcDeviceTaskEoUpdateEntityWrapper(entity);
    }

    private VizMcDeviceTaskEo entity;

    public VizMcDeviceTaskEoUpdateEntityWrapper(VizMcDeviceTaskEo entity) {
        this.entity=entity;
    }

    /**
     * 记录id雪花算法
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 任务表记录id
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setFkVizMcTaskId(Long fkVizMcTaskId) {
         set("fk_viz_mc_task_id",fkVizMcTaskId);
        return this;
    }
    /**
     * 机器基础信息表记录id
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setFkMcMachineId(Long fkMcMachineId) {
         set("fk_mc_machine_id",fkMcMachineId);
        return this;
    }
    /**
     * 任务表Id
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 设备唯一码
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 执行任务消息
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setExecuteMsg(String executeMsg) {
         set("execute_msg",executeMsg);
        return this;
    }
    /**
     * 执行任务ID
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setJobId(String jobId) {
         set("job_id",jobId);
        return this;
    }
    /**
     * 任务处理开始时间
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setBeginTime(Date beginTime) {
         set("begin_time",beginTime);
        return this;
    }
    /**
     * 任务处理结束时间
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setEndTime(Date endTime) {
         set("end_time",endTime);
        return this;
    }
    /**
     * 状态（-50：失败，0：等待中，10：运行中，50：成功）
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 操作人员
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setOperateSysUserId(Long operateSysUserId) {
         set("operate_sys_user_id",operateSysUserId);
        return this;
    }
    /**
     * 版本Id
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 创建时间
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 修改时间
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 逻辑删除-默认dr=0
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setDr(Integer dr) {
         set("dr",dr);
        return this;
    }

    protected VizMcDeviceTaskEo entity() {
        if(entity==null){
            throw new NullPointerException("VizMcDeviceTaskEo is null");
        }
        return entity;
    }

    /**
     * 记录id雪花算法
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 任务表记录id
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setFkVizMcTaskId() {
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null){
            set("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
    }
    /**
     * 机器基础信息表记录id
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setFkMcMachineId() {
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            set("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }
    /**
     * 任务表Id
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setInstanceId() {
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            set("instance_id",instanceId);
        }
        return this;
    }
    /**
     * 设备唯一码
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setDeviceId() {
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            set("device_id",deviceId);
        }
        return this;
    }
    /**
     * 执行任务消息
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setExecuteMsg() {
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            set("execute_msg",executeMsg);
        }
        return this;
    }
    /**
     * 执行任务ID
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setJobId() {
        String jobId =entity().getJobId();
        if(jobId!=null){
            set("job_id",jobId);
        }
        return this;
    }
    /**
     * 任务处理开始时间
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setBeginTime() {
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null){
            set("begin_time",beginTime);
        }
        return this;
    }
    /**
     * 任务处理结束时间
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setEndTime() {
        Date endTime =entity().getEndTime();
        if(endTime!=null){
            set("end_time",endTime);
        }
        return this;
    }
    /**
     * 状态（-50：失败，0：等待中，10：运行中，50：成功）
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setStatus() {
        Integer status =entity().getStatus();
        if(status!=null){
            set("status",status);
        }
        return this;
    }
    /**
     * 操作人员
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setOperateSysUserId() {
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            set("operate_sys_user_id",operateSysUserId);
        }
        return this;
    }
    /**
     * 版本Id
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setVersionId() {
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            set("version_id",versionId);
        }
        return this;
    }
    /**
     * 创建时间
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * 修改时间
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setLastUpdateTime() {
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            set("last_update_time",lastUpdateTime);
        }
        return this;
    }
    /**
     * 逻辑删除-默认dr=0
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper setDr() {
        Integer dr =entity().getDr();
        if(dr!=null){
            set("dr",dr);
        }
        return this;
    }
    /**
     * <p>记录id雪花算法</p>
     * 等于 = entity().getId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper idEq(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idNe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idGt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idGe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idLt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper idBetween(Long idEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值%' entity().getId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper idLikeRight(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idEq(Long id){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idNe(Long id){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idGt(Long id){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idGe(Long id){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idLt(Long id){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idLe(Long id){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idLike(Long id){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idNotLike(Long id){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idLikeLeft(Long id){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idLikeRight(Long id){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper idIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper idNotIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdEq(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdNe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdGt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdGe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdLt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdLe(){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null){
            le("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * BETWEEN  entity().getFkVizMcTaskId() AND 值2
     * @param fkVizMcTaskIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdBetween(Long fkVizMcTaskIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdNotBetween(Long fkVizMcTaskIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdBetween(Long fkVizMcTaskIdStart,Long fkVizMcTaskIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdNotBetween(Long fkVizMcTaskIdStart,Long fkVizMcTaskIdEnd){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null && fkVizMcTaskIdEnd!=null){
            notBetween("fk_viz_mc_task_id",fkVizMcTaskIdStart,fkVizMcTaskIdEnd);
        }
        return this;
     }


    /**
     * <p>任务表记录id</p>
     * LIKE '%值%' entity().getFkVizMcTaskId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdLike(){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null){
            like("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * NOT LIKE '%值%' entity().getFkVizMcTaskId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdNotLike(){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null){
            notLike("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }


    /**
     * <p>任务表记录id</p>
     * LIKE '%值' entity().getFkVizMcTaskId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdLikeLeft(){
        Long fkVizMcTaskId =entity().getFkVizMcTaskId();
        if(fkVizMcTaskId!=null){
            likeLeft("fk_viz_mc_task_id",fkVizMcTaskId);
        }
        return this;
     }

    /**
     * <p>任务表记录id</p>
     * LIKE '值%' entity().getFkVizMcTaskId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdLikeRight(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdEq(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdNe(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdGt(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdGe(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdLt(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdLe(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdLike(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdNotLike(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdLikeLeft(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdLikeRight(Long fkVizMcTaskId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdIsNull(){
        isNull("fk_viz_mc_task_id");
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdIsNotNull(){
        isNotNull("fk_viz_mc_task_id");
        return this;
    }

    /**
     * <p>任务表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkVizMcTaskIdNotIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdEq(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdNe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdGt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdGe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdLt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdLe(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            le("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * BETWEEN  entity().getFkMcMachineId() AND 值2
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null && fkMcMachineIdEnd!=null){
            notBetween("fk_mc_machine_id",fkMcMachineIdStart,fkMcMachineIdEnd);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '%值%' entity().getFkMcMachineId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdLike(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            like("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * NOT LIKE '%值%' entity().getFkMcMachineId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdNotLike(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            notLike("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '%值' entity().getFkMcMachineId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdLikeLeft(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            likeLeft("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '值%' entity().getFkMcMachineId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdLikeRight(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdEq(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdNe(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdGt(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdGe(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdLt(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdLe(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdLike(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper fkMcMachineIdNotIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdEq(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdNe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdGt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdGe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdLt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdLe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdBetween(String instanceIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdNotBetween(String instanceIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>任务表Id</p>
     * LIKE '%值%' entity().getInstanceId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * NOT LIKE '%值%' entity().getInstanceId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdNotLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>任务表Id</p>
     * LIKE '%值' entity().getInstanceId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdLikeLeft(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>任务表Id</p>
     * LIKE '值%' entity().getInstanceId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdLikeRight(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdEq(String instanceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdNe(String instanceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdGt(String instanceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdGe(String instanceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdLt(String instanceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdLe(String instanceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdLike(String instanceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdNotLike(String instanceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdLikeLeft(String instanceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdLikeRight(String instanceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>任务表Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>任务表Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdIn(String... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdNotIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper instanceIdNotIn(String... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdEq(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdNe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdGt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdGe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdLt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值' entity().getDeviceId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%' entity().getDeviceId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdLikeRight(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdEq(String deviceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdNe(String deviceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdGt(String deviceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdGe(String deviceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdLt(String deviceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdLe(String deviceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdLike(String deviceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdNotLike(String deviceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdIn(String... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper deviceIdNotIn(String... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgEq(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgNe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgGt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgGe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgLt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgLe(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            le("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * BETWEEN  entity().getExecuteMsg() AND 值2
     * @param executeMsgEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgBetween(String executeMsgEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgNotBetween(String executeMsgEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgBetween(String executeMsgStart,String executeMsgEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgNotBetween(String executeMsgStart,String executeMsgEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgLike(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            like("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * NOT LIKE '%值%' entity().getExecuteMsg()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgNotLike(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            notLike("execute_msg",executeMsg);
        }
        return this;
     }


    /**
     * <p>执行任务消息</p>
     * LIKE '%值' entity().getExecuteMsg()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgLikeLeft(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            likeLeft("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p>执行任务消息</p>
     * LIKE '值%' entity().getExecuteMsg()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgLikeRight(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgEq(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgNe(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgGt(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgGe(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgLt(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgLe(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgLike(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgNotLike(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgLikeLeft(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgLikeRight(String executeMsg){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgIsNull(){
        isNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgIsNotNull(){
        isNotNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgIn(String... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgNotIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper executeMsgNotIn(String... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdEq(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdNe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdGt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdGe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdLt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdLe(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            le("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * BETWEEN  entity().getJobId() AND 值2
     * @param jobIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdBetween(String jobIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdNotBetween(String jobIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdBetween(String jobIdStart,String jobIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdNotBetween(String jobIdStart,String jobIdEnd){
        String jobId =entity().getJobId();
        if(jobId!=null && jobIdEnd!=null){
            notBetween("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }


    /**
     * <p>执行任务ID</p>
     * LIKE '%值%' entity().getJobId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdLike(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            like("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * NOT LIKE '%值%' entity().getJobId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdNotLike(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            notLike("job_id",jobId);
        }
        return this;
     }


    /**
     * <p>执行任务ID</p>
     * LIKE '%值' entity().getJobId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdLikeLeft(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            likeLeft("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>执行任务ID</p>
     * LIKE '值%' entity().getJobId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdLikeRight(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdEq(String jobId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdNe(String jobId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdGt(String jobId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdGe(String jobId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdLt(String jobId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdLe(String jobId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdLike(String jobId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdNotLike(String jobId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdLikeLeft(String jobId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdLikeRight(String jobId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdIsNull(){
        isNull("job_id");
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdIsNotNull(){
        isNotNull("job_id");
        return this;
    }

    /**
     * <p>执行任务ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdIn(String... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdNotIn(Collection<String> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper jobIdNotIn(String... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeEq(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeNe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeGt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeGe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeLt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeLe(){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null){
            le("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * BETWEEN  entity().getBeginTime() AND 值2
     * @param beginTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeBetween(Date beginTimeEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeNotBetween(Date beginTimeEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeBetween(Date beginTimeStart,Date beginTimeEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeNotBetween(Date beginTimeStart,Date beginTimeEnd){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null && beginTimeEnd!=null){
            notBetween("begin_time",beginTimeStart,beginTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务处理开始时间</p>
     * LIKE '%值%' entity().getBeginTime()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeLike(){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null){
            like("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * NOT LIKE '%值%' entity().getBeginTime()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeNotLike(){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null){
            notLike("begin_time",beginTime);
        }
        return this;
     }


    /**
     * <p>任务处理开始时间</p>
     * LIKE '%值' entity().getBeginTime()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeLikeLeft(){
        Date beginTime =entity().getBeginTime();
        if(beginTime!=null){
            likeLeft("begin_time",beginTime);
        }
        return this;
     }

    /**
     * <p>任务处理开始时间</p>
     * LIKE '值%' entity().getBeginTime()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeLikeRight(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeEq(Date beginTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeNe(Date beginTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeGt(Date beginTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeGe(Date beginTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeLt(Date beginTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeLe(Date beginTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeLike(Date beginTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeNotLike(Date beginTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeLikeLeft(Date beginTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeLikeRight(Date beginTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeIsNull(){
        isNull("begin_time");
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeIsNotNull(){
        isNotNull("begin_time");
        return this;
    }

    /**
     * <p>任务处理开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeIn(Date... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeNotIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper beginTimeNotIn(Date... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeEq(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeNe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeGt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeGe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeLt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeLe(){
        Date endTime =entity().getEndTime();
        if(endTime!=null){
            le("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * BETWEEN  entity().getEndTime() AND 值2
     * @param endTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeBetween(Date endTimeEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeNotBetween(Date endTimeEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeBetween(Date endTimeStart,Date endTimeEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeNotBetween(Date endTimeStart,Date endTimeEnd){
        Date endTime =entity().getEndTime();
        if(endTime!=null && endTimeEnd!=null){
            notBetween("end_time",endTimeStart,endTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务处理结束时间</p>
     * LIKE '%值%' entity().getEndTime()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeLike(){
        Date endTime =entity().getEndTime();
        if(endTime!=null){
            like("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * NOT LIKE '%值%' entity().getEndTime()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeNotLike(){
        Date endTime =entity().getEndTime();
        if(endTime!=null){
            notLike("end_time",endTime);
        }
        return this;
     }


    /**
     * <p>任务处理结束时间</p>
     * LIKE '%值' entity().getEndTime()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeLikeLeft(){
        Date endTime =entity().getEndTime();
        if(endTime!=null){
            likeLeft("end_time",endTime);
        }
        return this;
     }

    /**
     * <p>任务处理结束时间</p>
     * LIKE '值%' entity().getEndTime()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeLikeRight(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeEq(Date endTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeNe(Date endTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeGt(Date endTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeGe(Date endTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeLt(Date endTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeLe(Date endTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeLike(Date endTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeNotLike(Date endTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeLikeLeft(Date endTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeLikeRight(Date endTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeIsNull(){
        isNull("end_time");
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeIsNotNull(){
        isNotNull("end_time");
        return this;
    }

    /**
     * <p>任务处理结束时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeIn(Date... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeNotIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper endTimeNotIn(Date... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusEq(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusNe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusGt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusGe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusLt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper statusBetween(Integer statusEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusNotBetween(Integer statusEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值%' entity().getStatus()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT LIKE '%值%' entity().getStatus()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值' entity().getStatus()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '值%' entity().getStatus()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper statusLikeRight(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusEq(Integer status){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusNe(Integer status){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusGt(Integer status){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusGe(Integer status){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusLt(Integer status){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusLe(Integer status){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusLike(Integer status){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusNotLike(Integer status){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusLikeLeft(Integer status){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusLikeRight(Integer status){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper statusIn(Collection<Integer> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusIn(Integer... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusNotIn(Collection<Integer> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper statusNotIn(Integer... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdEq(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdNe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdGt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdGe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdLt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdLe(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            le("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * BETWEEN  entity().getOperateSysUserId() AND 值2
     * @param operateSysUserIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdBetween(Long operateSysUserIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdNotBetween(Long operateSysUserIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdNotBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null && operateSysUserIdEnd!=null){
            notBetween("operate_sys_user_id",operateSysUserIdStart,operateSysUserIdEnd);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值%' entity().getOperateSysUserId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdLike(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            like("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * NOT LIKE '%值%' entity().getOperateSysUserId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdNotLike(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            notLike("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值' entity().getOperateSysUserId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdLikeLeft(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            likeLeft("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * LIKE '值%' entity().getOperateSysUserId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdLikeRight(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdEq(Long operateSysUserId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdNe(Long operateSysUserId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdGt(Long operateSysUserId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdGe(Long operateSysUserId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdLt(Long operateSysUserId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdLe(Long operateSysUserId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdLike(Long operateSysUserId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdNotLike(Long operateSysUserId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdLikeLeft(Long operateSysUserId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdLikeRight(Long operateSysUserId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdIsNull(){
        isNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdIsNotNull(){
        isNotNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper operateSysUserIdNotIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdEq(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdNe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdGt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdGe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdLt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdBetween(Long versionIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdNotBetween(Long versionIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值' entity().getVersionId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * LIKE '值%' entity().getVersionId()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdLikeRight(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdEq(Long versionId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdNe(Long versionId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdGt(Long versionId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdGe(Long versionId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdLt(Long versionId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdLe(Long versionId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdLike(Long versionId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdNotLike(Long versionId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdLikeLeft(Long versionId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdLikeRight(Long versionId){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper versionIdNotIn(Long... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeEq(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeNe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeGt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeGe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeLt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeLikeRight(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeEq(Date createTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeNe(Date createTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeGt(Date createTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeGe(Date createTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeLt(Date createTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeLe(Date createTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeLike(Date createTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeIn(Date... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper createTimeNotIn(Date... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeEq(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeNe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeGt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeGe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeLt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值' entity().getLastUpdateTime()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%' entity().getLastUpdateTime()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeLikeRight(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drEq(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drNe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drGt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drGe(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drLt(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drLe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            le("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * BETWEEN  entity().getDr() AND 值2
     * @param drEnd      值2
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper drBetween(Integer drEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drNotBetween(Integer drEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drBetween(Integer drStart,Integer drEnd){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drNotBetween(Integer drStart,Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            notBetween("dr",drStart,drEnd);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值%' entity().getDr()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper drLike(){
        Integer dr =entity().getDr();
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT LIKE '%值%' entity().getDr()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper drNotLike(){
        Integer dr =entity().getDr();
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值' entity().getDr()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper drLikeLeft(){
        Integer dr =entity().getDr();
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '值%' entity().getDr()
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper drLikeRight(){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drEq(Integer dr){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drNe(Integer dr){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drGt(Integer dr){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drGe(Integer dr){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drLt(Integer dr){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drLe(Integer dr){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drLike(Integer dr){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drNotLike(Integer dr){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drLikeLeft(Integer dr){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drLikeRight(Integer dr){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcDeviceTaskEoUpdateEntityWrapper drIn(Collection<Integer> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drIn(Integer... values){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drNotIn(Collection<Integer> value){
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
    public VizMcDeviceTaskEoUpdateEntityWrapper drNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dr",values);
        }
        return this;
    }


}
