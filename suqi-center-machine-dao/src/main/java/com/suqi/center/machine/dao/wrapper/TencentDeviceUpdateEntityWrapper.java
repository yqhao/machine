package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.TencentDevice;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 腾讯设备表
 * </p>
 * "tencent_device"
 * @author PC001
 * @since 2023-06-14
 */
public class TencentDeviceUpdateEntityWrapper extends UpdateWrapper<TencentDevice> {

    public static TencentDeviceUpdateEntityWrapper wrapper(TencentDevice entity) {
        return new TencentDeviceUpdateEntityWrapper(entity);
    }

    private TencentDevice entity;

    public TencentDeviceUpdateEntityWrapper(TencentDevice entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public TencentDeviceUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 腾讯账号区域Id
     */
    public TencentDeviceUpdateEntityWrapper setFkTencentAccountAreaId(Long fkTencentAccountAreaId) {
         set("fk_tencent_account_area_id",fkTencentAccountAreaId);
        return this;
    }
    /**
     * 实例 ID
     */
    public TencentDeviceUpdateEntityWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 实例所在区域
     */
    public TencentDeviceUpdateEntityWrapper setRegion(String region) {
         set("region",region);
        return this;
    }
    /**
     * 当前实例所使用的镜像
     */
    public TencentDeviceUpdateEntityWrapper setImageId(String imageId) {
         set("image_id",imageId);
        return this;
    }
    /**
     * 实例类型
     */
    public TencentDeviceUpdateEntityWrapper setInstanceType(String instanceType) {
         set("instance_type",instanceType);
        return this;
    }
    /**
     * 实例内网 IP
     */
    public TencentDeviceUpdateEntityWrapper setIp(String ip) {
         set("ip",ip);
        return this;
    }
    /**
     * 实例所在物理宿主机编号
     */
    public TencentDeviceUpdateEntityWrapper setHostSerialNumber(String hostSerialNumber) {
         set("host_serial_number",hostSerialNumber);
        return this;
    }
    /**
     * 实例特殊配置
     */
    public TencentDeviceUpdateEntityWrapper setDebugPropertiesString(String debugPropertiesString) {
         set("debug_properties_string",debugPropertiesString);
        return this;
    }
    /**
     * 创建时间
     */
    public TencentDeviceUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public TencentDeviceUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 最后一次重置时间
     */
    public TencentDeviceUpdateEntityWrapper setLastResetTime(Date lastResetTime) {
         set("last_reset_time",lastResetTime);
        return this;
    }
    /**
     * 最后一次重置任务ID
     */
    public TencentDeviceUpdateEntityWrapper setLastTaskId(String lastTaskId) {
         set("last_task_id",lastTaskId);
        return this;
    }
    /**
     * 重置使用的镜像id不配置时使用image_id当前云机使用的镜像id
     */
    public TencentDeviceUpdateEntityWrapper setResetImageId(String resetImageId) {
         set("reset_image_id",resetImageId);
        return this;
    }
    /**
     * 云机ID=实例 ID的小写
     */
    public TencentDeviceUpdateEntityWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }

