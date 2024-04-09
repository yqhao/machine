package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.BaiduImages;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 百度镜像
 * </p>
 * "baidu_images"
 * @author PC001
 */
public class BaiduImagesUpdateWrapper extends UpdateWrapper<BaiduImages> {

    public static BaiduImagesUpdateWrapper wrapper() {
        return new BaiduImagesUpdateWrapper();
    }

    public BaiduImagesUpdateWrapper() {
        super();
    }

    public BaiduImagesUpdateWrapper(BaiduImages entity) {
        super(entity);
    }

    /**
     * 
     */
    public BaiduImagesUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 百度账号id
     */
    public BaiduImagesUpdateWrapper setFkBaiduAccountId(Long fkBaiduAccountId) {
         set("fk_baidu_account_id",fkBaiduAccountId);
        return this;
    }
    /**
     * 镜像名称
     */
    public BaiduImagesUpdateWrapper setTitle(String title) {
         set("title",title);
        return this;
    }
    /**
     * 镜像版本
     */
    public BaiduImagesUpdateWrapper setVersionCode(String versionCode) {
         set("version_code",versionCode);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setRootImageFileUrl(String rootImageFileUrl) {
         set("root_image_file_url",rootImageFileUrl);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setRootImageFileName(String rootImageFileName) {
         set("root_image_file_name",rootImageFileName);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setRootImageFileType(String rootImageFileType) {
         set("root_image_file_type",rootImageFileType);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setRootImageFileMd5(String rootImageFileMd5) {
         set("root_image_file_md5",rootImageFileMd5);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setSystemImageFileUrl(String systemImageFileUrl) {
         set("system_image_file_url",systemImageFileUrl);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setSystemImageFileName(String systemImageFileName) {
         set("system_image_file_name",systemImageFileName);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setSystemImageFileType(String systemImageFileType) {
         set("system_image_file_type",systemImageFileType);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setSystemImageFileMd5(String systemImageFileMd5) {
         set("system_image_file_md5",systemImageFileMd5);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setOdmImageFileUrl(String odmImageFileUrl) {
         set("odm_image_file_url",odmImageFileUrl);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setOdmImageFileName(String odmImageFileName) {
         set("odm_image_file_name",odmImageFileName);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setOdmImageFileType(String odmImageFileType) {
         set("odm_image_file_type",odmImageFileType);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setOdmImageFileMd5(String odmImageFileMd5) {
         set("odm_image_file_md5",odmImageFileMd5);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setVendorImageFileUrl(String vendorImageFileUrl) {
         set("vendor_image_file_url",vendorImageFileUrl);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setVendorImageFileName(String vendorImageFileName) {
         set("vendor_image_file_name",vendorImageFileName);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setVendorImageFileType(String vendorImageFileType) {
         set("vendor_image_file_type",vendorImageFileType);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setVendorImageFileMd5(String vendorImageFileMd5) {
         set("vendor_image_file_md5",vendorImageFileMd5);
        return this;
    }
    /**
     * 设备类型（3399，3288，3588，Ampere32，845，865）
     */
    public BaiduImagesUpdateWrapper setServerType(String serverType) {
         set("server_type",serverType);
        return this;
    }
    /**
     * 系统版本（android6.0，android8.1，，android10.0，android12.0）
     */
    public BaiduImagesUpdateWrapper setRomVersion(String romVersion) {
         set("rom_version",romVersion);
        return this;
    }
    /**
     * 创建时间
     */
    public BaiduImagesUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 镜像版本id
     */
    public BaiduImagesUpdateWrapper setImageVersionId(String imageVersionId) {
         set("image_version_id",imageVersionId);
        return this;
    }
    /**
     * 镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）
     */
    public BaiduImagesUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public BaiduImagesUpdateWrapper idEq(Long id){
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
    public BaiduImagesUpdateWrapper idNe(Long id){
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
    public BaiduImagesUpdateWrapper idGt(Long id){
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
    public BaiduImagesUpdateWrapper idGe(Long id){
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
    public BaiduImagesUpdateWrapper idLt(Long id){
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
    public BaiduImagesUpdateWrapper idLe(Long id){
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
    public BaiduImagesUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public BaiduImagesUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public BaiduImagesUpdateWrapper idLike(Long id){
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
    public BaiduImagesUpdateWrapper idNotLike(Long id){
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
    public BaiduImagesUpdateWrapper idLikeLeft(Long id){
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
    public BaiduImagesUpdateWrapper idLikeRight(Long id){
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
    public BaiduImagesUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper idIn(Collection<Long> value){
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
    public BaiduImagesUpdateWrapper idIn(Long... values){
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
    public BaiduImagesUpdateWrapper idNotIn(Collection<Long> value){
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
    public BaiduImagesUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * 等于 = fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdEq(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            eq("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * 不等于 &lt;&gt; fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdNe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            ne("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 大于 &gt; fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdGt(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            gt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 大于等于 &gt;= fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdGe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            ge("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 小于 &lt; fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdLt(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            lt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 小于等于 &lt;= fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdLe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            le("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * BETWEEN 值1 AND 值2
     * @param fkBaiduAccountIdStart       值1
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdBetween(Long fkBaiduAccountIdStart,Long fkBaiduAccountIdEnd){
        if(fkBaiduAccountIdStart!=null && fkBaiduAccountIdEnd!=null){
            between("fk_baidu_account_id",fkBaiduAccountIdStart,fkBaiduAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkBaiduAccountIdStart       值1
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdNotBetween(Long fkBaiduAccountIdStart,Long fkBaiduAccountIdEnd){
        if(fkBaiduAccountIdStart!=null && fkBaiduAccountIdEnd!=null){
            notBetween("fk_baidu_account_id",fkBaiduAccountIdStart,fkBaiduAccountIdEnd);
        }
        return this;
     }


    /**
     * <p>百度账号id</p>
     * LIKE '%值%' fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdLike(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            like("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * NOT LIKE '%值%' fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdNotLike(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            notLike("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }


    /**
     * <p>百度账号id</p>
     * LIKE '%值' fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdLikeLeft(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            likeLeft("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * LIKE '值%' fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdLikeRight(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            likeRight("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdIsNull(){
        isNull("fk_baidu_account_id");
        return this;
    }

    /**
     * <p>百度账号id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdIsNotNull(){
        isNotNull("fk_baidu_account_id");
        return this;
    }

    /**
     * <p>百度账号id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_baidu_account_id",value);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_baidu_account_id",values);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_baidu_account_id",value);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper fkBaiduAccountIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_baidu_account_id",values);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * 等于 = title
     * @param title       值
     * @return children
     */
    public BaiduImagesUpdateWrapper titleEq(String title){
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
    public BaiduImagesUpdateWrapper titleNe(String title){
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
    public BaiduImagesUpdateWrapper titleGt(String title){
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
    public BaiduImagesUpdateWrapper titleGe(String title){
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
    public BaiduImagesUpdateWrapper titleLt(String title){
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
    public BaiduImagesUpdateWrapper titleLe(String title){
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
    public BaiduImagesUpdateWrapper titleBetween(String titleStart,String titleEnd){
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
    public BaiduImagesUpdateWrapper titleNotBetween(String titleStart,String titleEnd){
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
    public BaiduImagesUpdateWrapper titleLike(String title){
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
    public BaiduImagesUpdateWrapper titleNotLike(String title){
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
    public BaiduImagesUpdateWrapper titleLikeLeft(String title){
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
    public BaiduImagesUpdateWrapper titleLikeRight(String title){
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
    public BaiduImagesUpdateWrapper titleIsNull(){
        isNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper titleIsNotNull(){
        isNotNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper titleIn(Collection<String> value){
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
    public BaiduImagesUpdateWrapper titleIn(String... values){
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
    public BaiduImagesUpdateWrapper titleNotIn(Collection<String> value){
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
    public BaiduImagesUpdateWrapper titleNotIn(String... values){
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
    public BaiduImagesUpdateWrapper versionCodeEq(String versionCode){
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
    public BaiduImagesUpdateWrapper versionCodeNe(String versionCode){
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
    public BaiduImagesUpdateWrapper versionCodeGt(String versionCode){
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
    public BaiduImagesUpdateWrapper versionCodeGe(String versionCode){
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
    public BaiduImagesUpdateWrapper versionCodeLt(String versionCode){
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
    public BaiduImagesUpdateWrapper versionCodeLe(String versionCode){
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
    public BaiduImagesUpdateWrapper versionCodeBetween(String versionCodeStart,String versionCodeEnd){
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
    public BaiduImagesUpdateWrapper versionCodeNotBetween(String versionCodeStart,String versionCodeEnd){
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
    public BaiduImagesUpdateWrapper versionCodeLike(String versionCode){
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
    public BaiduImagesUpdateWrapper versionCodeNotLike(String versionCode){
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
    public BaiduImagesUpdateWrapper versionCodeLikeLeft(String versionCode){
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
    public BaiduImagesUpdateWrapper versionCodeLikeRight(String versionCode){
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
    public BaiduImagesUpdateWrapper versionCodeIsNull(){
        isNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper versionCodeIsNotNull(){
        isNotNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper versionCodeIn(Collection<String> value){
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
    public BaiduImagesUpdateWrapper versionCodeIn(String... values){
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
    public BaiduImagesUpdateWrapper versionCodeNotIn(Collection<String> value){
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
    public BaiduImagesUpdateWrapper versionCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("version_code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = rootImageFileUrl
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlEq(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            eq("root_image_file_url",rootImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; rootImageFileUrl
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlNe(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            ne("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; rootImageFileUrl
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlGt(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            gt("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= rootImageFileUrl
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlGe(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            ge("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; rootImageFileUrl
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlLt(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            lt("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= rootImageFileUrl
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlLe(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            le("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rootImageFileUrlStart       值1
     * @param rootImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlBetween(String rootImageFileUrlStart,String rootImageFileUrlEnd){
        if(rootImageFileUrlStart!=null && rootImageFileUrlEnd!=null){
            between("root_image_file_url",rootImageFileUrlStart,rootImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rootImageFileUrlStart       值1
     * @param rootImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlNotBetween(String rootImageFileUrlStart,String rootImageFileUrlEnd){
        if(rootImageFileUrlStart!=null && rootImageFileUrlEnd!=null){
            notBetween("root_image_file_url",rootImageFileUrlStart,rootImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' rootImageFileUrl
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlLike(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            like("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' rootImageFileUrl
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlNotLike(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            notLike("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' rootImageFileUrl
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlLikeLeft(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            likeLeft("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' rootImageFileUrl
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlLikeRight(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            likeRight("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlIsNull(){
        isNull("root_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlIsNotNull(){
        isNotNull("root_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("root_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlIn(String... values){
        if(values!=null && values.length>0){
            in("root_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("root_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = rootImageFileName
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameEq(String rootImageFileName){
        if(rootImageFileName!=null){
            eq("root_image_file_name",rootImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; rootImageFileName
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameNe(String rootImageFileName){
        if(rootImageFileName!=null){
            ne("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; rootImageFileName
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameGt(String rootImageFileName){
        if(rootImageFileName!=null){
            gt("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= rootImageFileName
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameGe(String rootImageFileName){
        if(rootImageFileName!=null){
            ge("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; rootImageFileName
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameLt(String rootImageFileName){
        if(rootImageFileName!=null){
            lt("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= rootImageFileName
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameLe(String rootImageFileName){
        if(rootImageFileName!=null){
            le("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rootImageFileNameStart       值1
     * @param rootImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameBetween(String rootImageFileNameStart,String rootImageFileNameEnd){
        if(rootImageFileNameStart!=null && rootImageFileNameEnd!=null){
            between("root_image_file_name",rootImageFileNameStart,rootImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rootImageFileNameStart       值1
     * @param rootImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameNotBetween(String rootImageFileNameStart,String rootImageFileNameEnd){
        if(rootImageFileNameStart!=null && rootImageFileNameEnd!=null){
            notBetween("root_image_file_name",rootImageFileNameStart,rootImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' rootImageFileName
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameLike(String rootImageFileName){
        if(rootImageFileName!=null){
            like("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' rootImageFileName
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameNotLike(String rootImageFileName){
        if(rootImageFileName!=null){
            notLike("root_image_file_name",rootImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' rootImageFileName
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameLikeLeft(String rootImageFileName){
        if(rootImageFileName!=null){
            likeLeft("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' rootImageFileName
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameLikeRight(String rootImageFileName){
        if(rootImageFileName!=null){
            likeRight("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameIsNull(){
        isNull("root_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameIsNotNull(){
        isNotNull("root_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("root_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameIn(String... values){
        if(values!=null && values.length>0){
            in("root_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("root_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = rootImageFileType
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeEq(String rootImageFileType){
        if(rootImageFileType!=null){
            eq("root_image_file_type",rootImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; rootImageFileType
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeNe(String rootImageFileType){
        if(rootImageFileType!=null){
            ne("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; rootImageFileType
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeGt(String rootImageFileType){
        if(rootImageFileType!=null){
            gt("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= rootImageFileType
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeGe(String rootImageFileType){
        if(rootImageFileType!=null){
            ge("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; rootImageFileType
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeLt(String rootImageFileType){
        if(rootImageFileType!=null){
            lt("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= rootImageFileType
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeLe(String rootImageFileType){
        if(rootImageFileType!=null){
            le("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rootImageFileTypeStart       值1
     * @param rootImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeBetween(String rootImageFileTypeStart,String rootImageFileTypeEnd){
        if(rootImageFileTypeStart!=null && rootImageFileTypeEnd!=null){
            between("root_image_file_type",rootImageFileTypeStart,rootImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rootImageFileTypeStart       值1
     * @param rootImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeNotBetween(String rootImageFileTypeStart,String rootImageFileTypeEnd){
        if(rootImageFileTypeStart!=null && rootImageFileTypeEnd!=null){
            notBetween("root_image_file_type",rootImageFileTypeStart,rootImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' rootImageFileType
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeLike(String rootImageFileType){
        if(rootImageFileType!=null){
            like("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' rootImageFileType
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeNotLike(String rootImageFileType){
        if(rootImageFileType!=null){
            notLike("root_image_file_type",rootImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' rootImageFileType
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeLikeLeft(String rootImageFileType){
        if(rootImageFileType!=null){
            likeLeft("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' rootImageFileType
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeLikeRight(String rootImageFileType){
        if(rootImageFileType!=null){
            likeRight("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeIsNull(){
        isNull("root_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeIsNotNull(){
        isNotNull("root_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("root_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeIn(String... values){
        if(values!=null && values.length>0){
            in("root_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("root_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = rootImageFileMd5
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5Eq(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            eq("root_image_file_md5",rootImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; rootImageFileMd5
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5Ne(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            ne("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; rootImageFileMd5
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5Gt(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            gt("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= rootImageFileMd5
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5Ge(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            ge("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; rootImageFileMd5
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5Lt(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            lt("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= rootImageFileMd5
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5Le(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            le("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rootImageFileMd5Start       值1
     * @param rootImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5Between(String rootImageFileMd5Start,String rootImageFileMd5End){
        if(rootImageFileMd5Start!=null && rootImageFileMd5End!=null){
            between("root_image_file_md5",rootImageFileMd5Start,rootImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rootImageFileMd5Start       值1
     * @param rootImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5NotBetween(String rootImageFileMd5Start,String rootImageFileMd5End){
        if(rootImageFileMd5Start!=null && rootImageFileMd5End!=null){
            notBetween("root_image_file_md5",rootImageFileMd5Start,rootImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' rootImageFileMd5
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5Like(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            like("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' rootImageFileMd5
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5NotLike(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            notLike("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' rootImageFileMd5
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5LikeLeft(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            likeLeft("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' rootImageFileMd5
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5LikeRight(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            likeRight("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5IsNull(){
        isNull("root_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5IsNotNull(){
        isNotNull("root_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5In(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("root_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5In(String... values){
        if(values!=null && values.length>0){
            in("root_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5NotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("root_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper rootImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = systemImageFileUrl
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlEq(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            eq("system_image_file_url",systemImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; systemImageFileUrl
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlNe(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            ne("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; systemImageFileUrl
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlGt(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            gt("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= systemImageFileUrl
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlGe(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            ge("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; systemImageFileUrl
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlLt(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            lt("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= systemImageFileUrl
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlLe(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            le("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param systemImageFileUrlStart       值1
     * @param systemImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlBetween(String systemImageFileUrlStart,String systemImageFileUrlEnd){
        if(systemImageFileUrlStart!=null && systemImageFileUrlEnd!=null){
            between("system_image_file_url",systemImageFileUrlStart,systemImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param systemImageFileUrlStart       值1
     * @param systemImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlNotBetween(String systemImageFileUrlStart,String systemImageFileUrlEnd){
        if(systemImageFileUrlStart!=null && systemImageFileUrlEnd!=null){
            notBetween("system_image_file_url",systemImageFileUrlStart,systemImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' systemImageFileUrl
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlLike(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            like("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' systemImageFileUrl
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlNotLike(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            notLike("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' systemImageFileUrl
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlLikeLeft(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            likeLeft("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' systemImageFileUrl
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlLikeRight(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            likeRight("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlIsNull(){
        isNull("system_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlIsNotNull(){
        isNotNull("system_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("system_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlIn(String... values){
        if(values!=null && values.length>0){
            in("system_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("system_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = systemImageFileName
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameEq(String systemImageFileName){
        if(systemImageFileName!=null){
            eq("system_image_file_name",systemImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; systemImageFileName
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameNe(String systemImageFileName){
        if(systemImageFileName!=null){
            ne("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; systemImageFileName
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameGt(String systemImageFileName){
        if(systemImageFileName!=null){
            gt("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= systemImageFileName
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameGe(String systemImageFileName){
        if(systemImageFileName!=null){
            ge("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; systemImageFileName
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameLt(String systemImageFileName){
        if(systemImageFileName!=null){
            lt("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= systemImageFileName
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameLe(String systemImageFileName){
        if(systemImageFileName!=null){
            le("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param systemImageFileNameStart       值1
     * @param systemImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameBetween(String systemImageFileNameStart,String systemImageFileNameEnd){
        if(systemImageFileNameStart!=null && systemImageFileNameEnd!=null){
            between("system_image_file_name",systemImageFileNameStart,systemImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param systemImageFileNameStart       值1
     * @param systemImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameNotBetween(String systemImageFileNameStart,String systemImageFileNameEnd){
        if(systemImageFileNameStart!=null && systemImageFileNameEnd!=null){
            notBetween("system_image_file_name",systemImageFileNameStart,systemImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' systemImageFileName
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameLike(String systemImageFileName){
        if(systemImageFileName!=null){
            like("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' systemImageFileName
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameNotLike(String systemImageFileName){
        if(systemImageFileName!=null){
            notLike("system_image_file_name",systemImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' systemImageFileName
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameLikeLeft(String systemImageFileName){
        if(systemImageFileName!=null){
            likeLeft("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' systemImageFileName
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameLikeRight(String systemImageFileName){
        if(systemImageFileName!=null){
            likeRight("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameIsNull(){
        isNull("system_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameIsNotNull(){
        isNotNull("system_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("system_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameIn(String... values){
        if(values!=null && values.length>0){
            in("system_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("system_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = systemImageFileType
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeEq(String systemImageFileType){
        if(systemImageFileType!=null){
            eq("system_image_file_type",systemImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; systemImageFileType
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeNe(String systemImageFileType){
        if(systemImageFileType!=null){
            ne("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; systemImageFileType
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeGt(String systemImageFileType){
        if(systemImageFileType!=null){
            gt("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= systemImageFileType
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeGe(String systemImageFileType){
        if(systemImageFileType!=null){
            ge("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; systemImageFileType
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeLt(String systemImageFileType){
        if(systemImageFileType!=null){
            lt("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= systemImageFileType
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeLe(String systemImageFileType){
        if(systemImageFileType!=null){
            le("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param systemImageFileTypeStart       值1
     * @param systemImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeBetween(String systemImageFileTypeStart,String systemImageFileTypeEnd){
        if(systemImageFileTypeStart!=null && systemImageFileTypeEnd!=null){
            between("system_image_file_type",systemImageFileTypeStart,systemImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param systemImageFileTypeStart       值1
     * @param systemImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeNotBetween(String systemImageFileTypeStart,String systemImageFileTypeEnd){
        if(systemImageFileTypeStart!=null && systemImageFileTypeEnd!=null){
            notBetween("system_image_file_type",systemImageFileTypeStart,systemImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' systemImageFileType
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeLike(String systemImageFileType){
        if(systemImageFileType!=null){
            like("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' systemImageFileType
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeNotLike(String systemImageFileType){
        if(systemImageFileType!=null){
            notLike("system_image_file_type",systemImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' systemImageFileType
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeLikeLeft(String systemImageFileType){
        if(systemImageFileType!=null){
            likeLeft("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' systemImageFileType
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeLikeRight(String systemImageFileType){
        if(systemImageFileType!=null){
            likeRight("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeIsNull(){
        isNull("system_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeIsNotNull(){
        isNotNull("system_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("system_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeIn(String... values){
        if(values!=null && values.length>0){
            in("system_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("system_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = systemImageFileMd5
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5Eq(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            eq("system_image_file_md5",systemImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; systemImageFileMd5
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5Ne(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            ne("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; systemImageFileMd5
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5Gt(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            gt("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= systemImageFileMd5
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5Ge(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            ge("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; systemImageFileMd5
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5Lt(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            lt("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= systemImageFileMd5
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5Le(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            le("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param systemImageFileMd5Start       值1
     * @param systemImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5Between(String systemImageFileMd5Start,String systemImageFileMd5End){
        if(systemImageFileMd5Start!=null && systemImageFileMd5End!=null){
            between("system_image_file_md5",systemImageFileMd5Start,systemImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param systemImageFileMd5Start       值1
     * @param systemImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5NotBetween(String systemImageFileMd5Start,String systemImageFileMd5End){
        if(systemImageFileMd5Start!=null && systemImageFileMd5End!=null){
            notBetween("system_image_file_md5",systemImageFileMd5Start,systemImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' systemImageFileMd5
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5Like(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            like("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' systemImageFileMd5
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5NotLike(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            notLike("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' systemImageFileMd5
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5LikeLeft(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            likeLeft("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' systemImageFileMd5
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5LikeRight(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            likeRight("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5IsNull(){
        isNull("system_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5IsNotNull(){
        isNotNull("system_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5In(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("system_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5In(String... values){
        if(values!=null && values.length>0){
            in("system_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5NotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("system_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper systemImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = odmImageFileUrl
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlEq(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            eq("odm_image_file_url",odmImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; odmImageFileUrl
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlNe(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            ne("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; odmImageFileUrl
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlGt(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            gt("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= odmImageFileUrl
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlGe(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            ge("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; odmImageFileUrl
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlLt(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            lt("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= odmImageFileUrl
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlLe(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            le("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param odmImageFileUrlStart       值1
     * @param odmImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlBetween(String odmImageFileUrlStart,String odmImageFileUrlEnd){
        if(odmImageFileUrlStart!=null && odmImageFileUrlEnd!=null){
            between("odm_image_file_url",odmImageFileUrlStart,odmImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param odmImageFileUrlStart       值1
     * @param odmImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlNotBetween(String odmImageFileUrlStart,String odmImageFileUrlEnd){
        if(odmImageFileUrlStart!=null && odmImageFileUrlEnd!=null){
            notBetween("odm_image_file_url",odmImageFileUrlStart,odmImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' odmImageFileUrl
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlLike(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            like("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' odmImageFileUrl
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlNotLike(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            notLike("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' odmImageFileUrl
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlLikeLeft(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            likeLeft("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' odmImageFileUrl
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlLikeRight(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            likeRight("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlIsNull(){
        isNull("odm_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlIsNotNull(){
        isNotNull("odm_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("odm_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlIn(String... values){
        if(values!=null && values.length>0){
            in("odm_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("odm_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = odmImageFileName
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameEq(String odmImageFileName){
        if(odmImageFileName!=null){
            eq("odm_image_file_name",odmImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; odmImageFileName
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameNe(String odmImageFileName){
        if(odmImageFileName!=null){
            ne("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; odmImageFileName
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameGt(String odmImageFileName){
        if(odmImageFileName!=null){
            gt("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= odmImageFileName
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameGe(String odmImageFileName){
        if(odmImageFileName!=null){
            ge("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; odmImageFileName
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameLt(String odmImageFileName){
        if(odmImageFileName!=null){
            lt("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= odmImageFileName
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameLe(String odmImageFileName){
        if(odmImageFileName!=null){
            le("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param odmImageFileNameStart       值1
     * @param odmImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameBetween(String odmImageFileNameStart,String odmImageFileNameEnd){
        if(odmImageFileNameStart!=null && odmImageFileNameEnd!=null){
            between("odm_image_file_name",odmImageFileNameStart,odmImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param odmImageFileNameStart       值1
     * @param odmImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameNotBetween(String odmImageFileNameStart,String odmImageFileNameEnd){
        if(odmImageFileNameStart!=null && odmImageFileNameEnd!=null){
            notBetween("odm_image_file_name",odmImageFileNameStart,odmImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' odmImageFileName
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameLike(String odmImageFileName){
        if(odmImageFileName!=null){
            like("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' odmImageFileName
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameNotLike(String odmImageFileName){
        if(odmImageFileName!=null){
            notLike("odm_image_file_name",odmImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' odmImageFileName
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameLikeLeft(String odmImageFileName){
        if(odmImageFileName!=null){
            likeLeft("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' odmImageFileName
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameLikeRight(String odmImageFileName){
        if(odmImageFileName!=null){
            likeRight("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameIsNull(){
        isNull("odm_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameIsNotNull(){
        isNotNull("odm_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("odm_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameIn(String... values){
        if(values!=null && values.length>0){
            in("odm_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("odm_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = odmImageFileType
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeEq(String odmImageFileType){
        if(odmImageFileType!=null){
            eq("odm_image_file_type",odmImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; odmImageFileType
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeNe(String odmImageFileType){
        if(odmImageFileType!=null){
            ne("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; odmImageFileType
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeGt(String odmImageFileType){
        if(odmImageFileType!=null){
            gt("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= odmImageFileType
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeGe(String odmImageFileType){
        if(odmImageFileType!=null){
            ge("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; odmImageFileType
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeLt(String odmImageFileType){
        if(odmImageFileType!=null){
            lt("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= odmImageFileType
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeLe(String odmImageFileType){
        if(odmImageFileType!=null){
            le("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param odmImageFileTypeStart       值1
     * @param odmImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeBetween(String odmImageFileTypeStart,String odmImageFileTypeEnd){
        if(odmImageFileTypeStart!=null && odmImageFileTypeEnd!=null){
            between("odm_image_file_type",odmImageFileTypeStart,odmImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param odmImageFileTypeStart       值1
     * @param odmImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeNotBetween(String odmImageFileTypeStart,String odmImageFileTypeEnd){
        if(odmImageFileTypeStart!=null && odmImageFileTypeEnd!=null){
            notBetween("odm_image_file_type",odmImageFileTypeStart,odmImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' odmImageFileType
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeLike(String odmImageFileType){
        if(odmImageFileType!=null){
            like("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' odmImageFileType
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeNotLike(String odmImageFileType){
        if(odmImageFileType!=null){
            notLike("odm_image_file_type",odmImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' odmImageFileType
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeLikeLeft(String odmImageFileType){
        if(odmImageFileType!=null){
            likeLeft("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' odmImageFileType
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeLikeRight(String odmImageFileType){
        if(odmImageFileType!=null){
            likeRight("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeIsNull(){
        isNull("odm_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeIsNotNull(){
        isNotNull("odm_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("odm_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeIn(String... values){
        if(values!=null && values.length>0){
            in("odm_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("odm_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = odmImageFileMd5
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5Eq(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            eq("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; odmImageFileMd5
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5Ne(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            ne("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; odmImageFileMd5
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5Gt(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            gt("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= odmImageFileMd5
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5Ge(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            ge("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; odmImageFileMd5
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5Lt(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            lt("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= odmImageFileMd5
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5Le(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            le("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param odmImageFileMd5Start       值1
     * @param odmImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5Between(String odmImageFileMd5Start,String odmImageFileMd5End){
        if(odmImageFileMd5Start!=null && odmImageFileMd5End!=null){
            between("odm_image_file_md5",odmImageFileMd5Start,odmImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param odmImageFileMd5Start       值1
     * @param odmImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5NotBetween(String odmImageFileMd5Start,String odmImageFileMd5End){
        if(odmImageFileMd5Start!=null && odmImageFileMd5End!=null){
            notBetween("odm_image_file_md5",odmImageFileMd5Start,odmImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' odmImageFileMd5
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5Like(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            like("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' odmImageFileMd5
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5NotLike(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            notLike("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' odmImageFileMd5
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5LikeLeft(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            likeLeft("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' odmImageFileMd5
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5LikeRight(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            likeRight("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5IsNull(){
        isNull("odm_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5IsNotNull(){
        isNotNull("odm_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5In(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("odm_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5In(String... values){
        if(values!=null && values.length>0){
            in("odm_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5NotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("odm_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper odmImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = vendorImageFileUrl
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlEq(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            eq("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; vendorImageFileUrl
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlNe(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            ne("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; vendorImageFileUrl
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlGt(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            gt("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= vendorImageFileUrl
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlGe(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            ge("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; vendorImageFileUrl
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlLt(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            lt("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= vendorImageFileUrl
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlLe(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            le("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param vendorImageFileUrlStart       值1
     * @param vendorImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlBetween(String vendorImageFileUrlStart,String vendorImageFileUrlEnd){
        if(vendorImageFileUrlStart!=null && vendorImageFileUrlEnd!=null){
            between("vendor_image_file_url",vendorImageFileUrlStart,vendorImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param vendorImageFileUrlStart       值1
     * @param vendorImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlNotBetween(String vendorImageFileUrlStart,String vendorImageFileUrlEnd){
        if(vendorImageFileUrlStart!=null && vendorImageFileUrlEnd!=null){
            notBetween("vendor_image_file_url",vendorImageFileUrlStart,vendorImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' vendorImageFileUrl
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlLike(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            like("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' vendorImageFileUrl
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlNotLike(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            notLike("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' vendorImageFileUrl
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlLikeLeft(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            likeLeft("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' vendorImageFileUrl
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlLikeRight(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            likeRight("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlIsNull(){
        isNull("vendor_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlIsNotNull(){
        isNotNull("vendor_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("vendor_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlIn(String... values){
        if(values!=null && values.length>0){
            in("vendor_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("vendor_image_file_url",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = vendorImageFileName
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameEq(String vendorImageFileName){
        if(vendorImageFileName!=null){
            eq("vendor_image_file_name",vendorImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; vendorImageFileName
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameNe(String vendorImageFileName){
        if(vendorImageFileName!=null){
            ne("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; vendorImageFileName
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameGt(String vendorImageFileName){
        if(vendorImageFileName!=null){
            gt("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= vendorImageFileName
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameGe(String vendorImageFileName){
        if(vendorImageFileName!=null){
            ge("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; vendorImageFileName
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameLt(String vendorImageFileName){
        if(vendorImageFileName!=null){
            lt("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= vendorImageFileName
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameLe(String vendorImageFileName){
        if(vendorImageFileName!=null){
            le("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param vendorImageFileNameStart       值1
     * @param vendorImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameBetween(String vendorImageFileNameStart,String vendorImageFileNameEnd){
        if(vendorImageFileNameStart!=null && vendorImageFileNameEnd!=null){
            between("vendor_image_file_name",vendorImageFileNameStart,vendorImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param vendorImageFileNameStart       值1
     * @param vendorImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameNotBetween(String vendorImageFileNameStart,String vendorImageFileNameEnd){
        if(vendorImageFileNameStart!=null && vendorImageFileNameEnd!=null){
            notBetween("vendor_image_file_name",vendorImageFileNameStart,vendorImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' vendorImageFileName
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameLike(String vendorImageFileName){
        if(vendorImageFileName!=null){
            like("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' vendorImageFileName
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameNotLike(String vendorImageFileName){
        if(vendorImageFileName!=null){
            notLike("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' vendorImageFileName
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameLikeLeft(String vendorImageFileName){
        if(vendorImageFileName!=null){
            likeLeft("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' vendorImageFileName
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameLikeRight(String vendorImageFileName){
        if(vendorImageFileName!=null){
            likeRight("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameIsNull(){
        isNull("vendor_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameIsNotNull(){
        isNotNull("vendor_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("vendor_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameIn(String... values){
        if(values!=null && values.length>0){
            in("vendor_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("vendor_image_file_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = vendorImageFileType
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeEq(String vendorImageFileType){
        if(vendorImageFileType!=null){
            eq("vendor_image_file_type",vendorImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; vendorImageFileType
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeNe(String vendorImageFileType){
        if(vendorImageFileType!=null){
            ne("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; vendorImageFileType
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeGt(String vendorImageFileType){
        if(vendorImageFileType!=null){
            gt("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= vendorImageFileType
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeGe(String vendorImageFileType){
        if(vendorImageFileType!=null){
            ge("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; vendorImageFileType
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeLt(String vendorImageFileType){
        if(vendorImageFileType!=null){
            lt("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= vendorImageFileType
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeLe(String vendorImageFileType){
        if(vendorImageFileType!=null){
            le("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param vendorImageFileTypeStart       值1
     * @param vendorImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeBetween(String vendorImageFileTypeStart,String vendorImageFileTypeEnd){
        if(vendorImageFileTypeStart!=null && vendorImageFileTypeEnd!=null){
            between("vendor_image_file_type",vendorImageFileTypeStart,vendorImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param vendorImageFileTypeStart       值1
     * @param vendorImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeNotBetween(String vendorImageFileTypeStart,String vendorImageFileTypeEnd){
        if(vendorImageFileTypeStart!=null && vendorImageFileTypeEnd!=null){
            notBetween("vendor_image_file_type",vendorImageFileTypeStart,vendorImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' vendorImageFileType
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeLike(String vendorImageFileType){
        if(vendorImageFileType!=null){
            like("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' vendorImageFileType
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeNotLike(String vendorImageFileType){
        if(vendorImageFileType!=null){
            notLike("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' vendorImageFileType
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeLikeLeft(String vendorImageFileType){
        if(vendorImageFileType!=null){
            likeLeft("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' vendorImageFileType
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeLikeRight(String vendorImageFileType){
        if(vendorImageFileType!=null){
            likeRight("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeIsNull(){
        isNull("vendor_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeIsNotNull(){
        isNotNull("vendor_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("vendor_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeIn(String... values){
        if(values!=null && values.length>0){
            in("vendor_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("vendor_image_file_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = vendorImageFileMd5
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5Eq(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            eq("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; vendorImageFileMd5
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5Ne(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            ne("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; vendorImageFileMd5
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5Gt(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            gt("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= vendorImageFileMd5
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5Ge(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            ge("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; vendorImageFileMd5
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5Lt(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            lt("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= vendorImageFileMd5
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5Le(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            le("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param vendorImageFileMd5Start       值1
     * @param vendorImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5Between(String vendorImageFileMd5Start,String vendorImageFileMd5End){
        if(vendorImageFileMd5Start!=null && vendorImageFileMd5End!=null){
            between("vendor_image_file_md5",vendorImageFileMd5Start,vendorImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param vendorImageFileMd5Start       值1
     * @param vendorImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5NotBetween(String vendorImageFileMd5Start,String vendorImageFileMd5End){
        if(vendorImageFileMd5Start!=null && vendorImageFileMd5End!=null){
            notBetween("vendor_image_file_md5",vendorImageFileMd5Start,vendorImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' vendorImageFileMd5
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5Like(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            like("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' vendorImageFileMd5
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5NotLike(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            notLike("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' vendorImageFileMd5
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5LikeLeft(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            likeLeft("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' vendorImageFileMd5
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5LikeRight(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            likeRight("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5IsNull(){
        isNull("vendor_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5IsNotNull(){
        isNotNull("vendor_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5In(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("vendor_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5In(String... values){
        if(values!=null && values.length>0){
            in("vendor_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5NotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("vendor_image_file_md5",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper vendorImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 等于 = serverType
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeEq(String serverType){
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 不等于 &lt;&gt; serverType
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeNe(String serverType){
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 大于 &gt; serverType
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeGt(String serverType){
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 大于等于 &gt;= serverType
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeGe(String serverType){
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 小于 &lt; serverType
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeLt(String serverType){
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 小于等于 &lt;= serverType
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeLe(String serverType){
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * BETWEEN 值1 AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeBetween(String serverTypeStart,String serverTypeEnd){
        if(serverTypeStart!=null && serverTypeEnd!=null){
            between("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeNotBetween(String serverTypeStart,String serverTypeEnd){
        if(serverTypeStart!=null && serverTypeEnd!=null){
            notBetween("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }


    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '%值%' serverType
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeLike(String serverType){
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * NOT LIKE '%值%' serverType
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeNotLike(String serverType){
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
     }


    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '%值' serverType
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeLikeLeft(String serverType){
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '值%' serverType
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeLikeRight(String serverType){
        if(serverType!=null){
            likeRight("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeIsNull(){
        isNull("server_type");
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeIsNotNull(){
        isNotNull("server_type");
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("server_type",value);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeIn(String... values){
        if(values!=null && values.length>0){
            in("server_type",values);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("server_type",value);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper serverTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("server_type",values);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 等于 = romVersion
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionEq(String romVersion){
        if(romVersion!=null){
            eq("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 不等于 &lt;&gt; romVersion
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionNe(String romVersion){
        if(romVersion!=null){
            ne("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 大于 &gt; romVersion
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionGt(String romVersion){
        if(romVersion!=null){
            gt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 大于等于 &gt;= romVersion
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionGe(String romVersion){
        if(romVersion!=null){
            ge("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 小于 &lt; romVersion
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionLt(String romVersion){
        if(romVersion!=null){
            lt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 小于等于 &lt;= romVersion
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionLe(String romVersion){
        if(romVersion!=null){
            le("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * BETWEEN 值1 AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionBetween(String romVersionStart,String romVersionEnd){
        if(romVersionStart!=null && romVersionEnd!=null){
            between("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionNotBetween(String romVersionStart,String romVersionEnd){
        if(romVersionStart!=null && romVersionEnd!=null){
            notBetween("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }


    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '%值%' romVersion
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionLike(String romVersion){
        if(romVersion!=null){
            like("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * NOT LIKE '%值%' romVersion
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionNotLike(String romVersion){
        if(romVersion!=null){
            notLike("rom_version",romVersion);
        }
        return this;
     }


    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '%值' romVersion
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionLikeLeft(String romVersion){
        if(romVersion!=null){
            likeLeft("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '值%' romVersion
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionLikeRight(String romVersion){
        if(romVersion!=null){
            likeRight("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionIsNull(){
        isNull("rom_version");
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionIsNotNull(){
        isNotNull("rom_version");
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("rom_version",value);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionIn(String... values){
        if(values!=null && values.length>0){
            in("rom_version",values);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("rom_version",value);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper romVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("rom_version",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public BaiduImagesUpdateWrapper createTimeEq(Date createTime){
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
    public BaiduImagesUpdateWrapper createTimeNe(Date createTime){
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
    public BaiduImagesUpdateWrapper createTimeGt(Date createTime){
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
    public BaiduImagesUpdateWrapper createTimeGe(Date createTime){
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
    public BaiduImagesUpdateWrapper createTimeLt(Date createTime){
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
    public BaiduImagesUpdateWrapper createTimeLe(Date createTime){
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
    public BaiduImagesUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduImagesUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduImagesUpdateWrapper createTimeLike(Date createTime){
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
    public BaiduImagesUpdateWrapper createTimeNotLike(Date createTime){
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
    public BaiduImagesUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public BaiduImagesUpdateWrapper createTimeLikeRight(Date createTime){
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
    public BaiduImagesUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper createTimeIn(Collection<Date> value){
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
    public BaiduImagesUpdateWrapper createTimeIn(Date... values){
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
    public BaiduImagesUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public BaiduImagesUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * 等于 = imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdEq(String imageVersionId){
        if(imageVersionId!=null){
            eq("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * 不等于 &lt;&gt; imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdNe(String imageVersionId){
        if(imageVersionId!=null){
            ne("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 大于 &gt; imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdGt(String imageVersionId){
        if(imageVersionId!=null){
            gt("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 大于等于 &gt;= imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdGe(String imageVersionId){
        if(imageVersionId!=null){
            ge("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 小于 &lt; imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdLt(String imageVersionId){
        if(imageVersionId!=null){
            lt("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 小于等于 &lt;= imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdLe(String imageVersionId){
        if(imageVersionId!=null){
            le("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * BETWEEN 值1 AND 值2
     * @param imageVersionIdStart       值1
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdBetween(String imageVersionIdStart,String imageVersionIdEnd){
        if(imageVersionIdStart!=null && imageVersionIdEnd!=null){
            between("image_version_id",imageVersionIdStart,imageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imageVersionIdStart       值1
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdNotBetween(String imageVersionIdStart,String imageVersionIdEnd){
        if(imageVersionIdStart!=null && imageVersionIdEnd!=null){
            notBetween("image_version_id",imageVersionIdStart,imageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>镜像版本id</p>
     * LIKE '%值%' imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdLike(String imageVersionId){
        if(imageVersionId!=null){
            like("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * NOT LIKE '%值%' imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdNotLike(String imageVersionId){
        if(imageVersionId!=null){
            notLike("image_version_id",imageVersionId);
        }
        return this;
     }


    /**
     * <p>镜像版本id</p>
     * LIKE '%值' imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdLikeLeft(String imageVersionId){
        if(imageVersionId!=null){
            likeLeft("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * LIKE '值%' imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdLikeRight(String imageVersionId){
        if(imageVersionId!=null){
            likeRight("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdIsNull(){
        isNull("image_version_id");
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdIsNotNull(){
        isNotNull("image_version_id");
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("image_version_id",value);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdIn(String... values){
        if(values!=null && values.length>0){
            in("image_version_id",values);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("image_version_id",value);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper imageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_version_id",values);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public BaiduImagesUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * IS NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduImagesUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public BaiduImagesUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public BaiduImagesUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public BaiduImagesUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public BaiduImagesUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public BaiduImagesUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public BaiduImagesUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public BaiduImagesUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public BaiduImagesUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public BaiduImagesUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public BaiduImagesUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public BaiduImagesUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public BaiduImagesUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public BaiduImagesUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public BaiduImagesUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public BaiduImagesUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
