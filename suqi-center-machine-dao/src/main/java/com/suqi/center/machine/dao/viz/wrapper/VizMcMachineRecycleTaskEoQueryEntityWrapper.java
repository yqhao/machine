package com.suqi.center.machine.dao.viz.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineRecycleTaskEo;

import java.util.Collection;
import java.util.Date;
import java.util.function.Consumer;

/**
 * <p>
 * 【可视化】机器回收任务表
 * </p>
 * "viz_mc_machine_recycle_task"
 * @author Administrator
 */
public class VizMcMachineRecycleTaskEoQueryEntityWrapper extends QueryWrapper<VizMcMachineRecycleTaskEo> {

    public static VizMcMachineRecycleTaskEoQueryEntityWrapper wrapper(VizMcMachineRecycleTaskEo entity) {
        return new VizMcMachineRecycleTaskEoQueryEntityWrapper(entity);
    }

    private VizMcMachineRecycleTaskEo entity;

    public VizMcMachineRecycleTaskEoQueryEntityWrapper(VizMcMachineRecycleTaskEo entity) {
         this.entity=entity;
    }


    protected VizMcMachineRecycleTaskEo entity() {
        if(entity==null){
            throw new NullPointerException("VizMcMachineRecycleTaskEo is null");
        }
        return entity;
    }