    protected TencentDevice entity() {
        if(entity==null){
            throw new NullPointerException("TencentDevice is null");
        }
        return entity;
    }

    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper idEq(){
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
    public TencentDeviceUpdateEntityWrapper idNe(){
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
    public TencentDeviceUpdateEntityWrapper idGt(){
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
    public TencentDeviceUpdateEntityWrapper idGe(){
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
    public TencentDeviceUpdateEntityWrapper idLt(){
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
    public TencentDeviceUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper idBetween(Long idEnd){
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
    public TencentDeviceUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public TencentDeviceUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentDeviceUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",entity().getId());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper idLikeRight(){
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
    public TencentDeviceUpdateEntityWrapper idEq(Long id){
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
    public TencentDeviceUpdateEntityWrapper idNe(Long id){
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
    public TencentDeviceUpdateEntityWrapper idGt(Long id){
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
    public TencentDeviceUpdateEntityWrapper idGe(Long id){
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
    public TencentDeviceUpdateEntityWrapper idLt(Long id){
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
    public TencentDeviceUpdateEntityWrapper idLe(Long id){
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
    public TencentDeviceUpdateEntityWrapper idLike(Long id){
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
    public TencentDeviceUpdateEntityWrapper idNotLike(Long id){
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
    public TencentDeviceUpdateEntityWrapper idLikeLeft(Long id){
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
    public TencentDeviceUpdateEntityWrapper idLikeRight(Long id){
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
    public TencentDeviceUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper idIn(Collection<Long> value){
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
    public TencentDeviceUpdateEntityWrapper idIn(Long... values){
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
    public TencentDeviceUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public TencentDeviceUpdateEntityWrapper idNotIn(Long... values){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdEq(){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdNe(){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdGt(){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdGe(){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdLt(){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdLe(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            le("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * BETWEEN  entity().getFkTencentAccountAreaId() AND 值2
     * @param fkTencentAccountAreaIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdBetween(Long fkTencentAccountAreaIdEnd){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdNotBetween(Long fkTencentAccountAreaIdEnd){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdBetween(Long fkTencentAccountAreaIdStart,Long fkTencentAccountAreaIdEnd){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdNotBetween(Long fkTencentAccountAreaIdStart,Long fkTencentAccountAreaIdEnd){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null && fkTencentAccountAreaIdEnd!=null){
            notBetween("fk_tencent_account_area_id",fkTencentAccountAreaIdStart,fkTencentAccountAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '%值%' entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdLike(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            like("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT LIKE '%值%' entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdNotLike(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            notLike("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }


    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '%值' entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdLikeLeft(){
        Long fkTencentAccountAreaId =entity().getFkTencentAccountAreaId();
        if(fkTencentAccountAreaId!=null){
            likeLeft("fk_tencent_account_area_id",entity().getFkTencentAccountAreaId());
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '值%' entity().getFkTencentAccountAreaId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdLikeRight(){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdEq(Long fkTencentAccountAreaId){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdNe(Long fkTencentAccountAreaId){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdGt(Long fkTencentAccountAreaId){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdGe(Long fkTencentAccountAreaId){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdLt(Long fkTencentAccountAreaId){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdLe(Long fkTencentAccountAreaId){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdLike(Long fkTencentAccountAreaId){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdNotLike(Long fkTencentAccountAreaId){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdLikeLeft(Long fkTencentAccountAreaId){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdLikeRight(Long fkTencentAccountAreaId){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdIsNull(){
        isNull("fk_tencent_account_area_id");
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdIsNotNull(){
        isNotNull("fk_tencent_account_area_id");
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdIn(Collection<Long> value){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdIn(Long... values){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdNotIn(Collection<Long> value){
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
    public TencentDeviceUpdateEntityWrapper fkTencentAccountAreaIdNotIn(Long... values){
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
    public TencentDeviceUpdateEntityWrapper instanceIdEq(){
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
    public TencentDeviceUpdateEntityWrapper instanceIdNe(){
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
    public TencentDeviceUpdateEntityWrapper instanceIdGt(){
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
    public TencentDeviceUpdateEntityWrapper instanceIdGe(){
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
    public TencentDeviceUpdateEntityWrapper instanceIdLt(){
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
    public TencentDeviceUpdateEntityWrapper instanceIdLe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            le("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper instanceIdBetween(String instanceIdEnd){
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
    public TencentDeviceUpdateEntityWrapper instanceIdNotBetween(String instanceIdEnd){
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
    public TencentDeviceUpdateEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
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
    public TencentDeviceUpdateEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例 ID</p>
     * LIKE '%值%' entity().getInstanceId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper instanceIdLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            like("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * NOT LIKE '%值%' entity().getInstanceId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper instanceIdNotLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            notLike("instance_id",entity().getInstanceId());
        }
        return this;
     }


    /**
     * <p>实例 ID</p>
     * LIKE '%值' entity().getInstanceId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper instanceIdLikeLeft(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeLeft("instance_id",entity().getInstanceId());
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * LIKE '值%' entity().getInstanceId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper instanceIdLikeRight(){
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
    public TencentDeviceUpdateEntityWrapper instanceIdEq(String instanceId){
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
    public TencentDeviceUpdateEntityWrapper instanceIdNe(String instanceId){
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
    public TencentDeviceUpdateEntityWrapper instanceIdGt(String instanceId){
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
    public TencentDeviceUpdateEntityWrapper instanceIdGe(String instanceId){
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
    public TencentDeviceUpdateEntityWrapper instanceIdLt(String instanceId){
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
    public TencentDeviceUpdateEntityWrapper instanceIdLe(String instanceId){
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
    public TencentDeviceUpdateEntityWrapper instanceIdLike(String instanceId){
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
    public TencentDeviceUpdateEntityWrapper instanceIdNotLike(String instanceId){
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
    public TencentDeviceUpdateEntityWrapper instanceIdLikeLeft(String instanceId){
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
    public TencentDeviceUpdateEntityWrapper instanceIdLikeRight(String instanceId){
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
    public TencentDeviceUpdateEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例 ID</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例 ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper instanceIdIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper instanceIdIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper instanceIdNotIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper instanceIdNotIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper regionEq(){
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
    public TencentDeviceUpdateEntityWrapper regionNe(){
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
    public TencentDeviceUpdateEntityWrapper regionGt(){
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
    public TencentDeviceUpdateEntityWrapper regionGe(){
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
    public TencentDeviceUpdateEntityWrapper regionLt(){
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
    public TencentDeviceUpdateEntityWrapper regionLe(){
        String region =entity().getRegion();
        if(region!=null){
            le("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * BETWEEN  entity().getRegion() AND 值2
     * @param regionEnd      值2
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper regionBetween(String regionEnd){
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
    public TencentDeviceUpdateEntityWrapper regionNotBetween(String regionEnd){
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
    public TencentDeviceUpdateEntityWrapper regionBetween(String regionStart,String regionEnd){
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
    public TencentDeviceUpdateEntityWrapper regionNotBetween(String regionStart,String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            notBetween("region",regionStart,regionEnd);
        }
        return this;
     }


    /**
     * <p>实例所在区域</p>
     * LIKE '%值%' entity().getRegion()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper regionLike(){
        String region =entity().getRegion();
        if(region!=null){
            like("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * NOT LIKE '%值%' entity().getRegion()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper regionNotLike(){
        String region =entity().getRegion();
        if(region!=null){
            notLike("region",entity().getRegion());
        }
        return this;
     }


    /**
     * <p>实例所在区域</p>
     * LIKE '%值' entity().getRegion()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper regionLikeLeft(){
        String region =entity().getRegion();
        if(region!=null){
            likeLeft("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * LIKE '值%' entity().getRegion()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper regionLikeRight(){
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
    public TencentDeviceUpdateEntityWrapper regionEq(String region){
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
    public TencentDeviceUpdateEntityWrapper regionNe(String region){
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
    public TencentDeviceUpdateEntityWrapper regionGt(String region){
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
    public TencentDeviceUpdateEntityWrapper regionGe(String region){
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
    public TencentDeviceUpdateEntityWrapper regionLt(String region){
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
    public TencentDeviceUpdateEntityWrapper regionLe(String region){
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
    public TencentDeviceUpdateEntityWrapper regionLike(String region){
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
    public TencentDeviceUpdateEntityWrapper regionNotLike(String region){
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
    public TencentDeviceUpdateEntityWrapper regionLikeLeft(String region){
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
    public TencentDeviceUpdateEntityWrapper regionLikeRight(String region){
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
    public TencentDeviceUpdateEntityWrapper regionIsNull(){
        isNull("region");
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper regionIsNotNull(){
        isNotNull("region");
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper regionIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper regionIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper regionNotIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper regionNotIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper imageIdEq(){
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
    public TencentDeviceUpdateEntityWrapper imageIdNe(){
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
    public TencentDeviceUpdateEntityWrapper imageIdGt(){
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
    public TencentDeviceUpdateEntityWrapper imageIdGe(){
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
    public TencentDeviceUpdateEntityWrapper imageIdLt(){
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
    public TencentDeviceUpdateEntityWrapper imageIdLe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            le("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * BETWEEN  entity().getImageId() AND 值2
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper imageIdBetween(String imageIdEnd){
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
    public TencentDeviceUpdateEntityWrapper imageIdNotBetween(String imageIdEnd){
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
    public TencentDeviceUpdateEntityWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
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
    public TencentDeviceUpdateEntityWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            notBetween("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>当前实例所使用的镜像</p>
     * LIKE '%值%' entity().getImageId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper imageIdLike(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            like("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * NOT LIKE '%值%' entity().getImageId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper imageIdNotLike(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            notLike("image_id",entity().getImageId());
        }
        return this;
     }


    /**
     * <p>当前实例所使用的镜像</p>
     * LIKE '%值' entity().getImageId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper imageIdLikeLeft(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            likeLeft("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * LIKE '值%' entity().getImageId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper imageIdLikeRight(){
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
    public TencentDeviceUpdateEntityWrapper imageIdEq(String imageId){
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
    public TencentDeviceUpdateEntityWrapper imageIdNe(String imageId){
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
    public TencentDeviceUpdateEntityWrapper imageIdGt(String imageId){
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
    public TencentDeviceUpdateEntityWrapper imageIdGe(String imageId){
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
    public TencentDeviceUpdateEntityWrapper imageIdLt(String imageId){
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
    public TencentDeviceUpdateEntityWrapper imageIdLe(String imageId){
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
    public TencentDeviceUpdateEntityWrapper imageIdLike(String imageId){
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
    public TencentDeviceUpdateEntityWrapper imageIdNotLike(String imageId){
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
    public TencentDeviceUpdateEntityWrapper imageIdLikeLeft(String imageId){
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
    public TencentDeviceUpdateEntityWrapper imageIdLikeRight(String imageId){
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
    public TencentDeviceUpdateEntityWrapper imageIdIsNull(){
        isNull("image_id");
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper imageIdIsNotNull(){
        isNotNull("image_id");
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper imageIdIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper imageIdIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper imageIdNotIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper imageIdNotIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeEq(){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeNe(){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeGt(){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeGe(){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeLt(){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeLe(){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null){
            le("instance_type",entity().getInstanceType());
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * BETWEEN  entity().getInstanceType() AND 值2
     * @param instanceTypeEnd      值2
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper instanceTypeBetween(String instanceTypeEnd){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeNotBetween(String instanceTypeEnd){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeBetween(String instanceTypeStart,String instanceTypeEnd){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeNotBetween(String instanceTypeStart,String instanceTypeEnd){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null && instanceTypeEnd!=null){
            notBetween("instance_type",instanceTypeStart,instanceTypeEnd);
        }
        return this;
     }


    /**
     * <p>实例类型</p>
     * LIKE '%值%' entity().getInstanceType()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper instanceTypeLike(){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null){
            like("instance_type",entity().getInstanceType());
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * NOT LIKE '%值%' entity().getInstanceType()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper instanceTypeNotLike(){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null){
            notLike("instance_type",entity().getInstanceType());
        }
        return this;
     }


    /**
     * <p>实例类型</p>
     * LIKE '%值' entity().getInstanceType()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper instanceTypeLikeLeft(){
        String instanceType =entity().getInstanceType();
        if(instanceType!=null){
            likeLeft("instance_type",entity().getInstanceType());
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * LIKE '值%' entity().getInstanceType()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper instanceTypeLikeRight(){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeEq(String instanceType){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeNe(String instanceType){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeGt(String instanceType){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeGe(String instanceType){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeLt(String instanceType){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeLe(String instanceType){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeLike(String instanceType){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeNotLike(String instanceType){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeLikeLeft(String instanceType){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeLikeRight(String instanceType){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeIsNull(){
        isNull("instance_type");
        return this;
    }

    /**
     * <p>实例类型</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper instanceTypeIsNotNull(){
        isNotNull("instance_type");
        return this;
    }

    /**
     * <p>实例类型</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper instanceTypeIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeNotIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper instanceTypeNotIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper ipEq(){
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
    public TencentDeviceUpdateEntityWrapper ipNe(){
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
    public TencentDeviceUpdateEntityWrapper ipGt(){
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
    public TencentDeviceUpdateEntityWrapper ipGe(){
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
    public TencentDeviceUpdateEntityWrapper ipLt(){
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
    public TencentDeviceUpdateEntityWrapper ipLe(){
        String ip =entity().getIp();
        if(ip!=null){
            le("ip",entity().getIp());
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * BETWEEN  entity().getIp() AND 值2
     * @param ipEnd      值2
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper ipBetween(String ipEnd){
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
    public TencentDeviceUpdateEntityWrapper ipNotBetween(String ipEnd){
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
    public TencentDeviceUpdateEntityWrapper ipBetween(String ipStart,String ipEnd){
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
    public TencentDeviceUpdateEntityWrapper ipNotBetween(String ipStart,String ipEnd){
        String ip =entity().getIp();
        if(ip!=null && ipEnd!=null){
            notBetween("ip",ipStart,ipEnd);
        }
        return this;
     }


    /**
     * <p>实例内网 IP</p>
     * LIKE '%值%' entity().getIp()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper ipLike(){
        String ip =entity().getIp();
        if(ip!=null){
            like("ip",entity().getIp());
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * NOT LIKE '%值%' entity().getIp()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper ipNotLike(){
        String ip =entity().getIp();
        if(ip!=null){
            notLike("ip",entity().getIp());
        }
        return this;
     }


    /**
     * <p>实例内网 IP</p>
     * LIKE '%值' entity().getIp()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper ipLikeLeft(){
        String ip =entity().getIp();
        if(ip!=null){
            likeLeft("ip",entity().getIp());
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * LIKE '值%' entity().getIp()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper ipLikeRight(){
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
    public TencentDeviceUpdateEntityWrapper ipEq(String ip){
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
    public TencentDeviceUpdateEntityWrapper ipNe(String ip){
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
    public TencentDeviceUpdateEntityWrapper ipGt(String ip){
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
    public TencentDeviceUpdateEntityWrapper ipGe(String ip){
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
    public TencentDeviceUpdateEntityWrapper ipLt(String ip){
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
    public TencentDeviceUpdateEntityWrapper ipLe(String ip){
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
    public TencentDeviceUpdateEntityWrapper ipLike(String ip){
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
    public TencentDeviceUpdateEntityWrapper ipNotLike(String ip){
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
    public TencentDeviceUpdateEntityWrapper ipLikeLeft(String ip){
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
    public TencentDeviceUpdateEntityWrapper ipLikeRight(String ip){
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
    public TencentDeviceUpdateEntityWrapper ipIsNull(){
        isNull("ip");
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper ipIsNotNull(){
        isNotNull("ip");
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper ipIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper ipIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper ipNotIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper ipNotIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberEq(){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberNe(){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberGt(){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberGe(){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberLt(){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberLe(){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null){
            le("host_serial_number",entity().getHostSerialNumber());
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * BETWEEN  entity().getHostSerialNumber() AND 值2
     * @param hostSerialNumberEnd      值2
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper hostSerialNumberBetween(String hostSerialNumberEnd){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberNotBetween(String hostSerialNumberEnd){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberBetween(String hostSerialNumberStart,String hostSerialNumberEnd){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberNotBetween(String hostSerialNumberStart,String hostSerialNumberEnd){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null && hostSerialNumberEnd!=null){
            notBetween("host_serial_number",hostSerialNumberStart,hostSerialNumberEnd);
        }
        return this;
     }


    /**
     * <p>实例所在物理宿主机编号</p>
     * LIKE '%值%' entity().getHostSerialNumber()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper hostSerialNumberLike(){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null){
            like("host_serial_number",entity().getHostSerialNumber());
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * NOT LIKE '%值%' entity().getHostSerialNumber()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper hostSerialNumberNotLike(){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null){
            notLike("host_serial_number",entity().getHostSerialNumber());
        }
        return this;
     }


    /**
     * <p>实例所在物理宿主机编号</p>
     * LIKE '%值' entity().getHostSerialNumber()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper hostSerialNumberLikeLeft(){
        String hostSerialNumber =entity().getHostSerialNumber();
        if(hostSerialNumber!=null){
            likeLeft("host_serial_number",entity().getHostSerialNumber());
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * LIKE '值%' entity().getHostSerialNumber()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper hostSerialNumberLikeRight(){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberEq(String hostSerialNumber){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberNe(String hostSerialNumber){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberGt(String hostSerialNumber){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberGe(String hostSerialNumber){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberLt(String hostSerialNumber){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberLe(String hostSerialNumber){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberLike(String hostSerialNumber){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberNotLike(String hostSerialNumber){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberLikeLeft(String hostSerialNumber){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberLikeRight(String hostSerialNumber){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberIsNull(){
        isNull("host_serial_number");
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper hostSerialNumberIsNotNull(){
        isNotNull("host_serial_number");
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper hostSerialNumberIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberNotIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper hostSerialNumberNotIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringEq(){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringNe(){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringGt(){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringGe(){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringLt(){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringLe(){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null){
            le("debug_properties_string",entity().getDebugPropertiesString());
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * BETWEEN  entity().getDebugPropertiesString() AND 值2
     * @param debugPropertiesStringEnd      值2
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringBetween(String debugPropertiesStringEnd){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringNotBetween(String debugPropertiesStringEnd){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringBetween(String debugPropertiesStringStart,String debugPropertiesStringEnd){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringNotBetween(String debugPropertiesStringStart,String debugPropertiesStringEnd){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null && debugPropertiesStringEnd!=null){
            notBetween("debug_properties_string",debugPropertiesStringStart,debugPropertiesStringEnd);
        }
        return this;
     }


    /**
     * <p>实例特殊配置</p>
     * LIKE '%值%' entity().getDebugPropertiesString()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringLike(){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null){
            like("debug_properties_string",entity().getDebugPropertiesString());
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * NOT LIKE '%值%' entity().getDebugPropertiesString()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringNotLike(){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null){
            notLike("debug_properties_string",entity().getDebugPropertiesString());
        }
        return this;
     }


    /**
     * <p>实例特殊配置</p>
     * LIKE '%值' entity().getDebugPropertiesString()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringLikeLeft(){
        String debugPropertiesString =entity().getDebugPropertiesString();
        if(debugPropertiesString!=null){
            likeLeft("debug_properties_string",entity().getDebugPropertiesString());
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * LIKE '值%' entity().getDebugPropertiesString()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringLikeRight(){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringEq(String debugPropertiesString){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringNe(String debugPropertiesString){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringGt(String debugPropertiesString){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringGe(String debugPropertiesString){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringLt(String debugPropertiesString){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringLe(String debugPropertiesString){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringLike(String debugPropertiesString){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringNotLike(String debugPropertiesString){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringLikeLeft(String debugPropertiesString){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringLikeRight(String debugPropertiesString){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringIsNull(){
        isNull("debug_properties_string");
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringIsNotNull(){
        isNotNull("debug_properties_string");
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringNotIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper debugPropertiesStringNotIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper createTimeEq(){
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
    public TencentDeviceUpdateEntityWrapper createTimeNe(){
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
    public TencentDeviceUpdateEntityWrapper createTimeGt(){
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
    public TencentDeviceUpdateEntityWrapper createTimeGe(){
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
    public TencentDeviceUpdateEntityWrapper createTimeLt(){
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
    public TencentDeviceUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public TencentDeviceUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public TencentDeviceUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentDeviceUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",entity().getCreateTime());
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper createTimeLikeRight(){
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
    public TencentDeviceUpdateEntityWrapper createTimeEq(Date createTime){
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
    public TencentDeviceUpdateEntityWrapper createTimeNe(Date createTime){
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
    public TencentDeviceUpdateEntityWrapper createTimeGt(Date createTime){
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
    public TencentDeviceUpdateEntityWrapper createTimeGe(Date createTime){
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
    public TencentDeviceUpdateEntityWrapper createTimeLt(Date createTime){
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
    public TencentDeviceUpdateEntityWrapper createTimeLe(Date createTime){
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
    public TencentDeviceUpdateEntityWrapper createTimeLike(Date createTime){
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
    public TencentDeviceUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public TencentDeviceUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public TencentDeviceUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public TencentDeviceUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public TencentDeviceUpdateEntityWrapper createTimeIn(Date... values){
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
    public TencentDeviceUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentDeviceUpdateEntityWrapper createTimeNotIn(Date... values){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeEq(){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeNe(){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeGt(){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeGe(){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeLt(){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值' entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%' entity().getLastUpdateTime()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeLikeRight(){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public TencentDeviceUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeEq(){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeNe(){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeGt(){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeGe(){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeLt(){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeLe(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            le("last_reset_time",entity().getLastResetTime());
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * BETWEEN  entity().getLastResetTime() AND 值2
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastResetTimeBetween(Date lastResetTimeEnd){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeNotBetween(Date lastResetTimeEnd){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeBetween(Date lastResetTimeStart,Date lastResetTimeEnd){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeNotBetween(Date lastResetTimeStart,Date lastResetTimeEnd){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null && lastResetTimeEnd!=null){
            notBetween("last_reset_time",lastResetTimeStart,lastResetTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值%' entity().getLastResetTime()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastResetTimeLike(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            like("last_reset_time",entity().getLastResetTime());
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT LIKE '%值%' entity().getLastResetTime()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastResetTimeNotLike(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            notLike("last_reset_time",entity().getLastResetTime());
        }
        return this;
     }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值' entity().getLastResetTime()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastResetTimeLikeLeft(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            likeLeft("last_reset_time",entity().getLastResetTime());
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * LIKE '值%' entity().getLastResetTime()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastResetTimeLikeRight(){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeEq(Date lastResetTime){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeNe(Date lastResetTime){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeGt(Date lastResetTime){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeGe(Date lastResetTime){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeLt(Date lastResetTime){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeLe(Date lastResetTime){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeLike(Date lastResetTime){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeNotLike(Date lastResetTime){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeLikeLeft(Date lastResetTime){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeLikeRight(Date lastResetTime){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeIsNull(){
        isNull("last_reset_time");
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastResetTimeIsNotNull(){
        isNotNull("last_reset_time");
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastResetTimeIn(Collection<Date> value){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeIn(Date... values){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeNotIn(Collection<Date> value){
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
    public TencentDeviceUpdateEntityWrapper lastResetTimeNotIn(Date... values){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdEq(){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdNe(){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdGt(){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdGe(){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdLt(){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdLe(){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null){
            le("last_task_id",entity().getLastTaskId());
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * BETWEEN  entity().getLastTaskId() AND 值2
     * @param lastTaskIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastTaskIdBetween(String lastTaskIdEnd){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdNotBetween(String lastTaskIdEnd){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdBetween(String lastTaskIdStart,String lastTaskIdEnd){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdNotBetween(String lastTaskIdStart,String lastTaskIdEnd){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null && lastTaskIdEnd!=null){
            notBetween("last_task_id",lastTaskIdStart,lastTaskIdEnd);
        }
        return this;
     }


    /**
     * <p>最后一次重置任务ID</p>
     * LIKE '%值%' entity().getLastTaskId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastTaskIdLike(){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null){
            like("last_task_id",entity().getLastTaskId());
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * NOT LIKE '%值%' entity().getLastTaskId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastTaskIdNotLike(){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null){
            notLike("last_task_id",entity().getLastTaskId());
        }
        return this;
     }


    /**
     * <p>最后一次重置任务ID</p>
     * LIKE '%值' entity().getLastTaskId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastTaskIdLikeLeft(){
        String lastTaskId =entity().getLastTaskId();
        if(lastTaskId!=null){
            likeLeft("last_task_id",entity().getLastTaskId());
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * LIKE '值%' entity().getLastTaskId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastTaskIdLikeRight(){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdEq(String lastTaskId){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdNe(String lastTaskId){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdGt(String lastTaskId){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdGe(String lastTaskId){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdLt(String lastTaskId){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdLe(String lastTaskId){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdLike(String lastTaskId){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdNotLike(String lastTaskId){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdLikeLeft(String lastTaskId){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdLikeRight(String lastTaskId){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdIsNull(){
        isNull("last_task_id");
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastTaskIdIsNotNull(){
        isNotNull("last_task_id");
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper lastTaskIdIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdNotIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper lastTaskIdNotIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdEq(){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdNe(){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdGt(){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdGe(){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdLt(){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdLe(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            le("reset_image_id",entity().getResetImageId());
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * BETWEEN  entity().getResetImageId() AND 值2
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper resetImageIdBetween(String resetImageIdEnd){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdNotBetween(String resetImageIdEnd){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdBetween(String resetImageIdStart,String resetImageIdEnd){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdNotBetween(String resetImageIdStart,String resetImageIdEnd){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null && resetImageIdEnd!=null){
            notBetween("reset_image_id",resetImageIdStart,resetImageIdEnd);
        }
        return this;
     }


    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * LIKE '%值%' entity().getResetImageId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper resetImageIdLike(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            like("reset_image_id",entity().getResetImageId());
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * NOT LIKE '%值%' entity().getResetImageId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper resetImageIdNotLike(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            notLike("reset_image_id",entity().getResetImageId());
        }
        return this;
     }


    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * LIKE '%值' entity().getResetImageId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper resetImageIdLikeLeft(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            likeLeft("reset_image_id",entity().getResetImageId());
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * LIKE '值%' entity().getResetImageId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper resetImageIdLikeRight(){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdEq(String resetImageId){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdNe(String resetImageId){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdGt(String resetImageId){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdGe(String resetImageId){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdLt(String resetImageId){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdLe(String resetImageId){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdLike(String resetImageId){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdNotLike(String resetImageId){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdLikeLeft(String resetImageId){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdLikeRight(String resetImageId){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdIsNull(){
        isNull("reset_image_id");
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper resetImageIdIsNotNull(){
        isNotNull("reset_image_id");
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper resetImageIdIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdNotIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper resetImageIdNotIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper deviceIdEq(){
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
    public TencentDeviceUpdateEntityWrapper deviceIdNe(){
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
    public TencentDeviceUpdateEntityWrapper deviceIdGt(){
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
    public TencentDeviceUpdateEntityWrapper deviceIdGe(){
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
    public TencentDeviceUpdateEntityWrapper deviceIdLt(){
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
    public TencentDeviceUpdateEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public TencentDeviceUpdateEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public TencentDeviceUpdateEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public TencentDeviceUpdateEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>云机ID=实例 ID的小写</p>
     * LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * NOT LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",entity().getDeviceId());
        }
        return this;
     }


    /**
     * <p>云机ID=实例 ID的小写</p>
     * LIKE '%值' entity().getDeviceId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",entity().getDeviceId());
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * LIKE '值%' entity().getDeviceId()
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper deviceIdLikeRight(){
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
    public TencentDeviceUpdateEntityWrapper deviceIdEq(String deviceId){
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
    public TencentDeviceUpdateEntityWrapper deviceIdNe(String deviceId){
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
    public TencentDeviceUpdateEntityWrapper deviceIdGt(String deviceId){
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
    public TencentDeviceUpdateEntityWrapper deviceIdGe(String deviceId){
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
    public TencentDeviceUpdateEntityWrapper deviceIdLt(String deviceId){
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
    public TencentDeviceUpdateEntityWrapper deviceIdLe(String deviceId){
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
    public TencentDeviceUpdateEntityWrapper deviceIdLike(String deviceId){
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
    public TencentDeviceUpdateEntityWrapper deviceIdNotLike(String deviceId){
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
    public TencentDeviceUpdateEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public TencentDeviceUpdateEntityWrapper deviceIdLikeRight(String deviceId){
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
    public TencentDeviceUpdateEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateEntityWrapper deviceIdIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper deviceIdIn(String... values){
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
    public TencentDeviceUpdateEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public TencentDeviceUpdateEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }


}
