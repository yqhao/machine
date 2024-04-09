package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.TencentDevice;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 腾讯设备表
 * </p>
 * "tencent_device"
 * @author PC001
 * @since 2023-06-14
 */
public class TencentDeviceQueryEntityWrapper extends QueryWrapper<TencentDevice> {

    public static TencentDeviceQueryEntityWrapper wrapper(TencentDevice entity) {
        return new TencentDeviceQueryEntityWrapper(entity);
    }

    private TencentDevice entity;

    public TencentDeviceQueryEntityWrapper(TencentDevice entity) {
         this.entity=entity;
    }


    protected TencentDevice entity() {
        if(entity==null){
            throw new NullPointerException("TencentDevice is null");
        }
        return entity;
    }

    @Override
    public TencentDeviceQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper idEq(){
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
    public TencentDeviceQueryEntityWrapper idNe(){
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
    public TencentDeviceQueryEntityWrapper idGt(){
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
    public TencentDeviceQueryEntityWrapper idGe(){
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
    public TencentDeviceQueryEntityWrapper idLt(){
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
    public TencentDeviceQueryEntityWrapper idLe(){
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
    public TencentDeviceQueryEntityWrapper idBetween(Long idEnd){
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
    public TencentDeviceQueryEntityWrapper idNotBetween(Long idEnd){
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
    public TencentDeviceQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentDeviceQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentDeviceQueryEntityWrapper idLike(){
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
    public TencentDeviceQueryEntityWrapper idNotLike(){
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
    public TencentDeviceQueryEntityWrapper idLikeLeft(){
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
    public TencentDeviceQueryEntityWrapper idLikeRight(){
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
    public TencentDeviceQueryEntityWrapper idEq(Long id){
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
    public TencentDeviceQueryEntityWrapper idNe(Long id){
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
    public TencentDeviceQueryEntityWrapper idGt(Long id){
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
    public TencentDeviceQueryEntityWrapper idGe(Long id){
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
    public TencentDeviceQueryEntityWrapper idLt(Long id){
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
    public TencentDeviceQueryEntityWrapper idLe(Long id){
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
    public TencentDeviceQueryEntityWrapper idLike(Long id){
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
    public TencentDeviceQueryEntityWrapper idNotLike(Long id){
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
    public TencentDeviceQueryEntityWrapper idLikeLeft(Long id){
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
    public TencentDeviceQueryEntityWrapper idLikeRight(Long id){
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
    public TencentDeviceQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper idIn(Collection<Long> value){
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
    public TencentDeviceQueryEntityWrapper idIn(Long... values){
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
    public TencentDeviceQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public TencentDeviceQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>腾讯账号区域Id</p>
     * 等于 = entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdEq(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            eq("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * 不等于 &lt;&gt; entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdNe(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            ne("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 大于 &gt; entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdGt(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            gt("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 大于等于 &gt;= entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdGe(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            ge("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 小于 &lt; entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdLt(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            lt("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 小于等于 &lt;= entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdLe(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            le("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * BETWEEN  entity().getFkTencentAccountAreaId() AND fkTencentAccountAreaIdEnd
     * @param fkTencentAccountAreaIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdBetween(Long fkTencentAccountAreaIdEnd){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null && fkTencentAccountAreaIdEnd!=null){
            between("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId(),fkTencentAccountAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT BETWEEN  entity().getFkTencentAccountAreaId() AND 值2
     * @param fkTencentAccountAreaIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdNotBetween(Long fkTencentAccountAreaIdEnd){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null && fkTencentAccountAreaIdEnd!=null){
            notBetween("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId(),fkTencentAccountAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * BETWEEN  entity().getFkTencentAccountAreaId() AND 值2
     * @param fkTencentAccountAreaIdStart       值1
     * @param fkTencentAccountAreaIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdBetween(Long fkTencentAccountAreaIdStart,Long fkTencentAccountAreaIdEnd){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null && fkTencentAccountAreaIdEnd!=null){
            between("fk_tencent_account_area_id",fkTencentAccountAreaIdStart,fkTencentAccountAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT BETWEEN  entity().getFkTencentAccountAreaId() AND 值2
     * @param fkTencentAccountAreaIdStart       值1
     * @param fkTencentAccountAreaIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdNotBetween(Long fkTencentAccountAreaIdStart,Long fkTencentAccountAreaIdEnd){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null && fkTencentAccountAreaIdEnd!=null){
            notBetween("fk_tencent_account_area_id",fkTencentAccountAreaIdStart,fkTencentAccountAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '%值%'  entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdLike(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            like("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT LIKE '%值%'  entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdNotLike(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            notLike("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }


    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '%值'  entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdLikeLeft(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            likeLeft("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '值%'  entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdLikeRight(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            likeRight("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 等于 =
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdEq(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            eq("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * 不等于 &lt;&gt;
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdNe(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            ne("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 大于 &gt;
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdGt(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            gt("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 大于等于 &gt;=
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdGe(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            ge("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 小于 &lt;
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdLt(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            lt("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 小于等于 &lt;=
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdLe(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            le("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '%值%'
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdLike(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            like("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT LIKE '%值%'
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdNotLike(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            notLike("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }


    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '%值'
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdLikeLeft(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            likeLeft("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '值%'
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdLikeRight(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            likeRight("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdIsNull(){
        isNull("fk_tencent_account_area_id");
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdIsNotNull(){
        isNotNull("fk_tencent_account_area_id");
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_tencent_account_area_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_tencent_account_area_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_tencent_account_area_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper fkTencentAccountAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_account_area_id",values);
        }
        return this;
    }


    /**
     * <p>实例 ID</p>
     * 等于 = entity().getInstanceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdEq(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例 ID</p>
     * 不等于 &lt;&gt; entity().getInstanceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdNe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ne("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 大于 &gt; entity().getInstanceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdGt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            gt("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 大于等于 &gt;= entity().getInstanceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdGe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ge("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 小于 &lt; entity().getInstanceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdLt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            lt("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 小于等于 &lt;= entity().getInstanceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdLe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            le("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * BETWEEN  entity().getInstanceId() AND instanceIdEnd
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",entity().getInstanceId(),instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdNotBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",entity().getInstanceId(),instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例 ID</p>
     * LIKE '%值%'  entity().getInstanceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            like("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * NOT LIKE '%值%'  entity().getInstanceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdNotLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            notLike("instance_id",entity().getInstanceId());
        }
        return this;
     }


    /**
     * <p>实例 ID</p>
     * LIKE '%值'  entity().getInstanceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdLikeLeft(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeLeft("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * LIKE '值%'  entity().getInstanceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdLikeRight(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeRight("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例 ID</p>
     * 不等于 &lt;&gt;
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 大于 &gt;
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 大于等于 &gt;=
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 小于 &lt;
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 小于等于 &lt;=
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * NOT LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>实例 ID</p>
     * LIKE '%值'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * LIKE '值%'
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdLikeRight(String instanceId){
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例 ID</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例 ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例 ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("instance_id",values);
        }
        return this;
    }

    /**
     * <p>实例 ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例 ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }


    /**
     * <p>实例所在区域</p>
     * 等于 = entity().getRegion()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionEq(){
        String region =entity().getRegion();
        if(region!=null){
            eq("region",region);
        }
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * 不等于 &lt;&gt; entity().getRegion()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionNe(){
        String region =entity().getRegion();
        if(region!=null){
            ne("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 大于 &gt; entity().getRegion()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionGt(){
        String region =entity().getRegion();
        if(region!=null){
            gt("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 大于等于 &gt;= entity().getRegion()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionGe(){
        String region =entity().getRegion();
        if(region!=null){
            ge("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 小于 &lt; entity().getRegion()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionLt(){
        String region =entity().getRegion();
        if(region!=null){
            lt("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 小于等于 &lt;= entity().getRegion()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionLe(){
        String region =entity().getRegion();
        if(region!=null){
            le("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * BETWEEN  entity().getRegion() AND regionEnd
     * @param regionEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionBetween(String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            between("region",entity().getRegion(),regionEnd);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * NOT BETWEEN  entity().getRegion() AND 值2
     * @param regionEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionNotBetween(String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            notBetween("region",entity().getRegion(),regionEnd);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * BETWEEN  entity().getRegion() AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionBetween(String regionStart,String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            between("region",regionStart,regionEnd);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * NOT BETWEEN  entity().getRegion() AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionNotBetween(String regionStart,String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            notBetween("region",regionStart,regionEnd);
        }
        return this;
     }


    /**
     * <p>实例所在区域</p>
     * LIKE '%值%'  entity().getRegion()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionLike(){
        String region =entity().getRegion();
        if(region!=null){
            like("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * NOT LIKE '%值%'  entity().getRegion()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionNotLike(){
        String region =entity().getRegion();
        if(region!=null){
            notLike("region",entity().getRegion());
        }
        return this;
     }


    /**
     * <p>实例所在区域</p>
     * LIKE '%值'  entity().getRegion()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionLikeLeft(){
        String region =entity().getRegion();
        if(region!=null){
            likeLeft("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * LIKE '值%'  entity().getRegion()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionLikeRight(){
        String region =entity().getRegion();
        if(region!=null){
            likeRight("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 等于 =
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionEq(String region){
        if(region!=null){
            eq("region",region);
        }
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * 不等于 &lt;&gt;
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionNe(String region){
        if(region!=null){
            ne("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 大于 &gt;
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionGt(String region){
        if(region!=null){
            gt("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 大于等于 &gt;=
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionGe(String region){
        if(region!=null){
            ge("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 小于 &lt;
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionLt(String region){
        if(region!=null){
            lt("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 小于等于 &lt;=
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionLe(String region){
        if(region!=null){
            le("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * LIKE '%值%'
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionLike(String region){
        if(region!=null){
            like("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * NOT LIKE '%值%'
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionNotLike(String region){
        if(region!=null){
            notLike("region",region);
        }
        return this;
     }


    /**
     * <p>实例所在区域</p>
     * LIKE '%值'
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionLikeLeft(String region){
        if(region!=null){
            likeLeft("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * LIKE '值%'
     * @param region       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionLikeRight(String region){
        if(region!=null){
            likeRight("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionIsNull(){
        isNull("region");
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionIsNotNull(){
        isNotNull("region");
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("region",value);
        }
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionIn(String... values){
        if(values!=null && values.length>0){
            in("region",values);
        }
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("region",value);
        }
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper regionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region",values);
        }
        return this;
    }


    /**
     * <p>当前实例所使用的镜像</p>
     * 等于 = entity().getImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdEq(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            eq("image_id",imageId);
        }
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * 不等于 &lt;&gt; entity().getImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdNe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            ne("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 大于 &gt; entity().getImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdGt(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            gt("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 大于等于 &gt;= entity().getImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdGe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            ge("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 小于 &lt; entity().getImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdLt(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            lt("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 小于等于 &lt;= entity().getImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdLe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            le("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * BETWEEN  entity().getImageId() AND imageIdEnd
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdBetween(String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            between("image_id",entity().getImageId(),imageIdEnd);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * NOT BETWEEN  entity().getImageId() AND 值2
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdNotBetween(String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            notBetween("image_id",entity().getImageId(),imageIdEnd);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * BETWEEN  entity().getImageId() AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            between("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * NOT BETWEEN  entity().getImageId() AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            notBetween("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>当前实例所使用的镜像</p>
     * LIKE '%值%'  entity().getImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdLike(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            like("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * NOT LIKE '%值%'  entity().getImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdNotLike(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            notLike("image_id",entity().getImageId());
        }
        return this;
     }


    /**
     * <p>当前实例所使用的镜像</p>
     * LIKE '%值'  entity().getImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdLikeLeft(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            likeLeft("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * LIKE '值%'  entity().getImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdLikeRight(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            likeRight("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 等于 =
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdEq(String imageId){
        if(imageId!=null){
            eq("image_id",imageId);
        }
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * 不等于 &lt;&gt;
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdNe(String imageId){
        if(imageId!=null){
            ne("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 大于 &gt;
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdGt(String imageId){
        if(imageId!=null){
            gt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 大于等于 &gt;=
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdGe(String imageId){
        if(imageId!=null){
            ge("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 小于 &lt;
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdLt(String imageId){
        if(imageId!=null){
            lt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 小于等于 &lt;=
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdLe(String imageId){
        if(imageId!=null){
            le("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdLike(String imageId){
        if(imageId!=null){
            like("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * NOT LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdNotLike(String imageId){
        if(imageId!=null){
            notLike("image_id",imageId);
        }
        return this;
     }


    /**
     * <p>当前实例所使用的镜像</p>
     * LIKE '%值'
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdLikeLeft(String imageId){
        if(imageId!=null){
            likeLeft("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * LIKE '值%'
     * @param imageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdLikeRight(String imageId){
        if(imageId!=null){
            likeRight("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdIsNull(){
        isNull("image_id");
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdIsNotNull(){
        isNotNull("image_id");
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("image_id",value);
        }
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdIn(String... values){
        if(values!=null && values.length>0){
            in("image_id",values);
        }
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("image_id",value);
        }
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_id",values);
        }
        return this;
    }


    /**
     * <p>实例类型</p>
     * 等于 = entity().getInstanceType()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeEq(){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null){
            eq("instance_type",instanceType);
        }
        return this;
    }

    /**
     * <p>实例类型</p>
     * 不等于 &lt;&gt; entity().getInstanceType()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeNe(){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null){
            ne("instance_type",entity().getInstanceType());
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 大于 &gt; entity().getInstanceType()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeGt(){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null){
            gt("instance_type",entity().getInstanceType());
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 大于等于 &gt;= entity().getInstanceType()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeGe(){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null){
            ge("instance_type",entity().getInstanceType());
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 小于 &lt; entity().getInstanceType()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeLt(){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null){
            lt("instance_type",entity().getInstanceType());
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 小于等于 &lt;= entity().getInstanceType()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeLe(){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null){
            le("instance_type",entity().getInstanceType());
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * BETWEEN  entity().getInstanceType() AND instanceTypeEnd
     * @param instanceTypeEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeBetween(String instanceTypeEnd){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null && instanceTypeEnd!=null){
            between("instance_type",entity().getInstanceType(),instanceTypeEnd);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * NOT BETWEEN  entity().getInstanceType() AND 值2
     * @param instanceTypeEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeNotBetween(String instanceTypeEnd){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null && instanceTypeEnd!=null){
            notBetween("instance_type",entity().getInstanceType(),instanceTypeEnd);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * BETWEEN  entity().getInstanceType() AND 值2
     * @param instanceTypeStart       值1
     * @param instanceTypeEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeBetween(String instanceTypeStart,String instanceTypeEnd){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null && instanceTypeEnd!=null){
            between("instance_type",instanceTypeStart,instanceTypeEnd);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * NOT BETWEEN  entity().getInstanceType() AND 值2
     * @param instanceTypeStart       值1
     * @param instanceTypeEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeNotBetween(String instanceTypeStart,String instanceTypeEnd){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null && instanceTypeEnd!=null){
            notBetween("instance_type",instanceTypeStart,instanceTypeEnd);
        }
        return this;
     }


    /**
     * <p>实例类型</p>
     * LIKE '%值%'  entity().getInstanceType()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeLike(){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null){
            like("instance_type",entity().getInstanceType());
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * NOT LIKE '%值%'  entity().getInstanceType()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeNotLike(){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null){
            notLike("instance_type",entity().getInstanceType());
        }
        return this;
     }


    /**
     * <p>实例类型</p>
     * LIKE '%值'  entity().getInstanceType()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeLikeLeft(){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null){
            likeLeft("instance_type",entity().getInstanceType());
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * LIKE '值%'  entity().getInstanceType()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeLikeRight(){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null){
            likeRight("instance_type",entity().getInstanceType());
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 等于 =
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeEq(String instanceType){
        if(instanceType!=null){
            eq("instance_type",instanceType);
        }
        return this;
    }

    /**
     * <p>实例类型</p>
     * 不等于 &lt;&gt;
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeNe(String instanceType){
        if(instanceType!=null){
            ne("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 大于 &gt;
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeGt(String instanceType){
        if(instanceType!=null){
            gt("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 大于等于 &gt;=
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeGe(String instanceType){
        if(instanceType!=null){
            ge("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 小于 &lt;
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeLt(String instanceType){
        if(instanceType!=null){
            lt("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 小于等于 &lt;=
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeLe(String instanceType){
        if(instanceType!=null){
            le("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * LIKE '%值%'
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeLike(String instanceType){
        if(instanceType!=null){
            like("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * NOT LIKE '%值%'
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeNotLike(String instanceType){
        if(instanceType!=null){
            notLike("instance_type",instanceType);
        }
        return this;
     }


    /**
     * <p>实例类型</p>
     * LIKE '%值'
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeLikeLeft(String instanceType){
        if(instanceType!=null){
            likeLeft("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * LIKE '值%'
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeLikeRight(String instanceType){
        if(instanceType!=null){
            likeRight("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeIsNull(){
        isNull("instance_type");
        return this;
    }

    /**
     * <p>实例类型</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeIsNotNull(){
        isNotNull("instance_type");
        return this;
    }

    /**
     * <p>实例类型</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_type",value);
        }
        return this;
    }

    /**
     * <p>实例类型</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeIn(String... values){
        if(values!=null && values.length>0){
            in("instance_type",values);
        }
        return this;
    }

    /**
     * <p>实例类型</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_type",value);
        }
        return this;
    }

    /**
     * <p>实例类型</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper instanceTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_type",values);
        }
        return this;
    }


    /**
     * <p>实例内网 IP</p>
     * 等于 = entity().getIp()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipEq(){
        String ip =entity().getIp();
        if(ip!=null){
            eq("ip",ip);
        }
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * 不等于 &lt;&gt; entity().getIp()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipNe(){
        String ip =entity().getIp();
        if(ip!=null){
            ne("ip",entity().getIp());
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 大于 &gt; entity().getIp()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipGt(){
        String ip =entity().getIp();
        if(ip!=null){
            gt("ip",entity().getIp());
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 大于等于 &gt;= entity().getIp()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipGe(){
        String ip =entity().getIp();
        if(ip!=null){
            ge("ip",entity().getIp());
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 小于 &lt; entity().getIp()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipLt(){
        String ip =entity().getIp();
        if(ip!=null){
            lt("ip",entity().getIp());
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 小于等于 &lt;= entity().getIp()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipLe(){
        String ip =entity().getIp();
        if(ip!=null){
            le("ip",entity().getIp());
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * BETWEEN  entity().getIp() AND ipEnd
     * @param ipEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipBetween(String ipEnd){
        String ip =entity().getIp();
        if(ip!=null && ipEnd!=null){
            between("ip",entity().getIp(),ipEnd);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * NOT BETWEEN  entity().getIp() AND 值2
     * @param ipEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipNotBetween(String ipEnd){
        String ip =entity().getIp();
        if(ip!=null && ipEnd!=null){
            notBetween("ip",entity().getIp(),ipEnd);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * BETWEEN  entity().getIp() AND 值2
     * @param ipStart       值1
     * @param ipEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipBetween(String ipStart,String ipEnd){
        String ip =entity().getIp();
        if(ip!=null && ipEnd!=null){
            between("ip",ipStart,ipEnd);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * NOT BETWEEN  entity().getIp() AND 值2
     * @param ipStart       值1
     * @param ipEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipNotBetween(String ipStart,String ipEnd){
        String ip =entity().getIp();
        if(ip!=null && ipEnd!=null){
            notBetween("ip",ipStart,ipEnd);
        }
        return this;
     }


    /**
     * <p>实例内网 IP</p>
     * LIKE '%值%'  entity().getIp()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipLike(){
        String ip =entity().getIp();
        if(ip!=null){
            like("ip",entity().getIp());
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * NOT LIKE '%值%'  entity().getIp()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipNotLike(){
        String ip =entity().getIp();
        if(ip!=null){
            notLike("ip",entity().getIp());
        }
        return this;
     }


    /**
     * <p>实例内网 IP</p>
     * LIKE '%值'  entity().getIp()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipLikeLeft(){
        String ip =entity().getIp();
        if(ip!=null){
            likeLeft("ip",entity().getIp());
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * LIKE '值%'  entity().getIp()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipLikeRight(){
        String ip =entity().getIp();
        if(ip!=null){
            likeRight("ip",entity().getIp());
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 等于 =
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipEq(String ip){
        if(ip!=null){
            eq("ip",ip);
        }
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * 不等于 &lt;&gt;
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipNe(String ip){
        if(ip!=null){
            ne("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 大于 &gt;
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipGt(String ip){
        if(ip!=null){
            gt("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 大于等于 &gt;=
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipGe(String ip){
        if(ip!=null){
            ge("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 小于 &lt;
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipLt(String ip){
        if(ip!=null){
            lt("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 小于等于 &lt;=
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipLe(String ip){
        if(ip!=null){
            le("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * LIKE '%值%'
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipLike(String ip){
        if(ip!=null){
            like("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * NOT LIKE '%值%'
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipNotLike(String ip){
        if(ip!=null){
            notLike("ip",ip);
        }
        return this;
     }


    /**
     * <p>实例内网 IP</p>
     * LIKE '%值'
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipLikeLeft(String ip){
        if(ip!=null){
            likeLeft("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * LIKE '值%'
     * @param ip       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipLikeRight(String ip){
        if(ip!=null){
            likeRight("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipIsNull(){
        isNull("ip");
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipIsNotNull(){
        isNotNull("ip");
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("ip",value);
        }
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipIn(String... values){
        if(values!=null && values.length>0){
            in("ip",values);
        }
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("ip",value);
        }
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper ipNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("ip",values);
        }
        return this;
    }


    /**
     * <p>实例所在物理宿主机编号</p>
     * 等于 = entity().getHostSerialNumber()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberEq(){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null){
            eq("host_serial_number",hostSerialNumber);
        }
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 不等于 &lt;&gt; entity().getHostSerialNumber()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberNe(){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null){
            ne("host_serial_number",entity().getHostSerialNumber());
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 大于 &gt; entity().getHostSerialNumber()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberGt(){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null){
            gt("host_serial_number",entity().getHostSerialNumber());
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 大于等于 &gt;= entity().getHostSerialNumber()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberGe(){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null){
            ge("host_serial_number",entity().getHostSerialNumber());
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 小于 &lt; entity().getHostSerialNumber()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberLt(){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null){
            lt("host_serial_number",entity().getHostSerialNumber());
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 小于等于 &lt;= entity().getHostSerialNumber()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberLe(){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null){
            le("host_serial_number",entity().getHostSerialNumber());
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * BETWEEN  entity().getHostSerialNumber() AND hostSerialNumberEnd
     * @param hostSerialNumberEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberBetween(String hostSerialNumberEnd){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null && hostSerialNumberEnd!=null){
            between("host_serial_number",entity().getHostSerialNumber(),hostSerialNumberEnd);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * NOT BETWEEN  entity().getHostSerialNumber() AND 值2
     * @param hostSerialNumberEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberNotBetween(String hostSerialNumberEnd){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null && hostSerialNumberEnd!=null){
            notBetween("host_serial_number",entity().getHostSerialNumber(),hostSerialNumberEnd);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * BETWEEN  entity().getHostSerialNumber() AND 值2
     * @param hostSerialNumberStart       值1
     * @param hostSerialNumberEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberBetween(String hostSerialNumberStart,String hostSerialNumberEnd){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null && hostSerialNumberEnd!=null){
            between("host_serial_number",hostSerialNumberStart,hostSerialNumberEnd);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * NOT BETWEEN  entity().getHostSerialNumber() AND 值2
     * @param hostSerialNumberStart       值1
     * @param hostSerialNumberEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberNotBetween(String hostSerialNumberStart,String hostSerialNumberEnd){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null && hostSerialNumberEnd!=null){
            notBetween("host_serial_number",hostSerialNumberStart,hostSerialNumberEnd);
        }
        return this;
     }


    /**
     * <p>实例所在物理宿主机编号</p>
     * LIKE '%值%'  entity().getHostSerialNumber()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberLike(){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null){
            like("host_serial_number",entity().getHostSerialNumber());
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * NOT LIKE '%值%'  entity().getHostSerialNumber()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberNotLike(){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null){
            notLike("host_serial_number",entity().getHostSerialNumber());
        }
        return this;
     }


    /**
     * <p>实例所在物理宿主机编号</p>
     * LIKE '%值'  entity().getHostSerialNumber()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberLikeLeft(){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null){
            likeLeft("host_serial_number",entity().getHostSerialNumber());
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * LIKE '值%'  entity().getHostSerialNumber()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberLikeRight(){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null){
            likeRight("host_serial_number",entity().getHostSerialNumber());
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 等于 =
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberEq(String hostSerialNumber){
        if(hostSerialNumber!=null){
            eq("host_serial_number",hostSerialNumber);
        }
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 不等于 &lt;&gt;
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberNe(String hostSerialNumber){
        if(hostSerialNumber!=null){
            ne("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 大于 &gt;
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberGt(String hostSerialNumber){
        if(hostSerialNumber!=null){
            gt("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 大于等于 &gt;=
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberGe(String hostSerialNumber){
        if(hostSerialNumber!=null){
            ge("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 小于 &lt;
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberLt(String hostSerialNumber){
        if(hostSerialNumber!=null){
            lt("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 小于等于 &lt;=
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberLe(String hostSerialNumber){
        if(hostSerialNumber!=null){
            le("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * LIKE '%值%'
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberLike(String hostSerialNumber){
        if(hostSerialNumber!=null){
            like("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * NOT LIKE '%值%'
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberNotLike(String hostSerialNumber){
        if(hostSerialNumber!=null){
            notLike("host_serial_number",hostSerialNumber);
        }
        return this;
     }


    /**
     * <p>实例所在物理宿主机编号</p>
     * LIKE '%值'
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberLikeLeft(String hostSerialNumber){
        if(hostSerialNumber!=null){
            likeLeft("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * LIKE '值%'
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberLikeRight(String hostSerialNumber){
        if(hostSerialNumber!=null){
            likeRight("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberIsNull(){
        isNull("host_serial_number");
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberIsNotNull(){
        isNotNull("host_serial_number");
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("host_serial_number",value);
        }
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberIn(String... values){
        if(values!=null && values.length>0){
            in("host_serial_number",values);
        }
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("host_serial_number",value);
        }
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper hostSerialNumberNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("host_serial_number",values);
        }
        return this;
    }


    /**
     * <p>实例特殊配置</p>
     * 等于 = entity().getDebugPropertiesString()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringEq(){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null){
            eq("debug_properties_string",debugPropertiesString);
        }
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * 不等于 &lt;&gt; entity().getDebugPropertiesString()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringNe(){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null){
            ne("debug_properties_string",entity().getDebugPropertiesString());
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 大于 &gt; entity().getDebugPropertiesString()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringGt(){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null){
            gt("debug_properties_string",entity().getDebugPropertiesString());
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 大于等于 &gt;= entity().getDebugPropertiesString()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringGe(){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null){
            ge("debug_properties_string",entity().getDebugPropertiesString());
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 小于 &lt; entity().getDebugPropertiesString()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringLt(){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null){
            lt("debug_properties_string",entity().getDebugPropertiesString());
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 小于等于 &lt;= entity().getDebugPropertiesString()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringLe(){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null){
            le("debug_properties_string",entity().getDebugPropertiesString());
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * BETWEEN  entity().getDebugPropertiesString() AND debugPropertiesStringEnd
     * @param debugPropertiesStringEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringBetween(String debugPropertiesStringEnd){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null && debugPropertiesStringEnd!=null){
            between("debug_properties_string",entity().getDebugPropertiesString(),debugPropertiesStringEnd);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * NOT BETWEEN  entity().getDebugPropertiesString() AND 值2
     * @param debugPropertiesStringEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringNotBetween(String debugPropertiesStringEnd){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null && debugPropertiesStringEnd!=null){
            notBetween("debug_properties_string",entity().getDebugPropertiesString(),debugPropertiesStringEnd);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * BETWEEN  entity().getDebugPropertiesString() AND 值2
     * @param debugPropertiesStringStart       值1
     * @param debugPropertiesStringEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringBetween(String debugPropertiesStringStart,String debugPropertiesStringEnd){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null && debugPropertiesStringEnd!=null){
            between("debug_properties_string",debugPropertiesStringStart,debugPropertiesStringEnd);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * NOT BETWEEN  entity().getDebugPropertiesString() AND 值2
     * @param debugPropertiesStringStart       值1
     * @param debugPropertiesStringEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringNotBetween(String debugPropertiesStringStart,String debugPropertiesStringEnd){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null && debugPropertiesStringEnd!=null){
            notBetween("debug_properties_string",debugPropertiesStringStart,debugPropertiesStringEnd);
        }
        return this;
     }


    /**
     * <p>实例特殊配置</p>
     * LIKE '%值%'  entity().getDebugPropertiesString()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringLike(){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null){
            like("debug_properties_string",entity().getDebugPropertiesString());
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * NOT LIKE '%值%'  entity().getDebugPropertiesString()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringNotLike(){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null){
            notLike("debug_properties_string",entity().getDebugPropertiesString());
        }
        return this;
     }


    /**
     * <p>实例特殊配置</p>
     * LIKE '%值'  entity().getDebugPropertiesString()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringLikeLeft(){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null){
            likeLeft("debug_properties_string",entity().getDebugPropertiesString());
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * LIKE '值%'  entity().getDebugPropertiesString()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringLikeRight(){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null){
            likeRight("debug_properties_string",entity().getDebugPropertiesString());
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 等于 =
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringEq(String debugPropertiesString){
        if(debugPropertiesString!=null){
            eq("debug_properties_string",debugPropertiesString);
        }
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * 不等于 &lt;&gt;
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringNe(String debugPropertiesString){
        if(debugPropertiesString!=null){
            ne("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 大于 &gt;
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringGt(String debugPropertiesString){
        if(debugPropertiesString!=null){
            gt("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 大于等于 &gt;=
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringGe(String debugPropertiesString){
        if(debugPropertiesString!=null){
            ge("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 小于 &lt;
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringLt(String debugPropertiesString){
        if(debugPropertiesString!=null){
            lt("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 小于等于 &lt;=
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringLe(String debugPropertiesString){
        if(debugPropertiesString!=null){
            le("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * LIKE '%值%'
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringLike(String debugPropertiesString){
        if(debugPropertiesString!=null){
            like("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * NOT LIKE '%值%'
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringNotLike(String debugPropertiesString){
        if(debugPropertiesString!=null){
            notLike("debug_properties_string",debugPropertiesString);
        }
        return this;
     }


    /**
     * <p>实例特殊配置</p>
     * LIKE '%值'
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringLikeLeft(String debugPropertiesString){
        if(debugPropertiesString!=null){
            likeLeft("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * LIKE '值%'
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringLikeRight(String debugPropertiesString){
        if(debugPropertiesString!=null){
            likeRight("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringIsNull(){
        isNull("debug_properties_string");
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringIsNotNull(){
        isNotNull("debug_properties_string");
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("debug_properties_string",value);
        }
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringIn(String... values){
        if(values!=null && values.length>0){
            in("debug_properties_string",values);
        }
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("debug_properties_string",value);
        }
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper debugPropertiesStringNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("debug_properties_string",values);
        }
        return this;
    }


    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper createTimeEq(){
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
    public TencentDeviceQueryEntityWrapper createTimeNe(){
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
    public TencentDeviceQueryEntityWrapper createTimeGt(){
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
    public TencentDeviceQueryEntityWrapper createTimeGe(){
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
    public TencentDeviceQueryEntityWrapper createTimeLt(){
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
    public TencentDeviceQueryEntityWrapper createTimeLe(){
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
    public TencentDeviceQueryEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public TencentDeviceQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public TencentDeviceQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentDeviceQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentDeviceQueryEntityWrapper createTimeLike(){
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
    public TencentDeviceQueryEntityWrapper createTimeNotLike(){
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
    public TencentDeviceQueryEntityWrapper createTimeLikeLeft(){
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
    public TencentDeviceQueryEntityWrapper createTimeLikeRight(){
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
    public TencentDeviceQueryEntityWrapper createTimeEq(Date createTime){
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
    public TencentDeviceQueryEntityWrapper createTimeNe(Date createTime){
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
    public TencentDeviceQueryEntityWrapper createTimeGt(Date createTime){
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
    public TencentDeviceQueryEntityWrapper createTimeGe(Date createTime){
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
    public TencentDeviceQueryEntityWrapper createTimeLt(Date createTime){
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
    public TencentDeviceQueryEntityWrapper createTimeLe(Date createTime){
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
    public TencentDeviceQueryEntityWrapper createTimeLike(Date createTime){
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
    public TencentDeviceQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public TencentDeviceQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public TencentDeviceQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public TencentDeviceQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public TencentDeviceQueryEntityWrapper createTimeIn(Date... values){
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
    public TencentDeviceQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentDeviceQueryEntityWrapper createTimeNotIn(Date... values){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeEq(){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeNe(){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeGt(){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeGe(){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeLt(){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeLe(){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeLike(){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeNotLike(){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeLikeLeft(){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeLikeRight(){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public TencentDeviceQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


    /**
     * <p>最后一次重置时间</p>
     * 等于 = entity().getLastResetTime()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeEq(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            eq("last_reset_time",lastResetTime);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 不等于 &lt;&gt; entity().getLastResetTime()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeNe(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            ne("last_reset_time",entity().getLastResetTime());
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 大于 &gt; entity().getLastResetTime()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeGt(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            gt("last_reset_time",entity().getLastResetTime());
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 大于等于 &gt;= entity().getLastResetTime()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeGe(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            ge("last_reset_time",entity().getLastResetTime());
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 小于 &lt; entity().getLastResetTime()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeLt(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            lt("last_reset_time",entity().getLastResetTime());
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 小于等于 &lt;= entity().getLastResetTime()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeLe(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            le("last_reset_time",entity().getLastResetTime());
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * BETWEEN  entity().getLastResetTime() AND lastResetTimeEnd
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeBetween(Date lastResetTimeEnd){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null && lastResetTimeEnd!=null){
            between("last_reset_time",entity().getLastResetTime(),lastResetTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT BETWEEN  entity().getLastResetTime() AND 值2
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeNotBetween(Date lastResetTimeEnd){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null && lastResetTimeEnd!=null){
            notBetween("last_reset_time",entity().getLastResetTime(),lastResetTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * BETWEEN  entity().getLastResetTime() AND 值2
     * @param lastResetTimeStart       值1
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeBetween(Date lastResetTimeStart,Date lastResetTimeEnd){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null && lastResetTimeEnd!=null){
            between("last_reset_time",lastResetTimeStart,lastResetTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT BETWEEN  entity().getLastResetTime() AND 值2
     * @param lastResetTimeStart       值1
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeNotBetween(Date lastResetTimeStart,Date lastResetTimeEnd){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null && lastResetTimeEnd!=null){
            notBetween("last_reset_time",lastResetTimeStart,lastResetTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值%'  entity().getLastResetTime()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeLike(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            like("last_reset_time",entity().getLastResetTime());
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT LIKE '%值%'  entity().getLastResetTime()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeNotLike(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            notLike("last_reset_time",entity().getLastResetTime());
        }
        return this;
     }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值'  entity().getLastResetTime()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeLikeLeft(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            likeLeft("last_reset_time",entity().getLastResetTime());
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * LIKE '值%'  entity().getLastResetTime()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeLikeRight(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            likeRight("last_reset_time",entity().getLastResetTime());
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 等于 =
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeEq(Date lastResetTime){
        if(lastResetTime!=null){
            eq("last_reset_time",lastResetTime);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 不等于 &lt;&gt;
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeNe(Date lastResetTime){
        if(lastResetTime!=null){
            ne("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 大于 &gt;
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeGt(Date lastResetTime){
        if(lastResetTime!=null){
            gt("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 大于等于 &gt;=
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeGe(Date lastResetTime){
        if(lastResetTime!=null){
            ge("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 小于 &lt;
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeLt(Date lastResetTime){
        if(lastResetTime!=null){
            lt("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 小于等于 &lt;=
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeLe(Date lastResetTime){
        if(lastResetTime!=null){
            le("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值%'
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeLike(Date lastResetTime){
        if(lastResetTime!=null){
            like("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT LIKE '%值%'
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeNotLike(Date lastResetTime){
        if(lastResetTime!=null){
            notLike("last_reset_time",lastResetTime);
        }
        return this;
     }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值'
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeLikeLeft(Date lastResetTime){
        if(lastResetTime!=null){
            likeLeft("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * LIKE '值%'
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeLikeRight(Date lastResetTime){
        if(lastResetTime!=null){
            likeRight("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeIsNull(){
        isNull("last_reset_time");
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeIsNotNull(){
        isNotNull("last_reset_time");
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_reset_time",value);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_reset_time",values);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_reset_time",value);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastResetTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_reset_time",values);
        }
        return this;
    }


    /**
     * <p>最后一次重置任务ID</p>
     * 等于 = entity().getLastTaskId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdEq(){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null){
            eq("last_task_id",lastTaskId);
        }
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * 不等于 &lt;&gt; entity().getLastTaskId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdNe(){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null){
            ne("last_task_id",entity().getLastTaskId());
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 大于 &gt; entity().getLastTaskId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdGt(){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null){
            gt("last_task_id",entity().getLastTaskId());
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 大于等于 &gt;= entity().getLastTaskId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdGe(){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null){
            ge("last_task_id",entity().getLastTaskId());
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 小于 &lt; entity().getLastTaskId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdLt(){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null){
            lt("last_task_id",entity().getLastTaskId());
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 小于等于 &lt;= entity().getLastTaskId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdLe(){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null){
            le("last_task_id",entity().getLastTaskId());
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * BETWEEN  entity().getLastTaskId() AND lastTaskIdEnd
     * @param lastTaskIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdBetween(String lastTaskIdEnd){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null && lastTaskIdEnd!=null){
            between("last_task_id",entity().getLastTaskId(),lastTaskIdEnd);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * NOT BETWEEN  entity().getLastTaskId() AND 值2
     * @param lastTaskIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdNotBetween(String lastTaskIdEnd){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null && lastTaskIdEnd!=null){
            notBetween("last_task_id",entity().getLastTaskId(),lastTaskIdEnd);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * BETWEEN  entity().getLastTaskId() AND 值2
     * @param lastTaskIdStart       值1
     * @param lastTaskIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdBetween(String lastTaskIdStart,String lastTaskIdEnd){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null && lastTaskIdEnd!=null){
            between("last_task_id",lastTaskIdStart,lastTaskIdEnd);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * NOT BETWEEN  entity().getLastTaskId() AND 值2
     * @param lastTaskIdStart       值1
     * @param lastTaskIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdNotBetween(String lastTaskIdStart,String lastTaskIdEnd){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null && lastTaskIdEnd!=null){
            notBetween("last_task_id",lastTaskIdStart,lastTaskIdEnd);
        }
        return this;
     }


    /**
     * <p>最后一次重置任务ID</p>
     * LIKE '%值%'  entity().getLastTaskId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdLike(){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null){
            like("last_task_id",entity().getLastTaskId());
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * NOT LIKE '%值%'  entity().getLastTaskId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdNotLike(){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null){
            notLike("last_task_id",entity().getLastTaskId());
        }
        return this;
     }


    /**
     * <p>最后一次重置任务ID</p>
     * LIKE '%值'  entity().getLastTaskId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdLikeLeft(){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null){
            likeLeft("last_task_id",entity().getLastTaskId());
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * LIKE '值%'  entity().getLastTaskId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdLikeRight(){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null){
            likeRight("last_task_id",entity().getLastTaskId());
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 等于 =
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdEq(String lastTaskId){
        if(lastTaskId!=null){
            eq("last_task_id",lastTaskId);
        }
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * 不等于 &lt;&gt;
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdNe(String lastTaskId){
        if(lastTaskId!=null){
            ne("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 大于 &gt;
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdGt(String lastTaskId){
        if(lastTaskId!=null){
            gt("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 大于等于 &gt;=
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdGe(String lastTaskId){
        if(lastTaskId!=null){
            ge("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 小于 &lt;
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdLt(String lastTaskId){
        if(lastTaskId!=null){
            lt("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 小于等于 &lt;=
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdLe(String lastTaskId){
        if(lastTaskId!=null){
            le("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * LIKE '%值%'
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdLike(String lastTaskId){
        if(lastTaskId!=null){
            like("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * NOT LIKE '%值%'
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdNotLike(String lastTaskId){
        if(lastTaskId!=null){
            notLike("last_task_id",lastTaskId);
        }
        return this;
     }


    /**
     * <p>最后一次重置任务ID</p>
     * LIKE '%值'
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdLikeLeft(String lastTaskId){
        if(lastTaskId!=null){
            likeLeft("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * LIKE '值%'
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdLikeRight(String lastTaskId){
        if(lastTaskId!=null){
            likeRight("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdIsNull(){
        isNull("last_task_id");
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdIsNotNull(){
        isNotNull("last_task_id");
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("last_task_id",value);
        }
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdIn(String... values){
        if(values!=null && values.length>0){
            in("last_task_id",values);
        }
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_task_id",value);
        }
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper lastTaskIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("last_task_id",values);
        }
        return this;
    }


    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 等于 = entity().getResetImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdEq(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            eq("reset_image_id",resetImageId);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 不等于 &lt;&gt; entity().getResetImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdNe(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            ne("reset_image_id",entity().getResetImageId());
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 大于 &gt; entity().getResetImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdGt(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            gt("reset_image_id",entity().getResetImageId());
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 大于等于 &gt;= entity().getResetImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdGe(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            ge("reset_image_id",entity().getResetImageId());
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 小于 &lt; entity().getResetImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdLt(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            lt("reset_image_id",entity().getResetImageId());
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 小于等于 &lt;= entity().getResetImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdLe(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            le("reset_image_id",entity().getResetImageId());
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * BETWEEN  entity().getResetImageId() AND resetImageIdEnd
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdBetween(String resetImageIdEnd){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null && resetImageIdEnd!=null){
            between("reset_image_id",entity().getResetImageId(),resetImageIdEnd);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * NOT BETWEEN  entity().getResetImageId() AND 值2
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdNotBetween(String resetImageIdEnd){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null && resetImageIdEnd!=null){
            notBetween("reset_image_id",entity().getResetImageId(),resetImageIdEnd);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * BETWEEN  entity().getResetImageId() AND 值2
     * @param resetImageIdStart       值1
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdBetween(String resetImageIdStart,String resetImageIdEnd){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null && resetImageIdEnd!=null){
            between("reset_image_id",resetImageIdStart,resetImageIdEnd);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * NOT BETWEEN  entity().getResetImageId() AND 值2
     * @param resetImageIdStart       值1
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdNotBetween(String resetImageIdStart,String resetImageIdEnd){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null && resetImageIdEnd!=null){
            notBetween("reset_image_id",resetImageIdStart,resetImageIdEnd);
        }
        return this;
     }


    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * LIKE '%值%'  entity().getResetImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdLike(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            like("reset_image_id",entity().getResetImageId());
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * NOT LIKE '%值%'  entity().getResetImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdNotLike(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            notLike("reset_image_id",entity().getResetImageId());
        }
        return this;
     }


    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * LIKE '%值'  entity().getResetImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdLikeLeft(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            likeLeft("reset_image_id",entity().getResetImageId());
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * LIKE '值%'  entity().getResetImageId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdLikeRight(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            likeRight("reset_image_id",entity().getResetImageId());
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 等于 =
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdEq(String resetImageId){
        if(resetImageId!=null){
            eq("reset_image_id",resetImageId);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 不等于 &lt;&gt;
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdNe(String resetImageId){
        if(resetImageId!=null){
            ne("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 大于 &gt;
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdGt(String resetImageId){
        if(resetImageId!=null){
            gt("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 大于等于 &gt;=
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdGe(String resetImageId){
        if(resetImageId!=null){
            ge("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 小于 &lt;
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdLt(String resetImageId){
        if(resetImageId!=null){
            lt("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 小于等于 &lt;=
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdLe(String resetImageId){
        if(resetImageId!=null){
            le("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * LIKE '%值%'
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdLike(String resetImageId){
        if(resetImageId!=null){
            like("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * NOT LIKE '%值%'
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdNotLike(String resetImageId){
        if(resetImageId!=null){
            notLike("reset_image_id",resetImageId);
        }
        return this;
     }


    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * LIKE '%值'
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdLikeLeft(String resetImageId){
        if(resetImageId!=null){
            likeLeft("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * LIKE '值%'
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdLikeRight(String resetImageId){
        if(resetImageId!=null){
            likeRight("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdIsNull(){
        isNull("reset_image_id");
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdIsNotNull(){
        isNotNull("reset_image_id");
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("reset_image_id",value);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdIn(String... values){
        if(values!=null && values.length>0){
            in("reset_image_id",values);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_image_id",value);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper resetImageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_image_id",values);
        }
        return this;
    }


    /**
     * <p>云机ID=实例 ID的小写</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdEq(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 不等于 &lt;&gt; entity().getDeviceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdNe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ne("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 大于 &gt; entity().getDeviceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdGt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            gt("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 大于等于 &gt;= entity().getDeviceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdGe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ge("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 小于 &lt; entity().getDeviceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdLt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            lt("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 小于等于 &lt;= entity().getDeviceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * BETWEEN  entity().getDeviceId() AND deviceIdEnd
     * @param deviceIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",entity().getDeviceId(),deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdNotBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",entity().getDeviceId(),deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>云机ID=实例 ID的小写</p>
     * LIKE '%值%'  entity().getDeviceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * NOT LIKE '%值%'  entity().getDeviceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",entity().getDeviceId());
        }
        return this;
     }


    /**
     * <p>云机ID=实例 ID的小写</p>
     * LIKE '%值'  entity().getDeviceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * LIKE '值%'  entity().getDeviceId()
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdLikeRight(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeRight("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 不等于 &lt;&gt;
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 大于 &gt;
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 大于等于 &gt;=
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 小于 &lt;
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 小于等于 &lt;=
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * NOT LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>云机ID=实例 ID的小写</p>
     * LIKE '%值'
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * LIKE '值%'
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdLikeRight(String deviceId){
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * IS NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_id",value);
        }
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("device_id",values);
        }
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_id",value);
        }
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentDeviceQueryEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }



}
