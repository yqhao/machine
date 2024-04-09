package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 腾讯账号区域表
 * </p>
 * "tencent_account_area"
 * @author PC001
 */
public class TencentAccountAreaSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public TencentAccountAreaSelect columns(){
        set.add("id");
        set.add("fk_tencent_account_id");
        set.add("fk_account_area_id");
        set.add("region");
        set.add("create_time");
        set.add("last_update_time");
        set.add("fk_pcp_area_id");
        return this;
    }

    public TencentAccountAreaSelect id(){
        set.add("id");
        return this;
    }

    public TencentAccountAreaSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public TencentAccountAreaSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public TencentAccountAreaSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public TencentAccountAreaSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public TencentAccountAreaSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public TencentAccountAreaSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public TencentAccountAreaSelect fkTencentAccountId(){
        set.add("fk_tencent_account_id");
        return this;
    }

    public TencentAccountAreaSelect excludeFkTencentAccountId(){
        excludeSet.add("fk_tencent_account_id");
        return this;
    }

    public TencentAccountAreaSelect avgFkTencentAccountId(){
        set.add("avg(fk_tencent_account_id) as fk_tencent_account_id");
        return this;
    }

    public TencentAccountAreaSelect countFkTencentAccountId(){
        set.add("count(fk_tencent_account_id) as fk_tencent_account_id");
        return this;
    }

    public TencentAccountAreaSelect minFkTencentAccountId(){
        set.add("min(fk_tencent_account_id) as fk_tencent_account_id");
        return this;
    }

    public TencentAccountAreaSelect maxFkTencentAccountId(){
        set.add("max(fk_tencent_account_id) as fk_tencent_account_id");
        return this;
    }

    public TencentAccountAreaSelect sumFkTencentAccountId(){
        set.add("sum(fk_tencent_account_id) as fk_tencent_account_id");
        return this;
    }
    public TencentAccountAreaSelect fkAccountAreaId(){
        set.add("fk_account_area_id");
        return this;
    }

    public TencentAccountAreaSelect excludeFkAccountAreaId(){
        excludeSet.add("fk_account_area_id");
        return this;
    }

    public TencentAccountAreaSelect avgFkAccountAreaId(){
        set.add("avg(fk_account_area_id) as fk_account_area_id");
        return this;
    }

    public TencentAccountAreaSelect countFkAccountAreaId(){
        set.add("count(fk_account_area_id) as fk_account_area_id");
        return this;
    }

    public TencentAccountAreaSelect minFkAccountAreaId(){
        set.add("min(fk_account_area_id) as fk_account_area_id");
        return this;
    }

    public TencentAccountAreaSelect maxFkAccountAreaId(){
        set.add("max(fk_account_area_id) as fk_account_area_id");
        return this;
    }

    public TencentAccountAreaSelect sumFkAccountAreaId(){
        set.add("sum(fk_account_area_id) as fk_account_area_id");
        return this;
    }
    public TencentAccountAreaSelect region(){
        set.add("region");
        return this;
    }

    public TencentAccountAreaSelect excludeRegion(){
        excludeSet.add("region");
        return this;
    }

    public TencentAccountAreaSelect avgRegion(){
        set.add("avg(region) as region");
        return this;
    }

    public TencentAccountAreaSelect countRegion(){
        set.add("count(region) as region");
        return this;
    }

    public TencentAccountAreaSelect minRegion(){
        set.add("min(region) as region");
        return this;
    }

    public TencentAccountAreaSelect maxRegion(){
        set.add("max(region) as region");
        return this;
    }

    public TencentAccountAreaSelect sumRegion(){
        set.add("sum(region) as region");
        return this;
    }
    public TencentAccountAreaSelect createTime(){
        set.add("create_time");
        return this;
    }

    public TencentAccountAreaSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public TencentAccountAreaSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public TencentAccountAreaSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public TencentAccountAreaSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public TencentAccountAreaSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public TencentAccountAreaSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public TencentAccountAreaSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public TencentAccountAreaSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public TencentAccountAreaSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public TencentAccountAreaSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public TencentAccountAreaSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public TencentAccountAreaSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public TencentAccountAreaSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public TencentAccountAreaSelect fkPcpAreaId(){
        set.add("fk_pcp_area_id");
        return this;
    }

    public TencentAccountAreaSelect excludeFkPcpAreaId(){
        excludeSet.add("fk_pcp_area_id");
        return this;
    }

    public TencentAccountAreaSelect avgFkPcpAreaId(){
        set.add("avg(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public TencentAccountAreaSelect countFkPcpAreaId(){
        set.add("count(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public TencentAccountAreaSelect minFkPcpAreaId(){
        set.add("min(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public TencentAccountAreaSelect maxFkPcpAreaId(){
        set.add("max(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public TencentAccountAreaSelect sumFkPcpAreaId(){
        set.add("sum(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    boolean distinct=false;

     public TencentAccountAreaSelect distinct(){
        this.distinct=true;
        return this;
    }

    public TencentAccountAreaSelect includes(Consumer<Set<String>> other){
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
