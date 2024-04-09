package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.viz.entity.VizMcTaskEo;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 任务表
 * </p>
 * "viz_mc_task"
 * @author 18374
 */
public class VizMcTaskEoUpdateWrapper extends UpdateWrapper<VizMcTaskEo> {

    public static VizMcTaskEoUpdateWrapper wrapper() {
        return new VizMcTaskEoUpdateWrapper();
    }

    public VizMcTaskEoUpdateWrapper() {
        super();
    }

    public VizMcTaskEoUpdateWrapper(VizMcTaskEo entity) {
        super(entity);
    }

    /**
     * 记录id雪花算法
     */
    public VizMcTaskEoUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 租户id
     */
    public VizMcTaskEoUpdateWrapper setFkTenantId(Long fkTenantId) {
         set("fk_tenant_id",fkTenantId);
        return this;
    }
    /**
     * 任务类型ID
     */
    public VizMcTaskEoUpdateWrapper setFkVizMcTaskTypeId(Long fkVizMcTaskTypeId) {
         set("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        return this;
    }
    /**
     * 任务名称
     */
    public VizMcTaskEoUpdateWrapper setName(String name) {
         set("name",name);
        return this;
    }
    /**
     * 任务描述
     */
    public VizMcTaskEoUpdateWrapper setTaskDescription(String taskDescription) {
         set("task_description",taskDescription);
        return this;
    }
    /**
     * 执行命令
     */
    public VizMcTaskEoUpdateWrapper setCommand(String command) {
         set("command",command);
        return this;
    }
    /**
     * 扩展外键ID
     */
    public VizMcTaskEoUpdateWrapper setFkExtendId(Long fkExtendId) {
         set("fk_extend_id",fkExtendId);
        return this;
    }
    /**
     * 状态（-50：失败，0：等待中，10：运行中，50：成功）
     */
    public VizMcTaskEoUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 操作人员
     */
    public VizMcTaskEoUpdateWrapper setOperateSysUserId(Long operateSysUserId) {
         set("operate_sys_user_id",operateSysUserId);
        return this;
    }
    /**
     * 版本Id
     */
    public VizMcTaskEoUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 创建时间
     */
    public VizMcTaskEoUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 修改时间
     */
    public VizMcTaskEoUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 逻辑删除-默认dr=0
     */
    public VizMcTaskEoUpdateWrapper setDr(Integer dr) {
         set("dr",dr);
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper idLe(Long id){
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
    public VizMcTaskEoUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public VizMcTaskEoUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper idLikeRight(Long id){
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
    public VizMcTaskEoUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateWrapper idIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateWrapper idIn(Long... values){
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
    public VizMcTaskEoUpdateWrapper idNotIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>租户id</p>
     * 等于 = fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkTenantIdEq(Long fkTenantId){
        if(fkTenantId!=null){
            eq("fk_tenant_id",fkTenantId);
        }
        return this;
    }

    /**
     * <p>租户id</p>
     * 不等于 &lt;&gt; fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkTenantIdNe(Long fkTenantId){
        if(fkTenantId!=null){
            ne("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * 大于 &gt; fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkTenantIdGt(Long fkTenantId){
        if(fkTenantId!=null){
            gt("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * 大于等于 &gt;= fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkTenantIdGe(Long fkTenantId){
        if(fkTenantId!=null){
            ge("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * 小于 &lt; fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkTenantIdLt(Long fkTenantId){
        if(fkTenantId!=null){
            lt("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * 小于等于 &lt;= fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkTenantIdLe(Long fkTenantId){
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
    public VizMcTaskEoUpdateWrapper fkTenantIdBetween(Long fkTenantIdStart,Long fkTenantIdEnd){
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
    public VizMcTaskEoUpdateWrapper fkTenantIdNotBetween(Long fkTenantIdStart,Long fkTenantIdEnd){
        if(fkTenantIdStart!=null && fkTenantIdEnd!=null){
            notBetween("fk_tenant_id",fkTenantIdStart,fkTenantIdEnd);
        }
        return this;
     }


    /**
     * <p>租户id</p>
     * LIKE '%值%' fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkTenantIdLike(Long fkTenantId){
        if(fkTenantId!=null){
            like("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * NOT LIKE '%值%' fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkTenantIdNotLike(Long fkTenantId){
        if(fkTenantId!=null){
            notLike("fk_tenant_id",fkTenantId);
        }
        return this;
     }


    /**
     * <p>租户id</p>
     * LIKE '%值' fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkTenantIdLikeLeft(Long fkTenantId){
        if(fkTenantId!=null){
            likeLeft("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * LIKE '值%' fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkTenantIdLikeRight(Long fkTenantId){
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
    public VizMcTaskEoUpdateWrapper fkTenantIdIsNull(){
        isNull("fk_tenant_id");
        return this;
    }

    /**
     * <p>租户id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkTenantIdIsNotNull(){
        isNotNull("fk_tenant_id");
        return this;
    }

    /**
     * <p>租户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkTenantIdIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateWrapper fkTenantIdIn(Long... values){
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
    public VizMcTaskEoUpdateWrapper fkTenantIdNotIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateWrapper fkTenantIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tenant_id",values);
        }
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * 等于 = fkVizMcTaskTypeId
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdEq(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            eq("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * 不等于 &lt;&gt; fkVizMcTaskTypeId
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdNe(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            ne("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * 大于 &gt; fkVizMcTaskTypeId
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdGt(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            gt("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * 大于等于 &gt;= fkVizMcTaskTypeId
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdGe(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            ge("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * 小于 &lt; fkVizMcTaskTypeId
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdLt(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            lt("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * 小于等于 &lt;= fkVizMcTaskTypeId
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdLe(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdBetween(Long fkVizMcTaskTypeIdStart,Long fkVizMcTaskTypeIdEnd){
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
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdNotBetween(Long fkVizMcTaskTypeIdStart,Long fkVizMcTaskTypeIdEnd){
        if(fkVizMcTaskTypeIdStart!=null && fkVizMcTaskTypeIdEnd!=null){
            notBetween("fk_viz_mc_task_type_id",fkVizMcTaskTypeIdStart,fkVizMcTaskTypeIdEnd);
        }
        return this;
     }


    /**
     * <p>任务类型ID</p>
     * LIKE '%值%' fkVizMcTaskTypeId
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdLike(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            like("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * NOT LIKE '%值%' fkVizMcTaskTypeId
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdNotLike(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            notLike("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }


    /**
     * <p>任务类型ID</p>
     * LIKE '%值' fkVizMcTaskTypeId
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdLikeLeft(Long fkVizMcTaskTypeId){
        if(fkVizMcTaskTypeId!=null){
            likeLeft("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * LIKE '值%' fkVizMcTaskTypeId
     * @param fkVizMcTaskTypeId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdLikeRight(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdIsNull(){
        isNull("fk_viz_mc_task_type_id");
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdIsNotNull(){
        isNotNull("fk_viz_mc_task_type_id");
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdIn(Long... values){
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
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdNotIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateWrapper fkVizMcTaskTypeIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_viz_mc_task_type_id",values);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * 等于 = name
     * @param name       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper nameEq(String name){
        if(name!=null){
            eq("name",name);
        }
        return this;
    }

    /**
     * <p>任务名称</p>
     * 不等于 &lt;&gt; name
     * @param name       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper nameNe(String name){
        if(name!=null){
            ne("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 大于 &gt; name
     * @param name       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper nameGt(String name){
        if(name!=null){
            gt("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 大于等于 &gt;= name
     * @param name       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper nameGe(String name){
        if(name!=null){
            ge("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 小于 &lt; name
     * @param name       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper nameLt(String name){
        if(name!=null){
            lt("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * 小于等于 &lt;= name
     * @param name       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper nameLe(String name){
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
    public VizMcTaskEoUpdateWrapper nameBetween(String nameStart,String nameEnd){
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
    public VizMcTaskEoUpdateWrapper nameNotBetween(String nameStart,String nameEnd){
        if(nameStart!=null && nameEnd!=null){
            notBetween("name",nameStart,nameEnd);
        }
        return this;
     }


    /**
     * <p>任务名称</p>
     * LIKE '%值%' name
     * @param name       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper nameLike(String name){
        if(name!=null){
            like("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * NOT LIKE '%值%' name
     * @param name       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper nameNotLike(String name){
        if(name!=null){
            notLike("name",name);
        }
        return this;
     }


    /**
     * <p>任务名称</p>
     * LIKE '%值' name
     * @param name       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper nameLikeLeft(String name){
        if(name!=null){
            likeLeft("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * LIKE '值%' name
     * @param name       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper nameLikeRight(String name){
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
    public VizMcTaskEoUpdateWrapper nameIsNull(){
        isNull("name");
        return this;
    }

    /**
     * <p>任务名称</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateWrapper nameIsNotNull(){
        isNotNull("name");
        return this;
    }

    /**
     * <p>任务名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateWrapper nameIn(Collection<String> value){
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
    public VizMcTaskEoUpdateWrapper nameIn(String... values){
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
    public VizMcTaskEoUpdateWrapper nameNotIn(Collection<String> value){
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
    public VizMcTaskEoUpdateWrapper nameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("name",values);
        }
        return this;
    }

    /**
     * <p>任务描述</p>
     * 等于 = taskDescription
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper taskDescriptionEq(String taskDescription){
        if(taskDescription!=null){
            eq("task_description",taskDescription);
        }
        return this;
    }

    /**
     * <p>任务描述</p>
     * 不等于 &lt;&gt; taskDescription
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper taskDescriptionNe(String taskDescription){
        if(taskDescription!=null){
            ne("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * 大于 &gt; taskDescription
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper taskDescriptionGt(String taskDescription){
        if(taskDescription!=null){
            gt("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * 大于等于 &gt;= taskDescription
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper taskDescriptionGe(String taskDescription){
        if(taskDescription!=null){
            ge("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * 小于 &lt; taskDescription
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper taskDescriptionLt(String taskDescription){
        if(taskDescription!=null){
            lt("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * 小于等于 &lt;= taskDescription
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper taskDescriptionLe(String taskDescription){
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
    public VizMcTaskEoUpdateWrapper taskDescriptionBetween(String taskDescriptionStart,String taskDescriptionEnd){
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
    public VizMcTaskEoUpdateWrapper taskDescriptionNotBetween(String taskDescriptionStart,String taskDescriptionEnd){
        if(taskDescriptionStart!=null && taskDescriptionEnd!=null){
            notBetween("task_description",taskDescriptionStart,taskDescriptionEnd);
        }
        return this;
     }


    /**
     * <p>任务描述</p>
     * LIKE '%值%' taskDescription
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper taskDescriptionLike(String taskDescription){
        if(taskDescription!=null){
            like("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * NOT LIKE '%值%' taskDescription
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper taskDescriptionNotLike(String taskDescription){
        if(taskDescription!=null){
            notLike("task_description",taskDescription);
        }
        return this;
     }


    /**
     * <p>任务描述</p>
     * LIKE '%值' taskDescription
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper taskDescriptionLikeLeft(String taskDescription){
        if(taskDescription!=null){
            likeLeft("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * LIKE '值%' taskDescription
     * @param taskDescription       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper taskDescriptionLikeRight(String taskDescription){
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
    public VizMcTaskEoUpdateWrapper taskDescriptionIsNull(){
        isNull("task_description");
        return this;
    }

    /**
     * <p>任务描述</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateWrapper taskDescriptionIsNotNull(){
        isNotNull("task_description");
        return this;
    }

    /**
     * <p>任务描述</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateWrapper taskDescriptionIn(Collection<String> value){
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
    public VizMcTaskEoUpdateWrapper taskDescriptionIn(String... values){
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
    public VizMcTaskEoUpdateWrapper taskDescriptionNotIn(Collection<String> value){
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
    public VizMcTaskEoUpdateWrapper taskDescriptionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("task_description",values);
        }
        return this;
    }

    /**
     * <p>执行命令</p>
     * 等于 = command
     * @param command       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper commandEq(String command){
        if(command!=null){
            eq("command",command);
        }
        return this;
    }

    /**
     * <p>执行命令</p>
     * 不等于 &lt;&gt; command
     * @param command       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper commandNe(String command){
        if(command!=null){
            ne("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * 大于 &gt; command
     * @param command       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper commandGt(String command){
        if(command!=null){
            gt("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * 大于等于 &gt;= command
     * @param command       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper commandGe(String command){
        if(command!=null){
            ge("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * 小于 &lt; command
     * @param command       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper commandLt(String command){
        if(command!=null){
            lt("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * 小于等于 &lt;= command
     * @param command       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper commandLe(String command){
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
    public VizMcTaskEoUpdateWrapper commandBetween(String commandStart,String commandEnd){
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
    public VizMcTaskEoUpdateWrapper commandNotBetween(String commandStart,String commandEnd){
        if(commandStart!=null && commandEnd!=null){
            notBetween("command",commandStart,commandEnd);
        }
        return this;
     }


    /**
     * <p>执行命令</p>
     * LIKE '%值%' command
     * @param command       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper commandLike(String command){
        if(command!=null){
            like("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * NOT LIKE '%值%' command
     * @param command       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper commandNotLike(String command){
        if(command!=null){
            notLike("command",command);
        }
        return this;
     }


    /**
     * <p>执行命令</p>
     * LIKE '%值' command
     * @param command       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper commandLikeLeft(String command){
        if(command!=null){
            likeLeft("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * LIKE '值%' command
     * @param command       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper commandLikeRight(String command){
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
    public VizMcTaskEoUpdateWrapper commandIsNull(){
        isNull("command");
        return this;
    }

    /**
     * <p>执行命令</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateWrapper commandIsNotNull(){
        isNotNull("command");
        return this;
    }

    /**
     * <p>执行命令</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateWrapper commandIn(Collection<String> value){
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
    public VizMcTaskEoUpdateWrapper commandIn(String... values){
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
    public VizMcTaskEoUpdateWrapper commandNotIn(Collection<String> value){
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
    public VizMcTaskEoUpdateWrapper commandNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("command",values);
        }
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * 等于 = fkExtendId
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkExtendIdEq(Long fkExtendId){
        if(fkExtendId!=null){
            eq("fk_extend_id",fkExtendId);
        }
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * 不等于 &lt;&gt; fkExtendId
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkExtendIdNe(Long fkExtendId){
        if(fkExtendId!=null){
            ne("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * 大于 &gt; fkExtendId
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkExtendIdGt(Long fkExtendId){
        if(fkExtendId!=null){
            gt("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * 大于等于 &gt;= fkExtendId
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkExtendIdGe(Long fkExtendId){
        if(fkExtendId!=null){
            ge("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * 小于 &lt; fkExtendId
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkExtendIdLt(Long fkExtendId){
        if(fkExtendId!=null){
            lt("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * 小于等于 &lt;= fkExtendId
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkExtendIdLe(Long fkExtendId){
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
    public VizMcTaskEoUpdateWrapper fkExtendIdBetween(Long fkExtendIdStart,Long fkExtendIdEnd){
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
    public VizMcTaskEoUpdateWrapper fkExtendIdNotBetween(Long fkExtendIdStart,Long fkExtendIdEnd){
        if(fkExtendIdStart!=null && fkExtendIdEnd!=null){
            notBetween("fk_extend_id",fkExtendIdStart,fkExtendIdEnd);
        }
        return this;
     }


    /**
     * <p>扩展外键ID</p>
     * LIKE '%值%' fkExtendId
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkExtendIdLike(Long fkExtendId){
        if(fkExtendId!=null){
            like("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * NOT LIKE '%值%' fkExtendId
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkExtendIdNotLike(Long fkExtendId){
        if(fkExtendId!=null){
            notLike("fk_extend_id",fkExtendId);
        }
        return this;
     }


    /**
     * <p>扩展外键ID</p>
     * LIKE '%值' fkExtendId
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkExtendIdLikeLeft(Long fkExtendId){
        if(fkExtendId!=null){
            likeLeft("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * LIKE '值%' fkExtendId
     * @param fkExtendId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkExtendIdLikeRight(Long fkExtendId){
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
    public VizMcTaskEoUpdateWrapper fkExtendIdIsNull(){
        isNull("fk_extend_id");
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkExtendIdIsNotNull(){
        isNotNull("fk_extend_id");
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateWrapper fkExtendIdIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateWrapper fkExtendIdIn(Long... values){
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
    public VizMcTaskEoUpdateWrapper fkExtendIdNotIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateWrapper fkExtendIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_extend_id",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper statusLe(Integer status){
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
    public VizMcTaskEoUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
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
    public VizMcTaskEoUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper statusLikeRight(Integer status){
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
    public VizMcTaskEoUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateWrapper statusIn(Collection<Integer> value){
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
    public VizMcTaskEoUpdateWrapper statusIn(Integer... values){
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
    public VizMcTaskEoUpdateWrapper statusNotIn(Collection<Integer> value){
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
    public VizMcTaskEoUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * 等于 = operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper operateSysUserIdEq(Long operateSysUserId){
        if(operateSysUserId!=null){
            eq("operate_sys_user_id",operateSysUserId);
        }
        return this;
    }

    /**
     * <p>操作人员</p>
     * 不等于 &lt;&gt; operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper operateSysUserIdNe(Long operateSysUserId){
        if(operateSysUserId!=null){
            ne("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 大于 &gt; operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper operateSysUserIdGt(Long operateSysUserId){
        if(operateSysUserId!=null){
            gt("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 大于等于 &gt;= operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper operateSysUserIdGe(Long operateSysUserId){
        if(operateSysUserId!=null){
            ge("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 小于 &lt; operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper operateSysUserIdLt(Long operateSysUserId){
        if(operateSysUserId!=null){
            lt("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * 小于等于 &lt;= operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper operateSysUserIdLe(Long operateSysUserId){
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
    public VizMcTaskEoUpdateWrapper operateSysUserIdBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
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
    public VizMcTaskEoUpdateWrapper operateSysUserIdNotBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
        if(operateSysUserIdStart!=null && operateSysUserIdEnd!=null){
            notBetween("operate_sys_user_id",operateSysUserIdStart,operateSysUserIdEnd);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值%' operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper operateSysUserIdLike(Long operateSysUserId){
        if(operateSysUserId!=null){
            like("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * NOT LIKE '%值%' operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper operateSysUserIdNotLike(Long operateSysUserId){
        if(operateSysUserId!=null){
            notLike("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值' operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper operateSysUserIdLikeLeft(Long operateSysUserId){
        if(operateSysUserId!=null){
            likeLeft("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * LIKE '值%' operateSysUserId
     * @param operateSysUserId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper operateSysUserIdLikeRight(Long operateSysUserId){
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
    public VizMcTaskEoUpdateWrapper operateSysUserIdIsNull(){
        isNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateWrapper operateSysUserIdIsNotNull(){
        isNotNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateWrapper operateSysUserIdIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateWrapper operateSysUserIdIn(Long... values){
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
    public VizMcTaskEoUpdateWrapper operateSysUserIdNotIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateWrapper operateSysUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("operate_sys_user_id",values);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 等于 = versionId
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 不等于 &lt;&gt; versionId
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于 &gt; versionId
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 大于等于 &gt;= versionId
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于 &lt; versionId
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * 小于等于 &lt;= versionId
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper versionIdLe(Long versionId){
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
    public VizMcTaskEoUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcTaskEoUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值' versionId
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * LIKE '值%' versionId
     * @param versionId       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper versionIdLikeRight(Long versionId){
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
    public VizMcTaskEoUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateWrapper versionIdIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateWrapper versionIdIn(Long... values){
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
    public VizMcTaskEoUpdateWrapper versionIdNotIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper createTimeEq(Date createTime){
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
    public VizMcTaskEoUpdateWrapper createTimeNe(Date createTime){
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
    public VizMcTaskEoUpdateWrapper createTimeGt(Date createTime){
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
    public VizMcTaskEoUpdateWrapper createTimeGe(Date createTime){
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
    public VizMcTaskEoUpdateWrapper createTimeLt(Date createTime){
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
    public VizMcTaskEoUpdateWrapper createTimeLe(Date createTime){
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
    public VizMcTaskEoUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcTaskEoUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcTaskEoUpdateWrapper createTimeLike(Date createTime){
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
    public VizMcTaskEoUpdateWrapper createTimeNotLike(Date createTime){
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
    public VizMcTaskEoUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcTaskEoUpdateWrapper createTimeLikeRight(Date createTime){
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
    public VizMcTaskEoUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateWrapper createTimeIn(Collection<Date> value){
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
    public VizMcTaskEoUpdateWrapper createTimeIn(Date... values){
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
    public VizMcTaskEoUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcTaskEoUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>修改时间</p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public VizMcTaskEoUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcTaskEoUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public VizMcTaskEoUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public VizMcTaskEoUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public VizMcTaskEoUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public VizMcTaskEoUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 等于 = dr
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper drEq(Integer dr){
        if(dr!=null){
            eq("dr",dr);
        }
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 不等于 &lt;&gt; dr
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper drNe(Integer dr){
        if(dr!=null){
            ne("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 大于 &gt; dr
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper drGt(Integer dr){
        if(dr!=null){
            gt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 大于等于 &gt;= dr
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper drGe(Integer dr){
        if(dr!=null){
            ge("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 小于 &lt; dr
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper drLt(Integer dr){
        if(dr!=null){
            lt("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * 小于等于 &lt;= dr
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper drLe(Integer dr){
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
    public VizMcTaskEoUpdateWrapper drBetween(Integer drStart,Integer drEnd){
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
    public VizMcTaskEoUpdateWrapper drNotBetween(Integer drStart,Integer drEnd){
        if(drStart!=null && drEnd!=null){
            notBetween("dr",drStart,drEnd);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值%' dr
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper drLike(Integer dr){
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT LIKE '%值%' dr
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper drNotLike(Integer dr){
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值' dr
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper drLikeLeft(Integer dr){
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '值%' dr
     * @param dr       值
     * @return children
     */
    public VizMcTaskEoUpdateWrapper drLikeRight(Integer dr){
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
    public VizMcTaskEoUpdateWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateWrapper drIn(Collection<Integer> value){
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
    public VizMcTaskEoUpdateWrapper drIn(Integer... values){
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
    public VizMcTaskEoUpdateWrapper drNotIn(Collection<Integer> value){
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
    public VizMcTaskEoUpdateWrapper drNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dr",values);
        }
        return this;
    }


}
