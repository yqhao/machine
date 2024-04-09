package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 商户用户设备表（yun_member_user_device）
 * </p>
 * "yun_member_user_device"
 * @author PC001
 */
public class YunMemberUserDeviceSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public YunMemberUserDeviceSelect columns(){
        set.add("id");
        set.add("fk_member_id");
        set.add("fk_yun_member_facilities_id");
        set.add("user_id");
        set.add("facilities_id");
        set.add("user_phone_id");
        set.add("request_id");
        set.add("valid_start_time");
        set.add("valid_end_time");
        set.add("status");
        set.add("buy_time");
        set.add("last_renew_time");
        set.add("create_time");
        set.add("last_update_time");
        set.add("version_id");
        set.add("running_status");
        set.add("spec_code");
        set.add("fk_sys_device_label_id");
        return this;
    }

    public YunMemberUserDeviceSelect id(){
        set.add("id");
        return this;
    }

    public YunMemberUserDeviceSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public YunMemberUserDeviceSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public YunMemberUserDeviceSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public YunMemberUserDeviceSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public YunMemberUserDeviceSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public YunMemberUserDeviceSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public YunMemberUserDeviceSelect fkMemberId(){
        set.add("fk_member_id");
        return this;
    }

    public YunMemberUserDeviceSelect excludeFkMemberId(){
        excludeSet.add("fk_member_id");
        return this;
    }

    public YunMemberUserDeviceSelect avgFkMemberId(){
        set.add("avg(fk_member_id) as fk_member_id");
        return this;
    }

    public YunMemberUserDeviceSelect countFkMemberId(){
        set.add("count(fk_member_id) as fk_member_id");
        return this;
    }

    public YunMemberUserDeviceSelect minFkMemberId(){
        set.add("min(fk_member_id) as fk_member_id");
        return this;
    }

    public YunMemberUserDeviceSelect maxFkMemberId(){
        set.add("max(fk_member_id) as fk_member_id");
        return this;
    }

    public YunMemberUserDeviceSelect sumFkMemberId(){
        set.add("sum(fk_member_id) as fk_member_id");
        return this;
    }
    public YunMemberUserDeviceSelect fkYunMemberFacilitiesId(){
        set.add("fk_yun_member_facilities_id");
        return this;
    }

    public YunMemberUserDeviceSelect excludeFkYunMemberFacilitiesId(){
        excludeSet.add("fk_yun_member_facilities_id");
        return this;
    }

    public YunMemberUserDeviceSelect avgFkYunMemberFacilitiesId(){
        set.add("avg(fk_yun_member_facilities_id) as fk_yun_member_facilities_id");
        return this;
    }

    public YunMemberUserDeviceSelect countFkYunMemberFacilitiesId(){
        set.add("count(fk_yun_member_facilities_id) as fk_yun_member_facilities_id");
        return this;
    }

    public YunMemberUserDeviceSelect minFkYunMemberFacilitiesId(){
        set.add("min(fk_yun_member_facilities_id) as fk_yun_member_facilities_id");
        return this;
    }

    public YunMemberUserDeviceSelect maxFkYunMemberFacilitiesId(){
        set.add("max(fk_yun_member_facilities_id) as fk_yun_member_facilities_id");
        return this;
    }

    public YunMemberUserDeviceSelect sumFkYunMemberFacilitiesId(){
        set.add("sum(fk_yun_member_facilities_id) as fk_yun_member_facilities_id");
        return this;
    }
    public YunMemberUserDeviceSelect userId(){
        set.add("user_id");
        return this;
    }

    public YunMemberUserDeviceSelect excludeUserId(){
        excludeSet.add("user_id");
        return this;
    }

    public YunMemberUserDeviceSelect avgUserId(){
        set.add("avg(user_id) as user_id");
        return this;
    }

    public YunMemberUserDeviceSelect countUserId(){
        set.add("count(user_id) as user_id");
        return this;
    }

    public YunMemberUserDeviceSelect minUserId(){
        set.add("min(user_id) as user_id");
        return this;
    }

    public YunMemberUserDeviceSelect maxUserId(){
        set.add("max(user_id) as user_id");
        return this;
    }

    public YunMemberUserDeviceSelect sumUserId(){
        set.add("sum(user_id) as user_id");
        return this;
    }
    public YunMemberUserDeviceSelect facilitiesId(){
        set.add("facilities_id");
        return this;
    }

    public YunMemberUserDeviceSelect excludeFacilitiesId(){
        excludeSet.add("facilities_id");
        return this;
    }

    public YunMemberUserDeviceSelect avgFacilitiesId(){
        set.add("avg(facilities_id) as facilities_id");
        return this;
    }

    public YunMemberUserDeviceSelect countFacilitiesId(){
        set.add("count(facilities_id) as facilities_id");
        return this;
    }

    public YunMemberUserDeviceSelect minFacilitiesId(){
        set.add("min(facilities_id) as facilities_id");
        return this;
    }

    public YunMemberUserDeviceSelect maxFacilitiesId(){
        set.add("max(facilities_id) as facilities_id");
        return this;
    }

    public YunMemberUserDeviceSelect sumFacilitiesId(){
        set.add("sum(facilities_id) as facilities_id");
        return this;
    }
    public YunMemberUserDeviceSelect userPhoneId(){
        set.add("user_phone_id");
        return this;
    }

    public YunMemberUserDeviceSelect excludeUserPhoneId(){
        excludeSet.add("user_phone_id");
        return this;
    }

    public YunMemberUserDeviceSelect avgUserPhoneId(){
        set.add("avg(user_phone_id) as user_phone_id");
        return this;
    }

    public YunMemberUserDeviceSelect countUserPhoneId(){
        set.add("count(user_phone_id) as user_phone_id");
        return this;
    }

    public YunMemberUserDeviceSelect minUserPhoneId(){
        set.add("min(user_phone_id) as user_phone_id");
        return this;
    }

    public YunMemberUserDeviceSelect maxUserPhoneId(){
        set.add("max(user_phone_id) as user_phone_id");
        return this;
    }

    public YunMemberUserDeviceSelect sumUserPhoneId(){
        set.add("sum(user_phone_id) as user_phone_id");
        return this;
    }
    public YunMemberUserDeviceSelect requestId(){
        set.add("request_id");
        return this;
    }

    public YunMemberUserDeviceSelect excludeRequestId(){
        excludeSet.add("request_id");
        return this;
    }

    public YunMemberUserDeviceSelect avgRequestId(){
        set.add("avg(request_id) as request_id");
        return this;
    }

    public YunMemberUserDeviceSelect countRequestId(){
        set.add("count(request_id) as request_id");
        return this;
    }

    public YunMemberUserDeviceSelect minRequestId(){
        set.add("min(request_id) as request_id");
        return this;
    }

    public YunMemberUserDeviceSelect maxRequestId(){
        set.add("max(request_id) as request_id");
        return this;
    }

    public YunMemberUserDeviceSelect sumRequestId(){
        set.add("sum(request_id) as request_id");
        return this;
    }
    public YunMemberUserDeviceSelect validStartTime(){
        set.add("valid_start_time");
        return this;
    }

    public YunMemberUserDeviceSelect excludeValidStartTime(){
        excludeSet.add("valid_start_time");
        return this;
    }

    public YunMemberUserDeviceSelect avgValidStartTime(){
        set.add("avg(valid_start_time) as valid_start_time");
        return this;
    }

    public YunMemberUserDeviceSelect countValidStartTime(){
        set.add("count(valid_start_time) as valid_start_time");
        return this;
    }

    public YunMemberUserDeviceSelect minValidStartTime(){
        set.add("min(valid_start_time) as valid_start_time");
        return this;
    }

    public YunMemberUserDeviceSelect maxValidStartTime(){
        set.add("max(valid_start_time) as valid_start_time");
        return this;
    }

    public YunMemberUserDeviceSelect sumValidStartTime(){
        set.add("sum(valid_start_time) as valid_start_time");
        return this;
    }
    public YunMemberUserDeviceSelect validEndTime(){
        set.add("valid_end_time");
        return this;
    }

    public YunMemberUserDeviceSelect excludeValidEndTime(){
        excludeSet.add("valid_end_time");
        return this;
    }

    public YunMemberUserDeviceSelect avgValidEndTime(){
        set.add("avg(valid_end_time) as valid_end_time");
        return this;
    }

    public YunMemberUserDeviceSelect countValidEndTime(){
        set.add("count(valid_end_time) as valid_end_time");
        return this;
    }

    public YunMemberUserDeviceSelect minValidEndTime(){
        set.add("min(valid_end_time) as valid_end_time");
        return this;
    }

    public YunMemberUserDeviceSelect maxValidEndTime(){
        set.add("max(valid_end_time) as valid_end_time");
        return this;
    }

    public YunMemberUserDeviceSelect sumValidEndTime(){
        set.add("sum(valid_end_time) as valid_end_time");
        return this;
    }
    public YunMemberUserDeviceSelect status(){
        set.add("status");
        return this;
    }

    public YunMemberUserDeviceSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public YunMemberUserDeviceSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public YunMemberUserDeviceSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public YunMemberUserDeviceSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public YunMemberUserDeviceSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public YunMemberUserDeviceSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public YunMemberUserDeviceSelect buyTime(){
        set.add("buy_time");
        return this;
    }

    public YunMemberUserDeviceSelect excludeBuyTime(){
        excludeSet.add("buy_time");
        return this;
    }

    public YunMemberUserDeviceSelect avgBuyTime(){
        set.add("avg(buy_time) as buy_time");
        return this;
    }

    public YunMemberUserDeviceSelect countBuyTime(){
        set.add("count(buy_time) as buy_time");
        return this;
    }

    public YunMemberUserDeviceSelect minBuyTime(){
        set.add("min(buy_time) as buy_time");
        return this;
    }

    public YunMemberUserDeviceSelect maxBuyTime(){
        set.add("max(buy_time) as buy_time");
        return this;
    }

    public YunMemberUserDeviceSelect sumBuyTime(){
        set.add("sum(buy_time) as buy_time");
        return this;
    }
    public YunMemberUserDeviceSelect lastRenewTime(){
        set.add("last_renew_time");
        return this;
    }

    public YunMemberUserDeviceSelect excludeLastRenewTime(){
        excludeSet.add("last_renew_time");
        return this;
    }

    public YunMemberUserDeviceSelect avgLastRenewTime(){
        set.add("avg(last_renew_time) as last_renew_time");
        return this;
    }

    public YunMemberUserDeviceSelect countLastRenewTime(){
        set.add("count(last_renew_time) as last_renew_time");
        return this;
    }

    public YunMemberUserDeviceSelect minLastRenewTime(){
        set.add("min(last_renew_time) as last_renew_time");
        return this;
    }

    public YunMemberUserDeviceSelect maxLastRenewTime(){
        set.add("max(last_renew_time) as last_renew_time");
        return this;
    }

    public YunMemberUserDeviceSelect sumLastRenewTime(){
        set.add("sum(last_renew_time) as last_renew_time");
        return this;
    }
    public YunMemberUserDeviceSelect createTime(){
        set.add("create_time");
        return this;
    }

    public YunMemberUserDeviceSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public YunMemberUserDeviceSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public YunMemberUserDeviceSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public YunMemberUserDeviceSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public YunMemberUserDeviceSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public YunMemberUserDeviceSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public YunMemberUserDeviceSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public YunMemberUserDeviceSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public YunMemberUserDeviceSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public YunMemberUserDeviceSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public YunMemberUserDeviceSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public YunMemberUserDeviceSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public YunMemberUserDeviceSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public YunMemberUserDeviceSelect versionId(){
        set.add("version_id");
        return this;
    }

    public YunMemberUserDeviceSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public YunMemberUserDeviceSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public YunMemberUserDeviceSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public YunMemberUserDeviceSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public YunMemberUserDeviceSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public YunMemberUserDeviceSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public YunMemberUserDeviceSelect runningStatus(){
        set.add("running_status");
        return this;
    }

    public YunMemberUserDeviceSelect excludeRunningStatus(){
        excludeSet.add("running_status");
        return this;
    }

    public YunMemberUserDeviceSelect avgRunningStatus(){
        set.add("avg(running_status) as running_status");
        return this;
    }

    public YunMemberUserDeviceSelect countRunningStatus(){
        set.add("count(running_status) as running_status");
        return this;
    }

    public YunMemberUserDeviceSelect minRunningStatus(){
        set.add("min(running_status) as running_status");
        return this;
    }

    public YunMemberUserDeviceSelect maxRunningStatus(){
        set.add("max(running_status) as running_status");
        return this;
    }

    public YunMemberUserDeviceSelect sumRunningStatus(){
        set.add("sum(running_status) as running_status");
        return this;
    }
    public YunMemberUserDeviceSelect specCode(){
        set.add("spec_code");
        return this;
    }

    public YunMemberUserDeviceSelect excludeSpecCode(){
        excludeSet.add("spec_code");
        return this;
    }

    public YunMemberUserDeviceSelect avgSpecCode(){
        set.add("avg(spec_code) as spec_code");
        return this;
    }

    public YunMemberUserDeviceSelect countSpecCode(){
        set.add("count(spec_code) as spec_code");
        return this;
    }

    public YunMemberUserDeviceSelect minSpecCode(){
        set.add("min(spec_code) as spec_code");
        return this;
    }

    public YunMemberUserDeviceSelect maxSpecCode(){
        set.add("max(spec_code) as spec_code");
        return this;
    }

    public YunMemberUserDeviceSelect sumSpecCode(){
        set.add("sum(spec_code) as spec_code");
        return this;
    }
    public YunMemberUserDeviceSelect fkSysDeviceLabelId(){
        set.add("fk_sys_device_label_id");
        return this;
    }

    public YunMemberUserDeviceSelect excludeFkSysDeviceLabelId(){
        excludeSet.add("fk_sys_device_label_id");
        return this;
    }

    public YunMemberUserDeviceSelect avgFkSysDeviceLabelId(){
        set.add("avg(fk_sys_device_label_id) as fk_sys_device_label_id");
        return this;
    }

    public YunMemberUserDeviceSelect countFkSysDeviceLabelId(){
        set.add("count(fk_sys_device_label_id) as fk_sys_device_label_id");
        return this;
    }

    public YunMemberUserDeviceSelect minFkSysDeviceLabelId(){
        set.add("min(fk_sys_device_label_id) as fk_sys_device_label_id");
        return this;
    }

    public YunMemberUserDeviceSelect maxFkSysDeviceLabelId(){
        set.add("max(fk_sys_device_label_id) as fk_sys_device_label_id");
        return this;
    }

    public YunMemberUserDeviceSelect sumFkSysDeviceLabelId(){
        set.add("sum(fk_sys_device_label_id) as fk_sys_device_label_id");
        return this;
    }

    boolean distinct=false;

     public YunMemberUserDeviceSelect distinct(){
        this.distinct=true;
        return this;
    }

    public YunMemberUserDeviceSelect includes(Consumer<Set<String>> other){
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
