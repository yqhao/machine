package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskRecord;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 机器更新任务记录表
 * </p>
 * "mc_update_device_task_record"
 * @author 18374
 */
public class McUpdateDeviceTaskRecordUpdateEntityWrapper extends UpdateWrapper<McUpdateDeviceTaskRecord> {

    public static McUpdateDeviceTaskRecordUpdateEntityWrapper wrapper(McUpdateDeviceTaskRecord entity) {
        return new McUpdateDeviceTaskRecordUpdateEntityWrapper(entity);
    }

    private McUpdateDeviceTaskRecord entity;

    public McUpdateDeviceTaskRecordUpdateEntityWrapper(McUpdateDeviceTaskRecord entity) {
        this.entity=entity;
    }

    /**
     * 记录id自动增长
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 云机端软件包记录Id
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setFkMcServerSoftwarePackageId(Long fkMcServerSoftwarePackageId) {
         set("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        return this;
    }
    /**
     * 更新机器任务表Id
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setFkMcUpdateDeviceTaskId(Long fkMcUpdateDeviceTaskId) {
         set("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        return this;
    }
    /**
     * 机器基础信息表记录Id
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setFkMcMachineId(Long fkMcMachineId) {
         set("fk_mc_machine_id",fkMcMachineId);
        return this;
    }
    /**
     * 机器更新子任务记录Id
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setFkMcUpdateDeviceSubtaskRecordId(Long fkMcUpdateDeviceSubtaskRecordId) {
         set("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        return this;
    }
    /**
     * 任务类型（1：系统任务，2：用户任务）
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setType(Integer type) {
         set("type",type);
        return this;
    }
    /**
     * 设备唯一码
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 设备实例Id
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 执行任务消息
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setExecuteMsg(String executeMsg) {
         set("execute_msg",executeMsg);
        return this;
    }
    /**
     * 任务开始执行时间（具体开始时间）
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setTaskStartTime(Date taskStartTime) {
         set("task_start_time",taskStartTime);
        return this;
    }
    /**
     * 等待执行开始时间
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setWaitOverStartDate(Date waitOverStartDate) {
         set("wait_over_start_date",waitOverStartDate);
        return this;
    }
    /**
     * 任务开始时间（定时开始时间）
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setStartTime(Date startTime) {
         set("start_time",startTime);
        return this;
    }
    /**
     * 状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 版本Id
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 创建时间
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 修改时间
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    protected McUpdateDeviceTaskRecord entity() {
        if(entity==null){
            throw new NullPointerException("McUpdateDeviceTaskRecord is null");
        }
        return entity;
    }

    /**
     * <p>记录id自动增长</p>
     * 等于 = entity().getId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idEq(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idNe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idGt(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idGe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idLt(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idLe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idBetween(Long idEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idLike(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idNotLike(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idLikeLeft(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idLikeRight(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idEq(Long id){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idNe(Long id){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idGt(Long id){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idGe(Long id){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idLt(Long id){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idLe(Long id){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idLike(Long id){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idNotLike(Long id){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idLikeLeft(Long id){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idLikeRight(Long id){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idIn(Long... values){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 等于 = entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdEq(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            eq("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 不等于 &lt;&gt; entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdNe(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            ne("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 大于 &gt; entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdGt(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            gt("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 大于等于 &gt;= entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdGe(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            ge("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 小于 &lt; entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdLt(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            lt("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 小于等于 &lt;= entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdLe(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            le("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * BETWEEN  entity().getFkMcServerSoftwarePackageId() AND 值2
     * @param fkMcServerSoftwarePackageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdBetween(Long fkMcServerSoftwarePackageIdEnd){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null && fkMcServerSoftwarePackageIdEnd!=null){
            between("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId(),fkMcServerSoftwarePackageIdEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT BETWEEN  entity().getFkMcServerSoftwarePackageId() AND 值2
     * @param fkMcServerSoftwarePackageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdNotBetween(Long fkMcServerSoftwarePackageIdEnd){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null && fkMcServerSoftwarePackageIdEnd!=null){
            notBetween("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId(),fkMcServerSoftwarePackageIdEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * BETWEEN  entity().getFkMcServerSoftwarePackageId() AND 值2
     * @param fkMcServerSoftwarePackageIdStart       值1
     * @param fkMcServerSoftwarePackageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdBetween(Long fkMcServerSoftwarePackageIdStart,Long fkMcServerSoftwarePackageIdEnd){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null && fkMcServerSoftwarePackageIdEnd!=null){
            between("fk_mc_server_software_package_id",fkMcServerSoftwarePackageIdStart,fkMcServerSoftwarePackageIdEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT BETWEEN  entity().getFkMcServerSoftwarePackageId() AND 值2
     * @param fkMcServerSoftwarePackageIdStart       值1
     * @param fkMcServerSoftwarePackageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdNotBetween(Long fkMcServerSoftwarePackageIdStart,Long fkMcServerSoftwarePackageIdEnd){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null && fkMcServerSoftwarePackageIdEnd!=null){
            notBetween("fk_mc_server_software_package_id",fkMcServerSoftwarePackageIdStart,fkMcServerSoftwarePackageIdEnd);
        }
        return this;
     }


    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '%值%' entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdLike(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            like("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT LIKE '%值%' entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdNotLike(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            notLike("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }


    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '%值' entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdLikeLeft(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            likeLeft("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '值%' entity().getFkMcServerSoftwarePackageId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdLikeRight(){
        Long fkMcServerSoftwarePackageId =entity().getFkMcServerSoftwarePackageId();
        if(fkMcServerSoftwarePackageId!=null){
            likeRight("fk_mc_server_software_package_id",entity().getFkMcServerSoftwarePackageId());
        }
        return this;
     }

/**
     * <p>云机端软件包记录Id</p>
     * 等于 =
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdEq(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            eq("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 不等于 &lt;&gt;
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdNe(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            ne("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 大于 &gt;
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdGt(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            gt("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 大于等于 &gt;=
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdGe(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            ge("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 小于 &lt;
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdLt(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            lt("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 小于等于 &lt;=
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdLe(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            le("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '%值%'
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdLike(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            like("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT LIKE '%值%'
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdNotLike(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            notLike("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }


    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '%值'
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdLikeLeft(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            likeLeft("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '值%'
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdLikeRight(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            likeRight("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdIsNull(){
        isNull("fk_mc_server_software_package_id");
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdIsNotNull(){
        isNotNull("fk_mc_server_software_package_id");
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_server_software_package_id",value);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_server_software_package_id",values);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_server_software_package_id",value);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcServerSoftwarePackageIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_server_software_package_id",values);
        }
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * 等于 = entity().getFkMcUpdateDeviceTaskId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdEq(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdNe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdGt(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdGe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdLt(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdLe(){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null){
            le("fk_mc_update_device_task_id",entity().getFkMcUpdateDeviceTaskId());
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * BETWEEN  entity().getFkMcUpdateDeviceTaskId() AND 值2
     * @param fkMcUpdateDeviceTaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdBetween(Long fkMcUpdateDeviceTaskIdEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdNotBetween(Long fkMcUpdateDeviceTaskIdEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdBetween(Long fkMcUpdateDeviceTaskIdStart,Long fkMcUpdateDeviceTaskIdEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdNotBetween(Long fkMcUpdateDeviceTaskIdStart,Long fkMcUpdateDeviceTaskIdEnd){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null && fkMcUpdateDeviceTaskIdEnd!=null){
            notBetween("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskIdStart,fkMcUpdateDeviceTaskIdEnd);
        }
        return this;
     }


    /**
     * <p>更新机器任务表Id</p>
     * LIKE '%值%' entity().getFkMcUpdateDeviceTaskId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdLike(){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null){
            like("fk_mc_update_device_task_id",entity().getFkMcUpdateDeviceTaskId());
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * NOT LIKE '%值%' entity().getFkMcUpdateDeviceTaskId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdNotLike(){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null){
            notLike("fk_mc_update_device_task_id",entity().getFkMcUpdateDeviceTaskId());
        }
        return this;
     }


    /**
     * <p>更新机器任务表Id</p>
     * LIKE '%值' entity().getFkMcUpdateDeviceTaskId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdLikeLeft(){
        Long fkMcUpdateDeviceTaskId =entity().getFkMcUpdateDeviceTaskId();
        if(fkMcUpdateDeviceTaskId!=null){
            likeLeft("fk_mc_update_device_task_id",entity().getFkMcUpdateDeviceTaskId());
        }
        return this;
     }

    /**
     * <p>更新机器任务表Id</p>
     * LIKE '值%' entity().getFkMcUpdateDeviceTaskId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdLikeRight(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdEq(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdNe(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdGt(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdGe(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdLt(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdLe(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdLike(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdNotLike(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdLikeLeft(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdLikeRight(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdIsNull(){
        isNull("fk_mc_update_device_task_id");
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdIsNotNull(){
        isNotNull("fk_mc_update_device_task_id");
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdIn(Long... values){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceTaskIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_update_device_task_id",values);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * 等于 = entity().getFkMcMachineId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdEq(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            eq("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * 不等于 &lt;&gt; entity().getFkMcMachineId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdNe(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            ne("fk_mc_machine_id",entity().getFkMcMachineId());
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * 大于 &gt; entity().getFkMcMachineId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdGt(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            gt("fk_mc_machine_id",entity().getFkMcMachineId());
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * 大于等于 &gt;= entity().getFkMcMachineId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdGe(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            ge("fk_mc_machine_id",entity().getFkMcMachineId());
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * 小于 &lt; entity().getFkMcMachineId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdLt(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            lt("fk_mc_machine_id",entity().getFkMcMachineId());
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * 小于等于 &lt;= entity().getFkMcMachineId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdLe(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            le("fk_mc_machine_id",entity().getFkMcMachineId());
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * BETWEEN  entity().getFkMcMachineId() AND 值2
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdEnd){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null && fkMcMachineIdEnd!=null){
            between("fk_mc_machine_id",entity().getFkMcMachineId(),fkMcMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * NOT BETWEEN  entity().getFkMcMachineId() AND 值2
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdEnd){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null && fkMcMachineIdEnd!=null){
            notBetween("fk_mc_machine_id",entity().getFkMcMachineId(),fkMcMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * BETWEEN  entity().getFkMcMachineId() AND 值2
     * @param fkMcMachineIdStart       值1
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null && fkMcMachineIdEnd!=null){
            between("fk_mc_machine_id",fkMcMachineIdStart,fkMcMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * NOT BETWEEN  entity().getFkMcMachineId() AND 值2
     * @param fkMcMachineIdStart       值1
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null && fkMcMachineIdEnd!=null){
            notBetween("fk_mc_machine_id",fkMcMachineIdStart,fkMcMachineIdEnd);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录Id</p>
     * LIKE '%值%' entity().getFkMcMachineId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdLike(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            like("fk_mc_machine_id",entity().getFkMcMachineId());
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * NOT LIKE '%值%' entity().getFkMcMachineId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdNotLike(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            notLike("fk_mc_machine_id",entity().getFkMcMachineId());
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录Id</p>
     * LIKE '%值' entity().getFkMcMachineId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdLikeLeft(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            likeLeft("fk_mc_machine_id",entity().getFkMcMachineId());
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * LIKE '值%' entity().getFkMcMachineId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdLikeRight(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            likeRight("fk_mc_machine_id",entity().getFkMcMachineId());
        }
        return this;
     }

/**
     * <p>机器基础信息表记录Id</p>
     * 等于 =
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdEq(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            eq("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * 不等于 &lt;&gt;
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdNe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            ne("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * 大于 &gt;
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdGt(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            gt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * 大于等于 &gt;=
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdGe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            ge("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * 小于 &lt;
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdLt(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            lt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * 小于等于 &lt;=
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdLe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            le("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * LIKE '%值%'
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdLike(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            like("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * NOT LIKE '%值%'
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            notLike("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }


    /**
     * <p>机器基础信息表记录Id</p>
     * LIKE '%值'
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            likeLeft("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * LIKE '值%'
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            likeRight("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_machine_id",value);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_machine_id",values);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_machine_id",value);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcMachineIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_machine_id",values);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * 等于 = entity().getFkMcUpdateDeviceSubtaskRecordId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdEq(){
        Long fkMcUpdateDeviceSubtaskRecordId =entity().getFkMcUpdateDeviceSubtaskRecordId();
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            eq("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * 不等于 &lt;&gt; entity().getFkMcUpdateDeviceSubtaskRecordId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdNe(){
        Long fkMcUpdateDeviceSubtaskRecordId =entity().getFkMcUpdateDeviceSubtaskRecordId();
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            ne("fk_mc_update_device_subtask_record_id",entity().getFkMcUpdateDeviceSubtaskRecordId());
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * 大于 &gt; entity().getFkMcUpdateDeviceSubtaskRecordId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdGt(){
        Long fkMcUpdateDeviceSubtaskRecordId =entity().getFkMcUpdateDeviceSubtaskRecordId();
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            gt("fk_mc_update_device_subtask_record_id",entity().getFkMcUpdateDeviceSubtaskRecordId());
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * 大于等于 &gt;= entity().getFkMcUpdateDeviceSubtaskRecordId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdGe(){
        Long fkMcUpdateDeviceSubtaskRecordId =entity().getFkMcUpdateDeviceSubtaskRecordId();
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            ge("fk_mc_update_device_subtask_record_id",entity().getFkMcUpdateDeviceSubtaskRecordId());
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * 小于 &lt; entity().getFkMcUpdateDeviceSubtaskRecordId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdLt(){
        Long fkMcUpdateDeviceSubtaskRecordId =entity().getFkMcUpdateDeviceSubtaskRecordId();
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            lt("fk_mc_update_device_subtask_record_id",entity().getFkMcUpdateDeviceSubtaskRecordId());
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * 小于等于 &lt;= entity().getFkMcUpdateDeviceSubtaskRecordId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdLe(){
        Long fkMcUpdateDeviceSubtaskRecordId =entity().getFkMcUpdateDeviceSubtaskRecordId();
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            le("fk_mc_update_device_subtask_record_id",entity().getFkMcUpdateDeviceSubtaskRecordId());
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * BETWEEN  entity().getFkMcUpdateDeviceSubtaskRecordId() AND 值2
     * @param fkMcUpdateDeviceSubtaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdBetween(Long fkMcUpdateDeviceSubtaskRecordIdEnd){
        Long fkMcUpdateDeviceSubtaskRecordId =entity().getFkMcUpdateDeviceSubtaskRecordId();
        if(fkMcUpdateDeviceSubtaskRecordId!=null && fkMcUpdateDeviceSubtaskRecordIdEnd!=null){
            between("fk_mc_update_device_subtask_record_id",entity().getFkMcUpdateDeviceSubtaskRecordId(),fkMcUpdateDeviceSubtaskRecordIdEnd);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * NOT BETWEEN  entity().getFkMcUpdateDeviceSubtaskRecordId() AND 值2
     * @param fkMcUpdateDeviceSubtaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdNotBetween(Long fkMcUpdateDeviceSubtaskRecordIdEnd){
        Long fkMcUpdateDeviceSubtaskRecordId =entity().getFkMcUpdateDeviceSubtaskRecordId();
        if(fkMcUpdateDeviceSubtaskRecordId!=null && fkMcUpdateDeviceSubtaskRecordIdEnd!=null){
            notBetween("fk_mc_update_device_subtask_record_id",entity().getFkMcUpdateDeviceSubtaskRecordId(),fkMcUpdateDeviceSubtaskRecordIdEnd);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * BETWEEN  entity().getFkMcUpdateDeviceSubtaskRecordId() AND 值2
     * @param fkMcUpdateDeviceSubtaskRecordIdStart       值1
     * @param fkMcUpdateDeviceSubtaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdBetween(Long fkMcUpdateDeviceSubtaskRecordIdStart,Long fkMcUpdateDeviceSubtaskRecordIdEnd){
        Long fkMcUpdateDeviceSubtaskRecordId =entity().getFkMcUpdateDeviceSubtaskRecordId();
        if(fkMcUpdateDeviceSubtaskRecordId!=null && fkMcUpdateDeviceSubtaskRecordIdEnd!=null){
            between("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordIdStart,fkMcUpdateDeviceSubtaskRecordIdEnd);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * NOT BETWEEN  entity().getFkMcUpdateDeviceSubtaskRecordId() AND 值2
     * @param fkMcUpdateDeviceSubtaskRecordIdStart       值1
     * @param fkMcUpdateDeviceSubtaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdNotBetween(Long fkMcUpdateDeviceSubtaskRecordIdStart,Long fkMcUpdateDeviceSubtaskRecordIdEnd){
        Long fkMcUpdateDeviceSubtaskRecordId =entity().getFkMcUpdateDeviceSubtaskRecordId();
        if(fkMcUpdateDeviceSubtaskRecordId!=null && fkMcUpdateDeviceSubtaskRecordIdEnd!=null){
            notBetween("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordIdStart,fkMcUpdateDeviceSubtaskRecordIdEnd);
        }
        return this;
     }


    /**
     * <p>机器更新子任务记录Id</p>
     * LIKE '%值%' entity().getFkMcUpdateDeviceSubtaskRecordId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdLike(){
        Long fkMcUpdateDeviceSubtaskRecordId =entity().getFkMcUpdateDeviceSubtaskRecordId();
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            like("fk_mc_update_device_subtask_record_id",entity().getFkMcUpdateDeviceSubtaskRecordId());
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * NOT LIKE '%值%' entity().getFkMcUpdateDeviceSubtaskRecordId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdNotLike(){
        Long fkMcUpdateDeviceSubtaskRecordId =entity().getFkMcUpdateDeviceSubtaskRecordId();
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            notLike("fk_mc_update_device_subtask_record_id",entity().getFkMcUpdateDeviceSubtaskRecordId());
        }
        return this;
     }


    /**
     * <p>机器更新子任务记录Id</p>
     * LIKE '%值' entity().getFkMcUpdateDeviceSubtaskRecordId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdLikeLeft(){
        Long fkMcUpdateDeviceSubtaskRecordId =entity().getFkMcUpdateDeviceSubtaskRecordId();
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            likeLeft("fk_mc_update_device_subtask_record_id",entity().getFkMcUpdateDeviceSubtaskRecordId());
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * LIKE '值%' entity().getFkMcUpdateDeviceSubtaskRecordId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdLikeRight(){
        Long fkMcUpdateDeviceSubtaskRecordId =entity().getFkMcUpdateDeviceSubtaskRecordId();
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            likeRight("fk_mc_update_device_subtask_record_id",entity().getFkMcUpdateDeviceSubtaskRecordId());
        }
        return this;
     }

/**
     * <p>机器更新子任务记录Id</p>
     * 等于 =
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdEq(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            eq("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * 不等于 &lt;&gt;
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdNe(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            ne("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * 大于 &gt;
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdGt(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            gt("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * 大于等于 &gt;=
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdGe(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            ge("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * 小于 &lt;
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdLt(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            lt("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * 小于等于 &lt;=
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdLe(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            le("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * LIKE '%值%'
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdLike(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            like("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * NOT LIKE '%值%'
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdNotLike(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            notLike("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
    }


    /**
     * <p>机器更新子任务记录Id</p>
     * LIKE '%值'
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdLikeLeft(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            likeLeft("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * LIKE '值%'
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdLikeRight(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            likeRight("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdIsNull(){
        isNull("fk_mc_update_device_subtask_record_id");
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdIsNotNull(){
        isNotNull("fk_mc_update_device_subtask_record_id");
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_update_device_subtask_record_id",value);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_update_device_subtask_record_id",values);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_update_device_subtask_record_id",value);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper fkMcUpdateDeviceSubtaskRecordIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_update_device_subtask_record_id",values);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 等于 = entity().getType()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeEq(){
        Integer type =entity().getType();
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 不等于 &lt;&gt; entity().getType()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeNe(){
        Integer type =entity().getType();
        if(type!=null){
            ne("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 大于 &gt; entity().getType()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeGt(){
        Integer type =entity().getType();
        if(type!=null){
            gt("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 大于等于 &gt;= entity().getType()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeGe(){
        Integer type =entity().getType();
        if(type!=null){
            ge("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 小于 &lt; entity().getType()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeLt(){
        Integer type =entity().getType();
        if(type!=null){
            lt("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 小于等于 &lt;= entity().getType()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeLe(){
        Integer type =entity().getType();
        if(type!=null){
            le("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * BETWEEN  entity().getType() AND 值2
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeBetween(Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            between("type",entity().getType(),typeEnd);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * NOT BETWEEN  entity().getType() AND 值2
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeNotBetween(Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            notBetween("type",entity().getType(),typeEnd);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * BETWEEN  entity().getType() AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeBetween(Integer typeStart,Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            between("type",typeStart,typeEnd);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * NOT BETWEEN  entity().getType() AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeNotBetween(Integer typeStart,Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            notBetween("type",typeStart,typeEnd);
        }
        return this;
     }


    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * LIKE '%值%' entity().getType()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeLike(){
        Integer type =entity().getType();
        if(type!=null){
            like("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * NOT LIKE '%值%' entity().getType()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeNotLike(){
        Integer type =entity().getType();
        if(type!=null){
            notLike("type",entity().getType());
        }
        return this;
     }


    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * LIKE '%值' entity().getType()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeLikeLeft(){
        Integer type =entity().getType();
        if(type!=null){
            likeLeft("type",entity().getType());
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * LIKE '值%' entity().getType()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeLikeRight(){
        Integer type =entity().getType();
        if(type!=null){
            likeRight("type",entity().getType());
        }
        return this;
     }

/**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 等于 =
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeEq(Integer type){
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 不等于 &lt;&gt;
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeNe(Integer type){
        if(type!=null){
            ne("type",type);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 大于 &gt;
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeGt(Integer type){
        if(type!=null){
            gt("type",type);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 大于等于 &gt;=
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeGe(Integer type){
        if(type!=null){
            ge("type",type);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 小于 &lt;
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeLt(Integer type){
        if(type!=null){
            lt("type",type);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 小于等于 &lt;=
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeLe(Integer type){
        if(type!=null){
            le("type",type);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * LIKE '%值%'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeLike(Integer type){
        if(type!=null){
            like("type",type);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * NOT LIKE '%值%'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeNotLike(Integer type){
        if(type!=null){
            notLike("type",type);
        }
        return this;
    }


    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * LIKE '%值'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeLikeLeft(Integer type){
        if(type!=null){
            likeLeft("type",type);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * LIKE '值%'
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeLikeRight(Integer type){
        if(type!=null){
            likeRight("type",type);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeIsNull(){
        isNull("type");
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeIsNotNull(){
        isNotNull("type");
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("type",value);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeIn(Integer... values){
        if(values!=null && values.length>0){
            in("type",values);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("type",value);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper typeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("type",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdEq(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdNe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ne("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于 &gt; entity().getDeviceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdGt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            gt("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于等于 &gt;= entity().getDeviceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdGe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ge("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于 &lt; entity().getDeviceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdLt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            lt("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于等于 &lt;= entity().getDeviceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",entity().getDeviceId(),deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdNotBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",entity().getDeviceId(),deviceIdEnd);
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",entity().getDeviceId());
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值' entity().getDeviceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%' entity().getDeviceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdLikeRight(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeRight("device_id",entity().getDeviceId());
        }
        return this;
     }

/**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdEq(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdNe(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdGt(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdGe(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdLt(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdLe(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdLike(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdNotLike(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdLikeRight(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdIn(Collection<String> value){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdIn(String... values){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * 等于 = entity().getInstanceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdEq(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * 不等于 &lt;&gt; entity().getInstanceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdNe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ne("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * 大于 &gt; entity().getInstanceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdGt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            gt("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * 大于等于 &gt;= entity().getInstanceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdGe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ge("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * 小于 &lt; entity().getInstanceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdLt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            lt("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * 小于等于 &lt;= entity().getInstanceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdLe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            le("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",entity().getInstanceId(),instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdNotBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",entity().getInstanceId(),instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备实例Id</p>
     * LIKE '%值%' entity().getInstanceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            like("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * NOT LIKE '%值%' entity().getInstanceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdNotLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            notLike("instance_id",entity().getInstanceId());
        }
        return this;
     }


    /**
     * <p>设备实例Id</p>
     * LIKE '%值' entity().getInstanceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdLikeLeft(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeLeft("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * LIKE '值%' entity().getInstanceId()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdLikeRight(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeRight("instance_id",entity().getInstanceId());
        }
        return this;
     }

/**
     * <p>设备实例Id</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * 不等于 &lt;&gt;
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * 大于 &gt;
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * 大于等于 &gt;=
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * 小于 &lt;
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * 小于等于 &lt;=
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * NOT LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
    }


    /**
     * <p>设备实例Id</p>
     * LIKE '%值'
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * LIKE '值%'
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdLikeRight(String instanceId){
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_id",value);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("instance_id",values);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_id",value);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * 等于 = entity().getExecuteMsg()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgEq(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgNe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgGt(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgGe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgLt(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgLe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgBetween(String executeMsgEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgNotBetween(String executeMsgEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgBetween(String executeMsgStart,String executeMsgEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgNotBetween(String executeMsgStart,String executeMsgEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgLike(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgNotLike(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgLikeLeft(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgLikeRight(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgEq(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgNe(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgGt(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgGe(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgLt(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgLe(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgLike(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgNotLike(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgLikeLeft(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgLikeRight(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgIsNull(){
        isNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgIsNotNull(){
        isNotNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgIn(Collection<String> value){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgIn(String... values){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper executeMsgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("execute_msg",values);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 等于 = entity().getTaskStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeEq(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            eq("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 不等于 &lt;&gt; entity().getTaskStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeNe(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            ne("task_start_time",entity().getTaskStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 大于 &gt; entity().getTaskStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeGt(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            gt("task_start_time",entity().getTaskStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 大于等于 &gt;= entity().getTaskStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeGe(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            ge("task_start_time",entity().getTaskStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 小于 &lt; entity().getTaskStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeLt(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            lt("task_start_time",entity().getTaskStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 小于等于 &lt;= entity().getTaskStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeLe(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            le("task_start_time",entity().getTaskStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * BETWEEN  entity().getTaskStartTime() AND 值2
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeBetween(Date taskStartTimeEnd){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null && taskStartTimeEnd!=null){
            between("task_start_time",entity().getTaskStartTime(),taskStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * NOT BETWEEN  entity().getTaskStartTime() AND 值2
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeNotBetween(Date taskStartTimeEnd){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null && taskStartTimeEnd!=null){
            notBetween("task_start_time",entity().getTaskStartTime(),taskStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * BETWEEN  entity().getTaskStartTime() AND 值2
     * @param taskStartTimeStart       值1
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeBetween(Date taskStartTimeStart,Date taskStartTimeEnd){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null && taskStartTimeEnd!=null){
            between("task_start_time",taskStartTimeStart,taskStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * NOT BETWEEN  entity().getTaskStartTime() AND 值2
     * @param taskStartTimeStart       值1
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeNotBetween(Date taskStartTimeStart,Date taskStartTimeEnd){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null && taskStartTimeEnd!=null){
            notBetween("task_start_time",taskStartTimeStart,taskStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * LIKE '%值%' entity().getTaskStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeLike(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            like("task_start_time",entity().getTaskStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * NOT LIKE '%值%' entity().getTaskStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeNotLike(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            notLike("task_start_time",entity().getTaskStartTime());
        }
        return this;
     }


    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * LIKE '%值' entity().getTaskStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeLikeLeft(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            likeLeft("task_start_time",entity().getTaskStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * LIKE '值%' entity().getTaskStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeLikeRight(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            likeRight("task_start_time",entity().getTaskStartTime());
        }
        return this;
     }

/**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 等于 =
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeEq(Date taskStartTime){
        if(taskStartTime!=null){
            eq("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 不等于 &lt;&gt;
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeNe(Date taskStartTime){
        if(taskStartTime!=null){
            ne("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 大于 &gt;
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeGt(Date taskStartTime){
        if(taskStartTime!=null){
            gt("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 大于等于 &gt;=
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeGe(Date taskStartTime){
        if(taskStartTime!=null){
            ge("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 小于 &lt;
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeLt(Date taskStartTime){
        if(taskStartTime!=null){
            lt("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 小于等于 &lt;=
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeLe(Date taskStartTime){
        if(taskStartTime!=null){
            le("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * LIKE '%值%'
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeLike(Date taskStartTime){
        if(taskStartTime!=null){
            like("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * NOT LIKE '%值%'
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeNotLike(Date taskStartTime){
        if(taskStartTime!=null){
            notLike("task_start_time",taskStartTime);
        }
        return this;
    }


    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * LIKE '%值'
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeLikeLeft(Date taskStartTime){
        if(taskStartTime!=null){
            likeLeft("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * LIKE '值%'
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeLikeRight(Date taskStartTime){
        if(taskStartTime!=null){
            likeRight("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeIsNull(){
        isNull("task_start_time");
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeIsNotNull(){
        isNotNull("task_start_time");
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("task_start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("task_start_time",values);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("task_start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper taskStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("task_start_time",values);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 等于 = entity().getWaitOverStartDate()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateEq(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            eq("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 不等于 &lt;&gt; entity().getWaitOverStartDate()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateNe(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            ne("wait_over_start_date",entity().getWaitOverStartDate());
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 大于 &gt; entity().getWaitOverStartDate()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateGt(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            gt("wait_over_start_date",entity().getWaitOverStartDate());
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 大于等于 &gt;= entity().getWaitOverStartDate()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateGe(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            ge("wait_over_start_date",entity().getWaitOverStartDate());
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 小于 &lt; entity().getWaitOverStartDate()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateLt(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            lt("wait_over_start_date",entity().getWaitOverStartDate());
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 小于等于 &lt;= entity().getWaitOverStartDate()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateLe(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            le("wait_over_start_date",entity().getWaitOverStartDate());
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * BETWEEN  entity().getWaitOverStartDate() AND 值2
     * @param waitOverStartDateEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateBetween(Date waitOverStartDateEnd){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null && waitOverStartDateEnd!=null){
            between("wait_over_start_date",entity().getWaitOverStartDate(),waitOverStartDateEnd);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * NOT BETWEEN  entity().getWaitOverStartDate() AND 值2
     * @param waitOverStartDateEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateNotBetween(Date waitOverStartDateEnd){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null && waitOverStartDateEnd!=null){
            notBetween("wait_over_start_date",entity().getWaitOverStartDate(),waitOverStartDateEnd);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * BETWEEN  entity().getWaitOverStartDate() AND 值2
     * @param waitOverStartDateStart       值1
     * @param waitOverStartDateEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateBetween(Date waitOverStartDateStart,Date waitOverStartDateEnd){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null && waitOverStartDateEnd!=null){
            between("wait_over_start_date",waitOverStartDateStart,waitOverStartDateEnd);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * NOT BETWEEN  entity().getWaitOverStartDate() AND 值2
     * @param waitOverStartDateStart       值1
     * @param waitOverStartDateEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateNotBetween(Date waitOverStartDateStart,Date waitOverStartDateEnd){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null && waitOverStartDateEnd!=null){
            notBetween("wait_over_start_date",waitOverStartDateStart,waitOverStartDateEnd);
        }
        return this;
     }


    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值%' entity().getWaitOverStartDate()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateLike(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            like("wait_over_start_date",entity().getWaitOverStartDate());
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * NOT LIKE '%值%' entity().getWaitOverStartDate()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateNotLike(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            notLike("wait_over_start_date",entity().getWaitOverStartDate());
        }
        return this;
     }


    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值' entity().getWaitOverStartDate()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateLikeLeft(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            likeLeft("wait_over_start_date",entity().getWaitOverStartDate());
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * LIKE '值%' entity().getWaitOverStartDate()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateLikeRight(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            likeRight("wait_over_start_date",entity().getWaitOverStartDate());
        }
        return this;
     }

/**
     * <p>等待执行开始时间</p>
     * 等于 =
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateEq(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            eq("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 不等于 &lt;&gt;
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateNe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            ne("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 大于 &gt;
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateGt(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            gt("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 大于等于 &gt;=
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateGe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            ge("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 小于 &lt;
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateLt(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            lt("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 小于等于 &lt;=
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateLe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            le("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值%'
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateLike(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            like("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * NOT LIKE '%值%'
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateNotLike(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            notLike("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }


    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值'
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateLikeLeft(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            likeLeft("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * LIKE '值%'
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateLikeRight(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            likeRight("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateIsNull(){
        isNull("wait_over_start_date");
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateIsNotNull(){
        isNotNull("wait_over_start_date");
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("wait_over_start_date",value);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateIn(Date... values){
        if(values!=null && values.length>0){
            in("wait_over_start_date",values);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("wait_over_start_date",value);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper waitOverStartDateNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("wait_over_start_date",values);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 等于 = entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeEq(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            eq("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 不等于 &lt;&gt; entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeNe(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            ne("start_time",entity().getStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 大于 &gt; entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeGt(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            gt("start_time",entity().getStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 大于等于 &gt;= entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeGe(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            ge("start_time",entity().getStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 小于 &lt; entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeLt(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            lt("start_time",entity().getStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 小于等于 &lt;= entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeLe(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            le("start_time",entity().getStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * BETWEEN  entity().getStartTime() AND 值2
     * @param startTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeBetween(Date startTimeEnd){
        Date startTime =entity().getStartTime();
        if(startTime!=null && startTimeEnd!=null){
            between("start_time",entity().getStartTime(),startTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * NOT BETWEEN  entity().getStartTime() AND 值2
     * @param startTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeNotBetween(Date startTimeEnd){
        Date startTime =entity().getStartTime();
        if(startTime!=null && startTimeEnd!=null){
            notBetween("start_time",entity().getStartTime(),startTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * BETWEEN  entity().getStartTime() AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeBetween(Date startTimeStart,Date startTimeEnd){
        Date startTime =entity().getStartTime();
        if(startTime!=null && startTimeEnd!=null){
            between("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * NOT BETWEEN  entity().getStartTime() AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeNotBetween(Date startTimeStart,Date startTimeEnd){
        Date startTime =entity().getStartTime();
        if(startTime!=null && startTimeEnd!=null){
            notBetween("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务开始时间（定时开始时间）</p>
     * LIKE '%值%' entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeLike(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            like("start_time",entity().getStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * NOT LIKE '%值%' entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeNotLike(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            notLike("start_time",entity().getStartTime());
        }
        return this;
     }


    /**
     * <p>任务开始时间（定时开始时间）</p>
     * LIKE '%值' entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeLikeLeft(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            likeLeft("start_time",entity().getStartTime());
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * LIKE '值%' entity().getStartTime()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeLikeRight(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            likeRight("start_time",entity().getStartTime());
        }
        return this;
     }

/**
     * <p>任务开始时间（定时开始时间）</p>
     * 等于 =
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeEq(Date startTime){
        if(startTime!=null){
            eq("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 不等于 &lt;&gt;
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeNe(Date startTime){
        if(startTime!=null){
            ne("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 大于 &gt;
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeGt(Date startTime){
        if(startTime!=null){
            gt("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 大于等于 &gt;=
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeGe(Date startTime){
        if(startTime!=null){
            ge("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 小于 &lt;
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeLt(Date startTime){
        if(startTime!=null){
            lt("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 小于等于 &lt;=
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeLe(Date startTime){
        if(startTime!=null){
            le("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * LIKE '%值%'
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeLike(Date startTime){
        if(startTime!=null){
            like("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * NOT LIKE '%值%'
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeNotLike(Date startTime){
        if(startTime!=null){
            notLike("start_time",startTime);
        }
        return this;
    }


    /**
     * <p>任务开始时间（定时开始时间）</p>
     * LIKE '%值'
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeLikeLeft(Date startTime){
        if(startTime!=null){
            likeLeft("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * LIKE '值%'
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeLikeRight(Date startTime){
        if(startTime!=null){
            likeRight("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeIsNull(){
        isNull("start_time");
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeIsNotNull(){
        isNotNull("start_time");
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("start_time",values);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper startTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("start_time",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * LIKE '%值%' entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * NOT LIKE '%值%' entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",entity().getStatus());
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * LIKE '%值' entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * LIKE '值%' entity().getStatus()
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",entity().getStatus());
        }
        return this;
     }

/**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
    }


    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper statusNotIn(Integer... values){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdEq(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdNe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdGt(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdGe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdLt(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdLe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdBetween(Long versionIdEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdNotBetween(Long versionIdEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdLike(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdNotLike(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdLikeLeft(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdLikeRight(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdEq(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdNe(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdGt(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdGe(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdLt(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdLe(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdLike(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdNotLike(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdLikeLeft(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdLikeRight(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdIn(Long... values){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper versionIdNotIn(Long... values){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeEq(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeNe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeGt(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeGe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeLt(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeLe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeLike(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeNotLike(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeLikeLeft(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeLikeRight(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeEq(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeNe(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeGt(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeGe(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeLt(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeLe(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeLike(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeIn(Date... values){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper createTimeNotIn(Date... values){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeEq(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeNe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeGt(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeGe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeLt(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeLe(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeLike(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeNotLike(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeLikeLeft(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeLikeRight(){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
