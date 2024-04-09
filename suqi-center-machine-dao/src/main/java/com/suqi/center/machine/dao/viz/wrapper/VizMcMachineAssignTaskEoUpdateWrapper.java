package com.suqi.center.machine.dao.viz.wrapper;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineAssignTaskEo;

import java.util.Collection;
import java.util.Date;

/**
 * <p>
 * 【可视化】机器分配任务表
 * </p>
 * "viz_mc_machine_assign_task"
 * @author Administrator
 */
public class VizMcMachineAssignTaskEoUpdateWrapper extends UpdateWrapper<VizMcMachineAssignTaskEo> {

    public static VizMcMachineAssignTaskEoUpdateWrapper wrapper() {
        return new VizMcMachineAssignTaskEoUpdateWrapper();
    }

    public VizMcMachineAssignTaskEoUpdateWrapper() {
        super();
    }

    public VizMcMachineAssignTaskEoUpdateWrapper(VizMcMachineAssignTaskEo entity) {
        super(entity);
    }

    /**
     * 主键ID
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 任务批次号
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setBatchNo(String batchNo) {
         set("batch_no",batchNo);
        return this;
    }
    /**
     * 商户ID
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setTenantId(Long tenantId) {
         set("tenant_id",tenantId);
        return this;
    }
    /**
     * 商户名称
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setTenantName(String tenantName) {
         set("tenant_name",tenantName);
        return this;
    }
    /**
     * 内网ip地址
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setExternalAddr(String externalAddr) {
         set("external_addr",externalAddr);
        return this;
    }
    /**
     * 外网ip地址
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setInternalAddr(String internalAddr) {
         set("internal_addr",internalAddr);
        return this;
    }
    /**
     * 机器基础信息表记录id
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setFkMcMachineId(Long fkMcMachineId) {
         set("fk_mc_machine_id",fkMcMachineId);
        return this;
    }
    /**
     * 设备唯一码
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 实例Id
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 分配状态(10：待分配，20：已分配, 30:分配失败)
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setAssignStatus(Integer assignStatus) {
         set("assign_status",assignStatus);
        return this;
    }
    /**
     * 操作人用户ID
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setOperateUserId(Long operateUserId) {
         set("operate_user_id",operateUserId);
        return this;
    }
    /**
     * 使用有效期开始时间
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setValidStartTime(Date validStartTime) {
         set("valid_start_time",validStartTime);
        return this;
    }
    /**
     * 使用有效期结束时间
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setValidEndTime(Date validEndTime) {
         set("valid_end_time",validEndTime);
        return this;
    }
    /**
     * 版本id
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 创建时间
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 创建人
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setCreatePerson(String createPerson) {
         set("create_person",createPerson);
        return this;
    }
    /**
     * 最后修改时间
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setUpdateTime(Date updateTime) {
         set("update_time",updateTime);
        return this;
    }
    /**
     * 是否删除
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setDr(Integer dr) {
         set("dr",dr);
        return this;
    }
    /**
     * 执行结果
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setMsg(String msg) {
         set("msg",msg);
        return this;
    }
    /**
     * app许可证id
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setAppLicenseId(Long appLicenseId) {
         set("app_license_id",appLicenseId);
        return this;
    }
    /**
     * app许可证类型（1：云应用，2：云手机，3：云游戏）
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setAppLicenseType(Integer appLicenseType) {
         set("app_license_type",appLicenseType);
        return this;
    }
    /**
     * 链路ID
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setTraceId(String traceId) {
         set("trace_id",traceId);
        return this;
    }
    /**
     * 商户资源池ID【非必填】
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setFkCpTnResourcePoolId(Long fkCpTnResourcePoolId) {
         set("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        return this;
    }
    /**
     * 资源池名称【非必填】
     */
    public VizMcMachineAssignTaskEoUpdateWrapper setResourcePoolName(String resourcePoolName) {
         set("resource_pool_name",resourcePoolName);
        return this;
    }