    @Override
    public VizMcMachineRecycleTaskEoQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public VizMcMachineRecycleTaskEoQueryEntityWrapper selectColumns(Consumer<VizMcMachineRecycleTaskEoSelect> consumer) {
        VizMcMachineRecycleTaskEoSelect select = new VizMcMachineRecycleTaskEoSelect();
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idBetween(Long idEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idNotBetween(Long idEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idEq(Long id){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idNe(Long id){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idGt(Long id){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idGe(Long id){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idLt(Long id){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idLe(Long id){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idLike(Long id){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idNotLike(Long id){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idLikeLeft(Long id){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idLikeRight(Long id){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>主键ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>主键ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idIn(Long... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper idNotIn(Long... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoBetween(String batchNoEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoNotBetween(String batchNoEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoBetween(String batchNoStart,String batchNoEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoNotBetween(String batchNoStart,String batchNoEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoEq(String batchNo){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoNe(String batchNo){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoGt(String batchNo){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoGe(String batchNo){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoLt(String batchNo){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoLe(String batchNo){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoLike(String batchNo){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoNotLike(String batchNo){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoLikeLeft(String batchNo){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoLikeRight(String batchNo){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoIsNull(){
        isNull("batch_no");
        return this;
    }

    /**
     * <p>任务批次号</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoIsNotNull(){
        isNotNull("batch_no");
        return this;
    }

    /**
     * <p>任务批次号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper batchNoNotIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdBetween(Long tenantIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdNotBetween(Long tenantIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdBetween(Long tenantIdStart,Long tenantIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdNotBetween(Long tenantIdStart,Long tenantIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdEq(Long tenantId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdNe(Long tenantId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdGt(Long tenantId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdGe(Long tenantId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdLt(Long tenantId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdLe(Long tenantId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdLike(Long tenantId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdNotLike(Long tenantId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdLikeLeft(Long tenantId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdLikeRight(Long tenantId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdIsNull(){
        isNull("tenant_id");
        return this;
    }

    /**
     * <p>商户ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdIsNotNull(){
        isNotNull("tenant_id");
        return this;
    }

    /**
     * <p>商户ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdIn(Long... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdNotIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantIdNotIn(Long... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameBetween(String tenantNameEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameNotBetween(String tenantNameEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameBetween(String tenantNameStart,String tenantNameEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameNotBetween(String tenantNameStart,String tenantNameEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameEq(String tenantName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameNe(String tenantName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameGt(String tenantName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameGe(String tenantName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameLt(String tenantName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameLe(String tenantName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameLike(String tenantName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameNotLike(String tenantName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameLikeLeft(String tenantName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameLikeRight(String tenantName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameIsNull(){
        isNull("tenant_name");
        return this;
    }

    /**
     * <p>商户名称</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameIsNotNull(){
        isNotNull("tenant_name");
        return this;
    }

    /**
     * <p>商户名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper tenantNameNotIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrBetween(String externalAddrEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrNotBetween(String externalAddrEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrBetween(String externalAddrStart,String externalAddrEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrNotBetween(String externalAddrStart,String externalAddrEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrEq(String externalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrNe(String externalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrGt(String externalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrGe(String externalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrLt(String externalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrLe(String externalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrLike(String externalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrNotLike(String externalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrLikeLeft(String externalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrLikeRight(String externalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrIsNull(){
        isNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrIsNotNull(){
        isNotNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper externalAddrNotIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrBetween(String internalAddrEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrNotBetween(String internalAddrEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrBetween(String internalAddrStart,String internalAddrEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrNotBetween(String internalAddrStart,String internalAddrEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrEq(String internalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrNe(String internalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrGt(String internalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrGe(String internalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrLt(String internalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrLe(String internalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrLike(String internalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrNotLike(String internalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrLikeLeft(String internalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrLikeRight(String internalAddr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrIsNull(){
        isNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrIsNotNull(){
        isNotNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper internalAddrNotIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdNotBetween(Long fkMcMachineIdStart,Long fkMcMachineIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdEq(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdNe(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdGt(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdGe(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdLt(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdLe(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdLike(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdNotLike(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdLikeLeft(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdLikeRight(Long fkMcMachineId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdIsNull(){
        isNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdIsNotNull(){
        isNotNull("fk_mc_machine_id");
        return this;
    }

    /**
     * <p>机器基础信息表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdIn(Long... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdNotIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkMcMachineIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_machine_id",values);
        }
        return this;
    }


    /**
     * <p>租户设备表记录id</p>
     * 等于 = entity().getFkVizTnMachineId()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdEq(){
        Long fkVizTnMachineId =entity().getFkVizTnMachineId();
        if(fkVizTnMachineId!=null){
            eq("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
    }

    /**
     * <p>租户设备表记录id</p>
     * 不等于 &lt;&gt; entity().getFkVizTnMachineId()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdNe(){
        Long fkVizTnMachineId =entity().getFkVizTnMachineId();
        if(fkVizTnMachineId!=null){
            ne("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * 大于 &gt; entity().getFkVizTnMachineId()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdGt(){
        Long fkVizTnMachineId =entity().getFkVizTnMachineId();
        if(fkVizTnMachineId!=null){
            gt("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * 大于等于 &gt;= entity().getFkVizTnMachineId()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdGe(){
        Long fkVizTnMachineId =entity().getFkVizTnMachineId();
        if(fkVizTnMachineId!=null){
            ge("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * 小于 &lt; entity().getFkVizTnMachineId()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdLt(){
        Long fkVizTnMachineId =entity().getFkVizTnMachineId();
        if(fkVizTnMachineId!=null){
            lt("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * 小于等于 &lt;= entity().getFkVizTnMachineId()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdLe(){
        Long fkVizTnMachineId =entity().getFkVizTnMachineId();
        if(fkVizTnMachineId!=null){
            le("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * BETWEEN  entity().getFkVizTnMachineId() AND fkVizTnMachineIdEnd
     * @param fkVizTnMachineIdEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdBetween(Long fkVizTnMachineIdEnd){
        Long fkVizTnMachineId =entity().getFkVizTnMachineId();
        if(fkVizTnMachineId!=null && fkVizTnMachineIdEnd!=null){
            between("fk_viz_tn_machine_id",fkVizTnMachineId,fkVizTnMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * NOT BETWEEN  entity().getFkVizTnMachineId() AND 值2
     * @param fkVizTnMachineIdEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdNotBetween(Long fkVizTnMachineIdEnd){
        Long fkVizTnMachineId =entity().getFkVizTnMachineId();
        if(fkVizTnMachineId!=null && fkVizTnMachineIdEnd!=null){
            notBetween("fk_viz_tn_machine_id",fkVizTnMachineId,fkVizTnMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * BETWEEN  entity().getFkVizTnMachineId() AND 值2
     * @param fkVizTnMachineIdStart       值1
     * @param fkVizTnMachineIdEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdBetween(Long fkVizTnMachineIdStart,Long fkVizTnMachineIdEnd){
        Long fkVizTnMachineId =entity().getFkVizTnMachineId();
        if(fkVizTnMachineId!=null && fkVizTnMachineIdEnd!=null){
            between("fk_viz_tn_machine_id",fkVizTnMachineIdStart,fkVizTnMachineIdEnd);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * NOT BETWEEN  entity().getFkVizTnMachineId() AND 值2
     * @param fkVizTnMachineIdStart       值1
     * @param fkVizTnMachineIdEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdNotBetween(Long fkVizTnMachineIdStart,Long fkVizTnMachineIdEnd){
        Long fkVizTnMachineId =entity().getFkVizTnMachineId();
        if(fkVizTnMachineId!=null && fkVizTnMachineIdEnd!=null){
            notBetween("fk_viz_tn_machine_id",fkVizTnMachineIdStart,fkVizTnMachineIdEnd);
        }
        return this;
     }


    /**
     * <p>租户设备表记录id</p>
     * LIKE '%值%'  entity().getFkVizTnMachineId()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdLike(){
        Long fkVizTnMachineId =entity().getFkVizTnMachineId();
        if(fkVizTnMachineId!=null){
            like("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * NOT LIKE '%值%'  entity().getFkVizTnMachineId()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdNotLike(){
        Long fkVizTnMachineId =entity().getFkVizTnMachineId();
        if(fkVizTnMachineId!=null){
            notLike("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }


    /**
     * <p>租户设备表记录id</p>
     * LIKE '%值'  entity().getFkVizTnMachineId()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdLikeLeft(){
        Long fkVizTnMachineId =entity().getFkVizTnMachineId();
        if(fkVizTnMachineId!=null){
            likeLeft("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * LIKE '值%'  entity().getFkVizTnMachineId()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdLikeRight(){
        Long fkVizTnMachineId =entity().getFkVizTnMachineId();
        if(fkVizTnMachineId!=null){
            likeRight("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * 等于 =
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdEq(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            eq("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
    }

    /**
     * <p>租户设备表记录id</p>
     * 不等于 &lt;&gt;
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdNe(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            ne("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * 大于 &gt;
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdGt(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            gt("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * 大于等于 &gt;=
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdGe(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            ge("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * 小于 &lt;
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdLt(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            lt("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * 小于等于 &lt;=
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdLe(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            le("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * LIKE '%值%'
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdLike(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            like("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * NOT LIKE '%值%'
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdNotLike(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            notLike("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }


    /**
     * <p>租户设备表记录id</p>
     * LIKE '%值'
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdLikeLeft(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            likeLeft("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * LIKE '值%'
     * @param fkVizTnMachineId       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdLikeRight(Long fkVizTnMachineId){
        if(fkVizTnMachineId!=null){
            likeRight("fk_viz_tn_machine_id",fkVizTnMachineId);
        }
        return this;
     }

    /**
     * <p>租户设备表记录id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdIsNull(){
        isNull("fk_viz_tn_machine_id");
        return this;
    }

    /**
     * <p>租户设备表记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdIsNotNull(){
        isNotNull("fk_viz_tn_machine_id");
        return this;
    }

    /**
     * <p>租户设备表记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_viz_tn_machine_id",value);
        }
        return this;
    }

    /**
     * <p>租户设备表记录id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_viz_tn_machine_id",values);
        }
        return this;
    }

    /**
     * <p>租户设备表记录id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_viz_tn_machine_id",value);
        }
        return this;
    }

    /**
     * <p>租户设备表记录id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkVizTnMachineIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_viz_tn_machine_id",values);
        }
        return this;
    }


    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdEq(String deviceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdNe(String deviceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdGt(String deviceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdGe(String deviceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdLt(String deviceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdLe(String deviceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdLike(String deviceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdNotLike(String deviceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper deviceIdNotIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdBetween(String instanceIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdNotBetween(String instanceIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdEq(String instanceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdNe(String instanceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdGt(String instanceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdGe(String instanceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdLt(String instanceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdLe(String instanceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdLike(String instanceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdNotLike(String instanceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdLikeLeft(String instanceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdLikeRight(String instanceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }


    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 等于 = entity().getRecycleStatus()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusEq(){
        Integer recycleStatus =entity().getRecycleStatus();
        if(recycleStatus!=null){
            eq("recycle_status",recycleStatus);
        }
        return this;
    }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 不等于 &lt;&gt; entity().getRecycleStatus()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusNe(){
        Integer recycleStatus =entity().getRecycleStatus();
        if(recycleStatus!=null){
            ne("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 大于 &gt; entity().getRecycleStatus()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusGt(){
        Integer recycleStatus =entity().getRecycleStatus();
        if(recycleStatus!=null){
            gt("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 大于等于 &gt;= entity().getRecycleStatus()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusGe(){
        Integer recycleStatus =entity().getRecycleStatus();
        if(recycleStatus!=null){
            ge("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 小于 &lt; entity().getRecycleStatus()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusLt(){
        Integer recycleStatus =entity().getRecycleStatus();
        if(recycleStatus!=null){
            lt("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 小于等于 &lt;= entity().getRecycleStatus()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusLe(){
        Integer recycleStatus =entity().getRecycleStatus();
        if(recycleStatus!=null){
            le("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * BETWEEN  entity().getRecycleStatus() AND recycleStatusEnd
     * @param recycleStatusEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusBetween(Integer recycleStatusEnd){
        Integer recycleStatus =entity().getRecycleStatus();
        if(recycleStatus!=null && recycleStatusEnd!=null){
            between("recycle_status",recycleStatus,recycleStatusEnd);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * NOT BETWEEN  entity().getRecycleStatus() AND 值2
     * @param recycleStatusEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusNotBetween(Integer recycleStatusEnd){
        Integer recycleStatus =entity().getRecycleStatus();
        if(recycleStatus!=null && recycleStatusEnd!=null){
            notBetween("recycle_status",recycleStatus,recycleStatusEnd);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * BETWEEN  entity().getRecycleStatus() AND 值2
     * @param recycleStatusStart       值1
     * @param recycleStatusEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusBetween(Integer recycleStatusStart,Integer recycleStatusEnd){
        Integer recycleStatus =entity().getRecycleStatus();
        if(recycleStatus!=null && recycleStatusEnd!=null){
            between("recycle_status",recycleStatusStart,recycleStatusEnd);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * NOT BETWEEN  entity().getRecycleStatus() AND 值2
     * @param recycleStatusStart       值1
     * @param recycleStatusEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusNotBetween(Integer recycleStatusStart,Integer recycleStatusEnd){
        Integer recycleStatus =entity().getRecycleStatus();
        if(recycleStatus!=null && recycleStatusEnd!=null){
            notBetween("recycle_status",recycleStatusStart,recycleStatusEnd);
        }
        return this;
     }


    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * LIKE '%值%'  entity().getRecycleStatus()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusLike(){
        Integer recycleStatus =entity().getRecycleStatus();
        if(recycleStatus!=null){
            like("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * NOT LIKE '%值%'  entity().getRecycleStatus()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusNotLike(){
        Integer recycleStatus =entity().getRecycleStatus();
        if(recycleStatus!=null){
            notLike("recycle_status",recycleStatus);
        }
        return this;
     }


    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * LIKE '%值'  entity().getRecycleStatus()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusLikeLeft(){
        Integer recycleStatus =entity().getRecycleStatus();
        if(recycleStatus!=null){
            likeLeft("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * LIKE '值%'  entity().getRecycleStatus()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusLikeRight(){
        Integer recycleStatus =entity().getRecycleStatus();
        if(recycleStatus!=null){
            likeRight("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 等于 =
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusEq(Integer recycleStatus){
        if(recycleStatus!=null){
            eq("recycle_status",recycleStatus);
        }
        return this;
    }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 不等于 &lt;&gt;
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusNe(Integer recycleStatus){
        if(recycleStatus!=null){
            ne("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 大于 &gt;
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusGt(Integer recycleStatus){
        if(recycleStatus!=null){
            gt("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 大于等于 &gt;=
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusGe(Integer recycleStatus){
        if(recycleStatus!=null){
            ge("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 小于 &lt;
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusLt(Integer recycleStatus){
        if(recycleStatus!=null){
            lt("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * 小于等于 &lt;=
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusLe(Integer recycleStatus){
        if(recycleStatus!=null){
            le("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * LIKE '%值%'
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusLike(Integer recycleStatus){
        if(recycleStatus!=null){
            like("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * NOT LIKE '%值%'
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusNotLike(Integer recycleStatus){
        if(recycleStatus!=null){
            notLike("recycle_status",recycleStatus);
        }
        return this;
     }


    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * LIKE '%值'
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusLikeLeft(Integer recycleStatus){
        if(recycleStatus!=null){
            likeLeft("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * LIKE '值%'
     * @param recycleStatus       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusLikeRight(Integer recycleStatus){
        if(recycleStatus!=null){
            likeRight("recycle_status",recycleStatus);
        }
        return this;
     }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusIsNull(){
        isNull("recycle_status");
        return this;
    }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusIsNotNull(){
        isNotNull("recycle_status");
        return this;
    }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("recycle_status",value);
        }
        return this;
    }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("recycle_status",values);
        }
        return this;
    }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("recycle_status",value);
        }
        return this;
    }

    /**
     * <p>回收状态(10：待回收，20：已回收, 30:回收失败)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("recycle_status",values);
        }
        return this;
    }


    /**
     * <p>操作人用户ID</p>
     * 等于 = entity().getOperateUserId()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdBetween(Long operateUserIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdNotBetween(Long operateUserIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdBetween(Long operateUserIdStart,Long operateUserIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdNotBetween(Long operateUserIdStart,Long operateUserIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdEq(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdNe(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdGt(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdGe(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdLt(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdLe(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdLike(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdNotLike(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdLikeLeft(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdLikeRight(Long operateUserId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdIsNull(){
        isNull("operate_user_id");
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdIsNotNull(){
        isNotNull("operate_user_id");
        return this;
    }

    /**
     * <p>操作人用户ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdIn(Long... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdNotIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper operateUserIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("operate_user_id",values);
        }
        return this;
    }


    /**
     * <p>回收时间</p>
     * 等于 = entity().getRecycleTime()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeEq(){
        Date recycleTime =entity().getRecycleTime();
        if(recycleTime!=null){
            eq("recycle_time",recycleTime);
        }
        return this;
    }

    /**
     * <p>回收时间</p>
     * 不等于 &lt;&gt; entity().getRecycleTime()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeNe(){
        Date recycleTime =entity().getRecycleTime();
        if(recycleTime!=null){
            ne("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * 大于 &gt; entity().getRecycleTime()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeGt(){
        Date recycleTime =entity().getRecycleTime();
        if(recycleTime!=null){
            gt("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * 大于等于 &gt;= entity().getRecycleTime()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeGe(){
        Date recycleTime =entity().getRecycleTime();
        if(recycleTime!=null){
            ge("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * 小于 &lt; entity().getRecycleTime()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeLt(){
        Date recycleTime =entity().getRecycleTime();
        if(recycleTime!=null){
            lt("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * 小于等于 &lt;= entity().getRecycleTime()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeLe(){
        Date recycleTime =entity().getRecycleTime();
        if(recycleTime!=null){
            le("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * BETWEEN  entity().getRecycleTime() AND recycleTimeEnd
     * @param recycleTimeEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeBetween(Date recycleTimeEnd){
        Date recycleTime =entity().getRecycleTime();
        if(recycleTime!=null && recycleTimeEnd!=null){
            between("recycle_time",recycleTime,recycleTimeEnd);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * NOT BETWEEN  entity().getRecycleTime() AND 值2
     * @param recycleTimeEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeNotBetween(Date recycleTimeEnd){
        Date recycleTime =entity().getRecycleTime();
        if(recycleTime!=null && recycleTimeEnd!=null){
            notBetween("recycle_time",recycleTime,recycleTimeEnd);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * BETWEEN  entity().getRecycleTime() AND 值2
     * @param recycleTimeStart       值1
     * @param recycleTimeEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeBetween(Date recycleTimeStart,Date recycleTimeEnd){
        Date recycleTime =entity().getRecycleTime();
        if(recycleTime!=null && recycleTimeEnd!=null){
            between("recycle_time",recycleTimeStart,recycleTimeEnd);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * NOT BETWEEN  entity().getRecycleTime() AND 值2
     * @param recycleTimeStart       值1
     * @param recycleTimeEnd      值2
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeNotBetween(Date recycleTimeStart,Date recycleTimeEnd){
        Date recycleTime =entity().getRecycleTime();
        if(recycleTime!=null && recycleTimeEnd!=null){
            notBetween("recycle_time",recycleTimeStart,recycleTimeEnd);
        }
        return this;
     }


    /**
     * <p>回收时间</p>
     * LIKE '%值%'  entity().getRecycleTime()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeLike(){
        Date recycleTime =entity().getRecycleTime();
        if(recycleTime!=null){
            like("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * NOT LIKE '%值%'  entity().getRecycleTime()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeNotLike(){
        Date recycleTime =entity().getRecycleTime();
        if(recycleTime!=null){
            notLike("recycle_time",recycleTime);
        }
        return this;
     }


    /**
     * <p>回收时间</p>
     * LIKE '%值'  entity().getRecycleTime()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeLikeLeft(){
        Date recycleTime =entity().getRecycleTime();
        if(recycleTime!=null){
            likeLeft("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * LIKE '值%'  entity().getRecycleTime()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeLikeRight(){
        Date recycleTime =entity().getRecycleTime();
        if(recycleTime!=null){
            likeRight("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * 等于 =
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeEq(Date recycleTime){
        if(recycleTime!=null){
            eq("recycle_time",recycleTime);
        }
        return this;
    }

    /**
     * <p>回收时间</p>
     * 不等于 &lt;&gt;
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeNe(Date recycleTime){
        if(recycleTime!=null){
            ne("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * 大于 &gt;
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeGt(Date recycleTime){
        if(recycleTime!=null){
            gt("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * 大于等于 &gt;=
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeGe(Date recycleTime){
        if(recycleTime!=null){
            ge("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * 小于 &lt;
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeLt(Date recycleTime){
        if(recycleTime!=null){
            lt("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * 小于等于 &lt;=
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeLe(Date recycleTime){
        if(recycleTime!=null){
            le("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * LIKE '%值%'
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeLike(Date recycleTime){
        if(recycleTime!=null){
            like("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * NOT LIKE '%值%'
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeNotLike(Date recycleTime){
        if(recycleTime!=null){
            notLike("recycle_time",recycleTime);
        }
        return this;
     }


    /**
     * <p>回收时间</p>
     * LIKE '%值'
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeLikeLeft(Date recycleTime){
        if(recycleTime!=null){
            likeLeft("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * LIKE '值%'
     * @param recycleTime       值
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeLikeRight(Date recycleTime){
        if(recycleTime!=null){
            likeRight("recycle_time",recycleTime);
        }
        return this;
     }

    /**
     * <p>回收时间</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeIsNull(){
        isNull("recycle_time");
        return this;
    }

    /**
     * <p>回收时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeIsNotNull(){
        isNotNull("recycle_time");
        return this;
    }

    /**
     * <p>回收时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("recycle_time",value);
        }
        return this;
    }

    /**
     * <p>回收时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("recycle_time",values);
        }
        return this;
    }

    /**
     * <p>回收时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("recycle_time",value);
        }
        return this;
    }

    /**
     * <p>回收时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper recycleTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("recycle_time",values);
        }
        return this;
    }


    /**
     * <p>版本id</p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdBetween(Long versionIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdNotBetween(Long versionIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdEq(Long versionId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdNe(Long versionId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdGt(Long versionId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdGe(Long versionId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdLt(Long versionId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdLe(Long versionId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdLike(Long versionId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdNotLike(Long versionId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdLikeLeft(Long versionId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdLikeRight(Long versionId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdIn(Long... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper versionIdNotIn(Long... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeEq(Date createTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeNe(Date createTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeGt(Date createTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeGe(Date createTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeLt(Date createTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeLe(Date createTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeLike(Date createTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeIn(Date... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createTimeNotIn(Date... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonBetween(String createPersonEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonNotBetween(String createPersonEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonBetween(String createPersonStart,String createPersonEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonNotBetween(String createPersonStart,String createPersonEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonEq(String createPerson){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonNe(String createPerson){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonGt(String createPerson){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonGe(String createPerson){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonLt(String createPerson){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonLe(String createPerson){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonLike(String createPerson){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonNotLike(String createPerson){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonLikeLeft(String createPerson){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonLikeRight(String createPerson){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonIsNull(){
        isNull("create_person");
        return this;
    }

    /**
     * <p>创建人</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonIsNotNull(){
        isNotNull("create_person");
        return this;
    }

    /**
     * <p>创建人</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper createPersonNotIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeBetween(Date updateTimeEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeNotBetween(Date updateTimeEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeBetween(Date updateTimeStart,Date updateTimeEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeNotBetween(Date updateTimeStart,Date updateTimeEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeEq(Date updateTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeNe(Date updateTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeGt(Date updateTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeGe(Date updateTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeLt(Date updateTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeLe(Date updateTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeLike(Date updateTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeNotLike(Date updateTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeLikeLeft(Date updateTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeLikeRight(Date updateTime){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeIsNull(){
        isNull("update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeIsNotNull(){
        isNotNull("update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeIn(Collection<Date> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeIn(Date... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeNotIn(Collection<Date> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper updateTimeNotIn(Date... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drBetween(Integer drEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drNotBetween(Integer drEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drBetween(Integer drStart,Integer drEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drNotBetween(Integer drStart,Integer drEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drEq(Integer dr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drNe(Integer dr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drGt(Integer dr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drGe(Integer dr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drLt(Integer dr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drLe(Integer dr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drLike(Integer dr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drNotLike(Integer dr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drLikeLeft(Integer dr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drLikeRight(Integer dr){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drIsNull(){
        isNull("dr");
        return this;
    }

    /**
     * <p>是否删除</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drIsNotNull(){
        isNotNull("dr");
        return this;
    }

    /**
     * <p>是否删除</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drIn(Collection<Integer> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drIn(Integer... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drNotIn(Collection<Integer> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper drNotIn(Integer... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgBetween(String msgEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgNotBetween(String msgEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgBetween(String msgStart,String msgEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgNotBetween(String msgStart,String msgEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgEq(String msg){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgNe(String msg){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgGt(String msg){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgGe(String msg){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgLt(String msg){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgLe(String msg){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgLike(String msg){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgNotLike(String msg){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgLikeLeft(String msg){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgLikeRight(String msg){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgIsNull(){
        isNull("msg");
        return this;
    }

    /**
     * <p>执行结果</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgIsNotNull(){
        isNotNull("msg");
        return this;
    }

    /**
     * <p>执行结果</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper msgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("msg",values);
        }
        return this;
    }


    /**
     * <p>链路ID</p>
     * 等于 = entity().getTraceId()
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdBetween(String traceIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdNotBetween(String traceIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdBetween(String traceIdStart,String traceIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdNotBetween(String traceIdStart,String traceIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdEq(String traceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdNe(String traceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdGt(String traceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdGe(String traceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdLt(String traceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdLe(String traceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdLike(String traceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdNotLike(String traceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdLikeLeft(String traceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdLikeRight(String traceId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdIsNull(){
        isNull("trace_id");
        return this;
    }

    /**
     * <p>链路ID</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdIsNotNull(){
        isNotNull("trace_id");
        return this;
    }

    /**
     * <p>链路ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper traceIdNotIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdBetween(Long fkCpTnResourcePoolIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNotBetween(Long fkCpTnResourcePoolIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdBetween(Long fkCpTnResourcePoolIdStart,Long fkCpTnResourcePoolIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNotBetween(Long fkCpTnResourcePoolIdStart,Long fkCpTnResourcePoolIdEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdEq(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNe(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdGt(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdGe(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLt(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLe(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLike(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNotLike(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLikeLeft(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdLikeRight(Long fkCpTnResourcePoolId){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdIsNull(){
        isNull("fk_cp_tn_resource_pool_id");
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdIsNotNull(){
        isNotNull("fk_cp_tn_resource_pool_id");
        return this;
    }

    /**
     * <p>商户资源池ID【非必填】</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdIn(Long... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNotIn(Collection<Long> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper fkCpTnResourcePoolIdNotIn(Long... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameEq(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameNe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameGt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameGe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameLt(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameLe(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameBetween(String resourcePoolNameEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameNotBetween(String resourcePoolNameEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameBetween(String resourcePoolNameStart,String resourcePoolNameEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameNotBetween(String resourcePoolNameStart,String resourcePoolNameEnd){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameNotLike(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameLikeLeft(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameLikeRight(){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameEq(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameNe(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameGt(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameGe(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameLt(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameLe(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameLike(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameNotLike(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameLikeLeft(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameLikeRight(String resourcePoolName){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameIsNull(){
        isNull("resource_pool_name");
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameIsNotNull(){
        isNotNull("resource_pool_name");
        return this;
    }

    /**
     * <p>资源池名称【非必填】</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameIn(String... values){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameNotIn(Collection<String> value){
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
    public VizMcMachineRecycleTaskEoQueryEntityWrapper resourcePoolNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("resource_pool_name",values);
        }
        return this;
    }



}
