package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.BaiduResetRecord;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 百度云机重置记录
 * </p>
 * "baidu_reset_record"
 * @author PC001
 */
public class BaiduResetRecordUpdateEntityWrapper extends UpdateWrapper<BaiduResetRecord> {

    public static BaiduResetRecordUpdateEntityWrapper wrapper(BaiduResetRecord entity) {
        return new BaiduResetRecordUpdateEntityWrapper(entity);
    }

    private BaiduResetRecord entity;

    public BaiduResetRecordUpdateEntityWrapper(BaiduResetRecord entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public BaiduResetRecordUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 
     */
    public BaiduResetRecordUpdateEntityWrapper setFkBaiduDeviceId(Long fkBaiduDeviceId) {
         set("fk_baidu_device_id",fkBaiduDeviceId);
        return this;
    }
    /**
     * 百度云机id
     */
    public BaiduResetRecordUpdateEntityWrapper setCode(String code) {
         set("code",code);
        return this;
    }
    /**
     * 
     */
    public BaiduResetRecordUpdateEntityWrapper setFkBaiduImagesId(Long fkBaiduImagesId) {
         set("fk_baidu_images_id",fkBaiduImagesId);
        return this;
    }
    /**
     * 镜像版本
     */
    public BaiduResetRecordUpdateEntityWrapper setVersionCode(String versionCode) {
         set("version_code",versionCode);
        return this;
    }
    /**
     * 镜像名称
     */
    public BaiduResetRecordUpdateEntityWrapper setTitle(String title) {
         set("title",title);
        return this;
    }
    /**
     * 重置前镜像版本id
     */
    public BaiduResetRecordUpdateEntityWrapper setOldImageVersionId(String oldImageVersionId) {
         set("old_image_version_id",oldImageVersionId);
        return this;
    }
    /**
     * 当前重置镜像版本id
     */
    public BaiduResetRecordUpdateEntityWrapper setResetImageVersionId(String resetImageVersionId) {
         set("reset_image_version_id",resetImageVersionId);
        return this;
    }
    /**
     * 
     */
    public BaiduResetRecordUpdateEntityWrapper setResetUserId(Long resetUserId) {
         set("reset_user_id",resetUserId);
        return this;
    }
    /**
     * 
     */
    public BaiduResetRecordUpdateEntityWrapper setResponse(String response) {
         set("response",response);
        return this;
    }
    /**
     * 重置时间
     */
    public BaiduResetRecordUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }

    protected BaiduResetRecord entity() {
        if(entity==null){
            throw new NullPointerException("BaiduResetRecord is null");
        }
        return entity;
    }

