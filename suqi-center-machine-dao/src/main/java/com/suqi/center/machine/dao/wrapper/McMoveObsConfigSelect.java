package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 
 * </p>
 * "mc_move_obs_config"
 * @author PC001
 */
public class McMoveObsConfigSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public McMoveObsConfigSelect columns(){
        set.add("id");
        set.add("fk_member_id");
        set.add("fk_pcp_area_id");
        set.add("area_name");
        set.add("bucket_name");
        set.add("move_include_files");
        set.add("move_exclude_files");
        set.add("status");
        set.add("create_time");
        set.add("last_update_time");
        return this;
    }

    public McMoveObsConfigSelect id(){
        set.add("id");
        return this;
    }

    public McMoveObsConfigSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public McMoveObsConfigSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public McMoveObsConfigSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public McMoveObsConfigSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public McMoveObsConfigSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public McMoveObsConfigSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public McMoveObsConfigSelect fkMemberId(){
        set.add("fk_member_id");
        return this;
    }

    public McMoveObsConfigSelect excludeFkMemberId(){
        excludeSet.add("fk_member_id");
        return this;
    }

    public McMoveObsConfigSelect avgFkMemberId(){
        set.add("avg(fk_member_id) as fk_member_id");
        return this;
    }

    public McMoveObsConfigSelect countFkMemberId(){
        set.add("count(fk_member_id) as fk_member_id");
        return this;
    }

    public McMoveObsConfigSelect minFkMemberId(){
        set.add("min(fk_member_id) as fk_member_id");
        return this;
    }

    public McMoveObsConfigSelect maxFkMemberId(){
        set.add("max(fk_member_id) as fk_member_id");
        return this;
    }

    public McMoveObsConfigSelect sumFkMemberId(){
        set.add("sum(fk_member_id) as fk_member_id");
        return this;
    }
    public McMoveObsConfigSelect fkPcpAreaId(){
        set.add("fk_pcp_area_id");
        return this;
    }

    public McMoveObsConfigSelect excludeFkPcpAreaId(){
        excludeSet.add("fk_pcp_area_id");
        return this;
    }

    public McMoveObsConfigSelect avgFkPcpAreaId(){
        set.add("avg(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public McMoveObsConfigSelect countFkPcpAreaId(){
        set.add("count(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public McMoveObsConfigSelect minFkPcpAreaId(){
        set.add("min(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public McMoveObsConfigSelect maxFkPcpAreaId(){
        set.add("max(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public McMoveObsConfigSelect sumFkPcpAreaId(){
        set.add("sum(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }
    public McMoveObsConfigSelect areaName(){
        set.add("area_name");
        return this;
    }

    public McMoveObsConfigSelect excludeAreaName(){
        excludeSet.add("area_name");
        return this;
    }

    public McMoveObsConfigSelect avgAreaName(){
        set.add("avg(area_name) as area_name");
        return this;
    }

    public McMoveObsConfigSelect countAreaName(){
        set.add("count(area_name) as area_name");
        return this;
    }

    public McMoveObsConfigSelect minAreaName(){
        set.add("min(area_name) as area_name");
        return this;
    }

    public McMoveObsConfigSelect maxAreaName(){
        set.add("max(area_name) as area_name");
        return this;
    }

    public McMoveObsConfigSelect sumAreaName(){
        set.add("sum(area_name) as area_name");
        return this;
    }
    public McMoveObsConfigSelect bucketName(){
        set.add("bucket_name");
        return this;
    }

    public McMoveObsConfigSelect excludeBucketName(){
        excludeSet.add("bucket_name");
        return this;
    }

    public McMoveObsConfigSelect avgBucketName(){
        set.add("avg(bucket_name) as bucket_name");
        return this;
    }

    public McMoveObsConfigSelect countBucketName(){
        set.add("count(bucket_name) as bucket_name");
        return this;
    }

    public McMoveObsConfigSelect minBucketName(){
        set.add("min(bucket_name) as bucket_name");
        return this;
    }

    public McMoveObsConfigSelect maxBucketName(){
        set.add("max(bucket_name) as bucket_name");
        return this;
    }

    public McMoveObsConfigSelect sumBucketName(){
        set.add("sum(bucket_name) as bucket_name");
        return this;
    }
    public McMoveObsConfigSelect moveIncludeFiles(){
        set.add("move_include_files");
        return this;
    }

    public McMoveObsConfigSelect excludeMoveIncludeFiles(){
        excludeSet.add("move_include_files");
        return this;
    }

    public McMoveObsConfigSelect avgMoveIncludeFiles(){
        set.add("avg(move_include_files) as move_include_files");
        return this;
    }

    public McMoveObsConfigSelect countMoveIncludeFiles(){
        set.add("count(move_include_files) as move_include_files");
        return this;
    }

    public McMoveObsConfigSelect minMoveIncludeFiles(){
        set.add("min(move_include_files) as move_include_files");
        return this;
    }

    public McMoveObsConfigSelect maxMoveIncludeFiles(){
        set.add("max(move_include_files) as move_include_files");
        return this;
    }

    public McMoveObsConfigSelect sumMoveIncludeFiles(){
        set.add("sum(move_include_files) as move_include_files");
        return this;
    }
    public McMoveObsConfigSelect moveExcludeFiles(){
        set.add("move_exclude_files");
        return this;
    }

    public McMoveObsConfigSelect excludeMoveExcludeFiles(){
        excludeSet.add("move_exclude_files");
        return this;
    }

    public McMoveObsConfigSelect avgMoveExcludeFiles(){
        set.add("avg(move_exclude_files) as move_exclude_files");
        return this;
    }

    public McMoveObsConfigSelect countMoveExcludeFiles(){
        set.add("count(move_exclude_files) as move_exclude_files");
        return this;
    }

    public McMoveObsConfigSelect minMoveExcludeFiles(){
        set.add("min(move_exclude_files) as move_exclude_files");
        return this;
    }

    public McMoveObsConfigSelect maxMoveExcludeFiles(){
        set.add("max(move_exclude_files) as move_exclude_files");
        return this;
    }

    public McMoveObsConfigSelect sumMoveExcludeFiles(){
        set.add("sum(move_exclude_files) as move_exclude_files");
        return this;
    }
    public McMoveObsConfigSelect status(){
        set.add("status");
        return this;
    }

    public McMoveObsConfigSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public McMoveObsConfigSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public McMoveObsConfigSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public McMoveObsConfigSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public McMoveObsConfigSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public McMoveObsConfigSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public McMoveObsConfigSelect createTime(){
        set.add("create_time");
        return this;
    }

    public McMoveObsConfigSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public McMoveObsConfigSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public McMoveObsConfigSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public McMoveObsConfigSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public McMoveObsConfigSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public McMoveObsConfigSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public McMoveObsConfigSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public McMoveObsConfigSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public McMoveObsConfigSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public McMoveObsConfigSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public McMoveObsConfigSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public McMoveObsConfigSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public McMoveObsConfigSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }

    boolean distinct=false;

     public McMoveObsConfigSelect distinct(){
        this.distinct=true;
        return this;
    }

    public McMoveObsConfigSelect includes(Consumer<Set<String>> other){
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
