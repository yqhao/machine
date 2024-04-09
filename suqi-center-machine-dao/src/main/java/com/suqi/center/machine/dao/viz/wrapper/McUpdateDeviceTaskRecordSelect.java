package com.suqi.center.machine.dao.viz.wrapper;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 机器更新任务记录表
 * </p>
 * "mc_update_device_task_record"
 * @author 18374
 */
public class McUpdateDeviceTaskRecordSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public McUpdateDeviceTaskRecordSelect columns(){
        set.add("id");
        set.add("fk_mc_server_software_package_id");
        set.add("fk_mc_update_device_task_id");
        set.add("fk_mc_machine_id");
        set.add("fk_mc_update_device_subtask_record_id");
        set.add("type");
        set.add("device_id");
        set.add("instance_id");
        set.add("execute_msg");
        set.add("task_start_time");
        set.add("wait_over_start_date");
        set.add("start_time");
        set.add("status");
        set.add("version_id");
        set.add("create_time");
        set.add("last_update_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect id(){
        set.add("id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public McUpdateDeviceTaskRecordSelect fkMcServerSoftwarePackageId(){
        set.add("fk_mc_server_software_package_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeFkMcServerSoftwarePackageId(){
        excludeSet.add("fk_mc_server_software_package_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgFkMcServerSoftwarePackageId(){
        set.add("avg(fk_mc_server_software_package_id) as fk_mc_server_software_package_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countFkMcServerSoftwarePackageId(){
        set.add("count(fk_mc_server_software_package_id) as fk_mc_server_software_package_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minFkMcServerSoftwarePackageId(){
        set.add("min(fk_mc_server_software_package_id) as fk_mc_server_software_package_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxFkMcServerSoftwarePackageId(){
        set.add("max(fk_mc_server_software_package_id) as fk_mc_server_software_package_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumFkMcServerSoftwarePackageId(){
        set.add("sum(fk_mc_server_software_package_id) as fk_mc_server_software_package_id");
        return this;
    }
    public McUpdateDeviceTaskRecordSelect fkMcUpdateDeviceTaskId(){
        set.add("fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeFkMcUpdateDeviceTaskId(){
        excludeSet.add("fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgFkMcUpdateDeviceTaskId(){
        set.add("avg(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countFkMcUpdateDeviceTaskId(){
        set.add("count(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minFkMcUpdateDeviceTaskId(){
        set.add("min(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxFkMcUpdateDeviceTaskId(){
        set.add("max(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumFkMcUpdateDeviceTaskId(){
        set.add("sum(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }
    public McUpdateDeviceTaskRecordSelect fkMcMachineId(){
        set.add("fk_mc_machine_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeFkMcMachineId(){
        excludeSet.add("fk_mc_machine_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgFkMcMachineId(){
        set.add("avg(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countFkMcMachineId(){
        set.add("count(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minFkMcMachineId(){
        set.add("min(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxFkMcMachineId(){
        set.add("max(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumFkMcMachineId(){
        set.add("sum(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }
    public McUpdateDeviceTaskRecordSelect fkMcUpdateDeviceSubtaskRecordId(){
        set.add("fk_mc_update_device_subtask_record_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeFkMcUpdateDeviceSubtaskRecordId(){
        excludeSet.add("fk_mc_update_device_subtask_record_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgFkMcUpdateDeviceSubtaskRecordId(){
        set.add("avg(fk_mc_update_device_subtask_record_id) as fk_mc_update_device_subtask_record_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countFkMcUpdateDeviceSubtaskRecordId(){
        set.add("count(fk_mc_update_device_subtask_record_id) as fk_mc_update_device_subtask_record_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minFkMcUpdateDeviceSubtaskRecordId(){
        set.add("min(fk_mc_update_device_subtask_record_id) as fk_mc_update_device_subtask_record_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxFkMcUpdateDeviceSubtaskRecordId(){
        set.add("max(fk_mc_update_device_subtask_record_id) as fk_mc_update_device_subtask_record_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumFkMcUpdateDeviceSubtaskRecordId(){
        set.add("sum(fk_mc_update_device_subtask_record_id) as fk_mc_update_device_subtask_record_id");
        return this;
    }
    public McUpdateDeviceTaskRecordSelect type(){
        set.add("type");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeType(){
        excludeSet.add("type");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgType(){
        set.add("avg(type) as type");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countType(){
        set.add("count(type) as type");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minType(){
        set.add("min(type) as type");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxType(){
        set.add("max(type) as type");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumType(){
        set.add("sum(type) as type");
        return this;
    }
    public McUpdateDeviceTaskRecordSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public McUpdateDeviceTaskRecordSelect instanceId(){
        set.add("instance_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeInstanceId(){
        excludeSet.add("instance_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgInstanceId(){
        set.add("avg(instance_id) as instance_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countInstanceId(){
        set.add("count(instance_id) as instance_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minInstanceId(){
        set.add("min(instance_id) as instance_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxInstanceId(){
        set.add("max(instance_id) as instance_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumInstanceId(){
        set.add("sum(instance_id) as instance_id");
        return this;
    }
    public McUpdateDeviceTaskRecordSelect executeMsg(){
        set.add("execute_msg");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeExecuteMsg(){
        excludeSet.add("execute_msg");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgExecuteMsg(){
        set.add("avg(execute_msg) as execute_msg");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countExecuteMsg(){
        set.add("count(execute_msg) as execute_msg");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minExecuteMsg(){
        set.add("min(execute_msg) as execute_msg");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxExecuteMsg(){
        set.add("max(execute_msg) as execute_msg");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumExecuteMsg(){
        set.add("sum(execute_msg) as execute_msg");
        return this;
    }
    public McUpdateDeviceTaskRecordSelect taskStartTime(){
        set.add("task_start_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeTaskStartTime(){
        excludeSet.add("task_start_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgTaskStartTime(){
        set.add("avg(task_start_time) as task_start_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countTaskStartTime(){
        set.add("count(task_start_time) as task_start_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minTaskStartTime(){
        set.add("min(task_start_time) as task_start_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxTaskStartTime(){
        set.add("max(task_start_time) as task_start_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumTaskStartTime(){
        set.add("sum(task_start_time) as task_start_time");
        return this;
    }
    public McUpdateDeviceTaskRecordSelect waitOverStartDate(){
        set.add("wait_over_start_date");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeWaitOverStartDate(){
        excludeSet.add("wait_over_start_date");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgWaitOverStartDate(){
        set.add("avg(wait_over_start_date) as wait_over_start_date");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countWaitOverStartDate(){
        set.add("count(wait_over_start_date) as wait_over_start_date");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minWaitOverStartDate(){
        set.add("min(wait_over_start_date) as wait_over_start_date");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxWaitOverStartDate(){
        set.add("max(wait_over_start_date) as wait_over_start_date");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumWaitOverStartDate(){
        set.add("sum(wait_over_start_date) as wait_over_start_date");
        return this;
    }
    public McUpdateDeviceTaskRecordSelect startTime(){
        set.add("start_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeStartTime(){
        excludeSet.add("start_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgStartTime(){
        set.add("avg(start_time) as start_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countStartTime(){
        set.add("count(start_time) as start_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minStartTime(){
        set.add("min(start_time) as start_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxStartTime(){
        set.add("max(start_time) as start_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumStartTime(){
        set.add("sum(start_time) as start_time");
        return this;
    }
    public McUpdateDeviceTaskRecordSelect status(){
        set.add("status");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public McUpdateDeviceTaskRecordSelect versionId(){
        set.add("version_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public McUpdateDeviceTaskRecordSelect createTime(){
        set.add("create_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public McUpdateDeviceTaskRecordSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceTaskRecordSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }

    boolean distinct=false;

     public McUpdateDeviceTaskRecordSelect distinct(){
        this.distinct=true;
        return this;
    }

    public McUpdateDeviceTaskRecordSelect includes(Consumer<Set<String>> other){
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
