package com.suqi.center.machine.dao.viz.wrapper;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 更新机器任务表
 * </p>
 * "mc_update_device_task"
 * @author 18374
 */
public class McUpdateDeviceTaskSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public McUpdateDeviceTaskSelect columns(){
        set.add("id");
        set.add("fk_mc_server_software_package_id");
        set.add("name");
        set.add("image_id");
        set.add("property");
        set.add("chmod");
        set.add("command");
        set.add("start_time");
        set.add("overtime_time");
        set.add("wait_start_over_time");
        set.add("status");
        set.add("version_id");
        set.add("create_time");
        set.add("last_update_time");
        return this;
    }

    public McUpdateDeviceTaskSelect id(){
        set.add("id");
        return this;
    }

    public McUpdateDeviceTaskSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public McUpdateDeviceTaskSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public McUpdateDeviceTaskSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public McUpdateDeviceTaskSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public McUpdateDeviceTaskSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public McUpdateDeviceTaskSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public McUpdateDeviceTaskSelect fkMcServerSoftwarePackageId(){
        set.add("fk_mc_server_software_package_id");
        return this;
    }

    public McUpdateDeviceTaskSelect excludeFkMcServerSoftwarePackageId(){
        excludeSet.add("fk_mc_server_software_package_id");
        return this;
    }

    public McUpdateDeviceTaskSelect avgFkMcServerSoftwarePackageId(){
        set.add("avg(fk_mc_server_software_package_id) as fk_mc_server_software_package_id");
        return this;
    }

    public McUpdateDeviceTaskSelect countFkMcServerSoftwarePackageId(){
        set.add("count(fk_mc_server_software_package_id) as fk_mc_server_software_package_id");
        return this;
    }

    public McUpdateDeviceTaskSelect minFkMcServerSoftwarePackageId(){
        set.add("min(fk_mc_server_software_package_id) as fk_mc_server_software_package_id");
        return this;
    }

    public McUpdateDeviceTaskSelect maxFkMcServerSoftwarePackageId(){
        set.add("max(fk_mc_server_software_package_id) as fk_mc_server_software_package_id");
        return this;
    }

    public McUpdateDeviceTaskSelect sumFkMcServerSoftwarePackageId(){
        set.add("sum(fk_mc_server_software_package_id) as fk_mc_server_software_package_id");
        return this;
    }
    public McUpdateDeviceTaskSelect name(){
        set.add("name");
        return this;
    }

    public McUpdateDeviceTaskSelect excludeName(){
        excludeSet.add("name");
        return this;
    }

    public McUpdateDeviceTaskSelect avgName(){
        set.add("avg(name) as name");
        return this;
    }

    public McUpdateDeviceTaskSelect countName(){
        set.add("count(name) as name");
        return this;
    }

    public McUpdateDeviceTaskSelect minName(){
        set.add("min(name) as name");
        return this;
    }

    public McUpdateDeviceTaskSelect maxName(){
        set.add("max(name) as name");
        return this;
    }

    public McUpdateDeviceTaskSelect sumName(){
        set.add("sum(name) as name");
        return this;
    }
    public McUpdateDeviceTaskSelect imageId(){
        set.add("image_id");
        return this;
    }

    public McUpdateDeviceTaskSelect excludeImageId(){
        excludeSet.add("image_id");
        return this;
    }

    public McUpdateDeviceTaskSelect avgImageId(){
        set.add("avg(image_id) as image_id");
        return this;
    }

    public McUpdateDeviceTaskSelect countImageId(){
        set.add("count(image_id) as image_id");
        return this;
    }

    public McUpdateDeviceTaskSelect minImageId(){
        set.add("min(image_id) as image_id");
        return this;
    }

    public McUpdateDeviceTaskSelect maxImageId(){
        set.add("max(image_id) as image_id");
        return this;
    }

    public McUpdateDeviceTaskSelect sumImageId(){
        set.add("sum(image_id) as image_id");
        return this;
    }
    public McUpdateDeviceTaskSelect property(){
        set.add("property");
        return this;
    }

    public McUpdateDeviceTaskSelect excludeProperty(){
        excludeSet.add("property");
        return this;
    }

    public McUpdateDeviceTaskSelect avgProperty(){
        set.add("avg(property) as property");
        return this;
    }

    public McUpdateDeviceTaskSelect countProperty(){
        set.add("count(property) as property");
        return this;
    }

    public McUpdateDeviceTaskSelect minProperty(){
        set.add("min(property) as property");
        return this;
    }

    public McUpdateDeviceTaskSelect maxProperty(){
        set.add("max(property) as property");
        return this;
    }

    public McUpdateDeviceTaskSelect sumProperty(){
        set.add("sum(property) as property");
        return this;
    }
    public McUpdateDeviceTaskSelect chmod(){
        set.add("chmod");
        return this;
    }

    public McUpdateDeviceTaskSelect excludeChmod(){
        excludeSet.add("chmod");
        return this;
    }

    public McUpdateDeviceTaskSelect avgChmod(){
        set.add("avg(chmod) as chmod");
        return this;
    }

    public McUpdateDeviceTaskSelect countChmod(){
        set.add("count(chmod) as chmod");
        return this;
    }

    public McUpdateDeviceTaskSelect minChmod(){
        set.add("min(chmod) as chmod");
        return this;
    }

    public McUpdateDeviceTaskSelect maxChmod(){
        set.add("max(chmod) as chmod");
        return this;
    }

    public McUpdateDeviceTaskSelect sumChmod(){
        set.add("sum(chmod) as chmod");
        return this;
    }
    public McUpdateDeviceTaskSelect command(){
        set.add("command");
        return this;
    }

    public McUpdateDeviceTaskSelect excludeCommand(){
        excludeSet.add("command");
        return this;
    }

    public McUpdateDeviceTaskSelect avgCommand(){
        set.add("avg(command) as command");
        return this;
    }

    public McUpdateDeviceTaskSelect countCommand(){
        set.add("count(command) as command");
        return this;
    }

    public McUpdateDeviceTaskSelect minCommand(){
        set.add("min(command) as command");
        return this;
    }

    public McUpdateDeviceTaskSelect maxCommand(){
        set.add("max(command) as command");
        return this;
    }

    public McUpdateDeviceTaskSelect sumCommand(){
        set.add("sum(command) as command");
        return this;
    }
    public McUpdateDeviceTaskSelect startTime(){
        set.add("start_time");
        return this;
    }

    public McUpdateDeviceTaskSelect excludeStartTime(){
        excludeSet.add("start_time");
        return this;
    }

    public McUpdateDeviceTaskSelect avgStartTime(){
        set.add("avg(start_time) as start_time");
        return this;
    }

    public McUpdateDeviceTaskSelect countStartTime(){
        set.add("count(start_time) as start_time");
        return this;
    }

    public McUpdateDeviceTaskSelect minStartTime(){
        set.add("min(start_time) as start_time");
        return this;
    }

    public McUpdateDeviceTaskSelect maxStartTime(){
        set.add("max(start_time) as start_time");
        return this;
    }

    public McUpdateDeviceTaskSelect sumStartTime(){
        set.add("sum(start_time) as start_time");
        return this;
    }
    public McUpdateDeviceTaskSelect overtimeTime(){
        set.add("overtime_time");
        return this;
    }

    public McUpdateDeviceTaskSelect excludeOvertimeTime(){
        excludeSet.add("overtime_time");
        return this;
    }

    public McUpdateDeviceTaskSelect avgOvertimeTime(){
        set.add("avg(overtime_time) as overtime_time");
        return this;
    }

    public McUpdateDeviceTaskSelect countOvertimeTime(){
        set.add("count(overtime_time) as overtime_time");
        return this;
    }

    public McUpdateDeviceTaskSelect minOvertimeTime(){
        set.add("min(overtime_time) as overtime_time");
        return this;
    }

    public McUpdateDeviceTaskSelect maxOvertimeTime(){
        set.add("max(overtime_time) as overtime_time");
        return this;
    }

    public McUpdateDeviceTaskSelect sumOvertimeTime(){
        set.add("sum(overtime_time) as overtime_time");
        return this;
    }
    public McUpdateDeviceTaskSelect waitStartOverTime(){
        set.add("wait_start_over_time");
        return this;
    }

    public McUpdateDeviceTaskSelect excludeWaitStartOverTime(){
        excludeSet.add("wait_start_over_time");
        return this;
    }

    public McUpdateDeviceTaskSelect avgWaitStartOverTime(){
        set.add("avg(wait_start_over_time) as wait_start_over_time");
        return this;
    }

    public McUpdateDeviceTaskSelect countWaitStartOverTime(){
        set.add("count(wait_start_over_time) as wait_start_over_time");
        return this;
    }

    public McUpdateDeviceTaskSelect minWaitStartOverTime(){
        set.add("min(wait_start_over_time) as wait_start_over_time");
        return this;
    }

    public McUpdateDeviceTaskSelect maxWaitStartOverTime(){
        set.add("max(wait_start_over_time) as wait_start_over_time");
        return this;
    }

    public McUpdateDeviceTaskSelect sumWaitStartOverTime(){
        set.add("sum(wait_start_over_time) as wait_start_over_time");
        return this;
    }
    public McUpdateDeviceTaskSelect status(){
        set.add("status");
        return this;
    }

    public McUpdateDeviceTaskSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public McUpdateDeviceTaskSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public McUpdateDeviceTaskSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public McUpdateDeviceTaskSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public McUpdateDeviceTaskSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public McUpdateDeviceTaskSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public McUpdateDeviceTaskSelect versionId(){
        set.add("version_id");
        return this;
    }

    public McUpdateDeviceTaskSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public McUpdateDeviceTaskSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceTaskSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceTaskSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceTaskSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public McUpdateDeviceTaskSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public McUpdateDeviceTaskSelect createTime(){
        set.add("create_time");
        return this;
    }

    public McUpdateDeviceTaskSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public McUpdateDeviceTaskSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceTaskSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceTaskSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceTaskSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public McUpdateDeviceTaskSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public McUpdateDeviceTaskSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public McUpdateDeviceTaskSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public McUpdateDeviceTaskSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceTaskSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceTaskSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceTaskSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public McUpdateDeviceTaskSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }

    boolean distinct=false;

     public McUpdateDeviceTaskSelect distinct(){
        this.distinct=true;
        return this;
    }

    public McUpdateDeviceTaskSelect includes(Consumer<Set<String>> other){
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
