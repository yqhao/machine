package com.suqi.center.machine.dao.viz.wrapper;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 租户更新机器任务表
 * </p>
 * "mc_update_device_task_tenant"
 * @author 18374
 */
public class McUpdateDeviceTaskTenantSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public McUpdateDeviceTaskTenantSelect columns(){
        set.add("id");
        set.add("fk_mc_update_device_task_id");
        set.add("fk_tenant_id");
        set.add("status");
        set.add("version_id");
        set.add("create_time");
        set.add("last_update_time");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect id(){
        set.add("id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public McUpdateDeviceTaskTenantSelect fkMcUpdateDeviceTaskId(){
        set.add("fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect excludeFkMcUpdateDeviceTaskId(){
        excludeSet.add("fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect avgFkMcUpdateDeviceTaskId(){
        set.add("avg(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect countFkMcUpdateDeviceTaskId(){
        set.add("count(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect minFkMcUpdateDeviceTaskId(){
        set.add("min(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect maxFkMcUpdateDeviceTaskId(){
        set.add("max(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect sumFkMcUpdateDeviceTaskId(){
        set.add("sum(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }
    public McUpdateDeviceTaskTenantSelect fkTenantId(){
        set.add("fk_tenant_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect excludeFkTenantId(){
        excludeSet.add("fk_tenant_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect avgFkTenantId(){
        set.add("avg(fk_tenant_id) as fk_tenant_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect countFkTenantId(){
        set.add("count(fk_tenant_id) as fk_tenant_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect minFkTenantId(){
        set.add("min(fk_tenant_id) as fk_tenant_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect maxFkTenantId(){
        set.add("max(fk_tenant_id) as fk_tenant_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect sumFkTenantId(){
        set.add("sum(fk_tenant_id) as fk_tenant_id");
        return this;
    }
    public McUpdateDeviceTaskTenantSelect status(){
        set.add("status");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public McUpdateDeviceTaskTenantSelect versionId(){
        set.add("version_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public McUpdateDeviceTaskTenantSelect createTime(){
        set.add("create_time");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public McUpdateDeviceTaskTenantSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceTaskTenantSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }

    boolean distinct=false;

     public McUpdateDeviceTaskTenantSelect distinct(){
        this.distinct=true;
        return this;
    }

    public McUpdateDeviceTaskTenantSelect includes(Consumer<Set<String>> other){
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
