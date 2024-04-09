package com.suqi.center.machine.dao.wrapper;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 
 * </p>
 * "em_soc_device_cmd_reboot_record"
 * @author Administrator
 */
public class EmSocDeviceCmdRebootRecordSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public EmSocDeviceCmdRebootRecordSelect columns(){
        set.add("id");
        set.add("fk_member_id");
        set.add("device_id");
        set.add("type");
        set.add("opt_role");
        set.add("create_time");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect id(){
        set.add("id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public EmSocDeviceCmdRebootRecordSelect fkMemberId(){
        set.add("fk_member_id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect excludeFkMemberId(){
        excludeSet.add("fk_member_id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect avgFkMemberId(){
        set.add("avg(fk_member_id) as fk_member_id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect countFkMemberId(){
        set.add("count(fk_member_id) as fk_member_id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect minFkMemberId(){
        set.add("min(fk_member_id) as fk_member_id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect maxFkMemberId(){
        set.add("max(fk_member_id) as fk_member_id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect sumFkMemberId(){
        set.add("sum(fk_member_id) as fk_member_id");
        return this;
    }
    public EmSocDeviceCmdRebootRecordSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public EmSocDeviceCmdRebootRecordSelect type(){
        set.add("type");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect excludeType(){
        excludeSet.add("type");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect avgType(){
        set.add("avg(type) as type");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect countType(){
        set.add("count(type) as type");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect minType(){
        set.add("min(type) as type");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect maxType(){
        set.add("max(type) as type");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect sumType(){
        set.add("sum(type) as type");
        return this;
    }
    public EmSocDeviceCmdRebootRecordSelect optRole(){
        set.add("opt_role");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect excludeOptRole(){
        excludeSet.add("opt_role");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect avgOptRole(){
        set.add("avg(opt_role) as opt_role");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect countOptRole(){
        set.add("count(opt_role) as opt_role");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect minOptRole(){
        set.add("min(opt_role) as opt_role");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect maxOptRole(){
        set.add("max(opt_role) as opt_role");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect sumOptRole(){
        set.add("sum(opt_role) as opt_role");
        return this;
    }
    public EmSocDeviceCmdRebootRecordSelect createTime(){
        set.add("create_time");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }

    boolean distinct=false;

     public EmSocDeviceCmdRebootRecordSelect distinct(){
        this.distinct=true;
        return this;
    }

    public EmSocDeviceCmdRebootRecordSelect includes(Consumer<Set<String>> other){
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
