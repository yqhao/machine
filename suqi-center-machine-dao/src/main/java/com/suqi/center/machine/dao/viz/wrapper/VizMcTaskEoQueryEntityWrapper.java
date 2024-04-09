package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.viz.entity.VizMcTaskEo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 任务表
 * </p>
 * "viz_mc_task"
 * @author 18374
 */
public class VizMcTaskEoQueryEntityWrapper extends QueryWrapper<VizMcTaskEo> {

    public static VizMcTaskEoQueryEntityWrapper wrapper(VizMcTaskEo entity) {
        return new VizMcTaskEoQueryEntityWrapper(entity);
    }

    private VizMcTaskEo entity;

    public VizMcTaskEoQueryEntityWrapper(VizMcTaskEo entity) {
         this.entity=entity;
    }


    protected VizMcTaskEo entity() {
        if(entity==null){
            throw new NullPointerException("VizMcTaskEo is null");
        }
        return entity;
    }

    @Override
    public VizMcTaskEoQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public VizMcTaskEoQueryEntityWrapper selectColumns(Consumer<VizMcTaskEoSelect> consumer) {
        VizMcTaskEoSelect select = new VizMcTaskEoSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * 等于 = entity().getId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值%'  entity().getId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * IS NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>租户id</p>
     * 等于 = entity().getFkTenantId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdEq(){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null){
            eq("fk_tenant_id",fkTenantId);
        }
        return this;
    }

