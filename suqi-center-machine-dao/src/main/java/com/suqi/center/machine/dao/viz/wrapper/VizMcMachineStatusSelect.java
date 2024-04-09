package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 机器状态表
 * </p>
 * "viz_mc_machine_status"
 * @author 18374
 */
public class VizMcMachineStatusSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public VizMcMachineStatusSelect columns(){
        set.add("id");
        set.add("fk_mc_machine_id");
        set.add("device_id");
        set.add("instance_id");
        set.add("running_status");
        set.add("health_status");
        set.add("streaming_status");
        set.add("maint_status");
        set.add("is_reseting");
        set.add("is_user_save");
        set.add("is_ota_upgrade");
        set.add("hang_up_status");
        set.add("restart_status");
        set.add("root_access");
        set.add("version_id");
        set.add("create_time");
        set.add("last_update_time");
        return this;
    }

    public VizMcMachineStatusSelect id(){
        set.add("id");
        return this;
    }

    public VizMcMachineStatusSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public VizMcMachineStatusSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public VizMcMachineStatusSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public VizMcMachineStatusSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public VizMcMachineStatusSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public VizMcMachineStatusSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public VizMcMachineStatusSelect fkMcMachineId(){
        set.add("fk_mc_machine_id");
        return this;
    }

    public VizMcMachineStatusSelect excludeFkMcMachineId(){
        excludeSet.add("fk_mc_machine_id");
        return this;
    }

    public VizMcMachineStatusSelect avgFkMcMachineId(){
        set.add("avg(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineStatusSelect countFkMcMachineId(){
        set.add("count(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineStatusSelect minFkMcMachineId(){
        set.add("min(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineStatusSelect maxFkMcMachineId(){
        set.add("max(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineStatusSelect sumFkMcMachineId(){
        set.add("sum(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }
    public VizMcMachineStatusSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public VizMcMachineStatusSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public VizMcMachineStatusSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public VizMcMachineStatusSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public VizMcMachineStatusSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public VizMcMachineStatusSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public VizMcMachineStatusSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public VizMcMachineStatusSelect instanceId(){
        set.add("instance_id");
        return this;
    }

    public VizMcMachineStatusSelect excludeInstanceId(){
        excludeSet.add("instance_id");
        return this;
    }

    public VizMcMachineStatusSelect avgInstanceId(){
        set.add("avg(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineStatusSelect countInstanceId(){
        set.add("count(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineStatusSelect minInstanceId(){
        set.add("min(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineStatusSelect maxInstanceId(){
        set.add("max(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineStatusSelect sumInstanceId(){
        set.add("sum(instance_id) as instance_id");
        return this;
    }
    public VizMcMachineStatusSelect runningStatus(){
        set.add("running_status");
        return this;
    }

    public VizMcMachineStatusSelect excludeRunningStatus(){
        excludeSet.add("running_status");
        return this;
    }

    public VizMcMachineStatusSelect avgRunningStatus(){
        set.add("avg(running_status) as running_status");
        return this;
    }

    public VizMcMachineStatusSelect countRunningStatus(){
        set.add("count(running_status) as running_status");
        return this;
    }

    public VizMcMachineStatusSelect minRunningStatus(){
        set.add("min(running_status) as running_status");
        return this;
    }

    public VizMcMachineStatusSelect maxRunningStatus(){
        set.add("max(running_status) as running_status");
        return this;
    }

    public VizMcMachineStatusSelect sumRunningStatus(){
        set.add("sum(running_status) as running_status");
        return this;
    }
    public VizMcMachineStatusSelect healthStatus(){
        set.add("health_status");
        return this;
    }

    public VizMcMachineStatusSelect excludeHealthStatus(){
        excludeSet.add("health_status");
        return this;
    }

    public VizMcMachineStatusSelect avgHealthStatus(){
        set.add("avg(health_status) as health_status");
        return this;
    }

    public VizMcMachineStatusSelect countHealthStatus(){
        set.add("count(health_status) as health_status");
        return this;
    }

    public VizMcMachineStatusSelect minHealthStatus(){
        set.add("min(health_status) as health_status");
        return this;
    }

    public VizMcMachineStatusSelect maxHealthStatus(){
        set.add("max(health_status) as health_status");
        return this;
    }

    public VizMcMachineStatusSelect sumHealthStatus(){
        set.add("sum(health_status) as health_status");
        return this;
    }
    public VizMcMachineStatusSelect streamingStatus(){
        set.add("streaming_status");
        return this;
    }

    public VizMcMachineStatusSelect excludeStreamingStatus(){
        excludeSet.add("streaming_status");
        return this;
    }

    public VizMcMachineStatusSelect avgStreamingStatus(){
        set.add("avg(streaming_status) as streaming_status");
        return this;
    }

    public VizMcMachineStatusSelect countStreamingStatus(){
        set.add("count(streaming_status) as streaming_status");
        return this;
    }

    public VizMcMachineStatusSelect minStreamingStatus(){
        set.add("min(streaming_status) as streaming_status");
        return this;
    }

    public VizMcMachineStatusSelect maxStreamingStatus(){
        set.add("max(streaming_status) as streaming_status");
        return this;
    }

    public VizMcMachineStatusSelect sumStreamingStatus(){
        set.add("sum(streaming_status) as streaming_status");
        return this;
    }
    public VizMcMachineStatusSelect maintStatus(){
        set.add("maint_status");
        return this;
    }

    public VizMcMachineStatusSelect excludeMaintStatus(){
        excludeSet.add("maint_status");
        return this;
    }

    public VizMcMachineStatusSelect avgMaintStatus(){
        set.add("avg(maint_status) as maint_status");
        return this;
    }

    public VizMcMachineStatusSelect countMaintStatus(){
        set.add("count(maint_status) as maint_status");
        return this;
    }

    public VizMcMachineStatusSelect minMaintStatus(){
        set.add("min(maint_status) as maint_status");
        return this;
    }

    public VizMcMachineStatusSelect maxMaintStatus(){
        set.add("max(maint_status) as maint_status");
        return this;
    }

    public VizMcMachineStatusSelect sumMaintStatus(){
        set.add("sum(maint_status) as maint_status");
        return this;
    }
    public VizMcMachineStatusSelect isReseting(){
        set.add("is_reseting");
        return this;
    }

    public VizMcMachineStatusSelect excludeIsReseting(){
        excludeSet.add("is_reseting");
        return this;
    }

    public VizMcMachineStatusSelect avgIsReseting(){
        set.add("avg(is_reseting) as is_reseting");
        return this;
    }

    public VizMcMachineStatusSelect countIsReseting(){
        set.add("count(is_reseting) as is_reseting");
        return this;
    }

    public VizMcMachineStatusSelect minIsReseting(){
        set.add("min(is_reseting) as is_reseting");
        return this;
    }

    public VizMcMachineStatusSelect maxIsReseting(){
        set.add("max(is_reseting) as is_reseting");
        return this;
    }

    public VizMcMachineStatusSelect sumIsReseting(){
        set.add("sum(is_reseting) as is_reseting");
        return this;
    }
    public VizMcMachineStatusSelect isUserSave(){
        set.add("is_user_save");
        return this;
    }

    public VizMcMachineStatusSelect excludeIsUserSave(){
        excludeSet.add("is_user_save");
        return this;
    }

    public VizMcMachineStatusSelect avgIsUserSave(){
        set.add("avg(is_user_save) as is_user_save");
        return this;
    }

    public VizMcMachineStatusSelect countIsUserSave(){
        set.add("count(is_user_save) as is_user_save");
        return this;
    }

    public VizMcMachineStatusSelect minIsUserSave(){
        set.add("min(is_user_save) as is_user_save");
        return this;
    }

    public VizMcMachineStatusSelect maxIsUserSave(){
        set.add("max(is_user_save) as is_user_save");
        return this;
    }

    public VizMcMachineStatusSelect sumIsUserSave(){
        set.add("sum(is_user_save) as is_user_save");
        return this;
    }
    public VizMcMachineStatusSelect isOtaUpgrade(){
        set.add("is_ota_upgrade");
        return this;
    }

    public VizMcMachineStatusSelect excludeIsOtaUpgrade(){
        excludeSet.add("is_ota_upgrade");
        return this;
    }

    public VizMcMachineStatusSelect avgIsOtaUpgrade(){
        set.add("avg(is_ota_upgrade) as is_ota_upgrade");
        return this;
    }

    public VizMcMachineStatusSelect countIsOtaUpgrade(){
        set.add("count(is_ota_upgrade) as is_ota_upgrade");
        return this;
    }

    public VizMcMachineStatusSelect minIsOtaUpgrade(){
        set.add("min(is_ota_upgrade) as is_ota_upgrade");
        return this;
    }

    public VizMcMachineStatusSelect maxIsOtaUpgrade(){
        set.add("max(is_ota_upgrade) as is_ota_upgrade");
        return this;
    }

    public VizMcMachineStatusSelect sumIsOtaUpgrade(){
        set.add("sum(is_ota_upgrade) as is_ota_upgrade");
        return this;
    }
    public VizMcMachineStatusSelect hangUpStatus(){
        set.add("hang_up_status");
        return this;
    }

    public VizMcMachineStatusSelect excludeHangUpStatus(){
        excludeSet.add("hang_up_status");
        return this;
    }

    public VizMcMachineStatusSelect avgHangUpStatus(){
        set.add("avg(hang_up_status) as hang_up_status");
        return this;
    }

    public VizMcMachineStatusSelect countHangUpStatus(){
        set.add("count(hang_up_status) as hang_up_status");
        return this;
    }

    public VizMcMachineStatusSelect minHangUpStatus(){
        set.add("min(hang_up_status) as hang_up_status");
        return this;
    }

    public VizMcMachineStatusSelect maxHangUpStatus(){
        set.add("max(hang_up_status) as hang_up_status");
        return this;
    }

    public VizMcMachineStatusSelect sumHangUpStatus(){
        set.add("sum(hang_up_status) as hang_up_status");
        return this;
    }
    public VizMcMachineStatusSelect restartStatus(){
        set.add("restart_status");
        return this;
    }

    public VizMcMachineStatusSelect excludeRestartStatus(){
        excludeSet.add("restart_status");
        return this;
    }

    public VizMcMachineStatusSelect avgRestartStatus(){
        set.add("avg(restart_status) as restart_status");
        return this;
    }

    public VizMcMachineStatusSelect countRestartStatus(){
        set.add("count(restart_status) as restart_status");
        return this;
    }

    public VizMcMachineStatusSelect minRestartStatus(){
        set.add("min(restart_status) as restart_status");
        return this;
    }

    public VizMcMachineStatusSelect maxRestartStatus(){
        set.add("max(restart_status) as restart_status");
        return this;
    }

    public VizMcMachineStatusSelect sumRestartStatus(){
        set.add("sum(restart_status) as restart_status");
        return this;
    }
    public VizMcMachineStatusSelect rootAccess(){
        set.add("root_access");
        return this;
    }

    public VizMcMachineStatusSelect excludeRootAccess(){
        excludeSet.add("root_access");
        return this;
    }

    public VizMcMachineStatusSelect avgRootAccess(){
        set.add("avg(root_access) as root_access");
        return this;
    }

    public VizMcMachineStatusSelect countRootAccess(){
        set.add("count(root_access) as root_access");
        return this;
    }

    public VizMcMachineStatusSelect minRootAccess(){
        set.add("min(root_access) as root_access");
        return this;
    }

    public VizMcMachineStatusSelect maxRootAccess(){
        set.add("max(root_access) as root_access");
        return this;
    }

    public VizMcMachineStatusSelect sumRootAccess(){
        set.add("sum(root_access) as root_access");
        return this;
    }
    public VizMcMachineStatusSelect versionId(){
        set.add("version_id");
        return this;
    }

    public VizMcMachineStatusSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public VizMcMachineStatusSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public VizMcMachineStatusSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public VizMcMachineStatusSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public VizMcMachineStatusSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public VizMcMachineStatusSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public VizMcMachineStatusSelect createTime(){
        set.add("create_time");
        return this;
    }

    public VizMcMachineStatusSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public VizMcMachineStatusSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public VizMcMachineStatusSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public VizMcMachineStatusSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public VizMcMachineStatusSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public VizMcMachineStatusSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public VizMcMachineStatusSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public VizMcMachineStatusSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public VizMcMachineStatusSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public VizMcMachineStatusSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public VizMcMachineStatusSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public VizMcMachineStatusSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public VizMcMachineStatusSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }

    boolean distinct=false;

     public VizMcMachineStatusSelect distinct(){
        this.distinct=true;
        return this;
    }

    public VizMcMachineStatusSelect includes(Consumer<Set<String>> other){
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
