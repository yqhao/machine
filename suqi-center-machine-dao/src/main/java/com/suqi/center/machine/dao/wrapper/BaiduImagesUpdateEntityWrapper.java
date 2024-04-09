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
public class BaiduImagesUpdateEntityWrapper extends UpdateWrapper<BaiduImages> {

    public static BaiduImagesUpdateEntityWrapper wrapper(BaiduImages entity) {
        return new BaiduImagesUpdateEntityWrapper(entity);
    }

    private BaiduImages entity;

    public BaiduImagesUpdateEntityWrapper(BaiduImages entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 百度账号id
     */
    public BaiduImagesUpdateEntityWrapper setFkBaiduAccountId(Long fkBaiduAccountId) {
         set("fk_baidu_account_id",fkBaiduAccountId);
        return this;
    }
    /**
     * 镜像名称
     */
    public BaiduImagesUpdateEntityWrapper setTitle(String title) {
         set("title",title);
        return this;
    }
    /**
     * 镜像版本
     */
    public BaiduImagesUpdateEntityWrapper setVersionCode(String versionCode) {
         set("version_code",versionCode);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setRootImageFileUrl(String rootImageFileUrl) {
         set("root_image_file_url",rootImageFileUrl);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setRootImageFileName(String rootImageFileName) {
         set("root_image_file_name",rootImageFileName);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setRootImageFileType(String rootImageFileType) {
         set("root_image_file_type",rootImageFileType);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setRootImageFileMd5(String rootImageFileMd5) {
         set("root_image_file_md5",rootImageFileMd5);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setSystemImageFileUrl(String systemImageFileUrl) {
         set("system_image_file_url",systemImageFileUrl);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setSystemImageFileName(String systemImageFileName) {
         set("system_image_file_name",systemImageFileName);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setSystemImageFileType(String systemImageFileType) {
         set("system_image_file_type",systemImageFileType);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setSystemImageFileMd5(String systemImageFileMd5) {
         set("system_image_file_md5",systemImageFileMd5);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setOdmImageFileUrl(String odmImageFileUrl) {
         set("odm_image_file_url",odmImageFileUrl);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setOdmImageFileName(String odmImageFileName) {
         set("odm_image_file_name",odmImageFileName);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setOdmImageFileType(String odmImageFileType) {
         set("odm_image_file_type",odmImageFileType);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setOdmImageFileMd5(String odmImageFileMd5) {
         set("odm_image_file_md5",odmImageFileMd5);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setVendorImageFileUrl(String vendorImageFileUrl) {
         set("vendor_image_file_url",vendorImageFileUrl);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setVendorImageFileName(String vendorImageFileName) {
         set("vendor_image_file_name",vendorImageFileName);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setVendorImageFileType(String vendorImageFileType) {
         set("vendor_image_file_type",vendorImageFileType);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setVendorImageFileMd5(String vendorImageFileMd5) {
         set("vendor_image_file_md5",vendorImageFileMd5);
        return this;
    }
    /**
     * 设备类型（3399，3288，3588，Ampere32，845，865）
     */
    public BaiduImagesUpdateEntityWrapper setServerType(String serverType) {
         set("server_type",serverType);
        return this;
    }
    /**
     * 系统版本（android6.0，android8.1，，android10.0，android12.0）
     */
    public BaiduImagesUpdateEntityWrapper setRomVersion(String romVersion) {
         set("rom_version",romVersion);
        return this;
    }
    /**
     * 创建时间
     */
    public BaiduImagesUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 镜像版本id
     */
    public BaiduImagesUpdateEntityWrapper setImageVersionId(String imageVersionId) {
         set("image_version_id",imageVersionId);
        return this;
    }
    /**
     * 镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）
     */
    public BaiduImagesUpdateEntityWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    protected BaiduImages entity() {
        if(entity==null){
            throw new NullPointerException("BaiduImages is null");
        }
        return entity;
    }

    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 百度账号id
     */
    public BaiduImagesUpdateEntityWrapper setFkBaiduAccountId() {
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            set("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }
    /**
     * 镜像名称
     */
    public BaiduImagesUpdateEntityWrapper setTitle() {
        String title =entity().getTitle();
        if(title!=null){
            set("title",title);
        }
        return this;
    }
    /**
     * 镜像版本
     */
    public BaiduImagesUpdateEntityWrapper setVersionCode() {
        String versionCode =entity().getVersionCode();
        if(versionCode!=null){
            set("version_code",versionCode);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setRootImageFileUrl() {
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            set("root_image_file_url",rootImageFileUrl);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setRootImageFileName() {
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            set("root_image_file_name",rootImageFileName);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setRootImageFileType() {
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            set("root_image_file_type",rootImageFileType);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setRootImageFileMd5() {
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            set("root_image_file_md5",rootImageFileMd5);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setSystemImageFileUrl() {
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            set("system_image_file_url",systemImageFileUrl);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setSystemImageFileName() {
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            set("system_image_file_name",systemImageFileName);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setSystemImageFileType() {
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            set("system_image_file_type",systemImageFileType);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setSystemImageFileMd5() {
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            set("system_image_file_md5",systemImageFileMd5);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setOdmImageFileUrl() {
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            set("odm_image_file_url",odmImageFileUrl);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setOdmImageFileName() {
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            set("odm_image_file_name",odmImageFileName);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setOdmImageFileType() {
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            set("odm_image_file_type",odmImageFileType);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setOdmImageFileMd5() {
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            set("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setVendorImageFileUrl() {
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            set("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setVendorImageFileName() {
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            set("vendor_image_file_name",vendorImageFileName);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setVendorImageFileType() {
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            set("vendor_image_file_type",vendorImageFileType);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setVendorImageFileMd5() {
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            set("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
    }
    /**
     * 设备类型（3399，3288，3588，Ampere32，845，865）
     */
    public BaiduImagesUpdateEntityWrapper setServerType() {
        String serverType =entity().getServerType();
        if(serverType!=null){
            set("server_type",serverType);
        }
        return this;
    }
    /**
     * 系统版本（android6.0，android8.1，，android10.0，android12.0）
     */
    public BaiduImagesUpdateEntityWrapper setRomVersion() {
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            set("rom_version",romVersion);
        }
        return this;
    }
    /**
     * 创建时间
     */
    public BaiduImagesUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * 镜像版本id
     */
    public BaiduImagesUpdateEntityWrapper setImageVersionId() {
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            set("image_version_id",imageVersionId);
        }
        return this;
    }
    /**
     * 镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）
     */
    public BaiduImagesUpdateEntityWrapper setStatus() {
        Integer status =entity().getStatus();
        if(status!=null){
            set("status",status);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduImagesUpdateEntityWrapper setLastUpdateTime() {
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            set("last_update_time",lastUpdateTime);
        }
        return this;
    }
    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper idEq(){
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
    public BaiduImagesUpdateEntityWrapper idNe(){
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
    public BaiduImagesUpdateEntityWrapper idGt(){
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
    public BaiduImagesUpdateEntityWrapper idGe(){
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
    public BaiduImagesUpdateEntityWrapper idLt(){
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
    public BaiduImagesUpdateEntityWrapper idLe(){
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
    public BaiduImagesUpdateEntityWrapper idBetween(Long idEnd){
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
    public BaiduImagesUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public BaiduImagesUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public BaiduImagesUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public BaiduImagesUpdateEntityWrapper idLike(){
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
    public BaiduImagesUpdateEntityWrapper idNotLike(){
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
    public BaiduImagesUpdateEntityWrapper idLikeLeft(){
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
    public BaiduImagesUpdateEntityWrapper idLikeRight(){
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
    public BaiduImagesUpdateEntityWrapper idEq(Long id){
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
    public BaiduImagesUpdateEntityWrapper idNe(Long id){
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
    public BaiduImagesUpdateEntityWrapper idGt(Long id){
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
    public BaiduImagesUpdateEntityWrapper idGe(Long id){
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
    public BaiduImagesUpdateEntityWrapper idLt(Long id){
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
    public BaiduImagesUpdateEntityWrapper idLe(Long id){
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
    public BaiduImagesUpdateEntityWrapper idLike(Long id){
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
    public BaiduImagesUpdateEntityWrapper idNotLike(Long id){
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
    public BaiduImagesUpdateEntityWrapper idLikeLeft(Long id){
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
    public BaiduImagesUpdateEntityWrapper idLikeRight(Long id){
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
    public BaiduImagesUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper idIn(Collection<Long> value){
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
    public BaiduImagesUpdateEntityWrapper idIn(Long... values){
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
    public BaiduImagesUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public BaiduImagesUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * 等于 = entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdEq(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            eq("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * 不等于 &lt;&gt; entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdNe(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            ne("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 大于 &gt; entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdGt(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            gt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 大于等于 &gt;= entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdGe(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            ge("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 小于 &lt; entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdLt(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            lt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * 小于等于 &lt;= entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdLe(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            le("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * BETWEEN  entity().getFkBaiduAccountId() AND 值2
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdBetween(Long fkBaiduAccountIdEnd){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null && fkBaiduAccountIdEnd!=null){
            between("fk_baidu_account_id",fkBaiduAccountId,fkBaiduAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * NOT BETWEEN  entity().getFkBaiduAccountId() AND 值2
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdNotBetween(Long fkBaiduAccountIdEnd){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null && fkBaiduAccountIdEnd!=null){
            notBetween("fk_baidu_account_id",fkBaiduAccountId,fkBaiduAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * BETWEEN  entity().getFkBaiduAccountId() AND 值2
     * @param fkBaiduAccountIdStart       值1
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdBetween(Long fkBaiduAccountIdStart,Long fkBaiduAccountIdEnd){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null && fkBaiduAccountIdEnd!=null){
            between("fk_baidu_account_id",fkBaiduAccountIdStart,fkBaiduAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * NOT BETWEEN  entity().getFkBaiduAccountId() AND 值2
     * @param fkBaiduAccountIdStart       值1
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdNotBetween(Long fkBaiduAccountIdStart,Long fkBaiduAccountIdEnd){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null && fkBaiduAccountIdEnd!=null){
            notBetween("fk_baidu_account_id",fkBaiduAccountIdStart,fkBaiduAccountIdEnd);
        }
        return this;
     }


    /**
     * <p>百度账号id</p>
     * LIKE '%值%' entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdLike(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            like("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * NOT LIKE '%值%' entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdNotLike(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            notLike("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }


    /**
     * <p>百度账号id</p>
     * LIKE '%值' entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdLikeLeft(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            likeLeft("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度账号id</p>
     * LIKE '值%' entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdLikeRight(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            likeRight("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

/**
     * <p>百度账号id</p>
     * 等于 =
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdEq(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            eq("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * 不等于 &lt;&gt;
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdNe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            ne("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * 大于 &gt;
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdGt(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            gt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * 大于等于 &gt;=
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdGe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            ge("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * 小于 &lt;
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdLt(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            lt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * 小于等于 &lt;=
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdLe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            le("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * LIKE '%值%'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdLike(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            like("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * NOT LIKE '%值%'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdNotLike(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            notLike("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }


    /**
     * <p>百度账号id</p>
     * LIKE '%值'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdLikeLeft(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            likeLeft("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度账号id</p>
     * LIKE '值%'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdLikeRight(Long fkBaiduAccountId){
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
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdIsNull(){
        isNull("fk_baidu_account_id");
        return this;
    }

    /**
     * <p>百度账号id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdIsNotNull(){
        isNotNull("fk_baidu_account_id");
        return this;
    }

    /**
     * <p>百度账号id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdIn(Collection<Long> value){
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
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdIn(Long... values){
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
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdNotIn(Collection<Long> value){
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
    public BaiduImagesUpdateEntityWrapper fkBaiduAccountIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_baidu_account_id",values);
        }
        return this;
    }

    /**
     * <p>镜像名称</p>
     * 等于 = entity().getTitle()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper titleEq(){
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
    public BaiduImagesUpdateEntityWrapper titleNe(){
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
    public BaiduImagesUpdateEntityWrapper titleGt(){
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
    public BaiduImagesUpdateEntityWrapper titleGe(){
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
    public BaiduImagesUpdateEntityWrapper titleLt(){
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
    public BaiduImagesUpdateEntityWrapper titleLe(){
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
    public BaiduImagesUpdateEntityWrapper titleBetween(String titleEnd){
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
    public BaiduImagesUpdateEntityWrapper titleNotBetween(String titleEnd){
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
    public BaiduImagesUpdateEntityWrapper titleBetween(String titleStart,String titleEnd){
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
    public BaiduImagesUpdateEntityWrapper titleNotBetween(String titleStart,String titleEnd){
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
    public BaiduImagesUpdateEntityWrapper titleLike(){
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
    public BaiduImagesUpdateEntityWrapper titleNotLike(){
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
    public BaiduImagesUpdateEntityWrapper titleLikeLeft(){
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
    public BaiduImagesUpdateEntityWrapper titleLikeRight(){
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
    public BaiduImagesUpdateEntityWrapper titleEq(String title){
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
    public BaiduImagesUpdateEntityWrapper titleNe(String title){
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
    public BaiduImagesUpdateEntityWrapper titleGt(String title){
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
    public BaiduImagesUpdateEntityWrapper titleGe(String title){
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
    public BaiduImagesUpdateEntityWrapper titleLt(String title){
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
    public BaiduImagesUpdateEntityWrapper titleLe(String title){
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
    public BaiduImagesUpdateEntityWrapper titleLike(String title){
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
    public BaiduImagesUpdateEntityWrapper titleNotLike(String title){
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
    public BaiduImagesUpdateEntityWrapper titleLikeLeft(String title){
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
    public BaiduImagesUpdateEntityWrapper titleLikeRight(String title){
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
    public BaiduImagesUpdateEntityWrapper titleIsNull(){
        isNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper titleIsNotNull(){
        isNotNull("title");
        return this;
    }

    /**
     * <p>镜像名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper titleIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper titleIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper titleNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper titleNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("title",values);
        }
        return this;
    }

    /**
     * <p>镜像版本</p>
     * 等于 = entity().getVersionCode()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper versionCodeEq(){
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
    public BaiduImagesUpdateEntityWrapper versionCodeNe(){
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
    public BaiduImagesUpdateEntityWrapper versionCodeGt(){
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
    public BaiduImagesUpdateEntityWrapper versionCodeGe(){
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
    public BaiduImagesUpdateEntityWrapper versionCodeLt(){
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
    public BaiduImagesUpdateEntityWrapper versionCodeLe(){
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
    public BaiduImagesUpdateEntityWrapper versionCodeBetween(String versionCodeEnd){
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
    public BaiduImagesUpdateEntityWrapper versionCodeNotBetween(String versionCodeEnd){
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
    public BaiduImagesUpdateEntityWrapper versionCodeBetween(String versionCodeStart,String versionCodeEnd){
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
    public BaiduImagesUpdateEntityWrapper versionCodeNotBetween(String versionCodeStart,String versionCodeEnd){
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
    public BaiduImagesUpdateEntityWrapper versionCodeLike(){
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
    public BaiduImagesUpdateEntityWrapper versionCodeNotLike(){
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
    public BaiduImagesUpdateEntityWrapper versionCodeLikeLeft(){
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
    public BaiduImagesUpdateEntityWrapper versionCodeLikeRight(){
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
    public BaiduImagesUpdateEntityWrapper versionCodeEq(String versionCode){
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
    public BaiduImagesUpdateEntityWrapper versionCodeNe(String versionCode){
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
    public BaiduImagesUpdateEntityWrapper versionCodeGt(String versionCode){
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
    public BaiduImagesUpdateEntityWrapper versionCodeGe(String versionCode){
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
    public BaiduImagesUpdateEntityWrapper versionCodeLt(String versionCode){
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
    public BaiduImagesUpdateEntityWrapper versionCodeLe(String versionCode){
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
    public BaiduImagesUpdateEntityWrapper versionCodeLike(String versionCode){
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
    public BaiduImagesUpdateEntityWrapper versionCodeNotLike(String versionCode){
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
    public BaiduImagesUpdateEntityWrapper versionCodeLikeLeft(String versionCode){
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
    public BaiduImagesUpdateEntityWrapper versionCodeLikeRight(String versionCode){
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
    public BaiduImagesUpdateEntityWrapper versionCodeIsNull(){
        isNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper versionCodeIsNotNull(){
        isNotNull("version_code");
        return this;
    }

    /**
     * <p>镜像版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper versionCodeIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper versionCodeIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper versionCodeNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper versionCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("version_code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlEq(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            eq("root_image_file_url",rootImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlNe(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            ne("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlGt(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            gt("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlGe(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            ge("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlLt(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            lt("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlLe(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            le("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileUrl() AND 值2
     * @param rootImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlBetween(String rootImageFileUrlEnd){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null && rootImageFileUrlEnd!=null){
            between("root_image_file_url",rootImageFileUrl,rootImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileUrl() AND 值2
     * @param rootImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlNotBetween(String rootImageFileUrlEnd){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null && rootImageFileUrlEnd!=null){
            notBetween("root_image_file_url",rootImageFileUrl,rootImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileUrl() AND 值2
     * @param rootImageFileUrlStart       值1
     * @param rootImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlBetween(String rootImageFileUrlStart,String rootImageFileUrlEnd){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null && rootImageFileUrlEnd!=null){
            between("root_image_file_url",rootImageFileUrlStart,rootImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileUrl() AND 值2
     * @param rootImageFileUrlStart       值1
     * @param rootImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlNotBetween(String rootImageFileUrlStart,String rootImageFileUrlEnd){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null && rootImageFileUrlEnd!=null){
            notBetween("root_image_file_url",rootImageFileUrlStart,rootImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlLike(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            like("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlNotLike(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            notLike("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlLikeLeft(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            likeLeft("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getRootImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlLikeRight(){
        String rootImageFileUrl =entity().getRootImageFileUrl();
        if(rootImageFileUrl!=null){
            likeRight("root_image_file_url",rootImageFileUrl);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlEq(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            eq("root_image_file_url",rootImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlNe(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            ne("root_image_file_url",rootImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlGt(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            gt("root_image_file_url",rootImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlGe(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            ge("root_image_file_url",rootImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlLt(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            lt("root_image_file_url",rootImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlLe(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            le("root_image_file_url",rootImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlLike(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            like("root_image_file_url",rootImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlNotLike(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            notLike("root_image_file_url",rootImageFileUrl);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlLikeLeft(String rootImageFileUrl){
        if(rootImageFileUrl!=null){
            likeLeft("root_image_file_url",rootImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rootImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlLikeRight(String rootImageFileUrl){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlIsNull(){
        isNull("root_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlIsNotNull(){
        isNotNull("root_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameEq(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            eq("root_image_file_name",rootImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameNe(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            ne("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameGt(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            gt("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameGe(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            ge("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameLt(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            lt("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameLe(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            le("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileName() AND 值2
     * @param rootImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameBetween(String rootImageFileNameEnd){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null && rootImageFileNameEnd!=null){
            between("root_image_file_name",rootImageFileName,rootImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileName() AND 值2
     * @param rootImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameNotBetween(String rootImageFileNameEnd){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null && rootImageFileNameEnd!=null){
            notBetween("root_image_file_name",rootImageFileName,rootImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileName() AND 值2
     * @param rootImageFileNameStart       值1
     * @param rootImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameBetween(String rootImageFileNameStart,String rootImageFileNameEnd){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null && rootImageFileNameEnd!=null){
            between("root_image_file_name",rootImageFileNameStart,rootImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileName() AND 值2
     * @param rootImageFileNameStart       值1
     * @param rootImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameNotBetween(String rootImageFileNameStart,String rootImageFileNameEnd){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null && rootImageFileNameEnd!=null){
            notBetween("root_image_file_name",rootImageFileNameStart,rootImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameLike(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            like("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameNotLike(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            notLike("root_image_file_name",rootImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameLikeLeft(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            likeLeft("root_image_file_name",rootImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getRootImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameLikeRight(){
        String rootImageFileName =entity().getRootImageFileName();
        if(rootImageFileName!=null){
            likeRight("root_image_file_name",rootImageFileName);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameEq(String rootImageFileName){
        if(rootImageFileName!=null){
            eq("root_image_file_name",rootImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameNe(String rootImageFileName){
        if(rootImageFileName!=null){
            ne("root_image_file_name",rootImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameGt(String rootImageFileName){
        if(rootImageFileName!=null){
            gt("root_image_file_name",rootImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameGe(String rootImageFileName){
        if(rootImageFileName!=null){
            ge("root_image_file_name",rootImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameLt(String rootImageFileName){
        if(rootImageFileName!=null){
            lt("root_image_file_name",rootImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameLe(String rootImageFileName){
        if(rootImageFileName!=null){
            le("root_image_file_name",rootImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameLike(String rootImageFileName){
        if(rootImageFileName!=null){
            like("root_image_file_name",rootImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameNotLike(String rootImageFileName){
        if(rootImageFileName!=null){
            notLike("root_image_file_name",rootImageFileName);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameLikeLeft(String rootImageFileName){
        if(rootImageFileName!=null){
            likeLeft("root_image_file_name",rootImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rootImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameLikeRight(String rootImageFileName){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileNameIsNull(){
        isNull("root_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameIsNotNull(){
        isNotNull("root_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileNameIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileNameIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileNameNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeEq(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            eq("root_image_file_type",rootImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeNe(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            ne("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeGt(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            gt("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeGe(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            ge("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeLt(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            lt("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeLe(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            le("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileType() AND 值2
     * @param rootImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeBetween(String rootImageFileTypeEnd){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null && rootImageFileTypeEnd!=null){
            between("root_image_file_type",rootImageFileType,rootImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileType() AND 值2
     * @param rootImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeNotBetween(String rootImageFileTypeEnd){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null && rootImageFileTypeEnd!=null){
            notBetween("root_image_file_type",rootImageFileType,rootImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileType() AND 值2
     * @param rootImageFileTypeStart       值1
     * @param rootImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeBetween(String rootImageFileTypeStart,String rootImageFileTypeEnd){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null && rootImageFileTypeEnd!=null){
            between("root_image_file_type",rootImageFileTypeStart,rootImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileType() AND 值2
     * @param rootImageFileTypeStart       值1
     * @param rootImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeNotBetween(String rootImageFileTypeStart,String rootImageFileTypeEnd){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null && rootImageFileTypeEnd!=null){
            notBetween("root_image_file_type",rootImageFileTypeStart,rootImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeLike(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            like("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeNotLike(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            notLike("root_image_file_type",rootImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeLikeLeft(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            likeLeft("root_image_file_type",rootImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getRootImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeLikeRight(){
        String rootImageFileType =entity().getRootImageFileType();
        if(rootImageFileType!=null){
            likeRight("root_image_file_type",rootImageFileType);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeEq(String rootImageFileType){
        if(rootImageFileType!=null){
            eq("root_image_file_type",rootImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeNe(String rootImageFileType){
        if(rootImageFileType!=null){
            ne("root_image_file_type",rootImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeGt(String rootImageFileType){
        if(rootImageFileType!=null){
            gt("root_image_file_type",rootImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeGe(String rootImageFileType){
        if(rootImageFileType!=null){
            ge("root_image_file_type",rootImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeLt(String rootImageFileType){
        if(rootImageFileType!=null){
            lt("root_image_file_type",rootImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeLe(String rootImageFileType){
        if(rootImageFileType!=null){
            le("root_image_file_type",rootImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeLike(String rootImageFileType){
        if(rootImageFileType!=null){
            like("root_image_file_type",rootImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeNotLike(String rootImageFileType){
        if(rootImageFileType!=null){
            notLike("root_image_file_type",rootImageFileType);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeLikeLeft(String rootImageFileType){
        if(rootImageFileType!=null){
            likeLeft("root_image_file_type",rootImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rootImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeLikeRight(String rootImageFileType){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeIsNull(){
        isNull("root_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeIsNotNull(){
        isNotNull("root_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Eq(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            eq("root_image_file_md5",rootImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Ne(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            ne("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Gt(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            gt("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Ge(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            ge("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Lt(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            lt("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Le(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            le("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileMd5() AND 值2
     * @param rootImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Between(String rootImageFileMd5End){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null && rootImageFileMd5End!=null){
            between("root_image_file_md5",rootImageFileMd5,rootImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileMd5() AND 值2
     * @param rootImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5NotBetween(String rootImageFileMd5End){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null && rootImageFileMd5End!=null){
            notBetween("root_image_file_md5",rootImageFileMd5,rootImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRootImageFileMd5() AND 值2
     * @param rootImageFileMd5Start       值1
     * @param rootImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Between(String rootImageFileMd5Start,String rootImageFileMd5End){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null && rootImageFileMd5End!=null){
            between("root_image_file_md5",rootImageFileMd5Start,rootImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRootImageFileMd5() AND 值2
     * @param rootImageFileMd5Start       值1
     * @param rootImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5NotBetween(String rootImageFileMd5Start,String rootImageFileMd5End){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null && rootImageFileMd5End!=null){
            notBetween("root_image_file_md5",rootImageFileMd5Start,rootImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Like(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            like("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5NotLike(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            notLike("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5LikeLeft(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            likeLeft("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getRootImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5LikeRight(){
        String rootImageFileMd5 =entity().getRootImageFileMd5();
        if(rootImageFileMd5!=null){
            likeRight("root_image_file_md5",rootImageFileMd5);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Eq(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            eq("root_image_file_md5",rootImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Ne(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            ne("root_image_file_md5",rootImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Gt(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            gt("root_image_file_md5",rootImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Ge(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            ge("root_image_file_md5",rootImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Lt(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            lt("root_image_file_md5",rootImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Le(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            le("root_image_file_md5",rootImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5Like(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            like("root_image_file_md5",rootImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5NotLike(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            notLike("root_image_file_md5",rootImageFileMd5);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5LikeLeft(String rootImageFileMd5){
        if(rootImageFileMd5!=null){
            likeLeft("root_image_file_md5",rootImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rootImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5LikeRight(String rootImageFileMd5){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5IsNull(){
        isNull("root_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5IsNotNull(){
        isNotNull("root_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5In(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5In(String... values){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5NotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper rootImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlEq(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            eq("system_image_file_url",systemImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlNe(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            ne("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlGt(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            gt("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlGe(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            ge("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlLt(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            lt("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlLe(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            le("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileUrl() AND 值2
     * @param systemImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlBetween(String systemImageFileUrlEnd){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null && systemImageFileUrlEnd!=null){
            between("system_image_file_url",systemImageFileUrl,systemImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileUrl() AND 值2
     * @param systemImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlNotBetween(String systemImageFileUrlEnd){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null && systemImageFileUrlEnd!=null){
            notBetween("system_image_file_url",systemImageFileUrl,systemImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileUrl() AND 值2
     * @param systemImageFileUrlStart       值1
     * @param systemImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlBetween(String systemImageFileUrlStart,String systemImageFileUrlEnd){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null && systemImageFileUrlEnd!=null){
            between("system_image_file_url",systemImageFileUrlStart,systemImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileUrl() AND 值2
     * @param systemImageFileUrlStart       值1
     * @param systemImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlNotBetween(String systemImageFileUrlStart,String systemImageFileUrlEnd){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null && systemImageFileUrlEnd!=null){
            notBetween("system_image_file_url",systemImageFileUrlStart,systemImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlLike(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            like("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlNotLike(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            notLike("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlLikeLeft(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            likeLeft("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getSystemImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlLikeRight(){
        String systemImageFileUrl =entity().getSystemImageFileUrl();
        if(systemImageFileUrl!=null){
            likeRight("system_image_file_url",systemImageFileUrl);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlEq(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            eq("system_image_file_url",systemImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlNe(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            ne("system_image_file_url",systemImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlGt(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            gt("system_image_file_url",systemImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlGe(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            ge("system_image_file_url",systemImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlLt(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            lt("system_image_file_url",systemImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlLe(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            le("system_image_file_url",systemImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlLike(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            like("system_image_file_url",systemImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlNotLike(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            notLike("system_image_file_url",systemImageFileUrl);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlLikeLeft(String systemImageFileUrl){
        if(systemImageFileUrl!=null){
            likeLeft("system_image_file_url",systemImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param systemImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlLikeRight(String systemImageFileUrl){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlIsNull(){
        isNull("system_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlIsNotNull(){
        isNotNull("system_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameEq(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            eq("system_image_file_name",systemImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameNe(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            ne("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameGt(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            gt("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameGe(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            ge("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameLt(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            lt("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameLe(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            le("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileName() AND 值2
     * @param systemImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameBetween(String systemImageFileNameEnd){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null && systemImageFileNameEnd!=null){
            between("system_image_file_name",systemImageFileName,systemImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileName() AND 值2
     * @param systemImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameNotBetween(String systemImageFileNameEnd){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null && systemImageFileNameEnd!=null){
            notBetween("system_image_file_name",systemImageFileName,systemImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileName() AND 值2
     * @param systemImageFileNameStart       值1
     * @param systemImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameBetween(String systemImageFileNameStart,String systemImageFileNameEnd){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null && systemImageFileNameEnd!=null){
            between("system_image_file_name",systemImageFileNameStart,systemImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileName() AND 值2
     * @param systemImageFileNameStart       值1
     * @param systemImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameNotBetween(String systemImageFileNameStart,String systemImageFileNameEnd){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null && systemImageFileNameEnd!=null){
            notBetween("system_image_file_name",systemImageFileNameStart,systemImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameLike(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            like("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameNotLike(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            notLike("system_image_file_name",systemImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameLikeLeft(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            likeLeft("system_image_file_name",systemImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getSystemImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameLikeRight(){
        String systemImageFileName =entity().getSystemImageFileName();
        if(systemImageFileName!=null){
            likeRight("system_image_file_name",systemImageFileName);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameEq(String systemImageFileName){
        if(systemImageFileName!=null){
            eq("system_image_file_name",systemImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameNe(String systemImageFileName){
        if(systemImageFileName!=null){
            ne("system_image_file_name",systemImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameGt(String systemImageFileName){
        if(systemImageFileName!=null){
            gt("system_image_file_name",systemImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameGe(String systemImageFileName){
        if(systemImageFileName!=null){
            ge("system_image_file_name",systemImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameLt(String systemImageFileName){
        if(systemImageFileName!=null){
            lt("system_image_file_name",systemImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameLe(String systemImageFileName){
        if(systemImageFileName!=null){
            le("system_image_file_name",systemImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameLike(String systemImageFileName){
        if(systemImageFileName!=null){
            like("system_image_file_name",systemImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameNotLike(String systemImageFileName){
        if(systemImageFileName!=null){
            notLike("system_image_file_name",systemImageFileName);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameLikeLeft(String systemImageFileName){
        if(systemImageFileName!=null){
            likeLeft("system_image_file_name",systemImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param systemImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameLikeRight(String systemImageFileName){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileNameIsNull(){
        isNull("system_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameIsNotNull(){
        isNotNull("system_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileNameIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileNameIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileNameNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeEq(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            eq("system_image_file_type",systemImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeNe(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            ne("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeGt(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            gt("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeGe(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            ge("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeLt(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            lt("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeLe(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            le("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileType() AND 值2
     * @param systemImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeBetween(String systemImageFileTypeEnd){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null && systemImageFileTypeEnd!=null){
            between("system_image_file_type",systemImageFileType,systemImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileType() AND 值2
     * @param systemImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeNotBetween(String systemImageFileTypeEnd){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null && systemImageFileTypeEnd!=null){
            notBetween("system_image_file_type",systemImageFileType,systemImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileType() AND 值2
     * @param systemImageFileTypeStart       值1
     * @param systemImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeBetween(String systemImageFileTypeStart,String systemImageFileTypeEnd){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null && systemImageFileTypeEnd!=null){
            between("system_image_file_type",systemImageFileTypeStart,systemImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileType() AND 值2
     * @param systemImageFileTypeStart       值1
     * @param systemImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeNotBetween(String systemImageFileTypeStart,String systemImageFileTypeEnd){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null && systemImageFileTypeEnd!=null){
            notBetween("system_image_file_type",systemImageFileTypeStart,systemImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeLike(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            like("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeNotLike(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            notLike("system_image_file_type",systemImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeLikeLeft(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            likeLeft("system_image_file_type",systemImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getSystemImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeLikeRight(){
        String systemImageFileType =entity().getSystemImageFileType();
        if(systemImageFileType!=null){
            likeRight("system_image_file_type",systemImageFileType);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeEq(String systemImageFileType){
        if(systemImageFileType!=null){
            eq("system_image_file_type",systemImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeNe(String systemImageFileType){
        if(systemImageFileType!=null){
            ne("system_image_file_type",systemImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeGt(String systemImageFileType){
        if(systemImageFileType!=null){
            gt("system_image_file_type",systemImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeGe(String systemImageFileType){
        if(systemImageFileType!=null){
            ge("system_image_file_type",systemImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeLt(String systemImageFileType){
        if(systemImageFileType!=null){
            lt("system_image_file_type",systemImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeLe(String systemImageFileType){
        if(systemImageFileType!=null){
            le("system_image_file_type",systemImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeLike(String systemImageFileType){
        if(systemImageFileType!=null){
            like("system_image_file_type",systemImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeNotLike(String systemImageFileType){
        if(systemImageFileType!=null){
            notLike("system_image_file_type",systemImageFileType);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeLikeLeft(String systemImageFileType){
        if(systemImageFileType!=null){
            likeLeft("system_image_file_type",systemImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param systemImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeLikeRight(String systemImageFileType){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeIsNull(){
        isNull("system_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeIsNotNull(){
        isNotNull("system_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Eq(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            eq("system_image_file_md5",systemImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Ne(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            ne("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Gt(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            gt("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Ge(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            ge("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Lt(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            lt("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Le(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            le("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileMd5() AND 值2
     * @param systemImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Between(String systemImageFileMd5End){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null && systemImageFileMd5End!=null){
            between("system_image_file_md5",systemImageFileMd5,systemImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileMd5() AND 值2
     * @param systemImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5NotBetween(String systemImageFileMd5End){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null && systemImageFileMd5End!=null){
            notBetween("system_image_file_md5",systemImageFileMd5,systemImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSystemImageFileMd5() AND 值2
     * @param systemImageFileMd5Start       值1
     * @param systemImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Between(String systemImageFileMd5Start,String systemImageFileMd5End){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null && systemImageFileMd5End!=null){
            between("system_image_file_md5",systemImageFileMd5Start,systemImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSystemImageFileMd5() AND 值2
     * @param systemImageFileMd5Start       值1
     * @param systemImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5NotBetween(String systemImageFileMd5Start,String systemImageFileMd5End){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null && systemImageFileMd5End!=null){
            notBetween("system_image_file_md5",systemImageFileMd5Start,systemImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Like(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            like("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5NotLike(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            notLike("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5LikeLeft(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            likeLeft("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getSystemImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5LikeRight(){
        String systemImageFileMd5 =entity().getSystemImageFileMd5();
        if(systemImageFileMd5!=null){
            likeRight("system_image_file_md5",systemImageFileMd5);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Eq(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            eq("system_image_file_md5",systemImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Ne(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            ne("system_image_file_md5",systemImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Gt(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            gt("system_image_file_md5",systemImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Ge(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            ge("system_image_file_md5",systemImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Lt(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            lt("system_image_file_md5",systemImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Le(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            le("system_image_file_md5",systemImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5Like(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            like("system_image_file_md5",systemImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5NotLike(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            notLike("system_image_file_md5",systemImageFileMd5);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5LikeLeft(String systemImageFileMd5){
        if(systemImageFileMd5!=null){
            likeLeft("system_image_file_md5",systemImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param systemImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5LikeRight(String systemImageFileMd5){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5IsNull(){
        isNull("system_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5IsNotNull(){
        isNotNull("system_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5In(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5In(String... values){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5NotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper systemImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("system_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlEq(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            eq("odm_image_file_url",odmImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlNe(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            ne("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlGt(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            gt("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlGe(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            ge("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlLt(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            lt("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlLe(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            le("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileUrl() AND 值2
     * @param odmImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlBetween(String odmImageFileUrlEnd){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null && odmImageFileUrlEnd!=null){
            between("odm_image_file_url",odmImageFileUrl,odmImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileUrl() AND 值2
     * @param odmImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlNotBetween(String odmImageFileUrlEnd){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null && odmImageFileUrlEnd!=null){
            notBetween("odm_image_file_url",odmImageFileUrl,odmImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileUrl() AND 值2
     * @param odmImageFileUrlStart       值1
     * @param odmImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlBetween(String odmImageFileUrlStart,String odmImageFileUrlEnd){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null && odmImageFileUrlEnd!=null){
            between("odm_image_file_url",odmImageFileUrlStart,odmImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileUrl() AND 值2
     * @param odmImageFileUrlStart       值1
     * @param odmImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlNotBetween(String odmImageFileUrlStart,String odmImageFileUrlEnd){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null && odmImageFileUrlEnd!=null){
            notBetween("odm_image_file_url",odmImageFileUrlStart,odmImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlLike(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            like("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlNotLike(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            notLike("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlLikeLeft(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            likeLeft("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getOdmImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlLikeRight(){
        String odmImageFileUrl =entity().getOdmImageFileUrl();
        if(odmImageFileUrl!=null){
            likeRight("odm_image_file_url",odmImageFileUrl);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlEq(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            eq("odm_image_file_url",odmImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlNe(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            ne("odm_image_file_url",odmImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlGt(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            gt("odm_image_file_url",odmImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlGe(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            ge("odm_image_file_url",odmImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlLt(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            lt("odm_image_file_url",odmImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlLe(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            le("odm_image_file_url",odmImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlLike(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            like("odm_image_file_url",odmImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlNotLike(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            notLike("odm_image_file_url",odmImageFileUrl);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlLikeLeft(String odmImageFileUrl){
        if(odmImageFileUrl!=null){
            likeLeft("odm_image_file_url",odmImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param odmImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlLikeRight(String odmImageFileUrl){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlIsNull(){
        isNull("odm_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlIsNotNull(){
        isNotNull("odm_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameEq(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            eq("odm_image_file_name",odmImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameNe(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            ne("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameGt(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            gt("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameGe(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            ge("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameLt(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            lt("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameLe(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            le("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileName() AND 值2
     * @param odmImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameBetween(String odmImageFileNameEnd){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null && odmImageFileNameEnd!=null){
            between("odm_image_file_name",odmImageFileName,odmImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileName() AND 值2
     * @param odmImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameNotBetween(String odmImageFileNameEnd){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null && odmImageFileNameEnd!=null){
            notBetween("odm_image_file_name",odmImageFileName,odmImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileName() AND 值2
     * @param odmImageFileNameStart       值1
     * @param odmImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameBetween(String odmImageFileNameStart,String odmImageFileNameEnd){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null && odmImageFileNameEnd!=null){
            between("odm_image_file_name",odmImageFileNameStart,odmImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileName() AND 值2
     * @param odmImageFileNameStart       值1
     * @param odmImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameNotBetween(String odmImageFileNameStart,String odmImageFileNameEnd){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null && odmImageFileNameEnd!=null){
            notBetween("odm_image_file_name",odmImageFileNameStart,odmImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameLike(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            like("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameNotLike(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            notLike("odm_image_file_name",odmImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameLikeLeft(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            likeLeft("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getOdmImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameLikeRight(){
        String odmImageFileName =entity().getOdmImageFileName();
        if(odmImageFileName!=null){
            likeRight("odm_image_file_name",odmImageFileName);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameEq(String odmImageFileName){
        if(odmImageFileName!=null){
            eq("odm_image_file_name",odmImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameNe(String odmImageFileName){
        if(odmImageFileName!=null){
            ne("odm_image_file_name",odmImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameGt(String odmImageFileName){
        if(odmImageFileName!=null){
            gt("odm_image_file_name",odmImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameGe(String odmImageFileName){
        if(odmImageFileName!=null){
            ge("odm_image_file_name",odmImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameLt(String odmImageFileName){
        if(odmImageFileName!=null){
            lt("odm_image_file_name",odmImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameLe(String odmImageFileName){
        if(odmImageFileName!=null){
            le("odm_image_file_name",odmImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameLike(String odmImageFileName){
        if(odmImageFileName!=null){
            like("odm_image_file_name",odmImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameNotLike(String odmImageFileName){
        if(odmImageFileName!=null){
            notLike("odm_image_file_name",odmImageFileName);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameLikeLeft(String odmImageFileName){
        if(odmImageFileName!=null){
            likeLeft("odm_image_file_name",odmImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param odmImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameLikeRight(String odmImageFileName){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileNameIsNull(){
        isNull("odm_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameIsNotNull(){
        isNotNull("odm_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileNameIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileNameIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileNameNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeEq(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            eq("odm_image_file_type",odmImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeNe(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            ne("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeGt(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            gt("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeGe(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            ge("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeLt(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            lt("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeLe(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            le("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileType() AND 值2
     * @param odmImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeBetween(String odmImageFileTypeEnd){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null && odmImageFileTypeEnd!=null){
            between("odm_image_file_type",odmImageFileType,odmImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileType() AND 值2
     * @param odmImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeNotBetween(String odmImageFileTypeEnd){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null && odmImageFileTypeEnd!=null){
            notBetween("odm_image_file_type",odmImageFileType,odmImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileType() AND 值2
     * @param odmImageFileTypeStart       值1
     * @param odmImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeBetween(String odmImageFileTypeStart,String odmImageFileTypeEnd){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null && odmImageFileTypeEnd!=null){
            between("odm_image_file_type",odmImageFileTypeStart,odmImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileType() AND 值2
     * @param odmImageFileTypeStart       值1
     * @param odmImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeNotBetween(String odmImageFileTypeStart,String odmImageFileTypeEnd){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null && odmImageFileTypeEnd!=null){
            notBetween("odm_image_file_type",odmImageFileTypeStart,odmImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeLike(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            like("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeNotLike(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            notLike("odm_image_file_type",odmImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeLikeLeft(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            likeLeft("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getOdmImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeLikeRight(){
        String odmImageFileType =entity().getOdmImageFileType();
        if(odmImageFileType!=null){
            likeRight("odm_image_file_type",odmImageFileType);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeEq(String odmImageFileType){
        if(odmImageFileType!=null){
            eq("odm_image_file_type",odmImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeNe(String odmImageFileType){
        if(odmImageFileType!=null){
            ne("odm_image_file_type",odmImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeGt(String odmImageFileType){
        if(odmImageFileType!=null){
            gt("odm_image_file_type",odmImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeGe(String odmImageFileType){
        if(odmImageFileType!=null){
            ge("odm_image_file_type",odmImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeLt(String odmImageFileType){
        if(odmImageFileType!=null){
            lt("odm_image_file_type",odmImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeLe(String odmImageFileType){
        if(odmImageFileType!=null){
            le("odm_image_file_type",odmImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeLike(String odmImageFileType){
        if(odmImageFileType!=null){
            like("odm_image_file_type",odmImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeNotLike(String odmImageFileType){
        if(odmImageFileType!=null){
            notLike("odm_image_file_type",odmImageFileType);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeLikeLeft(String odmImageFileType){
        if(odmImageFileType!=null){
            likeLeft("odm_image_file_type",odmImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param odmImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeLikeRight(String odmImageFileType){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeIsNull(){
        isNull("odm_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeIsNotNull(){
        isNotNull("odm_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Eq(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            eq("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Ne(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            ne("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Gt(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            gt("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Ge(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            ge("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Lt(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            lt("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Le(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            le("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileMd5() AND 值2
     * @param odmImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Between(String odmImageFileMd5End){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null && odmImageFileMd5End!=null){
            between("odm_image_file_md5",odmImageFileMd5,odmImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileMd5() AND 值2
     * @param odmImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5NotBetween(String odmImageFileMd5End){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null && odmImageFileMd5End!=null){
            notBetween("odm_image_file_md5",odmImageFileMd5,odmImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getOdmImageFileMd5() AND 值2
     * @param odmImageFileMd5Start       值1
     * @param odmImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Between(String odmImageFileMd5Start,String odmImageFileMd5End){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null && odmImageFileMd5End!=null){
            between("odm_image_file_md5",odmImageFileMd5Start,odmImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getOdmImageFileMd5() AND 值2
     * @param odmImageFileMd5Start       值1
     * @param odmImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5NotBetween(String odmImageFileMd5Start,String odmImageFileMd5End){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null && odmImageFileMd5End!=null){
            notBetween("odm_image_file_md5",odmImageFileMd5Start,odmImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Like(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            like("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5NotLike(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            notLike("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5LikeLeft(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            likeLeft("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getOdmImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5LikeRight(){
        String odmImageFileMd5 =entity().getOdmImageFileMd5();
        if(odmImageFileMd5!=null){
            likeRight("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Eq(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            eq("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Ne(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            ne("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Gt(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            gt("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Ge(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            ge("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Lt(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            lt("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Le(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            le("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5Like(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            like("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5NotLike(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            notLike("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5LikeLeft(String odmImageFileMd5){
        if(odmImageFileMd5!=null){
            likeLeft("odm_image_file_md5",odmImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param odmImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5LikeRight(String odmImageFileMd5){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5IsNull(){
        isNull("odm_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5IsNotNull(){
        isNotNull("odm_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5In(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5In(String... values){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5NotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper odmImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("odm_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlEq(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            eq("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlNe(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            ne("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlGt(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            gt("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlGe(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            ge("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlLt(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            lt("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlLe(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            le("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileUrl() AND 值2
     * @param vendorImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlBetween(String vendorImageFileUrlEnd){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null && vendorImageFileUrlEnd!=null){
            between("vendor_image_file_url",vendorImageFileUrl,vendorImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileUrl() AND 值2
     * @param vendorImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlNotBetween(String vendorImageFileUrlEnd){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null && vendorImageFileUrlEnd!=null){
            notBetween("vendor_image_file_url",vendorImageFileUrl,vendorImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileUrl() AND 值2
     * @param vendorImageFileUrlStart       值1
     * @param vendorImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlBetween(String vendorImageFileUrlStart,String vendorImageFileUrlEnd){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null && vendorImageFileUrlEnd!=null){
            between("vendor_image_file_url",vendorImageFileUrlStart,vendorImageFileUrlEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileUrl() AND 值2
     * @param vendorImageFileUrlStart       值1
     * @param vendorImageFileUrlEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlNotBetween(String vendorImageFileUrlStart,String vendorImageFileUrlEnd){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null && vendorImageFileUrlEnd!=null){
            notBetween("vendor_image_file_url",vendorImageFileUrlStart,vendorImageFileUrlEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlLike(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            like("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlNotLike(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            notLike("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlLikeLeft(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            likeLeft("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getVendorImageFileUrl()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlLikeRight(){
        String vendorImageFileUrl =entity().getVendorImageFileUrl();
        if(vendorImageFileUrl!=null){
            likeRight("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlEq(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            eq("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlNe(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            ne("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlGt(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            gt("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlGe(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            ge("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlLt(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            lt("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlLe(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            le("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlLike(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            like("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlNotLike(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            notLike("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlLikeLeft(String vendorImageFileUrl){
        if(vendorImageFileUrl!=null){
            likeLeft("vendor_image_file_url",vendorImageFileUrl);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param vendorImageFileUrl       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlLikeRight(String vendorImageFileUrl){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlIsNull(){
        isNull("vendor_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlIsNotNull(){
        isNotNull("vendor_image_file_url");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileUrlNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_url",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameEq(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            eq("vendor_image_file_name",vendorImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameNe(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            ne("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameGt(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            gt("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameGe(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            ge("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameLt(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            lt("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameLe(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            le("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileName() AND 值2
     * @param vendorImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameBetween(String vendorImageFileNameEnd){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null && vendorImageFileNameEnd!=null){
            between("vendor_image_file_name",vendorImageFileName,vendorImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileName() AND 值2
     * @param vendorImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameNotBetween(String vendorImageFileNameEnd){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null && vendorImageFileNameEnd!=null){
            notBetween("vendor_image_file_name",vendorImageFileName,vendorImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileName() AND 值2
     * @param vendorImageFileNameStart       值1
     * @param vendorImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameBetween(String vendorImageFileNameStart,String vendorImageFileNameEnd){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null && vendorImageFileNameEnd!=null){
            between("vendor_image_file_name",vendorImageFileNameStart,vendorImageFileNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileName() AND 值2
     * @param vendorImageFileNameStart       值1
     * @param vendorImageFileNameEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameNotBetween(String vendorImageFileNameStart,String vendorImageFileNameEnd){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null && vendorImageFileNameEnd!=null){
            notBetween("vendor_image_file_name",vendorImageFileNameStart,vendorImageFileNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameLike(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            like("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameNotLike(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            notLike("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameLikeLeft(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            likeLeft("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getVendorImageFileName()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameLikeRight(){
        String vendorImageFileName =entity().getVendorImageFileName();
        if(vendorImageFileName!=null){
            likeRight("vendor_image_file_name",vendorImageFileName);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameEq(String vendorImageFileName){
        if(vendorImageFileName!=null){
            eq("vendor_image_file_name",vendorImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameNe(String vendorImageFileName){
        if(vendorImageFileName!=null){
            ne("vendor_image_file_name",vendorImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameGt(String vendorImageFileName){
        if(vendorImageFileName!=null){
            gt("vendor_image_file_name",vendorImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameGe(String vendorImageFileName){
        if(vendorImageFileName!=null){
            ge("vendor_image_file_name",vendorImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameLt(String vendorImageFileName){
        if(vendorImageFileName!=null){
            lt("vendor_image_file_name",vendorImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameLe(String vendorImageFileName){
        if(vendorImageFileName!=null){
            le("vendor_image_file_name",vendorImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameLike(String vendorImageFileName){
        if(vendorImageFileName!=null){
            like("vendor_image_file_name",vendorImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameNotLike(String vendorImageFileName){
        if(vendorImageFileName!=null){
            notLike("vendor_image_file_name",vendorImageFileName);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameLikeLeft(String vendorImageFileName){
        if(vendorImageFileName!=null){
            likeLeft("vendor_image_file_name",vendorImageFileName);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param vendorImageFileName       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameLikeRight(String vendorImageFileName){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameIsNull(){
        isNull("vendor_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameIsNotNull(){
        isNotNull("vendor_image_file_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeEq(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            eq("vendor_image_file_type",vendorImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeNe(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            ne("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeGt(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            gt("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeGe(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            ge("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeLt(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            lt("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeLe(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            le("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileType() AND 值2
     * @param vendorImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeBetween(String vendorImageFileTypeEnd){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null && vendorImageFileTypeEnd!=null){
            between("vendor_image_file_type",vendorImageFileType,vendorImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileType() AND 值2
     * @param vendorImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeNotBetween(String vendorImageFileTypeEnd){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null && vendorImageFileTypeEnd!=null){
            notBetween("vendor_image_file_type",vendorImageFileType,vendorImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileType() AND 值2
     * @param vendorImageFileTypeStart       值1
     * @param vendorImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeBetween(String vendorImageFileTypeStart,String vendorImageFileTypeEnd){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null && vendorImageFileTypeEnd!=null){
            between("vendor_image_file_type",vendorImageFileTypeStart,vendorImageFileTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileType() AND 值2
     * @param vendorImageFileTypeStart       值1
     * @param vendorImageFileTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeNotBetween(String vendorImageFileTypeStart,String vendorImageFileTypeEnd){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null && vendorImageFileTypeEnd!=null){
            notBetween("vendor_image_file_type",vendorImageFileTypeStart,vendorImageFileTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeLike(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            like("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeNotLike(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            notLike("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeLikeLeft(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            likeLeft("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getVendorImageFileType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeLikeRight(){
        String vendorImageFileType =entity().getVendorImageFileType();
        if(vendorImageFileType!=null){
            likeRight("vendor_image_file_type",vendorImageFileType);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeEq(String vendorImageFileType){
        if(vendorImageFileType!=null){
            eq("vendor_image_file_type",vendorImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeNe(String vendorImageFileType){
        if(vendorImageFileType!=null){
            ne("vendor_image_file_type",vendorImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeGt(String vendorImageFileType){
        if(vendorImageFileType!=null){
            gt("vendor_image_file_type",vendorImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeGe(String vendorImageFileType){
        if(vendorImageFileType!=null){
            ge("vendor_image_file_type",vendorImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeLt(String vendorImageFileType){
        if(vendorImageFileType!=null){
            lt("vendor_image_file_type",vendorImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeLe(String vendorImageFileType){
        if(vendorImageFileType!=null){
            le("vendor_image_file_type",vendorImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeLike(String vendorImageFileType){
        if(vendorImageFileType!=null){
            like("vendor_image_file_type",vendorImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeNotLike(String vendorImageFileType){
        if(vendorImageFileType!=null){
            notLike("vendor_image_file_type",vendorImageFileType);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeLikeLeft(String vendorImageFileType){
        if(vendorImageFileType!=null){
            likeLeft("vendor_image_file_type",vendorImageFileType);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param vendorImageFileType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeLikeRight(String vendorImageFileType){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeIsNull(){
        isNull("vendor_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeIsNotNull(){
        isNotNull("vendor_image_file_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Eq(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            eq("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Ne(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            ne("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Gt(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            gt("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Ge(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            ge("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Lt(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            lt("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Le(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            le("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileMd5() AND 值2
     * @param vendorImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Between(String vendorImageFileMd5End){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null && vendorImageFileMd5End!=null){
            between("vendor_image_file_md5",vendorImageFileMd5,vendorImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileMd5() AND 值2
     * @param vendorImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5NotBetween(String vendorImageFileMd5End){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null && vendorImageFileMd5End!=null){
            notBetween("vendor_image_file_md5",vendorImageFileMd5,vendorImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVendorImageFileMd5() AND 值2
     * @param vendorImageFileMd5Start       值1
     * @param vendorImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Between(String vendorImageFileMd5Start,String vendorImageFileMd5End){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null && vendorImageFileMd5End!=null){
            between("vendor_image_file_md5",vendorImageFileMd5Start,vendorImageFileMd5End);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVendorImageFileMd5() AND 值2
     * @param vendorImageFileMd5Start       值1
     * @param vendorImageFileMd5End      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5NotBetween(String vendorImageFileMd5Start,String vendorImageFileMd5End){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null && vendorImageFileMd5End!=null){
            notBetween("vendor_image_file_md5",vendorImageFileMd5Start,vendorImageFileMd5End);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Like(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            like("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5NotLike(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            notLike("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5LikeLeft(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            likeLeft("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getVendorImageFileMd5()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5LikeRight(){
        String vendorImageFileMd5 =entity().getVendorImageFileMd5();
        if(vendorImageFileMd5!=null){
            likeRight("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Eq(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            eq("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Ne(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            ne("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Gt(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            gt("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Ge(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            ge("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Lt(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            lt("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Le(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            le("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5Like(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            like("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5NotLike(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            notLike("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5LikeLeft(String vendorImageFileMd5){
        if(vendorImageFileMd5!=null){
            likeLeft("vendor_image_file_md5",vendorImageFileMd5);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param vendorImageFileMd5       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5LikeRight(String vendorImageFileMd5){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5IsNull(){
        isNull("vendor_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5IsNotNull(){
        isNotNull("vendor_image_file_md5");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5In(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5In(String... values){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5NotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper vendorImageFileMd5NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("vendor_image_file_md5",values);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 等于 = entity().getServerType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeEq(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 不等于 &lt;&gt; entity().getServerType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeNe(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 大于 &gt; entity().getServerType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeGt(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 大于等于 &gt;= entity().getServerType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeGe(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 小于 &lt; entity().getServerType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeLt(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 小于等于 &lt;= entity().getServerType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeLe(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeBetween(String serverTypeEnd){
        String serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            between("server_type",serverType,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * NOT BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeNotBetween(String serverTypeEnd){
        String serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            notBetween("server_type",serverType,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeBetween(String serverTypeStart,String serverTypeEnd){
        String serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            between("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * NOT BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeNotBetween(String serverTypeStart,String serverTypeEnd){
        String serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            notBetween("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }


    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '%值%' entity().getServerType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeLike(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * NOT LIKE '%值%' entity().getServerType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeNotLike(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
     }


    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '%值' entity().getServerType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeLikeLeft(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '值%' entity().getServerType()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeLikeRight(){
        String serverType =entity().getServerType();
        if(serverType!=null){
            likeRight("server_type",serverType);
        }
        return this;
     }

/**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 等于 =
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeEq(String serverType){
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 不等于 &lt;&gt;
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeNe(String serverType){
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 大于 &gt;
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeGt(String serverType){
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 大于等于 &gt;=
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeGe(String serverType){
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 小于 &lt;
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeLt(String serverType){
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * 小于等于 &lt;=
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeLe(String serverType){
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '%值%'
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeLike(String serverType){
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * NOT LIKE '%值%'
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeNotLike(String serverType){
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
    }


    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '%值'
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeLikeLeft(String serverType){
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * LIKE '值%'
     * @param serverType       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeLikeRight(String serverType){
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
    public BaiduImagesUpdateEntityWrapper serverTypeIsNull(){
        isNull("server_type");
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeIsNotNull(){
        isNotNull("server_type");
        return this;
    }

    /**
     * <p>设备类型（3399，3288，3588，Ampere32，845，865）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper serverTypeIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper serverTypeIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper serverTypeNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper serverTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("server_type",values);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 等于 = entity().getRomVersion()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionEq(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            eq("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 不等于 &lt;&gt; entity().getRomVersion()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionNe(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            ne("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 大于 &gt; entity().getRomVersion()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionGt(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            gt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 大于等于 &gt;= entity().getRomVersion()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionGe(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            ge("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 小于 &lt; entity().getRomVersion()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionLt(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            lt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 小于等于 &lt;= entity().getRomVersion()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionLe(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            le("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * BETWEEN  entity().getRomVersion() AND 值2
     * @param romVersionEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionBetween(String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            between("rom_version",romVersion,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * NOT BETWEEN  entity().getRomVersion() AND 值2
     * @param romVersionEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionNotBetween(String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            notBetween("rom_version",romVersion,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * BETWEEN  entity().getRomVersion() AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionBetween(String romVersionStart,String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            between("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * NOT BETWEEN  entity().getRomVersion() AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionNotBetween(String romVersionStart,String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            notBetween("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }


    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '%值%' entity().getRomVersion()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionLike(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            like("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * NOT LIKE '%值%' entity().getRomVersion()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionNotLike(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            notLike("rom_version",romVersion);
        }
        return this;
     }


    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '%值' entity().getRomVersion()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionLikeLeft(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            likeLeft("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '值%' entity().getRomVersion()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionLikeRight(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            likeRight("rom_version",romVersion);
        }
        return this;
     }

/**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 等于 =
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionEq(String romVersion){
        if(romVersion!=null){
            eq("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 不等于 &lt;&gt;
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionNe(String romVersion){
        if(romVersion!=null){
            ne("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 大于 &gt;
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionGt(String romVersion){
        if(romVersion!=null){
            gt("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 大于等于 &gt;=
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionGe(String romVersion){
        if(romVersion!=null){
            ge("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 小于 &lt;
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionLt(String romVersion){
        if(romVersion!=null){
            lt("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * 小于等于 &lt;=
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionLe(String romVersion){
        if(romVersion!=null){
            le("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '%值%'
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionLike(String romVersion){
        if(romVersion!=null){
            like("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * NOT LIKE '%值%'
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionNotLike(String romVersion){
        if(romVersion!=null){
            notLike("rom_version",romVersion);
        }
        return this;
    }


    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '%值'
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionLikeLeft(String romVersion){
        if(romVersion!=null){
            likeLeft("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * LIKE '值%'
     * @param romVersion       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionLikeRight(String romVersion){
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
    public BaiduImagesUpdateEntityWrapper romVersionIsNull(){
        isNull("rom_version");
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionIsNotNull(){
        isNotNull("rom_version");
        return this;
    }

    /**
     * <p>系统版本（android6.0，android8.1，，android10.0，android12.0）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper romVersionIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper romVersionIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper romVersionNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper romVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("rom_version",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper createTimeEq(){
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
    public BaiduImagesUpdateEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTime,createTimeEnd);
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
    public BaiduImagesUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduImagesUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduImagesUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

/**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper createTimeEq(Date createTime){
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
    public BaiduImagesUpdateEntityWrapper createTimeNe(Date createTime){
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
    public BaiduImagesUpdateEntityWrapper createTimeGt(Date createTime){
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
    public BaiduImagesUpdateEntityWrapper createTimeGe(Date createTime){
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
    public BaiduImagesUpdateEntityWrapper createTimeLt(Date createTime){
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
    public BaiduImagesUpdateEntityWrapper createTimeLe(Date createTime){
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
    public BaiduImagesUpdateEntityWrapper createTimeLike(Date createTime){
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
    public BaiduImagesUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public BaiduImagesUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public BaiduImagesUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public BaiduImagesUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public BaiduImagesUpdateEntityWrapper createTimeIn(Date... values){
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
    public BaiduImagesUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public BaiduImagesUpdateEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * 等于 = entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdEq(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            eq("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * 不等于 &lt;&gt; entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdNe(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            ne("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 大于 &gt; entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdGt(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            gt("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 大于等于 &gt;= entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdGe(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            ge("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 小于 &lt; entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdLt(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            lt("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * 小于等于 &lt;= entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdLe(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            le("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * BETWEEN  entity().getImageVersionId() AND 值2
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdBetween(String imageVersionIdEnd){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null && imageVersionIdEnd!=null){
            between("image_version_id",imageVersionId,imageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * NOT BETWEEN  entity().getImageVersionId() AND 值2
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdNotBetween(String imageVersionIdEnd){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null && imageVersionIdEnd!=null){
            notBetween("image_version_id",imageVersionId,imageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * BETWEEN  entity().getImageVersionId() AND 值2
     * @param imageVersionIdStart       值1
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdBetween(String imageVersionIdStart,String imageVersionIdEnd){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null && imageVersionIdEnd!=null){
            between("image_version_id",imageVersionIdStart,imageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * NOT BETWEEN  entity().getImageVersionId() AND 值2
     * @param imageVersionIdStart       值1
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdNotBetween(String imageVersionIdStart,String imageVersionIdEnd){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null && imageVersionIdEnd!=null){
            notBetween("image_version_id",imageVersionIdStart,imageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>镜像版本id</p>
     * LIKE '%值%' entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdLike(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            like("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * NOT LIKE '%值%' entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdNotLike(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            notLike("image_version_id",imageVersionId);
        }
        return this;
     }


    /**
     * <p>镜像版本id</p>
     * LIKE '%值' entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdLikeLeft(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            likeLeft("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>镜像版本id</p>
     * LIKE '值%' entity().getImageVersionId()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdLikeRight(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            likeRight("image_version_id",imageVersionId);
        }
        return this;
     }

/**
     * <p>镜像版本id</p>
     * 等于 =
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdEq(String imageVersionId){
        if(imageVersionId!=null){
            eq("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * 不等于 &lt;&gt;
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdNe(String imageVersionId){
        if(imageVersionId!=null){
            ne("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * 大于 &gt;
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdGt(String imageVersionId){
        if(imageVersionId!=null){
            gt("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * 大于等于 &gt;=
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdGe(String imageVersionId){
        if(imageVersionId!=null){
            ge("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * 小于 &lt;
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdLt(String imageVersionId){
        if(imageVersionId!=null){
            lt("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * 小于等于 &lt;=
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdLe(String imageVersionId){
        if(imageVersionId!=null){
            le("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * LIKE '%值%'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdLike(String imageVersionId){
        if(imageVersionId!=null){
            like("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * NOT LIKE '%值%'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdNotLike(String imageVersionId){
        if(imageVersionId!=null){
            notLike("image_version_id",imageVersionId);
        }
        return this;
    }


    /**
     * <p>镜像版本id</p>
     * LIKE '%值'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdLikeLeft(String imageVersionId){
        if(imageVersionId!=null){
            likeLeft("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * LIKE '值%'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdLikeRight(String imageVersionId){
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
    public BaiduImagesUpdateEntityWrapper imageVersionIdIsNull(){
        isNull("image_version_id");
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdIsNotNull(){
        isNotNull("image_version_id");
        return this;
    }

    /**
     * <p>镜像版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper imageVersionIdIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper imageVersionIdIn(String... values){
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
    public BaiduImagesUpdateEntityWrapper imageVersionIdNotIn(Collection<String> value){
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
    public BaiduImagesUpdateEntityWrapper imageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_version_id",values);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '%值%' entity().getStatus()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * NOT LIKE '%值%' entity().getStatus()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '%值' entity().getStatus()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '值%' entity().getStatus()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

/**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
    }


    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusLikeRight(Integer status){
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
    public BaiduImagesUpdateEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper statusIn(Collection<Integer> value){
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
    public BaiduImagesUpdateEntityWrapper statusIn(Integer... values){
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
    public BaiduImagesUpdateEntityWrapper statusNotIn(Collection<Integer> value){
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
    public BaiduImagesUpdateEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeEq(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getLastUpdateTime()
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public BaiduImagesUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
