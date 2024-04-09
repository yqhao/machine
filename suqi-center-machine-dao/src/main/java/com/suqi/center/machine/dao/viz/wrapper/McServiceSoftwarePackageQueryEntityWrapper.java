package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 云机端软件包表
 * </p>
 * "mc_service_software_package"
 * @author 18374
 */
public class McServiceSoftwarePackageQueryEntityWrapper extends QueryWrapper<McServiceSoftwarePackage> {

    public static McServiceSoftwarePackageQueryEntityWrapper wrapper(McServiceSoftwarePackage entity) {
        return new McServiceSoftwarePackageQueryEntityWrapper(entity);
    }

    private McServiceSoftwarePackage entity;

    public McServiceSoftwarePackageQueryEntityWrapper(McServiceSoftwarePackage entity) {
         this.entity=entity;
    }


    protected McServiceSoftwarePackage entity() {
        if(entity==null){
            throw new NullPointerException("McServiceSoftwarePackage is null");
        }
        return entity;
    }

    @Override
    public McServiceSoftwarePackageQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public McServiceSoftwarePackageQueryEntityWrapper selectColumns(Consumer<McServiceSoftwarePackageSelect> consumer) {
        McServiceSoftwarePackageSelect select = new McServiceSoftwarePackageSelect();
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
    public McServiceSoftwarePackageQueryEntityWrapper idEq(){
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
    public McServiceSoftwarePackageQueryEntityWrapper idNe(){
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
    public McServiceSoftwarePackageQueryEntityWrapper idGt(){
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
    public McServiceSoftwarePackageQueryEntityWrapper idGe(){
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
    public McServiceSoftwarePackageQueryEntityWrapper idLt(){
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
    public McServiceSoftwarePackageQueryEntityWrapper idLe(){
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
    public McServiceSoftwarePackageQueryEntityWrapper idBetween(Long idEnd){
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
    public McServiceSoftwarePackageQueryEntityWrapper idNotBetween(Long idEnd){
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
    public McServiceSoftwarePackageQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public McServiceSoftwarePackageQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public McServiceSoftwarePackageQueryEntityWrapper idLike(){
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
    public McServiceSoftwarePackageQueryEntityWrapper idNotLike(){
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
    public McServiceSoftwarePackageQueryEntityWrapper idLikeLeft(){
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
    public McServiceSoftwarePackageQueryEntityWrapper idLikeRight(){
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
    public McServiceSoftwarePackageQueryEntityWrapper idEq(Long id){
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
    public McServiceSoftwarePackageQueryEntityWrapper idNe(Long id){
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
    public McServiceSoftwarePackageQueryEntityWrapper idGt(Long id){
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
    public McServiceSoftwarePackageQueryEntityWrapper idGe(Long id){
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
    public McServiceSoftwarePackageQueryEntityWrapper idLt(Long id){
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
    public McServiceSoftwarePackageQueryEntityWrapper idLe(Long id){
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
    public McServiceSoftwarePackageQueryEntityWrapper idLike(Long id){
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
    public McServiceSoftwarePackageQueryEntityWrapper idNotLike(Long id){
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
    public McServiceSoftwarePackageQueryEntityWrapper idLikeLeft(Long id){
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
    public McServiceSoftwarePackageQueryEntityWrapper idLikeRight(Long id){
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
    public McServiceSoftwarePackageQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper idIn(Collection<Long> value){
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
    public McServiceSoftwarePackageQueryEntityWrapper idIn(Long... values){
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
    public McServiceSoftwarePackageQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public McServiceSoftwarePackageQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>软件包类型记录id</p>
     * 等于 = entity().getFkMcServiceSoftwarePackageTypeId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdEq(){
        Long fkMcServiceSoftwarePackageTypeId =entity().getFkMcServiceSoftwarePackageTypeId();
        if(fkMcServiceSoftwarePackageTypeId!=null){
            eq("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 不等于 &lt;&gt; entity().getFkMcServiceSoftwarePackageTypeId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdNe(){
        Long fkMcServiceSoftwarePackageTypeId =entity().getFkMcServiceSoftwarePackageTypeId();
        if(fkMcServiceSoftwarePackageTypeId!=null){
            ne("fk_mc_service_software_package_type_id",entity().getFkMcServiceSoftwarePackageTypeId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 大于 &gt; entity().getFkMcServiceSoftwarePackageTypeId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdGt(){
        Long fkMcServiceSoftwarePackageTypeId =entity().getFkMcServiceSoftwarePackageTypeId();
        if(fkMcServiceSoftwarePackageTypeId!=null){
            gt("fk_mc_service_software_package_type_id",entity().getFkMcServiceSoftwarePackageTypeId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 大于等于 &gt;= entity().getFkMcServiceSoftwarePackageTypeId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdGe(){
        Long fkMcServiceSoftwarePackageTypeId =entity().getFkMcServiceSoftwarePackageTypeId();
        if(fkMcServiceSoftwarePackageTypeId!=null){
            ge("fk_mc_service_software_package_type_id",entity().getFkMcServiceSoftwarePackageTypeId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 小于 &lt; entity().getFkMcServiceSoftwarePackageTypeId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdLt(){
        Long fkMcServiceSoftwarePackageTypeId =entity().getFkMcServiceSoftwarePackageTypeId();
        if(fkMcServiceSoftwarePackageTypeId!=null){
            lt("fk_mc_service_software_package_type_id",entity().getFkMcServiceSoftwarePackageTypeId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 小于等于 &lt;= entity().getFkMcServiceSoftwarePackageTypeId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdLe(){
        Long fkMcServiceSoftwarePackageTypeId =entity().getFkMcServiceSoftwarePackageTypeId();
        if(fkMcServiceSoftwarePackageTypeId!=null){
            le("fk_mc_service_software_package_type_id",entity().getFkMcServiceSoftwarePackageTypeId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * BETWEEN  entity().getFkMcServiceSoftwarePackageTypeId() AND fkMcServiceSoftwarePackageTypeIdEnd
     * @param fkMcServiceSoftwarePackageTypeIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdBetween(Long fkMcServiceSoftwarePackageTypeIdEnd){
        Long fkMcServiceSoftwarePackageTypeId =entity().getFkMcServiceSoftwarePackageTypeId();
        if(fkMcServiceSoftwarePackageTypeId!=null && fkMcServiceSoftwarePackageTypeIdEnd!=null){
            between("fk_mc_service_software_package_type_id",entity().getFkMcServiceSoftwarePackageTypeId(),fkMcServiceSoftwarePackageTypeIdEnd);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * NOT BETWEEN  entity().getFkMcServiceSoftwarePackageTypeId() AND 值2
     * @param fkMcServiceSoftwarePackageTypeIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdNotBetween(Long fkMcServiceSoftwarePackageTypeIdEnd){
        Long fkMcServiceSoftwarePackageTypeId =entity().getFkMcServiceSoftwarePackageTypeId();
        if(fkMcServiceSoftwarePackageTypeId!=null && fkMcServiceSoftwarePackageTypeIdEnd!=null){
            notBetween("fk_mc_service_software_package_type_id",entity().getFkMcServiceSoftwarePackageTypeId(),fkMcServiceSoftwarePackageTypeIdEnd);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * BETWEEN  entity().getFkMcServiceSoftwarePackageTypeId() AND 值2
     * @param fkMcServiceSoftwarePackageTypeIdStart       值1
     * @param fkMcServiceSoftwarePackageTypeIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdBetween(Long fkMcServiceSoftwarePackageTypeIdStart,Long fkMcServiceSoftwarePackageTypeIdEnd){
        Long fkMcServiceSoftwarePackageTypeId =entity().getFkMcServiceSoftwarePackageTypeId();
        if(fkMcServiceSoftwarePackageTypeId!=null && fkMcServiceSoftwarePackageTypeIdEnd!=null){
            between("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeIdStart,fkMcServiceSoftwarePackageTypeIdEnd);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * NOT BETWEEN  entity().getFkMcServiceSoftwarePackageTypeId() AND 值2
     * @param fkMcServiceSoftwarePackageTypeIdStart       值1
     * @param fkMcServiceSoftwarePackageTypeIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdNotBetween(Long fkMcServiceSoftwarePackageTypeIdStart,Long fkMcServiceSoftwarePackageTypeIdEnd){
        Long fkMcServiceSoftwarePackageTypeId =entity().getFkMcServiceSoftwarePackageTypeId();
        if(fkMcServiceSoftwarePackageTypeId!=null && fkMcServiceSoftwarePackageTypeIdEnd!=null){
            notBetween("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeIdStart,fkMcServiceSoftwarePackageTypeIdEnd);
        }
        return this;
     }


    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值%'  entity().getFkMcServiceSoftwarePackageTypeId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdLike(){
        Long fkMcServiceSoftwarePackageTypeId =entity().getFkMcServiceSoftwarePackageTypeId();
        if(fkMcServiceSoftwarePackageTypeId!=null){
            like("fk_mc_service_software_package_type_id",entity().getFkMcServiceSoftwarePackageTypeId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * NOT LIKE '%值%'  entity().getFkMcServiceSoftwarePackageTypeId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdNotLike(){
        Long fkMcServiceSoftwarePackageTypeId =entity().getFkMcServiceSoftwarePackageTypeId();
        if(fkMcServiceSoftwarePackageTypeId!=null){
            notLike("fk_mc_service_software_package_type_id",entity().getFkMcServiceSoftwarePackageTypeId());
        }
        return this;
     }


    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值'  entity().getFkMcServiceSoftwarePackageTypeId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdLikeLeft(){
        Long fkMcServiceSoftwarePackageTypeId =entity().getFkMcServiceSoftwarePackageTypeId();
        if(fkMcServiceSoftwarePackageTypeId!=null){
            likeLeft("fk_mc_service_software_package_type_id",entity().getFkMcServiceSoftwarePackageTypeId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * LIKE '值%'  entity().getFkMcServiceSoftwarePackageTypeId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdLikeRight(){
        Long fkMcServiceSoftwarePackageTypeId =entity().getFkMcServiceSoftwarePackageTypeId();
        if(fkMcServiceSoftwarePackageTypeId!=null){
            likeRight("fk_mc_service_software_package_type_id",entity().getFkMcServiceSoftwarePackageTypeId());
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 等于 =
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdEq(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            eq("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 不等于 &lt;&gt;
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdNe(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            ne("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 大于 &gt;
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdGt(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            gt("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 大于等于 &gt;=
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdGe(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            ge("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 小于 &lt;
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdLt(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            lt("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 小于等于 &lt;=
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdLe(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            le("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值%'
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdLike(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            like("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * NOT LIKE '%值%'
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdNotLike(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            notLike("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }


    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值'
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdLikeLeft(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            likeLeft("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * LIKE '值%'
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdLikeRight(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            likeRight("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdIsNull(){
        isNull("fk_mc_service_software_package_type_id");
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdIsNotNull(){
        isNotNull("fk_mc_service_software_package_type_id");
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_service_software_package_type_id",value);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_service_software_package_type_id",values);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_service_software_package_type_id",value);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper fkMcServiceSoftwarePackageTypeIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_service_software_package_type_id",values);
        }
        return this;
    }


    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 等于 = entity().getSupplierType()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeEq(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            eq("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 不等于 &lt;&gt; entity().getSupplierType()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeNe(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            ne("supplier_type",entity().getSupplierType());
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 大于 &gt; entity().getSupplierType()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeGt(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            gt("supplier_type",entity().getSupplierType());
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 大于等于 &gt;= entity().getSupplierType()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeGe(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            ge("supplier_type",entity().getSupplierType());
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 小于 &lt; entity().getSupplierType()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeLt(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            lt("supplier_type",entity().getSupplierType());
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 小于等于 &lt;= entity().getSupplierType()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeLe(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            le("supplier_type",entity().getSupplierType());
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * BETWEEN  entity().getSupplierType() AND supplierTypeEnd
     * @param supplierTypeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeBetween(Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            between("supplier_type",entity().getSupplierType(),supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * NOT BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeNotBetween(Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",entity().getSupplierType(),supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            between("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * NOT BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeNotBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }


    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * LIKE '%值%'  entity().getSupplierType()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeLike(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            like("supplier_type",entity().getSupplierType());
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * NOT LIKE '%值%'  entity().getSupplierType()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeNotLike(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            notLike("supplier_type",entity().getSupplierType());
        }
        return this;
     }


    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * LIKE '%值'  entity().getSupplierType()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeLikeLeft(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            likeLeft("supplier_type",entity().getSupplierType());
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * LIKE '值%'  entity().getSupplierType()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeLikeRight(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            likeRight("supplier_type",entity().getSupplierType());
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 等于 =
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeEq(Integer supplierType){
        if(supplierType!=null){
            eq("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 不等于 &lt;&gt;
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeNe(Integer supplierType){
        if(supplierType!=null){
            ne("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 大于 &gt;
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeGt(Integer supplierType){
        if(supplierType!=null){
            gt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 大于等于 &gt;=
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeGe(Integer supplierType){
        if(supplierType!=null){
            ge("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 小于 &lt;
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeLt(Integer supplierType){
        if(supplierType!=null){
            lt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 小于等于 &lt;=
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeLe(Integer supplierType){
        if(supplierType!=null){
            le("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * LIKE '%值%'
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeLike(Integer supplierType){
        if(supplierType!=null){
            like("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * NOT LIKE '%值%'
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeNotLike(Integer supplierType){
        if(supplierType!=null){
            notLike("supplier_type",supplierType);
        }
        return this;
     }


    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * LIKE '%值'
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeLikeLeft(Integer supplierType){
        if(supplierType!=null){
            likeLeft("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * LIKE '值%'
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeLikeRight(Integer supplierType){
        if(supplierType!=null){
            likeRight("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeIsNull(){
        isNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeIsNotNull(){
        isNotNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("supplier_type",value);
        }
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("supplier_type",values);
        }
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("supplier_type",value);
        }
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper supplierTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("supplier_type",values);
        }
        return this;
    }


    /**
     * <p>软件包名称</p>
     * 等于 = entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameEq(){
        String name =entity().getName();
        if(name!=null){
            eq("name",name);
        }
        return this;
    }

    /**
     * <p>软件包名称</p>
     * 不等于 &lt;&gt; entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameNe(){
        String name =entity().getName();
        if(name!=null){
            ne("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 大于 &gt; entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameGt(){
        String name =entity().getName();
        if(name!=null){
            gt("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 大于等于 &gt;= entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameGe(){
        String name =entity().getName();
        if(name!=null){
            ge("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 小于 &lt; entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameLt(){
        String name =entity().getName();
        if(name!=null){
            lt("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 小于等于 &lt;= entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameLe(){
        String name =entity().getName();
        if(name!=null){
            le("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * BETWEEN  entity().getName() AND nameEnd
     * @param nameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameBetween(String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            between("name",entity().getName(),nameEnd);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * NOT BETWEEN  entity().getName() AND 值2
     * @param nameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameNotBetween(String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            notBetween("name",entity().getName(),nameEnd);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * BETWEEN  entity().getName() AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameBetween(String nameStart,String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            between("name",nameStart,nameEnd);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * NOT BETWEEN  entity().getName() AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameNotBetween(String nameStart,String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            notBetween("name",nameStart,nameEnd);
        }
        return this;
     }


    /**
     * <p>软件包名称</p>
     * LIKE '%值%'  entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameLike(){
        String name =entity().getName();
        if(name!=null){
            like("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * NOT LIKE '%值%'  entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameNotLike(){
        String name =entity().getName();
        if(name!=null){
            notLike("name",entity().getName());
        }
        return this;
     }


    /**
     * <p>软件包名称</p>
     * LIKE '%值'  entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameLikeLeft(){
        String name =entity().getName();
        if(name!=null){
            likeLeft("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * LIKE '值%'  entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameLikeRight(){
        String name =entity().getName();
        if(name!=null){
            likeRight("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 等于 =
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameEq(String name){
        if(name!=null){
            eq("name",name);
        }
        return this;
    }

    /**
     * <p>软件包名称</p>
     * 不等于 &lt;&gt;
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameNe(String name){
        if(name!=null){
            ne("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 大于 &gt;
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameGt(String name){
        if(name!=null){
            gt("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 大于等于 &gt;=
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameGe(String name){
        if(name!=null){
            ge("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 小于 &lt;
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameLt(String name){
        if(name!=null){
            lt("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 小于等于 &lt;=
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameLe(String name){
        if(name!=null){
            le("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * LIKE '%值%'
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameLike(String name){
        if(name!=null){
            like("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * NOT LIKE '%值%'
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameNotLike(String name){
        if(name!=null){
            notLike("name",name);
        }
        return this;
     }


    /**
     * <p>软件包名称</p>
     * LIKE '%值'
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameLikeLeft(String name){
        if(name!=null){
            likeLeft("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * LIKE '值%'
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameLikeRight(String name){
        if(name!=null){
            likeRight("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameIsNull(){
        isNull("name");
        return this;
    }

    /**
     * <p>软件包名称</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameIsNotNull(){
        isNotNull("name");
        return this;
    }

    /**
     * <p>软件包名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("name",value);
        }
        return this;
    }

    /**
     * <p>软件包名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameIn(String... values){
        if(values!=null && values.length>0){
            in("name",values);
        }
        return this;
    }

    /**
     * <p>软件包名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("name",value);
        }
        return this;
    }

    /**
     * <p>软件包名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper nameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("name",values);
        }
        return this;
    }


    /**
     * <p>镜像id</p>
     * 等于 = entity().getImageId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdEq(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            eq("image_id",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 不等于 &lt;&gt; entity().getImageId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdNe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            ne("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于 &gt; entity().getImageId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdGt(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            gt("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于等于 &gt;= entity().getImageId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdGe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            ge("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于 &lt; entity().getImageId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdLt(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            lt("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于等于 &lt;= entity().getImageId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdLe(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            le("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * BETWEEN  entity().getImageId() AND imageIdEnd
     * @param imageIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdBetween(String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            between("image_id",entity().getImageId(),imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT BETWEEN  entity().getImageId() AND 值2
     * @param imageIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdNotBetween(String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            notBetween("image_id",entity().getImageId(),imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * BETWEEN  entity().getImageId() AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            between("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT BETWEEN  entity().getImageId() AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        String imageId =entity().getImageId();
        if(imageId!=null && imageIdEnd!=null){
            notBetween("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值%'  entity().getImageId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdLike(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            like("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT LIKE '%值%'  entity().getImageId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdNotLike(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            notLike("image_id",entity().getImageId());
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值'  entity().getImageId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdLikeLeft(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            likeLeft("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * LIKE '值%'  entity().getImageId()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdLikeRight(){
        String imageId =entity().getImageId();
        if(imageId!=null){
            likeRight("image_id",entity().getImageId());
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 等于 =
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdEq(String imageId){
        if(imageId!=null){
            eq("image_id",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 不等于 &lt;&gt;
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdNe(String imageId){
        if(imageId!=null){
            ne("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于 &gt;
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdGt(String imageId){
        if(imageId!=null){
            gt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于等于 &gt;=
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdGe(String imageId){
        if(imageId!=null){
            ge("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于 &lt;
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdLt(String imageId){
        if(imageId!=null){
            lt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于等于 &lt;=
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdLe(String imageId){
        if(imageId!=null){
            le("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdLike(String imageId){
        if(imageId!=null){
            like("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdNotLike(String imageId){
        if(imageId!=null){
            notLike("image_id",imageId);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值'
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdLikeLeft(String imageId){
        if(imageId!=null){
            likeLeft("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * LIKE '值%'
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdLikeRight(String imageId){
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
    public McServiceSoftwarePackageQueryEntityWrapper imageIdIsNull(){
        isNull("image_id");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdIsNotNull(){
        isNotNull("image_id");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper imageIdIn(Collection<String> value){
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
    public McServiceSoftwarePackageQueryEntityWrapper imageIdIn(String... values){
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
    public McServiceSoftwarePackageQueryEntityWrapper imageIdNotIn(Collection<String> value){
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
    public McServiceSoftwarePackageQueryEntityWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_id",values);
        }
        return this;
    }


    /**
     * <p>版本名称</p>
     * 等于 = entity().getVersion()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionEq(){
        String version =entity().getVersion();
        if(version!=null){
            eq("version",version);
        }
        return this;
    }

    /**
     * <p>版本名称</p>
     * 不等于 &lt;&gt; entity().getVersion()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionNe(){
        String version =entity().getVersion();
        if(version!=null){
            ne("version",entity().getVersion());
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 大于 &gt; entity().getVersion()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionGt(){
        String version =entity().getVersion();
        if(version!=null){
            gt("version",entity().getVersion());
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 大于等于 &gt;= entity().getVersion()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionGe(){
        String version =entity().getVersion();
        if(version!=null){
            ge("version",entity().getVersion());
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 小于 &lt; entity().getVersion()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionLt(){
        String version =entity().getVersion();
        if(version!=null){
            lt("version",entity().getVersion());
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 小于等于 &lt;= entity().getVersion()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionLe(){
        String version =entity().getVersion();
        if(version!=null){
            le("version",entity().getVersion());
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * BETWEEN  entity().getVersion() AND versionEnd
     * @param versionEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionBetween(String versionEnd){
        String version =entity().getVersion();
        if(version!=null && versionEnd!=null){
            between("version",entity().getVersion(),versionEnd);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * NOT BETWEEN  entity().getVersion() AND 值2
     * @param versionEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionNotBetween(String versionEnd){
        String version =entity().getVersion();
        if(version!=null && versionEnd!=null){
            notBetween("version",entity().getVersion(),versionEnd);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * BETWEEN  entity().getVersion() AND 值2
     * @param versionStart       值1
     * @param versionEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionBetween(String versionStart,String versionEnd){
        String version =entity().getVersion();
        if(version!=null && versionEnd!=null){
            between("version",versionStart,versionEnd);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * NOT BETWEEN  entity().getVersion() AND 值2
     * @param versionStart       值1
     * @param versionEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionNotBetween(String versionStart,String versionEnd){
        String version =entity().getVersion();
        if(version!=null && versionEnd!=null){
            notBetween("version",versionStart,versionEnd);
        }
        return this;
     }


    /**
     * <p>版本名称</p>
     * LIKE '%值%'  entity().getVersion()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionLike(){
        String version =entity().getVersion();
        if(version!=null){
            like("version",entity().getVersion());
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * NOT LIKE '%值%'  entity().getVersion()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionNotLike(){
        String version =entity().getVersion();
        if(version!=null){
            notLike("version",entity().getVersion());
        }
        return this;
     }


    /**
     * <p>版本名称</p>
     * LIKE '%值'  entity().getVersion()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionLikeLeft(){
        String version =entity().getVersion();
        if(version!=null){
            likeLeft("version",entity().getVersion());
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * LIKE '值%'  entity().getVersion()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionLikeRight(){
        String version =entity().getVersion();
        if(version!=null){
            likeRight("version",entity().getVersion());
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 等于 =
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionEq(String version){
        if(version!=null){
            eq("version",version);
        }
        return this;
    }

    /**
     * <p>版本名称</p>
     * 不等于 &lt;&gt;
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionNe(String version){
        if(version!=null){
            ne("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 大于 &gt;
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionGt(String version){
        if(version!=null){
            gt("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 大于等于 &gt;=
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionGe(String version){
        if(version!=null){
            ge("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 小于 &lt;
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionLt(String version){
        if(version!=null){
            lt("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 小于等于 &lt;=
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionLe(String version){
        if(version!=null){
            le("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * LIKE '%值%'
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionLike(String version){
        if(version!=null){
            like("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * NOT LIKE '%值%'
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionNotLike(String version){
        if(version!=null){
            notLike("version",version);
        }
        return this;
     }


    /**
     * <p>版本名称</p>
     * LIKE '%值'
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionLikeLeft(String version){
        if(version!=null){
            likeLeft("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * LIKE '值%'
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionLikeRight(String version){
        if(version!=null){
            likeRight("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionIsNull(){
        isNull("version");
        return this;
    }

    /**
     * <p>版本名称</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionIsNotNull(){
        isNotNull("version");
        return this;
    }

    /**
     * <p>版本名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("version",value);
        }
        return this;
    }

    /**
     * <p>版本名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionIn(String... values){
        if(values!=null && values.length>0){
            in("version",values);
        }
        return this;
    }

    /**
     * <p>版本名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("version",value);
        }
        return this;
    }

    /**
     * <p>版本名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper versionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("version",values);
        }
        return this;
    }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",entity().getStatus());
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper statusNotIn(Integer... values){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeEq(){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeNe(){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeGt(){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeGe(){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeLt(){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeLe(){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeLike(){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeNotLike(){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeLikeLeft(){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeLikeRight(){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeEq(Date createTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeNe(Date createTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeGt(Date createTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeGe(Date createTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeLt(Date createTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeLe(Date createTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeLike(Date createTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeIn(Date... values){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageQueryEntityWrapper createTimeNotIn(Date... values){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeEq(){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeNe(){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeGt(){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeGe(){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeLt(){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeLe(){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeLike(){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeNotLike(){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeLikeLeft(){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeLikeRight(){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }



}
