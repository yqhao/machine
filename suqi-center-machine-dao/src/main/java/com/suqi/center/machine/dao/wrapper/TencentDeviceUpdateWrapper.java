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
public class TencentDeviceUpdateWrapper extends UpdateWrapper<TencentDevice> {

    public static TencentDeviceUpdateWrapper wrapper() {
        return new TencentDeviceUpdateWrapper();
    }

    public TencentDeviceUpdateWrapper() {
        super();
    }

    public TencentDeviceUpdateWrapper(TencentDevice entity) {
        super(entity);
    }

    /**
     * 
     */
    public TencentDeviceUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 腾讯账号区域Id
     */
    public TencentDeviceUpdateWrapper setFkTencentAccountAreaId(Long fkTencentAccountAreaId) {
         set("fk_tencent_account_area_id",fkTencentAccountAreaId);
        return this;
    }
    /**
     * 实例 ID
     */
    public TencentDeviceUpdateWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 实例所在区域
     */
    public TencentDeviceUpdateWrapper setRegion(String region) {
         set("region",region);
        return this;
    }
    /**
     * 当前实例所使用的镜像
     */
    public TencentDeviceUpdateWrapper setImageId(String imageId) {
         set("image_id",imageId);
        return this;
    }
    /**
     * 实例类型
     */
    public TencentDeviceUpdateWrapper setInstanceType(String instanceType) {
         set("instance_type",instanceType);
        return this;
    }
    /**
     * 实例内网 IP
     */
    public TencentDeviceUpdateWrapper setIp(String ip) {
         set("ip",ip);
        return this;
    }
    /**
     * 实例所在物理宿主机编号
     */
    public TencentDeviceUpdateWrapper setHostSerialNumber(String hostSerialNumber) {
         set("host_serial_number",hostSerialNumber);
        return this;
    }
    /**
     * 实例特殊配置
     */
    public TencentDeviceUpdateWrapper setDebugPropertiesString(String debugPropertiesString) {
         set("debug_properties_string",debugPropertiesString);
        return this;
    }
    /**
     * 创建时间
     */
    public TencentDeviceUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public TencentDeviceUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 最后一次重置时间
     */
    public TencentDeviceUpdateWrapper setLastResetTime(Date lastResetTime) {
         set("last_reset_time",lastResetTime);
        return this;
    }
    /**
     * 最后一次重置任务ID
     */
    public TencentDeviceUpdateWrapper setLastTaskId(String lastTaskId) {
         set("last_task_id",lastTaskId);
        return this;
    }
    /**
     * 重置使用的镜像id不配置时使用image_id当前云机使用的镜像id
     */
    public TencentDeviceUpdateWrapper setResetImageId(String resetImageId) {
         set("reset_image_id",resetImageId);
        return this;
    }
    /**
     * 云机ID=实例 ID的小写
     */
    public TencentDeviceUpdateWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public TencentDeviceUpdateWrapper idEq(Long id){
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
    public TencentDeviceUpdateWrapper idNe(Long id){
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
    public TencentDeviceUpdateWrapper idGt(Long id){
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
    public TencentDeviceUpdateWrapper idGe(Long id){
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
    public TencentDeviceUpdateWrapper idLt(Long id){
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
    public TencentDeviceUpdateWrapper idLe(Long id){
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
    public TencentDeviceUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentDeviceUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentDeviceUpdateWrapper idLike(Long id){
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
    public TencentDeviceUpdateWrapper idNotLike(Long id){
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
    public TencentDeviceUpdateWrapper idLikeLeft(Long id){
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
    public TencentDeviceUpdateWrapper idLikeRight(Long id){
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
    public TencentDeviceUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateWrapper idIn(Collection<Long> value){
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
    public TencentDeviceUpdateWrapper idIn(Long... values){
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
    public TencentDeviceUpdateWrapper idNotIn(Collection<Long> value){
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
    public TencentDeviceUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * 等于 = fkTencentAccountAreaId
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdEq(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            eq("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * 不等于 &lt;&gt; fkTencentAccountAreaId
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdNe(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            ne("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 大于 &gt; fkTencentAccountAreaId
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdGt(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            gt("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 大于等于 &gt;= fkTencentAccountAreaId
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdGe(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            ge("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 小于 &lt; fkTencentAccountAreaId
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdLt(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            lt("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * 小于等于 &lt;= fkTencentAccountAreaId
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdLe(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            le("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkTencentAccountAreaIdStart       值1
     * @param fkTencentAccountAreaIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdBetween(Long fkTencentAccountAreaIdStart,Long fkTencentAccountAreaIdEnd){
        if(fkTencentAccountAreaIdStart!=null && fkTencentAccountAreaIdEnd!=null){
            between("fk_tencent_account_area_id",fkTencentAccountAreaIdStart,fkTencentAccountAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkTencentAccountAreaIdStart       值1
     * @param fkTencentAccountAreaIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdNotBetween(Long fkTencentAccountAreaIdStart,Long fkTencentAccountAreaIdEnd){
        if(fkTencentAccountAreaIdStart!=null && fkTencentAccountAreaIdEnd!=null){
            notBetween("fk_tencent_account_area_id",fkTencentAccountAreaIdStart,fkTencentAccountAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '%值%' fkTencentAccountAreaId
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdLike(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            like("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * NOT LIKE '%值%' fkTencentAccountAreaId
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdNotLike(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            notLike("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }


    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '%值' fkTencentAccountAreaId
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdLikeLeft(Long fkTencentAccountAreaId){
        if(fkTencentAccountAreaId!=null){
            likeLeft("fk_tencent_account_area_id",fkTencentAccountAreaId);
        }
        return this;
     }

    /**
     * <p>腾讯账号区域Id</p>
     * LIKE '值%' fkTencentAccountAreaId
     * @param fkTencentAccountAreaId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdLikeRight(Long fkTencentAccountAreaId){
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
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdIsNull(){
        isNull("fk_tencent_account_area_id");
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdIsNotNull(){
        isNotNull("fk_tencent_account_area_id");
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdIn(Collection<Long> value){
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
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdIn(Long... values){
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
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdNotIn(Collection<Long> value){
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
    public TencentDeviceUpdateWrapper fkTencentAccountAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_account_area_id",values);
        }
        return this;
    }

    /**
     * <p>实例 ID</p>
     * 等于 = instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例 ID</p>
     * 不等于 &lt;&gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 大于 &gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 大于等于 &gt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 小于 &lt; instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * 小于等于 &lt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例 ID</p>
     * LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * NOT LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>实例 ID</p>
     * LIKE '%值' instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例 ID</p>
     * LIKE '值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceIdLikeRight(String instanceId){
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
    public TencentDeviceUpdateWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例 ID</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例 ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceIdIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper instanceIdIn(String... values){
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
    public TencentDeviceUpdateWrapper instanceIdNotIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * 等于 = region
     * @param region       值
     * @return children
     */
    public TencentDeviceUpdateWrapper regionEq(String region){
        if(region!=null){
            eq("region",region);
        }
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * 不等于 &lt;&gt; region
     * @param region       值
     * @return children
     */
    public TencentDeviceUpdateWrapper regionNe(String region){
        if(region!=null){
            ne("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 大于 &gt; region
     * @param region       值
     * @return children
     */
    public TencentDeviceUpdateWrapper regionGt(String region){
        if(region!=null){
            gt("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 大于等于 &gt;= region
     * @param region       值
     * @return children
     */
    public TencentDeviceUpdateWrapper regionGe(String region){
        if(region!=null){
            ge("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 小于 &lt; region
     * @param region       值
     * @return children
     */
    public TencentDeviceUpdateWrapper regionLt(String region){
        if(region!=null){
            lt("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * 小于等于 &lt;= region
     * @param region       值
     * @return children
     */
    public TencentDeviceUpdateWrapper regionLe(String region){
        if(region!=null){
            le("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * BETWEEN 值1 AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper regionBetween(String regionStart,String regionEnd){
        if(regionStart!=null && regionEnd!=null){
            between("region",regionStart,regionEnd);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * NOT BETWEEN 值1 AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper regionNotBetween(String regionStart,String regionEnd){
        if(regionStart!=null && regionEnd!=null){
            notBetween("region",regionStart,regionEnd);
        }
        return this;
     }


    /**
     * <p>实例所在区域</p>
     * LIKE '%值%' region
     * @param region       值
     * @return children
     */
    public TencentDeviceUpdateWrapper regionLike(String region){
        if(region!=null){
            like("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * NOT LIKE '%值%' region
     * @param region       值
     * @return children
     */
    public TencentDeviceUpdateWrapper regionNotLike(String region){
        if(region!=null){
            notLike("region",region);
        }
        return this;
     }


    /**
     * <p>实例所在区域</p>
     * LIKE '%值' region
     * @param region       值
     * @return children
     */
    public TencentDeviceUpdateWrapper regionLikeLeft(String region){
        if(region!=null){
            likeLeft("region",region);
        }
        return this;
     }

    /**
     * <p>实例所在区域</p>
     * LIKE '值%' region
     * @param region       值
     * @return children
     */
    public TencentDeviceUpdateWrapper regionLikeRight(String region){
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
    public TencentDeviceUpdateWrapper regionIsNull(){
        isNull("region");
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateWrapper regionIsNotNull(){
        isNotNull("region");
        return this;
    }

    /**
     * <p>实例所在区域</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateWrapper regionIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper regionIn(String... values){
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
    public TencentDeviceUpdateWrapper regionNotIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper regionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region",values);
        }
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * 等于 = imageId
     * @param imageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper imageIdEq(String imageId){
        if(imageId!=null){
            eq("image_id",imageId);
        }
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * 不等于 &lt;&gt; imageId
     * @param imageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper imageIdNe(String imageId){
        if(imageId!=null){
            ne("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 大于 &gt; imageId
     * @param imageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper imageIdGt(String imageId){
        if(imageId!=null){
            gt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 大于等于 &gt;= imageId
     * @param imageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper imageIdGe(String imageId){
        if(imageId!=null){
            ge("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 小于 &lt; imageId
     * @param imageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper imageIdLt(String imageId){
        if(imageId!=null){
            lt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * 小于等于 &lt;= imageId
     * @param imageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper imageIdLe(String imageId){
        if(imageId!=null){
            le("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            between("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            notBetween("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>当前实例所使用的镜像</p>
     * LIKE '%值%' imageId
     * @param imageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper imageIdLike(String imageId){
        if(imageId!=null){
            like("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * NOT LIKE '%值%' imageId
     * @param imageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper imageIdNotLike(String imageId){
        if(imageId!=null){
            notLike("image_id",imageId);
        }
        return this;
     }


    /**
     * <p>当前实例所使用的镜像</p>
     * LIKE '%值' imageId
     * @param imageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper imageIdLikeLeft(String imageId){
        if(imageId!=null){
            likeLeft("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>当前实例所使用的镜像</p>
     * LIKE '值%' imageId
     * @param imageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper imageIdLikeRight(String imageId){
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
    public TencentDeviceUpdateWrapper imageIdIsNull(){
        isNull("image_id");
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateWrapper imageIdIsNotNull(){
        isNotNull("image_id");
        return this;
    }

    /**
     * <p>当前实例所使用的镜像</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateWrapper imageIdIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper imageIdIn(String... values){
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
    public TencentDeviceUpdateWrapper imageIdNotIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_id",values);
        }
        return this;
    }

    /**
     * <p>实例类型</p>
     * 等于 = instanceType
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceTypeEq(String instanceType){
        if(instanceType!=null){
            eq("instance_type",instanceType);
        }
        return this;
    }

    /**
     * <p>实例类型</p>
     * 不等于 &lt;&gt; instanceType
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceTypeNe(String instanceType){
        if(instanceType!=null){
            ne("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 大于 &gt; instanceType
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceTypeGt(String instanceType){
        if(instanceType!=null){
            gt("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 大于等于 &gt;= instanceType
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceTypeGe(String instanceType){
        if(instanceType!=null){
            ge("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 小于 &lt; instanceType
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceTypeLt(String instanceType){
        if(instanceType!=null){
            lt("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * 小于等于 &lt;= instanceType
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceTypeLe(String instanceType){
        if(instanceType!=null){
            le("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * BETWEEN 值1 AND 值2
     * @param instanceTypeStart       值1
     * @param instanceTypeEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceTypeBetween(String instanceTypeStart,String instanceTypeEnd){
        if(instanceTypeStart!=null && instanceTypeEnd!=null){
            between("instance_type",instanceTypeStart,instanceTypeEnd);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * NOT BETWEEN 值1 AND 值2
     * @param instanceTypeStart       值1
     * @param instanceTypeEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceTypeNotBetween(String instanceTypeStart,String instanceTypeEnd){
        if(instanceTypeStart!=null && instanceTypeEnd!=null){
            notBetween("instance_type",instanceTypeStart,instanceTypeEnd);
        }
        return this;
     }


    /**
     * <p>实例类型</p>
     * LIKE '%值%' instanceType
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceTypeLike(String instanceType){
        if(instanceType!=null){
            like("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * NOT LIKE '%值%' instanceType
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceTypeNotLike(String instanceType){
        if(instanceType!=null){
            notLike("instance_type",instanceType);
        }
        return this;
     }


    /**
     * <p>实例类型</p>
     * LIKE '%值' instanceType
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceTypeLikeLeft(String instanceType){
        if(instanceType!=null){
            likeLeft("instance_type",instanceType);
        }
        return this;
     }

    /**
     * <p>实例类型</p>
     * LIKE '值%' instanceType
     * @param instanceType       值
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceTypeLikeRight(String instanceType){
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
    public TencentDeviceUpdateWrapper instanceTypeIsNull(){
        isNull("instance_type");
        return this;
    }

    /**
     * <p>实例类型</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceTypeIsNotNull(){
        isNotNull("instance_type");
        return this;
    }

    /**
     * <p>实例类型</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateWrapper instanceTypeIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper instanceTypeIn(String... values){
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
    public TencentDeviceUpdateWrapper instanceTypeNotIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper instanceTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_type",values);
        }
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * 等于 = ip
     * @param ip       值
     * @return children
     */
    public TencentDeviceUpdateWrapper ipEq(String ip){
        if(ip!=null){
            eq("ip",ip);
        }
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * 不等于 &lt;&gt; ip
     * @param ip       值
     * @return children
     */
    public TencentDeviceUpdateWrapper ipNe(String ip){
        if(ip!=null){
            ne("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 大于 &gt; ip
     * @param ip       值
     * @return children
     */
    public TencentDeviceUpdateWrapper ipGt(String ip){
        if(ip!=null){
            gt("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 大于等于 &gt;= ip
     * @param ip       值
     * @return children
     */
    public TencentDeviceUpdateWrapper ipGe(String ip){
        if(ip!=null){
            ge("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 小于 &lt; ip
     * @param ip       值
     * @return children
     */
    public TencentDeviceUpdateWrapper ipLt(String ip){
        if(ip!=null){
            lt("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * 小于等于 &lt;= ip
     * @param ip       值
     * @return children
     */
    public TencentDeviceUpdateWrapper ipLe(String ip){
        if(ip!=null){
            le("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * BETWEEN 值1 AND 值2
     * @param ipStart       值1
     * @param ipEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper ipBetween(String ipStart,String ipEnd){
        if(ipStart!=null && ipEnd!=null){
            between("ip",ipStart,ipEnd);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * NOT BETWEEN 值1 AND 值2
     * @param ipStart       值1
     * @param ipEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper ipNotBetween(String ipStart,String ipEnd){
        if(ipStart!=null && ipEnd!=null){
            notBetween("ip",ipStart,ipEnd);
        }
        return this;
     }


    /**
     * <p>实例内网 IP</p>
     * LIKE '%值%' ip
     * @param ip       值
     * @return children
     */
    public TencentDeviceUpdateWrapper ipLike(String ip){
        if(ip!=null){
            like("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * NOT LIKE '%值%' ip
     * @param ip       值
     * @return children
     */
    public TencentDeviceUpdateWrapper ipNotLike(String ip){
        if(ip!=null){
            notLike("ip",ip);
        }
        return this;
     }


    /**
     * <p>实例内网 IP</p>
     * LIKE '%值' ip
     * @param ip       值
     * @return children
     */
    public TencentDeviceUpdateWrapper ipLikeLeft(String ip){
        if(ip!=null){
            likeLeft("ip",ip);
        }
        return this;
     }

    /**
     * <p>实例内网 IP</p>
     * LIKE '值%' ip
     * @param ip       值
     * @return children
     */
    public TencentDeviceUpdateWrapper ipLikeRight(String ip){
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
    public TencentDeviceUpdateWrapper ipIsNull(){
        isNull("ip");
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateWrapper ipIsNotNull(){
        isNotNull("ip");
        return this;
    }

    /**
     * <p>实例内网 IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateWrapper ipIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper ipIn(String... values){
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
    public TencentDeviceUpdateWrapper ipNotIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper ipNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("ip",values);
        }
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 等于 = hostSerialNumber
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceUpdateWrapper hostSerialNumberEq(String hostSerialNumber){
        if(hostSerialNumber!=null){
            eq("host_serial_number",hostSerialNumber);
        }
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 不等于 &lt;&gt; hostSerialNumber
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceUpdateWrapper hostSerialNumberNe(String hostSerialNumber){
        if(hostSerialNumber!=null){
            ne("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 大于 &gt; hostSerialNumber
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceUpdateWrapper hostSerialNumberGt(String hostSerialNumber){
        if(hostSerialNumber!=null){
            gt("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 大于等于 &gt;= hostSerialNumber
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceUpdateWrapper hostSerialNumberGe(String hostSerialNumber){
        if(hostSerialNumber!=null){
            ge("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 小于 &lt; hostSerialNumber
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceUpdateWrapper hostSerialNumberLt(String hostSerialNumber){
        if(hostSerialNumber!=null){
            lt("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * 小于等于 &lt;= hostSerialNumber
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceUpdateWrapper hostSerialNumberLe(String hostSerialNumber){
        if(hostSerialNumber!=null){
            le("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * BETWEEN 值1 AND 值2
     * @param hostSerialNumberStart       值1
     * @param hostSerialNumberEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper hostSerialNumberBetween(String hostSerialNumberStart,String hostSerialNumberEnd){
        if(hostSerialNumberStart!=null && hostSerialNumberEnd!=null){
            between("host_serial_number",hostSerialNumberStart,hostSerialNumberEnd);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param hostSerialNumberStart       值1
     * @param hostSerialNumberEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper hostSerialNumberNotBetween(String hostSerialNumberStart,String hostSerialNumberEnd){
        if(hostSerialNumberStart!=null && hostSerialNumberEnd!=null){
            notBetween("host_serial_number",hostSerialNumberStart,hostSerialNumberEnd);
        }
        return this;
     }


    /**
     * <p>实例所在物理宿主机编号</p>
     * LIKE '%值%' hostSerialNumber
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceUpdateWrapper hostSerialNumberLike(String hostSerialNumber){
        if(hostSerialNumber!=null){
            like("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * NOT LIKE '%值%' hostSerialNumber
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceUpdateWrapper hostSerialNumberNotLike(String hostSerialNumber){
        if(hostSerialNumber!=null){
            notLike("host_serial_number",hostSerialNumber);
        }
        return this;
     }


    /**
     * <p>实例所在物理宿主机编号</p>
     * LIKE '%值' hostSerialNumber
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceUpdateWrapper hostSerialNumberLikeLeft(String hostSerialNumber){
        if(hostSerialNumber!=null){
            likeLeft("host_serial_number",hostSerialNumber);
        }
        return this;
     }

    /**
     * <p>实例所在物理宿主机编号</p>
     * LIKE '值%' hostSerialNumber
     * @param hostSerialNumber       值
     * @return children
     */
    public TencentDeviceUpdateWrapper hostSerialNumberLikeRight(String hostSerialNumber){
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
    public TencentDeviceUpdateWrapper hostSerialNumberIsNull(){
        isNull("host_serial_number");
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateWrapper hostSerialNumberIsNotNull(){
        isNotNull("host_serial_number");
        return this;
    }

    /**
     * <p>实例所在物理宿主机编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateWrapper hostSerialNumberIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper hostSerialNumberIn(String... values){
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
    public TencentDeviceUpdateWrapper hostSerialNumberNotIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper hostSerialNumberNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("host_serial_number",values);
        }
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * 等于 = debugPropertiesString
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceUpdateWrapper debugPropertiesStringEq(String debugPropertiesString){
        if(debugPropertiesString!=null){
            eq("debug_properties_string",debugPropertiesString);
        }
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * 不等于 &lt;&gt; debugPropertiesString
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceUpdateWrapper debugPropertiesStringNe(String debugPropertiesString){
        if(debugPropertiesString!=null){
            ne("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 大于 &gt; debugPropertiesString
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceUpdateWrapper debugPropertiesStringGt(String debugPropertiesString){
        if(debugPropertiesString!=null){
            gt("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 大于等于 &gt;= debugPropertiesString
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceUpdateWrapper debugPropertiesStringGe(String debugPropertiesString){
        if(debugPropertiesString!=null){
            ge("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 小于 &lt; debugPropertiesString
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceUpdateWrapper debugPropertiesStringLt(String debugPropertiesString){
        if(debugPropertiesString!=null){
            lt("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * 小于等于 &lt;= debugPropertiesString
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceUpdateWrapper debugPropertiesStringLe(String debugPropertiesString){
        if(debugPropertiesString!=null){
            le("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * BETWEEN 值1 AND 值2
     * @param debugPropertiesStringStart       值1
     * @param debugPropertiesStringEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper debugPropertiesStringBetween(String debugPropertiesStringStart,String debugPropertiesStringEnd){
        if(debugPropertiesStringStart!=null && debugPropertiesStringEnd!=null){
            between("debug_properties_string",debugPropertiesStringStart,debugPropertiesStringEnd);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * NOT BETWEEN 值1 AND 值2
     * @param debugPropertiesStringStart       值1
     * @param debugPropertiesStringEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper debugPropertiesStringNotBetween(String debugPropertiesStringStart,String debugPropertiesStringEnd){
        if(debugPropertiesStringStart!=null && debugPropertiesStringEnd!=null){
            notBetween("debug_properties_string",debugPropertiesStringStart,debugPropertiesStringEnd);
        }
        return this;
     }


    /**
     * <p>实例特殊配置</p>
     * LIKE '%值%' debugPropertiesString
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceUpdateWrapper debugPropertiesStringLike(String debugPropertiesString){
        if(debugPropertiesString!=null){
            like("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * NOT LIKE '%值%' debugPropertiesString
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceUpdateWrapper debugPropertiesStringNotLike(String debugPropertiesString){
        if(debugPropertiesString!=null){
            notLike("debug_properties_string",debugPropertiesString);
        }
        return this;
     }


    /**
     * <p>实例特殊配置</p>
     * LIKE '%值' debugPropertiesString
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceUpdateWrapper debugPropertiesStringLikeLeft(String debugPropertiesString){
        if(debugPropertiesString!=null){
            likeLeft("debug_properties_string",debugPropertiesString);
        }
        return this;
     }

    /**
     * <p>实例特殊配置</p>
     * LIKE '值%' debugPropertiesString
     * @param debugPropertiesString       值
     * @return children
     */
    public TencentDeviceUpdateWrapper debugPropertiesStringLikeRight(String debugPropertiesString){
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
    public TencentDeviceUpdateWrapper debugPropertiesStringIsNull(){
        isNull("debug_properties_string");
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateWrapper debugPropertiesStringIsNotNull(){
        isNotNull("debug_properties_string");
        return this;
    }

    /**
     * <p>实例特殊配置</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateWrapper debugPropertiesStringIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper debugPropertiesStringIn(String... values){
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
    public TencentDeviceUpdateWrapper debugPropertiesStringNotIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper debugPropertiesStringNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("debug_properties_string",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 不等于 &lt;&gt; createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' createTime
     * @param createTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper createTimeLikeRight(Date createTime){
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
    public TencentDeviceUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateWrapper createTimeIn(Collection<Date> value){
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
    public TencentDeviceUpdateWrapper createTimeIn(Date... values){
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
    public TencentDeviceUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentDeviceUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public TencentDeviceUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public TencentDeviceUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public TencentDeviceUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public TencentDeviceUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 等于 = lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastResetTimeEq(Date lastResetTime){
        if(lastResetTime!=null){
            eq("last_reset_time",lastResetTime);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 不等于 &lt;&gt; lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastResetTimeNe(Date lastResetTime){
        if(lastResetTime!=null){
            ne("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 大于 &gt; lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastResetTimeGt(Date lastResetTime){
        if(lastResetTime!=null){
            gt("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 大于等于 &gt;= lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastResetTimeGe(Date lastResetTime){
        if(lastResetTime!=null){
            ge("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 小于 &lt; lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastResetTimeLt(Date lastResetTime){
        if(lastResetTime!=null){
            lt("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 小于等于 &lt;= lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastResetTimeLe(Date lastResetTime){
        if(lastResetTime!=null){
            le("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastResetTimeStart       值1
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper lastResetTimeBetween(Date lastResetTimeStart,Date lastResetTimeEnd){
        if(lastResetTimeStart!=null && lastResetTimeEnd!=null){
            between("last_reset_time",lastResetTimeStart,lastResetTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastResetTimeStart       值1
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper lastResetTimeNotBetween(Date lastResetTimeStart,Date lastResetTimeEnd){
        if(lastResetTimeStart!=null && lastResetTimeEnd!=null){
            notBetween("last_reset_time",lastResetTimeStart,lastResetTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值%' lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastResetTimeLike(Date lastResetTime){
        if(lastResetTime!=null){
            like("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT LIKE '%值%' lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastResetTimeNotLike(Date lastResetTime){
        if(lastResetTime!=null){
            notLike("last_reset_time",lastResetTime);
        }
        return this;
     }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值' lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastResetTimeLikeLeft(Date lastResetTime){
        if(lastResetTime!=null){
            likeLeft("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * LIKE '值%' lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastResetTimeLikeRight(Date lastResetTime){
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
    public TencentDeviceUpdateWrapper lastResetTimeIsNull(){
        isNull("last_reset_time");
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateWrapper lastResetTimeIsNotNull(){
        isNotNull("last_reset_time");
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateWrapper lastResetTimeIn(Collection<Date> value){
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
    public TencentDeviceUpdateWrapper lastResetTimeIn(Date... values){
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
    public TencentDeviceUpdateWrapper lastResetTimeNotIn(Collection<Date> value){
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
    public TencentDeviceUpdateWrapper lastResetTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_reset_time",values);
        }
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * 等于 = lastTaskId
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastTaskIdEq(String lastTaskId){
        if(lastTaskId!=null){
            eq("last_task_id",lastTaskId);
        }
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * 不等于 &lt;&gt; lastTaskId
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastTaskIdNe(String lastTaskId){
        if(lastTaskId!=null){
            ne("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 大于 &gt; lastTaskId
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastTaskIdGt(String lastTaskId){
        if(lastTaskId!=null){
            gt("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 大于等于 &gt;= lastTaskId
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastTaskIdGe(String lastTaskId){
        if(lastTaskId!=null){
            ge("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 小于 &lt; lastTaskId
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastTaskIdLt(String lastTaskId){
        if(lastTaskId!=null){
            lt("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * 小于等于 &lt;= lastTaskId
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastTaskIdLe(String lastTaskId){
        if(lastTaskId!=null){
            le("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * BETWEEN 值1 AND 值2
     * @param lastTaskIdStart       值1
     * @param lastTaskIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper lastTaskIdBetween(String lastTaskIdStart,String lastTaskIdEnd){
        if(lastTaskIdStart!=null && lastTaskIdEnd!=null){
            between("last_task_id",lastTaskIdStart,lastTaskIdEnd);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastTaskIdStart       值1
     * @param lastTaskIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper lastTaskIdNotBetween(String lastTaskIdStart,String lastTaskIdEnd){
        if(lastTaskIdStart!=null && lastTaskIdEnd!=null){
            notBetween("last_task_id",lastTaskIdStart,lastTaskIdEnd);
        }
        return this;
     }


    /**
     * <p>最后一次重置任务ID</p>
     * LIKE '%值%' lastTaskId
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastTaskIdLike(String lastTaskId){
        if(lastTaskId!=null){
            like("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * NOT LIKE '%值%' lastTaskId
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastTaskIdNotLike(String lastTaskId){
        if(lastTaskId!=null){
            notLike("last_task_id",lastTaskId);
        }
        return this;
     }


    /**
     * <p>最后一次重置任务ID</p>
     * LIKE '%值' lastTaskId
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastTaskIdLikeLeft(String lastTaskId){
        if(lastTaskId!=null){
            likeLeft("last_task_id",lastTaskId);
        }
        return this;
     }

    /**
     * <p>最后一次重置任务ID</p>
     * LIKE '值%' lastTaskId
     * @param lastTaskId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper lastTaskIdLikeRight(String lastTaskId){
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
    public TencentDeviceUpdateWrapper lastTaskIdIsNull(){
        isNull("last_task_id");
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateWrapper lastTaskIdIsNotNull(){
        isNotNull("last_task_id");
        return this;
    }

    /**
     * <p>最后一次重置任务ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateWrapper lastTaskIdIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper lastTaskIdIn(String... values){
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
    public TencentDeviceUpdateWrapper lastTaskIdNotIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper lastTaskIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("last_task_id",values);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 等于 = resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper resetImageIdEq(String resetImageId){
        if(resetImageId!=null){
            eq("reset_image_id",resetImageId);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 不等于 &lt;&gt; resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper resetImageIdNe(String resetImageId){
        if(resetImageId!=null){
            ne("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 大于 &gt; resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper resetImageIdGt(String resetImageId){
        if(resetImageId!=null){
            gt("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 大于等于 &gt;= resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper resetImageIdGe(String resetImageId){
        if(resetImageId!=null){
            ge("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 小于 &lt; resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper resetImageIdLt(String resetImageId){
        if(resetImageId!=null){
            lt("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * 小于等于 &lt;= resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper resetImageIdLe(String resetImageId){
        if(resetImageId!=null){
            le("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * BETWEEN 值1 AND 值2
     * @param resetImageIdStart       值1
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper resetImageIdBetween(String resetImageIdStart,String resetImageIdEnd){
        if(resetImageIdStart!=null && resetImageIdEnd!=null){
            between("reset_image_id",resetImageIdStart,resetImageIdEnd);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetImageIdStart       值1
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper resetImageIdNotBetween(String resetImageIdStart,String resetImageIdEnd){
        if(resetImageIdStart!=null && resetImageIdEnd!=null){
            notBetween("reset_image_id",resetImageIdStart,resetImageIdEnd);
        }
        return this;
     }


    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * LIKE '%值%' resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper resetImageIdLike(String resetImageId){
        if(resetImageId!=null){
            like("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * NOT LIKE '%值%' resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper resetImageIdNotLike(String resetImageId){
        if(resetImageId!=null){
            notLike("reset_image_id",resetImageId);
        }
        return this;
     }


    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * LIKE '%值' resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper resetImageIdLikeLeft(String resetImageId){
        if(resetImageId!=null){
            likeLeft("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * LIKE '值%' resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper resetImageIdLikeRight(String resetImageId){
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
    public TencentDeviceUpdateWrapper resetImageIdIsNull(){
        isNull("reset_image_id");
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateWrapper resetImageIdIsNotNull(){
        isNotNull("reset_image_id");
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_id当前云机使用的镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateWrapper resetImageIdIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper resetImageIdIn(String... values){
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
    public TencentDeviceUpdateWrapper resetImageIdNotIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper resetImageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_image_id",values);
        }
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 等于 = deviceId
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 不等于 &lt;&gt; deviceId
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 大于 &gt; deviceId
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 大于等于 &gt;= deviceId
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 小于 &lt; deviceId
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * 小于等于 &lt;= deviceId
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public TencentDeviceUpdateWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>云机ID=实例 ID的小写</p>
     * LIKE '%值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * NOT LIKE '%值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>云机ID=实例 ID的小写</p>
     * LIKE '%值' deviceId
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * LIKE '值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public TencentDeviceUpdateWrapper deviceIdLikeRight(String deviceId){
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
    public TencentDeviceUpdateWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * IS NOT NULL
     * @return children
     */
    public TencentDeviceUpdateWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>云机ID=实例 ID的小写</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentDeviceUpdateWrapper deviceIdIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper deviceIdIn(String... values){
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
    public TencentDeviceUpdateWrapper deviceIdNotIn(Collection<String> value){
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
    public TencentDeviceUpdateWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }


}
