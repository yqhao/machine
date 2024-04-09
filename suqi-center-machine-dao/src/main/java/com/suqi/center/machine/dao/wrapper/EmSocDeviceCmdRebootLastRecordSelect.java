package com.suqi.center.machine.dao.wrapper;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 
 * </p>
 * "em_soc_device_cmd_reboot_last_record"
 * @author Administrator
 */
public class EmSocDeviceCmdRebootLastRecordSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public EmSocDeviceCmdRebootLastRecordSelect columns(){
        set.add("id");
        set.add("device_id");
        set.add("last_cmd_reboot");
        set.add("create_time");
        set.add("type");
        set.add("opt_role");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect id(){
        set.add("id");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public EmSocDeviceCmdRebootLastRecordSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public EmSocDeviceCmdRebootLastRecordSelect lastCmdReboot(){
        set.add("last_cmd_reboot");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect excludeLastCmdReboot(){
        excludeSet.add("last_cmd_reboot");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect avgLastCmdReboot(){
        set.add("avg(last_cmd_reboot) as last_cmd_reboot");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect countLastCmdReboot(){
        set.add("count(last_cmd_reboot) as last_cmd_reboot");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect minLastCmdReboot(){
        set.add("min(last_cmd_reboot) as last_cmd_reboot");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect maxLastCmdReboot(){
        set.add("max(last_cmd_reboot) as last_cmd_reboot");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect sumLastCmdReboot(){
        set.add("sum(last_cmd_reboot) as last_cmd_reboot");
        return this;
    }
    public EmSocDeviceCmdRebootLastRecordSelect createTime(){
        set.add("create_time");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public EmSocDeviceCmdRebootLastRecordSelect type(){
        set.add("type");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect excludeType(){
        excludeSet.add("type");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect avgType(){
        set.add("avg(type) as type");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect countType(){
        set.add("count(type) as type");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect minType(){
        set.add("min(type) as type");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect maxType(){
        set.add("max(type) as type");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect sumType(){
        set.add("sum(type) as type");
        return this;
    }
    public EmSocDeviceCmdRebootLastRecordSelect optRole(){
        set.add("opt_role");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect excludeOptRole(){
        excludeSet.add("opt_role");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect avgOptRole(){
        set.add("avg(opt_role) as opt_role");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect countOptRole(){
        set.add("count(opt_role) as opt_role");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect minOptRole(){
        set.add("min(opt_role) as opt_role");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect maxOptRole(){
        set.add("max(opt_role) as opt_role");
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect sumOptRole(){
        set.add("sum(opt_role) as opt_role");
        return this;
    }

    boolean distinct=false;

     public EmSocDeviceCmdRebootLastRecordSelect distinct(){
        this.distinct=true;
        return this;
    }

    public EmSocDeviceCmdRebootLastRecordSelect includes(Consumer<Set<String>> other){
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
