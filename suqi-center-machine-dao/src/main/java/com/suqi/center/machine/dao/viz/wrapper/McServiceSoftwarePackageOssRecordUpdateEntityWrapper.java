package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackageOssRecord;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 云机端软件包对象存储记录表
 * </p>
 * "mc_service_software_package_oss_record"
 * @author 18374
 */
public class McServiceSoftwarePackageOssRecordUpdateEntityWrapper extends UpdateWrapper<McServiceSoftwarePackageOssRecord> {

    public static McServiceSoftwarePackageOssRecordUpdateEntityWrapper wrapper(McServiceSoftwarePackageOssRecord entity) {
        return new McServiceSoftwarePackageOssRecordUpdateEntityWrapper(entity);
    }

    private McServiceSoftwarePackageOssRecord entity;

    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper(McServiceSoftwarePackageOssRecord entity) {
        this.entity=entity;
    }

    /**
     * 记录id自动增长
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 软件包类型记录id
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper setFkMcServiceSoftwarePackageId(Long fkMcServiceSoftwarePackageId) {
         set("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        return this;
    }
    /**
     * 对象存储服务记录Id
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper setOssId(Long ossId) {
         set("oss_id",ossId);
        return this;
    }
    /**
     * 对象存储服务类型（1：obs）
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper setOssType(Integer ossType) {
         set("oss_type",ossType);
        return this;
    }
    /**
     * 对象存储桶名
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper setBucketName(String bucketName) {
         set("bucket_name",bucketName);
        return this;
    }
    /**
     * 对象存储对象路径
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper setObjectPath(String objectPath) {
         set("object_path",objectPath);
        return this;
    }
    /**
     * 状态(-50：删除，0：未上传，50：正常)
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 创建时间
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    protected McServiceSoftwarePackageOssRecord entity() {
        if(entity==null){
            throw new NullPointerException("McServiceSoftwarePackageOssRecord is null");
        }
        return entity;
    }

    /**
     * <p>记录id自动增长</p>
     * 等于 = entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",entity().getId(),idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",entity().getId(),idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%' entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",entity().getId());
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",entity().getId());
        }
        return this;
     }

/**
     * <p>记录id自动增长</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
    }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 等于 = entity().getFkMcServiceSoftwarePackageId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdEq(){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null){
            eq("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 不等于 &lt;&gt; entity().getFkMcServiceSoftwarePackageId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdNe(){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null){
            ne("fk_mc_service_software_package_id",entity().getFkMcServiceSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 大于 &gt; entity().getFkMcServiceSoftwarePackageId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdGt(){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null){
            gt("fk_mc_service_software_package_id",entity().getFkMcServiceSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 大于等于 &gt;= entity().getFkMcServiceSoftwarePackageId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdGe(){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null){
            ge("fk_mc_service_software_package_id",entity().getFkMcServiceSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 小于 &lt; entity().getFkMcServiceSoftwarePackageId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdLt(){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null){
            lt("fk_mc_service_software_package_id",entity().getFkMcServiceSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 小于等于 &lt;= entity().getFkMcServiceSoftwarePackageId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdLe(){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null){
            le("fk_mc_service_software_package_id",entity().getFkMcServiceSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * BETWEEN  entity().getFkMcServiceSoftwarePackageId() AND 值2
     * @param fkMcServiceSoftwarePackageIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdBetween(Long fkMcServiceSoftwarePackageIdEnd){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null && fkMcServiceSoftwarePackageIdEnd!=null){
            between("fk_mc_service_software_package_id",entity().getFkMcServiceSoftwarePackageId(),fkMcServiceSoftwarePackageIdEnd);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * NOT BETWEEN  entity().getFkMcServiceSoftwarePackageId() AND 值2
     * @param fkMcServiceSoftwarePackageIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdNotBetween(Long fkMcServiceSoftwarePackageIdEnd){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null && fkMcServiceSoftwarePackageIdEnd!=null){
            notBetween("fk_mc_service_software_package_id",entity().getFkMcServiceSoftwarePackageId(),fkMcServiceSoftwarePackageIdEnd);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * BETWEEN  entity().getFkMcServiceSoftwarePackageId() AND 值2
     * @param fkMcServiceSoftwarePackageIdStart       值1
     * @param fkMcServiceSoftwarePackageIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdBetween(Long fkMcServiceSoftwarePackageIdStart,Long fkMcServiceSoftwarePackageIdEnd){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null && fkMcServiceSoftwarePackageIdEnd!=null){
            between("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageIdStart,fkMcServiceSoftwarePackageIdEnd);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * NOT BETWEEN  entity().getFkMcServiceSoftwarePackageId() AND 值2
     * @param fkMcServiceSoftwarePackageIdStart       值1
     * @param fkMcServiceSoftwarePackageIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdNotBetween(Long fkMcServiceSoftwarePackageIdStart,Long fkMcServiceSoftwarePackageIdEnd){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null && fkMcServiceSoftwarePackageIdEnd!=null){
            notBetween("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageIdStart,fkMcServiceSoftwarePackageIdEnd);
        }
        return this;
     }


    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值%' entity().getFkMcServiceSoftwarePackageId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdLike(){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null){
            like("fk_mc_service_software_package_id",entity().getFkMcServiceSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * NOT LIKE '%值%' entity().getFkMcServiceSoftwarePackageId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdNotLike(){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null){
            notLike("fk_mc_service_software_package_id",entity().getFkMcServiceSoftwarePackageId());
        }
        return this;
     }


    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值' entity().getFkMcServiceSoftwarePackageId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdLikeLeft(){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null){
            likeLeft("fk_mc_service_software_package_id",entity().getFkMcServiceSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * LIKE '值%' entity().getFkMcServiceSoftwarePackageId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdLikeRight(){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null){
            likeRight("fk_mc_service_software_package_id",entity().getFkMcServiceSoftwarePackageId());
        }
        return this;
     }

/**
     * <p>软件包类型记录id</p>
     * 等于 =
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdEq(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            eq("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 不等于 &lt;&gt;
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdNe(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            ne("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 大于 &gt;
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdGt(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            gt("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 大于等于 &gt;=
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdGe(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            ge("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 小于 &lt;
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdLt(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            lt("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 小于等于 &lt;=
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdLe(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            le("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值%'
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdLike(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            like("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * NOT LIKE '%值%'
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdNotLike(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            notLike("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
    }


    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值'
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdLikeLeft(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            likeLeft("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * LIKE '值%'
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdLikeRight(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            likeRight("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdIsNull(){
        isNull("fk_mc_service_software_package_id");
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdIsNotNull(){
        isNotNull("fk_mc_service_software_package_id");
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_service_software_package_id",value);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_service_software_package_id",values);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_service_software_package_id",value);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper fkMcServiceSoftwarePackageIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_service_software_package_id",values);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * 等于 = entity().getOssId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdEq(){
        Long ossId =entity().getOssId();
        if(ossId!=null){
            eq("oss_id",ossId);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * 不等于 &lt;&gt; entity().getOssId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdNe(){
        Long ossId =entity().getOssId();
        if(ossId!=null){
            ne("oss_id",entity().getOssId());
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * 大于 &gt; entity().getOssId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdGt(){
        Long ossId =entity().getOssId();
        if(ossId!=null){
            gt("oss_id",entity().getOssId());
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * 大于等于 &gt;= entity().getOssId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdGe(){
        Long ossId =entity().getOssId();
        if(ossId!=null){
            ge("oss_id",entity().getOssId());
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * 小于 &lt; entity().getOssId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdLt(){
        Long ossId =entity().getOssId();
        if(ossId!=null){
            lt("oss_id",entity().getOssId());
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * 小于等于 &lt;= entity().getOssId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdLe(){
        Long ossId =entity().getOssId();
        if(ossId!=null){
            le("oss_id",entity().getOssId());
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * BETWEEN  entity().getOssId() AND 值2
     * @param ossIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdBetween(Long ossIdEnd){
        Long ossId =entity().getOssId();
        if(ossId!=null && ossIdEnd!=null){
            between("oss_id",entity().getOssId(),ossIdEnd);
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * NOT BETWEEN  entity().getOssId() AND 值2
     * @param ossIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdNotBetween(Long ossIdEnd){
        Long ossId =entity().getOssId();
        if(ossId!=null && ossIdEnd!=null){
            notBetween("oss_id",entity().getOssId(),ossIdEnd);
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * BETWEEN  entity().getOssId() AND 值2
     * @param ossIdStart       值1
     * @param ossIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdBetween(Long ossIdStart,Long ossIdEnd){
        Long ossId =entity().getOssId();
        if(ossId!=null && ossIdEnd!=null){
            between("oss_id",ossIdStart,ossIdEnd);
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * NOT BETWEEN  entity().getOssId() AND 值2
     * @param ossIdStart       值1
     * @param ossIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdNotBetween(Long ossIdStart,Long ossIdEnd){
        Long ossId =entity().getOssId();
        if(ossId!=null && ossIdEnd!=null){
            notBetween("oss_id",ossIdStart,ossIdEnd);
        }
        return this;
     }


    /**
     * <p>对象存储服务记录Id</p>
     * LIKE '%值%' entity().getOssId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdLike(){
        Long ossId =entity().getOssId();
        if(ossId!=null){
            like("oss_id",entity().getOssId());
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * NOT LIKE '%值%' entity().getOssId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdNotLike(){
        Long ossId =entity().getOssId();
        if(ossId!=null){
            notLike("oss_id",entity().getOssId());
        }
        return this;
     }


    /**
     * <p>对象存储服务记录Id</p>
     * LIKE '%值' entity().getOssId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdLikeLeft(){
        Long ossId =entity().getOssId();
        if(ossId!=null){
            likeLeft("oss_id",entity().getOssId());
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * LIKE '值%' entity().getOssId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdLikeRight(){
        Long ossId =entity().getOssId();
        if(ossId!=null){
            likeRight("oss_id",entity().getOssId());
        }
        return this;
     }

/**
     * <p>对象存储服务记录Id</p>
     * 等于 =
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdEq(Long ossId){
        if(ossId!=null){
            eq("oss_id",ossId);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * 不等于 &lt;&gt;
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdNe(Long ossId){
        if(ossId!=null){
            ne("oss_id",ossId);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * 大于 &gt;
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdGt(Long ossId){
        if(ossId!=null){
            gt("oss_id",ossId);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * 大于等于 &gt;=
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdGe(Long ossId){
        if(ossId!=null){
            ge("oss_id",ossId);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * 小于 &lt;
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdLt(Long ossId){
        if(ossId!=null){
            lt("oss_id",ossId);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * 小于等于 &lt;=
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdLe(Long ossId){
        if(ossId!=null){
            le("oss_id",ossId);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * LIKE '%值%'
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdLike(Long ossId){
        if(ossId!=null){
            like("oss_id",ossId);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * NOT LIKE '%值%'
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdNotLike(Long ossId){
        if(ossId!=null){
            notLike("oss_id",ossId);
        }
        return this;
    }


    /**
     * <p>对象存储服务记录Id</p>
     * LIKE '%值'
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdLikeLeft(Long ossId){
        if(ossId!=null){
            likeLeft("oss_id",ossId);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * LIKE '值%'
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdLikeRight(Long ossId){
        if(ossId!=null){
            likeRight("oss_id",ossId);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdIsNull(){
        isNull("oss_id");
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdIsNotNull(){
        isNotNull("oss_id");
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("oss_id",value);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdIn(Long... values){
        if(values!=null && values.length>0){
            in("oss_id",values);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("oss_id",value);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("oss_id",values);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 等于 = entity().getOssType()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeEq(){
        Integer ossType =entity().getOssType();
        if(ossType!=null){
            eq("oss_type",ossType);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 不等于 &lt;&gt; entity().getOssType()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeNe(){
        Integer ossType =entity().getOssType();
        if(ossType!=null){
            ne("oss_type",entity().getOssType());
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 大于 &gt; entity().getOssType()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeGt(){
        Integer ossType =entity().getOssType();
        if(ossType!=null){
            gt("oss_type",entity().getOssType());
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 大于等于 &gt;= entity().getOssType()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeGe(){
        Integer ossType =entity().getOssType();
        if(ossType!=null){
            ge("oss_type",entity().getOssType());
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 小于 &lt; entity().getOssType()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeLt(){
        Integer ossType =entity().getOssType();
        if(ossType!=null){
            lt("oss_type",entity().getOssType());
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 小于等于 &lt;= entity().getOssType()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeLe(){
        Integer ossType =entity().getOssType();
        if(ossType!=null){
            le("oss_type",entity().getOssType());
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * BETWEEN  entity().getOssType() AND 值2
     * @param ossTypeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeBetween(Integer ossTypeEnd){
        Integer ossType =entity().getOssType();
        if(ossType!=null && ossTypeEnd!=null){
            between("oss_type",entity().getOssType(),ossTypeEnd);
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * NOT BETWEEN  entity().getOssType() AND 值2
     * @param ossTypeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeNotBetween(Integer ossTypeEnd){
        Integer ossType =entity().getOssType();
        if(ossType!=null && ossTypeEnd!=null){
            notBetween("oss_type",entity().getOssType(),ossTypeEnd);
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * BETWEEN  entity().getOssType() AND 值2
     * @param ossTypeStart       值1
     * @param ossTypeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeBetween(Integer ossTypeStart,Integer ossTypeEnd){
        Integer ossType =entity().getOssType();
        if(ossType!=null && ossTypeEnd!=null){
            between("oss_type",ossTypeStart,ossTypeEnd);
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * NOT BETWEEN  entity().getOssType() AND 值2
     * @param ossTypeStart       值1
     * @param ossTypeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeNotBetween(Integer ossTypeStart,Integer ossTypeEnd){
        Integer ossType =entity().getOssType();
        if(ossType!=null && ossTypeEnd!=null){
            notBetween("oss_type",ossTypeStart,ossTypeEnd);
        }
        return this;
     }


    /**
     * <p>对象存储服务类型（1：obs）</p>
     * LIKE '%值%' entity().getOssType()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeLike(){
        Integer ossType =entity().getOssType();
        if(ossType!=null){
            like("oss_type",entity().getOssType());
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * NOT LIKE '%值%' entity().getOssType()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeNotLike(){
        Integer ossType =entity().getOssType();
        if(ossType!=null){
            notLike("oss_type",entity().getOssType());
        }
        return this;
     }


    /**
     * <p>对象存储服务类型（1：obs）</p>
     * LIKE '%值' entity().getOssType()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeLikeLeft(){
        Integer ossType =entity().getOssType();
        if(ossType!=null){
            likeLeft("oss_type",entity().getOssType());
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * LIKE '值%' entity().getOssType()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeLikeRight(){
        Integer ossType =entity().getOssType();
        if(ossType!=null){
            likeRight("oss_type",entity().getOssType());
        }
        return this;
     }

/**
     * <p>对象存储服务类型（1：obs）</p>
     * 等于 =
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeEq(Integer ossType){
        if(ossType!=null){
            eq("oss_type",ossType);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 不等于 &lt;&gt;
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeNe(Integer ossType){
        if(ossType!=null){
            ne("oss_type",ossType);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 大于 &gt;
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeGt(Integer ossType){
        if(ossType!=null){
            gt("oss_type",ossType);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 大于等于 &gt;=
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeGe(Integer ossType){
        if(ossType!=null){
            ge("oss_type",ossType);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 小于 &lt;
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeLt(Integer ossType){
        if(ossType!=null){
            lt("oss_type",ossType);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 小于等于 &lt;=
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeLe(Integer ossType){
        if(ossType!=null){
            le("oss_type",ossType);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * LIKE '%值%'
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeLike(Integer ossType){
        if(ossType!=null){
            like("oss_type",ossType);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * NOT LIKE '%值%'
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeNotLike(Integer ossType){
        if(ossType!=null){
            notLike("oss_type",ossType);
        }
        return this;
    }


    /**
     * <p>对象存储服务类型（1：obs）</p>
     * LIKE '%值'
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeLikeLeft(Integer ossType){
        if(ossType!=null){
            likeLeft("oss_type",ossType);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * LIKE '值%'
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeLikeRight(Integer ossType){
        if(ossType!=null){
            likeRight("oss_type",ossType);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeIsNull(){
        isNull("oss_type");
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeIsNotNull(){
        isNotNull("oss_type");
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("oss_type",value);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("oss_type",values);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("oss_type",value);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper ossTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("oss_type",values);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * 等于 = entity().getBucketName()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameEq(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            eq("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * 不等于 &lt;&gt; entity().getBucketName()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameNe(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            ne("bucket_name",entity().getBucketName());
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * 大于 &gt; entity().getBucketName()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameGt(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            gt("bucket_name",entity().getBucketName());
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * 大于等于 &gt;= entity().getBucketName()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameGe(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            ge("bucket_name",entity().getBucketName());
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * 小于 &lt; entity().getBucketName()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameLt(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            lt("bucket_name",entity().getBucketName());
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * 小于等于 &lt;= entity().getBucketName()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameLe(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            le("bucket_name",entity().getBucketName());
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * BETWEEN  entity().getBucketName() AND 值2
     * @param bucketNameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameBetween(String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            between("bucket_name",entity().getBucketName(),bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * NOT BETWEEN  entity().getBucketName() AND 值2
     * @param bucketNameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameNotBetween(String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            notBetween("bucket_name",entity().getBucketName(),bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * BETWEEN  entity().getBucketName() AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameBetween(String bucketNameStart,String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            between("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * NOT BETWEEN  entity().getBucketName() AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameNotBetween(String bucketNameStart,String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }


    /**
     * <p>对象存储桶名</p>
     * LIKE '%值%' entity().getBucketName()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameLike(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            like("bucket_name",entity().getBucketName());
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * NOT LIKE '%值%' entity().getBucketName()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameNotLike(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            notLike("bucket_name",entity().getBucketName());
        }
        return this;
     }


    /**
     * <p>对象存储桶名</p>
     * LIKE '%值' entity().getBucketName()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameLikeLeft(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            likeLeft("bucket_name",entity().getBucketName());
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * LIKE '值%' entity().getBucketName()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameLikeRight(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            likeRight("bucket_name",entity().getBucketName());
        }
        return this;
     }

/**
     * <p>对象存储桶名</p>
     * 等于 =
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameEq(String bucketName){
        if(bucketName!=null){
            eq("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * 不等于 &lt;&gt;
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameNe(String bucketName){
        if(bucketName!=null){
            ne("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * 大于 &gt;
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameGt(String bucketName){
        if(bucketName!=null){
            gt("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * 大于等于 &gt;=
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameGe(String bucketName){
        if(bucketName!=null){
            ge("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * 小于 &lt;
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameLt(String bucketName){
        if(bucketName!=null){
            lt("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * 小于等于 &lt;=
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameLe(String bucketName){
        if(bucketName!=null){
            le("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * LIKE '%值%'
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameLike(String bucketName){
        if(bucketName!=null){
            like("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * NOT LIKE '%值%'
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameNotLike(String bucketName){
        if(bucketName!=null){
            notLike("bucket_name",bucketName);
        }
        return this;
    }


    /**
     * <p>对象存储桶名</p>
     * LIKE '%值'
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameLikeLeft(String bucketName){
        if(bucketName!=null){
            likeLeft("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * LIKE '值%'
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameLikeRight(String bucketName){
        if(bucketName!=null){
            likeRight("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameIsNull(){
        isNull("bucket_name");
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameIsNotNull(){
        isNotNull("bucket_name");
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("bucket_name",value);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameIn(String... values){
        if(values!=null && values.length>0){
            in("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("bucket_name",value);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper bucketNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * 等于 = entity().getObjectPath()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathEq(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            eq("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * 不等于 &lt;&gt; entity().getObjectPath()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathNe(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            ne("object_path",entity().getObjectPath());
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * 大于 &gt; entity().getObjectPath()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathGt(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            gt("object_path",entity().getObjectPath());
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * 大于等于 &gt;= entity().getObjectPath()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathGe(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            ge("object_path",entity().getObjectPath());
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * 小于 &lt; entity().getObjectPath()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathLt(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            lt("object_path",entity().getObjectPath());
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * 小于等于 &lt;= entity().getObjectPath()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathLe(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            le("object_path",entity().getObjectPath());
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * BETWEEN  entity().getObjectPath() AND 值2
     * @param objectPathEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathBetween(String objectPathEnd){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null && objectPathEnd!=null){
            between("object_path",entity().getObjectPath(),objectPathEnd);
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * NOT BETWEEN  entity().getObjectPath() AND 值2
     * @param objectPathEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathNotBetween(String objectPathEnd){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null && objectPathEnd!=null){
            notBetween("object_path",entity().getObjectPath(),objectPathEnd);
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * BETWEEN  entity().getObjectPath() AND 值2
     * @param objectPathStart       值1
     * @param objectPathEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathBetween(String objectPathStart,String objectPathEnd){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null && objectPathEnd!=null){
            between("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * NOT BETWEEN  entity().getObjectPath() AND 值2
     * @param objectPathStart       值1
     * @param objectPathEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathNotBetween(String objectPathStart,String objectPathEnd){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null && objectPathEnd!=null){
            notBetween("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }


    /**
     * <p>对象存储对象路径</p>
     * LIKE '%值%' entity().getObjectPath()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathLike(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            like("object_path",entity().getObjectPath());
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * NOT LIKE '%值%' entity().getObjectPath()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathNotLike(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            notLike("object_path",entity().getObjectPath());
        }
        return this;
     }


    /**
     * <p>对象存储对象路径</p>
     * LIKE '%值' entity().getObjectPath()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathLikeLeft(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            likeLeft("object_path",entity().getObjectPath());
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * LIKE '值%' entity().getObjectPath()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathLikeRight(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            likeRight("object_path",entity().getObjectPath());
        }
        return this;
     }

/**
     * <p>对象存储对象路径</p>
     * 等于 =
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathEq(String objectPath){
        if(objectPath!=null){
            eq("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * 不等于 &lt;&gt;
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathNe(String objectPath){
        if(objectPath!=null){
            ne("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * 大于 &gt;
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathGt(String objectPath){
        if(objectPath!=null){
            gt("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * 大于等于 &gt;=
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathGe(String objectPath){
        if(objectPath!=null){
            ge("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * 小于 &lt;
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathLt(String objectPath){
        if(objectPath!=null){
            lt("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * 小于等于 &lt;=
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathLe(String objectPath){
        if(objectPath!=null){
            le("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * LIKE '%值%'
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathLike(String objectPath){
        if(objectPath!=null){
            like("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * NOT LIKE '%值%'
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathNotLike(String objectPath){
        if(objectPath!=null){
            notLike("object_path",objectPath);
        }
        return this;
    }


    /**
     * <p>对象存储对象路径</p>
     * LIKE '%值'
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathLikeLeft(String objectPath){
        if(objectPath!=null){
            likeLeft("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * LIKE '值%'
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathLikeRight(String objectPath){
        if(objectPath!=null){
            likeRight("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathIsNull(){
        isNull("object_path");
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathIsNotNull(){
        isNotNull("object_path");
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("object_path",value);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathIn(String... values){
        if(values!=null && values.length>0){
            in("object_path",values);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("object_path",value);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper objectPathNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("object_path",values);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * LIKE '%值%' entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * NOT LIKE '%值%' entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",entity().getStatus());
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * LIKE '%值' entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * LIKE '值%' entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",entity().getStatus());
        }
        return this;
     }

/**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
    }


    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeEq(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeNe(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeGt(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeGe(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeLt(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeLe(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeLike(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeNotLike(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeLikeLeft(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeLikeRight(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeEq(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeNe(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeGt(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeGe(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeLt(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeLe(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeLike(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeIn(Date... values){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper createTimeNotIn(Date... values){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeEq(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeNe(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeGt(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeGe(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeLt(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeLe(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeLike(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeNotLike(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeLikeLeft(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeLikeRight(){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