    /**
     * <p>主键ID</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>主键ID</p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>主键ID</p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>主键ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>主键ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * 等于 = batchNo
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoEq(String batchNo){
        if(batchNo!=null){
            eq("batch_no",batchNo);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * 不等于 &lt;&gt; batchNo
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoNe(String batchNo){
        if(batchNo!=null){
            ne("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 大于 &gt; batchNo
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoGt(String batchNo){
        if(batchNo!=null){
            gt("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 大于等于 &gt;= batchNo
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoGe(String batchNo){
        if(batchNo!=null){
            ge("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 小于 &lt; batchNo
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoLt(String batchNo){
        if(batchNo!=null){
            lt("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 小于等于 &lt;= batchNo
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoLe(String batchNo){
        if(batchNo!=null){
            le("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * BETWEEN 值1 AND 值2
     * @param batchNoStart       值1
     * @param batchNoEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoBetween(String batchNoStart,String batchNoEnd){
        if(batchNoStart!=null && batchNoEnd!=null){
            between("batch_no",batchNoStart,batchNoEnd);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param batchNoStart       值1
     * @param batchNoEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoNotBetween(String batchNoStart,String batchNoEnd){
        if(batchNoStart!=null && batchNoEnd!=null){
            notBetween("batch_no",batchNoStart,batchNoEnd);
        }
        return this;
     }


    /**
     * <p>任务批次号</p>
     * LIKE '%值%' batchNo
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoLike(String batchNo){
        if(batchNo!=null){
            like("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * NOT LIKE '%值%' batchNo
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoNotLike(String batchNo){
        if(batchNo!=null){
            notLike("batch_no",batchNo);
        }
        return this;
     }


    /**
     * <p>任务批次号</p>
     * LIKE '%值' batchNo
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoLikeLeft(String batchNo){
        if(batchNo!=null){
            likeLeft("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * LIKE '值%' batchNo
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoLikeRight(String batchNo){
        if(batchNo!=null){
            likeRight("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoIsNull(){
        isNull("batch_no");
        return this;
    }

    /**
     * <p>任务批次号</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoIsNotNull(){
        isNotNull("batch_no");
        return this;
    }

    /**
     * <p>任务批次号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("batch_no",value);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoIn(String... values){
        if(values!=null && values.length>0){
            in("batch_no",values);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("batch_no",value);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper batchNoNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("batch_no",values);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * 等于 = tenantId
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdEq(Long tenantId){
        if(tenantId!=null){
            eq("tenant_id",tenantId);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * 不等于 &lt;&gt; tenantId
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdNe(Long tenantId){
        if(tenantId!=null){
            ne("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 大于 &gt; tenantId
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdGt(Long tenantId){
        if(tenantId!=null){
            gt("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 大于等于 &gt;= tenantId
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdGe(Long tenantId){
        if(tenantId!=null){
            ge("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 小于 &lt; tenantId
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdLt(Long tenantId){
        if(tenantId!=null){
            lt("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 小于等于 &lt;= tenantId
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdLe(Long tenantId){
        if(tenantId!=null){
            le("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * BETWEEN 值1 AND 值2
     * @param tenantIdStart       值1
     * @param tenantIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdBetween(Long tenantIdStart,Long tenantIdEnd){
        if(tenantIdStart!=null && tenantIdEnd!=null){
            between("tenant_id",tenantIdStart,tenantIdEnd);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param tenantIdStart       值1
     * @param tenantIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdNotBetween(Long tenantIdStart,Long tenantIdEnd){
        if(tenantIdStart!=null && tenantIdEnd!=null){
            notBetween("tenant_id",tenantIdStart,tenantIdEnd);
        }
        return this;
     }


    /**
     * <p>商户ID</p>
     * LIKE '%值%' tenantId
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdLike(Long tenantId){
        if(tenantId!=null){
            like("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * NOT LIKE '%值%' tenantId
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdNotLike(Long tenantId){
        if(tenantId!=null){
            notLike("tenant_id",tenantId);
        }
        return this;
     }


    /**
     * <p>商户ID</p>
     * LIKE '%值' tenantId
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdLikeLeft(Long tenantId){
        if(tenantId!=null){
            likeLeft("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * LIKE '值%' tenantId
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdLikeRight(Long tenantId){
        if(tenantId!=null){
            likeRight("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdIsNull(){
        isNull("tenant_id");
        return this;
    }

    /**
     * <p>商户ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdIsNotNull(){
        isNotNull("tenant_id");
        return this;
    }

    /**
     * <p>商户ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("tenant_id",value);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdIn(Long... values){
        if(values!=null && values.length>0){
            in("tenant_id",values);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("tenant_id",value);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("tenant_id",values);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * 等于 = tenantName
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameEq(String tenantName){
        if(tenantName!=null){
            eq("tenant_name",tenantName);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * 不等于 &lt;&gt; tenantName
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameNe(String tenantName){
        if(tenantName!=null){
            ne("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 大于 &gt; tenantName
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameGt(String tenantName){
        if(tenantName!=null){
            gt("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 大于等于 &gt;= tenantName
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameGe(String tenantName){
        if(tenantName!=null){
            ge("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 小于 &lt; tenantName
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameLt(String tenantName){
        if(tenantName!=null){
            lt("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 小于等于 &lt;= tenantName
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameLe(String tenantName){
        if(tenantName!=null){
            le("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * BETWEEN 值1 AND 值2
     * @param tenantNameStart       值1
     * @param tenantNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameBetween(String tenantNameStart,String tenantNameEnd){
        if(tenantNameStart!=null && tenantNameEnd!=null){
            between("tenant_name",tenantNameStart,tenantNameEnd);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param tenantNameStart       值1
     * @param tenantNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameNotBetween(String tenantNameStart,String tenantNameEnd){
        if(tenantNameStart!=null && tenantNameEnd!=null){
            notBetween("tenant_name",tenantNameStart,tenantNameEnd);
        }
        return this;
     }


    /**
     * <p>商户名称</p>
     * LIKE '%值%' tenantName
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameLike(String tenantName){
        if(tenantName!=null){
            like("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * NOT LIKE '%值%' tenantName
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameNotLike(String tenantName){
        if(tenantName!=null){
            notLike("tenant_name",tenantName);
        }
        return this;
     }


    /**
     * <p>商户名称</p>
     * LIKE '%值' tenantName
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameLikeLeft(String tenantName){
        if(tenantName!=null){
            likeLeft("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * LIKE '值%' tenantName
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameLikeRight(String tenantName){
        if(tenantName!=null){
            likeRight("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameIsNull(){
        isNull("tenant_name");
        return this;
    }

    /**
     * <p>商户名称</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameIsNotNull(){
        isNotNull("tenant_name");
        return this;
    }

    /**
     * <p>商户名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("tenant_name",value);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameIn(String... values){
        if(values!=null && values.length>0){
            in("tenant_name",values);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("tenant_name",value);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper tenantNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("tenant_name",values);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 等于 = externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrEq(String externalAddr){
        if(externalAddr!=null){
            eq("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 不等于 &lt;&gt; externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrNe(String externalAddr){
        if(externalAddr!=null){
            ne("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 大于 &gt; externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrGt(String externalAddr){
        if(externalAddr!=null){
            gt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 大于等于 &gt;= externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrGe(String externalAddr){
        if(externalAddr!=null){
            ge("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 小于 &lt; externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrLt(String externalAddr){
        if(externalAddr!=null){
            lt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 小于等于 &lt;= externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrLe(String externalAddr){
        if(externalAddr!=null){
            le("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * BETWEEN 值1 AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrBetween(String externalAddrStart,String externalAddrEnd){
        if(externalAddrStart!=null && externalAddrEnd!=null){
            between("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT BETWEEN 值1 AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrNotBetween(String externalAddrStart,String externalAddrEnd){
        if(externalAddrStart!=null && externalAddrEnd!=null){
            notBetween("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }


    /**
     * <p>内网ip地址</p>
     * LIKE '%值%' externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrLike(String externalAddr){
        if(externalAddr!=null){
            like("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT LIKE '%值%' externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrNotLike(String externalAddr){
        if(externalAddr!=null){
            notLike("external_addr",externalAddr);
        }
        return this;
     }


    /**
     * <p>内网ip地址</p>
     * LIKE '%值' externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrLikeLeft(String externalAddr){
        if(externalAddr!=null){
            likeLeft("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * LIKE '值%' externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrLikeRight(String externalAddr){
        if(externalAddr!=null){
            likeRight("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrIsNull(){
        isNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrIsNotNull(){
        isNotNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("external_addr",value);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrIn(String... values){
        if(values!=null && values.length>0){
            in("external_addr",values);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("external_addr",value);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper externalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("external_addr",values);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 等于 = internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrEq(String internalAddr){
        if(internalAddr!=null){
            eq("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 不等于 &lt;&gt; internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrNe(String internalAddr){
        if(internalAddr!=null){
            ne("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 大于 &gt; internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrGt(String internalAddr){
        if(internalAddr!=null){
            gt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 大于等于 &gt;= internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrGe(String internalAddr){
        if(internalAddr!=null){
            ge("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 小于 &lt; internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrLt(String internalAddr){
        if(internalAddr!=null){
            lt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 小于等于 &lt;= internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrLe(String internalAddr){
        if(internalAddr!=null){
            le("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * BETWEEN 值1 AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrBetween(String internalAddrStart,String internalAddrEnd){
        if(internalAddrStart!=null && internalAddrEnd!=null){
            between("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT BETWEEN 值1 AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrNotBetween(String internalAddrStart,String internalAddrEnd){
        if(internalAddrStart!=null && internalAddrEnd!=null){
            notBetween("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }


    /**
     * <p>外网ip地址</p>
     * LIKE '%值%' internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrLike(String internalAddr){
        if(internalAddr!=null){
            like("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT LIKE '%值%' internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrNotLike(String internalAddr){
        if(internalAddr!=null){
            notLike("internal_addr",internalAddr);
        }
        return this;
     }


    /**
     * <p>外网ip地址</p>
     * LIKE '%值' internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrLikeLeft(String internalAddr){
        if(internalAddr!=null){
            likeLeft("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * LIKE '值%' internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrLikeRight(String internalAddr){
        if(internalAddr!=null){
            likeRight("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrIsNull(){
        isNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrIsNotNull(){
        isNotNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("internal_addr",value);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrIn(String... values){
        if(values!=null && values.length>0){
            in("internal_addr",values);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("internal_addr",value);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper internalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("internal_addr",values);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * 等于 = fkMcMachineId
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdEq(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdNe(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdGt(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdGe(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdLt(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdLe(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdLike(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdIn(Long... values){
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
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdNotIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateWrapper fkMcMachineIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_machine_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = deviceId
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdEq(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdNe(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdGt(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdGe(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdLt(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdLe(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdLike(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdNotLike(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdIn(String... values){
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
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 等于 = instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 不等于 &lt;&gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于 &gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于等于 &gt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于 &lt; instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于等于 &lt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * LIKE '值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdLikeRight(String instanceId){
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("instance_id",values);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 等于 = assignStatus
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusEq(Integer assignStatus){
        if(assignStatus!=null){
            eq("assign_status",assignStatus);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 不等于 &lt;&gt; assignStatus
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusNe(Integer assignStatus){
        if(assignStatus!=null){
            ne("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 大于 &gt; assignStatus
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusGt(Integer assignStatus){
        if(assignStatus!=null){
            gt("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 大于等于 &gt;= assignStatus
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusGe(Integer assignStatus){
        if(assignStatus!=null){
            ge("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 小于 &lt; assignStatus
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusLt(Integer assignStatus){
        if(assignStatus!=null){
            lt("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 小于等于 &lt;= assignStatus
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusLe(Integer assignStatus){
        if(assignStatus!=null){
            le("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * BETWEEN 值1 AND 值2
     * @param assignStatusStart       值1
     * @param assignStatusEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusBetween(Integer assignStatusStart,Integer assignStatusEnd){
        if(assignStatusStart!=null && assignStatusEnd!=null){
            between("assign_status",assignStatusStart,assignStatusEnd);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param assignStatusStart       值1
     * @param assignStatusEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusNotBetween(Integer assignStatusStart,Integer assignStatusEnd){
        if(assignStatusStart!=null && assignStatusEnd!=null){
            notBetween("assign_status",assignStatusStart,assignStatusEnd);
        }
        return this;
     }


    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * LIKE '%值%' assignStatus
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusLike(Integer assignStatus){
        if(assignStatus!=null){
            like("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * NOT LIKE '%值%' assignStatus
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusNotLike(Integer assignStatus){
        if(assignStatus!=null){
            notLike("assign_status",assignStatus);
        }
        return this;
     }


    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * LIKE '%值' assignStatus
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusLikeLeft(Integer assignStatus){
        if(assignStatus!=null){
            likeLeft("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * LIKE '值%' assignStatus
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusLikeRight(Integer assignStatus){
        if(assignStatus!=null){
            likeRight("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusIsNull(){
        isNull("assign_status");
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusIsNotNull(){
        isNotNull("assign_status");
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("assign_status",value);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("assign_status",values);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("assign_status",value);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper assignStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("assign_status",values);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * 等于 = operateUserId
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdEq(Long operateUserId){
        if(operateUserId!=null){
            eq("operate_user_id",operateUserId);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * 不等于 &lt;&gt; operateUserId
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdNe(Long operateUserId){
        if(operateUserId!=null){
            ne("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 大于 &gt; operateUserId
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdGt(Long operateUserId){
        if(operateUserId!=null){
            gt("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 大于等于 &gt;= operateUserId
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdGe(Long operateUserId){
        if(operateUserId!=null){
            ge("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 小于 &lt; operateUserId
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdLt(Long operateUserId){
        if(operateUserId!=null){
            lt("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 小于等于 &lt;= operateUserId
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdLe(Long operateUserId){
        if(operateUserId!=null){
            le("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * BETWEEN 值1 AND 值2
     * @param operateUserIdStart       值1
     * @param operateUserIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdBetween(Long operateUserIdStart,Long operateUserIdEnd){
        if(operateUserIdStart!=null && operateUserIdEnd!=null){
            between("operate_user_id",operateUserIdStart,operateUserIdEnd);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param operateUserIdStart       值1
     * @param operateUserIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdNotBetween(Long operateUserIdStart,Long operateUserIdEnd){
        if(operateUserIdStart!=null && operateUserIdEnd!=null){
            notBetween("operate_user_id",operateUserIdStart,operateUserIdEnd);
        }
        return this;
     }


    /**
     * <p>操作人用户ID</p>
     * LIKE '%值%' operateUserId
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdLike(Long operateUserId){
        if(operateUserId!=null){
            like("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * NOT LIKE '%值%' operateUserId
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdNotLike(Long operateUserId){
        if(operateUserId!=null){
            notLike("operate_user_id",operateUserId);
        }
        return this;
     }


    /**
     * <p>操作人用户ID</p>
     * LIKE '%值' operateUserId
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdLikeLeft(Long operateUserId){
        if(operateUserId!=null){
            likeLeft("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * LIKE '值%' operateUserId
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdLikeRight(Long operateUserId){
        if(operateUserId!=null){
            likeRight("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdIsNull(){
        isNull("operate_user_id");
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdIsNotNull(){
        isNotNull("operate_user_id");
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("operate_user_id",value);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdIn(Long... values){
        if(values!=null && values.length>0){
            in("operate_user_id",values);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("operate_user_id",value);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper operateUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("operate_user_id",values);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 等于 = validStartTime
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeEq(Date validStartTime){
        if(validStartTime!=null){
            eq("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 不等于 &lt;&gt; validStartTime
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeNe(Date validStartTime){
        if(validStartTime!=null){
            ne("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于 &gt; validStartTime
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeGt(Date validStartTime){
        if(validStartTime!=null){
            gt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于等于 &gt;= validStartTime
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeGe(Date validStartTime){
        if(validStartTime!=null){
            ge("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于 &lt; validStartTime
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeLt(Date validStartTime){
        if(validStartTime!=null){
            lt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于等于 &lt;= validStartTime
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeLe(Date validStartTime){
        if(validStartTime!=null){
            le("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * BETWEEN 值1 AND 值2
     * @param validStartTimeStart       值1
     * @param validStartTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeBetween(Date validStartTimeStart,Date validStartTimeEnd){
        if(validStartTimeStart!=null && validStartTimeEnd!=null){
            between("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param validStartTimeStart       值1
     * @param validStartTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeNotBetween(Date validStartTimeStart,Date validStartTimeEnd){
        if(validStartTimeStart!=null && validStartTimeEnd!=null){
            notBetween("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值%' validStartTime
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeLike(Date validStartTime){
        if(validStartTime!=null){
            like("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT LIKE '%值%' validStartTime
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeNotLike(Date validStartTime){
        if(validStartTime!=null){
            notLike("valid_start_time",validStartTime);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值' validStartTime
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeLikeLeft(Date validStartTime){
        if(validStartTime!=null){
            likeLeft("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '值%' validStartTime
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeLikeRight(Date validStartTime){
        if(validStartTime!=null){
            likeRight("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeIsNull(){
        isNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeIsNotNull(){
        isNotNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("valid_start_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("valid_start_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("valid_start_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_start_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 等于 = validEndTime
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeEq(Date validEndTime){
        if(validEndTime!=null){
            eq("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 不等于 &lt;&gt; validEndTime
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeNe(Date validEndTime){
        if(validEndTime!=null){
            ne("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于 &gt; validEndTime
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeGt(Date validEndTime){
        if(validEndTime!=null){
            gt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于等于 &gt;= validEndTime
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeGe(Date validEndTime){
        if(validEndTime!=null){
            ge("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于 &lt; validEndTime
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeLt(Date validEndTime){
        if(validEndTime!=null){
            lt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于等于 &lt;= validEndTime
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeLe(Date validEndTime){
        if(validEndTime!=null){
            le("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * BETWEEN 值1 AND 值2
     * @param validEndTimeStart       值1
     * @param validEndTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeBetween(Date validEndTimeStart,Date validEndTimeEnd){
        if(validEndTimeStart!=null && validEndTimeEnd!=null){
            between("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param validEndTimeStart       值1
     * @param validEndTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeNotBetween(Date validEndTimeStart,Date validEndTimeEnd){
        if(validEndTimeStart!=null && validEndTimeEnd!=null){
            notBetween("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值%' validEndTime
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeLike(Date validEndTime){
        if(validEndTime!=null){
            like("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT LIKE '%值%' validEndTime
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeNotLike(Date validEndTime){
        if(validEndTime!=null){
            notLike("valid_end_time",validEndTime);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值' validEndTime
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeLikeLeft(Date validEndTime){
        if(validEndTime!=null){
            likeLeft("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '值%' validEndTime
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeLikeRight(Date validEndTime){
        if(validEndTime!=null){
            likeRight("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeIsNull(){
        isNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeIsNotNull(){
        isNotNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("valid_end_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("valid_end_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("valid_end_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper validEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_end_time",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 等于 = versionId
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 不等于 &lt;&gt; versionId
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于 &gt; versionId
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于等于 &gt;= versionId
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于 &lt; versionId
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于等于 &lt;= versionId
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值' versionId
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * LIKE '值%' versionId
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdLikeRight(Long versionId){
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("version_id",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper versionIdNotIn(Long... values){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeEq(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeNe(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeGt(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeGe(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeLt(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeLe(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeLike(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeNotLike(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeLikeRight(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeIn(Collection<Date> value){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeIn(Date... values){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcMachineAssignTaskEoUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * 等于 = createPerson
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonEq(String createPerson){
        if(createPerson!=null){
            eq("create_person",createPerson);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * 不等于 &lt;&gt; createPerson
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonNe(String createPerson){
        if(createPerson!=null){
            ne("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 大于 &gt; createPerson
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonGt(String createPerson){
        if(createPerson!=null){
            gt("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 大于等于 &gt;= createPerson
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonGe(String createPerson){
        if(createPerson!=null){
            ge("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 小于 &lt; createPerson
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonLt(String createPerson){
        if(createPerson!=null){
            lt("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 小于等于 &lt;= createPerson
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonLe(String createPerson){
        if(createPerson!=null){
            le("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * BETWEEN 值1 AND 值2
     * @param createPersonStart       值1
     * @param createPersonEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonBetween(String createPersonStart,String createPersonEnd){
        if(createPersonStart!=null && createPersonEnd!=null){
            between("create_person",createPersonStart,createPersonEnd);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * NOT BETWEEN 值1 AND 值2
     * @param createPersonStart       值1
     * @param createPersonEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonNotBetween(String createPersonStart,String createPersonEnd){
        if(createPersonStart!=null && createPersonEnd!=null){
            notBetween("create_person",createPersonStart,createPersonEnd);
        }
        return this;
     }


    /**
     * <p>创建人</p>
     * LIKE '%值%' createPerson
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonLike(String createPerson){
        if(createPerson!=null){
            like("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * NOT LIKE '%值%' createPerson
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonNotLike(String createPerson){
        if(createPerson!=null){
            notLike("create_person",createPerson);
        }
        return this;
     }


    /**
     * <p>创建人</p>
     * LIKE '%值' createPerson
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonLikeLeft(String createPerson){
        if(createPerson!=null){
            likeLeft("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * LIKE '值%' createPerson
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonLikeRight(String createPerson){
        if(createPerson!=null){
            likeRight("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonIsNull(){
        isNull("create_person");
        return this;
    }

    /**
     * <p>创建人</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonIsNotNull(){
        isNotNull("create_person");
        return this;
    }

    /**
     * <p>创建人</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("create_person",value);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonIn(String... values){
        if(values!=null && values.length>0){
            in("create_person",values);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_person",value);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper createPersonNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("create_person",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 = updateTime
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeEq(Date updateTime){
        if(updateTime!=null){
            eq("update_time",updateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt; updateTime
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeNe(Date updateTime){
        if(updateTime!=null){
            ne("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; updateTime
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeGt(Date updateTime){
        if(updateTime!=null){
            gt("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= updateTime
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeGe(Date updateTime){
        if(updateTime!=null){
            ge("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; updateTime
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeLt(Date updateTime){
        if(updateTime!=null){
            lt("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= updateTime
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeLe(Date updateTime){
        if(updateTime!=null){
            le("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN 值1 AND 值2
     * @param updateTimeStart       值1
     * @param updateTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeBetween(Date updateTimeStart,Date updateTimeEnd){
        if(updateTimeStart!=null && updateTimeEnd!=null){
            between("update_time",updateTimeStart,updateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param updateTimeStart       值1
     * @param updateTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeNotBetween(Date updateTimeStart,Date updateTimeEnd){
        if(updateTimeStart!=null && updateTimeEnd!=null){
            notBetween("update_time",updateTimeStart,updateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%' updateTime
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeLike(Date updateTime){
        if(updateTime!=null){
            like("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%' updateTime
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeNotLike(Date updateTime){
        if(updateTime!=null){
            notLike("update_time",updateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值' updateTime
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeLikeLeft(Date updateTime){
        if(updateTime!=null){
            likeLeft("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%' updateTime
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeLikeRight(Date updateTime){
        if(updateTime!=null){
            likeRight("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeIsNull(){
        isNull("update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeIsNotNull(){
        isNotNull("update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("update_time",value);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("update_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("update_time",value);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper updateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("update_time",values);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * 等于 = dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drEq(Integer dr){
        if(dr!=null){
            eq("dr",dr);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * 不等于 &lt;&gt; dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drNe(Integer dr){
        if(dr!=null){
            ne("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 大于 &gt; dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drGt(Integer dr){
        if(dr!=null){
            gt("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 大于等于 &gt;= dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drGe(Integer dr){
        if(dr!=null){
            ge("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 小于 &lt; dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drLt(Integer dr){
        if(dr!=null){
            lt("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 小于等于 &lt;= dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drLe(Integer dr){
        if(dr!=null){
            le("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * BETWEEN 值1 AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drBetween(Integer drStart,Integer drEnd){
        if(drStart!=null && drEnd!=null){
            between("dr",drStart,drEnd);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * NOT BETWEEN 值1 AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drNotBetween(Integer drStart,Integer drEnd){
        if(drStart!=null && drEnd!=null){
            notBetween("dr",drStart,drEnd);
        }
        return this;
     }


    /**
     * <p>是否删除</p>
     * LIKE '%值%' dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drLike(Integer dr){
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * NOT LIKE '%值%' dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drNotLike(Integer dr){
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>是否删除</p>
     * LIKE '%值' dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drLikeLeft(Integer dr){
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * LIKE '值%' dr
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drLikeRight(Integer dr){
        if(dr!=null){
            likeRight("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>是否删除</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>是否删除</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dr",value);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drIn(Integer... values){
        if(values!=null && values.length>0){
            in("dr",values);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dr",value);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper drNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dr",values);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * 等于 = msg
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgEq(String msg){
        if(msg!=null){
            eq("msg",msg);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * 不等于 &lt;&gt; msg
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgNe(String msg){
        if(msg!=null){
            ne("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 大于 &gt; msg
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgGt(String msg){
        if(msg!=null){
            gt("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 大于等于 &gt;= msg
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgGe(String msg){
        if(msg!=null){
            ge("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 小于 &lt; msg
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgLt(String msg){
        if(msg!=null){
            lt("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 小于等于 &lt;= msg
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgLe(String msg){
        if(msg!=null){
            le("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * BETWEEN 值1 AND 值2
     * @param msgStart       值1
     * @param msgEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgBetween(String msgStart,String msgEnd){
        if(msgStart!=null && msgEnd!=null){
            between("msg",msgStart,msgEnd);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * NOT BETWEEN 值1 AND 值2
     * @param msgStart       值1
     * @param msgEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgNotBetween(String msgStart,String msgEnd){
        if(msgStart!=null && msgEnd!=null){
            notBetween("msg",msgStart,msgEnd);
        }
        return this;
     }


    /**
     * <p>执行结果</p>
     * LIKE '%值%' msg
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgLike(String msg){
        if(msg!=null){
            like("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * NOT LIKE '%值%' msg
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgNotLike(String msg){
        if(msg!=null){
            notLike("msg",msg);
        }
        return this;
     }


    /**
     * <p>执行结果</p>
     * LIKE '%值' msg
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgLikeLeft(String msg){
        if(msg!=null){
            likeLeft("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * LIKE '值%' msg
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgLikeRight(String msg){
        if(msg!=null){
            likeRight("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgIsNull(){
        isNull("msg");
        return this;
    }

    /**
     * <p>执行结果</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgIsNotNull(){
        isNotNull("msg");
        return this;
    }

    /**
     * <p>执行结果</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("msg",value);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgIn(String... values){
        if(values!=null && values.length>0){
            in("msg",values);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("msg",value);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper msgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("msg",values);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * 等于 = appLicenseId
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdEq(Long appLicenseId){
        if(appLicenseId!=null){
            eq("app_license_id",appLicenseId);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * 不等于 &lt;&gt; appLicenseId
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdNe(Long appLicenseId){
        if(appLicenseId!=null){
            ne("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 大于 &gt; appLicenseId
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdGt(Long appLicenseId){
        if(appLicenseId!=null){
            gt("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 大于等于 &gt;= appLicenseId
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdGe(Long appLicenseId){
        if(appLicenseId!=null){
            ge("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 小于 &lt; appLicenseId
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdLt(Long appLicenseId){
        if(appLicenseId!=null){
            lt("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 小于等于 &lt;= appLicenseId
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdLe(Long appLicenseId){
        if(appLicenseId!=null){
            le("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * BETWEEN 值1 AND 值2
     * @param appLicenseIdStart       值1
     * @param appLicenseIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdBetween(Long appLicenseIdStart,Long appLicenseIdEnd){
        if(appLicenseIdStart!=null && appLicenseIdEnd!=null){
            between("app_license_id",appLicenseIdStart,appLicenseIdEnd);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param appLicenseIdStart       值1
     * @param appLicenseIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdNotBetween(Long appLicenseIdStart,Long appLicenseIdEnd){
        if(appLicenseIdStart!=null && appLicenseIdEnd!=null){
            notBetween("app_license_id",appLicenseIdStart,appLicenseIdEnd);
        }
        return this;
     }


    /**
     * <p>app许可证id</p>
     * LIKE '%值%' appLicenseId
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdLike(Long appLicenseId){
        if(appLicenseId!=null){
            like("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * NOT LIKE '%值%' appLicenseId
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdNotLike(Long appLicenseId){
        if(appLicenseId!=null){
            notLike("app_license_id",appLicenseId);
        }
        return this;
     }


    /**
     * <p>app许可证id</p>
     * LIKE '%值' appLicenseId
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdLikeLeft(Long appLicenseId){
        if(appLicenseId!=null){
            likeLeft("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * LIKE '值%' appLicenseId
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdLikeRight(Long appLicenseId){
        if(appLicenseId!=null){
            likeRight("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdIsNull(){
        isNull("app_license_id");
        return this;
    }

    /**
     * <p>app许可证id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdIsNotNull(){
        isNotNull("app_license_id");
        return this;
    }

    /**
     * <p>app许可证id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("app_license_id",value);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdIn(Long... values){
        if(values!=null && values.length>0){
            in("app_license_id",values);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("app_license_id",value);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("app_license_id",values);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 等于 = appLicenseType
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeEq(Integer appLicenseType){
        if(appLicenseType!=null){
            eq("app_license_type",appLicenseType);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 不等于 &lt;&gt; appLicenseType
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeNe(Integer appLicenseType){
        if(appLicenseType!=null){
            ne("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 大于 &gt; appLicenseType
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeGt(Integer appLicenseType){
        if(appLicenseType!=null){
            gt("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 大于等于 &gt;= appLicenseType
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeGe(Integer appLicenseType){
        if(appLicenseType!=null){
            ge("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 小于 &lt; appLicenseType
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeLt(Integer appLicenseType){
        if(appLicenseType!=null){
            lt("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 小于等于 &lt;= appLicenseType
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeLe(Integer appLicenseType){
        if(appLicenseType!=null){
            le("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * BETWEEN 值1 AND 值2
     * @param appLicenseTypeStart       值1
     * @param appLicenseTypeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeBetween(Integer appLicenseTypeStart,Integer appLicenseTypeEnd){
        if(appLicenseTypeStart!=null && appLicenseTypeEnd!=null){
            between("app_license_type",appLicenseTypeStart,appLicenseTypeEnd);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param appLicenseTypeStart       值1
     * @param appLicenseTypeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeNotBetween(Integer appLicenseTypeStart,Integer appLicenseTypeEnd){
        if(appLicenseTypeStart!=null && appLicenseTypeEnd!=null){
            notBetween("app_license_type",appLicenseTypeStart,appLicenseTypeEnd);
        }
        return this;
     }


    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * LIKE '%值%' appLicenseType
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeLike(Integer appLicenseType){
        if(appLicenseType!=null){
            like("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * NOT LIKE '%值%' appLicenseType
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeNotLike(Integer appLicenseType){
        if(appLicenseType!=null){
            notLike("app_license_type",appLicenseType);
        }
        return this;
     }


    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * LIKE '%值' appLicenseType
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeLikeLeft(Integer appLicenseType){
        if(appLicenseType!=null){
            likeLeft("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * LIKE '值%' appLicenseType
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeLikeRight(Integer appLicenseType){
        if(appLicenseType!=null){
            likeRight("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeIsNull(){
        isNull("app_license_type");
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeIsNotNull(){
        isNotNull("app_license_type");
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("app_license_type",value);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("app_license_type",values);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("app_license_type",value);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper appLicenseTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("app_license_type",values);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * 等于 = traceId
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdEq(String traceId){
        if(traceId!=null){
            eq("trace_id",traceId);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * 不等于 &lt;&gt; traceId
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdNe(String traceId){
        if(traceId!=null){
            ne("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 大于 &gt; traceId
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdGt(String traceId){
        if(traceId!=null){
            gt("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 大于等于 &gt;= traceId
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdGe(String traceId){
        if(traceId!=null){
            ge("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 小于 &lt; traceId
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdLt(String traceId){
        if(traceId!=null){
            lt("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 小于等于 &lt;= traceId
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdLe(String traceId){
        if(traceId!=null){
            le("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * BETWEEN 值1 AND 值2
     * @param traceIdStart       值1
     * @param traceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdBetween(String traceIdStart,String traceIdEnd){
        if(traceIdStart!=null && traceIdEnd!=null){
            between("trace_id",traceIdStart,traceIdEnd);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param traceIdStart       值1
     * @param traceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdNotBetween(String traceIdStart,String traceIdEnd){
        if(traceIdStart!=null && traceIdEnd!=null){
            notBetween("trace_id",traceIdStart,traceIdEnd);
        }
        return this;
     }


    /**
     * <p>链路ID</p>
     * LIKE '%值%' traceId
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdLike(String traceId){
        if(traceId!=null){
            like("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * NOT LIKE '%值%' traceId
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdNotLike(String traceId){
        if(traceId!=null){
            notLike("trace_id",traceId);
        }
        return this;
     }


    /**
     * <p>链路ID</p>
     * LIKE '%值' traceId
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdLikeLeft(String traceId){
        if(traceId!=null){
            likeLeft("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * LIKE '值%' traceId
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdLikeRight(String traceId){
        if(traceId!=null){
            likeRight("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdIsNull(){
        isNull("trace_id");
        return this;
    }

    /**
     * <p>链路ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdIsNotNull(){
        isNotNull("trace_id");
        return this;
    }

    /**
     * <p>链路ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("trace_id",value);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdIn(String... values){
        if(values!=null && values.length>0){
            in("trace_id",values);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("trace_id",value);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper traceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("trace_id",values);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 等于 = fkCpTnResourcePoolId
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdEq(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            eq("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 不等于 &lt;&gt; fkCpTnResourcePoolId
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdNe(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            ne("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 大于 &gt; fkCpTnResourcePoolId
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdGt(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            gt("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 大于等于 &gt;= fkCpTnResourcePoolId
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdGe(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            ge("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 小于 &lt; fkCpTnResourcePoolId
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdLt(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            lt("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 小于等于 &lt;= fkCpTnResourcePoolId
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdLe(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            le("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * BETWEEN 值1 AND 值2
     * @param fkCpTnResourcePoolIdStart       值1
     * @param fkCpTnResourcePoolIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdBetween(Long fkCpTnResourcePoolIdStart,Long fkCpTnResourcePoolIdEnd){
        if(fkCpTnResourcePoolIdStart!=null && fkCpTnResourcePoolIdEnd!=null){
            between("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolIdStart,fkCpTnResourcePoolIdEnd);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkCpTnResourcePoolIdStart       值1
     * @param fkCpTnResourcePoolIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdNotBetween(Long fkCpTnResourcePoolIdStart,Long fkCpTnResourcePoolIdEnd){
        if(fkCpTnResourcePoolIdStart!=null && fkCpTnResourcePoolIdEnd!=null){
            notBetween("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolIdStart,fkCpTnResourcePoolIdEnd);
        }
        return this;
     }


    /**
     * <p>商户资源池ID【非必填】</p>
     * LIKE '%值%' fkCpTnResourcePoolId
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdLike(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            like("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * NOT LIKE '%值%' fkCpTnResourcePoolId
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdNotLike(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            notLike("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }


    /**
     * <p>商户资源池ID【非必填】</p>
     * LIKE '%值' fkCpTnResourcePoolId
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdLikeLeft(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            likeLeft("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * LIKE '值%' fkCpTnResourcePoolId
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdLikeRight(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            likeRight("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdIsNull(){
        isNull("fk_cp_tn_resource_pool_id");
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdIsNotNull(){
        isNotNull("fk_cp_tn_resource_pool_id");
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_cp_tn_resource_pool_id",value);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_cp_tn_resource_pool_id",values);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_cp_tn_resource_pool_id",value);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper fkCpTnResourcePoolIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_cp_tn_resource_pool_id",values);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * 等于 = resourcePoolName
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameEq(String resourcePoolName){
        if(resourcePoolName!=null){
            eq("resource_pool_name",resourcePoolName);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * 不等于 &lt;&gt; resourcePoolName
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameNe(String resourcePoolName){
        if(resourcePoolName!=null){
            ne("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 大于 &gt; resourcePoolName
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameGt(String resourcePoolName){
        if(resourcePoolName!=null){
            gt("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 大于等于 &gt;= resourcePoolName
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameGe(String resourcePoolName){
        if(resourcePoolName!=null){
            ge("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 小于 &lt; resourcePoolName
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameLt(String resourcePoolName){
        if(resourcePoolName!=null){
            lt("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 小于等于 &lt;= resourcePoolName
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameLe(String resourcePoolName){
        if(resourcePoolName!=null){
            le("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * BETWEEN 值1 AND 值2
     * @param resourcePoolNameStart       值1
     * @param resourcePoolNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameBetween(String resourcePoolNameStart,String resourcePoolNameEnd){
        if(resourcePoolNameStart!=null && resourcePoolNameEnd!=null){
            between("resource_pool_name",resourcePoolNameStart,resourcePoolNameEnd);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * NOT BETWEEN 值1 AND 值2
     * @param resourcePoolNameStart       值1
     * @param resourcePoolNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameNotBetween(String resourcePoolNameStart,String resourcePoolNameEnd){
        if(resourcePoolNameStart!=null && resourcePoolNameEnd!=null){
            notBetween("resource_pool_name",resourcePoolNameStart,resourcePoolNameEnd);
        }
        return this;
     }


    /**
     * <p>资源池名称【非必填】</p>
     * LIKE '%值%' resourcePoolName
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameLike(String resourcePoolName){
        if(resourcePoolName!=null){
            like("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * NOT LIKE '%值%' resourcePoolName
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameNotLike(String resourcePoolName){
        if(resourcePoolName!=null){
            notLike("resource_pool_name",resourcePoolName);
        }
        return this;
     }


    /**
     * <p>资源池名称【非必填】</p>
     * LIKE '%值' resourcePoolName
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameLikeLeft(String resourcePoolName){
        if(resourcePoolName!=null){
            likeLeft("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * LIKE '值%' resourcePoolName
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameLikeRight(String resourcePoolName){
        if(resourcePoolName!=null){
            likeRight("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameIsNull(){
        isNull("resource_pool_name");
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameIsNotNull(){
        isNotNull("resource_pool_name");
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("resource_pool_name",value);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameIn(String... values){
        if(values!=null && values.length>0){
            in("resource_pool_name",values);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("resource_pool_name",value);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateWrapper resourcePoolNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("resource_pool_name",values);
        }
        return this;
    }


}
