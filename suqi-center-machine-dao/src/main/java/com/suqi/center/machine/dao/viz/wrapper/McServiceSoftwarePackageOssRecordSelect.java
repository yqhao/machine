package com.suqi.center.machine.dao.viz.wrapper;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 云机端软件包对象存储记录表
 * </p>
 * "mc_service_software_package_oss_record"
 * @author 18374
 */
public class McServiceSoftwarePackageOssRecordSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public McServiceSoftwarePackageOssRecordSelect columns(){
        set.add("id");
        set.add("fk_mc_service_software_package_id");
        set.add("oss_id");
        set.add("oss_type");
        set.add("bucket_name");
        set.add("object_path");
        set.add("status");
        set.add("create_time");
        set.add("last_update_time");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect id(){
        set.add("id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public McServiceSoftwarePackageOssRecordSelect fkMcServiceSoftwarePackageId(){
        set.add("fk_mc_service_software_package_id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect excludeFkMcServiceSoftwarePackageId(){
        excludeSet.add("fk_mc_service_software_package_id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect avgFkMcServiceSoftwarePackageId(){
        set.add("avg(fk_mc_service_software_package_id) as fk_mc_service_software_package_id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect countFkMcServiceSoftwarePackageId(){
        set.add("count(fk_mc_service_software_package_id) as fk_mc_service_software_package_id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect minFkMcServiceSoftwarePackageId(){
        set.add("min(fk_mc_service_software_package_id) as fk_mc_service_software_package_id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect maxFkMcServiceSoftwarePackageId(){
        set.add("max(fk_mc_service_software_package_id) as fk_mc_service_software_package_id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect sumFkMcServiceSoftwarePackageId(){
        set.add("sum(fk_mc_service_software_package_id) as fk_mc_service_software_package_id");
        return this;
    }
    public McServiceSoftwarePackageOssRecordSelect ossId(){
        set.add("oss_id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect excludeOssId(){
        excludeSet.add("oss_id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect avgOssId(){
        set.add("avg(oss_id) as oss_id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect countOssId(){
        set.add("count(oss_id) as oss_id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect minOssId(){
        set.add("min(oss_id) as oss_id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect maxOssId(){
        set.add("max(oss_id) as oss_id");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect sumOssId(){
        set.add("sum(oss_id) as oss_id");
        return this;
    }
    public McServiceSoftwarePackageOssRecordSelect ossType(){
        set.add("oss_type");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect excludeOssType(){
        excludeSet.add("oss_type");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect avgOssType(){
        set.add("avg(oss_type) as oss_type");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect countOssType(){
        set.add("count(oss_type) as oss_type");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect minOssType(){
        set.add("min(oss_type) as oss_type");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect maxOssType(){
        set.add("max(oss_type) as oss_type");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect sumOssType(){
        set.add("sum(oss_type) as oss_type");
        return this;
    }
    public McServiceSoftwarePackageOssRecordSelect bucketName(){
        set.add("bucket_name");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect excludeBucketName(){
        excludeSet.add("bucket_name");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect avgBucketName(){
        set.add("avg(bucket_name) as bucket_name");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect countBucketName(){
        set.add("count(bucket_name) as bucket_name");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect minBucketName(){
        set.add("min(bucket_name) as bucket_name");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect maxBucketName(){
        set.add("max(bucket_name) as bucket_name");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect sumBucketName(){
        set.add("sum(bucket_name) as bucket_name");
        return this;
    }
    public McServiceSoftwarePackageOssRecordSelect objectPath(){
        set.add("object_path");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect excludeObjectPath(){
        excludeSet.add("object_path");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect avgObjectPath(){
        set.add("avg(object_path) as object_path");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect countObjectPath(){
        set.add("count(object_path) as object_path");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect minObjectPath(){
        set.add("min(object_path) as object_path");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect maxObjectPath(){
        set.add("max(object_path) as object_path");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect sumObjectPath(){
        set.add("sum(object_path) as object_path");
        return this;
    }
    public McServiceSoftwarePackageOssRecordSelect status(){
        set.add("status");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public McServiceSoftwarePackageOssRecordSelect createTime(){
        set.add("create_time");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public McServiceSoftwarePackageOssRecordSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }

    boolean distinct=false;

     public McServiceSoftwarePackageOssRecordSelect distinct(){
        this.distinct=true;
        return this;
    }

    public McServiceSoftwarePackageOssRecordSelect includes(Consumer<Set<String>> other){
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
