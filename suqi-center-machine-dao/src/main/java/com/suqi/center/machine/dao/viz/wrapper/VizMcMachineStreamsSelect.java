package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 机器streaming端口映射
 * </p>
 * "viz_mc_machine_streams"
 * @author PC001
 */
public class VizMcMachineStreamsSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public VizMcMachineStreamsSelect columns(){
        set.add("id");
        set.add("fk_mc_machine_id");
        set.add("device_id");
        set.add("instance_id");
        set.add("status");
        set.add("internal_address");
        set.add("internal_aport");
        set.add("internal_atype");
        set.add("internal_vport");
        set.add("external_address");
        set.add("external_aport");
        set.add("external_atype");
        set.add("external_vport");
        set.add("create_time");
        set.add("last_update_time");
        set.add("dr");
        return this;
    }

    public VizMcMachineStreamsSelect id(){
        set.add("id");
        return this;
    }

    public VizMcMachineStreamsSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public VizMcMachineStreamsSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public VizMcMachineStreamsSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public VizMcMachineStreamsSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public VizMcMachineStreamsSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public VizMcMachineStreamsSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public VizMcMachineStreamsSelect fkMcMachineId(){
        set.add("fk_mc_machine_id");
        return this;
    }

    public VizMcMachineStreamsSelect excludeFkMcMachineId(){
        excludeSet.add("fk_mc_machine_id");
        return this;
    }

    public VizMcMachineStreamsSelect avgFkMcMachineId(){
        set.add("avg(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineStreamsSelect countFkMcMachineId(){
        set.add("count(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineStreamsSelect minFkMcMachineId(){
        set.add("min(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineStreamsSelect maxFkMcMachineId(){
        set.add("max(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }

    public VizMcMachineStreamsSelect sumFkMcMachineId(){
        set.add("sum(fk_mc_machine_id) as fk_mc_machine_id");
        return this;
    }
    public VizMcMachineStreamsSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public VizMcMachineStreamsSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public VizMcMachineStreamsSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public VizMcMachineStreamsSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public VizMcMachineStreamsSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public VizMcMachineStreamsSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public VizMcMachineStreamsSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public VizMcMachineStreamsSelect instanceId(){
        set.add("instance_id");
        return this;
    }

    public VizMcMachineStreamsSelect excludeInstanceId(){
        excludeSet.add("instance_id");
        return this;
    }

    public VizMcMachineStreamsSelect avgInstanceId(){
        set.add("avg(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineStreamsSelect countInstanceId(){
        set.add("count(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineStreamsSelect minInstanceId(){
        set.add("min(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineStreamsSelect maxInstanceId(){
        set.add("max(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineStreamsSelect sumInstanceId(){
        set.add("sum(instance_id) as instance_id");
        return this;
    }
    public VizMcMachineStreamsSelect status(){
        set.add("status");
        return this;
    }

    public VizMcMachineStreamsSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public VizMcMachineStreamsSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public VizMcMachineStreamsSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public VizMcMachineStreamsSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public VizMcMachineStreamsSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public VizMcMachineStreamsSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public VizMcMachineStreamsSelect internalAddress(){
        set.add("internal_address");
        return this;
    }

    public VizMcMachineStreamsSelect excludeInternalAddress(){
        excludeSet.add("internal_address");
        return this;
    }

    public VizMcMachineStreamsSelect avgInternalAddress(){
        set.add("avg(internal_address) as internal_address");
        return this;
    }

    public VizMcMachineStreamsSelect countInternalAddress(){
        set.add("count(internal_address) as internal_address");
        return this;
    }

    public VizMcMachineStreamsSelect minInternalAddress(){
        set.add("min(internal_address) as internal_address");
        return this;
    }

    public VizMcMachineStreamsSelect maxInternalAddress(){
        set.add("max(internal_address) as internal_address");
        return this;
    }

    public VizMcMachineStreamsSelect sumInternalAddress(){
        set.add("sum(internal_address) as internal_address");
        return this;
    }
    public VizMcMachineStreamsSelect internalAport(){
        set.add("internal_aport");
        return this;
    }

    public VizMcMachineStreamsSelect excludeInternalAport(){
        excludeSet.add("internal_aport");
        return this;
    }

    public VizMcMachineStreamsSelect avgInternalAport(){
        set.add("avg(internal_aport) as internal_aport");
        return this;
    }

    public VizMcMachineStreamsSelect countInternalAport(){
        set.add("count(internal_aport) as internal_aport");
        return this;
    }

    public VizMcMachineStreamsSelect minInternalAport(){
        set.add("min(internal_aport) as internal_aport");
        return this;
    }

    public VizMcMachineStreamsSelect maxInternalAport(){
        set.add("max(internal_aport) as internal_aport");
        return this;
    }

    public VizMcMachineStreamsSelect sumInternalAport(){
        set.add("sum(internal_aport) as internal_aport");
        return this;
    }
    public VizMcMachineStreamsSelect internalAtype(){
        set.add("internal_atype");
        return this;
    }

    public VizMcMachineStreamsSelect excludeInternalAtype(){
        excludeSet.add("internal_atype");
        return this;
    }

    public VizMcMachineStreamsSelect avgInternalAtype(){
        set.add("avg(internal_atype) as internal_atype");
        return this;
    }

    public VizMcMachineStreamsSelect countInternalAtype(){
        set.add("count(internal_atype) as internal_atype");
        return this;
    }

    public VizMcMachineStreamsSelect minInternalAtype(){
        set.add("min(internal_atype) as internal_atype");
        return this;
    }

    public VizMcMachineStreamsSelect maxInternalAtype(){
        set.add("max(internal_atype) as internal_atype");
        return this;
    }

    public VizMcMachineStreamsSelect sumInternalAtype(){
        set.add("sum(internal_atype) as internal_atype");
        return this;
    }
    public VizMcMachineStreamsSelect internalVport(){
        set.add("internal_vport");
        return this;
    }

    public VizMcMachineStreamsSelect excludeInternalVport(){
        excludeSet.add("internal_vport");
        return this;
    }

    public VizMcMachineStreamsSelect avgInternalVport(){
        set.add("avg(internal_vport) as internal_vport");
        return this;
    }

    public VizMcMachineStreamsSelect countInternalVport(){
        set.add("count(internal_vport) as internal_vport");
        return this;
    }

    public VizMcMachineStreamsSelect minInternalVport(){
        set.add("min(internal_vport) as internal_vport");
        return this;
    }

    public VizMcMachineStreamsSelect maxInternalVport(){
        set.add("max(internal_vport) as internal_vport");
        return this;
    }

    public VizMcMachineStreamsSelect sumInternalVport(){
        set.add("sum(internal_vport) as internal_vport");
        return this;
    }
    public VizMcMachineStreamsSelect externalAddress(){
        set.add("external_address");
        return this;
    }

    public VizMcMachineStreamsSelect excludeExternalAddress(){
        excludeSet.add("external_address");
        return this;
    }

    public VizMcMachineStreamsSelect avgExternalAddress(){
        set.add("avg(external_address) as external_address");
        return this;
    }

    public VizMcMachineStreamsSelect countExternalAddress(){
        set.add("count(external_address) as external_address");
        return this;
    }

    public VizMcMachineStreamsSelect minExternalAddress(){
        set.add("min(external_address) as external_address");
        return this;
    }

    public VizMcMachineStreamsSelect maxExternalAddress(){
        set.add("max(external_address) as external_address");
        return this;
    }

    public VizMcMachineStreamsSelect sumExternalAddress(){
        set.add("sum(external_address) as external_address");
        return this;
    }
    public VizMcMachineStreamsSelect externalAport(){
        set.add("external_aport");
        return this;
    }

    public VizMcMachineStreamsSelect excludeExternalAport(){
        excludeSet.add("external_aport");
        return this;
    }

    public VizMcMachineStreamsSelect avgExternalAport(){
        set.add("avg(external_aport) as external_aport");
        return this;
    }

    public VizMcMachineStreamsSelect countExternalAport(){
        set.add("count(external_aport) as external_aport");
        return this;
    }

    public VizMcMachineStreamsSelect minExternalAport(){
        set.add("min(external_aport) as external_aport");
        return this;
    }

    public VizMcMachineStreamsSelect maxExternalAport(){
        set.add("max(external_aport) as external_aport");
        return this;
    }

    public VizMcMachineStreamsSelect sumExternalAport(){
        set.add("sum(external_aport) as external_aport");
        return this;
    }
    public VizMcMachineStreamsSelect externalAtype(){
        set.add("external_atype");
        return this;
    }

    public VizMcMachineStreamsSelect excludeExternalAtype(){
        excludeSet.add("external_atype");
        return this;
    }

    public VizMcMachineStreamsSelect avgExternalAtype(){
        set.add("avg(external_atype) as external_atype");
        return this;
    }

    public VizMcMachineStreamsSelect countExternalAtype(){
        set.add("count(external_atype) as external_atype");
        return this;
    }

    public VizMcMachineStreamsSelect minExternalAtype(){
        set.add("min(external_atype) as external_atype");
        return this;
    }

    public VizMcMachineStreamsSelect maxExternalAtype(){
        set.add("max(external_atype) as external_atype");
        return this;
    }

    public VizMcMachineStreamsSelect sumExternalAtype(){
        set.add("sum(external_atype) as external_atype");
        return this;
    }
    public VizMcMachineStreamsSelect externalVport(){
        set.add("external_vport");
        return this;
    }

    public VizMcMachineStreamsSelect excludeExternalVport(){
        excludeSet.add("external_vport");
        return this;
    }

    public VizMcMachineStreamsSelect avgExternalVport(){
        set.add("avg(external_vport) as external_vport");
        return this;
    }

    public VizMcMachineStreamsSelect countExternalVport(){
        set.add("count(external_vport) as external_vport");
        return this;
    }

    public VizMcMachineStreamsSelect minExternalVport(){
        set.add("min(external_vport) as external_vport");
        return this;
    }

    public VizMcMachineStreamsSelect maxExternalVport(){
        set.add("max(external_vport) as external_vport");
        return this;
    }

    public VizMcMachineStreamsSelect sumExternalVport(){
        set.add("sum(external_vport) as external_vport");
        return this;
    }
    public VizMcMachineStreamsSelect createTime(){
        set.add("create_time");
        return this;
    }

    public VizMcMachineStreamsSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public VizMcMachineStreamsSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public VizMcMachineStreamsSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public VizMcMachineStreamsSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public VizMcMachineStreamsSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public VizMcMachineStreamsSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public VizMcMachineStreamsSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public VizMcMachineStreamsSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public VizMcMachineStreamsSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public VizMcMachineStreamsSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public VizMcMachineStreamsSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public VizMcMachineStreamsSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public VizMcMachineStreamsSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public VizMcMachineStreamsSelect dr(){
        set.add("dr");
        return this;
    }

    public VizMcMachineStreamsSelect excludeDr(){
        excludeSet.add("dr");
        return this;
    }

    public VizMcMachineStreamsSelect avgDr(){
        set.add("avg(dr) as dr");
        return this;
    }

    public VizMcMachineStreamsSelect countDr(){
        set.add("count(dr) as dr");
        return this;
    }

    public VizMcMachineStreamsSelect minDr(){
        set.add("min(dr) as dr");
        return this;
    }

    public VizMcMachineStreamsSelect maxDr(){
        set.add("max(dr) as dr");
        return this;
    }

    public VizMcMachineStreamsSelect sumDr(){
        set.add("sum(dr) as dr");
        return this;
    }

    boolean distinct=false;

     public VizMcMachineStreamsSelect distinct(){
        this.distinct=true;
        return this;
    }

    public VizMcMachineStreamsSelect includes(Consumer<Set<String>> other){
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
