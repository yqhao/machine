package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 腾讯云机重置记录
 * </p>
 * "tencent_reset_record"
 * @author PC001
 */
public class TencentResetRecordSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public TencentResetRecordSelect columns(){
        set.add("id");
        set.add("fk_tencent_device_id");
        set.add("instance_id");
        set.add("fk_tencent_images_id");
        set.add("version_code");
        set.add("title");
        set.add("old_image_id");
        set.add("reset_image_id");
        set.add("reset_user_id");
        set.add("response");
        set.add("create_time");
        return this;
    }

    public TencentResetRecordSelect id(){
        set.add("id");
        return this;
    }

    public TencentResetRecordSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public TencentResetRecordSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public TencentResetRecordSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public TencentResetRecordSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public TencentResetRecordSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public TencentResetRecordSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public TencentResetRecordSelect fkTencentDeviceId(){
        set.add("fk_tencent_device_id");
        return this;
    }

    public TencentResetRecordSelect excludeFkTencentDeviceId(){
        excludeSet.add("fk_tencent_device_id");
        return this;
    }

    public TencentResetRecordSelect avgFkTencentDeviceId(){
        set.add("avg(fk_tencent_device_id) as fk_tencent_device_id");
        return this;
    }

    public TencentResetRecordSelect countFkTencentDeviceId(){
        set.add("count(fk_tencent_device_id) as fk_tencent_device_id");
        return this;
    }

    public TencentResetRecordSelect minFkTencentDeviceId(){
        set.add("min(fk_tencent_device_id) as fk_tencent_device_id");
        return this;
    }

    public TencentResetRecordSelect maxFkTencentDeviceId(){
        set.add("max(fk_tencent_device_id) as fk_tencent_device_id");
        return this;
    }

    public TencentResetRecordSelect sumFkTencentDeviceId(){
        set.add("sum(fk_tencent_device_id) as fk_tencent_device_id");
        return this;
    }
    public TencentResetRecordSelect instanceId(){
        set.add("instance_id");
        return this;
    }

    public TencentResetRecordSelect excludeInstanceId(){
        excludeSet.add("instance_id");
        return this;
    }

    public TencentResetRecordSelect avgInstanceId(){
        set.add("avg(instance_id) as instance_id");
        return this;
    }

    public TencentResetRecordSelect countInstanceId(){
        set.add("count(instance_id) as instance_id");
        return this;
    }

    public TencentResetRecordSelect minInstanceId(){
        set.add("min(instance_id) as instance_id");
        return this;
    }

    public TencentResetRecordSelect maxInstanceId(){
        set.add("max(instance_id) as instance_id");
        return this;
    }

    public TencentResetRecordSelect sumInstanceId(){
        set.add("sum(instance_id) as instance_id");
        return this;
    }
    public TencentResetRecordSelect fkTencentImagesId(){
        set.add("fk_tencent_images_id");
        return this;
    }

    public TencentResetRecordSelect excludeFkTencentImagesId(){
        excludeSet.add("fk_tencent_images_id");
        return this;
    }

    public TencentResetRecordSelect avgFkTencentImagesId(){
        set.add("avg(fk_tencent_images_id) as fk_tencent_images_id");
        return this;
    }

    public TencentResetRecordSelect countFkTencentImagesId(){
        set.add("count(fk_tencent_images_id) as fk_tencent_images_id");
        return this;
    }

    public TencentResetRecordSelect minFkTencentImagesId(){
        set.add("min(fk_tencent_images_id) as fk_tencent_images_id");
        return this;
    }

    public TencentResetRecordSelect maxFkTencentImagesId(){
        set.add("max(fk_tencent_images_id) as fk_tencent_images_id");
        return this;
    }

    public TencentResetRecordSelect sumFkTencentImagesId(){
        set.add("sum(fk_tencent_images_id) as fk_tencent_images_id");
        return this;
    }
    public TencentResetRecordSelect versionCode(){
        set.add("version_code");
        return this;
    }

    public TencentResetRecordSelect excludeVersionCode(){
        excludeSet.add("version_code");
        return this;
    }

    public TencentResetRecordSelect avgVersionCode(){
        set.add("avg(version_code) as version_code");
        return this;
    }

    public TencentResetRecordSelect countVersionCode(){
        set.add("count(version_code) as version_code");
        return this;
    }

    public TencentResetRecordSelect minVersionCode(){
        set.add("min(version_code) as version_code");
        return this;
    }

    public TencentResetRecordSelect maxVersionCode(){
        set.add("max(version_code) as version_code");
        return this;
    }

    public TencentResetRecordSelect sumVersionCode(){
        set.add("sum(version_code) as version_code");
        return this;
    }
    public TencentResetRecordSelect title(){
        set.add("title");
        return this;
    }

    public TencentResetRecordSelect excludeTitle(){
        excludeSet.add("title");
        return this;
    }

    public TencentResetRecordSelect avgTitle(){
        set.add("avg(title) as title");
        return this;
    }

    public TencentResetRecordSelect countTitle(){
        set.add("count(title) as title");
        return this;
    }

    public TencentResetRecordSelect minTitle(){
        set.add("min(title) as title");
        return this;
    }

    public TencentResetRecordSelect maxTitle(){
        set.add("max(title) as title");
        return this;
    }

    public TencentResetRecordSelect sumTitle(){
        set.add("sum(title) as title");
        return this;
    }
    public TencentResetRecordSelect oldImageId(){
        set.add("old_image_id");
        return this;
    }

    public TencentResetRecordSelect excludeOldImageId(){
        excludeSet.add("old_image_id");
        return this;
    }

    public TencentResetRecordSelect avgOldImageId(){
        set.add("avg(old_image_id) as old_image_id");
        return this;
    }

    public TencentResetRecordSelect countOldImageId(){
        set.add("count(old_image_id) as old_image_id");
        return this;
    }

    public TencentResetRecordSelect minOldImageId(){
        set.add("min(old_image_id) as old_image_id");
        return this;
    }

    public TencentResetRecordSelect maxOldImageId(){
        set.add("max(old_image_id) as old_image_id");
        return this;
    }

    public TencentResetRecordSelect sumOldImageId(){
        set.add("sum(old_image_id) as old_image_id");
        return this;
    }
    public TencentResetRecordSelect resetImageId(){
        set.add("reset_image_id");
        return this;
    }

    public TencentResetRecordSelect excludeResetImageId(){
        excludeSet.add("reset_image_id");
        return this;
    }

    public TencentResetRecordSelect avgResetImageId(){
        set.add("avg(reset_image_id) as reset_image_id");
        return this;
    }

    public TencentResetRecordSelect countResetImageId(){
        set.add("count(reset_image_id) as reset_image_id");
        return this;
    }

    public TencentResetRecordSelect minResetImageId(){
        set.add("min(reset_image_id) as reset_image_id");
        return this;
    }

    public TencentResetRecordSelect maxResetImageId(){
        set.add("max(reset_image_id) as reset_image_id");
        return this;
    }

    public TencentResetRecordSelect sumResetImageId(){
        set.add("sum(reset_image_id) as reset_image_id");
        return this;
    }
    public TencentResetRecordSelect resetUserId(){
        set.add("reset_user_id");
        return this;
    }

    public TencentResetRecordSelect excludeResetUserId(){
        excludeSet.add("reset_user_id");
        return this;
    }

    public TencentResetRecordSelect avgResetUserId(){
        set.add("avg(reset_user_id) as reset_user_id");
        return this;
    }

    public TencentResetRecordSelect countResetUserId(){
        set.add("count(reset_user_id) as reset_user_id");
        return this;
    }

    public TencentResetRecordSelect minResetUserId(){
        set.add("min(reset_user_id) as reset_user_id");
        return this;
    }

    public TencentResetRecordSelect maxResetUserId(){
        set.add("max(reset_user_id) as reset_user_id");
        return this;
    }

    public TencentResetRecordSelect sumResetUserId(){
        set.add("sum(reset_user_id) as reset_user_id");
        return this;
    }
    public TencentResetRecordSelect response(){
        set.add("response");
        return this;
    }

    public TencentResetRecordSelect excludeResponse(){
        excludeSet.add("response");
        return this;
    }

    public TencentResetRecordSelect avgResponse(){
        set.add("avg(response) as response");
        return this;
    }

    public TencentResetRecordSelect countResponse(){
        set.add("count(response) as response");
        return this;
    }

    public TencentResetRecordSelect minResponse(){
        set.add("min(response) as response");
        return this;
    }

    public TencentResetRecordSelect maxResponse(){
        set.add("max(response) as response");
        return this;
    }

    public TencentResetRecordSelect sumResponse(){
        set.add("sum(response) as response");
        return this;
    }
    public TencentResetRecordSelect createTime(){
        set.add("create_time");
        return this;
    }

    public TencentResetRecordSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public TencentResetRecordSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public TencentResetRecordSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public TencentResetRecordSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public TencentResetRecordSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public TencentResetRecordSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }

    boolean distinct=false;

     public TencentResetRecordSelect distinct(){
        this.distinct=true;
        return this;
    }

    public TencentResetRecordSelect includes(Consumer<Set<String>> other){
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
