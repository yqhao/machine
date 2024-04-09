package com.suqi.center.machine.dao.viz.wrapper;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 【可视化】机器回收任务表
 * </p>
 * "viz_mc_machine_recycle_task"
 * @author Administrator
 */
public class VizMcMachineRecycleTaskEoSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public VizMcMachineRecycleTaskEoSelect columns(){
        set.add("id");
        set.add("batch_no");
        set.add("tenant_id");
        set.add("tenant_name");
        set.add("external_addr");
        set.add("internal_addr");
        set.add("fk_mc_machine_id");
        set.add("fk_viz_tn_machine_id");
        set.add("device_id");
        set.add("instance_id");
        set.add("recycle_status");
        set.add("operate_user_id");
        set.add("recycle_time");
        set.add("version_id");
        set.add("create_time");
        set.add("create_person");
        set.add("update_time");
        set.add("dr");
        set.add("msg");
        set.add("trace_id");
        set.add("fk_cp_tn_resource_pool_id");
        set.add("resource_pool_name");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect id(){
        set.add("id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect batchNo(){
        set.add("batch_no");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeBatchNo(){
        excludeSet.add("batch_no");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgBatchNo(){
        set.add("avg(batch_no) as batch_no");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countBatchNo(){
        set.add("count(batch_no) as batch_no");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minBatchNo(){
        set.add("min(batch_no) as batch_no");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxBatchNo(){
        set.add("max(batch_no) as batch_no");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumBatchNo(){
        set.add("sum(batch_no) as batch_no");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect tenantId(){
        set.add("tenant_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeTenantId(){
        excludeSet.add("tenant_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgTenantId(){
        set.add("avg(tenant_id) as tenant_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countTenantId(){
        set.add("count(tenant_id) as tenant_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minTenantId(){
        set.add("min(tenant_id) as tenant_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxTenantId(){
        set.add("max(tenant_id) as tenant_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumTenantId(){
        set.add("sum(tenant_id) as tenant_id");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect tenantName(){
        set.add("tenant_name");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeTenantName(){
        excludeSet.add("tenant_name");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgTenantName(){
        set.add("avg(tenant_name) as tenant_name");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countTenantName(){
        set.add("count(tenant_name) as tenant_name");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minTenantName(){
        set.add("min(tenant_name) as tenant_name");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxTenantName(){
        set.add("max(tenant_name) as tenant_name");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumTenantName(){
        set.add("sum(tenant_name) as tenant_name");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect externalAddr(){
        set.add("external_addr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeExternalAddr(){
        excludeSet.add("external_addr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgExternalAddr(){
        set.add("avg(external_addr) as external_addr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countExternalAddr(){
        set.add("count(external_addr) as external_addr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minExternalAddr(){
        set.add("min(external_addr) as external_addr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxExternalAddr(){
        set.add("max(external_addr) as external_addr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumExternalAddr(){
        set.add("sum(external_addr) as external_addr");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect internalAddr(){
        set.add("internal_addr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeInternalAddr(){
        excludeSet.add("internal_addr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgInternalAddr(){
        set.add("avg(internal_addr) as internal_addr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countInternalAddr(){
        set.add("count(internal_addr) as internal_addr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minInternalAddr(){
        set.add("min(internal_addr) as internal_addr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxInternalAddr(){
        set.add("max(internal_addr) as internal_addr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumInternalAddr(){
        set.add("sum(internal_addr) as internal_addr");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect fkMcMachineId(){
        set.add("fk_mc_machine_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeFkMcMachineId(){
        excludeSet.add("fk_mc_machine_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgFkMcMachineId(){
        set.add("avg(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countFkMcMachineId(){
        set.add("count(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minFkMcMachineId(){
        set.add("min(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxFkMcMachineId(){
        set.add("max(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumFkMcMachineId(){
        set.add("sum(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect fkVizTnMachineId(){
        set.add("fk_viz_tn_machine_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeFkVizTnMachineId(){
        excludeSet.add("fk_viz_tn_machine_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgFkVizTnMachineId(){
        set.add("avg(fk_viz_tn_machine_id) as fk_viz_tn_machine_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countFkVizTnMachineId(){
        set.add("count(fk_viz_tn_machine_id) as fk_viz_tn_machine_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minFkVizTnMachineId(){
        set.add("min(fk_viz_tn_machine_id) as fk_viz_tn_machine_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxFkVizTnMachineId(){
        set.add("max(fk_viz_tn_machine_id) as fk_viz_tn_machine_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumFkVizTnMachineId(){
        set.add("sum(fk_viz_tn_machine_id) as fk_viz_tn_machine_id");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect instanceId(){
        set.add("instance_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeInstanceId(){
        excludeSet.add("instance_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgInstanceId(){
        set.add("avg(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countInstanceId(){
        set.add("count(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minInstanceId(){
        set.add("min(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxInstanceId(){
        set.add("max(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumInstanceId(){
        set.add("sum(instance_id) as instance_id");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect recycleStatus(){
        set.add("recycle_status");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeRecycleStatus(){
        excludeSet.add("recycle_status");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgRecycleStatus(){
        set.add("avg(recycle_status) as recycle_status");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countRecycleStatus(){
        set.add("count(recycle_status) as recycle_status");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minRecycleStatus(){
        set.add("min(recycle_status) as recycle_status");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxRecycleStatus(){
        set.add("max(recycle_status) as recycle_status");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumRecycleStatus(){
        set.add("sum(recycle_status) as recycle_status");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect operateUserId(){
        set.add("operate_user_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeOperateUserId(){
        excludeSet.add("operate_user_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgOperateUserId(){
        set.add("avg(operate_user_id) as operate_user_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countOperateUserId(){
        set.add("count(operate_user_id) as operate_user_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minOperateUserId(){
        set.add("min(operate_user_id) as operate_user_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxOperateUserId(){
        set.add("max(operate_user_id) as operate_user_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumOperateUserId(){
        set.add("sum(operate_user_id) as operate_user_id");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect recycleTime(){
        set.add("recycle_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeRecycleTime(){
        excludeSet.add("recycle_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgRecycleTime(){
        set.add("avg(recycle_time) as recycle_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countRecycleTime(){
        set.add("count(recycle_time) as recycle_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minRecycleTime(){
        set.add("min(recycle_time) as recycle_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxRecycleTime(){
        set.add("max(recycle_time) as recycle_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumRecycleTime(){
        set.add("sum(recycle_time) as recycle_time");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect versionId(){
        set.add("version_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect createTime(){
        set.add("create_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect createPerson(){
        set.add("create_person");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeCreatePerson(){
        excludeSet.add("create_person");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgCreatePerson(){
        set.add("avg(create_person) as create_person");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countCreatePerson(){
        set.add("count(create_person) as create_person");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minCreatePerson(){
        set.add("min(create_person) as create_person");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxCreatePerson(){
        set.add("max(create_person) as create_person");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumCreatePerson(){
        set.add("sum(create_person) as create_person");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect updateTime(){
        set.add("update_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeUpdateTime(){
        excludeSet.add("update_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgUpdateTime(){
        set.add("avg(update_time) as update_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countUpdateTime(){
        set.add("count(update_time) as update_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minUpdateTime(){
        set.add("min(update_time) as update_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxUpdateTime(){
        set.add("max(update_time) as update_time");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumUpdateTime(){
        set.add("sum(update_time) as update_time");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect dr(){
        set.add("dr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeDr(){
        excludeSet.add("dr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgDr(){
        set.add("avg(dr) as dr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countDr(){
        set.add("count(dr) as dr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minDr(){
        set.add("min(dr) as dr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxDr(){
        set.add("max(dr) as dr");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumDr(){
        set.add("sum(dr) as dr");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect msg(){
        set.add("msg");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeMsg(){
        excludeSet.add("msg");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgMsg(){
        set.add("avg(msg) as msg");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countMsg(){
        set.add("count(msg) as msg");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minMsg(){
        set.add("min(msg) as msg");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxMsg(){
        set.add("max(msg) as msg");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumMsg(){
        set.add("sum(msg) as msg");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect traceId(){
        set.add("trace_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeTraceId(){
        excludeSet.add("trace_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgTraceId(){
        set.add("avg(trace_id) as trace_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countTraceId(){
        set.add("count(trace_id) as trace_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minTraceId(){
        set.add("min(trace_id) as trace_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxTraceId(){
        set.add("max(trace_id) as trace_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumTraceId(){
        set.add("sum(trace_id) as trace_id");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect fkCpTnResourcePoolId(){
        set.add("fk_cp_tn_resource_pool_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeFkCpTnResourcePoolId(){
        excludeSet.add("fk_cp_tn_resource_pool_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgFkCpTnResourcePoolId(){
        set.add("avg(fk_cp_tn_resource_pool_id) as fk_cp_tn_resource_pool_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countFkCpTnResourcePoolId(){
        set.add("count(fk_cp_tn_resource_pool_id) as fk_cp_tn_resource_pool_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minFkCpTnResourcePoolId(){
        set.add("min(fk_cp_tn_resource_pool_id) as fk_cp_tn_resource_pool_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxFkCpTnResourcePoolId(){
        set.add("max(fk_cp_tn_resource_pool_id) as fk_cp_tn_resource_pool_id");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumFkCpTnResourcePoolId(){
        set.add("sum(fk_cp_tn_resource_pool_id) as fk_cp_tn_resource_pool_id");
        return this;
    }
    public VizMcMachineRecycleTaskEoSelect resourcePoolName(){
        set.add("resource_pool_name");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect excludeResourcePoolName(){
        excludeSet.add("resource_pool_name");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect avgResourcePoolName(){
        set.add("avg(resource_pool_name) as resource_pool_name");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect countResourcePoolName(){
        set.add("count(resource_pool_name) as resource_pool_name");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect minResourcePoolName(){
        set.add("min(resource_pool_name) as resource_pool_name");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect maxResourcePoolName(){
        set.add("max(resource_pool_name) as resource_pool_name");
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect sumResourcePoolName(){
        set.add("sum(resource_pool_name) as resource_pool_name");
        return this;
    }

    boolean distinct=false;

     public VizMcMachineRecycleTaskEoSelect distinct(){
        this.distinct=true;
        return this;
    }

    public VizMcMachineRecycleTaskEoSelect includes(Consumer<Set<String>> other){
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
