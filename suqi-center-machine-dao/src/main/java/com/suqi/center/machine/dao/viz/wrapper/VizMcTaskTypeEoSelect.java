package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 任务类型表
 * </p>
 * "viz_mc_task_type"
 * @author 18374
 */
public class VizMcTaskTypeEoSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public VizMcTaskTypeEoSelect columns(){
        set.add("id");
        set.add("name");
        set.add("create_time");
        set.add("last_update_time");
        set.add("dr");
        return this;
    }

    public VizMcTaskTypeEoSelect id(){
        set.add("id");
        return this;
    }

    public VizMcTaskTypeEoSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public VizMcTaskTypeEoSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public VizMcTaskTypeEoSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public VizMcTaskTypeEoSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public VizMcTaskTypeEoSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public VizMcTaskTypeEoSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public VizMcTaskTypeEoSelect name(){
        set.add("name");
        return this;
    }

    public VizMcTaskTypeEoSelect excludeName(){
        excludeSet.add("name");
        return this;
    }

    public VizMcTaskTypeEoSelect avgName(){
        set.add("avg(name) as name");
        return this;
    }

    public VizMcTaskTypeEoSelect countName(){
        set.add("count(name) as name");
        return this;
    }

    public VizMcTaskTypeEoSelect minName(){
        set.add("min(name) as name");
        return this;
    }

    public VizMcTaskTypeEoSelect maxName(){
        set.add("max(name) as name");
        return this;
    }

    public VizMcTaskTypeEoSelect sumName(){
        set.add("sum(name) as name");
        return this;
    }
    public VizMcTaskTypeEoSelect createTime(){
        set.add("create_time");
        return this;
    }

    public VizMcTaskTypeEoSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public VizMcTaskTypeEoSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public VizMcTaskTypeEoSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public VizMcTaskTypeEoSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public VizMcTaskTypeEoSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public VizMcTaskTypeEoSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public VizMcTaskTypeEoSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public VizMcTaskTypeEoSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public VizMcTaskTypeEoSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public VizMcTaskTypeEoSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public VizMcTaskTypeEoSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public VizMcTaskTypeEoSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public VizMcTaskTypeEoSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public VizMcTaskTypeEoSelect dr(){
        set.add("dr");
        return this;
    }

    public VizMcTaskTypeEoSelect excludeDr(){
        excludeSet.add("dr");
        return this;
    }

    public VizMcTaskTypeEoSelect avgDr(){
        set.add("avg(dr) as dr");
        return this;
    }

    public VizMcTaskTypeEoSelect countDr(){
        set.add("count(dr) as dr");
        return this;
    }

    public VizMcTaskTypeEoSelect minDr(){
        set.add("min(dr) as dr");
        return this;
    }

    public VizMcTaskTypeEoSelect maxDr(){
        set.add("max(dr) as dr");
        return this;
    }

    public VizMcTaskTypeEoSelect sumDr(){
        set.add("sum(dr) as dr");
        return this;
    }

    boolean distinct=false;

     public VizMcTaskTypeEoSelect distinct(){
        this.distinct=true;
        return this;
    }

    public VizMcTaskTypeEoSelect includes(Consumer<Set<String>> other){
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
