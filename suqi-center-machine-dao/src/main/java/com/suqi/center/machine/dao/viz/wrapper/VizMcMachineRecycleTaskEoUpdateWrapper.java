package com.suqi.center.machine.dao.viz.wrapper;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineRecycleTaskEo;

import java.util.Collection;
import java.util.Date;

/**
 * <p>
 * 【可视化】机器回收任务表
 * </p>
 * "viz_mc_machine_recycle_task"
 * @author Administrator
 */
public class VizMcMachineRecycleTaskEoUpdateWrapper extends UpdateWrapper<VizMcMachineRecycleTaskEo> {

    public static VizMcMachineRecycleTaskEoUpdateWrapper wrapper() {
        return new VizMcMachineRecycleTaskEoUpdateWrapper();
    }

    public VizMcMachineRecycleTaskEoUpdateWrapper() {
        super();
    }

    public VizMcMachineRecycleTaskEoUpdateWrapper(VizMcMachineRecycleTaskEo entity) {
        super(entity);
    }

    /**
     * 主键ID
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 任务批次号
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setBatchNo(String batchNo) {
         set("batch_no",batchNo);
        return this;
    }
    /**
     * 商户ID
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setTenantId(Long tenantId) {
         set("tenant_id",tenantId);
        return this;
    }
    /**
     * 商户名称
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setTenantName(String tenantName) {
         set("tenant_name",tenantName);
        return this;
    }
    /**
     * 内网ip地址
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setExternalAddr(String externalAddr) {
         set("external_addr",externalAddr);
        return this;
    }
    /**
     * 外网ip地址
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setInternalAddr(String internalAddr) {
         set("internal_addr",internalAddr);
        return this;
    }
    /**
     * 机器基础信息表记录id
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setFkMcMachineId(Long fkMcMachineId) {
         set("fk_mc_machine_id",fkMcMachineId);
        return this;
    }
    /**
     * 租户设备表记录id
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setFkVizTnMachineId(Long fkVizTnMachineId) {
         set("fk_viz_tn_machine_id",fkVizTnMachineId);
        return this;
    }
    /**
     * 设备唯一码
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 实例Id
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 回收状态(10：待回收，20：已回收, 30:回收失败)
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setRecycleStatus(Integer recycleStatus) {
         set("recycle_status",recycleStatus);
        return this;
    }
    /**
     * 操作人用户ID
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setOperateUserId(Long operateUserId) {
         set("operate_user_id",operateUserId);
        return this;
    }
    /**
     * 回收时间
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setRecycleTime(Date recycleTime) {
         set("recycle_time",recycleTime);
        return this;
    }
    /**
     * 版本id
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 创建时间
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 创建人
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setCreatePerson(String createPerson) {
         set("create_person",createPerson);
        return this;
    }
    /**
     * 最后修改时间
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setUpdateTime(Date updateTime) {
         set("update_time",updateTime);
        return this;
    }
    /**
     * 是否删除
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setDr(Integer dr) {
         set("dr",dr);
        return this;
    }
    /**
     * 执行结果
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setMsg(String msg) {
         set("msg",msg);
        return this;
    }
    /**
     * 链路ID
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setTraceId(String traceId) {
         set("trace_id",traceId);
        return this;
    }
    /**
     * 商户资源池ID【非必填】
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setFkCpTnResourcePoolId(Long fkCpTnResourcePoolId) {
         set("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        return this;
    }
    /**
     * 资源池名称【非必填】
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper setResourcePoolName(String resourcePoolName) {
         set("resource_pool_name",resourcePoolName);
        return this;
    }

    /**
     * <p>主键ID</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper idEq(Long id){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper idNe(Long id){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper idGt(Long id){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper idGe(Long id){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper idLt(Long id){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper idLe(Long id){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper idLike(Long id){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper idNotLike(Long id){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper idLikeLeft(Long id){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper idLikeRight(Long id){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>主键ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>主键ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper idIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper idIn(Long... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper idNotIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper idNotIn(Long... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoEq(String batchNo){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoNe(String batchNo){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoGt(String batchNo){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoGe(String batchNo){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoLt(String batchNo){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoLe(String batchNo){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoBetween(String batchNoStart,String batchNoEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoNotBetween(String batchNoStart,String batchNoEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoLike(String batchNo){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoNotLike(String batchNo){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoLikeLeft(String batchNo){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoLikeRight(String batchNo){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoIsNull(){
        isNull("batch_no");
        return this;
    }

    /**
     * <p>任务批次号</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoIsNotNull(){
        isNotNull("batch_no");
        return this;
    }

    /**
     * <p>任务批次号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper batchNoNotIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdEq(Long tenantId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdNe(Long tenantId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdGt(Long tenantId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdGe(Long tenantId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdLt(Long tenantId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdLe(Long tenantId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdBetween(Long tenantIdStart,Long tenantIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdNotBetween(Long tenantIdStart,Long tenantIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdLike(Long tenantId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdNotLike(Long tenantId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdLikeLeft(Long tenantId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdLikeRight(Long tenantId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdIsNull(){
        isNull("tenant_id");
        return this;
    }

    /**
     * <p>商户ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdIsNotNull(){
        isNotNull("tenant_id");
        return this;
    }

    /**
     * <p>商户ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdIn(Long... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdNotIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantIdNotIn(Long... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameEq(String tenantName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameNe(String tenantName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameGt(String tenantName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameGe(String tenantName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameLt(String tenantName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameLe(String tenantName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameBetween(String tenantNameStart,String tenantNameEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameNotBetween(String tenantNameStart,String tenantNameEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameLike(String tenantName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameNotLike(String tenantName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameLikeLeft(String tenantName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameLikeRight(String tenantName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameIsNull(){
        isNull("tenant_name");
        return this;
    }

    /**
     * <p>商户名称</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameIsNotNull(){
        isNotNull("tenant_name");
        return this;
    }

    /**
     * <p>商户名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper tenantNameNotIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrEq(String externalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrNe(String externalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrGt(String externalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrGe(String externalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrLt(String externalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrLe(String externalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrBetween(String externalAddrStart,String externalAddrEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrNotBetween(String externalAddrStart,String externalAddrEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrLike(String externalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrNotLike(String externalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrLikeLeft(String externalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrLikeRight(String externalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrIsNull(){
        isNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrIsNotNull(){
        isNotNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper externalAddrNotIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrEq(String internalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrNe(String internalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrGt(String internalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrGe(String internalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrLt(String internalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrLe(String internalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrBetween(String internalAddrStart,String internalAddrEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrNotBetween(String internalAddrStart,String internalAddrEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrLike(String internalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrNotLike(String internalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrLikeLeft(String internalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrLikeRight(String internalAddr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrIsNull(){
        isNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrIsNotNull(){
        isNotNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper internalAddrNotIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdEq(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdNe(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdGt(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdGe(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdLt(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdLe(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdLike(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdIn(Long... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdNotIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkMcMachineIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_machine_id",values);
        }
        return this;
    }

    /**
     * <p>租户设备表记录id</p>
     * 等于 = fkVizTnMachineId
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdEq(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            eq("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
    }

    /**
     * <p>租户设备表记录id</p>
     * 不等于 &lt;&gt; fkVizTnMachineId
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdNe(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            ne("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * 大于 &gt; fkVizTnMachineId
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdGt(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            gt("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * 大于等于 &gt;= fkVizTnMachineId
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdGe(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            ge("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * 小于 &lt; fkVizTnMachineId
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdLt(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            lt("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * 小于等于 &lt;= fkVizTnMachineId
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdLe(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            le("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * BETWEEN 值1 AND 值2
     * @param fkVizTnMachineIdStart       值1
     * @param fkVizTnMachineIdEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdBetween(Long fkVizTnMachineIdStart,Long fkVizTnMachineIdEnd){
        if(fkVizTnMachineIdStart!=null && fkVizTnMachineIdEnd!=null){
            between("fk_viz_tn_machine_id",fkVizTnMachineIdStart,fkVizTnMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkVizTnMachineIdStart       值1
     * @param fkVizTnMachineIdEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdNotBetween(Long fkVizTnMachineIdStart,Long fkVizTnMachineIdEnd){
        if(fkVizTnMachineIdStart!=null && fkVizTnMachineIdEnd!=null){
            notBetween("fk_viz_tn_machine_id",fkVizTnMachineIdStart,fkVizTnMachineIdEnd);
        }
        return this;
     }


    /**
     * <p>租户设备表记录id</p>
     * LIKE '%值%' fkVizTnMachineId
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdLike(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            like("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * NOT LIKE '%值%' fkVizTnMachineId
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdNotLike(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            notLike("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }


    /**
     * <p>租户设备表记录id</p>
     * LIKE '%值' fkVizTnMachineId
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdLikeLeft(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            likeLeft("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * LIKE '值%' fkVizTnMachineId
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdLikeRight(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            likeRight("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdIsNull(){
        isNull("fk_viz_tn_machine_id");
        return this;
    }

    /**
     * <p>租户设备表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdIsNotNull(){
        isNotNull("fk_viz_tn_machine_id");
        return this;
    }

    /**
     * <p>租户设备表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_viz_tn_machine_id",value);
        }
        return this;
    }

    /**
     * <p>租户设备表记录id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_viz_tn_machine_id",values);
        }
        return this;
    }

    /**
     * <p>租户设备表记录id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_viz_tn_machine_id",value);
        }
        return this;
    }

    /**
     * <p>租户设备表记录id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkVizTnMachineIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_viz_tn_machine_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = deviceId
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdEq(String deviceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdNe(String deviceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdGt(String deviceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdGe(String deviceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdLt(String deviceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdLe(String deviceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdLike(String deviceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdNotLike(String deviceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper deviceIdNotIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdEq(String instanceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdNe(String instanceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdGt(String instanceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdGe(String instanceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdLt(String instanceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdLe(String instanceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdLike(String instanceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdNotLike(String instanceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdLikeLeft(String instanceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdLikeRight(String instanceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 等于 = recycleStatus
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusEq(Integer recycleStatus){
        if(recycleStatus!=null){
            eq("recycle_status",recycleStatus);
        }
        return this;
    }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 不等于 &lt;&gt; recycleStatus
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusNe(Integer recycleStatus){
        if(recycleStatus!=null){
            ne("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 大于 &gt; recycleStatus
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusGt(Integer recycleStatus){
        if(recycleStatus!=null){
            gt("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 大于等于 &gt;= recycleStatus
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusGe(Integer recycleStatus){
        if(recycleStatus!=null){
            ge("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 小于 &lt; recycleStatus
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusLt(Integer recycleStatus){
        if(recycleStatus!=null){
            lt("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 小于等于 &lt;= recycleStatus
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusLe(Integer recycleStatus){
        if(recycleStatus!=null){
            le("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * BETWEEN 值1 AND 值2
     * @param recycleStatusStart       值1
     * @param recycleStatusEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusBetween(Integer recycleStatusStart,Integer recycleStatusEnd){
        if(recycleStatusStart!=null && recycleStatusEnd!=null){
            between("recycle_status",recycleStatusStart,recycleStatusEnd);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param recycleStatusStart       值1
     * @param recycleStatusEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusNotBetween(Integer recycleStatusStart,Integer recycleStatusEnd){
        if(recycleStatusStart!=null && recycleStatusEnd!=null){
            notBetween("recycle_status",recycleStatusStart,recycleStatusEnd);
        }
        return this;
     }


    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * LIKE '%值%' recycleStatus
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusLike(Integer recycleStatus){
        if(recycleStatus!=null){
            like("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * NOT LIKE '%值%' recycleStatus
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusNotLike(Integer recycleStatus){
        if(recycleStatus!=null){
            notLike("recycle_status",recycleStatus);
        }
        return this;
     }


    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * LIKE '%值' recycleStatus
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusLikeLeft(Integer recycleStatus){
        if(recycleStatus!=null){
            likeLeft("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * LIKE '值%' recycleStatus
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusLikeRight(Integer recycleStatus){
        if(recycleStatus!=null){
            likeRight("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusIsNull(){
        isNull("recycle_status");
        return this;
    }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusIsNotNull(){
        isNotNull("recycle_status");
        return this;
    }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("recycle_status",value);
        }
        return this;
    }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("recycle_status",values);
        }
        return this;
    }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("recycle_status",value);
        }
        return this;
    }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("recycle_status",values);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * 等于 = operateUserId
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdEq(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdNe(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdGt(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdGe(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdLt(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdLe(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdBetween(Long operateUserIdStart,Long operateUserIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdNotBetween(Long operateUserIdStart,Long operateUserIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdLike(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdNotLike(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdLikeLeft(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdLikeRight(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdIsNull(){
        isNull("operate_user_id");
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdIsNotNull(){
        isNotNull("operate_user_id");
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdIn(Long... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdNotIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper operateUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("operate_user_id",values);
        }
        return this;
    }

    /**
     * <p>回收时间</p>
     * 等于 = recycleTime
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeEq(Date recycleTime){
        if(recycleTime!=null){
            eq("recycle_time",recycleTime);
        }
        return this;
    }

    /**
     * <p>回收时间</p>
     * 不等于 &lt;&gt; recycleTime
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeNe(Date recycleTime){
        if(recycleTime!=null){
            ne("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * 大于 &gt; recycleTime
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeGt(Date recycleTime){
        if(recycleTime!=null){
            gt("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * 大于等于 &gt;= recycleTime
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeGe(Date recycleTime){
        if(recycleTime!=null){
            ge("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * 小于 &lt; recycleTime
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeLt(Date recycleTime){
        if(recycleTime!=null){
            lt("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * 小于等于 &lt;= recycleTime
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeLe(Date recycleTime){
        if(recycleTime!=null){
            le("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * BETWEEN 值1 AND 值2
     * @param recycleTimeStart       值1
     * @param recycleTimeEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeBetween(Date recycleTimeStart,Date recycleTimeEnd){
        if(recycleTimeStart!=null && recycleTimeEnd!=null){
            between("recycle_time",recycleTimeStart,recycleTimeEnd);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param recycleTimeStart       值1
     * @param recycleTimeEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeNotBetween(Date recycleTimeStart,Date recycleTimeEnd){
        if(recycleTimeStart!=null && recycleTimeEnd!=null){
            notBetween("recycle_time",recycleTimeStart,recycleTimeEnd);
        }
        return this;
     }


    /**
     * <p>回收时间</p>
     * LIKE '%值%' recycleTime
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeLike(Date recycleTime){
        if(recycleTime!=null){
            like("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * NOT LIKE '%值%' recycleTime
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeNotLike(Date recycleTime){
        if(recycleTime!=null){
            notLike("recycle_time",recycleTime);
        }
        return this;
     }


    /**
     * <p>回收时间</p>
     * LIKE '%值' recycleTime
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeLikeLeft(Date recycleTime){
        if(recycleTime!=null){
            likeLeft("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * LIKE '值%' recycleTime
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeLikeRight(Date recycleTime){
        if(recycleTime!=null){
            likeRight("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeIsNull(){
        isNull("recycle_time");
        return this;
    }

    /**
     * <p>回收时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeIsNotNull(){
        isNotNull("recycle_time");
        return this;
    }

    /**
     * <p>回收时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("recycle_time",value);
        }
        return this;
    }

    /**
     * <p>回收时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("recycle_time",values);
        }
        return this;
    }

    /**
     * <p>回收时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("recycle_time",value);
        }
        return this;
    }

    /**
     * <p>回收时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper recycleTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("recycle_time",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 等于 = versionId
     * @param versionId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdEq(Long versionId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdNe(Long versionId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdGt(Long versionId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdGe(Long versionId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdLt(Long versionId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdLe(Long versionId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdLike(Long versionId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdNotLike(Long versionId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdLikeLeft(Long versionId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdLikeRight(Long versionId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdIn(Long... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdNotIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper versionIdNotIn(Long... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeEq(Date createTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeNe(Date createTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeGt(Date createTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeGe(Date createTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeLt(Date createTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeLe(Date createTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeLike(Date createTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeNotLike(Date createTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeLikeRight(Date createTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeIn(Collection<Date> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeIn(Date... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createTimeNotIn(Date... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonEq(String createPerson){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonNe(String createPerson){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonGt(String createPerson){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonGe(String createPerson){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonLt(String createPerson){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonLe(String createPerson){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonBetween(String createPersonStart,String createPersonEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonNotBetween(String createPersonStart,String createPersonEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonLike(String createPerson){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonNotLike(String createPerson){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonLikeLeft(String createPerson){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonLikeRight(String createPerson){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonIsNull(){
        isNull("create_person");
        return this;
    }

    /**
     * <p>创建人</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonIsNotNull(){
        isNotNull("create_person");
        return this;
    }

    /**
     * <p>创建人</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper createPersonNotIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeEq(Date updateTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeNe(Date updateTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeGt(Date updateTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeGe(Date updateTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeLt(Date updateTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeLe(Date updateTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeBetween(Date updateTimeStart,Date updateTimeEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeNotBetween(Date updateTimeStart,Date updateTimeEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeLike(Date updateTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeNotLike(Date updateTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeLikeLeft(Date updateTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeLikeRight(Date updateTime){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeIsNull(){
        isNull("update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeIsNotNull(){
        isNotNull("update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeIn(Collection<Date> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeIn(Date... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeNotIn(Collection<Date> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper updateTimeNotIn(Date... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drEq(Integer dr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drNe(Integer dr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drGt(Integer dr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drGe(Integer dr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drLt(Integer dr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drLe(Integer dr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drBetween(Integer drStart,Integer drEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drNotBetween(Integer drStart,Integer drEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drLike(Integer dr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drNotLike(Integer dr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drLikeLeft(Integer dr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drLikeRight(Integer dr){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>是否删除</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>是否删除</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper drIn(Collection<Integer> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drIn(Integer... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drNotIn(Collection<Integer> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper drNotIn(Integer... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgEq(String msg){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgNe(String msg){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgGt(String msg){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgGe(String msg){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgLt(String msg){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgLe(String msg){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgBetween(String msgStart,String msgEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgNotBetween(String msgStart,String msgEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgLike(String msg){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgNotLike(String msg){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgLikeLeft(String msg){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgLikeRight(String msg){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgIsNull(){
        isNull("msg");
        return this;
    }

    /**
     * <p>执行结果</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper msgIsNotNull(){
        isNotNull("msg");
        return this;
    }

    /**
     * <p>执行结果</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper msgIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper msgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("msg",values);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * 等于 = traceId
     * @param traceId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdEq(String traceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdNe(String traceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdGt(String traceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdGe(String traceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdLt(String traceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdLe(String traceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdBetween(String traceIdStart,String traceIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdNotBetween(String traceIdStart,String traceIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdLike(String traceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdNotLike(String traceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdLikeLeft(String traceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdLikeRight(String traceId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdIsNull(){
        isNull("trace_id");
        return this;
    }

    /**
     * <p>链路ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdIsNotNull(){
        isNotNull("trace_id");
        return this;
    }

    /**
     * <p>链路ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper traceIdNotIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdEq(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdNe(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdGt(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdGe(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdLt(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdLe(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdBetween(Long fkCpTnResourcePoolIdStart,Long fkCpTnResourcePoolIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdNotBetween(Long fkCpTnResourcePoolIdStart,Long fkCpTnResourcePoolIdEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdLike(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdNotLike(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdLikeLeft(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdLikeRight(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdIsNull(){
        isNull("fk_cp_tn_resource_pool_id");
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdIsNotNull(){
        isNotNull("fk_cp_tn_resource_pool_id");
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdIn(Long... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdNotIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper fkCpTnResourcePoolIdNotIn(Long... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameEq(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameNe(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameGt(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameGe(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameLt(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameLe(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameBetween(String resourcePoolNameStart,String resourcePoolNameEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameNotBetween(String resourcePoolNameStart,String resourcePoolNameEnd){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameLike(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameNotLike(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameLikeLeft(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameLikeRight(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameIsNull(){
        isNull("resource_pool_name");
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameIsNotNull(){
        isNotNull("resource_pool_name");
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameIn(String... values){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoUpdateWrapper resourcePoolNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("resource_pool_name",values);
        }
        return this;
    }


}
