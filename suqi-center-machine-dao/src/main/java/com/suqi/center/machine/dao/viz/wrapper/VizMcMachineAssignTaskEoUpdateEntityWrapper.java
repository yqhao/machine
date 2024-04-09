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
public class VizMcMachineAssignTaskEoUpdateEntityWrapper extends UpdateWrapper<VizMcMachineAssignTaskEo> {

    public static VizMcMachineAssignTaskEoUpdateEntityWrapper wrapper(VizMcMachineAssignTaskEo entity) {
        return new VizMcMachineAssignTaskEoUpdateEntityWrapper(entity);
    }

    private VizMcMachineAssignTaskEo entity;

    public VizMcMachineAssignTaskEoUpdateEntityWrapper(VizMcMachineAssignTaskEo entity) {
        this.entity=entity;
    }

    /**
     * 主键ID
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 任务批次号
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setBatchNo(String batchNo) {
         set("batch_no",batchNo);
        return this;
    }
    /**
     * 商户ID
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setTenantId(Long tenantId) {
         set("tenant_id",tenantId);
        return this;
    }
    /**
     * 商户名称
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setTenantName(String tenantName) {
         set("tenant_name",tenantName);
        return this;
    }
    /**
     * 内网ip地址
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setExternalAddr(String externalAddr) {
         set("external_addr",externalAddr);
        return this;
    }
    /**
     * 外网ip地址
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setInternalAddr(String internalAddr) {
         set("internal_addr",internalAddr);
        return this;
    }
    /**
     * 机器基础信息表记录id
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setFkMcMachineId(Long fkMcMachineId) {
         set("fk_mc_machine_id",fkMcMachineId);
        return this;
    }
    /**
     * 设备唯一码
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 实例Id
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 分配状态(10：待分配，20：已分配, 30:分配失败)
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setAssignStatus(Integer assignStatus) {
         set("assign_status",assignStatus);
        return this;
    }
    /**
     * 操作人用户ID
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setOperateUserId(Long operateUserId) {
         set("operate_user_id",operateUserId);
        return this;
    }
    /**
     * 使用有效期开始时间
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setValidStartTime(Date validStartTime) {
         set("valid_start_time",validStartTime);
        return this;
    }
    /**
     * 使用有效期结束时间
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setValidEndTime(Date validEndTime) {
         set("valid_end_time",validEndTime);
        return this;
    }
    /**
     * 版本id
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 创建时间
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 创建人
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setCreatePerson(String createPerson) {
         set("create_person",createPerson);
        return this;
    }
    /**
     * 最后修改时间
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setUpdateTime(Date updateTime) {
         set("update_time",updateTime);
        return this;
    }
    /**
     * 是否删除
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setDr(Integer dr) {
         set("dr",dr);
        return this;
    }
    /**
     * 执行结果
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setMsg(String msg) {
         set("msg",msg);
        return this;
    }
    /**
     * app许可证id
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setAppLicenseId(Long appLicenseId) {
         set("app_license_id",appLicenseId);
        return this;
    }
    /**
     * app许可证类型（1：云应用，2：云手机，3：云游戏）
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setAppLicenseType(Integer appLicenseType) {
         set("app_license_type",appLicenseType);
        return this;
    }
    /**
     * 链路ID
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setTraceId(String traceId) {
         set("trace_id",traceId);
        return this;
    }
    /**
     * 商户资源池ID【非必填】
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setFkCpTnResourcePoolId(Long fkCpTnResourcePoolId) {
         set("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        return this;
    }
    /**
     * 资源池名称【非必填】
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setResourcePoolName(String resourcePoolName) {
         set("resource_pool_name",resourcePoolName);
        return this;
    }

    protected VizMcMachineAssignTaskEo entity() {
        if(entity==null){
            throw new NullPointerException("VizMcMachineAssignTaskEo is null");
        }
        return entity;
    }

    /**
     * 主键ID
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 任务批次号
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setBatchNo() {
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            set("batch_no",batchNo);
        }
        return this;
    }
    /**
     * 商户ID
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setTenantId() {
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            set("tenant_id",tenantId);
        }
        return this;
    }
    /**
     * 商户名称
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setTenantName() {
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            set("tenant_name",tenantName);
        }
        return this;
    }
    /**
     * 内网ip地址
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setExternalAddr() {
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            set("external_addr",externalAddr);
        }
        return this;
    }
    /**
     * 外网ip地址
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setInternalAddr() {
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            set("internal_addr",internalAddr);
        }
        return this;
    }
    /**
     * 机器基础信息表记录id
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setFkMcMachineId() {
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            set("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }
    /**
     * 设备唯一码
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setDeviceId() {
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            set("device_id",deviceId);
        }
        return this;
    }
    /**
     * 实例Id
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setInstanceId() {
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            set("instance_id",instanceId);
        }
        return this;
    }
    /**
     * 分配状态(10：待分配，20：已分配, 30:分配失败)
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setAssignStatus() {
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            set("assign_status",assignStatus);
        }
        return this;
    }
    /**
     * 操作人用户ID
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setOperateUserId() {
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            set("operate_user_id",operateUserId);
        }
        return this;
    }
    /**
     * 使用有效期开始时间
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setValidStartTime() {
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            set("valid_start_time",validStartTime);
        }
        return this;
    }
    /**
     * 使用有效期结束时间
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setValidEndTime() {
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            set("valid_end_time",validEndTime);
        }
        return this;
    }
    /**
     * 版本id
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setVersionId() {
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            set("version_id",versionId);
        }
        return this;
    }
    /**
     * 创建时间
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * 创建人
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setCreatePerson() {
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            set("create_person",createPerson);
        }
        return this;
    }
    /**
     * 最后修改时间
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setUpdateTime() {
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            set("update_time",updateTime);
        }
        return this;
    }
    /**
     * 是否删除
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setDr() {
        Integer dr =entity().getDr();
        if(dr!=null){
            set("dr",dr);
        }
        return this;
    }
    /**
     * 执行结果
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setMsg() {
        String msg =entity().getMsg();
        if(msg!=null){
            set("msg",msg);
        }
        return this;
    }
    /**
     * app许可证id
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setAppLicenseId() {
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            set("app_license_id",appLicenseId);
        }
        return this;
    }
    /**
     * app许可证类型（1：云应用，2：云手机，3：云游戏）
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setAppLicenseType() {
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            set("app_license_type",appLicenseType);
        }
        return this;
    }
    /**
     * 链路ID
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setTraceId() {
        String traceId =entity().getTraceId();
        if(traceId!=null){
            set("trace_id",traceId);
        }
        return this;
    }
    /**
     * 商户资源池ID【非必填】
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setFkCpTnResourcePoolId() {
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            set("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
    }
    /**
     * 资源池名称【非必填】
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper setResourcePoolName() {
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            set("resource_pool_name",resourcePoolName);
        }
        return this;
    }
    /**
     * <p>主键ID</p>
     * 等于 = entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>主键ID</p>
     * LIKE '%值%' entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>主键ID</p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

/**
     * <p>主键ID</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
    }


    /**
     * <p>主键ID</p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idLikeRight(Long id){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>主键ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>主键ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idIn(Long... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * 等于 = entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoEq(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            eq("batch_no",batchNo);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * 不等于 &lt;&gt; entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoNe(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            ne("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 大于 &gt; entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoGt(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            gt("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 大于等于 &gt;= entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoGe(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            ge("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 小于 &lt; entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoLt(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            lt("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 小于等于 &lt;= entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoLe(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            le("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * BETWEEN  entity().getBatchNo() AND 值2
     * @param batchNoEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoBetween(String batchNoEnd){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null && batchNoEnd!=null){
            between("batch_no",batchNo,batchNoEnd);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * NOT BETWEEN  entity().getBatchNo() AND 值2
     * @param batchNoEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoNotBetween(String batchNoEnd){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null && batchNoEnd!=null){
            notBetween("batch_no",batchNo,batchNoEnd);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * BETWEEN  entity().getBatchNo() AND 值2
     * @param batchNoStart       值1
     * @param batchNoEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoBetween(String batchNoStart,String batchNoEnd){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null && batchNoEnd!=null){
            between("batch_no",batchNoStart,batchNoEnd);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * NOT BETWEEN  entity().getBatchNo() AND 值2
     * @param batchNoStart       值1
     * @param batchNoEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoNotBetween(String batchNoStart,String batchNoEnd){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null && batchNoEnd!=null){
            notBetween("batch_no",batchNoStart,batchNoEnd);
        }
        return this;
     }


    /**
     * <p>任务批次号</p>
     * LIKE '%值%' entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoLike(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            like("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * NOT LIKE '%值%' entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoNotLike(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            notLike("batch_no",batchNo);
        }
        return this;
     }


    /**
     * <p>任务批次号</p>
     * LIKE '%值' entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoLikeLeft(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            likeLeft("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * LIKE '值%' entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoLikeRight(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            likeRight("batch_no",batchNo);
        }
        return this;
     }

/**
     * <p>任务批次号</p>
     * 等于 =
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoEq(String batchNo){
        if(batchNo!=null){
            eq("batch_no",batchNo);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * 不等于 &lt;&gt;
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoNe(String batchNo){
        if(batchNo!=null){
            ne("batch_no",batchNo);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * 大于 &gt;
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoGt(String batchNo){
        if(batchNo!=null){
            gt("batch_no",batchNo);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * 大于等于 &gt;=
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoGe(String batchNo){
        if(batchNo!=null){
            ge("batch_no",batchNo);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * 小于 &lt;
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoLt(String batchNo){
        if(batchNo!=null){
            lt("batch_no",batchNo);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * 小于等于 &lt;=
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoLe(String batchNo){
        if(batchNo!=null){
            le("batch_no",batchNo);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * LIKE '%值%'
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoLike(String batchNo){
        if(batchNo!=null){
            like("batch_no",batchNo);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * NOT LIKE '%值%'
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoNotLike(String batchNo){
        if(batchNo!=null){
            notLike("batch_no",batchNo);
        }
        return this;
    }


    /**
     * <p>任务批次号</p>
     * LIKE '%值'
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoLikeLeft(String batchNo){
        if(batchNo!=null){
            likeLeft("batch_no",batchNo);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * LIKE '值%'
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoLikeRight(String batchNo){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoIsNull(){
        isNull("batch_no");
        return this;
    }

    /**
     * <p>任务批次号</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoIsNotNull(){
        isNotNull("batch_no");
        return this;
    }

    /**
     * <p>任务批次号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoIn(String... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoNotIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper batchNoNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("batch_no",values);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * 等于 = entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdEq(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            eq("tenant_id",tenantId);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * 不等于 &lt;&gt; entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdNe(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            ne("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 大于 &gt; entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdGt(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            gt("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 大于等于 &gt;= entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdGe(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            ge("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 小于 &lt; entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdLt(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            lt("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 小于等于 &lt;= entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdLe(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            le("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * BETWEEN  entity().getTenantId() AND 值2
     * @param tenantIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdBetween(Long tenantIdEnd){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null && tenantIdEnd!=null){
            between("tenant_id",tenantId,tenantIdEnd);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * NOT BETWEEN  entity().getTenantId() AND 值2
     * @param tenantIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdNotBetween(Long tenantIdEnd){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null && tenantIdEnd!=null){
            notBetween("tenant_id",tenantId,tenantIdEnd);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * BETWEEN  entity().getTenantId() AND 值2
     * @param tenantIdStart       值1
     * @param tenantIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdBetween(Long tenantIdStart,Long tenantIdEnd){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null && tenantIdEnd!=null){
            between("tenant_id",tenantIdStart,tenantIdEnd);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * NOT BETWEEN  entity().getTenantId() AND 值2
     * @param tenantIdStart       值1
     * @param tenantIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdNotBetween(Long tenantIdStart,Long tenantIdEnd){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null && tenantIdEnd!=null){
            notBetween("tenant_id",tenantIdStart,tenantIdEnd);
        }
        return this;
     }


    /**
     * <p>商户ID</p>
     * LIKE '%值%' entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdLike(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            like("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * NOT LIKE '%值%' entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdNotLike(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            notLike("tenant_id",tenantId);
        }
        return this;
     }


    /**
     * <p>商户ID</p>
     * LIKE '%值' entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdLikeLeft(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            likeLeft("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * LIKE '值%' entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdLikeRight(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            likeRight("tenant_id",tenantId);
        }
        return this;
     }

/**
     * <p>商户ID</p>
     * 等于 =
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdEq(Long tenantId){
        if(tenantId!=null){
            eq("tenant_id",tenantId);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * 不等于 &lt;&gt;
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdNe(Long tenantId){
        if(tenantId!=null){
            ne("tenant_id",tenantId);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * 大于 &gt;
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdGt(Long tenantId){
        if(tenantId!=null){
            gt("tenant_id",tenantId);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * 大于等于 &gt;=
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdGe(Long tenantId){
        if(tenantId!=null){
            ge("tenant_id",tenantId);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * 小于 &lt;
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdLt(Long tenantId){
        if(tenantId!=null){
            lt("tenant_id",tenantId);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * 小于等于 &lt;=
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdLe(Long tenantId){
        if(tenantId!=null){
            le("tenant_id",tenantId);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * LIKE '%值%'
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdLike(Long tenantId){
        if(tenantId!=null){
            like("tenant_id",tenantId);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * NOT LIKE '%值%'
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdNotLike(Long tenantId){
        if(tenantId!=null){
            notLike("tenant_id",tenantId);
        }
        return this;
    }


    /**
     * <p>商户ID</p>
     * LIKE '%值'
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdLikeLeft(Long tenantId){
        if(tenantId!=null){
            likeLeft("tenant_id",tenantId);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * LIKE '值%'
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdLikeRight(Long tenantId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdIsNull(){
        isNull("tenant_id");
        return this;
    }

    /**
     * <p>商户ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdIsNotNull(){
        isNotNull("tenant_id");
        return this;
    }

    /**
     * <p>商户ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdIn(Long... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdNotIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("tenant_id",values);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * 等于 = entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameEq(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            eq("tenant_name",tenantName);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * 不等于 &lt;&gt; entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameNe(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            ne("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 大于 &gt; entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameGt(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            gt("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 大于等于 &gt;= entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameGe(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            ge("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 小于 &lt; entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameLt(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            lt("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 小于等于 &lt;= entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameLe(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            le("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * BETWEEN  entity().getTenantName() AND 值2
     * @param tenantNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameBetween(String tenantNameEnd){
        String tenantName =entity().getTenantName();
        if(tenantName!=null && tenantNameEnd!=null){
            between("tenant_name",tenantName,tenantNameEnd);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * NOT BETWEEN  entity().getTenantName() AND 值2
     * @param tenantNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameNotBetween(String tenantNameEnd){
        String tenantName =entity().getTenantName();
        if(tenantName!=null && tenantNameEnd!=null){
            notBetween("tenant_name",tenantName,tenantNameEnd);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * BETWEEN  entity().getTenantName() AND 值2
     * @param tenantNameStart       值1
     * @param tenantNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameBetween(String tenantNameStart,String tenantNameEnd){
        String tenantName =entity().getTenantName();
        if(tenantName!=null && tenantNameEnd!=null){
            between("tenant_name",tenantNameStart,tenantNameEnd);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * NOT BETWEEN  entity().getTenantName() AND 值2
     * @param tenantNameStart       值1
     * @param tenantNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameNotBetween(String tenantNameStart,String tenantNameEnd){
        String tenantName =entity().getTenantName();
        if(tenantName!=null && tenantNameEnd!=null){
            notBetween("tenant_name",tenantNameStart,tenantNameEnd);
        }
        return this;
     }


    /**
     * <p>商户名称</p>
     * LIKE '%值%' entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameLike(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            like("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * NOT LIKE '%值%' entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameNotLike(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            notLike("tenant_name",tenantName);
        }
        return this;
     }


    /**
     * <p>商户名称</p>
     * LIKE '%值' entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameLikeLeft(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            likeLeft("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * LIKE '值%' entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameLikeRight(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            likeRight("tenant_name",tenantName);
        }
        return this;
     }

/**
     * <p>商户名称</p>
     * 等于 =
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameEq(String tenantName){
        if(tenantName!=null){
            eq("tenant_name",tenantName);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * 不等于 &lt;&gt;
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameNe(String tenantName){
        if(tenantName!=null){
            ne("tenant_name",tenantName);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * 大于 &gt;
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameGt(String tenantName){
        if(tenantName!=null){
            gt("tenant_name",tenantName);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * 大于等于 &gt;=
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameGe(String tenantName){
        if(tenantName!=null){
            ge("tenant_name",tenantName);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * 小于 &lt;
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameLt(String tenantName){
        if(tenantName!=null){
            lt("tenant_name",tenantName);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * 小于等于 &lt;=
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameLe(String tenantName){
        if(tenantName!=null){
            le("tenant_name",tenantName);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * LIKE '%值%'
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameLike(String tenantName){
        if(tenantName!=null){
            like("tenant_name",tenantName);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * NOT LIKE '%值%'
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameNotLike(String tenantName){
        if(tenantName!=null){
            notLike("tenant_name",tenantName);
        }
        return this;
    }


    /**
     * <p>商户名称</p>
     * LIKE '%值'
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameLikeLeft(String tenantName){
        if(tenantName!=null){
            likeLeft("tenant_name",tenantName);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * LIKE '值%'
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameLikeRight(String tenantName){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameIsNull(){
        isNull("tenant_name");
        return this;
    }

    /**
     * <p>商户名称</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameIsNotNull(){
        isNotNull("tenant_name");
        return this;
    }

    /**
     * <p>商户名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameIn(String... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameNotIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper tenantNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("tenant_name",values);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 等于 = entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrEq(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            eq("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 不等于 &lt;&gt; entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrNe(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            ne("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 大于 &gt; entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrGt(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            gt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 大于等于 &gt;= entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrGe(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            ge("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 小于 &lt; entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrLt(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            lt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 小于等于 &lt;= entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrLe(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            le("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrBetween(String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            between("external_addr",externalAddr,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrNotBetween(String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            notBetween("external_addr",externalAddr,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrBetween(String externalAddrStart,String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            between("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrNotBetween(String externalAddrStart,String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            notBetween("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }


    /**
     * <p>内网ip地址</p>
     * LIKE '%值%' entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrLike(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            like("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT LIKE '%值%' entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrNotLike(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            notLike("external_addr",externalAddr);
        }
        return this;
     }


    /**
     * <p>内网ip地址</p>
     * LIKE '%值' entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrLikeLeft(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            likeLeft("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * LIKE '值%' entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrLikeRight(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            likeRight("external_addr",externalAddr);
        }
        return this;
     }

/**
     * <p>内网ip地址</p>
     * 等于 =
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrEq(String externalAddr){
        if(externalAddr!=null){
            eq("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 不等于 &lt;&gt;
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrNe(String externalAddr){
        if(externalAddr!=null){
            ne("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 大于 &gt;
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrGt(String externalAddr){
        if(externalAddr!=null){
            gt("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 大于等于 &gt;=
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrGe(String externalAddr){
        if(externalAddr!=null){
            ge("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 小于 &lt;
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrLt(String externalAddr){
        if(externalAddr!=null){
            lt("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 小于等于 &lt;=
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrLe(String externalAddr){
        if(externalAddr!=null){
            le("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * LIKE '%值%'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrLike(String externalAddr){
        if(externalAddr!=null){
            like("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * NOT LIKE '%值%'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrNotLike(String externalAddr){
        if(externalAddr!=null){
            notLike("external_addr",externalAddr);
        }
        return this;
    }


    /**
     * <p>内网ip地址</p>
     * LIKE '%值'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrLikeLeft(String externalAddr){
        if(externalAddr!=null){
            likeLeft("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * LIKE '值%'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrLikeRight(String externalAddr){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrIsNull(){
        isNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrIsNotNull(){
        isNotNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrIn(String... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrNotIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper externalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("external_addr",values);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 等于 = entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrEq(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            eq("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 不等于 &lt;&gt; entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrNe(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            ne("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 大于 &gt; entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrGt(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            gt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 大于等于 &gt;= entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrGe(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            ge("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 小于 &lt; entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrLt(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            lt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 小于等于 &lt;= entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrLe(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            le("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrBetween(String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            between("internal_addr",internalAddr,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrNotBetween(String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            notBetween("internal_addr",internalAddr,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrBetween(String internalAddrStart,String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            between("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrNotBetween(String internalAddrStart,String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            notBetween("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }


    /**
     * <p>外网ip地址</p>
     * LIKE '%值%' entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrLike(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            like("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT LIKE '%值%' entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrNotLike(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            notLike("internal_addr",internalAddr);
        }
        return this;
     }


    /**
     * <p>外网ip地址</p>
     * LIKE '%值' entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrLikeLeft(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            likeLeft("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * LIKE '值%' entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrLikeRight(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            likeRight("internal_addr",internalAddr);
        }
        return this;
     }

/**
     * <p>外网ip地址</p>
     * 等于 =
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrEq(String internalAddr){
        if(internalAddr!=null){
            eq("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 不等于 &lt;&gt;
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrNe(String internalAddr){
        if(internalAddr!=null){
            ne("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 大于 &gt;
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrGt(String internalAddr){
        if(internalAddr!=null){
            gt("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 大于等于 &gt;=
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrGe(String internalAddr){
        if(internalAddr!=null){
            ge("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 小于 &lt;
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrLt(String internalAddr){
        if(internalAddr!=null){
            lt("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 小于等于 &lt;=
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrLe(String internalAddr){
        if(internalAddr!=null){
            le("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * LIKE '%值%'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrLike(String internalAddr){
        if(internalAddr!=null){
            like("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * NOT LIKE '%值%'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrNotLike(String internalAddr){
        if(internalAddr!=null){
            notLike("internal_addr",internalAddr);
        }
        return this;
    }


    /**
     * <p>外网ip地址</p>
     * LIKE '%值'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrLikeLeft(String internalAddr){
        if(internalAddr!=null){
            likeLeft("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * LIKE '值%'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrLikeRight(String internalAddr){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrIsNull(){
        isNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrIsNotNull(){
        isNotNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrIn(String... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrNotIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper internalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("internal_addr",values);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * 等于 = entity().getFkMcMachineId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdEq(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdNe(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdGt(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdGe(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdLt(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdLe(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdEnd){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdEnd){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdLike(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdNotLike(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdLikeLeft(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdLikeRight(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdEq(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdNe(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdGt(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdGe(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdLt(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdLe(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdLike(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdIn(Long... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdNotIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkMcMachineIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_machine_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdEq(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdNe(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdGt(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdGe(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdLt(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdLe(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdLike(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdNotLike(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdLikeLeft(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdLikeRight(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdEq(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdNe(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdGt(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdGe(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdLt(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdLe(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdLike(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdNotLike(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdIn(String... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 等于 = entity().getInstanceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdEq(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 不等于 &lt;&gt; entity().getInstanceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdNe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于 &gt; entity().getInstanceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdGt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于等于 &gt;= entity().getInstanceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdGe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于 &lt; entity().getInstanceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdLt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于等于 &lt;= entity().getInstanceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdLe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",instanceId,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdNotBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceId,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值%' entity().getInstanceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT LIKE '%值%' entity().getInstanceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdNotLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值' entity().getInstanceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdLikeLeft(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * LIKE '值%' entity().getInstanceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdLikeRight(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

/**
     * <p>实例Id</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 不等于 &lt;&gt;
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 大于 &gt;
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 大于等于 &gt;=
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 小于 &lt;
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 小于等于 &lt;=
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * NOT LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
    }


    /**
     * <p>实例Id</p>
     * LIKE '%值'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * LIKE '值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdLikeRight(String instanceId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdIn(String... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdNotIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 等于 = entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusEq(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            eq("assign_status",assignStatus);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 不等于 &lt;&gt; entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusNe(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            ne("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 大于 &gt; entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusGt(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            gt("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 大于等于 &gt;= entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusGe(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            ge("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 小于 &lt; entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusLt(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            lt("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 小于等于 &lt;= entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusLe(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            le("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * BETWEEN  entity().getAssignStatus() AND 值2
     * @param assignStatusEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusBetween(Integer assignStatusEnd){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null && assignStatusEnd!=null){
            between("assign_status",assignStatus,assignStatusEnd);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * NOT BETWEEN  entity().getAssignStatus() AND 值2
     * @param assignStatusEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusNotBetween(Integer assignStatusEnd){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null && assignStatusEnd!=null){
            notBetween("assign_status",assignStatus,assignStatusEnd);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * BETWEEN  entity().getAssignStatus() AND 值2
     * @param assignStatusStart       值1
     * @param assignStatusEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusBetween(Integer assignStatusStart,Integer assignStatusEnd){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null && assignStatusEnd!=null){
            between("assign_status",assignStatusStart,assignStatusEnd);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * NOT BETWEEN  entity().getAssignStatus() AND 值2
     * @param assignStatusStart       值1
     * @param assignStatusEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusNotBetween(Integer assignStatusStart,Integer assignStatusEnd){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null && assignStatusEnd!=null){
            notBetween("assign_status",assignStatusStart,assignStatusEnd);
        }
        return this;
     }


    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * LIKE '%值%' entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusLike(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            like("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * NOT LIKE '%值%' entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusNotLike(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            notLike("assign_status",assignStatus);
        }
        return this;
     }


    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * LIKE '%值' entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusLikeLeft(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            likeLeft("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * LIKE '值%' entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusLikeRight(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            likeRight("assign_status",assignStatus);
        }
        return this;
     }

/**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 等于 =
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusEq(Integer assignStatus){
        if(assignStatus!=null){
            eq("assign_status",assignStatus);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 不等于 &lt;&gt;
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusNe(Integer assignStatus){
        if(assignStatus!=null){
            ne("assign_status",assignStatus);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 大于 &gt;
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusGt(Integer assignStatus){
        if(assignStatus!=null){
            gt("assign_status",assignStatus);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 大于等于 &gt;=
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusGe(Integer assignStatus){
        if(assignStatus!=null){
            ge("assign_status",assignStatus);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 小于 &lt;
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusLt(Integer assignStatus){
        if(assignStatus!=null){
            lt("assign_status",assignStatus);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 小于等于 &lt;=
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusLe(Integer assignStatus){
        if(assignStatus!=null){
            le("assign_status",assignStatus);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * LIKE '%值%'
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusLike(Integer assignStatus){
        if(assignStatus!=null){
            like("assign_status",assignStatus);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * NOT LIKE '%值%'
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusNotLike(Integer assignStatus){
        if(assignStatus!=null){
            notLike("assign_status",assignStatus);
        }
        return this;
    }


    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * LIKE '%值'
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusLikeLeft(Integer assignStatus){
        if(assignStatus!=null){
            likeLeft("assign_status",assignStatus);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * LIKE '值%'
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusLikeRight(Integer assignStatus){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusIsNull(){
        isNull("assign_status");
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusIsNotNull(){
        isNotNull("assign_status");
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusIn(Collection<Integer> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusIn(Integer... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusNotIn(Collection<Integer> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper assignStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("assign_status",values);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * 等于 = entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdEq(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            eq("operate_user_id",operateUserId);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * 不等于 &lt;&gt; entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdNe(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            ne("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 大于 &gt; entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdGt(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            gt("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 大于等于 &gt;= entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdGe(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            ge("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 小于 &lt; entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdLt(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            lt("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 小于等于 &lt;= entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdLe(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            le("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * BETWEEN  entity().getOperateUserId() AND 值2
     * @param operateUserIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdBetween(Long operateUserIdEnd){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null && operateUserIdEnd!=null){
            between("operate_user_id",operateUserId,operateUserIdEnd);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * NOT BETWEEN  entity().getOperateUserId() AND 值2
     * @param operateUserIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdNotBetween(Long operateUserIdEnd){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null && operateUserIdEnd!=null){
            notBetween("operate_user_id",operateUserId,operateUserIdEnd);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * BETWEEN  entity().getOperateUserId() AND 值2
     * @param operateUserIdStart       值1
     * @param operateUserIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdBetween(Long operateUserIdStart,Long operateUserIdEnd){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null && operateUserIdEnd!=null){
            between("operate_user_id",operateUserIdStart,operateUserIdEnd);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * NOT BETWEEN  entity().getOperateUserId() AND 值2
     * @param operateUserIdStart       值1
     * @param operateUserIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdNotBetween(Long operateUserIdStart,Long operateUserIdEnd){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null && operateUserIdEnd!=null){
            notBetween("operate_user_id",operateUserIdStart,operateUserIdEnd);
        }
        return this;
     }


    /**
     * <p>操作人用户ID</p>
     * LIKE '%值%' entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdLike(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            like("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * NOT LIKE '%值%' entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdNotLike(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            notLike("operate_user_id",operateUserId);
        }
        return this;
     }


    /**
     * <p>操作人用户ID</p>
     * LIKE '%值' entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdLikeLeft(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            likeLeft("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * LIKE '值%' entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdLikeRight(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            likeRight("operate_user_id",operateUserId);
        }
        return this;
     }

/**
     * <p>操作人用户ID</p>
     * 等于 =
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdEq(Long operateUserId){
        if(operateUserId!=null){
            eq("operate_user_id",operateUserId);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * 不等于 &lt;&gt;
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdNe(Long operateUserId){
        if(operateUserId!=null){
            ne("operate_user_id",operateUserId);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * 大于 &gt;
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdGt(Long operateUserId){
        if(operateUserId!=null){
            gt("operate_user_id",operateUserId);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * 大于等于 &gt;=
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdGe(Long operateUserId){
        if(operateUserId!=null){
            ge("operate_user_id",operateUserId);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * 小于 &lt;
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdLt(Long operateUserId){
        if(operateUserId!=null){
            lt("operate_user_id",operateUserId);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * 小于等于 &lt;=
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdLe(Long operateUserId){
        if(operateUserId!=null){
            le("operate_user_id",operateUserId);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * LIKE '%值%'
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdLike(Long operateUserId){
        if(operateUserId!=null){
            like("operate_user_id",operateUserId);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * NOT LIKE '%值%'
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdNotLike(Long operateUserId){
        if(operateUserId!=null){
            notLike("operate_user_id",operateUserId);
        }
        return this;
    }


    /**
     * <p>操作人用户ID</p>
     * LIKE '%值'
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdLikeLeft(Long operateUserId){
        if(operateUserId!=null){
            likeLeft("operate_user_id",operateUserId);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * LIKE '值%'
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdLikeRight(Long operateUserId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdIsNull(){
        isNull("operate_user_id");
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdIsNotNull(){
        isNotNull("operate_user_id");
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdIn(Long... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdNotIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper operateUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("operate_user_id",values);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 等于 = entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeEq(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            eq("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 不等于 &lt;&gt; entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeNe(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            ne("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于 &gt; entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeGt(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            gt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于等于 &gt;= entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeGe(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            ge("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于 &lt; entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeLt(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            lt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于等于 &lt;= entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeLe(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            le("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * BETWEEN  entity().getValidStartTime() AND 值2
     * @param validStartTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeBetween(Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            between("valid_start_time",validStartTime,validStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT BETWEEN  entity().getValidStartTime() AND 值2
     * @param validStartTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeNotBetween(Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            notBetween("valid_start_time",validStartTime,validStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * BETWEEN  entity().getValidStartTime() AND 值2
     * @param validStartTimeStart       值1
     * @param validStartTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeBetween(Date validStartTimeStart,Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            between("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT BETWEEN  entity().getValidStartTime() AND 值2
     * @param validStartTimeStart       值1
     * @param validStartTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeNotBetween(Date validStartTimeStart,Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            notBetween("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值%' entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeLike(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            like("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT LIKE '%值%' entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeNotLike(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            notLike("valid_start_time",validStartTime);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值' entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeLikeLeft(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            likeLeft("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '值%' entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeLikeRight(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            likeRight("valid_start_time",validStartTime);
        }
        return this;
     }

/**
     * <p>使用有效期开始时间</p>
     * 等于 =
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeEq(Date validStartTime){
        if(validStartTime!=null){
            eq("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 不等于 &lt;&gt;
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeNe(Date validStartTime){
        if(validStartTime!=null){
            ne("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 大于 &gt;
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeGt(Date validStartTime){
        if(validStartTime!=null){
            gt("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 大于等于 &gt;=
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeGe(Date validStartTime){
        if(validStartTime!=null){
            ge("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 小于 &lt;
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeLt(Date validStartTime){
        if(validStartTime!=null){
            lt("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 小于等于 &lt;=
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeLe(Date validStartTime){
        if(validStartTime!=null){
            le("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值%'
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeLike(Date validStartTime){
        if(validStartTime!=null){
            like("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * NOT LIKE '%值%'
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeNotLike(Date validStartTime){
        if(validStartTime!=null){
            notLike("valid_start_time",validStartTime);
        }
        return this;
    }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值'
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeLikeLeft(Date validStartTime){
        if(validStartTime!=null){
            likeLeft("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '值%'
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeLikeRight(Date validStartTime){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeIsNull(){
        isNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeIsNotNull(){
        isNotNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeIn(Collection<Date> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeIn(Date... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeNotIn(Collection<Date> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_start_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 等于 = entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeEq(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            eq("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 不等于 &lt;&gt; entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeNe(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            ne("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于 &gt; entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeGt(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            gt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于等于 &gt;= entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeGe(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            ge("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于 &lt; entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeLt(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            lt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于等于 &lt;= entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeLe(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            le("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * BETWEEN  entity().getValidEndTime() AND 值2
     * @param validEndTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeBetween(Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            between("valid_end_time",validEndTime,validEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT BETWEEN  entity().getValidEndTime() AND 值2
     * @param validEndTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeNotBetween(Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            notBetween("valid_end_time",validEndTime,validEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * BETWEEN  entity().getValidEndTime() AND 值2
     * @param validEndTimeStart       值1
     * @param validEndTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeBetween(Date validEndTimeStart,Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            between("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT BETWEEN  entity().getValidEndTime() AND 值2
     * @param validEndTimeStart       值1
     * @param validEndTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeNotBetween(Date validEndTimeStart,Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            notBetween("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值%' entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeLike(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            like("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT LIKE '%值%' entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeNotLike(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            notLike("valid_end_time",validEndTime);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值' entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeLikeLeft(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            likeLeft("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '值%' entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeLikeRight(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            likeRight("valid_end_time",validEndTime);
        }
        return this;
     }

/**
     * <p>使用有效期结束时间</p>
     * 等于 =
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeEq(Date validEndTime){
        if(validEndTime!=null){
            eq("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 不等于 &lt;&gt;
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeNe(Date validEndTime){
        if(validEndTime!=null){
            ne("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 大于 &gt;
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeGt(Date validEndTime){
        if(validEndTime!=null){
            gt("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 大于等于 &gt;=
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeGe(Date validEndTime){
        if(validEndTime!=null){
            ge("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 小于 &lt;
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeLt(Date validEndTime){
        if(validEndTime!=null){
            lt("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 小于等于 &lt;=
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeLe(Date validEndTime){
        if(validEndTime!=null){
            le("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值%'
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeLike(Date validEndTime){
        if(validEndTime!=null){
            like("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * NOT LIKE '%值%'
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeNotLike(Date validEndTime){
        if(validEndTime!=null){
            notLike("valid_end_time",validEndTime);
        }
        return this;
    }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值'
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeLikeLeft(Date validEndTime){
        if(validEndTime!=null){
            likeLeft("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '值%'
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeLikeRight(Date validEndTime){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeIsNull(){
        isNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeIsNotNull(){
        isNotNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeIn(Collection<Date> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeIn(Date... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeNotIn(Collection<Date> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper validEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_end_time",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdEq(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 不等于 &lt;&gt; entity().getVersionId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdNe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于 &gt; entity().getVersionId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdGt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于等于 &gt;= entity().getVersionId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdGe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于 &lt; entity().getVersionId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdLt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于等于 &lt;= entity().getVersionId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdNotBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值' entity().getVersionId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * LIKE '值%' entity().getVersionId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdLikeRight(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

/**
     * <p>版本id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 不等于 &lt;&gt;
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 大于 &gt;
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 大于等于 &gt;=
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 小于 &lt;
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 小于等于 &lt;=
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * NOT LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
    }


    /**
     * <p>版本id</p>
     * LIKE '%值'
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * LIKE '值%'
     * @param versionId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdLikeRight(Long versionId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdIn(Long... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper versionIdNotIn(Long... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeEq(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeNe(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeGt(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeGe(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeLt(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeLe(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeLike(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeNotLike(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeLikeLeft(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeLikeRight(){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeEq(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeNe(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeGt(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeGe(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeLt(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeLe(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeLike(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeIn(Date... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * 等于 = entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonEq(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            eq("create_person",createPerson);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * 不等于 &lt;&gt; entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonNe(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            ne("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 大于 &gt; entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonGt(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            gt("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 大于等于 &gt;= entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonGe(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            ge("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 小于 &lt; entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonLt(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            lt("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 小于等于 &lt;= entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonLe(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            le("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * BETWEEN  entity().getCreatePerson() AND 值2
     * @param createPersonEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonBetween(String createPersonEnd){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null && createPersonEnd!=null){
            between("create_person",createPerson,createPersonEnd);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * NOT BETWEEN  entity().getCreatePerson() AND 值2
     * @param createPersonEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonNotBetween(String createPersonEnd){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null && createPersonEnd!=null){
            notBetween("create_person",createPerson,createPersonEnd);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * BETWEEN  entity().getCreatePerson() AND 值2
     * @param createPersonStart       值1
     * @param createPersonEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonBetween(String createPersonStart,String createPersonEnd){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null && createPersonEnd!=null){
            between("create_person",createPersonStart,createPersonEnd);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * NOT BETWEEN  entity().getCreatePerson() AND 值2
     * @param createPersonStart       值1
     * @param createPersonEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonNotBetween(String createPersonStart,String createPersonEnd){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null && createPersonEnd!=null){
            notBetween("create_person",createPersonStart,createPersonEnd);
        }
        return this;
     }


    /**
     * <p>创建人</p>
     * LIKE '%值%' entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonLike(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            like("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * NOT LIKE '%值%' entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonNotLike(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            notLike("create_person",createPerson);
        }
        return this;
     }


    /**
     * <p>创建人</p>
     * LIKE '%值' entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonLikeLeft(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            likeLeft("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * LIKE '值%' entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonLikeRight(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            likeRight("create_person",createPerson);
        }
        return this;
     }

/**
     * <p>创建人</p>
     * 等于 =
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonEq(String createPerson){
        if(createPerson!=null){
            eq("create_person",createPerson);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * 不等于 &lt;&gt;
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonNe(String createPerson){
        if(createPerson!=null){
            ne("create_person",createPerson);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * 大于 &gt;
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonGt(String createPerson){
        if(createPerson!=null){
            gt("create_person",createPerson);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * 大于等于 &gt;=
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonGe(String createPerson){
        if(createPerson!=null){
            ge("create_person",createPerson);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * 小于 &lt;
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonLt(String createPerson){
        if(createPerson!=null){
            lt("create_person",createPerson);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * 小于等于 &lt;=
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonLe(String createPerson){
        if(createPerson!=null){
            le("create_person",createPerson);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * LIKE '%值%'
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonLike(String createPerson){
        if(createPerson!=null){
            like("create_person",createPerson);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * NOT LIKE '%值%'
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonNotLike(String createPerson){
        if(createPerson!=null){
            notLike("create_person",createPerson);
        }
        return this;
    }


    /**
     * <p>创建人</p>
     * LIKE '%值'
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonLikeLeft(String createPerson){
        if(createPerson!=null){
            likeLeft("create_person",createPerson);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * LIKE '值%'
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonLikeRight(String createPerson){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonIsNull(){
        isNull("create_person");
        return this;
    }

    /**
     * <p>创建人</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonIsNotNull(){
        isNotNull("create_person");
        return this;
    }

    /**
     * <p>创建人</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonIn(String... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonNotIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper createPersonNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("create_person",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 = entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeEq(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            eq("update_time",updateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt; entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeNe(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            ne("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeGt(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            gt("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeGe(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            ge("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeLt(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            lt("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeLe(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            le("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getUpdateTime() AND 值2
     * @param updateTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeBetween(Date updateTimeEnd){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null && updateTimeEnd!=null){
            between("update_time",updateTime,updateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getUpdateTime() AND 值2
     * @param updateTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeNotBetween(Date updateTimeEnd){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null && updateTimeEnd!=null){
            notBetween("update_time",updateTime,updateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getUpdateTime() AND 值2
     * @param updateTimeStart       值1
     * @param updateTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeBetween(Date updateTimeStart,Date updateTimeEnd){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null && updateTimeEnd!=null){
            between("update_time",updateTimeStart,updateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getUpdateTime() AND 值2
     * @param updateTimeStart       值1
     * @param updateTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeNotBetween(Date updateTimeStart,Date updateTimeEnd){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null && updateTimeEnd!=null){
            notBetween("update_time",updateTimeStart,updateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%' entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeLike(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            like("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%' entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeNotLike(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            notLike("update_time",updateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值' entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeLikeLeft(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            likeLeft("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%' entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeLikeRight(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            likeRight("update_time",updateTime);
        }
        return this;
     }

/**
     * <p>最后修改时间</p>
     * 等于 =
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeEq(Date updateTime){
        if(updateTime!=null){
            eq("update_time",updateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt;
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeNe(Date updateTime){
        if(updateTime!=null){
            ne("update_time",updateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt;
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeGt(Date updateTime){
        if(updateTime!=null){
            gt("update_time",updateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;=
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeGe(Date updateTime){
        if(updateTime!=null){
            ge("update_time",updateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt;
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeLt(Date updateTime){
        if(updateTime!=null){
            lt("update_time",updateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;=
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeLe(Date updateTime){
        if(updateTime!=null){
            le("update_time",updateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeLike(Date updateTime){
        if(updateTime!=null){
            like("update_time",updateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%'
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeNotLike(Date updateTime){
        if(updateTime!=null){
            notLike("update_time",updateTime);
        }
        return this;
    }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值'
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeLikeLeft(Date updateTime){
        if(updateTime!=null){
            likeLeft("update_time",updateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%'
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeLikeRight(Date updateTime){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeIsNull(){
        isNull("update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeIsNotNull(){
        isNotNull("update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeIn(Collection<Date> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeIn(Date... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeNotIn(Collection<Date> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper updateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("update_time",values);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * 等于 = entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drEq(){
        Integer dr =entity().getDr();
        if(dr!=null){
            eq("dr",dr);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * 不等于 &lt;&gt; entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drNe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            ne("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 大于 &gt; entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drGt(){
        Integer dr =entity().getDr();
        if(dr!=null){
            gt("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 大于等于 &gt;= entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drGe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            ge("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 小于 &lt; entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drLt(){
        Integer dr =entity().getDr();
        if(dr!=null){
            lt("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 小于等于 &lt;= entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drLe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            le("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * BETWEEN  entity().getDr() AND 值2
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drBetween(Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            between("dr",dr,drEnd);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * NOT BETWEEN  entity().getDr() AND 值2
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drNotBetween(Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            notBetween("dr",dr,drEnd);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * BETWEEN  entity().getDr() AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drBetween(Integer drStart,Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            between("dr",drStart,drEnd);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * NOT BETWEEN  entity().getDr() AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drNotBetween(Integer drStart,Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            notBetween("dr",drStart,drEnd);
        }
        return this;
     }


    /**
     * <p>是否删除</p>
     * LIKE '%值%' entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drLike(){
        Integer dr =entity().getDr();
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * NOT LIKE '%值%' entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drNotLike(){
        Integer dr =entity().getDr();
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>是否删除</p>
     * LIKE '%值' entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drLikeLeft(){
        Integer dr =entity().getDr();
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * LIKE '值%' entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drLikeRight(){
        Integer dr =entity().getDr();
        if(dr!=null){
            likeRight("dr",dr);
        }
        return this;
     }

/**
     * <p>是否删除</p>
     * 等于 =
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drEq(Integer dr){
        if(dr!=null){
            eq("dr",dr);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * 不等于 &lt;&gt;
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drNe(Integer dr){
        if(dr!=null){
            ne("dr",dr);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * 大于 &gt;
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drGt(Integer dr){
        if(dr!=null){
            gt("dr",dr);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * 大于等于 &gt;=
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drGe(Integer dr){
        if(dr!=null){
            ge("dr",dr);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * 小于 &lt;
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drLt(Integer dr){
        if(dr!=null){
            lt("dr",dr);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * 小于等于 &lt;=
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drLe(Integer dr){
        if(dr!=null){
            le("dr",dr);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * LIKE '%值%'
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drLike(Integer dr){
        if(dr!=null){
            like("dr",dr);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * NOT LIKE '%值%'
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drNotLike(Integer dr){
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
    }


    /**
     * <p>是否删除</p>
     * LIKE '%值'
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drLikeLeft(Integer dr){
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * LIKE '值%'
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drLikeRight(Integer dr){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>是否删除</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>是否删除</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drIn(Collection<Integer> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drIn(Integer... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drNotIn(Collection<Integer> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper drNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dr",values);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * 等于 = entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgEq(){
        String msg =entity().getMsg();
        if(msg!=null){
            eq("msg",msg);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * 不等于 &lt;&gt; entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgNe(){
        String msg =entity().getMsg();
        if(msg!=null){
            ne("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 大于 &gt; entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgGt(){
        String msg =entity().getMsg();
        if(msg!=null){
            gt("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 大于等于 &gt;= entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgGe(){
        String msg =entity().getMsg();
        if(msg!=null){
            ge("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 小于 &lt; entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgLt(){
        String msg =entity().getMsg();
        if(msg!=null){
            lt("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 小于等于 &lt;= entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgLe(){
        String msg =entity().getMsg();
        if(msg!=null){
            le("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * BETWEEN  entity().getMsg() AND 值2
     * @param msgEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgBetween(String msgEnd){
        String msg =entity().getMsg();
        if(msg!=null && msgEnd!=null){
            between("msg",msg,msgEnd);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * NOT BETWEEN  entity().getMsg() AND 值2
     * @param msgEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgNotBetween(String msgEnd){
        String msg =entity().getMsg();
        if(msg!=null && msgEnd!=null){
            notBetween("msg",msg,msgEnd);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * BETWEEN  entity().getMsg() AND 值2
     * @param msgStart       值1
     * @param msgEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgBetween(String msgStart,String msgEnd){
        String msg =entity().getMsg();
        if(msg!=null && msgEnd!=null){
            between("msg",msgStart,msgEnd);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * NOT BETWEEN  entity().getMsg() AND 值2
     * @param msgStart       值1
     * @param msgEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgNotBetween(String msgStart,String msgEnd){
        String msg =entity().getMsg();
        if(msg!=null && msgEnd!=null){
            notBetween("msg",msgStart,msgEnd);
        }
        return this;
     }


    /**
     * <p>执行结果</p>
     * LIKE '%值%' entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgLike(){
        String msg =entity().getMsg();
        if(msg!=null){
            like("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * NOT LIKE '%值%' entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgNotLike(){
        String msg =entity().getMsg();
        if(msg!=null){
            notLike("msg",msg);
        }
        return this;
     }


    /**
     * <p>执行结果</p>
     * LIKE '%值' entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgLikeLeft(){
        String msg =entity().getMsg();
        if(msg!=null){
            likeLeft("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * LIKE '值%' entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgLikeRight(){
        String msg =entity().getMsg();
        if(msg!=null){
            likeRight("msg",msg);
        }
        return this;
     }

/**
     * <p>执行结果</p>
     * 等于 =
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgEq(String msg){
        if(msg!=null){
            eq("msg",msg);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * 不等于 &lt;&gt;
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgNe(String msg){
        if(msg!=null){
            ne("msg",msg);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * 大于 &gt;
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgGt(String msg){
        if(msg!=null){
            gt("msg",msg);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * 大于等于 &gt;=
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgGe(String msg){
        if(msg!=null){
            ge("msg",msg);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * 小于 &lt;
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgLt(String msg){
        if(msg!=null){
            lt("msg",msg);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * 小于等于 &lt;=
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgLe(String msg){
        if(msg!=null){
            le("msg",msg);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * LIKE '%值%'
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgLike(String msg){
        if(msg!=null){
            like("msg",msg);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * NOT LIKE '%值%'
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgNotLike(String msg){
        if(msg!=null){
            notLike("msg",msg);
        }
        return this;
    }


    /**
     * <p>执行结果</p>
     * LIKE '%值'
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgLikeLeft(String msg){
        if(msg!=null){
            likeLeft("msg",msg);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * LIKE '值%'
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgLikeRight(String msg){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgIsNull(){
        isNull("msg");
        return this;
    }

    /**
     * <p>执行结果</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgIsNotNull(){
        isNotNull("msg");
        return this;
    }

    /**
     * <p>执行结果</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgIn(String... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgNotIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper msgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("msg",values);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * 等于 = entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdEq(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            eq("app_license_id",appLicenseId);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * 不等于 &lt;&gt; entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdNe(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            ne("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 大于 &gt; entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdGt(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            gt("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 大于等于 &gt;= entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdGe(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            ge("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 小于 &lt; entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdLt(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            lt("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 小于等于 &lt;= entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdLe(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            le("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * BETWEEN  entity().getAppLicenseId() AND 值2
     * @param appLicenseIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdBetween(Long appLicenseIdEnd){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null && appLicenseIdEnd!=null){
            between("app_license_id",appLicenseId,appLicenseIdEnd);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * NOT BETWEEN  entity().getAppLicenseId() AND 值2
     * @param appLicenseIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdNotBetween(Long appLicenseIdEnd){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null && appLicenseIdEnd!=null){
            notBetween("app_license_id",appLicenseId,appLicenseIdEnd);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * BETWEEN  entity().getAppLicenseId() AND 值2
     * @param appLicenseIdStart       值1
     * @param appLicenseIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdBetween(Long appLicenseIdStart,Long appLicenseIdEnd){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null && appLicenseIdEnd!=null){
            between("app_license_id",appLicenseIdStart,appLicenseIdEnd);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * NOT BETWEEN  entity().getAppLicenseId() AND 值2
     * @param appLicenseIdStart       值1
     * @param appLicenseIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdNotBetween(Long appLicenseIdStart,Long appLicenseIdEnd){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null && appLicenseIdEnd!=null){
            notBetween("app_license_id",appLicenseIdStart,appLicenseIdEnd);
        }
        return this;
     }


    /**
     * <p>app许可证id</p>
     * LIKE '%值%' entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdLike(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            like("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * NOT LIKE '%值%' entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdNotLike(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            notLike("app_license_id",appLicenseId);
        }
        return this;
     }


    /**
     * <p>app许可证id</p>
     * LIKE '%值' entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdLikeLeft(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            likeLeft("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * LIKE '值%' entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdLikeRight(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            likeRight("app_license_id",appLicenseId);
        }
        return this;
     }

/**
     * <p>app许可证id</p>
     * 等于 =
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdEq(Long appLicenseId){
        if(appLicenseId!=null){
            eq("app_license_id",appLicenseId);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * 不等于 &lt;&gt;
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdNe(Long appLicenseId){
        if(appLicenseId!=null){
            ne("app_license_id",appLicenseId);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * 大于 &gt;
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdGt(Long appLicenseId){
        if(appLicenseId!=null){
            gt("app_license_id",appLicenseId);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * 大于等于 &gt;=
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdGe(Long appLicenseId){
        if(appLicenseId!=null){
            ge("app_license_id",appLicenseId);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * 小于 &lt;
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdLt(Long appLicenseId){
        if(appLicenseId!=null){
            lt("app_license_id",appLicenseId);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * 小于等于 &lt;=
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdLe(Long appLicenseId){
        if(appLicenseId!=null){
            le("app_license_id",appLicenseId);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * LIKE '%值%'
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdLike(Long appLicenseId){
        if(appLicenseId!=null){
            like("app_license_id",appLicenseId);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * NOT LIKE '%值%'
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdNotLike(Long appLicenseId){
        if(appLicenseId!=null){
            notLike("app_license_id",appLicenseId);
        }
        return this;
    }


    /**
     * <p>app许可证id</p>
     * LIKE '%值'
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdLikeLeft(Long appLicenseId){
        if(appLicenseId!=null){
            likeLeft("app_license_id",appLicenseId);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * LIKE '值%'
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdLikeRight(Long appLicenseId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdIsNull(){
        isNull("app_license_id");
        return this;
    }

    /**
     * <p>app许可证id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdIsNotNull(){
        isNotNull("app_license_id");
        return this;
    }

    /**
     * <p>app许可证id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdIn(Long... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdNotIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("app_license_id",values);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 等于 = entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeEq(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            eq("app_license_type",appLicenseType);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 不等于 &lt;&gt; entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeNe(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            ne("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 大于 &gt; entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeGt(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            gt("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 大于等于 &gt;= entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeGe(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            ge("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 小于 &lt; entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeLt(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            lt("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 小于等于 &lt;= entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeLe(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            le("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * BETWEEN  entity().getAppLicenseType() AND 值2
     * @param appLicenseTypeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeBetween(Integer appLicenseTypeEnd){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null && appLicenseTypeEnd!=null){
            between("app_license_type",appLicenseType,appLicenseTypeEnd);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * NOT BETWEEN  entity().getAppLicenseType() AND 值2
     * @param appLicenseTypeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeNotBetween(Integer appLicenseTypeEnd){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null && appLicenseTypeEnd!=null){
            notBetween("app_license_type",appLicenseType,appLicenseTypeEnd);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * BETWEEN  entity().getAppLicenseType() AND 值2
     * @param appLicenseTypeStart       值1
     * @param appLicenseTypeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeBetween(Integer appLicenseTypeStart,Integer appLicenseTypeEnd){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null && appLicenseTypeEnd!=null){
            between("app_license_type",appLicenseTypeStart,appLicenseTypeEnd);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * NOT BETWEEN  entity().getAppLicenseType() AND 值2
     * @param appLicenseTypeStart       值1
     * @param appLicenseTypeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeNotBetween(Integer appLicenseTypeStart,Integer appLicenseTypeEnd){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null && appLicenseTypeEnd!=null){
            notBetween("app_license_type",appLicenseTypeStart,appLicenseTypeEnd);
        }
        return this;
     }


    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * LIKE '%值%' entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeLike(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            like("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * NOT LIKE '%值%' entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeNotLike(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            notLike("app_license_type",appLicenseType);
        }
        return this;
     }


    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * LIKE '%值' entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeLikeLeft(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            likeLeft("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * LIKE '值%' entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeLikeRight(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            likeRight("app_license_type",appLicenseType);
        }
        return this;
     }

/**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 等于 =
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeEq(Integer appLicenseType){
        if(appLicenseType!=null){
            eq("app_license_type",appLicenseType);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 不等于 &lt;&gt;
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeNe(Integer appLicenseType){
        if(appLicenseType!=null){
            ne("app_license_type",appLicenseType);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 大于 &gt;
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeGt(Integer appLicenseType){
        if(appLicenseType!=null){
            gt("app_license_type",appLicenseType);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 大于等于 &gt;=
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeGe(Integer appLicenseType){
        if(appLicenseType!=null){
            ge("app_license_type",appLicenseType);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 小于 &lt;
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeLt(Integer appLicenseType){
        if(appLicenseType!=null){
            lt("app_license_type",appLicenseType);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 小于等于 &lt;=
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeLe(Integer appLicenseType){
        if(appLicenseType!=null){
            le("app_license_type",appLicenseType);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * LIKE '%值%'
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeLike(Integer appLicenseType){
        if(appLicenseType!=null){
            like("app_license_type",appLicenseType);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * NOT LIKE '%值%'
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeNotLike(Integer appLicenseType){
        if(appLicenseType!=null){
            notLike("app_license_type",appLicenseType);
        }
        return this;
    }


    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * LIKE '%值'
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeLikeLeft(Integer appLicenseType){
        if(appLicenseType!=null){
            likeLeft("app_license_type",appLicenseType);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * LIKE '值%'
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeLikeRight(Integer appLicenseType){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeIsNull(){
        isNull("app_license_type");
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeIsNotNull(){
        isNotNull("app_license_type");
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeIn(Collection<Integer> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeIn(Integer... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeNotIn(Collection<Integer> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper appLicenseTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("app_license_type",values);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * 等于 = entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdEq(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            eq("trace_id",traceId);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * 不等于 &lt;&gt; entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdNe(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            ne("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 大于 &gt; entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdGt(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            gt("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 大于等于 &gt;= entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdGe(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            ge("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 小于 &lt; entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdLt(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            lt("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 小于等于 &lt;= entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdLe(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            le("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * BETWEEN  entity().getTraceId() AND 值2
     * @param traceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdBetween(String traceIdEnd){
        String traceId =entity().getTraceId();
        if(traceId!=null && traceIdEnd!=null){
            between("trace_id",traceId,traceIdEnd);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * NOT BETWEEN  entity().getTraceId() AND 值2
     * @param traceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdNotBetween(String traceIdEnd){
        String traceId =entity().getTraceId();
        if(traceId!=null && traceIdEnd!=null){
            notBetween("trace_id",traceId,traceIdEnd);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * BETWEEN  entity().getTraceId() AND 值2
     * @param traceIdStart       值1
     * @param traceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdBetween(String traceIdStart,String traceIdEnd){
        String traceId =entity().getTraceId();
        if(traceId!=null && traceIdEnd!=null){
            between("trace_id",traceIdStart,traceIdEnd);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * NOT BETWEEN  entity().getTraceId() AND 值2
     * @param traceIdStart       值1
     * @param traceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdNotBetween(String traceIdStart,String traceIdEnd){
        String traceId =entity().getTraceId();
        if(traceId!=null && traceIdEnd!=null){
            notBetween("trace_id",traceIdStart,traceIdEnd);
        }
        return this;
     }


    /**
     * <p>链路ID</p>
     * LIKE '%值%' entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdLike(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            like("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * NOT LIKE '%值%' entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdNotLike(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            notLike("trace_id",traceId);
        }
        return this;
     }


    /**
     * <p>链路ID</p>
     * LIKE '%值' entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdLikeLeft(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            likeLeft("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * LIKE '值%' entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdLikeRight(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            likeRight("trace_id",traceId);
        }
        return this;
     }

/**
     * <p>链路ID</p>
     * 等于 =
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdEq(String traceId){
        if(traceId!=null){
            eq("trace_id",traceId);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * 不等于 &lt;&gt;
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdNe(String traceId){
        if(traceId!=null){
            ne("trace_id",traceId);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * 大于 &gt;
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdGt(String traceId){
        if(traceId!=null){
            gt("trace_id",traceId);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * 大于等于 &gt;=
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdGe(String traceId){
        if(traceId!=null){
            ge("trace_id",traceId);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * 小于 &lt;
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdLt(String traceId){
        if(traceId!=null){
            lt("trace_id",traceId);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * 小于等于 &lt;=
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdLe(String traceId){
        if(traceId!=null){
            le("trace_id",traceId);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * LIKE '%值%'
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdLike(String traceId){
        if(traceId!=null){
            like("trace_id",traceId);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * NOT LIKE '%值%'
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdNotLike(String traceId){
        if(traceId!=null){
            notLike("trace_id",traceId);
        }
        return this;
    }


    /**
     * <p>链路ID</p>
     * LIKE '%值'
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdLikeLeft(String traceId){
        if(traceId!=null){
            likeLeft("trace_id",traceId);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * LIKE '值%'
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdLikeRight(String traceId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdIsNull(){
        isNull("trace_id");
        return this;
    }

    /**
     * <p>链路ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdIsNotNull(){
        isNotNull("trace_id");
        return this;
    }

    /**
     * <p>链路ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdIn(String... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdNotIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper traceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("trace_id",values);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 等于 = entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdEq(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            eq("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 不等于 &lt;&gt; entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdNe(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            ne("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 大于 &gt; entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdGt(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            gt("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 大于等于 &gt;= entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdGe(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            ge("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 小于 &lt; entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdLt(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            lt("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 小于等于 &lt;= entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdLe(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            le("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * BETWEEN  entity().getFkCpTnResourcePoolId() AND 值2
     * @param fkCpTnResourcePoolIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdBetween(Long fkCpTnResourcePoolIdEnd){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null && fkCpTnResourcePoolIdEnd!=null){
            between("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId,fkCpTnResourcePoolIdEnd);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * NOT BETWEEN  entity().getFkCpTnResourcePoolId() AND 值2
     * @param fkCpTnResourcePoolIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdNotBetween(Long fkCpTnResourcePoolIdEnd){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null && fkCpTnResourcePoolIdEnd!=null){
            notBetween("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId,fkCpTnResourcePoolIdEnd);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * BETWEEN  entity().getFkCpTnResourcePoolId() AND 值2
     * @param fkCpTnResourcePoolIdStart       值1
     * @param fkCpTnResourcePoolIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdBetween(Long fkCpTnResourcePoolIdStart,Long fkCpTnResourcePoolIdEnd){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null && fkCpTnResourcePoolIdEnd!=null){
            between("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolIdStart,fkCpTnResourcePoolIdEnd);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * NOT BETWEEN  entity().getFkCpTnResourcePoolId() AND 值2
     * @param fkCpTnResourcePoolIdStart       值1
     * @param fkCpTnResourcePoolIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdNotBetween(Long fkCpTnResourcePoolIdStart,Long fkCpTnResourcePoolIdEnd){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null && fkCpTnResourcePoolIdEnd!=null){
            notBetween("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolIdStart,fkCpTnResourcePoolIdEnd);
        }
        return this;
     }


    /**
     * <p>商户资源池ID【非必填】</p>
     * LIKE '%值%' entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdLike(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            like("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * NOT LIKE '%值%' entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdNotLike(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            notLike("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }


    /**
     * <p>商户资源池ID【非必填】</p>
     * LIKE '%值' entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdLikeLeft(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            likeLeft("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * LIKE '值%' entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdLikeRight(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            likeRight("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

/**
     * <p>商户资源池ID【非必填】</p>
     * 等于 =
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdEq(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            eq("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 不等于 &lt;&gt;
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdNe(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            ne("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 大于 &gt;
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdGt(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            gt("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 大于等于 &gt;=
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdGe(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            ge("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 小于 &lt;
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdLt(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            lt("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 小于等于 &lt;=
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdLe(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            le("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * LIKE '%值%'
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdLike(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            like("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * NOT LIKE '%值%'
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdNotLike(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            notLike("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
    }


    /**
     * <p>商户资源池ID【非必填】</p>
     * LIKE '%值'
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdLikeLeft(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            likeLeft("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * LIKE '值%'
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdLikeRight(Long fkCpTnResourcePoolId){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdIsNull(){
        isNull("fk_cp_tn_resource_pool_id");
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdIsNotNull(){
        isNotNull("fk_cp_tn_resource_pool_id");
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdIn(Long... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdNotIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper fkCpTnResourcePoolIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_cp_tn_resource_pool_id",values);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * 等于 = entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameEq(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            eq("resource_pool_name",resourcePoolName);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * 不等于 &lt;&gt; entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameNe(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            ne("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 大于 &gt; entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameGt(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            gt("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 大于等于 &gt;= entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameGe(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            ge("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 小于 &lt; entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameLt(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            lt("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 小于等于 &lt;= entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameLe(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            le("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * BETWEEN  entity().getResourcePoolName() AND 值2
     * @param resourcePoolNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameBetween(String resourcePoolNameEnd){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null && resourcePoolNameEnd!=null){
            between("resource_pool_name",resourcePoolName,resourcePoolNameEnd);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * NOT BETWEEN  entity().getResourcePoolName() AND 值2
     * @param resourcePoolNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameNotBetween(String resourcePoolNameEnd){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null && resourcePoolNameEnd!=null){
            notBetween("resource_pool_name",resourcePoolName,resourcePoolNameEnd);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * BETWEEN  entity().getResourcePoolName() AND 值2
     * @param resourcePoolNameStart       值1
     * @param resourcePoolNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameBetween(String resourcePoolNameStart,String resourcePoolNameEnd){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null && resourcePoolNameEnd!=null){
            between("resource_pool_name",resourcePoolNameStart,resourcePoolNameEnd);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * NOT BETWEEN  entity().getResourcePoolName() AND 值2
     * @param resourcePoolNameStart       值1
     * @param resourcePoolNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameNotBetween(String resourcePoolNameStart,String resourcePoolNameEnd){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null && resourcePoolNameEnd!=null){
            notBetween("resource_pool_name",resourcePoolNameStart,resourcePoolNameEnd);
        }
        return this;
     }


    /**
     * <p>资源池名称【非必填】</p>
     * LIKE '%值%' entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameLike(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            like("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * NOT LIKE '%值%' entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameNotLike(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            notLike("resource_pool_name",resourcePoolName);
        }
        return this;
     }


    /**
     * <p>资源池名称【非必填】</p>
     * LIKE '%值' entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameLikeLeft(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            likeLeft("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * LIKE '值%' entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameLikeRight(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            likeRight("resource_pool_name",resourcePoolName);
        }
        return this;
     }

/**
     * <p>资源池名称【非必填】</p>
     * 等于 =
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameEq(String resourcePoolName){
        if(resourcePoolName!=null){
            eq("resource_pool_name",resourcePoolName);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * 不等于 &lt;&gt;
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameNe(String resourcePoolName){
        if(resourcePoolName!=null){
            ne("resource_pool_name",resourcePoolName);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * 大于 &gt;
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameGt(String resourcePoolName){
        if(resourcePoolName!=null){
            gt("resource_pool_name",resourcePoolName);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * 大于等于 &gt;=
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameGe(String resourcePoolName){
        if(resourcePoolName!=null){
            ge("resource_pool_name",resourcePoolName);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * 小于 &lt;
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameLt(String resourcePoolName){
        if(resourcePoolName!=null){
            lt("resource_pool_name",resourcePoolName);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * 小于等于 &lt;=
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameLe(String resourcePoolName){
        if(resourcePoolName!=null){
            le("resource_pool_name",resourcePoolName);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * LIKE '%值%'
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameLike(String resourcePoolName){
        if(resourcePoolName!=null){
            like("resource_pool_name",resourcePoolName);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * NOT LIKE '%值%'
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameNotLike(String resourcePoolName){
        if(resourcePoolName!=null){
            notLike("resource_pool_name",resourcePoolName);
        }
        return this;
    }


    /**
     * <p>资源池名称【非必填】</p>
     * LIKE '%值'
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameLikeLeft(String resourcePoolName){
        if(resourcePoolName!=null){
            likeLeft("resource_pool_name",resourcePoolName);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * LIKE '值%'
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameLikeRight(String resourcePoolName){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameIsNull(){
        isNull("resource_pool_name");
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameIsNotNull(){
        isNotNull("resource_pool_name");
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameIn(String... values){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameNotIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoUpdateEntityWrapper resourcePoolNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("resource_pool_name",values);
        }
        return this;
    }


}
