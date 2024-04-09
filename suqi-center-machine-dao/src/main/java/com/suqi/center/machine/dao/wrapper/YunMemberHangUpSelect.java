package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 商户挂机时长表
 * </p>
 * "yun_member_hang_up"
 * @author PC001
 */
public class YunMemberHangUpSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public YunMemberHangUpSelect columns(){
        set.add("id");
        set.add("fk_member_id");
        set.add("room_session");
        set.add("device_id");
        set.add("phone_id");
        set.add("pkg");
        set.add("status");
        set.add("hang_up_time");
        set.add("hang_up_maturity_time");
        set.add("create_time");
        set.add("last_update_time");
        set.add("version_id");
        return this;
    }

    public YunMemberHangUpSelect id(){
        set.add("id");
        return this;
    }

    public YunMemberHangUpSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public YunMemberHangUpSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public YunMemberHangUpSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public YunMemberHangUpSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public YunMemberHangUpSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public YunMemberHangUpSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public YunMemberHangUpSelect fkMemberId(){
        set.add("fk_member_id");
        return this;
    }

    public YunMemberHangUpSelect excludeFkMemberId(){
        excludeSet.add("fk_member_id");
        return this;
    }

    public YunMemberHangUpSelect avgFkMemberId(){
        set.add("avg(fk_member_id) as fk_member_id");
        return this;
    }

    public YunMemberHangUpSelect countFkMemberId(){
        set.add("count(fk_member_id) as fk_member_id");
        return this;
    }

    public YunMemberHangUpSelect minFkMemberId(){
        set.add("min(fk_member_id) as fk_member_id");
        return this;
    }

    public YunMemberHangUpSelect maxFkMemberId(){
        set.add("max(fk_member_id) as fk_member_id");
        return this;
    }

    public YunMemberHangUpSelect sumFkMemberId(){
        set.add("sum(fk_member_id) as fk_member_id");
        return this;
    }
    public YunMemberHangUpSelect roomSession(){
        set.add("room_session");
        return this;
    }

    public YunMemberHangUpSelect excludeRoomSession(){
        excludeSet.add("room_session");
        return this;
    }

    public YunMemberHangUpSelect avgRoomSession(){
        set.add("avg(room_session) as room_session");
        return this;
    }

    public YunMemberHangUpSelect countRoomSession(){
        set.add("count(room_session) as room_session");
        return this;
    }

    public YunMemberHangUpSelect minRoomSession(){
        set.add("min(room_session) as room_session");
        return this;
    }

    public YunMemberHangUpSelect maxRoomSession(){
        set.add("max(room_session) as room_session");
        return this;
    }

    public YunMemberHangUpSelect sumRoomSession(){
        set.add("sum(room_session) as room_session");
        return this;
    }
    public YunMemberHangUpSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public YunMemberHangUpSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public YunMemberHangUpSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public YunMemberHangUpSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public YunMemberHangUpSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public YunMemberHangUpSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public YunMemberHangUpSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public YunMemberHangUpSelect phoneId(){
        set.add("phone_id");
        return this;
    }

    public YunMemberHangUpSelect excludePhoneId(){
        excludeSet.add("phone_id");
        return this;
    }

    public YunMemberHangUpSelect avgPhoneId(){
        set.add("avg(phone_id) as phone_id");
        return this;
    }

    public YunMemberHangUpSelect countPhoneId(){
        set.add("count(phone_id) as phone_id");
        return this;
    }

    public YunMemberHangUpSelect minPhoneId(){
        set.add("min(phone_id) as phone_id");
        return this;
    }

    public YunMemberHangUpSelect maxPhoneId(){
        set.add("max(phone_id) as phone_id");
        return this;
    }

    public YunMemberHangUpSelect sumPhoneId(){
        set.add("sum(phone_id) as phone_id");
        return this;
    }
    public YunMemberHangUpSelect pkg(){
        set.add("pkg");
        return this;
    }

    public YunMemberHangUpSelect excludePkg(){
        excludeSet.add("pkg");
        return this;
    }

    public YunMemberHangUpSelect avgPkg(){
        set.add("avg(pkg) as pkg");
        return this;
    }

    public YunMemberHangUpSelect countPkg(){
        set.add("count(pkg) as pkg");
        return this;
    }

    public YunMemberHangUpSelect minPkg(){
        set.add("min(pkg) as pkg");
        return this;
    }

    public YunMemberHangUpSelect maxPkg(){
        set.add("max(pkg) as pkg");
        return this;
    }

    public YunMemberHangUpSelect sumPkg(){
        set.add("sum(pkg) as pkg");
        return this;
    }
    public YunMemberHangUpSelect status(){
        set.add("status");
        return this;
    }

    public YunMemberHangUpSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public YunMemberHangUpSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public YunMemberHangUpSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public YunMemberHangUpSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public YunMemberHangUpSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public YunMemberHangUpSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public YunMemberHangUpSelect hangUpTime(){
        set.add("hang_up_time");
        return this;
    }

    public YunMemberHangUpSelect excludeHangUpTime(){
        excludeSet.add("hang_up_time");
        return this;
    }

    public YunMemberHangUpSelect avgHangUpTime(){
        set.add("avg(hang_up_time) as hang_up_time");
        return this;
    }

    public YunMemberHangUpSelect countHangUpTime(){
        set.add("count(hang_up_time) as hang_up_time");
        return this;
    }

    public YunMemberHangUpSelect minHangUpTime(){
        set.add("min(hang_up_time) as hang_up_time");
        return this;
    }

    public YunMemberHangUpSelect maxHangUpTime(){
        set.add("max(hang_up_time) as hang_up_time");
        return this;
    }

    public YunMemberHangUpSelect sumHangUpTime(){
        set.add("sum(hang_up_time) as hang_up_time");
        return this;
    }
    public YunMemberHangUpSelect hangUpMaturityTime(){
        set.add("hang_up_maturity_time");
        return this;
    }

    public YunMemberHangUpSelect excludeHangUpMaturityTime(){
        excludeSet.add("hang_up_maturity_time");
        return this;
    }

    public YunMemberHangUpSelect avgHangUpMaturityTime(){
        set.add("avg(hang_up_maturity_time) as hang_up_maturity_time");
        return this;
    }

    public YunMemberHangUpSelect countHangUpMaturityTime(){
        set.add("count(hang_up_maturity_time) as hang_up_maturity_time");
        return this;
    }

    public YunMemberHangUpSelect minHangUpMaturityTime(){
        set.add("min(hang_up_maturity_time) as hang_up_maturity_time");
        return this;
    }

    public YunMemberHangUpSelect maxHangUpMaturityTime(){
        set.add("max(hang_up_maturity_time) as hang_up_maturity_time");
        return this;
    }

    public YunMemberHangUpSelect sumHangUpMaturityTime(){
        set.add("sum(hang_up_maturity_time) as hang_up_maturity_time");
        return this;
    }
    public YunMemberHangUpSelect createTime(){
        set.add("create_time");
        return this;
    }

    public YunMemberHangUpSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public YunMemberHangUpSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public YunMemberHangUpSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public YunMemberHangUpSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public YunMemberHangUpSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public YunMemberHangUpSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public YunMemberHangUpSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public YunMemberHangUpSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public YunMemberHangUpSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public YunMemberHangUpSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public YunMemberHangUpSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public YunMemberHangUpSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public YunMemberHangUpSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public YunMemberHangUpSelect versionId(){
        set.add("version_id");
        return this;
    }

    public YunMemberHangUpSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public YunMemberHangUpSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public YunMemberHangUpSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public YunMemberHangUpSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public YunMemberHangUpSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public YunMemberHangUpSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }

    boolean distinct=false;

     public YunMemberHangUpSelect distinct(){
        this.distinct=true;
        return this;
    }

    public YunMemberHangUpSelect includes(Consumer<Set<String>> other){
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
