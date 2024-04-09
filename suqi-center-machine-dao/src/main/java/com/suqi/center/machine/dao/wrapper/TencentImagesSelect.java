package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 腾讯镜像管理
 * </p>
 * "tencent_images"
 * @author PC001
 */
public class TencentImagesSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public TencentImagesSelect columns(){
        set.add("id");
        set.add("fk_tencent_account_area_id");
        set.add("region");
        set.add("title");
        set.add("version_code");
        set.add("url");
        set.add("md5");
        set.add("image_description");
        set.add("image_id");
        set.add("status");
        set.add("create_time");
        set.add("last_update_time");
        set.add("create_user_id");
        set.add("last_update_id");
        return this;
    }

    public TencentImagesSelect id(){
        set.add("id");
        return this;
    }

    public TencentImagesSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public TencentImagesSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public TencentImagesSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public TencentImagesSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public TencentImagesSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public TencentImagesSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public TencentImagesSelect fkTencentAccountAreaId(){
        set.add("fk_tencent_account_area_id");
        return this;
    }

    public TencentImagesSelect excludeFkTencentAccountAreaId(){
        excludeSet.add("fk_tencent_account_area_id");
        return this;
    }

    public TencentImagesSelect avgFkTencentAccountAreaId(){
        set.add("avg(fk_tencent_account_area_id) as fk_tencent_account_area_id");
        return this;
    }

    public TencentImagesSelect countFkTencentAccountAreaId(){
        set.add("count(fk_tencent_account_area_id) as fk_tencent_account_area_id");
        return this;
    }

    public TencentImagesSelect minFkTencentAccountAreaId(){
        set.add("min(fk_tencent_account_area_id) as fk_tencent_account_area_id");
        return this;
    }

    public TencentImagesSelect maxFkTencentAccountAreaId(){
        set.add("max(fk_tencent_account_area_id) as fk_tencent_account_area_id");
        return this;
    }

    public TencentImagesSelect sumFkTencentAccountAreaId(){
        set.add("sum(fk_tencent_account_area_id) as fk_tencent_account_area_id");
        return this;
    }
    public TencentImagesSelect region(){
        set.add("region");
        return this;
    }

    public TencentImagesSelect excludeRegion(){
        excludeSet.add("region");
        return this;
    }

    public TencentImagesSelect avgRegion(){
        set.add("avg(region) as region");
        return this;
    }

    public TencentImagesSelect countRegion(){
        set.add("count(region) as region");
        return this;
    }

    public TencentImagesSelect minRegion(){
        set.add("min(region) as region");
        return this;
    }

    public TencentImagesSelect maxRegion(){
        set.add("max(region) as region");
        return this;
    }

    public TencentImagesSelect sumRegion(){
        set.add("sum(region) as region");
        return this;
    }
    public TencentImagesSelect title(){
        set.add("title");
        return this;
    }

    public TencentImagesSelect excludeTitle(){
        excludeSet.add("title");
        return this;
    }

    public TencentImagesSelect avgTitle(){
        set.add("avg(title) as title");
        return this;
    }

    public TencentImagesSelect countTitle(){
        set.add("count(title) as title");
        return this;
    }

    public TencentImagesSelect minTitle(){
        set.add("min(title) as title");
        return this;
    }

    public TencentImagesSelect maxTitle(){
        set.add("max(title) as title");
        return this;
    }

    public TencentImagesSelect sumTitle(){
        set.add("sum(title) as title");
        return this;
    }
    public TencentImagesSelect versionCode(){
        set.add("version_code");
        return this;
    }

    public TencentImagesSelect excludeVersionCode(){
        excludeSet.add("version_code");
        return this;
    }

    public TencentImagesSelect avgVersionCode(){
        set.add("avg(version_code) as version_code");
        return this;
    }

    public TencentImagesSelect countVersionCode(){
        set.add("count(version_code) as version_code");
        return this;
    }

    public TencentImagesSelect minVersionCode(){
        set.add("min(version_code) as version_code");
        return this;
    }

    public TencentImagesSelect maxVersionCode(){
        set.add("max(version_code) as version_code");
        return this;
    }

    public TencentImagesSelect sumVersionCode(){
        set.add("sum(version_code) as version_code");
        return this;
    }
    public TencentImagesSelect url(){
        set.add("url");
        return this;
    }

    public TencentImagesSelect excludeUrl(){
        excludeSet.add("url");
        return this;
    }

    public TencentImagesSelect avgUrl(){
        set.add("avg(url) as url");
        return this;
    }

    public TencentImagesSelect countUrl(){
        set.add("count(url) as url");
        return this;
    }

    public TencentImagesSelect minUrl(){
        set.add("min(url) as url");
        return this;
    }

    public TencentImagesSelect maxUrl(){
        set.add("max(url) as url");
        return this;
    }

    public TencentImagesSelect sumUrl(){
        set.add("sum(url) as url");
        return this;
    }
    public TencentImagesSelect md5(){
        set.add("md5");
        return this;
    }

    public TencentImagesSelect excludeMd5(){
        excludeSet.add("md5");
        return this;
    }

    public TencentImagesSelect avgMd5(){
        set.add("avg(md5) as md5");
        return this;
    }

    public TencentImagesSelect countMd5(){
        set.add("count(md5) as md5");
        return this;
    }

    public TencentImagesSelect minMd5(){
        set.add("min(md5) as md5");
        return this;
    }

    public TencentImagesSelect maxMd5(){
        set.add("max(md5) as md5");
        return this;
    }

    public TencentImagesSelect sumMd5(){
        set.add("sum(md5) as md5");
        return this;
    }
    public TencentImagesSelect imageDescription(){
        set.add("image_description");
        return this;
    }

    public TencentImagesSelect excludeImageDescription(){
        excludeSet.add("image_description");
        return this;
    }

    public TencentImagesSelect avgImageDescription(){
        set.add("avg(image_description) as image_description");
        return this;
    }

    public TencentImagesSelect countImageDescription(){
        set.add("count(image_description) as image_description");
        return this;
    }

    public TencentImagesSelect minImageDescription(){
        set.add("min(image_description) as image_description");
        return this;
    }

    public TencentImagesSelect maxImageDescription(){
        set.add("max(image_description) as image_description");
        return this;
    }

    public TencentImagesSelect sumImageDescription(){
        set.add("sum(image_description) as image_description");
        return this;
    }
    public TencentImagesSelect imageId(){
        set.add("image_id");
        return this;
    }

    public TencentImagesSelect excludeImageId(){
        excludeSet.add("image_id");
        return this;
    }

    public TencentImagesSelect avgImageId(){
        set.add("avg(image_id) as image_id");
        return this;
    }

    public TencentImagesSelect countImageId(){
        set.add("count(image_id) as image_id");
        return this;
    }

    public TencentImagesSelect minImageId(){
        set.add("min(image_id) as image_id");
        return this;
    }

    public TencentImagesSelect maxImageId(){
        set.add("max(image_id) as image_id");
        return this;
    }

    public TencentImagesSelect sumImageId(){
        set.add("sum(image_id) as image_id");
        return this;
    }
    public TencentImagesSelect status(){
        set.add("status");
        return this;
    }

    public TencentImagesSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public TencentImagesSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public TencentImagesSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public TencentImagesSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public TencentImagesSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public TencentImagesSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public TencentImagesSelect createTime(){
        set.add("create_time");
        return this;
    }

    public TencentImagesSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public TencentImagesSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public TencentImagesSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public TencentImagesSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public TencentImagesSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public TencentImagesSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public TencentImagesSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public TencentImagesSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public TencentImagesSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public TencentImagesSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public TencentImagesSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public TencentImagesSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public TencentImagesSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public TencentImagesSelect createUserId(){
        set.add("create_user_id");
        return this;
    }

    public TencentImagesSelect excludeCreateUserId(){
        excludeSet.add("create_user_id");
        return this;
    }

    public TencentImagesSelect avgCreateUserId(){
        set.add("avg(create_user_id) as create_user_id");
        return this;
    }

    public TencentImagesSelect countCreateUserId(){
        set.add("count(create_user_id) as create_user_id");
        return this;
    }

    public TencentImagesSelect minCreateUserId(){
        set.add("min(create_user_id) as create_user_id");
        return this;
    }

    public TencentImagesSelect maxCreateUserId(){
        set.add("max(create_user_id) as create_user_id");
        return this;
    }

    public TencentImagesSelect sumCreateUserId(){
        set.add("sum(create_user_id) as create_user_id");
        return this;
    }
    public TencentImagesSelect lastUpdateId(){
        set.add("last_update_id");
        return this;
    }

    public TencentImagesSelect excludeLastUpdateId(){
        excludeSet.add("last_update_id");
        return this;
    }

    public TencentImagesSelect avgLastUpdateId(){
        set.add("avg(last_update_id) as last_update_id");
        return this;
    }

    public TencentImagesSelect countLastUpdateId(){
        set.add("count(last_update_id) as last_update_id");
        return this;
    }

    public TencentImagesSelect minLastUpdateId(){
        set.add("min(last_update_id) as last_update_id");
        return this;
    }

    public TencentImagesSelect maxLastUpdateId(){
        set.add("max(last_update_id) as last_update_id");
        return this;
    }

    public TencentImagesSelect sumLastUpdateId(){
        set.add("sum(last_update_id) as last_update_id");
        return this;
    }

    boolean distinct=false;

     public TencentImagesSelect distinct(){
        this.distinct=true;
        return this;
    }

    public TencentImagesSelect includes(Consumer<Set<String>> other){
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
