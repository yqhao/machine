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
public class BaiduResetRecordUpdateWrapper extends UpdateWrapper<BaiduResetRecord> {

    public static BaiduResetRecordUpdateWrapper wrapper() {
        return new BaiduResetRecordUpdateWrapper();
    }

    public BaiduResetRecordUpdateWrapper() {
        super();
    }

    public BaiduResetRecordUpdateWrapper(BaiduResetRecord entity) {
        super(entity);
    }

    /**
     * 
     */
    public BaiduResetRecordUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 
     */
    public BaiduResetRecordUpdateWrapper setFkBaiduDeviceId(Long fkBaiduDeviceId) {
         set("fk_baidu_device_id",fkBaiduDeviceId);
        return this;
    }
    /**
     * 百度云机id
     */
    public BaiduResetRecordUpdateWrapper setCode(String code) {
         set("code",code);
        return this;
    }
    /**
     * 
     */
    public BaiduResetRecordUpdateWrapper setFkBaiduImagesId(Long fkBaiduImagesId) {
         set("fk_baidu_images_id",fkBaiduImagesId);
        return this;
    }
    /**
     * 镜像版本
     */
    public BaiduResetRecordUpdateWrapper setVersionCode(String versionCode) {
         set("version_code",versionCode);
        return this;
    }
    /**
     * 镜像名称
     */
    public BaiduResetRecordUpdateWrapper setTitle(String title) {
         set("title",title);
        return this;
    }
    /**
     * 重置前镜像版本id
     */
    public BaiduResetRecordUpdateWrapper setOldImageVersionId(String oldImageVersionId) {
         set("old_image_version_id",oldImageVersionId);
        return this;
    }
    /**
     * 当前重置镜像版本id
     */
    public BaiduResetRecordUpdateWrapper setResetImageVersionId(String resetImageVersionId) {
         set("reset_image_version_id",resetImageVersionId);
        return this;
    }
    /**
     * 
     */
    public BaiduResetRecordUpdateWrapper setResetUserId(Long resetUserId) {
         set("reset_user_id",resetUserId);
        return this;
    }
    /**
     * 
     */
    public BaiduResetRecordUpdateWrapper setResponse(String response) {
         set("response",response);
        return this;
    }
    /**
     * 重置时间
     */
    public BaiduResetRecordUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper idEq(Long id){
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
    public BaiduResetRecordUpdateWrapper idNe(Long id){
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
    public BaiduResetRecordUpdateWrapper idGt(Long id){
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
    public BaiduResetRecordUpdateWrapper idGe(Long id){
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
    public BaiduResetRecordUpdateWrapper idLt(Long id){
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
    public BaiduResetRecordUpdateWrapper idLe(Long id){
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
    public BaiduResetRecordUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public BaiduResetRecordUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public BaiduResetRecordUpdateWrapper idLike(Long id){
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
    public BaiduResetRecordUpdateWrapper idNotLike(Long id){
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
    public BaiduResetRecordUpdateWrapper idLikeLeft(Long id){
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
    public BaiduResetRecordUpdateWrapper idLikeRight(Long id){
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
    public BaiduResetRecordUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateWrapper idIn(Collection<Long> value){
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
    public BaiduResetRecordUpdateWrapper idIn(Long... values){
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
    public BaiduResetRecordUpdateWrapper idNotIn(Collection<Long> value){
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
    public BaiduResetRecordUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = fkBaiduDeviceId
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdEq(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            eq("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; fkBaiduDeviceId
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdNe(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            ne("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; fkBaiduDeviceId
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdGt(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            gt("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= fkBaiduDeviceId
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdGe(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            ge("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; fkBaiduDeviceId
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdLt(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            lt("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= fkBaiduDeviceId
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdLe(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            le("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkBaiduDeviceIdStart       值1
     * @param fkBaiduDeviceIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdBetween(Long fkBaiduDeviceIdStart,Long fkBaiduDeviceIdEnd){
        if(fkBaiduDeviceIdStart!=null && fkBaiduDeviceIdEnd!=null){
            between("fk_baidu_device_id",fkBaiduDeviceIdStart,fkBaiduDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkBaiduDeviceIdStart       值1
     * @param fkBaiduDeviceIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdNotBetween(Long fkBaiduDeviceIdStart,Long fkBaiduDeviceIdEnd){
        if(fkBaiduDeviceIdStart!=null && fkBaiduDeviceIdEnd!=null){
            notBetween("fk_baidu_device_id",fkBaiduDeviceIdStart,fkBaiduDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' fkBaiduDeviceId
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdLike(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            like("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' fkBaiduDeviceId
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdNotLike(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            notLike("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' fkBaiduDeviceId
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdLikeLeft(Long fkBaiduDeviceId){
        if(fkBaiduDeviceId!=null){
            likeLeft("fk_baidu_device_id",fkBaiduDeviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' fkBaiduDeviceId
     * @param fkBaiduDeviceId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdLikeRight(Long fkBaiduDeviceId){
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
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdIsNull(){
        isNull("fk_baidu_device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdIsNotNull(){
        isNotNull("fk_baidu_device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdIn(Collection<Long> value){
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
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdIn(Long... values){
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
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdNotIn(Collection<Long> value){
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
    public BaiduResetRecordUpdateWrapper fkBaiduDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_baidu_device_id",values);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * 等于 = code
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper codeEq(String code){
        if(code!=null){
            eq("code",code);
        }
        return this;
    }

    /**
     * <p>百度云机id</p>
     * 不等于 &lt;&gt; code
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper codeNe(String code){
        if(code!=null){
            ne("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * 大于 &gt; code
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper codeGt(String code){
        if(code!=null){
            gt("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * 大于等于 &gt;= code
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper codeGe(String code){
        if(code!=null){
            ge("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * 小于 &lt; code
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper codeLt(String code){
        if(code!=null){
            lt("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * 小于等于 &lt;= code
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper codeLe(String code){
        if(code!=null){
            le("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * BETWEEN 值1 AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateWrapper codeBetween(String codeStart,String codeEnd){
        if(codeStart!=null && codeEnd!=null){
            between("code",codeStart,codeEnd);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateWrapper codeNotBetween(String codeStart,String codeEnd){
        if(codeStart!=null && codeEnd!=null){
            notBetween("code",codeStart,codeEnd);
        }
        return this;
     }


    /**
     * <p>百度云机id</p>
     * LIKE '%值%' code
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper codeLike(String code){
        if(code!=null){
            like("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * NOT LIKE '%值%' code
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper codeNotLike(String code){
        if(code!=null){
            notLike("code",code);
        }
        return this;
     }


    /**
     * <p>百度云机id</p>
     * LIKE '%值' code
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper codeLikeLeft(String code){
        if(code!=null){
            likeLeft("code",code);
        }
        return this;
     }

    /**
     * <p>百度云机id</p>
     * LIKE '值%' code
     * @param code       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper codeLikeRight(String code){
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
    public BaiduResetRecordUpdateWrapper codeIsNull(){
        isNull("code");
        return this;
    }

    /**
     * <p>百度云机id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateWrapper codeIsNotNull(){
        isNotNull("code");
        return this;
    }

    /**
     * <p>百度云机id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateWrapper codeIn(Collection<String> value){
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
    public BaiduResetRecordUpdateWrapper codeIn(String... values){
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
    public BaiduResetRecordUpdateWrapper codeNotIn(Collection<String> value){
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
    public BaiduResetRecordUpdateWrapper codeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = fkBaiduImagesId
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdEq(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            eq("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; fkBaiduImagesId
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdNe(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            ne("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; fkBaiduImagesId
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdGt(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            gt("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= fkBaiduImagesId
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdGe(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            ge("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; fkBaiduImagesId
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdLt(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            lt("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= fkBaiduImagesId
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdLe(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            le("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkBaiduImagesIdStart       值1
     * @param fkBaiduImagesIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdBetween(Long fkBaiduImagesIdStart,Long fkBaiduImagesIdEnd){
        if(fkBaiduImagesIdStart!=null && fkBaiduImagesIdEnd!=null){
            between("fk_baidu_images_id",fkBaiduImagesIdStart,fkBaiduImagesIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkBaiduImagesIdStart       值1
     * @param fkBaiduImagesIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdNotBetween(Long fkBaiduImagesIdStart,Long fkBaiduImagesIdEnd){
        if(fkBaiduImagesIdStart!=null && fkBaiduImagesIdEnd!=null){
            notBetween("fk_baidu_images_id",fkBaiduImagesIdStart,fkBaiduImagesIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' fkBaiduImagesId
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdLike(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            like("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' fkBaiduImagesId
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdNotLike(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            notLike("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' fkBaiduImagesId
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdLikeLeft(Long fkBaiduImagesId){
        if(fkBaiduImagesId!=null){
            likeLeft("fk_baidu_images_id",fkBaiduImagesId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' fkBaiduImagesId
     * @param fkBaiduImagesId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdLikeRight(Long fkBaiduImagesId){
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
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdIsNull(){
        isNull("fk_baidu_images_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdIsNotNull(){
        isNotNull("fk_baidu_images_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdIn(Collection<Long> value){
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
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdIn(Long... values){
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
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdNotIn(Collection<Long> value){
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
    public BaiduResetRecordUpdateWrapper fkBaiduImagesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_baidu_images_id",values);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * 等于 = versionCode
     * @param versionCode       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper versionCodeEq(String versionCode){
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
    public BaiduResetRecordUpdateWrapper versionCodeNe(String versionCode){
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
    public BaiduResetRecordUpdateWrapper versionCodeGt(String versionCode){
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
    public BaiduResetRecordUpdateWrapper versionCodeGe(String versionCode){
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
    public BaiduResetRecordUpdateWrapper versionCodeLt(String versionCode){
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
    public BaiduResetRecordUpdateWrapper versionCodeLe(String versionCode){
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
    public BaiduResetRecordUpdateWrapper versionCodeBetween(String versionCodeStart,String versionCodeEnd){
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
    public BaiduResetRecordUpdateWrapper versionCodeNotBetween(String versionCodeStart,String versionCodeEnd){
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
    public BaiduResetRecordUpdateWrapper versionCodeLike(String versionCode){
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
    public BaiduResetRecordUpdateWrapper versionCodeNotLike(String versionCode){
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
    public BaiduResetRecordUpdateWrapper versionCodeLikeLeft(String versionCode){
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
    public BaiduResetRecordUpdateWrapper versionCodeLikeRight(String versionCode){
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
    public BaiduResetRecordUpdateWrapper versionCodeIsNull(){
        isNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateWrapper versionCodeIsNotNull(){
        isNotNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateWrapper versionCodeIn(Collection<String> value){
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
    public BaiduResetRecordUpdateWrapper versionCodeIn(String... values){
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
    public BaiduResetRecordUpdateWrapper versionCodeNotIn(Collection<String> value){
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
    public BaiduResetRecordUpdateWrapper versionCodeNotIn(String... values){
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
    public BaiduResetRecordUpdateWrapper titleEq(String title){
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
    public BaiduResetRecordUpdateWrapper titleNe(String title){
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
    public BaiduResetRecordUpdateWrapper titleGt(String title){
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
    public BaiduResetRecordUpdateWrapper titleGe(String title){
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
    public BaiduResetRecordUpdateWrapper titleLt(String title){
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
    public BaiduResetRecordUpdateWrapper titleLe(String title){
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
    public BaiduResetRecordUpdateWrapper titleBetween(String titleStart,String titleEnd){
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
    public BaiduResetRecordUpdateWrapper titleNotBetween(String titleStart,String titleEnd){
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
    public BaiduResetRecordUpdateWrapper titleLike(String title){
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
    public BaiduResetRecordUpdateWrapper titleNotLike(String title){
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
    public BaiduResetRecordUpdateWrapper titleLikeLeft(String title){
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
    public BaiduResetRecordUpdateWrapper titleLikeRight(String title){
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
    public BaiduResetRecordUpdateWrapper titleIsNull(){
        isNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateWrapper titleIsNotNull(){
        isNotNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateWrapper titleIn(Collection<String> value){
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
    public BaiduResetRecordUpdateWrapper titleIn(String... values){
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
    public BaiduResetRecordUpdateWrapper titleNotIn(Collection<String> value){
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
    public BaiduResetRecordUpdateWrapper titleNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("title",values);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 等于 = oldImageVersionId
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper oldImageVersionIdEq(String oldImageVersionId){
        if(oldImageVersionId!=null){
            eq("old_image_version_id",oldImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * 不等于 &lt;&gt; oldImageVersionId
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper oldImageVersionIdNe(String oldImageVersionId){
        if(oldImageVersionId!=null){
            ne("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 大于 &gt; oldImageVersionId
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper oldImageVersionIdGt(String oldImageVersionId){
        if(oldImageVersionId!=null){
            gt("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 大于等于 &gt;= oldImageVersionId
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper oldImageVersionIdGe(String oldImageVersionId){
        if(oldImageVersionId!=null){
            ge("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 小于 &lt; oldImageVersionId
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper oldImageVersionIdLt(String oldImageVersionId){
        if(oldImageVersionId!=null){
            lt("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * 小于等于 &lt;= oldImageVersionId
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper oldImageVersionIdLe(String oldImageVersionId){
        if(oldImageVersionId!=null){
            le("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * BETWEEN 值1 AND 值2
     * @param oldImageVersionIdStart       值1
     * @param oldImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateWrapper oldImageVersionIdBetween(String oldImageVersionIdStart,String oldImageVersionIdEnd){
        if(oldImageVersionIdStart!=null && oldImageVersionIdEnd!=null){
            between("old_image_version_id",oldImageVersionIdStart,oldImageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param oldImageVersionIdStart       值1
     * @param oldImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateWrapper oldImageVersionIdNotBetween(String oldImageVersionIdStart,String oldImageVersionIdEnd){
        if(oldImageVersionIdStart!=null && oldImageVersionIdEnd!=null){
            notBetween("old_image_version_id",oldImageVersionIdStart,oldImageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值%' oldImageVersionId
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper oldImageVersionIdLike(String oldImageVersionId){
        if(oldImageVersionId!=null){
            like("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * NOT LIKE '%值%' oldImageVersionId
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper oldImageVersionIdNotLike(String oldImageVersionId){
        if(oldImageVersionId!=null){
            notLike("old_image_version_id",oldImageVersionId);
        }
        return this;
     }


    /**
     * <p>重置前镜像版本id</p>
     * LIKE '%值' oldImageVersionId
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper oldImageVersionIdLikeLeft(String oldImageVersionId){
        if(oldImageVersionId!=null){
            likeLeft("old_image_version_id",oldImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置前镜像版本id</p>
     * LIKE '值%' oldImageVersionId
     * @param oldImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper oldImageVersionIdLikeRight(String oldImageVersionId){
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
    public BaiduResetRecordUpdateWrapper oldImageVersionIdIsNull(){
        isNull("old_image_version_id");
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateWrapper oldImageVersionIdIsNotNull(){
        isNotNull("old_image_version_id");
        return this;
    }

    /**
     * <p>重置前镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateWrapper oldImageVersionIdIn(Collection<String> value){
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
    public BaiduResetRecordUpdateWrapper oldImageVersionIdIn(String... values){
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
    public BaiduResetRecordUpdateWrapper oldImageVersionIdNotIn(Collection<String> value){
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
    public BaiduResetRecordUpdateWrapper oldImageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("old_image_version_id",values);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 等于 = resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetImageVersionIdEq(String resetImageVersionId){
        if(resetImageVersionId!=null){
            eq("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * 不等于 &lt;&gt; resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetImageVersionIdNe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            ne("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于 &gt; resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetImageVersionIdGt(String resetImageVersionId){
        if(resetImageVersionId!=null){
            gt("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 大于等于 &gt;= resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetImageVersionIdGe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            ge("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于 &lt; resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetImageVersionIdLt(String resetImageVersionId){
        if(resetImageVersionId!=null){
            lt("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * 小于等于 &lt;= resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetImageVersionIdLe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            le("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * BETWEEN 值1 AND 值2
     * @param resetImageVersionIdStart       值1
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetImageVersionIdBetween(String resetImageVersionIdStart,String resetImageVersionIdEnd){
        if(resetImageVersionIdStart!=null && resetImageVersionIdEnd!=null){
            between("reset_image_version_id",resetImageVersionIdStart,resetImageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetImageVersionIdStart       值1
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetImageVersionIdNotBetween(String resetImageVersionIdStart,String resetImageVersionIdEnd){
        if(resetImageVersionIdStart!=null && resetImageVersionIdEnd!=null){
            notBetween("reset_image_version_id",resetImageVersionIdStart,resetImageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值%' resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetImageVersionIdLike(String resetImageVersionId){
        if(resetImageVersionId!=null){
            like("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * NOT LIKE '%值%' resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetImageVersionIdNotLike(String resetImageVersionId){
        if(resetImageVersionId!=null){
            notLike("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }


    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '%值' resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetImageVersionIdLikeLeft(String resetImageVersionId){
        if(resetImageVersionId!=null){
            likeLeft("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>当前重置镜像版本id</p>
     * LIKE '值%' resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetImageVersionIdLikeRight(String resetImageVersionId){
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
    public BaiduResetRecordUpdateWrapper resetImageVersionIdIsNull(){
        isNull("reset_image_version_id");
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetImageVersionIdIsNotNull(){
        isNotNull("reset_image_version_id");
        return this;
    }

    /**
     * <p>当前重置镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetImageVersionIdIn(Collection<String> value){
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
    public BaiduResetRecordUpdateWrapper resetImageVersionIdIn(String... values){
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
    public BaiduResetRecordUpdateWrapper resetImageVersionIdNotIn(Collection<String> value){
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
    public BaiduResetRecordUpdateWrapper resetImageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_image_version_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = resetUserId
     * @param resetUserId       值
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetUserIdEq(Long resetUserId){
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
    public BaiduResetRecordUpdateWrapper resetUserIdNe(Long resetUserId){
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
    public BaiduResetRecordUpdateWrapper resetUserIdGt(Long resetUserId){
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
    public BaiduResetRecordUpdateWrapper resetUserIdGe(Long resetUserId){
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
    public BaiduResetRecordUpdateWrapper resetUserIdLt(Long resetUserId){
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
    public BaiduResetRecordUpdateWrapper resetUserIdLe(Long resetUserId){
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
    public BaiduResetRecordUpdateWrapper resetUserIdBetween(Long resetUserIdStart,Long resetUserIdEnd){
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
    public BaiduResetRecordUpdateWrapper resetUserIdNotBetween(Long resetUserIdStart,Long resetUserIdEnd){
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
    public BaiduResetRecordUpdateWrapper resetUserIdLike(Long resetUserId){
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
    public BaiduResetRecordUpdateWrapper resetUserIdNotLike(Long resetUserId){
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
    public BaiduResetRecordUpdateWrapper resetUserIdLikeLeft(Long resetUserId){
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
    public BaiduResetRecordUpdateWrapper resetUserIdLikeRight(Long resetUserId){
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
    public BaiduResetRecordUpdateWrapper resetUserIdIsNull(){
        isNull("reset_user_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetUserIdIsNotNull(){
        isNotNull("reset_user_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateWrapper resetUserIdIn(Collection<Long> value){
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
    public BaiduResetRecordUpdateWrapper resetUserIdIn(Long... values){
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
    public BaiduResetRecordUpdateWrapper resetUserIdNotIn(Collection<Long> value){
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
    public BaiduResetRecordUpdateWrapper resetUserIdNotIn(Long... values){
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
    public BaiduResetRecordUpdateWrapper responseEq(String response){
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
    public BaiduResetRecordUpdateWrapper responseNe(String response){
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
    public BaiduResetRecordUpdateWrapper responseGt(String response){
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
    public BaiduResetRecordUpdateWrapper responseGe(String response){
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
    public BaiduResetRecordUpdateWrapper responseLt(String response){
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
    public BaiduResetRecordUpdateWrapper responseLe(String response){
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
    public BaiduResetRecordUpdateWrapper responseBetween(String responseStart,String responseEnd){
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
    public BaiduResetRecordUpdateWrapper responseNotBetween(String responseStart,String responseEnd){
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
    public BaiduResetRecordUpdateWrapper responseLike(String response){
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
    public BaiduResetRecordUpdateWrapper responseNotLike(String response){
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
    public BaiduResetRecordUpdateWrapper responseLikeLeft(String response){
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
    public BaiduResetRecordUpdateWrapper responseLikeRight(String response){
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
    public BaiduResetRecordUpdateWrapper responseIsNull(){
        isNull("response");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateWrapper responseIsNotNull(){
        isNotNull("response");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateWrapper responseIn(Collection<String> value){
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
    public BaiduResetRecordUpdateWrapper responseIn(String... values){
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
    public BaiduResetRecordUpdateWrapper responseNotIn(Collection<String> value){
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
    public BaiduResetRecordUpdateWrapper responseNotIn(String... values){
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
    public BaiduResetRecordUpdateWrapper createTimeEq(Date createTime){
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
    public BaiduResetRecordUpdateWrapper createTimeNe(Date createTime){
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
    public BaiduResetRecordUpdateWrapper createTimeGt(Date createTime){
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
    public BaiduResetRecordUpdateWrapper createTimeGe(Date createTime){
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
    public BaiduResetRecordUpdateWrapper createTimeLt(Date createTime){
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
    public BaiduResetRecordUpdateWrapper createTimeLe(Date createTime){
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
    public BaiduResetRecordUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduResetRecordUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduResetRecordUpdateWrapper createTimeLike(Date createTime){
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
    public BaiduResetRecordUpdateWrapper createTimeNotLike(Date createTime){
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
    public BaiduResetRecordUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public BaiduResetRecordUpdateWrapper createTimeLikeRight(Date createTime){
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
    public BaiduResetRecordUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>重置时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduResetRecordUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>重置时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduResetRecordUpdateWrapper createTimeIn(Collection<Date> value){
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
    public BaiduResetRecordUpdateWrapper createTimeIn(Date... values){
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
    public BaiduResetRecordUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public BaiduResetRecordUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


}
