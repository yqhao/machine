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
public class TencentResetRecordUpdateEntityWrapper extends UpdateWrapper<TencentResetRecord> {

    public static TencentResetRecordUpdateEntityWrapper wrapper(TencentResetRecord entity) {
        return new TencentResetRecordUpdateEntityWrapper(entity);
    }

    private TencentResetRecord entity;

    public TencentResetRecordUpdateEntityWrapper(TencentResetRecord entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public TencentResetRecordUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 
     */
    public TencentResetRecordUpdateEntityWrapper setFkTencentDeviceId(Long fkTencentDeviceId) {
         set("fk_tencent_device_id",fkTencentDeviceId);
        return this;
    }
    /**
     * 腾讯云机id
     */
    public TencentResetRecordUpdateEntityWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 
     */
    public TencentResetRecordUpdateEntityWrapper setFkTencentImagesId(Long fkTencentImagesId) {
         set("fk_tencent_images_id",fkTencentImagesId);
        return this;
    }
    /**
     * 镜像版本
     */
    public TencentResetRecordUpdateEntityWrapper setVersionCode(String versionCode) {
         set("version_code",versionCode);
        return this;
    }
    /**
     * 镜像名称
     */
    public TencentResetRecordUpdateEntityWrapper setTitle(String title) {
         set("title",title);
        return this;
    }
    /**
     * 重置前镜像版本id
     */
    public TencentResetRecordUpdateEntityWrapper setOldImageId(String oldImageId) {
         set("old_image_id",oldImageId);
        return this;
    }
    /**
     * 当前重置镜像版本id
     */
    public TencentResetRecordUpdateEntityWrapper setResetImageId(String resetImageId) {
         set("reset_image_id",resetImageId);
        return this;
    }
    /**
     * 
     */
    public TencentResetRecordUpdateEntityWrapper setResetUserId(Long resetUserId) {
         set("reset_user_id",resetUserId);
        return this;
    }
    /**
     * 
     */
    public TencentResetRecordUpdateEntityWrapper setResponse(String response) {
         set("response",response);
        return this;
    }
    /**
     * 重置时间
     */
    public TencentResetRecordUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }

    protected TencentResetRecord entity() {
        if(entity==null){
            throw new NullPointerException("TencentResetRecord is null");
        }
        return entity;
    }

