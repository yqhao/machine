package com.suqi.center.machine.dao.viz.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineAssignTaskEo;

import java.util.Collection;
import java.util.Date;
import java.util.function.Consumer;

/**
 * <p>
 * 【可视化】机器分配任务表
 * </p>
 * "viz_mc_machine_assign_task"
 * @author Administrator
 */
public class VizMcMachineAssignTaskEoQueryEntityWrapper extends QueryWrapper<VizMcMachineAssignTaskEo> {

    public static VizMcMachineAssignTaskEoQueryEntityWrapper wrapper(VizMcMachineAssignTaskEo entity) {
        return new VizMcMachineAssignTaskEoQueryEntityWrapper(entity);
    }

    private VizMcMachineAssignTaskEo entity;

    public VizMcMachineAssignTaskEoQueryEntityWrapper(VizMcMachineAssignTaskEo entity) {
         this.entity=entity;
    }


    protected VizMcMachineAssignTaskEo entity() {
        if(entity==null){
            throw new NullPointerException("VizMcMachineAssignTaskEo is null");
        }
        return entity;
    }

    @Override
    public VizMcMachineAssignTaskEoQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public VizMcMachineAssignTaskEoQueryEntityWrapper selectColumns(Consumer<VizMcMachineAssignTaskEoSelect> consumer) {
        VizMcMachineAssignTaskEoSelect select = new VizMcMachineAssignTaskEoSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }

