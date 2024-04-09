package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 腾讯设备公网映射表
 * </p>
 * "tencent_device_access_info"
 * @author PC001
 */
public class TencentDeviceAccessInfoSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public TencentDeviceAccessInfoSelect columns(){
        set.add("id");
        set.add("fk_tencent_device_id");
        set.add("instance_id");
        set.add("server_ip");
        set.add("server_port");
        set.add("public_ip");
        set.add("public_port");
        set.add("isp");
        set.add("create_time");
        set.add("last_update_time");
        return this;
    }

    public TencentDeviceAccessInfoSelect id(){
        set.add("id");
        return this;
    }

    public TencentDeviceAccessInfoSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public TencentDeviceAccessInfoSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public TencentDeviceAccessInfoSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public TencentDeviceAccessInfoSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public TencentDeviceAccessInfoSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public TencentDeviceAccessInfoSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public TencentDeviceAccessInfoSelect fkTencentDeviceId(){
        set.add("fk_tencent_device_id");
        return this;
    }

    public TencentDeviceAccessInfoSelect excludeFkTencentDeviceId(){
        excludeSet.add("fk_tencent_device_id");
        return this;
    }

    public TencentDeviceAccessInfoSelect avgFkTencentDeviceId(){
        set.add("avg(fk_tencent_device_id) as fk_tencent_device_id");
        return this;
    }

    public TencentDeviceAccessInfoSelect countFkTencentDeviceId(){
        set.add("count(fk_tencent_device_id) as fk_tencent_device_id");
        return this;
    }

    public TencentDeviceAccessInfoSelect minFkTencentDeviceId(){
        set.add("min(fk_tencent_device_id) as fk_tencent_device_id");
        return this;
    }

    public TencentDeviceAccessInfoSelect maxFkTencentDeviceId(){
        set.add("max(fk_tencent_device_id) as fk_tencent_device_id");
        return this;
    }

    public TencentDeviceAccessInfoSelect sumFkTencentDeviceId(){
        set.add("sum(fk_tencent_device_id) as fk_tencent_device_id");
        return this;
    }
    public TencentDeviceAccessInfoSelect instanceId(){
        set.add("instance_id");
        return this;
    }

    public TencentDeviceAccessInfoSelect excludeInstanceId(){
        excludeSet.add("instance_id");
        return this;
    }

    public TencentDeviceAccessInfoSelect avgInstanceId(){
        set.add("avg(instance_id) as instance_id");
        return this;
    }

    public TencentDeviceAccessInfoSelect countInstanceId(){
        set.add("count(instance_id) as instance_id");
        return this;
    }

    public TencentDeviceAccessInfoSelect minInstanceId(){
        set.add("min(instance_id) as instance_id");
        return this;
    }

    public TencentDeviceAccessInfoSelect maxInstanceId(){
        set.add("max(instance_id) as instance_id");
        return this;
    }

    public TencentDeviceAccessInfoSelect sumInstanceId(){
        set.add("sum(instance_id) as instance_id");
        return this;
    }
    public TencentDeviceAccessInfoSelect serverIp(){
        set.add("server_ip");
        return this;
    }

    public TencentDeviceAccessInfoSelect excludeServerIp(){
        excludeSet.add("server_ip");
        return this;
    }

    public TencentDeviceAccessInfoSelect avgServerIp(){
        set.add("avg(server_ip) as server_ip");
        return this;
    }

    public TencentDeviceAccessInfoSelect countServerIp(){
        set.add("count(server_ip) as server_ip");
        return this;
    }

    public TencentDeviceAccessInfoSelect minServerIp(){
        set.add("min(server_ip) as server_ip");
        return this;
    }

    public TencentDeviceAccessInfoSelect maxServerIp(){
        set.add("max(server_ip) as server_ip");
        return this;
    }

    public TencentDeviceAccessInfoSelect sumServerIp(){
        set.add("sum(server_ip) as server_ip");
        return this;
    }
    public TencentDeviceAccessInfoSelect serverPort(){
        set.add("server_port");
        return this;
    }

    public TencentDeviceAccessInfoSelect excludeServerPort(){
        excludeSet.add("server_port");
        return this;
    }

    public TencentDeviceAccessInfoSelect avgServerPort(){
        set.add("avg(server_port) as server_port");
        return this;
    }

    public TencentDeviceAccessInfoSelect countServerPort(){
        set.add("count(server_port) as server_port");
        return this;
    }

    public TencentDeviceAccessInfoSelect minServerPort(){
        set.add("min(server_port) as server_port");
        return this;
    }

    public TencentDeviceAccessInfoSelect maxServerPort(){
        set.add("max(server_port) as server_port");
        return this;
    }

    public TencentDeviceAccessInfoSelect sumServerPort(){
        set.add("sum(server_port) as server_port");
        return this;
    }
    public TencentDeviceAccessInfoSelect publicIp(){
        set.add("public_ip");
        return this;
    }

    public TencentDeviceAccessInfoSelect excludePublicIp(){
        excludeSet.add("public_ip");
        return this;
    }

    public TencentDeviceAccessInfoSelect avgPublicIp(){
        set.add("avg(public_ip) as public_ip");
        return this;
    }

    public TencentDeviceAccessInfoSelect countPublicIp(){
        set.add("count(public_ip) as public_ip");
        return this;
    }

    public TencentDeviceAccessInfoSelect minPublicIp(){
        set.add("min(public_ip) as public_ip");
        return this;
    }

    public TencentDeviceAccessInfoSelect maxPublicIp(){
        set.add("max(public_ip) as public_ip");
        return this;
    }

    public TencentDeviceAccessInfoSelect sumPublicIp(){
        set.add("sum(public_ip) as public_ip");
        return this;
    }
    public TencentDeviceAccessInfoSelect publicPort(){
        set.add("public_port");
        return this;
    }

    public TencentDeviceAccessInfoSelect excludePublicPort(){
        excludeSet.add("public_port");
        return this;
    }

    public TencentDeviceAccessInfoSelect avgPublicPort(){
        set.add("avg(public_port) as public_port");
        return this;
    }

    public TencentDeviceAccessInfoSelect countPublicPort(){
        set.add("count(public_port) as public_port");
        return this;
    }

    public TencentDeviceAccessInfoSelect minPublicPort(){
        set.add("min(public_port) as public_port");
        return this;
    }

    public TencentDeviceAccessInfoSelect maxPublicPort(){
        set.add("max(public_port) as public_port");
        return this;
    }

    public TencentDeviceAccessInfoSelect sumPublicPort(){
        set.add("sum(public_port) as public_port");
        return this;
    }
    public TencentDeviceAccessInfoSelect isp(){
        set.add("isp");
        return this;
    }

    public TencentDeviceAccessInfoSelect excludeIsp(){
        excludeSet.add("isp");
        return this;
    }

    public TencentDeviceAccessInfoSelect avgIsp(){
        set.add("avg(isp) as isp");
        return this;
    }

    public TencentDeviceAccessInfoSelect countIsp(){
        set.add("count(isp) as isp");
        return this;
    }

    public TencentDeviceAccessInfoSelect minIsp(){
        set.add("min(isp) as isp");
        return this;
    }

    public TencentDeviceAccessInfoSelect maxIsp(){
        set.add("max(isp) as isp");
        return this;
    }

    public TencentDeviceAccessInfoSelect sumIsp(){
        set.add("sum(isp) as isp");
        return this;
    }
    public TencentDeviceAccessInfoSelect createTime(){
        set.add("create_time");
        return this;
    }

    public TencentDeviceAccessInfoSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public TencentDeviceAccessInfoSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public TencentDeviceAccessInfoSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public TencentDeviceAccessInfoSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public TencentDeviceAccessInfoSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public TencentDeviceAccessInfoSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public TencentDeviceAccessInfoSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public TencentDeviceAccessInfoSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public TencentDeviceAccessInfoSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public TencentDeviceAccessInfoSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public TencentDeviceAccessInfoSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public TencentDeviceAccessInfoSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public TencentDeviceAccessInfoSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }

    boolean distinct=false;

     public TencentDeviceAccessInfoSelect distinct(){
        this.distinct=true;
        return this;
    }

    public TencentDeviceAccessInfoSelect includes(Consumer<Set<String>> other){
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