    /**
     * 
     */
    public TencentResetRecordUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 
     */
    public TencentResetRecordUpdateEntityWrapper setFkTencentDeviceId() {
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            set("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
    }
    /**
     * 腾讯云机id
     */
    public TencentResetRecordUpdateEntityWrapper setInstanceId() {
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            set("instance_id",instanceId);
        }
        return this;
    }
    /**
     * 
     */
    public TencentResetRecordUpdateEntityWrapper setFkTencentImagesId() {
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null){
            set("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
    }
    /**
     * 镜像版本
     */
    public TencentResetRecordUpdateEntityWrapper setVersionCode() {
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            set("version_code",versionCode);
        }
        return this;
    }
    /**
     * 镜像名称
     */
    public TencentResetRecordUpdateEntityWrapper setTitle() {
        String title =entity().getTitle();
        if(title!=null){
            set("title",title);
        }
        return this;
    }
    /**
     * 重置前镜像版本id
     */
    public TencentResetRecordUpdateEntityWrapper setOldImageId() {
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null){
            set("old_image_id",oldImageId);
        }
        return this;
    }
    /**
     * 当前重置镜像版本id
     */
    public TencentResetRecordUpdateEntityWrapper setResetImageId() {
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            set("reset_image_id",resetImageId);
        }
        return this;
    }
    /**
     * 
     */
    public TencentResetRecordUpdateEntityWrapper setResetUserId() {
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            set("reset_user_id",resetUserId);
        }
        return this;
    }
    /**
     * 
     */
    public TencentResetRecordUpdateEntityWrapper setResponse() {
        String response =entity().getResponse();
        if(response!=null){
            set("response",response);
        }
        return this;
    }
    /**
     * 重置时间
     */
    public TencentResetRecordUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper idEq(){
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
    public TencentResetRecordUpdateEntityWrapper idNe(){
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
    public TencentResetRecordUpdateEntityWrapper idGt(){
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
    public TencentResetRecordUpdateEntityWrapper idGe(){
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
    public TencentResetRecordUpdateEntityWrapper idLt(){
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
    public TencentResetRecordUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper idBetween(Long idEnd){
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
    public TencentResetRecordUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public TencentResetRecordUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentResetRecordUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentResetRecordUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper idLikeRight(){
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
    public TencentResetRecordUpdateEntityWrapper idEq(Long id){
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
    public TencentResetRecordUpdateEntityWrapper idNe(Long id){
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
    public TencentResetRecordUpdateEntityWrapper idGt(Long id){
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
    public TencentResetRecordUpdateEntityWrapper idGe(Long id){
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
    public TencentResetRecordUpdateEntityWrapper idLt(Long id){
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
    public TencentResetRecordUpdateEntityWrapper idLe(Long id){
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
    public TencentResetRecordUpdateEntityWrapper idLike(Long id){
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
    public TencentResetRecordUpdateEntityWrapper idNotLike(Long id){
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
    public TencentResetRecordUpdateEntityWrapper idLikeLeft(Long id){
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
    public TencentResetRecordUpdateEntityWrapper idLikeRight(Long id){
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
    public TencentResetRecordUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper idIn(Collection<Long> value){
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
    public TencentResetRecordUpdateEntityWrapper idIn(Long... values){
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
    public TencentResetRecordUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public TencentResetRecordUpdateEntityWrapper idNotIn(Long... values){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdEq(){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdNe(){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdGt(){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdGe(){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdLt(){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdLe(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            le("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkTencentDeviceId() AND 值2
     * @param fkTencentDeviceIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdBetween(Long fkTencentDeviceIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdNotBetween(Long fkTencentDeviceIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdNotBetween(Long fkTencentDeviceIdStart,Long fkTencentDeviceIdEnd){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null && fkTencentDeviceIdEnd!=null){
            notBetween("fk_tencent_device_id",fkTencentDeviceIdStart,fkTencentDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdLike(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            like("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdNotLike(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            notLike("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdLikeLeft(){
        Long fkTencentDeviceId =entity().getFkTencentDeviceId();
        if(fkTencentDeviceId!=null){
            likeLeft("fk_tencent_device_id",fkTencentDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getFkTencentDeviceId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdLikeRight(){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdEq(Long fkTencentDeviceId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdNe(Long fkTencentDeviceId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdGt(Long fkTencentDeviceId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdGe(Long fkTencentDeviceId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdLt(Long fkTencentDeviceId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdLe(Long fkTencentDeviceId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdLike(Long fkTencentDeviceId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdNotLike(Long fkTencentDeviceId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdLikeLeft(Long fkTencentDeviceId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdLikeRight(Long fkTencentDeviceId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdIsNull(){
        isNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdIsNotNull(){
        isNotNull("fk_tencent_device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdIn(Collection<Long> value){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdIn(Long... values){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdNotIn(Collection<Long> value){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentDeviceIdNotIn(Long... values){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdEq(){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdNe(){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdGt(){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdGe(){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdLt(){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdLe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper instanceIdBetween(String instanceIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdNotBetween(String instanceIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯云机id</p>
     * LIKE '%值%' entity().getInstanceId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper instanceIdLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * NOT LIKE '%值%' entity().getInstanceId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper instanceIdNotLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>腾讯云机id</p>
     * LIKE '%值' entity().getInstanceId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper instanceIdLikeLeft(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>腾讯云机id</p>
     * LIKE '值%' entity().getInstanceId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper instanceIdLikeRight(){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdEq(String instanceId){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdNe(String instanceId){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdGt(String instanceId){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdGe(String instanceId){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdLt(String instanceId){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdLe(String instanceId){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdLike(String instanceId){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdNotLike(String instanceId){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdLikeLeft(String instanceId){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdLikeRight(String instanceId){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>腾讯云机id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper instanceIdIn(Collection<String> value){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdIn(String... values){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdNotIn(Collection<String> value){
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
    public TencentResetRecordUpdateEntityWrapper instanceIdNotIn(String... values){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdEq(){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdNe(){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdGt(){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdGe(){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdLt(){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdLe(){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null){
            le("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkTencentImagesId() AND 值2
     * @param fkTencentImagesIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdBetween(Long fkTencentImagesIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdNotBetween(Long fkTencentImagesIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdBetween(Long fkTencentImagesIdStart,Long fkTencentImagesIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdNotBetween(Long fkTencentImagesIdStart,Long fkTencentImagesIdEnd){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null && fkTencentImagesIdEnd!=null){
            notBetween("fk_tencent_images_id",fkTencentImagesIdStart,fkTencentImagesIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getFkTencentImagesId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdLike(){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null){
            like("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getFkTencentImagesId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdNotLike(){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null){
            notLike("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getFkTencentImagesId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdLikeLeft(){
        Long fkTencentImagesId =entity().getFkTencentImagesId();
        if(fkTencentImagesId!=null){
            likeLeft("fk_tencent_images_id",fkTencentImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getFkTencentImagesId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdLikeRight(){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdEq(Long fkTencentImagesId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdNe(Long fkTencentImagesId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdGt(Long fkTencentImagesId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdGe(Long fkTencentImagesId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdLt(Long fkTencentImagesId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdLe(Long fkTencentImagesId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdLike(Long fkTencentImagesId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdNotLike(Long fkTencentImagesId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdLikeLeft(Long fkTencentImagesId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdLikeRight(Long fkTencentImagesId){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdIsNull(){
        isNull("fk_tencent_images_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdIsNotNull(){
        isNotNull("fk_tencent_images_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdIn(Collection<Long> value){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdIn(Long... values){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdNotIn(Collection<Long> value){
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
    public TencentResetRecordUpdateEntityWrapper fkTencentImagesIdNotIn(Long... values){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeEq(){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeNe(){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeGt(){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeGe(){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeLt(){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeLe(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            le("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * BETWEEN  entity().getVersionCode() AND 值2
     * @param versionCodeEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper versionCodeBetween(String versionCodeEnd){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeNotBetween(String versionCodeEnd){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeBetween(String versionCodeStart,String versionCodeEnd){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeNotBetween(String versionCodeStart,String versionCodeEnd){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null && versionCodeEnd!=null){
            notBetween("version_code",versionCodeStart,versionCodeEnd);
        }
        return this;
     }


    /**
     * <p>镜像版本</p>
     * LIKE '%值%' entity().getVersionCode()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper versionCodeLike(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            like("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * NOT LIKE '%值%' entity().getVersionCode()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper versionCodeNotLike(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            notLike("version_code",versionCode);
        }
        return this;
     }


    /**
     * <p>镜像版本</p>
     * LIKE '%值' entity().getVersionCode()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper versionCodeLikeLeft(){
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            likeLeft("version_code",versionCode);
        }
        return this;
     }

    /**
     * <p>镜像版本</p>
     * LIKE '值%' entity().getVersionCode()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper versionCodeLikeRight(){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeEq(String versionCode){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeNe(String versionCode){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeGt(String versionCode){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeGe(String versionCode){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeLt(String versionCode){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeLe(String versionCode){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeLike(String versionCode){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeNotLike(String versionCode){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeLikeLeft(String versionCode){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeLikeRight(String versionCode){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeIsNull(){
        isNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper versionCodeIsNotNull(){
        isNotNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper versionCodeIn(Collection<String> value){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeIn(String... values){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeNotIn(Collection<String> value){
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
    public TencentResetRecordUpdateEntityWrapper versionCodeNotIn(String... values){
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
    public TencentResetRecordUpdateEntityWrapper titleEq(){
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
    public TencentResetRecordUpdateEntityWrapper titleNe(){
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
    public TencentResetRecordUpdateEntityWrapper titleGt(){
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
    public TencentResetRecordUpdateEntityWrapper titleGe(){
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
    public TencentResetRecordUpdateEntityWrapper titleLt(){
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
    public TencentResetRecordUpdateEntityWrapper titleLe(){
        String title =entity().getTitle();
        if(title!=null){
            le("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * BETWEEN  entity().getTitle() AND 值2
     * @param titleEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper titleBetween(String titleEnd){
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
    public TencentResetRecordUpdateEntityWrapper titleNotBetween(String titleEnd){
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
    public TencentResetRecordUpdateEntityWrapper titleBetween(String titleStart,String titleEnd){
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
    public TencentResetRecordUpdateEntityWrapper titleNotBetween(String titleStart,String titleEnd){
        String title =entity().getTitle();
        if(title!=null && titleEnd!=null){
            notBetween("title",titleStart,titleEnd);
        }
        return this;
     }


    /**
     * <p>镜像名称</p>
     * LIKE '%值%' entity().getTitle()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper titleLike(){
        String title =entity().getTitle();
        if(title!=null){
            like("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * NOT LIKE '%值%' entity().getTitle()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper titleNotLike(){
        String title =entity().getTitle();
        if(title!=null){
            notLike("title",title);
        }
        return this;
     }


    /**
     * <p>镜像名称</p>
     * LIKE '%值' entity().getTitle()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper titleLikeLeft(){
        String title =entity().getTitle();
        if(title!=null){
            likeLeft("title",title);
        }
        return this;
     }

    /**
     * <p>镜像名称</p>
     * LIKE '值%' entity().getTitle()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper titleLikeRight(){
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
    public TencentResetRecordUpdateEntityWrapper titleEq(String title){
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
    public TencentResetRecordUpdateEntityWrapper titleNe(String title){
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
    public TencentResetRecordUpdateEntityWrapper titleGt(String title){
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
    public TencentResetRecordUpdateEntityWrapper titleGe(String title){
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
    public TencentResetRecordUpdateEntityWrapper titleLt(String title){
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
    public TencentResetRecordUpdateEntityWrapper titleLe(String title){
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
    public TencentResetRecordUpdateEntityWrapper titleLike(String title){
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
    public TencentResetRecordUpdateEntityWrapper titleNotLike(String title){
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
    public TencentResetRecordUpdateEntityWrapper titleLikeLeft(String title){
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
    public TencentResetRecordUpdateEntityWrapper titleLikeRight(String title){
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
    public TencentResetRecordUpdateEntityWrapper titleIsNull(){
        isNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper titleIsNotNull(){
        isNotNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper titleIn(Collection<String> value){
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
    public TencentResetRecordUpdateEntityWrapper titleIn(String... values){
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
    public TencentResetRecordUpdateEntityWrapper titleNotIn(Collection<String> value){
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
    public TencentResetRecordUpdateEntityWrapper titleNotIn(String... values){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdEq(){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdNe(){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdGt(){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdGe(){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdLt(){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdLe(){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null){
            le("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * BETWEEN  entity().getOldImageId() AND 值2
     * @param oldImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper oldImageIdBetween(String oldImageIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdNotBetween(String oldImageIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdBetween(String oldImageIdStart,String oldImageIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdNotBetween(String oldImageIdStart,String oldImageIdEnd){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null && oldImageIdEnd!=null){
            notBetween("old_image_id",oldImageIdStart,oldImageIdEnd);
        }
        return this;
     }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值%' entity().getOldImageId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper oldImageIdLike(){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null){
            like("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT LIKE '%值%' entity().getOldImageId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper oldImageIdNotLike(){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null){
            notLike("old_image_id",oldImageId);
        }
        return this;
     }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值' entity().getOldImageId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper oldImageIdLikeLeft(){
        String oldImageId =entity().getOldImageId();
        if(oldImageId!=null){
            likeLeft("old_image_id",oldImageId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * LIKE '值%' entity().getOldImageId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper oldImageIdLikeRight(){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdEq(String oldImageId){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdNe(String oldImageId){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdGt(String oldImageId){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdGe(String oldImageId){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdLt(String oldImageId){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdLe(String oldImageId){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdLike(String oldImageId){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdNotLike(String oldImageId){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdLikeLeft(String oldImageId){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdLikeRight(String oldImageId){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdIsNull(){
        isNull("old_image_id");
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper oldImageIdIsNotNull(){
        isNotNull("old_image_id");
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper oldImageIdIn(Collection<String> value){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdIn(String... values){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdNotIn(Collection<String> value){
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
    public TencentResetRecordUpdateEntityWrapper oldImageIdNotIn(String... values){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdEq(){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdNe(){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdGt(){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdGe(){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdLt(){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdLe(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            le("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * BETWEEN  entity().getResetImageId() AND 值2
     * @param resetImageIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper resetImageIdBetween(String resetImageIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdNotBetween(String resetImageIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdBetween(String resetImageIdStart,String resetImageIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdNotBetween(String resetImageIdStart,String resetImageIdEnd){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null && resetImageIdEnd!=null){
            notBetween("reset_image_id",resetImageIdStart,resetImageIdEnd);
        }
        return this;
     }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值%' entity().getResetImageId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper resetImageIdLike(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            like("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT LIKE '%值%' entity().getResetImageId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper resetImageIdNotLike(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            notLike("reset_image_id",resetImageId);
        }
        return this;
     }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值' entity().getResetImageId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper resetImageIdLikeLeft(){
        String resetImageId =entity().getResetImageId();
        if(resetImageId!=null){
            likeLeft("reset_image_id",resetImageId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '值%' entity().getResetImageId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper resetImageIdLikeRight(){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdEq(String resetImageId){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdNe(String resetImageId){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdGt(String resetImageId){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdGe(String resetImageId){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdLt(String resetImageId){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdLe(String resetImageId){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdLike(String resetImageId){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdNotLike(String resetImageId){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdLikeLeft(String resetImageId){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdLikeRight(String resetImageId){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdIsNull(){
        isNull("reset_image_id");
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper resetImageIdIsNotNull(){
        isNotNull("reset_image_id");
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper resetImageIdIn(Collection<String> value){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdIn(String... values){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdNotIn(Collection<String> value){
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
    public TencentResetRecordUpdateEntityWrapper resetImageIdNotIn(String... values){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdEq(){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdNe(){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdGt(){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdGe(){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdLt(){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdLe(){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            le("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getResetUserId() AND 值2
     * @param resetUserIdEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper resetUserIdBetween(Long resetUserIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdNotBetween(Long resetUserIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdBetween(Long resetUserIdStart,Long resetUserIdEnd){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdNotBetween(Long resetUserIdStart,Long resetUserIdEnd){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null && resetUserIdEnd!=null){
            notBetween("reset_user_id",resetUserIdStart,resetUserIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getResetUserId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper resetUserIdLike(){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            like("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getResetUserId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper resetUserIdNotLike(){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            notLike("reset_user_id",resetUserId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getResetUserId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper resetUserIdLikeLeft(){
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            likeLeft("reset_user_id",resetUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getResetUserId()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper resetUserIdLikeRight(){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdEq(Long resetUserId){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdNe(Long resetUserId){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdGt(Long resetUserId){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdGe(Long resetUserId){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdLt(Long resetUserId){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdLe(Long resetUserId){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdLike(Long resetUserId){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdNotLike(Long resetUserId){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdLikeLeft(Long resetUserId){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdLikeRight(Long resetUserId){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdIsNull(){
        isNull("reset_user_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper resetUserIdIsNotNull(){
        isNotNull("reset_user_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper resetUserIdIn(Collection<Long> value){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdIn(Long... values){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdNotIn(Collection<Long> value){
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
    public TencentResetRecordUpdateEntityWrapper resetUserIdNotIn(Long... values){
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
    public TencentResetRecordUpdateEntityWrapper responseEq(){
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
    public TencentResetRecordUpdateEntityWrapper responseNe(){
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
    public TencentResetRecordUpdateEntityWrapper responseGt(){
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
    public TencentResetRecordUpdateEntityWrapper responseGe(){
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
    public TencentResetRecordUpdateEntityWrapper responseLt(){
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
    public TencentResetRecordUpdateEntityWrapper responseLe(){
        String response =entity().getResponse();
        if(response!=null){
            le("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getResponse() AND 值2
     * @param responseEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper responseBetween(String responseEnd){
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
    public TencentResetRecordUpdateEntityWrapper responseNotBetween(String responseEnd){
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
    public TencentResetRecordUpdateEntityWrapper responseBetween(String responseStart,String responseEnd){
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
    public TencentResetRecordUpdateEntityWrapper responseNotBetween(String responseStart,String responseEnd){
        String response =entity().getResponse();
        if(response!=null && responseEnd!=null){
            notBetween("response",responseStart,responseEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getResponse()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper responseLike(){
        String response =entity().getResponse();
        if(response!=null){
            like("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getResponse()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper responseNotLike(){
        String response =entity().getResponse();
        if(response!=null){
            notLike("response",response);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getResponse()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper responseLikeLeft(){
        String response =entity().getResponse();
        if(response!=null){
            likeLeft("response",response);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getResponse()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper responseLikeRight(){
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
    public TencentResetRecordUpdateEntityWrapper responseEq(String response){
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
    public TencentResetRecordUpdateEntityWrapper responseNe(String response){
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
    public TencentResetRecordUpdateEntityWrapper responseGt(String response){
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
    public TencentResetRecordUpdateEntityWrapper responseGe(String response){
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
    public TencentResetRecordUpdateEntityWrapper responseLt(String response){
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
    public TencentResetRecordUpdateEntityWrapper responseLe(String response){
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
    public TencentResetRecordUpdateEntityWrapper responseLike(String response){
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
    public TencentResetRecordUpdateEntityWrapper responseNotLike(String response){
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
    public TencentResetRecordUpdateEntityWrapper responseLikeLeft(String response){
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
    public TencentResetRecordUpdateEntityWrapper responseLikeRight(String response){
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
    public TencentResetRecordUpdateEntityWrapper responseIsNull(){
        isNull("response");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper responseIsNotNull(){
        isNotNull("response");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper responseIn(Collection<String> value){
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
    public TencentResetRecordUpdateEntityWrapper responseIn(String... values){
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
    public TencentResetRecordUpdateEntityWrapper responseNotIn(Collection<String> value){
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
    public TencentResetRecordUpdateEntityWrapper responseNotIn(String... values){
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
    public TencentResetRecordUpdateEntityWrapper createTimeEq(){
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
    public TencentResetRecordUpdateEntityWrapper createTimeNe(){
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
    public TencentResetRecordUpdateEntityWrapper createTimeGt(){
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
    public TencentResetRecordUpdateEntityWrapper createTimeGe(){
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
    public TencentResetRecordUpdateEntityWrapper createTimeLt(){
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
    public TencentResetRecordUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public TencentResetRecordUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public TencentResetRecordUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentResetRecordUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>重置时间</p>
     * LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>重置时间</p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>重置时间</p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper createTimeLikeRight(){
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
    public TencentResetRecordUpdateEntityWrapper createTimeEq(Date createTime){
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
    public TencentResetRecordUpdateEntityWrapper createTimeNe(Date createTime){
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
    public TencentResetRecordUpdateEntityWrapper createTimeGt(Date createTime){
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
    public TencentResetRecordUpdateEntityWrapper createTimeGe(Date createTime){
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
    public TencentResetRecordUpdateEntityWrapper createTimeLt(Date createTime){
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
    public TencentResetRecordUpdateEntityWrapper createTimeLe(Date createTime){
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
    public TencentResetRecordUpdateEntityWrapper createTimeLike(Date createTime){
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
    public TencentResetRecordUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public TencentResetRecordUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public TencentResetRecordUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public TencentResetRecordUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>重置时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>重置时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentResetRecordUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public TencentResetRecordUpdateEntityWrapper createTimeIn(Date... values){
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
    public TencentResetRecordUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentResetRecordUpdateEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


}
