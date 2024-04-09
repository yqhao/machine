package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.TencentImages;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 腾讯镜像管理
 * </p>
 * "tencent_images"
 * @author PC001
 */
public class TencentImagesUpdateWrapper extends UpdateWrapper<TencentImages> {

    public static TencentImagesUpdateWrapper wrapper() {
        return new TencentImagesUpdateWrapper();
    }

    public TencentImagesUpdateWrapper() {
        super();
    }

    public TencentImagesUpdateWrapper(TencentImages entity) {
        super(entity);
    }

    /**
     * 
     */
    public TencentImagesUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 腾讯账号区域Id
     */
    public TencentImagesUpdateWrapper setFkTencentAccountAreaId(Long fkTencentAccountAreaId) {
         set("fk_tencent_account_area_id",fkTencentAccountAreaId);
        return this;
    }
    /**
     * 状态：（-50：删除，-40：超时，1：创建中，50：正常）
     */
    public TencentImagesUpdateWrapper setRegion(String region) {
         set("region",region);
        return this;
    }
    /**
     * 镜像名称
     */
    public TencentImagesUpdateWrapper setTitle(String title) {
         set("title",title);
        return this;
    }
    /**
     * 镜像版本
     */
    public TencentImagesUpdateWrapper setVersionCode(String versionCode) {
         set("version_code",versionCode);
        return this;
    }
    /**
     * 镜像下载地址
     */
    public TencentImagesUpdateWrapper setUrl(String url) {
         set("url",url);
        return this;
    }
    /**
     * 镜像导出文件 MD5 校验值
     */
    public TencentImagesUpdateWrapper setMd5(String md5) {
         set("md5",md5);
        return this;
    }
    /**
     * 镜像描述
     */
    public TencentImagesUpdateWrapper setImageDescription(String imageDescription) {
         set("image_description",imageDescription);
        return this;
    }
    /**
     * 镜像id
     */
    public TencentImagesUpdateWrapper setImageId(String imageId) {
         set("image_id",imageId);
        return this;
    }
    /**
     * 
     */
    public TencentImagesUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 
     */
    public TencentImagesUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 
     */
    public TencentImagesUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 
     */
    public TencentImagesUpdateWrapper setCreateUserId(Long createUserId) {
         set("create_user_id",createUserId);
        return this;
    }
    /**
     * 
     */
    public TencentImagesUpdateWrapper setLastUpdateId(Long lastUpdateId) {
         set("last_update_id",lastUpdateId);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public TencentImagesUpdateWrapper idEq(Long id){
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
    public TencentImagesUpdateWrapper idNe(Long id){
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
    public TencentImagesUpdateWrapper idGt(Long id){
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
    public TencentImagesUpdateWrapper idGe(Long id){
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
    public TencentImagesUpdateWrapper idLt(Long id){
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
    public TencentImagesUpdateWrapper idLe(Long id){
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
    public TencentImagesUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentImagesUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentImagesUpdateWrapper idLike(Long id){
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
    public TencentImagesUpdateWrapper idNotLike(Long id){
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
    public TencentImagesUpdateWrapper idLikeLeft(Long id){
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
    public TencentImagesUpdateWrapper idLikeRight(Long id){
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
    public TencentImagesUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper idIn(Collection<Long> value){
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
    public TencentImagesUpdateWrapper idIn(Long... values){
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
    public TencentImagesUpdateWrapper idNotIn(Collection<Long> value){
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
    public TencentImagesUpdateWrapper idNotIn(Long... values){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdEq(Long fkTencentAccountAreaId){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdNe(Long fkTencentAccountAreaId){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdGt(Long fkTencentAccountAreaId){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdGe(Long fkTencentAccountAreaId){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdLt(Long fkTencentAccountAreaId){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdLe(Long fkTencentAccountAreaId){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdBetween(Long fkTencentAccountAreaIdStart,Long fkTencentAccountAreaIdEnd){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdNotBetween(Long fkTencentAccountAreaIdStart,Long fkTencentAccountAreaIdEnd){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdLike(Long fkTencentAccountAreaId){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdNotLike(Long fkTencentAccountAreaId){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdLikeLeft(Long fkTencentAccountAreaId){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdLikeRight(Long fkTencentAccountAreaId){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdIsNull(){
        isNull("fk_tencent_account_area_id");
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdIsNotNull(){
        isNotNull("fk_tencent_account_area_id");
        return this;
    }

    /**
     * <p>腾讯账号区域Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdIn(Collection<Long> value){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdIn(Long... values){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdNotIn(Collection<Long> value){
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
    public TencentImagesUpdateWrapper fkTencentAccountAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_account_area_id",values);
        }
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 等于 = region
     * @param region       值
     * @return children
     */
    public TencentImagesUpdateWrapper regionEq(String region){
        if(region!=null){
            eq("region",region);
        }
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 不等于 &lt;&gt; region
     * @param region       值
     * @return children
     */
    public TencentImagesUpdateWrapper regionNe(String region){
        if(region!=null){
            ne("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 大于 &gt; region
     * @param region       值
     * @return children
     */
    public TencentImagesUpdateWrapper regionGt(String region){
        if(region!=null){
            gt("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 大于等于 &gt;= region
     * @param region       值
     * @return children
     */
    public TencentImagesUpdateWrapper regionGe(String region){
        if(region!=null){
            ge("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 小于 &lt; region
     * @param region       值
     * @return children
     */
    public TencentImagesUpdateWrapper regionLt(String region){
        if(region!=null){
            lt("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * 小于等于 &lt;= region
     * @param region       值
     * @return children
     */
    public TencentImagesUpdateWrapper regionLe(String region){
        if(region!=null){
            le("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * BETWEEN 值1 AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper regionBetween(String regionStart,String regionEnd){
        if(regionStart!=null && regionEnd!=null){
            between("region",regionStart,regionEnd);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper regionNotBetween(String regionStart,String regionEnd){
        if(regionStart!=null && regionEnd!=null){
            notBetween("region",regionStart,regionEnd);
        }
        return this;
     }


    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * LIKE '%值%' region
     * @param region       值
     * @return children
     */
    public TencentImagesUpdateWrapper regionLike(String region){
        if(region!=null){
            like("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * NOT LIKE '%值%' region
     * @param region       值
     * @return children
     */
    public TencentImagesUpdateWrapper regionNotLike(String region){
        if(region!=null){
            notLike("region",region);
        }
        return this;
     }


    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * LIKE '%值' region
     * @param region       值
     * @return children
     */
    public TencentImagesUpdateWrapper regionLikeLeft(String region){
        if(region!=null){
            likeLeft("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * LIKE '值%' region
     * @param region       值
     * @return children
     */
    public TencentImagesUpdateWrapper regionLikeRight(String region){
        if(region!=null){
            likeRight("region",region);
        }
        return this;
     }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * IS NULL
     * @return children
     */
    public TencentImagesUpdateWrapper regionIsNull(){
        isNull("region");
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesUpdateWrapper regionIsNotNull(){
        isNotNull("region");
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper regionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("region",value);
        }
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper regionIn(String... values){
        if(values!=null && values.length>0){
            in("region",values);
        }
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper regionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("region",value);
        }
        return this;
    }

    /**
     * <p>状态：（-50：删除，-40：超时，1：创建中，50：正常）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper regionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region",values);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * 等于 = title
     * @param title       值
     * @return children
     */
    public TencentImagesUpdateWrapper titleEq(String title){
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
    public TencentImagesUpdateWrapper titleNe(String title){
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
    public TencentImagesUpdateWrapper titleGt(String title){
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
    public TencentImagesUpdateWrapper titleGe(String title){
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
    public TencentImagesUpdateWrapper titleLt(String title){
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
    public TencentImagesUpdateWrapper titleLe(String title){
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
    public TencentImagesUpdateWrapper titleBetween(String titleStart,String titleEnd){
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
    public TencentImagesUpdateWrapper titleNotBetween(String titleStart,String titleEnd){
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
    public TencentImagesUpdateWrapper titleLike(String title){
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
    public TencentImagesUpdateWrapper titleNotLike(String title){
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
    public TencentImagesUpdateWrapper titleLikeLeft(String title){
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
    public TencentImagesUpdateWrapper titleLikeRight(String title){
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
    public TencentImagesUpdateWrapper titleIsNull(){
        isNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesUpdateWrapper titleIsNotNull(){
        isNotNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper titleIn(Collection<String> value){
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
    public TencentImagesUpdateWrapper titleIn(String... values){
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
    public TencentImagesUpdateWrapper titleNotIn(Collection<String> value){
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
    public TencentImagesUpdateWrapper titleNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("title",values);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * 等于 = versionCode
     * @param versionCode       值
     * @return children
     */
    public TencentImagesUpdateWrapper versionCodeEq(String versionCode){
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
    public TencentImagesUpdateWrapper versionCodeNe(String versionCode){
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
    public TencentImagesUpdateWrapper versionCodeGt(String versionCode){
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
    public TencentImagesUpdateWrapper versionCodeGe(String versionCode){
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
    public TencentImagesUpdateWrapper versionCodeLt(String versionCode){
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
    public TencentImagesUpdateWrapper versionCodeLe(String versionCode){
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
    public TencentImagesUpdateWrapper versionCodeBetween(String versionCodeStart,String versionCodeEnd){
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
    public TencentImagesUpdateWrapper versionCodeNotBetween(String versionCodeStart,String versionCodeEnd){
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
    public TencentImagesUpdateWrapper versionCodeLike(String versionCode){
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
    public TencentImagesUpdateWrapper versionCodeNotLike(String versionCode){
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
    public TencentImagesUpdateWrapper versionCodeLikeLeft(String versionCode){
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
    public TencentImagesUpdateWrapper versionCodeLikeRight(String versionCode){
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
    public TencentImagesUpdateWrapper versionCodeIsNull(){
        isNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesUpdateWrapper versionCodeIsNotNull(){
        isNotNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper versionCodeIn(Collection<String> value){
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
    public TencentImagesUpdateWrapper versionCodeIn(String... values){
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
    public TencentImagesUpdateWrapper versionCodeNotIn(Collection<String> value){
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
    public TencentImagesUpdateWrapper versionCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("version_code",values);
        }
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * 等于 = url
     * @param url       值
     * @return children
     */
    public TencentImagesUpdateWrapper urlEq(String url){
        if(url!=null){
            eq("url",url);
        }
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * 不等于 &lt;&gt; url
     * @param url       值
     * @return children
     */
    public TencentImagesUpdateWrapper urlNe(String url){
        if(url!=null){
            ne("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * 大于 &gt; url
     * @param url       值
     * @return children
     */
    public TencentImagesUpdateWrapper urlGt(String url){
        if(url!=null){
            gt("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * 大于等于 &gt;= url
     * @param url       值
     * @return children
     */
    public TencentImagesUpdateWrapper urlGe(String url){
        if(url!=null){
            ge("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * 小于 &lt; url
     * @param url       值
     * @return children
     */
    public TencentImagesUpdateWrapper urlLt(String url){
        if(url!=null){
            lt("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * 小于等于 &lt;= url
     * @param url       值
     * @return children
     */
    public TencentImagesUpdateWrapper urlLe(String url){
        if(url!=null){
            le("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * BETWEEN 值1 AND 值2
     * @param urlStart       值1
     * @param urlEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper urlBetween(String urlStart,String urlEnd){
        if(urlStart!=null && urlEnd!=null){
            between("url",urlStart,urlEnd);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * NOT BETWEEN 值1 AND 值2
     * @param urlStart       值1
     * @param urlEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper urlNotBetween(String urlStart,String urlEnd){
        if(urlStart!=null && urlEnd!=null){
            notBetween("url",urlStart,urlEnd);
        }
        return this;
     }


    /**
     * <p>镜像下载地址</p>
     * LIKE '%值%' url
     * @param url       值
     * @return children
     */
    public TencentImagesUpdateWrapper urlLike(String url){
        if(url!=null){
            like("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * NOT LIKE '%值%' url
     * @param url       值
     * @return children
     */
    public TencentImagesUpdateWrapper urlNotLike(String url){
        if(url!=null){
            notLike("url",url);
        }
        return this;
     }


    /**
     * <p>镜像下载地址</p>
     * LIKE '%值' url
     * @param url       值
     * @return children
     */
    public TencentImagesUpdateWrapper urlLikeLeft(String url){
        if(url!=null){
            likeLeft("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * LIKE '值%' url
     * @param url       值
     * @return children
     */
    public TencentImagesUpdateWrapper urlLikeRight(String url){
        if(url!=null){
            likeRight("url",url);
        }
        return this;
     }

    /**
     * <p>镜像下载地址</p>
     * IS NULL
     * @return children
     */
    public TencentImagesUpdateWrapper urlIsNull(){
        isNull("url");
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesUpdateWrapper urlIsNotNull(){
        isNotNull("url");
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper urlIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("url",value);
        }
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper urlIn(String... values){
        if(values!=null && values.length>0){
            in("url",values);
        }
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper urlNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("url",value);
        }
        return this;
    }

    /**
     * <p>镜像下载地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper urlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("url",values);
        }
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 等于 = md5
     * @param md5       值
     * @return children
     */
    public TencentImagesUpdateWrapper md5Eq(String md5){
        if(md5!=null){
            eq("md5",md5);
        }
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 不等于 &lt;&gt; md5
     * @param md5       值
     * @return children
     */
    public TencentImagesUpdateWrapper md5Ne(String md5){
        if(md5!=null){
            ne("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 大于 &gt; md5
     * @param md5       值
     * @return children
     */
    public TencentImagesUpdateWrapper md5Gt(String md5){
        if(md5!=null){
            gt("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 大于等于 &gt;= md5
     * @param md5       值
     * @return children
     */
    public TencentImagesUpdateWrapper md5Ge(String md5){
        if(md5!=null){
            ge("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 小于 &lt; md5
     * @param md5       值
     * @return children
     */
    public TencentImagesUpdateWrapper md5Lt(String md5){
        if(md5!=null){
            lt("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * 小于等于 &lt;= md5
     * @param md5       值
     * @return children
     */
    public TencentImagesUpdateWrapper md5Le(String md5){
        if(md5!=null){
            le("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * BETWEEN 值1 AND 值2
     * @param md5Start       值1
     * @param md5End      值2
     * @return children
     */
    public TencentImagesUpdateWrapper md5Between(String md5Start,String md5End){
        if(md5Start!=null && md5End!=null){
            between("md5",md5Start,md5End);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * NOT BETWEEN 值1 AND 值2
     * @param md5Start       值1
     * @param md5End      值2
     * @return children
     */
    public TencentImagesUpdateWrapper md5NotBetween(String md5Start,String md5End){
        if(md5Start!=null && md5End!=null){
            notBetween("md5",md5Start,md5End);
        }
        return this;
     }


    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * LIKE '%值%' md5
     * @param md5       值
     * @return children
     */
    public TencentImagesUpdateWrapper md5Like(String md5){
        if(md5!=null){
            like("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * NOT LIKE '%值%' md5
     * @param md5       值
     * @return children
     */
    public TencentImagesUpdateWrapper md5NotLike(String md5){
        if(md5!=null){
            notLike("md5",md5);
        }
        return this;
     }


    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * LIKE '%值' md5
     * @param md5       值
     * @return children
     */
    public TencentImagesUpdateWrapper md5LikeLeft(String md5){
        if(md5!=null){
            likeLeft("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * LIKE '值%' md5
     * @param md5       值
     * @return children
     */
    public TencentImagesUpdateWrapper md5LikeRight(String md5){
        if(md5!=null){
            likeRight("md5",md5);
        }
        return this;
     }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * IS NULL
     * @return children
     */
    public TencentImagesUpdateWrapper md5IsNull(){
        isNull("md5");
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesUpdateWrapper md5IsNotNull(){
        isNotNull("md5");
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper md5In(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("md5",value);
        }
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper md5In(String... values){
        if(values!=null && values.length>0){
            in("md5",values);
        }
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper md5NotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("md5",value);
        }
        return this;
    }

    /**
     * <p>镜像导出文件 MD5 校验值</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper md5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("md5",values);
        }
        return this;
    }

    /**
     * <p>镜像描述</p>
     * 等于 = imageDescription
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionEq(String imageDescription){
        if(imageDescription!=null){
            eq("image_description",imageDescription);
        }
        return this;
    }

    /**
     * <p>镜像描述</p>
     * 不等于 &lt;&gt; imageDescription
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionNe(String imageDescription){
        if(imageDescription!=null){
            ne("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * 大于 &gt; imageDescription
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionGt(String imageDescription){
        if(imageDescription!=null){
            gt("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * 大于等于 &gt;= imageDescription
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionGe(String imageDescription){
        if(imageDescription!=null){
            ge("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * 小于 &lt; imageDescription
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionLt(String imageDescription){
        if(imageDescription!=null){
            lt("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * 小于等于 &lt;= imageDescription
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionLe(String imageDescription){
        if(imageDescription!=null){
            le("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * BETWEEN 值1 AND 值2
     * @param imageDescriptionStart       值1
     * @param imageDescriptionEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionBetween(String imageDescriptionStart,String imageDescriptionEnd){
        if(imageDescriptionStart!=null && imageDescriptionEnd!=null){
            between("image_description",imageDescriptionStart,imageDescriptionEnd);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imageDescriptionStart       值1
     * @param imageDescriptionEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionNotBetween(String imageDescriptionStart,String imageDescriptionEnd){
        if(imageDescriptionStart!=null && imageDescriptionEnd!=null){
            notBetween("image_description",imageDescriptionStart,imageDescriptionEnd);
        }
        return this;
     }


    /**
     * <p>镜像描述</p>
     * LIKE '%值%' imageDescription
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionLike(String imageDescription){
        if(imageDescription!=null){
            like("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * NOT LIKE '%值%' imageDescription
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionNotLike(String imageDescription){
        if(imageDescription!=null){
            notLike("image_description",imageDescription);
        }
        return this;
     }


    /**
     * <p>镜像描述</p>
     * LIKE '%值' imageDescription
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionLikeLeft(String imageDescription){
        if(imageDescription!=null){
            likeLeft("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * LIKE '值%' imageDescription
     * @param imageDescription       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionLikeRight(String imageDescription){
        if(imageDescription!=null){
            likeRight("image_description",imageDescription);
        }
        return this;
     }

    /**
     * <p>镜像描述</p>
     * IS NULL
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionIsNull(){
        isNull("image_description");
        return this;
    }

    /**
     * <p>镜像描述</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionIsNotNull(){
        isNotNull("image_description");
        return this;
    }

    /**
     * <p>镜像描述</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("image_description",value);
        }
        return this;
    }

    /**
     * <p>镜像描述</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionIn(String... values){
        if(values!=null && values.length>0){
            in("image_description",values);
        }
        return this;
    }

    /**
     * <p>镜像描述</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("image_description",value);
        }
        return this;
    }

    /**
     * <p>镜像描述</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper imageDescriptionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_description",values);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 等于 = imageId
     * @param imageId       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdEq(String imageId){
        if(imageId!=null){
            eq("image_id",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 不等于 &lt;&gt; imageId
     * @param imageId       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdNe(String imageId){
        if(imageId!=null){
            ne("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于 &gt; imageId
     * @param imageId       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdGt(String imageId){
        if(imageId!=null){
            gt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于等于 &gt;= imageId
     * @param imageId       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdGe(String imageId){
        if(imageId!=null){
            ge("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于 &lt; imageId
     * @param imageId       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdLt(String imageId){
        if(imageId!=null){
            lt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于等于 &lt;= imageId
     * @param imageId       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdLe(String imageId){
        if(imageId!=null){
            le("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            between("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            notBetween("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值%' imageId
     * @param imageId       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdLike(String imageId){
        if(imageId!=null){
            like("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT LIKE '%值%' imageId
     * @param imageId       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdNotLike(String imageId){
        if(imageId!=null){
            notLike("image_id",imageId);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值' imageId
     * @param imageId       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdLikeLeft(String imageId){
        if(imageId!=null){
            likeLeft("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * LIKE '值%' imageId
     * @param imageId       值
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdLikeRight(String imageId){
        if(imageId!=null){
            likeRight("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * IS NULL
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdIsNull(){
        isNull("image_id");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdIsNotNull(){
        isNotNull("image_id");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("image_id",value);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdIn(String... values){
        if(values!=null && values.length>0){
            in("image_id",values);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("image_id",value);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public TencentImagesUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public TencentImagesUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public TencentImagesUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public TencentImagesUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public TencentImagesUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public TencentImagesUpdateWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public TencentImagesUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public TencentImagesUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public TencentImagesUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public TencentImagesUpdateWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentImagesUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; createTime
     * @param createTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; createTime
     * @param createTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= createTime
     * @param createTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; createTime
     * @param createTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= createTime
     * @param createTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' createTime
     * @param createTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' createTime
     * @param createTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper createTimeLikeRight(Date createTime){
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
    public TencentImagesUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper createTimeIn(Collection<Date> value){
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
    public TencentImagesUpdateWrapper createTimeIn(Date... values){
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
    public TencentImagesUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentImagesUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public TencentImagesUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public TencentImagesUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public TencentImagesUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public TencentImagesUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = createUserId
     * @param createUserId       值
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdEq(Long createUserId){
        if(createUserId!=null){
            eq("create_user_id",createUserId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; createUserId
     * @param createUserId       值
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdNe(Long createUserId){
        if(createUserId!=null){
            ne("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; createUserId
     * @param createUserId       值
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdGt(Long createUserId){
        if(createUserId!=null){
            gt("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= createUserId
     * @param createUserId       值
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdGe(Long createUserId){
        if(createUserId!=null){
            ge("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; createUserId
     * @param createUserId       值
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdLt(Long createUserId){
        if(createUserId!=null){
            lt("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= createUserId
     * @param createUserId       值
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdLe(Long createUserId){
        if(createUserId!=null){
            le("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param createUserIdStart       值1
     * @param createUserIdEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdBetween(Long createUserIdStart,Long createUserIdEnd){
        if(createUserIdStart!=null && createUserIdEnd!=null){
            between("create_user_id",createUserIdStart,createUserIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param createUserIdStart       值1
     * @param createUserIdEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdNotBetween(Long createUserIdStart,Long createUserIdEnd){
        if(createUserIdStart!=null && createUserIdEnd!=null){
            notBetween("create_user_id",createUserIdStart,createUserIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' createUserId
     * @param createUserId       值
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdLike(Long createUserId){
        if(createUserId!=null){
            like("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' createUserId
     * @param createUserId       值
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdNotLike(Long createUserId){
        if(createUserId!=null){
            notLike("create_user_id",createUserId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' createUserId
     * @param createUserId       值
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdLikeLeft(Long createUserId){
        if(createUserId!=null){
            likeLeft("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' createUserId
     * @param createUserId       值
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdLikeRight(Long createUserId){
        if(createUserId!=null){
            likeRight("create_user_id",createUserId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdIsNull(){
        isNull("create_user_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdIsNotNull(){
        isNotNull("create_user_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("create_user_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdIn(Long... values){
        if(values!=null && values.length>0){
            in("create_user_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_user_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper createUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("create_user_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = lastUpdateId
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdEq(Long lastUpdateId){
        if(lastUpdateId!=null){
            eq("last_update_id",lastUpdateId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; lastUpdateId
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdNe(Long lastUpdateId){
        if(lastUpdateId!=null){
            ne("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; lastUpdateId
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdGt(Long lastUpdateId){
        if(lastUpdateId!=null){
            gt("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= lastUpdateId
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdGe(Long lastUpdateId){
        if(lastUpdateId!=null){
            ge("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; lastUpdateId
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdLt(Long lastUpdateId){
        if(lastUpdateId!=null){
            lt("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= lastUpdateId
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdLe(Long lastUpdateId){
        if(lastUpdateId!=null){
            le("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateIdStart       值1
     * @param lastUpdateIdEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdBetween(Long lastUpdateIdStart,Long lastUpdateIdEnd){
        if(lastUpdateIdStart!=null && lastUpdateIdEnd!=null){
            between("last_update_id",lastUpdateIdStart,lastUpdateIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateIdStart       值1
     * @param lastUpdateIdEnd      值2
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdNotBetween(Long lastUpdateIdStart,Long lastUpdateIdEnd){
        if(lastUpdateIdStart!=null && lastUpdateIdEnd!=null){
            notBetween("last_update_id",lastUpdateIdStart,lastUpdateIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' lastUpdateId
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdLike(Long lastUpdateId){
        if(lastUpdateId!=null){
            like("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' lastUpdateId
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdNotLike(Long lastUpdateId){
        if(lastUpdateId!=null){
            notLike("last_update_id",lastUpdateId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' lastUpdateId
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdLikeLeft(Long lastUpdateId){
        if(lastUpdateId!=null){
            likeLeft("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' lastUpdateId
     * @param lastUpdateId       值
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdLikeRight(Long lastUpdateId){
        if(lastUpdateId!=null){
            likeRight("last_update_id",lastUpdateId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdIsNull(){
        isNull("last_update_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdIsNotNull(){
        isNotNull("last_update_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdIn(Long... values){
        if(values!=null && values.length>0){
            in("last_update_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentImagesUpdateWrapper lastUpdateIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("last_update_id",values);
        }
        return this;
    }


}
