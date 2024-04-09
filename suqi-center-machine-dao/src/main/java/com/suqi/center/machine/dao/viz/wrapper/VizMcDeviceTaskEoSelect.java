package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 机器任务表
 * </p>
 * "viz_mc_device_task"
 * @author 18374
 */
public class VizMcDeviceTaskEoSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public VizMcDeviceTaskEoSelect columns(){
        set.add("id");
        set.add("fk_viz_mc_task_id");
        set.add("fk_mc_machine_id");
        set.add("instance_id");
        set.add("device_id");
        set.add("execute_msg");
        set.add("job_id");
        set.add("begin_time");
        set.add("end_time");
        set.add("status");
        set.add("operate_sys_user_id");
        set.add("version_id");
        set.add("create_time");
        set.add("last_update_time");
        set.add("dr");
        return this;
    }

    public VizMcDeviceTaskEoSelect id(){
        set.add("id");
        return this;
    }

    public VizMcDeviceTaskEoSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public VizMcDeviceTaskEoSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public VizMcDeviceTaskEoSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public VizMcDeviceTaskEoSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public VizMcDeviceTaskEoSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public VizMcDeviceTaskEoSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public VizMcDeviceTaskEoSelect fkVizMcTaskId(){
        set.add("fk_viz_mc_task_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect excludeFkVizMcTaskId(){
        excludeSet.add("fk_viz_mc_task_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect avgFkVizMcTaskId(){
        set.add("avg(fk_viz_mc_task_id) as fk_viz_mc_task_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect countFkVizMcTaskId(){
        set.add("count(fk_viz_mc_task_id) as fk_viz_mc_task_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect minFkVizMcTaskId(){
        set.add("min(fk_viz_mc_task_id) as fk_viz_mc_task_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect maxFkVizMcTaskId(){
        set.add("max(fk_viz_mc_task_id) as fk_viz_mc_task_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect sumFkVizMcTaskId(){
        set.add("sum(fk_viz_mc_task_id) as fk_viz_mc_task_id");
        return this;
    }
    public VizMcDeviceTaskEoSelect fkMcMachineId(){
        set.add("fk_mc_machine_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect excludeFkMcMachineId(){
        excludeSet.add("fk_mc_machine_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect avgFkMcMachineId(){
        set.add("avg(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect countFkMcMachineId(){
        set.add("count(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect minFkMcMachineId(){
        set.add("min(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect maxFkMcMachineId(){
        set.add("max(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect sumFkMcMachineId(){
        set.add("sum(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }
    public VizMcDeviceTaskEoSelect instanceId(){
        set.add("instance_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect excludeInstanceId(){
        excludeSet.add("instance_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect avgInstanceId(){
        set.add("avg(instance_id) as instance_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect countInstanceId(){
        set.add("count(instance_id) as instance_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect minInstanceId(){
        set.add("min(instance_id) as instance_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect maxInstanceId(){
        set.add("max(instance_id) as instance_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect sumInstanceId(){
        set.add("sum(instance_id) as instance_id");
        return this;
    }
    public VizMcDeviceTaskEoSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public VizMcDeviceTaskEoSelect executeMsg(){
        set.add("execute_msg");
        return this;
    }

    public VizMcDeviceTaskEoSelect excludeExecuteMsg(){
        excludeSet.add("execute_msg");
        return this;
    }

    public VizMcDeviceTaskEoSelect avgExecuteMsg(){
        set.add("avg(execute_msg) as execute_msg");
        return this;
    }

    public VizMcDeviceTaskEoSelect countExecuteMsg(){
        set.add("count(execute_msg) as execute_msg");
        return this;
    }

    public VizMcDeviceTaskEoSelect minExecuteMsg(){
        set.add("min(execute_msg) as execute_msg");
        return this;
    }

    public VizMcDeviceTaskEoSelect maxExecuteMsg(){
        set.add("max(execute_msg) as execute_msg");
        return this;
    }

    public VizMcDeviceTaskEoSelect sumExecuteMsg(){
        set.add("sum(execute_msg) as execute_msg");
        return this;
    }
    public VizMcDeviceTaskEoSelect jobId(){
        set.add("job_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect excludeJobId(){
        excludeSet.add("job_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect avgJobId(){
        set.add("avg(job_id) as job_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect countJobId(){
        set.add("count(job_id) as job_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect minJobId(){
        set.add("min(job_id) as job_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect maxJobId(){
        set.add("max(job_id) as job_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect sumJobId(){
        set.add("sum(job_id) as job_id");
        return this;
    }
    public VizMcDeviceTaskEoSelect beginTime(){
        set.add("begin_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect excludeBeginTime(){
        excludeSet.add("begin_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect avgBeginTime(){
        set.add("avg(begin_time) as begin_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect countBeginTime(){
        set.add("count(begin_time) as begin_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect minBeginTime(){
        set.add("min(begin_time) as begin_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect maxBeginTime(){
        set.add("max(begin_time) as begin_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect sumBeginTime(){
        set.add("sum(begin_time) as begin_time");
        return this;
    }
    public VizMcDeviceTaskEoSelect endTime(){
        set.add("end_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect excludeEndTime(){
        excludeSet.add("end_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect avgEndTime(){
        set.add("avg(end_time) as end_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect countEndTime(){
        set.add("count(end_time) as end_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect minEndTime(){
        set.add("min(end_time) as end_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect maxEndTime(){
        set.add("max(end_time) as end_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect sumEndTime(){
        set.add("sum(end_time) as end_time");
        return this;
    }
    public VizMcDeviceTaskEoSelect status(){
        set.add("status");
        return this;
    }

    public VizMcDeviceTaskEoSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public VizMcDeviceTaskEoSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public VizMcDeviceTaskEoSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public VizMcDeviceTaskEoSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public VizMcDeviceTaskEoSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public VizMcDeviceTaskEoSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public VizMcDeviceTaskEoSelect operateSysUserId(){
        set.add("operate_sys_user_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect excludeOperateSysUserId(){
        excludeSet.add("operate_sys_user_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect avgOperateSysUserId(){
        set.add("avg(operate_sys_user_id) as operate_sys_user_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect countOperateSysUserId(){
        set.add("count(operate_sys_user_id) as operate_sys_user_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect minOperateSysUserId(){
        set.add("min(operate_sys_user_id) as operate_sys_user_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect maxOperateSysUserId(){
        set.add("max(operate_sys_user_id) as operate_sys_user_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect sumOperateSysUserId(){
        set.add("sum(operate_sys_user_id) as operate_sys_user_id");
        return this;
    }
    public VizMcDeviceTaskEoSelect versionId(){
        set.add("version_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public VizMcDeviceTaskEoSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public VizMcDeviceTaskEoSelect createTime(){
        set.add("create_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public VizMcDeviceTaskEoSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public VizMcDeviceTaskEoSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public VizMcDeviceTaskEoSelect dr(){
        set.add("dr");
        return this;
    }

    public VizMcDeviceTaskEoSelect excludeDr(){
        excludeSet.add("dr");
        return this;
    }

    public VizMcDeviceTaskEoSelect avgDr(){
        set.add("avg(dr) as dr");
        return this;
    }

    public VizMcDeviceTaskEoSelect countDr(){
        set.add("count(dr) as dr");
        return this;
    }

    public VizMcDeviceTaskEoSelect minDr(){
        set.add("min(dr) as dr");
        return this;
    }

    public VizMcDeviceTaskEoSelect maxDr(){
        set.add("max(dr) as dr");
        return this;
    }

    public VizMcDeviceTaskEoSelect sumDr(){
        set.add("sum(dr) as dr");
        return this;
    }

    boolean distinct=false;

     public VizMcDeviceTaskEoSelect distinct(){
        this.distinct=true;
        return this;
    }

    public VizMcDeviceTaskEoSelect includes(Consumer<Set<String>> other){
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
