package com.suqi.center.machine.dao.viz.wrapper;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 【可视化】机器分配任务表
 * </p>
 * "viz_mc_machine_assign_task"
 * @author Administrator
 */
public class VizMcMachineAssignTaskEoSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public VizMcMachineAssignTaskEoSelect columns(){
        set.add("id");
        set.add("batch_no");
        set.add("tenant_id");
        set.add("tenant_name");
        set.add("external_addr");
        set.add("internal_addr");
        set.add("fk_mc_machine_id");
        set.add("device_id");
        set.add("instance_id");
        set.add("assign_status");
        set.add("operate_user_id");
        set.add("valid_start_time");
        set.add("valid_end_time");
        set.add("version_id");
        set.add("create_time");
        set.add("create_person");
        set.add("update_time");
        set.add("dr");
        set.add("msg");
        set.add("app_license_id");
        set.add("app_license_type");
        set.add("trace_id");
        set.add("fk_cp_tn_resource_pool_id");
        set.add("resource_pool_name");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect id(){
        set.add("id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect batchNo(){
        set.add("batch_no");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeBatchNo(){
        excludeSet.add("batch_no");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgBatchNo(){
        set.add("avg(batch_no) as batch_no");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countBatchNo(){
        set.add("count(batch_no) as batch_no");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minBatchNo(){
        set.add("min(batch_no) as batch_no");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxBatchNo(){
        set.add("max(batch_no) as batch_no");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumBatchNo(){
        set.add("sum(batch_no) as batch_no");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect tenantId(){
        set.add("tenant_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeTenantId(){
        excludeSet.add("tenant_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgTenantId(){
        set.add("avg(tenant_id) as tenant_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countTenantId(){
        set.add("count(tenant_id) as tenant_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minTenantId(){
        set.add("min(tenant_id) as tenant_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxTenantId(){
        set.add("max(tenant_id) as tenant_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumTenantId(){
        set.add("sum(tenant_id) as tenant_id");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect tenantName(){
        set.add("tenant_name");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeTenantName(){
        excludeSet.add("tenant_name");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgTenantName(){
        set.add("avg(tenant_name) as tenant_name");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countTenantName(){
        set.add("count(tenant_name) as tenant_name");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minTenantName(){
        set.add("min(tenant_name) as tenant_name");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxTenantName(){
        set.add("max(tenant_name) as tenant_name");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumTenantName(){
        set.add("sum(tenant_name) as tenant_name");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect externalAddr(){
        set.add("external_addr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeExternalAddr(){
        excludeSet.add("external_addr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgExternalAddr(){
        set.add("avg(external_addr) as external_addr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countExternalAddr(){
        set.add("count(external_addr) as external_addr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minExternalAddr(){
        set.add("min(external_addr) as external_addr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxExternalAddr(){
        set.add("max(external_addr) as external_addr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumExternalAddr(){
        set.add("sum(external_addr) as external_addr");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect internalAddr(){
        set.add("internal_addr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeInternalAddr(){
        excludeSet.add("internal_addr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgInternalAddr(){
        set.add("avg(internal_addr) as internal_addr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countInternalAddr(){
        set.add("count(internal_addr) as internal_addr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minInternalAddr(){
        set.add("min(internal_addr) as internal_addr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxInternalAddr(){
        set.add("max(internal_addr) as internal_addr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumInternalAddr(){
        set.add("sum(internal_addr) as internal_addr");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect fkMcMachineId(){
        set.add("fk_mc_machine_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeFkMcMachineId(){
        excludeSet.add("fk_mc_machine_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgFkMcMachineId(){
        set.add("avg(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countFkMcMachineId(){
        set.add("count(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minFkMcMachineId(){
        set.add("min(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxFkMcMachineId(){
        set.add("max(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumFkMcMachineId(){
        set.add("sum(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect instanceId(){
        set.add("instance_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeInstanceId(){
        excludeSet.add("instance_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgInstanceId(){
        set.add("avg(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countInstanceId(){
        set.add("count(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minInstanceId(){
        set.add("min(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxInstanceId(){
        set.add("max(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumInstanceId(){
        set.add("sum(instance_id) as instance_id");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect assignStatus(){
        set.add("assign_status");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeAssignStatus(){
        excludeSet.add("assign_status");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgAssignStatus(){
        set.add("avg(assign_status) as assign_status");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countAssignStatus(){
        set.add("count(assign_status) as assign_status");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minAssignStatus(){
        set.add("min(assign_status) as assign_status");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxAssignStatus(){
        set.add("max(assign_status) as assign_status");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumAssignStatus(){
        set.add("sum(assign_status) as assign_status");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect operateUserId(){
        set.add("operate_user_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeOperateUserId(){
        excludeSet.add("operate_user_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgOperateUserId(){
        set.add("avg(operate_user_id) as operate_user_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countOperateUserId(){
        set.add("count(operate_user_id) as operate_user_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minOperateUserId(){
        set.add("min(operate_user_id) as operate_user_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxOperateUserId(){
        set.add("max(operate_user_id) as operate_user_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumOperateUserId(){
        set.add("sum(operate_user_id) as operate_user_id");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect validStartTime(){
        set.add("valid_start_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeValidStartTime(){
        excludeSet.add("valid_start_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgValidStartTime(){
        set.add("avg(valid_start_time) as valid_start_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countValidStartTime(){
        set.add("count(valid_start_time) as valid_start_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minValidStartTime(){
        set.add("min(valid_start_time) as valid_start_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxValidStartTime(){
        set.add("max(valid_start_time) as valid_start_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumValidStartTime(){
        set.add("sum(valid_start_time) as valid_start_time");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect validEndTime(){
        set.add("valid_end_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeValidEndTime(){
        excludeSet.add("valid_end_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgValidEndTime(){
        set.add("avg(valid_end_time) as valid_end_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countValidEndTime(){
        set.add("count(valid_end_time) as valid_end_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minValidEndTime(){
        set.add("min(valid_end_time) as valid_end_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxValidEndTime(){
        set.add("max(valid_end_time) as valid_end_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumValidEndTime(){
        set.add("sum(valid_end_time) as valid_end_time");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect versionId(){
        set.add("version_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect createTime(){
        set.add("create_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect createPerson(){
        set.add("create_person");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeCreatePerson(){
        excludeSet.add("create_person");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgCreatePerson(){
        set.add("avg(create_person) as create_person");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countCreatePerson(){
        set.add("count(create_person) as create_person");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minCreatePerson(){
        set.add("min(create_person) as create_person");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxCreatePerson(){
        set.add("max(create_person) as create_person");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumCreatePerson(){
        set.add("sum(create_person) as create_person");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect updateTime(){
        set.add("update_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeUpdateTime(){
        excludeSet.add("update_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgUpdateTime(){
        set.add("avg(update_time) as update_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countUpdateTime(){
        set.add("count(update_time) as update_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minUpdateTime(){
        set.add("min(update_time) as update_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxUpdateTime(){
        set.add("max(update_time) as update_time");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumUpdateTime(){
        set.add("sum(update_time) as update_time");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect dr(){
        set.add("dr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeDr(){
        excludeSet.add("dr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgDr(){
        set.add("avg(dr) as dr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countDr(){
        set.add("count(dr) as dr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minDr(){
        set.add("min(dr) as dr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxDr(){
        set.add("max(dr) as dr");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumDr(){
        set.add("sum(dr) as dr");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect msg(){
        set.add("msg");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeMsg(){
        excludeSet.add("msg");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgMsg(){
        set.add("avg(msg) as msg");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countMsg(){
        set.add("count(msg) as msg");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minMsg(){
        set.add("min(msg) as msg");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxMsg(){
        set.add("max(msg) as msg");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumMsg(){
        set.add("sum(msg) as msg");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect appLicenseId(){
        set.add("app_license_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeAppLicenseId(){
        excludeSet.add("app_license_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgAppLicenseId(){
        set.add("avg(app_license_id) as app_license_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countAppLicenseId(){
        set.add("count(app_license_id) as app_license_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minAppLicenseId(){
        set.add("min(app_license_id) as app_license_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxAppLicenseId(){
        set.add("max(app_license_id) as app_license_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumAppLicenseId(){
        set.add("sum(app_license_id) as app_license_id");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect appLicenseType(){
        set.add("app_license_type");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeAppLicenseType(){
        excludeSet.add("app_license_type");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgAppLicenseType(){
        set.add("avg(app_license_type) as app_license_type");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countAppLicenseType(){
        set.add("count(app_license_type) as app_license_type");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minAppLicenseType(){
        set.add("min(app_license_type) as app_license_type");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxAppLicenseType(){
        set.add("max(app_license_type) as app_license_type");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumAppLicenseType(){
        set.add("sum(app_license_type) as app_license_type");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect traceId(){
        set.add("trace_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeTraceId(){
        excludeSet.add("trace_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgTraceId(){
        set.add("avg(trace_id) as trace_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countTraceId(){
        set.add("count(trace_id) as trace_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minTraceId(){
        set.add("min(trace_id) as trace_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxTraceId(){
        set.add("max(trace_id) as trace_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumTraceId(){
        set.add("sum(trace_id) as trace_id");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect fkCpTnResourcePoolId(){
        set.add("fk_cp_tn_resource_pool_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeFkCpTnResourcePoolId(){
        excludeSet.add("fk_cp_tn_resource_pool_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgFkCpTnResourcePoolId(){
        set.add("avg(fk_cp_tn_resource_pool_id) as fk_cp_tn_resource_pool_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countFkCpTnResourcePoolId(){
        set.add("count(fk_cp_tn_resource_pool_id) as fk_cp_tn_resource_pool_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minFkCpTnResourcePoolId(){
        set.add("min(fk_cp_tn_resource_pool_id) as fk_cp_tn_resource_pool_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxFkCpTnResourcePoolId(){
        set.add("max(fk_cp_tn_resource_pool_id) as fk_cp_tn_resource_pool_id");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumFkCpTnResourcePoolId(){
        set.add("sum(fk_cp_tn_resource_pool_id) as fk_cp_tn_resource_pool_id");
        return this;
    }
    public VizMcMachineAssignTaskEoSelect resourcePoolName(){
        set.add("resource_pool_name");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect excludeResourcePoolName(){
        excludeSet.add("resource_pool_name");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect avgResourcePoolName(){
        set.add("avg(resource_pool_name) as resource_pool_name");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect countResourcePoolName(){
        set.add("count(resource_pool_name) as resource_pool_name");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect minResourcePoolName(){
        set.add("min(resource_pool_name) as resource_pool_name");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect maxResourcePoolName(){
        set.add("max(resource_pool_name) as resource_pool_name");
        return this;
    }

    public VizMcMachineAssignTaskEoSelect sumResourcePoolName(){
        set.add("sum(resource_pool_name) as resource_pool_name");
        return this;
    }

    boolean distinct=false;

     public VizMcMachineAssignTaskEoSelect distinct(){
        this.distinct=true;
        return this;
    }

    public VizMcMachineAssignTaskEoSelect includes(Consumer<Set<String>> other){
        if(other!=null){
            other.accept(set);
        }
        return this;
    }

    public String[] select(){
        if(!excludeSet.isEmpty()){
            set.removeAll(excludeSet);
        }
        String[] columns = set.isEmpty() ? new String[]{"*"} : set.toArray(new String[0]);
        set.clear();
        excludeSet.clear();
        set=null;
        excludeSet=null;
        if(distinct){
            columns[0]=" DISTINCT "+columns[0];
        }
        return columns;
    }

    @Override
    public String toString(){
        String[] all=select();
        if(all.length==1){
            return all[0];
        }
        StringBuilder b =new StringBuilder();
        for (String s : all) {
            b.append(s).append(",");
        }
        b.deleteCharAt(b.length()-1);
        return b.toString();
    }
}
