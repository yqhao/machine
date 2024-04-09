package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.TencentResetRecord;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 腾讯云机重置记录
 * </p>
 * "tencent_reset_record"
 * @author PC001
 */
public class TencentResetRecordUpdateWrapper extends UpdateWrapper<TencentResetRecord> {

    public static TencentResetRecordUpdateWrapper wrapper() {
        return new TencentResetRecordUpdateWrapper();
    }

    public TencentResetRecordUpdateWrapper() {
        super();
    }

    public TencentResetRecordUpdateWrapper(TencentResetRecord entity) {
        super(entity);
    }

    /**
     * 
     */
    public TencentResetRecordUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 
     */
    public TencentResetRecordUpdateWrapper setFkTencentDeviceId(Long fkTencentDeviceId) {
         set("fk_tencent_device_id",fkTencentDeviceId);
        return this;
    }
    /**
     * 腾讯云机id
     */
    public TencentResetRecordUpdateWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 
     */
    public TencentResetRecordUpdateWrapper setFkTencentImagesId(Long fkTencentImagesId) {
         set("fk_tencent_images_id",fkTencentImagesId);
        return this;
    }
    /**
     * 镜像版本
     */
    public TencentResetRecordUpdateWrapper setVersionCode(String versionCode) {
         set("version_code",versionCode);
        return this;
    }
    /**
     * 镜像名称
     */
    public TencentResetRecordUpdateWrapper setTitle(String title) {
         set("title",title);
        return this;
    }
    /**
     * 重置前镜像版本id
     */
    public TencentResetRecordUpdateWrapper setOldImageId(String oldImageId) {
         set("old_image_id",oldImageId);
        return this;
    }
    /**
     * 当前重置镜像版本id
     */
    public TencentResetRecordUpdateWrapper setResetImageId(String resetImageId) {
         set("reset_image_id",resetImageId);
        return this;
    }
    /**
     * 
     */
    public TencentResetRecordUpdateWrapper setResetUserId(Long resetUserId) {
         set("reset_user_id",resetUserId);
        return this;
    }
    /**
     * 
     */
    public TencentResetRecordUpdateWrapper setResponse(String response) {
         set("response",response);
        return this;
    }
    /**
     * 重置时间
     */
    public TencentResetRecordUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper idEq(Long id){
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
    public TencentResetRecordUpdateWrapper idNe(Long id){
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
    public TencentResetRecordUpdateWrapper idGt(Long id){
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
    public TencentResetRecordUpdateWrapper idGe(Long id){
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
    public TencentResetRecordUpdateWrapper idLt(Long id){
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
    public TencentResetRecordUpdateWrapper idLe(Long id){
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
    public TencentResetRecordUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentResetRecordUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentResetRecordUpdateWrapper idLike(Long id){
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
    public TencentResetRecordUpdateWrapper idNotLike(Long id){
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
    public TencentResetRecordUpdateWrapper idLikeLeft(Long id){
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
    public TencentResetRecordUpdateWrapper idLikeRight(Long id){
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
    public TencentResetRecordUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateWrapper idIn(Collection<Long> value){
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
    public TencentResetRecordUpdateWrapper idIn(Long... values){
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
    public TencentResetRecordUpdateWrapper idNotIn(Collection<Long> value){
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
    public TencentResetRecordUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdEq(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            eq("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdNe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            ne("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdGt(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            gt("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdGe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            ge("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdLt(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            lt("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdLe(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            le("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkTencentDeviceIdStart       值1
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
        if(fkTencentDeviceIdStart!=null && fkTencentDeviceIdEnd!=null){
            between("fk_tencent_device_id",fkTencentDeviceIdStart,fkTencentDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkTencentDeviceIdStart       值1
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdNotBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
        if(fkTencentDeviceIdStart!=null && fkTencentDeviceIdEnd!=null){
            notBetween("fk_tencent_device_id",fkTencentDeviceIdStart,fkTencentDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdLike(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            like("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdNotLike(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            notLike("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdLikeLeft(Long fkTencentDeviceId){
        if(fkTencentDeviceId!=null){
            likeLeft("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' fkTencentDeviceId
     * @param fkTencentDeviceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdLikeRight(Long fkTencentDeviceId){
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
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdIsNull(){
        isNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdIsNotNull(){
        isNotNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdIn(Collection<Long> value){
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
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdIn(Long... values){
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
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdNotIn(Collection<Long> value){
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
    public TencentResetRecordUpdateWrapper fkTencentDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_device_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * 等于 = instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * 不等于 &lt;&gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 大于 &gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 大于等于 &gt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 小于 &lt; instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * 小于等于 &lt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯云机id</p>
     * LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * NOT LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>腾讯云机id</p>
     * LIKE '%值' instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * LIKE '值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper instanceIdLikeRight(String instanceId){
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
    public TencentResetRecordUpdateWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateWrapper instanceIdIn(Collection<String> value){
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
    public TencentResetRecordUpdateWrapper instanceIdIn(String... values){
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
    public TencentResetRecordUpdateWrapper instanceIdNotIn(Collection<String> value){
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
    public TencentResetRecordUpdateWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = fkTencentImagesId
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentImagesIdEq(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            eq("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; fkTencentImagesId
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentImagesIdNe(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            ne("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; fkTencentImagesId
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentImagesIdGt(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            gt("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= fkTencentImagesId
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentImagesIdGe(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            ge("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; fkTencentImagesId
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentImagesIdLt(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            lt("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= fkTencentImagesId
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentImagesIdLe(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            le("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkTencentImagesIdStart       值1
     * @param fkTencentImagesIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentImagesIdBetween(Long fkTencentImagesIdStart,Long fkTencentImagesIdEnd){
        if(fkTencentImagesIdStart!=null && fkTencentImagesIdEnd!=null){
            between("fk_tencent_images_id",fkTencentImagesIdStart,fkTencentImagesIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkTencentImagesIdStart       值1
     * @param fkTencentImagesIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentImagesIdNotBetween(Long fkTencentImagesIdStart,Long fkTencentImagesIdEnd){
        if(fkTencentImagesIdStart!=null && fkTencentImagesIdEnd!=null){
            notBetween("fk_tencent_images_id",fkTencentImagesIdStart,fkTencentImagesIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' fkTencentImagesId
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentImagesIdLike(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            like("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' fkTencentImagesId
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentImagesIdNotLike(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            notLike("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' fkTencentImagesId
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentImagesIdLikeLeft(Long fkTencentImagesId){
        if(fkTencentImagesId!=null){
            likeLeft("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' fkTencentImagesId
     * @param fkTencentImagesId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentImagesIdLikeRight(Long fkTencentImagesId){
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
    public TencentResetRecordUpdateWrapper fkTencentImagesIdIsNull(){
        isNull("fk_tencent_images_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentImagesIdIsNotNull(){
        isNotNull("fk_tencent_images_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateWrapper fkTencentImagesIdIn(Collection<Long> value){
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
    public TencentResetRecordUpdateWrapper fkTencentImagesIdIn(Long... values){
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
    public TencentResetRecordUpdateWrapper fkTencentImagesIdNotIn(Collection<Long> value){
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
    public TencentResetRecordUpdateWrapper fkTencentImagesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_images_id",values);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * 等于 = versionCode
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper versionCodeEq(String versionCode){
        if(versionCode!=null){
            eq("version_code",versionCode);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * 不等于 &lt;&gt; versionCode
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper versionCodeNe(String versionCode){
        if(versionCode!=null){
            ne("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 大于 &gt; versionCode
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper versionCodeGt(String versionCode){
        if(versionCode!=null){
            gt("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 大于等于 &gt;= versionCode
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper versionCodeGe(String versionCode){
        if(versionCode!=null){
            ge("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 小于 &lt; versionCode
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper versionCodeLt(String versionCode){
        if(versionCode!=null){
            lt("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * 小于等于 &lt;= versionCode
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper versionCodeLe(String versionCode){
        if(versionCode!=null){
            le("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * BETWEEN 值1 AND 值2
     * @param versionCodeStart       值1
     * @param versionCodeEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper versionCodeBetween(String versionCodeStart,String versionCodeEnd){
        if(versionCodeStart!=null && versionCodeEnd!=null){
            between("version_code",versionCodeStart,versionCodeEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * NOT BETWEEN 值1 AND 值2
     * @param versionCodeStart       值1
     * @param versionCodeEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper versionCodeNotBetween(String versionCodeStart,String versionCodeEnd){
        if(versionCodeStart!=null && versionCodeEnd!=null){
            notBetween("version_code",versionCodeStart,versionCodeEnd);
        }
        return this;
     }


    /**
     * <p>镜像版本</p>
     * LIKE '%值%' versionCode
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper versionCodeLike(String versionCode){
        if(versionCode!=null){
            like("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * NOT LIKE '%值%' versionCode
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper versionCodeNotLike(String versionCode){
        if(versionCode!=null){
            notLike("version_code",versionCode);
        }
        return this;
     }


    /**
     * <p>镜像版本</p>
     * LIKE '%值' versionCode
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper versionCodeLikeLeft(String versionCode){
        if(versionCode!=null){
            likeLeft("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * LIKE '值%' versionCode
     * @param versionCode       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper versionCodeLikeRight(String versionCode){
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
    public TencentResetRecordUpdateWrapper versionCodeIsNull(){
        isNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateWrapper versionCodeIsNotNull(){
        isNotNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateWrapper versionCodeIn(Collection<String> value){
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
    public TencentResetRecordUpdateWrapper versionCodeIn(String... values){
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
    public TencentResetRecordUpdateWrapper versionCodeNotIn(Collection<String> value){
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
    public TencentResetRecordUpdateWrapper versionCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("version_code",values);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * 等于 = title
     * @param title       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper titleEq(String title){
        if(title!=null){
            eq("title",title);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * 不等于 &lt;&gt; title
     * @param title       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper titleNe(String title){
        if(title!=null){
            ne("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 大于 &gt; title
     * @param title       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper titleGt(String title){
        if(title!=null){
            gt("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 大于等于 &gt;= title
     * @param title       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper titleGe(String title){
        if(title!=null){
            ge("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 小于 &lt; title
     * @param title       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper titleLt(String title){
        if(title!=null){
            lt("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * 小于等于 &lt;= title
     * @param title       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper titleLe(String title){
        if(title!=null){
            le("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * BETWEEN 值1 AND 值2
     * @param titleStart       值1
     * @param titleEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper titleBetween(String titleStart,String titleEnd){
        if(titleStart!=null && titleEnd!=null){
            between("title",titleStart,titleEnd);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param titleStart       值1
     * @param titleEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper titleNotBetween(String titleStart,String titleEnd){
        if(titleStart!=null && titleEnd!=null){
            notBetween("title",titleStart,titleEnd);
        }
        return this;
     }


    /**
     * <p>镜像名称</p>
     * LIKE '%值%' title
     * @param title       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper titleLike(String title){
        if(title!=null){
            like("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * NOT LIKE '%值%' title
     * @param title       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper titleNotLike(String title){
        if(title!=null){
            notLike("title",title);
        }
        return this;
     }


    /**
     * <p>镜像名称</p>
     * LIKE '%值' title
     * @param title       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper titleLikeLeft(String title){
        if(title!=null){
            likeLeft("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * LIKE '值%' title
     * @param title       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper titleLikeRight(String title){
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
    public TencentResetRecordUpdateWrapper titleIsNull(){
        isNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateWrapper titleIsNotNull(){
        isNotNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateWrapper titleIn(Collection<String> value){
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
    public TencentResetRecordUpdateWrapper titleIn(String... values){
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
    public TencentResetRecordUpdateWrapper titleNotIn(Collection<String> value){
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
    public TencentResetRecordUpdateWrapper titleNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("title",values);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 等于 = oldImageId
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper oldImageIdEq(String oldImageId){
        if(oldImageId!=null){
            eq("old_image_id",oldImageId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 不等于 &lt;&gt; oldImageId
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper oldImageIdNe(String oldImageId){
        if(oldImageId!=null){
            ne("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 大于 &gt; oldImageId
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper oldImageIdGt(String oldImageId){
        if(oldImageId!=null){
            gt("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 大于等于 &gt;= oldImageId
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper oldImageIdGe(String oldImageId){
        if(oldImageId!=null){
            ge("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 小于 &lt; oldImageId
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper oldImageIdLt(String oldImageId){
        if(oldImageId!=null){
            lt("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 小于等于 &lt;= oldImageId
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper oldImageIdLe(String oldImageId){
        if(oldImageId!=null){
            le("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * BETWEEN 值1 AND 值2
     * @param oldImageIdStart       值1
     * @param oldImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper oldImageIdBetween(String oldImageIdStart,String oldImageIdEnd){
        if(oldImageIdStart!=null && oldImageIdEnd!=null){
            between("old_image_id",oldImageIdStart,oldImageIdEnd);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param oldImageIdStart       值1
     * @param oldImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper oldImageIdNotBetween(String oldImageIdStart,String oldImageIdEnd){
        if(oldImageIdStart!=null && oldImageIdEnd!=null){
            notBetween("old_image_id",oldImageIdStart,oldImageIdEnd);
        }
        return this;
     }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值%' oldImageId
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper oldImageIdLike(String oldImageId){
        if(oldImageId!=null){
            like("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT LIKE '%值%' oldImageId
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper oldImageIdNotLike(String oldImageId){
        if(oldImageId!=null){
            notLike("old_image_id",oldImageId);
        }
        return this;
     }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值' oldImageId
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper oldImageIdLikeLeft(String oldImageId){
        if(oldImageId!=null){
            likeLeft("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * LIKE '值%' oldImageId
     * @param oldImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper oldImageIdLikeRight(String oldImageId){
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
    public TencentResetRecordUpdateWrapper oldImageIdIsNull(){
        isNull("old_image_id");
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateWrapper oldImageIdIsNotNull(){
        isNotNull("old_image_id");
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateWrapper oldImageIdIn(Collection<String> value){
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
    public TencentResetRecordUpdateWrapper oldImageIdIn(String... values){
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
    public TencentResetRecordUpdateWrapper oldImageIdNotIn(Collection<String> value){
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
    public TencentResetRecordUpdateWrapper oldImageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("old_image_id",values);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 等于 = resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetImageIdEq(String resetImageId){
        if(resetImageId!=null){
            eq("reset_image_id",resetImageId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 不等于 &lt;&gt; resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetImageIdNe(String resetImageId){
        if(resetImageId!=null){
            ne("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于 &gt; resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetImageIdGt(String resetImageId){
        if(resetImageId!=null){
            gt("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于等于 &gt;= resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetImageIdGe(String resetImageId){
        if(resetImageId!=null){
            ge("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于 &lt; resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetImageIdLt(String resetImageId){
        if(resetImageId!=null){
            lt("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于等于 &lt;= resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetImageIdLe(String resetImageId){
        if(resetImageId!=null){
            le("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * BETWEEN 值1 AND 值2
     * @param resetImageIdStart       值1
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetImageIdBetween(String resetImageIdStart,String resetImageIdEnd){
        if(resetImageIdStart!=null && resetImageIdEnd!=null){
            between("reset_image_id",resetImageIdStart,resetImageIdEnd);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetImageIdStart       值1
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetImageIdNotBetween(String resetImageIdStart,String resetImageIdEnd){
        if(resetImageIdStart!=null && resetImageIdEnd!=null){
            notBetween("reset_image_id",resetImageIdStart,resetImageIdEnd);
        }
        return this;
     }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值%' resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetImageIdLike(String resetImageId){
        if(resetImageId!=null){
            like("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT LIKE '%值%' resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetImageIdNotLike(String resetImageId){
        if(resetImageId!=null){
            notLike("reset_image_id",resetImageId);
        }
        return this;
     }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值' resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetImageIdLikeLeft(String resetImageId){
        if(resetImageId!=null){
            likeLeft("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '值%' resetImageId
     * @param resetImageId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetImageIdLikeRight(String resetImageId){
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
    public TencentResetRecordUpdateWrapper resetImageIdIsNull(){
        isNull("reset_image_id");
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetImageIdIsNotNull(){
        isNotNull("reset_image_id");
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetImageIdIn(Collection<String> value){
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
    public TencentResetRecordUpdateWrapper resetImageIdIn(String... values){
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
    public TencentResetRecordUpdateWrapper resetImageIdNotIn(Collection<String> value){
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
    public TencentResetRecordUpdateWrapper resetImageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_image_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = resetUserId
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetUserIdEq(Long resetUserId){
        if(resetUserId!=null){
            eq("reset_user_id",resetUserId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; resetUserId
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetUserIdNe(Long resetUserId){
        if(resetUserId!=null){
            ne("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; resetUserId
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetUserIdGt(Long resetUserId){
        if(resetUserId!=null){
            gt("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= resetUserId
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetUserIdGe(Long resetUserId){
        if(resetUserId!=null){
            ge("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; resetUserId
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetUserIdLt(Long resetUserId){
        if(resetUserId!=null){
            lt("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= resetUserId
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetUserIdLe(Long resetUserId){
        if(resetUserId!=null){
            le("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param resetUserIdStart       值1
     * @param resetUserIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetUserIdBetween(Long resetUserIdStart,Long resetUserIdEnd){
        if(resetUserIdStart!=null && resetUserIdEnd!=null){
            between("reset_user_id",resetUserIdStart,resetUserIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetUserIdStart       值1
     * @param resetUserIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetUserIdNotBetween(Long resetUserIdStart,Long resetUserIdEnd){
        if(resetUserIdStart!=null && resetUserIdEnd!=null){
            notBetween("reset_user_id",resetUserIdStart,resetUserIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' resetUserId
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetUserIdLike(Long resetUserId){
        if(resetUserId!=null){
            like("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' resetUserId
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetUserIdNotLike(Long resetUserId){
        if(resetUserId!=null){
            notLike("reset_user_id",resetUserId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' resetUserId
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetUserIdLikeLeft(Long resetUserId){
        if(resetUserId!=null){
            likeLeft("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' resetUserId
     * @param resetUserId       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetUserIdLikeRight(Long resetUserId){
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
    public TencentResetRecordUpdateWrapper resetUserIdIsNull(){
        isNull("reset_user_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetUserIdIsNotNull(){
        isNotNull("reset_user_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateWrapper resetUserIdIn(Collection<Long> value){
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
    public TencentResetRecordUpdateWrapper resetUserIdIn(Long... values){
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
    public TencentResetRecordUpdateWrapper resetUserIdNotIn(Collection<Long> value){
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
    public TencentResetRecordUpdateWrapper resetUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("reset_user_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = response
     * @param response       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper responseEq(String response){
        if(response!=null){
            eq("response",response);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; response
     * @param response       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper responseNe(String response){
        if(response!=null){
            ne("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; response
     * @param response       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper responseGt(String response){
        if(response!=null){
            gt("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= response
     * @param response       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper responseGe(String response){
        if(response!=null){
            ge("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; response
     * @param response       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper responseLt(String response){
        if(response!=null){
            lt("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= response
     * @param response       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper responseLe(String response){
        if(response!=null){
            le("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param responseStart       值1
     * @param responseEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper responseBetween(String responseStart,String responseEnd){
        if(responseStart!=null && responseEnd!=null){
            between("response",responseStart,responseEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param responseStart       值1
     * @param responseEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper responseNotBetween(String responseStart,String responseEnd){
        if(responseStart!=null && responseEnd!=null){
            notBetween("response",responseStart,responseEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' response
     * @param response       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper responseLike(String response){
        if(response!=null){
            like("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' response
     * @param response       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper responseNotLike(String response){
        if(response!=null){
            notLike("response",response);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' response
     * @param response       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper responseLikeLeft(String response){
        if(response!=null){
            likeLeft("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' response
     * @param response       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper responseLikeRight(String response){
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
    public TencentResetRecordUpdateWrapper responseIsNull(){
        isNull("response");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateWrapper responseIsNotNull(){
        isNotNull("response");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateWrapper responseIn(Collection<String> value){
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
    public TencentResetRecordUpdateWrapper responseIn(String... values){
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
    public TencentResetRecordUpdateWrapper responseNotIn(Collection<String> value){
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
    public TencentResetRecordUpdateWrapper responseNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("response",values);
        }
        return this;
    }

    /**
     * <p>重置时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>重置时间</p>
     * 不等于 &lt;&gt; createTime
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 大于 &gt; createTime
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 大于等于 &gt;= createTime
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 小于 &lt; createTime
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * 小于等于 &lt;= createTime
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>重置时间</p>
     * LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * NOT LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>重置时间</p>
     * LIKE '%值' createTime
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * LIKE '值%' createTime
     * @param createTime       值
     * @return children
     */
    public TencentResetRecordUpdateWrapper createTimeLikeRight(Date createTime){
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
    public TencentResetRecordUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>重置时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>重置时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateWrapper createTimeIn(Collection<Date> value){
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
    public TencentResetRecordUpdateWrapper createTimeIn(Date... values){
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
    public TencentResetRecordUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentResetRecordUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


}
