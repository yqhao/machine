package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.VizMcTaskEo;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 任务表
 * </p>
 * "viz_mc_task"
 * @author 18374
 */
public class VizMcTaskEoQueryWrapper extends QueryWrapper<VizMcTaskEo> {


    public static VizMcTaskEoQueryWrapper wrapper() {
        return new VizMcTaskEoQueryWrapper();
    }

    public VizMcTaskEoQueryWrapper() {
        super();
    }

    public VizMcTaskEoQueryWrapper(VizMcTaskEo entity) {
        super(entity);
    }

    public VizMcTaskEoQueryWrapper(VizMcTaskEo entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public VizMcTaskEoQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public VizMcTaskEoQueryWrapper selectColumns(Consumer<VizMcTaskEoSelect> consumer) {
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
     * 等于 =
     * @param id       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper idEq(Long id){
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
    public VizMcTaskEoQueryWrapper idNe(Long id){
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
    public VizMcTaskEoQueryWrapper idGt(Long id){
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
    public VizMcTaskEoQueryWrapper idGe(Long id){
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
    public VizMcTaskEoQueryWrapper idLt(Long id){
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
    public VizMcTaskEoQueryWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper idLike(Long id){
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
    public VizMcTaskEoQueryWrapper idNotLike(Long id){
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
    public VizMcTaskEoQueryWrapper idLikeLeft(Long id){
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
    public VizMcTaskEoQueryWrapper idLikeRight(Long id){
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
    public VizMcTaskEoQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryWrapper idIn(Collection<Long> value){
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
    public VizMcTaskEoQueryWrapper idIn(Long... values){
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
    public VizMcTaskEoQueryWrapper idNotIn(Collection<Long> value){
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
    public VizMcTaskEoQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>租户id</p>
     * 等于 =
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkTenantIdEq(Long fkTenantId){
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
    public VizMcTaskEoQueryWrapper fkTenantIdNe(Long fkTenantId){
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
    public VizMcTaskEoQueryWrapper fkTenantIdGt(Long fkTenantId){
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
    public VizMcTaskEoQueryWrapper fkTenantIdGe(Long fkTenantId){
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
    public VizMcTaskEoQueryWrapper fkTenantIdLt(Long fkTenantId){
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
    public VizMcTaskEoQueryWrapper fkTenantIdLe(Long fkTenantId){
        if(fkTenantId!=null){
            le("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * BETWEEN 值1 AND 值2
     * @param fkTenantIdStart       值1
     * @param fkTenantIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkTenantIdBetween(Long fkTenantIdStart,Long fkTenantIdEnd){
        if(fkTenantIdStart!=null && fkTenantIdEnd!=null){
            between("fk_tenant_id",fkTenantIdStart,fkTenantIdEnd);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkTenantIdStart       值1
     * @param fkTenantIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkTenantIdNotBetween(Long fkTenantIdStart,Long fkTenantIdEnd){
        if(fkTenantIdStart!=null && fkTenantIdEnd!=null){
            notBetween("fk_tenant_id",fkTenantIdStart,fkTenantIdEnd);
        }
        return this;
     }


    /**
     * <p>租户id</p>
     * LIKE '%值%'
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkTenantIdLike(Long fkTenantId){
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
    public VizMcTaskEoQueryWrapper fkTenantIdNotLike(Long fkTenantId){
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
    public VizMcTaskEoQueryWrapper fkTenantIdLikeLeft(Long fkTenantId){
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
    public VizMcTaskEoQueryWrapper fkTenantIdLikeRight(Long fkTenantId){
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
    public VizMcTaskEoQueryWrapper fkTenantIdIsNull(){
        isNull("fk_tenant_id");
        return this;
    }

    /**
     * <p>租户id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkTenantIdIsNotNull(){
        isNotNull("fk_tenant_id");
        return this;
    }

    /**
     * <p>租户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkTenantIdIn(Collection<Long> value){
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
    public VizMcTaskEoQueryWrapper fkTenantIdIn(Long... values){
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
    public VizMcTaskEoQueryWrapper fkTenantIdNotIn(Collection<Long> value){
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
    public VizMcTaskEoQueryWrapper fkTenantIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tenant_id",values);
        }
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * 等于 =
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdEq(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdNe(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdGt(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdGe(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdLt(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdLe(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            le("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * BETWEEN 值1 AND 值2
     * @param fkVizMcTaskTypeIdStart       值1
     * @param fkVizMcTaskTypeIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdBetween(Long fkVizMcTaskTypeIdStart,Long fkVizMcTaskTypeIdEnd){
        if(fkVizMcTaskTypeIdStart!=null && fkVizMcTaskTypeIdEnd!=null){
            between("fk_viz_mc_task_type_id",fkVizMcTaskTypeIdStart,fkVizMcTaskTypeIdEnd);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkVizMcTaskTypeIdStart       值1
     * @param fkVizMcTaskTypeIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdNotBetween(Long fkVizMcTaskTypeIdStart,Long fkVizMcTaskTypeIdEnd){
        if(fkVizMcTaskTypeIdStart!=null && fkVizMcTaskTypeIdEnd!=null){
            notBetween("fk_viz_mc_task_type_id",fkVizMcTaskTypeIdStart,fkVizMcTaskTypeIdEnd);
        }
        return this;
     }


    /**
     * <p>任务类型ID</p>
     * LIKE '%值%'
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdLike(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdNotLike(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdLikeLeft(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdLikeRight(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdIsNull(){
        isNull("fk_viz_mc_task_type_id");
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdIsNotNull(){
        isNotNull("fk_viz_mc_task_type_id");
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdIn(Collection<Long> value){
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
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdIn(Long... values){
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
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdNotIn(Collection<Long> value){
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
    public VizMcTaskEoQueryWrapper fkVizMcTaskTypeIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_viz_mc_task_type_id",values);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * 等于 =
     * @param name       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper nameEq(String name){
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
    public VizMcTaskEoQueryWrapper nameNe(String name){
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
    public VizMcTaskEoQueryWrapper nameGt(String name){
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
    public VizMcTaskEoQueryWrapper nameGe(String name){
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
    public VizMcTaskEoQueryWrapper nameLt(String name){
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
    public VizMcTaskEoQueryWrapper nameLe(String name){
        if(name!=null){
            le("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * BETWEEN 值1 AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper nameBetween(String nameStart,String nameEnd){
        if(nameStart!=null && nameEnd!=null){
            between("name",nameStart,nameEnd);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper nameNotBetween(String nameStart,String nameEnd){
        if(nameStart!=null && nameEnd!=null){
            notBetween("name",nameStart,nameEnd);
        }
        return this;
     }


    /**
     * <p>任务名称</p>
     * LIKE '%值%'
     * @param name       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper nameLike(String name){
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
    public VizMcTaskEoQueryWrapper nameNotLike(String name){
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
    public VizMcTaskEoQueryWrapper nameLikeLeft(String name){
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
    public VizMcTaskEoQueryWrapper nameLikeRight(String name){
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
    public VizMcTaskEoQueryWrapper nameIsNull(){
        isNull("name");
        return this;
    }

    /**
     * <p>任务名称</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryWrapper nameIsNotNull(){
        isNotNull("name");
        return this;
    }

    /**
     * <p>任务名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryWrapper nameIn(Collection<String> value){
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
    public VizMcTaskEoQueryWrapper nameIn(String... values){
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
    public VizMcTaskEoQueryWrapper nameNotIn(Collection<String> value){
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
    public VizMcTaskEoQueryWrapper nameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("name",values);
        }
        return this;
    }

    /**
     * <p>任务描述</p>
     * 等于 =
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper taskDescriptionEq(String taskDescription){
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
    public VizMcTaskEoQueryWrapper taskDescriptionNe(String taskDescription){
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
    public VizMcTaskEoQueryWrapper taskDescriptionGt(String taskDescription){
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
    public VizMcTaskEoQueryWrapper taskDescriptionGe(String taskDescription){
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
    public VizMcTaskEoQueryWrapper taskDescriptionLt(String taskDescription){
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
    public VizMcTaskEoQueryWrapper taskDescriptionLe(String taskDescription){
        if(taskDescription!=null){
            le("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * BETWEEN 值1 AND 值2
     * @param taskDescriptionStart       值1
     * @param taskDescriptionEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper taskDescriptionBetween(String taskDescriptionStart,String taskDescriptionEnd){
        if(taskDescriptionStart!=null && taskDescriptionEnd!=null){
            between("task_description",taskDescriptionStart,taskDescriptionEnd);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * NOT BETWEEN 值1 AND 值2
     * @param taskDescriptionStart       值1
     * @param taskDescriptionEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper taskDescriptionNotBetween(String taskDescriptionStart,String taskDescriptionEnd){
        if(taskDescriptionStart!=null && taskDescriptionEnd!=null){
            notBetween("task_description",taskDescriptionStart,taskDescriptionEnd);
        }
        return this;
     }


    /**
     * <p>任务描述</p>
     * LIKE '%值%'
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper taskDescriptionLike(String taskDescription){
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
    public VizMcTaskEoQueryWrapper taskDescriptionNotLike(String taskDescription){
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
    public VizMcTaskEoQueryWrapper taskDescriptionLikeLeft(String taskDescription){
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
    public VizMcTaskEoQueryWrapper taskDescriptionLikeRight(String taskDescription){
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
    public VizMcTaskEoQueryWrapper taskDescriptionIsNull(){
        isNull("task_description");
        return this;
    }

    /**
     * <p>任务描述</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryWrapper taskDescriptionIsNotNull(){
        isNotNull("task_description");
        return this;
    }

    /**
     * <p>任务描述</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryWrapper taskDescriptionIn(Collection<String> value){
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
    public VizMcTaskEoQueryWrapper taskDescriptionIn(String... values){
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
    public VizMcTaskEoQueryWrapper taskDescriptionNotIn(Collection<String> value){
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
    public VizMcTaskEoQueryWrapper taskDescriptionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("task_description",values);
        }
        return this;
    }

    /**
     * <p>执行命令</p>
     * 等于 =
     * @param command       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper commandEq(String command){
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
    public VizMcTaskEoQueryWrapper commandNe(String command){
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
    public VizMcTaskEoQueryWrapper commandGt(String command){
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
    public VizMcTaskEoQueryWrapper commandGe(String command){
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
    public VizMcTaskEoQueryWrapper commandLt(String command){
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
    public VizMcTaskEoQueryWrapper commandLe(String command){
        if(command!=null){
            le("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * BETWEEN 值1 AND 值2
     * @param commandStart       值1
     * @param commandEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper commandBetween(String commandStart,String commandEnd){
        if(commandStart!=null && commandEnd!=null){
            between("command",commandStart,commandEnd);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * NOT BETWEEN 值1 AND 值2
     * @param commandStart       值1
     * @param commandEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper commandNotBetween(String commandStart,String commandEnd){
        if(commandStart!=null && commandEnd!=null){
            notBetween("command",commandStart,commandEnd);
        }
        return this;
     }


    /**
     * <p>执行命令</p>
     * LIKE '%值%'
     * @param command       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper commandLike(String command){
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
    public VizMcTaskEoQueryWrapper commandNotLike(String command){
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
    public VizMcTaskEoQueryWrapper commandLikeLeft(String command){
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
    public VizMcTaskEoQueryWrapper commandLikeRight(String command){
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
    public VizMcTaskEoQueryWrapper commandIsNull(){
        isNull("command");
        return this;
    }

    /**
     * <p>执行命令</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryWrapper commandIsNotNull(){
        isNotNull("command");
        return this;
    }

    /**
     * <p>执行命令</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryWrapper commandIn(Collection<String> value){
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
    public VizMcTaskEoQueryWrapper commandIn(String... values){
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
    public VizMcTaskEoQueryWrapper commandNotIn(Collection<String> value){
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
    public VizMcTaskEoQueryWrapper commandNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("command",values);
        }
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * 等于 =
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkExtendIdEq(Long fkExtendId){
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
    public VizMcTaskEoQueryWrapper fkExtendIdNe(Long fkExtendId){
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
    public VizMcTaskEoQueryWrapper fkExtendIdGt(Long fkExtendId){
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
    public VizMcTaskEoQueryWrapper fkExtendIdGe(Long fkExtendId){
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
    public VizMcTaskEoQueryWrapper fkExtendIdLt(Long fkExtendId){
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
    public VizMcTaskEoQueryWrapper fkExtendIdLe(Long fkExtendId){
        if(fkExtendId!=null){
            le("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * BETWEEN 值1 AND 值2
     * @param fkExtendIdStart       值1
     * @param fkExtendIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkExtendIdBetween(Long fkExtendIdStart,Long fkExtendIdEnd){
        if(fkExtendIdStart!=null && fkExtendIdEnd!=null){
            between("fk_extend_id",fkExtendIdStart,fkExtendIdEnd);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkExtendIdStart       值1
     * @param fkExtendIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkExtendIdNotBetween(Long fkExtendIdStart,Long fkExtendIdEnd){
        if(fkExtendIdStart!=null && fkExtendIdEnd!=null){
            notBetween("fk_extend_id",fkExtendIdStart,fkExtendIdEnd);
        }
        return this;
     }


    /**
     * <p>扩展外键ID</p>
     * LIKE '%值%'
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkExtendIdLike(Long fkExtendId){
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
    public VizMcTaskEoQueryWrapper fkExtendIdNotLike(Long fkExtendId){
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
    public VizMcTaskEoQueryWrapper fkExtendIdLikeLeft(Long fkExtendId){
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
    public VizMcTaskEoQueryWrapper fkExtendIdLikeRight(Long fkExtendId){
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
    public VizMcTaskEoQueryWrapper fkExtendIdIsNull(){
        isNull("fk_extend_id");
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkExtendIdIsNotNull(){
        isNotNull("fk_extend_id");
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryWrapper fkExtendIdIn(Collection<Long> value){
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
    public VizMcTaskEoQueryWrapper fkExtendIdIn(Long... values){
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
    public VizMcTaskEoQueryWrapper fkExtendIdNotIn(Collection<Long> value){
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
    public VizMcTaskEoQueryWrapper fkExtendIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_extend_id",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper statusEq(Integer status){
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
    public VizMcTaskEoQueryWrapper statusNe(Integer status){
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
    public VizMcTaskEoQueryWrapper statusGt(Integer status){
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
    public VizMcTaskEoQueryWrapper statusGe(Integer status){
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
    public VizMcTaskEoQueryWrapper statusLt(Integer status){
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
    public VizMcTaskEoQueryWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper statusLike(Integer status){
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
    public VizMcTaskEoQueryWrapper statusNotLike(Integer status){
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
    public VizMcTaskEoQueryWrapper statusLikeLeft(Integer status){
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
    public VizMcTaskEoQueryWrapper statusLikeRight(Integer status){
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
    public VizMcTaskEoQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryWrapper statusIn(Collection<Integer> value){
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
    public VizMcTaskEoQueryWrapper statusIn(Integer... values){
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
    public VizMcTaskEoQueryWrapper statusNotIn(Collection<Integer> value){
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
    public VizMcTaskEoQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * 等于 =
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper operateSysUserIdEq(Long operateSysUserId){
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
    public VizMcTaskEoQueryWrapper operateSysUserIdNe(Long operateSysUserId){
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
    public VizMcTaskEoQueryWrapper operateSysUserIdGt(Long operateSysUserId){
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
    public VizMcTaskEoQueryWrapper operateSysUserIdGe(Long operateSysUserId){
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
    public VizMcTaskEoQueryWrapper operateSysUserIdLt(Long operateSysUserId){
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
    public VizMcTaskEoQueryWrapper operateSysUserIdLe(Long operateSysUserId){
        if(operateSysUserId!=null){
            le("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * BETWEEN 值1 AND 值2
     * @param operateSysUserIdStart       值1
     * @param operateSysUserIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper operateSysUserIdBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
        if(operateSysUserIdStart!=null && operateSysUserIdEnd!=null){
            between("operate_sys_user_id",operateSysUserIdStart,operateSysUserIdEnd);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * NOT BETWEEN 值1 AND 值2
     * @param operateSysUserIdStart       值1
     * @param operateSysUserIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper operateSysUserIdNotBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
        if(operateSysUserIdStart!=null && operateSysUserIdEnd!=null){
            notBetween("operate_sys_user_id",operateSysUserIdStart,operateSysUserIdEnd);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值%'
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper operateSysUserIdLike(Long operateSysUserId){
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
    public VizMcTaskEoQueryWrapper operateSysUserIdNotLike(Long operateSysUserId){
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
    public VizMcTaskEoQueryWrapper operateSysUserIdLikeLeft(Long operateSysUserId){
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
    public VizMcTaskEoQueryWrapper operateSysUserIdLikeRight(Long operateSysUserId){
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
    public VizMcTaskEoQueryWrapper operateSysUserIdIsNull(){
        isNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryWrapper operateSysUserIdIsNotNull(){
        isNotNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryWrapper operateSysUserIdIn(Collection<Long> value){
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
    public VizMcTaskEoQueryWrapper operateSysUserIdIn(Long... values){
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
    public VizMcTaskEoQueryWrapper operateSysUserIdNotIn(Collection<Long> value){
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
    public VizMcTaskEoQueryWrapper operateSysUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("operate_sys_user_id",values);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper versionIdEq(Long versionId){
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
    public VizMcTaskEoQueryWrapper versionIdNe(Long versionId){
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
    public VizMcTaskEoQueryWrapper versionIdGt(Long versionId){
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
    public VizMcTaskEoQueryWrapper versionIdGe(Long versionId){
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
    public VizMcTaskEoQueryWrapper versionIdLt(Long versionId){
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
    public VizMcTaskEoQueryWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper versionIdLike(Long versionId){
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
    public VizMcTaskEoQueryWrapper versionIdNotLike(Long versionId){
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
    public VizMcTaskEoQueryWrapper versionIdLikeLeft(Long versionId){
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
    public VizMcTaskEoQueryWrapper versionIdLikeRight(Long versionId){
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
    public VizMcTaskEoQueryWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryWrapper versionIdIn(Collection<Long> value){
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
    public VizMcTaskEoQueryWrapper versionIdIn(Long... values){
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
    public VizMcTaskEoQueryWrapper versionIdNotIn(Collection<Long> value){
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
    public VizMcTaskEoQueryWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper createTimeEq(Date createTime){
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
    public VizMcTaskEoQueryWrapper createTimeNe(Date createTime){
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
    public VizMcTaskEoQueryWrapper createTimeGt(Date createTime){
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
    public VizMcTaskEoQueryWrapper createTimeGe(Date createTime){
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
    public VizMcTaskEoQueryWrapper createTimeLt(Date createTime){
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
    public VizMcTaskEoQueryWrapper createTimeLe(Date createTime){
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
    public VizMcTaskEoQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcTaskEoQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcTaskEoQueryWrapper createTimeLike(Date createTime){
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
    public VizMcTaskEoQueryWrapper createTimeNotLike(Date createTime){
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
    public VizMcTaskEoQueryWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcTaskEoQueryWrapper createTimeLikeRight(Date createTime){
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
    public VizMcTaskEoQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryWrapper createTimeIn(Collection<Date> value){
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
    public VizMcTaskEoQueryWrapper createTimeIn(Date... values){
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
    public VizMcTaskEoQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcTaskEoQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public VizMcTaskEoQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public VizMcTaskEoQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public VizMcTaskEoQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public VizMcTaskEoQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public VizMcTaskEoQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public VizMcTaskEoQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public VizMcTaskEoQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public VizMcTaskEoQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public VizMcTaskEoQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public VizMcTaskEoQueryWrapper lastUpdateTimeIn(Date... values){
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
    public VizMcTaskEoQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public VizMcTaskEoQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 等于 =
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper drEq(Integer dr){
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
    public VizMcTaskEoQueryWrapper drNe(Integer dr){
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
    public VizMcTaskEoQueryWrapper drGt(Integer dr){
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
    public VizMcTaskEoQueryWrapper drGe(Integer dr){
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
    public VizMcTaskEoQueryWrapper drLt(Integer dr){
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
    public VizMcTaskEoQueryWrapper drLe(Integer dr){
        if(dr!=null){
            le("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * BETWEEN 值1 AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper drBetween(Integer drStart,Integer drEnd){
        if(drStart!=null && drEnd!=null){
            between("dr",drStart,drEnd);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT BETWEEN 值1 AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcTaskEoQueryWrapper drNotBetween(Integer drStart,Integer drEnd){
        if(drStart!=null && drEnd!=null){
            notBetween("dr",drStart,drEnd);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值%'
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoQueryWrapper drLike(Integer dr){
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
    public VizMcTaskEoQueryWrapper drNotLike(Integer dr){
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
    public VizMcTaskEoQueryWrapper drLikeLeft(Integer dr){
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
    public VizMcTaskEoQueryWrapper drLikeRight(Integer dr){
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
    public VizMcTaskEoQueryWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoQueryWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoQueryWrapper drIn(Collection<Integer> value){
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
    public VizMcTaskEoQueryWrapper drIn(Integer... values){
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
    public VizMcTaskEoQueryWrapper drNotIn(Collection<Integer> value){
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
    public VizMcTaskEoQueryWrapper drNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dr",values);
        }
        return this;
    }


}
