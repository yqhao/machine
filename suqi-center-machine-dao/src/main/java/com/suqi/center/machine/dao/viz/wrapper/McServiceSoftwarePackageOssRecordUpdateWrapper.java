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
public class McServiceSoftwarePackageOssRecordUpdateWrapper extends UpdateWrapper<McServiceSoftwarePackageOssRecord> {

    public static McServiceSoftwarePackageOssRecordUpdateWrapper wrapper() {
        return new McServiceSoftwarePackageOssRecordUpdateWrapper();
    }

    public McServiceSoftwarePackageOssRecordUpdateWrapper() {
        super();
    }

    public McServiceSoftwarePackageOssRecordUpdateWrapper(McServiceSoftwarePackageOssRecord entity) {
        super(entity);
    }

    /**
     * 记录id自动增长
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 软件包类型记录id
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper setFkMcServiceSoftwarePackageId(Long fkMcServiceSoftwarePackageId) {
         set("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        return this;
    }
    /**
     * 对象存储服务记录Id
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper setOssId(Long ossId) {
         set("oss_id",ossId);
        return this;
    }
    /**
     * 对象存储服务类型（1：obs）
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper setOssType(Integer ossType) {
         set("oss_type",ossType);
        return this;
    }
    /**
     * 对象存储桶名
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper setBucketName(String bucketName) {
         set("bucket_name",bucketName);
        return this;
    }
    /**
     * 对象存储对象路径
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper setObjectPath(String objectPath) {
         set("object_path",objectPath);
        return this;
    }
    /**
     * 状态(-50：删除，0：未上传，50：正常)
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 创建时间
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper idLikeRight(Long id){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper idIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper idIn(Long... values){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper idNotIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 等于 = fkMcServiceSoftwarePackageId
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdEq(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            eq("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 不等于 &lt;&gt; fkMcServiceSoftwarePackageId
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdNe(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            ne("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 大于 &gt; fkMcServiceSoftwarePackageId
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdGt(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            gt("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 大于等于 &gt;= fkMcServiceSoftwarePackageId
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdGe(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            ge("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 小于 &lt; fkMcServiceSoftwarePackageId
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdLt(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            lt("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 小于等于 &lt;= fkMcServiceSoftwarePackageId
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdLe(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            le("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcServiceSoftwarePackageIdStart       值1
     * @param fkMcServiceSoftwarePackageIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdBetween(Long fkMcServiceSoftwarePackageIdStart,Long fkMcServiceSoftwarePackageIdEnd){
        if(fkMcServiceSoftwarePackageIdStart!=null && fkMcServiceSoftwarePackageIdEnd!=null){
            between("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageIdStart,fkMcServiceSoftwarePackageIdEnd);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcServiceSoftwarePackageIdStart       值1
     * @param fkMcServiceSoftwarePackageIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdNotBetween(Long fkMcServiceSoftwarePackageIdStart,Long fkMcServiceSoftwarePackageIdEnd){
        if(fkMcServiceSoftwarePackageIdStart!=null && fkMcServiceSoftwarePackageIdEnd!=null){
            notBetween("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageIdStart,fkMcServiceSoftwarePackageIdEnd);
        }
        return this;
     }


    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值%' fkMcServiceSoftwarePackageId
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdLike(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            like("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * NOT LIKE '%值%' fkMcServiceSoftwarePackageId
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdNotLike(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            notLike("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
     }


    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值' fkMcServiceSoftwarePackageId
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdLikeLeft(Long fkMcServiceSoftwarePackageId){
        if(fkMcServiceSoftwarePackageId!=null){
            likeLeft("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * LIKE '值%' fkMcServiceSoftwarePackageId
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdLikeRight(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdIsNull(){
        isNull("fk_mc_service_software_package_id");
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdIsNotNull(){
        isNotNull("fk_mc_service_software_package_id");
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdIn(Long... values){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdNotIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper fkMcServiceSoftwarePackageIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_service_software_package_id",values);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * 等于 = ossId
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdEq(Long ossId){
        if(ossId!=null){
            eq("oss_id",ossId);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * 不等于 &lt;&gt; ossId
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdNe(Long ossId){
        if(ossId!=null){
            ne("oss_id",ossId);
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * 大于 &gt; ossId
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdGt(Long ossId){
        if(ossId!=null){
            gt("oss_id",ossId);
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * 大于等于 &gt;= ossId
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdGe(Long ossId){
        if(ossId!=null){
            ge("oss_id",ossId);
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * 小于 &lt; ossId
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdLt(Long ossId){
        if(ossId!=null){
            lt("oss_id",ossId);
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * 小于等于 &lt;= ossId
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdLe(Long ossId){
        if(ossId!=null){
            le("oss_id",ossId);
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * BETWEEN 值1 AND 值2
     * @param ossIdStart       值1
     * @param ossIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdBetween(Long ossIdStart,Long ossIdEnd){
        if(ossIdStart!=null && ossIdEnd!=null){
            between("oss_id",ossIdStart,ossIdEnd);
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param ossIdStart       值1
     * @param ossIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdNotBetween(Long ossIdStart,Long ossIdEnd){
        if(ossIdStart!=null && ossIdEnd!=null){
            notBetween("oss_id",ossIdStart,ossIdEnd);
        }
        return this;
     }


    /**
     * <p>对象存储服务记录Id</p>
     * LIKE '%值%' ossId
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdLike(Long ossId){
        if(ossId!=null){
            like("oss_id",ossId);
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * NOT LIKE '%值%' ossId
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdNotLike(Long ossId){
        if(ossId!=null){
            notLike("oss_id",ossId);
        }
        return this;
     }


    /**
     * <p>对象存储服务记录Id</p>
     * LIKE '%值' ossId
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdLikeLeft(Long ossId){
        if(ossId!=null){
            likeLeft("oss_id",ossId);
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * LIKE '值%' ossId
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdLikeRight(Long ossId){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdIsNull(){
        isNull("oss_id");
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdIsNotNull(){
        isNotNull("oss_id");
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdIn(Long... values){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdNotIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("oss_id",values);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 等于 = ossType
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeEq(Integer ossType){
        if(ossType!=null){
            eq("oss_type",ossType);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 不等于 &lt;&gt; ossType
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeNe(Integer ossType){
        if(ossType!=null){
            ne("oss_type",ossType);
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 大于 &gt; ossType
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeGt(Integer ossType){
        if(ossType!=null){
            gt("oss_type",ossType);
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 大于等于 &gt;= ossType
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeGe(Integer ossType){
        if(ossType!=null){
            ge("oss_type",ossType);
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 小于 &lt; ossType
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeLt(Integer ossType){
        if(ossType!=null){
            lt("oss_type",ossType);
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 小于等于 &lt;= ossType
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeLe(Integer ossType){
        if(ossType!=null){
            le("oss_type",ossType);
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * BETWEEN 值1 AND 值2
     * @param ossTypeStart       值1
     * @param ossTypeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeBetween(Integer ossTypeStart,Integer ossTypeEnd){
        if(ossTypeStart!=null && ossTypeEnd!=null){
            between("oss_type",ossTypeStart,ossTypeEnd);
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param ossTypeStart       值1
     * @param ossTypeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeNotBetween(Integer ossTypeStart,Integer ossTypeEnd){
        if(ossTypeStart!=null && ossTypeEnd!=null){
            notBetween("oss_type",ossTypeStart,ossTypeEnd);
        }
        return this;
     }


    /**
     * <p>对象存储服务类型（1：obs）</p>
     * LIKE '%值%' ossType
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeLike(Integer ossType){
        if(ossType!=null){
            like("oss_type",ossType);
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * NOT LIKE '%值%' ossType
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeNotLike(Integer ossType){
        if(ossType!=null){
            notLike("oss_type",ossType);
        }
        return this;
     }


    /**
     * <p>对象存储服务类型（1：obs）</p>
     * LIKE '%值' ossType
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeLikeLeft(Integer ossType){
        if(ossType!=null){
            likeLeft("oss_type",ossType);
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * LIKE '值%' ossType
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeLikeRight(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeIsNull(){
        isNull("oss_type");
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeIsNotNull(){
        isNotNull("oss_type");
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeIn(Integer... values){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeNotIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper ossTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("oss_type",values);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * 等于 = bucketName
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameEq(String bucketName){
        if(bucketName!=null){
            eq("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * 不等于 &lt;&gt; bucketName
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameNe(String bucketName){
        if(bucketName!=null){
            ne("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * 大于 &gt; bucketName
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameGt(String bucketName){
        if(bucketName!=null){
            gt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * 大于等于 &gt;= bucketName
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameGe(String bucketName){
        if(bucketName!=null){
            ge("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * 小于 &lt; bucketName
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameLt(String bucketName){
        if(bucketName!=null){
            lt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * 小于等于 &lt;= bucketName
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameLe(String bucketName){
        if(bucketName!=null){
            le("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * BETWEEN 值1 AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameBetween(String bucketNameStart,String bucketNameEnd){
        if(bucketNameStart!=null && bucketNameEnd!=null){
            between("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * NOT BETWEEN 值1 AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameNotBetween(String bucketNameStart,String bucketNameEnd){
        if(bucketNameStart!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }


    /**
     * <p>对象存储桶名</p>
     * LIKE '%值%' bucketName
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameLike(String bucketName){
        if(bucketName!=null){
            like("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * NOT LIKE '%值%' bucketName
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameNotLike(String bucketName){
        if(bucketName!=null){
            notLike("bucket_name",bucketName);
        }
        return this;
     }


    /**
     * <p>对象存储桶名</p>
     * LIKE '%值' bucketName
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameLikeLeft(String bucketName){
        if(bucketName!=null){
            likeLeft("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * LIKE '值%' bucketName
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameLikeRight(String bucketName){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameIsNull(){
        isNull("bucket_name");
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameIsNotNull(){
        isNotNull("bucket_name");
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameIn(Collection<String> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameIn(String... values){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameNotIn(Collection<String> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper bucketNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * 等于 = objectPath
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathEq(String objectPath){
        if(objectPath!=null){
            eq("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * 不等于 &lt;&gt; objectPath
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathNe(String objectPath){
        if(objectPath!=null){
            ne("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * 大于 &gt; objectPath
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathGt(String objectPath){
        if(objectPath!=null){
            gt("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * 大于等于 &gt;= objectPath
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathGe(String objectPath){
        if(objectPath!=null){
            ge("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * 小于 &lt; objectPath
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathLt(String objectPath){
        if(objectPath!=null){
            lt("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * 小于等于 &lt;= objectPath
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathLe(String objectPath){
        if(objectPath!=null){
            le("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * BETWEEN 值1 AND 值2
     * @param objectPathStart       值1
     * @param objectPathEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathBetween(String objectPathStart,String objectPathEnd){
        if(objectPathStart!=null && objectPathEnd!=null){
            between("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * NOT BETWEEN 值1 AND 值2
     * @param objectPathStart       值1
     * @param objectPathEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathNotBetween(String objectPathStart,String objectPathEnd){
        if(objectPathStart!=null && objectPathEnd!=null){
            notBetween("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }


    /**
     * <p>对象存储对象路径</p>
     * LIKE '%值%' objectPath
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathLike(String objectPath){
        if(objectPath!=null){
            like("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * NOT LIKE '%值%' objectPath
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathNotLike(String objectPath){
        if(objectPath!=null){
            notLike("object_path",objectPath);
        }
        return this;
     }


    /**
     * <p>对象存储对象路径</p>
     * LIKE '%值' objectPath
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathLikeLeft(String objectPath){
        if(objectPath!=null){
            likeLeft("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * LIKE '值%' objectPath
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathLikeRight(String objectPath){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathIsNull(){
        isNull("object_path");
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathIsNotNull(){
        isNotNull("object_path");
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathIn(Collection<String> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathIn(String... values){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathNotIn(Collection<String> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper objectPathNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("object_path",values);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusLikeRight(Integer status){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusIn(Integer... values){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusNotIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeEq(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeNe(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeGt(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeGe(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeLt(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeLe(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeLike(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeNotLike(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeLikeRight(Date createTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeIn(Date... values){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper createTimeNotIn(Date... values){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
