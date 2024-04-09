package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.McMoveJobs;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 
 * </p>
 * "mc_move_jobs"
 * @author PC001
 */
public class McMoveJobsUpdateWrapper extends UpdateWrapper<McMoveJobs> {

    public static McMoveJobsUpdateWrapper wrapper() {
        return new McMoveJobsUpdateWrapper();
    }

    public McMoveJobsUpdateWrapper() {
        super();
    }

    public McMoveJobsUpdateWrapper(McMoveJobs entity) {
        super(entity);
    }

    /**
     * 
     */
    public McMoveJobsUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 
     */
    public McMoveJobsUpdateWrapper setFkMcMoveDeviceId(Long fkMcMoveDeviceId) {
         set("fk_mc_move_device_id",fkMcMoveDeviceId);
        return this;
    }
    /**
     * 
     */
    public McMoveJobsUpdateWrapper setExportRequestParam(String exportRequestParam) {
         set("export_request_param",exportRequestParam);
        return this;
    }
    /**
     * 
     */
    public McMoveJobsUpdateWrapper setExportJobId(String exportJobId) {
         set("export_job_id",exportJobId);
        return this;
    }
    /**
     * 
     */
    public McMoveJobsUpdateWrapper setExportJobResult(String exportJobResult) {
         set("export_job_result",exportJobResult);
        return this;
    }
    /**
     * 
     */
    public McMoveJobsUpdateWrapper setExportStartTime(Date exportStartTime) {
         set("export_start_time",exportStartTime);
        return this;
    }
    /**
     * 
     */
    public McMoveJobsUpdateWrapper setExportEndTime(Date exportEndTime) {
         set("export_end_time",exportEndTime);
        return this;
    }
    /**
     * 
     */
    public McMoveJobsUpdateWrapper setImportRequestParam(String importRequestParam) {
         set("import_request_param",importRequestParam);
        return this;
    }
    /**
     * 
     */
    public McMoveJobsUpdateWrapper setImportJobId(String importJobId) {
         set("import_job_id",importJobId);
        return this;
    }
    /**
     * 
     */
    public McMoveJobsUpdateWrapper setImportJobResult(String importJobResult) {
         set("import_job_result",importJobResult);
        return this;
    }
    /**
     * 
     */
    public McMoveJobsUpdateWrapper setImportStartTime(Date importStartTime) {
         set("import_start_time",importStartTime);
        return this;
    }
    /**
     * 
     */
    public McMoveJobsUpdateWrapper setImportEndTime(Date importEndTime) {
         set("import_end_time",importEndTime);
        return this;
    }
    /**
     * 
     */
    public McMoveJobsUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 
     */
    public McMoveJobsUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public McMoveJobsUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public McMoveJobsUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public McMoveJobsUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public McMoveJobsUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public McMoveJobsUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public McMoveJobsUpdateWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public McMoveJobsUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public McMoveJobsUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public McMoveJobsUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public McMoveJobsUpdateWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = fkMcMoveDeviceId
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdEq(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            eq("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; fkMcMoveDeviceId
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdNe(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            ne("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; fkMcMoveDeviceId
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdGt(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            gt("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= fkMcMoveDeviceId
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdGe(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            ge("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; fkMcMoveDeviceId
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdLt(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            lt("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= fkMcMoveDeviceId
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdLe(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            le("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkMcMoveDeviceIdStart       值1
     * @param fkMcMoveDeviceIdEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdBetween(Long fkMcMoveDeviceIdStart,Long fkMcMoveDeviceIdEnd){
        if(fkMcMoveDeviceIdStart!=null && fkMcMoveDeviceIdEnd!=null){
            between("fk_mc_move_device_id",fkMcMoveDeviceIdStart,fkMcMoveDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcMoveDeviceIdStart       值1
     * @param fkMcMoveDeviceIdEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdNotBetween(Long fkMcMoveDeviceIdStart,Long fkMcMoveDeviceIdEnd){
        if(fkMcMoveDeviceIdStart!=null && fkMcMoveDeviceIdEnd!=null){
            notBetween("fk_mc_move_device_id",fkMcMoveDeviceIdStart,fkMcMoveDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' fkMcMoveDeviceId
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdLike(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            like("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' fkMcMoveDeviceId
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdNotLike(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            notLike("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' fkMcMoveDeviceId
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdLikeLeft(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            likeLeft("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' fkMcMoveDeviceId
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdLikeRight(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            likeRight("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdIsNull(){
        isNull("fk_mc_move_device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdIsNotNull(){
        isNotNull("fk_mc_move_device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_move_device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_move_device_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_move_device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper fkMcMoveDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_move_device_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = exportRequestParam
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamEq(String exportRequestParam){
        if(exportRequestParam!=null){
            eq("export_request_param",exportRequestParam);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; exportRequestParam
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamNe(String exportRequestParam){
        if(exportRequestParam!=null){
            ne("export_request_param",exportRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; exportRequestParam
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamGt(String exportRequestParam){
        if(exportRequestParam!=null){
            gt("export_request_param",exportRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= exportRequestParam
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamGe(String exportRequestParam){
        if(exportRequestParam!=null){
            ge("export_request_param",exportRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; exportRequestParam
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamLt(String exportRequestParam){
        if(exportRequestParam!=null){
            lt("export_request_param",exportRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= exportRequestParam
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamLe(String exportRequestParam){
        if(exportRequestParam!=null){
            le("export_request_param",exportRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param exportRequestParamStart       值1
     * @param exportRequestParamEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamBetween(String exportRequestParamStart,String exportRequestParamEnd){
        if(exportRequestParamStart!=null && exportRequestParamEnd!=null){
            between("export_request_param",exportRequestParamStart,exportRequestParamEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param exportRequestParamStart       值1
     * @param exportRequestParamEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamNotBetween(String exportRequestParamStart,String exportRequestParamEnd){
        if(exportRequestParamStart!=null && exportRequestParamEnd!=null){
            notBetween("export_request_param",exportRequestParamStart,exportRequestParamEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' exportRequestParam
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamLike(String exportRequestParam){
        if(exportRequestParam!=null){
            like("export_request_param",exportRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' exportRequestParam
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamNotLike(String exportRequestParam){
        if(exportRequestParam!=null){
            notLike("export_request_param",exportRequestParam);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' exportRequestParam
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamLikeLeft(String exportRequestParam){
        if(exportRequestParam!=null){
            likeLeft("export_request_param",exportRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' exportRequestParam
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamLikeRight(String exportRequestParam){
        if(exportRequestParam!=null){
            likeRight("export_request_param",exportRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamIsNull(){
        isNull("export_request_param");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamIsNotNull(){
        isNotNull("export_request_param");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("export_request_param",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamIn(String... values){
        if(values!=null && values.length>0){
            in("export_request_param",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("export_request_param",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportRequestParamNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("export_request_param",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = exportJobId
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdEq(String exportJobId){
        if(exportJobId!=null){
            eq("export_job_id",exportJobId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; exportJobId
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdNe(String exportJobId){
        if(exportJobId!=null){
            ne("export_job_id",exportJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; exportJobId
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdGt(String exportJobId){
        if(exportJobId!=null){
            gt("export_job_id",exportJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= exportJobId
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdGe(String exportJobId){
        if(exportJobId!=null){
            ge("export_job_id",exportJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; exportJobId
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdLt(String exportJobId){
        if(exportJobId!=null){
            lt("export_job_id",exportJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= exportJobId
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdLe(String exportJobId){
        if(exportJobId!=null){
            le("export_job_id",exportJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param exportJobIdStart       值1
     * @param exportJobIdEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdBetween(String exportJobIdStart,String exportJobIdEnd){
        if(exportJobIdStart!=null && exportJobIdEnd!=null){
            between("export_job_id",exportJobIdStart,exportJobIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param exportJobIdStart       值1
     * @param exportJobIdEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdNotBetween(String exportJobIdStart,String exportJobIdEnd){
        if(exportJobIdStart!=null && exportJobIdEnd!=null){
            notBetween("export_job_id",exportJobIdStart,exportJobIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' exportJobId
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdLike(String exportJobId){
        if(exportJobId!=null){
            like("export_job_id",exportJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' exportJobId
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdNotLike(String exportJobId){
        if(exportJobId!=null){
            notLike("export_job_id",exportJobId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' exportJobId
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdLikeLeft(String exportJobId){
        if(exportJobId!=null){
            likeLeft("export_job_id",exportJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' exportJobId
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdLikeRight(String exportJobId){
        if(exportJobId!=null){
            likeRight("export_job_id",exportJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdIsNull(){
        isNull("export_job_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdIsNotNull(){
        isNotNull("export_job_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("export_job_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdIn(String... values){
        if(values!=null && values.length>0){
            in("export_job_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("export_job_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("export_job_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = exportJobResult
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultEq(String exportJobResult){
        if(exportJobResult!=null){
            eq("export_job_result",exportJobResult);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; exportJobResult
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultNe(String exportJobResult){
        if(exportJobResult!=null){
            ne("export_job_result",exportJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; exportJobResult
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultGt(String exportJobResult){
        if(exportJobResult!=null){
            gt("export_job_result",exportJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= exportJobResult
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultGe(String exportJobResult){
        if(exportJobResult!=null){
            ge("export_job_result",exportJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; exportJobResult
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultLt(String exportJobResult){
        if(exportJobResult!=null){
            lt("export_job_result",exportJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= exportJobResult
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultLe(String exportJobResult){
        if(exportJobResult!=null){
            le("export_job_result",exportJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param exportJobResultStart       值1
     * @param exportJobResultEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultBetween(String exportJobResultStart,String exportJobResultEnd){
        if(exportJobResultStart!=null && exportJobResultEnd!=null){
            between("export_job_result",exportJobResultStart,exportJobResultEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param exportJobResultStart       值1
     * @param exportJobResultEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultNotBetween(String exportJobResultStart,String exportJobResultEnd){
        if(exportJobResultStart!=null && exportJobResultEnd!=null){
            notBetween("export_job_result",exportJobResultStart,exportJobResultEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' exportJobResult
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultLike(String exportJobResult){
        if(exportJobResult!=null){
            like("export_job_result",exportJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' exportJobResult
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultNotLike(String exportJobResult){
        if(exportJobResult!=null){
            notLike("export_job_result",exportJobResult);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' exportJobResult
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultLikeLeft(String exportJobResult){
        if(exportJobResult!=null){
            likeLeft("export_job_result",exportJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' exportJobResult
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultLikeRight(String exportJobResult){
        if(exportJobResult!=null){
            likeRight("export_job_result",exportJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultIsNull(){
        isNull("export_job_result");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultIsNotNull(){
        isNotNull("export_job_result");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("export_job_result",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultIn(String... values){
        if(values!=null && values.length>0){
            in("export_job_result",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("export_job_result",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportJobResultNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("export_job_result",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = exportStartTime
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeEq(Date exportStartTime){
        if(exportStartTime!=null){
            eq("export_start_time",exportStartTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; exportStartTime
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeNe(Date exportStartTime){
        if(exportStartTime!=null){
            ne("export_start_time",exportStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; exportStartTime
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeGt(Date exportStartTime){
        if(exportStartTime!=null){
            gt("export_start_time",exportStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= exportStartTime
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeGe(Date exportStartTime){
        if(exportStartTime!=null){
            ge("export_start_time",exportStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; exportStartTime
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeLt(Date exportStartTime){
        if(exportStartTime!=null){
            lt("export_start_time",exportStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= exportStartTime
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeLe(Date exportStartTime){
        if(exportStartTime!=null){
            le("export_start_time",exportStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param exportStartTimeStart       值1
     * @param exportStartTimeEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeBetween(Date exportStartTimeStart,Date exportStartTimeEnd){
        if(exportStartTimeStart!=null && exportStartTimeEnd!=null){
            between("export_start_time",exportStartTimeStart,exportStartTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param exportStartTimeStart       值1
     * @param exportStartTimeEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeNotBetween(Date exportStartTimeStart,Date exportStartTimeEnd){
        if(exportStartTimeStart!=null && exportStartTimeEnd!=null){
            notBetween("export_start_time",exportStartTimeStart,exportStartTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' exportStartTime
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeLike(Date exportStartTime){
        if(exportStartTime!=null){
            like("export_start_time",exportStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' exportStartTime
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeNotLike(Date exportStartTime){
        if(exportStartTime!=null){
            notLike("export_start_time",exportStartTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' exportStartTime
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeLikeLeft(Date exportStartTime){
        if(exportStartTime!=null){
            likeLeft("export_start_time",exportStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' exportStartTime
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeLikeRight(Date exportStartTime){
        if(exportStartTime!=null){
            likeRight("export_start_time",exportStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeIsNull(){
        isNull("export_start_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeIsNotNull(){
        isNotNull("export_start_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("export_start_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("export_start_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("export_start_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("export_start_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = exportEndTime
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeEq(Date exportEndTime){
        if(exportEndTime!=null){
            eq("export_end_time",exportEndTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; exportEndTime
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeNe(Date exportEndTime){
        if(exportEndTime!=null){
            ne("export_end_time",exportEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; exportEndTime
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeGt(Date exportEndTime){
        if(exportEndTime!=null){
            gt("export_end_time",exportEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= exportEndTime
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeGe(Date exportEndTime){
        if(exportEndTime!=null){
            ge("export_end_time",exportEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; exportEndTime
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeLt(Date exportEndTime){
        if(exportEndTime!=null){
            lt("export_end_time",exportEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= exportEndTime
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeLe(Date exportEndTime){
        if(exportEndTime!=null){
            le("export_end_time",exportEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param exportEndTimeStart       值1
     * @param exportEndTimeEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeBetween(Date exportEndTimeStart,Date exportEndTimeEnd){
        if(exportEndTimeStart!=null && exportEndTimeEnd!=null){
            between("export_end_time",exportEndTimeStart,exportEndTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param exportEndTimeStart       值1
     * @param exportEndTimeEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeNotBetween(Date exportEndTimeStart,Date exportEndTimeEnd){
        if(exportEndTimeStart!=null && exportEndTimeEnd!=null){
            notBetween("export_end_time",exportEndTimeStart,exportEndTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' exportEndTime
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeLike(Date exportEndTime){
        if(exportEndTime!=null){
            like("export_end_time",exportEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' exportEndTime
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeNotLike(Date exportEndTime){
        if(exportEndTime!=null){
            notLike("export_end_time",exportEndTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' exportEndTime
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeLikeLeft(Date exportEndTime){
        if(exportEndTime!=null){
            likeLeft("export_end_time",exportEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' exportEndTime
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeLikeRight(Date exportEndTime){
        if(exportEndTime!=null){
            likeRight("export_end_time",exportEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeIsNull(){
        isNull("export_end_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeIsNotNull(){
        isNotNull("export_end_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("export_end_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("export_end_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("export_end_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper exportEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("export_end_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = importRequestParam
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamEq(String importRequestParam){
        if(importRequestParam!=null){
            eq("import_request_param",importRequestParam);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; importRequestParam
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamNe(String importRequestParam){
        if(importRequestParam!=null){
            ne("import_request_param",importRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; importRequestParam
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamGt(String importRequestParam){
        if(importRequestParam!=null){
            gt("import_request_param",importRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= importRequestParam
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamGe(String importRequestParam){
        if(importRequestParam!=null){
            ge("import_request_param",importRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; importRequestParam
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamLt(String importRequestParam){
        if(importRequestParam!=null){
            lt("import_request_param",importRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= importRequestParam
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamLe(String importRequestParam){
        if(importRequestParam!=null){
            le("import_request_param",importRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param importRequestParamStart       值1
     * @param importRequestParamEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamBetween(String importRequestParamStart,String importRequestParamEnd){
        if(importRequestParamStart!=null && importRequestParamEnd!=null){
            between("import_request_param",importRequestParamStart,importRequestParamEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param importRequestParamStart       值1
     * @param importRequestParamEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamNotBetween(String importRequestParamStart,String importRequestParamEnd){
        if(importRequestParamStart!=null && importRequestParamEnd!=null){
            notBetween("import_request_param",importRequestParamStart,importRequestParamEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' importRequestParam
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamLike(String importRequestParam){
        if(importRequestParam!=null){
            like("import_request_param",importRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' importRequestParam
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamNotLike(String importRequestParam){
        if(importRequestParam!=null){
            notLike("import_request_param",importRequestParam);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' importRequestParam
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamLikeLeft(String importRequestParam){
        if(importRequestParam!=null){
            likeLeft("import_request_param",importRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' importRequestParam
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamLikeRight(String importRequestParam){
        if(importRequestParam!=null){
            likeRight("import_request_param",importRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamIsNull(){
        isNull("import_request_param");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamIsNotNull(){
        isNotNull("import_request_param");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("import_request_param",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamIn(String... values){
        if(values!=null && values.length>0){
            in("import_request_param",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("import_request_param",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importRequestParamNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("import_request_param",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = importJobId
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdEq(String importJobId){
        if(importJobId!=null){
            eq("import_job_id",importJobId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; importJobId
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdNe(String importJobId){
        if(importJobId!=null){
            ne("import_job_id",importJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; importJobId
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdGt(String importJobId){
        if(importJobId!=null){
            gt("import_job_id",importJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= importJobId
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdGe(String importJobId){
        if(importJobId!=null){
            ge("import_job_id",importJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; importJobId
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdLt(String importJobId){
        if(importJobId!=null){
            lt("import_job_id",importJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= importJobId
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdLe(String importJobId){
        if(importJobId!=null){
            le("import_job_id",importJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param importJobIdStart       值1
     * @param importJobIdEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdBetween(String importJobIdStart,String importJobIdEnd){
        if(importJobIdStart!=null && importJobIdEnd!=null){
            between("import_job_id",importJobIdStart,importJobIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param importJobIdStart       值1
     * @param importJobIdEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdNotBetween(String importJobIdStart,String importJobIdEnd){
        if(importJobIdStart!=null && importJobIdEnd!=null){
            notBetween("import_job_id",importJobIdStart,importJobIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' importJobId
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdLike(String importJobId){
        if(importJobId!=null){
            like("import_job_id",importJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' importJobId
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdNotLike(String importJobId){
        if(importJobId!=null){
            notLike("import_job_id",importJobId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' importJobId
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdLikeLeft(String importJobId){
        if(importJobId!=null){
            likeLeft("import_job_id",importJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' importJobId
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdLikeRight(String importJobId){
        if(importJobId!=null){
            likeRight("import_job_id",importJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdIsNull(){
        isNull("import_job_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdIsNotNull(){
        isNotNull("import_job_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("import_job_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdIn(String... values){
        if(values!=null && values.length>0){
            in("import_job_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("import_job_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("import_job_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = importJobResult
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultEq(String importJobResult){
        if(importJobResult!=null){
            eq("import_job_result",importJobResult);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; importJobResult
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultNe(String importJobResult){
        if(importJobResult!=null){
            ne("import_job_result",importJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; importJobResult
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultGt(String importJobResult){
        if(importJobResult!=null){
            gt("import_job_result",importJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= importJobResult
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultGe(String importJobResult){
        if(importJobResult!=null){
            ge("import_job_result",importJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; importJobResult
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultLt(String importJobResult){
        if(importJobResult!=null){
            lt("import_job_result",importJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= importJobResult
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultLe(String importJobResult){
        if(importJobResult!=null){
            le("import_job_result",importJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param importJobResultStart       值1
     * @param importJobResultEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultBetween(String importJobResultStart,String importJobResultEnd){
        if(importJobResultStart!=null && importJobResultEnd!=null){
            between("import_job_result",importJobResultStart,importJobResultEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param importJobResultStart       值1
     * @param importJobResultEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultNotBetween(String importJobResultStart,String importJobResultEnd){
        if(importJobResultStart!=null && importJobResultEnd!=null){
            notBetween("import_job_result",importJobResultStart,importJobResultEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' importJobResult
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultLike(String importJobResult){
        if(importJobResult!=null){
            like("import_job_result",importJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' importJobResult
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultNotLike(String importJobResult){
        if(importJobResult!=null){
            notLike("import_job_result",importJobResult);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' importJobResult
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultLikeLeft(String importJobResult){
        if(importJobResult!=null){
            likeLeft("import_job_result",importJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' importJobResult
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultLikeRight(String importJobResult){
        if(importJobResult!=null){
            likeRight("import_job_result",importJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultIsNull(){
        isNull("import_job_result");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultIsNotNull(){
        isNotNull("import_job_result");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("import_job_result",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultIn(String... values){
        if(values!=null && values.length>0){
            in("import_job_result",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("import_job_result",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importJobResultNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("import_job_result",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = importStartTime
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeEq(Date importStartTime){
        if(importStartTime!=null){
            eq("import_start_time",importStartTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; importStartTime
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeNe(Date importStartTime){
        if(importStartTime!=null){
            ne("import_start_time",importStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; importStartTime
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeGt(Date importStartTime){
        if(importStartTime!=null){
            gt("import_start_time",importStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= importStartTime
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeGe(Date importStartTime){
        if(importStartTime!=null){
            ge("import_start_time",importStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; importStartTime
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeLt(Date importStartTime){
        if(importStartTime!=null){
            lt("import_start_time",importStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= importStartTime
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeLe(Date importStartTime){
        if(importStartTime!=null){
            le("import_start_time",importStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param importStartTimeStart       值1
     * @param importStartTimeEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeBetween(Date importStartTimeStart,Date importStartTimeEnd){
        if(importStartTimeStart!=null && importStartTimeEnd!=null){
            between("import_start_time",importStartTimeStart,importStartTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param importStartTimeStart       值1
     * @param importStartTimeEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeNotBetween(Date importStartTimeStart,Date importStartTimeEnd){
        if(importStartTimeStart!=null && importStartTimeEnd!=null){
            notBetween("import_start_time",importStartTimeStart,importStartTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' importStartTime
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeLike(Date importStartTime){
        if(importStartTime!=null){
            like("import_start_time",importStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' importStartTime
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeNotLike(Date importStartTime){
        if(importStartTime!=null){
            notLike("import_start_time",importStartTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' importStartTime
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeLikeLeft(Date importStartTime){
        if(importStartTime!=null){
            likeLeft("import_start_time",importStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' importStartTime
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeLikeRight(Date importStartTime){
        if(importStartTime!=null){
            likeRight("import_start_time",importStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeIsNull(){
        isNull("import_start_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeIsNotNull(){
        isNotNull("import_start_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("import_start_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("import_start_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("import_start_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("import_start_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = importEndTime
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeEq(Date importEndTime){
        if(importEndTime!=null){
            eq("import_end_time",importEndTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; importEndTime
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeNe(Date importEndTime){
        if(importEndTime!=null){
            ne("import_end_time",importEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; importEndTime
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeGt(Date importEndTime){
        if(importEndTime!=null){
            gt("import_end_time",importEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= importEndTime
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeGe(Date importEndTime){
        if(importEndTime!=null){
            ge("import_end_time",importEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; importEndTime
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeLt(Date importEndTime){
        if(importEndTime!=null){
            lt("import_end_time",importEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= importEndTime
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeLe(Date importEndTime){
        if(importEndTime!=null){
            le("import_end_time",importEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param importEndTimeStart       值1
     * @param importEndTimeEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeBetween(Date importEndTimeStart,Date importEndTimeEnd){
        if(importEndTimeStart!=null && importEndTimeEnd!=null){
            between("import_end_time",importEndTimeStart,importEndTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param importEndTimeStart       值1
     * @param importEndTimeEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeNotBetween(Date importEndTimeStart,Date importEndTimeEnd){
        if(importEndTimeStart!=null && importEndTimeEnd!=null){
            notBetween("import_end_time",importEndTimeStart,importEndTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' importEndTime
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeLike(Date importEndTime){
        if(importEndTime!=null){
            like("import_end_time",importEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' importEndTime
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeNotLike(Date importEndTime){
        if(importEndTime!=null){
            notLike("import_end_time",importEndTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' importEndTime
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeLikeLeft(Date importEndTime){
        if(importEndTime!=null){
            likeLeft("import_end_time",importEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' importEndTime
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeLikeRight(Date importEndTime){
        if(importEndTime!=null){
            likeRight("import_end_time",importEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeIsNull(){
        isNull("import_end_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeIsNotNull(){
        isNotNull("import_end_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("import_end_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("import_end_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("import_end_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper importEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("import_end_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; createTime
     * @param createTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; createTime
     * @param createTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= createTime
     * @param createTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; createTime
     * @param createTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= createTime
     * @param createTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' createTime
     * @param createTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' createTime
     * @param createTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveJobsUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
