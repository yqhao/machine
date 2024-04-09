package com.suqi.center.machine.dao.viz.wrapper;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 云机端软件包类型表
 * </p>
 * "mc_service_software_package_type"
 * @author 18374
 */
public class McServiceSoftwarePackageTypeSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public McServiceSoftwarePackageTypeSelect columns(){
        set.add("id");
        set.add("name");
        set.add("status");
        set.add("create_time");
        set.add("last_update_time");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect id(){
        set.add("id");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public McServiceSoftwarePackageTypeSelect name(){
        set.add("name");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect excludeName(){
        excludeSet.add("name");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect avgName(){
        set.add("avg(name) as name");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect countName(){
        set.add("count(name) as name");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect minName(){
        set.add("min(name) as name");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect maxName(){
        set.add("max(name) as name");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect sumName(){
        set.add("sum(name) as name");
        return this;
    }
    public McServiceSoftwarePackageTypeSelect status(){
        set.add("status");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public McServiceSoftwarePackageTypeSelect createTime(){
        set.add("create_time");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public McServiceSoftwarePackageTypeSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public McServiceSoftwarePackageTypeSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }

    boolean distinct=false;

     public McServiceSoftwarePackageTypeSelect distinct(){
        this.distinct=true;
        return this;
    }

    public McServiceSoftwarePackageTypeSelect includes(Consumer<Set<String>> other){
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
