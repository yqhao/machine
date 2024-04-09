package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskTenant;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 租户更新机器任务表
 * </p>
 * "mc_update_device_task_tenant"
 * @author 18374
 */
public class McUpdateDeviceTaskTenantUpdateWrapper extends UpdateWrapper<McUpdateDeviceTaskTenant> {

    public static McUpdateDeviceTaskTenantUpdateWrapper wrapper() {
        return new McUpdateDeviceTaskTenantUpdateWrapper();
    }

    public McUpdateDeviceTaskTenantUpdateWrapper() {
        super();
    }

    public McUpdateDeviceTaskTenantUpdateWrapper(McUpdateDeviceTaskTenant entity) {
        super(entity);
    }

    /**
     * 记录id自动增长
     */
    public McUpdateDeviceTaskTenantUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 更新机器任务表记录Id
     */
    public McUpdateDeviceTaskTenantUpdateWrapper setFkMcUpdateDeviceTaskId(Long fkMcUpdateDeviceTaskId) {
         set("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        return this;
    }
    /**
     * 租户Id
     */
    public McUpdateDeviceTaskTenantUpdateWrapper setFkTenantId(Long fkTenantId) {
         set("fk_tenant_id",fkTenantId);
        return this;
    }
    /**
     * 状态（-50：删除，50：正常）
     */
    public McUpdateDeviceTaskTenantUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 版本Id
     */
    public McUpdateDeviceTaskTenantUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 创建时间
     */
    public McUpdateDeviceTaskTenantUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 修改时间
     */
    public McUpdateDeviceTaskTenantUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper idEq(Long id){
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
    public McUpdateDeviceTaskTenantUpdateWrapper idNe(Long id){
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
    public McUpdateDeviceTaskTenantUpdateWrapper idGt(Long id){
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
    public McUpdateDeviceTaskTenantUpdateWrapper idGe(Long id){
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
    public McUpdateDeviceTaskTenantUpdateWrapper idLt(Long id){
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
    public McUpdateDeviceTaskTenantUpdateWrapper idLe(Long id){
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
    public McUpdateDeviceTaskTenantUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public McUpdateDeviceTaskTenantUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public McUpdateDeviceTaskTenantUpdateWrapper idLike(Long id){
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
    public McUpdateDeviceTaskTenantUpdateWrapper idNotLike(Long id){
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
    public McUpdateDeviceTaskTenantUpdateWrapper idLikeLeft(Long id){
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
    public McUpdateDeviceTaskTenantUpdateWrapper idLikeRight(Long id){
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
    public McUpdateDeviceTaskTenantUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper idIn(Collection<Long> value){
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
    public McUpdateDeviceTaskTenantUpdateWrapper idIn(Long... values){
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
    public McUpdateDeviceTaskTenantUpdateWrapper idNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskTenantUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>更新机器任务表记录Id</p>
     * 等于 = fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdEq(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            eq("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
    }

    /**
     * <p>更新机器任务表记录Id</p>
     * 不等于 &lt;&gt; fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdNe(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            ne("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表记录Id</p>
     * 大于 &gt; fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdGt(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            gt("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表记录Id</p>
     * 大于等于 &gt;= fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdGe(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            ge("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表记录Id</p>
     * 小于 &lt; fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdLt(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            lt("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表记录Id</p>
     * 小于等于 &lt;= fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdLe(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            le("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表记录Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceTaskIdStart       值1
     * @param fkMcUpdateDeviceTaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdBetween(Long fkMcUpdateDeviceTaskIdStart,Long fkMcUpdateDeviceTaskIdEnd){
        if(fkMcUpdateDeviceTaskIdStart!=null && fkMcUpdateDeviceTaskIdEnd!=null){
            between("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskIdStart,fkMcUpdateDeviceTaskIdEnd);
        }
        return this;
     }

    /**
     * <p>更新机器任务表记录Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcUpdateDeviceTaskIdStart       值1
     * @param fkMcUpdateDeviceTaskIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdNotBetween(Long fkMcUpdateDeviceTaskIdStart,Long fkMcUpdateDeviceTaskIdEnd){
        if(fkMcUpdateDeviceTaskIdStart!=null && fkMcUpdateDeviceTaskIdEnd!=null){
            notBetween("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskIdStart,fkMcUpdateDeviceTaskIdEnd);
        }
        return this;
     }


    /**
     * <p>更新机器任务表记录Id</p>
     * LIKE '%值%' fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdLike(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            like("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表记录Id</p>
     * NOT LIKE '%值%' fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdNotLike(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            notLike("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }


    /**
     * <p>更新机器任务表记录Id</p>
     * LIKE '%值' fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdLikeLeft(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            likeLeft("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表记录Id</p>
     * LIKE '值%' fkMcUpdateDeviceTaskId
     * @param fkMcUpdateDeviceTaskId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdLikeRight(Long fkMcUpdateDeviceTaskId){
        if(fkMcUpdateDeviceTaskId!=null){
            likeRight("fk_mc_update_device_task_id",fkMcUpdateDeviceTaskId);
        }
        return this;
     }

    /**
     * <p>更新机器任务表记录Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdIsNull(){
        isNull("fk_mc_update_device_task_id");
        return this;
    }

    /**
     * <p>更新机器任务表记录Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdIsNotNull(){
        isNotNull("fk_mc_update_device_task_id");
        return this;
    }

    /**
     * <p>更新机器任务表记录Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_update_device_task_id",value);
        }
        return this;
    }

    /**
     * <p>更新机器任务表记录Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_update_device_task_id",values);
        }
        return this;
    }

    /**
     * <p>更新机器任务表记录Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_update_device_task_id",value);
        }
        return this;
    }

    /**
     * <p>更新机器任务表记录Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkMcUpdateDeviceTaskIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_update_device_task_id",values);
        }
        return this;
    }

    /**
     * <p>租户Id</p>
     * 等于 = fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdEq(Long fkTenantId){
        if(fkTenantId!=null){
            eq("fk_tenant_id",fkTenantId);
        }
        return this;
    }

    /**
     * <p>租户Id</p>
     * 不等于 &lt;&gt; fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdNe(Long fkTenantId){
        if(fkTenantId!=null){
            ne("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户Id</p>
     * 大于 &gt; fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdGt(Long fkTenantId){
        if(fkTenantId!=null){
            gt("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户Id</p>
     * 大于等于 &gt;= fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdGe(Long fkTenantId){
        if(fkTenantId!=null){
            ge("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户Id</p>
     * 小于 &lt; fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdLt(Long fkTenantId){
        if(fkTenantId!=null){
            lt("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户Id</p>
     * 小于等于 &lt;= fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdLe(Long fkTenantId){
        if(fkTenantId!=null){
            le("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkTenantIdStart       值1
     * @param fkTenantIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdBetween(Long fkTenantIdStart,Long fkTenantIdEnd){
        if(fkTenantIdStart!=null && fkTenantIdEnd!=null){
            between("fk_tenant_id",fkTenantIdStart,fkTenantIdEnd);
        }
        return this;
     }

    /**
     * <p>租户Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkTenantIdStart       值1
     * @param fkTenantIdEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdNotBetween(Long fkTenantIdStart,Long fkTenantIdEnd){
        if(fkTenantIdStart!=null && fkTenantIdEnd!=null){
            notBetween("fk_tenant_id",fkTenantIdStart,fkTenantIdEnd);
        }
        return this;
     }


    /**
     * <p>租户Id</p>
     * LIKE '%值%' fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdLike(Long fkTenantId){
        if(fkTenantId!=null){
            like("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户Id</p>
     * NOT LIKE '%值%' fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdNotLike(Long fkTenantId){
        if(fkTenantId!=null){
            notLike("fk_tenant_id",fkTenantId);
        }
        return this;
     }


    /**
     * <p>租户Id</p>
     * LIKE '%值' fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdLikeLeft(Long fkTenantId){
        if(fkTenantId!=null){
            likeLeft("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户Id</p>
     * LIKE '值%' fkTenantId
     * @param fkTenantId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdLikeRight(Long fkTenantId){
        if(fkTenantId!=null){
            likeRight("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户Id</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdIsNull(){
        isNull("fk_tenant_id");
        return this;
    }

    /**
     * <p>租户Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdIsNotNull(){
        isNotNull("fk_tenant_id");
        return this;
    }

    /**
     * <p>租户Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_tenant_id",value);
        }
        return this;
    }

    /**
     * <p>租户Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_tenant_id",values);
        }
        return this;
    }

    /**
     * <p>租户Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_tenant_id",value);
        }
        return this;
    }

    /**
     * <p>租户Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper fkTenantIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tenant_id",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IS NULL
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态（-50：删除，50：正常）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>版本Id</p>
     * 等于 = versionId
     * @param versionId       值
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdEq(Long versionId){
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
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdNe(Long versionId){
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
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdGt(Long versionId){
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
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdGe(Long versionId){
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
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdLt(Long versionId){
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
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdLe(Long versionId){
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
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdLike(Long versionId){
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
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdNotLike(Long versionId){
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
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdLikeLeft(Long versionId){
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
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdLikeRight(Long versionId){
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
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdIn(Collection<Long> value){
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
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdIn(Long... values){
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
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdNotIn(Collection<Long> value){
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
    public McUpdateDeviceTaskTenantUpdateWrapper versionIdNotIn(Long... values){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeEq(Date createTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeNe(Date createTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeGt(Date createTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeGe(Date createTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeLt(Date createTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeLe(Date createTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeLike(Date createTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeNotLike(Date createTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeLikeRight(Date createTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeIn(Date... values){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskTenantUpdateWrapper createTimeNotIn(Date... values){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McUpdateDeviceTaskTenantUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
