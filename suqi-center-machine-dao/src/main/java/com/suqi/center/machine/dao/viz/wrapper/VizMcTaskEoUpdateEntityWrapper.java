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
public class VizMcTaskEoUpdateEntityWrapper extends UpdateWrapper<VizMcTaskEo> {

    public static VizMcTaskEoUpdateEntityWrapper wrapper(VizMcTaskEo entity) {
        return new VizMcTaskEoUpdateEntityWrapper(entity);
    }

    private VizMcTaskEo entity;

    public VizMcTaskEoUpdateEntityWrapper(VizMcTaskEo entity) {
        this.entity=entity;
    }

    /**
     * 记录id雪花算法
     */
    public VizMcTaskEoUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 租户id
     */
    public VizMcTaskEoUpdateEntityWrapper setFkTenantId(Long fkTenantId) {
         set("fk_tenant_id",fkTenantId);
        return this;
    }
    /**
     * 任务类型ID
     */
    public VizMcTaskEoUpdateEntityWrapper setFkVizMcTaskTypeId(Long fkVizMcTaskTypeId) {
         set("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        return this;
    }
    /**
     * 任务名称
     */
    public VizMcTaskEoUpdateEntityWrapper setName(String name) {
         set("name",name);
        return this;
    }
    /**
     * 任务描述
     */
    public VizMcTaskEoUpdateEntityWrapper setTaskDescription(String taskDescription) {
         set("task_description",taskDescription);
        return this;
    }
    /**
     * 执行命令
     */
    public VizMcTaskEoUpdateEntityWrapper setCommand(String command) {
         set("command",command);
        return this;
    }
    /**
     * 扩展外键ID
     */
    public VizMcTaskEoUpdateEntityWrapper setFkExtendId(Long fkExtendId) {
         set("fk_extend_id",fkExtendId);
        return this;
    }
    /**
     * 状态（-50：失败，0：等待中，10：运行中，50：成功）
     */
    public VizMcTaskEoUpdateEntityWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 操作人员
     */
    public VizMcTaskEoUpdateEntityWrapper setOperateSysUserId(Long operateSysUserId) {
         set("operate_sys_user_id",operateSysUserId);
        return this;
    }
    /**
     * 版本Id
     */
    public VizMcTaskEoUpdateEntityWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 创建时间
     */
    public VizMcTaskEoUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 修改时间
     */
    public VizMcTaskEoUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 逻辑删除-默认dr=0
     */
    public VizMcTaskEoUpdateEntityWrapper setDr(Integer dr) {
         set("dr",dr);
        return this;
    }

    protected VizMcTaskEo entity() {
        if(entity==null){
            throw new NullPointerException("VizMcTaskEo is null");
        }
        return entity;
    }

    /**
     * 记录id雪花算法
     */
    public VizMcTaskEoUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 租户id
     */
    public VizMcTaskEoUpdateEntityWrapper setFkTenantId() {
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null){
            set("fk_tenant_id",fkTenantId);
        }
        return this;
    }
    /**
     * 任务类型ID
     */
    public VizMcTaskEoUpdateEntityWrapper setFkVizMcTaskTypeId() {
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null){
            set("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
    }
    /**
     * 任务名称
     */
    public VizMcTaskEoUpdateEntityWrapper setName() {
        String name =entity().getName();
        if(name!=null){
            set("name",name);
        }
        return this;
    }
    /**
     * 任务描述
     */
    public VizMcTaskEoUpdateEntityWrapper setTaskDescription() {
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null){
            set("task_description",taskDescription);
        }
        return this;
    }
    /**
     * 执行命令
     */
    public VizMcTaskEoUpdateEntityWrapper setCommand() {
        String command =entity().getCommand();
        if(command!=null){
            set("command",command);
        }
        return this;
    }
    /**
     * 扩展外键ID
     */
    public VizMcTaskEoUpdateEntityWrapper setFkExtendId() {
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null){
            set("fk_extend_id",fkExtendId);
        }
        return this;
    }
    /**
     * 状态（-50：失败，0：等待中，10：运行中，50：成功）
     */
    public VizMcTaskEoUpdateEntityWrapper setStatus() {
        Integer status =entity().getStatus();
        if(status!=null){
            set("status",status);
        }
        return this;
    }
    /**
     * 操作人员
     */
    public VizMcTaskEoUpdateEntityWrapper setOperateSysUserId() {
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            set("operate_sys_user_id",operateSysUserId);
        }
        return this;
    }
    /**
     * 版本Id
     */
    public VizMcTaskEoUpdateEntityWrapper setVersionId() {
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            set("version_id",versionId);
        }
        return this;
    }
    /**
     * 创建时间
     */
    public VizMcTaskEoUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * 修改时间
     */
    public VizMcTaskEoUpdateEntityWrapper setLastUpdateTime() {
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            set("last_update_time",lastUpdateTime);
        }
        return this;
    }
    /**
     * 逻辑删除-默认dr=0
     */
    public VizMcTaskEoUpdateEntityWrapper setDr() {
        Integer dr =entity().getDr();
        if(dr!=null){
            set("dr",dr);
        }
        return this;
    }
    /**
     * <p>记录id雪花算法</p>
     * 等于 = entity().getId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper idEq(){
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
    public VizMcTaskEoUpdateEntityWrapper idNe(){
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
    public VizMcTaskEoUpdateEntityWrapper idGt(){
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
    public VizMcTaskEoUpdateEntityWrapper idGe(){
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
    public VizMcTaskEoUpdateEntityWrapper idLt(){
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
    public VizMcTaskEoUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper idBetween(Long idEnd){
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
    public VizMcTaskEoUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public VizMcTaskEoUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public VizMcTaskEoUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值%' entity().getId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id雪花算法</p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id雪花算法</p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper idLikeRight(){
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
    public VizMcTaskEoUpdateEntityWrapper idEq(Long id){
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
    public VizMcTaskEoUpdateEntityWrapper idNe(Long id){
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
    public VizMcTaskEoUpdateEntityWrapper idGt(Long id){
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
    public VizMcTaskEoUpdateEntityWrapper idGe(Long id){
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
    public VizMcTaskEoUpdateEntityWrapper idLt(Long id){
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
    public VizMcTaskEoUpdateEntityWrapper idLe(Long id){
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
    public VizMcTaskEoUpdateEntityWrapper idLike(Long id){
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
    public VizMcTaskEoUpdateEntityWrapper idNotLike(Long id){
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
    public VizMcTaskEoUpdateEntityWrapper idLikeLeft(Long id){
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
    public VizMcTaskEoUpdateEntityWrapper idLikeRight(Long id){
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
    public VizMcTaskEoUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id雪花算法</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper idIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateEntityWrapper idIn(Long... values){
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
    public VizMcTaskEoUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateEntityWrapper idNotIn(Long... values){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdEq(){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdNe(){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdGt(){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdGe(){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdLt(){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdLe(){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null){
            le("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * BETWEEN  entity().getFkTenantId() AND 值2
     * @param fkTenantIdEnd      值2
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdBetween(Long fkTenantIdEnd){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdNotBetween(Long fkTenantIdEnd){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdBetween(Long fkTenantIdStart,Long fkTenantIdEnd){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdNotBetween(Long fkTenantIdStart,Long fkTenantIdEnd){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null && fkTenantIdEnd!=null){
            notBetween("fk_tenant_id",fkTenantIdStart,fkTenantIdEnd);
        }
        return this;
     }


    /**
     * <p>租户id</p>
     * LIKE '%值%' entity().getFkTenantId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdLike(){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null){
            like("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * NOT LIKE '%值%' entity().getFkTenantId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdNotLike(){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null){
            notLike("fk_tenant_id",fkTenantId);
        }
        return this;
     }


    /**
     * <p>租户id</p>
     * LIKE '%值' entity().getFkTenantId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdLikeLeft(){
        Long fkTenantId =entity().getFkTenantId();
        if(fkTenantId!=null){
            likeLeft("fk_tenant_id",fkTenantId);
        }
        return this;
     }

    /**
     * <p>租户id</p>
     * LIKE '值%' entity().getFkTenantId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdLikeRight(){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdEq(Long fkTenantId){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdNe(Long fkTenantId){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdGt(Long fkTenantId){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdGe(Long fkTenantId){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdLt(Long fkTenantId){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdLe(Long fkTenantId){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdLike(Long fkTenantId){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdNotLike(Long fkTenantId){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdLikeLeft(Long fkTenantId){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdLikeRight(Long fkTenantId){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdIsNull(){
        isNull("fk_tenant_id");
        return this;
    }

    /**
     * <p>租户id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdIsNotNull(){
        isNotNull("fk_tenant_id");
        return this;
    }

    /**
     * <p>租户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdIn(Long... values){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdNotIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateEntityWrapper fkTenantIdNotIn(Long... values){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdEq(){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdNe(){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdGt(){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdGe(){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdLt(){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdLe(){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null){
            le("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * BETWEEN  entity().getFkVizMcTaskTypeId() AND 值2
     * @param fkVizMcTaskTypeIdEnd      值2
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdBetween(Long fkVizMcTaskTypeIdEnd){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdNotBetween(Long fkVizMcTaskTypeIdEnd){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdBetween(Long fkVizMcTaskTypeIdStart,Long fkVizMcTaskTypeIdEnd){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdNotBetween(Long fkVizMcTaskTypeIdStart,Long fkVizMcTaskTypeIdEnd){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null && fkVizMcTaskTypeIdEnd!=null){
            notBetween("fk_viz_mc_task_type_id",fkVizMcTaskTypeIdStart,fkVizMcTaskTypeIdEnd);
        }
        return this;
     }


    /**
     * <p>任务类型ID</p>
     * LIKE '%值%' entity().getFkVizMcTaskTypeId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdLike(){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null){
            like("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * NOT LIKE '%值%' entity().getFkVizMcTaskTypeId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdNotLike(){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null){
            notLike("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }


    /**
     * <p>任务类型ID</p>
     * LIKE '%值' entity().getFkVizMcTaskTypeId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdLikeLeft(){
        Long fkVizMcTaskTypeId =entity().getFkVizMcTaskTypeId();
        if(fkVizMcTaskTypeId!=null){
            likeLeft("fk_viz_mc_task_type_id",fkVizMcTaskTypeId);
        }
        return this;
     }

    /**
     * <p>任务类型ID</p>
     * LIKE '值%' entity().getFkVizMcTaskTypeId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdLikeRight(){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdEq(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdNe(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdGt(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdGe(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdLt(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdLe(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdLike(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdNotLike(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdLikeLeft(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdLikeRight(Long fkVizMcTaskTypeId){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdIsNull(){
        isNull("fk_viz_mc_task_type_id");
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdIsNotNull(){
        isNotNull("fk_viz_mc_task_type_id");
        return this;
    }

    /**
     * <p>任务类型ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdIn(Long... values){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdNotIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateEntityWrapper fkVizMcTaskTypeIdNotIn(Long... values){
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
    public VizMcTaskEoUpdateEntityWrapper nameEq(){
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
    public VizMcTaskEoUpdateEntityWrapper nameNe(){
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
    public VizMcTaskEoUpdateEntityWrapper nameGt(){
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
    public VizMcTaskEoUpdateEntityWrapper nameGe(){
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
    public VizMcTaskEoUpdateEntityWrapper nameLt(){
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
    public VizMcTaskEoUpdateEntityWrapper nameLe(){
        String name =entity().getName();
        if(name!=null){
            le("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * BETWEEN  entity().getName() AND 值2
     * @param nameEnd      值2
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper nameBetween(String nameEnd){
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
    public VizMcTaskEoUpdateEntityWrapper nameNotBetween(String nameEnd){
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
    public VizMcTaskEoUpdateEntityWrapper nameBetween(String nameStart,String nameEnd){
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
    public VizMcTaskEoUpdateEntityWrapper nameNotBetween(String nameStart,String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            notBetween("name",nameStart,nameEnd);
        }
        return this;
     }


    /**
     * <p>任务名称</p>
     * LIKE '%值%' entity().getName()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper nameLike(){
        String name =entity().getName();
        if(name!=null){
            like("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * NOT LIKE '%值%' entity().getName()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper nameNotLike(){
        String name =entity().getName();
        if(name!=null){
            notLike("name",name);
        }
        return this;
     }


    /**
     * <p>任务名称</p>
     * LIKE '%值' entity().getName()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper nameLikeLeft(){
        String name =entity().getName();
        if(name!=null){
            likeLeft("name",name);
        }
        return this;
     }

    /**
     * <p>任务名称</p>
     * LIKE '值%' entity().getName()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper nameLikeRight(){
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
    public VizMcTaskEoUpdateEntityWrapper nameEq(String name){
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
    public VizMcTaskEoUpdateEntityWrapper nameNe(String name){
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
    public VizMcTaskEoUpdateEntityWrapper nameGt(String name){
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
    public VizMcTaskEoUpdateEntityWrapper nameGe(String name){
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
    public VizMcTaskEoUpdateEntityWrapper nameLt(String name){
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
    public VizMcTaskEoUpdateEntityWrapper nameLe(String name){
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
    public VizMcTaskEoUpdateEntityWrapper nameLike(String name){
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
    public VizMcTaskEoUpdateEntityWrapper nameNotLike(String name){
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
    public VizMcTaskEoUpdateEntityWrapper nameLikeLeft(String name){
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
    public VizMcTaskEoUpdateEntityWrapper nameLikeRight(String name){
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
    public VizMcTaskEoUpdateEntityWrapper nameIsNull(){
        isNull("name");
        return this;
    }

    /**
     * <p>任务名称</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper nameIsNotNull(){
        isNotNull("name");
        return this;
    }

    /**
     * <p>任务名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper nameIn(Collection<String> value){
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
    public VizMcTaskEoUpdateEntityWrapper nameIn(String... values){
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
    public VizMcTaskEoUpdateEntityWrapper nameNotIn(Collection<String> value){
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
    public VizMcTaskEoUpdateEntityWrapper nameNotIn(String... values){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionEq(){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionNe(){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionGt(){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionGe(){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionLt(){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionLe(){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null){
            le("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * BETWEEN  entity().getTaskDescription() AND 值2
     * @param taskDescriptionEnd      值2
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionBetween(String taskDescriptionEnd){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionNotBetween(String taskDescriptionEnd){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionBetween(String taskDescriptionStart,String taskDescriptionEnd){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionNotBetween(String taskDescriptionStart,String taskDescriptionEnd){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null && taskDescriptionEnd!=null){
            notBetween("task_description",taskDescriptionStart,taskDescriptionEnd);
        }
        return this;
     }


    /**
     * <p>任务描述</p>
     * LIKE '%值%' entity().getTaskDescription()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionLike(){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null){
            like("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * NOT LIKE '%值%' entity().getTaskDescription()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionNotLike(){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null){
            notLike("task_description",taskDescription);
        }
        return this;
     }


    /**
     * <p>任务描述</p>
     * LIKE '%值' entity().getTaskDescription()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionLikeLeft(){
        String taskDescription =entity().getTaskDescription();
        if(taskDescription!=null){
            likeLeft("task_description",taskDescription);
        }
        return this;
     }

    /**
     * <p>任务描述</p>
     * LIKE '值%' entity().getTaskDescription()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionLikeRight(){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionEq(String taskDescription){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionNe(String taskDescription){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionGt(String taskDescription){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionGe(String taskDescription){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionLt(String taskDescription){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionLe(String taskDescription){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionLike(String taskDescription){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionNotLike(String taskDescription){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionLikeLeft(String taskDescription){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionLikeRight(String taskDescription){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionIsNull(){
        isNull("task_description");
        return this;
    }

    /**
     * <p>任务描述</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionIsNotNull(){
        isNotNull("task_description");
        return this;
    }

    /**
     * <p>任务描述</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionIn(Collection<String> value){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionIn(String... values){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionNotIn(Collection<String> value){
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
    public VizMcTaskEoUpdateEntityWrapper taskDescriptionNotIn(String... values){
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
    public VizMcTaskEoUpdateEntityWrapper commandEq(){
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
    public VizMcTaskEoUpdateEntityWrapper commandNe(){
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
    public VizMcTaskEoUpdateEntityWrapper commandGt(){
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
    public VizMcTaskEoUpdateEntityWrapper commandGe(){
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
    public VizMcTaskEoUpdateEntityWrapper commandLt(){
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
    public VizMcTaskEoUpdateEntityWrapper commandLe(){
        String command =entity().getCommand();
        if(command!=null){
            le("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * BETWEEN  entity().getCommand() AND 值2
     * @param commandEnd      值2
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper commandBetween(String commandEnd){
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
    public VizMcTaskEoUpdateEntityWrapper commandNotBetween(String commandEnd){
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
    public VizMcTaskEoUpdateEntityWrapper commandBetween(String commandStart,String commandEnd){
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
    public VizMcTaskEoUpdateEntityWrapper commandNotBetween(String commandStart,String commandEnd){
        String command =entity().getCommand();
        if(command!=null && commandEnd!=null){
            notBetween("command",commandStart,commandEnd);
        }
        return this;
     }


    /**
     * <p>执行命令</p>
     * LIKE '%值%' entity().getCommand()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper commandLike(){
        String command =entity().getCommand();
        if(command!=null){
            like("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * NOT LIKE '%值%' entity().getCommand()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper commandNotLike(){
        String command =entity().getCommand();
        if(command!=null){
            notLike("command",command);
        }
        return this;
     }


    /**
     * <p>执行命令</p>
     * LIKE '%值' entity().getCommand()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper commandLikeLeft(){
        String command =entity().getCommand();
        if(command!=null){
            likeLeft("command",command);
        }
        return this;
     }

    /**
     * <p>执行命令</p>
     * LIKE '值%' entity().getCommand()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper commandLikeRight(){
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
    public VizMcTaskEoUpdateEntityWrapper commandEq(String command){
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
    public VizMcTaskEoUpdateEntityWrapper commandNe(String command){
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
    public VizMcTaskEoUpdateEntityWrapper commandGt(String command){
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
    public VizMcTaskEoUpdateEntityWrapper commandGe(String command){
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
    public VizMcTaskEoUpdateEntityWrapper commandLt(String command){
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
    public VizMcTaskEoUpdateEntityWrapper commandLe(String command){
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
    public VizMcTaskEoUpdateEntityWrapper commandLike(String command){
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
    public VizMcTaskEoUpdateEntityWrapper commandNotLike(String command){
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
    public VizMcTaskEoUpdateEntityWrapper commandLikeLeft(String command){
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
    public VizMcTaskEoUpdateEntityWrapper commandLikeRight(String command){
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
    public VizMcTaskEoUpdateEntityWrapper commandIsNull(){
        isNull("command");
        return this;
    }

    /**
     * <p>执行命令</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper commandIsNotNull(){
        isNotNull("command");
        return this;
    }

    /**
     * <p>执行命令</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper commandIn(Collection<String> value){
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
    public VizMcTaskEoUpdateEntityWrapper commandIn(String... values){
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
    public VizMcTaskEoUpdateEntityWrapper commandNotIn(Collection<String> value){
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
    public VizMcTaskEoUpdateEntityWrapper commandNotIn(String... values){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdEq(){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdNe(){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdGt(){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdGe(){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdLt(){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdLe(){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null){
            le("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * BETWEEN  entity().getFkExtendId() AND 值2
     * @param fkExtendIdEnd      值2
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdBetween(Long fkExtendIdEnd){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdNotBetween(Long fkExtendIdEnd){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdBetween(Long fkExtendIdStart,Long fkExtendIdEnd){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdNotBetween(Long fkExtendIdStart,Long fkExtendIdEnd){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null && fkExtendIdEnd!=null){
            notBetween("fk_extend_id",fkExtendIdStart,fkExtendIdEnd);
        }
        return this;
     }


    /**
     * <p>扩展外键ID</p>
     * LIKE '%值%' entity().getFkExtendId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdLike(){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null){
            like("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * NOT LIKE '%值%' entity().getFkExtendId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdNotLike(){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null){
            notLike("fk_extend_id",fkExtendId);
        }
        return this;
     }


    /**
     * <p>扩展外键ID</p>
     * LIKE '%值' entity().getFkExtendId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdLikeLeft(){
        Long fkExtendId =entity().getFkExtendId();
        if(fkExtendId!=null){
            likeLeft("fk_extend_id",fkExtendId);
        }
        return this;
     }

    /**
     * <p>扩展外键ID</p>
     * LIKE '值%' entity().getFkExtendId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdLikeRight(){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdEq(Long fkExtendId){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdNe(Long fkExtendId){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdGt(Long fkExtendId){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdGe(Long fkExtendId){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdLt(Long fkExtendId){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdLe(Long fkExtendId){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdLike(Long fkExtendId){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdNotLike(Long fkExtendId){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdLikeLeft(Long fkExtendId){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdLikeRight(Long fkExtendId){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdIsNull(){
        isNull("fk_extend_id");
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdIsNotNull(){
        isNotNull("fk_extend_id");
        return this;
    }

    /**
     * <p>扩展外键ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdIn(Long... values){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdNotIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateEntityWrapper fkExtendIdNotIn(Long... values){
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
    public VizMcTaskEoUpdateEntityWrapper statusEq(){
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
    public VizMcTaskEoUpdateEntityWrapper statusNe(){
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
    public VizMcTaskEoUpdateEntityWrapper statusGt(){
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
    public VizMcTaskEoUpdateEntityWrapper statusGe(){
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
    public VizMcTaskEoUpdateEntityWrapper statusLt(){
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
    public VizMcTaskEoUpdateEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper statusBetween(Integer statusEnd){
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
    public VizMcTaskEoUpdateEntityWrapper statusNotBetween(Integer statusEnd){
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
    public VizMcTaskEoUpdateEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
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
    public VizMcTaskEoUpdateEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值%' entity().getStatus()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * NOT LIKE '%值%' entity().getStatus()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '%值' entity().getStatus()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * LIKE '值%' entity().getStatus()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper statusLikeRight(){
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
    public VizMcTaskEoUpdateEntityWrapper statusEq(Integer status){
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
    public VizMcTaskEoUpdateEntityWrapper statusNe(Integer status){
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
    public VizMcTaskEoUpdateEntityWrapper statusGt(Integer status){
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
    public VizMcTaskEoUpdateEntityWrapper statusGe(Integer status){
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
    public VizMcTaskEoUpdateEntityWrapper statusLt(Integer status){
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
    public VizMcTaskEoUpdateEntityWrapper statusLe(Integer status){
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
    public VizMcTaskEoUpdateEntityWrapper statusLike(Integer status){
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
    public VizMcTaskEoUpdateEntityWrapper statusNotLike(Integer status){
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
    public VizMcTaskEoUpdateEntityWrapper statusLikeLeft(Integer status){
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
    public VizMcTaskEoUpdateEntityWrapper statusLikeRight(Integer status){
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
    public VizMcTaskEoUpdateEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态（-50：失败，0：等待中，10：运行中，50：成功）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper statusIn(Collection<Integer> value){
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
    public VizMcTaskEoUpdateEntityWrapper statusIn(Integer... values){
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
    public VizMcTaskEoUpdateEntityWrapper statusNotIn(Collection<Integer> value){
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
    public VizMcTaskEoUpdateEntityWrapper statusNotIn(Integer... values){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdEq(){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdNe(){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdGt(){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdGe(){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdLt(){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdLe(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            le("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * BETWEEN  entity().getOperateSysUserId() AND 值2
     * @param operateSysUserIdEnd      值2
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdBetween(Long operateSysUserIdEnd){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdNotBetween(Long operateSysUserIdEnd){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdNotBetween(Long operateSysUserIdStart,Long operateSysUserIdEnd){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null && operateSysUserIdEnd!=null){
            notBetween("operate_sys_user_id",operateSysUserIdStart,operateSysUserIdEnd);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值%' entity().getOperateSysUserId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdLike(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            like("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * NOT LIKE '%值%' entity().getOperateSysUserId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdNotLike(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            notLike("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }


    /**
     * <p>操作人员</p>
     * LIKE '%值' entity().getOperateSysUserId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdLikeLeft(){
        Long operateSysUserId =entity().getOperateSysUserId();
        if(operateSysUserId!=null){
            likeLeft("operate_sys_user_id",operateSysUserId);
        }
        return this;
     }

    /**
     * <p>操作人员</p>
     * LIKE '值%' entity().getOperateSysUserId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdLikeRight(){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdEq(Long operateSysUserId){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdNe(Long operateSysUserId){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdGt(Long operateSysUserId){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdGe(Long operateSysUserId){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdLt(Long operateSysUserId){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdLe(Long operateSysUserId){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdLike(Long operateSysUserId){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdNotLike(Long operateSysUserId){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdLikeLeft(Long operateSysUserId){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdLikeRight(Long operateSysUserId){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdIsNull(){
        isNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdIsNotNull(){
        isNotNull("operate_sys_user_id");
        return this;
    }

    /**
     * <p>操作人员</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdIn(Long... values){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdNotIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateEntityWrapper operateSysUserIdNotIn(Long... values){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdEq(){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdNe(){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdGt(){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdGe(){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdLt(){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper versionIdBetween(Long versionIdEnd){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdNotBetween(Long versionIdEnd){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * NOT LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本Id</p>
     * LIKE '%值' entity().getVersionId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本Id</p>
     * LIKE '值%' entity().getVersionId()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper versionIdLikeRight(){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdEq(Long versionId){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdNe(Long versionId){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdGt(Long versionId){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdGe(Long versionId){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdLt(Long versionId){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdLe(Long versionId){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdLike(Long versionId){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdNotLike(Long versionId){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdLikeLeft(Long versionId){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdLikeRight(Long versionId){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper versionIdIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdIn(Long... values){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public VizMcTaskEoUpdateEntityWrapper versionIdNotIn(Long... values){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeEq(){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeNe(){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeGt(){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeGe(){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeLt(){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper createTimeLikeRight(){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeEq(Date createTime){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeNe(Date createTime){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeGt(Date createTime){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeGe(Date createTime){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeLt(Date createTime){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeLe(Date createTime){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeLike(Date createTime){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeIn(Date... values){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcTaskEoUpdateEntityWrapper createTimeNotIn(Date... values){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeEq(){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeNe(){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeGt(){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeGe(){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeLt(){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * NOT LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>修改时间</p>
     * LIKE '%值' entity().getLastUpdateTime()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>修改时间</p>
     * LIKE '值%' entity().getLastUpdateTime()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeLikeRight(){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public VizMcTaskEoUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
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
    public VizMcTaskEoUpdateEntityWrapper drEq(){
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
    public VizMcTaskEoUpdateEntityWrapper drNe(){
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
    public VizMcTaskEoUpdateEntityWrapper drGt(){
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
    public VizMcTaskEoUpdateEntityWrapper drGe(){
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
    public VizMcTaskEoUpdateEntityWrapper drLt(){
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
    public VizMcTaskEoUpdateEntityWrapper drLe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            le("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * BETWEEN  entity().getDr() AND 值2
     * @param drEnd      值2
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper drBetween(Integer drEnd){
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
    public VizMcTaskEoUpdateEntityWrapper drNotBetween(Integer drEnd){
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
    public VizMcTaskEoUpdateEntityWrapper drBetween(Integer drStart,Integer drEnd){
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
    public VizMcTaskEoUpdateEntityWrapper drNotBetween(Integer drStart,Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            notBetween("dr",drStart,drEnd);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值%' entity().getDr()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper drLike(){
        Integer dr =entity().getDr();
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * NOT LIKE '%值%' entity().getDr()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper drNotLike(){
        Integer dr =entity().getDr();
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '%值' entity().getDr()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper drLikeLeft(){
        Integer dr =entity().getDr();
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * LIKE '值%' entity().getDr()
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper drLikeRight(){
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
    public VizMcTaskEoUpdateEntityWrapper drEq(Integer dr){
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
    public VizMcTaskEoUpdateEntityWrapper drNe(Integer dr){
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
    public VizMcTaskEoUpdateEntityWrapper drGt(Integer dr){
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
    public VizMcTaskEoUpdateEntityWrapper drGe(Integer dr){
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
    public VizMcTaskEoUpdateEntityWrapper drLt(Integer dr){
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
    public VizMcTaskEoUpdateEntityWrapper drLe(Integer dr){
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
    public VizMcTaskEoUpdateEntityWrapper drLike(Integer dr){
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
    public VizMcTaskEoUpdateEntityWrapper drNotLike(Integer dr){
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
    public VizMcTaskEoUpdateEntityWrapper drLikeLeft(Integer dr){
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
    public VizMcTaskEoUpdateEntityWrapper drLikeRight(Integer dr){
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
    public VizMcTaskEoUpdateEntityWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>逻辑删除-默认dr=0</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcTaskEoUpdateEntityWrapper drIn(Collection<Integer> value){
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
    public VizMcTaskEoUpdateEntityWrapper drIn(Integer... values){
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
    public VizMcTaskEoUpdateEntityWrapper drNotIn(Collection<Integer> value){
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
    public VizMcTaskEoUpdateEntityWrapper drNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dr",values);
        }
        return this;
    }


}
