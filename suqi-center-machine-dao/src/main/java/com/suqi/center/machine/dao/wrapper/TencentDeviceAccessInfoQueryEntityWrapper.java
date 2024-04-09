package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.entity.TencentDeviceAccessInfo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 腾讯设备公网映射表
 * </p>
 * "tencent_device_access_info"
 * @author PC001
 */
public class TencentDeviceAccessInfoQueryEntityWrapper extends QueryWrapper<TencentDeviceAccessInfo> {

    public static TencentDeviceAccessInfoQueryEntityWrapper wrapper(TencentDeviceAccessInfo entity) {
        return new TencentDeviceAccessInfoQueryEntityWrapper(entity);
    }

    private TencentDeviceAccessInfo entity;

    public TencentDeviceAccessInfoQueryEntityWrapper(TencentDeviceAccessInfo entity) {
         this.entity=entity;
    }


    protected TencentDeviceAccessInfo entity() {
        if(entity==null){
            throw new NullPointerException("TencentDeviceAccessInfo is null");
        }
        return entity;
    }

    @Override
    public TencentDeviceAccessInfoQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public TencentDeviceAccessInfoQueryEntityWrapper selectColumns(Consumer<TencentDeviceAccessInfoSelect> consumer) {
        TencentDeviceAccessInfoSelect select = new TencentDeviceAccessInfoSelect();
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
    public TencentDeviceAccessInfoQueryEntityWrapper idEq(){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idNe(){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idGt(){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idGe(){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idLt(){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idLe(){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idBetween(Long idEnd){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idNotBetween(Long idEnd){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idLike(){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idNotLike(){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idLikeLeft(){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idLikeRight(){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idEq(Long id){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idNe(Long id){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idGt(Long id){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idGe(Long id){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idLt(Long id){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idLe(Long id){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idLike(Long id){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idNotLike(Long id){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idLikeLeft(Long id){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idLikeRight(Long id){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper idIn(Collection<Long> value){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idIn(Long... values){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public TencentDeviceAccessInfoQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>腾讯设备Id</p>
     * 等于 = entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdEq(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            eq("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * 不等于 &lt;&gt; entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdNe(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            ne("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 大于 &gt; entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdGt(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            gt("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 大于等于 &gt;= entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdGe(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            ge("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 小于 &lt; entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdLt(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            lt("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 小于等于 &lt;= entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdLe(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            le("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * BETWEEN  entity().getFkTencentDeviceId() AND fkTencentDeviceIdEnd
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdBetween(Long fkTencentDeviceIdEnd){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null && fkTencentDeviceIdEnd!=null){
            between("fk_tencent_device_id",entity().getFkTencentDeviceId(),fkTencentDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * NOT BETWEEN  entity().getFkTencentDeviceId() AND 值2
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdNotBetween(Long fkTencentDeviceIdEnd){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null && fkTencentDeviceIdEnd!=null){
            notBetween("fk_tencent_device_id",entity().getFkTencentDeviceId(),fkTencentDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * BETWEEN  entity().getFkTencentDeviceId() AND 值2
     * @param fkTencentDeviceIdStart       值1
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null && fkTencentDeviceIdEnd!=null){
            between("fk_tencent_device_id",fkTencentDeviceIdStart,fkTencentDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * NOT BETWEEN  entity().getFkTencentDeviceId() AND 值2
     * @param fkTencentDeviceIdStart       值1
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdNotBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null && fkTencentDeviceIdEnd!=null){
            notBetween("fk_tencent_device_id",fkTencentDeviceIdStart,fkTencentDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯设备Id</p>
     * LIKE '%值%'  entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdLike(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            like("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * NOT LIKE '%值%'  entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdNotLike(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            notLike("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }


    /**
     * <p>腾讯设备Id</p>
     * LIKE '%值'  entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdLikeLeft(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            likeLeft("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * LIKE '值%'  entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdLikeRight(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            likeRight("fk_tencent_device_id",entity().getFkTencentDeviceId());
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 等于 =
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdEq(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            eq("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * 不等于 &lt;&gt;
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdNe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            ne("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 大于 &gt;
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdGt(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            gt("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 大于等于 &gt;=
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdGe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            ge("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 小于 &lt;
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdLt(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            lt("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * 小于等于 &lt;=
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdLe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            le("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * LIKE '%值%'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdLike(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            like("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * NOT LIKE '%值%'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdNotLike(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            notLike("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }


    /**
     * <p>腾讯设备Id</p>
     * LIKE '%值'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdLikeLeft(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            likeLeft("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * LIKE '值%'
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdLikeRight(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            likeRight("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p>腾讯设备Id</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdIsNull(){
        isNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdIsNotNull(){
        isNotNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_tencent_device_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_tencent_device_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_tencent_device_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯设备Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper fkTencentDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_device_id",values);
        }
        return this;
    }


    /**
     * <p>实例ID</p>
     * 等于 = entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdEq(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例ID</p>
     * 不等于 &lt;&gt; entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdNe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ne("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 大于 &gt; entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdGt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            gt("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 大于等于 &gt;= entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdGe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ge("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 小于 &lt; entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdLt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            lt("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 小于等于 &lt;= entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdLe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            le("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * BETWEEN  entity().getInstanceId() AND instanceIdEnd
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",entity().getInstanceId(),instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdNotBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",entity().getInstanceId(),instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例ID</p>
     * LIKE '%值%'  entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            like("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * NOT LIKE '%值%'  entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdNotLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            notLike("instance_id",entity().getInstanceId());
        }
        return this;
     }


    /**
     * <p>实例ID</p>
     * LIKE '%值'  entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdLikeLeft(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeLeft("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * LIKE '值%'  entity().getInstanceId()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdLikeRight(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeRight("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例ID</p>
     * 不等于 &lt;&gt;
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 大于 &gt;
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 大于等于 &gt;=
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 小于 &lt;
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * 小于等于 &lt;=
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * NOT LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>实例ID</p>
     * LIKE '%值'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * LIKE '值%'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdLikeRight(String instanceId){
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例ID</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例ID</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("instance_id",values);
        }
        return this;
    }

    /**
     * <p>实例ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }


    /**
     * <p>云手机服务内网IP</p>
     * 等于 = entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpEq(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            eq("server_ip",serverIp);
        }
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * 不等于 &lt;&gt; entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpNe(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            ne("server_ip",entity().getServerIp());
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 大于 &gt; entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpGt(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            gt("server_ip",entity().getServerIp());
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 大于等于 &gt;= entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpGe(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            ge("server_ip",entity().getServerIp());
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 小于 &lt; entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpLt(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            lt("server_ip",entity().getServerIp());
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 小于等于 &lt;= entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpLe(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            le("server_ip",entity().getServerIp());
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * BETWEEN  entity().getServerIp() AND serverIpEnd
     * @param serverIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpBetween(String serverIpEnd){
        String serverIp =entity().getServerIp();
        if(serverIp!=null && serverIpEnd!=null){
            between("server_ip",entity().getServerIp(),serverIpEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * NOT BETWEEN  entity().getServerIp() AND 值2
     * @param serverIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpNotBetween(String serverIpEnd){
        String serverIp =entity().getServerIp();
        if(serverIp!=null && serverIpEnd!=null){
            notBetween("server_ip",entity().getServerIp(),serverIpEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * BETWEEN  entity().getServerIp() AND 值2
     * @param serverIpStart       值1
     * @param serverIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpBetween(String serverIpStart,String serverIpEnd){
        String serverIp =entity().getServerIp();
        if(serverIp!=null && serverIpEnd!=null){
            between("server_ip",serverIpStart,serverIpEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * NOT BETWEEN  entity().getServerIp() AND 值2
     * @param serverIpStart       值1
     * @param serverIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpNotBetween(String serverIpStart,String serverIpEnd){
        String serverIp =entity().getServerIp();
        if(serverIp!=null && serverIpEnd!=null){
            notBetween("server_ip",serverIpStart,serverIpEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务内网IP</p>
     * LIKE '%值%'  entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpLike(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            like("server_ip",entity().getServerIp());
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * NOT LIKE '%值%'  entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpNotLike(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            notLike("server_ip",entity().getServerIp());
        }
        return this;
     }


    /**
     * <p>云手机服务内网IP</p>
     * LIKE '%值'  entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpLikeLeft(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            likeLeft("server_ip",entity().getServerIp());
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * LIKE '值%'  entity().getServerIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpLikeRight(){
        String serverIp =entity().getServerIp();
        if(serverIp!=null){
            likeRight("server_ip",entity().getServerIp());
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 等于 =
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpEq(String serverIp){
        if(serverIp!=null){
            eq("server_ip",serverIp);
        }
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * 不等于 &lt;&gt;
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpNe(String serverIp){
        if(serverIp!=null){
            ne("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 大于 &gt;
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpGt(String serverIp){
        if(serverIp!=null){
            gt("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 大于等于 &gt;=
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpGe(String serverIp){
        if(serverIp!=null){
            ge("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 小于 &lt;
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpLt(String serverIp){
        if(serverIp!=null){
            lt("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * 小于等于 &lt;=
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpLe(String serverIp){
        if(serverIp!=null){
            le("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * LIKE '%值%'
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpLike(String serverIp){
        if(serverIp!=null){
            like("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * NOT LIKE '%值%'
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpNotLike(String serverIp){
        if(serverIp!=null){
            notLike("server_ip",serverIp);
        }
        return this;
     }


    /**
     * <p>云手机服务内网IP</p>
     * LIKE '%值'
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpLikeLeft(String serverIp){
        if(serverIp!=null){
            likeLeft("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * LIKE '值%'
     * @param serverIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpLikeRight(String serverIp){
        if(serverIp!=null){
            likeRight("server_ip",serverIp);
        }
        return this;
     }

    /**
     * <p>云手机服务内网IP</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpIsNull(){
        isNull("server_ip");
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpIsNotNull(){
        isNotNull("server_ip");
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("server_ip",value);
        }
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpIn(String... values){
        if(values!=null && values.length>0){
            in("server_ip",values);
        }
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("server_ip",value);
        }
        return this;
    }

    /**
     * <p>云手机服务内网IP</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("server_ip",values);
        }
        return this;
    }


    /**
     * <p>云手机服务监听端口</p>
     * 等于 = entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortEq(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            eq("server_port",serverPort);
        }
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * 不等于 &lt;&gt; entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortNe(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            ne("server_port",entity().getServerPort());
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 大于 &gt; entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortGt(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            gt("server_port",entity().getServerPort());
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 大于等于 &gt;= entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortGe(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            ge("server_port",entity().getServerPort());
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 小于 &lt; entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortLt(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            lt("server_port",entity().getServerPort());
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 小于等于 &lt;= entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortLe(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            le("server_port",entity().getServerPort());
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * BETWEEN  entity().getServerPort() AND serverPortEnd
     * @param serverPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortBetween(Integer serverPortEnd){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null && serverPortEnd!=null){
            between("server_port",entity().getServerPort(),serverPortEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * NOT BETWEEN  entity().getServerPort() AND 值2
     * @param serverPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortNotBetween(Integer serverPortEnd){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null && serverPortEnd!=null){
            notBetween("server_port",entity().getServerPort(),serverPortEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * BETWEEN  entity().getServerPort() AND 值2
     * @param serverPortStart       值1
     * @param serverPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortBetween(Integer serverPortStart,Integer serverPortEnd){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null && serverPortEnd!=null){
            between("server_port",serverPortStart,serverPortEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * NOT BETWEEN  entity().getServerPort() AND 值2
     * @param serverPortStart       值1
     * @param serverPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortNotBetween(Integer serverPortStart,Integer serverPortEnd){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null && serverPortEnd!=null){
            notBetween("server_port",serverPortStart,serverPortEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务监听端口</p>
     * LIKE '%值%'  entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortLike(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            like("server_port",entity().getServerPort());
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * NOT LIKE '%值%'  entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortNotLike(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            notLike("server_port",entity().getServerPort());
        }
        return this;
     }


    /**
     * <p>云手机服务监听端口</p>
     * LIKE '%值'  entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortLikeLeft(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            likeLeft("server_port",entity().getServerPort());
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * LIKE '值%'  entity().getServerPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortLikeRight(){
        Integer serverPort =entity().getServerPort();
        if(serverPort!=null){
            likeRight("server_port",entity().getServerPort());
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 等于 =
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortEq(Integer serverPort){
        if(serverPort!=null){
            eq("server_port",serverPort);
        }
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * 不等于 &lt;&gt;
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortNe(Integer serverPort){
        if(serverPort!=null){
            ne("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 大于 &gt;
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortGt(Integer serverPort){
        if(serverPort!=null){
            gt("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 大于等于 &gt;=
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortGe(Integer serverPort){
        if(serverPort!=null){
            ge("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 小于 &lt;
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortLt(Integer serverPort){
        if(serverPort!=null){
            lt("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * 小于等于 &lt;=
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortLe(Integer serverPort){
        if(serverPort!=null){
            le("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * LIKE '%值%'
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortLike(Integer serverPort){
        if(serverPort!=null){
            like("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * NOT LIKE '%值%'
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortNotLike(Integer serverPort){
        if(serverPort!=null){
            notLike("server_port",serverPort);
        }
        return this;
     }


    /**
     * <p>云手机服务监听端口</p>
     * LIKE '%值'
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortLikeLeft(Integer serverPort){
        if(serverPort!=null){
            likeLeft("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * LIKE '值%'
     * @param serverPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortLikeRight(Integer serverPort){
        if(serverPort!=null){
            likeRight("server_port",serverPort);
        }
        return this;
     }

    /**
     * <p>云手机服务监听端口</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortIsNull(){
        isNull("server_port");
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortIsNotNull(){
        isNotNull("server_port");
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("server_port",value);
        }
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("server_port",values);
        }
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("server_port",value);
        }
        return this;
    }

    /**
     * <p>云手机服务监听端口</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper serverPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("server_port",values);
        }
        return this;
    }


    /**
     * <p>云手机服务公网映射 IP</p>
     * 等于 = entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpEq(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            eq("public_ip",publicIp);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 不等于 &lt;&gt; entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpNe(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            ne("public_ip",entity().getPublicIp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 大于 &gt; entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpGt(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            gt("public_ip",entity().getPublicIp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 大于等于 &gt;= entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpGe(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            ge("public_ip",entity().getPublicIp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 小于 &lt; entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpLt(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            lt("public_ip",entity().getPublicIp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 小于等于 &lt;= entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpLe(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            le("public_ip",entity().getPublicIp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * BETWEEN  entity().getPublicIp() AND publicIpEnd
     * @param publicIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpBetween(String publicIpEnd){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null && publicIpEnd!=null){
            between("public_ip",entity().getPublicIp(),publicIpEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * NOT BETWEEN  entity().getPublicIp() AND 值2
     * @param publicIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpNotBetween(String publicIpEnd){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null && publicIpEnd!=null){
            notBetween("public_ip",entity().getPublicIp(),publicIpEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * BETWEEN  entity().getPublicIp() AND 值2
     * @param publicIpStart       值1
     * @param publicIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpBetween(String publicIpStart,String publicIpEnd){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null && publicIpEnd!=null){
            between("public_ip",publicIpStart,publicIpEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * NOT BETWEEN  entity().getPublicIp() AND 值2
     * @param publicIpStart       值1
     * @param publicIpEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpNotBetween(String publicIpStart,String publicIpEnd){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null && publicIpEnd!=null){
            notBetween("public_ip",publicIpStart,publicIpEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '%值%'  entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpLike(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            like("public_ip",entity().getPublicIp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * NOT LIKE '%值%'  entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpNotLike(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            notLike("public_ip",entity().getPublicIp());
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '%值'  entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpLikeLeft(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            likeLeft("public_ip",entity().getPublicIp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '值%'  entity().getPublicIp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpLikeRight(){
        String publicIp =entity().getPublicIp();
        if(publicIp!=null){
            likeRight("public_ip",entity().getPublicIp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 等于 =
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpEq(String publicIp){
        if(publicIp!=null){
            eq("public_ip",publicIp);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 不等于 &lt;&gt;
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpNe(String publicIp){
        if(publicIp!=null){
            ne("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 大于 &gt;
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpGt(String publicIp){
        if(publicIp!=null){
            gt("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 大于等于 &gt;=
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpGe(String publicIp){
        if(publicIp!=null){
            ge("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 小于 &lt;
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpLt(String publicIp){
        if(publicIp!=null){
            lt("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * 小于等于 &lt;=
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpLe(String publicIp){
        if(publicIp!=null){
            le("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '%值%'
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpLike(String publicIp){
        if(publicIp!=null){
            like("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * NOT LIKE '%值%'
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpNotLike(String publicIp){
        if(publicIp!=null){
            notLike("public_ip",publicIp);
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '%值'
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpLikeLeft(String publicIp){
        if(publicIp!=null){
            likeLeft("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * LIKE '值%'
     * @param publicIp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpLikeRight(String publicIp){
        if(publicIp!=null){
            likeRight("public_ip",publicIp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射 IP</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpIsNull(){
        isNull("public_ip");
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpIsNotNull(){
        isNotNull("public_ip");
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("public_ip",value);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpIn(String... values){
        if(values!=null && values.length>0){
            in("public_ip",values);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("public_ip",value);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射 IP</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("public_ip",values);
        }
        return this;
    }


    /**
     * <p>云手机服务公网映射端口</p>
     * 等于 = entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortEq(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            eq("public_port",publicPort);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * 不等于 &lt;&gt; entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortNe(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            ne("public_port",entity().getPublicPort());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 大于 &gt; entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortGt(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            gt("public_port",entity().getPublicPort());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 大于等于 &gt;= entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortGe(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            ge("public_port",entity().getPublicPort());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 小于 &lt; entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortLt(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            lt("public_port",entity().getPublicPort());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 小于等于 &lt;= entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortLe(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            le("public_port",entity().getPublicPort());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * BETWEEN  entity().getPublicPort() AND publicPortEnd
     * @param publicPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortBetween(Integer publicPortEnd){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null && publicPortEnd!=null){
            between("public_port",entity().getPublicPort(),publicPortEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * NOT BETWEEN  entity().getPublicPort() AND 值2
     * @param publicPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortNotBetween(Integer publicPortEnd){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null && publicPortEnd!=null){
            notBetween("public_port",entity().getPublicPort(),publicPortEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * BETWEEN  entity().getPublicPort() AND 值2
     * @param publicPortStart       值1
     * @param publicPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortBetween(Integer publicPortStart,Integer publicPortEnd){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null && publicPortEnd!=null){
            between("public_port",publicPortStart,publicPortEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * NOT BETWEEN  entity().getPublicPort() AND 值2
     * @param publicPortStart       值1
     * @param publicPortEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortNotBetween(Integer publicPortStart,Integer publicPortEnd){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null && publicPortEnd!=null){
            notBetween("public_port",publicPortStart,publicPortEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '%值%'  entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortLike(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            like("public_port",entity().getPublicPort());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * NOT LIKE '%值%'  entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortNotLike(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            notLike("public_port",entity().getPublicPort());
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '%值'  entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortLikeLeft(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            likeLeft("public_port",entity().getPublicPort());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '值%'  entity().getPublicPort()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortLikeRight(){
        Integer publicPort =entity().getPublicPort();
        if(publicPort!=null){
            likeRight("public_port",entity().getPublicPort());
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 等于 =
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortEq(Integer publicPort){
        if(publicPort!=null){
            eq("public_port",publicPort);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * 不等于 &lt;&gt;
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortNe(Integer publicPort){
        if(publicPort!=null){
            ne("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 大于 &gt;
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortGt(Integer publicPort){
        if(publicPort!=null){
            gt("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 大于等于 &gt;=
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortGe(Integer publicPort){
        if(publicPort!=null){
            ge("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 小于 &lt;
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortLt(Integer publicPort){
        if(publicPort!=null){
            lt("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * 小于等于 &lt;=
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortLe(Integer publicPort){
        if(publicPort!=null){
            le("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '%值%'
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortLike(Integer publicPort){
        if(publicPort!=null){
            like("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * NOT LIKE '%值%'
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortNotLike(Integer publicPort){
        if(publicPort!=null){
            notLike("public_port",publicPort);
        }
        return this;
     }


    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '%值'
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortLikeLeft(Integer publicPort){
        if(publicPort!=null){
            likeLeft("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * LIKE '值%'
     * @param publicPort       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortLikeRight(Integer publicPort){
        if(publicPort!=null){
            likeRight("public_port",publicPort);
        }
        return this;
     }

    /**
     * <p>云手机服务公网映射端口</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortIsNull(){
        isNull("public_port");
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortIsNotNull(){
        isNotNull("public_port");
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("public_port",value);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("public_port",values);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("public_port",value);
        }
        return this;
    }

    /**
     * <p>云手机服务公网映射端口</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper publicPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("public_port",values);
        }
        return this;
    }


    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 等于 = entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispEq(){
        String isp =entity().getIsp();
        if(isp!=null){
            eq("isp",isp);
        }
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 不等于 &lt;&gt; entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispNe(){
        String isp =entity().getIsp();
        if(isp!=null){
            ne("isp",entity().getIsp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 大于 &gt; entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispGt(){
        String isp =entity().getIsp();
        if(isp!=null){
            gt("isp",entity().getIsp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 大于等于 &gt;= entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispGe(){
        String isp =entity().getIsp();
        if(isp!=null){
            ge("isp",entity().getIsp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 小于 &lt; entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispLt(){
        String isp =entity().getIsp();
        if(isp!=null){
            lt("isp",entity().getIsp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 小于等于 &lt;= entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispLe(){
        String isp =entity().getIsp();
        if(isp!=null){
            le("isp",entity().getIsp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * BETWEEN  entity().getIsp() AND ispEnd
     * @param ispEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispBetween(String ispEnd){
        String isp =entity().getIsp();
        if(isp!=null && ispEnd!=null){
            between("isp",entity().getIsp(),ispEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * NOT BETWEEN  entity().getIsp() AND 值2
     * @param ispEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispNotBetween(String ispEnd){
        String isp =entity().getIsp();
        if(isp!=null && ispEnd!=null){
            notBetween("isp",entity().getIsp(),ispEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * BETWEEN  entity().getIsp() AND 值2
     * @param ispStart       值1
     * @param ispEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispBetween(String ispStart,String ispEnd){
        String isp =entity().getIsp();
        if(isp!=null && ispEnd!=null){
            between("isp",ispStart,ispEnd);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * NOT BETWEEN  entity().getIsp() AND 值2
     * @param ispStart       值1
     * @param ispEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispNotBetween(String ispStart,String ispEnd){
        String isp =entity().getIsp();
        if(isp!=null && ispEnd!=null){
            notBetween("isp",ispStart,ispEnd);
        }
        return this;
     }


    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '%值%'  entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispLike(){
        String isp =entity().getIsp();
        if(isp!=null){
            like("isp",entity().getIsp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * NOT LIKE '%值%'  entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispNotLike(){
        String isp =entity().getIsp();
        if(isp!=null){
            notLike("isp",entity().getIsp());
        }
        return this;
     }


    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '%值'  entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispLikeLeft(){
        String isp =entity().getIsp();
        if(isp!=null){
            likeLeft("isp",entity().getIsp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '值%'  entity().getIsp()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispLikeRight(){
        String isp =entity().getIsp();
        if(isp!=null){
            likeRight("isp",entity().getIsp());
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 等于 =
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispEq(String isp){
        if(isp!=null){
            eq("isp",isp);
        }
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 不等于 &lt;&gt;
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispNe(String isp){
        if(isp!=null){
            ne("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 大于 &gt;
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispGt(String isp){
        if(isp!=null){
            gt("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 大于等于 &gt;=
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispGe(String isp){
        if(isp!=null){
            ge("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 小于 &lt;
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispLt(String isp){
        if(isp!=null){
            lt("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * 小于等于 &lt;=
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispLe(String isp){
        if(isp!=null){
            le("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '%值%'
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispLike(String isp){
        if(isp!=null){
            like("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * NOT LIKE '%值%'
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispNotLike(String isp){
        if(isp!=null){
            notLike("isp",isp);
        }
        return this;
     }


    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '%值'
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispLikeLeft(String isp){
        if(isp!=null){
            likeLeft("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * LIKE '值%'
     * @param isp       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispLikeRight(String isp){
        if(isp!=null){
            likeRight("isp",isp);
        }
        return this;
     }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispIsNull(){
        isNull("isp");
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispIsNotNull(){
        isNotNull("isp");
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("isp",value);
        }
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispIn(String... values){
        if(values!=null && values.length>0){
            in("isp",values);
        }
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("isp",value);
        }
        return this;
    }

    /**
     * <p>云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper ispNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("isp",values);
        }
        return this;
    }


    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeEq(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 不等于 &lt;&gt; entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",entity().getCreateTime(),createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",entity().getCreateTime(),createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",entity().getCreateTime());
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


    /**
     * <p>最后修改时间</p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeEq(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt; entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt;
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值'
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceAccessInfoQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }



}
