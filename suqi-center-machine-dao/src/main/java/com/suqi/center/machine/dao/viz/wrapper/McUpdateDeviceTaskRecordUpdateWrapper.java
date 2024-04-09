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
public class McUpdateDeviceTaskRecordUpdateWrapper extends UpdateWrapper<McUpdateDeviceTaskRecord> {

    public static McUpdateDeviceTaskRecordUpdateWrapper wrapper() {
        return new McUpdateDeviceTaskRecordUpdateWrapper();
    }

    public McUpdateDeviceTaskRecordUpdateWrapper() {
        super();
    }

    public McUpdateDeviceTaskRecordUpdateWrapper(McUpdateDeviceTaskRecord entity) {
        super(entity);
    }

    /**
     * 记录id自动增长
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 云机端软件包记录Id
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setFkMcServerSoftwarePackageId(Long fkMcServerSoftwarePackageId) {
         set("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        return this;
    }
    /**
     * 更新机器任务表Id
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setFkMcUpdateDeviceTaskId(Long fkMcUpdateDeviceTaskId) {
         set("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        return this;
    }
    /**
     * 机器基础信息表记录Id
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setFkMcMachineId(Long fkMcMachineId) {
         set("fk_mc_machine_id",fkMcMachineId);
        return this;
    }
    /**
     * 机器更新子任务记录Id
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setFkMcUpdateDeviceSubtaskRecordId(Long fkMcUpdateDeviceSubtaskRecordId) {
         set("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        return this;
    }
    /**
     * 任务类型（1：系统任务，2：用户任务）
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setType(Integer type) {
         set("type",type);
        return this;
    }
    /**
     * 设备唯一码
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 设备实例Id
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 执行任务消息
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setExecuteMsg(String executeMsg) {
         set("execute_msg",executeMsg);
        return this;
    }
    /**
     * 任务开始执行时间（具体开始时间）
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setTaskStartTime(Date taskStartTime) {
         set("task_start_time",taskStartTime);
        return this;
    }
    /**
     * 等待执行开始时间
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setWaitOverStartDate(Date waitOverStartDate) {
         set("wait_over_start_date",waitOverStartDate);
        return this;
    }
    /**
     * 任务开始时间（定时开始时间）
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setStartTime(Date startTime) {
         set("start_time",startTime);
        return this;
    }
    /**
     * 状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 版本Id
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 创建时间
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 修改时间
     */
    public McUpdateDeviceTaskRecordUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper idEq(Long id){
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
    public McUpdateDeviceTaskRecordUpdateWrapper idNe(Long id){
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
    public McUpdateDeviceTaskRecordUpdateWrapper idGt(Long id){
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
    public McUpdateDeviceTaskRecordUpdateWrapper idGe(Long id){
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
    public McUpdateDeviceTaskRecordUpdateWrapper idLt(Long id){
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
    public McUpdateDeviceTaskRecordUpdateWrapper idLe(Long id){
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
    public McUpdateDeviceTaskRecordUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public McUpdateDeviceTaskRecordUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public McUpdateDeviceTaskRecordUpdateWrapper idLike(Long id){
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
    public McUpdateDeviceTaskRecordUpdateWrapper idNotLike(Long id){
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
    public McUpdateDeviceTaskRecordUpdateWrapper idLikeLeft(Long id){
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
    public McUpdateDeviceTaskRecordUpdateWrapper idLikeRight(Long id){
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
    public McUpdateDeviceTaskRecordUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper idIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper idIn(Long... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper idNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 等于 = fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdEq(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            eq("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * 不等于 &lt;&gt; fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdNe(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            ne("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 大于 &gt; fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdGt(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            gt("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 大于等于 &gt;= fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdGe(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            ge("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 小于 &lt; fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdLt(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            lt("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * 小于等于 &lt;= fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdLe(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            le("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcServerSoftwarePackageIdStart       值1
     * @param fkMcServerSoftwarePackageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdBetween(Long fkMcServerSoftwarePackageIdStart,Long fkMcServerSoftwarePackageIdEnd){
        if(fkMcServerSoftwarePackageIdStart!=null && fkMcServerSoftwarePackageIdEnd!=null){
            between("fk_mc_server_software_package_id",fkMcServerSoftwarePackageIdStart,fkMcServerSoftwarePackageIdEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcServerSoftwarePackageIdStart       值1
     * @param fkMcServerSoftwarePackageIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdNotBetween(Long fkMcServerSoftwarePackageIdStart,Long fkMcServerSoftwarePackageIdEnd){
        if(fkMcServerSoftwarePackageIdStart!=null && fkMcServerSoftwarePackageIdEnd!=null){
            notBetween("fk_mc_server_software_package_id",fkMcServerSoftwarePackageIdStart,fkMcServerSoftwarePackageIdEnd);
        }
        return this;
     }


    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '%值%' fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdLike(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            like("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * NOT LIKE '%值%' fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdNotLike(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            notLike("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }


    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '%值' fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdLikeLeft(Long fkMcServerSoftwarePackageId){
        if(fkMcServerSoftwarePackageId!=null){
            likeLeft("fk_mc_server_software_package_id",fkMcServerSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>云机端软件包记录Id</p>
     * LIKE '值%' fkMcServerSoftwarePackageId
     * @param fkMcServerSoftwarePackageId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdLikeRight(Long fkMcServerSoftwarePackageId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdIsNull(){
        isNull("fk_mc_server_software_package_id");
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdIsNotNull(){
        isNotNull("fk_mc_server_software_package_id");
        return this;
    }

    /**
     * <p>云机端软件包记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdIn(Long... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcServerSoftwarePackageIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_server_software_package_id",values);
        }
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * 等于 = fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdEq(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdNe(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdGt(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdGe(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdLt(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdLe(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdBetween(Long fkMcUpdateDeviceTaskIdStart,Long fkMcUpdateDeviceTaskIdEnd){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdNotBetween(Long fkMcUpdateDeviceTaskIdStart,Long fkMcUpdateDeviceTaskIdEnd){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdLike(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdNotLike(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdLikeLeft(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdLikeRight(Long fkMcUpdateDeviceTaskId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdIsNull(){
        isNull("fk_mc_update_device_task_id");
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdIsNotNull(){
        isNotNull("fk_mc_update_device_task_id");
        return this;
    }

    /**
     * <p>更新机器任务表Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdIn(Long... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceTaskIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_update_device_task_id",values);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * 等于 = fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdEq(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            eq("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * 不等于 &lt;&gt; fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdNe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            ne("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * 大于 &gt; fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdGt(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            gt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * 大于等于 &gt;= fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdGe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            ge("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * 小于 &lt; fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdLt(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            lt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * 小于等于 &lt;= fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdLe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            le("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcMachineIdStart       值1
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
        if(fkMcMachineIdStart!=null && fkMcMachineIdEnd!=null){
            between("fk_mc_machine_id",fkMcMachineIdStart,fkMcMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcMachineIdStart       值1
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
        if(fkMcMachineIdStart!=null && fkMcMachineIdEnd!=null){
            notBetween("fk_mc_machine_id",fkMcMachineIdStart,fkMcMachineIdEnd);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录Id</p>
     * LIKE '%值%' fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdLike(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            like("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * NOT LIKE '%值%' fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            notLike("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录Id</p>
     * LIKE '%值' fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            likeLeft("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录Id</p>
     * LIKE '值%' fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdIn(Long... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcMachineIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_machine_id",values);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * 等于 = fkMcUpdateDeviceSubtaskRecordId
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdEq(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            eq("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * 不等于 &lt;&gt; fkMcUpdateDeviceSubtaskRecordId
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdNe(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            ne("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * 大于 &gt; fkMcUpdateDeviceSubtaskRecordId
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdGt(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            gt("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * 大于等于 &gt;= fkMcUpdateDeviceSubtaskRecordId
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdGe(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            ge("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * 小于 &lt; fkMcUpdateDeviceSubtaskRecordId
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdLt(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            lt("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * 小于等于 &lt;= fkMcUpdateDeviceSubtaskRecordId
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdLe(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            le("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceSubtaskRecordIdStart       值1
     * @param fkMcUpdateDeviceSubtaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdBetween(Long fkMcUpdateDeviceSubtaskRecordIdStart,Long fkMcUpdateDeviceSubtaskRecordIdEnd){
        if(fkMcUpdateDeviceSubtaskRecordIdStart!=null && fkMcUpdateDeviceSubtaskRecordIdEnd!=null){
            between("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordIdStart,fkMcUpdateDeviceSubtaskRecordIdEnd);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceSubtaskRecordIdStart       值1
     * @param fkMcUpdateDeviceSubtaskRecordIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdNotBetween(Long fkMcUpdateDeviceSubtaskRecordIdStart,Long fkMcUpdateDeviceSubtaskRecordIdEnd){
        if(fkMcUpdateDeviceSubtaskRecordIdStart!=null && fkMcUpdateDeviceSubtaskRecordIdEnd!=null){
            notBetween("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordIdStart,fkMcUpdateDeviceSubtaskRecordIdEnd);
        }
        return this;
     }


    /**
     * <p>机器更新子任务记录Id</p>
     * LIKE '%值%' fkMcUpdateDeviceSubtaskRecordId
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdLike(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            like("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * NOT LIKE '%值%' fkMcUpdateDeviceSubtaskRecordId
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdNotLike(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            notLike("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }


    /**
     * <p>机器更新子任务记录Id</p>
     * LIKE '%值' fkMcUpdateDeviceSubtaskRecordId
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdLikeLeft(Long fkMcUpdateDeviceSubtaskRecordId){
        if(fkMcUpdateDeviceSubtaskRecordId!=null){
            likeLeft("fk_mc_update_device_subtask_record_id",fkMcUpdateDeviceSubtaskRecordId);
        }
        return this;
     }

    /**
     * <p>机器更新子任务记录Id</p>
     * LIKE '值%' fkMcUpdateDeviceSubtaskRecordId
     * @param fkMcUpdateDeviceSubtaskRecordId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdLikeRight(Long fkMcUpdateDeviceSubtaskRecordId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdIsNull(){
        isNull("fk_mc_update_device_subtask_record_id");
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdIsNotNull(){
        isNotNull("fk_mc_update_device_subtask_record_id");
        return this;
    }

    /**
     * <p>机器更新子任务记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdIn(Long... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper fkMcUpdateDeviceSubtaskRecordIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_update_device_subtask_record_id",values);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 等于 = type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper typeEq(Integer type){
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 不等于 &lt;&gt; type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper typeNe(Integer type){
        if(type!=null){
            ne("type",type);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 大于 &gt; type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper typeGt(Integer type){
        if(type!=null){
            gt("type",type);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 大于等于 &gt;= type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper typeGe(Integer type){
        if(type!=null){
            ge("type",type);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 小于 &lt; type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper typeLt(Integer type){
        if(type!=null){
            lt("type",type);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * 小于等于 &lt;= type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper typeLe(Integer type){
        if(type!=null){
            le("type",type);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * BETWEEN 值1 AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper typeBetween(Integer typeStart,Integer typeEnd){
        if(typeStart!=null && typeEnd!=null){
            between("type",typeStart,typeEnd);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper typeNotBetween(Integer typeStart,Integer typeEnd){
        if(typeStart!=null && typeEnd!=null){
            notBetween("type",typeStart,typeEnd);
        }
        return this;
     }


    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * LIKE '%值%' type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper typeLike(Integer type){
        if(type!=null){
            like("type",type);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * NOT LIKE '%值%' type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper typeNotLike(Integer type){
        if(type!=null){
            notLike("type",type);
        }
        return this;
     }


    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * LIKE '%值' type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper typeLikeLeft(Integer type){
        if(type!=null){
            likeLeft("type",type);
        }
        return this;
     }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * LIKE '值%' type
     * @param type       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper typeLikeRight(Integer type){
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
    public McUpdateDeviceTaskRecordUpdateWrapper typeIsNull(){
        isNull("type");
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper typeIsNotNull(){
        isNotNull("type");
        return this;
    }

    /**
     * <p>任务类型（1：系统任务，2：用户任务）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper typeIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper typeIn(Integer... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper typeNotIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper typeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("type",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = deviceId
     * @param deviceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdEq(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdNe(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdGt(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdGe(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdLt(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdLe(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdLike(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdNotLike(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdLikeLeft(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdLikeRight(String deviceId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdIn(Collection<String> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdIn(String... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * 等于 = instanceId
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * 不等于 &lt;&gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * 大于 &gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * 大于等于 &gt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * 小于 &lt; instanceId
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * 小于等于 &lt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备实例Id</p>
     * LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * NOT LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>设备实例Id</p>
     * LIKE '%值' instanceId
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>设备实例Id</p>
     * LIKE '值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdLikeRight(String instanceId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>设备实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdIn(Collection<String> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdIn(String... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * 等于 = executeMsg
     * @param executeMsg       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgEq(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgNe(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgGt(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgGe(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgLt(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgLe(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgBetween(String executeMsgStart,String executeMsgEnd){
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
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgNotBetween(String executeMsgStart,String executeMsgEnd){
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
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgLike(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgNotLike(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgLikeLeft(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgLikeRight(String executeMsg){
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
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgIsNull(){
        isNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgIsNotNull(){
        isNotNull("execute_msg");
        return this;
    }

    /**
     * <p>执行任务消息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgIn(Collection<String> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgIn(String... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgNotIn(Collection<String> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper executeMsgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("execute_msg",values);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 等于 = taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeEq(Date taskStartTime){
        if(taskStartTime!=null){
            eq("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 不等于 &lt;&gt; taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeNe(Date taskStartTime){
        if(taskStartTime!=null){
            ne("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 大于 &gt; taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeGt(Date taskStartTime){
        if(taskStartTime!=null){
            gt("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 大于等于 &gt;= taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeGe(Date taskStartTime){
        if(taskStartTime!=null){
            ge("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 小于 &lt; taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeLt(Date taskStartTime){
        if(taskStartTime!=null){
            lt("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * 小于等于 &lt;= taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeLe(Date taskStartTime){
        if(taskStartTime!=null){
            le("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * BETWEEN 值1 AND 值2
     * @param taskStartTimeStart       值1
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeBetween(Date taskStartTimeStart,Date taskStartTimeEnd){
        if(taskStartTimeStart!=null && taskStartTimeEnd!=null){
            between("task_start_time",taskStartTimeStart,taskStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param taskStartTimeStart       值1
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeNotBetween(Date taskStartTimeStart,Date taskStartTimeEnd){
        if(taskStartTimeStart!=null && taskStartTimeEnd!=null){
            notBetween("task_start_time",taskStartTimeStart,taskStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * LIKE '%值%' taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeLike(Date taskStartTime){
        if(taskStartTime!=null){
            like("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * NOT LIKE '%值%' taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeNotLike(Date taskStartTime){
        if(taskStartTime!=null){
            notLike("task_start_time",taskStartTime);
        }
        return this;
     }


    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * LIKE '%值' taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeLikeLeft(Date taskStartTime){
        if(taskStartTime!=null){
            likeLeft("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * LIKE '值%' taskStartTime
     * @param taskStartTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeLikeRight(Date taskStartTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeIsNull(){
        isNull("task_start_time");
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeIsNotNull(){
        isNotNull("task_start_time");
        return this;
    }

    /**
     * <p>任务开始执行时间（具体开始时间）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeIn(Date... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper taskStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("task_start_time",values);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 等于 = waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateEq(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            eq("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 不等于 &lt;&gt; waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateNe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            ne("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 大于 &gt; waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateGt(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            gt("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 大于等于 &gt;= waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateGe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            ge("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 小于 &lt; waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateLt(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            lt("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 小于等于 &lt;= waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateLe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            le("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * BETWEEN 值1 AND 值2
     * @param waitOverStartDateStart       值1
     * @param waitOverStartDateEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateBetween(Date waitOverStartDateStart,Date waitOverStartDateEnd){
        if(waitOverStartDateStart!=null && waitOverStartDateEnd!=null){
            between("wait_over_start_date",waitOverStartDateStart,waitOverStartDateEnd);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param waitOverStartDateStart       值1
     * @param waitOverStartDateEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateNotBetween(Date waitOverStartDateStart,Date waitOverStartDateEnd){
        if(waitOverStartDateStart!=null && waitOverStartDateEnd!=null){
            notBetween("wait_over_start_date",waitOverStartDateStart,waitOverStartDateEnd);
        }
        return this;
     }


    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值%' waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateLike(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            like("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * NOT LIKE '%值%' waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateNotLike(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            notLike("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }


    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值' waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateLikeLeft(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            likeLeft("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * LIKE '值%' waitOverStartDate
     * @param waitOverStartDate       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateLikeRight(Date waitOverStartDate){
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
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateIsNull(){
        isNull("wait_over_start_date");
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateIsNotNull(){
        isNotNull("wait_over_start_date");
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateIn(Date... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper waitOverStartDateNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("wait_over_start_date",values);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 等于 = startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeEq(Date startTime){
        if(startTime!=null){
            eq("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 不等于 &lt;&gt; startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeNe(Date startTime){
        if(startTime!=null){
            ne("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 大于 &gt; startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeGt(Date startTime){
        if(startTime!=null){
            gt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 大于等于 &gt;= startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeGe(Date startTime){
        if(startTime!=null){
            ge("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 小于 &lt; startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeLt(Date startTime){
        if(startTime!=null){
            lt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * 小于等于 &lt;= startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeLe(Date startTime){
        if(startTime!=null){
            le("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * BETWEEN 值1 AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeBetween(Date startTimeStart,Date startTimeEnd){
        if(startTimeStart!=null && startTimeEnd!=null){
            between("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeNotBetween(Date startTimeStart,Date startTimeEnd){
        if(startTimeStart!=null && startTimeEnd!=null){
            notBetween("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务开始时间（定时开始时间）</p>
     * LIKE '%值%' startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeLike(Date startTime){
        if(startTime!=null){
            like("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * NOT LIKE '%值%' startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeNotLike(Date startTime){
        if(startTime!=null){
            notLike("start_time",startTime);
        }
        return this;
     }


    /**
     * <p>任务开始时间（定时开始时间）</p>
     * LIKE '%值' startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeLikeLeft(Date startTime){
        if(startTime!=null){
            likeLeft("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * LIKE '值%' startTime
     * @param startTime       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeLikeRight(Date startTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeIsNull(){
        isNull("start_time");
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeIsNotNull(){
        isNotNull("start_time");
        return this;
    }

    /**
     * <p>任务开始时间（定时开始时间）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeIn(Date... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper startTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("start_time",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper statusLikeRight(Integer status){
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
    public McUpdateDeviceTaskRecordUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper statusIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper statusIn(Integer... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper statusNotIn(Collection<Integer> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper statusNotIn(Integer... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdEq(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdNe(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdGt(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdGe(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdLt(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdLe(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdLike(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdNotLike(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdLikeLeft(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdLikeRight(Long versionId){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdIn(Long... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper versionIdNotIn(Long... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeEq(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeNe(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeGt(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeGe(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeLt(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeLe(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeLike(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeNotLike(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeLikeRight(Date createTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeIn(Date... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper createTimeNotIn(Date... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskRecordUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
