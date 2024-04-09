package com.suqi.center.machine.dao.viz.wrapper;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 更新机器子任务表
 * </p>
 * "mc_update_device_subtask"
 * @author 18374
 */
public class McUpdateDeviceSubtaskSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public McUpdateDeviceSubtaskSelect columns(){
        set.add("id");
        set.add("fk_mc_update_device_task_id");
        set.add("type");
        set.add("execution_flow");
        set.add("status");
        set.add("create_time");
        set.add("last_update_time");
        return this;
    }

    public McUpdateDeviceSubtaskSelect id(){
        set.add("id");
        return this;
    }

    public McUpdateDeviceSubtaskSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public McUpdateDeviceSubtaskSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public McUpdateDeviceSubtaskSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public McUpdateDeviceSubtaskSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public McUpdateDeviceSubtaskSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public McUpdateDeviceSubtaskSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public McUpdateDeviceSubtaskSelect fkMcUpdateDeviceTaskId(){
        set.add("fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceSubtaskSelect excludeFkMcUpdateDeviceTaskId(){
        excludeSet.add("fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceSubtaskSelect avgFkMcUpdateDeviceTaskId(){
        set.add("avg(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceSubtaskSelect countFkMcUpdateDeviceTaskId(){
        set.add("count(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceSubtaskSelect minFkMcUpdateDeviceTaskId(){
        set.add("min(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceSubtaskSelect maxFkMcUpdateDeviceTaskId(){
        set.add("max(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceSubtaskSelect sumFkMcUpdateDeviceTaskId(){
        set.add("sum(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }
    public McUpdateDeviceSubtaskSelect type(){
        set.add("type");
        return this;
    }

    public McUpdateDeviceSubtaskSelect excludeType(){
        excludeSet.add("type");
        return this;
    }

    public McUpdateDeviceSubtaskSelect avgType(){
        set.add("avg(type) as type");
        return this;
    }

    public McUpdateDeviceSubtaskSelect countType(){
        set.add("count(type) as type");
        return this;
    }

    public McUpdateDeviceSubtaskSelect minType(){
        set.add("min(type) as type");
        return this;
    }

    public McUpdateDeviceSubtaskSelect maxType(){
        set.add("max(type) as type");
        return this;
    }

    public McUpdateDeviceSubtaskSelect sumType(){
        set.add("sum(type) as type");
        return this;
    }
    public McUpdateDeviceSubtaskSelect executionFlow(){
        set.add("execution_flow");
        return this;
    }

    public McUpdateDeviceSubtaskSelect excludeExecutionFlow(){
        excludeSet.add("execution_flow");
        return this;
    }

    public McUpdateDeviceSubtaskSelect avgExecutionFlow(){
        set.add("avg(execution_flow) as execution_flow");
        return this;
    }

    public McUpdateDeviceSubtaskSelect countExecutionFlow(){
        set.add("count(execution_flow) as execution_flow");
        return this;
    }

    public McUpdateDeviceSubtaskSelect minExecutionFlow(){
        set.add("min(execution_flow) as execution_flow");
        return this;
    }

    public McUpdateDeviceSubtaskSelect maxExecutionFlow(){
        set.add("max(execution_flow) as execution_flow");
        return this;
    }

    public McUpdateDeviceSubtaskSelect sumExecutionFlow(){
        set.add("sum(execution_flow) as execution_flow");
        return this;
    }
    public McUpdateDeviceSubtaskSelect status(){
        set.add("status");
        return this;
    }

    public McUpdateDeviceSubtaskSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public McUpdateDeviceSubtaskSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public McUpdateDeviceSubtaskSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public McUpdateDeviceSubtaskSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public McUpdateDeviceSubtaskSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public McUpdateDeviceSubtaskSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public McUpdateDeviceSubtaskSelect createTime(){
        set.add("create_time");
        return this;
    }

    public McUpdateDeviceSubtaskSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public McUpdateDeviceSubtaskSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceSubtaskSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceSubtaskSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceSubtaskSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceSubtaskSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public McUpdateDeviceSubtaskSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public McUpdateDeviceSubtaskSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public McUpdateDeviceSubtaskSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceSubtaskSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceSubtaskSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceSubtaskSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceSubtaskSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }

    boolean distinct=false;

     public McUpdateDeviceSubtaskSelect distinct(){
        this.distinct=true;
        return this;
    }

    public McUpdateDeviceSubtaskSelect includes(Consumer<Set<String>> other){
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