    /**
     * <p>租户id</p>
     * 不等于 &lt;&gt; entity().getFkTenantId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdNe(){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null){
            ne("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * 大于 &gt; entity().getFkTenantId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdGt(){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null){
            gt("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * 大于等于 &gt;= entity().getFkTenantId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdGe(){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null){
            ge("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * 小于 &lt; entity().getFkTenantId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdLt(){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null){
            lt("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * 小于等于 &lt;= entity().getFkTenantId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdLe(){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null){
            le("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * BETWEEN  entity().getFkTenantId() AND fkTenantIdEnd
     * @param fkTenantIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdBetween(Long fkTenantIdEnd){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null && fkTenantIdEnd!=null){
            between("fk_tenant_id",fkTenantId,fkTenantIdEnd);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * NOT BETWEEN  entity().getFkTenantId() AND 值2
     * @param fkTenantIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdNotBetween(Long fkTenantIdEnd){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null && fkTenantIdEnd!=null){
            notBetween("fk_tenant_id",fkTenantId,fkTenantIdEnd);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * BETWEEN  entity().getFkTenantId() AND 值2
     * @param fkTenantIdStart       值1
     * @param fkTenantIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdBetween(Long fkTenantIdStart,Long fkTenantIdEnd){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null && fkTenantIdEnd!=null){
            between("fk_tenant_id",fkTenantIdStart,fkTenantIdEnd);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * NOT BETWEEN  entity().getFkTenantId() AND 值2
     * @param fkTenantIdStart       值1
     * @param fkTenantIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdNotBetween(Long fkTenantIdStart,Long fkTenantIdEnd){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null && fkTenantIdEnd!=null){
            notBetween("fk_tenant_id",fkTenantIdStart,fkTenantIdEnd);
        }
        return this;
     }


    /**
     * <p>租户id</p>
     * LIKE '%值%'  entity().getFkTenantId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdLike(){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null){
            like("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * NOT LIKE '%值%'  entity().getFkTenantId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdNotLike(){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null){
            notLike("fk_tenant_id",fkTenantId);
        }
        return this;
     }


    /**
     * <p>租户id</p>
     * LIKE '%值'  entity().getFkTenantId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdLikeLeft(){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null){
            likeLeft("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * LIKE '值%'  entity().getFkTenantId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdLikeRight(){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null){
            likeRight("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * 等于 =
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdEq(Long fkTenantId){
        if(fkTenantId!=null){
            eq("fk_tenant_id",fkTenantId);
        }
        return this;
    }

    /**
     * <p>租户id</p>
     * 不等于 &lt;&gt;
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdNe(Long fkTenantId){
        if(fkTenantId!=null){
            ne("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * 大于 &gt;
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdGt(Long fkTenantId){
        if(fkTenantId!=null){
            gt("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * 大于等于 &gt;=
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdGe(Long fkTenantId){
        if(fkTenantId!=null){
            ge("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * 小于 &lt;
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdLt(Long fkTenantId){
        if(fkTenantId!=null){
            lt("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * 小于等于 &lt;=
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdLe(Long fkTenantId){
        if(fkTenantId!=null){
            le("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * LIKE '%值%'
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdLike(Long fkTenantId){
        if(fkTenantId!=null){
            like("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * NOT LIKE '%值%'
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdNotLike(Long fkTenantId){
        if(fkTenantId!=null){
            notLike("fk_tenant_id",fkTenantId);
        }
        return this;
     }


    /**
     * <p>租户id</p>
     * LIKE '%值'
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdLikeLeft(Long fkTenantId){
        if(fkTenantId!=null){
            likeLeft("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * LIKE '值%'
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdLikeRight(Long fkTenantId){
        if(fkTenantId!=null){
            likeRight("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * IS NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdIsNull(){
        isNull("fk_tenant_id");
        return this;
    }

    /**
     * <p>租户id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdIsNotNull(){
        isNotNull("fk_tenant_id");
        return this;
    }

    /**
     * <p>租户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_tenant_id",value);
        }
        return this;
    }

    /**
     * <p>租户id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_tenant_id",values);
        }
        return this;
    }

    /**
     * <p>租户id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_tenant_id",value);
        }
        return this;
    }

    /**
     * <p>租户id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkTenantIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tenant_id",values);
        }
        return this;
    }


    /**
     * <p>任务类型ID</p>
     * 等于 = entity().getFkVizMcTaskTypeId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdEq(){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null){
            eq("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * 不等于 &lt;&gt; entity().getFkVizMcTaskTypeId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdNe(){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null){
            ne("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * 大于 &gt; entity().getFkVizMcTaskTypeId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdGt(){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null){
            gt("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * 大于等于 &gt;= entity().getFkVizMcTaskTypeId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdGe(){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null){
            ge("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * 小于 &lt; entity().getFkVizMcTaskTypeId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdLt(){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null){
            lt("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * 小于等于 &lt;= entity().getFkVizMcTaskTypeId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdLe(){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null){
            le("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * BETWEEN  entity().getFkVizMcTaskTypeId() AND fkVizMcTaskTypeIdEnd
     * @param fkVizMcTaskTypeIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdBetween(Long fkVizMcTaskTypeIdEnd){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null && fkVizMcTaskTypeIdEnd!=null){
            between("fk_viz_mc_task_type_id",fkVizMcTaskTypeId,fkVizMcTaskTypeIdEnd);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * NOT BETWEEN  entity().getFkVizMcTaskTypeId() AND 值2
     * @param fkVizMcTaskTypeIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdNotBetween(Long fkVizMcTaskTypeIdEnd){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null && fkVizMcTaskTypeIdEnd!=null){
            notBetween("fk_viz_mc_task_type_id",fkVizMcTaskTypeId,fkVizMcTaskTypeIdEnd);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * BETWEEN  entity().getFkVizMcTaskTypeId() AND 值2
     * @param fkVizMcTaskTypeIdStart       值1
     * @param fkVizMcTaskTypeIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdBetween(Long fkVizMcTaskTypeIdStart,Long fkVizMcTaskTypeIdEnd){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null && fkVizMcTaskTypeIdEnd!=null){
            between("fk_viz_mc_task_type_id",fkVizMcTaskTypeIdStart,fkVizMcTaskTypeIdEnd);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * NOT BETWEEN  entity().getFkVizMcTaskTypeId() AND 值2
     * @param fkVizMcTaskTypeIdStart       值1
     * @param fkVizMcTaskTypeIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdNotBetween(Long fkVizMcTaskTypeIdStart,Long fkVizMcTaskTypeIdEnd){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null && fkVizMcTaskTypeIdEnd!=null){
            notBetween("fk_viz_mc_task_type_id",fkVizMcTaskTypeIdStart,fkVizMcTaskTypeIdEnd);
        }
        return this;
     }


    /**
     * <p>任务类型ID</p>
     * LIKE '%值%'  entity().getFkVizMcTaskTypeId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdLike(){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null){
            like("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * NOT LIKE '%值%'  entity().getFkVizMcTaskTypeId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdNotLike(){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null){
            notLike("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }


    /**
     * <p>任务类型ID</p>
     * LIKE '%值'  entity().getFkVizMcTaskTypeId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdLikeLeft(){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null){
            likeLeft("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * LIKE '值%'  entity().getFkVizMcTaskTypeId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdLikeRight(){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null){
            likeRight("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * 等于 =
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdEq(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            eq("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * 不等于 &lt;&gt;
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdNe(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            ne("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * 大于 &gt;
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdGt(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            gt("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * 大于等于 &gt;=
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdGe(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            ge("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * 小于 &lt;
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdLt(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            lt("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * 小于等于 &lt;=
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdLe(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            le("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * LIKE '%值%'
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdLike(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            like("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * NOT LIKE '%值%'
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdNotLike(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            notLike("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }


    /**
     * <p>任务类型ID</p>
     * LIKE '%值'
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdLikeLeft(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            likeLeft("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * LIKE '值%'
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdLikeRight(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            likeRight("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * IS NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdIsNull(){
        isNull("fk_viz_mc_task_type_id");
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdIsNotNull(){
        isNotNull("fk_viz_mc_task_type_id");
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_viz_mc_task_type_id",value);
        }
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_viz_mc_task_type_id",values);
        }
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_viz_mc_task_type_id",value);
        }
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkVizMcTaskTypeIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_viz_mc_task_type_id",values);
        }
        return this;
    }


    /**
     * <p>任务名称</p>
     * 等于 = entity().getName()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameEq(){
        String name =entity().getName();
        if(name!=null){
            eq("name",name);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * 不等于 &lt;&gt; entity().getName()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameNe(){
        String name =entity().getName();
        if(name!=null){
            ne("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 大于 &gt; entity().getName()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameGt(){
        String name =entity().getName();
        if(name!=null){
            gt("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 大于等于 &gt;= entity().getName()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameGe(){
        String name =entity().getName();
        if(name!=null){
            ge("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 小于 &lt; entity().getName()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameLt(){
        String name =entity().getName();
        if(name!=null){
            lt("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 小于等于 &lt;= entity().getName()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameLe(){
        String name =entity().getName();
        if(name!=null){
            le("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * BETWEEN  entity().getName() AND nameEnd
     * @param nameEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameBetween(String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            between("name",name,nameEnd);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * NOT BETWEEN  entity().getName() AND 值2
     * @param nameEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameNotBetween(String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            notBetween("name",name,nameEnd);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * BETWEEN  entity().getName() AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameBetween(String nameStart,String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            between("name",nameStart,nameEnd);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * NOT BETWEEN  entity().getName() AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameNotBetween(String nameStart,String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            notBetween("name",nameStart,nameEnd);
        }
        return this;
     }


    /**
     * <p>任务名称</p>
     * LIKE '%值%'  entity().getName()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameLike(){
        String name =entity().getName();
        if(name!=null){
            like("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * NOT LIKE '%值%'  entity().getName()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameNotLike(){
        String name =entity().getName();
        if(name!=null){
            notLike("name",name);
        }
        return this;
     }


    /**
     * <p>任务名称</p>
     * LIKE '%值'  entity().getName()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameLikeLeft(){
        String name =entity().getName();
        if(name!=null){
            likeLeft("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * LIKE '值%'  entity().getName()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameLikeRight(){
        String name =entity().getName();
        if(name!=null){
            likeRight("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 等于 =
     * @param name       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameEq(String name){
        if(name!=null){
            eq("name",name);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * 不等于 &lt;&gt;
     * @param name       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameNe(String name){
        if(name!=null){
            ne("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 大于 &gt;
     * @param name       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameGt(String name){
        if(name!=null){
            gt("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 大于等于 &gt;=
     * @param name       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameGe(String name){
        if(name!=null){
            ge("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 小于 &lt;
     * @param name       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameLt(String name){
        if(name!=null){
            lt("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 小于等于 &lt;=
     * @param name       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameLe(String name){
        if(name!=null){
            le("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * LIKE '%值%'
     * @param name       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameLike(String name){
        if(name!=null){
            like("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * NOT LIKE '%值%'
     * @param name       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameNotLike(String name){
        if(name!=null){
            notLike("name",name);
        }
        return this;
     }


    /**
     * <p>任务名称</p>
     * LIKE '%值'
     * @param name       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameLikeLeft(String name){
        if(name!=null){
            likeLeft("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * LIKE '值%'
     * @param name       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameLikeRight(String name){
        if(name!=null){
            likeRight("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * IS NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameIsNull(){
        isNull("name");
        return this;
    }

    /**
     * <p>任务名称</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameIsNotNull(){
        isNotNull("name");
        return this;
    }

    /**
     * <p>任务名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("name",value);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameIn(String... values){
        if(values!=null && values.length>0){
            in("name",values);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("name",value);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper nameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("name",values);
        }
        return this;
    }


    /**
     * <p>任务描述</p>
     * 等于 = entity().getTaskDescription()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionEq(){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null){
            eq("task_description",taskDescription);
        }
        return this;
    }

    /**
     * <p>任务描述</p>
     * 不等于 &lt;&gt; entity().getTaskDescription()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionNe(){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null){
            ne("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * 大于 &gt; entity().getTaskDescription()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionGt(){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null){
            gt("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * 大于等于 &gt;= entity().getTaskDescription()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionGe(){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null){
            ge("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * 小于 &lt; entity().getTaskDescription()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionLt(){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null){
            lt("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * 小于等于 &lt;= entity().getTaskDescription()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionLe(){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null){
            le("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * BETWEEN  entity().getTaskDescription() AND taskDescriptionEnd
     * @param taskDescriptionEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionBetween(String taskDescriptionEnd){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null && taskDescriptionEnd!=null){
            between("task_description",taskDescription,taskDescriptionEnd);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * NOT BETWEEN  entity().getTaskDescription() AND 值2
     * @param taskDescriptionEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionNotBetween(String taskDescriptionEnd){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null && taskDescriptionEnd!=null){
            notBetween("task_description",taskDescription,taskDescriptionEnd);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * BETWEEN  entity().getTaskDescription() AND 值2
     * @param taskDescriptionStart       值1
     * @param taskDescriptionEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionBetween(String taskDescriptionStart,String taskDescriptionEnd){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null && taskDescriptionEnd!=null){
            between("task_description",taskDescriptionStart,taskDescriptionEnd);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * NOT BETWEEN  entity().getTaskDescription() AND 值2
     * @param taskDescriptionStart       值1
     * @param taskDescriptionEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionNotBetween(String taskDescriptionStart,String taskDescriptionEnd){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null && taskDescriptionEnd!=null){
            notBetween("task_description",taskDescriptionStart,taskDescriptionEnd);
        }
        return this;
     }


    /**
     * <p>任务描述</p>
     * LIKE '%值%'  entity().getTaskDescription()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionLike(){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null){
            like("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * NOT LIKE '%值%'  entity().getTaskDescription()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionNotLike(){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null){
            notLike("task_description",taskDescription);
        }
        return this;
     }


    /**
     * <p>任务描述</p>
     * LIKE '%值'  entity().getTaskDescription()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionLikeLeft(){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null){
            likeLeft("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * LIKE '值%'  entity().getTaskDescription()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionLikeRight(){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null){
            likeRight("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * 等于 =
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionEq(String taskDescription){
        if(taskDescription!=null){
            eq("task_description",taskDescription);
        }
        return this;
    }

    /**
     * <p>任务描述</p>
     * 不等于 &lt;&gt;
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionNe(String taskDescription){
        if(taskDescription!=null){
            ne("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * 大于 &gt;
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionGt(String taskDescription){
        if(taskDescription!=null){
            gt("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * 大于等于 &gt;=
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionGe(String taskDescription){
        if(taskDescription!=null){
            ge("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * 小于 &lt;
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionLt(String taskDescription){
        if(taskDescription!=null){
            lt("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * 小于等于 &lt;=
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionLe(String taskDescription){
        if(taskDescription!=null){
            le("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * LIKE '%值%'
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionLike(String taskDescription){
        if(taskDescription!=null){
            like("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * NOT LIKE '%值%'
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionNotLike(String taskDescription){
        if(taskDescription!=null){
            notLike("task_description",taskDescription);
        }
        return this;
     }


    /**
     * <p>任务描述</p>
     * LIKE '%值'
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionLikeLeft(String taskDescription){
        if(taskDescription!=null){
            likeLeft("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * LIKE '值%'
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionLikeRight(String taskDescription){
        if(taskDescription!=null){
            likeRight("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * IS NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionIsNull(){
        isNull("task_description");
        return this;
    }

    /**
     * <p>任务描述</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionIsNotNull(){
        isNotNull("task_description");
        return this;
    }

    /**
     * <p>任务描述</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("task_description",value);
        }
        return this;
    }

    /**
     * <p>任务描述</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionIn(String... values){
        if(values!=null && values.length>0){
            in("task_description",values);
        }
        return this;
    }

    /**
     * <p>任务描述</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("task_description",value);
        }
        return this;
    }

    /**
     * <p>任务描述</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper taskDescriptionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("task_description",values);
        }
        return this;
    }


    /**
     * <p>执行命令</p>
     * 等于 = entity().getCommand()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandEq(){
        String command =entity().getCommand();
        if(command!=null){
            eq("command",command);
        }
        return this;
    }

    /**
     * <p>执行命令</p>
     * 不等于 &lt;&gt; entity().getCommand()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandNe(){
        String command =entity().getCommand();
        if(command!=null){
            ne("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * 大于 &gt; entity().getCommand()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandGt(){
        String command =entity().getCommand();
        if(command!=null){
            gt("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * 大于等于 &gt;= entity().getCommand()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandGe(){
        String command =entity().getCommand();
        if(command!=null){
            ge("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * 小于 &lt; entity().getCommand()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandLt(){
        String command =entity().getCommand();
        if(command!=null){
            lt("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * 小于等于 &lt;= entity().getCommand()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandLe(){
        String command =entity().getCommand();
        if(command!=null){
            le("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * BETWEEN  entity().getCommand() AND commandEnd
     * @param commandEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandBetween(String commandEnd){
        String command =entity().getCommand();
        if(command!=null && commandEnd!=null){
            between("command",command,commandEnd);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * NOT BETWEEN  entity().getCommand() AND 值2
     * @param commandEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandNotBetween(String commandEnd){
        String command =entity().getCommand();
        if(command!=null && commandEnd!=null){
            notBetween("command",command,commandEnd);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * BETWEEN  entity().getCommand() AND 值2
     * @param commandStart       值1
     * @param commandEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandBetween(String commandStart,String commandEnd){
        String command =entity().getCommand();
        if(command!=null && commandEnd!=null){
            between("command",commandStart,commandEnd);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * NOT BETWEEN  entity().getCommand() AND 值2
     * @param commandStart       值1
     * @param commandEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandNotBetween(String commandStart,String commandEnd){
        String command =entity().getCommand();
        if(command!=null && commandEnd!=null){
            notBetween("command",commandStart,commandEnd);
        }
        return this;
     }


    /**
     * <p>执行命令</p>
     * LIKE '%值%'  entity().getCommand()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandLike(){
        String command =entity().getCommand();
        if(command!=null){
            like("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * NOT LIKE '%值%'  entity().getCommand()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandNotLike(){
        String command =entity().getCommand();
        if(command!=null){
            notLike("command",command);
        }
        return this;
     }


    /**
     * <p>执行命令</p>
     * LIKE '%值'  entity().getCommand()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandLikeLeft(){
        String command =entity().getCommand();
        if(command!=null){
            likeLeft("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * LIKE '值%'  entity().getCommand()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandLikeRight(){
        String command =entity().getCommand();
        if(command!=null){
            likeRight("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * 等于 =
     * @param command       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandEq(String command){
        if(command!=null){
            eq("command",command);
        }
        return this;
    }

    /**
     * <p>执行命令</p>
     * 不等于 &lt;&gt;
     * @param command       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandNe(String command){
        if(command!=null){
            ne("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * 大于 &gt;
     * @param command       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandGt(String command){
        if(command!=null){
            gt("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * 大于等于 &gt;=
     * @param command       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandGe(String command){
        if(command!=null){
            ge("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * 小于 &lt;
     * @param command       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandLt(String command){
        if(command!=null){
            lt("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * 小于等于 &lt;=
     * @param command       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandLe(String command){
        if(command!=null){
            le("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * LIKE '%值%'
     * @param command       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandLike(String command){
        if(command!=null){
            like("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * NOT LIKE '%值%'
     * @param command       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandNotLike(String command){
        if(command!=null){
            notLike("command",command);
        }
        return this;
     }


    /**
     * <p>执行命令</p>
     * LIKE '%值'
     * @param command       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandLikeLeft(String command){
        if(command!=null){
            likeLeft("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * LIKE '值%'
     * @param command       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandLikeRight(String command){
        if(command!=null){
            likeRight("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * IS NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandIsNull(){
        isNull("command");
        return this;
    }

    /**
     * <p>执行命令</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandIsNotNull(){
        isNotNull("command");
        return this;
    }

    /**
     * <p>执行命令</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("command",value);
        }
        return this;
    }

    /**
     * <p>执行命令</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandIn(String... values){
        if(values!=null && values.length>0){
            in("command",values);
        }
        return this;
    }

    /**
     * <p>执行命令</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("command",value);
        }
        return this;
    }

    /**
     * <p>执行命令</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper commandNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("command",values);
        }
        return this;
    }


    /**
     * <p>扩展外键ID</p>
     * 等于 = entity().getFkExtendId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdEq(){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null){
            eq("fk_extend_id",fkExtendId);
        }
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * 不等于 &lt;&gt; entity().getFkExtendId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdNe(){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null){
            ne("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * 大于 &gt; entity().getFkExtendId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdGt(){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null){
            gt("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * 大于等于 &gt;= entity().getFkExtendId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdGe(){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null){
            ge("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * 小于 &lt; entity().getFkExtendId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdLt(){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null){
            lt("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * 小于等于 &lt;= entity().getFkExtendId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdLe(){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null){
            le("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * BETWEEN  entity().getFkExtendId() AND fkExtendIdEnd
     * @param fkExtendIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdBetween(Long fkExtendIdEnd){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null && fkExtendIdEnd!=null){
            between("fk_extend_id",fkExtendId,fkExtendIdEnd);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * NOT BETWEEN  entity().getFkExtendId() AND 值2
     * @param fkExtendIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdNotBetween(Long fkExtendIdEnd){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null && fkExtendIdEnd!=null){
            notBetween("fk_extend_id",fkExtendId,fkExtendIdEnd);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * BETWEEN  entity().getFkExtendId() AND 值2
     * @param fkExtendIdStart       值1
     * @param fkExtendIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdBetween(Long fkExtendIdStart,Long fkExtendIdEnd){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null && fkExtendIdEnd!=null){
            between("fk_extend_id",fkExtendIdStart,fkExtendIdEnd);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * NOT BETWEEN  entity().getFkExtendId() AND 值2
     * @param fkExtendIdStart       值1
     * @param fkExtendIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdNotBetween(Long fkExtendIdStart,Long fkExtendIdEnd){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null && fkExtendIdEnd!=null){
            notBetween("fk_extend_id",fkExtendIdStart,fkExtendIdEnd);
        }
        return this;
     }


    /**
     * <p>扩展外键ID</p>
     * LIKE '%值%'  entity().getFkExtendId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdLike(){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null){
            like("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * NOT LIKE '%值%'  entity().getFkExtendId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdNotLike(){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null){
            notLike("fk_extend_id",fkExtendId);
        }
        return this;
     }


    /**
     * <p>扩展外键ID</p>
     * LIKE '%值'  entity().getFkExtendId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdLikeLeft(){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null){
            likeLeft("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * LIKE '值%'  entity().getFkExtendId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdLikeRight(){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null){
            likeRight("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * 等于 =
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdEq(Long fkExtendId){
        if(fkExtendId!=null){
            eq("fk_extend_id",fkExtendId);
        }
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * 不等于 &lt;&gt;
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdNe(Long fkExtendId){
        if(fkExtendId!=null){
            ne("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * 大于 &gt;
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdGt(Long fkExtendId){
        if(fkExtendId!=null){
            gt("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * 大于等于 &gt;=
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdGe(Long fkExtendId){
        if(fkExtendId!=null){
            ge("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * 小于 &lt;
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdLt(Long fkExtendId){
        if(fkExtendId!=null){
            lt("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * 小于等于 &lt;=
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdLe(Long fkExtendId){
        if(fkExtendId!=null){
            le("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * LIKE '%值%'
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdLike(Long fkExtendId){
        if(fkExtendId!=null){
            like("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * NOT LIKE '%值%'
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdNotLike(Long fkExtendId){
        if(fkExtendId!=null){
            notLike("fk_extend_id",fkExtendId);
        }
        return this;
     }


    /**
     * <p>扩展外键ID</p>
     * LIKE '%值'
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdLikeLeft(Long fkExtendId){
        if(fkExtendId!=null){
            likeLeft("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * LIKE '值%'
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdLikeRight(Long fkExtendId){
        if(fkExtendId!=null){
            likeRight("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * IS NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdIsNull(){
        isNull("fk_extend_id");
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdIsNotNull(){
        isNotNull("fk_extend_id");
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_extend_id",value);
        }
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_extend_id",values);
        }
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_extend_id",value);
        }
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper fkExtendIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_extend_id",values);
        }
        return this;
    }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IS NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }


    /**
     * <p>操作人员</p>
     * 等于 = entity().getOperateSysUserId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdEq(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            eq("operate_sys_user_id",operateSysUserId);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * 不等于 &lt;&gt; entity().getOperateSysUserId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdNe(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            ne("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 大于 &gt; entity().getOperateSysUserId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdGt(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            gt("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 大于等于 &gt;= entity().getOperateSysUserId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdGe(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            ge("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 小于 &lt; entity().getOperateSysUserId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdLt(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            lt("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 小于等于 &lt;= entity().getOperateSysUserId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdLe(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            le("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * BETWEEN  entity().getOperateSysUserId() AND operateSysUserIdEnd
     * @param operateSysUserIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdBetween(Long operateSysUserIdEnd){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null && operateSysUserIdEnd!=null){
            between("operate_sys_user_id",operateSysUserId,operateSysUserIdEnd);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * NOT BETWEEN  entity().getOperateSysUserId() AND 值2
     * @param operateSysUserIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdNotBetween(Long operateSysUserIdEnd){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null && operateSysUserIdEnd!=null){
            notBetween("operate_sys_user_id",operateSysUserId,operateSysUserIdEnd);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * BETWEEN  entity().getOperateSysUserId() AND 值2
     * @param operateSysUserIdStart       值1
     * @param operateSysUserIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null && operateSysUserIdEnd!=null){
            between("operate_sys_user_id",operateSysUserIdStart,operateSysUserIdEnd);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * NOT BETWEEN  entity().getOperateSysUserId() AND 值2
     * @param operateSysUserIdStart       值1
     * @param operateSysUserIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdNotBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null && operateSysUserIdEnd!=null){
            notBetween("operate_sys_user_id",operateSysUserIdStart,operateSysUserIdEnd);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值%'  entity().getOperateSysUserId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdLike(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            like("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * NOT LIKE '%值%'  entity().getOperateSysUserId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdNotLike(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            notLike("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值'  entity().getOperateSysUserId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdLikeLeft(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            likeLeft("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * LIKE '值%'  entity().getOperateSysUserId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdLikeRight(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            likeRight("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 等于 =
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdEq(Long operateSysUserId){
        if(operateSysUserId!=null){
            eq("operate_sys_user_id",operateSysUserId);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * 不等于 &lt;&gt;
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdNe(Long operateSysUserId){
        if(operateSysUserId!=null){
            ne("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 大于 &gt;
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdGt(Long operateSysUserId){
        if(operateSysUserId!=null){
            gt("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 大于等于 &gt;=
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdGe(Long operateSysUserId){
        if(operateSysUserId!=null){
            ge("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 小于 &lt;
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdLt(Long operateSysUserId){
        if(operateSysUserId!=null){
            lt("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 小于等于 &lt;=
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdLe(Long operateSysUserId){
        if(operateSysUserId!=null){
            le("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * LIKE '%值%'
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdLike(Long operateSysUserId){
        if(operateSysUserId!=null){
            like("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * NOT LIKE '%值%'
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdNotLike(Long operateSysUserId){
        if(operateSysUserId!=null){
            notLike("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值'
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdLikeLeft(Long operateSysUserId){
        if(operateSysUserId!=null){
            likeLeft("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * LIKE '值%'
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdLikeRight(Long operateSysUserId){
        if(operateSysUserId!=null){
            likeRight("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * IS NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdIsNull(){
        isNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdIsNotNull(){
        isNotNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("operate_sys_user_id",value);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdIn(Long... values){
        if(values!=null && values.length>0){
            in("operate_sys_user_id",values);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("operate_sys_user_id",value);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper operateSysUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("operate_sys_user_id",values);
        }
        return this;
    }


    /**
     * <p>版本Id</p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdEq(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 不等于 &lt;&gt; entity().getVersionId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdNe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于 &gt; entity().getVersionId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdGt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于等于 &gt;= entity().getVersionId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdGe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于 &lt; entity().getVersionId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdLt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于等于 &lt;= entity().getVersionId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * BETWEEN  entity().getVersionId() AND versionIdEnd
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdNotBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值'  entity().getVersionId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * LIKE '值%'  entity().getVersionId()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdLikeRight(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 不等于 &lt;&gt;
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于 &gt;
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于等于 &gt;=
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于 &lt;
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于等于 &lt;=
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值'
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * LIKE '值%'
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdLikeRight(Long versionId){
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * IS NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("version_id",values);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper versionIdNotIn(Long... values){
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
    public VizMcTaskEoQueryEntityWrapper createTimeEq(){
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
    public VizMcTaskEoQueryEntityWrapper createTimeNe(){
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
    public VizMcTaskEoQueryEntityWrapper createTimeGt(){
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
    public VizMcTaskEoQueryEntityWrapper createTimeGe(){
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
    public VizMcTaskEoQueryEntityWrapper createTimeLt(){
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
    public VizMcTaskEoQueryEntityWrapper createTimeLe(){
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
    public VizMcTaskEoQueryEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public VizMcTaskEoQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public VizMcTaskEoQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcTaskEoQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcTaskEoQueryEntityWrapper createTimeLike(){
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
    public VizMcTaskEoQueryEntityWrapper createTimeNotLike(){
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
    public VizMcTaskEoQueryEntityWrapper createTimeLikeLeft(){
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
    public VizMcTaskEoQueryEntityWrapper createTimeLikeRight(){
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
    public VizMcTaskEoQueryEntityWrapper createTimeEq(Date createTime){
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
    public VizMcTaskEoQueryEntityWrapper createTimeNe(Date createTime){
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
    public VizMcTaskEoQueryEntityWrapper createTimeGt(Date createTime){
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
    public VizMcTaskEoQueryEntityWrapper createTimeGe(Date createTime){
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
    public VizMcTaskEoQueryEntityWrapper createTimeLt(Date createTime){
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
    public VizMcTaskEoQueryEntityWrapper createTimeLe(Date createTime){
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
    public VizMcTaskEoQueryEntityWrapper createTimeLike(Date createTime){
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
    public VizMcTaskEoQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public VizMcTaskEoQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcTaskEoQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public VizMcTaskEoQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public VizMcTaskEoQueryEntityWrapper createTimeIn(Date... values){
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
    public VizMcTaskEoQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcTaskEoQueryEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


    /**
     * <p>修改时间</p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeEq(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 不等于 &lt;&gt; entity().getLastUpdateTime()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 不等于 &lt;&gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于 &gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于等于 &gt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于 &lt;
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于等于 &lt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值'
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * IS NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * 等于 = entity().getDr()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drEq(){
        Integer dr =entity().getDr();
        if(dr!=null){
            eq("dr",dr);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 不等于 &lt;&gt; entity().getDr()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drNe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            ne("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 大于 &gt; entity().getDr()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drGt(){
        Integer dr =entity().getDr();
        if(dr!=null){
            gt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 大于等于 &gt;= entity().getDr()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drGe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            ge("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 小于 &lt; entity().getDr()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drLt(){
        Integer dr =entity().getDr();
        if(dr!=null){
            lt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 小于等于 &lt;= entity().getDr()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drLe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            le("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * BETWEEN  entity().getDr() AND drEnd
     * @param drEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drBetween(Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            between("dr",dr,drEnd);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT BETWEEN  entity().getDr() AND 值2
     * @param drEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drNotBetween(Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            notBetween("dr",dr,drEnd);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * BETWEEN  entity().getDr() AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drBetween(Integer drStart,Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            between("dr",drStart,drEnd);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT BETWEEN  entity().getDr() AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drNotBetween(Integer drStart,Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            notBetween("dr",drStart,drEnd);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值%'  entity().getDr()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drLike(){
        Integer dr =entity().getDr();
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT LIKE '%值%'  entity().getDr()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drNotLike(){
        Integer dr =entity().getDr();
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值'  entity().getDr()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drLikeLeft(){
        Integer dr =entity().getDr();
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '值%'  entity().getDr()
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drLikeRight(){
        Integer dr =entity().getDr();
        if(dr!=null){
            likeRight("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 等于 =
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drEq(Integer dr){
        if(dr!=null){
            eq("dr",dr);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 不等于 &lt;&gt;
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drNe(Integer dr){
        if(dr!=null){
            ne("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 大于 &gt;
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drGt(Integer dr){
        if(dr!=null){
            gt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 大于等于 &gt;=
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drGe(Integer dr){
        if(dr!=null){
            ge("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 小于 &lt;
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drLt(Integer dr){
        if(dr!=null){
            lt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 小于等于 &lt;=
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drLe(Integer dr){
        if(dr!=null){
            le("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值%'
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drLike(Integer dr){
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT LIKE '%值%'
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drNotLike(Integer dr){
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值'
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drLikeLeft(Integer dr){
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '值%'
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drLikeRight(Integer dr){
        if(dr!=null){
            likeRight("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IS NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dr",value);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drIn(Integer... values){
        if(values!=null && values.length>0){
            in("dr",values);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dr",value);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryEntityWrapper drNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dr",values);
        }
        return this;
    }



}
