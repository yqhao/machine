package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 百度云机重置记录
 * </p>
 * "baidu_reset_record"
 * @author PC001
 */
public class BaiduResetRecordSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public BaiduResetRecordSelect columns(){
        set.add("id");
        set.add("fk_baidu_device_id");
        set.add("code");
        set.add("fk_baidu_images_id");
        set.add("version_code");
        set.add("title");
        set.add("old_image_version_id");
        set.add("reset_image_version_id");
        set.add("reset_user_id");
        set.add("response");
        set.add("create_time");
        return this;
    }

    public BaiduResetRecordSelect id(){
        set.add("id");
        return this;
    }

    public BaiduResetRecordSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public BaiduResetRecordSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public BaiduResetRecordSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public BaiduResetRecordSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public BaiduResetRecordSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public BaiduResetRecordSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public BaiduResetRecordSelect fkBaiduDeviceId(){
        set.add("fk_baidu_device_id");
        return this;
    }

    public BaiduResetRecordSelect excludeFkBaiduDeviceId(){
        excludeSet.add("fk_baidu_device_id");
        return this;
    }

    public BaiduResetRecordSelect avgFkBaiduDeviceId(){
        set.add("avg(fk_baidu_device_id) as fk_baidu_device_id");
        return this;
    }

    public BaiduResetRecordSelect countFkBaiduDeviceId(){
        set.add("count(fk_baidu_device_id) as fk_baidu_device_id");
        return this;
    }

    public BaiduResetRecordSelect minFkBaiduDeviceId(){
        set.add("min(fk_baidu_device_id) as fk_baidu_device_id");
        return this;
    }

    public BaiduResetRecordSelect maxFkBaiduDeviceId(){
        set.add("max(fk_baidu_device_id) as fk_baidu_device_id");
        return this;
    }

    public BaiduResetRecordSelect sumFkBaiduDeviceId(){
        set.add("sum(fk_baidu_device_id) as fk_baidu_device_id");
        return this;
    }
    public BaiduResetRecordSelect code(){
        set.add("code");
        return this;
    }

    public BaiduResetRecordSelect excludeCode(){
        excludeSet.add("code");
        return this;
    }

    public BaiduResetRecordSelect avgCode(){
        set.add("avg(code) as code");
        return this;
    }

    public BaiduResetRecordSelect countCode(){
        set.add("count(code) as code");
        return this;
    }

    public BaiduResetRecordSelect minCode(){
        set.add("min(code) as code");
        return this;
    }

    public BaiduResetRecordSelect maxCode(){
        set.add("max(code) as code");
        return this;
    }

    public BaiduResetRecordSelect sumCode(){
        set.add("sum(code) as code");
        return this;
    }
    public BaiduResetRecordSelect fkBaiduImagesId(){
        set.add("fk_baidu_images_id");
        return this;
    }

    public BaiduResetRecordSelect excludeFkBaiduImagesId(){
        excludeSet.add("fk_baidu_images_id");
        return this;
    }

    public BaiduResetRecordSelect avgFkBaiduImagesId(){
        set.add("avg(fk_baidu_images_id) as fk_baidu_images_id");
        return this;
    }

    public BaiduResetRecordSelect countFkBaiduImagesId(){
        set.add("count(fk_baidu_images_id) as fk_baidu_images_id");
        return this;
    }

    public BaiduResetRecordSelect minFkBaiduImagesId(){
        set.add("min(fk_baidu_images_id) as fk_baidu_images_id");
        return this;
    }

    public BaiduResetRecordSelect maxFkBaiduImagesId(){
        set.add("max(fk_baidu_images_id) as fk_baidu_images_id");
        return this;
    }

    public BaiduResetRecordSelect sumFkBaiduImagesId(){
        set.add("sum(fk_baidu_images_id) as fk_baidu_images_id");
        return this;
    }
    public BaiduResetRecordSelect versionCode(){
        set.add("version_code");
        return this;
    }

    public BaiduResetRecordSelect excludeVersionCode(){
        excludeSet.add("version_code");
        return this;
    }

    public BaiduResetRecordSelect avgVersionCode(){
        set.add("avg(version_code) as version_code");
        return this;
    }

    public BaiduResetRecordSelect countVersionCode(){
        set.add("count(version_code) as version_code");
        return this;
    }

    public BaiduResetRecordSelect minVersionCode(){
        set.add("min(version_code) as version_code");
        return this;
    }

    public BaiduResetRecordSelect maxVersionCode(){
        set.add("max(version_code) as version_code");
        return this;
    }

    public BaiduResetRecordSelect sumVersionCode(){
        set.add("sum(version_code) as version_code");
        return this;
    }
    public BaiduResetRecordSelect title(){
        set.add("title");
        return this;
    }

    public BaiduResetRecordSelect excludeTitle(){
        excludeSet.add("title");
        return this;
    }

    public BaiduResetRecordSelect avgTitle(){
        set.add("avg(title) as title");
        return this;
    }

    public BaiduResetRecordSelect countTitle(){
        set.add("count(title) as title");
        return this;
    }

    public BaiduResetRecordSelect minTitle(){
        set.add("min(title) as title");
        return this;
    }

    public BaiduResetRecordSelect maxTitle(){
        set.add("max(title) as title");
        return this;
    }

    public BaiduResetRecordSelect sumTitle(){
        set.add("sum(title) as title");
        return this;
    }
    public BaiduResetRecordSelect oldImageVersionId(){
        set.add("old_image_version_id");
        return this;
    }

    public BaiduResetRecordSelect excludeOldImageVersionId(){
        excludeSet.add("old_image_version_id");
        return this;
    }

    public BaiduResetRecordSelect avgOldImageVersionId(){
        set.add("avg(old_image_version_id) as old_image_version_id");
        return this;
    }

    public BaiduResetRecordSelect countOldImageVersionId(){
        set.add("count(old_image_version_id) as old_image_version_id");
        return this;
    }

    public BaiduResetRecordSelect minOldImageVersionId(){
        set.add("min(old_image_version_id) as old_image_version_id");
        return this;
    }

    public BaiduResetRecordSelect maxOldImageVersionId(){
        set.add("max(old_image_version_id) as old_image_version_id");
        return this;
    }

    public BaiduResetRecordSelect sumOldImageVersionId(){
        set.add("sum(old_image_version_id) as old_image_version_id");
        return this;
    }
    public BaiduResetRecordSelect resetImageVersionId(){
        set.add("reset_image_version_id");
        return this;
    }

    public BaiduResetRecordSelect excludeResetImageVersionId(){
        excludeSet.add("reset_image_version_id");
        return this;
    }

    public BaiduResetRecordSelect avgResetImageVersionId(){
        set.add("avg(reset_image_version_id) as reset_image_version_id");
        return this;
    }

    public BaiduResetRecordSelect countResetImageVersionId(){
        set.add("count(reset_image_version_id) as reset_image_version_id");
        return this;
    }

    public BaiduResetRecordSelect minResetImageVersionId(){
        set.add("min(reset_image_version_id) as reset_image_version_id");
        return this;
    }

    public BaiduResetRecordSelect maxResetImageVersionId(){
        set.add("max(reset_image_version_id) as reset_image_version_id");
        return this;
    }

    public BaiduResetRecordSelect sumResetImageVersionId(){
        set.add("sum(reset_image_version_id) as reset_image_version_id");
        return this;
    }
    public BaiduResetRecordSelect resetUserId(){
        set.add("reset_user_id");
        return this;
    }

    public BaiduResetRecordSelect excludeResetUserId(){
        excludeSet.add("reset_user_id");
        return this;
    }

    public BaiduResetRecordSelect avgResetUserId(){
        set.add("avg(reset_user_id) as reset_user_id");
        return this;
    }

    public BaiduResetRecordSelect countResetUserId(){
        set.add("count(reset_user_id) as reset_user_id");
        return this;
    }

    public BaiduResetRecordSelect minResetUserId(){
        set.add("min(reset_user_id) as reset_user_id");
        return this;
    }

    public BaiduResetRecordSelect maxResetUserId(){
        set.add("max(reset_user_id) as reset_user_id");
        return this;
    }

    public BaiduResetRecordSelect sumResetUserId(){
        set.add("sum(reset_user_id) as reset_user_id");
        return this;
    }
    public BaiduResetRecordSelect response(){
        set.add("response");
        return this;
    }

    public BaiduResetRecordSelect excludeResponse(){
        excludeSet.add("response");
        return this;
    }

    public BaiduResetRecordSelect avgResponse(){
        set.add("avg(response) as response");
        return this;
    }

    public BaiduResetRecordSelect countResponse(){
        set.add("count(response) as response");
        return this;
    }

    public BaiduResetRecordSelect minResponse(){
        set.add("min(response) as response");
        return this;
    }

    public BaiduResetRecordSelect maxResponse(){
        set.add("max(response) as response");
        return this;
    }

    public BaiduResetRecordSelect sumResponse(){
        set.add("sum(response) as response");
        return this;
    }
    public BaiduResetRecordSelect createTime(){
        set.add("create_time");
        return this;
    }

    public BaiduResetRecordSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public BaiduResetRecordSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public BaiduResetRecordSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public BaiduResetRecordSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public BaiduResetRecordSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public BaiduResetRecordSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }

    boolean distinct=false;

     public BaiduResetRecordSelect distinct(){
        this.distinct=true;
        return this;
    }

    public BaiduResetRecordSelect includes(Consumer<Set<String>> other){
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