    /**
     * 
     */
    public BaiduResetRecordUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduResetRecordUpdateEntityWrapper setFkBaiduDeviceId() {
        Long fkBaiduDeviceId =entity().getFkBaiduDeviceId();
        if(fkBaiduDeviceId!=null){
            set("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
    }
    /**
     * 百度云机id
     */
    public BaiduResetRecordUpdateEntityWrapper setCode() {
        String code =entity().getCode();
        if(code!=null){
            set("code",code);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduResetRecordUpdateEntityWrapper setFkBaiduImagesId() {
        Long fkBaiduImagesId =entity().getFkBaiduImagesId();
        if(fkBaiduImagesId!=null){
            set("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
    }
    /**
     * 镜像版本
     */
    public BaiduResetRecordUpdateEntityWrapper setVersionCode() {
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            set("version_code",versionCode);
        }
        return this;
    }
    /**
     * 镜像名称
     */
    public BaiduResetRecordUpdateEntityWrapper setTitle() {
        String title =entity().getTitle();
        if(title!=null){
            set("title",title);
        }
        return this;
    }
    /**
     * 重置前镜像版本id
     */
    public BaiduResetRecordUpdateEntityWrapper setOldImageVersionId() {
        String oldImageVersionId =entity().getOldImageVersionId();
        if(oldImageVersionId!=null){
            set("old_image_version_id",oldImageVersionId);
        }
        return this;
    }
    /**
     * 当前重置镜像版本id
     */
    public BaiduResetRecordUpdateEntityWrapper setResetImageVersionId() {
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            set("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduResetRecordUpdateEntityWrapper setResetUserId() {
        Long resetUserId =entity().getResetUserId();
        if(resetUserId!=null){
            set("reset_user_id",resetUserId);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduResetRecordUpdateEntityWrapper setResponse() {
        String response =entity().getResponse();
        if(response!=null){
            set("response",response);
        }
        return this;
    }
    /**
     * 重置时间
     */
    public BaiduResetRecordUpdateEntityWrapper setCreateTime() {
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
    public BaiduResetRecordUpdateEntityWrapper idEq(){
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
    public BaiduResetRecordUpdateEntityWrapper idNe(){
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
    public BaiduResetRecordUpdateEntityWrapper idGt(){
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
    public BaiduResetRecordUpdateEntityWrapper idGe(){
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
    public BaiduResetRecordUpdateEntityWrapper idLt(){
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
    public BaiduResetRecordUpdateEntityWrapper idLe(){
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
    public BaiduResetRecordUpdateEntityWrapper idBetween(Long idEnd){
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
    public BaiduResetRecordUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public BaiduResetRecordUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public BaiduResetRecordUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public BaiduResetRecordUpdateEntityWrapper idLike(){
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
    public BaiduResetRecordUpdateEntityWrapper idNotLike(){
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
    public BaiduResetRecordUpdateEntityWrapper idLikeLeft(){
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
    public BaiduResetRecordUpdateEntityWrapper idLikeRight(){
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
    public BaiduResetRecordUpdateEntityWrapper idEq(Long id){
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
    public BaiduResetRecordUpdateEntityWrapper idNe(Long id){
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
    public BaiduResetRecordUpdateEntityWrapper idGt(Long id){
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
    public BaiduResetRecordUpdateEntityWrapper idGe(Long id){
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
    public BaiduResetRecordUpdateEntityWrapper idLt(Long id){
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
    public BaiduResetRecordUpdateEntityWrapper idLe(Long id){
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
    public BaiduResetRecordUpdateEntityWrapper idLike(Long id){
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
    public BaiduResetRecordUpdateEntityWrapper idNotLike(Long id){
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
    public BaiduResetRecordUpdateEntityWrapper idLikeLeft(Long id){
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
    public BaiduResetRecordUpdateEntityWrapper idLikeRight(Long id){
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
    public BaiduResetRecordUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper idIn(Collection<Long> value){
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
    public BaiduResetRecordUpdateEntityWrapper idIn(Long... values){
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
    public BaiduResetRecordUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public BaiduResetRecordUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getFkBaiduDeviceId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdEq(){
        Long fkBaiduDeviceId =entity().getFkBaiduDeviceId();
        if(fkBaiduDeviceId!=null){
            eq("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getFkBaiduDeviceId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdNe(){
        Long fkBaiduDeviceId =entity().getFkBaiduDeviceId();
        if(fkBaiduDeviceId!=null){
            ne("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getFkBaiduDeviceId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdGt(){
        Long fkBaiduDeviceId =entity().getFkBaiduDeviceId();
        if(fkBaiduDeviceId!=null){
            gt("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getFkBaiduDeviceId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdGe(){
        Long fkBaiduDeviceId =entity().getFkBaiduDeviceId();
        if(fkBaiduDeviceId!=null){
            ge("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getFkBaiduDeviceId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdLt(){
        Long fkBaiduDeviceId =entity().getFkBaiduDeviceId();
        if(fkBaiduDeviceId!=null){
            lt("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getFkBaiduDeviceId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdLe(){
        Long fkBaiduDeviceId =entity().getFkBaiduDeviceId();
        if(fkBaiduDeviceId!=null){
            le("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkBaiduDeviceId() AND 值2
     * @param fkBaiduDeviceIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdBetween(Long fkBaiduDeviceIdEnd){
        Long fkBaiduDeviceId =entity().getFkBaiduDeviceId();
        if(fkBaiduDeviceId!=null && fkBaiduDeviceIdEnd!=null){
            between("fk_baidu_device_id",fkBaiduDeviceId,fkBaiduDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkBaiduDeviceId() AND 值2
     * @param fkBaiduDeviceIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdNotBetween(Long fkBaiduDeviceIdEnd){
        Long fkBaiduDeviceId =entity().getFkBaiduDeviceId();
        if(fkBaiduDeviceId!=null && fkBaiduDeviceIdEnd!=null){
            notBetween("fk_baidu_device_id",fkBaiduDeviceId,fkBaiduDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkBaiduDeviceId() AND 值2
     * @param fkBaiduDeviceIdStart       值1
     * @param fkBaiduDeviceIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdBetween(Long fkBaiduDeviceIdStart,Long fkBaiduDeviceIdEnd){
        Long fkBaiduDeviceId =entity().getFkBaiduDeviceId();
        if(fkBaiduDeviceId!=null && fkBaiduDeviceIdEnd!=null){
            between("fk_baidu_device_id",fkBaiduDeviceIdStart,fkBaiduDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkBaiduDeviceId() AND 值2
     * @param fkBaiduDeviceIdStart       值1
     * @param fkBaiduDeviceIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdNotBetween(Long fkBaiduDeviceIdStart,Long fkBaiduDeviceIdEnd){
        Long fkBaiduDeviceId =entity().getFkBaiduDeviceId();
        if(fkBaiduDeviceId!=null && fkBaiduDeviceIdEnd!=null){
            notBetween("fk_baidu_device_id",fkBaiduDeviceIdStart,fkBaiduDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getFkBaiduDeviceId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdLike(){
        Long fkBaiduDeviceId =entity().getFkBaiduDeviceId();
        if(fkBaiduDeviceId!=null){
            like("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getFkBaiduDeviceId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdNotLike(){
        Long fkBaiduDeviceId =entity().getFkBaiduDeviceId();
        if(fkBaiduDeviceId!=null){
            notLike("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getFkBaiduDeviceId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdLikeLeft(){
        Long fkBaiduDeviceId =entity().getFkBaiduDeviceId();
        if(fkBaiduDeviceId!=null){
            likeLeft("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getFkBaiduDeviceId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdLikeRight(){
        Long fkBaiduDeviceId =entity().getFkBaiduDeviceId();
        if(fkBaiduDeviceId!=null){
            likeRight("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdEq(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            eq("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdNe(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            ne("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdGt(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            gt("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdGe(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            ge("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdLt(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            lt("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdLe(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            le("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdLike(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            like("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdNotLike(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            notLike("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdLikeLeft(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            likeLeft("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdLikeRight(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            likeRight("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdIsNull(){
        isNull("fk_baidu_device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdIsNotNull(){
        isNotNull("fk_baidu_device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_baidu_device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_baidu_device_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_baidu_device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_baidu_device_id",values);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * 等于 = entity().getCode()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeEq(){
        String code =entity().getCode();
        if(code!=null){
            eq("code",code);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * 不等于 &lt;&gt; entity().getCode()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeNe(){
        String code =entity().getCode();
        if(code!=null){
            ne("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * 大于 &gt; entity().getCode()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeGt(){
        String code =entity().getCode();
        if(code!=null){
            gt("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * 大于等于 &gt;= entity().getCode()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeGe(){
        String code =entity().getCode();
        if(code!=null){
            ge("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * 小于 &lt; entity().getCode()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeLt(){
        String code =entity().getCode();
        if(code!=null){
            lt("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * 小于等于 &lt;= entity().getCode()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeLe(){
        String code =entity().getCode();
        if(code!=null){
            le("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * BETWEEN  entity().getCode() AND 值2
     * @param codeEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeBetween(String codeEnd){
        String code =entity().getCode();
        if(code!=null && codeEnd!=null){
            between("code",code,codeEnd);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * NOT BETWEEN  entity().getCode() AND 值2
     * @param codeEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeNotBetween(String codeEnd){
        String code =entity().getCode();
        if(code!=null && codeEnd!=null){
            notBetween("code",code,codeEnd);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * BETWEEN  entity().getCode() AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeBetween(String codeStart,String codeEnd){
        String code =entity().getCode();
        if(code!=null && codeEnd!=null){
            between("code",codeStart,codeEnd);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * NOT BETWEEN  entity().getCode() AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeNotBetween(String codeStart,String codeEnd){
        String code =entity().getCode();
        if(code!=null && codeEnd!=null){
            notBetween("code",codeStart,codeEnd);
        }
        return this;
     }


    /**
     * <p>百度云机id</p>
     * LIKE '%值%' entity().getCode()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeLike(){
        String code =entity().getCode();
        if(code!=null){
            like("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * NOT LIKE '%值%' entity().getCode()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeNotLike(){
        String code =entity().getCode();
        if(code!=null){
            notLike("code",code);
        }
        return this;
     }


    /**
     * <p>百度云机id</p>
     * LIKE '%值' entity().getCode()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeLikeLeft(){
        String code =entity().getCode();
        if(code!=null){
            likeLeft("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * LIKE '值%' entity().getCode()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeLikeRight(){
        String code =entity().getCode();
        if(code!=null){
            likeRight("code",code);
        }
        return this;
     }

/**
     * <p>百度云机id</p>
     * 等于 =
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeEq(String code){
        if(code!=null){
            eq("code",code);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * 不等于 &lt;&gt;
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeNe(String code){
        if(code!=null){
            ne("code",code);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * 大于 &gt;
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeGt(String code){
        if(code!=null){
            gt("code",code);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * 大于等于 &gt;=
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeGe(String code){
        if(code!=null){
            ge("code",code);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * 小于 &lt;
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeLt(String code){
        if(code!=null){
            lt("code",code);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * 小于等于 &lt;=
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeLe(String code){
        if(code!=null){
            le("code",code);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * LIKE '%值%'
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeLike(String code){
        if(code!=null){
            like("code",code);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * NOT LIKE '%值%'
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeNotLike(String code){
        if(code!=null){
            notLike("code",code);
        }
        return this;
    }


    /**
     * <p>百度云机id</p>
     * LIKE '%值'
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeLikeLeft(String code){
        if(code!=null){
            likeLeft("code",code);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * LIKE '值%'
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeLikeRight(String code){
        if(code!=null){
            likeRight("code",code);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * IS NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeIsNull(){
        isNull("code");
        return this;
    }

    /**
     * <p>百度云机id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeIsNotNull(){
        isNotNull("code");
        return this;
    }

    /**
     * <p>百度云机id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("code",value);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeIn(String... values){
        if(values!=null && values.length>0){
            in("code",values);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("code",value);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper codeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getFkBaiduImagesId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdEq(){
        Long fkBaiduImagesId =entity().getFkBaiduImagesId();
        if(fkBaiduImagesId!=null){
            eq("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getFkBaiduImagesId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdNe(){
        Long fkBaiduImagesId =entity().getFkBaiduImagesId();
        if(fkBaiduImagesId!=null){
            ne("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getFkBaiduImagesId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdGt(){
        Long fkBaiduImagesId =entity().getFkBaiduImagesId();
        if(fkBaiduImagesId!=null){
            gt("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getFkBaiduImagesId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdGe(){
        Long fkBaiduImagesId =entity().getFkBaiduImagesId();
        if(fkBaiduImagesId!=null){
            ge("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getFkBaiduImagesId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdLt(){
        Long fkBaiduImagesId =entity().getFkBaiduImagesId();
        if(fkBaiduImagesId!=null){
            lt("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getFkBaiduImagesId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdLe(){
        Long fkBaiduImagesId =entity().getFkBaiduImagesId();
        if(fkBaiduImagesId!=null){
            le("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkBaiduImagesId() AND 值2
     * @param fkBaiduImagesIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdBetween(Long fkBaiduImagesIdEnd){
        Long fkBaiduImagesId =entity().getFkBaiduImagesId();
        if(fkBaiduImagesId!=null && fkBaiduImagesIdEnd!=null){
            between("fk_baidu_images_id",fkBaiduImagesId,fkBaiduImagesIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkBaiduImagesId() AND 值2
     * @param fkBaiduImagesIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdNotBetween(Long fkBaiduImagesIdEnd){
        Long fkBaiduImagesId =entity().getFkBaiduImagesId();
        if(fkBaiduImagesId!=null && fkBaiduImagesIdEnd!=null){
            notBetween("fk_baidu_images_id",fkBaiduImagesId,fkBaiduImagesIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkBaiduImagesId() AND 值2
     * @param fkBaiduImagesIdStart       值1
     * @param fkBaiduImagesIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdBetween(Long fkBaiduImagesIdStart,Long fkBaiduImagesIdEnd){
        Long fkBaiduImagesId =entity().getFkBaiduImagesId();
        if(fkBaiduImagesId!=null && fkBaiduImagesIdEnd!=null){
            between("fk_baidu_images_id",fkBaiduImagesIdStart,fkBaiduImagesIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkBaiduImagesId() AND 值2
     * @param fkBaiduImagesIdStart       值1
     * @param fkBaiduImagesIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdNotBetween(Long fkBaiduImagesIdStart,Long fkBaiduImagesIdEnd){
        Long fkBaiduImagesId =entity().getFkBaiduImagesId();
        if(fkBaiduImagesId!=null && fkBaiduImagesIdEnd!=null){
            notBetween("fk_baidu_images_id",fkBaiduImagesIdStart,fkBaiduImagesIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getFkBaiduImagesId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdLike(){
        Long fkBaiduImagesId =entity().getFkBaiduImagesId();
        if(fkBaiduImagesId!=null){
            like("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getFkBaiduImagesId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdNotLike(){
        Long fkBaiduImagesId =entity().getFkBaiduImagesId();
        if(fkBaiduImagesId!=null){
            notLike("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getFkBaiduImagesId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdLikeLeft(){
        Long fkBaiduImagesId =entity().getFkBaiduImagesId();
        if(fkBaiduImagesId!=null){
            likeLeft("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getFkBaiduImagesId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdLikeRight(){
        Long fkBaiduImagesId =entity().getFkBaiduImagesId();
        if(fkBaiduImagesId!=null){
            likeRight("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdEq(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            eq("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdNe(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            ne("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdGt(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            gt("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdGe(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            ge("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdLt(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            lt("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdLe(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            le("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdLike(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            like("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdNotLike(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            notLike("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdLikeLeft(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            likeLeft("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdLikeRight(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            likeRight("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdIsNull(){
        isNull("fk_baidu_images_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdIsNotNull(){
        isNotNull("fk_baidu_images_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_baidu_images_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_baidu_images_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_baidu_images_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper fkBaiduImagesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_baidu_images_id",values);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * 等于 = entity().getVersionCode()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper versionCodeEq(){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeNe(){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeGt(){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeGe(){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeLt(){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeLe(){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeBetween(String versionCodeEnd){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeNotBetween(String versionCodeEnd){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeBetween(String versionCodeStart,String versionCodeEnd){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeNotBetween(String versionCodeStart,String versionCodeEnd){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeLike(){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeNotLike(){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeLikeLeft(){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeLikeRight(){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeEq(String versionCode){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeNe(String versionCode){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeGt(String versionCode){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeGe(String versionCode){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeLt(String versionCode){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeLe(String versionCode){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeLike(String versionCode){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeNotLike(String versionCode){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeLikeLeft(String versionCode){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeLikeRight(String versionCode){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeIsNull(){
        isNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper versionCodeIsNotNull(){
        isNotNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper versionCodeIn(Collection<String> value){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeIn(String... values){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeNotIn(Collection<String> value){
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
    public BaiduResetRecordUpdateEntityWrapper versionCodeNotIn(String... values){
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
    public BaiduResetRecordUpdateEntityWrapper titleEq(){
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
    public BaiduResetRecordUpdateEntityWrapper titleNe(){
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
    public BaiduResetRecordUpdateEntityWrapper titleGt(){
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
    public BaiduResetRecordUpdateEntityWrapper titleGe(){
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
    public BaiduResetRecordUpdateEntityWrapper titleLt(){
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
    public BaiduResetRecordUpdateEntityWrapper titleLe(){
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
    public BaiduResetRecordUpdateEntityWrapper titleBetween(String titleEnd){
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
    public BaiduResetRecordUpdateEntityWrapper titleNotBetween(String titleEnd){
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
    public BaiduResetRecordUpdateEntityWrapper titleBetween(String titleStart,String titleEnd){
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
    public BaiduResetRecordUpdateEntityWrapper titleNotBetween(String titleStart,String titleEnd){
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
    public BaiduResetRecordUpdateEntityWrapper titleLike(){
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
    public BaiduResetRecordUpdateEntityWrapper titleNotLike(){
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
    public BaiduResetRecordUpdateEntityWrapper titleLikeLeft(){
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
    public BaiduResetRecordUpdateEntityWrapper titleLikeRight(){
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
    public BaiduResetRecordUpdateEntityWrapper titleEq(String title){
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
    public BaiduResetRecordUpdateEntityWrapper titleNe(String title){
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
    public BaiduResetRecordUpdateEntityWrapper titleGt(String title){
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
    public BaiduResetRecordUpdateEntityWrapper titleGe(String title){
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
    public BaiduResetRecordUpdateEntityWrapper titleLt(String title){
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
    public BaiduResetRecordUpdateEntityWrapper titleLe(String title){
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
    public BaiduResetRecordUpdateEntityWrapper titleLike(String title){
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
    public BaiduResetRecordUpdateEntityWrapper titleNotLike(String title){
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
    public BaiduResetRecordUpdateEntityWrapper titleLikeLeft(String title){
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
    public BaiduResetRecordUpdateEntityWrapper titleLikeRight(String title){
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
    public BaiduResetRecordUpdateEntityWrapper titleIsNull(){
        isNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper titleIsNotNull(){
        isNotNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper titleIn(Collection<String> value){
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
    public BaiduResetRecordUpdateEntityWrapper titleIn(String... values){
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
    public BaiduResetRecordUpdateEntityWrapper titleNotIn(Collection<String> value){
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
    public BaiduResetRecordUpdateEntityWrapper titleNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("title",values);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 等于 = entity().getOldImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdEq(){
        String oldImageVersionId =entity().getOldImageVersionId();
        if(oldImageVersionId!=null){
            eq("old_image_version_id",oldImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 不等于 &lt;&gt; entity().getOldImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdNe(){
        String oldImageVersionId =entity().getOldImageVersionId();
        if(oldImageVersionId!=null){
            ne("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 大于 &gt; entity().getOldImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdGt(){
        String oldImageVersionId =entity().getOldImageVersionId();
        if(oldImageVersionId!=null){
            gt("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 大于等于 &gt;= entity().getOldImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdGe(){
        String oldImageVersionId =entity().getOldImageVersionId();
        if(oldImageVersionId!=null){
            ge("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 小于 &lt; entity().getOldImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdLt(){
        String oldImageVersionId =entity().getOldImageVersionId();
        if(oldImageVersionId!=null){
            lt("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 小于等于 &lt;= entity().getOldImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdLe(){
        String oldImageVersionId =entity().getOldImageVersionId();
        if(oldImageVersionId!=null){
            le("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * BETWEEN  entity().getOldImageVersionId() AND 值2
     * @param oldImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdBetween(String oldImageVersionIdEnd){
        String oldImageVersionId =entity().getOldImageVersionId();
        if(oldImageVersionId!=null && oldImageVersionIdEnd!=null){
            between("old_image_version_id",oldImageVersionId,oldImageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT BETWEEN  entity().getOldImageVersionId() AND 值2
     * @param oldImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdNotBetween(String oldImageVersionIdEnd){
        String oldImageVersionId =entity().getOldImageVersionId();
        if(oldImageVersionId!=null && oldImageVersionIdEnd!=null){
            notBetween("old_image_version_id",oldImageVersionId,oldImageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * BETWEEN  entity().getOldImageVersionId() AND 值2
     * @param oldImageVersionIdStart       值1
     * @param oldImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdBetween(String oldImageVersionIdStart,String oldImageVersionIdEnd){
        String oldImageVersionId =entity().getOldImageVersionId();
        if(oldImageVersionId!=null && oldImageVersionIdEnd!=null){
            between("old_image_version_id",oldImageVersionIdStart,oldImageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT BETWEEN  entity().getOldImageVersionId() AND 值2
     * @param oldImageVersionIdStart       值1
     * @param oldImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdNotBetween(String oldImageVersionIdStart,String oldImageVersionIdEnd){
        String oldImageVersionId =entity().getOldImageVersionId();
        if(oldImageVersionId!=null && oldImageVersionIdEnd!=null){
            notBetween("old_image_version_id",oldImageVersionIdStart,oldImageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值%' entity().getOldImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdLike(){
        String oldImageVersionId =entity().getOldImageVersionId();
        if(oldImageVersionId!=null){
            like("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT LIKE '%值%' entity().getOldImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdNotLike(){
        String oldImageVersionId =entity().getOldImageVersionId();
        if(oldImageVersionId!=null){
            notLike("old_image_version_id",oldImageVersionId);
        }
        return this;
     }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值' entity().getOldImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdLikeLeft(){
        String oldImageVersionId =entity().getOldImageVersionId();
        if(oldImageVersionId!=null){
            likeLeft("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * LIKE '值%' entity().getOldImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdLikeRight(){
        String oldImageVersionId =entity().getOldImageVersionId();
        if(oldImageVersionId!=null){
            likeRight("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

/**
     * <p>重置前镜像版本id</p>
     * 等于 =
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdEq(String oldImageVersionId){
        if(oldImageVersionId!=null){
            eq("old_image_version_id",oldImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 不等于 &lt;&gt;
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdNe(String oldImageVersionId){
        if(oldImageVersionId!=null){
            ne("old_image_version_id",oldImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 大于 &gt;
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdGt(String oldImageVersionId){
        if(oldImageVersionId!=null){
            gt("old_image_version_id",oldImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 大于等于 &gt;=
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdGe(String oldImageVersionId){
        if(oldImageVersionId!=null){
            ge("old_image_version_id",oldImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 小于 &lt;
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdLt(String oldImageVersionId){
        if(oldImageVersionId!=null){
            lt("old_image_version_id",oldImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 小于等于 &lt;=
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdLe(String oldImageVersionId){
        if(oldImageVersionId!=null){
            le("old_image_version_id",oldImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值%'
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdLike(String oldImageVersionId){
        if(oldImageVersionId!=null){
            like("old_image_version_id",oldImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * NOT LIKE '%值%'
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdNotLike(String oldImageVersionId){
        if(oldImageVersionId!=null){
            notLike("old_image_version_id",oldImageVersionId);
        }
        return this;
    }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值'
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdLikeLeft(String oldImageVersionId){
        if(oldImageVersionId!=null){
            likeLeft("old_image_version_id",oldImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * LIKE '值%'
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdLikeRight(String oldImageVersionId){
        if(oldImageVersionId!=null){
            likeRight("old_image_version_id",oldImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IS NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdIsNull(){
        isNull("old_image_version_id");
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdIsNotNull(){
        isNotNull("old_image_version_id");
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("old_image_version_id",value);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdIn(String... values){
        if(values!=null && values.length>0){
            in("old_image_version_id",values);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("old_image_version_id",value);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper oldImageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("old_image_version_id",values);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 等于 = entity().getResetImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdEq(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            eq("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 不等于 &lt;&gt; entity().getResetImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdNe(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            ne("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于 &gt; entity().getResetImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdGt(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            gt("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于等于 &gt;= entity().getResetImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdGe(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            ge("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于 &lt; entity().getResetImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdLt(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            lt("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于等于 &lt;= entity().getResetImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdLe(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            le("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * BETWEEN  entity().getResetImageVersionId() AND 值2
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdBetween(String resetImageVersionIdEnd){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null && resetImageVersionIdEnd!=null){
            between("reset_image_version_id",resetImageVersionId,resetImageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT BETWEEN  entity().getResetImageVersionId() AND 值2
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdNotBetween(String resetImageVersionIdEnd){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null && resetImageVersionIdEnd!=null){
            notBetween("reset_image_version_id",resetImageVersionId,resetImageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * BETWEEN  entity().getResetImageVersionId() AND 值2
     * @param resetImageVersionIdStart       值1
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdBetween(String resetImageVersionIdStart,String resetImageVersionIdEnd){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null && resetImageVersionIdEnd!=null){
            between("reset_image_version_id",resetImageVersionIdStart,resetImageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT BETWEEN  entity().getResetImageVersionId() AND 值2
     * @param resetImageVersionIdStart       值1
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdNotBetween(String resetImageVersionIdStart,String resetImageVersionIdEnd){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null && resetImageVersionIdEnd!=null){
            notBetween("reset_image_version_id",resetImageVersionIdStart,resetImageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值%' entity().getResetImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdLike(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            like("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT LIKE '%值%' entity().getResetImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdNotLike(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            notLike("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值' entity().getResetImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdLikeLeft(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            likeLeft("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '值%' entity().getResetImageVersionId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdLikeRight(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            likeRight("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

/**
     * <p>当前重置镜像版本id</p>
     * 等于 =
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdEq(String resetImageVersionId){
        if(resetImageVersionId!=null){
            eq("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 不等于 &lt;&gt;
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdNe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            ne("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于 &gt;
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdGt(String resetImageVersionId){
        if(resetImageVersionId!=null){
            gt("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于等于 &gt;=
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdGe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            ge("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于 &lt;
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdLt(String resetImageVersionId){
        if(resetImageVersionId!=null){
            lt("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于等于 &lt;=
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdLe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            le("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值%'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdLike(String resetImageVersionId){
        if(resetImageVersionId!=null){
            like("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT LIKE '%值%'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdNotLike(String resetImageVersionId){
        if(resetImageVersionId!=null){
            notLike("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdLikeLeft(String resetImageVersionId){
        if(resetImageVersionId!=null){
            likeLeft("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '值%'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdLikeRight(String resetImageVersionId){
        if(resetImageVersionId!=null){
            likeRight("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IS NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdIsNull(){
        isNull("reset_image_version_id");
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdIsNotNull(){
        isNotNull("reset_image_version_id");
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("reset_image_version_id",value);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdIn(String... values){
        if(values!=null && values.length>0){
            in("reset_image_version_id",values);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_image_version_id",value);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetImageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_image_version_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getResetUserId()
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetUserIdEq(){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdNe(){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdGt(){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdGe(){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdLt(){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdLe(){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdBetween(Long resetUserIdEnd){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdNotBetween(Long resetUserIdEnd){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdBetween(Long resetUserIdStart,Long resetUserIdEnd){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdNotBetween(Long resetUserIdStart,Long resetUserIdEnd){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdLike(){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdNotLike(){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdLikeLeft(){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdLikeRight(){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdEq(Long resetUserId){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdNe(Long resetUserId){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdGt(Long resetUserId){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdGe(Long resetUserId){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdLt(Long resetUserId){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdLe(Long resetUserId){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdLike(Long resetUserId){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdNotLike(Long resetUserId){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdLikeLeft(Long resetUserId){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdLikeRight(Long resetUserId){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdIsNull(){
        isNull("reset_user_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetUserIdIsNotNull(){
        isNotNull("reset_user_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper resetUserIdIn(Collection<Long> value){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdIn(Long... values){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdNotIn(Collection<Long> value){
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
    public BaiduResetRecordUpdateEntityWrapper resetUserIdNotIn(Long... values){
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
    public BaiduResetRecordUpdateEntityWrapper responseEq(){
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
    public BaiduResetRecordUpdateEntityWrapper responseNe(){
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
    public BaiduResetRecordUpdateEntityWrapper responseGt(){
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
    public BaiduResetRecordUpdateEntityWrapper responseGe(){
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
    public BaiduResetRecordUpdateEntityWrapper responseLt(){
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
    public BaiduResetRecordUpdateEntityWrapper responseLe(){
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
    public BaiduResetRecordUpdateEntityWrapper responseBetween(String responseEnd){
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
    public BaiduResetRecordUpdateEntityWrapper responseNotBetween(String responseEnd){
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
    public BaiduResetRecordUpdateEntityWrapper responseBetween(String responseStart,String responseEnd){
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
    public BaiduResetRecordUpdateEntityWrapper responseNotBetween(String responseStart,String responseEnd){
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
    public BaiduResetRecordUpdateEntityWrapper responseLike(){
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
    public BaiduResetRecordUpdateEntityWrapper responseNotLike(){
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
    public BaiduResetRecordUpdateEntityWrapper responseLikeLeft(){
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
    public BaiduResetRecordUpdateEntityWrapper responseLikeRight(){
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
    public BaiduResetRecordUpdateEntityWrapper responseEq(String response){
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
    public BaiduResetRecordUpdateEntityWrapper responseNe(String response){
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
    public BaiduResetRecordUpdateEntityWrapper responseGt(String response){
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
    public BaiduResetRecordUpdateEntityWrapper responseGe(String response){
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
    public BaiduResetRecordUpdateEntityWrapper responseLt(String response){
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
    public BaiduResetRecordUpdateEntityWrapper responseLe(String response){
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
    public BaiduResetRecordUpdateEntityWrapper responseLike(String response){
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
    public BaiduResetRecordUpdateEntityWrapper responseNotLike(String response){
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
    public BaiduResetRecordUpdateEntityWrapper responseLikeLeft(String response){
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
    public BaiduResetRecordUpdateEntityWrapper responseLikeRight(String response){
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
    public BaiduResetRecordUpdateEntityWrapper responseIsNull(){
        isNull("response");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper responseIsNotNull(){
        isNotNull("response");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper responseIn(Collection<String> value){
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
    public BaiduResetRecordUpdateEntityWrapper responseIn(String... values){
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
    public BaiduResetRecordUpdateEntityWrapper responseNotIn(Collection<String> value){
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
    public BaiduResetRecordUpdateEntityWrapper responseNotIn(String... values){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeEq(){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeNe(){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeGt(){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeGe(){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeLt(){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeLe(){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeLike(){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeNotLike(){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeLikeLeft(){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeLikeRight(){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeEq(Date createTime){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeNe(Date createTime){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeGt(Date createTime){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeGe(Date createTime){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeLt(Date createTime){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeLe(Date createTime){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeLike(Date createTime){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>重置时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>重置时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeIn(Date... values){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public BaiduResetRecordUpdateEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


}
