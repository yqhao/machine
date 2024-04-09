package com.suqi.center.machine.dao.viz.wrapper;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 机器更新子任务记录表
 * </p>
 * "mc_update_device_subtask_record"
 * @author 18374
 */
public class McUpdateDeviceSubtaskRecordSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public McUpdateDeviceSubtaskRecordSelect columns(){
        set.add("id");
        set.add("fk_mc_update_device_task_record_id");
        set.add("fk_mc_update_device_subtask_id");
        set.add("type");
        set.add("task_id");
        set.add("execution_flow");
        set.add("execute_msg");
        set.add("status");
        set.add("version_id");
        set.add("create_time");
        set.add("last_update_time");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect id(){
        set.add("id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public McUpdateDeviceSubtaskRecordSelect fkMcUpdateDeviceTaskRecordId(){
        set.add("fk_mc_update_device_task_record_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect excludeFkMcUpdateDeviceTaskRecordId(){
        excludeSet.add("fk_mc_update_device_task_record_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect avgFkMcUpdateDeviceTaskRecordId(){
        set.add("avg(fk_mc_update_device_task_record_id) as fk_mc_update_device_task_record_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect countFkMcUpdateDeviceTaskRecordId(){
        set.add("count(fk_mc_update_device_task_record_id) as fk_mc_update_device_task_record_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect minFkMcUpdateDeviceTaskRecordId(){
        set.add("min(fk_mc_update_device_task_record_id) as fk_mc_update_device_task_record_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect maxFkMcUpdateDeviceTaskRecordId(){
        set.add("max(fk_mc_update_device_task_record_id) as fk_mc_update_device_task_record_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect sumFkMcUpdateDeviceTaskRecordId(){
        set.add("sum(fk_mc_update_device_task_record_id) as fk_mc_update_device_task_record_id");
        return this;
    }
    public McUpdateDeviceSubtaskRecordSelect fkMcUpdateDeviceSubtaskId(){
        set.add("fk_mc_update_device_subtask_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect excludeFkMcUpdateDeviceSubtaskId(){
        excludeSet.add("fk_mc_update_device_subtask_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect avgFkMcUpdateDeviceSubtaskId(){
        set.add("avg(fk_mc_update_device_subtask_id) as fk_mc_update_device_subtask_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect countFkMcUpdateDeviceSubtaskId(){
        set.add("count(fk_mc_update_device_subtask_id) as fk_mc_update_device_subtask_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect minFkMcUpdateDeviceSubtaskId(){
        set.add("min(fk_mc_update_device_subtask_id) as fk_mc_update_device_subtask_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect maxFkMcUpdateDeviceSubtaskId(){
        set.add("max(fk_mc_update_device_subtask_id) as fk_mc_update_device_subtask_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect sumFkMcUpdateDeviceSubtaskId(){
        set.add("sum(fk_mc_update_device_subtask_id) as fk_mc_update_device_subtask_id");
        return this;
    }
    public McUpdateDeviceSubtaskRecordSelect type(){
        set.add("type");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect excludeType(){
        excludeSet.add("type");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect avgType(){
        set.add("avg(type) as type");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect countType(){
        set.add("count(type) as type");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect minType(){
        set.add("min(type) as type");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect maxType(){
        set.add("max(type) as type");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect sumType(){
        set.add("sum(type) as type");
        return this;
    }
    public McUpdateDeviceSubtaskRecordSelect taskId(){
        set.add("task_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect excludeTaskId(){
        excludeSet.add("task_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect avgTaskId(){
        set.add("avg(task_id) as task_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect countTaskId(){
        set.add("count(task_id) as task_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect minTaskId(){
        set.add("min(task_id) as task_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect maxTaskId(){
        set.add("max(task_id) as task_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect sumTaskId(){
        set.add("sum(task_id) as task_id");
        return this;
    }
    public McUpdateDeviceSubtaskRecordSelect executionFlow(){
        set.add("execution_flow");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect excludeExecutionFlow(){
        excludeSet.add("execution_flow");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect avgExecutionFlow(){
        set.add("avg(execution_flow) as execution_flow");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect countExecutionFlow(){
        set.add("count(execution_flow) as execution_flow");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect minExecutionFlow(){
        set.add("min(execution_flow) as execution_flow");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect maxExecutionFlow(){
        set.add("max(execution_flow) as execution_flow");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect sumExecutionFlow(){
        set.add("sum(execution_flow) as execution_flow");
        return this;
    }
    public McUpdateDeviceSubtaskRecordSelect executeMsg(){
        set.add("execute_msg");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect excludeExecuteMsg(){
        excludeSet.add("execute_msg");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect avgExecuteMsg(){
        set.add("avg(execute_msg) as execute_msg");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect countExecuteMsg(){
        set.add("count(execute_msg) as execute_msg");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect minExecuteMsg(){
        set.add("min(execute_msg) as execute_msg");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect maxExecuteMsg(){
        set.add("max(execute_msg) as execute_msg");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect sumExecuteMsg(){
        set.add("sum(execute_msg) as execute_msg");
        return this;
    }
    public McUpdateDeviceSubtaskRecordSelect status(){
        set.add("status");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public McUpdateDeviceSubtaskRecordSelect versionId(){
        set.add("version_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public McUpdateDeviceSubtaskRecordSelect createTime(){
        set.add("create_time");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public McUpdateDeviceSubtaskRecordSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }

    boolean distinct=false;

     public McUpdateDeviceSubtaskRecordSelect distinct(){
        this.distinct=true;
        return this;
    }

    public McUpdateDeviceSubtaskRecordSelect includes(Consumer<Set<String>> other){
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
