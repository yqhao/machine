package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.entity.McMoveJobs;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 
 * </p>
 * "mc_move_jobs"
 * @author PC001
 */
public class McMoveJobsQueryEntityWrapper extends QueryWrapper<McMoveJobs> {

    public static McMoveJobsQueryEntityWrapper wrapper(McMoveJobs entity) {
        return new McMoveJobsQueryEntityWrapper(entity);
    }

    private McMoveJobs entity;

    public McMoveJobsQueryEntityWrapper(McMoveJobs entity) {
         this.entity=entity;
    }


    protected McMoveJobs entity() {
        if(entity==null){
            throw new NullPointerException("McMoveJobs is null");
        }
        return entity;
    }

    @Override
    public McMoveJobsQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public McMoveJobsQueryEntityWrapper selectColumns(Consumer<McMoveJobsSelect> consumer) {
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
     * 等于 = entity().getId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",entity().getId(),idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",entity().getId(),idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",entity().getId());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idEq(Long id){
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
    public McMoveJobsQueryEntityWrapper idNe(Long id){
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
    public McMoveJobsQueryEntityWrapper idGt(Long id){
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
    public McMoveJobsQueryEntityWrapper idGe(Long id){
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
    public McMoveJobsQueryEntityWrapper idLt(Long id){
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
    public McMoveJobsQueryEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idLike(Long id){
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
    public McMoveJobsQueryEntityWrapper idNotLike(Long id){
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
    public McMoveJobsQueryEntityWrapper idLikeLeft(Long id){
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
    public McMoveJobsQueryEntityWrapper idLikeRight(Long id){
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
    public McMoveJobsQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryEntityWrapper idIn(Collection<Long> value){
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
    public McMoveJobsQueryEntityWrapper idIn(Long... values){
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
    public McMoveJobsQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public McMoveJobsQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getFkMcMoveDeviceId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdEq(){
        Long fkMcMoveDeviceId =entity().getFkMcMoveDeviceId();
        if(fkMcMoveDeviceId!=null){
            eq("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getFkMcMoveDeviceId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdNe(){
        Long fkMcMoveDeviceId =entity().getFkMcMoveDeviceId();
        if(fkMcMoveDeviceId!=null){
            ne("fk_mc_move_device_id",entity().getFkMcMoveDeviceId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getFkMcMoveDeviceId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdGt(){
        Long fkMcMoveDeviceId =entity().getFkMcMoveDeviceId();
        if(fkMcMoveDeviceId!=null){
            gt("fk_mc_move_device_id",entity().getFkMcMoveDeviceId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getFkMcMoveDeviceId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdGe(){
        Long fkMcMoveDeviceId =entity().getFkMcMoveDeviceId();
        if(fkMcMoveDeviceId!=null){
            ge("fk_mc_move_device_id",entity().getFkMcMoveDeviceId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getFkMcMoveDeviceId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdLt(){
        Long fkMcMoveDeviceId =entity().getFkMcMoveDeviceId();
        if(fkMcMoveDeviceId!=null){
            lt("fk_mc_move_device_id",entity().getFkMcMoveDeviceId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getFkMcMoveDeviceId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdLe(){
        Long fkMcMoveDeviceId =entity().getFkMcMoveDeviceId();
        if(fkMcMoveDeviceId!=null){
            le("fk_mc_move_device_id",entity().getFkMcMoveDeviceId());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkMcMoveDeviceId() AND fkMcMoveDeviceIdEnd
     * @param fkMcMoveDeviceIdEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdBetween(Long fkMcMoveDeviceIdEnd){
        Long fkMcMoveDeviceId =entity().getFkMcMoveDeviceId();
        if(fkMcMoveDeviceId!=null && fkMcMoveDeviceIdEnd!=null){
            between("fk_mc_move_device_id",entity().getFkMcMoveDeviceId(),fkMcMoveDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkMcMoveDeviceId() AND 值2
     * @param fkMcMoveDeviceIdEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdNotBetween(Long fkMcMoveDeviceIdEnd){
        Long fkMcMoveDeviceId =entity().getFkMcMoveDeviceId();
        if(fkMcMoveDeviceId!=null && fkMcMoveDeviceIdEnd!=null){
            notBetween("fk_mc_move_device_id",entity().getFkMcMoveDeviceId(),fkMcMoveDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkMcMoveDeviceId() AND 值2
     * @param fkMcMoveDeviceIdStart       值1
     * @param fkMcMoveDeviceIdEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdBetween(Long fkMcMoveDeviceIdStart,Long fkMcMoveDeviceIdEnd){
        Long fkMcMoveDeviceId =entity().getFkMcMoveDeviceId();
        if(fkMcMoveDeviceId!=null && fkMcMoveDeviceIdEnd!=null){
            between("fk_mc_move_device_id",fkMcMoveDeviceIdStart,fkMcMoveDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkMcMoveDeviceId() AND 值2
     * @param fkMcMoveDeviceIdStart       值1
     * @param fkMcMoveDeviceIdEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdNotBetween(Long fkMcMoveDeviceIdStart,Long fkMcMoveDeviceIdEnd){
        Long fkMcMoveDeviceId =entity().getFkMcMoveDeviceId();
        if(fkMcMoveDeviceId!=null && fkMcMoveDeviceIdEnd!=null){
            notBetween("fk_mc_move_device_id",fkMcMoveDeviceIdStart,fkMcMoveDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getFkMcMoveDeviceId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdLike(){
        Long fkMcMoveDeviceId =entity().getFkMcMoveDeviceId();
        if(fkMcMoveDeviceId!=null){
            like("fk_mc_move_device_id",entity().getFkMcMoveDeviceId());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getFkMcMoveDeviceId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdNotLike(){
        Long fkMcMoveDeviceId =entity().getFkMcMoveDeviceId();
        if(fkMcMoveDeviceId!=null){
            notLike("fk_mc_move_device_id",entity().getFkMcMoveDeviceId());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getFkMcMoveDeviceId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdLikeLeft(){
        Long fkMcMoveDeviceId =entity().getFkMcMoveDeviceId();
        if(fkMcMoveDeviceId!=null){
            likeLeft("fk_mc_move_device_id",entity().getFkMcMoveDeviceId());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getFkMcMoveDeviceId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdLikeRight(){
        Long fkMcMoveDeviceId =entity().getFkMcMoveDeviceId();
        if(fkMcMoveDeviceId!=null){
            likeRight("fk_mc_move_device_id",entity().getFkMcMoveDeviceId());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdEq(Long fkMcMoveDeviceId){
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
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdNe(Long fkMcMoveDeviceId){
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
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdGt(Long fkMcMoveDeviceId){
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
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdGe(Long fkMcMoveDeviceId){
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
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdLt(Long fkMcMoveDeviceId){
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
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdLe(Long fkMcMoveDeviceId){
        if(fkMcMoveDeviceId!=null){
            le("fk_mc_move_device_id",fkMcMoveDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkMcMoveDeviceId       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdLike(Long fkMcMoveDeviceId){
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
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdNotLike(Long fkMcMoveDeviceId){
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
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdLikeLeft(Long fkMcMoveDeviceId){
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
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdLikeRight(Long fkMcMoveDeviceId){
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
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdIsNull(){
        isNull("fk_mc_move_device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdIsNotNull(){
        isNotNull("fk_mc_move_device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdIn(Collection<Long> value){
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
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdIn(Long... values){
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
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdNotIn(Collection<Long> value){
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
    public McMoveJobsQueryEntityWrapper fkMcMoveDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_move_device_id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getExportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamEq(){
        String exportRequestParam =entity().getExportRequestParam();
        if(exportRequestParam!=null){
            eq("export_request_param",exportRequestParam);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getExportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamNe(){
        String exportRequestParam =entity().getExportRequestParam();
        if(exportRequestParam!=null){
            ne("export_request_param",entity().getExportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getExportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamGt(){
        String exportRequestParam =entity().getExportRequestParam();
        if(exportRequestParam!=null){
            gt("export_request_param",entity().getExportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getExportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamGe(){
        String exportRequestParam =entity().getExportRequestParam();
        if(exportRequestParam!=null){
            ge("export_request_param",entity().getExportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getExportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamLt(){
        String exportRequestParam =entity().getExportRequestParam();
        if(exportRequestParam!=null){
            lt("export_request_param",entity().getExportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getExportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamLe(){
        String exportRequestParam =entity().getExportRequestParam();
        if(exportRequestParam!=null){
            le("export_request_param",entity().getExportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getExportRequestParam() AND exportRequestParamEnd
     * @param exportRequestParamEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamBetween(String exportRequestParamEnd){
        String exportRequestParam =entity().getExportRequestParam();
        if(exportRequestParam!=null && exportRequestParamEnd!=null){
            between("export_request_param",entity().getExportRequestParam(),exportRequestParamEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getExportRequestParam() AND 值2
     * @param exportRequestParamEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamNotBetween(String exportRequestParamEnd){
        String exportRequestParam =entity().getExportRequestParam();
        if(exportRequestParam!=null && exportRequestParamEnd!=null){
            notBetween("export_request_param",entity().getExportRequestParam(),exportRequestParamEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getExportRequestParam() AND 值2
     * @param exportRequestParamStart       值1
     * @param exportRequestParamEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamBetween(String exportRequestParamStart,String exportRequestParamEnd){
        String exportRequestParam =entity().getExportRequestParam();
        if(exportRequestParam!=null && exportRequestParamEnd!=null){
            between("export_request_param",exportRequestParamStart,exportRequestParamEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getExportRequestParam() AND 值2
     * @param exportRequestParamStart       值1
     * @param exportRequestParamEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamNotBetween(String exportRequestParamStart,String exportRequestParamEnd){
        String exportRequestParam =entity().getExportRequestParam();
        if(exportRequestParam!=null && exportRequestParamEnd!=null){
            notBetween("export_request_param",exportRequestParamStart,exportRequestParamEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getExportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamLike(){
        String exportRequestParam =entity().getExportRequestParam();
        if(exportRequestParam!=null){
            like("export_request_param",entity().getExportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getExportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamNotLike(){
        String exportRequestParam =entity().getExportRequestParam();
        if(exportRequestParam!=null){
            notLike("export_request_param",entity().getExportRequestParam());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getExportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamLikeLeft(){
        String exportRequestParam =entity().getExportRequestParam();
        if(exportRequestParam!=null){
            likeLeft("export_request_param",entity().getExportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getExportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamLikeRight(){
        String exportRequestParam =entity().getExportRequestParam();
        if(exportRequestParam!=null){
            likeRight("export_request_param",entity().getExportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamEq(String exportRequestParam){
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
    public McMoveJobsQueryEntityWrapper exportRequestParamNe(String exportRequestParam){
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
    public McMoveJobsQueryEntityWrapper exportRequestParamGt(String exportRequestParam){
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
    public McMoveJobsQueryEntityWrapper exportRequestParamGe(String exportRequestParam){
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
    public McMoveJobsQueryEntityWrapper exportRequestParamLt(String exportRequestParam){
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
    public McMoveJobsQueryEntityWrapper exportRequestParamLe(String exportRequestParam){
        if(exportRequestParam!=null){
            le("export_request_param",exportRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param exportRequestParam       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamLike(String exportRequestParam){
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
    public McMoveJobsQueryEntityWrapper exportRequestParamNotLike(String exportRequestParam){
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
    public McMoveJobsQueryEntityWrapper exportRequestParamLikeLeft(String exportRequestParam){
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
    public McMoveJobsQueryEntityWrapper exportRequestParamLikeRight(String exportRequestParam){
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
    public McMoveJobsQueryEntityWrapper exportRequestParamIsNull(){
        isNull("export_request_param");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamIsNotNull(){
        isNotNull("export_request_param");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportRequestParamIn(Collection<String> value){
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
    public McMoveJobsQueryEntityWrapper exportRequestParamIn(String... values){
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
    public McMoveJobsQueryEntityWrapper exportRequestParamNotIn(Collection<String> value){
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
    public McMoveJobsQueryEntityWrapper exportRequestParamNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("export_request_param",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getExportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdEq(){
        String exportJobId =entity().getExportJobId();
        if(exportJobId!=null){
            eq("export_job_id",exportJobId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getExportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdNe(){
        String exportJobId =entity().getExportJobId();
        if(exportJobId!=null){
            ne("export_job_id",entity().getExportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getExportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdGt(){
        String exportJobId =entity().getExportJobId();
        if(exportJobId!=null){
            gt("export_job_id",entity().getExportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getExportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdGe(){
        String exportJobId =entity().getExportJobId();
        if(exportJobId!=null){
            ge("export_job_id",entity().getExportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getExportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdLt(){
        String exportJobId =entity().getExportJobId();
        if(exportJobId!=null){
            lt("export_job_id",entity().getExportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getExportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdLe(){
        String exportJobId =entity().getExportJobId();
        if(exportJobId!=null){
            le("export_job_id",entity().getExportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getExportJobId() AND exportJobIdEnd
     * @param exportJobIdEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdBetween(String exportJobIdEnd){
        String exportJobId =entity().getExportJobId();
        if(exportJobId!=null && exportJobIdEnd!=null){
            between("export_job_id",entity().getExportJobId(),exportJobIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getExportJobId() AND 值2
     * @param exportJobIdEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdNotBetween(String exportJobIdEnd){
        String exportJobId =entity().getExportJobId();
        if(exportJobId!=null && exportJobIdEnd!=null){
            notBetween("export_job_id",entity().getExportJobId(),exportJobIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getExportJobId() AND 值2
     * @param exportJobIdStart       值1
     * @param exportJobIdEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdBetween(String exportJobIdStart,String exportJobIdEnd){
        String exportJobId =entity().getExportJobId();
        if(exportJobId!=null && exportJobIdEnd!=null){
            between("export_job_id",exportJobIdStart,exportJobIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getExportJobId() AND 值2
     * @param exportJobIdStart       值1
     * @param exportJobIdEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdNotBetween(String exportJobIdStart,String exportJobIdEnd){
        String exportJobId =entity().getExportJobId();
        if(exportJobId!=null && exportJobIdEnd!=null){
            notBetween("export_job_id",exportJobIdStart,exportJobIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getExportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdLike(){
        String exportJobId =entity().getExportJobId();
        if(exportJobId!=null){
            like("export_job_id",entity().getExportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getExportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdNotLike(){
        String exportJobId =entity().getExportJobId();
        if(exportJobId!=null){
            notLike("export_job_id",entity().getExportJobId());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getExportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdLikeLeft(){
        String exportJobId =entity().getExportJobId();
        if(exportJobId!=null){
            likeLeft("export_job_id",entity().getExportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getExportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdLikeRight(){
        String exportJobId =entity().getExportJobId();
        if(exportJobId!=null){
            likeRight("export_job_id",entity().getExportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdEq(String exportJobId){
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
    public McMoveJobsQueryEntityWrapper exportJobIdNe(String exportJobId){
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
    public McMoveJobsQueryEntityWrapper exportJobIdGt(String exportJobId){
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
    public McMoveJobsQueryEntityWrapper exportJobIdGe(String exportJobId){
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
    public McMoveJobsQueryEntityWrapper exportJobIdLt(String exportJobId){
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
    public McMoveJobsQueryEntityWrapper exportJobIdLe(String exportJobId){
        if(exportJobId!=null){
            le("export_job_id",exportJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param exportJobId       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdLike(String exportJobId){
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
    public McMoveJobsQueryEntityWrapper exportJobIdNotLike(String exportJobId){
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
    public McMoveJobsQueryEntityWrapper exportJobIdLikeLeft(String exportJobId){
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
    public McMoveJobsQueryEntityWrapper exportJobIdLikeRight(String exportJobId){
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
    public McMoveJobsQueryEntityWrapper exportJobIdIsNull(){
        isNull("export_job_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdIsNotNull(){
        isNotNull("export_job_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobIdIn(Collection<String> value){
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
    public McMoveJobsQueryEntityWrapper exportJobIdIn(String... values){
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
    public McMoveJobsQueryEntityWrapper exportJobIdNotIn(Collection<String> value){
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
    public McMoveJobsQueryEntityWrapper exportJobIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("export_job_id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getExportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultEq(){
        String exportJobResult =entity().getExportJobResult();
        if(exportJobResult!=null){
            eq("export_job_result",exportJobResult);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getExportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultNe(){
        String exportJobResult =entity().getExportJobResult();
        if(exportJobResult!=null){
            ne("export_job_result",entity().getExportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getExportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultGt(){
        String exportJobResult =entity().getExportJobResult();
        if(exportJobResult!=null){
            gt("export_job_result",entity().getExportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getExportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultGe(){
        String exportJobResult =entity().getExportJobResult();
        if(exportJobResult!=null){
            ge("export_job_result",entity().getExportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getExportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultLt(){
        String exportJobResult =entity().getExportJobResult();
        if(exportJobResult!=null){
            lt("export_job_result",entity().getExportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getExportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultLe(){
        String exportJobResult =entity().getExportJobResult();
        if(exportJobResult!=null){
            le("export_job_result",entity().getExportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getExportJobResult() AND exportJobResultEnd
     * @param exportJobResultEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultBetween(String exportJobResultEnd){
        String exportJobResult =entity().getExportJobResult();
        if(exportJobResult!=null && exportJobResultEnd!=null){
            between("export_job_result",entity().getExportJobResult(),exportJobResultEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getExportJobResult() AND 值2
     * @param exportJobResultEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultNotBetween(String exportJobResultEnd){
        String exportJobResult =entity().getExportJobResult();
        if(exportJobResult!=null && exportJobResultEnd!=null){
            notBetween("export_job_result",entity().getExportJobResult(),exportJobResultEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getExportJobResult() AND 值2
     * @param exportJobResultStart       值1
     * @param exportJobResultEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultBetween(String exportJobResultStart,String exportJobResultEnd){
        String exportJobResult =entity().getExportJobResult();
        if(exportJobResult!=null && exportJobResultEnd!=null){
            between("export_job_result",exportJobResultStart,exportJobResultEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getExportJobResult() AND 值2
     * @param exportJobResultStart       值1
     * @param exportJobResultEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultNotBetween(String exportJobResultStart,String exportJobResultEnd){
        String exportJobResult =entity().getExportJobResult();
        if(exportJobResult!=null && exportJobResultEnd!=null){
            notBetween("export_job_result",exportJobResultStart,exportJobResultEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getExportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultLike(){
        String exportJobResult =entity().getExportJobResult();
        if(exportJobResult!=null){
            like("export_job_result",entity().getExportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getExportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultNotLike(){
        String exportJobResult =entity().getExportJobResult();
        if(exportJobResult!=null){
            notLike("export_job_result",entity().getExportJobResult());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getExportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultLikeLeft(){
        String exportJobResult =entity().getExportJobResult();
        if(exportJobResult!=null){
            likeLeft("export_job_result",entity().getExportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getExportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultLikeRight(){
        String exportJobResult =entity().getExportJobResult();
        if(exportJobResult!=null){
            likeRight("export_job_result",entity().getExportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultEq(String exportJobResult){
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
    public McMoveJobsQueryEntityWrapper exportJobResultNe(String exportJobResult){
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
    public McMoveJobsQueryEntityWrapper exportJobResultGt(String exportJobResult){
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
    public McMoveJobsQueryEntityWrapper exportJobResultGe(String exportJobResult){
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
    public McMoveJobsQueryEntityWrapper exportJobResultLt(String exportJobResult){
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
    public McMoveJobsQueryEntityWrapper exportJobResultLe(String exportJobResult){
        if(exportJobResult!=null){
            le("export_job_result",exportJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param exportJobResult       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultLike(String exportJobResult){
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
    public McMoveJobsQueryEntityWrapper exportJobResultNotLike(String exportJobResult){
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
    public McMoveJobsQueryEntityWrapper exportJobResultLikeLeft(String exportJobResult){
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
    public McMoveJobsQueryEntityWrapper exportJobResultLikeRight(String exportJobResult){
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
    public McMoveJobsQueryEntityWrapper exportJobResultIsNull(){
        isNull("export_job_result");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultIsNotNull(){
        isNotNull("export_job_result");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportJobResultIn(Collection<String> value){
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
    public McMoveJobsQueryEntityWrapper exportJobResultIn(String... values){
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
    public McMoveJobsQueryEntityWrapper exportJobResultNotIn(Collection<String> value){
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
    public McMoveJobsQueryEntityWrapper exportJobResultNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("export_job_result",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getExportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeEq(){
        Date exportStartTime =entity().getExportStartTime();
        if(exportStartTime!=null){
            eq("export_start_time",exportStartTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getExportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeNe(){
        Date exportStartTime =entity().getExportStartTime();
        if(exportStartTime!=null){
            ne("export_start_time",entity().getExportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getExportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeGt(){
        Date exportStartTime =entity().getExportStartTime();
        if(exportStartTime!=null){
            gt("export_start_time",entity().getExportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getExportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeGe(){
        Date exportStartTime =entity().getExportStartTime();
        if(exportStartTime!=null){
            ge("export_start_time",entity().getExportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getExportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeLt(){
        Date exportStartTime =entity().getExportStartTime();
        if(exportStartTime!=null){
            lt("export_start_time",entity().getExportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getExportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeLe(){
        Date exportStartTime =entity().getExportStartTime();
        if(exportStartTime!=null){
            le("export_start_time",entity().getExportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getExportStartTime() AND exportStartTimeEnd
     * @param exportStartTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeBetween(Date exportStartTimeEnd){
        Date exportStartTime =entity().getExportStartTime();
        if(exportStartTime!=null && exportStartTimeEnd!=null){
            between("export_start_time",entity().getExportStartTime(),exportStartTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getExportStartTime() AND 值2
     * @param exportStartTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeNotBetween(Date exportStartTimeEnd){
        Date exportStartTime =entity().getExportStartTime();
        if(exportStartTime!=null && exportStartTimeEnd!=null){
            notBetween("export_start_time",entity().getExportStartTime(),exportStartTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getExportStartTime() AND 值2
     * @param exportStartTimeStart       值1
     * @param exportStartTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeBetween(Date exportStartTimeStart,Date exportStartTimeEnd){
        Date exportStartTime =entity().getExportStartTime();
        if(exportStartTime!=null && exportStartTimeEnd!=null){
            between("export_start_time",exportStartTimeStart,exportStartTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getExportStartTime() AND 值2
     * @param exportStartTimeStart       值1
     * @param exportStartTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeNotBetween(Date exportStartTimeStart,Date exportStartTimeEnd){
        Date exportStartTime =entity().getExportStartTime();
        if(exportStartTime!=null && exportStartTimeEnd!=null){
            notBetween("export_start_time",exportStartTimeStart,exportStartTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getExportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeLike(){
        Date exportStartTime =entity().getExportStartTime();
        if(exportStartTime!=null){
            like("export_start_time",entity().getExportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getExportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeNotLike(){
        Date exportStartTime =entity().getExportStartTime();
        if(exportStartTime!=null){
            notLike("export_start_time",entity().getExportStartTime());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getExportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeLikeLeft(){
        Date exportStartTime =entity().getExportStartTime();
        if(exportStartTime!=null){
            likeLeft("export_start_time",entity().getExportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getExportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeLikeRight(){
        Date exportStartTime =entity().getExportStartTime();
        if(exportStartTime!=null){
            likeRight("export_start_time",entity().getExportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeEq(Date exportStartTime){
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
    public McMoveJobsQueryEntityWrapper exportStartTimeNe(Date exportStartTime){
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
    public McMoveJobsQueryEntityWrapper exportStartTimeGt(Date exportStartTime){
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
    public McMoveJobsQueryEntityWrapper exportStartTimeGe(Date exportStartTime){
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
    public McMoveJobsQueryEntityWrapper exportStartTimeLt(Date exportStartTime){
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
    public McMoveJobsQueryEntityWrapper exportStartTimeLe(Date exportStartTime){
        if(exportStartTime!=null){
            le("export_start_time",exportStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param exportStartTime       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeLike(Date exportStartTime){
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
    public McMoveJobsQueryEntityWrapper exportStartTimeNotLike(Date exportStartTime){
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
    public McMoveJobsQueryEntityWrapper exportStartTimeLikeLeft(Date exportStartTime){
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
    public McMoveJobsQueryEntityWrapper exportStartTimeLikeRight(Date exportStartTime){
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
    public McMoveJobsQueryEntityWrapper exportStartTimeIsNull(){
        isNull("export_start_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeIsNotNull(){
        isNotNull("export_start_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportStartTimeIn(Collection<Date> value){
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
    public McMoveJobsQueryEntityWrapper exportStartTimeIn(Date... values){
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
    public McMoveJobsQueryEntityWrapper exportStartTimeNotIn(Collection<Date> value){
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
    public McMoveJobsQueryEntityWrapper exportStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("export_start_time",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getExportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeEq(){
        Date exportEndTime =entity().getExportEndTime();
        if(exportEndTime!=null){
            eq("export_end_time",exportEndTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getExportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeNe(){
        Date exportEndTime =entity().getExportEndTime();
        if(exportEndTime!=null){
            ne("export_end_time",entity().getExportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getExportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeGt(){
        Date exportEndTime =entity().getExportEndTime();
        if(exportEndTime!=null){
            gt("export_end_time",entity().getExportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getExportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeGe(){
        Date exportEndTime =entity().getExportEndTime();
        if(exportEndTime!=null){
            ge("export_end_time",entity().getExportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getExportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeLt(){
        Date exportEndTime =entity().getExportEndTime();
        if(exportEndTime!=null){
            lt("export_end_time",entity().getExportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getExportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeLe(){
        Date exportEndTime =entity().getExportEndTime();
        if(exportEndTime!=null){
            le("export_end_time",entity().getExportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getExportEndTime() AND exportEndTimeEnd
     * @param exportEndTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeBetween(Date exportEndTimeEnd){
        Date exportEndTime =entity().getExportEndTime();
        if(exportEndTime!=null && exportEndTimeEnd!=null){
            between("export_end_time",entity().getExportEndTime(),exportEndTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getExportEndTime() AND 值2
     * @param exportEndTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeNotBetween(Date exportEndTimeEnd){
        Date exportEndTime =entity().getExportEndTime();
        if(exportEndTime!=null && exportEndTimeEnd!=null){
            notBetween("export_end_time",entity().getExportEndTime(),exportEndTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getExportEndTime() AND 值2
     * @param exportEndTimeStart       值1
     * @param exportEndTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeBetween(Date exportEndTimeStart,Date exportEndTimeEnd){
        Date exportEndTime =entity().getExportEndTime();
        if(exportEndTime!=null && exportEndTimeEnd!=null){
            between("export_end_time",exportEndTimeStart,exportEndTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getExportEndTime() AND 值2
     * @param exportEndTimeStart       值1
     * @param exportEndTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeNotBetween(Date exportEndTimeStart,Date exportEndTimeEnd){
        Date exportEndTime =entity().getExportEndTime();
        if(exportEndTime!=null && exportEndTimeEnd!=null){
            notBetween("export_end_time",exportEndTimeStart,exportEndTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getExportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeLike(){
        Date exportEndTime =entity().getExportEndTime();
        if(exportEndTime!=null){
            like("export_end_time",entity().getExportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getExportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeNotLike(){
        Date exportEndTime =entity().getExportEndTime();
        if(exportEndTime!=null){
            notLike("export_end_time",entity().getExportEndTime());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getExportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeLikeLeft(){
        Date exportEndTime =entity().getExportEndTime();
        if(exportEndTime!=null){
            likeLeft("export_end_time",entity().getExportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getExportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeLikeRight(){
        Date exportEndTime =entity().getExportEndTime();
        if(exportEndTime!=null){
            likeRight("export_end_time",entity().getExportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeEq(Date exportEndTime){
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
    public McMoveJobsQueryEntityWrapper exportEndTimeNe(Date exportEndTime){
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
    public McMoveJobsQueryEntityWrapper exportEndTimeGt(Date exportEndTime){
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
    public McMoveJobsQueryEntityWrapper exportEndTimeGe(Date exportEndTime){
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
    public McMoveJobsQueryEntityWrapper exportEndTimeLt(Date exportEndTime){
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
    public McMoveJobsQueryEntityWrapper exportEndTimeLe(Date exportEndTime){
        if(exportEndTime!=null){
            le("export_end_time",exportEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param exportEndTime       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeLike(Date exportEndTime){
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
    public McMoveJobsQueryEntityWrapper exportEndTimeNotLike(Date exportEndTime){
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
    public McMoveJobsQueryEntityWrapper exportEndTimeLikeLeft(Date exportEndTime){
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
    public McMoveJobsQueryEntityWrapper exportEndTimeLikeRight(Date exportEndTime){
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
    public McMoveJobsQueryEntityWrapper exportEndTimeIsNull(){
        isNull("export_end_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeIsNotNull(){
        isNotNull("export_end_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryEntityWrapper exportEndTimeIn(Collection<Date> value){
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
    public McMoveJobsQueryEntityWrapper exportEndTimeIn(Date... values){
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
    public McMoveJobsQueryEntityWrapper exportEndTimeNotIn(Collection<Date> value){
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
    public McMoveJobsQueryEntityWrapper exportEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("export_end_time",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getImportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamEq(){
        String importRequestParam =entity().getImportRequestParam();
        if(importRequestParam!=null){
            eq("import_request_param",importRequestParam);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getImportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamNe(){
        String importRequestParam =entity().getImportRequestParam();
        if(importRequestParam!=null){
            ne("import_request_param",entity().getImportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getImportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamGt(){
        String importRequestParam =entity().getImportRequestParam();
        if(importRequestParam!=null){
            gt("import_request_param",entity().getImportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getImportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamGe(){
        String importRequestParam =entity().getImportRequestParam();
        if(importRequestParam!=null){
            ge("import_request_param",entity().getImportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getImportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamLt(){
        String importRequestParam =entity().getImportRequestParam();
        if(importRequestParam!=null){
            lt("import_request_param",entity().getImportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getImportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamLe(){
        String importRequestParam =entity().getImportRequestParam();
        if(importRequestParam!=null){
            le("import_request_param",entity().getImportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getImportRequestParam() AND importRequestParamEnd
     * @param importRequestParamEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamBetween(String importRequestParamEnd){
        String importRequestParam =entity().getImportRequestParam();
        if(importRequestParam!=null && importRequestParamEnd!=null){
            between("import_request_param",entity().getImportRequestParam(),importRequestParamEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getImportRequestParam() AND 值2
     * @param importRequestParamEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamNotBetween(String importRequestParamEnd){
        String importRequestParam =entity().getImportRequestParam();
        if(importRequestParam!=null && importRequestParamEnd!=null){
            notBetween("import_request_param",entity().getImportRequestParam(),importRequestParamEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getImportRequestParam() AND 值2
     * @param importRequestParamStart       值1
     * @param importRequestParamEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamBetween(String importRequestParamStart,String importRequestParamEnd){
        String importRequestParam =entity().getImportRequestParam();
        if(importRequestParam!=null && importRequestParamEnd!=null){
            between("import_request_param",importRequestParamStart,importRequestParamEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getImportRequestParam() AND 值2
     * @param importRequestParamStart       值1
     * @param importRequestParamEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamNotBetween(String importRequestParamStart,String importRequestParamEnd){
        String importRequestParam =entity().getImportRequestParam();
        if(importRequestParam!=null && importRequestParamEnd!=null){
            notBetween("import_request_param",importRequestParamStart,importRequestParamEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getImportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamLike(){
        String importRequestParam =entity().getImportRequestParam();
        if(importRequestParam!=null){
            like("import_request_param",entity().getImportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getImportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamNotLike(){
        String importRequestParam =entity().getImportRequestParam();
        if(importRequestParam!=null){
            notLike("import_request_param",entity().getImportRequestParam());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getImportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamLikeLeft(){
        String importRequestParam =entity().getImportRequestParam();
        if(importRequestParam!=null){
            likeLeft("import_request_param",entity().getImportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getImportRequestParam()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamLikeRight(){
        String importRequestParam =entity().getImportRequestParam();
        if(importRequestParam!=null){
            likeRight("import_request_param",entity().getImportRequestParam());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamEq(String importRequestParam){
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
    public McMoveJobsQueryEntityWrapper importRequestParamNe(String importRequestParam){
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
    public McMoveJobsQueryEntityWrapper importRequestParamGt(String importRequestParam){
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
    public McMoveJobsQueryEntityWrapper importRequestParamGe(String importRequestParam){
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
    public McMoveJobsQueryEntityWrapper importRequestParamLt(String importRequestParam){
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
    public McMoveJobsQueryEntityWrapper importRequestParamLe(String importRequestParam){
        if(importRequestParam!=null){
            le("import_request_param",importRequestParam);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param importRequestParam       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamLike(String importRequestParam){
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
    public McMoveJobsQueryEntityWrapper importRequestParamNotLike(String importRequestParam){
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
    public McMoveJobsQueryEntityWrapper importRequestParamLikeLeft(String importRequestParam){
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
    public McMoveJobsQueryEntityWrapper importRequestParamLikeRight(String importRequestParam){
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
    public McMoveJobsQueryEntityWrapper importRequestParamIsNull(){
        isNull("import_request_param");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamIsNotNull(){
        isNotNull("import_request_param");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importRequestParamIn(Collection<String> value){
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
    public McMoveJobsQueryEntityWrapper importRequestParamIn(String... values){
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
    public McMoveJobsQueryEntityWrapper importRequestParamNotIn(Collection<String> value){
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
    public McMoveJobsQueryEntityWrapper importRequestParamNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("import_request_param",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getImportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdEq(){
        String importJobId =entity().getImportJobId();
        if(importJobId!=null){
            eq("import_job_id",importJobId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getImportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdNe(){
        String importJobId =entity().getImportJobId();
        if(importJobId!=null){
            ne("import_job_id",entity().getImportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getImportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdGt(){
        String importJobId =entity().getImportJobId();
        if(importJobId!=null){
            gt("import_job_id",entity().getImportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getImportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdGe(){
        String importJobId =entity().getImportJobId();
        if(importJobId!=null){
            ge("import_job_id",entity().getImportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getImportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdLt(){
        String importJobId =entity().getImportJobId();
        if(importJobId!=null){
            lt("import_job_id",entity().getImportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getImportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdLe(){
        String importJobId =entity().getImportJobId();
        if(importJobId!=null){
            le("import_job_id",entity().getImportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getImportJobId() AND importJobIdEnd
     * @param importJobIdEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdBetween(String importJobIdEnd){
        String importJobId =entity().getImportJobId();
        if(importJobId!=null && importJobIdEnd!=null){
            between("import_job_id",entity().getImportJobId(),importJobIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getImportJobId() AND 值2
     * @param importJobIdEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdNotBetween(String importJobIdEnd){
        String importJobId =entity().getImportJobId();
        if(importJobId!=null && importJobIdEnd!=null){
            notBetween("import_job_id",entity().getImportJobId(),importJobIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getImportJobId() AND 值2
     * @param importJobIdStart       值1
     * @param importJobIdEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdBetween(String importJobIdStart,String importJobIdEnd){
        String importJobId =entity().getImportJobId();
        if(importJobId!=null && importJobIdEnd!=null){
            between("import_job_id",importJobIdStart,importJobIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getImportJobId() AND 值2
     * @param importJobIdStart       值1
     * @param importJobIdEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdNotBetween(String importJobIdStart,String importJobIdEnd){
        String importJobId =entity().getImportJobId();
        if(importJobId!=null && importJobIdEnd!=null){
            notBetween("import_job_id",importJobIdStart,importJobIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getImportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdLike(){
        String importJobId =entity().getImportJobId();
        if(importJobId!=null){
            like("import_job_id",entity().getImportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getImportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdNotLike(){
        String importJobId =entity().getImportJobId();
        if(importJobId!=null){
            notLike("import_job_id",entity().getImportJobId());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getImportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdLikeLeft(){
        String importJobId =entity().getImportJobId();
        if(importJobId!=null){
            likeLeft("import_job_id",entity().getImportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getImportJobId()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdLikeRight(){
        String importJobId =entity().getImportJobId();
        if(importJobId!=null){
            likeRight("import_job_id",entity().getImportJobId());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdEq(String importJobId){
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
    public McMoveJobsQueryEntityWrapper importJobIdNe(String importJobId){
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
    public McMoveJobsQueryEntityWrapper importJobIdGt(String importJobId){
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
    public McMoveJobsQueryEntityWrapper importJobIdGe(String importJobId){
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
    public McMoveJobsQueryEntityWrapper importJobIdLt(String importJobId){
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
    public McMoveJobsQueryEntityWrapper importJobIdLe(String importJobId){
        if(importJobId!=null){
            le("import_job_id",importJobId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param importJobId       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdLike(String importJobId){
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
    public McMoveJobsQueryEntityWrapper importJobIdNotLike(String importJobId){
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
    public McMoveJobsQueryEntityWrapper importJobIdLikeLeft(String importJobId){
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
    public McMoveJobsQueryEntityWrapper importJobIdLikeRight(String importJobId){
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
    public McMoveJobsQueryEntityWrapper importJobIdIsNull(){
        isNull("import_job_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdIsNotNull(){
        isNotNull("import_job_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobIdIn(Collection<String> value){
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
    public McMoveJobsQueryEntityWrapper importJobIdIn(String... values){
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
    public McMoveJobsQueryEntityWrapper importJobIdNotIn(Collection<String> value){
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
    public McMoveJobsQueryEntityWrapper importJobIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("import_job_id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getImportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultEq(){
        String importJobResult =entity().getImportJobResult();
        if(importJobResult!=null){
            eq("import_job_result",importJobResult);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getImportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultNe(){
        String importJobResult =entity().getImportJobResult();
        if(importJobResult!=null){
            ne("import_job_result",entity().getImportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getImportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultGt(){
        String importJobResult =entity().getImportJobResult();
        if(importJobResult!=null){
            gt("import_job_result",entity().getImportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getImportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultGe(){
        String importJobResult =entity().getImportJobResult();
        if(importJobResult!=null){
            ge("import_job_result",entity().getImportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getImportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultLt(){
        String importJobResult =entity().getImportJobResult();
        if(importJobResult!=null){
            lt("import_job_result",entity().getImportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getImportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultLe(){
        String importJobResult =entity().getImportJobResult();
        if(importJobResult!=null){
            le("import_job_result",entity().getImportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getImportJobResult() AND importJobResultEnd
     * @param importJobResultEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultBetween(String importJobResultEnd){
        String importJobResult =entity().getImportJobResult();
        if(importJobResult!=null && importJobResultEnd!=null){
            between("import_job_result",entity().getImportJobResult(),importJobResultEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getImportJobResult() AND 值2
     * @param importJobResultEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultNotBetween(String importJobResultEnd){
        String importJobResult =entity().getImportJobResult();
        if(importJobResult!=null && importJobResultEnd!=null){
            notBetween("import_job_result",entity().getImportJobResult(),importJobResultEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getImportJobResult() AND 值2
     * @param importJobResultStart       值1
     * @param importJobResultEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultBetween(String importJobResultStart,String importJobResultEnd){
        String importJobResult =entity().getImportJobResult();
        if(importJobResult!=null && importJobResultEnd!=null){
            between("import_job_result",importJobResultStart,importJobResultEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getImportJobResult() AND 值2
     * @param importJobResultStart       值1
     * @param importJobResultEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultNotBetween(String importJobResultStart,String importJobResultEnd){
        String importJobResult =entity().getImportJobResult();
        if(importJobResult!=null && importJobResultEnd!=null){
            notBetween("import_job_result",importJobResultStart,importJobResultEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getImportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultLike(){
        String importJobResult =entity().getImportJobResult();
        if(importJobResult!=null){
            like("import_job_result",entity().getImportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getImportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultNotLike(){
        String importJobResult =entity().getImportJobResult();
        if(importJobResult!=null){
            notLike("import_job_result",entity().getImportJobResult());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getImportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultLikeLeft(){
        String importJobResult =entity().getImportJobResult();
        if(importJobResult!=null){
            likeLeft("import_job_result",entity().getImportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getImportJobResult()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultLikeRight(){
        String importJobResult =entity().getImportJobResult();
        if(importJobResult!=null){
            likeRight("import_job_result",entity().getImportJobResult());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultEq(String importJobResult){
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
    public McMoveJobsQueryEntityWrapper importJobResultNe(String importJobResult){
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
    public McMoveJobsQueryEntityWrapper importJobResultGt(String importJobResult){
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
    public McMoveJobsQueryEntityWrapper importJobResultGe(String importJobResult){
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
    public McMoveJobsQueryEntityWrapper importJobResultLt(String importJobResult){
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
    public McMoveJobsQueryEntityWrapper importJobResultLe(String importJobResult){
        if(importJobResult!=null){
            le("import_job_result",importJobResult);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param importJobResult       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultLike(String importJobResult){
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
    public McMoveJobsQueryEntityWrapper importJobResultNotLike(String importJobResult){
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
    public McMoveJobsQueryEntityWrapper importJobResultLikeLeft(String importJobResult){
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
    public McMoveJobsQueryEntityWrapper importJobResultLikeRight(String importJobResult){
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
    public McMoveJobsQueryEntityWrapper importJobResultIsNull(){
        isNull("import_job_result");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultIsNotNull(){
        isNotNull("import_job_result");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importJobResultIn(Collection<String> value){
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
    public McMoveJobsQueryEntityWrapper importJobResultIn(String... values){
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
    public McMoveJobsQueryEntityWrapper importJobResultNotIn(Collection<String> value){
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
    public McMoveJobsQueryEntityWrapper importJobResultNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("import_job_result",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getImportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeEq(){
        Date importStartTime =entity().getImportStartTime();
        if(importStartTime!=null){
            eq("import_start_time",importStartTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getImportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeNe(){
        Date importStartTime =entity().getImportStartTime();
        if(importStartTime!=null){
            ne("import_start_time",entity().getImportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getImportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeGt(){
        Date importStartTime =entity().getImportStartTime();
        if(importStartTime!=null){
            gt("import_start_time",entity().getImportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getImportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeGe(){
        Date importStartTime =entity().getImportStartTime();
        if(importStartTime!=null){
            ge("import_start_time",entity().getImportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getImportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeLt(){
        Date importStartTime =entity().getImportStartTime();
        if(importStartTime!=null){
            lt("import_start_time",entity().getImportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getImportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeLe(){
        Date importStartTime =entity().getImportStartTime();
        if(importStartTime!=null){
            le("import_start_time",entity().getImportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getImportStartTime() AND importStartTimeEnd
     * @param importStartTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeBetween(Date importStartTimeEnd){
        Date importStartTime =entity().getImportStartTime();
        if(importStartTime!=null && importStartTimeEnd!=null){
            between("import_start_time",entity().getImportStartTime(),importStartTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getImportStartTime() AND 值2
     * @param importStartTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeNotBetween(Date importStartTimeEnd){
        Date importStartTime =entity().getImportStartTime();
        if(importStartTime!=null && importStartTimeEnd!=null){
            notBetween("import_start_time",entity().getImportStartTime(),importStartTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getImportStartTime() AND 值2
     * @param importStartTimeStart       值1
     * @param importStartTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeBetween(Date importStartTimeStart,Date importStartTimeEnd){
        Date importStartTime =entity().getImportStartTime();
        if(importStartTime!=null && importStartTimeEnd!=null){
            between("import_start_time",importStartTimeStart,importStartTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getImportStartTime() AND 值2
     * @param importStartTimeStart       值1
     * @param importStartTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeNotBetween(Date importStartTimeStart,Date importStartTimeEnd){
        Date importStartTime =entity().getImportStartTime();
        if(importStartTime!=null && importStartTimeEnd!=null){
            notBetween("import_start_time",importStartTimeStart,importStartTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getImportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeLike(){
        Date importStartTime =entity().getImportStartTime();
        if(importStartTime!=null){
            like("import_start_time",entity().getImportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getImportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeNotLike(){
        Date importStartTime =entity().getImportStartTime();
        if(importStartTime!=null){
            notLike("import_start_time",entity().getImportStartTime());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getImportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeLikeLeft(){
        Date importStartTime =entity().getImportStartTime();
        if(importStartTime!=null){
            likeLeft("import_start_time",entity().getImportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getImportStartTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeLikeRight(){
        Date importStartTime =entity().getImportStartTime();
        if(importStartTime!=null){
            likeRight("import_start_time",entity().getImportStartTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeEq(Date importStartTime){
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
    public McMoveJobsQueryEntityWrapper importStartTimeNe(Date importStartTime){
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
    public McMoveJobsQueryEntityWrapper importStartTimeGt(Date importStartTime){
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
    public McMoveJobsQueryEntityWrapper importStartTimeGe(Date importStartTime){
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
    public McMoveJobsQueryEntityWrapper importStartTimeLt(Date importStartTime){
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
    public McMoveJobsQueryEntityWrapper importStartTimeLe(Date importStartTime){
        if(importStartTime!=null){
            le("import_start_time",importStartTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param importStartTime       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeLike(Date importStartTime){
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
    public McMoveJobsQueryEntityWrapper importStartTimeNotLike(Date importStartTime){
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
    public McMoveJobsQueryEntityWrapper importStartTimeLikeLeft(Date importStartTime){
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
    public McMoveJobsQueryEntityWrapper importStartTimeLikeRight(Date importStartTime){
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
    public McMoveJobsQueryEntityWrapper importStartTimeIsNull(){
        isNull("import_start_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeIsNotNull(){
        isNotNull("import_start_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importStartTimeIn(Collection<Date> value){
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
    public McMoveJobsQueryEntityWrapper importStartTimeIn(Date... values){
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
    public McMoveJobsQueryEntityWrapper importStartTimeNotIn(Collection<Date> value){
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
    public McMoveJobsQueryEntityWrapper importStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("import_start_time",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getImportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeEq(){
        Date importEndTime =entity().getImportEndTime();
        if(importEndTime!=null){
            eq("import_end_time",importEndTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getImportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeNe(){
        Date importEndTime =entity().getImportEndTime();
        if(importEndTime!=null){
            ne("import_end_time",entity().getImportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getImportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeGt(){
        Date importEndTime =entity().getImportEndTime();
        if(importEndTime!=null){
            gt("import_end_time",entity().getImportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getImportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeGe(){
        Date importEndTime =entity().getImportEndTime();
        if(importEndTime!=null){
            ge("import_end_time",entity().getImportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getImportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeLt(){
        Date importEndTime =entity().getImportEndTime();
        if(importEndTime!=null){
            lt("import_end_time",entity().getImportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getImportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeLe(){
        Date importEndTime =entity().getImportEndTime();
        if(importEndTime!=null){
            le("import_end_time",entity().getImportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getImportEndTime() AND importEndTimeEnd
     * @param importEndTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeBetween(Date importEndTimeEnd){
        Date importEndTime =entity().getImportEndTime();
        if(importEndTime!=null && importEndTimeEnd!=null){
            between("import_end_time",entity().getImportEndTime(),importEndTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getImportEndTime() AND 值2
     * @param importEndTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeNotBetween(Date importEndTimeEnd){
        Date importEndTime =entity().getImportEndTime();
        if(importEndTime!=null && importEndTimeEnd!=null){
            notBetween("import_end_time",entity().getImportEndTime(),importEndTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getImportEndTime() AND 值2
     * @param importEndTimeStart       值1
     * @param importEndTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeBetween(Date importEndTimeStart,Date importEndTimeEnd){
        Date importEndTime =entity().getImportEndTime();
        if(importEndTime!=null && importEndTimeEnd!=null){
            between("import_end_time",importEndTimeStart,importEndTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getImportEndTime() AND 值2
     * @param importEndTimeStart       值1
     * @param importEndTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeNotBetween(Date importEndTimeStart,Date importEndTimeEnd){
        Date importEndTime =entity().getImportEndTime();
        if(importEndTime!=null && importEndTimeEnd!=null){
            notBetween("import_end_time",importEndTimeStart,importEndTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getImportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeLike(){
        Date importEndTime =entity().getImportEndTime();
        if(importEndTime!=null){
            like("import_end_time",entity().getImportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getImportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeNotLike(){
        Date importEndTime =entity().getImportEndTime();
        if(importEndTime!=null){
            notLike("import_end_time",entity().getImportEndTime());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getImportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeLikeLeft(){
        Date importEndTime =entity().getImportEndTime();
        if(importEndTime!=null){
            likeLeft("import_end_time",entity().getImportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getImportEndTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeLikeRight(){
        Date importEndTime =entity().getImportEndTime();
        if(importEndTime!=null){
            likeRight("import_end_time",entity().getImportEndTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeEq(Date importEndTime){
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
    public McMoveJobsQueryEntityWrapper importEndTimeNe(Date importEndTime){
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
    public McMoveJobsQueryEntityWrapper importEndTimeGt(Date importEndTime){
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
    public McMoveJobsQueryEntityWrapper importEndTimeGe(Date importEndTime){
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
    public McMoveJobsQueryEntityWrapper importEndTimeLt(Date importEndTime){
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
    public McMoveJobsQueryEntityWrapper importEndTimeLe(Date importEndTime){
        if(importEndTime!=null){
            le("import_end_time",importEndTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param importEndTime       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeLike(Date importEndTime){
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
    public McMoveJobsQueryEntityWrapper importEndTimeNotLike(Date importEndTime){
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
    public McMoveJobsQueryEntityWrapper importEndTimeLikeLeft(Date importEndTime){
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
    public McMoveJobsQueryEntityWrapper importEndTimeLikeRight(Date importEndTime){
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
    public McMoveJobsQueryEntityWrapper importEndTimeIsNull(){
        isNull("import_end_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeIsNotNull(){
        isNotNull("import_end_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryEntityWrapper importEndTimeIn(Collection<Date> value){
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
    public McMoveJobsQueryEntityWrapper importEndTimeIn(Date... values){
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
    public McMoveJobsQueryEntityWrapper importEndTimeNotIn(Collection<Date> value){
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
    public McMoveJobsQueryEntityWrapper importEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("import_end_time",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeEq(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getCreateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",entity().getCreateTime(),createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",entity().getCreateTime(),createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",entity().getCreateTime());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeEq(Date createTime){
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
    public McMoveJobsQueryEntityWrapper createTimeNe(Date createTime){
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
    public McMoveJobsQueryEntityWrapper createTimeGt(Date createTime){
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
    public McMoveJobsQueryEntityWrapper createTimeGe(Date createTime){
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
    public McMoveJobsQueryEntityWrapper createTimeLt(Date createTime){
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
    public McMoveJobsQueryEntityWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeLike(Date createTime){
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
    public McMoveJobsQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public McMoveJobsQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public McMoveJobsQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public McMoveJobsQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public McMoveJobsQueryEntityWrapper createTimeIn(Date... values){
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
    public McMoveJobsQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public McMoveJobsQueryEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeEq(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getLastUpdateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McMoveJobsQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McMoveJobsQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McMoveJobsQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McMoveJobsQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McMoveJobsQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McMoveJobsQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McMoveJobsQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McMoveJobsQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McMoveJobsQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveJobsQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McMoveJobsQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public McMoveJobsQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McMoveJobsQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }



}
