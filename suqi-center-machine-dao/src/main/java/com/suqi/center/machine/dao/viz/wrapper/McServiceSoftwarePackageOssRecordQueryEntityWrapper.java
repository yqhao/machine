package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackageOssRecord;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 云机端软件包对象存储记录表
 * </p>
 * "mc_service_software_package_oss_record"
 * @author 18374
 */
public class McServiceSoftwarePackageOssRecordQueryEntityWrapper extends QueryWrapper<McServiceSoftwarePackageOssRecord> {

    public static McServiceSoftwarePackageOssRecordQueryEntityWrapper wrapper(McServiceSoftwarePackageOssRecord entity) {
        return new McServiceSoftwarePackageOssRecordQueryEntityWrapper(entity);
    }

    private McServiceSoftwarePackageOssRecord entity;

    public McServiceSoftwarePackageOssRecordQueryEntityWrapper(McServiceSoftwarePackageOssRecord entity) {
         this.entity=entity;
    }


    protected McServiceSoftwarePackageOssRecord entity() {
        if(entity==null){
            throw new NullPointerException("McServiceSoftwarePackageOssRecord is null");
        }
        return entity;
    }

    @Override
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper selectColumns(Consumer<McServiceSoftwarePackageOssRecordSelect> consumer) {
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
     * 等于 = entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idEq(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idNe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idGt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idGe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idLt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idBetween(Long idEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idNotBetween(Long idEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%'  entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",entity().getId());
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idLikeRight(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idEq(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idNe(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idGt(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idGe(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idLt(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idLe(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idLike(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idNotLike(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idLikeLeft(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idLikeRight(Long id){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idIn(Long... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper idNotIn(Long... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdEq(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdNe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdGt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdGe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdLt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdLe(){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null){
            le("fk_mc_service_software_package_id",entity().getFkMcServiceSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * BETWEEN  entity().getFkMcServiceSoftwarePackageId() AND fkMcServiceSoftwarePackageIdEnd
     * @param fkMcServiceSoftwarePackageIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdBetween(Long fkMcServiceSoftwarePackageIdEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdNotBetween(Long fkMcServiceSoftwarePackageIdEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdBetween(Long fkMcServiceSoftwarePackageIdStart,Long fkMcServiceSoftwarePackageIdEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdNotBetween(Long fkMcServiceSoftwarePackageIdStart,Long fkMcServiceSoftwarePackageIdEnd){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null && fkMcServiceSoftwarePackageIdEnd!=null){
            notBetween("fk_mc_service_software_package_id",fkMcServiceSoftwarePackageIdStart,fkMcServiceSoftwarePackageIdEnd);
        }
        return this;
     }


    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值%'  entity().getFkMcServiceSoftwarePackageId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdLike(){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null){
            like("fk_mc_service_software_package_id",entity().getFkMcServiceSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * NOT LIKE '%值%'  entity().getFkMcServiceSoftwarePackageId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdNotLike(){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null){
            notLike("fk_mc_service_software_package_id",entity().getFkMcServiceSoftwarePackageId());
        }
        return this;
     }


    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值'  entity().getFkMcServiceSoftwarePackageId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdLikeLeft(){
        Long fkMcServiceSoftwarePackageId =entity().getFkMcServiceSoftwarePackageId();
        if(fkMcServiceSoftwarePackageId!=null){
            likeLeft("fk_mc_service_software_package_id",entity().getFkMcServiceSoftwarePackageId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * LIKE '值%'  entity().getFkMcServiceSoftwarePackageId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdLikeRight(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdEq(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdNe(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdGt(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdGe(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdLt(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdLe(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdLike(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdNotLike(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdLikeLeft(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdLikeRight(Long fkMcServiceSoftwarePackageId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdIsNull(){
        isNull("fk_mc_service_software_package_id");
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdIsNotNull(){
        isNotNull("fk_mc_service_software_package_id");
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdIn(Long... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdNotIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper fkMcServiceSoftwarePackageIdNotIn(Long... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdEq(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdNe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdGt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdGe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdLt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdLe(){
        Long ossId =entity().getOssId();
        if(ossId!=null){
            le("oss_id",entity().getOssId());
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * BETWEEN  entity().getOssId() AND ossIdEnd
     * @param ossIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdBetween(Long ossIdEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdNotBetween(Long ossIdEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdBetween(Long ossIdStart,Long ossIdEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdNotBetween(Long ossIdStart,Long ossIdEnd){
        Long ossId =entity().getOssId();
        if(ossId!=null && ossIdEnd!=null){
            notBetween("oss_id",ossIdStart,ossIdEnd);
        }
        return this;
     }


    /**
     * <p>对象存储服务记录Id</p>
     * LIKE '%值%'  entity().getOssId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdLike(){
        Long ossId =entity().getOssId();
        if(ossId!=null){
            like("oss_id",entity().getOssId());
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * NOT LIKE '%值%'  entity().getOssId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdNotLike(){
        Long ossId =entity().getOssId();
        if(ossId!=null){
            notLike("oss_id",entity().getOssId());
        }
        return this;
     }


    /**
     * <p>对象存储服务记录Id</p>
     * LIKE '%值'  entity().getOssId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdLikeLeft(){
        Long ossId =entity().getOssId();
        if(ossId!=null){
            likeLeft("oss_id",entity().getOssId());
        }
        return this;
     }

    /**
     * <p>对象存储服务记录Id</p>
     * LIKE '值%'  entity().getOssId()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdLikeRight(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdEq(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdNe(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdGt(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdGe(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdLt(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdLe(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdLike(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdNotLike(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdLikeLeft(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdLikeRight(Long ossId){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdIsNull(){
        isNull("oss_id");
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdIsNotNull(){
        isNotNull("oss_id");
        return this;
    }

    /**
     * <p>对象存储服务记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdIn(Long... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdNotIn(Collection<Long> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossIdNotIn(Long... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeEq(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeNe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeGt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeGe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeLt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeLe(){
        Integer ossType =entity().getOssType();
        if(ossType!=null){
            le("oss_type",entity().getOssType());
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * BETWEEN  entity().getOssType() AND ossTypeEnd
     * @param ossTypeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeBetween(Integer ossTypeEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeNotBetween(Integer ossTypeEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeBetween(Integer ossTypeStart,Integer ossTypeEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeNotBetween(Integer ossTypeStart,Integer ossTypeEnd){
        Integer ossType =entity().getOssType();
        if(ossType!=null && ossTypeEnd!=null){
            notBetween("oss_type",ossTypeStart,ossTypeEnd);
        }
        return this;
     }


    /**
     * <p>对象存储服务类型（1：obs）</p>
     * LIKE '%值%'  entity().getOssType()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeLike(){
        Integer ossType =entity().getOssType();
        if(ossType!=null){
            like("oss_type",entity().getOssType());
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * NOT LIKE '%值%'  entity().getOssType()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeNotLike(){
        Integer ossType =entity().getOssType();
        if(ossType!=null){
            notLike("oss_type",entity().getOssType());
        }
        return this;
     }


    /**
     * <p>对象存储服务类型（1：obs）</p>
     * LIKE '%值'  entity().getOssType()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeLikeLeft(){
        Integer ossType =entity().getOssType();
        if(ossType!=null){
            likeLeft("oss_type",entity().getOssType());
        }
        return this;
     }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * LIKE '值%'  entity().getOssType()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeLikeRight(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeEq(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeNe(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeGt(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeGe(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeLt(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeLe(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeLike(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeNotLike(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeLikeLeft(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeLikeRight(Integer ossType){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeIsNull(){
        isNull("oss_type");
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeIsNotNull(){
        isNotNull("oss_type");
        return this;
    }

    /**
     * <p>对象存储服务类型（1：obs）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeIn(Integer... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeNotIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper ossTypeNotIn(Integer... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameEq(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameNe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameGt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameGe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameLt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameLe(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            le("bucket_name",entity().getBucketName());
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * BETWEEN  entity().getBucketName() AND bucketNameEnd
     * @param bucketNameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameBetween(String bucketNameEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameNotBetween(String bucketNameEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameBetween(String bucketNameStart,String bucketNameEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameNotBetween(String bucketNameStart,String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }


    /**
     * <p>对象存储桶名</p>
     * LIKE '%值%'  entity().getBucketName()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameLike(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            like("bucket_name",entity().getBucketName());
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * NOT LIKE '%值%'  entity().getBucketName()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameNotLike(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            notLike("bucket_name",entity().getBucketName());
        }
        return this;
     }


    /**
     * <p>对象存储桶名</p>
     * LIKE '%值'  entity().getBucketName()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameLikeLeft(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            likeLeft("bucket_name",entity().getBucketName());
        }
        return this;
     }

    /**
     * <p>对象存储桶名</p>
     * LIKE '值%'  entity().getBucketName()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameLikeRight(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameEq(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameNe(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameGt(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameGe(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameLt(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameLe(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameLike(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameNotLike(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameLikeLeft(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameLikeRight(String bucketName){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameIsNull(){
        isNull("bucket_name");
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameIsNotNull(){
        isNotNull("bucket_name");
        return this;
    }

    /**
     * <p>对象存储桶名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameIn(Collection<String> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameIn(String... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameNotIn(Collection<String> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper bucketNameNotIn(String... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathEq(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathNe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathGt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathGe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathLt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathLe(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            le("object_path",entity().getObjectPath());
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * BETWEEN  entity().getObjectPath() AND objectPathEnd
     * @param objectPathEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathBetween(String objectPathEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathNotBetween(String objectPathEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathBetween(String objectPathStart,String objectPathEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathNotBetween(String objectPathStart,String objectPathEnd){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null && objectPathEnd!=null){
            notBetween("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }


    /**
     * <p>对象存储对象路径</p>
     * LIKE '%值%'  entity().getObjectPath()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathLike(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            like("object_path",entity().getObjectPath());
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * NOT LIKE '%值%'  entity().getObjectPath()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathNotLike(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            notLike("object_path",entity().getObjectPath());
        }
        return this;
     }


    /**
     * <p>对象存储对象路径</p>
     * LIKE '%值'  entity().getObjectPath()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathLikeLeft(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            likeLeft("object_path",entity().getObjectPath());
        }
        return this;
     }

    /**
     * <p>对象存储对象路径</p>
     * LIKE '值%'  entity().getObjectPath()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathLikeRight(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathEq(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathNe(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathGt(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathGe(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathLt(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathLe(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathLike(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathNotLike(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathLikeLeft(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathLikeRight(String objectPath){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathIsNull(){
        isNull("object_path");
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathIsNotNull(){
        isNotNull("object_path");
        return this;
    }

    /**
     * <p>对象存储对象路径</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathIn(Collection<String> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathIn(String... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathNotIn(Collection<String> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper objectPathNotIn(String... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusEq(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusNe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusGt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusGe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusLt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusBetween(Integer statusEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusNotBetween(Integer statusEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",entity().getStatus());
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusLikeRight(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusEq(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusNe(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusGt(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusGe(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusLt(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusLe(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusLike(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusNotLike(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusLikeLeft(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusLikeRight(Integer status){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，0：未上传，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusIn(Integer... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusNotIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper statusNotIn(Integer... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeEq(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeNe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeGt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeGe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeLt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",entity().getCreateTime());
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeLikeRight(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeEq(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeNe(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeGt(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeGe(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeLt(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeLe(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeLike(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeIn(Date... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper createTimeNotIn(Date... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeEq(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeNe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeGt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeGe(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeLt(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeLikeRight(){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageOssRecordQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }



}
