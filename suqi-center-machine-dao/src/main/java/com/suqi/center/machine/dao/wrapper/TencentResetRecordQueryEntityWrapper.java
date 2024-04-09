package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.entity.TencentResetRecord;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 腾讯云机重置记录
 * </p>
 * "tencent_reset_record"
 * @author PC001
 */
public class TencentResetRecordQueryEntityWrapper extends QueryWrapper<TencentResetRecord> {

    public static TencentResetRecordQueryEntityWrapper wrapper(TencentResetRecord entity) {
        return new TencentResetRecordQueryEntityWrapper(entity);
    }

    private TencentResetRecord entity;

    public TencentResetRecordQueryEntityWrapper(TencentResetRecord entity) {
         this.entity=entity;
    }


    protected TencentResetRecord entity() {
        if(entity==null){
            throw new NullPointerException("TencentResetRecord is null");
        }
        return entity;
    }

    @Override
    public TencentResetRecordQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public TencentResetRecordQueryEntityWrapper selectColumns(Consumer<TencentResetRecordSelect> consumer) {
        TencentResetRecordSelect select = new TencentResetRecordSelect();
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
    public TencentResetRecordQueryEntityWrapper idEq(){
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
    public TencentResetRecordQueryEntityWrapper idNe(){
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
    public TencentResetRecordQueryEntityWrapper idGt(){
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
    public TencentResetRecordQueryEntityWrapper idGe(){
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
    public TencentResetRecordQueryEntityWrapper idLt(){
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
    public TencentResetRecordQueryEntityWrapper idLe(){
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
    public TencentResetRecordQueryEntityWrapper idBetween(Long idEnd){
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
    public TencentResetRecordQueryEntityWrapper idNotBetween(Long idEnd){
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
    public TencentResetRecordQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentResetRecordQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentResetRecordQueryEntityWrapper idLike(){
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
    public TencentResetRecordQueryEntityWrapper idNotLike(){
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
    public TencentResetRecordQueryEntityWrapper idLikeLeft(){
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
    public TencentResetRecordQueryEntityWrapper idLikeRight(){
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
    public TencentResetRecordQueryEntityWrapper idEq(Long id){
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
    public TencentResetRecordQueryEntityWrapper idNe(Long id){
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
    public TencentResetRecordQueryEntityWrapper idGt(Long id){
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
    public TencentResetRecordQueryEntityWrapper idGe(Long id){
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
    public TencentResetRecordQueryEntityWrapper idLt(Long id){
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
    public TencentResetRecordQueryEntityWrapper idLe(Long id){
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
    public TencentResetRecordQueryEntityWrapper idLike(Long id){
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
    public TencentResetRecordQueryEntityWrapper idNotLike(Long id){
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
    public TencentResetRecordQueryEntityWrapper idLikeLeft(Long id){
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
    public TencentResetRecordQueryEntityWrapper idLikeRight(Long id){
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
    public TencentResetRecordQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper idIn(Collection<Long> value){
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
    public TencentResetRecordQueryEntityWrapper idIn(Long... values){
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
    public TencentResetRecordQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public TencentResetRecordQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdEq(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            eq("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdNe(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            ne("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdGt(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            gt("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdGe(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            ge("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdLt(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            lt("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdLe(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            le("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkTencentDeviceId() AND fkTencentDeviceIdEnd
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdBetween(Long fkTencentDeviceIdEnd){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null && fkTencentDeviceIdEnd!=null){
            between("fk_tencent_device_id",fkTencentDeviceId,fkTencentDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkTencentDeviceId() AND 值2
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdNotBetween(Long fkTencentDeviceIdEnd){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null && fkTencentDeviceIdEnd!=null){
            notBetween("fk_tencent_device_id",fkTencentDeviceId,fkTencentDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkTencentDeviceId() AND 值2
     * @param fkTencentDeviceIdStart       值1
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null && fkTencentDeviceIdEnd!=null){
            between("fk_tencent_device_id",fkTencentDeviceIdStart,fkTencentDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkTencentDeviceId() AND 值2
     * @param fkTencentDeviceIdStart       值1
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdNotBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null && fkTencentDeviceIdEnd!=null){
            notBetween("fk_tencent_device_id",fkTencentDeviceIdStart,fkTencentDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdLike(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            like("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdNotLike(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            notLike("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdLikeLeft(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            likeLeft("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdLikeRight(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            likeRight("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdEq(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            eq("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdNe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            ne("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdGt(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            gt("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdGe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            ge("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdLt(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            lt("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdLe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            le("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdLike(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            like("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdNotLike(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            notLike("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdLikeLeft(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            likeLeft("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdLikeRight(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            likeRight("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdIsNull(){
        isNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdIsNotNull(){
        isNotNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_tencent_device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_tencent_device_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_tencent_device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_device_id",values);
        }
        return this;
    }


    /**
     * <p>腾讯云机id</p>
     * 等于 = entity().getInstanceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdEq(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * 不等于 &lt;&gt; entity().getInstanceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdNe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 大于 &gt; entity().getInstanceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdGt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 大于等于 &gt;= entity().getInstanceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdGe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 小于 &lt; entity().getInstanceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdLt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 小于等于 &lt;= entity().getInstanceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdLe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * BETWEEN  entity().getInstanceId() AND instanceIdEnd
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",instanceId,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdNotBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceId,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯云机id</p>
     * LIKE '%值%'  entity().getInstanceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * NOT LIKE '%值%'  entity().getInstanceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdNotLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>腾讯云机id</p>
     * LIKE '%值'  entity().getInstanceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdLikeLeft(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * LIKE '值%'  entity().getInstanceId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdLikeRight(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * 不等于 &lt;&gt;
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 大于 &gt;
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 大于等于 &gt;=
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 小于 &lt;
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 小于等于 &lt;=
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * NOT LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>腾讯云机id</p>
     * LIKE '%值'
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * LIKE '值%'
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdLikeRight(String instanceId){
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("instance_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getFkTencentImagesId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdEq(){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null){
            eq("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getFkTencentImagesId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdNe(){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null){
            ne("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getFkTencentImagesId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdGt(){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null){
            gt("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getFkTencentImagesId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdGe(){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null){
            ge("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getFkTencentImagesId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdLt(){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null){
            lt("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getFkTencentImagesId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdLe(){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null){
            le("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkTencentImagesId() AND fkTencentImagesIdEnd
     * @param fkTencentImagesIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdBetween(Long fkTencentImagesIdEnd){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null && fkTencentImagesIdEnd!=null){
            between("fk_tencent_images_id",fkTencentImagesId,fkTencentImagesIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkTencentImagesId() AND 值2
     * @param fkTencentImagesIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdNotBetween(Long fkTencentImagesIdEnd){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null && fkTencentImagesIdEnd!=null){
            notBetween("fk_tencent_images_id",fkTencentImagesId,fkTencentImagesIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkTencentImagesId() AND 值2
     * @param fkTencentImagesIdStart       值1
     * @param fkTencentImagesIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdBetween(Long fkTencentImagesIdStart,Long fkTencentImagesIdEnd){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null && fkTencentImagesIdEnd!=null){
            between("fk_tencent_images_id",fkTencentImagesIdStart,fkTencentImagesIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkTencentImagesId() AND 值2
     * @param fkTencentImagesIdStart       值1
     * @param fkTencentImagesIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdNotBetween(Long fkTencentImagesIdStart,Long fkTencentImagesIdEnd){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null && fkTencentImagesIdEnd!=null){
            notBetween("fk_tencent_images_id",fkTencentImagesIdStart,fkTencentImagesIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getFkTencentImagesId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdLike(){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null){
            like("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getFkTencentImagesId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdNotLike(){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null){
            notLike("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getFkTencentImagesId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdLikeLeft(){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null){
            likeLeft("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getFkTencentImagesId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdLikeRight(){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null){
            likeRight("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdEq(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            eq("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdNe(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            ne("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdGt(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            gt("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdGe(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            ge("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdLt(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            lt("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdLe(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            le("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdLike(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            like("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdNotLike(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            notLike("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdLikeLeft(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            likeLeft("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdLikeRight(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            likeRight("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdIsNull(){
        isNull("fk_tencent_images_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdIsNotNull(){
        isNotNull("fk_tencent_images_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_tencent_images_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_tencent_images_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_tencent_images_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper fkTencentImagesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_images_id",values);
        }
        return this;
    }


    /**
     * <p>镜像版本</p>
     * 等于 = entity().getVersionCode()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeEq(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            eq("version_code",versionCode);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * 不等于 &lt;&gt; entity().getVersionCode()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeNe(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            ne("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 大于 &gt; entity().getVersionCode()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeGt(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            gt("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 大于等于 &gt;= entity().getVersionCode()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeGe(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            ge("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 小于 &lt; entity().getVersionCode()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeLt(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            lt("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 小于等于 &lt;= entity().getVersionCode()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeLe(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            le("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * BETWEEN  entity().getVersionCode() AND versionCodeEnd
     * @param versionCodeEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeBetween(String versionCodeEnd){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null && versionCodeEnd!=null){
            between("version_code",versionCode,versionCodeEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * NOT BETWEEN  entity().getVersionCode() AND 值2
     * @param versionCodeEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeNotBetween(String versionCodeEnd){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null && versionCodeEnd!=null){
            notBetween("version_code",versionCode,versionCodeEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * BETWEEN  entity().getVersionCode() AND 值2
     * @param versionCodeStart       值1
     * @param versionCodeEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeBetween(String versionCodeStart,String versionCodeEnd){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null && versionCodeEnd!=null){
            between("version_code",versionCodeStart,versionCodeEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * NOT BETWEEN  entity().getVersionCode() AND 值2
     * @param versionCodeStart       值1
     * @param versionCodeEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeNotBetween(String versionCodeStart,String versionCodeEnd){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null && versionCodeEnd!=null){
            notBetween("version_code",versionCodeStart,versionCodeEnd);
        }
        return this;
     }


    /**
     * <p>镜像版本</p>
     * LIKE '%值%'  entity().getVersionCode()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeLike(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            like("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * NOT LIKE '%值%'  entity().getVersionCode()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeNotLike(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            notLike("version_code",versionCode);
        }
        return this;
     }


    /**
     * <p>镜像版本</p>
     * LIKE '%值'  entity().getVersionCode()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeLikeLeft(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            likeLeft("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * LIKE '值%'  entity().getVersionCode()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeLikeRight(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            likeRight("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 等于 =
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeEq(String versionCode){
        if(versionCode!=null){
            eq("version_code",versionCode);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * 不等于 &lt;&gt;
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeNe(String versionCode){
        if(versionCode!=null){
            ne("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 大于 &gt;
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeGt(String versionCode){
        if(versionCode!=null){
            gt("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 大于等于 &gt;=
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeGe(String versionCode){
        if(versionCode!=null){
            ge("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 小于 &lt;
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeLt(String versionCode){
        if(versionCode!=null){
            lt("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 小于等于 &lt;=
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeLe(String versionCode){
        if(versionCode!=null){
            le("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * LIKE '%值%'
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeLike(String versionCode){
        if(versionCode!=null){
            like("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * NOT LIKE '%值%'
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeNotLike(String versionCode){
        if(versionCode!=null){
            notLike("version_code",versionCode);
        }
        return this;
     }


    /**
     * <p>镜像版本</p>
     * LIKE '%值'
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeLikeLeft(String versionCode){
        if(versionCode!=null){
            likeLeft("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * LIKE '值%'
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeLikeRight(String versionCode){
        if(versionCode!=null){
            likeRight("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeIsNull(){
        isNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeIsNotNull(){
        isNotNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("version_code",value);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeIn(String... values){
        if(values!=null && values.length>0){
            in("version_code",values);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("version_code",value);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper versionCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("version_code",values);
        }
        return this;
    }


    /**
     * <p>镜像名称</p>
     * 等于 = entity().getTitle()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleEq(){
        String title =entity().getTitle();
        if(title!=null){
            eq("title",title);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * 不等于 &lt;&gt; entity().getTitle()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleNe(){
        String title =entity().getTitle();
        if(title!=null){
            ne("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 大于 &gt; entity().getTitle()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleGt(){
        String title =entity().getTitle();
        if(title!=null){
            gt("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 大于等于 &gt;= entity().getTitle()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleGe(){
        String title =entity().getTitle();
        if(title!=null){
            ge("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 小于 &lt; entity().getTitle()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleLt(){
        String title =entity().getTitle();
        if(title!=null){
            lt("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 小于等于 &lt;= entity().getTitle()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleLe(){
        String title =entity().getTitle();
        if(title!=null){
            le("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * BETWEEN  entity().getTitle() AND titleEnd
     * @param titleEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleBetween(String titleEnd){
        String title =entity().getTitle();
        if(title!=null && titleEnd!=null){
            between("title",title,titleEnd);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * NOT BETWEEN  entity().getTitle() AND 值2
     * @param titleEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleNotBetween(String titleEnd){
        String title =entity().getTitle();
        if(title!=null && titleEnd!=null){
            notBetween("title",title,titleEnd);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * BETWEEN  entity().getTitle() AND 值2
     * @param titleStart       值1
     * @param titleEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleBetween(String titleStart,String titleEnd){
        String title =entity().getTitle();
        if(title!=null && titleEnd!=null){
            between("title",titleStart,titleEnd);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * NOT BETWEEN  entity().getTitle() AND 值2
     * @param titleStart       值1
     * @param titleEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleNotBetween(String titleStart,String titleEnd){
        String title =entity().getTitle();
        if(title!=null && titleEnd!=null){
            notBetween("title",titleStart,titleEnd);
        }
        return this;
     }


    /**
     * <p>镜像名称</p>
     * LIKE '%值%'  entity().getTitle()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleLike(){
        String title =entity().getTitle();
        if(title!=null){
            like("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * NOT LIKE '%值%'  entity().getTitle()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleNotLike(){
        String title =entity().getTitle();
        if(title!=null){
            notLike("title",title);
        }
        return this;
     }


    /**
     * <p>镜像名称</p>
     * LIKE '%值'  entity().getTitle()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleLikeLeft(){
        String title =entity().getTitle();
        if(title!=null){
            likeLeft("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * LIKE '值%'  entity().getTitle()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleLikeRight(){
        String title =entity().getTitle();
        if(title!=null){
            likeRight("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 等于 =
     * @param title       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleEq(String title){
        if(title!=null){
            eq("title",title);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * 不等于 &lt;&gt;
     * @param title       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleNe(String title){
        if(title!=null){
            ne("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 大于 &gt;
     * @param title       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleGt(String title){
        if(title!=null){
            gt("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 大于等于 &gt;=
     * @param title       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleGe(String title){
        if(title!=null){
            ge("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 小于 &lt;
     * @param title       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleLt(String title){
        if(title!=null){
            lt("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 小于等于 &lt;=
     * @param title       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleLe(String title){
        if(title!=null){
            le("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * LIKE '%值%'
     * @param title       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleLike(String title){
        if(title!=null){
            like("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * NOT LIKE '%值%'
     * @param title       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleNotLike(String title){
        if(title!=null){
            notLike("title",title);
        }
        return this;
     }


    /**
     * <p>镜像名称</p>
     * LIKE '%值'
     * @param title       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleLikeLeft(String title){
        if(title!=null){
            likeLeft("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * LIKE '值%'
     * @param title       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleLikeRight(String title){
        if(title!=null){
            likeRight("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleIsNull(){
        isNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleIsNotNull(){
        isNotNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("title",value);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleIn(String... values){
        if(values!=null && values.length>0){
            in("title",values);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("title",value);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper titleNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("title",values);
        }
        return this;
    }


    /**
     * <p>重置前镜像版本id</p>
     * 等于 = entity().getOldImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdEq(){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null){
            eq("old_image_id",oldImageId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 不等于 &lt;&gt; entity().getOldImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdNe(){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null){
            ne("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 大于 &gt; entity().getOldImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdGt(){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null){
            gt("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 大于等于 &gt;= entity().getOldImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdGe(){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null){
            ge("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 小于 &lt; entity().getOldImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdLt(){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null){
            lt("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 小于等于 &lt;= entity().getOldImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdLe(){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null){
            le("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * BETWEEN  entity().getOldImageId() AND oldImageIdEnd
     * @param oldImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdBetween(String oldImageIdEnd){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null && oldImageIdEnd!=null){
            between("old_image_id",oldImageId,oldImageIdEnd);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT BETWEEN  entity().getOldImageId() AND 值2
     * @param oldImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdNotBetween(String oldImageIdEnd){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null && oldImageIdEnd!=null){
            notBetween("old_image_id",oldImageId,oldImageIdEnd);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * BETWEEN  entity().getOldImageId() AND 值2
     * @param oldImageIdStart       值1
     * @param oldImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdBetween(String oldImageIdStart,String oldImageIdEnd){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null && oldImageIdEnd!=null){
            between("old_image_id",oldImageIdStart,oldImageIdEnd);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT BETWEEN  entity().getOldImageId() AND 值2
     * @param oldImageIdStart       值1
     * @param oldImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdNotBetween(String oldImageIdStart,String oldImageIdEnd){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null && oldImageIdEnd!=null){
            notBetween("old_image_id",oldImageIdStart,oldImageIdEnd);
        }
        return this;
     }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值%'  entity().getOldImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdLike(){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null){
            like("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT LIKE '%值%'  entity().getOldImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdNotLike(){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null){
            notLike("old_image_id",oldImageId);
        }
        return this;
     }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值'  entity().getOldImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdLikeLeft(){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null){
            likeLeft("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * LIKE '值%'  entity().getOldImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdLikeRight(){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null){
            likeRight("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 等于 =
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdEq(String oldImageId){
        if(oldImageId!=null){
            eq("old_image_id",oldImageId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 不等于 &lt;&gt;
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdNe(String oldImageId){
        if(oldImageId!=null){
            ne("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 大于 &gt;
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdGt(String oldImageId){
        if(oldImageId!=null){
            gt("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 大于等于 &gt;=
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdGe(String oldImageId){
        if(oldImageId!=null){
            ge("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 小于 &lt;
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdLt(String oldImageId){
        if(oldImageId!=null){
            lt("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 小于等于 &lt;=
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdLe(String oldImageId){
        if(oldImageId!=null){
            le("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值%'
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdLike(String oldImageId){
        if(oldImageId!=null){
            like("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT LIKE '%值%'
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdNotLike(String oldImageId){
        if(oldImageId!=null){
            notLike("old_image_id",oldImageId);
        }
        return this;
     }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值'
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdLikeLeft(String oldImageId){
        if(oldImageId!=null){
            likeLeft("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * LIKE '值%'
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdLikeRight(String oldImageId){
        if(oldImageId!=null){
            likeRight("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdIsNull(){
        isNull("old_image_id");
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdIsNotNull(){
        isNotNull("old_image_id");
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("old_image_id",value);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdIn(String... values){
        if(values!=null && values.length>0){
            in("old_image_id",values);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("old_image_id",value);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper oldImageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("old_image_id",values);
        }
        return this;
    }


    /**
     * <p>当前重置镜像版本id</p>
     * 等于 = entity().getResetImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdEq(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            eq("reset_image_id",resetImageId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 不等于 &lt;&gt; entity().getResetImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdNe(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            ne("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于 &gt; entity().getResetImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdGt(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            gt("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于等于 &gt;= entity().getResetImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdGe(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            ge("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于 &lt; entity().getResetImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdLt(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            lt("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于等于 &lt;= entity().getResetImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdLe(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            le("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * BETWEEN  entity().getResetImageId() AND resetImageIdEnd
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdBetween(String resetImageIdEnd){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null && resetImageIdEnd!=null){
            between("reset_image_id",resetImageId,resetImageIdEnd);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT BETWEEN  entity().getResetImageId() AND 值2
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdNotBetween(String resetImageIdEnd){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null && resetImageIdEnd!=null){
            notBetween("reset_image_id",resetImageId,resetImageIdEnd);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * BETWEEN  entity().getResetImageId() AND 值2
     * @param resetImageIdStart       值1
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdBetween(String resetImageIdStart,String resetImageIdEnd){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null && resetImageIdEnd!=null){
            between("reset_image_id",resetImageIdStart,resetImageIdEnd);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT BETWEEN  entity().getResetImageId() AND 值2
     * @param resetImageIdStart       值1
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdNotBetween(String resetImageIdStart,String resetImageIdEnd){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null && resetImageIdEnd!=null){
            notBetween("reset_image_id",resetImageIdStart,resetImageIdEnd);
        }
        return this;
     }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值%'  entity().getResetImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdLike(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            like("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT LIKE '%值%'  entity().getResetImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdNotLike(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            notLike("reset_image_id",resetImageId);
        }
        return this;
     }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值'  entity().getResetImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdLikeLeft(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            likeLeft("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '值%'  entity().getResetImageId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdLikeRight(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            likeRight("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 等于 =
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdEq(String resetImageId){
        if(resetImageId!=null){
            eq("reset_image_id",resetImageId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 不等于 &lt;&gt;
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdNe(String resetImageId){
        if(resetImageId!=null){
            ne("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于 &gt;
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdGt(String resetImageId){
        if(resetImageId!=null){
            gt("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于等于 &gt;=
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdGe(String resetImageId){
        if(resetImageId!=null){
            ge("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于 &lt;
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdLt(String resetImageId){
        if(resetImageId!=null){
            lt("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于等于 &lt;=
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdLe(String resetImageId){
        if(resetImageId!=null){
            le("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值%'
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdLike(String resetImageId){
        if(resetImageId!=null){
            like("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT LIKE '%值%'
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdNotLike(String resetImageId){
        if(resetImageId!=null){
            notLike("reset_image_id",resetImageId);
        }
        return this;
     }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值'
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdLikeLeft(String resetImageId){
        if(resetImageId!=null){
            likeLeft("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '值%'
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdLikeRight(String resetImageId){
        if(resetImageId!=null){
            likeRight("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdIsNull(){
        isNull("reset_image_id");
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdIsNotNull(){
        isNotNull("reset_image_id");
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("reset_image_id",value);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdIn(String... values){
        if(values!=null && values.length>0){
            in("reset_image_id",values);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_image_id",value);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetImageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_image_id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getResetUserId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdEq(){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            eq("reset_user_id",resetUserId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getResetUserId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdNe(){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            ne("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getResetUserId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdGt(){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            gt("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getResetUserId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdGe(){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            ge("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getResetUserId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdLt(){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            lt("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getResetUserId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdLe(){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            le("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getResetUserId() AND resetUserIdEnd
     * @param resetUserIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdBetween(Long resetUserIdEnd){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null && resetUserIdEnd!=null){
            between("reset_user_id",resetUserId,resetUserIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getResetUserId() AND 值2
     * @param resetUserIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdNotBetween(Long resetUserIdEnd){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null && resetUserIdEnd!=null){
            notBetween("reset_user_id",resetUserId,resetUserIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getResetUserId() AND 值2
     * @param resetUserIdStart       值1
     * @param resetUserIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdBetween(Long resetUserIdStart,Long resetUserIdEnd){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null && resetUserIdEnd!=null){
            between("reset_user_id",resetUserIdStart,resetUserIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getResetUserId() AND 值2
     * @param resetUserIdStart       值1
     * @param resetUserIdEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdNotBetween(Long resetUserIdStart,Long resetUserIdEnd){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null && resetUserIdEnd!=null){
            notBetween("reset_user_id",resetUserIdStart,resetUserIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getResetUserId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdLike(){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            like("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getResetUserId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdNotLike(){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            notLike("reset_user_id",resetUserId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getResetUserId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdLikeLeft(){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            likeLeft("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getResetUserId()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdLikeRight(){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            likeRight("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdEq(Long resetUserId){
        if(resetUserId!=null){
            eq("reset_user_id",resetUserId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdNe(Long resetUserId){
        if(resetUserId!=null){
            ne("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdGt(Long resetUserId){
        if(resetUserId!=null){
            gt("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdGe(Long resetUserId){
        if(resetUserId!=null){
            ge("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdLt(Long resetUserId){
        if(resetUserId!=null){
            lt("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdLe(Long resetUserId){
        if(resetUserId!=null){
            le("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdLike(Long resetUserId){
        if(resetUserId!=null){
            like("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdNotLike(Long resetUserId){
        if(resetUserId!=null){
            notLike("reset_user_id",resetUserId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdLikeLeft(Long resetUserId){
        if(resetUserId!=null){
            likeLeft("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdLikeRight(Long resetUserId){
        if(resetUserId!=null){
            likeRight("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdIsNull(){
        isNull("reset_user_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdIsNotNull(){
        isNotNull("reset_user_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("reset_user_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdIn(Long... values){
        if(values!=null && values.length>0){
            in("reset_user_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_user_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper resetUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("reset_user_id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getResponse()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseEq(){
        String response =entity().getResponse();
        if(response!=null){
            eq("response",response);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getResponse()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseNe(){
        String response =entity().getResponse();
        if(response!=null){
            ne("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getResponse()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseGt(){
        String response =entity().getResponse();
        if(response!=null){
            gt("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getResponse()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseGe(){
        String response =entity().getResponse();
        if(response!=null){
            ge("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getResponse()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseLt(){
        String response =entity().getResponse();
        if(response!=null){
            lt("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getResponse()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseLe(){
        String response =entity().getResponse();
        if(response!=null){
            le("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getResponse() AND responseEnd
     * @param responseEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseBetween(String responseEnd){
        String response =entity().getResponse();
        if(response!=null && responseEnd!=null){
            between("response",response,responseEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getResponse() AND 值2
     * @param responseEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseNotBetween(String responseEnd){
        String response =entity().getResponse();
        if(response!=null && responseEnd!=null){
            notBetween("response",response,responseEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getResponse() AND 值2
     * @param responseStart       值1
     * @param responseEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseBetween(String responseStart,String responseEnd){
        String response =entity().getResponse();
        if(response!=null && responseEnd!=null){
            between("response",responseStart,responseEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getResponse() AND 值2
     * @param responseStart       值1
     * @param responseEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseNotBetween(String responseStart,String responseEnd){
        String response =entity().getResponse();
        if(response!=null && responseEnd!=null){
            notBetween("response",responseStart,responseEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getResponse()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseLike(){
        String response =entity().getResponse();
        if(response!=null){
            like("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getResponse()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseNotLike(){
        String response =entity().getResponse();
        if(response!=null){
            notLike("response",response);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getResponse()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseLikeLeft(){
        String response =entity().getResponse();
        if(response!=null){
            likeLeft("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getResponse()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseLikeRight(){
        String response =entity().getResponse();
        if(response!=null){
            likeRight("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseEq(String response){
        if(response!=null){
            eq("response",response);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseNe(String response){
        if(response!=null){
            ne("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseGt(String response){
        if(response!=null){
            gt("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseGe(String response){
        if(response!=null){
            ge("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseLt(String response){
        if(response!=null){
            lt("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseLe(String response){
        if(response!=null){
            le("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseLike(String response){
        if(response!=null){
            like("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseNotLike(String response){
        if(response!=null){
            notLike("response",response);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseLikeLeft(String response){
        if(response!=null){
            likeLeft("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param response       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseLikeRight(String response){
        if(response!=null){
            likeRight("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseIsNull(){
        isNull("response");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseIsNotNull(){
        isNotNull("response");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("response",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseIn(String... values){
        if(values!=null && values.length>0){
            in("response",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("response",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper responseNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("response",values);
        }
        return this;
    }


    /**
     * <p>重置时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeEq(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>重置时间</p>
     * 不等于 &lt;&gt; entity().getCreateTime()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>重置时间</p>
     * LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>重置时间</p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>重置时间</p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>重置时间</p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * IS NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>重置时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>重置时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p>重置时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p>重置时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p>重置时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentResetRecordQueryEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }



}
