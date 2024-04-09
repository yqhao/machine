package com.suqi.center.machine.dao.viz.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.viz.entity.VizMcMachine;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 机器基础信息表
 * </p>
 * "viz_mc_machine"
 * @author 18374
 */
public class VizMcMachineQueryEntityWrapper extends QueryWrapper<VizMcMachine> {

    public static VizMcMachineQueryEntityWrapper wrapper(VizMcMachine entity) {
        return new VizMcMachineQueryEntityWrapper(entity);
    }

    private VizMcMachine entity;

    public VizMcMachineQueryEntityWrapper(VizMcMachine entity) {
         this.entity=entity;
    }


    protected VizMcMachine entity() {
        if(entity==null){
            throw new NullPointerException("VizMcMachine is null");
        }
        return entity;
    }

    @Override
    public VizMcMachineQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public VizMcMachineQueryEntityWrapper selectColumns(Consumer<VizMcMachineSelect> consumer) {
        VizMcMachineSelect select = new VizMcMachineSelect();
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
    public VizMcMachineQueryEntityWrapper idEq(){
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
    public VizMcMachineQueryEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
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
    public VizMcMachineQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public VizMcMachineQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public VizMcMachineQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper idEq(Long id){
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
    public VizMcMachineQueryEntityWrapper idNe(Long id){
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
    public VizMcMachineQueryEntityWrapper idGt(Long id){
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
    public VizMcMachineQueryEntityWrapper idGe(Long id){
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
    public VizMcMachineQueryEntityWrapper idLt(Long id){
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
    public VizMcMachineQueryEntityWrapper idLe(Long id){
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
    public VizMcMachineQueryEntityWrapper idLike(Long id){
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
    public VizMcMachineQueryEntityWrapper idNotLike(Long id){
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
    public VizMcMachineQueryEntityWrapper idLikeLeft(Long id){
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
    public VizMcMachineQueryEntityWrapper idLikeRight(Long id){
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
    public VizMcMachineQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper idIn(Collection<Long> value){
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
    public VizMcMachineQueryEntityWrapper idIn(Long... values){
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
    public VizMcMachineQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public VizMcMachineQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>机房记录id</p>
     * 等于 = entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdEq(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            eq("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * 不等于 &lt;&gt; entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdNe(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            ne("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 大于 &gt; entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdGt(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            gt("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 大于等于 &gt;= entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdGe(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            ge("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 小于 &lt; entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdLt(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            lt("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 小于等于 &lt;= entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdLe(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            le("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * BETWEEN  entity().getFkExtCloudRegionId() AND fkExtCloudRegionIdEnd
     * @param fkExtCloudRegionIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdBetween(Long fkExtCloudRegionIdEnd){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null && fkExtCloudRegionIdEnd!=null){
            between("fk_ext_cloud_region_id",fkExtCloudRegionId,fkExtCloudRegionIdEnd);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * NOT BETWEEN  entity().getFkExtCloudRegionId() AND 值2
     * @param fkExtCloudRegionIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdNotBetween(Long fkExtCloudRegionIdEnd){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null && fkExtCloudRegionIdEnd!=null){
            notBetween("fk_ext_cloud_region_id",fkExtCloudRegionId,fkExtCloudRegionIdEnd);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * BETWEEN  entity().getFkExtCloudRegionId() AND 值2
     * @param fkExtCloudRegionIdStart       值1
     * @param fkExtCloudRegionIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdBetween(Long fkExtCloudRegionIdStart,Long fkExtCloudRegionIdEnd){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null && fkExtCloudRegionIdEnd!=null){
            between("fk_ext_cloud_region_id",fkExtCloudRegionIdStart,fkExtCloudRegionIdEnd);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * NOT BETWEEN  entity().getFkExtCloudRegionId() AND 值2
     * @param fkExtCloudRegionIdStart       值1
     * @param fkExtCloudRegionIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdNotBetween(Long fkExtCloudRegionIdStart,Long fkExtCloudRegionIdEnd){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null && fkExtCloudRegionIdEnd!=null){
            notBetween("fk_ext_cloud_region_id",fkExtCloudRegionIdStart,fkExtCloudRegionIdEnd);
        }
        return this;
     }


    /**
     * <p>机房记录id</p>
     * LIKE '%值%'  entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdLike(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            like("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * NOT LIKE '%值%'  entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdNotLike(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            notLike("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }


    /**
     * <p>机房记录id</p>
     * LIKE '%值'  entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdLikeLeft(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            likeLeft("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * LIKE '值%'  entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdLikeRight(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            likeRight("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 等于 =
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdEq(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            eq("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * 不等于 &lt;&gt;
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdNe(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            ne("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 大于 &gt;
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdGt(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            gt("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 大于等于 &gt;=
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdGe(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            ge("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 小于 &lt;
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdLt(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            lt("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 小于等于 &lt;=
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdLe(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            le("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * LIKE '%值%'
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdLike(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            like("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * NOT LIKE '%值%'
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdNotLike(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            notLike("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }


    /**
     * <p>机房记录id</p>
     * LIKE '%值'
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdLikeLeft(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            likeLeft("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * LIKE '值%'
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdLikeRight(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            likeRight("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdIsNull(){
        isNull("fk_ext_cloud_region_id");
        return this;
    }

    /**
     * <p>机房记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdIsNotNull(){
        isNotNull("fk_ext_cloud_region_id");
        return this;
    }

    /**
     * <p>机房记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_ext_cloud_region_id",value);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_ext_cloud_region_id",values);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_ext_cloud_region_id",value);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper fkExtCloudRegionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_ext_cloud_region_id",values);
        }
        return this;
    }


    /**
     * <p>机房名称【区域名称】</p>
     * 等于 = entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameEq(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            eq("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * 不等于 &lt;&gt; entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameNe(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            ne("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 大于 &gt; entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameGt(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            gt("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 大于等于 &gt;= entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameGe(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            ge("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 小于 &lt; entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameLt(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            lt("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 小于等于 &lt;= entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameLe(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            le("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * BETWEEN  entity().getExtCloudRegionName() AND extCloudRegionNameEnd
     * @param extCloudRegionNameEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameBetween(String extCloudRegionNameEnd){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null && extCloudRegionNameEnd!=null){
            between("ext_cloud_region_name",extCloudRegionName,extCloudRegionNameEnd);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT BETWEEN  entity().getExtCloudRegionName() AND 值2
     * @param extCloudRegionNameEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameNotBetween(String extCloudRegionNameEnd){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null && extCloudRegionNameEnd!=null){
            notBetween("ext_cloud_region_name",extCloudRegionName,extCloudRegionNameEnd);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * BETWEEN  entity().getExtCloudRegionName() AND 值2
     * @param extCloudRegionNameStart       值1
     * @param extCloudRegionNameEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameBetween(String extCloudRegionNameStart,String extCloudRegionNameEnd){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null && extCloudRegionNameEnd!=null){
            between("ext_cloud_region_name",extCloudRegionNameStart,extCloudRegionNameEnd);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT BETWEEN  entity().getExtCloudRegionName() AND 值2
     * @param extCloudRegionNameStart       值1
     * @param extCloudRegionNameEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameNotBetween(String extCloudRegionNameStart,String extCloudRegionNameEnd){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null && extCloudRegionNameEnd!=null){
            notBetween("ext_cloud_region_name",extCloudRegionNameStart,extCloudRegionNameEnd);
        }
        return this;
     }


    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '%值%'  entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameLike(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            like("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT LIKE '%值%'  entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameNotLike(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            notLike("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }


    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '%值'  entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameLikeLeft(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            likeLeft("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '值%'  entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameLikeRight(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            likeRight("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 等于 =
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameEq(String extCloudRegionName){
        if(extCloudRegionName!=null){
            eq("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * 不等于 &lt;&gt;
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameNe(String extCloudRegionName){
        if(extCloudRegionName!=null){
            ne("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 大于 &gt;
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameGt(String extCloudRegionName){
        if(extCloudRegionName!=null){
            gt("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 大于等于 &gt;=
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameGe(String extCloudRegionName){
        if(extCloudRegionName!=null){
            ge("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 小于 &lt;
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameLt(String extCloudRegionName){
        if(extCloudRegionName!=null){
            lt("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 小于等于 &lt;=
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameLe(String extCloudRegionName){
        if(extCloudRegionName!=null){
            le("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '%值%'
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameLike(String extCloudRegionName){
        if(extCloudRegionName!=null){
            like("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT LIKE '%值%'
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameNotLike(String extCloudRegionName){
        if(extCloudRegionName!=null){
            notLike("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }


    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '%值'
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameLikeLeft(String extCloudRegionName){
        if(extCloudRegionName!=null){
            likeLeft("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '值%'
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameLikeRight(String extCloudRegionName){
        if(extCloudRegionName!=null){
            likeRight("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameIsNull(){
        isNull("ext_cloud_region_name");
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameIsNotNull(){
        isNotNull("ext_cloud_region_name");
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("ext_cloud_region_name",value);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameIn(String... values){
        if(values!=null && values.length>0){
            in("ext_cloud_region_name",values);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("ext_cloud_region_name",value);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper extCloudRegionNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("ext_cloud_region_name",values);
        }
        return this;
    }


    /**
     * <p>内网ip地址</p>
     * 等于 = entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrEq(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            eq("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 不等于 &lt;&gt; entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrNe(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            ne("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 大于 &gt; entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrGt(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            gt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 大于等于 &gt;= entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrGe(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            ge("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 小于 &lt; entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrLt(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            lt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 小于等于 &lt;= entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrLe(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            le("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * BETWEEN  entity().getExternalAddr() AND externalAddrEnd
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrBetween(String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            between("external_addr",externalAddr,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrNotBetween(String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            notBetween("external_addr",externalAddr,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrBetween(String externalAddrStart,String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            between("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrNotBetween(String externalAddrStart,String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            notBetween("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }


    /**
     * <p>内网ip地址</p>
     * LIKE '%值%'  entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrLike(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            like("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT LIKE '%值%'  entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrNotLike(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            notLike("external_addr",externalAddr);
        }
        return this;
     }


    /**
     * <p>内网ip地址</p>
     * LIKE '%值'  entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrLikeLeft(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            likeLeft("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * LIKE '值%'  entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrLikeRight(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            likeRight("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 等于 =
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrEq(String externalAddr){
        if(externalAddr!=null){
            eq("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 不等于 &lt;&gt;
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrNe(String externalAddr){
        if(externalAddr!=null){
            ne("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 大于 &gt;
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrGt(String externalAddr){
        if(externalAddr!=null){
            gt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 大于等于 &gt;=
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrGe(String externalAddr){
        if(externalAddr!=null){
            ge("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 小于 &lt;
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrLt(String externalAddr){
        if(externalAddr!=null){
            lt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 小于等于 &lt;=
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrLe(String externalAddr){
        if(externalAddr!=null){
            le("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * LIKE '%值%'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrLike(String externalAddr){
        if(externalAddr!=null){
            like("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT LIKE '%值%'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrNotLike(String externalAddr){
        if(externalAddr!=null){
            notLike("external_addr",externalAddr);
        }
        return this;
     }


    /**
     * <p>内网ip地址</p>
     * LIKE '%值'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrLikeLeft(String externalAddr){
        if(externalAddr!=null){
            likeLeft("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * LIKE '值%'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrLikeRight(String externalAddr){
        if(externalAddr!=null){
            likeRight("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrIsNull(){
        isNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrIsNotNull(){
        isNotNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("external_addr",value);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrIn(String... values){
        if(values!=null && values.length>0){
            in("external_addr",values);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("external_addr",value);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper externalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("external_addr",values);
        }
        return this;
    }


    /**
     * <p>外网ip地址</p>
     * 等于 = entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrEq(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            eq("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 不等于 &lt;&gt; entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrNe(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            ne("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 大于 &gt; entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrGt(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            gt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 大于等于 &gt;= entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrGe(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            ge("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 小于 &lt; entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrLt(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            lt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 小于等于 &lt;= entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrLe(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            le("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * BETWEEN  entity().getInternalAddr() AND internalAddrEnd
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrBetween(String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            between("internal_addr",internalAddr,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrNotBetween(String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            notBetween("internal_addr",internalAddr,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrBetween(String internalAddrStart,String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            between("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrNotBetween(String internalAddrStart,String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            notBetween("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }


    /**
     * <p>外网ip地址</p>
     * LIKE '%值%'  entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrLike(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            like("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT LIKE '%值%'  entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrNotLike(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            notLike("internal_addr",internalAddr);
        }
        return this;
     }


    /**
     * <p>外网ip地址</p>
     * LIKE '%值'  entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrLikeLeft(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            likeLeft("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * LIKE '值%'  entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrLikeRight(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            likeRight("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 等于 =
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrEq(String internalAddr){
        if(internalAddr!=null){
            eq("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 不等于 &lt;&gt;
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrNe(String internalAddr){
        if(internalAddr!=null){
            ne("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 大于 &gt;
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrGt(String internalAddr){
        if(internalAddr!=null){
            gt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 大于等于 &gt;=
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrGe(String internalAddr){
        if(internalAddr!=null){
            ge("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 小于 &lt;
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrLt(String internalAddr){
        if(internalAddr!=null){
            lt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 小于等于 &lt;=
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrLe(String internalAddr){
        if(internalAddr!=null){
            le("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * LIKE '%值%'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrLike(String internalAddr){
        if(internalAddr!=null){
            like("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT LIKE '%值%'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrNotLike(String internalAddr){
        if(internalAddr!=null){
            notLike("internal_addr",internalAddr);
        }
        return this;
     }


    /**
     * <p>外网ip地址</p>
     * LIKE '%值'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrLikeLeft(String internalAddr){
        if(internalAddr!=null){
            likeLeft("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * LIKE '值%'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrLikeRight(String internalAddr){
        if(internalAddr!=null){
            likeRight("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrIsNull(){
        isNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrIsNotNull(){
        isNotNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("internal_addr",value);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrIn(String... values){
        if(values!=null && values.length>0){
            in("internal_addr",values);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("internal_addr",value);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper internalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("internal_addr",values);
        }
        return this;
    }


    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdEq(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 不等于 &lt;&gt; entity().getDeviceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdNe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于 &gt; entity().getDeviceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdGt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于等于 &gt;= entity().getDeviceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdGe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于 &lt; entity().getDeviceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdLt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于等于 &lt;= entity().getDeviceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN  entity().getDeviceId() AND deviceIdEnd
     * @param deviceIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceId,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdNotBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceId,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值%'  entity().getDeviceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%'  entity().getDeviceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值'  entity().getDeviceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%'  entity().getDeviceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdLikeRight(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 不等于 &lt;&gt;
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于 &gt;
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于等于 &gt;=
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于 &lt;
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于等于 &lt;=
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值'
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%'
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdLikeRight(String deviceId){
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_id",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("device_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_id",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }


    /**
     * <p>实例Id</p>
     * 等于 = entity().getInstanceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdEq(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 不等于 &lt;&gt; entity().getInstanceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdNe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于 &gt; entity().getInstanceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdGt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于等于 &gt;= entity().getInstanceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdGe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于 &lt; entity().getInstanceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdLt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于等于 &lt;= entity().getInstanceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdLe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * BETWEEN  entity().getInstanceId() AND instanceIdEnd
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",instanceId,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdNotBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceId,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值%'  entity().getInstanceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT LIKE '%值%'  entity().getInstanceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdNotLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值'  entity().getInstanceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdLikeLeft(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * LIKE '值%'  entity().getInstanceId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdLikeRight(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 不等于 &lt;&gt;
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于 &gt;
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于等于 &gt;=
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于 &lt;
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于等于 &lt;=
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * LIKE '值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdLikeRight(String instanceId){
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("instance_id",values);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }


    /**
     * <p>设备唯一码macAddr</p>
     * 等于 = entity().getMacAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrEq(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            eq("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * 不等于 &lt;&gt; entity().getMacAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrNe(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            ne("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 大于 &gt; entity().getMacAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrGt(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            gt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 大于等于 &gt;= entity().getMacAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrGe(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            ge("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 小于 &lt; entity().getMacAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrLt(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            lt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 小于等于 &lt;= entity().getMacAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrLe(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            le("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * BETWEEN  entity().getMacAddr() AND macAddrEnd
     * @param macAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrBetween(String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            between("mac_addr",macAddr,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT BETWEEN  entity().getMacAddr() AND 值2
     * @param macAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrNotBetween(String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            notBetween("mac_addr",macAddr,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * BETWEEN  entity().getMacAddr() AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrBetween(String macAddrStart,String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            between("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT BETWEEN  entity().getMacAddr() AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrNotBetween(String macAddrStart,String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            notBetween("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '%值%'  entity().getMacAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrLike(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            like("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT LIKE '%值%'  entity().getMacAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrNotLike(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            notLike("mac_addr",macAddr);
        }
        return this;
     }


    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '%值'  entity().getMacAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrLikeLeft(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            likeLeft("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '值%'  entity().getMacAddr()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrLikeRight(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            likeRight("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 等于 =
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrEq(String macAddr){
        if(macAddr!=null){
            eq("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * 不等于 &lt;&gt;
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrNe(String macAddr){
        if(macAddr!=null){
            ne("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 大于 &gt;
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrGt(String macAddr){
        if(macAddr!=null){
            gt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 大于等于 &gt;=
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrGe(String macAddr){
        if(macAddr!=null){
            ge("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 小于 &lt;
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrLt(String macAddr){
        if(macAddr!=null){
            lt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 小于等于 &lt;=
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrLe(String macAddr){
        if(macAddr!=null){
            le("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '%值%'
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrLike(String macAddr){
        if(macAddr!=null){
            like("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT LIKE '%值%'
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrNotLike(String macAddr){
        if(macAddr!=null){
            notLike("mac_addr",macAddr);
        }
        return this;
     }


    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '%值'
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrLikeLeft(String macAddr){
        if(macAddr!=null){
            likeLeft("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '值%'
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrLikeRight(String macAddr){
        if(macAddr!=null){
            likeRight("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrIsNull(){
        isNull("mac_addr");
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrIsNotNull(){
        isNotNull("mac_addr");
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("mac_addr",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrIn(String... values){
        if(values!=null && values.length>0){
            in("mac_addr",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("mac_addr",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper macAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("mac_addr",values);
        }
        return this;
    }


    /**
     * <p>云机端软件包版本</p>
     * 等于 = entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionEq(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            eq("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * 不等于 &lt;&gt; entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionNe(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            ne("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 大于 &gt; entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionGt(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            gt("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 大于等于 &gt;= entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionGe(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            ge("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 小于 &lt; entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionLt(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            lt("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 小于等于 &lt;= entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionLe(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            le("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * BETWEEN  entity().getServiceSoftwarePackageVersion() AND serviceSoftwarePackageVersionEnd
     * @param serviceSoftwarePackageVersionEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionBetween(String serviceSoftwarePackageVersionEnd){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null && serviceSoftwarePackageVersionEnd!=null){
            between("service_software_package_version",serviceSoftwarePackageVersion,serviceSoftwarePackageVersionEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * NOT BETWEEN  entity().getServiceSoftwarePackageVersion() AND 值2
     * @param serviceSoftwarePackageVersionEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionNotBetween(String serviceSoftwarePackageVersionEnd){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null && serviceSoftwarePackageVersionEnd!=null){
            notBetween("service_software_package_version",serviceSoftwarePackageVersion,serviceSoftwarePackageVersionEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * BETWEEN  entity().getServiceSoftwarePackageVersion() AND 值2
     * @param serviceSoftwarePackageVersionStart       值1
     * @param serviceSoftwarePackageVersionEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionBetween(String serviceSoftwarePackageVersionStart,String serviceSoftwarePackageVersionEnd){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null && serviceSoftwarePackageVersionEnd!=null){
            between("service_software_package_version",serviceSoftwarePackageVersionStart,serviceSoftwarePackageVersionEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * NOT BETWEEN  entity().getServiceSoftwarePackageVersion() AND 值2
     * @param serviceSoftwarePackageVersionStart       值1
     * @param serviceSoftwarePackageVersionEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionNotBetween(String serviceSoftwarePackageVersionStart,String serviceSoftwarePackageVersionEnd){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null && serviceSoftwarePackageVersionEnd!=null){
            notBetween("service_software_package_version",serviceSoftwarePackageVersionStart,serviceSoftwarePackageVersionEnd);
        }
        return this;
     }


    /**
     * <p>云机端软件包版本</p>
     * LIKE '%值%'  entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionLike(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            like("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * NOT LIKE '%值%'  entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionNotLike(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            notLike("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }


    /**
     * <p>云机端软件包版本</p>
     * LIKE '%值'  entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionLikeLeft(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            likeLeft("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * LIKE '值%'  entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionLikeRight(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            likeRight("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 等于 =
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionEq(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            eq("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * 不等于 &lt;&gt;
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionNe(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            ne("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 大于 &gt;
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionGt(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            gt("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 大于等于 &gt;=
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionGe(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            ge("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 小于 &lt;
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionLt(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            lt("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 小于等于 &lt;=
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionLe(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            le("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * LIKE '%值%'
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionLike(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            like("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * NOT LIKE '%值%'
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionNotLike(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            notLike("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }


    /**
     * <p>云机端软件包版本</p>
     * LIKE '%值'
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionLikeLeft(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            likeLeft("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * LIKE '值%'
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionLikeRight(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            likeRight("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionIsNull(){
        isNull("service_software_package_version");
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionIsNotNull(){
        isNotNull("service_software_package_version");
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("service_software_package_version",value);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionIn(String... values){
        if(values!=null && values.length>0){
            in("service_software_package_version",values);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("service_software_package_version",value);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper serviceSoftwarePackageVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("service_software_package_version",values);
        }
        return this;
    }


    /**
     * <p>设备型号</p>
     * 等于 = entity().getChipModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelEq(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            eq("chip_model",chipModel);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * 不等于 &lt;&gt; entity().getChipModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelNe(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            ne("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 大于 &gt; entity().getChipModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelGt(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            gt("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 大于等于 &gt;= entity().getChipModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelGe(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            ge("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 小于 &lt; entity().getChipModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelLt(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            lt("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 小于等于 &lt;= entity().getChipModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelLe(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            le("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * BETWEEN  entity().getChipModel() AND chipModelEnd
     * @param chipModelEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelBetween(String chipModelEnd){
        String chipModel =entity().getChipModel();
        if(chipModel!=null && chipModelEnd!=null){
            between("chip_model",chipModel,chipModelEnd);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * NOT BETWEEN  entity().getChipModel() AND 值2
     * @param chipModelEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelNotBetween(String chipModelEnd){
        String chipModel =entity().getChipModel();
        if(chipModel!=null && chipModelEnd!=null){
            notBetween("chip_model",chipModel,chipModelEnd);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * BETWEEN  entity().getChipModel() AND 值2
     * @param chipModelStart       值1
     * @param chipModelEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelBetween(String chipModelStart,String chipModelEnd){
        String chipModel =entity().getChipModel();
        if(chipModel!=null && chipModelEnd!=null){
            between("chip_model",chipModelStart,chipModelEnd);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * NOT BETWEEN  entity().getChipModel() AND 值2
     * @param chipModelStart       值1
     * @param chipModelEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelNotBetween(String chipModelStart,String chipModelEnd){
        String chipModel =entity().getChipModel();
        if(chipModel!=null && chipModelEnd!=null){
            notBetween("chip_model",chipModelStart,chipModelEnd);
        }
        return this;
     }


    /**
     * <p>设备型号</p>
     * LIKE '%值%'  entity().getChipModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelLike(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            like("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * NOT LIKE '%值%'  entity().getChipModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelNotLike(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            notLike("chip_model",chipModel);
        }
        return this;
     }


    /**
     * <p>设备型号</p>
     * LIKE '%值'  entity().getChipModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelLikeLeft(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            likeLeft("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * LIKE '值%'  entity().getChipModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelLikeRight(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            likeRight("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 等于 =
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelEq(String chipModel){
        if(chipModel!=null){
            eq("chip_model",chipModel);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * 不等于 &lt;&gt;
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelNe(String chipModel){
        if(chipModel!=null){
            ne("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 大于 &gt;
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelGt(String chipModel){
        if(chipModel!=null){
            gt("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 大于等于 &gt;=
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelGe(String chipModel){
        if(chipModel!=null){
            ge("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 小于 &lt;
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelLt(String chipModel){
        if(chipModel!=null){
            lt("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 小于等于 &lt;=
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelLe(String chipModel){
        if(chipModel!=null){
            le("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * LIKE '%值%'
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelLike(String chipModel){
        if(chipModel!=null){
            like("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * NOT LIKE '%值%'
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelNotLike(String chipModel){
        if(chipModel!=null){
            notLike("chip_model",chipModel);
        }
        return this;
     }


    /**
     * <p>设备型号</p>
     * LIKE '%值'
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelLikeLeft(String chipModel){
        if(chipModel!=null){
            likeLeft("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * LIKE '值%'
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelLikeRight(String chipModel){
        if(chipModel!=null){
            likeRight("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelIsNull(){
        isNull("chip_model");
        return this;
    }

    /**
     * <p>设备型号</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelIsNotNull(){
        isNotNull("chip_model");
        return this;
    }

    /**
     * <p>设备型号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("chip_model",value);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelIn(String... values){
        if(values!=null && values.length>0){
            in("chip_model",values);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("chip_model",value);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper chipModelNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("chip_model",values);
        }
        return this;
    }


    /**
     * <p>系统版本</p>
     * 等于 = entity().getOsVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionEq(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            eq("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 不等于 &lt;&gt; entity().getOsVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionNe(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            ne("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于 &gt; entity().getOsVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionGt(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            gt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于等于 &gt;= entity().getOsVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionGe(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            ge("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于 &lt; entity().getOsVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionLt(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            lt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于等于 &lt;= entity().getOsVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionLe(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            le("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * BETWEEN  entity().getOsVersion() AND osVersionEnd
     * @param osVersionEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionBetween(String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            between("os_version",osVersion,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT BETWEEN  entity().getOsVersion() AND 值2
     * @param osVersionEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionNotBetween(String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            notBetween("os_version",osVersion,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * BETWEEN  entity().getOsVersion() AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionBetween(String osVersionStart,String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            between("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT BETWEEN  entity().getOsVersion() AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionNotBetween(String osVersionStart,String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            notBetween("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值%'  entity().getOsVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionLike(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            like("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT LIKE '%值%'  entity().getOsVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionNotLike(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            notLike("os_version",osVersion);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值'  entity().getOsVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionLikeLeft(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            likeLeft("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * LIKE '值%'  entity().getOsVersion()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionLikeRight(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            likeRight("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 等于 =
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionEq(String osVersion){
        if(osVersion!=null){
            eq("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 不等于 &lt;&gt;
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionNe(String osVersion){
        if(osVersion!=null){
            ne("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于 &gt;
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionGt(String osVersion){
        if(osVersion!=null){
            gt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于等于 &gt;=
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionGe(String osVersion){
        if(osVersion!=null){
            ge("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于 &lt;
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionLt(String osVersion){
        if(osVersion!=null){
            lt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于等于 &lt;=
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionLe(String osVersion){
        if(osVersion!=null){
            le("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * LIKE '%值%'
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionLike(String osVersion){
        if(osVersion!=null){
            like("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT LIKE '%值%'
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionNotLike(String osVersion){
        if(osVersion!=null){
            notLike("os_version",osVersion);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值'
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionLikeLeft(String osVersion){
        if(osVersion!=null){
            likeLeft("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * LIKE '值%'
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionLikeRight(String osVersion){
        if(osVersion!=null){
            likeRight("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionIsNull(){
        isNull("os_version");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionIsNotNull(){
        isNotNull("os_version");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("os_version",value);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionIn(String... values){
        if(values!=null && values.length>0){
            in("os_version",values);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("os_version",value);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper osVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("os_version",values);
        }
        return this;
    }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 等于 = entity().getSalesStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusEq(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            eq("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 不等于 &lt;&gt; entity().getSalesStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusNe(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            ne("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于 &gt; entity().getSalesStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusGt(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            gt("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于等于 &gt;= entity().getSalesStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusGe(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            ge("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于 &lt; entity().getSalesStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusLt(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            lt("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于等于 &lt;= entity().getSalesStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusLe(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            le("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * BETWEEN  entity().getSalesStatus() AND salesStatusEnd
     * @param salesStatusEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusBetween(Integer salesStatusEnd){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null && salesStatusEnd!=null){
            between("sales_status",salesStatus,salesStatusEnd);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT BETWEEN  entity().getSalesStatus() AND 值2
     * @param salesStatusEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusNotBetween(Integer salesStatusEnd){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null && salesStatusEnd!=null){
            notBetween("sales_status",salesStatus,salesStatusEnd);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * BETWEEN  entity().getSalesStatus() AND 值2
     * @param salesStatusStart       值1
     * @param salesStatusEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusBetween(Integer salesStatusStart,Integer salesStatusEnd){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null && salesStatusEnd!=null){
            between("sales_status",salesStatusStart,salesStatusEnd);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT BETWEEN  entity().getSalesStatus() AND 值2
     * @param salesStatusStart       值1
     * @param salesStatusEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusNotBetween(Integer salesStatusStart,Integer salesStatusEnd){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null && salesStatusEnd!=null){
            notBetween("sales_status",salesStatusStart,salesStatusEnd);
        }
        return this;
     }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值%'  entity().getSalesStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusLike(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            like("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT LIKE '%值%'  entity().getSalesStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusNotLike(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            notLike("sales_status",salesStatus);
        }
        return this;
     }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值'  entity().getSalesStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusLikeLeft(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            likeLeft("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '值%'  entity().getSalesStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusLikeRight(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            likeRight("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 等于 =
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusEq(Integer salesStatus){
        if(salesStatus!=null){
            eq("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 不等于 &lt;&gt;
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusNe(Integer salesStatus){
        if(salesStatus!=null){
            ne("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于 &gt;
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusGt(Integer salesStatus){
        if(salesStatus!=null){
            gt("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于等于 &gt;=
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusGe(Integer salesStatus){
        if(salesStatus!=null){
            ge("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于 &lt;
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusLt(Integer salesStatus){
        if(salesStatus!=null){
            lt("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于等于 &lt;=
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusLe(Integer salesStatus){
        if(salesStatus!=null){
            le("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值%'
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusLike(Integer salesStatus){
        if(salesStatus!=null){
            like("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT LIKE '%值%'
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusNotLike(Integer salesStatus){
        if(salesStatus!=null){
            notLike("sales_status",salesStatus);
        }
        return this;
     }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值'
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusLikeLeft(Integer salesStatus){
        if(salesStatus!=null){
            likeLeft("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '值%'
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusLikeRight(Integer salesStatus){
        if(salesStatus!=null){
            likeRight("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusIsNull(){
        isNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusIsNotNull(){
        isNotNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("sales_status",value);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("sales_status",values);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("sales_status",value);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper salesStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("sales_status",values);
        }
        return this;
    }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 等于 = entity().getLogLevel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelEq(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            eq("log_level",logLevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 不等于 &lt;&gt; entity().getLogLevel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelNe(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            ne("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于 &gt; entity().getLogLevel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelGt(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            gt("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于等于 &gt;= entity().getLogLevel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelGe(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            ge("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于 &lt; entity().getLogLevel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelLt(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            lt("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于等于 &lt;= entity().getLogLevel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelLe(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            le("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * BETWEEN  entity().getLogLevel() AND logLevelEnd
     * @param logLevelEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelBetween(Integer logLevelEnd){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null && logLevelEnd!=null){
            between("log_level",logLevel,logLevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT BETWEEN  entity().getLogLevel() AND 值2
     * @param logLevelEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelNotBetween(Integer logLevelEnd){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null && logLevelEnd!=null){
            notBetween("log_level",logLevel,logLevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * BETWEEN  entity().getLogLevel() AND 值2
     * @param logLevelStart       值1
     * @param logLevelEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelBetween(Integer logLevelStart,Integer logLevelEnd){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null && logLevelEnd!=null){
            between("log_level",logLevelStart,logLevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT BETWEEN  entity().getLogLevel() AND 值2
     * @param logLevelStart       值1
     * @param logLevelEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelNotBetween(Integer logLevelStart,Integer logLevelEnd){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null && logLevelEnd!=null){
            notBetween("log_level",logLevelStart,logLevelEnd);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值%'  entity().getLogLevel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelLike(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            like("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT LIKE '%值%'  entity().getLogLevel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelNotLike(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            notLike("log_level",logLevel);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值'  entity().getLogLevel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelLikeLeft(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            likeLeft("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '值%'  entity().getLogLevel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelLikeRight(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            likeRight("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 等于 =
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelEq(Integer logLevel){
        if(logLevel!=null){
            eq("log_level",logLevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 不等于 &lt;&gt;
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelNe(Integer logLevel){
        if(logLevel!=null){
            ne("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于 &gt;
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelGt(Integer logLevel){
        if(logLevel!=null){
            gt("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于等于 &gt;=
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelGe(Integer logLevel){
        if(logLevel!=null){
            ge("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于 &lt;
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelLt(Integer logLevel){
        if(logLevel!=null){
            lt("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于等于 &lt;=
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelLe(Integer logLevel){
        if(logLevel!=null){
            le("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值%'
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelLike(Integer logLevel){
        if(logLevel!=null){
            like("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT LIKE '%值%'
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelNotLike(Integer logLevel){
        if(logLevel!=null){
            notLike("log_level",logLevel);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值'
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelLikeLeft(Integer logLevel){
        if(logLevel!=null){
            likeLeft("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '值%'
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelLikeRight(Integer logLevel){
        if(logLevel!=null){
            likeRight("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelIsNull(){
        isNull("log_level");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelIsNotNull(){
        isNotNull("log_level");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("log_level",value);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelIn(Integer... values){
        if(values!=null && values.length>0){
            in("log_level",values);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("log_level",value);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logLevelNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("log_level",values);
        }
        return this;
    }


    /**
     * <p>日志包名</p>
     * 等于 = entity().getLogPkg()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgEq(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            eq("log_pkg",logPkg);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * 不等于 &lt;&gt; entity().getLogPkg()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgNe(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            ne("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 大于 &gt; entity().getLogPkg()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgGt(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            gt("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 大于等于 &gt;= entity().getLogPkg()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgGe(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            ge("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 小于 &lt; entity().getLogPkg()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgLt(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            lt("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 小于等于 &lt;= entity().getLogPkg()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgLe(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            le("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * BETWEEN  entity().getLogPkg() AND logPkgEnd
     * @param logPkgEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgBetween(String logPkgEnd){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null && logPkgEnd!=null){
            between("log_pkg",logPkg,logPkgEnd);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * NOT BETWEEN  entity().getLogPkg() AND 值2
     * @param logPkgEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgNotBetween(String logPkgEnd){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null && logPkgEnd!=null){
            notBetween("log_pkg",logPkg,logPkgEnd);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * BETWEEN  entity().getLogPkg() AND 值2
     * @param logPkgStart       值1
     * @param logPkgEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgBetween(String logPkgStart,String logPkgEnd){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null && logPkgEnd!=null){
            between("log_pkg",logPkgStart,logPkgEnd);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * NOT BETWEEN  entity().getLogPkg() AND 值2
     * @param logPkgStart       值1
     * @param logPkgEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgNotBetween(String logPkgStart,String logPkgEnd){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null && logPkgEnd!=null){
            notBetween("log_pkg",logPkgStart,logPkgEnd);
        }
        return this;
     }


    /**
     * <p>日志包名</p>
     * LIKE '%值%'  entity().getLogPkg()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgLike(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            like("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * NOT LIKE '%值%'  entity().getLogPkg()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgNotLike(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            notLike("log_pkg",logPkg);
        }
        return this;
     }


    /**
     * <p>日志包名</p>
     * LIKE '%值'  entity().getLogPkg()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgLikeLeft(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            likeLeft("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * LIKE '值%'  entity().getLogPkg()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgLikeRight(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            likeRight("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 等于 =
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgEq(String logPkg){
        if(logPkg!=null){
            eq("log_pkg",logPkg);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * 不等于 &lt;&gt;
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgNe(String logPkg){
        if(logPkg!=null){
            ne("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 大于 &gt;
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgGt(String logPkg){
        if(logPkg!=null){
            gt("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 大于等于 &gt;=
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgGe(String logPkg){
        if(logPkg!=null){
            ge("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 小于 &lt;
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgLt(String logPkg){
        if(logPkg!=null){
            lt("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 小于等于 &lt;=
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgLe(String logPkg){
        if(logPkg!=null){
            le("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * LIKE '%值%'
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgLike(String logPkg){
        if(logPkg!=null){
            like("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * NOT LIKE '%值%'
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgNotLike(String logPkg){
        if(logPkg!=null){
            notLike("log_pkg",logPkg);
        }
        return this;
     }


    /**
     * <p>日志包名</p>
     * LIKE '%值'
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgLikeLeft(String logPkg){
        if(logPkg!=null){
            likeLeft("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * LIKE '值%'
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgLikeRight(String logPkg){
        if(logPkg!=null){
            likeRight("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgIsNull(){
        isNull("log_pkg");
        return this;
    }

    /**
     * <p>日志包名</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgIsNotNull(){
        isNotNull("log_pkg");
        return this;
    }

    /**
     * <p>日志包名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("log_pkg",value);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgIn(String... values){
        if(values!=null && values.length>0){
            in("log_pkg",values);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("log_pkg",value);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper logPkgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("log_pkg",values);
        }
        return this;
    }


    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 等于 = entity().getSupplierType()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeEq(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            eq("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 不等于 &lt;&gt; entity().getSupplierType()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeNe(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            ne("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 大于 &gt; entity().getSupplierType()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeGt(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            gt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 大于等于 &gt;= entity().getSupplierType()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeGe(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            ge("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 小于 &lt; entity().getSupplierType()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeLt(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            lt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 小于等于 &lt;= entity().getSupplierType()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeLe(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            le("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * BETWEEN  entity().getSupplierType() AND supplierTypeEnd
     * @param supplierTypeEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeBetween(Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            between("supplier_type",supplierType,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeNotBetween(Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",supplierType,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            between("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeNotBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '%值%'  entity().getSupplierType()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeLike(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            like("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT LIKE '%值%'  entity().getSupplierType()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeNotLike(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            notLike("supplier_type",supplierType);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '%值'  entity().getSupplierType()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeLikeLeft(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            likeLeft("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '值%'  entity().getSupplierType()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeLikeRight(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            likeRight("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 等于 =
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeEq(Integer supplierType){
        if(supplierType!=null){
            eq("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 不等于 &lt;&gt;
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeNe(Integer supplierType){
        if(supplierType!=null){
            ne("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 大于 &gt;
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeGt(Integer supplierType){
        if(supplierType!=null){
            gt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 大于等于 &gt;=
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeGe(Integer supplierType){
        if(supplierType!=null){
            ge("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 小于 &lt;
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeLt(Integer supplierType){
        if(supplierType!=null){
            lt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 小于等于 &lt;=
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeLe(Integer supplierType){
        if(supplierType!=null){
            le("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '%值%'
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeLike(Integer supplierType){
        if(supplierType!=null){
            like("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT LIKE '%值%'
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeNotLike(Integer supplierType){
        if(supplierType!=null){
            notLike("supplier_type",supplierType);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '%值'
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeLikeLeft(Integer supplierType){
        if(supplierType!=null){
            likeLeft("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '值%'
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeLikeRight(Integer supplierType){
        if(supplierType!=null){
            likeRight("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeIsNull(){
        isNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeIsNotNull(){
        isNotNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("supplier_type",value);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("supplier_type",values);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("supplier_type",value);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper supplierTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("supplier_type",values);
        }
        return this;
    }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }


    /**
     * <p>版本id</p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdEq(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 不等于 &lt;&gt; entity().getVersionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdNe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于 &gt; entity().getVersionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdGt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于等于 &gt;= entity().getVersionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdGe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于 &lt; entity().getVersionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdLt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于等于 &lt;= entity().getVersionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * BETWEEN  entity().getVersionId() AND versionIdEnd
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdNotBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值'  entity().getVersionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * LIKE '值%'  entity().getVersionId()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdLikeRight(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 不等于 &lt;&gt;
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于 &gt;
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于等于 &gt;=
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于 &lt;
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于等于 &lt;=
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值'
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * LIKE '值%'
     * @param versionId       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdLikeRight(Long versionId){
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("version_id",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }


    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper createTimeEq(){
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
    public VizMcMachineQueryEntityWrapper createTimeNe(){
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
    public VizMcMachineQueryEntityWrapper createTimeGt(){
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
    public VizMcMachineQueryEntityWrapper createTimeGe(){
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
    public VizMcMachineQueryEntityWrapper createTimeLt(){
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
    public VizMcMachineQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public VizMcMachineQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public VizMcMachineQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper createTimeLikeRight(){
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
    public VizMcMachineQueryEntityWrapper createTimeEq(Date createTime){
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
    public VizMcMachineQueryEntityWrapper createTimeNe(Date createTime){
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
    public VizMcMachineQueryEntityWrapper createTimeGt(Date createTime){
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
    public VizMcMachineQueryEntityWrapper createTimeGe(Date createTime){
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
    public VizMcMachineQueryEntityWrapper createTimeLt(Date createTime){
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
    public VizMcMachineQueryEntityWrapper createTimeLe(Date createTime){
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
    public VizMcMachineQueryEntityWrapper createTimeLike(Date createTime){
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
    public VizMcMachineQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public VizMcMachineQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcMachineQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public VizMcMachineQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public VizMcMachineQueryEntityWrapper createTimeIn(Date... values){
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
    public VizMcMachineQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcMachineQueryEntityWrapper createTimeNotIn(Date... values){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeEq(){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public VizMcMachineQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


    /**
     * <p>物理规格型号</p>
     * 等于 = entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelEq(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            eq("specification_model",specificationModel);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * 不等于 &lt;&gt; entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelNe(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            ne("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 大于 &gt; entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelGt(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            gt("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 大于等于 &gt;= entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelGe(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            ge("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 小于 &lt; entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelLt(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            lt("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 小于等于 &lt;= entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelLe(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            le("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * BETWEEN  entity().getSpecificationModel() AND specificationModelEnd
     * @param specificationModelEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelBetween(String specificationModelEnd){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null && specificationModelEnd!=null){
            between("specification_model",specificationModel,specificationModelEnd);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * NOT BETWEEN  entity().getSpecificationModel() AND 值2
     * @param specificationModelEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelNotBetween(String specificationModelEnd){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null && specificationModelEnd!=null){
            notBetween("specification_model",specificationModel,specificationModelEnd);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * BETWEEN  entity().getSpecificationModel() AND 值2
     * @param specificationModelStart       值1
     * @param specificationModelEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelBetween(String specificationModelStart,String specificationModelEnd){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null && specificationModelEnd!=null){
            between("specification_model",specificationModelStart,specificationModelEnd);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * NOT BETWEEN  entity().getSpecificationModel() AND 值2
     * @param specificationModelStart       值1
     * @param specificationModelEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelNotBetween(String specificationModelStart,String specificationModelEnd){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null && specificationModelEnd!=null){
            notBetween("specification_model",specificationModelStart,specificationModelEnd);
        }
        return this;
     }


    /**
     * <p>物理规格型号</p>
     * LIKE '%值%'  entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelLike(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            like("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * NOT LIKE '%值%'  entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelNotLike(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            notLike("specification_model",specificationModel);
        }
        return this;
     }


    /**
     * <p>物理规格型号</p>
     * LIKE '%值'  entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelLikeLeft(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            likeLeft("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * LIKE '值%'  entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelLikeRight(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            likeRight("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 等于 =
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelEq(String specificationModel){
        if(specificationModel!=null){
            eq("specification_model",specificationModel);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * 不等于 &lt;&gt;
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelNe(String specificationModel){
        if(specificationModel!=null){
            ne("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 大于 &gt;
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelGt(String specificationModel){
        if(specificationModel!=null){
            gt("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 大于等于 &gt;=
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelGe(String specificationModel){
        if(specificationModel!=null){
            ge("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 小于 &lt;
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelLt(String specificationModel){
        if(specificationModel!=null){
            lt("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 小于等于 &lt;=
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelLe(String specificationModel){
        if(specificationModel!=null){
            le("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * LIKE '%值%'
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelLike(String specificationModel){
        if(specificationModel!=null){
            like("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * NOT LIKE '%值%'
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelNotLike(String specificationModel){
        if(specificationModel!=null){
            notLike("specification_model",specificationModel);
        }
        return this;
     }


    /**
     * <p>物理规格型号</p>
     * LIKE '%值'
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelLikeLeft(String specificationModel){
        if(specificationModel!=null){
            likeLeft("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * LIKE '值%'
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelLikeRight(String specificationModel){
        if(specificationModel!=null){
            likeRight("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelIsNull(){
        isNull("specification_model");
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelIsNotNull(){
        isNotNull("specification_model");
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("specification_model",value);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelIn(String... values){
        if(values!=null && values.length>0){
            in("specification_model",values);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("specification_model",value);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper specificationModelNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("specification_model",values);
        }
        return this;
    }


    /**
     * <p>内存配额，单位为MB</p>
     * 等于 = entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitEq(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            eq("memory_limit",memoryLimit);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * 不等于 &lt;&gt; entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitNe(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            ne("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 大于 &gt; entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitGt(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            gt("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 大于等于 &gt;= entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitGe(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            ge("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 小于 &lt; entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitLt(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            lt("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 小于等于 &lt;= entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitLe(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            le("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * BETWEEN  entity().getMemoryLimit() AND memoryLimitEnd
     * @param memoryLimitEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitBetween(Long memoryLimitEnd){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null && memoryLimitEnd!=null){
            between("memory_limit",memoryLimit,memoryLimitEnd);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT BETWEEN  entity().getMemoryLimit() AND 值2
     * @param memoryLimitEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitNotBetween(Long memoryLimitEnd){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null && memoryLimitEnd!=null){
            notBetween("memory_limit",memoryLimit,memoryLimitEnd);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * BETWEEN  entity().getMemoryLimit() AND 值2
     * @param memoryLimitStart       值1
     * @param memoryLimitEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitBetween(Long memoryLimitStart,Long memoryLimitEnd){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null && memoryLimitEnd!=null){
            between("memory_limit",memoryLimitStart,memoryLimitEnd);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT BETWEEN  entity().getMemoryLimit() AND 值2
     * @param memoryLimitStart       值1
     * @param memoryLimitEnd      值2
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitNotBetween(Long memoryLimitStart,Long memoryLimitEnd){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null && memoryLimitEnd!=null){
            notBetween("memory_limit",memoryLimitStart,memoryLimitEnd);
        }
        return this;
     }


    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '%值%'  entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitLike(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            like("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT LIKE '%值%'  entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitNotLike(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            notLike("memory_limit",memoryLimit);
        }
        return this;
     }


    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '%值'  entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitLikeLeft(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            likeLeft("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '值%'  entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitLikeRight(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            likeRight("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 等于 =
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitEq(Long memoryLimit){
        if(memoryLimit!=null){
            eq("memory_limit",memoryLimit);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * 不等于 &lt;&gt;
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitNe(Long memoryLimit){
        if(memoryLimit!=null){
            ne("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 大于 &gt;
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitGt(Long memoryLimit){
        if(memoryLimit!=null){
            gt("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 大于等于 &gt;=
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitGe(Long memoryLimit){
        if(memoryLimit!=null){
            ge("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 小于 &lt;
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitLt(Long memoryLimit){
        if(memoryLimit!=null){
            lt("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 小于等于 &lt;=
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitLe(Long memoryLimit){
        if(memoryLimit!=null){
            le("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '%值%'
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitLike(Long memoryLimit){
        if(memoryLimit!=null){
            like("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT LIKE '%值%'
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitNotLike(Long memoryLimit){
        if(memoryLimit!=null){
            notLike("memory_limit",memoryLimit);
        }
        return this;
     }


    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '%值'
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitLikeLeft(Long memoryLimit){
        if(memoryLimit!=null){
            likeLeft("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '值%'
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitLikeRight(Long memoryLimit){
        if(memoryLimit!=null){
            likeRight("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitIsNull(){
        isNull("memory_limit");
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitIsNotNull(){
        isNotNull("memory_limit");
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("memory_limit",value);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitIn(Long... values){
        if(values!=null && values.length>0){
            in("memory_limit",values);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("memory_limit",value);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineQueryEntityWrapper memoryLimitNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("memory_limit",values);
        }
        return this;
    }



}
