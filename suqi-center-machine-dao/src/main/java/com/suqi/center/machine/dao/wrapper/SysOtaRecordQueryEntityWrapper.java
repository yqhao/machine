package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.entity.SysOtaRecord;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 
 * </p>
 * "sys_ota_record"
 * @author PC001
 */
public class SysOtaRecordQueryEntityWrapper extends QueryWrapper<SysOtaRecord> {

    public static SysOtaRecordQueryEntityWrapper wrapper(SysOtaRecord entity) {
        return new SysOtaRecordQueryEntityWrapper(entity);
    }

    private SysOtaRecord entity;

    public SysOtaRecordQueryEntityWrapper(SysOtaRecord entity) {
         this.entity=entity;
    }


    protected SysOtaRecord entity() {
        if(entity==null){
            throw new NullPointerException("SysOtaRecord is null");
        }
        return entity;
    }

    @Override
    public SysOtaRecordQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public SysOtaRecordQueryEntityWrapper selectColumns(Consumer<SysOtaRecordSelect> consumer) {
        SysOtaRecordSelect select = new SysOtaRecordSelect();
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
    public SysOtaRecordQueryEntityWrapper idEq(){
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
    public SysOtaRecordQueryEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
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
    public SysOtaRecordQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public SysOtaRecordQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public SysOtaRecordQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper idEq(Long id){
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
    public SysOtaRecordQueryEntityWrapper idNe(Long id){
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
    public SysOtaRecordQueryEntityWrapper idGt(Long id){
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
    public SysOtaRecordQueryEntityWrapper idGe(Long id){
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
    public SysOtaRecordQueryEntityWrapper idLt(Long id){
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
    public SysOtaRecordQueryEntityWrapper idLe(Long id){
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
    public SysOtaRecordQueryEntityWrapper idLike(Long id){
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
    public SysOtaRecordQueryEntityWrapper idNotLike(Long id){
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
    public SysOtaRecordQueryEntityWrapper idLikeLeft(Long id){
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
    public SysOtaRecordQueryEntityWrapper idLikeRight(Long id){
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
    public SysOtaRecordQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper idIn(Collection<Long> value){
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
    public SysOtaRecordQueryEntityWrapper idIn(Long... values){
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
    public SysOtaRecordQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public SysOtaRecordQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getFkSysOtaId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdEq(){
        Long fkSysOtaId =entity().getFkSysOtaId();
        if(fkSysOtaId!=null){
            eq("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getFkSysOtaId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdNe(){
        Long fkSysOtaId =entity().getFkSysOtaId();
        if(fkSysOtaId!=null){
            ne("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getFkSysOtaId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdGt(){
        Long fkSysOtaId =entity().getFkSysOtaId();
        if(fkSysOtaId!=null){
            gt("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getFkSysOtaId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdGe(){
        Long fkSysOtaId =entity().getFkSysOtaId();
        if(fkSysOtaId!=null){
            ge("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getFkSysOtaId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdLt(){
        Long fkSysOtaId =entity().getFkSysOtaId();
        if(fkSysOtaId!=null){
            lt("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getFkSysOtaId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdLe(){
        Long fkSysOtaId =entity().getFkSysOtaId();
        if(fkSysOtaId!=null){
            le("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkSysOtaId() AND fkSysOtaIdEnd
     * @param fkSysOtaIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdBetween(Long fkSysOtaIdEnd){
        Long fkSysOtaId =entity().getFkSysOtaId();
        if(fkSysOtaId!=null && fkSysOtaIdEnd!=null){
            between("fk_sys_ota_id",fkSysOtaId,fkSysOtaIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkSysOtaId() AND 值2
     * @param fkSysOtaIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdNotBetween(Long fkSysOtaIdEnd){
        Long fkSysOtaId =entity().getFkSysOtaId();
        if(fkSysOtaId!=null && fkSysOtaIdEnd!=null){
            notBetween("fk_sys_ota_id",fkSysOtaId,fkSysOtaIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkSysOtaId() AND 值2
     * @param fkSysOtaIdStart       值1
     * @param fkSysOtaIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdBetween(Long fkSysOtaIdStart,Long fkSysOtaIdEnd){
        Long fkSysOtaId =entity().getFkSysOtaId();
        if(fkSysOtaId!=null && fkSysOtaIdEnd!=null){
            between("fk_sys_ota_id",fkSysOtaIdStart,fkSysOtaIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkSysOtaId() AND 值2
     * @param fkSysOtaIdStart       值1
     * @param fkSysOtaIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdNotBetween(Long fkSysOtaIdStart,Long fkSysOtaIdEnd){
        Long fkSysOtaId =entity().getFkSysOtaId();
        if(fkSysOtaId!=null && fkSysOtaIdEnd!=null){
            notBetween("fk_sys_ota_id",fkSysOtaIdStart,fkSysOtaIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getFkSysOtaId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdLike(){
        Long fkSysOtaId =entity().getFkSysOtaId();
        if(fkSysOtaId!=null){
            like("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getFkSysOtaId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdNotLike(){
        Long fkSysOtaId =entity().getFkSysOtaId();
        if(fkSysOtaId!=null){
            notLike("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getFkSysOtaId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdLikeLeft(){
        Long fkSysOtaId =entity().getFkSysOtaId();
        if(fkSysOtaId!=null){
            likeLeft("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getFkSysOtaId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdLikeRight(){
        Long fkSysOtaId =entity().getFkSysOtaId();
        if(fkSysOtaId!=null){
            likeRight("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdEq(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            eq("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdNe(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            ne("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdGt(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            gt("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdGe(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            ge("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdLt(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            lt("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdLe(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            le("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdLike(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            like("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdNotLike(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            notLike("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdLikeLeft(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            likeLeft("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkSysOtaId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdLikeRight(Long fkSysOtaId){
        if(fkSysOtaId!=null){
            likeRight("fk_sys_ota_id",fkSysOtaId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdIsNull(){
        isNull("fk_sys_ota_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdIsNotNull(){
        isNotNull("fk_sys_ota_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_sys_ota_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_sys_ota_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_sys_ota_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_sys_ota_id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getFkSysOtaObsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdEq(){
        Long fkSysOtaObsId =entity().getFkSysOtaObsId();
        if(fkSysOtaObsId!=null){
            eq("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getFkSysOtaObsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdNe(){
        Long fkSysOtaObsId =entity().getFkSysOtaObsId();
        if(fkSysOtaObsId!=null){
            ne("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getFkSysOtaObsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdGt(){
        Long fkSysOtaObsId =entity().getFkSysOtaObsId();
        if(fkSysOtaObsId!=null){
            gt("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getFkSysOtaObsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdGe(){
        Long fkSysOtaObsId =entity().getFkSysOtaObsId();
        if(fkSysOtaObsId!=null){
            ge("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getFkSysOtaObsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdLt(){
        Long fkSysOtaObsId =entity().getFkSysOtaObsId();
        if(fkSysOtaObsId!=null){
            lt("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getFkSysOtaObsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdLe(){
        Long fkSysOtaObsId =entity().getFkSysOtaObsId();
        if(fkSysOtaObsId!=null){
            le("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkSysOtaObsId() AND fkSysOtaObsIdEnd
     * @param fkSysOtaObsIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdBetween(Long fkSysOtaObsIdEnd){
        Long fkSysOtaObsId =entity().getFkSysOtaObsId();
        if(fkSysOtaObsId!=null && fkSysOtaObsIdEnd!=null){
            between("fk_sys_ota_obs_id",fkSysOtaObsId,fkSysOtaObsIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkSysOtaObsId() AND 值2
     * @param fkSysOtaObsIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdNotBetween(Long fkSysOtaObsIdEnd){
        Long fkSysOtaObsId =entity().getFkSysOtaObsId();
        if(fkSysOtaObsId!=null && fkSysOtaObsIdEnd!=null){
            notBetween("fk_sys_ota_obs_id",fkSysOtaObsId,fkSysOtaObsIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkSysOtaObsId() AND 值2
     * @param fkSysOtaObsIdStart       值1
     * @param fkSysOtaObsIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdBetween(Long fkSysOtaObsIdStart,Long fkSysOtaObsIdEnd){
        Long fkSysOtaObsId =entity().getFkSysOtaObsId();
        if(fkSysOtaObsId!=null && fkSysOtaObsIdEnd!=null){
            between("fk_sys_ota_obs_id",fkSysOtaObsIdStart,fkSysOtaObsIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkSysOtaObsId() AND 值2
     * @param fkSysOtaObsIdStart       值1
     * @param fkSysOtaObsIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdNotBetween(Long fkSysOtaObsIdStart,Long fkSysOtaObsIdEnd){
        Long fkSysOtaObsId =entity().getFkSysOtaObsId();
        if(fkSysOtaObsId!=null && fkSysOtaObsIdEnd!=null){
            notBetween("fk_sys_ota_obs_id",fkSysOtaObsIdStart,fkSysOtaObsIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getFkSysOtaObsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdLike(){
        Long fkSysOtaObsId =entity().getFkSysOtaObsId();
        if(fkSysOtaObsId!=null){
            like("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getFkSysOtaObsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdNotLike(){
        Long fkSysOtaObsId =entity().getFkSysOtaObsId();
        if(fkSysOtaObsId!=null){
            notLike("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getFkSysOtaObsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdLikeLeft(){
        Long fkSysOtaObsId =entity().getFkSysOtaObsId();
        if(fkSysOtaObsId!=null){
            likeLeft("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getFkSysOtaObsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdLikeRight(){
        Long fkSysOtaObsId =entity().getFkSysOtaObsId();
        if(fkSysOtaObsId!=null){
            likeRight("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdEq(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            eq("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdNe(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            ne("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdGt(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            gt("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdGe(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            ge("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdLt(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            lt("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdLe(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            le("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdLike(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            like("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdNotLike(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            notLike("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdLikeLeft(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            likeLeft("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkSysOtaObsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdLikeRight(Long fkSysOtaObsId){
        if(fkSysOtaObsId!=null){
            likeRight("fk_sys_ota_obs_id",fkSysOtaObsId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdIsNull(){
        isNull("fk_sys_ota_obs_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdIsNotNull(){
        isNotNull("fk_sys_ota_obs_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_sys_ota_obs_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_sys_ota_obs_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_sys_ota_obs_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaObsIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_sys_ota_obs_id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getFkEmSocDevicesId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdEq(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            eq("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getFkEmSocDevicesId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdNe(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            ne("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getFkEmSocDevicesId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdGt(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            gt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getFkEmSocDevicesId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdGe(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            ge("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getFkEmSocDevicesId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdLt(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            lt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getFkEmSocDevicesId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdLe(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            le("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkEmSocDevicesId() AND fkEmSocDevicesIdEnd
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdEnd){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null && fkEmSocDevicesIdEnd!=null){
            between("fk_em_soc_devices_id",fkEmSocDevicesId,fkEmSocDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkEmSocDevicesId() AND 值2
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdEnd){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null && fkEmSocDevicesIdEnd!=null){
            notBetween("fk_em_soc_devices_id",fkEmSocDevicesId,fkEmSocDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkEmSocDevicesId() AND 值2
     * @param fkEmSocDevicesIdStart       值1
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null && fkEmSocDevicesIdEnd!=null){
            between("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkEmSocDevicesId() AND 值2
     * @param fkEmSocDevicesIdStart       值1
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null && fkEmSocDevicesIdEnd!=null){
            notBetween("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getFkEmSocDevicesId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdLike(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            like("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getFkEmSocDevicesId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdNotLike(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            notLike("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getFkEmSocDevicesId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdLikeLeft(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            likeLeft("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getFkEmSocDevicesId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdLikeRight(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            likeRight("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdEq(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            eq("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdNe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            ne("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdGt(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            gt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdGe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            ge("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdLt(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            lt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdLe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            le("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdLike(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            like("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdNotLike(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            notLike("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdLikeLeft(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            likeLeft("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdLikeRight(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            likeRight("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdIsNull(){
        isNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdIsNotNull(){
        isNotNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_em_soc_devices_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_em_soc_devices_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_em_soc_devices_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkEmSocDevicesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_em_soc_devices_id",values);
        }
        return this;
    }


    /**
     * <p>1：系统调用，2：商户调用</p>
     * 等于 = entity().getType()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeEq(){
        Integer type =entity().getType();
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 不等于 &lt;&gt; entity().getType()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeNe(){
        Integer type =entity().getType();
        if(type!=null){
            ne("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 大于 &gt; entity().getType()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeGt(){
        Integer type =entity().getType();
        if(type!=null){
            gt("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 大于等于 &gt;= entity().getType()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeGe(){
        Integer type =entity().getType();
        if(type!=null){
            ge("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 小于 &lt; entity().getType()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeLt(){
        Integer type =entity().getType();
        if(type!=null){
            lt("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 小于等于 &lt;= entity().getType()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeLe(){
        Integer type =entity().getType();
        if(type!=null){
            le("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * BETWEEN  entity().getType() AND typeEnd
     * @param typeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeBetween(Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            between("type",type,typeEnd);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * NOT BETWEEN  entity().getType() AND 值2
     * @param typeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeNotBetween(Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            notBetween("type",type,typeEnd);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * BETWEEN  entity().getType() AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeBetween(Integer typeStart,Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            between("type",typeStart,typeEnd);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * NOT BETWEEN  entity().getType() AND 值2
     * @param typeStart       值1
     * @param typeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeNotBetween(Integer typeStart,Integer typeEnd){
        Integer type =entity().getType();
        if(type!=null && typeEnd!=null){
            notBetween("type",typeStart,typeEnd);
        }
        return this;
     }


    /**
     * <p>1：系统调用，2：商户调用</p>
     * LIKE '%值%'  entity().getType()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeLike(){
        Integer type =entity().getType();
        if(type!=null){
            like("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * NOT LIKE '%值%'  entity().getType()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeNotLike(){
        Integer type =entity().getType();
        if(type!=null){
            notLike("type",type);
        }
        return this;
     }


    /**
     * <p>1：系统调用，2：商户调用</p>
     * LIKE '%值'  entity().getType()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeLikeLeft(){
        Integer type =entity().getType();
        if(type!=null){
            likeLeft("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * LIKE '值%'  entity().getType()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeLikeRight(){
        Integer type =entity().getType();
        if(type!=null){
            likeRight("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 等于 =
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeEq(Integer type){
        if(type!=null){
            eq("type",type);
        }
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 不等于 &lt;&gt;
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeNe(Integer type){
        if(type!=null){
            ne("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 大于 &gt;
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeGt(Integer type){
        if(type!=null){
            gt("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 大于等于 &gt;=
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeGe(Integer type){
        if(type!=null){
            ge("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 小于 &lt;
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeLt(Integer type){
        if(type!=null){
            lt("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * 小于等于 &lt;=
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeLe(Integer type){
        if(type!=null){
            le("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * LIKE '%值%'
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeLike(Integer type){
        if(type!=null){
            like("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * NOT LIKE '%值%'
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeNotLike(Integer type){
        if(type!=null){
            notLike("type",type);
        }
        return this;
     }


    /**
     * <p>1：系统调用，2：商户调用</p>
     * LIKE '%值'
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeLikeLeft(Integer type){
        if(type!=null){
            likeLeft("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * LIKE '值%'
     * @param type       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeLikeRight(Integer type){
        if(type!=null){
            likeRight("type",type);
        }
        return this;
     }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeIsNull(){
        isNull("type");
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeIsNotNull(){
        isNotNull("type");
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("type",value);
        }
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeIn(Integer... values){
        if(values!=null && values.length>0){
            in("type",values);
        }
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("type",value);
        }
        return this;
    }

    /**
     * <p>1：系统调用，2：商户调用</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper typeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("type",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdEq(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDeviceId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdNe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDeviceId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdGt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDeviceId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdGe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDeviceId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdLt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDeviceId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDeviceId() AND deviceIdEnd
     * @param deviceIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceId,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdNotBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceId,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getDeviceId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getDeviceId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getDeviceId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getDeviceId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdLikeRight(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param deviceId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdLikeRight(String deviceId){
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("device_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }


    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>执行状态（0：等待开始执行命令，1：重置云机中，2：重置云机成功，3：重置云机失败，4：预置应用中，5：预置应用成功，6：预置应用失败，7：升级镜像中，8：升级镜像成功，9：升级镜像失败，10：推送obs中，11：推送obs成功，12：推送obs失败，13：推送obs命令文件中，14：推送obs命令文件成功，15：推送obs命令文件失败，16：推送chmod命令中，17：chmod命令执行成功，18：chmod执行失败，19：执行升级脚本中，20：执行升级脚本成功，21：执行升级脚本失败，22：华为reboot中，23：华为reboot成功，24：华为reboot失败，25：华为第二次reboot中，26：华为第二次reboot成功，27：华为第二次reboot失败，28：OTAreboot中，29：OTAreboot成功，30：OTAreboot失败，50：成功，-50：任务失败）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper createTimeEq(){
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
    public SysOtaRecordQueryEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTime,createTimeEnd);
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
    public SysOtaRecordQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public SysOtaRecordQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public SysOtaRecordQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper createTimeEq(Date createTime){
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
    public SysOtaRecordQueryEntityWrapper createTimeNe(Date createTime){
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
    public SysOtaRecordQueryEntityWrapper createTimeGt(Date createTime){
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
    public SysOtaRecordQueryEntityWrapper createTimeGe(Date createTime){
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
    public SysOtaRecordQueryEntityWrapper createTimeLt(Date createTime){
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
    public SysOtaRecordQueryEntityWrapper createTimeLe(Date createTime){
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
    public SysOtaRecordQueryEntityWrapper createTimeLike(Date createTime){
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
    public SysOtaRecordQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public SysOtaRecordQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public SysOtaRecordQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public SysOtaRecordQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public SysOtaRecordQueryEntityWrapper createTimeIn(Date... values){
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
    public SysOtaRecordQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public SysOtaRecordQueryEntityWrapper createTimeNotIn(Date... values){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeEq(){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public SysOtaRecordQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdEq(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getVersionId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdNe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVersionId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdGt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVersionId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdGe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVersionId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdLt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVersionId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVersionId() AND versionIdEnd
     * @param versionIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdNotBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getVersionId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getVersionId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdLikeRight(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param versionId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdLikeRight(Long versionId){
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("version_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("version_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("version_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getExecuteMsg()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgEq(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            eq("execute_msg",executeMsg);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getExecuteMsg()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgNe(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            ne("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getExecuteMsg()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgGt(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            gt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getExecuteMsg()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgGe(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            ge("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getExecuteMsg()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgLt(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            lt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getExecuteMsg()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgLe(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            le("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getExecuteMsg() AND executeMsgEnd
     * @param executeMsgEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgBetween(String executeMsgEnd){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null && executeMsgEnd!=null){
            between("execute_msg",executeMsg,executeMsgEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getExecuteMsg() AND 值2
     * @param executeMsgEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgNotBetween(String executeMsgEnd){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null && executeMsgEnd!=null){
            notBetween("execute_msg",executeMsg,executeMsgEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getExecuteMsg() AND 值2
     * @param executeMsgStart       值1
     * @param executeMsgEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgBetween(String executeMsgStart,String executeMsgEnd){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null && executeMsgEnd!=null){
            between("execute_msg",executeMsgStart,executeMsgEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getExecuteMsg() AND 值2
     * @param executeMsgStart       值1
     * @param executeMsgEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgNotBetween(String executeMsgStart,String executeMsgEnd){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null && executeMsgEnd!=null){
            notBetween("execute_msg",executeMsgStart,executeMsgEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getExecuteMsg()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgLike(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            like("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getExecuteMsg()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgNotLike(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            notLike("execute_msg",executeMsg);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getExecuteMsg()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgLikeLeft(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            likeLeft("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getExecuteMsg()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgLikeRight(){
        String executeMsg =entity().getExecuteMsg();
        if(executeMsg!=null){
            likeRight("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgEq(String executeMsg){
        if(executeMsg!=null){
            eq("execute_msg",executeMsg);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgNe(String executeMsg){
        if(executeMsg!=null){
            ne("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgGt(String executeMsg){
        if(executeMsg!=null){
            gt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgGe(String executeMsg){
        if(executeMsg!=null){
            ge("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgLt(String executeMsg){
        if(executeMsg!=null){
            lt("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgLe(String executeMsg){
        if(executeMsg!=null){
            le("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgLike(String executeMsg){
        if(executeMsg!=null){
            like("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgNotLike(String executeMsg){
        if(executeMsg!=null){
            notLike("execute_msg",executeMsg);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgLikeLeft(String executeMsg){
        if(executeMsg!=null){
            likeLeft("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param executeMsg       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgLikeRight(String executeMsg){
        if(executeMsg!=null){
            likeRight("execute_msg",executeMsg);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgIsNull(){
        isNull("execute_msg");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgIsNotNull(){
        isNotNull("execute_msg");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("execute_msg",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgIn(String... values){
        if(values!=null && values.length>0){
            in("execute_msg",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("execute_msg",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper executeMsgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("execute_msg",values);
        }
        return this;
    }


    /**
     * <p>任务开始时间</p>
     * 等于 = entity().getTaskStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeEq(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            eq("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * 不等于 &lt;&gt; entity().getTaskStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeNe(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            ne("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 大于 &gt; entity().getTaskStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeGt(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            gt("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 大于等于 &gt;= entity().getTaskStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeGe(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            ge("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 小于 &lt; entity().getTaskStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeLt(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            lt("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 小于等于 &lt;= entity().getTaskStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeLe(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            le("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * BETWEEN  entity().getTaskStartTime() AND taskStartTimeEnd
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeBetween(Date taskStartTimeEnd){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null && taskStartTimeEnd!=null){
            between("task_start_time",taskStartTime,taskStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * NOT BETWEEN  entity().getTaskStartTime() AND 值2
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeNotBetween(Date taskStartTimeEnd){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null && taskStartTimeEnd!=null){
            notBetween("task_start_time",taskStartTime,taskStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * BETWEEN  entity().getTaskStartTime() AND 值2
     * @param taskStartTimeStart       值1
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeBetween(Date taskStartTimeStart,Date taskStartTimeEnd){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null && taskStartTimeEnd!=null){
            between("task_start_time",taskStartTimeStart,taskStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * NOT BETWEEN  entity().getTaskStartTime() AND 值2
     * @param taskStartTimeStart       值1
     * @param taskStartTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeNotBetween(Date taskStartTimeStart,Date taskStartTimeEnd){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null && taskStartTimeEnd!=null){
            notBetween("task_start_time",taskStartTimeStart,taskStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>任务开始时间</p>
     * LIKE '%值%'  entity().getTaskStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeLike(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            like("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * NOT LIKE '%值%'  entity().getTaskStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeNotLike(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            notLike("task_start_time",taskStartTime);
        }
        return this;
     }


    /**
     * <p>任务开始时间</p>
     * LIKE '%值'  entity().getTaskStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeLikeLeft(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            likeLeft("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * LIKE '值%'  entity().getTaskStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeLikeRight(){
        Date taskStartTime =entity().getTaskStartTime();
        if(taskStartTime!=null){
            likeRight("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 等于 =
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeEq(Date taskStartTime){
        if(taskStartTime!=null){
            eq("task_start_time",taskStartTime);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * 不等于 &lt;&gt;
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeNe(Date taskStartTime){
        if(taskStartTime!=null){
            ne("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 大于 &gt;
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeGt(Date taskStartTime){
        if(taskStartTime!=null){
            gt("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 大于等于 &gt;=
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeGe(Date taskStartTime){
        if(taskStartTime!=null){
            ge("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 小于 &lt;
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeLt(Date taskStartTime){
        if(taskStartTime!=null){
            lt("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * 小于等于 &lt;=
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeLe(Date taskStartTime){
        if(taskStartTime!=null){
            le("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * LIKE '%值%'
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeLike(Date taskStartTime){
        if(taskStartTime!=null){
            like("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * NOT LIKE '%值%'
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeNotLike(Date taskStartTime){
        if(taskStartTime!=null){
            notLike("task_start_time",taskStartTime);
        }
        return this;
     }


    /**
     * <p>任务开始时间</p>
     * LIKE '%值'
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeLikeLeft(Date taskStartTime){
        if(taskStartTime!=null){
            likeLeft("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * LIKE '值%'
     * @param taskStartTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeLikeRight(Date taskStartTime){
        if(taskStartTime!=null){
            likeRight("task_start_time",taskStartTime);
        }
        return this;
     }

    /**
     * <p>任务开始时间</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeIsNull(){
        isNull("task_start_time");
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeIsNotNull(){
        isNotNull("task_start_time");
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("task_start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("task_start_time",values);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("task_start_time",value);
        }
        return this;
    }

    /**
     * <p>任务开始时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper taskStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("task_start_time",values);
        }
        return this;
    }


    /**
     * <p>最后job_id</p>
     * 等于 = entity().getJobId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdEq(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            eq("job_id",jobId);
        }
        return this;
    }

    /**
     * <p>最后job_id</p>
     * 不等于 &lt;&gt; entity().getJobId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdNe(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            ne("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 大于 &gt; entity().getJobId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdGt(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            gt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 大于等于 &gt;= entity().getJobId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdGe(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            ge("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 小于 &lt; entity().getJobId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdLt(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            lt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 小于等于 &lt;= entity().getJobId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdLe(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            le("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * BETWEEN  entity().getJobId() AND jobIdEnd
     * @param jobIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdBetween(String jobIdEnd){
        String jobId =entity().getJobId();
        if(jobId!=null && jobIdEnd!=null){
            between("job_id",jobId,jobIdEnd);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * NOT BETWEEN  entity().getJobId() AND 值2
     * @param jobIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdNotBetween(String jobIdEnd){
        String jobId =entity().getJobId();
        if(jobId!=null && jobIdEnd!=null){
            notBetween("job_id",jobId,jobIdEnd);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * BETWEEN  entity().getJobId() AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdBetween(String jobIdStart,String jobIdEnd){
        String jobId =entity().getJobId();
        if(jobId!=null && jobIdEnd!=null){
            between("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * NOT BETWEEN  entity().getJobId() AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdNotBetween(String jobIdStart,String jobIdEnd){
        String jobId =entity().getJobId();
        if(jobId!=null && jobIdEnd!=null){
            notBetween("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }


    /**
     * <p>最后job_id</p>
     * LIKE '%值%'  entity().getJobId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdLike(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            like("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * NOT LIKE '%值%'  entity().getJobId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdNotLike(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            notLike("job_id",jobId);
        }
        return this;
     }


    /**
     * <p>最后job_id</p>
     * LIKE '%值'  entity().getJobId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdLikeLeft(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            likeLeft("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * LIKE '值%'  entity().getJobId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdLikeRight(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            likeRight("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 等于 =
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdEq(String jobId){
        if(jobId!=null){
            eq("job_id",jobId);
        }
        return this;
    }

    /**
     * <p>最后job_id</p>
     * 不等于 &lt;&gt;
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdNe(String jobId){
        if(jobId!=null){
            ne("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 大于 &gt;
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdGt(String jobId){
        if(jobId!=null){
            gt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 大于等于 &gt;=
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdGe(String jobId){
        if(jobId!=null){
            ge("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 小于 &lt;
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdLt(String jobId){
        if(jobId!=null){
            lt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * 小于等于 &lt;=
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdLe(String jobId){
        if(jobId!=null){
            le("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * LIKE '%值%'
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdLike(String jobId){
        if(jobId!=null){
            like("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * NOT LIKE '%值%'
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdNotLike(String jobId){
        if(jobId!=null){
            notLike("job_id",jobId);
        }
        return this;
     }


    /**
     * <p>最后job_id</p>
     * LIKE '%值'
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdLikeLeft(String jobId){
        if(jobId!=null){
            likeLeft("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * LIKE '值%'
     * @param jobId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdLikeRight(String jobId){
        if(jobId!=null){
            likeRight("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后job_id</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdIsNull(){
        isNull("job_id");
        return this;
    }

    /**
     * <p>最后job_id</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdIsNotNull(){
        isNotNull("job_id");
        return this;
    }

    /**
     * <p>最后job_id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("job_id",value);
        }
        return this;
    }

    /**
     * <p>最后job_id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdIn(String... values){
        if(values!=null && values.length>0){
            in("job_id",values);
        }
        return this;
    }

    /**
     * <p>最后job_id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("job_id",value);
        }
        return this;
    }

    /**
     * <p>最后job_id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper jobIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("job_id",values);
        }
        return this;
    }


    /**
     * <p>ota更新预置应用ID</p>
     * 等于 = entity().getFkSysOtaPreinstalledAppsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdEq(){
        Long fkSysOtaPreinstalledAppsId =entity().getFkSysOtaPreinstalledAppsId();
        if(fkSysOtaPreinstalledAppsId!=null){
            eq("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * 不等于 &lt;&gt; entity().getFkSysOtaPreinstalledAppsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdNe(){
        Long fkSysOtaPreinstalledAppsId =entity().getFkSysOtaPreinstalledAppsId();
        if(fkSysOtaPreinstalledAppsId!=null){
            ne("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 大于 &gt; entity().getFkSysOtaPreinstalledAppsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdGt(){
        Long fkSysOtaPreinstalledAppsId =entity().getFkSysOtaPreinstalledAppsId();
        if(fkSysOtaPreinstalledAppsId!=null){
            gt("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 大于等于 &gt;= entity().getFkSysOtaPreinstalledAppsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdGe(){
        Long fkSysOtaPreinstalledAppsId =entity().getFkSysOtaPreinstalledAppsId();
        if(fkSysOtaPreinstalledAppsId!=null){
            ge("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 小于 &lt; entity().getFkSysOtaPreinstalledAppsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdLt(){
        Long fkSysOtaPreinstalledAppsId =entity().getFkSysOtaPreinstalledAppsId();
        if(fkSysOtaPreinstalledAppsId!=null){
            lt("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 小于等于 &lt;= entity().getFkSysOtaPreinstalledAppsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdLe(){
        Long fkSysOtaPreinstalledAppsId =entity().getFkSysOtaPreinstalledAppsId();
        if(fkSysOtaPreinstalledAppsId!=null){
            le("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * BETWEEN  entity().getFkSysOtaPreinstalledAppsId() AND fkSysOtaPreinstalledAppsIdEnd
     * @param fkSysOtaPreinstalledAppsIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdBetween(Long fkSysOtaPreinstalledAppsIdEnd){
        Long fkSysOtaPreinstalledAppsId =entity().getFkSysOtaPreinstalledAppsId();
        if(fkSysOtaPreinstalledAppsId!=null && fkSysOtaPreinstalledAppsIdEnd!=null){
            between("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId,fkSysOtaPreinstalledAppsIdEnd);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * NOT BETWEEN  entity().getFkSysOtaPreinstalledAppsId() AND 值2
     * @param fkSysOtaPreinstalledAppsIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdNotBetween(Long fkSysOtaPreinstalledAppsIdEnd){
        Long fkSysOtaPreinstalledAppsId =entity().getFkSysOtaPreinstalledAppsId();
        if(fkSysOtaPreinstalledAppsId!=null && fkSysOtaPreinstalledAppsIdEnd!=null){
            notBetween("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId,fkSysOtaPreinstalledAppsIdEnd);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * BETWEEN  entity().getFkSysOtaPreinstalledAppsId() AND 值2
     * @param fkSysOtaPreinstalledAppsIdStart       值1
     * @param fkSysOtaPreinstalledAppsIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdBetween(Long fkSysOtaPreinstalledAppsIdStart,Long fkSysOtaPreinstalledAppsIdEnd){
        Long fkSysOtaPreinstalledAppsId =entity().getFkSysOtaPreinstalledAppsId();
        if(fkSysOtaPreinstalledAppsId!=null && fkSysOtaPreinstalledAppsIdEnd!=null){
            between("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsIdStart,fkSysOtaPreinstalledAppsIdEnd);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * NOT BETWEEN  entity().getFkSysOtaPreinstalledAppsId() AND 值2
     * @param fkSysOtaPreinstalledAppsIdStart       值1
     * @param fkSysOtaPreinstalledAppsIdEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdNotBetween(Long fkSysOtaPreinstalledAppsIdStart,Long fkSysOtaPreinstalledAppsIdEnd){
        Long fkSysOtaPreinstalledAppsId =entity().getFkSysOtaPreinstalledAppsId();
        if(fkSysOtaPreinstalledAppsId!=null && fkSysOtaPreinstalledAppsIdEnd!=null){
            notBetween("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsIdStart,fkSysOtaPreinstalledAppsIdEnd);
        }
        return this;
     }


    /**
     * <p>ota更新预置应用ID</p>
     * LIKE '%值%'  entity().getFkSysOtaPreinstalledAppsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdLike(){
        Long fkSysOtaPreinstalledAppsId =entity().getFkSysOtaPreinstalledAppsId();
        if(fkSysOtaPreinstalledAppsId!=null){
            like("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * NOT LIKE '%值%'  entity().getFkSysOtaPreinstalledAppsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdNotLike(){
        Long fkSysOtaPreinstalledAppsId =entity().getFkSysOtaPreinstalledAppsId();
        if(fkSysOtaPreinstalledAppsId!=null){
            notLike("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }


    /**
     * <p>ota更新预置应用ID</p>
     * LIKE '%值'  entity().getFkSysOtaPreinstalledAppsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdLikeLeft(){
        Long fkSysOtaPreinstalledAppsId =entity().getFkSysOtaPreinstalledAppsId();
        if(fkSysOtaPreinstalledAppsId!=null){
            likeLeft("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * LIKE '值%'  entity().getFkSysOtaPreinstalledAppsId()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdLikeRight(){
        Long fkSysOtaPreinstalledAppsId =entity().getFkSysOtaPreinstalledAppsId();
        if(fkSysOtaPreinstalledAppsId!=null){
            likeRight("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 等于 =
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdEq(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            eq("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * 不等于 &lt;&gt;
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdNe(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            ne("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 大于 &gt;
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdGt(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            gt("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 大于等于 &gt;=
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdGe(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            ge("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 小于 &lt;
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdLt(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            lt("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * 小于等于 &lt;=
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdLe(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            le("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * LIKE '%值%'
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdLike(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            like("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * NOT LIKE '%值%'
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdNotLike(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            notLike("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }


    /**
     * <p>ota更新预置应用ID</p>
     * LIKE '%值'
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdLikeLeft(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            likeLeft("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * LIKE '值%'
     * @param fkSysOtaPreinstalledAppsId       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdLikeRight(Long fkSysOtaPreinstalledAppsId){
        if(fkSysOtaPreinstalledAppsId!=null){
            likeRight("fk_sys_ota_preinstalled_apps_id",fkSysOtaPreinstalledAppsId);
        }
        return this;
     }

    /**
     * <p>ota更新预置应用ID</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdIsNull(){
        isNull("fk_sys_ota_preinstalled_apps_id");
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdIsNotNull(){
        isNotNull("fk_sys_ota_preinstalled_apps_id");
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_sys_ota_preinstalled_apps_id",value);
        }
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_sys_ota_preinstalled_apps_id",values);
        }
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_sys_ota_preinstalled_apps_id",value);
        }
        return this;
    }

    /**
     * <p>ota更新预置应用ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper fkSysOtaPreinstalledAppsIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_sys_ota_preinstalled_apps_id",values);
        }
        return this;
    }


    /**
     * <p>具体设备的开始执行时间</p>
     * 等于 = entity().getStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeEq(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            eq("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * 不等于 &lt;&gt; entity().getStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeNe(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            ne("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 大于 &gt; entity().getStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeGt(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            gt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 大于等于 &gt;= entity().getStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeGe(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            ge("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 小于 &lt; entity().getStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeLt(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            lt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 小于等于 &lt;= entity().getStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeLe(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            le("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * BETWEEN  entity().getStartTime() AND startTimeEnd
     * @param startTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeBetween(Date startTimeEnd){
        Date startTime =entity().getStartTime();
        if(startTime!=null && startTimeEnd!=null){
            between("start_time",startTime,startTimeEnd);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * NOT BETWEEN  entity().getStartTime() AND 值2
     * @param startTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeNotBetween(Date startTimeEnd){
        Date startTime =entity().getStartTime();
        if(startTime!=null && startTimeEnd!=null){
            notBetween("start_time",startTime,startTimeEnd);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * BETWEEN  entity().getStartTime() AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeBetween(Date startTimeStart,Date startTimeEnd){
        Date startTime =entity().getStartTime();
        if(startTime!=null && startTimeEnd!=null){
            between("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * NOT BETWEEN  entity().getStartTime() AND 值2
     * @param startTimeStart       值1
     * @param startTimeEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeNotBetween(Date startTimeStart,Date startTimeEnd){
        Date startTime =entity().getStartTime();
        if(startTime!=null && startTimeEnd!=null){
            notBetween("start_time",startTimeStart,startTimeEnd);
        }
        return this;
     }


    /**
     * <p>具体设备的开始执行时间</p>
     * LIKE '%值%'  entity().getStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeLike(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            like("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * NOT LIKE '%值%'  entity().getStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeNotLike(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            notLike("start_time",startTime);
        }
        return this;
     }


    /**
     * <p>具体设备的开始执行时间</p>
     * LIKE '%值'  entity().getStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeLikeLeft(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            likeLeft("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * LIKE '值%'  entity().getStartTime()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeLikeRight(){
        Date startTime =entity().getStartTime();
        if(startTime!=null){
            likeRight("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 等于 =
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeEq(Date startTime){
        if(startTime!=null){
            eq("start_time",startTime);
        }
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * 不等于 &lt;&gt;
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeNe(Date startTime){
        if(startTime!=null){
            ne("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 大于 &gt;
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeGt(Date startTime){
        if(startTime!=null){
            gt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 大于等于 &gt;=
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeGe(Date startTime){
        if(startTime!=null){
            ge("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 小于 &lt;
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeLt(Date startTime){
        if(startTime!=null){
            lt("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * 小于等于 &lt;=
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeLe(Date startTime){
        if(startTime!=null){
            le("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * LIKE '%值%'
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeLike(Date startTime){
        if(startTime!=null){
            like("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * NOT LIKE '%值%'
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeNotLike(Date startTime){
        if(startTime!=null){
            notLike("start_time",startTime);
        }
        return this;
     }


    /**
     * <p>具体设备的开始执行时间</p>
     * LIKE '%值'
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeLikeLeft(Date startTime){
        if(startTime!=null){
            likeLeft("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * LIKE '值%'
     * @param startTime       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeLikeRight(Date startTime){
        if(startTime!=null){
            likeRight("start_time",startTime);
        }
        return this;
     }

    /**
     * <p>具体设备的开始执行时间</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeIsNull(){
        isNull("start_time");
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeIsNotNull(){
        isNotNull("start_time");
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("start_time",value);
        }
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("start_time",values);
        }
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("start_time",value);
        }
        return this;
    }

    /**
     * <p>具体设备的开始执行时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper startTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("start_time",values);
        }
        return this;
    }


    /**
     * <p>等待执行开始时间</p>
     * 等于 = entity().getWaitOverStartDate()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateEq(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            eq("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 不等于 &lt;&gt; entity().getWaitOverStartDate()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateNe(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            ne("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 大于 &gt; entity().getWaitOverStartDate()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateGt(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            gt("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 大于等于 &gt;= entity().getWaitOverStartDate()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateGe(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            ge("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 小于 &lt; entity().getWaitOverStartDate()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateLt(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            lt("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 小于等于 &lt;= entity().getWaitOverStartDate()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateLe(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            le("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * BETWEEN  entity().getWaitOverStartDate() AND waitOverStartDateEnd
     * @param waitOverStartDateEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateBetween(Date waitOverStartDateEnd){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null && waitOverStartDateEnd!=null){
            between("wait_over_start_date",waitOverStartDate,waitOverStartDateEnd);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * NOT BETWEEN  entity().getWaitOverStartDate() AND 值2
     * @param waitOverStartDateEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateNotBetween(Date waitOverStartDateEnd){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null && waitOverStartDateEnd!=null){
            notBetween("wait_over_start_date",waitOverStartDate,waitOverStartDateEnd);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * BETWEEN  entity().getWaitOverStartDate() AND 值2
     * @param waitOverStartDateStart       值1
     * @param waitOverStartDateEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateBetween(Date waitOverStartDateStart,Date waitOverStartDateEnd){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null && waitOverStartDateEnd!=null){
            between("wait_over_start_date",waitOverStartDateStart,waitOverStartDateEnd);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * NOT BETWEEN  entity().getWaitOverStartDate() AND 值2
     * @param waitOverStartDateStart       值1
     * @param waitOverStartDateEnd      值2
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateNotBetween(Date waitOverStartDateStart,Date waitOverStartDateEnd){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null && waitOverStartDateEnd!=null){
            notBetween("wait_over_start_date",waitOverStartDateStart,waitOverStartDateEnd);
        }
        return this;
     }


    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值%'  entity().getWaitOverStartDate()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateLike(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            like("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * NOT LIKE '%值%'  entity().getWaitOverStartDate()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateNotLike(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            notLike("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }


    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值'  entity().getWaitOverStartDate()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateLikeLeft(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            likeLeft("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * LIKE '值%'  entity().getWaitOverStartDate()
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateLikeRight(){
        Date waitOverStartDate =entity().getWaitOverStartDate();
        if(waitOverStartDate!=null){
            likeRight("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 等于 =
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateEq(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            eq("wait_over_start_date",waitOverStartDate);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * 不等于 &lt;&gt;
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateNe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            ne("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 大于 &gt;
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateGt(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            gt("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 大于等于 &gt;=
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateGe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            ge("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 小于 &lt;
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateLt(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            lt("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * 小于等于 &lt;=
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateLe(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            le("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值%'
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateLike(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            like("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * NOT LIKE '%值%'
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateNotLike(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            notLike("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }


    /**
     * <p>等待执行开始时间</p>
     * LIKE '%值'
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateLikeLeft(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            likeLeft("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * LIKE '值%'
     * @param waitOverStartDate       值
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateLikeRight(Date waitOverStartDate){
        if(waitOverStartDate!=null){
            likeRight("wait_over_start_date",waitOverStartDate);
        }
        return this;
     }

    /**
     * <p>等待执行开始时间</p>
     * IS NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateIsNull(){
        isNull("wait_over_start_date");
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateIsNotNull(){
        isNotNull("wait_over_start_date");
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("wait_over_start_date",value);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateIn(Date... values){
        if(values!=null && values.length>0){
            in("wait_over_start_date",values);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("wait_over_start_date",value);
        }
        return this;
    }

    /**
     * <p>等待执行开始时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public SysOtaRecordQueryEntityWrapper waitOverStartDateNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("wait_over_start_date",values);
        }
        return this;
    }



}