    /**
     * <p>主键ID</p>
     * 等于 = entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>主键ID</p>
     * LIKE '%值%'  entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>主键ID</p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>主键ID</p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p>主键ID</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>主键ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>主键ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p>主键ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>任务批次号</p>
     * 等于 = entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoEq(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            eq("batch_no",batchNo);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * 不等于 &lt;&gt; entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoNe(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            ne("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 大于 &gt; entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoGt(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            gt("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 大于等于 &gt;= entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoGe(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            ge("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 小于 &lt; entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoLt(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            lt("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 小于等于 &lt;= entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoLe(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            le("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * BETWEEN  entity().getBatchNo() AND batchNoEnd
     * @param batchNoEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoBetween(String batchNoEnd){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null && batchNoEnd!=null){
            between("batch_no",batchNo,batchNoEnd);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * NOT BETWEEN  entity().getBatchNo() AND 值2
     * @param batchNoEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoNotBetween(String batchNoEnd){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null && batchNoEnd!=null){
            notBetween("batch_no",batchNo,batchNoEnd);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * BETWEEN  entity().getBatchNo() AND 值2
     * @param batchNoStart       值1
     * @param batchNoEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoBetween(String batchNoStart,String batchNoEnd){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null && batchNoEnd!=null){
            between("batch_no",batchNoStart,batchNoEnd);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * NOT BETWEEN  entity().getBatchNo() AND 值2
     * @param batchNoStart       值1
     * @param batchNoEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoNotBetween(String batchNoStart,String batchNoEnd){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null && batchNoEnd!=null){
            notBetween("batch_no",batchNoStart,batchNoEnd);
        }
        return this;
     }


    /**
     * <p>任务批次号</p>
     * LIKE '%值%'  entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoLike(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            like("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * NOT LIKE '%值%'  entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoNotLike(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            notLike("batch_no",batchNo);
        }
        return this;
     }


    /**
     * <p>任务批次号</p>
     * LIKE '%值'  entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoLikeLeft(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            likeLeft("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * LIKE '值%'  entity().getBatchNo()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoLikeRight(){
        String batchNo =entity().getBatchNo();
        if(batchNo!=null){
            likeRight("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 等于 =
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoEq(String batchNo){
        if(batchNo!=null){
            eq("batch_no",batchNo);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * 不等于 &lt;&gt;
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoNe(String batchNo){
        if(batchNo!=null){
            ne("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 大于 &gt;
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoGt(String batchNo){
        if(batchNo!=null){
            gt("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 大于等于 &gt;=
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoGe(String batchNo){
        if(batchNo!=null){
            ge("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 小于 &lt;
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoLt(String batchNo){
        if(batchNo!=null){
            lt("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * 小于等于 &lt;=
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoLe(String batchNo){
        if(batchNo!=null){
            le("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * LIKE '%值%'
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoLike(String batchNo){
        if(batchNo!=null){
            like("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * NOT LIKE '%值%'
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoNotLike(String batchNo){
        if(batchNo!=null){
            notLike("batch_no",batchNo);
        }
        return this;
     }


    /**
     * <p>任务批次号</p>
     * LIKE '%值'
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoLikeLeft(String batchNo){
        if(batchNo!=null){
            likeLeft("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * LIKE '值%'
     * @param batchNo       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoLikeRight(String batchNo){
        if(batchNo!=null){
            likeRight("batch_no",batchNo);
        }
        return this;
     }

    /**
     * <p>任务批次号</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoIsNull(){
        isNull("batch_no");
        return this;
    }

    /**
     * <p>任务批次号</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoIsNotNull(){
        isNotNull("batch_no");
        return this;
    }

    /**
     * <p>任务批次号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("batch_no",value);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoIn(String... values){
        if(values!=null && values.length>0){
            in("batch_no",values);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("batch_no",value);
        }
        return this;
    }

    /**
     * <p>任务批次号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper batchNoNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("batch_no",values);
        }
        return this;
    }


    /**
     * <p>商户ID</p>
     * 等于 = entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdEq(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            eq("tenant_id",tenantId);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * 不等于 &lt;&gt; entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdNe(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            ne("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 大于 &gt; entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdGt(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            gt("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 大于等于 &gt;= entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdGe(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            ge("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 小于 &lt; entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdLt(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            lt("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 小于等于 &lt;= entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdLe(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            le("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * BETWEEN  entity().getTenantId() AND tenantIdEnd
     * @param tenantIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdBetween(Long tenantIdEnd){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null && tenantIdEnd!=null){
            between("tenant_id",tenantId,tenantIdEnd);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * NOT BETWEEN  entity().getTenantId() AND 值2
     * @param tenantIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdNotBetween(Long tenantIdEnd){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null && tenantIdEnd!=null){
            notBetween("tenant_id",tenantId,tenantIdEnd);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * BETWEEN  entity().getTenantId() AND 值2
     * @param tenantIdStart       值1
     * @param tenantIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdBetween(Long tenantIdStart,Long tenantIdEnd){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null && tenantIdEnd!=null){
            between("tenant_id",tenantIdStart,tenantIdEnd);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * NOT BETWEEN  entity().getTenantId() AND 值2
     * @param tenantIdStart       值1
     * @param tenantIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdNotBetween(Long tenantIdStart,Long tenantIdEnd){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null && tenantIdEnd!=null){
            notBetween("tenant_id",tenantIdStart,tenantIdEnd);
        }
        return this;
     }


    /**
     * <p>商户ID</p>
     * LIKE '%值%'  entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdLike(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            like("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * NOT LIKE '%值%'  entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdNotLike(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            notLike("tenant_id",tenantId);
        }
        return this;
     }


    /**
     * <p>商户ID</p>
     * LIKE '%值'  entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdLikeLeft(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            likeLeft("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * LIKE '值%'  entity().getTenantId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdLikeRight(){
        Long tenantId =entity().getTenantId();
        if(tenantId!=null){
            likeRight("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 等于 =
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdEq(Long tenantId){
        if(tenantId!=null){
            eq("tenant_id",tenantId);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * 不等于 &lt;&gt;
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdNe(Long tenantId){
        if(tenantId!=null){
            ne("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 大于 &gt;
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdGt(Long tenantId){
        if(tenantId!=null){
            gt("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 大于等于 &gt;=
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdGe(Long tenantId){
        if(tenantId!=null){
            ge("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 小于 &lt;
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdLt(Long tenantId){
        if(tenantId!=null){
            lt("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * 小于等于 &lt;=
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdLe(Long tenantId){
        if(tenantId!=null){
            le("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * LIKE '%值%'
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdLike(Long tenantId){
        if(tenantId!=null){
            like("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * NOT LIKE '%值%'
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdNotLike(Long tenantId){
        if(tenantId!=null){
            notLike("tenant_id",tenantId);
        }
        return this;
     }


    /**
     * <p>商户ID</p>
     * LIKE '%值'
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdLikeLeft(Long tenantId){
        if(tenantId!=null){
            likeLeft("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * LIKE '值%'
     * @param tenantId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdLikeRight(Long tenantId){
        if(tenantId!=null){
            likeRight("tenant_id",tenantId);
        }
        return this;
     }

    /**
     * <p>商户ID</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdIsNull(){
        isNull("tenant_id");
        return this;
    }

    /**
     * <p>商户ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdIsNotNull(){
        isNotNull("tenant_id");
        return this;
    }

    /**
     * <p>商户ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("tenant_id",value);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdIn(Long... values){
        if(values!=null && values.length>0){
            in("tenant_id",values);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("tenant_id",value);
        }
        return this;
    }

    /**
     * <p>商户ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("tenant_id",values);
        }
        return this;
    }


    /**
     * <p>商户名称</p>
     * 等于 = entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameEq(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            eq("tenant_name",tenantName);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * 不等于 &lt;&gt; entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameNe(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            ne("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 大于 &gt; entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameGt(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            gt("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 大于等于 &gt;= entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameGe(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            ge("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 小于 &lt; entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameLt(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            lt("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 小于等于 &lt;= entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameLe(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            le("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * BETWEEN  entity().getTenantName() AND tenantNameEnd
     * @param tenantNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameBetween(String tenantNameEnd){
        String tenantName =entity().getTenantName();
        if(tenantName!=null && tenantNameEnd!=null){
            between("tenant_name",tenantName,tenantNameEnd);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * NOT BETWEEN  entity().getTenantName() AND 值2
     * @param tenantNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameNotBetween(String tenantNameEnd){
        String tenantName =entity().getTenantName();
        if(tenantName!=null && tenantNameEnd!=null){
            notBetween("tenant_name",tenantName,tenantNameEnd);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * BETWEEN  entity().getTenantName() AND 值2
     * @param tenantNameStart       值1
     * @param tenantNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameBetween(String tenantNameStart,String tenantNameEnd){
        String tenantName =entity().getTenantName();
        if(tenantName!=null && tenantNameEnd!=null){
            between("tenant_name",tenantNameStart,tenantNameEnd);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * NOT BETWEEN  entity().getTenantName() AND 值2
     * @param tenantNameStart       值1
     * @param tenantNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameNotBetween(String tenantNameStart,String tenantNameEnd){
        String tenantName =entity().getTenantName();
        if(tenantName!=null && tenantNameEnd!=null){
            notBetween("tenant_name",tenantNameStart,tenantNameEnd);
        }
        return this;
     }


    /**
     * <p>商户名称</p>
     * LIKE '%值%'  entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameLike(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            like("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * NOT LIKE '%值%'  entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameNotLike(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            notLike("tenant_name",tenantName);
        }
        return this;
     }


    /**
     * <p>商户名称</p>
     * LIKE '%值'  entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameLikeLeft(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            likeLeft("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * LIKE '值%'  entity().getTenantName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameLikeRight(){
        String tenantName =entity().getTenantName();
        if(tenantName!=null){
            likeRight("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 等于 =
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameEq(String tenantName){
        if(tenantName!=null){
            eq("tenant_name",tenantName);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * 不等于 &lt;&gt;
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameNe(String tenantName){
        if(tenantName!=null){
            ne("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 大于 &gt;
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameGt(String tenantName){
        if(tenantName!=null){
            gt("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 大于等于 &gt;=
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameGe(String tenantName){
        if(tenantName!=null){
            ge("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 小于 &lt;
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameLt(String tenantName){
        if(tenantName!=null){
            lt("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * 小于等于 &lt;=
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameLe(String tenantName){
        if(tenantName!=null){
            le("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * LIKE '%值%'
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameLike(String tenantName){
        if(tenantName!=null){
            like("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * NOT LIKE '%值%'
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameNotLike(String tenantName){
        if(tenantName!=null){
            notLike("tenant_name",tenantName);
        }
        return this;
     }


    /**
     * <p>商户名称</p>
     * LIKE '%值'
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameLikeLeft(String tenantName){
        if(tenantName!=null){
            likeLeft("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * LIKE '值%'
     * @param tenantName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameLikeRight(String tenantName){
        if(tenantName!=null){
            likeRight("tenant_name",tenantName);
        }
        return this;
     }

    /**
     * <p>商户名称</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameIsNull(){
        isNull("tenant_name");
        return this;
    }

    /**
     * <p>商户名称</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameIsNotNull(){
        isNotNull("tenant_name");
        return this;
    }

    /**
     * <p>商户名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("tenant_name",value);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameIn(String... values){
        if(values!=null && values.length>0){
            in("tenant_name",values);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("tenant_name",value);
        }
        return this;
    }

    /**
     * <p>商户名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper tenantNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("tenant_name",values);
        }
        return this;
    }


    /**
     * <p>内网ip地址</p>
     * 等于 = entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrEq(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrNe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrGt(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrGe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrLt(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrLe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrBetween(String externalAddrEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrNotBetween(String externalAddrEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrBetween(String externalAddrStart,String externalAddrEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrNotBetween(String externalAddrStart,String externalAddrEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrLike(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrNotLike(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrLikeLeft(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrLikeRight(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrEq(String externalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrNe(String externalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrGt(String externalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrGe(String externalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrLt(String externalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrLe(String externalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrLike(String externalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrNotLike(String externalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrLikeLeft(String externalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrLikeRight(String externalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrIsNull(){
        isNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrIsNotNull(){
        isNotNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrIn(String... values){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrNotIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper externalAddrNotIn(String... values){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrEq(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrNe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrGt(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrGe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrLt(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrLe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrBetween(String internalAddrEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrNotBetween(String internalAddrEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrBetween(String internalAddrStart,String internalAddrEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrNotBetween(String internalAddrStart,String internalAddrEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrLike(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrNotLike(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrLikeLeft(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrLikeRight(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrEq(String internalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrNe(String internalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrGt(String internalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrGe(String internalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrLt(String internalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrLe(String internalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrLike(String internalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrNotLike(String internalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrLikeLeft(String internalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrLikeRight(String internalAddr){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrIsNull(){
        isNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrIsNotNull(){
        isNotNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrIn(String... values){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrNotIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper internalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("internal_addr",values);
        }
        return this;
    }


    /**
     * <p>机器基础信息表记录id</p>
     * 等于 = entity().getFkMcMachineId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdEq(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            eq("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * 不等于 &lt;&gt; entity().getFkMcMachineId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdNe(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            ne("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 大于 &gt; entity().getFkMcMachineId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdGt(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            gt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 大于等于 &gt;= entity().getFkMcMachineId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdGe(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            ge("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 小于 &lt; entity().getFkMcMachineId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdLt(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            lt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 小于等于 &lt;= entity().getFkMcMachineId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdLe(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            le("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * BETWEEN  entity().getFkMcMachineId() AND fkMcMachineIdEnd
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdEnd){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null && fkMcMachineIdEnd!=null){
            between("fk_mc_machine_id",fkMcMachineId,fkMcMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * NOT BETWEEN  entity().getFkMcMachineId() AND 值2
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdEnd){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null && fkMcMachineIdEnd!=null){
            notBetween("fk_mc_machine_id",fkMcMachineId,fkMcMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * BETWEEN  entity().getFkMcMachineId() AND 值2
     * @param fkMcMachineIdStart       值1
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null && fkMcMachineIdEnd!=null){
            between("fk_mc_machine_id",fkMcMachineIdStart,fkMcMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * NOT BETWEEN  entity().getFkMcMachineId() AND 值2
     * @param fkMcMachineIdStart       值1
     * @param fkMcMachineIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null && fkMcMachineIdEnd!=null){
            notBetween("fk_mc_machine_id",fkMcMachineIdStart,fkMcMachineIdEnd);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '%值%'  entity().getFkMcMachineId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdLike(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            like("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * NOT LIKE '%值%'  entity().getFkMcMachineId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdNotLike(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            notLike("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '%值'  entity().getFkMcMachineId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdLikeLeft(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            likeLeft("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '值%'  entity().getFkMcMachineId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdLikeRight(){
        Long fkMcMachineId =entity().getFkMcMachineId();
        if(fkMcMachineId!=null){
            likeRight("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 等于 =
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdEq(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            eq("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * 不等于 &lt;&gt;
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdNe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            ne("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 大于 &gt;
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdGt(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            gt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 大于等于 &gt;=
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdGe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            ge("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 小于 &lt;
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdLt(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            lt("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * 小于等于 &lt;=
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdLe(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            le("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '%值%'
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdLike(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            like("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * NOT LIKE '%值%'
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            notLike("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }


    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '%值'
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            likeLeft("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * LIKE '值%'
     * @param fkMcMachineId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
        if(fkMcMachineId!=null){
            likeRight("fk_mc_machine_id",fkMcMachineId);
        }
        return this;
     }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_machine_id",value);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_machine_id",values);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_machine_id",value);
        }
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkMcMachineIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_machine_id",values);
        }
        return this;
    }


    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdEq(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdNe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdGt(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdGe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdLt(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdLe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdLike(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdNotLike(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdLikeLeft(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdLikeRight(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdEq(String deviceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdNe(String deviceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdGt(String deviceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdGe(String deviceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdLt(String deviceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdLe(String deviceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdLike(String deviceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdNotLike(String deviceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdIn(String... values){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper deviceIdNotIn(String... values){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdEq(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdNe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdGt(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdGe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdLt(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdLe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdBetween(String instanceIdEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdNotBetween(String instanceIdEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdLike(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdNotLike(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdLikeLeft(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdLikeRight(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdEq(String instanceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdNe(String instanceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdGt(String instanceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdGe(String instanceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdLt(String instanceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdLe(String instanceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdLike(String instanceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdNotLike(String instanceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdLikeLeft(String instanceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdLikeRight(String instanceId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdIn(String... values){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdNotIn(Collection<String> value){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }


    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 等于 = entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusEq(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            eq("assign_status",assignStatus);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 不等于 &lt;&gt; entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusNe(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            ne("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 大于 &gt; entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusGt(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            gt("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 大于等于 &gt;= entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusGe(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            ge("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 小于 &lt; entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusLt(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            lt("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 小于等于 &lt;= entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusLe(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            le("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * BETWEEN  entity().getAssignStatus() AND assignStatusEnd
     * @param assignStatusEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusBetween(Integer assignStatusEnd){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null && assignStatusEnd!=null){
            between("assign_status",assignStatus,assignStatusEnd);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * NOT BETWEEN  entity().getAssignStatus() AND 值2
     * @param assignStatusEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusNotBetween(Integer assignStatusEnd){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null && assignStatusEnd!=null){
            notBetween("assign_status",assignStatus,assignStatusEnd);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * BETWEEN  entity().getAssignStatus() AND 值2
     * @param assignStatusStart       值1
     * @param assignStatusEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusBetween(Integer assignStatusStart,Integer assignStatusEnd){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null && assignStatusEnd!=null){
            between("assign_status",assignStatusStart,assignStatusEnd);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * NOT BETWEEN  entity().getAssignStatus() AND 值2
     * @param assignStatusStart       值1
     * @param assignStatusEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusNotBetween(Integer assignStatusStart,Integer assignStatusEnd){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null && assignStatusEnd!=null){
            notBetween("assign_status",assignStatusStart,assignStatusEnd);
        }
        return this;
     }


    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * LIKE '%值%'  entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusLike(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            like("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * NOT LIKE '%值%'  entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusNotLike(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            notLike("assign_status",assignStatus);
        }
        return this;
     }


    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * LIKE '%值'  entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusLikeLeft(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            likeLeft("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * LIKE '值%'  entity().getAssignStatus()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusLikeRight(){
        Integer assignStatus =entity().getAssignStatus();
        if(assignStatus!=null){
            likeRight("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 等于 =
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusEq(Integer assignStatus){
        if(assignStatus!=null){
            eq("assign_status",assignStatus);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 不等于 &lt;&gt;
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusNe(Integer assignStatus){
        if(assignStatus!=null){
            ne("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 大于 &gt;
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusGt(Integer assignStatus){
        if(assignStatus!=null){
            gt("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 大于等于 &gt;=
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusGe(Integer assignStatus){
        if(assignStatus!=null){
            ge("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 小于 &lt;
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusLt(Integer assignStatus){
        if(assignStatus!=null){
            lt("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * 小于等于 &lt;=
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusLe(Integer assignStatus){
        if(assignStatus!=null){
            le("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * LIKE '%值%'
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusLike(Integer assignStatus){
        if(assignStatus!=null){
            like("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * NOT LIKE '%值%'
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusNotLike(Integer assignStatus){
        if(assignStatus!=null){
            notLike("assign_status",assignStatus);
        }
        return this;
     }


    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * LIKE '%值'
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusLikeLeft(Integer assignStatus){
        if(assignStatus!=null){
            likeLeft("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * LIKE '值%'
     * @param assignStatus       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusLikeRight(Integer assignStatus){
        if(assignStatus!=null){
            likeRight("assign_status",assignStatus);
        }
        return this;
     }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusIsNull(){
        isNull("assign_status");
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusIsNotNull(){
        isNotNull("assign_status");
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("assign_status",value);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("assign_status",values);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("assign_status",value);
        }
        return this;
    }

    /**
     * <p>分配状态(10：待分配，20：已分配, 30:分配失败)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper assignStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("assign_status",values);
        }
        return this;
    }


    /**
     * <p>操作人用户ID</p>
     * 等于 = entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdEq(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            eq("operate_user_id",operateUserId);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * 不等于 &lt;&gt; entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdNe(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            ne("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 大于 &gt; entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdGt(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            gt("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 大于等于 &gt;= entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdGe(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            ge("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 小于 &lt; entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdLt(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            lt("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 小于等于 &lt;= entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdLe(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            le("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * BETWEEN  entity().getOperateUserId() AND operateUserIdEnd
     * @param operateUserIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdBetween(Long operateUserIdEnd){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null && operateUserIdEnd!=null){
            between("operate_user_id",operateUserId,operateUserIdEnd);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * NOT BETWEEN  entity().getOperateUserId() AND 值2
     * @param operateUserIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdNotBetween(Long operateUserIdEnd){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null && operateUserIdEnd!=null){
            notBetween("operate_user_id",operateUserId,operateUserIdEnd);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * BETWEEN  entity().getOperateUserId() AND 值2
     * @param operateUserIdStart       值1
     * @param operateUserIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdBetween(Long operateUserIdStart,Long operateUserIdEnd){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null && operateUserIdEnd!=null){
            between("operate_user_id",operateUserIdStart,operateUserIdEnd);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * NOT BETWEEN  entity().getOperateUserId() AND 值2
     * @param operateUserIdStart       值1
     * @param operateUserIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdNotBetween(Long operateUserIdStart,Long operateUserIdEnd){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null && operateUserIdEnd!=null){
            notBetween("operate_user_id",operateUserIdStart,operateUserIdEnd);
        }
        return this;
     }


    /**
     * <p>操作人用户ID</p>
     * LIKE '%值%'  entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdLike(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            like("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * NOT LIKE '%值%'  entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdNotLike(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            notLike("operate_user_id",operateUserId);
        }
        return this;
     }


    /**
     * <p>操作人用户ID</p>
     * LIKE '%值'  entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdLikeLeft(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            likeLeft("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * LIKE '值%'  entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdLikeRight(){
        Long operateUserId =entity().getOperateUserId();
        if(operateUserId!=null){
            likeRight("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 等于 =
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdEq(Long operateUserId){
        if(operateUserId!=null){
            eq("operate_user_id",operateUserId);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * 不等于 &lt;&gt;
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdNe(Long operateUserId){
        if(operateUserId!=null){
            ne("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 大于 &gt;
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdGt(Long operateUserId){
        if(operateUserId!=null){
            gt("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 大于等于 &gt;=
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdGe(Long operateUserId){
        if(operateUserId!=null){
            ge("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 小于 &lt;
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdLt(Long operateUserId){
        if(operateUserId!=null){
            lt("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * 小于等于 &lt;=
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdLe(Long operateUserId){
        if(operateUserId!=null){
            le("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * LIKE '%值%'
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdLike(Long operateUserId){
        if(operateUserId!=null){
            like("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * NOT LIKE '%值%'
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdNotLike(Long operateUserId){
        if(operateUserId!=null){
            notLike("operate_user_id",operateUserId);
        }
        return this;
     }


    /**
     * <p>操作人用户ID</p>
     * LIKE '%值'
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdLikeLeft(Long operateUserId){
        if(operateUserId!=null){
            likeLeft("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * LIKE '值%'
     * @param operateUserId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdLikeRight(Long operateUserId){
        if(operateUserId!=null){
            likeRight("operate_user_id",operateUserId);
        }
        return this;
     }

    /**
     * <p>操作人用户ID</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdIsNull(){
        isNull("operate_user_id");
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdIsNotNull(){
        isNotNull("operate_user_id");
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("operate_user_id",value);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdIn(Long... values){
        if(values!=null && values.length>0){
            in("operate_user_id",values);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("operate_user_id",value);
        }
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper operateUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("operate_user_id",values);
        }
        return this;
    }


    /**
     * <p>使用有效期开始时间</p>
     * 等于 = entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeEq(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            eq("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 不等于 &lt;&gt; entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeNe(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            ne("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于 &gt; entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeGt(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            gt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于等于 &gt;= entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeGe(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            ge("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于 &lt; entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeLt(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            lt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于等于 &lt;= entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeLe(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            le("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * BETWEEN  entity().getValidStartTime() AND validStartTimeEnd
     * @param validStartTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeBetween(Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            between("valid_start_time",validStartTime,validStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT BETWEEN  entity().getValidStartTime() AND 值2
     * @param validStartTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeNotBetween(Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            notBetween("valid_start_time",validStartTime,validStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * BETWEEN  entity().getValidStartTime() AND 值2
     * @param validStartTimeStart       值1
     * @param validStartTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeBetween(Date validStartTimeStart,Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            between("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT BETWEEN  entity().getValidStartTime() AND 值2
     * @param validStartTimeStart       值1
     * @param validStartTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeNotBetween(Date validStartTimeStart,Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            notBetween("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值%'  entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeLike(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            like("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT LIKE '%值%'  entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeNotLike(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            notLike("valid_start_time",validStartTime);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值'  entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeLikeLeft(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            likeLeft("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '值%'  entity().getValidStartTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeLikeRight(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            likeRight("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 等于 =
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeEq(Date validStartTime){
        if(validStartTime!=null){
            eq("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 不等于 &lt;&gt;
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeNe(Date validStartTime){
        if(validStartTime!=null){
            ne("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于 &gt;
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeGt(Date validStartTime){
        if(validStartTime!=null){
            gt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于等于 &gt;=
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeGe(Date validStartTime){
        if(validStartTime!=null){
            ge("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于 &lt;
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeLt(Date validStartTime){
        if(validStartTime!=null){
            lt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于等于 &lt;=
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeLe(Date validStartTime){
        if(validStartTime!=null){
            le("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值%'
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeLike(Date validStartTime){
        if(validStartTime!=null){
            like("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT LIKE '%值%'
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeNotLike(Date validStartTime){
        if(validStartTime!=null){
            notLike("valid_start_time",validStartTime);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值'
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeLikeLeft(Date validStartTime){
        if(validStartTime!=null){
            likeLeft("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '值%'
     * @param validStartTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeLikeRight(Date validStartTime){
        if(validStartTime!=null){
            likeRight("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeIsNull(){
        isNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeIsNotNull(){
        isNotNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("valid_start_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("valid_start_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("valid_start_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_start_time",values);
        }
        return this;
    }


    /**
     * <p>使用有效期结束时间</p>
     * 等于 = entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeEq(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            eq("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 不等于 &lt;&gt; entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeNe(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            ne("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于 &gt; entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeGt(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            gt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于等于 &gt;= entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeGe(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            ge("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于 &lt; entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeLt(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            lt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于等于 &lt;= entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeLe(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            le("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * BETWEEN  entity().getValidEndTime() AND validEndTimeEnd
     * @param validEndTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeBetween(Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            between("valid_end_time",validEndTime,validEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT BETWEEN  entity().getValidEndTime() AND 值2
     * @param validEndTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeNotBetween(Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            notBetween("valid_end_time",validEndTime,validEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * BETWEEN  entity().getValidEndTime() AND 值2
     * @param validEndTimeStart       值1
     * @param validEndTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeBetween(Date validEndTimeStart,Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            between("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT BETWEEN  entity().getValidEndTime() AND 值2
     * @param validEndTimeStart       值1
     * @param validEndTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeNotBetween(Date validEndTimeStart,Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            notBetween("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值%'  entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeLike(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            like("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT LIKE '%值%'  entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeNotLike(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            notLike("valid_end_time",validEndTime);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值'  entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeLikeLeft(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            likeLeft("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '值%'  entity().getValidEndTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeLikeRight(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            likeRight("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 等于 =
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeEq(Date validEndTime){
        if(validEndTime!=null){
            eq("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 不等于 &lt;&gt;
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeNe(Date validEndTime){
        if(validEndTime!=null){
            ne("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于 &gt;
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeGt(Date validEndTime){
        if(validEndTime!=null){
            gt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于等于 &gt;=
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeGe(Date validEndTime){
        if(validEndTime!=null){
            ge("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于 &lt;
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeLt(Date validEndTime){
        if(validEndTime!=null){
            lt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于等于 &lt;=
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeLe(Date validEndTime){
        if(validEndTime!=null){
            le("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值%'
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeLike(Date validEndTime){
        if(validEndTime!=null){
            like("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT LIKE '%值%'
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeNotLike(Date validEndTime){
        if(validEndTime!=null){
            notLike("valid_end_time",validEndTime);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值'
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeLikeLeft(Date validEndTime){
        if(validEndTime!=null){
            likeLeft("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '值%'
     * @param validEndTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeLikeRight(Date validEndTime){
        if(validEndTime!=null){
            likeRight("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeIsNull(){
        isNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeIsNotNull(){
        isNotNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("valid_end_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("valid_end_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("valid_end_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper validEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_end_time",values);
        }
        return this;
    }


    /**
     * <p>版本id</p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdEq(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdNe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdGt(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdGe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdLt(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdLe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdBetween(Long versionIdEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdNotBetween(Long versionIdEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdLike(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdNotLike(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdLikeLeft(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdLikeRight(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdEq(Long versionId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdNe(Long versionId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdGt(Long versionId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdGe(Long versionId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdLt(Long versionId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdLe(Long versionId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdLike(Long versionId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdNotLike(Long versionId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdLikeLeft(Long versionId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdLikeRight(Long versionId){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdIn(Long... values){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper versionIdNotIn(Long... values){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeEq(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeNe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeGt(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeGe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeLt(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeLe(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeLike(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeNotLike(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeLikeLeft(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeLikeRight(){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeEq(Date createTime){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeNe(Date createTime){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeGt(Date createTime){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeGe(Date createTime){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeLt(Date createTime){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeLe(Date createTime){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeLike(Date createTime){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeIn(Date... values){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcMachineAssignTaskEoQueryEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


    /**
     * <p>创建人</p>
     * 等于 = entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonEq(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            eq("create_person",createPerson);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * 不等于 &lt;&gt; entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonNe(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            ne("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 大于 &gt; entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonGt(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            gt("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 大于等于 &gt;= entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonGe(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            ge("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 小于 &lt; entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonLt(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            lt("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 小于等于 &lt;= entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonLe(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            le("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * BETWEEN  entity().getCreatePerson() AND createPersonEnd
     * @param createPersonEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonBetween(String createPersonEnd){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null && createPersonEnd!=null){
            between("create_person",createPerson,createPersonEnd);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * NOT BETWEEN  entity().getCreatePerson() AND 值2
     * @param createPersonEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonNotBetween(String createPersonEnd){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null && createPersonEnd!=null){
            notBetween("create_person",createPerson,createPersonEnd);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * BETWEEN  entity().getCreatePerson() AND 值2
     * @param createPersonStart       值1
     * @param createPersonEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonBetween(String createPersonStart,String createPersonEnd){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null && createPersonEnd!=null){
            between("create_person",createPersonStart,createPersonEnd);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * NOT BETWEEN  entity().getCreatePerson() AND 值2
     * @param createPersonStart       值1
     * @param createPersonEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonNotBetween(String createPersonStart,String createPersonEnd){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null && createPersonEnd!=null){
            notBetween("create_person",createPersonStart,createPersonEnd);
        }
        return this;
     }


    /**
     * <p>创建人</p>
     * LIKE '%值%'  entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonLike(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            like("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * NOT LIKE '%值%'  entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonNotLike(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            notLike("create_person",createPerson);
        }
        return this;
     }


    /**
     * <p>创建人</p>
     * LIKE '%值'  entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonLikeLeft(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            likeLeft("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * LIKE '值%'  entity().getCreatePerson()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonLikeRight(){
        String createPerson =entity().getCreatePerson();
        if(createPerson!=null){
            likeRight("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 等于 =
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonEq(String createPerson){
        if(createPerson!=null){
            eq("create_person",createPerson);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * 不等于 &lt;&gt;
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonNe(String createPerson){
        if(createPerson!=null){
            ne("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 大于 &gt;
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonGt(String createPerson){
        if(createPerson!=null){
            gt("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 大于等于 &gt;=
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonGe(String createPerson){
        if(createPerson!=null){
            ge("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 小于 &lt;
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonLt(String createPerson){
        if(createPerson!=null){
            lt("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * 小于等于 &lt;=
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonLe(String createPerson){
        if(createPerson!=null){
            le("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * LIKE '%值%'
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonLike(String createPerson){
        if(createPerson!=null){
            like("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * NOT LIKE '%值%'
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonNotLike(String createPerson){
        if(createPerson!=null){
            notLike("create_person",createPerson);
        }
        return this;
     }


    /**
     * <p>创建人</p>
     * LIKE '%值'
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonLikeLeft(String createPerson){
        if(createPerson!=null){
            likeLeft("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * LIKE '值%'
     * @param createPerson       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonLikeRight(String createPerson){
        if(createPerson!=null){
            likeRight("create_person",createPerson);
        }
        return this;
     }

    /**
     * <p>创建人</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonIsNull(){
        isNull("create_person");
        return this;
    }

    /**
     * <p>创建人</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonIsNotNull(){
        isNotNull("create_person");
        return this;
    }

    /**
     * <p>创建人</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("create_person",value);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonIn(String... values){
        if(values!=null && values.length>0){
            in("create_person",values);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_person",value);
        }
        return this;
    }

    /**
     * <p>创建人</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper createPersonNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("create_person",values);
        }
        return this;
    }


    /**
     * <p>最后修改时间</p>
     * 等于 = entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeEq(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            eq("update_time",updateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt; entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeNe(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            ne("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeGt(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            gt("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeGe(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            ge("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeLt(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            lt("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeLe(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            le("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getUpdateTime() AND updateTimeEnd
     * @param updateTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeBetween(Date updateTimeEnd){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null && updateTimeEnd!=null){
            between("update_time",updateTime,updateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getUpdateTime() AND 值2
     * @param updateTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeNotBetween(Date updateTimeEnd){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null && updateTimeEnd!=null){
            notBetween("update_time",updateTime,updateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getUpdateTime() AND 值2
     * @param updateTimeStart       值1
     * @param updateTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeBetween(Date updateTimeStart,Date updateTimeEnd){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null && updateTimeEnd!=null){
            between("update_time",updateTimeStart,updateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getUpdateTime() AND 值2
     * @param updateTimeStart       值1
     * @param updateTimeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeNotBetween(Date updateTimeStart,Date updateTimeEnd){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null && updateTimeEnd!=null){
            notBetween("update_time",updateTimeStart,updateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'  entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeLike(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            like("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%'  entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeNotLike(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            notLike("update_time",updateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值'  entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeLikeLeft(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            likeLeft("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%'  entity().getUpdateTime()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeLikeRight(){
        Date updateTime =entity().getUpdateTime();
        if(updateTime!=null){
            likeRight("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 等于 =
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeEq(Date updateTime){
        if(updateTime!=null){
            eq("update_time",updateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt;
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeNe(Date updateTime){
        if(updateTime!=null){
            ne("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt;
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeGt(Date updateTime){
        if(updateTime!=null){
            gt("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;=
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeGe(Date updateTime){
        if(updateTime!=null){
            ge("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt;
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeLt(Date updateTime){
        if(updateTime!=null){
            lt("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;=
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeLe(Date updateTime){
        if(updateTime!=null){
            le("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeLike(Date updateTime){
        if(updateTime!=null){
            like("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%'
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeNotLike(Date updateTime){
        if(updateTime!=null){
            notLike("update_time",updateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值'
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeLikeLeft(Date updateTime){
        if(updateTime!=null){
            likeLeft("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%'
     * @param updateTime       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeLikeRight(Date updateTime){
        if(updateTime!=null){
            likeRight("update_time",updateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeIsNull(){
        isNull("update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeIsNotNull(){
        isNotNull("update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("update_time",value);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("update_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("update_time",value);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper updateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("update_time",values);
        }
        return this;
    }


    /**
     * <p>是否删除</p>
     * 等于 = entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drEq(){
        Integer dr =entity().getDr();
        if(dr!=null){
            eq("dr",dr);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * 不等于 &lt;&gt; entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drNe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            ne("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 大于 &gt; entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drGt(){
        Integer dr =entity().getDr();
        if(dr!=null){
            gt("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 大于等于 &gt;= entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drGe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            ge("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 小于 &lt; entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drLt(){
        Integer dr =entity().getDr();
        if(dr!=null){
            lt("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 小于等于 &lt;= entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drLe(){
        Integer dr =entity().getDr();
        if(dr!=null){
            le("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * BETWEEN  entity().getDr() AND drEnd
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drBetween(Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            between("dr",dr,drEnd);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * NOT BETWEEN  entity().getDr() AND 值2
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drNotBetween(Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            notBetween("dr",dr,drEnd);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * BETWEEN  entity().getDr() AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drBetween(Integer drStart,Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            between("dr",drStart,drEnd);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * NOT BETWEEN  entity().getDr() AND 值2
     * @param drStart       值1
     * @param drEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drNotBetween(Integer drStart,Integer drEnd){
        Integer dr =entity().getDr();
        if(dr!=null && drEnd!=null){
            notBetween("dr",drStart,drEnd);
        }
        return this;
     }


    /**
     * <p>是否删除</p>
     * LIKE '%值%'  entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drLike(){
        Integer dr =entity().getDr();
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * NOT LIKE '%值%'  entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drNotLike(){
        Integer dr =entity().getDr();
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>是否删除</p>
     * LIKE '%值'  entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drLikeLeft(){
        Integer dr =entity().getDr();
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * LIKE '值%'  entity().getDr()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drLikeRight(){
        Integer dr =entity().getDr();
        if(dr!=null){
            likeRight("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 等于 =
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drEq(Integer dr){
        if(dr!=null){
            eq("dr",dr);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * 不等于 &lt;&gt;
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drNe(Integer dr){
        if(dr!=null){
            ne("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 大于 &gt;
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drGt(Integer dr){
        if(dr!=null){
            gt("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 大于等于 &gt;=
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drGe(Integer dr){
        if(dr!=null){
            ge("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 小于 &lt;
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drLt(Integer dr){
        if(dr!=null){
            lt("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * 小于等于 &lt;=
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drLe(Integer dr){
        if(dr!=null){
            le("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * LIKE '%值%'
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drLike(Integer dr){
        if(dr!=null){
            like("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * NOT LIKE '%值%'
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drNotLike(Integer dr){
        if(dr!=null){
            notLike("dr",dr);
        }
        return this;
     }


    /**
     * <p>是否删除</p>
     * LIKE '%值'
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drLikeLeft(Integer dr){
        if(dr!=null){
            likeLeft("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * LIKE '值%'
     * @param dr       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drLikeRight(Integer dr){
        if(dr!=null){
            likeRight("dr",dr);
        }
        return this;
     }

    /**
     * <p>是否删除</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>是否删除</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>是否删除</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dr",value);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drIn(Integer... values){
        if(values!=null && values.length>0){
            in("dr",values);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dr",value);
        }
        return this;
    }

    /**
     * <p>是否删除</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper drNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dr",values);
        }
        return this;
    }


    /**
     * <p>执行结果</p>
     * 等于 = entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgEq(){
        String msg =entity().getMsg();
        if(msg!=null){
            eq("msg",msg);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * 不等于 &lt;&gt; entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgNe(){
        String msg =entity().getMsg();
        if(msg!=null){
            ne("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 大于 &gt; entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgGt(){
        String msg =entity().getMsg();
        if(msg!=null){
            gt("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 大于等于 &gt;= entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgGe(){
        String msg =entity().getMsg();
        if(msg!=null){
            ge("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 小于 &lt; entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgLt(){
        String msg =entity().getMsg();
        if(msg!=null){
            lt("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 小于等于 &lt;= entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgLe(){
        String msg =entity().getMsg();
        if(msg!=null){
            le("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * BETWEEN  entity().getMsg() AND msgEnd
     * @param msgEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgBetween(String msgEnd){
        String msg =entity().getMsg();
        if(msg!=null && msgEnd!=null){
            between("msg",msg,msgEnd);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * NOT BETWEEN  entity().getMsg() AND 值2
     * @param msgEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgNotBetween(String msgEnd){
        String msg =entity().getMsg();
        if(msg!=null && msgEnd!=null){
            notBetween("msg",msg,msgEnd);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * BETWEEN  entity().getMsg() AND 值2
     * @param msgStart       值1
     * @param msgEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgBetween(String msgStart,String msgEnd){
        String msg =entity().getMsg();
        if(msg!=null && msgEnd!=null){
            between("msg",msgStart,msgEnd);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * NOT BETWEEN  entity().getMsg() AND 值2
     * @param msgStart       值1
     * @param msgEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgNotBetween(String msgStart,String msgEnd){
        String msg =entity().getMsg();
        if(msg!=null && msgEnd!=null){
            notBetween("msg",msgStart,msgEnd);
        }
        return this;
     }


    /**
     * <p>执行结果</p>
     * LIKE '%值%'  entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgLike(){
        String msg =entity().getMsg();
        if(msg!=null){
            like("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * NOT LIKE '%值%'  entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgNotLike(){
        String msg =entity().getMsg();
        if(msg!=null){
            notLike("msg",msg);
        }
        return this;
     }


    /**
     * <p>执行结果</p>
     * LIKE '%值'  entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgLikeLeft(){
        String msg =entity().getMsg();
        if(msg!=null){
            likeLeft("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * LIKE '值%'  entity().getMsg()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgLikeRight(){
        String msg =entity().getMsg();
        if(msg!=null){
            likeRight("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 等于 =
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgEq(String msg){
        if(msg!=null){
            eq("msg",msg);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * 不等于 &lt;&gt;
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgNe(String msg){
        if(msg!=null){
            ne("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 大于 &gt;
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgGt(String msg){
        if(msg!=null){
            gt("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 大于等于 &gt;=
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgGe(String msg){
        if(msg!=null){
            ge("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 小于 &lt;
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgLt(String msg){
        if(msg!=null){
            lt("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * 小于等于 &lt;=
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgLe(String msg){
        if(msg!=null){
            le("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * LIKE '%值%'
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgLike(String msg){
        if(msg!=null){
            like("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * NOT LIKE '%值%'
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgNotLike(String msg){
        if(msg!=null){
            notLike("msg",msg);
        }
        return this;
     }


    /**
     * <p>执行结果</p>
     * LIKE '%值'
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgLikeLeft(String msg){
        if(msg!=null){
            likeLeft("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * LIKE '值%'
     * @param msg       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgLikeRight(String msg){
        if(msg!=null){
            likeRight("msg",msg);
        }
        return this;
     }

    /**
     * <p>执行结果</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgIsNull(){
        isNull("msg");
        return this;
    }

    /**
     * <p>执行结果</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgIsNotNull(){
        isNotNull("msg");
        return this;
    }

    /**
     * <p>执行结果</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("msg",value);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgIn(String... values){
        if(values!=null && values.length>0){
            in("msg",values);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("msg",value);
        }
        return this;
    }

    /**
     * <p>执行结果</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper msgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("msg",values);
        }
        return this;
    }


    /**
     * <p>app许可证id</p>
     * 等于 = entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdEq(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            eq("app_license_id",appLicenseId);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * 不等于 &lt;&gt; entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdNe(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            ne("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 大于 &gt; entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdGt(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            gt("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 大于等于 &gt;= entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdGe(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            ge("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 小于 &lt; entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdLt(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            lt("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 小于等于 &lt;= entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdLe(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            le("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * BETWEEN  entity().getAppLicenseId() AND appLicenseIdEnd
     * @param appLicenseIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdBetween(Long appLicenseIdEnd){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null && appLicenseIdEnd!=null){
            between("app_license_id",appLicenseId,appLicenseIdEnd);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * NOT BETWEEN  entity().getAppLicenseId() AND 值2
     * @param appLicenseIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdNotBetween(Long appLicenseIdEnd){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null && appLicenseIdEnd!=null){
            notBetween("app_license_id",appLicenseId,appLicenseIdEnd);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * BETWEEN  entity().getAppLicenseId() AND 值2
     * @param appLicenseIdStart       值1
     * @param appLicenseIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdBetween(Long appLicenseIdStart,Long appLicenseIdEnd){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null && appLicenseIdEnd!=null){
            between("app_license_id",appLicenseIdStart,appLicenseIdEnd);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * NOT BETWEEN  entity().getAppLicenseId() AND 值2
     * @param appLicenseIdStart       值1
     * @param appLicenseIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdNotBetween(Long appLicenseIdStart,Long appLicenseIdEnd){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null && appLicenseIdEnd!=null){
            notBetween("app_license_id",appLicenseIdStart,appLicenseIdEnd);
        }
        return this;
     }


    /**
     * <p>app许可证id</p>
     * LIKE '%值%'  entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdLike(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            like("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * NOT LIKE '%值%'  entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdNotLike(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            notLike("app_license_id",appLicenseId);
        }
        return this;
     }


    /**
     * <p>app许可证id</p>
     * LIKE '%值'  entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdLikeLeft(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            likeLeft("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * LIKE '值%'  entity().getAppLicenseId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdLikeRight(){
        Long appLicenseId =entity().getAppLicenseId();
        if(appLicenseId!=null){
            likeRight("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 等于 =
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdEq(Long appLicenseId){
        if(appLicenseId!=null){
            eq("app_license_id",appLicenseId);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * 不等于 &lt;&gt;
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdNe(Long appLicenseId){
        if(appLicenseId!=null){
            ne("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 大于 &gt;
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdGt(Long appLicenseId){
        if(appLicenseId!=null){
            gt("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 大于等于 &gt;=
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdGe(Long appLicenseId){
        if(appLicenseId!=null){
            ge("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 小于 &lt;
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdLt(Long appLicenseId){
        if(appLicenseId!=null){
            lt("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * 小于等于 &lt;=
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdLe(Long appLicenseId){
        if(appLicenseId!=null){
            le("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * LIKE '%值%'
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdLike(Long appLicenseId){
        if(appLicenseId!=null){
            like("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * NOT LIKE '%值%'
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdNotLike(Long appLicenseId){
        if(appLicenseId!=null){
            notLike("app_license_id",appLicenseId);
        }
        return this;
     }


    /**
     * <p>app许可证id</p>
     * LIKE '%值'
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdLikeLeft(Long appLicenseId){
        if(appLicenseId!=null){
            likeLeft("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * LIKE '值%'
     * @param appLicenseId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdLikeRight(Long appLicenseId){
        if(appLicenseId!=null){
            likeRight("app_license_id",appLicenseId);
        }
        return this;
     }

    /**
     * <p>app许可证id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdIsNull(){
        isNull("app_license_id");
        return this;
    }

    /**
     * <p>app许可证id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdIsNotNull(){
        isNotNull("app_license_id");
        return this;
    }

    /**
     * <p>app许可证id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("app_license_id",value);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdIn(Long... values){
        if(values!=null && values.length>0){
            in("app_license_id",values);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("app_license_id",value);
        }
        return this;
    }

    /**
     * <p>app许可证id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("app_license_id",values);
        }
        return this;
    }


    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 等于 = entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeEq(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            eq("app_license_type",appLicenseType);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 不等于 &lt;&gt; entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeNe(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            ne("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 大于 &gt; entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeGt(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            gt("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 大于等于 &gt;= entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeGe(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            ge("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 小于 &lt; entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeLt(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            lt("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 小于等于 &lt;= entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeLe(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            le("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * BETWEEN  entity().getAppLicenseType() AND appLicenseTypeEnd
     * @param appLicenseTypeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeBetween(Integer appLicenseTypeEnd){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null && appLicenseTypeEnd!=null){
            between("app_license_type",appLicenseType,appLicenseTypeEnd);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * NOT BETWEEN  entity().getAppLicenseType() AND 值2
     * @param appLicenseTypeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeNotBetween(Integer appLicenseTypeEnd){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null && appLicenseTypeEnd!=null){
            notBetween("app_license_type",appLicenseType,appLicenseTypeEnd);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * BETWEEN  entity().getAppLicenseType() AND 值2
     * @param appLicenseTypeStart       值1
     * @param appLicenseTypeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeBetween(Integer appLicenseTypeStart,Integer appLicenseTypeEnd){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null && appLicenseTypeEnd!=null){
            between("app_license_type",appLicenseTypeStart,appLicenseTypeEnd);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * NOT BETWEEN  entity().getAppLicenseType() AND 值2
     * @param appLicenseTypeStart       值1
     * @param appLicenseTypeEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeNotBetween(Integer appLicenseTypeStart,Integer appLicenseTypeEnd){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null && appLicenseTypeEnd!=null){
            notBetween("app_license_type",appLicenseTypeStart,appLicenseTypeEnd);
        }
        return this;
     }


    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * LIKE '%值%'  entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeLike(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            like("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * NOT LIKE '%值%'  entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeNotLike(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            notLike("app_license_type",appLicenseType);
        }
        return this;
     }


    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * LIKE '%值'  entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeLikeLeft(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            likeLeft("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * LIKE '值%'  entity().getAppLicenseType()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeLikeRight(){
        Integer appLicenseType =entity().getAppLicenseType();
        if(appLicenseType!=null){
            likeRight("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 等于 =
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeEq(Integer appLicenseType){
        if(appLicenseType!=null){
            eq("app_license_type",appLicenseType);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 不等于 &lt;&gt;
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeNe(Integer appLicenseType){
        if(appLicenseType!=null){
            ne("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 大于 &gt;
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeGt(Integer appLicenseType){
        if(appLicenseType!=null){
            gt("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 大于等于 &gt;=
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeGe(Integer appLicenseType){
        if(appLicenseType!=null){
            ge("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 小于 &lt;
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeLt(Integer appLicenseType){
        if(appLicenseType!=null){
            lt("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * 小于等于 &lt;=
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeLe(Integer appLicenseType){
        if(appLicenseType!=null){
            le("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * LIKE '%值%'
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeLike(Integer appLicenseType){
        if(appLicenseType!=null){
            like("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * NOT LIKE '%值%'
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeNotLike(Integer appLicenseType){
        if(appLicenseType!=null){
            notLike("app_license_type",appLicenseType);
        }
        return this;
     }


    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * LIKE '%值'
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeLikeLeft(Integer appLicenseType){
        if(appLicenseType!=null){
            likeLeft("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * LIKE '值%'
     * @param appLicenseType       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeLikeRight(Integer appLicenseType){
        if(appLicenseType!=null){
            likeRight("app_license_type",appLicenseType);
        }
        return this;
     }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeIsNull(){
        isNull("app_license_type");
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeIsNotNull(){
        isNotNull("app_license_type");
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("app_license_type",value);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("app_license_type",values);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("app_license_type",value);
        }
        return this;
    }

    /**
     * <p>app许可证类型（1：云应用，2：云手机，3：云游戏）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper appLicenseTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("app_license_type",values);
        }
        return this;
    }


    /**
     * <p>链路ID</p>
     * 等于 = entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdEq(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            eq("trace_id",traceId);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * 不等于 &lt;&gt; entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdNe(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            ne("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 大于 &gt; entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdGt(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            gt("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 大于等于 &gt;= entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdGe(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            ge("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 小于 &lt; entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdLt(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            lt("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 小于等于 &lt;= entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdLe(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            le("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * BETWEEN  entity().getTraceId() AND traceIdEnd
     * @param traceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdBetween(String traceIdEnd){
        String traceId =entity().getTraceId();
        if(traceId!=null && traceIdEnd!=null){
            between("trace_id",traceId,traceIdEnd);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * NOT BETWEEN  entity().getTraceId() AND 值2
     * @param traceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdNotBetween(String traceIdEnd){
        String traceId =entity().getTraceId();
        if(traceId!=null && traceIdEnd!=null){
            notBetween("trace_id",traceId,traceIdEnd);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * BETWEEN  entity().getTraceId() AND 值2
     * @param traceIdStart       值1
     * @param traceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdBetween(String traceIdStart,String traceIdEnd){
        String traceId =entity().getTraceId();
        if(traceId!=null && traceIdEnd!=null){
            between("trace_id",traceIdStart,traceIdEnd);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * NOT BETWEEN  entity().getTraceId() AND 值2
     * @param traceIdStart       值1
     * @param traceIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdNotBetween(String traceIdStart,String traceIdEnd){
        String traceId =entity().getTraceId();
        if(traceId!=null && traceIdEnd!=null){
            notBetween("trace_id",traceIdStart,traceIdEnd);
        }
        return this;
     }


    /**
     * <p>链路ID</p>
     * LIKE '%值%'  entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdLike(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            like("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * NOT LIKE '%值%'  entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdNotLike(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            notLike("trace_id",traceId);
        }
        return this;
     }


    /**
     * <p>链路ID</p>
     * LIKE '%值'  entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdLikeLeft(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            likeLeft("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * LIKE '值%'  entity().getTraceId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdLikeRight(){
        String traceId =entity().getTraceId();
        if(traceId!=null){
            likeRight("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 等于 =
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdEq(String traceId){
        if(traceId!=null){
            eq("trace_id",traceId);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * 不等于 &lt;&gt;
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdNe(String traceId){
        if(traceId!=null){
            ne("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 大于 &gt;
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdGt(String traceId){
        if(traceId!=null){
            gt("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 大于等于 &gt;=
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdGe(String traceId){
        if(traceId!=null){
            ge("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 小于 &lt;
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdLt(String traceId){
        if(traceId!=null){
            lt("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * 小于等于 &lt;=
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdLe(String traceId){
        if(traceId!=null){
            le("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * LIKE '%值%'
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdLike(String traceId){
        if(traceId!=null){
            like("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * NOT LIKE '%值%'
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdNotLike(String traceId){
        if(traceId!=null){
            notLike("trace_id",traceId);
        }
        return this;
     }


    /**
     * <p>链路ID</p>
     * LIKE '%值'
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdLikeLeft(String traceId){
        if(traceId!=null){
            likeLeft("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * LIKE '值%'
     * @param traceId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdLikeRight(String traceId){
        if(traceId!=null){
            likeRight("trace_id",traceId);
        }
        return this;
     }

    /**
     * <p>链路ID</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdIsNull(){
        isNull("trace_id");
        return this;
    }

    /**
     * <p>链路ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdIsNotNull(){
        isNotNull("trace_id");
        return this;
    }

    /**
     * <p>链路ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("trace_id",value);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdIn(String... values){
        if(values!=null && values.length>0){
            in("trace_id",values);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("trace_id",value);
        }
        return this;
    }

    /**
     * <p>链路ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper traceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("trace_id",values);
        }
        return this;
    }


    /**
     * <p>商户资源池ID【非必填】</p>
     * 等于 = entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdEq(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            eq("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 不等于 &lt;&gt; entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNe(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            ne("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 大于 &gt; entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdGt(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            gt("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 大于等于 &gt;= entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdGe(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            ge("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 小于 &lt; entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLt(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            lt("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 小于等于 &lt;= entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLe(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            le("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * BETWEEN  entity().getFkCpTnResourcePoolId() AND fkCpTnResourcePoolIdEnd
     * @param fkCpTnResourcePoolIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdBetween(Long fkCpTnResourcePoolIdEnd){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null && fkCpTnResourcePoolIdEnd!=null){
            between("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId,fkCpTnResourcePoolIdEnd);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * NOT BETWEEN  entity().getFkCpTnResourcePoolId() AND 值2
     * @param fkCpTnResourcePoolIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNotBetween(Long fkCpTnResourcePoolIdEnd){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null && fkCpTnResourcePoolIdEnd!=null){
            notBetween("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId,fkCpTnResourcePoolIdEnd);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * BETWEEN  entity().getFkCpTnResourcePoolId() AND 值2
     * @param fkCpTnResourcePoolIdStart       值1
     * @param fkCpTnResourcePoolIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdBetween(Long fkCpTnResourcePoolIdStart,Long fkCpTnResourcePoolIdEnd){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null && fkCpTnResourcePoolIdEnd!=null){
            between("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolIdStart,fkCpTnResourcePoolIdEnd);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * NOT BETWEEN  entity().getFkCpTnResourcePoolId() AND 值2
     * @param fkCpTnResourcePoolIdStart       值1
     * @param fkCpTnResourcePoolIdEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNotBetween(Long fkCpTnResourcePoolIdStart,Long fkCpTnResourcePoolIdEnd){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null && fkCpTnResourcePoolIdEnd!=null){
            notBetween("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolIdStart,fkCpTnResourcePoolIdEnd);
        }
        return this;
     }


    /**
     * <p>商户资源池ID【非必填】</p>
     * LIKE '%值%'  entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLike(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            like("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * NOT LIKE '%值%'  entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNotLike(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            notLike("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }


    /**
     * <p>商户资源池ID【非必填】</p>
     * LIKE '%值'  entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLikeLeft(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            likeLeft("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * LIKE '值%'  entity().getFkCpTnResourcePoolId()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLikeRight(){
        Long fkCpTnResourcePoolId =entity().getFkCpTnResourcePoolId();
        if(fkCpTnResourcePoolId!=null){
            likeRight("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 等于 =
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdEq(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            eq("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 不等于 &lt;&gt;
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNe(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            ne("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 大于 &gt;
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdGt(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            gt("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 大于等于 &gt;=
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdGe(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            ge("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 小于 &lt;
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLt(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            lt("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * 小于等于 &lt;=
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLe(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            le("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * LIKE '%值%'
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLike(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            like("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * NOT LIKE '%值%'
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNotLike(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            notLike("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }


    /**
     * <p>商户资源池ID【非必填】</p>
     * LIKE '%值'
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLikeLeft(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            likeLeft("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * LIKE '值%'
     * @param fkCpTnResourcePoolId       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLikeRight(Long fkCpTnResourcePoolId){
        if(fkCpTnResourcePoolId!=null){
            likeRight("fk_cp_tn_resource_pool_id",fkCpTnResourcePoolId);
        }
        return this;
     }

    /**
     * <p>商户资源池ID【非必填】</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdIsNull(){
        isNull("fk_cp_tn_resource_pool_id");
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdIsNotNull(){
        isNotNull("fk_cp_tn_resource_pool_id");
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_cp_tn_resource_pool_id",value);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_cp_tn_resource_pool_id",values);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_cp_tn_resource_pool_id",value);
        }
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_cp_tn_resource_pool_id",values);
        }
        return this;
    }


    /**
     * <p>资源池名称【非必填】</p>
     * 等于 = entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameEq(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            eq("resource_pool_name",resourcePoolName);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * 不等于 &lt;&gt; entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameNe(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            ne("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 大于 &gt; entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameGt(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            gt("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 大于等于 &gt;= entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameGe(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            ge("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 小于 &lt; entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameLt(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            lt("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 小于等于 &lt;= entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameLe(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            le("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * BETWEEN  entity().getResourcePoolName() AND resourcePoolNameEnd
     * @param resourcePoolNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameBetween(String resourcePoolNameEnd){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null && resourcePoolNameEnd!=null){
            between("resource_pool_name",resourcePoolName,resourcePoolNameEnd);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * NOT BETWEEN  entity().getResourcePoolName() AND 值2
     * @param resourcePoolNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameNotBetween(String resourcePoolNameEnd){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null && resourcePoolNameEnd!=null){
            notBetween("resource_pool_name",resourcePoolName,resourcePoolNameEnd);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * BETWEEN  entity().getResourcePoolName() AND 值2
     * @param resourcePoolNameStart       值1
     * @param resourcePoolNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameBetween(String resourcePoolNameStart,String resourcePoolNameEnd){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null && resourcePoolNameEnd!=null){
            between("resource_pool_name",resourcePoolNameStart,resourcePoolNameEnd);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * NOT BETWEEN  entity().getResourcePoolName() AND 值2
     * @param resourcePoolNameStart       值1
     * @param resourcePoolNameEnd      值2
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameNotBetween(String resourcePoolNameStart,String resourcePoolNameEnd){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null && resourcePoolNameEnd!=null){
            notBetween("resource_pool_name",resourcePoolNameStart,resourcePoolNameEnd);
        }
        return this;
     }


    /**
     * <p>资源池名称【非必填】</p>
     * LIKE '%值%'  entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameLike(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            like("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * NOT LIKE '%值%'  entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameNotLike(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            notLike("resource_pool_name",resourcePoolName);
        }
        return this;
     }


    /**
     * <p>资源池名称【非必填】</p>
     * LIKE '%值'  entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameLikeLeft(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            likeLeft("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * LIKE '值%'  entity().getResourcePoolName()
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameLikeRight(){
        String resourcePoolName =entity().getResourcePoolName();
        if(resourcePoolName!=null){
            likeRight("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 等于 =
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameEq(String resourcePoolName){
        if(resourcePoolName!=null){
            eq("resource_pool_name",resourcePoolName);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * 不等于 &lt;&gt;
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameNe(String resourcePoolName){
        if(resourcePoolName!=null){
            ne("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 大于 &gt;
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameGt(String resourcePoolName){
        if(resourcePoolName!=null){
            gt("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 大于等于 &gt;=
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameGe(String resourcePoolName){
        if(resourcePoolName!=null){
            ge("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 小于 &lt;
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameLt(String resourcePoolName){
        if(resourcePoolName!=null){
            lt("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * 小于等于 &lt;=
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameLe(String resourcePoolName){
        if(resourcePoolName!=null){
            le("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * LIKE '%值%'
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameLike(String resourcePoolName){
        if(resourcePoolName!=null){
            like("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * NOT LIKE '%值%'
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameNotLike(String resourcePoolName){
        if(resourcePoolName!=null){
            notLike("resource_pool_name",resourcePoolName);
        }
        return this;
     }


    /**
     * <p>资源池名称【非必填】</p>
     * LIKE '%值'
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameLikeLeft(String resourcePoolName){
        if(resourcePoolName!=null){
            likeLeft("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * LIKE '值%'
     * @param resourcePoolName       值
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameLikeRight(String resourcePoolName){
        if(resourcePoolName!=null){
            likeRight("resource_pool_name",resourcePoolName);
        }
        return this;
     }

    /**
     * <p>资源池名称【非必填】</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameIsNull(){
        isNull("resource_pool_name");
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameIsNotNull(){
        isNotNull("resource_pool_name");
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("resource_pool_name",value);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameIn(String... values){
        if(values!=null && values.length>0){
            in("resource_pool_name",values);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("resource_pool_name",value);
        }
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineAssignTaskEoQueryEntityWrapper resourcePoolNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("resource_pool_name",values);
        }
        return this;
    }



}
