package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 
 * </p>
 * "mc_move_device"
 * @author PC001
 */
public class McMoveDeviceSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public McMoveDeviceSelect columns(){
        set.add("id");
        set.add("fk_member_id");
        set.add("user_phone_id");
        set.add("from_device_id");
        set.add("from_phone_id");
        set.add("to_device_id");
        set.add("to_phone_id");
        set.add("include_files");
        set.add("exclude_files");
        set.add("bucket_name");
        set.add("object_path");
        set.add("create_time");
        set.add("status");
        set.add("job_id");
        set.add("last_update_time");
        set.add("spec_code");
        set.add("release_use");
        set.add("data_migration");
        set.add("task_id");
        return this;
    }

    public McMoveDeviceSelect id(){
        set.add("id");
        return this;
    }

    public McMoveDeviceSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public McMoveDeviceSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public McMoveDeviceSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public McMoveDeviceSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public McMoveDeviceSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public McMoveDeviceSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public McMoveDeviceSelect fkMemberId(){
        set.add("fk_member_id");
        return this;
    }

    public McMoveDeviceSelect excludeFkMemberId(){
        excludeSet.add("fk_member_id");
        return this;
    }

    public McMoveDeviceSelect avgFkMemberId(){
        set.add("avg(fk_member_id) as fk_member_id");
        return this;
    }

    public McMoveDeviceSelect countFkMemberId(){
        set.add("count(fk_member_id) as fk_member_id");
        return this;
    }

    public McMoveDeviceSelect minFkMemberId(){
        set.add("min(fk_member_id) as fk_member_id");
        return this;
    }

    public McMoveDeviceSelect maxFkMemberId(){
        set.add("max(fk_member_id) as fk_member_id");
        return this;
    }

    public McMoveDeviceSelect sumFkMemberId(){
        set.add("sum(fk_member_id) as fk_member_id");
        return this;
    }
    public McMoveDeviceSelect userPhoneId(){
        set.add("user_phone_id");
        return this;
    }

    public McMoveDeviceSelect excludeUserPhoneId(){
        excludeSet.add("user_phone_id");
        return this;
    }

    public McMoveDeviceSelect avgUserPhoneId(){
        set.add("avg(user_phone_id) as user_phone_id");
        return this;
    }

    public McMoveDeviceSelect countUserPhoneId(){
        set.add("count(user_phone_id) as user_phone_id");
        return this;
    }

    public McMoveDeviceSelect minUserPhoneId(){
        set.add("min(user_phone_id) as user_phone_id");
        return this;
    }

    public McMoveDeviceSelect maxUserPhoneId(){
        set.add("max(user_phone_id) as user_phone_id");
        return this;
    }

    public McMoveDeviceSelect sumUserPhoneId(){
        set.add("sum(user_phone_id) as user_phone_id");
        return this;
    }
    public McMoveDeviceSelect fromDeviceId(){
        set.add("from_device_id");
        return this;
    }

    public McMoveDeviceSelect excludeFromDeviceId(){
        excludeSet.add("from_device_id");
        return this;
    }

    public McMoveDeviceSelect avgFromDeviceId(){
        set.add("avg(from_device_id) as from_device_id");
        return this;
    }

    public McMoveDeviceSelect countFromDeviceId(){
        set.add("count(from_device_id) as from_device_id");
        return this;
    }

    public McMoveDeviceSelect minFromDeviceId(){
        set.add("min(from_device_id) as from_device_id");
        return this;
    }

    public McMoveDeviceSelect maxFromDeviceId(){
        set.add("max(from_device_id) as from_device_id");
        return this;
    }

    public McMoveDeviceSelect sumFromDeviceId(){
        set.add("sum(from_device_id) as from_device_id");
        return this;
    }
    public McMoveDeviceSelect fromPhoneId(){
        set.add("from_phone_id");
        return this;
    }

    public McMoveDeviceSelect excludeFromPhoneId(){
        excludeSet.add("from_phone_id");
        return this;
    }

    public McMoveDeviceSelect avgFromPhoneId(){
        set.add("avg(from_phone_id) as from_phone_id");
        return this;
    }

    public McMoveDeviceSelect countFromPhoneId(){
        set.add("count(from_phone_id) as from_phone_id");
        return this;
    }

    public McMoveDeviceSelect minFromPhoneId(){
        set.add("min(from_phone_id) as from_phone_id");
        return this;
    }

    public McMoveDeviceSelect maxFromPhoneId(){
        set.add("max(from_phone_id) as from_phone_id");
        return this;
    }

    public McMoveDeviceSelect sumFromPhoneId(){
        set.add("sum(from_phone_id) as from_phone_id");
        return this;
    }
    public McMoveDeviceSelect toDeviceId(){
        set.add("to_device_id");
        return this;
    }

    public McMoveDeviceSelect excludeToDeviceId(){
        excludeSet.add("to_device_id");
        return this;
    }

    public McMoveDeviceSelect avgToDeviceId(){
        set.add("avg(to_device_id) as to_device_id");
        return this;
    }

    public McMoveDeviceSelect countToDeviceId(){
        set.add("count(to_device_id) as to_device_id");
        return this;
    }

    public McMoveDeviceSelect minToDeviceId(){
        set.add("min(to_device_id) as to_device_id");
        return this;
    }

    public McMoveDeviceSelect maxToDeviceId(){
        set.add("max(to_device_id) as to_device_id");
        return this;
    }

    public McMoveDeviceSelect sumToDeviceId(){
        set.add("sum(to_device_id) as to_device_id");
        return this;
    }
    public McMoveDeviceSelect toPhoneId(){
        set.add("to_phone_id");
        return this;
    }

    public McMoveDeviceSelect excludeToPhoneId(){
        excludeSet.add("to_phone_id");
        return this;
    }

    public McMoveDeviceSelect avgToPhoneId(){
        set.add("avg(to_phone_id) as to_phone_id");
        return this;
    }

    public McMoveDeviceSelect countToPhoneId(){
        set.add("count(to_phone_id) as to_phone_id");
        return this;
    }

    public McMoveDeviceSelect minToPhoneId(){
        set.add("min(to_phone_id) as to_phone_id");
        return this;
    }

    public McMoveDeviceSelect maxToPhoneId(){
        set.add("max(to_phone_id) as to_phone_id");
        return this;
    }

    public McMoveDeviceSelect sumToPhoneId(){
        set.add("sum(to_phone_id) as to_phone_id");
        return this;
    }
    public McMoveDeviceSelect includeFiles(){
        set.add("include_files");
        return this;
    }

    public McMoveDeviceSelect excludeIncludeFiles(){
        excludeSet.add("include_files");
        return this;
    }

    public McMoveDeviceSelect avgIncludeFiles(){
        set.add("avg(include_files) as include_files");
        return this;
    }

    public McMoveDeviceSelect countIncludeFiles(){
        set.add("count(include_files) as include_files");
        return this;
    }

    public McMoveDeviceSelect minIncludeFiles(){
        set.add("min(include_files) as include_files");
        return this;
    }

    public McMoveDeviceSelect maxIncludeFiles(){
        set.add("max(include_files) as include_files");
        return this;
    }

    public McMoveDeviceSelect sumIncludeFiles(){
        set.add("sum(include_files) as include_files");
        return this;
    }
    public McMoveDeviceSelect excludeFiles(){
        set.add("exclude_files");
        return this;
    }

    public McMoveDeviceSelect excludeExcludeFiles(){
        excludeSet.add("exclude_files");
        return this;
    }

    public McMoveDeviceSelect avgExcludeFiles(){
        set.add("avg(exclude_files) as exclude_files");
        return this;
    }

    public McMoveDeviceSelect countExcludeFiles(){
        set.add("count(exclude_files) as exclude_files");
        return this;
    }

    public McMoveDeviceSelect minExcludeFiles(){
        set.add("min(exclude_files) as exclude_files");
        return this;
    }

    public McMoveDeviceSelect maxExcludeFiles(){
        set.add("max(exclude_files) as exclude_files");
        return this;
    }

    public McMoveDeviceSelect sumExcludeFiles(){
        set.add("sum(exclude_files) as exclude_files");
        return this;
    }
    public McMoveDeviceSelect bucketName(){
        set.add("bucket_name");
        return this;
    }

    public McMoveDeviceSelect excludeBucketName(){
        excludeSet.add("bucket_name");
        return this;
    }

    public McMoveDeviceSelect avgBucketName(){
        set.add("avg(bucket_name) as bucket_name");
        return this;
    }

    public McMoveDeviceSelect countBucketName(){
        set.add("count(bucket_name) as bucket_name");
        return this;
    }

    public McMoveDeviceSelect minBucketName(){
        set.add("min(bucket_name) as bucket_name");
        return this;
    }

    public McMoveDeviceSelect maxBucketName(){
        set.add("max(bucket_name) as bucket_name");
        return this;
    }

    public McMoveDeviceSelect sumBucketName(){
        set.add("sum(bucket_name) as bucket_name");
        return this;
    }
    public McMoveDeviceSelect objectPath(){
        set.add("object_path");
        return this;
    }

    public McMoveDeviceSelect excludeObjectPath(){
        excludeSet.add("object_path");
        return this;
    }

    public McMoveDeviceSelect avgObjectPath(){
        set.add("avg(object_path) as object_path");
        return this;
    }

    public McMoveDeviceSelect countObjectPath(){
        set.add("count(object_path) as object_path");
        return this;
    }

    public McMoveDeviceSelect minObjectPath(){
        set.add("min(object_path) as object_path");
        return this;
    }

    public McMoveDeviceSelect maxObjectPath(){
        set.add("max(object_path) as object_path");
        return this;
    }

    public McMoveDeviceSelect sumObjectPath(){
        set.add("sum(object_path) as object_path");
        return this;
    }
    public McMoveDeviceSelect createTime(){
        set.add("create_time");
        return this;
    }

    public McMoveDeviceSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public McMoveDeviceSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public McMoveDeviceSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public McMoveDeviceSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public McMoveDeviceSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public McMoveDeviceSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public McMoveDeviceSelect status(){
        set.add("status");
        return this;
    }

    public McMoveDeviceSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public McMoveDeviceSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public McMoveDeviceSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public McMoveDeviceSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public McMoveDeviceSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public McMoveDeviceSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public McMoveDeviceSelect jobId(){
        set.add("job_id");
        return this;
    }

    public McMoveDeviceSelect excludeJobId(){
        excludeSet.add("job_id");
        return this;
    }

    public McMoveDeviceSelect avgJobId(){
        set.add("avg(job_id) as job_id");
        return this;
    }

    public McMoveDeviceSelect countJobId(){
        set.add("count(job_id) as job_id");
        return this;
    }

    public McMoveDeviceSelect minJobId(){
        set.add("min(job_id) as job_id");
        return this;
    }

    public McMoveDeviceSelect maxJobId(){
        set.add("max(job_id) as job_id");
        return this;
    }

    public McMoveDeviceSelect sumJobId(){
        set.add("sum(job_id) as job_id");
        return this;
    }
    public McMoveDeviceSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public McMoveDeviceSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public McMoveDeviceSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public McMoveDeviceSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public McMoveDeviceSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public McMoveDeviceSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public McMoveDeviceSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public McMoveDeviceSelect specCode(){
        set.add("spec_code");
        return this;
    }

    public McMoveDeviceSelect excludeSpecCode(){
        excludeSet.add("spec_code");
        return this;
    }

    public McMoveDeviceSelect avgSpecCode(){
        set.add("avg(spec_code) as spec_code");
        return this;
    }

    public McMoveDeviceSelect countSpecCode(){
        set.add("count(spec_code) as spec_code");
        return this;
    }

    public McMoveDeviceSelect minSpecCode(){
        set.add("min(spec_code) as spec_code");
        return this;
    }

    public McMoveDeviceSelect maxSpecCode(){
        set.add("max(spec_code) as spec_code");
        return this;
    }

    public McMoveDeviceSelect sumSpecCode(){
        set.add("sum(spec_code) as spec_code");
        return this;
    }
    public McMoveDeviceSelect releaseUse(){
        set.add("release_use");
        return this;
    }

    public McMoveDeviceSelect excludeReleaseUse(){
        excludeSet.add("release_use");
        return this;
    }

    public McMoveDeviceSelect avgReleaseUse(){
        set.add("avg(release_use) as release_use");
        return this;
    }

    public McMoveDeviceSelect countReleaseUse(){
        set.add("count(release_use) as release_use");
        return this;
    }

    public McMoveDeviceSelect minReleaseUse(){
        set.add("min(release_use) as release_use");
        return this;
    }

    public McMoveDeviceSelect maxReleaseUse(){
        set.add("max(release_use) as release_use");
        return this;
    }

    public McMoveDeviceSelect sumReleaseUse(){
        set.add("sum(release_use) as release_use");
        return this;
    }
    public McMoveDeviceSelect dataMigration(){
        set.add("data_migration");
        return this;
    }

    public McMoveDeviceSelect excludeDataMigration(){
        excludeSet.add("data_migration");
        return this;
    }

    public McMoveDeviceSelect avgDataMigration(){
        set.add("avg(data_migration) as data_migration");
        return this;
    }

    public McMoveDeviceSelect countDataMigration(){
        set.add("count(data_migration) as data_migration");
        return this;
    }

    public McMoveDeviceSelect minDataMigration(){
        set.add("min(data_migration) as data_migration");
        return this;
    }

    public McMoveDeviceSelect maxDataMigration(){
        set.add("max(data_migration) as data_migration");
        return this;
    }

    public McMoveDeviceSelect sumDataMigration(){
        set.add("sum(data_migration) as data_migration");
        return this;
    }
    public McMoveDeviceSelect taskId(){
        set.add("task_id");
        return this;
    }

    public McMoveDeviceSelect excludeTaskId(){
        excludeSet.add("task_id");
        return this;
    }

    public McMoveDeviceSelect avgTaskId(){
        set.add("avg(task_id) as task_id");
        return this;
    }

    public McMoveDeviceSelect countTaskId(){
        set.add("count(task_id) as task_id");
        return this;
    }

    public McMoveDeviceSelect minTaskId(){
        set.add("min(task_id) as task_id");
        return this;
    }

    public McMoveDeviceSelect maxTaskId(){
        set.add("max(task_id) as task_id");
        return this;
    }

    public McMoveDeviceSelect sumTaskId(){
        set.add("sum(task_id) as task_id");
        return this;
    }

    boolean distinct=false;

     public McMoveDeviceSelect distinct(){
        this.distinct=true;
        return this;
    }

    public McMoveDeviceSelect includes(Consumer<Set<String>> other){
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
