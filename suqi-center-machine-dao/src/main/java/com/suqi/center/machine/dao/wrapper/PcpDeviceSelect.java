package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 云机id对照表
 * </p>
 * "pcp_device"
 * @author PC001
 */
public class PcpDeviceSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public PcpDeviceSelect columns(){
        set.add("id");
        set.add("device_id");
        set.add("project_id");
        set.add("phone_id");
        set.add("macAddress");
        set.add("endpointPhonesUrl");
        set.add("serverId");
        set.add("imageId");
        set.add("create_time");
        set.add("last_update_time");
        set.add("version_id");
        set.add("phone_model_name");
        set.add("phone_name");
        return this;
    }

    public PcpDeviceSelect id(){
        set.add("id");
        return this;
    }

    public PcpDeviceSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public PcpDeviceSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public PcpDeviceSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public PcpDeviceSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public PcpDeviceSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public PcpDeviceSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public PcpDeviceSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public PcpDeviceSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public PcpDeviceSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public PcpDeviceSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public PcpDeviceSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public PcpDeviceSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public PcpDeviceSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public PcpDeviceSelect projectId(){
        set.add("project_id");
        return this;
    }

    public PcpDeviceSelect excludeProjectId(){
        excludeSet.add("project_id");
        return this;
    }

    public PcpDeviceSelect avgProjectId(){
        set.add("avg(project_id) as project_id");
        return this;
    }

    public PcpDeviceSelect countProjectId(){
        set.add("count(project_id) as project_id");
        return this;
    }

    public PcpDeviceSelect minProjectId(){
        set.add("min(project_id) as project_id");
        return this;
    }

    public PcpDeviceSelect maxProjectId(){
        set.add("max(project_id) as project_id");
        return this;
    }

    public PcpDeviceSelect sumProjectId(){
        set.add("sum(project_id) as project_id");
        return this;
    }
    public PcpDeviceSelect phoneId(){
        set.add("phone_id");
        return this;
    }

    public PcpDeviceSelect excludePhoneId(){
        excludeSet.add("phone_id");
        return this;
    }

    public PcpDeviceSelect avgPhoneId(){
        set.add("avg(phone_id) as phone_id");
        return this;
    }

    public PcpDeviceSelect countPhoneId(){
        set.add("count(phone_id) as phone_id");
        return this;
    }

    public PcpDeviceSelect minPhoneId(){
        set.add("min(phone_id) as phone_id");
        return this;
    }

    public PcpDeviceSelect maxPhoneId(){
        set.add("max(phone_id) as phone_id");
        return this;
    }

    public PcpDeviceSelect sumPhoneId(){
        set.add("sum(phone_id) as phone_id");
        return this;
    }
    public PcpDeviceSelect macAddress(){
        set.add("macAddress");
        return this;
    }

    public PcpDeviceSelect excludeMacAddress(){
        excludeSet.add("macAddress");
        return this;
    }

    public PcpDeviceSelect avgMacAddress(){
        set.add("avg(macAddress) as macAddress");
        return this;
    }

    public PcpDeviceSelect countMacAddress(){
        set.add("count(macAddress) as macAddress");
        return this;
    }

    public PcpDeviceSelect minMacAddress(){
        set.add("min(macAddress) as macAddress");
        return this;
    }

    public PcpDeviceSelect maxMacAddress(){
        set.add("max(macAddress) as macAddress");
        return this;
    }

    public PcpDeviceSelect sumMacAddress(){
        set.add("sum(macAddress) as macAddress");
        return this;
    }
    public PcpDeviceSelect endpointPhonesUrl(){
        set.add("endpointPhonesUrl");
        return this;
    }

    public PcpDeviceSelect excludeEndpointPhonesUrl(){
        excludeSet.add("endpointPhonesUrl");
        return this;
    }

    public PcpDeviceSelect avgEndpointPhonesUrl(){
        set.add("avg(endpointPhonesUrl) as endpointPhonesUrl");
        return this;
    }

    public PcpDeviceSelect countEndpointPhonesUrl(){
        set.add("count(endpointPhonesUrl) as endpointPhonesUrl");
        return this;
    }

    public PcpDeviceSelect minEndpointPhonesUrl(){
        set.add("min(endpointPhonesUrl) as endpointPhonesUrl");
        return this;
    }

    public PcpDeviceSelect maxEndpointPhonesUrl(){
        set.add("max(endpointPhonesUrl) as endpointPhonesUrl");
        return this;
    }

    public PcpDeviceSelect sumEndpointPhonesUrl(){
        set.add("sum(endpointPhonesUrl) as endpointPhonesUrl");
        return this;
    }
    public PcpDeviceSelect serverId(){
        set.add("serverId");
        return this;
    }

    public PcpDeviceSelect excludeServerId(){
        excludeSet.add("serverId");
        return this;
    }

    public PcpDeviceSelect avgServerId(){
        set.add("avg(serverId) as serverId");
        return this;
    }

    public PcpDeviceSelect countServerId(){
        set.add("count(serverId) as serverId");
        return this;
    }

    public PcpDeviceSelect minServerId(){
        set.add("min(serverId) as serverId");
        return this;
    }

    public PcpDeviceSelect maxServerId(){
        set.add("max(serverId) as serverId");
        return this;
    }

    public PcpDeviceSelect sumServerId(){
        set.add("sum(serverId) as serverId");
        return this;
    }
    public PcpDeviceSelect imageId(){
        set.add("imageId");
        return this;
    }

    public PcpDeviceSelect excludeImageId(){
        excludeSet.add("imageId");
        return this;
    }

    public PcpDeviceSelect avgImageId(){
        set.add("avg(imageId) as imageId");
        return this;
    }

    public PcpDeviceSelect countImageId(){
        set.add("count(imageId) as imageId");
        return this;
    }

    public PcpDeviceSelect minImageId(){
        set.add("min(imageId) as imageId");
        return this;
    }

    public PcpDeviceSelect maxImageId(){
        set.add("max(imageId) as imageId");
        return this;
    }

    public PcpDeviceSelect sumImageId(){
        set.add("sum(imageId) as imageId");
        return this;
    }
    public PcpDeviceSelect createTime(){
        set.add("create_time");
        return this;
    }

    public PcpDeviceSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public PcpDeviceSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public PcpDeviceSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public PcpDeviceSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public PcpDeviceSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public PcpDeviceSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public PcpDeviceSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public PcpDeviceSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public PcpDeviceSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public PcpDeviceSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public PcpDeviceSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public PcpDeviceSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public PcpDeviceSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public PcpDeviceSelect versionId(){
        set.add("version_id");
        return this;
    }

    public PcpDeviceSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public PcpDeviceSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public PcpDeviceSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public PcpDeviceSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public PcpDeviceSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public PcpDeviceSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public PcpDeviceSelect phoneModelName(){
        set.add("phone_model_name");
        return this;
    }

    public PcpDeviceSelect excludePhoneModelName(){
        excludeSet.add("phone_model_name");
        return this;
    }

    public PcpDeviceSelect avgPhoneModelName(){
        set.add("avg(phone_model_name) as phone_model_name");
        return this;
    }

    public PcpDeviceSelect countPhoneModelName(){
        set.add("count(phone_model_name) as phone_model_name");
        return this;
    }

    public PcpDeviceSelect minPhoneModelName(){
        set.add("min(phone_model_name) as phone_model_name");
        return this;
    }

    public PcpDeviceSelect maxPhoneModelName(){
        set.add("max(phone_model_name) as phone_model_name");
        return this;
    }

    public PcpDeviceSelect sumPhoneModelName(){
        set.add("sum(phone_model_name) as phone_model_name");
        return this;
    }
    public PcpDeviceSelect phoneName(){
        set.add("phone_name");
        return this;
    }

    public PcpDeviceSelect excludePhoneName(){
        excludeSet.add("phone_name");
        return this;
    }

    public PcpDeviceSelect avgPhoneName(){
        set.add("avg(phone_name) as phone_name");
        return this;
    }

    public PcpDeviceSelect countPhoneName(){
        set.add("count(phone_name) as phone_name");
        return this;
    }

    public PcpDeviceSelect minPhoneName(){
        set.add("min(phone_name) as phone_name");
        return this;
    }

    public PcpDeviceSelect maxPhoneName(){
        set.add("max(phone_name) as phone_name");
        return this;
    }

    public PcpDeviceSelect sumPhoneName(){
        set.add("sum(phone_name) as phone_name");
        return this;
    }

    boolean distinct=false;

     public PcpDeviceSelect distinct(){
        this.distinct=true;
        return this;
    }

    public PcpDeviceSelect includes(Consumer<Set<String>> other){
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
