package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 设备扩展信息表（em_soc_device_extend）
 * </p>
 * "em_soc_device_extend"
 * @author PC001
 */
public class EmSocDeviceExtendSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public EmSocDeviceExtendSelect columns(){
        set.add("id");
        set.add("fk_em_soc_devices_id");
        set.add("device_id");
        set.add("phone_id");
        set.add("alarm_value");
        set.add("hang_up_status");
        set.add("create_time");
        set.add("last_update_time");
        set.add("version_id");
        set.add("restart_status");
        return this;
    }

    public EmSocDeviceExtendSelect id(){
        set.add("id");
        return this;
    }

    public EmSocDeviceExtendSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public EmSocDeviceExtendSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public EmSocDeviceExtendSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public EmSocDeviceExtendSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public EmSocDeviceExtendSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public EmSocDeviceExtendSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public EmSocDeviceExtendSelect fkEmSocDevicesId(){
        set.add("fk_em_soc_devices_id");
        return this;
    }

    public EmSocDeviceExtendSelect excludeFkEmSocDevicesId(){
        excludeSet.add("fk_em_soc_devices_id");
        return this;
    }

    public EmSocDeviceExtendSelect avgFkEmSocDevicesId(){
        set.add("avg(fk_em_soc_devices_id) as fk_em_soc_devices_id");
        return this;
    }

    public EmSocDeviceExtendSelect countFkEmSocDevicesId(){
        set.add("count(fk_em_soc_devices_id) as fk_em_soc_devices_id");
        return this;
    }

    public EmSocDeviceExtendSelect minFkEmSocDevicesId(){
        set.add("min(fk_em_soc_devices_id) as fk_em_soc_devices_id");
        return this;
    }

    public EmSocDeviceExtendSelect maxFkEmSocDevicesId(){
        set.add("max(fk_em_soc_devices_id) as fk_em_soc_devices_id");
        return this;
    }

    public EmSocDeviceExtendSelect sumFkEmSocDevicesId(){
        set.add("sum(fk_em_soc_devices_id) as fk_em_soc_devices_id");
        return this;
    }
    public EmSocDeviceExtendSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public EmSocDeviceExtendSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public EmSocDeviceExtendSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public EmSocDeviceExtendSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public EmSocDeviceExtendSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public EmSocDeviceExtendSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public EmSocDeviceExtendSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public EmSocDeviceExtendSelect phoneId(){
        set.add("phone_id");
        return this;
    }

    public EmSocDeviceExtendSelect excludePhoneId(){
        excludeSet.add("phone_id");
        return this;
    }

    public EmSocDeviceExtendSelect avgPhoneId(){
        set.add("avg(phone_id) as phone_id");
        return this;
    }

    public EmSocDeviceExtendSelect countPhoneId(){
        set.add("count(phone_id) as phone_id");
        return this;
    }

    public EmSocDeviceExtendSelect minPhoneId(){
        set.add("min(phone_id) as phone_id");
        return this;
    }

    public EmSocDeviceExtendSelect maxPhoneId(){
        set.add("max(phone_id) as phone_id");
        return this;
    }

    public EmSocDeviceExtendSelect sumPhoneId(){
        set.add("sum(phone_id) as phone_id");
        return this;
    }
    public EmSocDeviceExtendSelect alarmValue(){
        set.add("alarm_value");
        return this;
    }

    public EmSocDeviceExtendSelect excludeAlarmValue(){
        excludeSet.add("alarm_value");
        return this;
    }

    public EmSocDeviceExtendSelect avgAlarmValue(){
        set.add("avg(alarm_value) as alarm_value");
        return this;
    }

    public EmSocDeviceExtendSelect countAlarmValue(){
        set.add("count(alarm_value) as alarm_value");
        return this;
    }

    public EmSocDeviceExtendSelect minAlarmValue(){
        set.add("min(alarm_value) as alarm_value");
        return this;
    }

    public EmSocDeviceExtendSelect maxAlarmValue(){
        set.add("max(alarm_value) as alarm_value");
        return this;
    }

    public EmSocDeviceExtendSelect sumAlarmValue(){
        set.add("sum(alarm_value) as alarm_value");
        return this;
    }
    public EmSocDeviceExtendSelect hangUpStatus(){
        set.add("hang_up_status");
        return this;
    }

    public EmSocDeviceExtendSelect excludeHangUpStatus(){
        excludeSet.add("hang_up_status");
        return this;
    }

    public EmSocDeviceExtendSelect avgHangUpStatus(){
        set.add("avg(hang_up_status) as hang_up_status");
        return this;
    }

    public EmSocDeviceExtendSelect countHangUpStatus(){
        set.add("count(hang_up_status) as hang_up_status");
        return this;
    }

    public EmSocDeviceExtendSelect minHangUpStatus(){
        set.add("min(hang_up_status) as hang_up_status");
        return this;
    }

    public EmSocDeviceExtendSelect maxHangUpStatus(){
        set.add("max(hang_up_status) as hang_up_status");
        return this;
    }

    public EmSocDeviceExtendSelect sumHangUpStatus(){
        set.add("sum(hang_up_status) as hang_up_status");
        return this;
    }
    public EmSocDeviceExtendSelect createTime(){
        set.add("create_time");
        return this;
    }

    public EmSocDeviceExtendSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public EmSocDeviceExtendSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public EmSocDeviceExtendSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public EmSocDeviceExtendSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public EmSocDeviceExtendSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public EmSocDeviceExtendSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public EmSocDeviceExtendSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public EmSocDeviceExtendSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public EmSocDeviceExtendSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public EmSocDeviceExtendSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public EmSocDeviceExtendSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public EmSocDeviceExtendSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public EmSocDeviceExtendSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public EmSocDeviceExtendSelect versionId(){
        set.add("version_id");
        return this;
    }

    public EmSocDeviceExtendSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public EmSocDeviceExtendSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public EmSocDeviceExtendSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public EmSocDeviceExtendSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public EmSocDeviceExtendSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public EmSocDeviceExtendSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public EmSocDeviceExtendSelect restartStatus(){
        set.add("restart_status");
        return this;
    }

    public EmSocDeviceExtendSelect excludeRestartStatus(){
        excludeSet.add("restart_status");
        return this;
    }

    public EmSocDeviceExtendSelect avgRestartStatus(){
        set.add("avg(restart_status) as restart_status");
        return this;
    }

    public EmSocDeviceExtendSelect countRestartStatus(){
        set.add("count(restart_status) as restart_status");
        return this;
    }

    public EmSocDeviceExtendSelect minRestartStatus(){
        set.add("min(restart_status) as restart_status");
        return this;
    }

    public EmSocDeviceExtendSelect maxRestartStatus(){
        set.add("max(restart_status) as restart_status");
        return this;
    }

    public EmSocDeviceExtendSelect sumRestartStatus(){
        set.add("sum(restart_status) as restart_status");
        return this;
    }

    boolean distinct=false;

     public EmSocDeviceExtendSelect distinct(){
        this.distinct=true;
        return this;
    }

    public EmSocDeviceExtendSelect includes(Consumer<Set<String>> other){
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
