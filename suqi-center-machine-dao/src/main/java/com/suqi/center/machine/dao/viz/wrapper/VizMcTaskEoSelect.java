package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 任务表
 * </p>
 * "viz_mc_task"
 * @author 18374
 */
public class VizMcTaskEoSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public VizMcTaskEoSelect columns(){
        set.add("id");
        set.add("fk_tenant_id");
        set.add("fk_viz_mc_task_type_id");
        set.add("name");
        set.add("task_description");
        set.add("command");
        set.add("fk_extend_id");
        set.add("status");
        set.add("operate_sys_user_id");
        set.add("version_id");
        set.add("create_time");
        set.add("last_update_time");
        set.add("dr");
        return this;
    }

    public VizMcTaskEoSelect id(){
        set.add("id");
        return this;
    }

    public VizMcTaskEoSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public VizMcTaskEoSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public VizMcTaskEoSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public VizMcTaskEoSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public VizMcTaskEoSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public VizMcTaskEoSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public VizMcTaskEoSelect fkTenantId(){
        set.add("fk_tenant_id");
        return this;
    }

    public VizMcTaskEoSelect excludeFkTenantId(){
        excludeSet.add("fk_tenant_id");
        return this;
    }

    public VizMcTaskEoSelect avgFkTenantId(){
        set.add("avg(fk_tenant_id) as fk_tenant_id");
        return this;
    }

    public VizMcTaskEoSelect countFkTenantId(){
        set.add("count(fk_tenant_id) as fk_tenant_id");
        return this;
    }

    public VizMcTaskEoSelect minFkTenantId(){
        set.add("min(fk_tenant_id) as fk_tenant_id");
        return this;
    }

    public VizMcTaskEoSelect maxFkTenantId(){
        set.add("max(fk_tenant_id) as fk_tenant_id");
        return this;
    }

    public VizMcTaskEoSelect sumFkTenantId(){
        set.add("sum(fk_tenant_id) as fk_tenant_id");
        return this;
    }
    public VizMcTaskEoSelect fkVizMcTaskTypeId(){
        set.add("fk_viz_mc_task_type_id");
        return this;
    }

    public VizMcTaskEoSelect excludeFkVizMcTaskTypeId(){
        excludeSet.add("fk_viz_mc_task_type_id");
        return this;
    }

    public VizMcTaskEoSelect avgFkVizMcTaskTypeId(){
        set.add("avg(fk_viz_mc_task_type_id) as fk_viz_mc_task_type_id");
        return this;
    }

    public VizMcTaskEoSelect countFkVizMcTaskTypeId(){
        set.add("count(fk_viz_mc_task_type_id) as fk_viz_mc_task_type_id");
        return this;
    }

    public VizMcTaskEoSelect minFkVizMcTaskTypeId(){
        set.add("min(fk_viz_mc_task_type_id) as fk_viz_mc_task_type_id");
        return this;
    }

    public VizMcTaskEoSelect maxFkVizMcTaskTypeId(){
        set.add("max(fk_viz_mc_task_type_id) as fk_viz_mc_task_type_id");
        return this;
    }

    public VizMcTaskEoSelect sumFkVizMcTaskTypeId(){
        set.add("sum(fk_viz_mc_task_type_id) as fk_viz_mc_task_type_id");
        return this;
    }
    public VizMcTaskEoSelect name(){
        set.add("name");
        return this;
    }

    public VizMcTaskEoSelect excludeName(){
        excludeSet.add("name");
        return this;
    }

    public VizMcTaskEoSelect avgName(){
        set.add("avg(name) as name");
        return this;
    }

    public VizMcTaskEoSelect countName(){
        set.add("count(name) as name");
        return this;
    }

    public VizMcTaskEoSelect minName(){
        set.add("min(name) as name");
        return this;
    }

    public VizMcTaskEoSelect maxName(){
        set.add("max(name) as name");
        return this;
    }

    public VizMcTaskEoSelect sumName(){
        set.add("sum(name) as name");
        return this;
    }
    public VizMcTaskEoSelect taskDescription(){
        set.add("task_description");
        return this;
    }

    public VizMcTaskEoSelect excludeTaskDescription(){
        excludeSet.add("task_description");
        return this;
    }

    public VizMcTaskEoSelect avgTaskDescription(){
        set.add("avg(task_description) as task_description");
        return this;
    }

    public VizMcTaskEoSelect countTaskDescription(){
        set.add("count(task_description) as task_description");
        return this;
    }

    public VizMcTaskEoSelect minTaskDescription(){
        set.add("min(task_description) as task_description");
        return this;
    }

    public VizMcTaskEoSelect maxTaskDescription(){
        set.add("max(task_description) as task_description");
        return this;
    }

    public VizMcTaskEoSelect sumTaskDescription(){
        set.add("sum(task_description) as task_description");
        return this;
    }
    public VizMcTaskEoSelect command(){
        set.add("command");
        return this;
    }

    public VizMcTaskEoSelect excludeCommand(){
        excludeSet.add("command");
        return this;
    }

    public VizMcTaskEoSelect avgCommand(){
        set.add("avg(command) as command");
        return this;
    }

    public VizMcTaskEoSelect countCommand(){
        set.add("count(command) as command");
        return this;
    }

    public VizMcTaskEoSelect minCommand(){
        set.add("min(command) as command");
        return this;
    }

    public VizMcTaskEoSelect maxCommand(){
        set.add("max(command) as command");
        return this;
    }

    public VizMcTaskEoSelect sumCommand(){
        set.add("sum(command) as command");
        return this;
    }
    public VizMcTaskEoSelect fkExtendId(){
        set.add("fk_extend_id");
        return this;
    }

    public VizMcTaskEoSelect excludeFkExtendId(){
        excludeSet.add("fk_extend_id");
        return this;
    }

    public VizMcTaskEoSelect avgFkExtendId(){
        set.add("avg(fk_extend_id) as fk_extend_id");
        return this;
    }

    public VizMcTaskEoSelect countFkExtendId(){
        set.add("count(fk_extend_id) as fk_extend_id");
        return this;
    }

    public VizMcTaskEoSelect minFkExtendId(){
        set.add("min(fk_extend_id) as fk_extend_id");
        return this;
    }

    public VizMcTaskEoSelect maxFkExtendId(){
        set.add("max(fk_extend_id) as fk_extend_id");
        return this;
    }

    public VizMcTaskEoSelect sumFkExtendId(){
        set.add("sum(fk_extend_id) as fk_extend_id");
        return this;
    }
    public VizMcTaskEoSelect status(){
        set.add("status");
        return this;
    }

    public VizMcTaskEoSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public VizMcTaskEoSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public VizMcTaskEoSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public VizMcTaskEoSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public VizMcTaskEoSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public VizMcTaskEoSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public VizMcTaskEoSelect operateSysUserId(){
        set.add("operate_sys_user_id");
        return this;
    }

    public VizMcTaskEoSelect excludeOperateSysUserId(){
        excludeSet.add("operate_sys_user_id");
        return this;
    }

    public VizMcTaskEoSelect avgOperateSysUserId(){
        set.add("avg(operate_sys_user_id) as operate_sys_user_id");
        return this;
    }

    public VizMcTaskEoSelect countOperateSysUserId(){
        set.add("count(operate_sys_user_id) as operate_sys_user_id");
        return this;
    }

    public VizMcTaskEoSelect minOperateSysUserId(){
        set.add("min(operate_sys_user_id) as operate_sys_user_id");
        return this;
    }

    public VizMcTaskEoSelect maxOperateSysUserId(){
        set.add("max(operate_sys_user_id) as operate_sys_user_id");
        return this;
    }

    public VizMcTaskEoSelect sumOperateSysUserId(){
        set.add("sum(operate_sys_user_id) as operate_sys_user_id");
        return this;
    }
    public VizMcTaskEoSelect versionId(){
        set.add("version_id");
        return this;
    }

    public VizMcTaskEoSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public VizMcTaskEoSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public VizMcTaskEoSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public VizMcTaskEoSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public VizMcTaskEoSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public VizMcTaskEoSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public VizMcTaskEoSelect createTime(){
        set.add("create_time");
        return this;
    }

    public VizMcTaskEoSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public VizMcTaskEoSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public VizMcTaskEoSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public VizMcTaskEoSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public VizMcTaskEoSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public VizMcTaskEoSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public VizMcTaskEoSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public VizMcTaskEoSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public VizMcTaskEoSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public VizMcTaskEoSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public VizMcTaskEoSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public VizMcTaskEoSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public VizMcTaskEoSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public VizMcTaskEoSelect dr(){
        set.add("dr");
        return this;
    }

    public VizMcTaskEoSelect excludeDr(){
        excludeSet.add("dr");
        return this;
    }

    public VizMcTaskEoSelect avgDr(){
        set.add("avg(dr) as dr");
        return this;
    }

    public VizMcTaskEoSelect countDr(){
        set.add("count(dr) as dr");
        return this;
    }

    public VizMcTaskEoSelect minDr(){
        set.add("min(dr) as dr");
        return this;
    }

    public VizMcTaskEoSelect maxDr(){
        set.add("max(dr) as dr");
        return this;
    }

    public VizMcTaskEoSelect sumDr(){
        set.add("sum(dr) as dr");
        return this;
    }

    boolean distinct=false;

     public VizMcTaskEoSelect distinct(){
        this.distinct=true;
        return this;
    }

    public VizMcTaskEoSelect includes(Consumer<Set<String>> other){
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
