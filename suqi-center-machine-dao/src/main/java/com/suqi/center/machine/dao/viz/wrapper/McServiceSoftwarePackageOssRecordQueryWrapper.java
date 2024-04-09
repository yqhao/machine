package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackageOssRecord;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 云机端软件包对象存储记录表
 * </p>
 * "mc_service_software_package_oss_record"
 * @author 18374
 */
public class McServiceSoftwarePackageOssRecordQueryWrapper extends QueryWrapper<McServiceSoftwarePackageOssRecord> {


    public static McServiceSoftwarePackageOssRecordQueryWrapper wrapper() {
        return new McServiceSoftwarePackageOssRecordQueryWrapper();
    }

    public McServiceSoftwarePackageOssRecordQueryWrapper() {
        super();
    }

    public McServiceSoftwarePackageOssRecordQueryWrapper(McServiceSoftwarePackageOssRecord entity) {
        super(entity);
    }

    public McServiceSoftwarePackageOssRecordQueryWrapper(McServiceSoftwarePackageOssRecord entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public McServiceSoftwarePackageOssRecordQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public McServiceSoftwarePackageOssRecordQueryWrapper selectColumns(Consumer<McServiceSoftwarePackageOssRecordSelect> consumer) {
        McServiceSoftwarePackageOssRecordSelect select = new McServiceSoftwarePackageOssRecordSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }


    /**
     * <p>记录id自动增长</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper idEq(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper idNe(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper idGt(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper idGe(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper idLt(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper idLe(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper idLike(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper idNotLike(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper idLikeLeft(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper idLikeRight(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper idIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper idIn(Long... values){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper idNotIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 等于 =
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdEq(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdNe(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdGt(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdGe(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdLt(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdLe(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdBetween(Long fkMcServiceSoftwarePackageIdStart,Long fkMcServiceSoftwarePackageIdEnd){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdNotBetween(Long fkMcServiceSoftwarePackageIdStart,Long fkMcServiceSoftwarePackageIdEnd){
        if(fkMcServiceSoftwarePackageIdStart!=null && fkMcServiceSoftwarePackageIdEnd!=null){
            notBetween("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageIdStart,fkMcServiceSoftwarePackageIdEnd);
        }
        return this;
     }


    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值%'
     * @param fkMcServiceSoftwarePackageId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdLike(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdNotLike(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdLikeLeft(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdLikeRight(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdIsNull(){
        isNull("fk_mc_service_software_package_id");
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdIsNotNull(){
        isNotNull("fk_mc_service_software_package_id");
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdIn(Long... values){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdNotIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper fkMcServiceSoftwarePackageIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_service_software_package_id",values);
        }
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * 等于 =
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdEq(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdNe(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdGt(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdGe(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdLt(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdLe(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdBetween(Long ossIdStart,Long ossIdEnd){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdNotBetween(Long ossIdStart,Long ossIdEnd){
        if(ossIdStart!=null && ossIdEnd!=null){
            notBetween("oss_id",ossIdStart,ossIdEnd);
        }
        return this;
     }


    /**
     * <p>对象存储服务记录Id</p>
     * LIKE '%值%'
     * @param ossId       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdLike(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdNotLike(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdLikeLeft(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdLikeRight(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdIsNull(){
        isNull("oss_id");
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdIsNotNull(){
        isNotNull("oss_id");
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdIn(Long... values){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdNotIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("oss_id",values);
        }
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * 等于 =
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeEq(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeNe(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeGt(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeGe(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeLt(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeLe(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeBetween(Integer ossTypeStart,Integer ossTypeEnd){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeNotBetween(Integer ossTypeStart,Integer ossTypeEnd){
        if(ossTypeStart!=null && ossTypeEnd!=null){
            notBetween("oss_type",ossTypeStart,ossTypeEnd);
        }
        return this;
     }


    /**
     * <p>对象存储服务类型（1：obs）</p>
     * LIKE '%值%'
     * @param ossType       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeLike(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeNotLike(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeLikeLeft(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeLikeRight(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeIsNull(){
        isNull("oss_type");
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeIsNotNull(){
        isNotNull("oss_type");
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeIn(Integer... values){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeNotIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper ossTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("oss_type",values);
        }
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * 等于 =
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameEq(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameNe(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameGt(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameGe(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameLt(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameLe(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameBetween(String bucketNameStart,String bucketNameEnd){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameNotBetween(String bucketNameStart,String bucketNameEnd){
        if(bucketNameStart!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }


    /**
     * <p>对象存储桶名</p>
     * LIKE '%值%'
     * @param bucketName       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameLike(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameNotLike(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameLikeLeft(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameLikeRight(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameIsNull(){
        isNull("bucket_name");
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameIsNotNull(){
        isNotNull("bucket_name");
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameIn(Collection<String> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameIn(String... values){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameNotIn(Collection<String> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper bucketNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * 等于 =
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathEq(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathNe(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathGt(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathGe(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathLt(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathLe(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathBetween(String objectPathStart,String objectPathEnd){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathNotBetween(String objectPathStart,String objectPathEnd){
        if(objectPathStart!=null && objectPathEnd!=null){
            notBetween("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }


    /**
     * <p>对象存储对象路径</p>
     * LIKE '%值%'
     * @param objectPath       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathLike(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathNotLike(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathLikeLeft(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathLikeRight(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathIsNull(){
        isNull("object_path");
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathIsNotNull(){
        isNotNull("object_path");
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathIn(Collection<String> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathIn(String... values){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathNotIn(Collection<String> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper objectPathNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("object_path",values);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper statusEq(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper statusNe(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper statusGt(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper statusGe(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper statusLt(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper statusLe(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper statusLike(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper statusNotLike(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper statusLikeLeft(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper statusLikeRight(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper statusIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper statusIn(Integer... values){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper statusNotIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeEq(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeNe(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeGt(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeGe(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeLt(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeLe(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeLike(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeNotLike(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeLikeLeft(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeLikeRight(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeIn(Date... values){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeIn(Date... values){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
