package com.suqi.center.machine.dao.viz.wrapper;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 更新机器默认任务表
 * </p>
 * "mc_default_update_device_task"
 * @author 18374
 */
public class McDefaultUpdateDeviceTaskSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public McDefaultUpdateDeviceTaskSelect columns(){
        set.add("id");
        set.add("fk_mc_update_device_task_id");
        set.add("status");
        set.add("version_id");
        set.add("create_time");
        set.add("last_update_time");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect id(){
        set.add("id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public McDefaultUpdateDeviceTaskSelect fkMcUpdateDeviceTaskId(){
        set.add("fk_mc_update_device_task_id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect excludeFkMcUpdateDeviceTaskId(){
        excludeSet.add("fk_mc_update_device_task_id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect avgFkMcUpdateDeviceTaskId(){
        set.add("avg(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect countFkMcUpdateDeviceTaskId(){
        set.add("count(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect minFkMcUpdateDeviceTaskId(){
        set.add("min(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect maxFkMcUpdateDeviceTaskId(){
        set.add("max(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect sumFkMcUpdateDeviceTaskId(){
        set.add("sum(fk_mc_update_device_task_id) as fk_mc_update_device_task_id");
        return this;
    }
    public McDefaultUpdateDeviceTaskSelect status(){
        set.add("status");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public McDefaultUpdateDeviceTaskSelect versionId(){
        set.add("version_id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public McDefaultUpdateDeviceTaskSelect createTime(){
        set.add("create_time");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public McDefaultUpdateDeviceTaskSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }

    boolean distinct=false;

     public McDefaultUpdateDeviceTaskSelect distinct(){
        this.distinct=true;
        return this;
    }

    public McDefaultUpdateDeviceTaskSelect includes(Consumer<Set<String>> other){
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
