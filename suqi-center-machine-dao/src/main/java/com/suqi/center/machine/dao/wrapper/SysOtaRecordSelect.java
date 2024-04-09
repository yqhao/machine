package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 
 * </p>
 * "sys_ota_record"
 * @author PC001
 */
public class SysOtaRecordSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public SysOtaRecordSelect columns(){
        set.add("id");
        set.add("fk_sys_ota_id");
        set.add("fk_sys_ota_obs_id");
        set.add("fk_em_soc_devices_id");
        set.add("type");
        set.add("device_id");
        set.add("status");
        set.add("create_time");
        set.add("last_update_time");
        set.add("version_id");
        set.add("execute_msg");
        set.add("task_start_time");
        set.add("job_id");
        set.add("fk_sys_ota_preinstalled_apps_id");
        set.add("start_time");
        set.add("wait_over_start_date");
        return this;
    }

    public SysOtaRecordSelect id(){
        set.add("id");
        return this;
    }

    public SysOtaRecordSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public SysOtaRecordSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public SysOtaRecordSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public SysOtaRecordSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public SysOtaRecordSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public SysOtaRecordSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public SysOtaRecordSelect fkSysOtaId(){
        set.add("fk_sys_ota_id");
        return this;
    }

    public SysOtaRecordSelect excludeFkSysOtaId(){
        excludeSet.add("fk_sys_ota_id");
        return this;
    }

    public SysOtaRecordSelect avgFkSysOtaId(){
        set.add("avg(fk_sys_ota_id) as fk_sys_ota_id");
        return this;
    }

    public SysOtaRecordSelect countFkSysOtaId(){
        set.add("count(fk_sys_ota_id) as fk_sys_ota_id");
        return this;
    }

    public SysOtaRecordSelect minFkSysOtaId(){
        set.add("min(fk_sys_ota_id) as fk_sys_ota_id");
        return this;
    }

    public SysOtaRecordSelect maxFkSysOtaId(){
        set.add("max(fk_sys_ota_id) as fk_sys_ota_id");
        return this;
    }

    public SysOtaRecordSelect sumFkSysOtaId(){
        set.add("sum(fk_sys_ota_id) as fk_sys_ota_id");
        return this;
    }
    public SysOtaRecordSelect fkSysOtaObsId(){
        set.add("fk_sys_ota_obs_id");
        return this;
    }

    public SysOtaRecordSelect excludeFkSysOtaObsId(){
        excludeSet.add("fk_sys_ota_obs_id");
        return this;
    }

    public SysOtaRecordSelect avgFkSysOtaObsId(){
        set.add("avg(fk_sys_ota_obs_id) as fk_sys_ota_obs_id");
        return this;
    }

    public SysOtaRecordSelect countFkSysOtaObsId(){
        set.add("count(fk_sys_ota_obs_id) as fk_sys_ota_obs_id");
        return this;
    }

    public SysOtaRecordSelect minFkSysOtaObsId(){
        set.add("min(fk_sys_ota_obs_id) as fk_sys_ota_obs_id");
        return this;
    }

    public SysOtaRecordSelect maxFkSysOtaObsId(){
        set.add("max(fk_sys_ota_obs_id) as fk_sys_ota_obs_id");
        return this;
    }

    public SysOtaRecordSelect sumFkSysOtaObsId(){
        set.add("sum(fk_sys_ota_obs_id) as fk_sys_ota_obs_id");
        return this;
    }
    public SysOtaRecordSelect fkEmSocDevicesId(){
        set.add("fk_em_soc_devices_id");
        return this;
    }

    public SysOtaRecordSelect excludeFkEmSocDevicesId(){
        excludeSet.add("fk_em_soc_devices_id");
        return this;
    }

    public SysOtaRecordSelect avgFkEmSocDevicesId(){
        set.add("avg(fk_em_soc_devices_id) as fk_em_soc_devices_id");
        return this;
    }

    public SysOtaRecordSelect countFkEmSocDevicesId(){
        set.add("count(fk_em_soc_devices_id) as fk_em_soc_devices_id");
        return this;
    }

    public SysOtaRecordSelect minFkEmSocDevicesId(){
        set.add("min(fk_em_soc_devices_id) as fk_em_soc_devices_id");
        return this;
    }

    public SysOtaRecordSelect maxFkEmSocDevicesId(){
        set.add("max(fk_em_soc_devices_id) as fk_em_soc_devices_id");
        return this;
    }

    public SysOtaRecordSelect sumFkEmSocDevicesId(){
        set.add("sum(fk_em_soc_devices_id) as fk_em_soc_devices_id");
        return this;
    }
    public SysOtaRecordSelect type(){
        set.add("type");
        return this;
    }

    public SysOtaRecordSelect excludeType(){
        excludeSet.add("type");
        return this;
    }

    public SysOtaRecordSelect avgType(){
        set.add("avg(type) as type");
        return this;
    }

    public SysOtaRecordSelect countType(){
        set.add("count(type) as type");
        return this;
    }

    public SysOtaRecordSelect minType(){
        set.add("min(type) as type");
        return this;
    }

    public SysOtaRecordSelect maxType(){
        set.add("max(type) as type");
        return this;
    }

    public SysOtaRecordSelect sumType(){
        set.add("sum(type) as type");
        return this;
    }
    public SysOtaRecordSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public SysOtaRecordSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public SysOtaRecordSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public SysOtaRecordSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public SysOtaRecordSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public SysOtaRecordSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public SysOtaRecordSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public SysOtaRecordSelect status(){
        set.add("status");
        return this;
    }

    public SysOtaRecordSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public SysOtaRecordSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public SysOtaRecordSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public SysOtaRecordSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public SysOtaRecordSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public SysOtaRecordSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public SysOtaRecordSelect createTime(){
        set.add("create_time");
        return this;
    }

    public SysOtaRecordSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public SysOtaRecordSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public SysOtaRecordSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public SysOtaRecordSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public SysOtaRecordSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public SysOtaRecordSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public SysOtaRecordSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public SysOtaRecordSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public SysOtaRecordSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public SysOtaRecordSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public SysOtaRecordSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public SysOtaRecordSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public SysOtaRecordSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public SysOtaRecordSelect versionId(){
        set.add("version_id");
        return this;
    }

    public SysOtaRecordSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public SysOtaRecordSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public SysOtaRecordSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public SysOtaRecordSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public SysOtaRecordSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public SysOtaRecordSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public SysOtaRecordSelect executeMsg(){
        set.add("execute_msg");
        return this;
    }

    public SysOtaRecordSelect excludeExecuteMsg(){
        excludeSet.add("execute_msg");
        return this;
    }

    public SysOtaRecordSelect avgExecuteMsg(){
        set.add("avg(execute_msg) as execute_msg");
        return this;
    }

    public SysOtaRecordSelect countExecuteMsg(){
        set.add("count(execute_msg) as execute_msg");
        return this;
    }

    public SysOtaRecordSelect minExecuteMsg(){
        set.add("min(execute_msg) as execute_msg");
        return this;
    }

    public SysOtaRecordSelect maxExecuteMsg(){
        set.add("max(execute_msg) as execute_msg");
        return this;
    }

    public SysOtaRecordSelect sumExecuteMsg(){
        set.add("sum(execute_msg) as execute_msg");
        return this;
    }
    public SysOtaRecordSelect taskStartTime(){
        set.add("task_start_time");
        return this;
    }

    public SysOtaRecordSelect excludeTaskStartTime(){
        excludeSet.add("task_start_time");
        return this;
    }

    public SysOtaRecordSelect avgTaskStartTime(){
        set.add("avg(task_start_time) as task_start_time");
        return this;
    }

    public SysOtaRecordSelect countTaskStartTime(){
        set.add("count(task_start_time) as task_start_time");
        return this;
    }

    public SysOtaRecordSelect minTaskStartTime(){
        set.add("min(task_start_time) as task_start_time");
        return this;
    }

    public SysOtaRecordSelect maxTaskStartTime(){
        set.add("max(task_start_time) as task_start_time");
        return this;
    }

    public SysOtaRecordSelect sumTaskStartTime(){
        set.add("sum(task_start_time) as task_start_time");
        return this;
    }
    public SysOtaRecordSelect jobId(){
        set.add("job_id");
        return this;
    }

    public SysOtaRecordSelect excludeJobId(){
        excludeSet.add("job_id");
        return this;
    }

    public SysOtaRecordSelect avgJobId(){
        set.add("avg(job_id) as job_id");
        return this;
    }

    public SysOtaRecordSelect countJobId(){
        set.add("count(job_id) as job_id");
        return this;
    }

    public SysOtaRecordSelect minJobId(){
        set.add("min(job_id) as job_id");
        return this;
    }

    public SysOtaRecordSelect maxJobId(){
        set.add("max(job_id) as job_id");
        return this;
    }

    public SysOtaRecordSelect sumJobId(){
        set.add("sum(job_id) as job_id");
        return this;
    }
    public SysOtaRecordSelect fkSysOtaPreinstalledAppsId(){
        set.add("fk_sys_ota_preinstalled_apps_id");
        return this;
    }

    public SysOtaRecordSelect excludeFkSysOtaPreinstalledAppsId(){
        excludeSet.add("fk_sys_ota_preinstalled_apps_id");
        return this;
    }

    public SysOtaRecordSelect avgFkSysOtaPreinstalledAppsId(){
        set.add("avg(fk_sys_ota_preinstalled_apps_id) as fk_sys_ota_preinstalled_apps_id");
        return this;
    }

    public SysOtaRecordSelect countFkSysOtaPreinstalledAppsId(){
        set.add("count(fk_sys_ota_preinstalled_apps_id) as fk_sys_ota_preinstalled_apps_id");
        return this;
    }

    public SysOtaRecordSelect minFkSysOtaPreinstalledAppsId(){
        set.add("min(fk_sys_ota_preinstalled_apps_id) as fk_sys_ota_preinstalled_apps_id");
        return this;
    }

    public SysOtaRecordSelect maxFkSysOtaPreinstalledAppsId(){
        set.add("max(fk_sys_ota_preinstalled_apps_id) as fk_sys_ota_preinstalled_apps_id");
        return this;
    }

    public SysOtaRecordSelect sumFkSysOtaPreinstalledAppsId(){
        set.add("sum(fk_sys_ota_preinstalled_apps_id) as fk_sys_ota_preinstalled_apps_id");
        return this;
    }
    public SysOtaRecordSelect startTime(){
        set.add("start_time");
        return this;
    }

    public SysOtaRecordSelect excludeStartTime(){
        excludeSet.add("start_time");
        return this;
    }

    public SysOtaRecordSelect avgStartTime(){
        set.add("avg(start_time) as start_time");
        return this;
    }

    public SysOtaRecordSelect countStartTime(){
        set.add("count(start_time) as start_time");
        return this;
    }

    public SysOtaRecordSelect minStartTime(){
        set.add("min(start_time) as start_time");
        return this;
    }

    public SysOtaRecordSelect maxStartTime(){
        set.add("max(start_time) as start_time");
        return this;
    }

    public SysOtaRecordSelect sumStartTime(){
        set.add("sum(start_time) as start_time");
        return this;
    }
    public SysOtaRecordSelect waitOverStartDate(){
        set.add("wait_over_start_date");
        return this;
    }

    public SysOtaRecordSelect excludeWaitOverStartDate(){
        excludeSet.add("wait_over_start_date");
        return this;
    }

    public SysOtaRecordSelect avgWaitOverStartDate(){
        set.add("avg(wait_over_start_date) as wait_over_start_date");
        return this;
    }

    public SysOtaRecordSelect countWaitOverStartDate(){
        set.add("count(wait_over_start_date) as wait_over_start_date");
        return this;
    }

    public SysOtaRecordSelect minWaitOverStartDate(){
        set.add("min(wait_over_start_date) as wait_over_start_date");
        return this;
    }

    public SysOtaRecordSelect maxWaitOverStartDate(){
        set.add("max(wait_over_start_date) as wait_over_start_date");
        return this;
    }

    public SysOtaRecordSelect sumWaitOverStartDate(){
        set.add("sum(wait_over_start_date) as wait_over_start_date");
        return this;
    }

    boolean distinct=false;

     public SysOtaRecordSelect distinct(){
        this.distinct=true;
        return this;
    }

    public SysOtaRecordSelect includes(Consumer<Set<String>> other){
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
