package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 
 * </p>
 * "mc_move_jobs"
 * @author PC001
 */
public class McMoveJobsSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public McMoveJobsSelect columns(){
        set.add("id");
        set.add("fk_mc_move_device_id");
        set.add("export_request_param");
        set.add("export_job_id");
        set.add("export_job_result");
        set.add("export_start_time");
        set.add("export_end_time");
        set.add("import_request_param");
        set.add("import_job_id");
        set.add("import_job_result");
        set.add("import_start_time");
        set.add("import_end_time");
        set.add("create_time");
        set.add("last_update_time");
        return this;
    }

    public McMoveJobsSelect id(){
        set.add("id");
        return this;
    }

    public McMoveJobsSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public McMoveJobsSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public McMoveJobsSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public McMoveJobsSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public McMoveJobsSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public McMoveJobsSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public McMoveJobsSelect fkMcMoveDeviceId(){
        set.add("fk_mc_move_device_id");
        return this;
    }

    public McMoveJobsSelect excludeFkMcMoveDeviceId(){
        excludeSet.add("fk_mc_move_device_id");
        return this;
    }

    public McMoveJobsSelect avgFkMcMoveDeviceId(){
        set.add("avg(fk_mc_move_device_id) as fk_mc_move_device_id");
        return this;
    }

    public McMoveJobsSelect countFkMcMoveDeviceId(){
        set.add("count(fk_mc_move_device_id) as fk_mc_move_device_id");
        return this;
    }

    public McMoveJobsSelect minFkMcMoveDeviceId(){
        set.add("min(fk_mc_move_device_id) as fk_mc_move_device_id");
        return this;
    }

    public McMoveJobsSelect maxFkMcMoveDeviceId(){
        set.add("max(fk_mc_move_device_id) as fk_mc_move_device_id");
        return this;
    }

    public McMoveJobsSelect sumFkMcMoveDeviceId(){
        set.add("sum(fk_mc_move_device_id) as fk_mc_move_device_id");
        return this;
    }
    public McMoveJobsSelect exportRequestParam(){
        set.add("export_request_param");
        return this;
    }

    public McMoveJobsSelect excludeExportRequestParam(){
        excludeSet.add("export_request_param");
        return this;
    }

    public McMoveJobsSelect avgExportRequestParam(){
        set.add("avg(export_request_param) as export_request_param");
        return this;
    }

    public McMoveJobsSelect countExportRequestParam(){
        set.add("count(export_request_param) as export_request_param");
        return this;
    }

    public McMoveJobsSelect minExportRequestParam(){
        set.add("min(export_request_param) as export_request_param");
        return this;
    }

    public McMoveJobsSelect maxExportRequestParam(){
        set.add("max(export_request_param) as export_request_param");
        return this;
    }

    public McMoveJobsSelect sumExportRequestParam(){
        set.add("sum(export_request_param) as export_request_param");
        return this;
    }
    public McMoveJobsSelect exportJobId(){
        set.add("export_job_id");
        return this;
    }

    public McMoveJobsSelect excludeExportJobId(){
        excludeSet.add("export_job_id");
        return this;
    }

    public McMoveJobsSelect avgExportJobId(){
        set.add("avg(export_job_id) as export_job_id");
        return this;
    }

    public McMoveJobsSelect countExportJobId(){
        set.add("count(export_job_id) as export_job_id");
        return this;
    }

    public McMoveJobsSelect minExportJobId(){
        set.add("min(export_job_id) as export_job_id");
        return this;
    }

    public McMoveJobsSelect maxExportJobId(){
        set.add("max(export_job_id) as export_job_id");
        return this;
    }

    public McMoveJobsSelect sumExportJobId(){
        set.add("sum(export_job_id) as export_job_id");
        return this;
    }
    public McMoveJobsSelect exportJobResult(){
        set.add("export_job_result");
        return this;
    }

    public McMoveJobsSelect excludeExportJobResult(){
        excludeSet.add("export_job_result");
        return this;
    }

    public McMoveJobsSelect avgExportJobResult(){
        set.add("avg(export_job_result) as export_job_result");
        return this;
    }

    public McMoveJobsSelect countExportJobResult(){
        set.add("count(export_job_result) as export_job_result");
        return this;
    }

    public McMoveJobsSelect minExportJobResult(){
        set.add("min(export_job_result) as export_job_result");
        return this;
    }

    public McMoveJobsSelect maxExportJobResult(){
        set.add("max(export_job_result) as export_job_result");
        return this;
    }

    public McMoveJobsSelect sumExportJobResult(){
        set.add("sum(export_job_result) as export_job_result");
        return this;
    }
    public McMoveJobsSelect exportStartTime(){
        set.add("export_start_time");
        return this;
    }

    public McMoveJobsSelect excludeExportStartTime(){
        excludeSet.add("export_start_time");
        return this;
    }

    public McMoveJobsSelect avgExportStartTime(){
        set.add("avg(export_start_time) as export_start_time");
        return this;
    }

    public McMoveJobsSelect countExportStartTime(){
        set.add("count(export_start_time) as export_start_time");
        return this;
    }

    public McMoveJobsSelect minExportStartTime(){
        set.add("min(export_start_time) as export_start_time");
        return this;
    }

    public McMoveJobsSelect maxExportStartTime(){
        set.add("max(export_start_time) as export_start_time");
        return this;
    }

    public McMoveJobsSelect sumExportStartTime(){
        set.add("sum(export_start_time) as export_start_time");
        return this;
    }
    public McMoveJobsSelect exportEndTime(){
        set.add("export_end_time");
        return this;
    }

    public McMoveJobsSelect excludeExportEndTime(){
        excludeSet.add("export_end_time");
        return this;
    }

    public McMoveJobsSelect avgExportEndTime(){
        set.add("avg(export_end_time) as export_end_time");
        return this;
    }

    public McMoveJobsSelect countExportEndTime(){
        set.add("count(export_end_time) as export_end_time");
        return this;
    }

    public McMoveJobsSelect minExportEndTime(){
        set.add("min(export_end_time) as export_end_time");
        return this;
    }

    public McMoveJobsSelect maxExportEndTime(){
        set.add("max(export_end_time) as export_end_time");
        return this;
    }

    public McMoveJobsSelect sumExportEndTime(){
        set.add("sum(export_end_time) as export_end_time");
        return this;
    }
    public McMoveJobsSelect importRequestParam(){
        set.add("import_request_param");
        return this;
    }

    public McMoveJobsSelect excludeImportRequestParam(){
        excludeSet.add("import_request_param");
        return this;
    }

    public McMoveJobsSelect avgImportRequestParam(){
        set.add("avg(import_request_param) as import_request_param");
        return this;
    }

    public McMoveJobsSelect countImportRequestParam(){
        set.add("count(import_request_param) as import_request_param");
        return this;
    }

    public McMoveJobsSelect minImportRequestParam(){
        set.add("min(import_request_param) as import_request_param");
        return this;
    }

    public McMoveJobsSelect maxImportRequestParam(){
        set.add("max(import_request_param) as import_request_param");
        return this;
    }

    public McMoveJobsSelect sumImportRequestParam(){
        set.add("sum(import_request_param) as import_request_param");
        return this;
    }
    public McMoveJobsSelect importJobId(){
        set.add("import_job_id");
        return this;
    }

    public McMoveJobsSelect excludeImportJobId(){
        excludeSet.add("import_job_id");
        return this;
    }

    public McMoveJobsSelect avgImportJobId(){
        set.add("avg(import_job_id) as import_job_id");
        return this;
    }

    public McMoveJobsSelect countImportJobId(){
        set.add("count(import_job_id) as import_job_id");
        return this;
    }

    public McMoveJobsSelect minImportJobId(){
        set.add("min(import_job_id) as import_job_id");
        return this;
    }

    public McMoveJobsSelect maxImportJobId(){
        set.add("max(import_job_id) as import_job_id");
        return this;
    }

    public McMoveJobsSelect sumImportJobId(){
        set.add("sum(import_job_id) as import_job_id");
        return this;
    }
    public McMoveJobsSelect importJobResult(){
        set.add("import_job_result");
        return this;
    }

    public McMoveJobsSelect excludeImportJobResult(){
        excludeSet.add("import_job_result");
        return this;
    }

    public McMoveJobsSelect avgImportJobResult(){
        set.add("avg(import_job_result) as import_job_result");
        return this;
    }

    public McMoveJobsSelect countImportJobResult(){
        set.add("count(import_job_result) as import_job_result");
        return this;
    }

    public McMoveJobsSelect minImportJobResult(){
        set.add("min(import_job_result) as import_job_result");
        return this;
    }

    public McMoveJobsSelect maxImportJobResult(){
        set.add("max(import_job_result) as import_job_result");
        return this;
    }

    public McMoveJobsSelect sumImportJobResult(){
        set.add("sum(import_job_result) as import_job_result");
        return this;
    }
    public McMoveJobsSelect importStartTime(){
        set.add("import_start_time");
        return this;
    }

    public McMoveJobsSelect excludeImportStartTime(){
        excludeSet.add("import_start_time");
        return this;
    }

    public McMoveJobsSelect avgImportStartTime(){
        set.add("avg(import_start_time) as import_start_time");
        return this;
    }

    public McMoveJobsSelect countImportStartTime(){
        set.add("count(import_start_time) as import_start_time");
        return this;
    }

    public McMoveJobsSelect minImportStartTime(){
        set.add("min(import_start_time) as import_start_time");
        return this;
    }

    public McMoveJobsSelect maxImportStartTime(){
        set.add("max(import_start_time) as import_start_time");
        return this;
    }

    public McMoveJobsSelect sumImportStartTime(){
        set.add("sum(import_start_time) as import_start_time");
        return this;
    }
    public McMoveJobsSelect importEndTime(){
        set.add("import_end_time");
        return this;
    }

    public McMoveJobsSelect excludeImportEndTime(){
        excludeSet.add("import_end_time");
        return this;
    }

    public McMoveJobsSelect avgImportEndTime(){
        set.add("avg(import_end_time) as import_end_time");
        return this;
    }

    public McMoveJobsSelect countImportEndTime(){
        set.add("count(import_end_time) as import_end_time");
        return this;
    }

    public McMoveJobsSelect minImportEndTime(){
        set.add("min(import_end_time) as import_end_time");
        return this;
    }

    public McMoveJobsSelect maxImportEndTime(){
        set.add("max(import_end_time) as import_end_time");
        return this;
    }

    public McMoveJobsSelect sumImportEndTime(){
        set.add("sum(import_end_time) as import_end_time");
        return this;
    }
    public McMoveJobsSelect createTime(){
        set.add("create_time");
        return this;
    }

    public McMoveJobsSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public McMoveJobsSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public McMoveJobsSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public McMoveJobsSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public McMoveJobsSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public McMoveJobsSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public McMoveJobsSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public McMoveJobsSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public McMoveJobsSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public McMoveJobsSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public McMoveJobsSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public McMoveJobsSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public McMoveJobsSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }

    boolean distinct=false;

     public McMoveJobsSelect distinct(){
        this.distinct=true;
        return this;
    }

    public McMoveJobsSelect includes(Consumer<Set<String>> other){
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
