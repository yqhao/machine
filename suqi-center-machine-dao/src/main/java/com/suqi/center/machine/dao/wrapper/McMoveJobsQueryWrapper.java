package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.McMoveJobs;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 
 * </p>
 * "mc_move_jobs"
 * @author PC001
 */
public class McMoveJobsQueryWrapper extends QueryWrapper<McMoveJobs> {


    public static McMoveJobsQueryWrapper wrapper() {
        return new McMoveJobsQueryWrapper();
    }

    public McMoveJobsQueryWrapper() {
        super();
    }

    public McMoveJobsQueryWrapper(McMoveJobs entity) {
        super(entity);
    }

    public McMoveJobsQueryWrapper(McMoveJobs entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public McMoveJobsQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public McMoveJobsQueryWrapper selectColumns(Consumer<McMoveJobsSelect> consumer) {
        McMoveJobsSelect select = new McMoveJobsSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }


    /**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public McMoveJobsQueryWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public McMoveJobsQueryWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public McMoveJobsQueryWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public McMoveJobsQueryWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public McMoveJobsQueryWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public McMoveJobsQueryWrapper idLe(Long id){
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
    public McMoveJobsQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public McMoveJobsQueryWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McMoveJobsQueryWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McMoveJobsQueryWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public McMoveJobsQueryWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public McMoveJobsQueryWrapper idLikeRight(Long id){
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
    public McMoveJobsQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryWrapper idIn(Collection<Long> value){
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
    public McMoveJobsQueryWrapper idIn(Long... values){
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
    public McMoveJobsQueryWrapper idNotIn(Collection<Long> value){
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
    public McMoveJobsQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdEq(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            eq("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdNe(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            ne("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdGt(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            gt("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdGe(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            ge("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdLt(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            lt("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdLe(Long fkMcMoveDeviceId){
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
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdBetween(Long fkMcMoveDeviceIdStart,Long fkMcMoveDeviceIdEnd){
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
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdNotBetween(Long fkMcMoveDeviceIdStart,Long fkMcMoveDeviceIdEnd){
        if(fkMcMoveDeviceIdStart!=null && fkMcMoveDeviceIdEnd!=null){
            notBetween("fk_mc_move_device_id",fkMcMoveDeviceIdStart,fkMcMoveDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdLike(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            like("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdNotLike(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            notLike("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdLikeLeft(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            likeLeft("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdLikeRight(Long fkMcMoveDeviceId){
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
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdIsNull(){
        isNull("fk_mc_move_device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdIsNotNull(){
        isNotNull("fk_mc_move_device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdIn(Collection<Long> value){
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
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdIn(Long... values){
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
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdNotIn(Collection<Long> value){
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
    public McMoveJobsQueryWrapper fkMcMoveDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_move_device_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportRequestParamEq(String exportRequestParam){
        if(exportRequestParam!=null){
            eq("export_request_param",exportRequestParam);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportRequestParamNe(String exportRequestParam){
        if(exportRequestParam!=null){
            ne("export_request_param",exportRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportRequestParamGt(String exportRequestParam){
        if(exportRequestParam!=null){
            gt("export_request_param",exportRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportRequestParamGe(String exportRequestParam){
        if(exportRequestParam!=null){
            ge("export_request_param",exportRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportRequestParamLt(String exportRequestParam){
        if(exportRequestParam!=null){
            lt("export_request_param",exportRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportRequestParamLe(String exportRequestParam){
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
    public McMoveJobsQueryWrapper exportRequestParamBetween(String exportRequestParamStart,String exportRequestParamEnd){
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
    public McMoveJobsQueryWrapper exportRequestParamNotBetween(String exportRequestParamStart,String exportRequestParamEnd){
        if(exportRequestParamStart!=null && exportRequestParamEnd!=null){
            notBetween("export_request_param",exportRequestParamStart,exportRequestParamEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportRequestParamLike(String exportRequestParam){
        if(exportRequestParam!=null){
            like("export_request_param",exportRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportRequestParamNotLike(String exportRequestParam){
        if(exportRequestParam!=null){
            notLike("export_request_param",exportRequestParam);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportRequestParamLikeLeft(String exportRequestParam){
        if(exportRequestParam!=null){
            likeLeft("export_request_param",exportRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportRequestParamLikeRight(String exportRequestParam){
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
    public McMoveJobsQueryWrapper exportRequestParamIsNull(){
        isNull("export_request_param");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryWrapper exportRequestParamIsNotNull(){
        isNotNull("export_request_param");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryWrapper exportRequestParamIn(Collection<String> value){
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
    public McMoveJobsQueryWrapper exportRequestParamIn(String... values){
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
    public McMoveJobsQueryWrapper exportRequestParamNotIn(Collection<String> value){
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
    public McMoveJobsQueryWrapper exportRequestParamNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("export_request_param",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobIdEq(String exportJobId){
        if(exportJobId!=null){
            eq("export_job_id",exportJobId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobIdNe(String exportJobId){
        if(exportJobId!=null){
            ne("export_job_id",exportJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobIdGt(String exportJobId){
        if(exportJobId!=null){
            gt("export_job_id",exportJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobIdGe(String exportJobId){
        if(exportJobId!=null){
            ge("export_job_id",exportJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobIdLt(String exportJobId){
        if(exportJobId!=null){
            lt("export_job_id",exportJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobIdLe(String exportJobId){
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
    public McMoveJobsQueryWrapper exportJobIdBetween(String exportJobIdStart,String exportJobIdEnd){
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
    public McMoveJobsQueryWrapper exportJobIdNotBetween(String exportJobIdStart,String exportJobIdEnd){
        if(exportJobIdStart!=null && exportJobIdEnd!=null){
            notBetween("export_job_id",exportJobIdStart,exportJobIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobIdLike(String exportJobId){
        if(exportJobId!=null){
            like("export_job_id",exportJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobIdNotLike(String exportJobId){
        if(exportJobId!=null){
            notLike("export_job_id",exportJobId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobIdLikeLeft(String exportJobId){
        if(exportJobId!=null){
            likeLeft("export_job_id",exportJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobIdLikeRight(String exportJobId){
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
    public McMoveJobsQueryWrapper exportJobIdIsNull(){
        isNull("export_job_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobIdIsNotNull(){
        isNotNull("export_job_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobIdIn(Collection<String> value){
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
    public McMoveJobsQueryWrapper exportJobIdIn(String... values){
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
    public McMoveJobsQueryWrapper exportJobIdNotIn(Collection<String> value){
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
    public McMoveJobsQueryWrapper exportJobIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("export_job_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobResultEq(String exportJobResult){
        if(exportJobResult!=null){
            eq("export_job_result",exportJobResult);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobResultNe(String exportJobResult){
        if(exportJobResult!=null){
            ne("export_job_result",exportJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobResultGt(String exportJobResult){
        if(exportJobResult!=null){
            gt("export_job_result",exportJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobResultGe(String exportJobResult){
        if(exportJobResult!=null){
            ge("export_job_result",exportJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobResultLt(String exportJobResult){
        if(exportJobResult!=null){
            lt("export_job_result",exportJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobResultLe(String exportJobResult){
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
    public McMoveJobsQueryWrapper exportJobResultBetween(String exportJobResultStart,String exportJobResultEnd){
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
    public McMoveJobsQueryWrapper exportJobResultNotBetween(String exportJobResultStart,String exportJobResultEnd){
        if(exportJobResultStart!=null && exportJobResultEnd!=null){
            notBetween("export_job_result",exportJobResultStart,exportJobResultEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobResultLike(String exportJobResult){
        if(exportJobResult!=null){
            like("export_job_result",exportJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobResultNotLike(String exportJobResult){
        if(exportJobResult!=null){
            notLike("export_job_result",exportJobResult);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobResultLikeLeft(String exportJobResult){
        if(exportJobResult!=null){
            likeLeft("export_job_result",exportJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobResultLikeRight(String exportJobResult){
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
    public McMoveJobsQueryWrapper exportJobResultIsNull(){
        isNull("export_job_result");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobResultIsNotNull(){
        isNotNull("export_job_result");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryWrapper exportJobResultIn(Collection<String> value){
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
    public McMoveJobsQueryWrapper exportJobResultIn(String... values){
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
    public McMoveJobsQueryWrapper exportJobResultNotIn(Collection<String> value){
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
    public McMoveJobsQueryWrapper exportJobResultNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("export_job_result",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportStartTimeEq(Date exportStartTime){
        if(exportStartTime!=null){
            eq("export_start_time",exportStartTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportStartTimeNe(Date exportStartTime){
        if(exportStartTime!=null){
            ne("export_start_time",exportStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportStartTimeGt(Date exportStartTime){
        if(exportStartTime!=null){
            gt("export_start_time",exportStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportStartTimeGe(Date exportStartTime){
        if(exportStartTime!=null){
            ge("export_start_time",exportStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportStartTimeLt(Date exportStartTime){
        if(exportStartTime!=null){
            lt("export_start_time",exportStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportStartTimeLe(Date exportStartTime){
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
    public McMoveJobsQueryWrapper exportStartTimeBetween(Date exportStartTimeStart,Date exportStartTimeEnd){
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
    public McMoveJobsQueryWrapper exportStartTimeNotBetween(Date exportStartTimeStart,Date exportStartTimeEnd){
        if(exportStartTimeStart!=null && exportStartTimeEnd!=null){
            notBetween("export_start_time",exportStartTimeStart,exportStartTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportStartTimeLike(Date exportStartTime){
        if(exportStartTime!=null){
            like("export_start_time",exportStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportStartTimeNotLike(Date exportStartTime){
        if(exportStartTime!=null){
            notLike("export_start_time",exportStartTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportStartTimeLikeLeft(Date exportStartTime){
        if(exportStartTime!=null){
            likeLeft("export_start_time",exportStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportStartTimeLikeRight(Date exportStartTime){
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
    public McMoveJobsQueryWrapper exportStartTimeIsNull(){
        isNull("export_start_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryWrapper exportStartTimeIsNotNull(){
        isNotNull("export_start_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryWrapper exportStartTimeIn(Collection<Date> value){
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
    public McMoveJobsQueryWrapper exportStartTimeIn(Date... values){
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
    public McMoveJobsQueryWrapper exportStartTimeNotIn(Collection<Date> value){
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
    public McMoveJobsQueryWrapper exportStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("export_start_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportEndTimeEq(Date exportEndTime){
        if(exportEndTime!=null){
            eq("export_end_time",exportEndTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportEndTimeNe(Date exportEndTime){
        if(exportEndTime!=null){
            ne("export_end_time",exportEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportEndTimeGt(Date exportEndTime){
        if(exportEndTime!=null){
            gt("export_end_time",exportEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportEndTimeGe(Date exportEndTime){
        if(exportEndTime!=null){
            ge("export_end_time",exportEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportEndTimeLt(Date exportEndTime){
        if(exportEndTime!=null){
            lt("export_end_time",exportEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportEndTimeLe(Date exportEndTime){
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
    public McMoveJobsQueryWrapper exportEndTimeBetween(Date exportEndTimeStart,Date exportEndTimeEnd){
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
    public McMoveJobsQueryWrapper exportEndTimeNotBetween(Date exportEndTimeStart,Date exportEndTimeEnd){
        if(exportEndTimeStart!=null && exportEndTimeEnd!=null){
            notBetween("export_end_time",exportEndTimeStart,exportEndTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportEndTimeLike(Date exportEndTime){
        if(exportEndTime!=null){
            like("export_end_time",exportEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportEndTimeNotLike(Date exportEndTime){
        if(exportEndTime!=null){
            notLike("export_end_time",exportEndTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportEndTimeLikeLeft(Date exportEndTime){
        if(exportEndTime!=null){
            likeLeft("export_end_time",exportEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper exportEndTimeLikeRight(Date exportEndTime){
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
    public McMoveJobsQueryWrapper exportEndTimeIsNull(){
        isNull("export_end_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryWrapper exportEndTimeIsNotNull(){
        isNotNull("export_end_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryWrapper exportEndTimeIn(Collection<Date> value){
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
    public McMoveJobsQueryWrapper exportEndTimeIn(Date... values){
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
    public McMoveJobsQueryWrapper exportEndTimeNotIn(Collection<Date> value){
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
    public McMoveJobsQueryWrapper exportEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("export_end_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper importRequestParamEq(String importRequestParam){
        if(importRequestParam!=null){
            eq("import_request_param",importRequestParam);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper importRequestParamNe(String importRequestParam){
        if(importRequestParam!=null){
            ne("import_request_param",importRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper importRequestParamGt(String importRequestParam){
        if(importRequestParam!=null){
            gt("import_request_param",importRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper importRequestParamGe(String importRequestParam){
        if(importRequestParam!=null){
            ge("import_request_param",importRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper importRequestParamLt(String importRequestParam){
        if(importRequestParam!=null){
            lt("import_request_param",importRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper importRequestParamLe(String importRequestParam){
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
    public McMoveJobsQueryWrapper importRequestParamBetween(String importRequestParamStart,String importRequestParamEnd){
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
    public McMoveJobsQueryWrapper importRequestParamNotBetween(String importRequestParamStart,String importRequestParamEnd){
        if(importRequestParamStart!=null && importRequestParamEnd!=null){
            notBetween("import_request_param",importRequestParamStart,importRequestParamEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper importRequestParamLike(String importRequestParam){
        if(importRequestParam!=null){
            like("import_request_param",importRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper importRequestParamNotLike(String importRequestParam){
        if(importRequestParam!=null){
            notLike("import_request_param",importRequestParam);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper importRequestParamLikeLeft(String importRequestParam){
        if(importRequestParam!=null){
            likeLeft("import_request_param",importRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsQueryWrapper importRequestParamLikeRight(String importRequestParam){
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
    public McMoveJobsQueryWrapper importRequestParamIsNull(){
        isNull("import_request_param");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryWrapper importRequestParamIsNotNull(){
        isNotNull("import_request_param");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryWrapper importRequestParamIn(Collection<String> value){
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
    public McMoveJobsQueryWrapper importRequestParamIn(String... values){
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
    public McMoveJobsQueryWrapper importRequestParamNotIn(Collection<String> value){
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
    public McMoveJobsQueryWrapper importRequestParamNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("import_request_param",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobIdEq(String importJobId){
        if(importJobId!=null){
            eq("import_job_id",importJobId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobIdNe(String importJobId){
        if(importJobId!=null){
            ne("import_job_id",importJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobIdGt(String importJobId){
        if(importJobId!=null){
            gt("import_job_id",importJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobIdGe(String importJobId){
        if(importJobId!=null){
            ge("import_job_id",importJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobIdLt(String importJobId){
        if(importJobId!=null){
            lt("import_job_id",importJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobIdLe(String importJobId){
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
    public McMoveJobsQueryWrapper importJobIdBetween(String importJobIdStart,String importJobIdEnd){
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
    public McMoveJobsQueryWrapper importJobIdNotBetween(String importJobIdStart,String importJobIdEnd){
        if(importJobIdStart!=null && importJobIdEnd!=null){
            notBetween("import_job_id",importJobIdStart,importJobIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobIdLike(String importJobId){
        if(importJobId!=null){
            like("import_job_id",importJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobIdNotLike(String importJobId){
        if(importJobId!=null){
            notLike("import_job_id",importJobId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobIdLikeLeft(String importJobId){
        if(importJobId!=null){
            likeLeft("import_job_id",importJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobIdLikeRight(String importJobId){
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
    public McMoveJobsQueryWrapper importJobIdIsNull(){
        isNull("import_job_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryWrapper importJobIdIsNotNull(){
        isNotNull("import_job_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryWrapper importJobIdIn(Collection<String> value){
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
    public McMoveJobsQueryWrapper importJobIdIn(String... values){
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
    public McMoveJobsQueryWrapper importJobIdNotIn(Collection<String> value){
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
    public McMoveJobsQueryWrapper importJobIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("import_job_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobResultEq(String importJobResult){
        if(importJobResult!=null){
            eq("import_job_result",importJobResult);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobResultNe(String importJobResult){
        if(importJobResult!=null){
            ne("import_job_result",importJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobResultGt(String importJobResult){
        if(importJobResult!=null){
            gt("import_job_result",importJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobResultGe(String importJobResult){
        if(importJobResult!=null){
            ge("import_job_result",importJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobResultLt(String importJobResult){
        if(importJobResult!=null){
            lt("import_job_result",importJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobResultLe(String importJobResult){
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
    public McMoveJobsQueryWrapper importJobResultBetween(String importJobResultStart,String importJobResultEnd){
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
    public McMoveJobsQueryWrapper importJobResultNotBetween(String importJobResultStart,String importJobResultEnd){
        if(importJobResultStart!=null && importJobResultEnd!=null){
            notBetween("import_job_result",importJobResultStart,importJobResultEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobResultLike(String importJobResult){
        if(importJobResult!=null){
            like("import_job_result",importJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobResultNotLike(String importJobResult){
        if(importJobResult!=null){
            notLike("import_job_result",importJobResult);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobResultLikeLeft(String importJobResult){
        if(importJobResult!=null){
            likeLeft("import_job_result",importJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsQueryWrapper importJobResultLikeRight(String importJobResult){
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
    public McMoveJobsQueryWrapper importJobResultIsNull(){
        isNull("import_job_result");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryWrapper importJobResultIsNotNull(){
        isNotNull("import_job_result");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryWrapper importJobResultIn(Collection<String> value){
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
    public McMoveJobsQueryWrapper importJobResultIn(String... values){
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
    public McMoveJobsQueryWrapper importJobResultNotIn(Collection<String> value){
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
    public McMoveJobsQueryWrapper importJobResultNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("import_job_result",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importStartTimeEq(Date importStartTime){
        if(importStartTime!=null){
            eq("import_start_time",importStartTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importStartTimeNe(Date importStartTime){
        if(importStartTime!=null){
            ne("import_start_time",importStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importStartTimeGt(Date importStartTime){
        if(importStartTime!=null){
            gt("import_start_time",importStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importStartTimeGe(Date importStartTime){
        if(importStartTime!=null){
            ge("import_start_time",importStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importStartTimeLt(Date importStartTime){
        if(importStartTime!=null){
            lt("import_start_time",importStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importStartTimeLe(Date importStartTime){
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
    public McMoveJobsQueryWrapper importStartTimeBetween(Date importStartTimeStart,Date importStartTimeEnd){
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
    public McMoveJobsQueryWrapper importStartTimeNotBetween(Date importStartTimeStart,Date importStartTimeEnd){
        if(importStartTimeStart!=null && importStartTimeEnd!=null){
            notBetween("import_start_time",importStartTimeStart,importStartTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importStartTimeLike(Date importStartTime){
        if(importStartTime!=null){
            like("import_start_time",importStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importStartTimeNotLike(Date importStartTime){
        if(importStartTime!=null){
            notLike("import_start_time",importStartTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importStartTimeLikeLeft(Date importStartTime){
        if(importStartTime!=null){
            likeLeft("import_start_time",importStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importStartTimeLikeRight(Date importStartTime){
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
    public McMoveJobsQueryWrapper importStartTimeIsNull(){
        isNull("import_start_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryWrapper importStartTimeIsNotNull(){
        isNotNull("import_start_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryWrapper importStartTimeIn(Collection<Date> value){
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
    public McMoveJobsQueryWrapper importStartTimeIn(Date... values){
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
    public McMoveJobsQueryWrapper importStartTimeNotIn(Collection<Date> value){
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
    public McMoveJobsQueryWrapper importStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("import_start_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importEndTimeEq(Date importEndTime){
        if(importEndTime!=null){
            eq("import_end_time",importEndTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importEndTimeNe(Date importEndTime){
        if(importEndTime!=null){
            ne("import_end_time",importEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importEndTimeGt(Date importEndTime){
        if(importEndTime!=null){
            gt("import_end_time",importEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importEndTimeGe(Date importEndTime){
        if(importEndTime!=null){
            ge("import_end_time",importEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importEndTimeLt(Date importEndTime){
        if(importEndTime!=null){
            lt("import_end_time",importEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importEndTimeLe(Date importEndTime){
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
    public McMoveJobsQueryWrapper importEndTimeBetween(Date importEndTimeStart,Date importEndTimeEnd){
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
    public McMoveJobsQueryWrapper importEndTimeNotBetween(Date importEndTimeStart,Date importEndTimeEnd){
        if(importEndTimeStart!=null && importEndTimeEnd!=null){
            notBetween("import_end_time",importEndTimeStart,importEndTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importEndTimeLike(Date importEndTime){
        if(importEndTime!=null){
            like("import_end_time",importEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importEndTimeNotLike(Date importEndTime){
        if(importEndTime!=null){
            notLike("import_end_time",importEndTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importEndTimeLikeLeft(Date importEndTime){
        if(importEndTime!=null){
            likeLeft("import_end_time",importEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper importEndTimeLikeRight(Date importEndTime){
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
    public McMoveJobsQueryWrapper importEndTimeIsNull(){
        isNull("import_end_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryWrapper importEndTimeIsNotNull(){
        isNotNull("import_end_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryWrapper importEndTimeIn(Collection<Date> value){
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
    public McMoveJobsQueryWrapper importEndTimeIn(Date... values){
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
    public McMoveJobsQueryWrapper importEndTimeNotIn(Collection<Date> value){
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
    public McMoveJobsQueryWrapper importEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("import_end_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper createTimeLe(Date createTime){
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
    public McMoveJobsQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McMoveJobsQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper createTimeLikeRight(Date createTime){
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
    public McMoveJobsQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryWrapper createTimeIn(Collection<Date> value){
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
    public McMoveJobsQueryWrapper createTimeIn(Date... values){
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
    public McMoveJobsQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public McMoveJobsQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McMoveJobsQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McMoveJobsQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McMoveJobsQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McMoveJobsQueryWrapper lastUpdateTimeIn(Date... values){
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
    public McMoveJobsQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McMoveJobsQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
